package org.pushingpixels.aurora.demo.svg.vaadin

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
class bullseye : Painter() {
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
// _0
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.0f, 0.0f)
generalPath!!.cubicTo(3.6f, 0.0f, 0.0f, 3.6f, 0.0f, 8.0f)
generalPath!!.cubicTo(0.0f, 12.4f, 3.6f, 16.0f, 8.0f, 16.0f)
generalPath!!.cubicTo(12.4f, 16.0f, 16.0f, 12.4f, 16.0f, 8.0f)
generalPath!!.cubicTo(16.0f, 3.6000004f, 12.4f, 0.0f, 8.0f, 0.0f)
generalPath!!.close()
generalPath!!.moveTo(8.0f, 14.9f)
generalPath!!.cubicTo(4.2f, 14.9f, 1.0999999f, 11.799999f, 1.0999999f, 7.9999995f)
generalPath!!.cubicTo(1.0999999f, 4.2f, 4.2f, 1.0999994f, 8.0f, 1.0999994f)
generalPath!!.cubicTo(11.8f, 1.0999994f, 14.9f, 4.1999993f, 14.9f, 7.9999995f)
generalPath!!.cubicTo(14.9f, 11.799999f, 11.799999f, 14.9f, 7.9999995f, 14.9f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(68, 68, 68, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
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
generalPath!!.moveTo(8.0f, 2.3f)
generalPath!!.cubicTo(4.8f, 2.3f, 2.3000002f, 4.8f, 2.3000002f, 8.0f)
generalPath!!.cubicTo(2.3000002f, 11.2f, 4.9f, 13.7f, 8.0f, 13.7f)
generalPath!!.cubicTo(11.1f, 13.7f, 13.7f, 11.1f, 13.7f, 8.0f)
generalPath!!.cubicTo(13.7f, 4.8999996f, 11.2f, 2.3000002f, 8.0f, 2.3000002f)
generalPath!!.close()
generalPath!!.moveTo(8.0f, 12.6f)
generalPath!!.cubicTo(5.5f, 12.6f, 3.4f, 10.5f, 3.4f, 8.0f)
generalPath!!.cubicTo(3.4f, 5.5f, 5.5f, 3.4f, 8.0f, 3.4f)
generalPath!!.cubicTo(10.5f, 3.4f, 12.6f, 5.5f, 12.6f, 8.0f)
generalPath!!.cubicTo(12.6f, 10.5f, 10.5f, 12.6f, 8.0f, 12.6f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(68, 68, 68, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
alpha = alphaStack.removeAt(0)
blendMode = blendModeStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
blendModeStack.add(0, BlendMode.SrcOver)
blendMode = BlendMode.SrcOver
// _0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.0f, 4.6f)
generalPath!!.cubicTo(6.1f, 4.6f, 4.6f, 6.1f, 4.6f, 8.0f)
generalPath!!.cubicTo(4.6f, 9.9f, 6.1f, 11.4f, 8.0f, 11.4f)
generalPath!!.cubicTo(9.9f, 11.4f, 11.4f, 9.9f, 11.4f, 7.9999995f)
generalPath!!.cubicTo(11.4f, 6.0999994f, 9.9f, 4.5999994f, 7.9999995f, 4.5999994f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(68, 68, 68, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha, blendMode = blendMode)
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
            return 0.0
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
            return 16.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 16.0
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

