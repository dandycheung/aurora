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
class drive_harddisk private constructor(var _width: Int, var _height: Int) : AuroraIcon {
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
0.024527400732040405f, 0.0f, 0.0f, 45.6905403137207f,
0.0f, 0.02086758054792881f, 0.0f, 36.15359878540039f,
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
brush = SolidColor(Color(83, 83, 83, 255))
stroke = Stroke(width=2.0f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.28569f, 7.962628f)
generalPath!!.cubicTo(10.66069f, 7.962628f, 10.254441f, 8.252809f, 10.004442f, 8.806381f)
generalPath!!.cubicTo(10.004441f, 8.806381f, 3.5356915f, 25.909939f, 3.5356915f, 25.909939f)
generalPath!!.cubicTo(3.5356915f, 25.909939f, 3.2856915f, 26.581497f, 3.2856915f, 27.691189f)
generalPath!!.cubicTo(3.2856915f, 27.691189f, 3.2856915f, 37.341156f, 3.2856915f, 37.341156f)
generalPath!!.cubicTo(3.2856915f, 38.42377f, 3.943477f, 38.96616f, 4.9419417f, 38.966156f)
generalPath!!.lineTo(43.50444f, 38.966156f)
generalPath!!.cubicTo(44.489292f, 38.966156f, 45.09819f, 38.247974f, 45.09819f, 37.122406f)
generalPath!!.lineTo(45.09819f, 27.472439f)
generalPath!!.cubicTo(45.09819f, 27.472439f, 45.20415f, 26.702015f, 45.00444f, 26.159939f)
generalPath!!.lineTo(38.28569f, 8.962631f)
generalPath!!.cubicTo(38.101166f, 8.450725f, 37.648785f, 7.974533f, 37.16069f, 7.962628f)
generalPath!!.lineTo(11.28569f, 7.962628f)
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
// _0_0_2
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.2735915f, 26.996813f)
generalPath!!.lineTo(4.0381937f, 26.304598f)
generalPath!!.lineTo(41.647884f, 26.367098f)
generalPath!!.lineTo(45.11029f, 26.684395f)
generalPath!!.lineTo(45.11029f, 37.12293f)
generalPath!!.cubicTo(45.11029f, 38.248497f, 44.503273f, 38.96626f, 43.518417f, 38.96626f)
generalPath!!.lineTo(4.9354315f, 38.96626f)
generalPath!!.cubicTo(3.9369667f, 38.96626f, 3.2735915f, 38.424206f, 3.2735915f, 37.341595f)
generalPath!!.lineTo(3.2735915f, 26.996813f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(187, 187, 187, 255), 1.0f to Color(159, 159, 159, 255), start = Offset(7.6046205f, 28.481176f), end = Offset(36.183067f, 40.943935f), tileMode = TileMode.Clamp)
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
// _0_0_3
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(3.5490842f, 25.914404f)
generalPath!!.cubicTo(2.8347986f, 27.37869f, 3.5484686f, 28.30726f, 4.5847983f, 28.30726f)
generalPath!!.cubicTo(4.5847983f, 28.30726f, 43.584797f, 28.30726f, 43.584797f, 28.30726f)
generalPath!!.cubicTo(44.703842f, 28.283451f, 45.430035f, 27.295357f, 45.013367f, 26.164404f)
generalPath!!.lineTo(38.299084f, 8.953705f)
generalPath!!.cubicTo(38.11456f, 8.441797f, 37.64432f, 7.9656057f, 37.156223f, 7.953701f)
generalPath!!.lineTo(11.299083f, 7.953701f)
generalPath!!.cubicTo(10.674083f, 7.953701f, 10.263369f, 8.257274f, 10.01337f, 8.810847f)
generalPath!!.cubicTo(10.01337f, 8.810847f, 3.5490842f, 25.914404f, 3.5490842f, 25.914404f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.radialGradient(0.0f to Color(228, 228, 228, 255), 1.0f to Color(211, 211, 211, 255), center = Offset(-0.44603354f, 0.15188554f), radius = 0.089501575f, tileMode = TileMode.Clamp)
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
// _0_0_4
shape = Outline.Rectangle(rect = Rect(left = 7.857995986938477f, top = 31.174182891845703f, right = 25.482995986938477f, bottom = 36.7366828918457f))
brush = Brush.linearGradient(0.0f to Color(131, 131, 131, 255), 1.0f to Color(187, 187, 187, 0), start = Offset(-0.17586583f, -0.878551f), end = Offset(-0.94451004f, -1.3498125f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.81142855f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_5
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.857995f, 36.73668f)
generalPath!!.cubicTo(7.857995f, 36.73668f, 7.857995f, 32.725197f, 7.857995f, 32.725197f)
generalPath!!.cubicTo(9.693522f, 35.904423f, 16.154486f, 36.73668f, 20.795492f, 36.73668f)
generalPath!!.cubicTo(20.795492f, 36.73668f, 7.857995f, 36.73668f, 7.857995f, 36.73668f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(238, 238, 238, 255), 1.0f to Color(238, 238, 238, 0), start = Offset(12.277412f, 37.20581f), end = Offset(12.221823f, 33.758667f), tileMode = TileMode.Clamp)
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
// _0_0_6
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(44.79616f, 25.628689f)
generalPath!!.cubicTo(44.859684f, 26.878662f, 44.38216f, 27.944529f, 43.474045f, 27.972439f)
generalPath!!.cubicTo(43.474045f, 27.972439f, 5.3553295f, 27.972437f, 5.3553295f, 27.972439f)
generalPath!!.cubicTo(4.0660977f, 27.972439f, 3.4875937f, 27.647491f, 3.271279f, 27.104382f)
generalPath!!.cubicTo(3.3630404f, 28.048714f, 4.0970964f, 28.753689f, 5.3553295f, 28.753689f)
generalPath!!.cubicTo(5.3553295f, 28.753687f, 43.474045f, 28.753689f, 43.474045f, 28.753689f)
generalPath!!.cubicTo(44.550053f, 28.720617f, 45.226852f, 27.329664f, 44.82621f, 25.758898f)
generalPath!!.lineTo(44.79616f, 25.628689f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(255, 255, 255, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.69142854f
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
generalPath!!.moveTo(10.96875f, 10.15625f)
generalPath!!.cubicTo(10.922675f, 10.356571f, 10.78125f, 10.543047f, 10.78125f, 10.75f)
generalPath!!.cubicTo(10.78125f, 11.698605f, 11.37223f, 12.539474f, 12.125f, 13.34375f)
generalPath!!.cubicTo(12.365268f, 13.189675f, 12.490117f, 12.989342f, 12.75f, 12.84375f)
generalPath!!.cubicTo(11.809691f, 12.027746f, 11.196604f, 11.127168f, 10.96875f, 10.15625f)
generalPath!!.close()
generalPath!!.moveTo(37.625f, 10.15625f)
generalPath!!.cubicTo(37.396275f, 11.125866f, 36.78299f, 12.028676f, 35.84375f, 12.84375f)
generalPath!!.cubicTo(36.117893f, 12.997332f, 36.247738f, 13.21199f, 36.5f, 13.375f)
generalPath!!.cubicTo(37.257263f, 12.568344f, 37.8125f, 11.701956f, 37.8125f, 10.75f)
generalPath!!.cubicTo(37.8125f, 10.543047f, 37.670906f, 10.356571f, 37.625f, 10.15625f)
generalPath!!.close()
generalPath!!.moveTo(39.8125f, 18.59375f)
generalPath!!.cubicTo(39.198708f, 22.633862f, 32.513885f, 25.84375f, 24.28125f, 25.84375f)
generalPath!!.cubicTo(16.068996f, 25.843752f, 9.421101f, 22.650965f, 8.78125f, 18.625f)
generalPath!!.cubicTo(8.748893f, 18.822132f, 8.65625f, 19.016882f, 8.65625f, 19.21875f)
generalPath!!.cubicTo(8.65625f, 23.536697f, 15.645354f, 27.062502f, 24.28125f, 27.0625f)
generalPath!!.cubicTo(32.917145f, 27.0625f, 39.9375f, 23.536697f, 39.9375f, 19.21875f)
generalPath!!.cubicTo(39.9375f, 19.005827f, 39.84845f, 18.801394f, 39.8125f, 18.59375f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 65), 1.0f to Color(255, 255, 255, 255), start = Offset(23.688078f, 11.318835f), end = Offset(23.688078f, 26.357183f), tileMode = TileMode.Clamp)
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.08838842809200287f,
0.0f, 1.0f, 0.0f, 0.1767760068178177f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_8
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.57367f, 25.593554f)
generalPath!!.cubicTo(8.575866f, 25.957785f, 8.315223f, 26.295048f, 7.890435f, 26.477634f)
generalPath!!.cubicTo(7.4656477f, 26.660223f, 6.9416537f, 26.660223f, 6.516866f, 26.477634f)
generalPath!!.cubicTo(6.0920787f, 26.295048f, 5.8314357f, 25.957785f, 5.833631f, 25.593554f)
generalPath!!.cubicTo(5.8314357f, 25.229322f, 6.0920787f, 24.89206f, 6.516866f, 24.709473f)
generalPath!!.cubicTo(6.9416537f, 24.526884f, 7.4656477f, 24.526884f, 7.890435f, 24.709473f)
generalPath!!.cubicTo(8.315223f, 24.89206f, 8.575866f, 25.229322f, 8.57367f, 25.593554f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(255, 255, 255, 117))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 1.0f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 33.96704864501953f,
0.0f, 1.0f, 0.0f, 0.08838804066181183f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_9
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(8.57367f, 25.593554f)
generalPath!!.cubicTo(8.575866f, 25.957785f, 8.315223f, 26.295048f, 7.890435f, 26.477634f)
generalPath!!.cubicTo(7.4656477f, 26.660223f, 6.9416537f, 26.660223f, 6.516866f, 26.477634f)
generalPath!!.cubicTo(6.0920787f, 26.295048f, 5.8314357f, 25.957785f, 5.833631f, 25.593554f)
generalPath!!.cubicTo(5.8314357f, 25.229322f, 6.0920787f, 24.89206f, 6.516866f, 24.709473f)
generalPath!!.cubicTo(6.9416537f, 24.526884f, 7.4656477f, 24.526884f, 7.890435f, 24.709473f)
generalPath!!.cubicTo(8.315223f, 24.89206f, 8.575866f, 25.229322f, 8.57367f, 25.593554f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(255, 255, 255, 117))
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
// _0_0_10
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 1.0f to Color(255, 255, 255, 0), start = Offset(12.378357f, 4.433136f), end = Offset(44.0961f, 47.620636f), tileMode = TileMode.Clamp)
stroke = Stroke(width=1.0000002f, cap=StrokeCap.Round, join=StrokeJoin.Round, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(11.642515f, 8.415723f)
generalPath!!.cubicTo(11.040823f, 8.415723f, 10.649724f, 8.695082f, 10.409049f, 9.22801f)
generalPath!!.cubicTo(10.409048f, 9.22801f, 3.994034f, 25.818731f, 3.994034f, 25.818731f)
generalPath!!.cubicTo(3.994034f, 25.818731f, 3.7533574f, 26.465246f, 3.7533574f, 27.533554f)
generalPath!!.cubicTo(3.7533574f, 27.533554f, 3.7533574f, 36.82365f, 3.7533574f, 36.82365f)
generalPath!!.cubicTo(3.7533574f, 38.17839f, 4.1974134f, 38.45055f, 5.3478413f, 38.45055f)
generalPath!!.lineTo(43.034744f, 38.45055f)
generalPath!!.cubicTo(44.357872f, 38.45055f, 44.56906f, 38.13415f, 44.56906f, 36.613056f)
generalPath!!.lineTo(44.56906f, 27.322962f)
generalPath!!.cubicTo(44.56906f, 27.322962f, 44.67107f, 26.58127f, 44.478806f, 26.059408f)
generalPath!!.lineTo(37.885616f, 9.253433f)
generalPath!!.cubicTo(37.707973f, 8.760617f, 37.334965f, 8.427184f, 36.86507f, 8.415723f)
generalPath!!.lineTo(11.642515f, 8.415723f)
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
// _0_0_11
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(40.5f, 31.429167f)
generalPath!!.lineTo(40.5f, 36.4501f)
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
// _0_0_12
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(38.5f, 31.488943f)
generalPath!!.lineTo(38.5f, 36.509876f)
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
// _0_0_13
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(36.5f, 31.488943f)
generalPath!!.lineTo(36.5f, 36.509876f)
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
// _0_0_14
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(34.5f, 31.488943f)
generalPath!!.lineTo(34.5f, 36.509876f)
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
// _0_0_15
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(32.5f, 31.488943f)
generalPath!!.lineTo(32.5f, 36.509876f)
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
// _0_0_16
brush = SolidColor(Color(255, 255, 255, 108))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(30.5f, 31.488943f)
generalPath!!.lineTo(30.5f, 36.509876f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.09714286f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_17
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.5f, 31.479065f)
generalPath!!.lineTo(39.5f, 36.5f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.09714286f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_18
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(37.5f, 31.538841f)
generalPath!!.lineTo(37.5f, 36.559776f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.09714286f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_19
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(35.5f, 31.538841f)
generalPath!!.lineTo(35.5f, 36.559776f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.09714286f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_20
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(33.5f, 31.538841f)
generalPath!!.lineTo(33.5f, 36.559776f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.09714286f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_21
brush = SolidColor(Color(0, 0, 0, 255))
stroke = Stroke(width=1.0000005f, cap=StrokeCap.Square, join=StrokeJoin.Miter, miter=4.0f)
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(31.5f, 31.538841f)
generalPath!!.lineTo(31.5f, 36.559776f)
shape = Outline.Generic(generalPath!!)
drawOutline(outline = shape!!, style = stroke!!, brush=brush!!, alpha = alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.44f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.0f, 0.0f, 0.0f, 0.0f,
0.0f, 1.0f, 0.0f, 0.0f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_22
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(7.875f, 31.1875f)
generalPath!!.lineTo(7.875f, 36.71875f)
generalPath!!.lineTo(20.4375f, 36.71875f)
generalPath!!.lineTo(8.21875f, 36.375f)
generalPath!!.lineTo(7.875f, 31.1875f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = SolidColor(Color(255, 255, 255, 255))
drawOutline(outline = shape!!, style=Fill, brush=brush!!, alpha=alpha)
}
alpha = alphaStack.removeAt(0)
alphaStack.add(0, alpha)
alpha *= 0.20571424f
withTransform({
transform(
Matrix(values=floatArrayOf(
1.037814974784851f, 0.0f, 0.0f, -1.6328779458999634f,
0.0f, 1.0607470273971558f, 0.0f, -2.094625949859619f,
0.0f, 0.0f, 1.0f, 0.0f,
0.0f, 0.0f, 0.0f, 1.0f)
))}){
// _0_0_23
if (generalPath == null) {
   generalPath = Path()
} else {
   generalPath!!.reset()
}
generalPath!!.moveTo(39.875f, 19.5625f)
generalPath!!.cubicTo(39.898838f, 21.958838f, 37.068905f, 24.177746f, 32.456768f, 25.379019f)
generalPath!!.cubicTo(27.844637f, 26.580294f, 22.155363f, 26.580294f, 17.54323f, 25.379019f)
generalPath!!.cubicTo(12.931097f, 24.177746f, 10.101163f, 21.958838f, 10.125f, 19.5625f)
generalPath!!.cubicTo(10.101163f, 17.166162f, 12.931097f, 14.947254f, 17.54323f, 13.745981f)
generalPath!!.cubicTo(22.155363f, 12.544707f, 27.844637f, 12.544707f, 32.456768f, 13.745981f)
generalPath!!.cubicTo(37.068905f, 14.947254f, 39.898838f, 17.166162f, 39.875f, 19.5625f)
generalPath!!.close()
shape = Outline.Generic(generalPath!!)
brush = Brush.linearGradient(0.0f to Color(255, 255, 255, 255), 0.5f to Color(230, 230, 230, 255), 0.75f to Color(255, 255, 255, 255), 0.84166664f to Color(225, 225, 225, 255), 1.0f to Color(255, 255, 255, 255), start = Offset(33.431175f, 31.964777f), end = Offset(21.747974f, 11.780679f), tileMode = TileMode.Clamp)
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
            return 0.0
        }

        /**
         * Returns the Y of the bounding box of the original SVG image.
         *
         * @return The Y of the bounding box of the original SVG image.
         */
        fun getOrigY(): Double {
            return 6.96262788772583
        }

        /**
         * Returns the width of the bounding box of the original SVG image.
         *
         * @return The width of the bounding box of the original SVG image.
         */
        fun getOrigWidth(): Double {
            return 48.0
        }

        /**
         * Returns the height of the bounding box of the original SVG image.
         *
         * @return The height of the bounding box of the original SVG image.
         */
        fun getOrigHeight(): Double {
            return 36.04703140258789
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
            return drive_harddisk(
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
                    return drive_harddisk(getOrigWidth().toInt(), getOrigHeight().toInt())
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

