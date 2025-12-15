package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Vatican City Flag (20x15dp)
 *
 * - ISO Alpha-2: VA
 * - ISO Alpha-3: VAT
 * - ISO Numeric: 336
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.VaticanCity: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vatican City:VA:VAT:336:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8.75f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(14.238f, 7.969f)
                lineTo(14.023f, 7.984f)
                curveTo(14.074f, 8.725f, 14.233f, 9.297f, 14.504f, 9.701f)
                curveTo(14.939f, 10.353f, 15.514f, 10.856f, 15.899f, 10.856f)
                curveTo(15.987f, 10.856f, 16.007f, 10.889f, 15.978f, 10.969f)
                curveTo(15.937f, 11.083f, 15.808f, 11.195f, 15.641f, 11.238f)
                curveTo(15.363f, 11.309f, 14.733f, 11.347f, 13.759f, 11.347f)
                verticalLineTo(11.556f)
                curveTo(14.752f, 11.556f, 15.394f, 11.518f, 15.696f, 11.44f)
                curveTo(15.931f, 11.38f, 16.117f, 11.219f, 16.182f, 11.038f)
                curveTo(16.258f, 10.828f, 16.144f, 10.647f, 15.899f, 10.647f)
                curveTo(15.613f, 10.647f, 15.083f, 10.183f, 14.685f, 9.587f)
                curveTo(14.438f, 9.217f, 14.288f, 8.678f, 14.238f, 7.969f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(13.217f, 7.969f)
                lineTo(13.433f, 7.984f)
                curveTo(13.381f, 8.725f, 13.222f, 9.297f, 12.952f, 9.701f)
                curveTo(12.516f, 10.353f, 11.941f, 10.856f, 11.556f, 10.856f)
                curveTo(11.469f, 10.856f, 11.448f, 10.889f, 11.477f, 10.969f)
                curveTo(11.518f, 11.083f, 11.648f, 11.195f, 11.814f, 11.238f)
                curveTo(12.092f, 11.309f, 12.723f, 11.347f, 13.696f, 11.347f)
                verticalLineTo(11.556f)
                curveTo(12.703f, 11.556f, 12.061f, 11.518f, 11.759f, 11.44f)
                curveTo(11.524f, 11.38f, 11.338f, 11.219f, 11.273f, 11.038f)
                curveTo(11.198f, 10.828f, 11.311f, 10.647f, 11.556f, 10.647f)
                curveTo(11.842f, 10.647f, 12.372f, 10.183f, 12.77f, 9.587f)
                curveTo(13.018f, 9.217f, 13.168f, 8.678f, 13.217f, 7.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.542f, 4.249f)
                lineTo(11.828f, 8.703f)
                curveTo(11.628f, 8.637f, 11.41f, 8.602f, 11.182f, 8.602f)
                curveTo(10.255f, 8.602f, 9.48f, 9.194f, 9.48f, 9.962f)
                curveTo(9.48f, 10.731f, 10.255f, 11.323f, 11.182f, 11.323f)
                curveTo(11.289f, 11.323f, 11.393f, 11.315f, 11.495f, 11.3f)
                curveTo(11.401f, 11.227f, 11.331f, 11.135f, 11.296f, 11.038f)
                curveTo(11.253f, 10.921f, 11.271f, 10.812f, 11.337f, 10.74f)
                curveTo(11.286f, 10.745f, 11.235f, 10.747f, 11.182f, 10.747f)
                curveTo(10.557f, 10.747f, 10.074f, 10.379f, 10.074f, 9.962f)
                curveTo(10.074f, 9.546f, 10.557f, 9.177f, 11.182f, 9.177f)
                curveTo(11.808f, 9.177f, 12.29f, 9.546f, 12.29f, 9.962f)
                curveTo(12.29f, 10.09f, 12.245f, 10.212f, 12.165f, 10.322f)
                curveTo(12.18f, 10.308f, 12.195f, 10.294f, 12.21f, 10.28f)
                curveTo(12.408f, 10.096f, 11.964f, 10.856f, 11.579f, 10.856f)
                curveTo(11.491f, 10.856f, 11.471f, 10.889f, 11.5f, 10.969f)
                curveTo(11.538f, 11.076f, 11.654f, 11.181f, 11.806f, 11.229f)
                curveTo(12.433f, 11.033f, 12.885f, 10.549f, 12.885f, 9.962f)
                curveTo(12.885f, 9.722f, 12.809f, 9.499f, 12.677f, 9.306f)
                lineTo(15.748f, 6.7f)
                lineTo(15.953f, 6.913f)
                lineTo(16.101f, 6.779f)
                lineTo(16.614f, 7.159f)
                lineTo(16.399f, 7.324f)
                lineTo(16.837f, 7.856f)
                lineTo(17.72f, 7.175f)
                lineTo(17.735f, 7.168f)
                lineTo(17.733f, 7.166f)
                lineTo(17.788f, 7.124f)
                lineTo(17.35f, 6.591f)
                lineTo(17.138f, 6.755f)
                lineTo(16.565f, 6.358f)
                lineTo(16.632f, 6.297f)
                lineTo(16.447f, 6.107f)
                lineTo(16.725f, 5.871f)
                lineTo(16.872f, 6.023f)
                lineTo(17.03f, 5.88f)
                lineTo(17.527f, 6.273f)
                lineTo(17.318f, 6.434f)
                lineTo(17.756f, 6.967f)
                lineTo(18.513f, 6.383f)
                lineTo(18.599f, 6.336f)
                lineTo(18.587f, 6.326f)
                lineTo(18.706f, 6.234f)
                lineTo(18.269f, 5.702f)
                lineTo(18.021f, 5.893f)
                lineTo(17.477f, 5.475f)
                lineTo(17.551f, 5.408f)
                lineTo(17.424f, 5.277f)
                lineTo(17.99f, 4.797f)
                lineTo(17.542f, 4.249f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBFBFBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.804f, 9.203f)
                curveTo(9.968f, 9.203f, 10.101f, 9.098f, 10.101f, 8.968f)
                curveTo(10.101f, 8.838f, 9.968f, 8.733f, 9.804f, 8.733f)
                curveTo(9.64f, 8.733f, 9.507f, 8.838f, 9.507f, 8.968f)
                curveTo(9.507f, 9.098f, 9.64f, 9.203f, 9.804f, 9.203f)
                close()
                moveTo(9.912f, 11.349f)
                curveTo(10.076f, 11.349f, 10.21f, 11.243f, 10.21f, 11.113f)
                curveTo(10.21f, 10.983f, 10.076f, 10.878f, 9.912f, 10.878f)
                curveTo(9.748f, 10.878f, 9.615f, 10.983f, 9.615f, 11.113f)
                curveTo(9.615f, 11.243f, 9.748f, 11.349f, 9.912f, 11.349f)
                close()
                moveTo(12.858f, 11.113f)
                curveTo(12.858f, 11.243f, 12.725f, 11.349f, 12.561f, 11.349f)
                curveTo(12.397f, 11.349f, 12.264f, 11.243f, 12.264f, 11.113f)
                curveTo(12.264f, 10.983f, 12.397f, 10.878f, 12.561f, 10.878f)
                curveTo(12.725f, 10.878f, 12.858f, 10.983f, 12.858f, 11.113f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBFBFBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.615f, 9.962f)
                curveTo(14.615f, 9.617f, 14.772f, 9.307f, 15.028f, 9.071f)
                lineTo(11.747f, 6.53f)
                lineTo(11.71f, 6.559f)
                lineTo(11.806f, 6.645f)
                lineTo(11.547f, 6.913f)
                lineTo(11.411f, 6.789f)
                lineTo(10.908f, 7.176f)
                lineTo(11.101f, 7.324f)
                lineTo(10.663f, 7.856f)
                lineTo(9.789f, 7.183f)
                lineTo(9.765f, 7.168f)
                lineTo(9.767f, 7.166f)
                lineTo(9.712f, 7.124f)
                lineTo(10.15f, 6.591f)
                lineTo(10.362f, 6.755f)
                lineTo(10.935f, 6.358f)
                lineTo(10.868f, 6.297f)
                lineTo(11.116f, 6.041f)
                lineTo(10.827f, 5.817f)
                lineTo(10.628f, 6.023f)
                lineTo(10.476f, 5.885f)
                lineTo(9.985f, 6.283f)
                lineTo(10.182f, 6.434f)
                lineTo(9.744f, 6.967f)
                lineTo(9.011f, 6.402f)
                lineTo(8.901f, 6.336f)
                lineTo(8.913f, 6.326f)
                lineTo(8.794f, 6.234f)
                lineTo(9.231f, 5.702f)
                lineTo(9.479f, 5.893f)
                lineTo(10.023f, 5.475f)
                lineTo(9.949f, 5.408f)
                lineTo(10.099f, 5.253f)
                lineTo(9.51f, 4.797f)
                lineTo(9.882f, 4.348f)
                lineTo(15.558f, 8.744f)
                curveTo(15.788f, 8.653f, 16.046f, 8.602f, 16.318f, 8.602f)
                curveTo(17.244f, 8.602f, 18.02f, 9.194f, 18.02f, 9.962f)
                curveTo(18.02f, 10.731f, 17.244f, 11.323f, 16.318f, 11.323f)
                curveTo(16.211f, 11.323f, 16.107f, 11.315f, 16.006f, 11.3f)
                curveTo(16.099f, 11.227f, 16.169f, 11.135f, 16.204f, 11.038f)
                curveTo(16.247f, 10.921f, 16.229f, 10.812f, 16.163f, 10.74f)
                curveTo(16.214f, 10.745f, 16.265f, 10.747f, 16.318f, 10.747f)
                curveTo(16.943f, 10.747f, 17.426f, 10.379f, 17.426f, 9.962f)
                curveTo(17.426f, 9.546f, 16.943f, 9.177f, 16.318f, 9.177f)
                curveTo(15.692f, 9.177f, 15.21f, 9.546f, 15.21f, 9.962f)
                curveTo(15.21f, 10.09f, 15.255f, 10.213f, 15.335f, 10.322f)
                curveTo(15.32f, 10.308f, 15.305f, 10.294f, 15.29f, 10.28f)
                curveTo(15.092f, 10.096f, 15.536f, 10.856f, 15.921f, 10.856f)
                curveTo(16.009f, 10.856f, 16.029f, 10.889f, 16f, 10.969f)
                curveTo(15.962f, 11.076f, 15.846f, 11.181f, 15.694f, 11.229f)
                curveTo(15.067f, 11.033f, 14.615f, 10.549f, 14.615f, 9.962f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.696f, 9.203f)
                curveTo(17.532f, 9.203f, 17.399f, 9.098f, 17.399f, 8.968f)
                curveTo(17.399f, 8.838f, 17.532f, 8.733f, 17.696f, 8.733f)
                curveTo(17.86f, 8.733f, 17.993f, 8.838f, 17.993f, 8.968f)
                curveTo(17.993f, 9.098f, 17.86f, 9.203f, 17.696f, 9.203f)
                close()
                moveTo(17.588f, 11.349f)
                curveTo(17.424f, 11.349f, 17.291f, 11.243f, 17.291f, 11.113f)
                curveTo(17.291f, 10.983f, 17.424f, 10.878f, 17.588f, 10.878f)
                curveTo(17.752f, 10.878f, 17.885f, 10.983f, 17.885f, 11.113f)
                curveTo(17.885f, 11.243f, 17.752f, 11.349f, 17.588f, 11.349f)
                close()
                moveTo(14.642f, 11.113f)
                curveTo(14.642f, 11.243f, 14.775f, 11.349f, 14.939f, 11.349f)
                curveTo(15.103f, 11.349f, 15.236f, 11.243f, 15.236f, 11.113f)
                curveTo(15.236f, 10.983f, 15.103f, 10.878f, 14.939f, 10.878f)
                curveTo(14.775f, 10.878f, 14.642f, 10.983f, 14.642f, 11.113f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.588f, 7.372f)
                curveTo(13.543f, 7.372f, 13.507f, 7.408f, 13.507f, 7.453f)
                verticalLineTo(7.791f)
                horizontalLineTo(13.207f)
                curveTo(13.163f, 7.791f, 13.128f, 7.826f, 13.128f, 7.869f)
                curveTo(13.128f, 7.913f, 13.163f, 7.948f, 13.207f, 7.948f)
                horizontalLineTo(13.507f)
                verticalLineTo(12.419f)
                curveTo(13.507f, 12.464f, 13.543f, 12.5f, 13.588f, 12.5f)
                horizontalLineTo(13.75f)
                curveTo(13.795f, 12.5f, 13.831f, 12.464f, 13.831f, 12.419f)
                verticalLineTo(7.948f)
                horizontalLineTo(14.293f)
                curveTo(14.337f, 7.948f, 14.372f, 7.913f, 14.372f, 7.869f)
                curveTo(14.372f, 7.826f, 14.337f, 7.791f, 14.293f, 7.791f)
                horizontalLineTo(13.831f)
                verticalLineTo(7.453f)
                curveTo(13.831f, 7.408f, 13.795f, 7.372f, 13.75f, 7.372f)
                horizontalLineTo(13.588f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.472f, 4.746f)
                lineTo(10.604f, 4.837f)
                curveTo(10.912f, 4.416f, 11.19f, 4.331f, 11.472f, 4.552f)
                curveTo(11.959f, 4.934f, 12.001f, 5.864f, 11.48f, 6.176f)
                curveTo(10.859f, 6.548f, 10.544f, 7.273f, 10.819f, 7.667f)
                curveTo(11.074f, 8.031f, 11.687f, 7.893f, 12.292f, 7.436f)
                curveTo(12.399f, 7.355f, 12.502f, 7.268f, 12.598f, 7.177f)
                lineTo(12.47f, 7.079f)
                curveTo(12.382f, 7.161f, 12.29f, 7.239f, 12.192f, 7.312f)
                curveTo(11.652f, 7.72f, 11.134f, 7.837f, 10.954f, 7.579f)
                curveTo(10.739f, 7.272f, 11.014f, 6.64f, 11.566f, 6.31f)
                curveTo(12.19f, 5.936f, 12.142f, 4.875f, 11.574f, 4.43f)
                curveTo(11.208f, 4.143f, 10.828f, 4.259f, 10.472f, 4.746f)
                close()
                moveTo(12.851f, 6.653f)
                lineTo(12.983f, 6.745f)
                curveTo(13.213f, 6.435f, 13.37f, 6.099f, 13.422f, 5.769f)
                lineTo(13.262f, 5.745f)
                curveTo(13.214f, 6.05f, 13.067f, 6.362f, 12.851f, 6.653f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.043f, 4.746f)
                lineTo(16.911f, 4.837f)
                curveTo(16.603f, 4.416f, 16.325f, 4.331f, 16.043f, 4.552f)
                curveTo(15.556f, 4.934f, 15.514f, 5.864f, 16.035f, 6.176f)
                curveTo(16.656f, 6.548f, 16.971f, 7.273f, 16.696f, 7.667f)
                curveTo(16.441f, 8.031f, 15.828f, 7.893f, 15.223f, 7.436f)
                curveTo(15.116f, 7.355f, 15.013f, 7.268f, 14.917f, 7.177f)
                lineTo(15.045f, 7.079f)
                curveTo(15.132f, 7.161f, 15.226f, 7.239f, 15.323f, 7.312f)
                curveTo(15.863f, 7.72f, 16.381f, 7.837f, 16.561f, 7.579f)
                curveTo(16.776f, 7.272f, 16.501f, 6.64f, 15.95f, 6.31f)
                curveTo(15.325f, 5.936f, 15.373f, 4.875f, 15.941f, 4.43f)
                curveTo(16.307f, 4.143f, 16.687f, 4.259f, 17.043f, 4.746f)
                close()
                moveTo(14.663f, 6.653f)
                lineTo(14.531f, 6.745f)
                curveTo(14.302f, 6.435f, 14.145f, 6.099f, 14.093f, 5.769f)
                lineTo(14.253f, 5.745f)
                curveTo(14.301f, 6.05f, 14.448f, 6.362f, 14.663f, 6.653f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.669f, 12.51f)
                curveTo(13.848f, 12.51f, 13.993f, 12.438f, 13.993f, 12.348f)
                curveTo(13.993f, 12.259f, 13.848f, 12.186f, 13.669f, 12.186f)
                curveTo(13.49f, 12.186f, 13.345f, 12.259f, 13.345f, 12.348f)
                curveTo(13.345f, 12.438f, 13.49f, 12.51f, 13.669f, 12.51f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.615f, 5.762f)
                curveTo(14.242f, 5.762f, 14.75f, 5.677f, 14.75f, 5.573f)
                curveTo(14.75f, 5.468f, 14.242f, 5.384f, 13.615f, 5.384f)
                curveTo(12.988f, 5.384f, 12.48f, 5.468f, 12.48f, 5.573f)
                curveTo(12.48f, 5.677f, 12.988f, 5.762f, 13.615f, 5.762f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.679f, 1.274f)
                horizontalLineTo(13.517f)
                verticalLineTo(1.461f)
                horizontalLineTo(13.363f)
                verticalLineTo(1.618f)
                horizontalLineTo(13.517f)
                verticalLineTo(2.076f)
                horizontalLineTo(13.679f)
                verticalLineTo(1.618f)
                horizontalLineTo(13.866f)
                verticalLineTo(1.461f)
                horizontalLineTo(13.679f)
                verticalLineTo(1.274f)
                close()
                moveTo(12.459f, 3.535f)
                lineTo(12.387f, 3.414f)
                curveTo(12.427f, 3.397f, 12.467f, 3.381f, 12.508f, 3.366f)
                lineTo(12.297f, 2.904f)
                lineTo(12.446f, 2.84f)
                lineTo(12.663f, 3.317f)
                curveTo(12.709f, 3.303f, 12.756f, 3.291f, 12.804f, 3.28f)
                curveTo(12.771f, 3.242f, 12.75f, 3.191f, 12.75f, 3.134f)
                curveTo(12.75f, 3.018f, 12.835f, 2.924f, 12.939f, 2.924f)
                curveTo(13.044f, 2.924f, 13.128f, 3.018f, 13.128f, 3.134f)
                curveTo(13.128f, 3.166f, 13.122f, 3.197f, 13.11f, 3.225f)
                curveTo(13.238f, 3.208f, 13.372f, 3.197f, 13.512f, 3.193f)
                verticalLineTo(3.016f)
                horizontalLineTo(13.309f)
                verticalLineTo(2.889f)
                horizontalLineTo(13.512f)
                verticalLineTo(2.739f)
                horizontalLineTo(13.726f)
                verticalLineTo(2.889f)
                horizontalLineTo(13.974f)
                verticalLineTo(3.016f)
                horizontalLineTo(13.726f)
                verticalLineTo(3.192f)
                curveTo(13.886f, 3.195f, 14.035f, 3.206f, 14.174f, 3.225f)
                curveTo(14.162f, 3.198f, 14.155f, 3.167f, 14.155f, 3.134f)
                curveTo(14.155f, 3.018f, 14.24f, 2.924f, 14.345f, 2.924f)
                curveTo(14.449f, 2.924f, 14.534f, 3.018f, 14.534f, 3.134f)
                curveTo(14.534f, 3.193f, 14.512f, 3.246f, 14.476f, 3.284f)
                curveTo(14.536f, 3.3f, 14.594f, 3.318f, 14.65f, 3.338f)
                lineTo(14.805f, 2.997f)
                lineTo(14.954f, 3.061f)
                lineTo(14.8f, 3.398f)
                curveTo(14.812f, 3.404f, 14.824f, 3.41f, 14.836f, 3.416f)
                lineTo(14.754f, 3.533f)
                lineTo(14.741f, 3.527f)
                lineTo(14.716f, 3.582f)
                lineTo(14.568f, 3.518f)
                lineTo(14.592f, 3.465f)
                curveTo(14.355f, 3.38f, 14.067f, 3.334f, 13.726f, 3.328f)
                verticalLineTo(3.384f)
                horizontalLineTo(13.512f)
                verticalLineTo(3.329f)
                curveTo(13.108f, 3.342f, 12.757f, 3.411f, 12.459f, 3.535f)
                close()
                moveTo(12.387f, 3.675f)
                lineTo(12.425f, 3.739f)
                lineTo(12.297f, 3.793f)
                lineTo(12.508f, 4.256f)
                curveTo(12.467f, 4.271f, 12.427f, 4.286f, 12.387f, 4.303f)
                lineTo(12.459f, 4.425f)
                curveTo(12.757f, 4.3f, 13.108f, 4.231f, 13.512f, 4.219f)
                verticalLineTo(4.274f)
                horizontalLineTo(13.726f)
                verticalLineTo(4.218f)
                curveTo(14.067f, 4.224f, 14.355f, 4.27f, 14.592f, 4.355f)
                lineTo(14.568f, 4.408f)
                lineTo(14.716f, 4.471f)
                lineTo(14.741f, 4.417f)
                lineTo(14.754f, 4.423f)
                lineTo(14.836f, 4.305f)
                curveTo(14.824f, 4.299f, 14.812f, 4.294f, 14.8f, 4.288f)
                lineTo(14.954f, 3.95f)
                lineTo(14.805f, 3.887f)
                lineTo(14.65f, 4.227f)
                curveTo(14.594f, 4.208f, 14.536f, 4.19f, 14.476f, 4.174f)
                curveTo(14.512f, 4.136f, 14.534f, 4.082f, 14.534f, 4.023f)
                curveTo(14.534f, 3.908f, 14.449f, 3.814f, 14.345f, 3.814f)
                curveTo(14.24f, 3.814f, 14.155f, 3.908f, 14.155f, 4.023f)
                curveTo(14.155f, 4.056f, 14.162f, 4.087f, 14.174f, 4.115f)
                curveTo(14.035f, 4.095f, 13.886f, 4.084f, 13.726f, 4.081f)
                verticalLineTo(3.905f)
                horizontalLineTo(13.974f)
                verticalLineTo(3.779f)
                horizontalLineTo(13.726f)
                verticalLineTo(3.629f)
                horizontalLineTo(13.512f)
                verticalLineTo(3.779f)
                horizontalLineTo(13.309f)
                verticalLineTo(3.905f)
                horizontalLineTo(13.512f)
                verticalLineTo(4.083f)
                curveTo(13.372f, 4.087f, 13.238f, 4.097f, 13.11f, 4.114f)
                curveTo(13.122f, 4.087f, 13.128f, 4.056f, 13.128f, 4.023f)
                curveTo(13.128f, 3.908f, 13.044f, 3.814f, 12.939f, 3.814f)
                curveTo(12.835f, 3.814f, 12.75f, 3.908f, 12.75f, 4.023f)
                curveTo(12.75f, 4.08f, 12.771f, 4.132f, 12.804f, 4.17f)
                curveTo(12.756f, 4.181f, 12.709f, 4.193f, 12.663f, 4.206f)
                lineTo(12.474f, 3.791f)
                curveTo(12.801f, 3.657f, 13.191f, 3.589f, 13.646f, 3.589f)
                curveTo(14.106f, 3.589f, 14.475f, 3.658f, 14.754f, 3.795f)
                lineTo(14.836f, 3.677f)
                curveTo(14.529f, 3.527f, 14.133f, 3.453f, 13.646f, 3.453f)
                curveTo(13.161f, 3.453f, 12.741f, 3.527f, 12.387f, 3.675f)
                close()
                moveTo(12.387f, 4.565f)
                lineTo(12.425f, 4.628f)
                lineTo(12.297f, 4.683f)
                lineTo(12.508f, 5.146f)
                curveTo(12.467f, 5.16f, 12.427f, 5.176f, 12.387f, 5.193f)
                lineTo(12.459f, 5.315f)
                curveTo(12.757f, 5.19f, 13.108f, 5.121f, 13.512f, 5.109f)
                verticalLineTo(5.163f)
                horizontalLineTo(13.726f)
                verticalLineTo(5.107f)
                curveTo(14.067f, 5.113f, 14.355f, 5.159f, 14.592f, 5.244f)
                lineTo(14.568f, 5.297f)
                lineTo(14.716f, 5.361f)
                lineTo(14.741f, 5.306f)
                lineTo(14.754f, 5.312f)
                lineTo(14.836f, 5.195f)
                curveTo(14.824f, 5.189f, 14.812f, 5.183f, 14.8f, 5.178f)
                lineTo(14.954f, 4.84f)
                lineTo(14.805f, 4.776f)
                lineTo(14.65f, 5.117f)
                curveTo(14.594f, 5.097f, 14.536f, 5.079f, 14.476f, 5.064f)
                curveTo(14.512f, 5.025f, 14.534f, 4.972f, 14.534f, 4.913f)
                curveTo(14.534f, 4.797f, 14.449f, 4.703f, 14.345f, 4.703f)
                curveTo(14.24f, 4.703f, 14.155f, 4.797f, 14.155f, 4.913f)
                curveTo(14.155f, 4.946f, 14.162f, 4.977f, 14.174f, 5.004f)
                curveTo(14.035f, 4.985f, 13.886f, 4.974f, 13.726f, 4.971f)
                verticalLineTo(4.795f)
                horizontalLineTo(13.974f)
                verticalLineTo(4.669f)
                horizontalLineTo(13.726f)
                verticalLineTo(4.518f)
                horizontalLineTo(13.512f)
                verticalLineTo(4.669f)
                horizontalLineTo(13.309f)
                verticalLineTo(4.795f)
                horizontalLineTo(13.512f)
                verticalLineTo(4.972f)
                curveTo(13.372f, 4.976f, 13.238f, 4.987f, 13.11f, 5.004f)
                curveTo(13.122f, 4.976f, 13.128f, 4.945f, 13.128f, 4.913f)
                curveTo(13.128f, 4.797f, 13.044f, 4.703f, 12.939f, 4.703f)
                curveTo(12.835f, 4.703f, 12.75f, 4.797f, 12.75f, 4.913f)
                curveTo(12.75f, 4.97f, 12.771f, 5.021f, 12.804f, 5.059f)
                curveTo(12.756f, 5.07f, 12.709f, 5.082f, 12.663f, 5.096f)
                lineTo(12.474f, 4.681f)
                curveTo(12.801f, 4.546f, 13.191f, 4.479f, 13.646f, 4.479f)
                curveTo(14.106f, 4.479f, 14.475f, 4.548f, 14.754f, 4.684f)
                lineTo(14.836f, 4.567f)
                curveTo(14.529f, 4.417f, 14.133f, 4.342f, 13.646f, 4.342f)
                curveTo(13.161f, 4.342f, 12.741f, 4.416f, 12.387f, 4.565f)
                close()
                moveTo(12.387f, 5.454f)
                lineTo(12.459f, 5.576f)
                curveTo(12.79f, 5.438f, 13.185f, 5.368f, 13.646f, 5.368f)
                curveTo(14.106f, 5.368f, 14.475f, 5.437f, 14.754f, 5.574f)
                lineTo(14.836f, 5.456f)
                curveTo(14.529f, 5.306f, 14.133f, 5.232f, 13.646f, 5.232f)
                curveTo(13.161f, 5.232f, 12.741f, 5.306f, 12.387f, 5.454f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VaticanCityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.VaticanCity,
            contentDescription = "Vatican City Flag"
        )
    }
}
