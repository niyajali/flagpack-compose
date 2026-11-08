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
 * Jersey Flag (32x24dp)
 *
 * - ISO Alpha-2: JE
 * - ISO Alpha-3: JEY
 * - ISO Numeric: 832
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Jersey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jersey:JE:JEY:832:Large",
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
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 2.7f
            ) {
                moveTo(-2.701f, 1.245f)
                lineTo(-4.75f, 0.006f)
                verticalLineTo(2.4f)
                verticalLineTo(22.4f)
                verticalLineTo(24.794f)
                lineTo(-2.701f, 23.555f)
                lineTo(13.836f, 13.555f)
                lineTo(15.747f, 12.4f)
                lineTo(13.836f, 11.245f)
                lineTo(-2.701f, 1.245f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 2.7f
            ) {
                moveTo(34.921f, 1.233f)
                lineTo(36.949f, 0.055f)
                verticalLineTo(2.4f)
                verticalLineTo(22.4f)
                verticalLineTo(24.745f)
                lineTo(34.921f, 23.567f)
                lineTo(17.702f, 13.567f)
                lineTo(15.692f, 12.4f)
                lineTo(17.702f, 11.233f)
                lineTo(34.921f, 1.233f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.675f, 4.703f)
                curveTo(13.675f, 4.703f, 12.816f, 8.501f, 15.781f, 9.96f)
                curveTo(15.781f, 9.96f, 18.627f, 8.409f, 17.988f, 4.703f)
                curveTo(17.988f, 4.703f, 16.765f, 4.294f, 15.793f, 4.294f)
                curveTo(14.821f, 4.294f, 13.675f, 4.703f, 13.675f, 4.703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.982f, 5.499f)
                curveTo(13.982f, 5.499f, 14.299f, 5.358f, 14.456f, 5.499f)
                curveTo(14.613f, 5.639f, 14.742f, 5.487f, 14.742f, 5.402f)
                curveTo(14.742f, 5.318f, 14.991f, 5.027f, 14.991f, 5.263f)
                curveTo(14.991f, 5.499f, 14.914f, 5.632f, 15.133f, 5.632f)
                curveTo(15.352f, 5.632f, 16.338f, 5.306f, 16.575f, 5.402f)
                curveTo(16.811f, 5.499f, 16.992f, 5.475f, 16.932f, 5.336f)
                curveTo(16.872f, 5.198f, 16.718f, 5.112f, 16.42f, 5.187f)
                curveTo(16.122f, 5.263f, 16.193f, 5.336f, 15.935f, 5.336f)
                curveTo(15.678f, 5.336f, 15.392f, 5.263f, 15.392f, 5.263f)
                curveTo(15.392f, 5.263f, 15.472f, 5.139f, 15.766f, 5.227f)
                curveTo(16.06f, 5.315f, 16.465f, 5.118f, 16.575f, 5.118f)
                curveTo(16.685f, 5.118f, 16.988f, 5.112f, 17.018f, 5.187f)
                curveTo(17.048f, 5.263f, 17.231f, 5.332f, 17.092f, 5.402f)
                curveTo(16.952f, 5.473f, 16.722f, 5.517f, 16.88f, 5.607f)
                curveTo(17.039f, 5.697f, 17.403f, 5.679f, 17.42f, 5.773f)
                curveTo(17.438f, 5.867f, 17.61f, 6.007f, 17.541f, 6.007f)
                curveTo(17.472f, 6.007f, 17.347f, 6.139f, 17.23f, 6.099f)
                curveTo(17.114f, 6.058f, 17.1f, 6.023f, 17.212f, 5.991f)
                curveTo(17.323f, 5.958f, 17.322f, 5.821f, 17.23f, 5.821f)
                curveTo(17.138f, 5.821f, 17.183f, 5.869f, 16.973f, 5.821f)
                curveTo(16.763f, 5.773f, 16.486f, 5.72f, 16.502f, 5.821f)
                curveTo(16.519f, 5.922f, 16.656f, 6.078f, 16.404f, 6.099f)
                curveTo(16.152f, 6.119f, 16.034f, 6.203f, 15.984f, 6.136f)
                curveTo(15.935f, 6.069f, 15.76f, 5.979f, 15.898f, 5.951f)
                curveTo(16.036f, 5.922f, 16.168f, 6.048f, 16.217f, 6.027f)
                curveTo(16.267f, 6.007f, 16.379f, 5.995f, 16.285f, 5.908f)
                curveTo(16.191f, 5.821f, 16.035f, 5.77f, 16.18f, 5.705f)
                curveTo(16.324f, 5.639f, 16.21f, 5.638f, 15.935f, 5.773f)
                curveTo(15.661f, 5.908f, 15.508f, 6.023f, 15.267f, 6.007f)
                curveTo(15.026f, 5.991f, 14.936f, 6.012f, 14.858f, 5.991f)
                curveTo(14.781f, 5.969f, 14.403f, 6.233f, 14.295f, 6.166f)
                curveTo(14.186f, 6.099f, 13.835f, 6.073f, 13.898f, 5.991f)
                curveTo(13.962f, 5.908f, 14.046f, 5.866f, 14.141f, 5.908f)
                curveTo(14.235f, 5.951f, 14.329f, 5.993f, 14.393f, 5.951f)
                curveTo(14.456f, 5.908f, 14.64f, 5.763f, 14.594f, 5.734f)
                curveTo(14.548f, 5.705f, 14.592f, 5.607f, 14.331f, 5.607f)
                curveTo(14.069f, 5.607f, 13.977f, 5.716f, 13.915f, 5.647f)
                curveTo(13.852f, 5.578f, 13.982f, 5.499f, 13.982f, 5.499f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.244f, 6.747f)
                curveTo(14.244f, 6.747f, 14.523f, 6.623f, 14.661f, 6.747f)
                curveTo(14.799f, 6.87f, 14.912f, 6.736f, 14.912f, 6.662f)
                curveTo(14.912f, 6.588f, 15.131f, 6.332f, 15.131f, 6.539f)
                curveTo(15.131f, 6.747f, 15.063f, 6.864f, 15.255f, 6.864f)
                curveTo(15.448f, 6.864f, 16.315f, 6.577f, 16.523f, 6.662f)
                curveTo(16.731f, 6.747f, 16.89f, 6.726f, 16.837f, 6.604f)
                curveTo(16.785f, 6.483f, 16.649f, 6.407f, 16.387f, 6.473f)
                curveTo(16.125f, 6.539f, 16.187f, 6.604f, 15.961f, 6.604f)
                curveTo(15.735f, 6.604f, 15.483f, 6.539f, 15.483f, 6.539f)
                curveTo(15.483f, 6.539f, 15.554f, 6.43f, 15.812f, 6.508f)
                curveTo(16.07f, 6.585f, 16.426f, 6.412f, 16.523f, 6.412f)
                curveTo(16.62f, 6.412f, 16.886f, 6.407f, 16.913f, 6.473f)
                curveTo(16.939f, 6.539f, 17.1f, 6.6f, 16.978f, 6.662f)
                curveTo(16.855f, 6.724f, 16.653f, 6.763f, 16.792f, 6.842f)
                curveTo(16.931f, 6.921f, 17.251f, 6.906f, 17.267f, 6.988f)
                curveTo(17.282f, 7.07f, 17.434f, 7.193f, 17.373f, 7.193f)
                curveTo(17.312f, 7.193f, 17.202f, 7.31f, 17.099f, 7.274f)
                curveTo(16.997f, 7.239f, 16.985f, 7.208f, 17.083f, 7.179f)
                curveTo(17.181f, 7.151f, 17.18f, 7.03f, 17.099f, 7.03f)
                curveTo(17.018f, 7.03f, 17.058f, 7.072f, 16.873f, 7.03f)
                curveTo(16.689f, 6.988f, 16.445f, 6.941f, 16.459f, 7.03f)
                curveTo(16.474f, 7.119f, 16.594f, 7.256f, 16.373f, 7.274f)
                curveTo(16.151f, 7.292f, 16.047f, 7.366f, 16.004f, 7.307f)
                curveTo(15.961f, 7.248f, 15.807f, 7.169f, 15.928f, 7.144f)
                curveTo(16.049f, 7.119f, 16.165f, 7.23f, 16.209f, 7.212f)
                curveTo(16.253f, 7.193f, 16.351f, 7.183f, 16.269f, 7.107f)
                curveTo(16.186f, 7.03f, 16.049f, 6.985f, 16.176f, 6.928f)
                curveTo(16.302f, 6.87f, 16.202f, 6.869f, 15.961f, 6.988f)
                curveTo(15.72f, 7.107f, 15.585f, 7.208f, 15.373f, 7.193f)
                curveTo(15.161f, 7.179f, 15.082f, 7.198f, 15.014f, 7.179f)
                curveTo(14.946f, 7.16f, 14.614f, 7.392f, 14.519f, 7.333f)
                curveTo(14.423f, 7.274f, 14.115f, 7.252f, 14.17f, 7.179f)
                curveTo(14.226f, 7.107f, 14.3f, 7.07f, 14.383f, 7.107f)
                curveTo(14.466f, 7.144f, 14.549f, 7.181f, 14.605f, 7.144f)
                curveTo(14.661f, 7.107f, 14.822f, 6.979f, 14.782f, 6.953f)
                curveTo(14.741f, 6.928f, 14.78f, 6.842f, 14.55f, 6.842f)
                curveTo(14.32f, 6.842f, 14.239f, 6.938f, 14.184f, 6.877f)
                curveTo(14.13f, 6.817f, 14.244f, 6.747f, 14.244f, 6.747f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.614f, 8.013f)
                curveTo(14.614f, 8.013f, 14.826f, 7.92f, 14.93f, 8.013f)
                curveTo(15.035f, 8.107f, 15.121f, 8.006f, 15.121f, 7.949f)
                curveTo(15.121f, 7.893f, 15.287f, 7.699f, 15.287f, 7.856f)
                curveTo(15.287f, 8.013f, 15.235f, 8.102f, 15.381f, 8.102f)
                curveTo(15.527f, 8.102f, 16.185f, 7.885f, 16.343f, 7.949f)
                curveTo(16.5f, 8.013f, 16.621f, 7.998f, 16.581f, 7.905f)
                curveTo(16.541f, 7.813f, 16.438f, 7.756f, 16.239f, 7.806f)
                curveTo(16.041f, 7.856f, 16.088f, 7.905f, 15.916f, 7.905f)
                curveTo(15.745f, 7.905f, 15.554f, 7.856f, 15.554f, 7.856f)
                curveTo(15.554f, 7.856f, 15.608f, 7.774f, 15.803f, 7.832f)
                curveTo(15.999f, 7.891f, 16.269f, 7.76f, 16.343f, 7.76f)
                curveTo(16.416f, 7.76f, 16.618f, 7.756f, 16.638f, 7.806f)
                curveTo(16.658f, 7.856f, 16.78f, 7.902f, 16.687f, 7.949f)
                curveTo(16.594f, 7.996f, 16.441f, 8.026f, 16.546f, 8.086f)
                curveTo(16.652f, 8.146f, 16.895f, 8.134f, 16.906f, 8.197f)
                curveTo(16.918f, 8.259f, 17.033f, 8.352f, 16.987f, 8.352f)
                curveTo(16.941f, 8.352f, 16.857f, 8.44f, 16.779f, 8.414f)
                curveTo(16.702f, 8.387f, 16.693f, 8.363f, 16.767f, 8.342f)
                curveTo(16.842f, 8.32f, 16.841f, 8.229f, 16.779f, 8.229f)
                curveTo(16.718f, 8.229f, 16.748f, 8.261f, 16.608f, 8.229f)
                curveTo(16.468f, 8.197f, 16.283f, 8.161f, 16.294f, 8.229f)
                curveTo(16.305f, 8.296f, 16.396f, 8.4f, 16.228f, 8.414f)
                curveTo(16.06f, 8.427f, 15.982f, 8.483f, 15.949f, 8.438f)
                curveTo(15.916f, 8.393f, 15.799f, 8.334f, 15.891f, 8.315f)
                curveTo(15.983f, 8.296f, 16.071f, 8.38f, 16.104f, 8.366f)
                curveTo(16.137f, 8.352f, 16.212f, 8.345f, 16.149f, 8.287f)
                curveTo(16.087f, 8.229f, 15.983f, 8.194f, 16.079f, 8.151f)
                curveTo(16.175f, 8.107f, 16.099f, 8.106f, 15.916f, 8.197f)
                curveTo(15.733f, 8.287f, 15.631f, 8.363f, 15.471f, 8.352f)
                curveTo(15.31f, 8.342f, 15.25f, 8.356f, 15.198f, 8.342f)
                curveTo(15.146f, 8.327f, 14.895f, 8.503f, 14.823f, 8.458f)
                curveTo(14.75f, 8.414f, 14.516f, 8.396f, 14.558f, 8.342f)
                curveTo(14.6f, 8.287f, 14.657f, 8.258f, 14.72f, 8.287f)
                curveTo(14.783f, 8.315f, 14.845f, 8.343f, 14.888f, 8.315f)
                curveTo(14.93f, 8.287f, 15.053f, 8.19f, 15.022f, 8.17f)
                curveTo(14.991f, 8.151f, 15.021f, 8.086f, 14.846f, 8.086f)
                curveTo(14.672f, 8.086f, 14.61f, 8.158f, 14.569f, 8.113f)
                curveTo(14.528f, 8.067f, 14.614f, 8.013f, 14.614f, 8.013f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JerseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Jersey,
            contentDescription = "Jersey Flag"
        )
    }
}
