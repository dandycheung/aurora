package org.pushingpixels.aurora.demo.svg.tango

import androidx.compose.runtime.Composable
import androidx.compose.ui.geometry.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.clipRect
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
class format_text_strikethrough private constructor(var _width: Dp, var _height: Dp) : AuroraIcon() {
    @Suppress("UNUSED_VARIABLE") private var shape: Outline? = null
    @Suppress("UNUSED_VARIABLE") private var generalPath: Path? = null
    @Suppress("UNUSED_VARIABLE") private var brush: Brush? = null
    @Suppress("UNUSED_VARIABLE") private var stroke: Stroke? = null
    @Suppress("UNUSED_VARIABLE") private var clip: Shape? = null
    private var alpha = 1.0f
    private var alphaStack = mutableListOf(1.0f)
    private var colorFilter: ((Color) -> Color)? = null

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
alpha *= 0.15f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.4701440334320068f, 0.0f, 0.0f, 0.0f,
0.0f, 0.5354740023612976f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-12.76416015625f, 20.915340423583984f, 0.0f, 1.0f)
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
brush = Brush.radialGradient(0.0f to (colorFilter?.invoke(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)), 1.0f to (colorFilter?.invoke(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)), center = Offset(24.837126f, 36.42112f), radius = 15.644739f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
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
// _0_1
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
// _0_1_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.0f, 4.5f)
generalPath!!.lineTo(5.0f, 41.5f)
generalPath!!.lineTo(11.0f, 41.5f)
generalPath!!.lineTo(14.25f, 33.5f)
generalPath!!.lineTo(33.75f, 33.5f)
generalPath!!.lineTo(37.0f, 41.5f)
generalPath!!.lineTo(43.0f, 41.5f)
generalPath!!.lineTo(28.0f, 4.5f)
generalPath!!.lineTo(20.0f, 4.5f)
generalPath!!.close()
generalPath!!.moveTo(24.0f, 9.5f)
generalPath!!.lineTo(31.71875f, 28.5f)
generalPath!!.lineTo(16.28125f, 28.5f)
generalPath!!.lineTo(24.0f, 9.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(73, 127, 198, 255)) ?: Color(73, 127, 198, 255)), 1.0f to (colorFilter?.invoke(Color(144, 179, 217, 255)) ?: Color(144, 179, 217, 255)), start = Offset(29.033241f, 37.44521f), end = Offset(14.33379f, 10.459655f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(42, 83, 135, 255)) ?: Color(42, 83, 135, 255)), 1.0f to (colorFilter?.invoke(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)), start = Offset(22.125f, 38.96281f), end = Offset(22.125f, 10.25f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(20.0f, 4.5f)
generalPath!!.lineTo(5.0f, 41.5f)
generalPath!!.lineTo(11.0f, 41.5f)
generalPath!!.lineTo(14.25f, 33.5f)
generalPath!!.lineTo(33.75f, 33.5f)
generalPath!!.lineTo(37.0f, 41.5f)
generalPath!!.lineTo(43.0f, 41.5f)
generalPath!!.lineTo(28.0f, 4.5f)
generalPath!!.lineTo(20.0f, 4.5f)
generalPath!!.close()
generalPath!!.moveTo(24.0f, 9.5f)
generalPath!!.lineTo(31.71875f, 28.5f)
generalPath!!.lineTo(16.28125f, 28.5f)
generalPath!!.lineTo(24.0f, 9.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.6f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1_1
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)), 1.0f to (colorFilter?.invoke(Color(179, 179, 179, 0)) ?: Color(179, 179, 179, 0)), start = Offset(19.891792f, 17.114628f), end = Offset(21.506844f, 86.69681f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(10.5f, 40.5f)
generalPath!!.lineTo(6.646263f, 40.5f)
generalPath!!.lineTo(20.682829f, 5.5f)
generalPath!!.lineTo(27.353737f, 5.5f)
generalPath!!.lineTo(41.68283f, 40.5f)
generalPath!!.lineTo(37.865658f, 40.5f)
generalPath!!.lineTo(34.403564f, 32.469063f)
generalPath!!.lineTo(13.523417f, 32.36827f)
generalPath!!.cubicTo(13.523417f, 32.36827f, 10.5f, 40.5f, 10.5f, 40.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.46703297f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1_2
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)), 1.0f to (colorFilter?.invoke(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)), start = Offset(23.911612f, 23.13604f), end = Offset(23.911612f, 7.402913f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(14.68934f, 29.5f)
generalPath!!.lineTo(33.258884f, 29.5f)
generalPath!!.lineTo(24.041632f, 6.81103f)
generalPath!!.lineTo(14.68934f, 29.5f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.16470589f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(12.34375f, 22.0f)
generalPath!!.lineTo(10.75f, 26.0f)
generalPath!!.cubicTo(10.75f, 26.0f, 17.84375f, 26.0f, 17.84375f, 26.0f)
generalPath!!.lineTo(19.46875f, 22.0f)
generalPath!!.lineTo(12.34375f, 22.0f)
generalPath!!.close()
generalPath!!.moveTo(28.53125f, 22.0f)
generalPath!!.lineTo(30.15625f, 26.0f)
generalPath!!.lineTo(37.25f, 26.0f)
generalPath!!.lineTo(35.65625f, 22.0f)
generalPath!!.lineTo(28.53125f, 22.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(0, 0, 0, 255)) ?: Color(0, 0, 0, 255)), 1.0f to (colorFilter?.invoke(Color(0, 0, 0, 0)) ?: Color(0, 0, 0, 0)), start = Offset(16.841536f, 24.0f), end = Offset(16.841536f, 25.010555f), tileMode = TileMode.Clamp)
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
// _0_1_4
shape = Outline.Rectangle(rect = Rect(left = 4.5f, top = 20.5f, right = 43.5f, bottom = 23.5f))
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(73, 127, 198, 255)) ?: Color(73, 127, 198, 255)), 1.0f to (colorFilter?.invoke(Color(144, 179, 217, 255)) ?: Color(144, 179, 217, 255)), start = Offset(27.675018f, 22.398964f), end = Offset(16.0744f, 4.9200077f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(42, 83, 135, 255)) ?: Color(42, 83, 135, 255)), 1.0f to (colorFilter?.invoke(Color(52, 101, 164, 255)) ?: Color(52, 101, 164, 255)), start = Offset(5.0271654f, 27.761904f), end = Offset(5.0271654f, 20.416153f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=4.0f)
shape = Outline.Rectangle(rect = Rect(left = 4.5f, top = 20.5f, right = 43.5f, bottom = 23.5f))
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.8f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_1_5
brush = Brush.linearGradient(0.0f to (colorFilter?.invoke(Color(255, 255, 255, 255)) ?: Color(255, 255, 255, 255)), 1.0f to (colorFilter?.invoke(Color(255, 255, 255, 0)) ?: Color(255, 255, 255, 0)), start = Offset(39.421204f, 21.459263f), end = Offset(-24.130018f, 21.5f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.5f, 21.5f)
generalPath!!.lineTo(42.5f, 21.5f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
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
            return 0.7131168246269226
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 4.0
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 46.07374954223633
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 41.13629913330078
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
            return format_text_strikethrough(_width = width, _height = height)
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): AuroraIcon.Factory {
            return object : AuroraIcon.Factory {
                override fun createNewIcon(): AuroraIcon {
                    return format_text_strikethrough(getOrigWidth().dp, getOrigHeight().dp)
                }
            }
        }

        
    }

    override val intrinsicSize: Size
        get() = Size.Unspecified

    override fun DrawScope.onDraw() {
        setSize(size.width.toDp(), size.height.toDp())
        paintIcon(DrawScope@ this)
    }

    override fun getWidth(): Dp {
        return _width
    }

    override fun getHeight(): Dp {
        return _height
    }

    override fun setSize(width: Dp, height: Dp) {
        _width = width
        _height = height
    }

    override fun setColorFilter(colorFilter: ((Color) -> Color)?) {
        this.colorFilter = colorFilter
    }

    override fun paintIcon(drawScope: DrawScope) {
        with(drawScope) {
            clipRect {
                // Use the original icon bounding box and the current icon dimension to compute
                // the scaling factor
                val fullOrigWidth = getOrigX() + getOrigWidth()
                val fullOrigHeight = getOrigY() + getOrigHeight()
                val coef1 = _width.toPx() / fullOrigWidth
                val coef2 = _height.toPx() / fullOrigHeight
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
}

