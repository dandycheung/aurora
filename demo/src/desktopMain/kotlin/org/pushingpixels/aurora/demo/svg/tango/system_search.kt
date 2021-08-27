package org.pushingpixels.aurora.demo.svg.tango

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
class system_search : AuroraIcon() {
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
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0
alphaStack.add(0, alpha)
alpha *= 0.17112298f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.446431040763855f, 0.0f, 0.0f, 0.0f,
0.0f, 1.5199899673461914f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-10.974530220031738f, -17.751680374145508f, 0.0f, 1.0f)
))}){
// _0_0_0_0
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.65864f, 37.967922f)
generalPath!!.cubicTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.41574f, 41.38893f)
generalPath!!.cubicTo(27.290888f, 42.095467f, 20.96915f, 42.095467f, 15.8442955f, 41.38893f)
generalPath!!.cubicTo(10.719441f, 40.6824f, 7.574909f, 39.37734f, 7.6013966f, 37.967922f)
generalPath!!.cubicTo(7.574909f, 36.558506f, 10.719441f, 35.253445f, 15.8442955f, 34.546913f)
generalPath!!.cubicTo(20.96915f, 33.840378f, 27.290888f, 33.840378f, 32.41574f, 34.546913f)
generalPath!!.cubicTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(0, 0, 0, 255), 1.0f to Color(0, 0, 0, 0), center = Offset(24.130018f, 37.96793f), radius = 16.52862f, tileMode = TileMode.Clamp)
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
// _0_0_0_1
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.cubicTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f)
generalPath!!.cubicTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f)
generalPath!!.cubicTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f)
generalPath!!.cubicTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f)
generalPath!!.lineTo(39.42152f, 41.517845f)
generalPath!!.cubicTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f)
generalPath!!.cubicTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f)
generalPath!!.lineTo(32.31377f, 27.529188f)
generalPath!!.cubicTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f)
generalPath!!.cubicTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f)
generalPath!!.cubicTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f)
generalPath!!.close()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.cubicTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.cubicTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.cubicTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f)
generalPath!!.cubicTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(220, 220, 220, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = Brush.linearGradient(0.0f to Color(138, 138, 138, 255), 1.0f to Color(72, 72, 72, 255), start = Offset(27.36634f, 26.580296f), end = Offset(31.335964f, 30.557772f), tileMode = TileMode.Clamp)
stroke = Stroke(width=2.000001f, cap=StrokeCap.Round, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.62757f, 3.1435547f)
generalPath!!.cubicTo(10.488439f, 3.1435547f, 3.8827682f, 9.749226f, 3.8827682f, 17.888355f)
generalPath!!.cubicTo(3.8827682f, 26.027487f, 10.488439f, 32.63316f, 18.62757f, 32.63316f)
generalPath!!.cubicTo(22.107124f, 32.63316f, 25.17857f, 31.248766f, 27.701292f, 29.23051f)
generalPath!!.cubicTo(27.495914f, 30.237392f, 27.623257f, 31.265879f, 28.457436f, 31.990437f)
generalPath!!.lineTo(39.42152f, 41.517845f)
generalPath!!.cubicTo(40.654938f, 42.589176f, 42.508984f, 42.448807f, 43.58031f, 41.21539f)
generalPath!!.cubicTo(44.651638f, 39.98197f, 44.51127f, 38.127926f, 43.27785f, 37.0566f)
generalPath!!.lineTo(32.31377f, 27.529188f)
generalPath!!.cubicTo(31.642242f, 26.94591f, 30.82089f, 26.773218f, 30.00753f, 26.886465f)
generalPath!!.cubicTo(31.99423f, 24.374044f, 33.37237f, 21.337664f, 33.37237f, 17.888355f)
generalPath!!.cubicTo(33.37237f, 9.749226f, 26.766699f, 3.1435547f, 18.62757f, 3.1435547f)
generalPath!!.close()
generalPath!!.moveTo(18.551954f, 4.369738f)
generalPath!!.cubicTo(26.191414f, 4.369738f, 31.843729f, 9.158689f, 31.843729f, 17.661512f)
generalPath!!.cubicTo(31.843729f, 26.336626f, 26.027039f, 30.953287f, 18.551954f, 30.953287f)
generalPath!!.cubicTo(11.249005f, 30.953287f, 5.2601805f, 25.475197f, 5.2601805f, 17.661512f)
generalPath!!.cubicTo(5.2601805f, 9.677406f, 11.084819f, 4.369738f, 18.551954f, 4.369738f)
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
// _0_0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.602905f, 3.0803552f)
generalPath!!.cubicTo(10.437465f, 3.0803552f, 3.8104408f, 9.707379f, 3.8104408f, 17.87282f)
generalPath!!.cubicTo(3.8104408f, 26.03826f, 10.437465f, 32.665283f, 18.602905f, 32.665283f)
generalPath!!.cubicTo(22.093708f, 32.665283f, 25.175081f, 31.276417f, 27.70596f, 29.251638f)
generalPath!!.cubicTo(27.49992f, 30.261774f, 27.627672f, 31.293585f, 28.464546f, 32.020485f)
generalPath!!.lineTo(39.464073f, 41.57869f)
generalPath!!.cubicTo(40.701477f, 42.653484f, 42.561516f, 42.51266f, 43.636307f, 41.275257f)
generalPath!!.cubicTo(44.711098f, 40.037853f, 44.570274f, 38.177814f, 43.33287f, 37.103024f)
generalPath!!.lineTo(32.333347f, 27.544815f)
generalPath!!.cubicTo(31.659649f, 26.959652f, 30.835642f, 26.786402f, 30.019653f, 26.900017f)
generalPath!!.cubicTo(32.012775f, 24.379473f, 33.39537f, 21.333277f, 33.39537f, 17.87282f)
generalPath!!.cubicTo(33.39537f, 9.707379f, 26.768345f, 3.0803552f, 18.602905f, 3.0803552f)
generalPath!!.close()
generalPath!!.moveTo(18.527046f, 6.266424f)
generalPath!!.cubicTo(24.808153f, 6.2664247f, 29.905865f, 11.364135f, 29.905865f, 17.645243f)
generalPath!!.cubicTo(29.905865f, 23.926352f, 24.808153f, 29.024061f, 18.527046f, 29.024061f)
generalPath!!.cubicTo(12.245938f, 29.024061f, 7.1482277f, 23.926352f, 7.1482277f, 17.645243f)
generalPath!!.cubicTo(7.1482277f, 11.364135f, 12.245938f, 6.266424f, 18.527046f, 6.266424f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(220, 220, 220, 255))
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
// _0_0_0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.507004f, 41.57769f)
generalPath!!.cubicTo(39.02833f, 39.304504f, 40.904335f, 36.76627f, 43.091057f, 36.789314f)
generalPath!!.cubicTo(43.091057f, 36.789314f, 32.33069f, 27.531204f, 32.33069f, 27.531204f)
generalPath!!.cubicTo(29.385899f, 27.474499f, 28.061188f, 29.80382f, 28.553877f, 32.131126f)
generalPath!!.lineTo(39.507004f, 41.57769f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(125, 125, 125, 255), 0.5f to Color(177, 177, 177, 255), 1.0f to Color(104, 104, 104, 255), start = Offset(33.939777f, 36.443268f), end = Offset(37.35967f, 32.650097f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.2457430362701416f, 0.0f, 0.0f, 0.0f,
0.0f, 1.2457430362701416f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-3.4253458976745605f, -6.177032947540283f, 0.0f, 1.0f)
))}){
// _0_0_0_4
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 0.5f to Color(255, 255, 255, 56), 1.0f to Color(255, 255, 255, 255), start = Offset(18.292673f, 13.602121f), end = Offset(17.500893f, 25.74347f), tileMode = TileMode.Clamp)
stroke = Stroke(width=0.8027336f, cap=StrokeCap.Round, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(28.549437f, 18.920233f)
generalPath!!.cubicTo(28.567142f, 22.879269f, 26.465181f, 26.545166f, 23.039478f, 28.529814f)
generalPath!!.cubicTo(19.613773f, 30.51446f, 15.388013f, 30.51446f, 11.962308f, 28.529814f)
generalPath!!.cubicTo(8.536603f, 26.545166f, 6.4346433f, 22.879269f, 6.4523487f, 18.920233f)
generalPath!!.cubicTo(6.4346433f, 14.961198f, 8.536603f, 11.295299f, 11.962308f, 9.310653f)
generalPath!!.cubicTo(15.388013f, 7.326006f, 19.613773f, 7.326006f, 23.039478f, 9.310653f)
generalPath!!.cubicTo(26.465181f, 11.295299f, 28.567142f, 14.961198f, 28.549437f, 18.920233f)
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
0.497763991355896f, 0.0f, 0.0f, 0.0f,
0.0f, 0.609620988368988f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
8.973526000976562f, 15.619290351867676f, 0.0f, 1.0f)
))}){
// _0_0_0_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.65864f, 37.967922f)
generalPath!!.cubicTo(40.685127f, 39.37734f, 37.540596f, 40.6824f, 32.41574f, 41.38893f)
generalPath!!.cubicTo(27.290888f, 42.095467f, 20.96915f, 42.095467f, 15.8442955f, 41.38893f)
generalPath!!.cubicTo(10.719441f, 40.6824f, 7.574909f, 39.37734f, 7.6013966f, 37.967922f)
generalPath!!.cubicTo(7.574909f, 36.558506f, 10.719441f, 35.253445f, 15.8442955f, 34.546913f)
generalPath!!.cubicTo(20.96915f, 33.840378f, 27.290888f, 33.840378f, 32.41574f, 34.546913f)
generalPath!!.cubicTo(37.540596f, 35.253445f, 40.685127f, 36.558506f, 40.65864f, 37.967922f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 0), center = Offset(24.130018f, 37.96793f), radius = 16.52862f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.4331551f
withTransform({
transform(
Matrix(values=floatArrayOf(
0.7529860138893127f, 0.658037006855011f, 0.0f, 0.0f,
-0.6489019989967346f, 0.7608720064163208f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0_6
brush = SolidColor(Color(255, 255, 255, 255))
stroke = Stroke(width=1.0000311f, cap=StrokeCap.Round, join=StrokeJoin.Miter, miter=10.0f)
shape = Outline.Rounded(roundRect = RoundRect(left = 40.37333679199219f, top = 0.14086054265499115f, right = 59.421775817871094f, bottom = 4.581338867545128f,radiusX = 4.273321628570557f, radiusY = 3.7758729457855225f))
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.3986140489578247f, 0.0f, 0.0f, 0.0f,
0.0f, 1.3986140489578247f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
-6.224338054656982f, -8.298957824707031f, 0.0f, 1.0f)
))}){
// _0_0_0_7
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.cubicTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.cubicTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f)
generalPath!!.cubicTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f)
generalPath!!.cubicTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f)
generalPath!!.cubicTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f)
generalPath!!.cubicTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(114, 159, 207, 53), 1.0f to Color(114, 159, 207, 172), center = Offset(18.240929f, 21.817987f), radius = 8.308506f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
brush = SolidColor(Color(48, 99, 163, 255))
stroke = Stroke(width=0.71499395f, cap=StrokeCap.Round, join=StrokeJoin.Miter, miter=10.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(25.897785f, 18.478292f)
generalPath!!.cubicTo(25.9111f, 21.455486f, 24.330425f, 24.212242f, 21.754295f, 25.704697f)
generalPath!!.cubicTo(19.178165f, 27.197151f, 16.000395f, 27.197151f, 13.424265f, 25.704697f)
generalPath!!.cubicTo(10.848135f, 24.212242f, 9.267462f, 21.455486f, 9.280776f, 18.478292f)
generalPath!!.cubicTo(9.267462f, 15.501098f, 10.848135f, 12.744343f, 13.424265f, 11.251888f)
generalPath!!.cubicTo(16.000395f, 9.759435f, 19.178165f, 9.759435f, 21.754295f, 11.251888f)
generalPath!!.cubicTo(24.330425f, 12.744343f, 25.9111f, 15.501098f, 25.897785f, 18.478292f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.8342246f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_0_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(18.156916f, 7.3966937f)
generalPath!!.cubicTo(12.949325f, 7.3966937f, 8.732368f, 11.613651f, 8.732368f, 16.821241f)
generalPath!!.cubicTo(8.732368f, 18.325216f, 9.152676f, 19.709015f, 9.77954f, 20.971144f)
generalPath!!.cubicTo(11.03192f, 21.432756f, 12.362297f, 21.746826f, 13.774307f, 21.746826f)
generalPath!!.cubicTo(19.945263f, 21.746826f, 24.873589f, 16.88519f, 25.254414f, 10.809698f)
generalPath!!.cubicTo(23.523449f, 8.764167f, 21.044374f, 7.3966937f, 18.156916f, 7.3966937f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 63), center = Offset(14.909142f, 10.512936f), radius = 17.259415f, tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 2.143554210662842
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 47.87369918823242
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 44.08945083618164
        }

        /**
         * Returns a factory that returns instances of this icon on demand.
         *
         * @return Factory that returns instances of this icon on demand.
         */
        fun factory(): AuroraIcon.Factory {
            return object : AuroraIcon.Factory {
                override fun createNewIcon(): AuroraIcon {
                    return system_search()
                }
            }
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

