package flagpack.icons.large

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
 * US Virgin Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: VI
 * - ISO Alpha-3: VIR
 * - ISO Numeric: 850
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.UsVirginIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "US Virgin Islands:VI:VIR:850:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.603f, 8.215f)
                curveTo(17.844f, 8.353f, 17.99f, 8.705f, 17.99f, 8.705f)
                horizontalLineTo(13.902f)
                lineTo(14.184f, 8.215f)
                curveTo(14.184f, 8.215f, 13.902f, 8.087f, 14.043f, 8.087f)
                curveTo(14.186f, 8.087f, 14.59f, 7.519f, 14.59f, 7.519f)
                horizontalLineTo(14.422f)
                curveTo(14.422f, 7.519f, 14.335f, 7.377f, 14.59f, 7.377f)
                curveTo(14.846f, 7.377f, 15.051f, 6.463f, 15.051f, 6.463f)
                curveTo(15.051f, 6.463f, 15.219f, 6.035f, 14.808f, 5.927f)
                curveTo(14.397f, 5.819f, 13.902f, 6.285f, 13.902f, 6.285f)
                curveTo(13.902f, 6.285f, 14.022f, 5.54f, 14.184f, 5.378f)
                curveTo(14.259f, 5.303f, 14.399f, 5.291f, 14.527f, 5.28f)
                curveTo(14.675f, 5.268f, 14.808f, 5.257f, 14.808f, 5.152f)
                curveTo(14.808f, 4.956f, 15.289f, 4.803f, 16.075f, 4.803f)
                curveTo(16.861f, 4.803f, 17.147f, 5.742f, 17.147f, 5.927f)
                curveTo(17.147f, 6.111f, 17.416f, 7.092f, 17.416f, 7.092f)
                curveTo(17.416f, 7.092f, 17.147f, 7.092f, 17.147f, 7.219f)
                curveTo(17.147f, 7.345f, 17.99f, 7.892f, 17.99f, 7.892f)
                curveTo(17.99f, 7.892f, 17.361f, 8.077f, 17.603f, 8.215f)
                close()
                moveTo(2.777f, 4.87f)
                curveTo(3.091f, 4.735f, 6.278f, 5.685f, 8.666f, 6.396f)
                lineTo(8.666f, 6.396f)
                lineTo(8.666f, 6.396f)
                lineTo(8.666f, 6.396f)
                curveTo(10.039f, 6.805f, 11.147f, 7.136f, 11.293f, 7.136f)
                curveTo(11.691f, 7.136f, 12.441f, 8.101f, 12.066f, 8.507f)
                curveTo(11.691f, 8.913f, 11.564f, 9.151f, 11.815f, 9.151f)
                curveTo(12.066f, 9.151f, 13.332f, 8.822f, 13.332f, 8.822f)
                verticalLineTo(12.594f)
                curveTo(13.332f, 12.594f, 12.119f, 12.882f, 11.815f, 12.594f)
                curveTo(11.668f, 12.455f, 11.444f, 12.446f, 11.252f, 12.439f)
                curveTo(11.047f, 12.431f, 10.879f, 12.425f, 10.879f, 12.263f)
                curveTo(10.879f, 11.95f, 10.18f, 11.9f, 10.18f, 11.9f)
                curveTo(10.18f, 11.9f, 9.534f, 11.687f, 9.534f, 11.486f)
                curveTo(9.534f, 11.286f, 9.11f, 10.719f, 9.11f, 10.719f)
                curveTo(9.11f, 10.719f, 7.498f, 9.806f, 6.126f, 8.804f)
                curveTo(5.849f, 8.601f, 5.576f, 8.411f, 5.313f, 8.228f)
                curveTo(4.278f, 7.507f, 3.425f, 6.912f, 3.271f, 6.223f)
                curveTo(2.555f, 5.514f, 2.283f, 5.082f, 2.777f, 4.87f)
                close()
                moveTo(12.844f, 12.832f)
                curveTo(12.844f, 12.832f, 12.301f, 13.206f, 11.7f, 14.208f)
                curveTo(11.405f, 14.701f, 11.381f, 15.135f, 11.363f, 15.449f)
                curveTo(11.346f, 15.773f, 11.335f, 15.969f, 11.039f, 15.969f)
                curveTo(10.694f, 15.969f, 10.443f, 16.044f, 10.239f, 16.105f)
                curveTo(10.099f, 16.146f, 9.982f, 16.181f, 9.87f, 16.181f)
                curveTo(9.596f, 16.181f, 9.069f, 17.216f, 9.333f, 17.456f)
                curveTo(9.596f, 17.695f, 10.699f, 18.077f, 10.699f, 17.456f)
                curveTo(10.699f, 16.835f, 10.995f, 16.482f, 11.534f, 16.482f)
                curveTo(12.073f, 16.482f, 13.036f, 16.125f, 13.036f, 15.342f)
                curveTo(13.036f, 14.559f, 14.087f, 14.615f, 14.087f, 14.615f)
                lineTo(12.844f, 12.832f)
                close()
                moveTo(23.561f, 6.396f)
                curveTo(25.949f, 5.685f, 29.136f, 4.735f, 29.45f, 4.87f)
                curveTo(29.944f, 5.082f, 29.672f, 5.514f, 28.956f, 6.223f)
                curveTo(28.802f, 6.912f, 27.949f, 7.507f, 26.913f, 8.228f)
                curveTo(26.651f, 8.411f, 26.378f, 8.601f, 26.101f, 8.804f)
                curveTo(24.729f, 9.806f, 23.117f, 10.719f, 23.117f, 10.719f)
                curveTo(23.117f, 10.719f, 22.693f, 11.286f, 22.693f, 11.486f)
                curveTo(22.693f, 11.687f, 22.047f, 11.9f, 22.047f, 11.9f)
                curveTo(22.047f, 11.9f, 21.348f, 11.95f, 21.348f, 12.263f)
                curveTo(21.348f, 12.425f, 21.18f, 12.431f, 20.975f, 12.439f)
                curveTo(20.783f, 12.446f, 20.559f, 12.455f, 20.412f, 12.594f)
                curveTo(20.108f, 12.882f, 18.895f, 12.594f, 18.895f, 12.594f)
                verticalLineTo(8.822f)
                curveTo(18.895f, 8.822f, 20.161f, 9.151f, 20.412f, 9.151f)
                curveTo(20.663f, 9.151f, 20.536f, 8.913f, 20.161f, 8.507f)
                curveTo(19.786f, 8.101f, 20.536f, 7.136f, 20.934f, 7.136f)
                curveTo(21.08f, 7.136f, 22.188f, 6.805f, 23.561f, 6.396f)
                lineTo(23.561f, 6.396f)
                lineTo(23.561f, 6.396f)
                lineTo(23.561f, 6.396f)
                close()
                moveTo(19.383f, 12.832f)
                curveTo(19.383f, 12.832f, 19.926f, 13.206f, 20.527f, 14.208f)
                curveTo(20.823f, 14.701f, 20.846f, 15.135f, 20.864f, 15.449f)
                curveTo(20.881f, 15.773f, 20.892f, 15.969f, 21.188f, 15.969f)
                curveTo(21.533f, 15.969f, 21.784f, 16.044f, 21.987f, 16.105f)
                curveTo(22.127f, 16.146f, 22.245f, 16.181f, 22.357f, 16.181f)
                curveTo(22.631f, 16.181f, 23.157f, 17.216f, 22.894f, 17.456f)
                curveTo(22.631f, 17.695f, 21.528f, 18.077f, 21.528f, 17.456f)
                curveTo(21.528f, 16.835f, 21.232f, 16.482f, 20.693f, 16.482f)
                curveTo(20.154f, 16.482f, 19.191f, 16.125f, 19.191f, 15.342f)
                curveTo(19.191f, 14.559f, 18.14f, 14.615f, 18.14f, 14.615f)
                lineTo(19.383f, 12.832f)
                close()
                moveTo(13.541f, 15.442f)
                curveTo(13.541f, 15.097f, 14.15f, 14.837f, 14.15f, 14.837f)
                lineTo(15.985f, 14.063f)
                curveTo(15.985f, 14.063f, 15.995f, 14.238f, 16.009f, 14.528f)
                curveTo(16.023f, 14.238f, 16.032f, 14.063f, 16.032f, 14.063f)
                lineTo(17.867f, 14.837f)
                curveTo(17.867f, 14.837f, 18.476f, 15.097f, 18.476f, 15.442f)
                curveTo(18.476f, 15.615f, 18.736f, 15.921f, 18.994f, 16.226f)
                lineTo(18.994f, 16.226f)
                curveTo(19.252f, 16.529f, 19.509f, 16.832f, 19.509f, 17.003f)
                curveTo(19.509f, 17.304f, 18.813f, 17.981f, 18.392f, 18.389f)
                curveTo(18.335f, 18.445f, 18.283f, 18.496f, 18.238f, 18.54f)
                curveTo(18.142f, 18.635f, 18.038f, 18.753f, 17.93f, 18.876f)
                curveTo(17.621f, 19.226f, 17.279f, 19.614f, 16.992f, 19.614f)
                curveTo(16.79f, 19.614f, 16.627f, 19.754f, 16.47f, 19.889f)
                curveTo(16.327f, 20.013f, 16.189f, 20.132f, 16.032f, 20.132f)
                curveTo(16.024f, 20.132f, 16.016f, 20.128f, 16.009f, 20.12f)
                curveTo(16.001f, 20.128f, 15.993f, 20.132f, 15.985f, 20.132f)
                curveTo(15.828f, 20.132f, 15.691f, 20.013f, 15.547f, 19.889f)
                curveTo(15.391f, 19.754f, 15.227f, 19.614f, 15.026f, 19.614f)
                curveTo(14.738f, 19.614f, 14.396f, 19.226f, 14.087f, 18.876f)
                curveTo(13.979f, 18.753f, 13.875f, 18.635f, 13.779f, 18.54f)
                curveTo(13.734f, 18.496f, 13.682f, 18.445f, 13.625f, 18.389f)
                lineTo(13.625f, 18.389f)
                curveTo(13.205f, 17.981f, 12.508f, 17.304f, 12.508f, 17.003f)
                curveTo(12.508f, 16.832f, 12.765f, 16.529f, 13.023f, 16.226f)
                curveTo(13.282f, 15.921f, 13.541f, 15.615f, 13.541f, 15.442f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF46A000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.01f, 10.673f)
                curveTo(7.05f, 11.136f, 7.182f, 11.409f, 7.182f, 11.409f)
                curveTo(7.182f, 11.409f, 7.413f, 11.773f, 7.545f, 11.777f)
                curveTo(7.612f, 11.945f, 7.686f, 12.116f, 7.764f, 12.291f)
                curveTo(8.124f, 13.252f, 8.615f, 14.513f, 9.118f, 15.662f)
                curveTo(9.086f, 15.638f, 9.039f, 15.611f, 8.976f, 15.581f)
                curveTo(8.555f, 15.384f, 8.253f, 15.362f, 8.253f, 15.362f)
                curveTo(8.253f, 15.362f, 7.689f, 15.386f, 7.747f, 15.546f)
                curveTo(7.806f, 15.706f, 8.505f, 16.053f, 8.789f, 15.95f)
                curveTo(8.82f, 15.938f, 8.852f, 15.927f, 8.884f, 15.916f)
                curveTo(9.014f, 15.871f, 9.135f, 15.83f, 9.168f, 15.776f)
                curveTo(9.235f, 15.927f, 9.302f, 16.076f, 9.369f, 16.223f)
                curveTo(8.949f, 16.027f, 8.648f, 16.004f, 8.648f, 16.004f)
                curveTo(8.648f, 16.004f, 8.084f, 16.028f, 8.143f, 16.188f)
                curveTo(8.201f, 16.348f, 8.9f, 16.696f, 9.184f, 16.592f)
                curveTo(9.215f, 16.581f, 9.248f, 16.57f, 9.279f, 16.559f)
                curveTo(9.358f, 16.532f, 9.433f, 16.506f, 9.487f, 16.478f)
                curveTo(9.994f, 17.558f, 10.483f, 18.421f, 10.832f, 18.639f)
                horizontalLineTo(11.537f)
                curveTo(11.537f, 18.639f, 10.928f, 17.778f, 10.16f, 16.573f)
                curveTo(10.392f, 16.409f, 10.714f, 16.047f, 10.714f, 15.819f)
                curveTo(10.714f, 15.785f, 10.715f, 15.751f, 10.715f, 15.718f)
                curveTo(10.719f, 15.452f, 10.723f, 15.225f, 10.431f, 15.517f)
                curveTo(10.102f, 15.845f, 9.978f, 16.121f, 9.978f, 16.121f)
                curveTo(9.978f, 16.121f, 9.963f, 16.168f, 9.946f, 16.235f)
                curveTo(9.885f, 16.136f, 9.822f, 16.036f, 9.76f, 15.934f)
                curveTo(9.991f, 15.772f, 10.319f, 15.406f, 10.319f, 15.176f)
                curveTo(10.319f, 15.142f, 10.319f, 15.108f, 10.32f, 15.075f)
                curveTo(10.324f, 14.809f, 10.328f, 14.583f, 10.036f, 14.874f)
                curveTo(9.707f, 15.202f, 9.583f, 15.478f, 9.583f, 15.478f)
                curveTo(9.583f, 15.478f, 9.568f, 15.526f, 9.551f, 15.594f)
                curveTo(9.462f, 15.448f, 9.373f, 15.3f, 9.283f, 15.149f)
                curveTo(9.51f, 15.03f, 9.923f, 14.599f, 9.923f, 14.341f)
                curveTo(9.923f, 14.307f, 9.924f, 14.273f, 9.924f, 14.24f)
                curveTo(9.929f, 13.974f, 9.933f, 13.747f, 9.641f, 14.039f)
                curveTo(9.312f, 14.367f, 9.187f, 14.643f, 9.187f, 14.643f)
                curveTo(9.187f, 14.643f, 9.15f, 14.76f, 9.128f, 14.886f)
                curveTo(9.011f, 14.686f, 8.895f, 14.484f, 8.781f, 14.281f)
                curveTo(8.785f, 14.281f, 8.788f, 14.281f, 8.792f, 14.281f)
                curveTo(8.962f, 14.281f, 9.528f, 13.743f, 9.528f, 13.441f)
                curveTo(9.528f, 13.407f, 9.529f, 13.373f, 9.529f, 13.34f)
                curveTo(9.534f, 13.074f, 9.537f, 12.848f, 9.245f, 13.139f)
                curveTo(8.917f, 13.467f, 8.792f, 13.743f, 8.792f, 13.743f)
                curveTo(8.792f, 13.743f, 8.708f, 14.008f, 8.717f, 14.166f)
                curveTo(8.56f, 13.883f, 8.407f, 13.599f, 8.261f, 13.317f)
                lineTo(8.265f, 13.317f)
                curveTo(8.435f, 13.317f, 9.001f, 12.779f, 9.001f, 12.477f)
                curveTo(9.001f, 12.444f, 9.002f, 12.41f, 9.002f, 12.376f)
                curveTo(9.007f, 12.11f, 9.01f, 11.884f, 8.718f, 12.175f)
                curveTo(8.39f, 12.503f, 8.265f, 12.779f, 8.265f, 12.779f)
                curveTo(8.265f, 12.779f, 8.19f, 13.018f, 8.189f, 13.177f)
                curveTo(8.037f, 12.877f, 7.894f, 12.58f, 7.764f, 12.291f)
                curveTo(7.695f, 12.106f, 7.63f, 11.932f, 7.571f, 11.772f)
                curveTo(7.579f, 11.769f, 7.587f, 11.763f, 7.594f, 11.755f)
                curveTo(7.703f, 11.624f, 7.655f, 10.845f, 7.423f, 10.651f)
                curveTo(7.398f, 10.629f, 7.372f, 10.607f, 7.347f, 10.585f)
                curveTo(7.146f, 10.411f, 6.975f, 10.262f, 7.01f, 10.673f)
                close()
                moveTo(7.792f, 11.857f)
                curveTo(7.792f, 11.857f, 7.815f, 11.555f, 8.012f, 11.134f)
                curveTo(8.186f, 10.76f, 8.26f, 10.974f, 8.347f, 11.226f)
                curveTo(8.358f, 11.257f, 8.369f, 11.29f, 8.381f, 11.321f)
                curveTo(8.484f, 11.605f, 8.136f, 12.304f, 7.976f, 12.362f)
                curveTo(7.816f, 12.421f, 7.792f, 11.857f, 7.792f, 11.857f)
                close()
                moveTo(8.58f, 14.746f)
                curveTo(8.16f, 14.549f, 7.858f, 14.526f, 7.858f, 14.526f)
                curveTo(7.858f, 14.526f, 7.294f, 14.55f, 7.352f, 14.71f)
                curveTo(7.41f, 14.87f, 8.109f, 15.218f, 8.393f, 15.115f)
                curveTo(8.425f, 15.103f, 8.457f, 15.092f, 8.489f, 15.081f)
                curveTo(8.74f, 14.994f, 8.954f, 14.92f, 8.58f, 14.746f)
                close()
                moveTo(7.462f, 13.627f)
                curveTo(7.462f, 13.627f, 7.764f, 13.649f, 8.185f, 13.846f)
                curveTo(8.559f, 14.021f, 8.345f, 14.095f, 8.093f, 14.181f)
                curveTo(8.062f, 14.192f, 8.03f, 14.203f, 7.998f, 14.215f)
                curveTo(7.714f, 14.318f, 7.015f, 13.971f, 6.957f, 13.811f)
                curveTo(6.899f, 13.651f, 7.462f, 13.627f, 7.462f, 13.627f)
                close()
                moveTo(7.856f, 12.946f)
                curveTo(7.435f, 12.75f, 7.133f, 12.727f, 7.133f, 12.727f)
                curveTo(7.133f, 12.727f, 6.569f, 12.751f, 6.627f, 12.911f)
                curveTo(6.686f, 13.071f, 7.385f, 13.419f, 7.669f, 13.315f)
                curveTo(7.7f, 13.304f, 7.732f, 13.293f, 7.764f, 13.282f)
                lineTo(7.764f, 13.282f)
                lineTo(7.764f, 13.282f)
                curveTo(8.015f, 13.195f, 8.229f, 13.121f, 7.856f, 12.946f)
                close()
                moveTo(6.975f, 11.645f)
                curveTo(6.975f, 11.645f, 7.251f, 11.769f, 7.579f, 12.098f)
                curveTo(7.871f, 12.39f, 7.644f, 12.386f, 7.378f, 12.382f)
                horizontalLineTo(7.378f)
                curveTo(7.345f, 12.381f, 7.311f, 12.381f, 7.277f, 12.381f)
                curveTo(6.975f, 12.381f, 6.437f, 11.815f, 6.437f, 11.645f)
                curveTo(6.437f, 11.474f, 6.975f, 11.645f, 6.975f, 11.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0093E1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(28.692f, 10.339f)
                horizontalLineTo(26.554f)
                curveTo(26.554f, 10.339f, 27.007f, 10.339f, 27.057f, 10.776f)
                curveTo(27.057f, 10.776f, 27.068f, 14.47f, 27.057f, 14.76f)
                curveTo(27.047f, 15.051f, 26.554f, 15.149f, 26.554f, 15.149f)
                curveTo(26.554f, 15.149f, 29.147f, 15.157f, 28.692f, 15.149f)
                curveTo(28.236f, 15.142f, 28.136f, 14.76f, 28.136f, 14.76f)
                verticalLineTo(10.776f)
                curveTo(28.136f, 10.439f, 28.692f, 10.339f, 28.692f, 10.339f)
                close()
                moveTo(4.565f, 14.853f)
                curveTo(4.323f, 14.229f, 2.83f, 10.404f, 2.83f, 10.404f)
                horizontalLineTo(4.308f)
                curveTo(4.052f, 10.404f, 3.956f, 10.731f, 3.956f, 10.731f)
                lineTo(4.992f, 13.684f)
                curveTo(4.992f, 13.684f, 5.994f, 11.273f, 5.994f, 10.846f)
                curveTo(5.994f, 10.418f, 5.573f, 10.404f, 5.573f, 10.404f)
                horizontalLineTo(7.501f)
                lineTo(7.035f, 10.56f)
                curveTo(7.035f, 10.56f, 5.493f, 14.096f, 5.493f, 14.853f)
                curveTo(5.419f, 15.021f, 6.203f, 15.133f, 6.203f, 15.133f)
                horizontalLineTo(4.133f)
                lineTo(4.565f, 14.853f)
                close()
                moveTo(22.267f, 13.457f)
                lineTo(23.412f, 11.346f)
                lineTo(23.446f, 13.694f)
                lineTo(23.091f, 13.579f)
                lineTo(22.839f, 15.148f)
                lineTo(24.106f, 12.718f)
                lineTo(23.684f, 12.559f)
                lineTo(25.253f, 10.862f)
                lineTo(24.719f, 13.156f)
                lineTo(24.415f, 12.889f)
                lineTo(22.618f, 16.241f)
                lineTo(24.624f, 13.943f)
                lineTo(24.237f, 13.75f)
                lineTo(26.217f, 12.454f)
                lineTo(25.355f, 14.566f)
                lineTo(24.874f, 14.22f)
                lineTo(22.839f, 16.782f)
                lineTo(21.995f, 16.457f)
                lineTo(22.839f, 13.457f)
                horizontalLineTo(22.267f)
                close()
                moveTo(21.605f, 17.46f)
                horizontalLineTo(20.972f)
                verticalLineTo(17.942f)
                horizontalLineTo(20.473f)
                lineTo(19.06f, 19.58f)
                horizontalLineTo(19.84f)
                lineTo(20.111f, 20.503f)
                lineTo(20.473f, 20.177f)
                verticalLineTo(20.503f)
                lineTo(21.181f, 20.177f)
                lineTo(21.858f, 20.763f)
                lineTo(22.363f, 18.51f)
                lineTo(22.023f, 18.261f)
                lineTo(22.198f, 18.108f)
                lineTo(22.023f, 17.46f)
                horizontalLineTo(21.605f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.344f, 8.013f)
                curveTo(12.344f, 8.013f, 13.274f, 8.655f, 14.205f, 8.655f)
                curveTo(15.135f, 8.655f, 16.066f, 8.013f, 16.066f, 8.013f)
                curveTo(16.066f, 8.013f, 16.997f, 8.655f, 17.927f, 8.655f)
                curveTo(18.858f, 8.655f, 19.788f, 8.013f, 19.788f, 8.013f)
                verticalLineTo(10.914f)
                curveTo(19.788f, 13.913f, 16.066f, 16.238f, 16.066f, 16.238f)
                curveTo(16.066f, 16.238f, 12.163f, 14.103f, 12.344f, 10.878f)
                verticalLineTo(8.013f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(12.344f, 8.013f)
                curveTo(12.344f, 8.013f, 13.274f, 8.655f, 14.205f, 8.655f)
                curveTo(15.135f, 8.655f, 16.066f, 8.013f, 16.066f, 8.013f)
                curveTo(16.066f, 8.013f, 16.997f, 8.655f, 17.927f, 8.655f)
                curveTo(18.858f, 8.655f, 19.788f, 8.013f, 19.788f, 8.013f)
                verticalLineTo(10.914f)
                curveTo(19.788f, 13.913f, 16.066f, 16.238f, 16.066f, 16.238f)
                curveTo(16.066f, 16.238f, 12.163f, 14.103f, 12.344f, 10.878f)
                verticalLineTo(8.013f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.08f, 7.82f)
                horizontalLineTo(19.92f)
                verticalLineTo(10.84f)
                horizontalLineTo(12.08f)
                verticalLineTo(7.82f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.595f, 10.84f)
                horizontalLineTo(12.936f)
                verticalLineTo(16.945f)
                horizontalLineTo(13.595f)
                verticalLineTo(10.84f)
                close()
                moveTo(14.715f, 10.84f)
                horizontalLineTo(14.057f)
                verticalLineTo(16.945f)
                horizontalLineTo(14.715f)
                verticalLineTo(10.84f)
                close()
                moveTo(15.177f, 10.84f)
                horizontalLineTo(15.835f)
                verticalLineTo(16.945f)
                horizontalLineTo(15.177f)
                verticalLineTo(10.84f)
                close()
                moveTo(16.955f, 10.84f)
                horizontalLineTo(16.296f)
                verticalLineTo(16.945f)
                horizontalLineTo(16.955f)
                verticalLineTo(10.84f)
                close()
                moveTo(17.417f, 10.84f)
                horizontalLineTo(18.075f)
                verticalLineTo(16.945f)
                horizontalLineTo(17.417f)
                verticalLineTo(10.84f)
                close()
                moveTo(19.195f, 10.84f)
                horizontalLineTo(18.537f)
                verticalLineTo(16.945f)
                horizontalLineTo(19.195f)
                verticalLineTo(10.84f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UsVirginIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.UsVirginIslands,
            contentDescription = "US Virgin Islands Flag"
        )
    }
}
