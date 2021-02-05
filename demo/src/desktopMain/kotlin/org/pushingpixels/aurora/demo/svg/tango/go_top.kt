package org.pushingpixels.aurora.demo.svg.tango

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.drawscope.withTransform
import androidx.compose.ui.platform.LocalDensity
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
class go_top private constructor(var _width: Int, var _height: Int) : AuroraIcon {
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
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0
alphaStack.add(0, alpha)
alpha *= 0.2994652f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.2144659757614136f, 0.0f, 0.0f, -6.694176197052002f,
0.0f, 0.5954579710960388f, 0.0f, 16.66629981994629f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.48186f, 36.421127f)
generalPath!!.cubicTo(40.50693f, 39.429993f, 37.530556f, 42.216076f, 32.67976f, 43.724407f)
generalPath!!.cubicTo(27.828962f, 45.23274f, 21.845287f, 45.23274f, 16.99449f, 43.724407f)
generalPath!!.cubicTo(12.143692f, 42.216076f, 9.167317f, 39.429993f, 9.192389f, 36.421127f)
generalPath!!.cubicTo(9.167317f, 33.412262f, 12.143692f, 30.626177f, 16.99449f, 29.117847f)
generalPath!!.cubicTo(21.845287f, 27.609516f, 27.828962f, 27.609516f, 32.67976f, 29.117847f)
generalPath!!.cubicTo(37.530556f, 30.626177f, 40.50693f, 33.412262f, 40.48186f, 36.421127f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(0.04035041f, 0.031757787f), radius = 0.025416452f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
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
// _0_0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.5f, 1.5f)
generalPath!!.lineTo(6.5f, 7.4962087f)
generalPath!!.lineTo(21.625f, 7.4962087f)
generalPath!!.lineTo(6.53125f, 25.5f)
generalPath!!.lineTo(14.5f, 25.5625f)
generalPath!!.lineTo(14.5f, 38.5f)
generalPath!!.lineTo(32.46875f, 38.5f)
generalPath!!.lineTo(32.46875f, 25.5625f)
generalPath!!.lineTo(40.5f, 25.5625f)
generalPath!!.lineTo(25.125f, 7.4962087f)
generalPath!!.lineTo(40.498104f, 7.4962087f)
generalPath!!.lineTo(40.498104f, 1.5f)
generalPath!!.lineTo(6.5f, 1.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(115, 210, 22, 255), 1.0f to Color(78, 154, 6, 255), center = Offset(-0.019634217f, 0.011977047f), radius = 0.017627142f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(58, 115, 4, 255))
stroke = Stroke(width=1.0000004f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(6.5f, 1.5f)
generalPath!!.lineTo(6.5f, 7.4962087f)
generalPath!!.lineTo(21.625f, 7.4962087f)
generalPath!!.lineTo(6.53125f, 25.5f)
generalPath!!.lineTo(14.5f, 25.5625f)
generalPath!!.lineTo(14.5f, 38.5f)
generalPath!!.lineTo(32.46875f, 38.5f)
generalPath!!.lineTo(32.46875f, 25.5625f)
generalPath!!.lineTo(40.5f, 25.5625f)
generalPath!!.lineTo(25.125f, 7.4962087f)
generalPath!!.lineTo(40.498104f, 7.4962087f)
generalPath!!.lineTo(40.498104f, 1.5f)
generalPath!!.lineTo(6.5f, 1.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.5080214f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.5855236f, 25.03253f)
generalPath!!.lineTo(14.995821f, 25.03253f)
generalPath!!.lineTo(15.062422f, 31.59434f)
generalPath!!.cubicTo(20.718035f, 20.593878f, 23.98445f, 26.108685f, 32.894203f, 18.087994f)
generalPath!!.cubicTo(32.894203f, 18.087994f, 25.110422f, 7.9689126f, 24.086803f, 7.0621667f)
generalPath!!.lineTo(22.681929f, 7.018591f)
generalPath!!.lineTo(7.5855236f, 25.03253f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 0), center = Offset(-0.026407164f, 0.075971164f), radius = 0.031764288f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.4812834f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_3
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0000004f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.602735f, 37.5f)
generalPath!!.lineTo(31.502579f, 37.5f)
generalPath!!.lineTo(31.502579f, 24.50705f)
generalPath!!.lineTo(38.311577f, 24.50705f)
generalPath!!.lineTo(23.809519f, 7.4800653f)
generalPath!!.lineTo(22.919266f, 7.5120316f)
generalPath!!.lineTo(8.65468f, 24.55047f)
generalPath!!.lineTo(15.475049f, 24.528374f)
generalPath!!.lineTo(15.602735f, 37.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.481f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_4
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0000002f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
shape = Outline.Rectangle(rect = Rect(left = 7.498863220214844f, top = 2.4954285621643066f, right = 39.510746002197266f, bottom = 6.5048956871032715f))
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.52272725f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_5
shape = Outline.Rectangle(rect = Rect(left = 6.894291400909424f, top = 1.8612821102142334f, right = 40.12831163406372f, bottom = 7.164582967758179f))
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 0), center = Offset(-0.026716597f, 0.070141494f), radius = 0.036948558f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
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
            return 4.439218997955322
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 0.9999998211860657
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
            return 42.600494384765625
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
            return go_top(
                _width = (width.value * LocalDensity.current.density).toInt(),
                _height = (height.value * LocalDensity.current.density).toInt()
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
                    return go_top(getOrigWidth().toInt(), getOrigHeight().toInt())
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
        _width = (width.value * LocalDensity.current.density).toInt()
        _height = (height.value * LocalDensity.current.density).toInt()
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

