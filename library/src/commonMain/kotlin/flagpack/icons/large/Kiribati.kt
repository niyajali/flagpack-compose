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
 * Kiribati Flag (32x24dp)
 *
 * - ISO Alpha-2: KI
 * - ISO Alpha-3: KIR
 * - ISO Numeric: 296
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Kiribati: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kiribati:KI:KIR:296:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFFFC84A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.009f, 9.961f)
                curveTo(16.026f, 9.962f, 16.042f, 9.964f, 16.059f, 9.966f)
                curveTo(16.116f, 9.77f, 16.217f, 9.448f, 16.347f, 9.144f)
                curveTo(16.553f, 8.662f, 17.147f, 8.392f, 17.147f, 8.392f)
                curveTo(17.147f, 8.392f, 16.854f, 8.723f, 16.777f, 9.248f)
                curveTo(16.729f, 9.569f, 16.713f, 9.895f, 16.707f, 10.101f)
                lineTo(16.748f, 10.114f)
                curveTo(16.852f, 9.937f, 17.025f, 9.655f, 17.221f, 9.397f)
                curveTo(17.537f, 8.979f, 18.179f, 8.86f, 18.179f, 8.86f)
                curveTo(18.179f, 8.86f, 17.814f, 9.111f, 17.612f, 9.601f)
                curveTo(17.495f, 9.887f, 17.403f, 10.183f, 17.347f, 10.381f)
                curveTo(17.368f, 10.393f, 17.388f, 10.405f, 17.408f, 10.417f)
                curveTo(17.551f, 10.268f, 17.772f, 10.045f, 18.009f, 9.847f)
                curveTo(18.412f, 9.511f, 19.064f, 9.54f, 19.064f, 9.54f)
                curveTo(19.064f, 9.54f, 18.652f, 9.701f, 18.345f, 10.134f)
                curveTo(18.176f, 10.372f, 18.028f, 10.625f, 17.928f, 10.804f)
                curveTo(17.95f, 10.824f, 17.971f, 10.844f, 17.993f, 10.865f)
                curveTo(18.165f, 10.752f, 18.415f, 10.597f, 18.673f, 10.466f)
                curveTo(19.14f, 10.229f, 19.77f, 10.404f, 19.77f, 10.404f)
                curveTo(19.77f, 10.404f, 19.331f, 10.469f, 18.935f, 10.822f)
                curveTo(18.732f, 11.002f, 18.543f, 11.199f, 18.407f, 11.349f)
                curveTo(18.426f, 11.375f, 18.444f, 11.403f, 18.462f, 11.43f)
                curveTo(18.654f, 11.364f, 18.916f, 11.281f, 19.18f, 11.221f)
                curveTo(19.691f, 11.104f, 20.259f, 11.426f, 20.259f, 11.426f)
                curveTo(20.259f, 11.426f, 19.818f, 11.383f, 19.348f, 11.63f)
                curveTo(19.128f, 11.745f, 18.916f, 11.876f, 18.753f, 11.983f)
                curveTo(18.77f, 12.025f, 18.786f, 12.067f, 18.802f, 12.109f)
                curveTo(18.997f, 12.09f, 19.247f, 12.072f, 19.494f, 12.073f)
                curveTo(20.019f, 12.074f, 20.5f, 12.516f, 20.5f, 12.516f)
                curveTo(20.5f, 12.516f, 20.08f, 12.375f, 19.566f, 12.509f)
                curveTo(19.346f, 12.566f, 19.129f, 12.639f, 18.953f, 12.703f)
                curveTo(18.961f, 12.755f, 18.968f, 12.808f, 18.973f, 12.861f)
                curveTo(19.159f, 12.886f, 19.385f, 12.922f, 19.604f, 12.974f)
                curveTo(20.115f, 13.093f, 20.485f, 13.631f, 20.485f, 13.631f)
                curveTo(20.485f, 13.631f, 20.107f, 13.399f, 19.576f, 13.415f)
                curveTo(19.367f, 13.421f, 19.158f, 13.44f, 18.982f, 13.46f)
                curveTo(18.977f, 13.518f, 18.971f, 13.575f, 18.963f, 13.632f)
                curveTo(19.129f, 13.699f, 19.322f, 13.783f, 19.507f, 13.878f)
                curveTo(19.974f, 14.117f, 20.202f, 14.729f, 20.202f, 14.729f)
                curveTo(20.202f, 14.729f, 19.892f, 14.413f, 19.374f, 14.299f)
                curveTo(19.188f, 14.258f, 18.999f, 14.228f, 18.833f, 14.206f)
                curveTo(18.812f, 14.27f, 18.789f, 14.334f, 18.764f, 14.397f)
                curveTo(18.901f, 14.494f, 19.055f, 14.61f, 19.201f, 14.733f)
                curveTo(19.602f, 15.071f, 19.687f, 15.718f, 19.687f, 15.718f)
                curveTo(19.687f, 15.718f, 19.456f, 15.34f, 18.976f, 15.113f)
                curveTo(18.816f, 15.037f, 18.652f, 14.969f, 18.504f, 14.913f)
                curveTo(18.465f, 14.975f, 18.424f, 15.036f, 18.381f, 15.096f)
                curveTo(18.486f, 15.215f, 18.6f, 15.352f, 18.706f, 15.493f)
                curveTo(19.021f, 15.913f, 18.958f, 16.563f, 18.958f, 16.563f)
                curveTo(18.958f, 16.563f, 18.818f, 16.143f, 18.402f, 15.813f)
                curveTo(18.271f, 15.71f, 18.134f, 15.612f, 18.009f, 15.527f)
                curveTo(17.955f, 15.58f, 17.899f, 15.631f, 17.841f, 15.68f)
                curveTo(17.912f, 15.816f, 17.986f, 15.969f, 18.051f, 16.124f)
                curveTo(18.255f, 16.607f, 18.036f, 17.223f, 18.036f, 17.223f)
                curveTo(18.036f, 17.223f, 18.002f, 16.781f, 17.678f, 16.361f)
                curveTo(17.581f, 16.235f, 17.479f, 16.114f, 17.382f, 16.006f)
                curveTo(17.312f, 16.047f, 17.241f, 16.086f, 17.168f, 16.122f)
                curveTo(17.204f, 16.265f, 17.239f, 16.423f, 17.267f, 16.582f)
                curveTo(17.357f, 17.098f, 17.006f, 17.649f, 17.006f, 17.649f)
                curveTo(17.006f, 17.649f, 17.072f, 17.211f, 16.85f, 16.728f)
                curveTo(16.786f, 16.588f, 16.715f, 16.45f, 16.647f, 16.326f)
                curveTo(16.568f, 16.349f, 16.487f, 16.369f, 16.406f, 16.387f)
                curveTo(16.408f, 16.532f, 16.407f, 16.69f, 16.399f, 16.847f)
                curveTo(16.37f, 17.37f, 15.904f, 17.828f, 15.904f, 17.828f)
                curveTo(15.904f, 17.828f, 16.067f, 17.416f, 15.96f, 16.896f)
                curveTo(15.929f, 16.744f, 15.89f, 16.594f, 15.852f, 16.458f)
                curveTo(15.804f, 16.459f, 15.756f, 16.461f, 15.708f, 16.461f)
                curveTo(15.676f, 16.461f, 15.643f, 16.46f, 15.611f, 16.459f)
                curveTo(15.578f, 16.601f, 15.538f, 16.757f, 15.491f, 16.908f)
                curveTo(15.337f, 17.409f, 14.774f, 17.74f, 14.774f, 17.74f)
                curveTo(14.774f, 17.74f, 15.032f, 17.38f, 15.054f, 16.85f)
                curveTo(15.06f, 16.694f, 15.059f, 16.539f, 15.055f, 16.396f)
                curveTo(14.974f, 16.38f, 14.895f, 16.361f, 14.816f, 16.339f)
                curveTo(14.752f, 16.472f, 14.677f, 16.616f, 14.597f, 16.755f)
                curveTo(14.333f, 17.208f, 13.71f, 17.404f, 13.71f, 17.404f)
                curveTo(13.71f, 17.404f, 14.042f, 17.111f, 14.183f, 16.599f)
                curveTo(14.226f, 16.444f, 14.261f, 16.286f, 14.29f, 16.142f)
                curveTo(14.218f, 16.108f, 14.148f, 16.071f, 14.079f, 16.032f)
                curveTo(13.984f, 16.15f, 13.875f, 16.278f, 13.761f, 16.4f)
                curveTo(13.403f, 16.782f, 12.752f, 16.833f, 12.752f, 16.833f)
                curveTo(12.752f, 16.833f, 13.141f, 16.622f, 13.393f, 16.155f)
                curveTo(13.474f, 16.005f, 13.548f, 15.85f, 13.611f, 15.71f)
                curveTo(13.555f, 15.663f, 13.5f, 15.615f, 13.447f, 15.565f)
                curveTo(13.321f, 15.662f, 13.176f, 15.767f, 13.027f, 15.864f)
                curveTo(12.587f, 16.148f, 11.942f, 16.04f, 11.942f, 16.04f)
                curveTo(11.942f, 16.04f, 12.371f, 15.93f, 12.729f, 15.538f)
                curveTo(12.851f, 15.404f, 12.966f, 15.263f, 13.065f, 15.136f)
                curveTo(13.023f, 15.079f, 12.983f, 15.021f, 12.944f, 14.962f)
                curveTo(12.793f, 15.032f, 12.617f, 15.107f, 12.44f, 15.171f)
                curveTo(11.947f, 15.349f, 11.343f, 15.099f, 11.343f, 15.099f)
                curveTo(11.343f, 15.099f, 11.786f, 15.088f, 12.223f, 14.786f)
                curveTo(12.384f, 14.675f, 12.54f, 14.553f, 12.672f, 14.445f)
                curveTo(12.647f, 14.386f, 12.624f, 14.326f, 12.603f, 14.265f)
                curveTo(12.431f, 14.301f, 12.23f, 14.338f, 12.028f, 14.362f)
                curveTo(11.508f, 14.425f, 10.976f, 14.045f, 10.976f, 14.045f)
                curveTo(10.976f, 14.045f, 11.41f, 14.134f, 11.903f, 13.938f)
                curveTo(12.104f, 13.859f, 12.299f, 13.767f, 12.461f, 13.685f)
                curveTo(12.453f, 13.632f, 12.446f, 13.579f, 12.441f, 13.526f)
                curveTo(12.255f, 13.52f, 12.031f, 13.507f, 11.81f, 13.479f)
                curveTo(11.29f, 13.414f, 10.866f, 12.917f, 10.866f, 12.917f)
                curveTo(10.866f, 12.917f, 11.265f, 13.108f, 11.792f, 13.038f)
                curveTo(12.023f, 13.007f, 12.253f, 12.96f, 12.438f, 12.917f)
                curveTo(12.442f, 12.868f, 12.447f, 12.819f, 12.454f, 12.77f)
                curveTo(12.266f, 12.722f, 12.032f, 12.654f, 11.805f, 12.571f)
                curveTo(11.313f, 12.391f, 11.012f, 11.811f, 11.012f, 11.811f)
                curveTo(11.012f, 11.811f, 11.358f, 12.088f, 11.887f, 12.137f)
                curveTo(12.141f, 12.161f, 12.398f, 12.166f, 12.596f, 12.164f)
                curveTo(12.609f, 12.125f, 12.623f, 12.086f, 12.638f, 12.047f)
                curveTo(12.46f, 11.956f, 12.228f, 11.829f, 12.01f, 11.687f)
                curveTo(11.571f, 11.401f, 11.408f, 10.768f, 11.408f, 10.768f)
                curveTo(11.408f, 10.768f, 11.683f, 11.115f, 12.187f, 11.282f)
                curveTo(12.451f, 11.37f, 12.724f, 11.436f, 12.923f, 11.479f)
                curveTo(12.938f, 11.455f, 12.954f, 11.43f, 12.971f, 11.405f)
                curveTo(12.816f, 11.271f, 12.603f, 11.078f, 12.41f, 10.871f)
                curveTo(12.054f, 10.486f, 12.048f, 9.833f, 12.048f, 9.833f)
                curveTo(12.048f, 9.833f, 12.232f, 10.236f, 12.68f, 10.521f)
                curveTo(12.931f, 10.679f, 13.196f, 10.817f, 13.381f, 10.907f)
                curveTo(13.4f, 10.888f, 13.419f, 10.869f, 13.439f, 10.85f)
                curveTo(13.316f, 10.684f, 13.141f, 10.433f, 12.991f, 10.172f)
                curveTo(12.729f, 9.718f, 12.871f, 9.08f, 12.871f, 9.08f)
                curveTo(12.871f, 9.08f, 12.959f, 9.514f, 13.332f, 9.892f)
                curveTo(13.553f, 10.116f, 13.796f, 10.32f, 13.957f, 10.449f)
                curveTo(13.975f, 10.438f, 13.993f, 10.426f, 14.012f, 10.415f)
                curveTo(13.929f, 10.226f, 13.808f, 9.929f, 13.716f, 9.627f)
                curveTo(13.564f, 9.125f, 13.845f, 8.535f, 13.845f, 8.535f)
                curveTo(13.845f, 8.535f, 13.833f, 8.978f, 14.112f, 9.43f)
                curveTo(14.284f, 9.71f, 14.483f, 9.973f, 14.611f, 10.134f)
                curveTo(14.623f, 10.129f, 14.636f, 10.125f, 14.648f, 10.121f)
                curveTo(14.613f, 9.919f, 14.564f, 9.587f, 14.547f, 9.258f)
                curveTo(14.521f, 8.735f, 14.937f, 8.231f, 14.937f, 8.231f)
                curveTo(14.937f, 8.231f, 14.818f, 8.658f, 14.979f, 9.164f)
                curveTo(15.079f, 9.48f, 15.211f, 9.787f, 15.296f, 9.973f)
                curveTo(15.312f, 9.971f, 15.328f, 9.969f, 15.344f, 9.967f)
                curveTo(15.356f, 9.764f, 15.382f, 9.425f, 15.441f, 9.096f)
                curveTo(15.533f, 8.58f, 16.051f, 8.183f, 16.051f, 8.183f)
                curveTo(16.051f, 8.183f, 15.84f, 8.572f, 15.882f, 9.101f)
                curveTo(15.909f, 9.432f, 15.969f, 9.761f, 16.009f, 9.961f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.792f, 13.92f)
                lineTo(1.823f, 12.859f)
                curveTo(2.204f, 12.704f, 2.631f, 12.706f, 3.011f, 12.864f)
                lineTo(6.641f, 14.375f)
                curveTo(7.052f, 14.546f, 7.516f, 14.534f, 7.917f, 14.341f)
                lineTo(10.846f, 12.936f)
                curveTo(11.266f, 12.734f, 11.754f, 12.731f, 12.177f, 12.926f)
                lineTo(15.245f, 14.343f)
                curveTo(15.658f, 14.534f, 16.134f, 14.535f, 16.548f, 14.346f)
                lineTo(19.687f, 12.915f)
                curveTo(20.101f, 12.726f, 20.576f, 12.727f, 20.99f, 12.918f)
                lineTo(24.089f, 14.349f)
                curveTo(24.495f, 14.536f, 24.963f, 14.54f, 25.373f, 14.36f)
                lineTo(28.759f, 12.869f)
                curveTo(29.126f, 12.708f, 29.54f, 12.693f, 29.917f, 12.829f)
                lineTo(32.953f, 13.92f)
                verticalLineTo(23.934f)
                horizontalLineTo(-0.881f)
                lineTo(-0.792f, 13.92f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-0.792f, 13.92f)
                lineTo(1.823f, 12.859f)
                curveTo(2.204f, 12.704f, 2.631f, 12.706f, 3.011f, 12.864f)
                lineTo(6.641f, 14.375f)
                curveTo(7.052f, 14.546f, 7.516f, 14.534f, 7.917f, 14.341f)
                lineTo(10.846f, 12.936f)
                curveTo(11.266f, 12.734f, 11.754f, 12.731f, 12.177f, 12.926f)
                lineTo(15.245f, 14.343f)
                curveTo(15.658f, 14.534f, 16.134f, 14.535f, 16.548f, 14.346f)
                lineTo(19.687f, 12.915f)
                curveTo(20.101f, 12.726f, 20.576f, 12.727f, 20.99f, 12.918f)
                lineTo(24.089f, 14.349f)
                curveTo(24.495f, 14.536f, 24.963f, 14.54f, 25.373f, 14.36f)
                lineTo(28.759f, 12.869f)
                curveTo(29.126f, 12.708f, 29.54f, 12.693f, 29.917f, 12.829f)
                lineTo(32.953f, 13.92f)
                verticalLineTo(23.934f)
                horizontalLineTo(-0.881f)
                lineTo(-0.792f, 13.92f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 2f
            ) {
                moveTo(-0.792f, 16.246f)
                lineTo(1.823f, 15.184f)
                curveTo(2.204f, 15.03f, 2.631f, 15.032f, 3.011f, 15.19f)
                lineTo(6.641f, 16.701f)
                curveTo(7.052f, 16.872f, 7.516f, 16.859f, 7.917f, 16.667f)
                lineTo(10.846f, 15.261f)
                curveTo(11.266f, 15.06f, 11.754f, 15.056f, 12.177f, 15.252f)
                lineTo(15.245f, 16.669f)
                curveTo(15.658f, 16.86f, 16.134f, 16.861f, 16.548f, 16.672f)
                lineTo(19.687f, 15.241f)
                curveTo(20.101f, 15.052f, 20.576f, 15.053f, 20.99f, 15.244f)
                lineTo(24.089f, 16.674f)
                curveTo(24.495f, 16.862f, 24.963f, 16.866f, 25.373f, 16.685f)
                lineTo(28.759f, 15.194f)
                curveTo(29.126f, 15.033f, 29.54f, 15.019f, 29.917f, 15.154f)
                lineTo(32.953f, 16.246f)
            }
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 2f
            ) {
                moveTo(-0.792f, 19.575f)
                lineTo(1.823f, 18.514f)
                curveTo(2.204f, 18.359f, 2.631f, 18.361f, 3.011f, 18.519f)
                lineTo(6.641f, 20.03f)
                curveTo(7.052f, 20.201f, 7.516f, 20.188f, 7.917f, 19.996f)
                lineTo(10.846f, 18.59f)
                curveTo(11.266f, 18.389f, 11.754f, 18.385f, 12.177f, 18.581f)
                lineTo(15.245f, 19.998f)
                curveTo(15.658f, 20.189f, 16.134f, 20.19f, 16.548f, 20.001f)
                lineTo(19.687f, 18.569f)
                curveTo(20.101f, 18.381f, 20.576f, 18.382f, 20.99f, 18.573f)
                lineTo(24.089f, 20.003f)
                curveTo(24.495f, 20.191f, 24.963f, 20.195f, 25.373f, 20.014f)
                lineTo(28.759f, 18.524f)
                curveTo(29.126f, 18.362f, 29.54f, 18.348f, 29.917f, 18.483f)
                lineTo(32.953f, 19.575f)
            }
            path(
                fill = SolidColor(Color(0xFF015989)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.792f, 22.227f)
                lineTo(0.3f, 21.784f)
                curveTo(1.657f, 21.234f, 3.176f, 21.24f, 4.528f, 21.803f)
                lineTo(6.641f, 22.682f)
                curveTo(7.052f, 22.853f, 7.516f, 22.841f, 7.917f, 22.648f)
                lineTo(9.148f, 22.058f)
                curveTo(10.643f, 21.34f, 12.381f, 21.327f, 13.887f, 22.023f)
                lineTo(15.245f, 22.65f)
                curveTo(15.658f, 22.841f, 16.134f, 22.842f, 16.548f, 22.653f)
                lineTo(18.017f, 21.984f)
                curveTo(19.491f, 21.311f, 21.185f, 21.315f, 22.656f, 21.994f)
                lineTo(24.089f, 22.656f)
                curveTo(24.495f, 22.844f, 24.963f, 22.848f, 25.373f, 22.667f)
                lineTo(27.297f, 21.82f)
                curveTo(28.602f, 21.245f, 30.078f, 21.194f, 31.42f, 21.676f)
                lineTo(32.953f, 22.227f)
                verticalLineTo(25.542f)
                horizontalLineTo(-0.608f)
                lineTo(-0.792f, 22.227f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFC84A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.78f, 3.418f)
            curveTo(9.78f, 3.418f, 11.172f, 3.418f, 11.641f, 3.418f)
            curveTo(12.109f, 3.418f, 13.166f, 2.702f, 13.778f, 2.941f)
            curveTo(14.389f, 3.18f, 15.419f, 3.951f, 15.419f, 3.951f)
            curveTo(15.419f, 3.951f, 17.118f, 2.609f, 18.132f, 2.609f)
            curveTo(19.146f, 2.609f, 20.974f, 2.46f, 20.974f, 2.46f)
            curveTo(20.974f, 2.46f, 20.545f, 3.573f, 19.338f, 3.762f)
            curveTo(18.132f, 3.951f, 16.688f, 4.874f, 16.688f, 4.874f)
            curveTo(16.688f, 4.874f, 18.35f, 4.874f, 18.649f, 4.874f)
            curveTo(18.948f, 4.874f, 19.338f, 5.325f, 19.338f, 5.325f)
            curveTo(19.338f, 5.325f, 18.534f, 5.872f, 18.132f, 5.872f)
            curveTo(17.73f, 5.872f, 17.286f, 5.872f, 17.286f, 5.872f)
            curveTo(17.286f, 5.872f, 16.432f, 6.605f, 15.377f, 6.449f)
            curveTo(14.322f, 6.293f, 13.475f, 5.325f, 13.475f, 5.325f)
            curveTo(13.475f, 5.325f, 12.552f, 5.193f, 12.552f, 5.034f)
            curveTo(12.552f, 5.034f, 12.443f, 4.983f, 12.392f, 4.985f)
            curveTo(12.102f, 4.993f, 11.908f, 5.045f, 11.812f, 5.034f)
            curveTo(12.343f, 4.826f, 12.552f, 4.643f, 12.552f, 4.643f)
            curveTo(12.552f, 4.643f, 12.917f, 4.3f, 13.196f, 4.3f)
            curveTo(13.475f, 4.3f, 14.406f, 4.874f, 14.406f, 4.874f)
            lineTo(14.629f, 4.643f)
            lineTo(13.475f, 3.762f)
            curveTo(11.122f, 4.009f, 9.78f, 3.418f, 9.78f, 3.418f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KiribatiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Kiribati,
            contentDescription = "Kiribati Flag"
        )
    }
}
