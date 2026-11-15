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
 * Vatican City Flag (32x24dp)
 *
 * - ISO Alpha-2: VA
 * - ISO Alpha-3: VAT
 * - ISO Numeric: 336
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.VaticanCity: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vatican City:VA:VAT:336:Large",
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(22.782f, 12.751f)
                lineTo(22.436f, 12.774f)
                curveTo(22.519f, 13.959f, 22.774f, 14.875f, 23.206f, 15.522f)
                curveTo(23.903f, 16.564f, 24.823f, 17.37f, 25.439f, 17.37f)
                curveTo(25.579f, 17.37f, 25.611f, 17.422f, 25.565f, 17.55f)
                curveTo(25.5f, 17.733f, 25.292f, 17.912f, 25.025f, 17.981f)
                curveTo(24.581f, 18.095f, 23.572f, 18.154f, 22.014f, 18.154f)
                verticalLineTo(18.489f)
                curveTo(23.603f, 18.489f, 24.631f, 18.429f, 25.114f, 18.304f)
                curveTo(25.49f, 18.208f, 25.788f, 17.95f, 25.892f, 17.66f)
                curveTo(26.012f, 17.326f, 25.83f, 17.035f, 25.439f, 17.035f)
                curveTo(24.982f, 17.035f, 24.133f, 16.292f, 23.496f, 15.34f)
                curveTo(23.1f, 14.748f, 22.86f, 13.885f, 22.782f, 12.751f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(21.147f, 12.751f)
                lineTo(21.492f, 12.774f)
                curveTo(21.41f, 13.959f, 21.155f, 14.875f, 20.723f, 15.522f)
                curveTo(20.025f, 16.564f, 19.105f, 17.37f, 18.49f, 17.37f)
                curveTo(18.35f, 17.37f, 18.317f, 17.422f, 18.364f, 17.55f)
                curveTo(18.429f, 17.733f, 18.636f, 17.912f, 18.903f, 17.981f)
                curveTo(19.347f, 18.095f, 20.356f, 18.154f, 21.914f, 18.154f)
                verticalLineTo(18.489f)
                curveTo(20.325f, 18.489f, 19.298f, 18.429f, 18.814f, 18.304f)
                curveTo(18.439f, 18.208f, 18.141f, 17.95f, 18.037f, 17.66f)
                curveTo(17.916f, 17.326f, 18.098f, 17.035f, 18.49f, 17.035f)
                curveTo(18.947f, 17.035f, 19.795f, 16.292f, 20.432f, 15.34f)
                curveTo(20.828f, 14.748f, 21.068f, 13.885f, 21.147f, 12.751f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(28.067f, 6.798f)
                lineTo(18.925f, 13.924f)
                curveTo(18.605f, 13.82f, 18.256f, 13.763f, 17.892f, 13.763f)
                curveTo(16.409f, 13.763f, 15.168f, 14.71f, 15.168f, 15.94f)
                curveTo(15.168f, 17.169f, 16.409f, 18.116f, 17.892f, 18.116f)
                curveTo(18.062f, 18.116f, 18.229f, 18.104f, 18.391f, 18.08f)
                curveTo(18.241f, 17.963f, 18.129f, 17.816f, 18.073f, 17.66f)
                curveTo(18.006f, 17.473f, 18.033f, 17.3f, 18.139f, 17.183f)
                curveTo(18.058f, 17.191f, 17.976f, 17.195f, 17.892f, 17.195f)
                curveTo(16.891f, 17.195f, 16.119f, 16.606f, 16.119f, 15.94f)
                curveTo(16.119f, 15.273f, 16.891f, 14.684f, 17.892f, 14.684f)
                curveTo(18.893f, 14.684f, 19.665f, 15.273f, 19.665f, 15.94f)
                curveTo(19.665f, 16.143f, 19.593f, 16.34f, 19.464f, 16.515f)
                curveTo(19.488f, 16.493f, 19.512f, 16.471f, 19.537f, 16.448f)
                curveTo(19.854f, 16.153f, 19.142f, 17.37f, 18.526f, 17.37f)
                curveTo(18.386f, 17.37f, 18.354f, 17.422f, 18.4f, 17.55f)
                curveTo(18.461f, 17.721f, 18.647f, 17.889f, 18.89f, 17.966f)
                curveTo(19.892f, 17.653f, 20.616f, 16.878f, 20.616f, 15.94f)
                curveTo(20.616f, 15.556f, 20.495f, 15.199f, 20.283f, 14.89f)
                lineTo(25.196f, 10.721f)
                lineTo(25.525f, 11.06f)
                lineTo(25.762f, 10.846f)
                lineTo(26.582f, 11.454f)
                lineTo(26.239f, 11.718f)
                lineTo(26.94f, 12.57f)
                lineTo(28.353f, 11.481f)
                lineTo(28.377f, 11.468f)
                lineTo(28.372f, 11.465f)
                lineTo(28.46f, 11.398f)
                lineTo(27.76f, 10.546f)
                lineTo(27.421f, 10.807f)
                lineTo(26.503f, 10.173f)
                lineTo(26.611f, 10.075f)
                lineTo(26.316f, 9.77f)
                lineTo(26.76f, 9.394f)
                lineTo(26.995f, 9.637f)
                lineTo(27.248f, 9.408f)
                lineTo(28.044f, 10.037f)
                lineTo(27.709f, 10.295f)
                lineTo(28.41f, 11.146f)
                lineTo(29.62f, 10.213f)
                lineTo(29.759f, 10.137f)
                lineTo(29.739f, 10.122f)
                lineTo(29.93f, 9.974f)
                lineTo(29.23f, 9.123f)
                lineTo(28.834f, 9.428f)
                lineTo(27.963f, 8.759f)
                lineTo(28.081f, 8.652f)
                lineTo(27.879f, 8.443f)
                lineTo(28.784f, 7.676f)
                lineTo(28.067f, 6.798f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBFBFBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.686f, 14.726f)
                curveTo(15.949f, 14.726f, 16.162f, 14.557f, 16.162f, 14.349f)
                curveTo(16.162f, 14.141f, 15.949f, 13.972f, 15.686f, 13.972f)
                curveTo(15.424f, 13.972f, 15.211f, 14.141f, 15.211f, 14.349f)
                curveTo(15.211f, 14.557f, 15.424f, 14.726f, 15.686f, 14.726f)
                close()
                moveTo(15.859f, 18.158f)
                curveTo(16.122f, 18.158f, 16.335f, 17.99f, 16.335f, 17.781f)
                curveTo(16.335f, 17.573f, 16.122f, 17.405f, 15.859f, 17.405f)
                curveTo(15.597f, 17.405f, 15.384f, 17.573f, 15.384f, 17.781f)
                curveTo(15.384f, 17.99f, 15.597f, 18.158f, 15.859f, 18.158f)
                close()
                moveTo(20.573f, 17.781f)
                curveTo(20.573f, 17.99f, 20.36f, 18.158f, 20.097f, 18.158f)
                curveTo(19.835f, 18.158f, 19.622f, 17.99f, 19.622f, 17.781f)
                curveTo(19.622f, 17.573f, 19.835f, 17.405f, 20.097f, 17.405f)
                curveTo(20.36f, 17.405f, 20.573f, 17.573f, 20.573f, 17.781f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBFBFBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.384f, 15.939f)
                curveTo(23.384f, 15.387f, 23.635f, 14.891f, 24.045f, 14.513f)
                lineTo(18.796f, 10.448f)
                lineTo(18.736f, 10.494f)
                lineTo(18.889f, 10.633f)
                lineTo(18.475f, 11.06f)
                lineTo(18.257f, 10.863f)
                lineTo(17.454f, 11.481f)
                lineTo(17.761f, 11.718f)
                lineTo(17.06f, 12.57f)
                lineTo(15.662f, 11.492f)
                lineTo(15.623f, 11.468f)
                lineTo(15.627f, 11.465f)
                lineTo(15.54f, 11.398f)
                lineTo(16.24f, 10.546f)
                lineTo(16.579f, 10.807f)
                lineTo(17.497f, 10.173f)
                lineTo(17.389f, 10.075f)
                lineTo(17.786f, 9.666f)
                lineTo(17.323f, 9.308f)
                lineTo(17.005f, 9.637f)
                lineTo(16.761f, 9.416f)
                lineTo(15.976f, 10.052f)
                lineTo(16.291f, 10.295f)
                lineTo(15.59f, 11.146f)
                lineTo(14.418f, 10.243f)
                lineTo(14.241f, 10.137f)
                lineTo(14.261f, 10.122f)
                lineTo(14.07f, 9.974f)
                lineTo(14.77f, 9.123f)
                lineTo(15.166f, 9.428f)
                lineTo(16.037f, 8.759f)
                lineTo(15.919f, 8.652f)
                lineTo(16.158f, 8.405f)
                lineTo(15.216f, 7.676f)
                lineTo(15.811f, 6.957f)
                lineTo(24.892f, 13.99f)
                curveTo(25.26f, 13.844f, 25.674f, 13.763f, 26.108f, 13.763f)
                curveTo(27.591f, 13.763f, 28.832f, 14.71f, 28.832f, 15.939f)
                curveTo(28.832f, 17.169f, 27.591f, 18.116f, 26.108f, 18.116f)
                curveTo(25.938f, 18.116f, 25.771f, 18.104f, 25.609f, 18.08f)
                curveTo(25.759f, 17.963f, 25.871f, 17.816f, 25.927f, 17.66f)
                curveTo(25.994f, 17.473f, 25.967f, 17.3f, 25.861f, 17.183f)
                curveTo(25.942f, 17.191f, 26.024f, 17.195f, 26.108f, 17.195f)
                curveTo(27.109f, 17.195f, 27.881f, 16.606f, 27.881f, 15.939f)
                curveTo(27.881f, 15.273f, 27.109f, 14.684f, 26.108f, 14.684f)
                curveTo(25.107f, 14.684f, 24.335f, 15.273f, 24.335f, 15.939f)
                curveTo(24.335f, 16.143f, 24.407f, 16.34f, 24.536f, 16.515f)
                curveTo(24.512f, 16.493f, 24.488f, 16.471f, 24.463f, 16.448f)
                curveTo(24.146f, 16.153f, 24.858f, 17.37f, 25.474f, 17.37f)
                curveTo(25.614f, 17.37f, 25.646f, 17.422f, 25.6f, 17.55f)
                curveTo(25.539f, 17.721f, 25.353f, 17.889f, 25.11f, 17.966f)
                curveTo(24.108f, 17.653f, 23.384f, 16.878f, 23.384f, 15.939f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(28.313f, 14.726f)
                curveTo(28.051f, 14.726f, 27.838f, 14.557f, 27.838f, 14.349f)
                curveTo(27.838f, 14.141f, 28.051f, 13.972f, 28.313f, 13.972f)
                curveTo(28.576f, 13.972f, 28.789f, 14.141f, 28.789f, 14.349f)
                curveTo(28.789f, 14.557f, 28.576f, 14.726f, 28.313f, 14.726f)
                close()
                moveTo(28.14f, 18.158f)
                curveTo(27.878f, 18.158f, 27.665f, 17.99f, 27.665f, 17.781f)
                curveTo(27.665f, 17.573f, 27.878f, 17.405f, 28.14f, 17.405f)
                curveTo(28.403f, 17.405f, 28.616f, 17.573f, 28.616f, 17.781f)
                curveTo(28.616f, 17.99f, 28.403f, 18.158f, 28.14f, 18.158f)
                close()
                moveTo(23.427f, 17.781f)
                curveTo(23.427f, 17.99f, 23.64f, 18.158f, 23.903f, 18.158f)
                curveTo(24.165f, 18.158f, 24.378f, 17.99f, 24.378f, 17.781f)
                curveTo(24.378f, 17.573f, 24.165f, 17.405f, 23.903f, 17.405f)
                curveTo(23.64f, 17.405f, 23.427f, 17.573f, 23.427f, 17.781f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.74f, 11.795f)
                curveTo(21.669f, 11.795f, 21.611f, 11.853f, 21.611f, 11.925f)
                verticalLineTo(12.465f)
                horizontalLineTo(21.131f)
                curveTo(21.062f, 12.465f, 21.005f, 12.521f, 21.005f, 12.591f)
                curveTo(21.005f, 12.66f, 21.062f, 12.716f, 21.131f, 12.716f)
                horizontalLineTo(21.611f)
                verticalLineTo(19.87f)
                curveTo(21.611f, 19.942f, 21.669f, 20f, 21.74f, 20f)
                horizontalLineTo(22f)
                curveTo(22.072f, 20f, 22.13f, 19.942f, 22.13f, 19.87f)
                verticalLineTo(12.716f)
                horizontalLineTo(22.869f)
                curveTo(22.938f, 12.716f, 22.995f, 12.66f, 22.995f, 12.591f)
                curveTo(22.995f, 12.521f, 22.938f, 12.465f, 22.869f, 12.465f)
                horizontalLineTo(22.13f)
                verticalLineTo(11.925f)
                curveTo(22.13f, 11.853f, 22.072f, 11.795f, 22f, 11.795f)
                horizontalLineTo(21.74f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.754f, 7.594f)
                lineTo(16.966f, 7.739f)
                curveTo(17.459f, 7.065f, 17.903f, 6.93f, 18.355f, 7.284f)
                curveTo(19.135f, 7.894f, 19.202f, 9.383f, 18.368f, 9.882f)
                curveTo(17.374f, 10.476f, 16.87f, 11.636f, 17.311f, 12.267f)
                curveTo(17.718f, 12.85f, 18.699f, 12.629f, 19.667f, 11.898f)
                curveTo(19.839f, 11.768f, 20.003f, 11.629f, 20.157f, 11.484f)
                lineTo(19.952f, 11.326f)
                curveTo(19.812f, 11.457f, 19.663f, 11.582f, 19.507f, 11.7f)
                curveTo(18.644f, 12.352f, 17.814f, 12.539f, 17.526f, 12.127f)
                curveTo(17.182f, 11.635f, 17.622f, 10.624f, 18.505f, 10.095f)
                curveTo(19.504f, 9.498f, 19.427f, 7.8f, 18.518f, 7.088f)
                curveTo(17.932f, 6.629f, 17.325f, 6.814f, 16.754f, 7.594f)
                close()
                moveTo(20.563f, 10.645f)
                lineTo(20.774f, 10.791f)
                curveTo(21.141f, 10.296f, 21.392f, 9.759f, 21.475f, 9.231f)
                lineTo(21.218f, 9.193f)
                curveTo(21.142f, 9.68f, 20.907f, 10.18f, 20.563f, 10.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(27.269f, 7.594f)
                lineTo(27.058f, 7.739f)
                curveTo(26.564f, 7.065f, 26.121f, 6.93f, 25.669f, 7.284f)
                curveTo(24.889f, 7.894f, 24.822f, 9.383f, 25.656f, 9.882f)
                curveTo(26.65f, 10.476f, 27.154f, 11.636f, 26.713f, 12.267f)
                curveTo(26.306f, 12.85f, 25.325f, 12.629f, 24.357f, 11.898f)
                curveTo(24.185f, 11.768f, 24.021f, 11.629f, 23.867f, 11.484f)
                lineTo(24.072f, 11.326f)
                curveTo(24.212f, 11.457f, 24.361f, 11.582f, 24.517f, 11.7f)
                curveTo(25.38f, 12.352f, 26.21f, 12.539f, 26.498f, 12.127f)
                curveTo(26.842f, 11.635f, 26.402f, 10.624f, 25.519f, 10.095f)
                curveTo(24.52f, 9.498f, 24.597f, 7.8f, 25.506f, 7.088f)
                curveTo(26.092f, 6.629f, 26.699f, 6.814f, 27.269f, 7.594f)
                close()
                moveTo(23.462f, 10.645f)
                lineTo(23.25f, 10.791f)
                curveTo(22.883f, 10.296f, 22.632f, 9.759f, 22.549f, 9.231f)
                lineTo(22.806f, 9.193f)
                curveTo(22.882f, 9.68f, 23.117f, 10.18f, 23.462f, 10.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.87f, 20.017f)
                curveTo(22.157f, 20.017f, 22.389f, 19.9f, 22.389f, 19.757f)
                curveTo(22.389f, 19.614f, 22.157f, 19.498f, 21.87f, 19.498f)
                curveTo(21.584f, 19.498f, 21.351f, 19.614f, 21.351f, 19.757f)
                curveTo(21.351f, 19.9f, 21.584f, 20.017f, 21.87f, 20.017f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.784f, 9.219f)
                curveTo(22.787f, 9.219f, 23.6f, 9.084f, 23.6f, 8.917f)
                curveTo(23.6f, 8.749f, 22.787f, 8.614f, 21.784f, 8.614f)
                curveTo(20.781f, 8.614f, 19.968f, 8.749f, 19.968f, 8.917f)
                curveTo(19.968f, 9.084f, 20.781f, 9.219f, 21.784f, 9.219f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.886f, 2.038f)
                horizontalLineTo(21.627f)
                verticalLineTo(2.338f)
                horizontalLineTo(21.381f)
                verticalLineTo(2.589f)
                horizontalLineTo(21.627f)
                verticalLineTo(3.322f)
                horizontalLineTo(21.886f)
                verticalLineTo(2.589f)
                horizontalLineTo(22.185f)
                verticalLineTo(2.338f)
                horizontalLineTo(21.886f)
                verticalLineTo(2.038f)
                close()
                moveTo(19.935f, 5.657f)
                lineTo(19.819f, 5.462f)
                curveTo(19.883f, 5.435f, 19.947f, 5.41f, 20.014f, 5.386f)
                lineTo(19.676f, 4.646f)
                lineTo(19.913f, 4.545f)
                lineTo(20.261f, 5.307f)
                curveTo(20.334f, 5.285f, 20.41f, 5.266f, 20.486f, 5.248f)
                curveTo(20.433f, 5.188f, 20.4f, 5.105f, 20.4f, 5.014f)
                curveTo(20.4f, 4.829f, 20.535f, 4.679f, 20.703f, 4.679f)
                curveTo(20.87f, 4.679f, 21.005f, 4.829f, 21.005f, 5.014f)
                curveTo(21.005f, 5.066f, 20.995f, 5.116f, 20.975f, 5.16f)
                curveTo(21.181f, 5.132f, 21.396f, 5.115f, 21.619f, 5.109f)
                verticalLineTo(4.825f)
                horizontalLineTo(21.294f)
                verticalLineTo(4.623f)
                horizontalLineTo(21.619f)
                verticalLineTo(4.383f)
                horizontalLineTo(21.962f)
                verticalLineTo(4.623f)
                horizontalLineTo(22.358f)
                verticalLineTo(4.825f)
                horizontalLineTo(21.962f)
                verticalLineTo(5.107f)
                curveTo(22.217f, 5.111f, 22.456f, 5.129f, 22.679f, 5.16f)
                curveTo(22.66f, 5.116f, 22.649f, 5.066f, 22.649f, 5.014f)
                curveTo(22.649f, 4.829f, 22.784f, 4.679f, 22.951f, 4.679f)
                curveTo(23.118f, 4.679f, 23.254f, 4.829f, 23.254f, 5.014f)
                curveTo(23.254f, 5.109f, 23.219f, 5.194f, 23.161f, 5.255f)
                curveTo(23.258f, 5.28f, 23.351f, 5.309f, 23.44f, 5.34f)
                lineTo(23.688f, 4.796f)
                lineTo(23.926f, 4.897f)
                lineTo(23.679f, 5.438f)
                curveTo(23.699f, 5.446f, 23.718f, 5.456f, 23.737f, 5.465f)
                lineTo(23.607f, 5.653f)
                lineTo(23.586f, 5.643f)
                lineTo(23.546f, 5.731f)
                lineTo(23.308f, 5.629f)
                lineTo(23.347f, 5.544f)
                curveTo(22.969f, 5.408f, 22.507f, 5.335f, 21.962f, 5.325f)
                verticalLineTo(5.415f)
                horizontalLineTo(21.619f)
                verticalLineTo(5.327f)
                curveTo(20.973f, 5.347f, 20.411f, 5.457f, 19.935f, 5.657f)
                close()
                moveTo(19.819f, 5.88f)
                lineTo(19.88f, 5.982f)
                lineTo(19.676f, 6.069f)
                lineTo(20.014f, 6.81f)
                curveTo(19.947f, 6.833f, 19.883f, 6.858f, 19.819f, 6.885f)
                lineTo(19.935f, 7.08f)
                curveTo(20.411f, 6.88f, 20.973f, 6.77f, 21.619f, 6.75f)
                verticalLineTo(6.838f)
                horizontalLineTo(21.962f)
                verticalLineTo(6.748f)
                curveTo(22.507f, 6.758f, 22.969f, 6.832f, 23.347f, 6.967f)
                lineTo(23.308f, 7.052f)
                lineTo(23.546f, 7.154f)
                lineTo(23.586f, 7.066f)
                lineTo(23.607f, 7.077f)
                lineTo(23.737f, 6.888f)
                curveTo(23.718f, 6.879f, 23.699f, 6.87f, 23.679f, 6.861f)
                lineTo(23.926f, 6.32f)
                lineTo(23.688f, 6.219f)
                lineTo(23.44f, 6.764f)
                curveTo(23.351f, 6.732f, 23.258f, 6.704f, 23.161f, 6.678f)
                curveTo(23.219f, 6.617f, 23.254f, 6.532f, 23.254f, 6.437f)
                curveTo(23.254f, 6.252f, 23.118f, 6.102f, 22.951f, 6.102f)
                curveTo(22.784f, 6.102f, 22.649f, 6.252f, 22.649f, 6.437f)
                curveTo(22.649f, 6.49f, 22.66f, 6.539f, 22.679f, 6.584f)
                curveTo(22.456f, 6.552f, 22.217f, 6.535f, 21.962f, 6.53f)
                verticalLineTo(6.248f)
                horizontalLineTo(22.358f)
                verticalLineTo(6.046f)
                horizontalLineTo(21.962f)
                verticalLineTo(5.806f)
                horizontalLineTo(21.619f)
                verticalLineTo(6.046f)
                horizontalLineTo(21.294f)
                verticalLineTo(6.248f)
                horizontalLineTo(21.619f)
                verticalLineTo(6.532f)
                curveTo(21.396f, 6.539f, 21.181f, 6.556f, 20.975f, 6.583f)
                curveTo(20.995f, 6.539f, 21.005f, 6.489f, 21.005f, 6.437f)
                curveTo(21.005f, 6.252f, 20.87f, 6.102f, 20.703f, 6.102f)
                curveTo(20.535f, 6.102f, 20.4f, 6.252f, 20.4f, 6.437f)
                curveTo(20.4f, 6.528f, 20.433f, 6.611f, 20.486f, 6.671f)
                curveTo(20.41f, 6.689f, 20.334f, 6.709f, 20.261f, 6.73f)
                lineTo(19.958f, 6.066f)
                curveTo(20.482f, 5.851f, 21.107f, 5.742f, 21.834f, 5.742f)
                curveTo(22.569f, 5.742f, 23.16f, 5.853f, 23.607f, 6.072f)
                lineTo(23.737f, 5.884f)
                curveTo(23.247f, 5.643f, 22.612f, 5.524f, 21.834f, 5.524f)
                curveTo(21.058f, 5.524f, 20.386f, 5.643f, 19.819f, 5.88f)
                close()
                moveTo(19.819f, 7.303f)
                lineTo(19.88f, 7.405f)
                lineTo(19.676f, 7.493f)
                lineTo(20.014f, 8.233f)
                curveTo(19.947f, 8.256f, 19.883f, 8.282f, 19.819f, 8.308f)
                lineTo(19.935f, 8.503f)
                curveTo(20.411f, 8.303f, 20.973f, 8.193f, 21.619f, 8.174f)
                verticalLineTo(8.261f)
                horizontalLineTo(21.962f)
                verticalLineTo(8.172f)
                curveTo(22.507f, 8.181f, 22.969f, 8.255f, 23.347f, 8.391f)
                lineTo(23.308f, 8.476f)
                lineTo(23.546f, 8.577f)
                lineTo(23.586f, 8.49f)
                lineTo(23.607f, 8.5f)
                lineTo(23.737f, 8.312f)
                curveTo(23.718f, 8.302f, 23.699f, 8.293f, 23.679f, 8.284f)
                lineTo(23.926f, 7.744f)
                lineTo(23.688f, 7.642f)
                lineTo(23.44f, 8.187f)
                curveTo(23.351f, 8.155f, 23.258f, 8.127f, 23.161f, 8.102f)
                curveTo(23.219f, 8.041f, 23.254f, 7.955f, 23.254f, 7.86f)
                curveTo(23.254f, 7.676f, 23.118f, 7.526f, 22.951f, 7.526f)
                curveTo(22.784f, 7.526f, 22.649f, 7.676f, 22.649f, 7.86f)
                curveTo(22.649f, 7.913f, 22.66f, 7.963f, 22.679f, 8.007f)
                curveTo(22.456f, 7.976f, 22.217f, 7.958f, 21.962f, 7.953f)
                verticalLineTo(7.672f)
                horizontalLineTo(22.358f)
                verticalLineTo(7.47f)
                horizontalLineTo(21.962f)
                verticalLineTo(7.229f)
                horizontalLineTo(21.619f)
                verticalLineTo(7.47f)
                horizontalLineTo(21.294f)
                verticalLineTo(7.672f)
                horizontalLineTo(21.619f)
                verticalLineTo(7.955f)
                curveTo(21.396f, 7.962f, 21.181f, 7.979f, 20.975f, 8.006f)
                curveTo(20.995f, 7.962f, 21.005f, 7.913f, 21.005f, 7.86f)
                curveTo(21.005f, 7.676f, 20.87f, 7.526f, 20.703f, 7.526f)
                curveTo(20.535f, 7.526f, 20.4f, 7.676f, 20.4f, 7.86f)
                curveTo(20.4f, 7.952f, 20.433f, 8.034f, 20.486f, 8.095f)
                curveTo(20.41f, 8.112f, 20.334f, 8.132f, 20.261f, 8.153f)
                lineTo(19.958f, 7.489f)
                curveTo(20.482f, 7.274f, 21.107f, 7.166f, 21.834f, 7.166f)
                curveTo(22.569f, 7.166f, 23.16f, 7.276f, 23.607f, 7.495f)
                lineTo(23.737f, 7.307f)
                curveTo(23.247f, 7.067f, 22.612f, 6.948f, 21.834f, 6.948f)
                curveTo(21.058f, 6.948f, 20.386f, 7.066f, 19.819f, 7.303f)
                close()
                moveTo(19.819f, 8.727f)
                lineTo(19.935f, 8.922f)
                curveTo(20.463f, 8.7f, 21.096f, 8.589f, 21.834f, 8.589f)
                curveTo(22.569f, 8.589f, 23.16f, 8.7f, 23.607f, 8.918f)
                lineTo(23.737f, 8.73f)
                curveTo(23.247f, 8.49f, 22.612f, 8.371f, 21.834f, 8.371f)
                curveTo(21.058f, 8.371f, 20.386f, 8.489f, 19.819f, 8.727f)
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
            imageVector = FlagIcons.Large.VaticanCity,
            contentDescription = "Vatican City Flag"
        )
    }
}
