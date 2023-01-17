## SVG transcoder - the internals of the offline transcoder

The Aurora SVG transcoder uses [Apache Batik](https://xmlgraphics.apache.org/batik/) to transcode SVG source into corresponding Kotlin classes that contain a sequence of Compose canvas draw calls to render the original content. How does it work?

### Parsing the SVG document

We start in `SvgTranscoder`. It uses Batik's `DocumentLoader` to load the local file based on the `URI`, and `GVTBuilder` to construct an hierarchical representation of the SVG content. The root of that representation is a `GraphicsNode`.

That is then passed to `SvgBaseTranscoder.transcode()`. This is the base class where the rest of the transcoding happens. Transcoding has three parts:

- traversing the Batik tree
- parsing out the information to create matching Compose instructions
- printing those instructions in Kotlin syntax

Let's take a look at each one of these parts.

### Traversing the Batik tree

The 'GraphicsNode' that we get from Batik's `GVTBuilder` is the root of a hierarchical representation of the original SVG content. Here it is important to note that it is *not* the DOM tree of the original SVG document - some of the SVG elements such as `<style>` or `<defs>` might be in a different place in the `GraphicsNode` hierarchy - "attached" to the specific elements that use them.

The traversal itself looks at two main types of nodes - `GraphicsNode` and `Paint`. Each supported sub-class of these two classes is transcoded in its own method. For example, `PatternPaint` is transcoded by the `transcodePatternPaint` and `TextNode` is transcoded by `transcodeTextNode`.

The traversal is depth-first, visiting every supported node in the tree, querying the information to create Compose instructions (next section) and traversing children nodes where appropriate.

Important note - there is special handling of raster image, text and pattern content. See addendum sections in this document for more details.

### Parsing information for creating Compose instructions

Every supported node in the `GraphicsNode` tree is queried for attributes relevant to the rendering. Let's take a look at `transcodeFillShapePainter` that transcodes a `FillShapePainter` node.

First, it transcodes `FillShapePainter.getShape()`. Simple shapes like `Rectangle2D`, `Ellipse2D` or `Line2D` are queried directly for their basic elements (coordinates, width, height, etc). More complex shapes like `GeneralPath` are converted into a `PathIterator`, and that iterator is then queried for information on each segment (`lineto`, `moveto`, `quadto`, `cubicto`, `close`).

Second, it transcodes the paint itself. Each paint type is queried for its basic elements - `Color` for red, green, blue and alpha, `LinearGradientPaint` for start / end point, fractions, etc.

There's special handling for `PatternPaint`. This paint type is transcoded into double-nested loop that performs tiling of the shape bounds along both axes, X and Y.

### Printing instructions in Kotlin

Here is a snippet of how transcoded SVG content looks like in Kotlin:

```kotlin
alpha *= 0.28070176f
blendMode = BlendMode.SrcOver
shape = Outline.Rectangle(rect = Rect(left = 9.0f, top = 12.0f, right = 38.0f, bottom = 13.0f))
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
```

### Wrapping it all together

The `src/main/resources` folder contains the transcoder template. This template contains the general outline that is required for a valid Kotlin class. While these instructions (import statements, class definition, etc) could have been created alongside the Compose instructions emitted during the `GraphicsNode` tree traversal, the implementation preference is for `SvgBaseTranscoder` logic to focus only on the painting / rendering part of the SVG content.

The template uses a number of "token" strings. A token is a placeholder for a dynamic bit of information, such as the class name (that is generated based on the filename of the original SVG), dimensions of the SVG content bounding box etc.

When the template is loaded in `SvgBaseTranscoder.transcode()`, the flow is:

* Replace top-level tokens (package name, classname)
* Generate the entire sequence of Compose commands to render the full SVG content (into a local `ByteArrayOutputStream`)
* Replace the painting token with that Compose sequence
* Replace the rest of the tokens (bounding box)
* Print the entire transcoded content into the matching `PrintWriter` (supplied by the code in `SvgTranscoder`)

### Addendum A - handling `PatternPaint`

As mentioned earlier, `PatternPaint` is transcoded to a double-nested loop that perform tiling of the matching shape bounds. However, that is not the only "special" treatment done for transcoding this node.

Since the [PatternGraphicsNode](https://xmlgraphics.apache.org/batik/javadoc/org/apache/batik/bridge/SVGPatternElementBridge.PatternGraphicsNode.html) class does not expose access to its actual content (nodes that represent the content for a single tile of the pattern), `transcodePatternPaint()` instead uses a custom implementation of `Graphics2D` class to "capture" that content.

This custom implementation overrides methods such as `setStroke(Stroke)` or `fill(Shape)`. These methods then parse the basic contents of the relevant objects and create the mirror Compose instructions for the transcoded tile pattern content.

### Addendum B - handling `TextPaint`

Unlike other `Paint` nodes that are handled by inspecting their base attributes and converting those attributes into matching Compose commands, the handling of `TextPaint` is simplified by another usage of a custom implementation of `Graphics2D` class to capture the underlying visuals.

Note that, depending on how many glyphs a particular SVG content uses, the resulting transcoded Kotlin class may exceed the supported method length (at compile time). This is a known limitation of the transcoder. In general, the transcoder is best used for simpler vector content that targets smaller-size iconography, and not general-purpose SVG "illustration art".

### Addendum C - handling `RasterImageNode`

To support raster / bitmap content that comes from the `<image>` SVG element, the transcoder employs the same approach that SVG does to "embed" such content using Base64-encoded URIs.

Batik's [RasterImageNode](https://xmlgraphics.apache.org/batik/javadoc/org/apache/batik/gvt/RasterImageNode.html) exposes an API to get the underlying `RenderedImage` (using `.getImage().createDefaultRendering()`). In addition, we can also ask any node in the GVT tree to render itself into our own custom extension of `Graphics2D` class. Overriding the `drawImage()` method then gives access to the decoded content originally embedded as a Base64-encoded URI.

Raster content is transcoded in two passes.

The first pass is in `RasterScanner`. It traverses the entire GVT tree in a depth-first fashion, "looking" for `RasterImageNode` nodes. For each such node it:

* Gets the underlying `RenderedImage`.
* Computes MD5 hash-sum of the raster data.
* Checks whether it has already processed a `RasterImageNode` with the same MD5 hash-sum. If so, it skips this node.
* Creates a static function that returns a `BufferedImage` instance that is built - *at runtime* with the Base64-encoded raster data.

A few points to note:

* More than one `RasterImageNode` in the GVT tree can use the same raster data. This can happen for `<pattern>` elements using the same bitmaps as their "content", for example.
* Transcoding is relying on MD5 hash-sum to detect identical raster content.
* Transcoding essentially takes the decoded `RenderedImage` raster data that originated in Base64-encoded URI, and encodes it back as a Base64-encoded string. These two are not going to necessarily match if the format of the original image content does not match what Radiance transcoding is using (png).
* The newly Base64-encoded representation of raster data may exceed Kotlin limitations of how long a string in the source code can be. To work around this limitation, SVG transcoding breaks up the encoded String into smaller chunks of 1,000 characters each at most.
* The static function that transcoding generates for retrieving the `BufferedImage` that corresponds to the decoded/encoded/decoded-again image content uses an internal `WeakReference` based on the MD5 hash-sum of the original encoded string. This is done for performance optimizations. For example, doing Base64-decoding + image parsing on every single loop of a `PatternPaint` might result in prohibitively expensive runtime performance.

The second pass for `RasterImageNode` is in `SvgBaseTranscoder`. Every supported node that may use raster data - such as `PatternNode` for example - computes the MD5 hash-sum of the underlying `RenderedImage`, and then calls the matching method to retrieve the corresponding `BufferedImage` (each such method has been generated in the first pass as detailed above).

### Addendum D - handling two-point `RadialGradientPaint`

Compose's `Brush.radialGradient` does not support the variant with two circles (start and end). To work around this current limitation, the transcoded code goes a level lower into the underlying Skia (available through the Skiko bindings available in Compose Desktop distribution). The generated code uses a combination of:

* `Shader.makeTwoPointConicalGradient` for two-point conical gradient which is the Skia's equivalent of the two-point radial gradient in SVG
* Wrapped in a `ShaderBrush`
