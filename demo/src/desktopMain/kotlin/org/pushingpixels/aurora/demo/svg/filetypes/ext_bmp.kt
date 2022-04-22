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
class ext_bmp : Painter() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var blendMode = DrawScope.DefaultBlendMode
    private var alphaStack = mutableListOf(1.0f)
    private var blendModeStack = mutableListOf(DrawScope.DefaultBlendMode)

	private fun _paint0(drawScope : DrawScope) {
@Suppress("UNUSED_VARIABLE") var shapeText: Outline?
@Suppress("UNUSED_VARIABLE") var generalPathText: Path? = null
@Suppress("UNUSED_VARIABLE") var alphaText = 0.0f
@Suppress("UNUSED_VARIABLE") var blendModeText = DrawScope.DefaultBlendMode
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(72.1f, 99.0f)
generalPath!!.lineTo(0.3f, 99.0f)
generalPath!!.lineTo(0.3f, 1.0f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(72.1f, 99.0f)
generalPath!!.lineTo(0.3f, 99.0f)
generalPath!!.lineTo(0.3f, 1.0f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(72.1f, 99.0f)
generalPath!!.lineTo(0.3f, 99.0f)
generalPath!!.lineTo(0.3f, 1.0f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(7.5f, 71.2f)
generalPath!!.lineTo(15.5f, 71.2f)
generalPath!!.cubicTo(17.1f, 71.2f, 18.3f, 71.299995f, 19.0f, 71.399994f)
generalPath!!.cubicTo(19.8f, 71.49999f, 20.5f, 71.799995f, 21.1f, 72.2f)
generalPath!!.cubicTo(21.7f, 72.6f, 22.2f, 73.2f, 22.6f, 73.899994f)
generalPath!!.cubicTo(23.0f, 74.59999f, 23.2f, 75.399994f, 23.2f, 76.2f)
generalPath!!.cubicTo(23.2f, 77.1f, 22.900002f, 78.0f, 22.400002f, 78.799995f)
generalPath!!.cubicTo(21.900002f, 79.59999f, 21.2f, 80.2f, 20.300001f, 80.49999f)
generalPath!!.cubicTo(21.500002f, 80.899994f, 22.500002f, 81.49999f, 23.1f, 82.299995f)
generalPath!!.cubicTo(23.699999f, 83.1f, 24.1f, 84.1f, 24.1f, 85.299995f)
generalPath!!.cubicTo(24.1f, 86.2f, 23.9f, 87.1f, 23.5f, 87.899994f)
generalPath!!.cubicTo(23.1f, 88.69999f, 22.5f, 89.399994f, 21.8f, 89.899994f)
generalPath!!.cubicTo(21.099998f, 90.399994f, 20.199999f, 90.7f, 19.099998f, 90.799995f)
generalPath!!.cubicTo(18.399998f, 90.899994f, 16.8f, 90.899994f, 14.199999f, 90.899994f)
generalPath!!.lineTo(7.5f, 90.899994f)
generalPath!!.lineTo(7.5f, 71.2f)
generalPath!!.close()
generalPath!!.moveTo(11.5f, 74.5f)
generalPath!!.lineTo(11.5f, 79.1f)
generalPath!!.lineTo(14.1f, 79.1f)
generalPath!!.cubicTo(15.700001f, 79.1f, 16.6f, 79.1f, 17.0f, 79.0f)
generalPath!!.cubicTo(17.7f, 78.9f, 18.2f, 78.7f, 18.6f, 78.3f)
generalPath!!.cubicTo(19.0f, 77.90001f, 19.2f, 77.4f, 19.2f, 76.8f)
generalPath!!.cubicTo(19.2f, 76.200005f, 19.0f, 75.700005f, 18.7f, 75.3f)
generalPath!!.cubicTo(18.400002f, 74.9f, 17.900002f, 74.700005f, 17.2f, 74.600006f)
generalPath!!.cubicTo(16.800001f, 74.600006f, 15.700001f, 74.50001f, 13.800001f, 74.50001f)
generalPath!!.lineTo(11.500001f, 74.50001f)
generalPath!!.close()
generalPath!!.moveTo(11.5f, 82.4f)
generalPath!!.lineTo(11.5f, 87.700005f)
generalPath!!.lineTo(15.2f, 87.700005f)
generalPath!!.cubicTo(16.7f, 87.700005f, 17.6f, 87.700005f, 18.0f, 87.600006f)
generalPath!!.cubicTo(18.6f, 87.50001f, 19.1f, 87.200005f, 19.5f, 86.8f)
generalPath!!.cubicTo(19.9f, 86.4f, 20.1f, 85.8f, 20.1f, 85.100006f)
generalPath!!.cubicTo(20.1f, 84.50001f, 20.0f, 84.00001f, 19.7f, 83.600006f)
generalPath!!.cubicTo(19.400002f, 83.200005f, 19.0f, 82.90001f, 18.400002f, 82.700005f)
generalPath!!.cubicTo(17.900002f, 82.50001f, 16.7f, 82.4f, 14.800001f, 82.4f)
generalPath!!.lineTo(11.500001f, 82.4f)
generalPath!!.close()
generalPath!!.moveTo(27.6f, 91.1f)
generalPath!!.lineTo(27.6f, 71.2f)
generalPath!!.lineTo(33.6f, 71.2f)
generalPath!!.lineTo(37.199997f, 84.7f)
generalPath!!.lineTo(40.799995f, 71.2f)
generalPath!!.lineTo(46.799995f, 71.2f)
generalPath!!.lineTo(46.799995f, 91.0f)
generalPath!!.lineTo(43.099995f, 91.0f)
generalPath!!.lineTo(43.099995f, 75.4f)
generalPath!!.lineTo(39.099995f, 91.0f)
generalPath!!.lineTo(35.199993f, 91.0f)
generalPath!!.lineTo(31.199993f, 75.4f)
generalPath!!.lineTo(31.199993f, 91.0f)
generalPath!!.lineTo(27.599993f, 91.0f)
generalPath!!.close()
generalPath!!.moveTo(50.9f, 91.1f)
generalPath!!.lineTo(50.9f, 71.2f)
generalPath!!.lineTo(57.4f, 71.2f)
generalPath!!.cubicTo(59.9f, 71.2f, 61.5f, 71.299995f, 62.2f, 71.5f)
generalPath!!.cubicTo(63.3f, 71.8f, 64.3f, 72.4f, 65.1f, 73.4f)
generalPath!!.cubicTo(65.9f, 74.4f, 66.299995f, 75.700005f, 66.299995f, 77.3f)
generalPath!!.cubicTo(66.299995f, 78.5f, 66.1f, 79.5f, 65.6f, 80.4f)
generalPath!!.cubicTo(65.2f, 81.200005f, 64.6f, 81.9f, 63.899998f, 82.4f)
generalPath!!.cubicTo(63.199997f, 82.9f, 62.499996f, 83.200005f, 61.8f, 83.3f)
generalPath!!.cubicTo(60.8f, 83.5f, 59.399998f, 83.600006f, 57.6f, 83.600006f)
generalPath!!.lineTo(55.0f, 83.600006f)
generalPath!!.lineTo(55.0f, 91.100006f)
generalPath!!.lineTo(50.9f, 91.100006f)
generalPath!!.close()
generalPath!!.moveTo(54.9f, 74.6f)
generalPath!!.lineTo(54.9f, 80.2f)
generalPath!!.lineTo(57.100002f, 80.2f)
generalPath!!.cubicTo(58.7f, 80.2f, 59.800003f, 80.1f, 60.300003f, 79.899994f)
generalPath!!.cubicTo(60.800003f, 79.7f, 61.300003f, 79.399994f, 61.600002f, 78.899994f)
generalPath!!.cubicTo(61.9f, 78.49999f, 62.100002f, 77.899994f, 62.100002f, 77.399994f)
generalPath!!.cubicTo(62.100002f, 76.7f, 61.9f, 76.09999f, 61.500004f, 75.59999f)
generalPath!!.cubicTo(61.100002f, 75.09999f, 60.500004f, 74.79999f, 59.900005f, 74.69999f)
generalPath!!.cubicTo(59.400005f, 74.59999f, 58.500004f, 74.59999f, 57.000004f, 74.59999f)
generalPath!!.lineTo(54.900005f, 74.59999f)
generalPath!!.close()
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(45.2f, 27.7f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(45.2f, 27.7f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(45.2f, 1.0f)
generalPath!!.lineTo(72.1f, 27.7f)
generalPath!!.lineTo(45.2f, 27.7f)
generalPath!!.lineTo(45.2f, 1.0f)
generalPath!!.close()
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
generalPath!!.moveTo(62.7f, 56.8f)
generalPath!!.cubicTo(61.100002f, 56.0f, 58.100002f, 50.2f, 53.5f, 49.8f)
generalPath!!.cubicTo(49.5f, 49.5f, 44.4f, 48.0f, 41.6f, 47.8f)
generalPath!!.cubicTo(38.1f, 42.0f, 32.1f, 32.8f, 27.099998f, 27.9f)
generalPath!!.lineTo(40.899998f, 28.6f)
generalPath!!.cubicTo(37.2f, 19.8f, 27.7f, 23.0f, 27.7f, 23.0f)
generalPath!!.lineTo(34.100002f, 17.7f)
generalPath!!.cubicTo(25.900002f, 14.400001f, 22.500002f, 22.400002f, 22.500002f, 22.400002f)
generalPath!!.cubicTo(14.000002f, 17.7f, 9.600002f, 25.7f, 9.600002f, 25.7f)
generalPath!!.lineTo(18.400002f, 26.300001f)
generalPath!!.cubicTo(8.4f, 29.1f, 11.2f, 39.0f, 11.2f, 39.0f)
generalPath!!.lineTo(20.099998f, 31.0f)
generalPath!!.cubicTo(18.199999f, 35.4f, 22.399998f, 38.5f, 22.399998f, 38.5f)
generalPath!!.lineTo(25.0f, 27.7f)
generalPath!!.cubicTo(25.0f, 27.7f, 34.3f, 38.300003f, 37.2f, 49.1f)
generalPath!!.cubicTo(33.5f, 51.0f, 27.7f, 54.1f, 23.2f, 54.699997f)
generalPath!!.cubicTo(17.0f, 55.499996f, 9.700001f, 59.699997f, 9.700001f, 59.699997f)
generalPath!!.lineTo(9.700001f, 64.6f)
generalPath!!.lineTo(62.8f, 64.6f)
generalPath!!.lineTo(62.7f, 56.8f)
generalPath!!.close()
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

