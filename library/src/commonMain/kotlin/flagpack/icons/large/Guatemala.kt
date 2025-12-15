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
 * Guatemala Flag (32x24dp)
 *
 * - ISO Alpha-2: GT
 * - ISO Alpha-3: GTM
 * - ISO Numeric: 320
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Guatemala: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guatemala:GT:GTM:320:Large",
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color(0xFF58A5FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
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
                fill = SolidColor(Color(0xFF6C301F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.768f, 15.718f)
                lineTo(12.29f, 16.402f)
                lineTo(14.66f, 13.19f)
                verticalLineTo(12.621f)
                lineTo(11.768f, 15.718f)
                close()
            }
            path(fill = SolidColor(Color(0xFF979797))) {
                moveTo(13.404f, 12.136f)
                lineTo(13.578f, 11.897f)
                curveTo(15.821f, 13.584f, 17.411f, 14.879f, 18.3f, 15.958f)
                lineTo(17.745f, 16.416f)
                curveTo(16.9f, 15.39f, 15.606f, 13.791f, 13.404f, 12.136f)
                close()
            }
            path(fill = SolidColor(Color(0xFF979797))) {
                moveTo(17.021f, 10.726f)
                lineTo(16.763f, 10.475f)
                lineTo(18.178f, 9.016f)
                lineTo(18.488f, 9.317f)
                lineTo(19.956f, 7.95f)
                lineTo(20.201f, 8.213f)
                lineTo(18.482f, 9.813f)
                lineTo(18.185f, 9.525f)
                lineTo(17.021f, 10.726f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.506f, 8.445f)
                curveTo(12.43f, 8.117f, 12.345f, 7.712f, 12.345f, 7.712f)
                curveTo(12.156f, 8.144f, 12.096f, 8.537f, 12.172f, 8.888f)
                curveTo(12.092f, 8.999f, 12.019f, 9.103f, 11.953f, 9.2f)
                curveTo(11.75f, 8.931f, 11.495f, 8.428f, 11.495f, 8.428f)
                curveTo(11.504f, 8.574f, 11.5f, 8.724f, 11.496f, 8.869f)
                curveTo(11.487f, 9.21f, 11.479f, 9.527f, 11.639f, 9.726f)
                lineTo(11.637f, 9.73f)
                curveTo(11.605f, 9.795f, 11.575f, 9.861f, 11.546f, 9.927f)
                curveTo(11.325f, 9.707f, 10.959f, 9.31f, 10.959f, 9.31f)
                curveTo(10.988f, 9.786f, 11.119f, 10.161f, 11.359f, 10.428f)
                curveTo(11.315f, 10.568f, 11.28f, 10.707f, 11.251f, 10.844f)
                curveTo(11.066f, 10.653f, 10.888f, 10.464f, 10.888f, 10.464f)
                curveTo(10.914f, 10.898f, 10.986f, 11.185f, 11.175f, 11.426f)
                curveTo(11.171f, 11.495f, 11.17f, 11.563f, 11.169f, 11.631f)
                curveTo(10.974f, 11.429f, 10.775f, 11.219f, 10.775f, 11.219f)
                curveTo(10.802f, 11.677f, 10.981f, 11.979f, 11.217f, 12.23f)
                curveTo(11.24f, 12.375f, 11.272f, 12.518f, 11.312f, 12.66f)
                lineTo(11.334f, 12.735f)
                curveTo(11.068f, 12.606f, 10.777f, 12.46f, 10.777f, 12.46f)
                curveTo(10.95f, 12.861f, 11.204f, 13.082f, 11.492f, 13.236f)
                curveTo(11.554f, 13.415f, 11.619f, 13.589f, 11.687f, 13.756f)
                curveTo(11.375f, 13.671f, 10.909f, 13.531f, 10.909f, 13.531f)
                curveTo(11.185f, 13.95f, 11.524f, 14.116f, 11.889f, 14.212f)
                curveTo(11.963f, 14.368f, 12.041f, 14.516f, 12.121f, 14.658f)
                curveTo(11.825f, 14.575f, 11.478f, 14.471f, 11.478f, 14.471f)
                curveTo(11.746f, 14.877f, 12.074f, 15.046f, 12.426f, 15.143f)
                curveTo(12.659f, 15.473f, 12.908f, 15.745f, 13.168f, 15.948f)
                curveTo(12.881f, 16.078f, 12.521f, 16.234f, 12.521f, 16.234f)
                curveTo(12.928f, 16.355f, 13.253f, 16.309f, 13.55f, 16.194f)
                curveTo(13.562f, 16.2f, 13.573f, 16.205f, 13.585f, 16.211f)
                curveTo(13.713f, 16.272f, 13.857f, 16.33f, 14.019f, 16.387f)
                curveTo(13.784f, 16.491f, 13.56f, 16.588f, 13.56f, 16.588f)
                curveTo(13.958f, 16.706f, 14.278f, 16.664f, 14.569f, 16.556f)
                lineTo(14.601f, 16.564f)
                curveTo(14.743f, 16.603f, 14.889f, 16.64f, 15.081f, 16.688f)
                curveTo(14.954f, 16.656f, 15.422f, 16.772f, 15.517f, 16.796f)
                curveTo(15.821f, 16.874f, 15.994f, 16.928f, 16.077f, 16.975f)
                curveTo(16.085f, 16.979f, 16.091f, 16.983f, 16.094f, 16.985f)
                lineTo(16.094f, 16.985f)
                curveTo(16.098f, 16.987f, 16.099f, 16.988f, 16.099f, 16.987f)
                lineTo(16.331f, 16.818f)
                curveTo(16.304f, 16.781f, 16.267f, 16.751f, 16.218f, 16.724f)
                curveTo(16.104f, 16.66f, 15.919f, 16.602f, 15.588f, 16.517f)
                curveTo(15.493f, 16.493f, 15.04f, 16.382f, 15.143f, 16.407f)
                curveTo(14.957f, 16.361f, 14.815f, 16.324f, 14.676f, 16.287f)
                curveTo(14.635f, 16.275f, 14.594f, 16.264f, 14.555f, 16.253f)
                curveTo(14.588f, 15.947f, 14.55f, 15.63f, 14.341f, 15.277f)
                curveTo(14.341f, 15.277f, 14.25f, 15.829f, 14.189f, 16.141f)
                curveTo(14.005f, 16.079f, 13.846f, 16.017f, 13.709f, 15.952f)
                curveTo(13.663f, 15.929f, 13.617f, 15.905f, 13.571f, 15.878f)
                curveTo(13.553f, 15.566f, 13.461f, 15.255f, 13.19f, 14.939f)
                curveTo(13.19f, 14.939f, 13.194f, 15.289f, 13.193f, 15.593f)
                curveTo(13.003f, 15.42f, 12.82f, 15.206f, 12.645f, 14.954f)
                lineTo(12.767f, 15.019f)
                curveTo(12.781f, 14.63f, 12.721f, 14.246f, 12.384f, 13.853f)
                curveTo(12.384f, 13.853f, 12.389f, 14.232f, 12.387f, 14.543f)
                curveTo(12.277f, 14.353f, 12.173f, 14.146f, 12.073f, 13.926f)
                curveTo(12.166f, 13.624f, 12.188f, 13.298f, 12.04f, 12.903f)
                curveTo(12.04f, 12.903f, 11.952f, 13.153f, 11.859f, 13.406f)
                curveTo(11.832f, 13.335f, 11.806f, 13.262f, 11.78f, 13.187f)
                curveTo(11.969f, 12.871f, 12.09f, 12.52f, 12f, 12.038f)
                curveTo(12f, 12.038f, 11.785f, 12.419f, 11.622f, 12.695f)
                curveTo(11.611f, 12.658f, 11.6f, 12.62f, 11.589f, 12.582f)
                curveTo(11.554f, 12.461f, 11.527f, 12.338f, 11.506f, 12.214f)
                curveTo(11.774f, 11.987f, 11.992f, 11.703f, 12.069f, 11.24f)
                curveTo(12.069f, 11.24f, 11.709f, 11.548f, 11.459f, 11.753f)
                curveTo(11.455f, 11.65f, 11.457f, 11.546f, 11.462f, 11.442f)
                curveTo(11.752f, 11.266f, 12.001f, 11.026f, 12.151f, 10.601f)
                curveTo(12.151f, 10.601f, 11.797f, 10.811f, 11.52f, 10.967f)
                curveTo(11.54f, 10.862f, 11.564f, 10.757f, 11.593f, 10.651f)
                lineTo(11.594f, 10.661f)
                curveTo(11.937f, 10.479f, 12.239f, 10.235f, 12.412f, 9.747f)
                curveTo(12.412f, 9.747f, 12.056f, 9.958f, 11.779f, 10.114f)
                curveTo(11.815f, 10.028f, 11.854f, 9.942f, 11.896f, 9.855f)
                curveTo(11.946f, 9.752f, 12.017f, 9.629f, 12.109f, 9.487f)
                curveTo(12.415f, 9.389f, 12.701f, 9.221f, 12.944f, 8.867f)
                curveTo(12.944f, 8.867f, 12.699f, 8.935f, 12.444f, 9.004f)
                curveTo(12.592f, 8.803f, 12.765f, 8.578f, 12.963f, 8.329f)
                lineTo(12.739f, 8.15f)
                curveTo(12.657f, 8.252f, 12.579f, 8.351f, 12.506f, 8.445f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.634f, 8.445f)
                curveTo(19.709f, 8.117f, 19.794f, 7.712f, 19.794f, 7.712f)
                curveTo(19.984f, 8.144f, 20.044f, 8.537f, 19.967f, 8.888f)
                curveTo(20.048f, 8.999f, 20.121f, 9.103f, 20.186f, 9.2f)
                curveTo(20.39f, 8.931f, 20.644f, 8.428f, 20.644f, 8.428f)
                curveTo(20.635f, 8.574f, 20.639f, 8.724f, 20.643f, 8.869f)
                curveTo(20.652f, 9.21f, 20.661f, 9.527f, 20.501f, 9.726f)
                lineTo(20.503f, 9.73f)
                curveTo(20.535f, 9.795f, 20.565f, 9.861f, 20.594f, 9.927f)
                curveTo(20.814f, 9.707f, 21.181f, 9.31f, 21.181f, 9.31f)
                curveTo(21.152f, 9.786f, 21.02f, 10.161f, 20.781f, 10.428f)
                curveTo(20.824f, 10.568f, 20.86f, 10.707f, 20.888f, 10.844f)
                curveTo(21.073f, 10.653f, 21.252f, 10.464f, 21.252f, 10.464f)
                curveTo(21.226f, 10.898f, 21.153f, 11.185f, 20.964f, 11.426f)
                curveTo(20.968f, 11.495f, 20.97f, 11.563f, 20.97f, 11.631f)
                curveTo(21.166f, 11.429f, 21.365f, 11.219f, 21.365f, 11.219f)
                curveTo(21.337f, 11.677f, 21.158f, 11.979f, 20.923f, 12.23f)
                curveTo(20.899f, 12.375f, 20.868f, 12.518f, 20.827f, 12.66f)
                lineTo(20.806f, 12.735f)
                curveTo(21.072f, 12.606f, 21.363f, 12.46f, 21.363f, 12.46f)
                curveTo(21.189f, 12.861f, 20.936f, 13.082f, 20.647f, 13.236f)
                curveTo(20.586f, 13.415f, 20.521f, 13.589f, 20.452f, 13.756f)
                curveTo(20.764f, 13.671f, 21.231f, 13.531f, 21.231f, 13.531f)
                curveTo(20.954f, 13.95f, 20.615f, 14.116f, 20.251f, 14.212f)
                curveTo(20.176f, 14.368f, 20.099f, 14.516f, 20.019f, 14.658f)
                curveTo(20.315f, 14.575f, 20.662f, 14.471f, 20.662f, 14.471f)
                curveTo(20.393f, 14.877f, 20.066f, 15.046f, 19.713f, 15.143f)
                curveTo(19.481f, 15.473f, 19.232f, 15.745f, 18.972f, 15.948f)
                curveTo(19.258f, 16.078f, 19.619f, 16.234f, 19.619f, 16.234f)
                curveTo(19.212f, 16.355f, 18.886f, 16.309f, 18.589f, 16.194f)
                curveTo(18.578f, 16.2f, 18.566f, 16.205f, 18.554f, 16.211f)
                curveTo(18.426f, 16.272f, 18.283f, 16.33f, 18.121f, 16.387f)
                curveTo(18.356f, 16.491f, 18.579f, 16.588f, 18.579f, 16.588f)
                curveTo(18.181f, 16.706f, 17.862f, 16.664f, 17.571f, 16.556f)
                lineTo(17.539f, 16.564f)
                curveTo(17.396f, 16.603f, 17.251f, 16.64f, 17.059f, 16.688f)
                curveTo(17.186f, 16.656f, 16.718f, 16.772f, 16.623f, 16.796f)
                curveTo(16.319f, 16.874f, 16.146f, 16.928f, 16.062f, 16.975f)
                curveTo(16.055f, 16.979f, 16.049f, 16.983f, 16.045f, 16.985f)
                lineTo(16.045f, 16.985f)
                curveTo(16.042f, 16.987f, 16.04f, 16.988f, 16.041f, 16.987f)
                lineTo(15.808f, 16.818f)
                curveTo(15.835f, 16.781f, 15.873f, 16.751f, 15.921f, 16.724f)
                curveTo(16.035f, 16.66f, 16.22f, 16.602f, 16.552f, 16.517f)
                curveTo(16.646f, 16.493f, 17.099f, 16.382f, 16.997f, 16.407f)
                curveTo(17.183f, 16.361f, 17.325f, 16.324f, 17.463f, 16.287f)
                curveTo(17.505f, 16.275f, 17.545f, 16.264f, 17.585f, 16.253f)
                curveTo(17.551f, 15.947f, 17.59f, 15.63f, 17.799f, 15.277f)
                curveTo(17.799f, 15.277f, 17.889f, 15.829f, 17.951f, 16.141f)
                curveTo(18.135f, 16.079f, 18.293f, 16.017f, 18.43f, 15.952f)
                curveTo(18.476f, 15.929f, 18.522f, 15.905f, 18.568f, 15.878f)
                curveTo(18.587f, 15.566f, 18.678f, 15.255f, 18.949f, 14.939f)
                curveTo(18.949f, 14.939f, 18.945f, 15.289f, 18.947f, 15.593f)
                curveTo(19.136f, 15.42f, 19.32f, 15.206f, 19.495f, 14.954f)
                lineTo(19.372f, 15.019f)
                curveTo(19.358f, 14.63f, 19.419f, 14.246f, 19.755f, 13.853f)
                curveTo(19.755f, 13.853f, 19.751f, 14.232f, 19.753f, 14.543f)
                curveTo(19.862f, 14.353f, 19.967f, 14.146f, 20.066f, 13.926f)
                curveTo(19.974f, 13.624f, 19.952f, 13.298f, 20.1f, 12.903f)
                curveTo(20.1f, 12.903f, 20.188f, 13.153f, 20.28f, 13.406f)
                curveTo(20.307f, 13.335f, 20.334f, 13.262f, 20.36f, 13.187f)
                curveTo(20.171f, 12.871f, 20.05f, 12.52f, 20.14f, 12.038f)
                curveTo(20.14f, 12.038f, 20.354f, 12.419f, 20.518f, 12.695f)
                curveTo(20.529f, 12.658f, 20.54f, 12.62f, 20.551f, 12.582f)
                curveTo(20.585f, 12.461f, 20.613f, 12.338f, 20.634f, 12.214f)
                curveTo(20.365f, 11.987f, 20.148f, 11.703f, 20.071f, 11.24f)
                curveTo(20.071f, 11.24f, 20.43f, 11.548f, 20.681f, 11.753f)
                curveTo(20.684f, 11.65f, 20.683f, 11.546f, 20.677f, 11.442f)
                curveTo(20.388f, 11.266f, 20.139f, 11.026f, 19.988f, 10.601f)
                curveTo(19.988f, 10.601f, 20.343f, 10.811f, 20.619f, 10.967f)
                curveTo(20.6f, 10.862f, 20.575f, 10.757f, 20.546f, 10.651f)
                lineTo(20.546f, 10.661f)
                curveTo(20.202f, 10.479f, 19.9f, 10.235f, 19.728f, 9.747f)
                curveTo(19.728f, 9.747f, 20.084f, 9.958f, 20.361f, 10.114f)
                curveTo(20.325f, 10.028f, 20.286f, 9.942f, 20.244f, 9.855f)
                curveTo(20.194f, 9.752f, 20.123f, 9.629f, 20.031f, 9.487f)
                curveTo(19.724f, 9.389f, 19.438f, 9.221f, 19.195f, 8.867f)
                curveTo(19.195f, 8.867f, 19.441f, 8.935f, 19.695f, 9.004f)
                curveTo(19.548f, 8.803f, 19.375f, 8.578f, 19.176f, 8.329f)
                lineTo(19.401f, 8.15f)
                curveTo(19.483f, 8.252f, 19.56f, 8.351f, 19.634f, 8.445f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEFE298)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.417f, 9.323f)
                lineTo(14.625f, 12.522f)
                horizontalLineTo(13.737f)
                curveTo(13.737f, 12.522f, 13.417f, 13.532f, 14.021f, 13.532f)
                curveTo(14.625f, 13.532f, 17.735f, 13.532f, 17.735f, 13.532f)
                curveTo(17.735f, 13.532f, 18.139f, 13.279f, 17.937f, 12.522f)
                curveTo(17.735f, 11.766f, 16.713f, 9.677f, 16.713f, 9.677f)
                curveTo(16.713f, 9.677f, 17.15f, 9.331f, 17.15f, 9.074f)
                curveTo(17.15f, 8.817f, 16.713f, 8.789f, 16.713f, 8.789f)
                horizontalLineTo(13.958f)
                curveTo(13.606f, 8.846f, 13.417f, 9.323f, 13.417f, 9.323f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC5A042))) {
                moveTo(14.444f, 10.501f)
                lineTo(16.319f, 10.384f)
                lineTo(14.444f, 10.501f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB47D00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.444f, 10.501f)
                lineTo(16.319f, 10.384f)
            }
            path(fill = SolidColor(Color(0xFFC5A042))) {
                moveTo(14.9f, 11.521f)
                lineTo(16.775f, 11.405f)
                lineTo(14.9f, 11.521f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB47D00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.9f, 11.521f)
                lineTo(16.775f, 11.405f)
            }
            path(fill = SolidColor(Color(0xFFC5A042))) {
                moveTo(15.257f, 12.541f)
                lineTo(17.132f, 12.425f)
                lineTo(15.257f, 12.541f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB47D00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.257f, 12.541f)
                lineTo(17.132f, 12.425f)
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.88f, 7.588f)
                curveTo(15.88f, 7.588f, 15.592f, 7.646f, 15.592f, 7.829f)
                curveTo(15.592f, 8.011f, 15.514f, 8.167f, 15.514f, 8.167f)
                curveTo(15.514f, 8.167f, 15.602f, 8.999f, 16.26f, 9.192f)
                curveTo(16.919f, 9.385f, 17.304f, 9.431f, 17.582f, 9.818f)
                curveTo(17.859f, 10.206f, 18.709f, 11.299f, 18.368f, 12.242f)
                curveTo(18.027f, 13.185f, 17.759f, 13.666f, 17.759f, 13.666f)
                curveTo(17.759f, 13.666f, 19.003f, 12.495f, 19.003f, 11.939f)
                curveTo(19.003f, 11.384f, 18.819f, 10.846f, 18.268f, 10.141f)
                curveTo(17.717f, 9.435f, 17.461f, 9.023f, 17.051f, 8.705f)
                curveTo(16.64f, 8.388f, 16.052f, 8.094f, 16.052f, 8.094f)
                curveTo(16.052f, 8.094f, 16.261f, 7.871f, 16.156f, 7.765f)
                curveTo(16.052f, 7.66f, 15.88f, 7.588f, 15.88f, 7.588f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuatemalaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Guatemala,
            contentDescription = "Guatemala Flag"
        )
    }
}
