package org.pushingpixels.aurora.demo

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.platform.AmbientDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.pushingpixels.aurora.icon.AuroraIcon
import org.pushingpixels.aurora.utils.toComposeBitmap
import java.io.ByteArrayInputStream
import java.io.IOException
import java.lang.ref.WeakReference
import java.util.*
import javax.imageio.ImageIO
import kotlin.math.min

/**
 * This class has been automatically generated using
 * <a href="https://github.com/kirill-grouchnikov/aurora">Aurora SVG transcoder</a>.
 */
class Internet_group_chat private constructor(var _width: Int, var _height: Int) : AuroraIcon {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var alphaStack = mutableListOf(1.0f)

	private fun _paint0(drawScope : DrawScope) {
with(drawScope) {
// 
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 10.75f,
0.0f, 1.0f, 0.0f, -6.5f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0
alphaStack.add(0, alpha)
alpha *= 0.12f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0
shape = Outline.Generic(path = Path().also { it.addOval(oval=Rect(left = 3.59999942779541f, top = 32.580997467041016f, right = 35.22000026702881f, bottom = 41.29899787902832f))})
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(19.413502f, 36.93174f), radius = 15.816959f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.12f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1
shape = Outline.Generic(path = Path().also { it.addOval(oval=Rect(left = 3.59999942779541f, top = 32.580997467041016f, right = 35.22000026702881f, bottom = 41.29899787902832f))})
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(19.413502f, 36.93174f), radius = 15.816959f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
-1.0299999713897705f, 0.0f, 0.0f, 49.08000183105469f,
0.0f, 0.989799976348877f, 0.0f, -8.723999977111816f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_2
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_2_0
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_2_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.cubicTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.cubicTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.cubicTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.cubicTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.cubicTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.cubicTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(245, 245, 245, 255), 1.0f to Color(233, 233, 233, 255), start = Offset(25.148483f, 20.017124f), end = Offset(12.40736f, 35.31505f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(120, 120, 120, 255))
stroke = Stroke(width=0.99f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.cubicTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.cubicTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.cubicTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.cubicTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.cubicTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.cubicTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_2_0_1
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=0.99f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.62f, 17.88f)
generalPath!!.lineTo(30.62f, 32.079998f)
generalPath!!.cubicTo(30.62f, 33.039997f, 30.378f, 33.447998f, 29.436f, 33.447998f)
generalPath!!.lineTo(15.536001f, 33.447998f)
generalPath!!.cubicTo(14.783001f, 34.457996f, 13.468001f, 36.044f, 12.025002f, 36.698997f)
generalPath!!.cubicTo(12.428001f, 35.531998f, 12.273002f, 34.562996f, 12.198002f, 33.447998f)
generalPath!!.lineTo(8.791002f, 33.447998f)
generalPath!!.cubicTo(7.8490024f, 33.447998f, 7.5790024f, 33.039997f, 7.5790024f, 32.079998f)
generalPath!!.lineTo(7.5790024f, 17.999998f)
generalPath!!.cubicTo(7.5790024f, 17.039999f, 7.8490024f, 16.451998f, 8.791002f, 16.451998f)
generalPath!!.lineTo(29.391003f, 16.451998f)
generalPath!!.cubicTo(30.334003f, 16.451998f, 30.626003f, 16.912998f, 30.626003f, 17.873999f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_3
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_3_0
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_3_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.cubicTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.cubicTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.cubicTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.cubicTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.cubicTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.cubicTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(245, 245, 245, 255), 1.0f to Color(233, 233, 233, 255), start = Offset(16.397999f, 20.031063f), end = Offset(23.951756f, 33.157024f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(120, 120, 120, 255))
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.64f, 17.39f)
generalPath!!.lineTo(31.64f, 32.579998f)
generalPath!!.cubicTo(31.64f, 33.639f, 30.817f, 34.477997f, 29.778f, 34.477997f)
generalPath!!.lineTo(16.068f, 34.477997f)
generalPath!!.cubicTo(15.237f, 35.590996f, 13.564001f, 37.406f, 9.641001f, 38.887997f)
generalPath!!.cubicTo(11.366001f, 36.822f, 11.468f, 35.428997f, 11.273001f, 34.477997f)
generalPath!!.lineTo(8.464001f, 34.477997f)
generalPath!!.cubicTo(7.4250007f, 34.477997f, 6.5710006f, 33.638996f, 6.5710006f, 32.579998f)
generalPath!!.lineTo(6.5710006f, 17.39f)
generalPath!!.cubicTo(6.5710006f, 16.331f, 7.4250007f, 15.459999f, 8.464001f, 15.459999f)
generalPath!!.lineTo(29.784f, 15.459999f)
generalPath!!.cubicTo(30.823f, 15.459999f, 31.646f, 16.331f, 31.646f, 17.39f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_3_0_1
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.62f, 17.88f)
generalPath!!.lineTo(30.62f, 32.079998f)
generalPath!!.cubicTo(30.62f, 33.039997f, 30.378f, 33.447998f, 29.436f, 33.447998f)
generalPath!!.lineTo(15.536001f, 33.447998f)
generalPath!!.cubicTo(14.783001f, 34.457996f, 13.468001f, 36.044f, 12.025002f, 36.698997f)
generalPath!!.cubicTo(12.428001f, 35.531998f, 12.273002f, 34.562996f, 12.198002f, 33.447998f)
generalPath!!.lineTo(8.791002f, 33.447998f)
generalPath!!.cubicTo(7.8490024f, 33.447998f, 7.5790024f, 33.039997f, 7.5790024f, 32.079998f)
generalPath!!.lineTo(7.5790024f, 17.999998f)
generalPath!!.cubicTo(7.5790024f, 17.039999f, 7.8490024f, 16.451998f, 8.791002f, 16.451998f)
generalPath!!.lineTo(29.391003f, 16.451998f)
generalPath!!.cubicTo(30.334003f, 16.451998f, 30.626003f, 16.912998f, 30.626003f, 17.873999f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)

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
            return 3.59999942779541
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 6.088356018066406
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 42.37000274658203
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 35.21063995361328
        }

        /**
         * Returns a new instance of this icon with specified dimensions.
         *
         * @param width Required width of the icon
         * @param height Required height of the icon
         * @return A new instance of this icon with specified dimensions.
         */
        @Composable
        fun of(width: Dp, height: Dp): AuroraIcon {
            return Internet_group_chat(
                _width = (width.value * AmbientDensity.current.density).toInt(),
                _height = (height.value * AmbientDensity.current.density).toInt()
            )
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): AuroraIcon.Factory {
            return object : AuroraIcon.Factory {
                override fun createNewIcon(): AuroraIcon {
                    return Internet_group_chat(getOrigWidth().toInt(), getOrigHeight().toInt())
                }
            }
        }

        
    }

    override fun getWidth(): Int {
        return _width
    }

    override fun getHeight(): Int {
        return _height
    }

    @Composable
    override fun setSize(width: Dp, height: Dp) {
        _width = (width.value * AmbientDensity.current.density).toInt()
        _height = (height.value * AmbientDensity.current.density).toInt()
    }

    override fun paintIcon(drawScope: DrawScope) {
        with(drawScope) {
            // Use the original icon bounding box and the current icon dimension to compute
            // the scaling factor
            val fullOrigWidth = getOrigX() + getOrigWidth()
            val fullOrigHeight = getOrigY() + getOrigHeight()
            val coef1 = _width / fullOrigWidth
            val coef2 = _height / fullOrigHeight
            val coef = min(coef1, coef2).toFloat()
            val coefDp = coef.dp.toPx()

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
                scale(scaleX = coefDp, scaleY = coefDp, pivot = Offset.Zero)
                translate(translateXDp, translateYDp)
                clipRect(left = 0.0f, top = 0.0f, right = fullOrigWidth.toFloat(), bottom = fullOrigHeight.toFloat(), clipOp = ClipOp.Intersect)
            }) {
                innerPaint(this)
            }
        }
    }
}

