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
class edit_delete private constructor(var _width: Dp, var _height: Dp) : AuroraIcon {
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
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
0.022623829543590546f, 0.0f, 0.0f, 44.39519119262695f,
0.0f, 0.019662480801343918f, 0.0f, 41.98146057128906f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0
alphaStack.add(0, alpha)
alpha *= 0.40206185f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0_0
shape = Outline.Rectangle(rect = Rect(left = -1559.2523193359375f, top = -150.6968536376953f, right = -219.6187744140625f, bottom = 327.6603240966797f))
brush = Brush.linearGradient(0.0f to Color(0, 0, 0, 0), 0.5f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), start = Offset(-9.4081636E-4f, -8.086308E-4f), end = Offset(-7.603415E-4f, -0.0010863813f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.40206185f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-219.61876f, -150.68037f)
generalPath!!.cubicTo(-219.61876f, -150.68037f, -219.61876f, 327.65042f, -219.61876f, 327.65042f)
generalPath!!.cubicTo(-76.74459f, 328.55087f, 125.78146f, 220.48074f, 125.78138f, 88.45424f)
generalPath!!.cubicTo(125.78138f, -43.572304f, -33.655437f, -150.68036f, -219.61876f, -150.68037f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(-0.0010699814f, -6.103196E-4f), radius = 9.000149E-5f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.40206185f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(-1559.2523f, -150.68037f)
generalPath!!.cubicTo(-1559.2523f, -150.68037f, -1559.2523f, 327.65042f, -1559.2523f, 327.65042f)
generalPath!!.cubicTo(-1702.1265f, 328.55087f, -1904.6525f, 220.48074f, -1904.6525f, 88.45424f)
generalPath!!.cubicTo(-1904.6525f, -43.572304f, -1745.2157f, -150.68036f, -1559.2523f, -150.68037f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(0.004714046f, -0.0026889017f), radius = 0.0011328926f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.38659793f
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
generalPath!!.moveTo(4.75f, 21.0f)
generalPath!!.lineTo(43.25f, 21.0f)
generalPath!!.lineTo(42.375f, 32.25f)
generalPath!!.lineTo(5.625f, 32.25f)
generalPath!!.lineTo(4.75f, 21.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), start = Offset(25.0f, 21.0f), end = Offset(25.0f, 32.25f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.5f
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
generalPath!!.moveTo(4.000805f, 16.500029f)
generalPath!!.cubicTo(3.9568443f, 16.464575f, 5.72773f, 42.00552f, 5.7282343f, 42.013264f)
generalPath!!.cubicTo(5.8943634f, 44.56396f, 7.288948f, 45.496197f, 8.84989f, 45.499996f)
generalPath!!.cubicTo(8.905668f, 45.500126f, 38.133934f, 45.49671f, 38.756645f, 45.494057f)
generalPath!!.cubicTo(41.38534f, 45.482838f, 42.029343f, 43.85947f, 42.202267f, 42.085777f)
generalPath!!.cubicTo(42.216137f, 42.050804f, 43.986115f, 16.535f, 43.99998f, 16.500029f)
generalPath!!.cubicTo(30.666924f, 16.500029f, 17.333866f, 16.500029f, 4.000805f, 16.500029f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(186, 189, 182, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(85, 87, 83, 255))
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.000805f, 16.500029f)
generalPath!!.cubicTo(3.9568443f, 16.464575f, 5.72773f, 42.00552f, 5.7282343f, 42.013264f)
generalPath!!.cubicTo(5.8943634f, 44.56396f, 7.288948f, 45.496197f, 8.84989f, 45.499996f)
generalPath!!.cubicTo(8.905668f, 45.500126f, 38.133934f, 45.49671f, 38.756645f, 45.494057f)
generalPath!!.cubicTo(41.38534f, 45.482838f, 42.029343f, 43.85947f, 42.202267f, 42.085777f)
generalPath!!.cubicTo(42.216137f, 42.050804f, 43.986115f, 16.535f, 43.99998f, 16.500029f)
generalPath!!.cubicTo(30.666924f, 16.500029f, 17.333866f, 16.500029f, 4.000805f, 16.500029f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.23711339f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.457954f, 20.71267f)
generalPath!!.lineTo(7.2079372f, 20.689264f)
generalPath!!.cubicTo(34.519245f, 21.326591f, 39.885143f, 24.337412f, 43.214188f, 24.183575f)
generalPath!!.lineTo(43.457954f, 20.71267f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), start = Offset(1.2435249f, 0.45639956f), end = Offset(0.31039858f, 0.28308687f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.12886599f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.08838865160942078f,
0.0f, 1.0f, 0.0f, 0.08838865160942078f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_4
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
// _0_0_4_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.163486f, 19.614075f)
generalPath!!.cubicTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f)
generalPath!!.cubicTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f)
generalPath!!.lineTo(30.884373f, 34.634373f)
generalPath!!.cubicTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f)
generalPath!!.cubicTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f)
generalPath!!.lineTo(29.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.163486f, 19.614075f)
generalPath!!.cubicTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f)
generalPath!!.cubicTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f)
generalPath!!.lineTo(30.884373f, 34.634373f)
generalPath!!.cubicTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f)
generalPath!!.cubicTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f)
generalPath!!.lineTo(29.163486f, 19.614075f)
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
// _0_0_4_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.912416f, 19.75934f)
generalPath!!.cubicTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f)
generalPath!!.cubicTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f)
generalPath!!.lineTo(11.456527f, 33.80737f)
generalPath!!.cubicTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f)
generalPath!!.cubicTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f)
generalPath!!.lineTo(9.912416f, 19.75934f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.912416f, 19.75934f)
generalPath!!.cubicTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f)
generalPath!!.cubicTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f)
generalPath!!.lineTo(11.456527f, 33.80737f)
generalPath!!.cubicTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f)
generalPath!!.cubicTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f)
generalPath!!.lineTo(9.912416f, 19.75934f)
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
// _0_0_4_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.66716f, 19.714073f)
generalPath!!.cubicTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f)
generalPath!!.cubicTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f)
generalPath!!.lineTo(9.826038f, 33.73022f)
generalPath!!.cubicTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f)
generalPath!!.cubicTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f)
generalPath!!.lineTo(11.66716f, 19.714073f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.66716f, 19.714073f)
generalPath!!.cubicTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f)
generalPath!!.cubicTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f)
generalPath!!.lineTo(9.826038f, 33.73022f)
generalPath!!.cubicTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f)
generalPath!!.cubicTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f)
generalPath!!.lineTo(11.66716f, 19.714073f)
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
// _0_0_4_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.163486f, 19.614075f)
generalPath!!.cubicTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f)
generalPath!!.cubicTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f)
generalPath!!.lineTo(22.928568f, 34.766956f)
generalPath!!.cubicTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f)
generalPath!!.cubicTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f)
generalPath!!.lineTo(21.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.163486f, 19.614075f)
generalPath!!.cubicTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f)
generalPath!!.cubicTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f)
generalPath!!.lineTo(22.928568f, 34.766956f)
generalPath!!.cubicTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f)
generalPath!!.cubicTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f)
generalPath!!.lineTo(21.163486f, 19.614075f)
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
// _0_0_4_4
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.163486f, 19.614075f)
generalPath!!.cubicTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f)
generalPath!!.cubicTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f)
generalPath!!.lineTo(38.077614f, 32.292084f)
generalPath!!.cubicTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f)
generalPath!!.cubicTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f)
generalPath!!.lineTo(35.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.163486f, 19.614075f)
generalPath!!.cubicTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f)
generalPath!!.cubicTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f)
generalPath!!.lineTo(38.077614f, 32.292084f)
generalPath!!.cubicTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f)
generalPath!!.cubicTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f)
generalPath!!.lineTo(35.163486f, 19.614075f)
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
// _0_0_4_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.163486f, 19.614075f)
generalPath!!.cubicTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f)
generalPath!!.cubicTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f)
generalPath!!.lineTo(32.795982f, 34.148235f)
generalPath!!.cubicTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f)
generalPath!!.cubicTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f)
generalPath!!.lineTo(31.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.163486f, 19.614075f)
generalPath!!.cubicTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f)
generalPath!!.cubicTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f)
generalPath!!.lineTo(32.795982f, 34.148235f)
generalPath!!.cubicTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f)
generalPath!!.cubicTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f)
generalPath!!.lineTo(31.163486f, 19.614075f)
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
// _0_0_4_6
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.163486f, 19.614075f)
generalPath!!.cubicTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f)
generalPath!!.cubicTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f)
generalPath!!.lineTo(34.265656f, 34.457596f)
generalPath!!.cubicTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f)
generalPath!!.cubicTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f)
generalPath!!.lineTo(33.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.163486f, 19.614075f)
generalPath!!.cubicTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f)
generalPath!!.cubicTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f)
generalPath!!.lineTo(34.265656f, 34.457596f)
generalPath!!.cubicTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f)
generalPath!!.cubicTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f)
generalPath!!.lineTo(33.163486f, 19.614075f)
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
// _0_0_4_7
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.163486f, 19.614075f)
generalPath!!.cubicTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f)
generalPath!!.cubicTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f)
generalPath!!.lineTo(29.724062f, 33.308548f)
generalPath!!.cubicTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f)
generalPath!!.cubicTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f)
generalPath!!.lineTo(27.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.163486f, 19.614075f)
generalPath!!.cubicTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f)
generalPath!!.cubicTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f)
generalPath!!.lineTo(29.724062f, 33.308548f)
generalPath!!.cubicTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f)
generalPath!!.cubicTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f)
generalPath!!.lineTo(27.163486f, 19.614075f)
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
// _0_0_4_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.163486f, 19.614075f)
generalPath!!.cubicTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f)
generalPath!!.cubicTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f)
generalPath!!.lineTo(25.69113f, 34.28082f)
generalPath!!.cubicTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f)
generalPath!!.cubicTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f)
generalPath!!.lineTo(25.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.163486f, 19.614075f)
generalPath!!.cubicTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f)
generalPath!!.cubicTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f)
generalPath!!.lineTo(25.69113f, 34.28082f)
generalPath!!.cubicTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f)
generalPath!!.cubicTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f)
generalPath!!.lineTo(25.163486f, 19.614075f)
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
// _0_0_4_9
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.163486f, 19.614075f)
generalPath!!.cubicTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f)
generalPath!!.cubicTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f)
generalPath!!.lineTo(24.707596f, 33.6621f)
generalPath!!.cubicTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f)
generalPath!!.cubicTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f)
generalPath!!.lineTo(23.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.163486f, 19.614075f)
generalPath!!.cubicTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f)
generalPath!!.cubicTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f)
generalPath!!.lineTo(24.707596f, 33.6621f)
generalPath!!.cubicTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f)
generalPath!!.cubicTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f)
generalPath!!.lineTo(23.163486f, 19.614075f)
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
// _0_0_4_10
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.313608f, 19.714073f)
generalPath!!.cubicTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f)
generalPath!!.cubicTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f)
generalPath!!.lineTo(14.999517f, 34.698425f)
generalPath!!.cubicTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f)
generalPath!!.cubicTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f)
generalPath!!.lineTo(13.313608f, 19.714073f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.313608f, 19.714073f)
generalPath!!.cubicTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f)
generalPath!!.cubicTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f)
generalPath!!.lineTo(14.999517f, 34.698425f)
generalPath!!.cubicTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f)
generalPath!!.cubicTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f)
generalPath!!.lineTo(13.313608f, 19.714073f)
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
// _0_0_4_11
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.418083f, 20.520258f)
generalPath!!.cubicTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f)
generalPath!!.cubicTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f)
generalPath!!.lineTo(22.721163f, 33.86443f)
generalPath!!.cubicTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f)
generalPath!!.cubicTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f)
generalPath!!.lineTo(19.418083f, 20.520258f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.418083f, 20.520258f)
generalPath!!.cubicTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f)
generalPath!!.cubicTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f)
generalPath!!.lineTo(22.721163f, 33.86443f)
generalPath!!.cubicTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f)
generalPath!!.cubicTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f)
generalPath!!.lineTo(19.418083f, 20.520258f)
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
// _0_0_4_12
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.163487f, 19.614075f)
generalPath!!.cubicTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f)
generalPath!!.cubicTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f)
generalPath!!.lineTo(16.707596f, 33.6621f)
generalPath!!.cubicTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f)
generalPath!!.cubicTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f)
generalPath!!.lineTo(15.163487f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.163487f, 19.614075f)
generalPath!!.cubicTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f)
generalPath!!.cubicTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f)
generalPath!!.lineTo(16.707596f, 33.6621f)
generalPath!!.cubicTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f)
generalPath!!.cubicTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f)
generalPath!!.lineTo(15.163487f, 19.614075f)
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
// _0_0_4_13
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.81613f, 20.479515f)
generalPath!!.cubicTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f)
generalPath!!.cubicTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f)
generalPath!!.lineTo(15.964957f, 32.939804f)
generalPath!!.cubicTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f)
generalPath!!.cubicTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f)
generalPath!!.lineTo(16.81613f, 20.479515f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.3f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.81613f, 20.479515f)
generalPath!!.cubicTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f)
generalPath!!.cubicTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f)
generalPath!!.lineTo(15.964957f, 32.939804f)
generalPath!!.cubicTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f)
generalPath!!.cubicTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f)
generalPath!!.lineTo(16.81613f, 20.479515f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
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
// _0_0_5
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
// _0_0_5_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(29.163486f, 19.614075f)
generalPath!!.cubicTo(29.163486f, 19.614075f, 30.279472f, 23.33545f, 29.517143f, 26.348055f)
generalPath!!.cubicTo(28.754814f, 29.360659f, 29.269247f, 34.210167f, 29.269247f, 34.210167f)
generalPath!!.lineTo(30.884373f, 34.634373f)
generalPath!!.cubicTo(30.884373f, 34.634373f, 30.117495f, 30.028639f, 30.931356f, 26.524832f)
generalPath!!.cubicTo(31.745218f, 23.021023f, 30.577814f, 19.614988f, 30.577814f, 19.614988f)
generalPath!!.lineTo(29.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015601731f, -0.04401702f), radius = 0.0038528896f, tileMode = TileMode.Clamp)
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
// _0_0_5_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.912416f, 19.75934f)
generalPath!!.cubicTo(9.912416f, 19.75934f, 11.028404f, 23.480717f, 10.266074f, 26.49332f)
generalPath!!.cubicTo(9.503745f, 29.505924f, 10.018178f, 34.355434f, 10.018178f, 34.355434f)
generalPath!!.lineTo(11.456527f, 33.80737f)
generalPath!!.cubicTo(11.456527f, 33.80737f, 10.866426f, 30.173906f, 11.680288f, 26.670097f)
generalPath!!.cubicTo(12.49415f, 23.16629f, 11.326745f, 19.760256f, 11.326745f, 19.760256f)
generalPath!!.lineTo(9.912416f, 19.75934f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.014362705f, -0.04052137f), radius = 0.0033031793f, tileMode = TileMode.Clamp)
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
// _0_0_5_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.66716f, 19.714073f)
generalPath!!.cubicTo(11.66716f, 19.714073f, 12.783146f, 23.43545f, 12.020817f, 26.448053f)
generalPath!!.cubicTo(11.258488f, 29.460657f, 8.617841f, 31.76449f, 8.617841f, 31.76449f)
generalPath!!.lineTo(9.826038f, 33.73022f)
generalPath!!.cubicTo(9.826038f, 33.73022f, 12.621168f, 30.12864f, 13.43503f, 26.62483f)
generalPath!!.cubicTo(14.248892f, 23.121023f, 13.081487f, 19.714989f, 13.081487f, 19.714989f)
generalPath!!.lineTo(11.66716f, 19.714073f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.014460501f, -0.04079728f), radius = 0.0033365854f, tileMode = TileMode.Clamp)
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
// _0_0_5_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(21.163486f, 19.614075f)
generalPath!!.cubicTo(21.163486f, 19.614075f, 22.279472f, 23.33545f, 21.517143f, 26.348055f)
generalPath!!.cubicTo(20.754814f, 29.360659f, 21.269247f, 34.210167f, 21.269247f, 34.210167f)
generalPath!!.lineTo(22.928568f, 34.766956f)
generalPath!!.cubicTo(22.928568f, 34.766956f, 22.117495f, 30.028639f, 22.931356f, 26.524832f)
generalPath!!.cubicTo(23.745218f, 23.021023f, 22.577814f, 19.614988f, 22.577814f, 19.614988f)
generalPath!!.lineTo(21.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015047625f, -0.04245373f), radius = 0.0035725187f, tileMode = TileMode.Clamp)
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
// _0_0_5_4
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.163486f, 19.614075f)
generalPath!!.cubicTo(35.163486f, 19.614075f, 36.279472f, 23.33545f, 35.517143f, 26.348055f)
generalPath!!.cubicTo(34.754814f, 29.360659f, 36.55088f, 33.50306f, 36.55088f, 33.50306f)
generalPath!!.lineTo(38.077614f, 32.292084f)
generalPath!!.cubicTo(38.077614f, 32.292084f, 36.117496f, 30.028639f, 36.93136f, 26.524832f)
generalPath!!.cubicTo(37.74522f, 23.021023f, 36.577812f, 19.614988f, 36.577812f, 19.614988f)
generalPath!!.lineTo(35.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.016044851f, -0.045267195f), radius = 0.0041210055f, tileMode = TileMode.Clamp)
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
// _0_0_5_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.163486f, 19.614075f)
generalPath!!.cubicTo(31.163486f, 19.614075f, 32.279472f, 23.33545f, 31.517143f, 26.348055f)
generalPath!!.cubicTo(30.754814f, 29.360659f, 31.269247f, 34.210167f, 31.269247f, 34.210167f)
generalPath!!.lineTo(32.795982f, 34.148235f)
generalPath!!.cubicTo(32.795982f, 34.148235f, 32.117496f, 30.028639f, 32.93136f, 26.524832f)
generalPath!!.cubicTo(33.74522f, 23.021023f, 32.577812f, 19.614988f, 32.577812f, 19.614988f)
generalPath!!.lineTo(31.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015746692f, -0.044425998f), radius = 0.0039362567f, tileMode = TileMode.Clamp)
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
// _0_0_5_6
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.163486f, 19.614075f)
generalPath!!.cubicTo(33.163486f, 19.614075f, 34.279472f, 23.33545f, 33.517143f, 26.348055f)
generalPath!!.cubicTo(32.754814f, 29.360659f, 32.473755f, 34.03339f, 32.473755f, 34.03339f)
generalPath!!.lineTo(34.265656f, 34.457596f)
generalPath!!.cubicTo(34.265656f, 34.457596f, 34.117496f, 30.028639f, 34.93136f, 26.524832f)
generalPath!!.cubicTo(35.74522f, 23.021023f, 34.577812f, 19.614988f, 34.577812f, 19.614988f)
generalPath!!.lineTo(33.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015894374f, -0.044842653f), radius = 0.0040255226f, tileMode = TileMode.Clamp)
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
// _0_0_5_7
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(27.163486f, 19.614075f)
generalPath!!.cubicTo(27.163486f, 19.614075f, 28.279472f, 23.33545f, 27.517143f, 26.348055f)
generalPath!!.cubicTo(26.754814f, 29.360659f, 28.064743f, 33.989197f, 28.064743f, 33.989197f)
generalPath!!.lineTo(29.724062f, 33.308548f)
generalPath!!.cubicTo(29.724062f, 33.308548f, 28.117495f, 30.028639f, 28.931356f, 26.524832f)
generalPath!!.cubicTo(29.745218f, 23.021023f, 28.577814f, 19.614988f, 28.577814f, 19.614988f)
generalPath!!.lineTo(27.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015459415f, -0.043615505f), radius = 0.003775121f, tileMode = TileMode.Clamp)
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
// _0_0_5_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.163486f, 19.614075f)
generalPath!!.cubicTo(25.163486f, 19.614075f, 26.279472f, 23.33545f, 25.517143f, 26.348055f)
generalPath!!.cubicTo(24.754814f, 29.360659f, 24.164394f, 34.077583f, 24.164394f, 34.077583f)
generalPath!!.lineTo(25.69113f, 34.28082f)
generalPath!!.cubicTo(25.69113f, 34.28082f, 26.117495f, 30.028639f, 26.931356f, 26.524832f)
generalPath!!.cubicTo(27.745218f, 23.021023f, 26.577814f, 19.614988f, 26.577814f, 19.614988f)
generalPath!!.lineTo(25.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015319668f, -0.04322124f), radius = 0.003702657f, tileMode = TileMode.Clamp)
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
// _0_0_5_9
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(23.163486f, 19.614075f)
generalPath!!.cubicTo(23.163486f, 19.614075f, 24.279472f, 23.33545f, 23.517143f, 26.348055f)
generalPath!!.cubicTo(22.754814f, 29.360659f, 23.269247f, 34.210167f, 23.269247f, 34.210167f)
generalPath!!.lineTo(24.707596f, 33.6621f)
generalPath!!.cubicTo(24.707596f, 33.6621f, 24.117495f, 30.028639f, 24.931356f, 26.524832f)
generalPath!!.cubicTo(25.745218f, 23.021023f, 24.577814f, 19.614988f, 24.577814f, 19.614988f)
generalPath!!.lineTo(23.163486f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015182428f, -0.042834044f), radius = 0.0036352149f, tileMode = TileMode.Clamp)
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
// _0_0_5_10
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(13.313608f, 19.714073f)
generalPath!!.cubicTo(13.313608f, 19.714073f, 14.429594f, 23.43545f, 13.667265f, 26.448053f)
generalPath!!.cubicTo(12.904936f, 29.460657f, 13.419369f, 34.310165f, 13.419369f, 34.310165f)
generalPath!!.lineTo(14.999517f, 34.698425f)
generalPath!!.cubicTo(14.999517f, 34.698425f, 14.267616f, 30.12864f, 15.081478f, 26.62483f)
generalPath!!.cubicTo(15.89534f, 23.121023f, 14.727935f, 19.714989f, 14.727935f, 19.714989f)
generalPath!!.lineTo(13.313608f, 19.714073f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.01456279f, -0.04108587f), radius = 0.0033722965f, tileMode = TileMode.Clamp)
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
// _0_0_5_11
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(19.418083f, 20.520258f)
generalPath!!.cubicTo(19.418083f, 20.520258f, 19.615713f, 24.1298f, 19.064632f, 27.254238f)
generalPath!!.cubicTo(18.52486f, 30.31456f, 21.306417f, 34.496773f, 21.306417f, 34.496773f)
generalPath!!.lineTo(22.721163f, 33.86443f)
generalPath!!.cubicTo(22.721163f, 33.86443f, 19.926762f, 31.248787f, 20.55876f, 27.078695f)
generalPath!!.cubicTo(21.116432f, 23.399015f, 20.83241f, 20.521172f, 20.83241f, 20.521172f)
generalPath!!.lineTo(19.418083f, 20.520258f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.015096198f, -0.042590763f), radius = 0.0035493176f, tileMode = TileMode.Clamp)
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
// _0_0_5_12
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(15.163487f, 19.614075f)
generalPath!!.cubicTo(15.163487f, 19.614075f, 16.279472f, 23.33545f, 15.517144f, 26.348055f)
generalPath!!.cubicTo(14.754815f, 29.360659f, 15.269248f, 34.210167f, 15.269248f, 34.210167f)
generalPath!!.lineTo(16.707596f, 33.6621f)
generalPath!!.cubicTo(16.707596f, 33.6621f, 16.117495f, 30.028639f, 16.931356f, 26.524832f)
generalPath!!.cubicTo(17.745218f, 23.021023f, 16.577814f, 19.614988f, 16.577814f, 19.614988f)
generalPath!!.lineTo(15.163487f, 19.614075f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.014657205f, -0.04135224f), radius = 0.0034103307f, tileMode = TileMode.Clamp)
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
// _0_0_5_13
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(16.81613f, 20.479515f)
generalPath!!.cubicTo(16.81613f, 20.479515f, 17.932116f, 24.200891f, 17.169786f, 27.213495f)
generalPath!!.cubicTo(16.407457f, 30.226099f, 14.726988f, 31.80438f, 14.726988f, 31.80438f)
generalPath!!.lineTo(15.964957f, 32.939804f)
generalPath!!.cubicTo(15.964957f, 32.939804f, 17.770138f, 30.89408f, 18.584f, 27.390272f)
generalPath!!.cubicTo(19.397861f, 23.886463f, 18.230455f, 20.480429f, 18.230455f, 20.480429f)
generalPath!!.lineTo(16.81613f, 20.479515f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(213, 213, 213, 255), center = Offset(-0.014960425f, -0.04220771f), radius = 0.0034956716f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.62886596f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_6
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(5.414681f, 19.121548f)
generalPath!!.cubicTo(5.3634243f, 19.121414f, 6.251433f, 31.93862f, 6.956946f, 40.927803f)
generalPath!!.cubicTo(7.138951f, 43.235264f, 7.508862f, 44.174408f, 8.942307f, 44.174408f)
generalPath!!.cubicTo(20.75913f, 44.174408f, 37.552948f, 44.260506f, 38.124794f, 44.258404f)
generalPath!!.cubicTo(40.8913f, 44.248245f, 40.839523f, 43.22092f, 41.068645f, 41.03815f)
generalPath!!.cubicTo(41.152054f, 40.243546f, 42.601147f, 19.210922f, 42.587322f, 19.210922f)
generalPath!!.cubicTo(32.686245f, 19.210922f, 17.64779f, 19.153519f, 5.414681f, 19.121548f)
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
// _0_0_7
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.163233f, 6.56876f)
generalPath!!.cubicTo(6.0964704f, 6.571197f, 5.203674f, 6.59587f, 4.7173743f, 7.611591f)
generalPath!!.cubicTo(4.6328516f, 7.788132f, 2.0564582f, 14.953189f, 1.9325929f, 15.226435f)
generalPath!!.cubicTo(0.8721842f, 17.565664f, 1.8500978f, 20.512358f, 3.8982468f, 20.492628f)
generalPath!!.cubicTo(4.2877545f, 20.488998f, 44.257347f, 20.510899f, 44.877144f, 20.492628f)
generalPath!!.cubicTo(46.620636f, 20.442135f, 46.843746f, 17.029898f, 46.093185f, 15.494889f)
generalPath!!.cubicTo(46.050663f, 15.407927f, 42.567223f, 7.513946f, 42.47838f, 7.374125f)
generalPath!!.cubicTo(42.067463f, 6.749683f, 41.14725f, 6.476015f, 40.463707f, 6.501646f)
generalPath!!.cubicTo(40.329056f, 6.506821f, 7.296499f, 6.568457f, 7.163233f, 6.56876f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(89, 139, 203, 255), 0.7567568f to Color(47, 92, 150, 255), 1.0f to Color(32, 62, 101, 255), start = Offset(24.000006f, 15.837313f), end = Offset(24.000006f, 21.0f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(32, 74, 135, 255))
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.163233f, 6.56876f)
generalPath!!.cubicTo(6.0964704f, 6.571197f, 5.203674f, 6.59587f, 4.7173743f, 7.611591f)
generalPath!!.cubicTo(4.6328516f, 7.788132f, 2.0564582f, 14.953189f, 1.9325929f, 15.226435f)
generalPath!!.cubicTo(0.8721842f, 17.565664f, 1.8500978f, 20.512358f, 3.8982468f, 20.492628f)
generalPath!!.cubicTo(4.2877545f, 20.488998f, 44.257347f, 20.510899f, 44.877144f, 20.492628f)
generalPath!!.cubicTo(46.620636f, 20.442135f, 46.843746f, 17.029898f, 46.093185f, 15.494889f)
generalPath!!.cubicTo(46.050663f, 15.407927f, 42.567223f, 7.513946f, 42.47838f, 7.374125f)
generalPath!!.cubicTo(42.067463f, 6.749683f, 41.14725f, 6.476015f, 40.463707f, 6.501646f)
generalPath!!.cubicTo(40.329056f, 6.506821f, 7.296499f, 6.568457f, 7.163233f, 6.56876f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.14948454f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(4.79225f, 20.902176f)
generalPath!!.lineTo(7.292169f, 20.902264f)
generalPath!!.lineTo(8.058021f, 41.513138f)
generalPath!!.lineTo(7.2954774f, 44.58633f)
generalPath!!.cubicTo(6.688538f, 44.099873f, 6.4168015f, 43.36201f, 6.2792296f, 42.52353f)
generalPath!!.lineTo(4.79225f, 20.902176f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(85, 87, 83, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.42783505f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_9
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.033569f, 41.611683f)
generalPath!!.lineTo(7.3212657f, 44.54057f)
generalPath!!.cubicTo(7.744129f, 44.765465f, 8.057012f, 44.85283f, 8.5125475f, 45.007175f)
generalPath!!.lineTo(38.53843f, 44.978477f)
generalPath!!.cubicTo(39.11735f, 44.938854f, 39.669098f, 44.912678f, 40.052765f, 44.806892f)
generalPath!!.lineTo(38.00699f, 41.370872f)
generalPath!!.lineTo(8.033569f, 41.611683f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(238, 238, 236, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.371134f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_10
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.00699f, 41.370872f)
generalPath!!.lineTo(40.01949f, 44.81576f)
generalPath!!.cubicTo(40.63769f, 44.55256f, 41.34983f, 44.09195f, 41.630913f, 42.961864f)
generalPath!!.lineTo(43.139313f, 20.94521f)
generalPath!!.lineTo(39.69211f, 20.942984f)
generalPath!!.lineTo(38.00699f, 41.370872f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(238, 238, 236, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.38659793f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_11
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 0), start = Offset(21.67791f, 19.969507f), end = Offset(22.333523f, 11.643976f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.375f, 7.53125f)
generalPath!!.cubicTo(40.307785f, 7.5315127f, 40.187424f, 7.5621486f, 40.0625f, 7.5625f)
generalPath!!.cubicTo(39.812653f, 7.5632033f, 39.458454f, 7.5614724f, 39.0f, 7.5625f)
generalPath!!.cubicTo(38.083088f, 7.5645556f, 36.778275f, 7.559461f, 35.21875f, 7.5625f)
generalPath!!.cubicTo(32.0997f, 7.5685787f, 27.959843f, 7.58628f, 23.8125f, 7.59375f)
generalPath!!.cubicTo(15.517814f, 7.6086903f, 7.175529f, 7.593706f, 7.15625f, 7.59375f)
generalPath!!.cubicTo(6.6366935f, 7.594937f, 6.261561f, 7.652425f, 6.0625f, 7.71875f)
generalPath!!.cubicTo(5.863439f, 7.7850757f, 5.795362f, 7.77194f, 5.65625f, 8.0625f)
generalPath!!.cubicTo(5.7244234f, 7.9201074f, 5.6779785f, 8.036386f, 5.65625f, 8.09375f)
generalPath!!.cubicTo(5.6345215f, 8.151114f, 5.6013284f, 8.238751f, 5.5625f, 8.34375f)
generalPath!!.cubicTo(5.4848433f, 8.553747f, 5.3772674f, 8.870004f, 5.25f, 9.21875f)
generalPath!!.cubicTo(4.9954653f, 9.916243f, 4.647162f, 10.82881f, 4.3125f, 11.75f)
generalPath!!.cubicTo(3.977838f, 12.67119f, 3.6668003f, 13.599915f, 3.40625f, 14.3125f)
generalPath!!.cubicTo(3.275975f, 14.668793f, 3.1460285f, 14.962545f, 3.0625f, 15.1875f)
generalPath!!.cubicTo(2.9789715f, 15.412455f, 2.96316f, 15.461769f, 2.875f, 15.65625f)
generalPath!!.cubicTo(2.463348f, 16.564342f, 2.4810984f, 17.654814f, 2.75f, 18.40625f)
generalPath!!.cubicTo(3.0189016f, 19.157686f, 3.387622f, 19.473745f, 3.90625f, 19.46875f)
generalPath!!.cubicTo(4.0431166f, 19.467474f, 4.618759f, 19.468534f, 5.75f, 19.46875f)
generalPath!!.cubicTo(6.881241f, 19.468966f, 8.469657f, 19.46812f, 10.375f, 19.46875f)
generalPath!!.cubicTo(14.185686f, 19.470007f, 19.25455f, 19.46738f, 24.3125f, 19.46875f)
generalPath!!.cubicTo(29.37045f, 19.47012f, 34.44211f, 19.469322f, 38.28125f, 19.46875f)
generalPath!!.cubicTo(40.20082f, 19.468464f, 41.785362f, 19.469906f, 42.9375f, 19.46875f)
generalPath!!.cubicTo(44.089638f, 19.467594f, 44.934708f, 19.466068f, 44.84375f, 19.46875f)
generalPath!!.cubicTo(44.93948f, 19.465979f, 44.944878f, 19.474737f, 45.0625f, 19.3125f)
generalPath!!.cubicTo(45.180122f, 19.150263f, 45.303425f, 18.79192f, 45.375f, 18.375f)
generalPath!!.cubicTo(45.51815f, 17.541162f, 45.378994f, 16.424294f, 45.15625f, 15.96875f)
generalPath!!.cubicTo(45.08818f, 15.829539f, 45.122097f, 15.876058f, 45.09375f, 15.8125f)
generalPath!!.cubicTo(45.065403f, 15.748942f, 45.01873f, 15.674998f, 44.96875f, 15.5625f)
generalPath!!.cubicTo(44.868786f, 15.337505f, 44.72996f, 15.002468f, 44.5625f, 14.625f)
generalPath!!.cubicTo(44.227577f, 13.870065f, 43.788494f, 12.876072f, 43.34375f, 11.875f)
generalPath!!.cubicTo(42.899006f, 10.873928f, 42.46493f, 9.884789f, 42.125f, 9.125f)
generalPath!!.cubicTo(41.955036f, 8.745106f, 41.790173f, 8.413838f, 41.6875f, 8.1875f)
generalPath!!.cubicTo(41.636166f, 8.074331f, 41.590405f, 7.997518f, 41.5625f, 7.9375f)
generalPath!!.cubicTo(41.439575f, 7.7832594f, 40.85875f, 7.517798f, 40.5f, 7.53125f)
generalPath!!.cubicTo(40.400017f, 7.535093f, 40.456734f, 7.5311365f, 40.4375f, 7.53125f)
generalPath!!.cubicTo(40.418266f, 7.5313635f, 40.408607f, 7.531119f, 40.375f, 7.53125f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.8298969f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_12
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.0f, 10.0f)
generalPath!!.lineTo(7.375f, 12.0f)
generalPath!!.lineTo(39.375f, 12.0f)
generalPath!!.lineTo(38.593147f, 10.07544f)
generalPath!!.lineTo(8.0f, 10.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), start = Offset(-1.7406992f, -0.7089313f), end = Offset(-1.2850226f, -0.6977426f), tileMode = TileMode.Clamp)
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
// _0_0_13
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.853549f, 1.5000014f)
generalPath!!.lineTo(37.167316f, 1.5000014f)
generalPath!!.cubicTo(37.363186f, 1.5000014f, 37.52087f, 1.6576864f, 37.52087f, 1.853555f)
generalPath!!.lineTo(37.52087f, 11.500003f)
generalPath!!.cubicTo(37.52087f, 11.500003f, 9.499995f, 11.500003f, 9.499995f, 11.500003f)
generalPath!!.lineTo(9.499995f, 1.853555f)
generalPath!!.cubicTo(9.499995f, 1.6576864f, 9.6576805f, 1.5000014f, 9.853549f, 1.5000014f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(211, 211, 211, 255), start = Offset(0.66694915f, -0.17896426f), end = Offset(-43.624f, -25.892397f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(136, 138, 133, 255))
stroke = Stroke(width=1.0000008f, cap=StrokeCap.Butt, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(9.853549f, 1.5000014f)
generalPath!!.lineTo(37.167316f, 1.5000014f)
generalPath!!.cubicTo(37.363186f, 1.5000014f, 37.52087f, 1.6576864f, 37.52087f, 1.853555f)
generalPath!!.lineTo(37.52087f, 11.500003f)
generalPath!!.cubicTo(37.52087f, 11.500003f, 9.499995f, 11.500003f, 9.499995f, 11.500003f)
generalPath!!.lineTo(9.499995f, 1.853555f)
generalPath!!.cubicTo(9.499995f, 1.6576864f, 9.6576805f, 1.5000014f, 9.853549f, 1.5000014f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.62886596f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_14
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0000002f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(10.499998f, 10.522594f)
generalPath!!.lineTo(10.499998f, 2.5000012f)
generalPath!!.lineTo(36.50438f, 2.5000012f)
generalPath!!.lineTo(36.50438f, 10.611733f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
0.8143839836120605f, 0.0f, 0.0f, 7.5837202072143555f,
0.0f, 0.796379029750824f, 0.0f, 3.212693929672241f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_15
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.0f, 15.0f)
generalPath!!.cubicTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f)
generalPath!!.cubicTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f)
generalPath!!.cubicTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f)
generalPath!!.cubicTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f)
generalPath!!.cubicTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f)
generalPath!!.cubicTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(204, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(164, 0, 0, 255))
stroke = Stroke(width=1.2417247f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.0f, 15.0f)
generalPath!!.cubicTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f)
generalPath!!.cubicTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f)
generalPath!!.cubicTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f)
generalPath!!.cubicTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f)
generalPath!!.cubicTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f)
generalPath!!.cubicTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f)
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
0.8143839836120605f, 0.0f, 0.0f, 7.5837202072143555f,
0.0f, 0.796379029750824f, 0.0f, 2.549783945083618f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_16
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.0f, 15.0f)
generalPath!!.cubicTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f)
generalPath!!.cubicTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f)
generalPath!!.cubicTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f)
generalPath!!.cubicTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f)
generalPath!!.cubicTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f)
generalPath!!.cubicTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(239, 41, 41, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = Brush.linearGradient(0.0f to Color(164, 0, 0, 255), 1.0f to Color(255, 196, 196, 255), start = Offset(40.5f, 13.822797f), end = Offset(40.5f, 16.877842f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.2417247f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(43.0f, 15.0f)
generalPath!!.cubicTo(43.004005f, 15.447914f, 42.52839f, 15.862662f, 41.75324f, 16.0872f)
generalPath!!.cubicTo(40.97809f, 16.311737f, 40.02191f, 16.311737f, 39.24676f, 16.0872f)
generalPath!!.cubicTo(38.47161f, 15.862662f, 37.995995f, 15.447914f, 38.0f, 15.0f)
generalPath!!.cubicTo(37.995995f, 14.552086f, 38.47161f, 14.137338f, 39.24676f, 13.9128f)
generalPath!!.cubicTo(40.02191f, 13.688263f, 40.97809f, 13.688263f, 41.75324f, 13.9128f)
generalPath!!.cubicTo(42.52839f, 14.137338f, 43.004005f, 14.552086f, 43.0f, 15.0f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.2731959f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_17
shape = Outline.Rectangle(rect = Rect(left = 9.0f, top = 6.6875f, right = 38.0f, bottom = 12.0f))
brush = Brush.linearGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), start = Offset(23.5f, 12.0f), end = Offset(23.5f, 6.6875f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.13917527f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_18
shape = Outline.Rounded(roundRect = RoundRect(left = 12.0f, top = 4.0f, right = 35.0f, bottom = 5.0f,radiusX = 1.0f, radiusY = 1.0f))
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.13917527f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_19
shape = Outline.Rounded(roundRect = RoundRect(left = 12.0f, top = 6.0f, right = 27.0f, bottom = 7.0f,radiusX = 1.0f, radiusY = 1.0f))
brush = SolidColor(Color(0, 0, 0, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.13917527f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_20
shape = Outline.Rounded(roundRect = RoundRect(left = 12.0f, top = 8.0f, right = 31.0f, bottom = 9.0f,radiusX = 1.0f, radiusY = 1.0f))
brush = SolidColor(Color(0, 0, 0, 255))
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
            return 0.5153425335884094
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 1.0000009536743164
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 46.72550582885742
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 47.0
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
            return edit_delete(_width = width, _height = height)
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): AuroraIcon.Factory {
            return object : AuroraIcon.Factory {
                override fun createNewIcon(): AuroraIcon {
                    return edit_delete(getOrigWidth().dp, getOrigHeight().dp)
                }
            }
        }

        
    }

    override fun getWidth(): Dp {
        return _width
    }

    override fun getHeight(): Dp {
        return _height
    }

    @Composable
    override fun setSize(width: Dp, height: Dp) {
        _width = width
        _height = height
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

