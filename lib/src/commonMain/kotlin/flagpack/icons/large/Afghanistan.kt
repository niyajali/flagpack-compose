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
 * Afghanistan Flag (32x24dp)
 *
 * - ISO Alpha-2: AF
 * - ISO Alpha-3: AFG
 * - ISO Numeric: 004
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Afghanistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Afghanistan:AF:AFG:004:Large",
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
                fill = SolidColor(Color(0xFF67BD38)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD51700)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.488f, 7.977f)
                lineTo(12.834f, 8.194f)
                curveTo(12.257f, 9.165f, 11.87f, 10.054f, 11.67f, 10.862f)
                curveTo(11.754f, 10.94f, 11.807f, 11.009f, 11.862f, 11.103f)
                curveTo(12.018f, 11.374f, 12.15f, 11.637f, 12.256f, 11.892f)
                lineTo(11.796f, 12.088f)
                curveTo(11.724f, 11.915f, 11.639f, 11.737f, 11.541f, 11.555f)
                curveTo(11.494f, 11.949f, 11.498f, 12.322f, 11.55f, 12.673f)
                curveTo(11.635f, 12.681f, 11.705f, 12.699f, 11.787f, 12.729f)
                curveTo(12.081f, 12.836f, 12.351f, 12.953f, 12.597f, 13.08f)
                lineTo(12.37f, 13.525f)
                curveTo(12.161f, 13.417f, 11.931f, 13.316f, 11.68f, 13.222f)
                lineTo(11.685f, 13.237f)
                curveTo(11.899f, 13.883f, 12.226f, 14.478f, 12.667f, 15.021f)
                curveTo(12.736f, 15.006f, 12.8f, 15f, 12.875f, 15f)
                curveTo(13.188f, 15f, 13.482f, 15.018f, 13.756f, 15.053f)
                lineTo(13.696f, 15.549f)
                curveTo(13.509f, 15.525f, 13.311f, 15.51f, 13.103f, 15.503f)
                curveTo(13.5f, 15.9f, 13.965f, 16.266f, 14.5f, 16.602f)
                lineTo(14.29f, 16.957f)
                curveTo(13.626f, 16.542f, 13.061f, 16.078f, 12.596f, 15.567f)
                curveTo(12.536f, 15.591f, 12.462f, 15.622f, 12.368f, 15.663f)
                lineTo(12.333f, 15.678f)
                curveTo(12.738f, 16.104f, 13.219f, 16.496f, 13.773f, 16.853f)
                lineTo(13.558f, 17.206f)
                curveTo(12.917f, 16.793f, 12.368f, 16.334f, 11.913f, 15.83f)
                curveTo(11.695f, 15.885f, 11.512f, 15.884f, 11.297f, 15.821f)
                lineTo(11.431f, 15.34f)
                curveTo(11.463f, 15.35f, 11.495f, 15.357f, 11.526f, 15.361f)
                curveTo(11.103f, 14.799f, 10.784f, 14.184f, 10.571f, 13.52f)
                curveTo(10.533f, 13.403f, 10.501f, 13.283f, 10.474f, 13.161f)
                curveTo(10.308f, 13.13f, 10.168f, 13.068f, 10.023f, 12.961f)
                lineTo(10.313f, 12.555f)
                curveTo(10.338f, 12.573f, 10.363f, 12.589f, 10.389f, 12.604f)
                curveTo(10.337f, 11.991f, 10.409f, 11.33f, 10.603f, 10.62f)
                curveTo(10.481f, 10.48f, 10.407f, 10.335f, 10.361f, 10.147f)
                lineTo(10.786f, 10.037f)
                curveTo(11.015f, 9.389f, 11.339f, 8.703f, 11.757f, 7.979f)
                lineTo(12.105f, 8.192f)
                curveTo(11.649f, 8.981f, 11.312f, 9.718f, 11.091f, 10.403f)
                curveTo(11.153f, 10.46f, 11.229f, 10.52f, 11.321f, 10.588f)
                curveTo(11.543f, 9.782f, 11.932f, 8.912f, 12.488f, 7.977f)
                close()
                moveTo(11.198f, 11.118f)
                curveTo(11.153f, 11.083f, 11.099f, 11.043f, 11.034f, 10.995f)
                curveTo(11.002f, 10.972f, 10.972f, 10.949f, 10.943f, 10.927f)
                curveTo(10.789f, 11.563f, 10.743f, 12.15f, 10.806f, 12.689f)
                curveTo(10.88f, 12.69f, 10.964f, 12.687f, 11.062f, 12.681f)
                lineTo(11.141f, 12.676f)
                curveTo(11.075f, 12.189f, 11.094f, 11.67f, 11.198f, 11.118f)
                close()
                moveTo(11.083f, 13.178f)
                curveTo(11.143f, 13.175f, 11.194f, 13.172f, 11.24f, 13.169f)
                curveTo(11.259f, 13.237f, 11.279f, 13.305f, 11.301f, 13.372f)
                curveTo(11.515f, 14.02f, 11.835f, 14.618f, 12.26f, 15.167f)
                lineTo(12.177f, 15.203f)
                curveTo(12.106f, 15.234f, 12.043f, 15.26f, 11.984f, 15.282f)
                curveTo(11.519f, 14.708f, 11.177f, 14.077f, 10.956f, 13.389f)
                curveTo(10.934f, 13.323f, 10.915f, 13.255f, 10.897f, 13.187f)
                curveTo(10.956f, 13.185f, 11.017f, 13.182f, 11.083f, 13.178f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.499f, 7.977f)
                lineTo(19.153f, 8.194f)
                curveTo(19.73f, 9.165f, 20.117f, 10.054f, 20.317f, 10.862f)
                curveTo(20.233f, 10.94f, 20.179f, 11.009f, 20.125f, 11.103f)
                curveTo(19.969f, 11.374f, 19.837f, 11.637f, 19.73f, 11.892f)
                lineTo(20.19f, 12.088f)
                curveTo(20.263f, 11.915f, 20.348f, 11.737f, 20.445f, 11.555f)
                curveTo(20.492f, 11.949f, 20.489f, 12.322f, 20.436f, 12.673f)
                curveTo(20.352f, 12.681f, 20.281f, 12.699f, 20.2f, 12.729f)
                curveTo(19.906f, 12.836f, 19.636f, 12.953f, 19.39f, 13.08f)
                lineTo(19.617f, 13.525f)
                curveTo(19.826f, 13.417f, 20.056f, 13.316f, 20.307f, 13.222f)
                lineTo(20.302f, 13.237f)
                curveTo(20.088f, 13.883f, 19.761f, 14.478f, 19.32f, 15.021f)
                curveTo(19.251f, 15.006f, 19.187f, 15f, 19.111f, 15f)
                curveTo(18.799f, 15f, 18.505f, 15.018f, 18.23f, 15.053f)
                lineTo(18.291f, 15.549f)
                curveTo(18.478f, 15.525f, 18.675f, 15.51f, 18.883f, 15.503f)
                curveTo(18.487f, 15.9f, 18.021f, 16.266f, 17.486f, 16.602f)
                lineTo(17.697f, 16.957f)
                curveTo(18.361f, 16.542f, 18.925f, 16.078f, 19.39f, 15.567f)
                curveTo(19.451f, 15.591f, 19.525f, 15.622f, 19.619f, 15.663f)
                lineTo(19.654f, 15.678f)
                curveTo(19.248f, 16.104f, 18.768f, 16.496f, 18.214f, 16.853f)
                lineTo(18.429f, 17.206f)
                curveTo(19.07f, 16.793f, 19.618f, 16.334f, 20.074f, 15.83f)
                curveTo(20.292f, 15.885f, 20.475f, 15.884f, 20.689f, 15.821f)
                lineTo(20.556f, 15.34f)
                curveTo(20.524f, 15.35f, 20.492f, 15.357f, 20.46f, 15.361f)
                curveTo(20.883f, 14.799f, 21.202f, 14.184f, 21.416f, 13.52f)
                curveTo(21.454f, 13.403f, 21.486f, 13.283f, 21.513f, 13.161f)
                curveTo(21.679f, 13.13f, 21.819f, 13.068f, 21.964f, 12.961f)
                lineTo(21.674f, 12.555f)
                curveTo(21.649f, 12.573f, 21.624f, 12.589f, 21.597f, 12.604f)
                curveTo(21.649f, 11.991f, 21.578f, 11.33f, 21.384f, 10.62f)
                curveTo(21.505f, 10.48f, 21.58f, 10.335f, 21.625f, 10.147f)
                lineTo(21.201f, 10.037f)
                curveTo(20.972f, 9.389f, 20.648f, 8.703f, 20.23f, 7.979f)
                lineTo(19.881f, 8.192f)
                curveTo(20.337f, 8.981f, 20.675f, 9.718f, 20.895f, 10.403f)
                curveTo(20.834f, 10.46f, 20.758f, 10.52f, 20.665f, 10.588f)
                curveTo(20.444f, 9.782f, 20.054f, 8.912f, 19.499f, 7.977f)
                close()
                moveTo(20.789f, 11.118f)
                curveTo(20.833f, 11.083f, 20.888f, 11.043f, 20.953f, 10.995f)
                curveTo(20.985f, 10.972f, 21.015f, 10.949f, 21.044f, 10.927f)
                curveTo(21.198f, 11.563f, 21.244f, 12.15f, 21.181f, 12.689f)
                curveTo(21.107f, 12.69f, 21.022f, 12.687f, 20.925f, 12.681f)
                lineTo(20.846f, 12.676f)
                curveTo(20.912f, 12.189f, 20.893f, 11.67f, 20.789f, 11.118f)
                close()
                moveTo(20.903f, 13.178f)
                curveTo(20.844f, 13.175f, 20.792f, 13.172f, 20.746f, 13.169f)
                curveTo(20.728f, 13.237f, 20.708f, 13.305f, 20.686f, 13.372f)
                curveTo(20.471f, 14.02f, 20.151f, 14.618f, 19.727f, 15.167f)
                lineTo(19.809f, 15.203f)
                curveTo(19.88f, 15.234f, 19.944f, 15.26f, 20.003f, 15.282f)
                curveTo(20.467f, 14.708f, 20.81f, 14.077f, 21.031f, 13.389f)
                curveTo(21.052f, 13.323f, 21.072f, 13.255f, 21.09f, 13.187f)
                curveTo(21.031f, 13.185f, 20.969f, 13.182f, 20.903f, 13.178f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.253f, 16.264f)
                lineTo(13.137f, 17.369f)
                curveTo(13.137f, 17.369f, 14.099f, 17.958f, 15.914f, 17.958f)
                curveTo(17.728f, 17.958f, 18.784f, 17.369f, 18.784f, 17.369f)
                lineTo(17.936f, 16.264f)
                curveTo(17.936f, 16.264f, 16.779f, 16.712f, 15.961f, 16.712f)
                curveTo(15.142f, 16.712f, 14.253f, 16.264f, 14.253f, 16.264f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC00001)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.276f, 16.969f)
                curveTo(14.276f, 16.969f, 15.222f, 17.192f, 15.946f, 17.192f)
                curveTo(16.67f, 17.192f, 17.616f, 16.969f, 17.616f, 16.969f)
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.892f, 9.458f)
                curveTo(16.892f, 9.896f, 16.493f, 10.25f, 16f, 10.25f)
                curveTo(15.507f, 10.25f, 15.108f, 9.896f, 15.108f, 9.458f)
                curveTo(15.108f, 9.021f, 15.507f, 8.667f, 16f, 8.667f)
                curveTo(16.493f, 8.667f, 16.892f, 9.021f, 16.892f, 9.458f)
                close()
                moveTo(16f, 10.25f)
                horizontalLineTo(15.04f)
                lineTo(14.775f, 10.453f)
                horizontalLineTo(14.724f)
                verticalLineTo(8.868f)
                horizontalLineTo(14.237f)
                verticalLineTo(10.453f)
                horizontalLineTo(13.811f)
                verticalLineTo(10.723f)
                horizontalLineTo(14.237f)
                verticalLineTo(13.581f)
                curveTo(14.18f, 14.037f, 14.046f, 14.295f, 13.859f, 14.385f)
                lineTo(12.866f, 14.861f)
                horizontalLineTo(18.844f)
                lineTo(18.414f, 14.432f)
                curveTo(18.037f, 14.055f, 17.856f, 13.765f, 17.856f, 13.597f)
                verticalLineTo(10.723f)
                horizontalLineTo(18.027f)
                verticalLineTo(10.453f)
                horizontalLineTo(17.856f)
                verticalLineTo(8.868f)
                horizontalLineTo(17.37f)
                verticalLineTo(10.453f)
                horizontalLineTo(17.213f)
                lineTo(16.899f, 10.25f)
                horizontalLineTo(16f)
                close()
                moveTo(14.724f, 10.723f)
                horizontalLineTo(17.37f)
                verticalLineTo(13.597f)
                curveTo(17.37f, 13.828f, 17.479f, 14.08f, 17.694f, 14.361f)
                horizontalLineTo(14.523f)
                curveTo(14.621f, 14.164f, 14.686f, 13.919f, 14.724f, 13.612f)
                verticalLineTo(10.723f)
                close()
                moveTo(16.081f, 12f)
                horizontalLineTo(15.027f)
                verticalLineTo(14.083f)
                horizontalLineTo(17.135f)
                lineTo(16.081f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.17f, 6.156f)
                lineTo(17.171f, 6.159f)
                lineTo(17.171f, 6.158f)
                lineTo(17.17f, 6.156f)
                close()
                moveTo(18.711f, 6.698f)
                lineTo(18.712f, 6.707f)
                lineTo(18.711f, 6.7f)
                lineTo(18.711f, 6.698f)
                close()
                moveTo(19.01f, 6.735f)
                lineTo(19.012f, 6.73f)
                lineTo(19.011f, 6.732f)
                lineTo(19.01f, 6.735f)
                close()
                moveTo(17.798f, 7.348f)
                lineTo(17.804f, 7.348f)
                lineTo(17.801f, 7.349f)
                lineTo(17.798f, 7.348f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.993f, 10.668f)
                lineTo(12.794f, 10.811f)
                lineTo(12.999f, 11.113f)
                curveTo(12.823f, 11.176f, 12.54f, 11.336f, 12.54f, 11.712f)
                curveTo(12.54f, 12.257f, 12.349f, 12.704f, 12.349f, 12.704f)
                lineTo(12.921f, 13.072f)
                curveTo(12.921f, 13.072f, 12.98f, 12.436f, 13.136f, 12.074f)
                curveTo(13.214f, 11.892f, 13.336f, 11.802f, 13.438f, 11.757f)
                lineTo(14.327f, 13.063f)
                lineTo(14.526f, 12.919f)
                lineTo(12.993f, 10.668f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.071f, 10.668f)
                lineTo(19.271f, 10.811f)
                lineTo(19.065f, 11.113f)
                curveTo(19.241f, 11.176f, 19.524f, 11.336f, 19.524f, 11.712f)
                curveTo(19.524f, 12.257f, 19.716f, 12.704f, 19.716f, 12.704f)
                lineTo(19.143f, 13.072f)
                curveTo(19.143f, 13.072f, 19.084f, 12.436f, 18.928f, 12.074f)
                curveTo(18.85f, 11.892f, 18.728f, 11.802f, 18.626f, 11.757f)
                lineTo(17.737f, 13.063f)
                lineTo(17.538f, 12.919f)
                lineTo(19.071f, 10.668f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AfghanistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Afghanistan,
            contentDescription = "Afghanistan Flag"
        )
    }
}
