package org.pushingpixels.aurora.demo.svg.tango

import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
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
class go_up : Painter() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var blendMode = DrawScope.DefaultBlendMode
    private var blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
    private var alphaStack = mutableListOf(1.0f)
    private var blendModeStack = mutableListOf(DrawScope.DefaultBlendMode)
    private var blendModeSkiaStack = mutableListOf(org.jetbrains.skia.BlendMode.SRC_OVER)

	@Suppress("UNUSED_VARIABLE", "UNUSED_VALUE", "VARIABLE_WITH_REDUNDANT_INITIALIZER", "UNNECESSARY_NOT_NULL_ASSERTION")
private fun _paint0(drawScope : DrawScope) {
var shapeText: Outline?
var generalPathText: Path? = null
var alphaText = 0.0f
var blendModeText = DrawScope.DefaultBlendMode
var blendModeTextSkia = org.jetbrains.skia.BlendMode.SRC_OVER
with(drawScope) {
// 
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
// _0_0
alphaStack.add(0, alpha)
alpha *= 0.2994652f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
withTransform({
transform(
Matrix(values=floatArrayOf(
1.2144659757614136f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5954579710960388f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-6.163846015930176f, 16.3127498626709f, 0.0f, 1.0f)
))}){
// _0_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(40.48186f, 36.421127f)
    cubicTo(40.50693f, 39.429993f, 37.530556f, 42.216076f, 32.67976f, 43.724407f)
    cubicTo(27.828962f, 45.23274f, 21.845287f, 45.23274f, 16.99449f, 43.724407f)
    cubicTo(12.143692f, 42.216076f, 9.167317f, 39.429993f, 9.192389f, 36.421127f)
    cubicTo(9.167317f, 33.412262f, 12.143692f, 30.626177f, 16.99449f, 29.117847f)
    cubicTo(21.845287f, 27.609516f, 27.828962f, 27.609516f, 32.67976f, 29.117847f)
    cubicTo(37.530556f, 30.626177f, 40.50693f, 33.412262f, 40.48186f, 36.421127f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawIntoCanvas {
   val nativeCanvas = it.nativeCanvas
val shader = org.jetbrains.skia.Shader.makeRadialGradient(x = 24.837126f, y = 36.42112f, r = 15.644739f, colors = intArrayOf(org.jetbrains.skia.Color.makeARGB(a = 255, r = 0, g = 0, b = 0), org.jetbrains.skia.Color.makeARGB(a = 0, r = 0, g = 0, b = 0), ), positions = floatArrayOf(0.0f, 1.0f, ), style = org.jetbrains.skia.GradientStyle(tileMode = org.jetbrains.skia.FilterTileMode.CLAMP, isPremul = true, localMatrix = null))
   val nativePaint = org.jetbrains.skia.Paint().also { skiaPaint ->
      skiaPaint.shader = shader
      skiaPaint.alpha = (alpha * 255).toInt()
      skiaPaint.blendMode = blendModeSkia
      skiaPaint.mode = org.jetbrains.skia.PaintMode.FILL
   }
   when (shape) {
       is Outline.Rectangle -> nativeCanvas.drawRect((shape as Outline.Rectangle).rect.toSkiaRect(), nativePaint)
       is Outline.Rounded -> nativeCanvas.drawRRect((shape as Outline.Rounded).roundRect.toSkiaRRect(), nativePaint)
       is Outline.Generic -> nativeCanvas.drawPath((shape as Outline.Generic).path.asSkiaPath(), nativePaint)
       else -> {}
   }
}
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
// _0_0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(14.491792f, 38.5f)
    lineTo(32.46948f, 38.5f)
    lineTo(32.46948f, 25.547438f)
    lineTo(40.5f, 25.547438f)
    lineTo(23.37481f, 5.4992137f)
    lineTo(6.5285587f, 25.489471f)
    lineTo(14.497096f, 25.555761f)
    lineTo(14.491792f, 38.5f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawIntoCanvas {
   val nativeCanvas = it.nativeCanvas
val shader = org.jetbrains.skia.Shader.makeRadialGradient(x = 23.514278f, y = 33.0438f, r = 14.294449f, colors = intArrayOf(org.jetbrains.skia.Color.makeARGB(a = 255, r = 115, g = 210, b = 22), org.jetbrains.skia.Color.makeARGB(a = 255, r = 78, g = 154, b = 6), ), positions = floatArrayOf(0.0f, 1.0f, ), style = org.jetbrains.skia.GradientStyle(tileMode = org.jetbrains.skia.FilterTileMode.CLAMP, isPremul = true, localMatrix = null))
   val nativePaint = org.jetbrains.skia.Paint().also { skiaPaint ->
      skiaPaint.shader = shader
      skiaPaint.alpha = (alpha * 255).toInt()
      skiaPaint.blendMode = blendModeSkia
      skiaPaint.mode = org.jetbrains.skia.PaintMode.FILL
   }
   when (shape) {
       is Outline.Rectangle -> nativeCanvas.drawRect((shape as Outline.Rectangle).rect.toSkiaRect(), nativePaint)
       is Outline.Rounded -> nativeCanvas.drawRRect((shape as Outline.Rounded).roundRect.toSkiaRRect(), nativePaint)
       is Outline.Generic -> nativeCanvas.drawPath((shape as Outline.Generic).path.asSkiaPath(), nativePaint)
       else -> {}
   }
}
brush = SolidColor(Color(58, 115, 4, 255))
stroke = Stroke(width=1.0000004f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(14.491792f, 38.5f)
    lineTo(32.46948f, 38.5f)
    lineTo(32.46948f, 25.547438f)
    lineTo(40.5f, 25.547438f)
    lineTo(23.37481f, 5.4992137f)
    lineTo(6.5285587f, 25.489471f)
    lineTo(14.497096f, 25.555761f)
    lineTo(14.491792f, 38.5f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.5080214f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
// _0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(7.5855236f, 25.03253f)
    lineTo(14.995821f, 25.03253f)
    lineTo(15.062422f, 31.59434f)
    cubicTo(20.718035f, 20.593878f, 31.055517f, 22.749928f, 31.656769f, 15.966674f)
    cubicTo(31.656769f, 15.966674f, 23.366938f, 6.4219694f, 23.366938f, 6.4219694f)
    lineTo(7.5855236f, 25.03253f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawIntoCanvas {
   val nativeCanvas = it.nativeCanvas
val shader = org.jetbrains.skia.Shader.makeRadialGradient(x = 3.3902216f, y = 16.710354f, r = 35.145237f, colors = intArrayOf(org.jetbrains.skia.Color.makeARGB(a = 255, r = 255, g = 255, b = 255), org.jetbrains.skia.Color.makeARGB(a = 0, r = 255, g = 255, b = 255), ), positions = floatArrayOf(0.0f, 1.0f, ), style = org.jetbrains.skia.GradientStyle(tileMode = org.jetbrains.skia.FilterTileMode.CLAMP, isPremul = true, localMatrix = null))
   val nativePaint = org.jetbrains.skia.Paint().also { skiaPaint ->
      skiaPaint.shader = shader
      skiaPaint.alpha = (alpha * 255).toInt()
      skiaPaint.blendMode = blendModeSkia
      skiaPaint.mode = org.jetbrains.skia.PaintMode.FILL
   }
   when (shape) {
       is Outline.Rectangle -> nativeCanvas.drawRect((shape as Outline.Rectangle).rect.toSkiaRect(), nativePaint)
       is Outline.Rounded -> nativeCanvas.drawRRect((shape as Outline.Rounded).roundRect.toSkiaRRect(), nativePaint)
       is Outline.Generic -> nativeCanvas.drawPath((shape as Outline.Generic).path.asSkiaPath(), nativePaint)
       else -> {}
   }
}
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.4812834f
blendModeStack.add(0, BlendMode.SrcOver)
blendModeSkiaStack.add(0, org.jetbrains.skia.BlendMode.SRC_OVER)
blendMode = BlendMode.SrcOver
blendModeSkia = org.jetbrains.skia.BlendMode.SRC_OVER
// _0_0_3
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0000004f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(15.602735f, 37.5f)
    lineTo(31.502579f, 37.5f)
    lineTo(31.502579f, 24.50705f)
    lineTo(38.311577f, 24.50705f)
    lineTo(23.361206f, 7.07009f)
    lineTo(8.65468f, 24.55047f)
    lineTo(15.475049f, 24.528374f)
    lineTo(15.602735f, 37.5f)
    close()
}
shape = Outline.Generic(generalPath!!)
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
            return 4.969549179077148
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.9987263679504395
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 38.06089782714844
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 38.24821853637695
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

