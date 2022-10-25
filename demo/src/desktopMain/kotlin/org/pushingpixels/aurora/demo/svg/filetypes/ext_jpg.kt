package org.pushingpixels.aurora.demo.svg.filetypes

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
class ext_jpg : Painter() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
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
withTransform({
transform(
Matrix(values=floatArrayOf(
0.009999999776482582f, 0.0f, 0.0f, 0.0f,
0.0f, 0.009999999776482582f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.13999999687075615f, -0.0f, 0.0f, 1.0f)
))}){
// _0
alphaStack.add(0, alpha)
alpha *= 0.99f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(72.1f, 99.0f)
    lineTo(0.3f, 99.0f)
    lineTo(0.3f, 1.0f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(0, 107, 105, 255), 0.124f to Color(0, 128, 127, 255), 0.262f to Color(0, 147, 147, 255), 0.41f to Color(0, 163, 163, 255), 0.571f to Color(0, 176, 175, 255), 0.752f to Color(8, 184, 183, 255), 1.0f to Color(20, 187, 187, 255), start = Offset(36.2f, 98.995f), end = Offset(36.2f, 1.0f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(72.1f, 99.0f)
    lineTo(0.3f, 99.0f)
    lineTo(0.3f, 1.0f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 0))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = SolidColor(Color(0, 110, 108, 255))
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(72.1f, 99.0f)
    lineTo(0.3f, 99.0f)
    lineTo(0.3f, 1.0f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(17.5f, 71.2f)
    lineTo(21.5f, 71.2f)
    lineTo(21.5f, 83.799995f)
    cubicTo(21.5f, 85.399994f, 21.4f, 86.7f, 21.1f, 87.6f)
    cubicTo(20.7f, 88.799995f, 20.0f, 89.7f, 19.0f, 90.4f)
    cubicTo(18.0f, 91.1f, 16.6f, 91.4f, 14.9f, 91.4f)
    cubicTo(12.9f, 91.4f, 11.4f, 90.9f, 10.299999f, 89.8f)
    cubicTo(9.199999f, 88.700005f, 8.699999f, 87.100006f, 8.699999f, 85.0f)
    lineTo(12.499999f, 84.6f)
    cubicTo(12.499999f, 85.7f, 12.699999f, 86.5f, 12.999999f, 87.0f)
    cubicTo(13.399999f, 87.7f, 14.099999f, 88.1f, 14.999999f, 88.1f)
    cubicTo(15.899999f, 88.1f, 16.5f, 87.799995f, 16.9f, 87.299995f)
    cubicTo(17.3f, 86.799995f, 17.5f, 85.7f, 17.5f, 84.1f)
    lineTo(17.5f, 71.2f)
    close()
    moveTo(25.8f, 91.1f)
    lineTo(25.8f, 71.2f)
    lineTo(32.3f, 71.2f)
    cubicTo(34.8f, 71.2f, 36.399998f, 71.299995f, 37.1f, 71.5f)
    cubicTo(38.199997f, 71.8f, 39.199997f, 72.4f, 40.0f, 73.4f)
    cubicTo(40.8f, 74.4f, 41.2f, 75.700005f, 41.2f, 77.3f)
    cubicTo(41.2f, 78.5f, 41.0f, 79.5f, 40.5f, 80.4f)
    cubicTo(40.1f, 81.200005f, 39.5f, 81.9f, 38.8f, 82.4f)
    cubicTo(38.1f, 82.9f, 37.399998f, 83.200005f, 36.7f, 83.3f)
    cubicTo(35.7f, 83.5f, 34.3f, 83.600006f, 32.5f, 83.600006f)
    lineTo(29.9f, 83.600006f)
    lineTo(29.9f, 91.100006f)
    lineTo(25.8f, 91.100006f)
    close()
    moveTo(29.9f, 74.6f)
    lineTo(29.9f, 80.2f)
    lineTo(32.1f, 80.2f)
    cubicTo(33.699997f, 80.2f, 34.8f, 80.1f, 35.3f, 79.899994f)
    cubicTo(35.8f, 79.7f, 36.3f, 79.399994f, 36.6f, 78.899994f)
    cubicTo(36.899998f, 78.49999f, 37.1f, 77.899994f, 37.1f, 77.399994f)
    cubicTo(37.1f, 76.7f, 36.899998f, 76.09999f, 36.5f, 75.59999f)
    cubicTo(36.1f, 75.09999f, 35.5f, 74.79999f, 34.9f, 74.69999f)
    cubicTo(34.4f, 74.59999f, 33.5f, 74.59999f, 32.0f, 74.59999f)
    lineTo(29.9f, 74.59999f)
    close()
    moveTo(53.699997f, 83.799995f)
    lineTo(53.699997f, 80.49999f)
    lineTo(62.399998f, 80.49999f)
    lineTo(62.399998f, 88.399994f)
    cubicTo(61.6f, 89.2f, 60.3f, 89.899994f, 58.699997f, 90.49999f)
    cubicTo(57.1f, 91.09999f, 55.499996f, 91.399994f, 53.799995f, 91.399994f)
    cubicTo(51.699997f, 91.399994f, 49.899994f, 90.99999f, 48.299995f, 90.09999f)
    cubicTo(46.699997f, 89.19999f, 45.599995f, 87.99999f, 44.799995f, 86.399994f)
    cubicTo(43.999996f, 84.799995f, 43.599995f, 82.99999f, 43.599995f, 81.09999f)
    cubicTo(43.599995f, 78.99999f, 43.999996f, 77.19999f, 44.899994f, 75.59999f)
    cubicTo(45.79999f, 73.99999f, 46.999992f, 72.79999f, 48.699993f, 71.899994f)
    cubicTo(49.999992f, 71.2f, 51.599995f, 70.899994f, 53.499992f, 70.899994f)
    cubicTo(55.999992f, 70.899994f, 57.899994f, 71.399994f, 59.29999f, 72.399994f)
    cubicTo(60.69999f, 73.399994f, 61.59999f, 74.899994f, 61.999992f, 76.7f)
    lineTo(57.999992f, 77.399994f)
    cubicTo(57.699993f, 76.399994f, 57.199993f, 75.7f, 56.399994f, 75.09999f)
    cubicTo(55.599995f, 74.49999f, 54.699993f, 74.29999f, 53.499992f, 74.29999f)
    cubicTo(51.699993f, 74.29999f, 50.29999f, 74.89999f, 49.29999f, 75.999985f)
    cubicTo(48.29999f, 77.09998f, 47.699993f, 78.79999f, 47.699993f, 80.89999f)
    cubicTo(47.699993f, 83.29999f, 48.199993f, 84.999985f, 49.29999f, 86.19999f)
    cubicTo(50.39999f, 87.399994f, 51.699993f, 87.99999f, 53.39999f, 87.99999f)
    cubicTo(54.19999f, 87.99999f, 55.09999f, 87.799995f, 55.89999f, 87.49999f)
    cubicTo(56.69999f, 87.19999f, 57.49999f, 86.799995f, 58.09999f, 86.299995f)
    lineTo(58.09999f, 83.799995f)
    lineTo(53.69999f, 83.799995f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(255, 255, 255, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.99f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(45.2f, 27.7f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(214, 237, 232, 255), 0.297f to Color(211, 235, 230, 255), 0.44f to Color(199, 227, 223, 255), 0.551f to Color(183, 216, 213, 255), 0.645f to Color(160, 203, 201, 255), 0.729f to Color(132, 186, 185, 255), 0.804f to Color(98, 167, 167, 255), 0.874f to Color(52, 147, 148, 255), 0.938f to Color(0, 127, 127, 255), 0.998f to Color(0, 107, 106, 255), 1.0f to Color(0, 107, 105, 255), start = Offset(45.214f, 27.771004f), end = Offset(58.667f, 14.318001f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(45.2f, 27.7f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 0))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
brush = SolidColor(Color(0, 110, 108, 255))
stroke = Stroke(width=2.0f, cap=StrokeCap.Butt, join=StrokeJoin.Bevel, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(45.2f, 1.0f)
    lineTo(72.1f, 27.7f)
    lineTo(45.2f, 27.7f)
    lineTo(45.2f, 1.0f)
    close()
}
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.99f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath?.run {
    moveTo(62.7f, 56.8f)
    cubicTo(61.100002f, 56.0f, 58.100002f, 50.2f, 53.5f, 49.8f)
    cubicTo(49.5f, 49.5f, 44.4f, 48.0f, 41.6f, 47.8f)
    cubicTo(38.1f, 42.0f, 32.1f, 32.8f, 27.099998f, 27.9f)
    lineTo(40.899998f, 28.6f)
    cubicTo(37.2f, 19.8f, 27.7f, 23.0f, 27.7f, 23.0f)
    lineTo(34.100002f, 17.7f)
    cubicTo(25.900002f, 14.400001f, 22.500002f, 22.400002f, 22.500002f, 22.400002f)
    cubicTo(14.000002f, 17.7f, 9.600002f, 25.7f, 9.600002f, 25.7f)
    lineTo(18.400002f, 26.300001f)
    cubicTo(8.4f, 29.1f, 11.2f, 39.0f, 11.2f, 39.0f)
    lineTo(20.099998f, 31.0f)
    cubicTo(18.199999f, 35.4f, 22.399998f, 38.5f, 22.399998f, 38.5f)
    lineTo(25.0f, 27.7f)
    cubicTo(25.0f, 27.7f, 34.3f, 38.300003f, 37.2f, 49.1f)
    cubicTo(33.5f, 51.0f, 27.7f, 54.1f, 23.2f, 54.699997f)
    cubicTo(17.0f, 55.499996f, 9.700001f, 59.699997f, 9.700001f, 59.699997f)
    lineTo(9.700001f, 64.6f)
    lineTo(62.8f, 64.6f)
    lineTo(62.7f, 56.8f)
    close()
}
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.005f to Color(0, 130, 129, 255), 0.343f to Color(0, 106, 105, 255), 1.0f to Color(0, 56, 54, 255), start = Offset(36.25f, 64.647f), end = Offset(36.25f, 16.838997f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
}
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
            return 0.13300000131130219
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 0.7379999160766602
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 1.0
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

