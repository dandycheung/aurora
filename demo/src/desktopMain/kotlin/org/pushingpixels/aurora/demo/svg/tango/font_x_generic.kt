package org.pushingpixels.aurora.demo.svg.tango

import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.graphics.painter.Painter
import java.lang.ref.WeakReference
import java.util.*
import kotlin.math.min

/**
 * This class has been automatically generated using
 * <a href="https://github.com/kirill-grouchnikov/aurora">Aurora SVG transcoder</a>.
 */
class font_x_generic : Painter() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var shaderSkia: org.jetbrains.skia.Shader? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var blendMode = DrawScope.DefaultBlendMode
    private var alphaStack = mutableListOf(1.0f)
    private var blendModeStack = mutableListOf(DrawScope.DefaultBlendMode)

	@Suppress("UNUSED_VARIABLE", "UNUSED_VALUE", "VARIABLE_WITH_REDUNDANT_INITIALIZER", "UNNECESSARY_NOT_NULL_ASSERTION")
private fun _paint0(drawScope : DrawScope) {
var shapeText: Outline?
var generalPathText: Path? = null
var alphaText = 0.0f
var blendModeText = DrawScope.DefaultBlendMode
with(drawScope) {
// 
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0
alphaStack.add(0, alpha)
alpha *= 0.5f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.9409419894218445f, 0.0f, 0.0f, 0.0f,
0.0f, 1.7863709926605225f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
1.5861389636993408f, -35.5352897644043f, 0.0f, 1.0f)
))}){
// _0_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(46.138718f, 45.083183f)
    cubicTo(46.174484f, 45.684956f, 41.928524f, 46.242172f, 35.008602f, 46.54384f)
    cubicTo(28.088676f, 46.845505f, 19.552643f, 46.845505f, 12.632719f, 46.54384f)
    cubicTo(5.7127953f, 46.242172f, 1.4668367f, 45.684956f, 1.5026016f, 45.083183f)
    cubicTo(1.4668367f, 44.48141f, 5.7127953f, 43.924194f, 12.632719f, 43.622528f)
    cubicTo(19.552643f, 43.32086f, 28.088676f, 43.32086f, 35.008602f, 43.622528f)
    cubicTo(41.928524f, 43.924194f, 46.174484f, 44.48141f, 46.138718f, 45.083183f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(46, 52, 54, 255), 1.0f to Color(46, 52, 54, 0), center = Offset(22.403002f, 44.931835f), radius = 22.900167f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0_1
shape = Outline.Rounded(roundRect = RoundRect(left = 3.488370418548584f, top = 2.512193202972412f, right = 44.49984121322632f, bottom = 45.4994330406189f,radiusX = 1.9981215000152588f, radiusY = 1.9982975721359253f))
brush = Brush.linearGradient(0.0f to Color(238, 238, 236, 255), 1.0f to Color(255, 255, 255, 255), start = Offset(36.668537f, 36.383247f), end = Offset(10.303555f, 7.492883f), tileMode = TileMode.Clamp)
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
stroke = Stroke(width=1.0249254f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=4.0f)
shape = Outline.Rounded(roundRect = RoundRect(left = 3.488370418548584f, top = 2.512193202972412f, right = 44.49984121322632f, bottom = 45.4994330406189f,radiusX = 1.9981215000152588f, radiusY = 1.9982975721359253f))
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(39.0f, 39.008526f)
    cubicTo(36.343773f, 38.775524f, 36.064167f, 38.777718f, 35.458363f, 35.375885f)
    lineTo(31.077913f, 9.0f)
    lineTo(30.2413f, 9.0f)
    lineTo(16.352156f, 32.30025f)
    cubicTo(12.67072f, 38.49811f, 11.798459f, 38.635723f, 9.934442f, 39.008526f)
    lineTo(9.934442f, 40.129135f)
    lineTo(19.054985f, 40.129135f)
    lineTo(19.054985f, 39.008526f)
    cubicTo(16.678362f, 38.775524f, 16.305555f, 38.917522f, 16.305555f, 37.75251f)
    cubicTo(16.305555f, 36.8671f, 16.445358f, 36.447693f, 17.237564f, 34.863277f)
    lineTo(19.893793f, 30.159922f)
    lineTo(30.145905f, 30.159922f)
    lineTo(31.077913f, 35.702087f)
    cubicTo(31.124516f, 36.12149f, 31.171116f, 36.540897f, 31.171116f, 36.9137f)
    cubicTo(31.171116f, 38.684517f, 30.924955f, 38.728924f, 27.942526f, 39.008526f)
    lineTo(27.942526f, 40.129135f)
    lineTo(39.0f, 40.129135f)
    lineTo(39.0f, 39.008526f)
    moveTo(20.872404f, 27.919804f)
    lineTo(27.86248f, 15.803673f)
    lineTo(29.912903f, 27.919804f)
    lineTo(20.872404f, 27.919804f)
}
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(114, 159, 207, 255), 1.0f to Color(52, 101, 164, 255), start = Offset(17.561554f, 11.998214f), end = Offset(29.93592f, 32.68109f), tileMode = TileMode.Clamp)
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200600624084473f, 11.814530372619629f, 0.0f, 1.0f)
))}){
// _0_0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200610160827637f, 13.814539909362793f, 0.0f, 1.0f)
))}){
// _0_0_4
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200650691986084f, 17.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200610160827637f, 19.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_6
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200560092926025f, 21.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_7
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.520056962966919f, 23.814550399780273f, 0.0f, 1.0f)
))}){
// _0_0_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200610160827637f, 25.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_9
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200610160827637f, 27.814550399780273f, 0.0f, 1.0f)
))}){
// _0_0_10
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.520056962966919f, 29.814550399780273f, 0.0f, 1.0f)
))}){
// _0_0_11
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200650691986084f, 31.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_12
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.520066022872925f, 33.81454849243164f, 0.0f, 1.0f)
))}){
// _0_0_13
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200700759887695f, 35.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_14
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200700759887695f, 37.81454849243164f, 0.0f, 1.0f)
))}){
// _0_0_15
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.520066022872925f, 39.81454849243164f, 0.0f, 1.0f)
))}){
// _0_0_16
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200610160827637f, 15.814539909362793f, 0.0f, 1.0f)
))}){
// _0_0_17
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200650691986084f, 41.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_18
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.520066022872925f, 43.81454849243164f, 0.0f, 1.0f)
))}){
// _0_0_19
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, -0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-2.5200700759887695f, 45.81454086303711f, 0.0f, 1.0f)
))}){
// _0_0_20
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
15.520009994506836f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_21
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
21.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_22
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
23.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_23
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
25.52001953125f, 1.1854859590530396f, 0.0f, 1.0f)
))}){
// _0_0_24
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
27.520029067993164f, 1.1854859590530396f, 0.0f, 1.0f)
))}){
// _0_0_25
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
29.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_26
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
31.520029067993164f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_27
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
33.5200309753418f, 1.1854859590530396f, 0.0f, 1.0f)
))}){
// _0_0_28
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
35.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_29
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
37.5200309753418f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_30
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
39.52001953125f, 1.185505986213684f, 0.0f, 1.0f)
))}){
// _0_0_31
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
41.5200309753418f, 1.185505986213684f, 0.0f, 1.0f)
))}){
// _0_0_32
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
43.5200309753418f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_33
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
19.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_34
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
45.52001953125f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_35
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
47.5200309753418f, 1.1854959726333618f, 0.0f, 1.0f)
))}){
// _0_0_36
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
49.52001953125f, 1.185505986213684f, 0.0f, 1.0f)
))}){
// _0_0_37
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
withTransform({
transform(
Matrix(values=floatArrayOf(
-0.4525499939918518f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5324119925498962f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
17.520000457763672f, -0.8144890069961548f, 0.0f, 1.0f)
))}){
// _0_0_38
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(23.246136f, 9.981962f)
    cubicTo(23.247906f, 10.3184805f, 23.03771f, 10.630082f, 22.695139f, 10.798777f)
    cubicTo(22.35257f, 10.967472f, 21.929993f, 10.967472f, 21.587423f, 10.798777f)
    cubicTo(21.244852f, 10.630082f, 21.034657f, 10.3184805f, 21.036427f, 9.981962f)
    cubicTo(21.034657f, 9.645444f, 21.244852f, 9.333842f, 21.587423f, 9.165148f)
    cubicTo(21.929993f, 8.996452f, 22.35257f, 8.996452f, 22.695139f, 9.165148f)
    cubicTo(23.03771f, 9.333842f, 23.247906f, 9.645444f, 23.246136f, 9.981962f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(136, 138, 133, 255))
shaderSkia = null
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0_39
brush = SolidColor(Color(255, 255, 255, 255))
shaderSkia = null
stroke = Stroke(width=1.0249996f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
shape = Outline.Rectangle(rect = Rect(left = 4.487087726593018f, top = 3.5124998092651367f, right = 43.500710010528564f, bottom = 44.54631328582764f))
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)

}
}



    private fun innerPaint(drawScope: DrawScope) {
	    _paint0(drawScope)


	    shape = null
	    generalPath = null
	    brush = null
	    stroke = null
	    shaderSkia = null
	    clip = null
	    alpha = 1.0f
	}
	
    companion object {
        /**
         * Returns the X of the bounding box of the original SVG image.
         *
         * @return The X of the bounding box of the original SVG image.
         */
        fun getOrigX(): Double {
            return 2.9663472175598145
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.9997305870056152
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.06730270385742
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 46.00027084350586
        }

        
    }

    override val intrinsicSize: Size
        get() = Size.Unspecified

    override fun DrawScope.onDraw() {
        clipRect {
            // Use the original icon bounding box and the current icon dimension to compute
            // the scaling factor
            val fullOrigWidth = getOrigX() + getOrigWidth()
            val fullOrigHeight = getOrigY() + getOrigHeight()
            val coef1 = size.width / fullOrigWidth
            val coef2 = size.height / fullOrigHeight
            val coef = min(coef1, coef2).toFloat()

            // Use the original icon bounding box and the current icon dimension to compute
            // the offset pivot for the scaling
            var translateX = -getOrigX()
            var translateY = -getOrigY()
            if (coef1 != coef2) {
                if (coef1 < coef2) {
                    val extraDy = ((fullOrigWidth - fullOrigHeight) / 2.0f).toFloat()
                    translateY += extraDy
                } else {
                    val extraDx = ((fullOrigHeight - fullOrigWidth) / 2.0f).toFloat()
                    translateX += extraDx
                }
            }
            val translateXDp = translateX.toFloat().toDp().value
            val translateYDp = translateY.toFloat().toDp().value

            // Create a combined scale + translate + clip transform before calling the transcoded painting instructions
            withTransform({
                scale(scaleX = coef, scaleY = coef, pivot = Offset.Zero)
                translate(translateXDp, translateYDp)
                clipRect(left = 0.0f, top = 0.0f, right = fullOrigWidth.toFloat(), bottom = fullOrigHeight.toFloat(), clipOp = ClipOp.Intersect)
            }) {
                innerPaint(this)
            }
        }
    }
}

