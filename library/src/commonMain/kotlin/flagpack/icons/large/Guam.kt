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
 * Guam Flag (32x24dp)
 *
 * - ISO Alpha-2: GU
 * - ISO Alpha-3: GUM
 * - ISO Numeric: 316
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Guam: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guam:GU:GUM:316:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                horizontalLineTo(28f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFCBDAFF)),
                strokeAlpha = 0.1f,
                strokeLineWidth = 2f
            ) {
                moveTo(5f, 5f)
                horizontalLineTo(27f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5f, 5f)
                horizontalLineTo(27f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveTo(4f, 4f)
                horizontalLineTo(28f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFFC1C9F1)),
                strokeAlpha = 0.1182f,
                strokeLineWidth = 2.9f
            ) {
                moveTo(16.5f, 5f)
                lineTo(17.107f, 3.683f)
                lineTo(16.486f, 3.397f)
                lineTo(15.87f, 3.694f)
                lineTo(16.5f, 5f)
                close()
                moveTo(16.5f, 5f)
                curveTo(17.107f, 3.683f, 17.107f, 3.683f, 17.108f, 3.683f)
                lineTo(17.109f, 3.684f)
                lineTo(17.111f, 3.685f)
                lineTo(17.117f, 3.688f)
                lineTo(17.136f, 3.697f)
                curveTo(17.151f, 3.704f, 17.171f, 3.713f, 17.196f, 3.726f)
                curveTo(17.246f, 3.75f, 17.315f, 3.784f, 17.401f, 3.828f)
                curveTo(17.572f, 3.917f, 17.811f, 4.045f, 18.095f, 4.212f)
                curveTo(18.66f, 4.544f, 19.419f, 5.039f, 20.185f, 5.686f)
                curveTo(21.665f, 6.936f, 23.45f, 8.993f, 23.45f, 11.753f)
                curveTo(23.45f, 14.484f, 21.695f, 16.659f, 20.24f, 18.018f)
                curveTo(19.483f, 18.725f, 18.733f, 19.282f, 18.173f, 19.661f)
                curveTo(17.892f, 19.852f, 17.656f, 20f, 17.487f, 20.102f)
                curveTo(17.403f, 20.153f, 17.334f, 20.193f, 17.285f, 20.222f)
                curveTo(17.261f, 20.236f, 17.242f, 20.247f, 17.227f, 20.255f)
                lineTo(17.209f, 20.265f)
                lineTo(17.203f, 20.268f)
                lineTo(17.201f, 20.269f)
                lineTo(17.2f, 20.27f)
                curveTo(17.2f, 20.27f, 17.199f, 20.27f, 16.5f, 19f)
                moveTo(16.5f, 5f)
                curveTo(15.87f, 3.694f, 15.87f, 3.694f, 15.869f, 3.694f)
                lineTo(15.868f, 3.695f)
                lineTo(15.866f, 3.696f)
                lineTo(15.86f, 3.699f)
                lineTo(15.842f, 3.708f)
                curveTo(15.827f, 3.715f, 15.807f, 3.725f, 15.783f, 3.738f)
                curveTo(15.733f, 3.763f, 15.664f, 3.798f, 15.579f, 3.844f)
                curveTo(15.409f, 3.935f, 15.171f, 4.067f, 14.889f, 4.239f)
                curveTo(14.327f, 4.58f, 13.571f, 5.084f, 12.808f, 5.737f)
                curveTo(11.343f, 6.989f, 9.55f, 9.047f, 9.55f, 11.753f)
                curveTo(9.55f, 14.43f, 11.312f, 16.606f, 12.754f, 17.968f)
                curveTo(13.508f, 18.68f, 14.255f, 19.247f, 14.812f, 19.634f)
                curveTo(15.092f, 19.829f, 15.327f, 19.981f, 15.495f, 20.086f)
                curveTo(15.579f, 20.139f, 15.647f, 20.18f, 15.695f, 20.209f)
                curveTo(15.719f, 20.223f, 15.739f, 20.235f, 15.753f, 20.243f)
                lineTo(15.77f, 20.253f)
                lineTo(15.776f, 20.257f)
                lineTo(15.778f, 20.258f)
                lineTo(15.779f, 20.258f)
                curveTo(15.78f, 20.258f, 15.78f, 20.259f, 16.5f, 19f)
                moveTo(16.5f, 19f)
                lineTo(17.199f, 20.27f)
                lineTo(16.486f, 20.663f)
                lineTo(15.78f, 20.259f)
                lineTo(16.5f, 19f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCCE0E5))) {
                moveTo(16.4f, 6.037f)
                lineTo(17.087f, 4.76f)
                lineTo(16.384f, 4.382f)
                lineTo(15.689f, 4.773f)
                lineTo(16.4f, 6.037f)
                close()
                moveTo(16.4f, 6.037f)
                curveTo(17.087f, 4.76f, 17.087f, 4.76f, 17.087f, 4.76f)
                lineTo(17.088f, 4.761f)
                lineTo(17.091f, 4.762f)
                lineTo(17.096f, 4.765f)
                lineTo(17.112f, 4.774f)
                curveTo(17.125f, 4.78f, 17.141f, 4.789f, 17.16f, 4.801f)
                curveTo(17.2f, 4.823f, 17.253f, 4.854f, 17.319f, 4.894f)
                curveTo(17.451f, 4.973f, 17.632f, 5.086f, 17.846f, 5.233f)
                curveTo(18.272f, 5.526f, 18.842f, 5.96f, 19.418f, 6.526f)
                curveTo(20.541f, 7.634f, 21.85f, 9.417f, 21.85f, 11.768f)
                curveTo(21.85f, 14.094f, 20.564f, 15.972f, 19.469f, 17.166f)
                curveTo(18.904f, 17.781f, 18.344f, 18.266f, 17.925f, 18.597f)
                curveTo(17.715f, 18.764f, 17.537f, 18.894f, 17.408f, 18.985f)
                curveTo(17.344f, 19.03f, 17.292f, 19.066f, 17.254f, 19.091f)
                curveTo(17.235f, 19.104f, 17.219f, 19.115f, 17.208f, 19.122f)
                lineTo(17.193f, 19.132f)
                lineTo(17.187f, 19.135f)
                lineTo(17.185f, 19.137f)
                lineTo(17.184f, 19.137f)
                curveTo(17.184f, 19.138f, 17.184f, 19.138f, 16.4f, 17.918f)
                moveTo(16.4f, 6.037f)
                curveTo(15.689f, 4.773f, 15.689f, 4.773f, 15.688f, 4.774f)
                lineTo(15.687f, 4.774f)
                lineTo(15.685f, 4.775f)
                lineTo(15.679f, 4.778f)
                lineTo(15.664f, 4.787f)
                curveTo(15.652f, 4.794f, 15.636f, 4.804f, 15.617f, 4.815f)
                curveTo(15.578f, 4.838f, 15.525f, 4.87f, 15.46f, 4.911f)
                curveTo(15.33f, 4.992f, 15.15f, 5.109f, 14.937f, 5.259f)
                curveTo(14.515f, 5.559f, 13.948f, 6f, 13.376f, 6.571f)
                curveTo(12.266f, 7.678f, 10.95f, 9.461f, 10.95f, 11.768f)
                curveTo(10.95f, 14.049f, 12.243f, 15.927f, 13.326f, 17.122f)
                curveTo(13.887f, 17.741f, 14.444f, 18.233f, 14.861f, 18.572f)
                curveTo(15.07f, 18.742f, 15.246f, 18.875f, 15.373f, 18.968f)
                curveTo(15.437f, 19.014f, 15.489f, 19.051f, 15.526f, 19.077f)
                curveTo(15.545f, 19.09f, 15.56f, 19.1f, 15.572f, 19.108f)
                lineTo(15.586f, 19.118f)
                lineTo(15.591f, 19.121f)
                lineTo(15.593f, 19.123f)
                lineTo(15.594f, 19.123f)
                curveTo(15.595f, 19.124f, 15.595f, 19.124f, 16.4f, 17.918f)
                moveTo(16.4f, 17.918f)
                lineTo(17.184f, 19.138f)
                lineTo(16.385f, 19.651f)
                lineTo(15.595f, 19.124f)
                lineTo(16.4f, 17.918f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC1C9F1)),
                strokeAlpha = 0.748217f,
                strokeLineWidth = 2.9f
            ) {
                moveTo(16.4f, 6.037f)
                lineTo(17.087f, 4.76f)
                lineTo(16.384f, 4.382f)
                lineTo(15.689f, 4.773f)
                lineTo(16.4f, 6.037f)
                close()
                moveTo(16.4f, 6.037f)
                curveTo(17.087f, 4.76f, 17.087f, 4.76f, 17.087f, 4.76f)
                lineTo(17.088f, 4.761f)
                lineTo(17.091f, 4.762f)
                lineTo(17.096f, 4.765f)
                lineTo(17.112f, 4.774f)
                curveTo(17.125f, 4.78f, 17.141f, 4.789f, 17.16f, 4.801f)
                curveTo(17.2f, 4.823f, 17.253f, 4.854f, 17.319f, 4.894f)
                curveTo(17.451f, 4.973f, 17.632f, 5.086f, 17.846f, 5.233f)
                curveTo(18.272f, 5.526f, 18.842f, 5.96f, 19.418f, 6.526f)
                curveTo(20.541f, 7.634f, 21.85f, 9.417f, 21.85f, 11.768f)
                curveTo(21.85f, 14.094f, 20.564f, 15.972f, 19.469f, 17.166f)
                curveTo(18.904f, 17.781f, 18.344f, 18.266f, 17.925f, 18.597f)
                curveTo(17.715f, 18.764f, 17.537f, 18.894f, 17.408f, 18.985f)
                curveTo(17.344f, 19.03f, 17.292f, 19.066f, 17.254f, 19.091f)
                curveTo(17.235f, 19.104f, 17.219f, 19.115f, 17.208f, 19.122f)
                lineTo(17.193f, 19.132f)
                lineTo(17.187f, 19.135f)
                lineTo(17.185f, 19.137f)
                lineTo(17.184f, 19.137f)
                curveTo(17.184f, 19.138f, 17.184f, 19.138f, 16.4f, 17.918f)
                moveTo(16.4f, 6.037f)
                curveTo(15.689f, 4.773f, 15.689f, 4.773f, 15.688f, 4.774f)
                lineTo(15.687f, 4.774f)
                lineTo(15.685f, 4.775f)
                lineTo(15.679f, 4.778f)
                lineTo(15.664f, 4.787f)
                curveTo(15.652f, 4.794f, 15.636f, 4.804f, 15.617f, 4.815f)
                curveTo(15.578f, 4.838f, 15.525f, 4.87f, 15.46f, 4.911f)
                curveTo(15.33f, 4.992f, 15.15f, 5.109f, 14.937f, 5.259f)
                curveTo(14.515f, 5.559f, 13.948f, 6f, 13.376f, 6.571f)
                curveTo(12.266f, 7.678f, 10.95f, 9.461f, 10.95f, 11.768f)
                curveTo(10.95f, 14.049f, 12.243f, 15.927f, 13.326f, 17.122f)
                curveTo(13.887f, 17.741f, 14.444f, 18.233f, 14.861f, 18.572f)
                curveTo(15.07f, 18.742f, 15.246f, 18.875f, 15.373f, 18.968f)
                curveTo(15.437f, 19.014f, 15.489f, 19.051f, 15.526f, 19.077f)
                curveTo(15.545f, 19.09f, 15.56f, 19.1f, 15.572f, 19.108f)
                lineTo(15.586f, 19.118f)
                lineTo(15.591f, 19.121f)
                lineTo(15.593f, 19.123f)
                lineTo(15.594f, 19.123f)
                curveTo(15.595f, 19.124f, 15.595f, 19.124f, 16.4f, 17.918f)
                moveTo(16.4f, 17.918f)
                lineTo(17.184f, 19.138f)
                lineTo(16.385f, 19.651f)
                lineTo(15.595f, 19.124f)
                lineTo(16.4f, 17.918f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 2.9f
            ) {
                moveTo(16.4f, 6.037f)
                lineTo(17.087f, 4.76f)
                lineTo(16.384f, 4.382f)
                lineTo(15.689f, 4.773f)
                lineTo(16.4f, 6.037f)
                close()
                moveTo(16.4f, 6.037f)
                curveTo(17.087f, 4.76f, 17.087f, 4.76f, 17.087f, 4.76f)
                lineTo(17.088f, 4.761f)
                lineTo(17.091f, 4.762f)
                lineTo(17.096f, 4.765f)
                lineTo(17.112f, 4.774f)
                curveTo(17.125f, 4.78f, 17.141f, 4.789f, 17.16f, 4.801f)
                curveTo(17.2f, 4.823f, 17.253f, 4.854f, 17.319f, 4.894f)
                curveTo(17.451f, 4.973f, 17.632f, 5.086f, 17.846f, 5.233f)
                curveTo(18.272f, 5.526f, 18.842f, 5.96f, 19.418f, 6.526f)
                curveTo(20.541f, 7.634f, 21.85f, 9.417f, 21.85f, 11.768f)
                curveTo(21.85f, 14.094f, 20.564f, 15.972f, 19.469f, 17.166f)
                curveTo(18.904f, 17.781f, 18.344f, 18.266f, 17.925f, 18.597f)
                curveTo(17.715f, 18.764f, 17.537f, 18.894f, 17.408f, 18.985f)
                curveTo(17.344f, 19.03f, 17.292f, 19.066f, 17.254f, 19.091f)
                curveTo(17.235f, 19.104f, 17.219f, 19.115f, 17.208f, 19.122f)
                lineTo(17.193f, 19.132f)
                lineTo(17.187f, 19.135f)
                lineTo(17.185f, 19.137f)
                lineTo(17.184f, 19.137f)
                curveTo(17.184f, 19.138f, 17.184f, 19.138f, 16.4f, 17.918f)
                moveTo(16.4f, 6.037f)
                curveTo(15.689f, 4.773f, 15.689f, 4.773f, 15.688f, 4.774f)
                lineTo(15.687f, 4.774f)
                lineTo(15.685f, 4.775f)
                lineTo(15.679f, 4.778f)
                lineTo(15.664f, 4.787f)
                curveTo(15.652f, 4.794f, 15.636f, 4.804f, 15.617f, 4.815f)
                curveTo(15.578f, 4.838f, 15.525f, 4.87f, 15.46f, 4.911f)
                curveTo(15.33f, 4.992f, 15.15f, 5.109f, 14.937f, 5.259f)
                curveTo(14.515f, 5.559f, 13.948f, 6f, 13.376f, 6.571f)
                curveTo(12.266f, 7.678f, 10.95f, 9.461f, 10.95f, 11.768f)
                curveTo(10.95f, 14.049f, 12.243f, 15.927f, 13.326f, 17.122f)
                curveTo(13.887f, 17.741f, 14.444f, 18.233f, 14.861f, 18.572f)
                curveTo(15.07f, 18.742f, 15.246f, 18.875f, 15.373f, 18.968f)
                curveTo(15.437f, 19.014f, 15.489f, 19.051f, 15.526f, 19.077f)
                curveTo(15.545f, 19.09f, 15.56f, 19.1f, 15.572f, 19.108f)
                lineTo(15.586f, 19.118f)
                lineTo(15.591f, 19.121f)
                lineTo(15.593f, 19.123f)
                lineTo(15.594f, 19.123f)
                curveTo(15.595f, 19.124f, 15.595f, 19.124f, 16.4f, 17.918f)
                moveTo(16.4f, 17.918f)
                lineTo(17.184f, 19.138f)
                lineTo(16.385f, 19.651f)
                lineTo(15.595f, 19.124f)
                lineTo(16.4f, 17.918f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(17.332f, 15.205f)
                curveTo(17.013f, 15.553f, 16.691f, 15.851f, 16.412f, 16.088f)
                curveTo(16.128f, 15.842f, 15.8f, 15.533f, 15.474f, 15.174f)
                curveTo(14.557f, 14.163f, 13.85f, 12.966f, 13.85f, 11.768f)
                curveTo(13.85f, 10.594f, 14.534f, 9.512f, 15.424f, 8.624f)
                curveTo(15.77f, 8.279f, 16.119f, 7.991f, 16.413f, 7.772f)
                curveTo(16.702f, 7.983f, 17.044f, 8.259f, 17.382f, 8.592f)
                curveTo(18.259f, 9.456f, 18.95f, 10.538f, 18.95f, 11.768f)
                curveTo(18.95f, 13.022f, 18.236f, 14.219f, 17.332f, 15.205f)
                close()
                moveTo(15.709f, 7.312f)
                curveTo(15.709f, 7.312f, 15.709f, 7.312f, 15.711f, 7.313f)
                lineTo(15.711f, 7.312f)
                lineTo(15.709f, 7.312f)
                close()
                moveTo(17.332f, 15.205f)
                curveTo(17.013f, 15.553f, 16.691f, 15.851f, 16.412f, 16.088f)
                curveTo(16.128f, 15.842f, 15.8f, 15.533f, 15.474f, 15.174f)
                curveTo(14.557f, 14.163f, 13.85f, 12.966f, 13.85f, 11.768f)
                curveTo(13.85f, 10.594f, 14.534f, 9.512f, 15.424f, 8.624f)
                curveTo(15.77f, 8.279f, 16.119f, 7.991f, 16.413f, 7.772f)
                curveTo(16.702f, 7.983f, 17.044f, 8.259f, 17.382f, 8.592f)
                curveTo(18.259f, 9.456f, 18.95f, 10.538f, 18.95f, 11.768f)
                curveTo(18.95f, 13.022f, 18.236f, 14.219f, 17.332f, 15.205f)
                close()
                moveTo(15.709f, 7.312f)
                curveTo(15.709f, 7.312f, 15.709f, 7.312f, 15.711f, 7.313f)
                lineTo(15.711f, 7.312f)
                lineTo(15.709f, 7.312f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF91CBCB))) {
                moveTo(12.933f, 14f)
                horizontalLineToRelative(7.467f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-7.467f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDF9A1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.602f, 15.198f)
                curveTo(13.602f, 15.198f, 18.896f, 15.2f, 19.382f, 15.017f)
                curveTo(19.869f, 14.835f, 18.469f, 18.525f, 16.68f, 18.525f)
                curveTo(14.891f, 18.525f, 13.602f, 15.198f, 13.602f, 15.198f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA68861))) {
                moveTo(18.594f, 14.755f)
                lineTo(17.643f, 15.487f)
                curveTo(16.144f, 13.539f, 15.515f, 11.524f, 15.783f, 9.467f)
                lineTo(16.973f, 9.623f)
                curveTo(16.749f, 11.345f, 17.28f, 13.047f, 18.594f, 14.755f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.394f, 9.637f)
                lineTo(15.486f, 10.7f)
                curveTo(15.452f, 10.74f, 15.388f, 10.707f, 15.4f, 10.656f)
                lineTo(15.712f, 9.33f)
                horizontalLineTo(14.292f)
                curveTo(14.238f, 9.33f, 14.223f, 9.256f, 14.272f, 9.235f)
                lineTo(15.485f, 8.703f)
                lineTo(14.624f, 7.568f)
                curveTo(14.594f, 7.528f, 14.635f, 7.473f, 14.682f, 7.491f)
                lineTo(16.036f, 8.019f)
                lineTo(16.345f, 6.775f)
                curveTo(16.358f, 6.725f, 16.43f, 6.725f, 16.442f, 6.776f)
                lineTo(16.75f, 8.019f)
                lineTo(18.091f, 7.496f)
                curveTo(18.139f, 7.478f, 18.181f, 7.535f, 18.148f, 7.575f)
                lineTo(17.219f, 8.703f)
                lineTo(18.501f, 9.234f)
                curveTo(18.552f, 9.255f, 18.537f, 9.33f, 18.482f, 9.33f)
                horizontalLineTo(17.219f)
                lineTo(17.411f, 10.687f)
                curveTo(17.418f, 10.736f, 17.356f, 10.764f, 17.323f, 10.726f)
                lineTo(16.394f, 9.637f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.6f, 13f)
                horizontalLineTo(20.4f)
                verticalLineTo(14.05f)
                horizontalLineTo(15.6f)
                verticalLineTo(13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.872f, 12.393f)
                horizontalLineTo(14.867f)
                curveTo(14.853f, 12.444f, 14.819f, 12.487f, 14.766f, 12.521f)
                curveTo(14.712f, 12.555f, 14.642f, 12.572f, 14.557f, 12.572f)
                curveTo(14.488f, 12.572f, 14.426f, 12.56f, 14.369f, 12.535f)
                curveTo(14.312f, 12.51f, 14.263f, 12.474f, 14.222f, 12.427f)
                curveTo(14.182f, 12.379f, 14.15f, 12.319f, 14.127f, 12.248f)
                curveTo(14.104f, 12.178f, 14.093f, 12.096f, 14.093f, 12.004f)
                curveTo(14.093f, 11.912f, 14.104f, 11.831f, 14.126f, 11.76f)
                curveTo(14.149f, 11.689f, 14.181f, 11.63f, 14.222f, 11.582f)
                curveTo(14.264f, 11.535f, 14.314f, 11.498f, 14.373f, 11.473f)
                curveTo(14.431f, 11.448f, 14.497f, 11.435f, 14.568f, 11.435f)
                curveTo(14.668f, 11.435f, 14.752f, 11.457f, 14.819f, 11.501f)
                curveTo(14.886f, 11.545f, 14.938f, 11.604f, 14.974f, 11.676f)
                lineTo(14.864f, 11.742f)
                curveTo(14.838f, 11.683f, 14.8f, 11.637f, 14.75f, 11.604f)
                curveTo(14.699f, 11.57f, 14.638f, 11.553f, 14.568f, 11.553f)
                curveTo(14.519f, 11.553f, 14.474f, 11.562f, 14.434f, 11.579f)
                curveTo(14.393f, 11.596f, 14.358f, 11.621f, 14.329f, 11.652f)
                curveTo(14.299f, 11.684f, 14.277f, 11.722f, 14.261f, 11.766f)
                curveTo(14.245f, 11.81f, 14.237f, 11.859f, 14.237f, 11.914f)
                verticalLineTo(12.092f)
                curveTo(14.237f, 12.146f, 14.245f, 12.196f, 14.261f, 12.241f)
                curveTo(14.277f, 12.285f, 14.299f, 12.323f, 14.329f, 12.355f)
                curveTo(14.358f, 12.386f, 14.394f, 12.411f, 14.437f, 12.428f)
                curveTo(14.479f, 12.445f, 14.527f, 12.454f, 14.581f, 12.454f)
                curveTo(14.619f, 12.454f, 14.656f, 12.449f, 14.69f, 12.439f)
                curveTo(14.725f, 12.429f, 14.755f, 12.414f, 14.782f, 12.394f)
                curveTo(14.808f, 12.374f, 14.828f, 12.349f, 14.843f, 12.319f)
                curveTo(14.858f, 12.289f, 14.866f, 12.254f, 14.866f, 12.213f)
                verticalLineTo(12.104f)
                horizontalLineTo(14.619f)
                verticalLineTo(11.988f)
                horizontalLineTo(14.997f)
                verticalLineTo(12.553f)
                horizontalLineTo(14.872f)
                verticalLineTo(12.393f)
                close()
                moveTo(15.707f, 11.454f)
                verticalLineTo(12.134f)
                curveTo(15.707f, 12.239f, 15.727f, 12.319f, 15.766f, 12.373f)
                curveTo(15.806f, 12.427f, 15.875f, 12.454f, 15.974f, 12.454f)
                curveTo(16.074f, 12.454f, 16.143f, 12.427f, 16.182f, 12.373f)
                curveTo(16.222f, 12.319f, 16.242f, 12.239f, 16.242f, 12.134f)
                verticalLineTo(11.454f)
                horizontalLineTo(16.376f)
                verticalLineTo(12.103f)
                curveTo(16.376f, 12.183f, 16.369f, 12.252f, 16.354f, 12.311f)
                curveTo(16.34f, 12.37f, 16.317f, 12.418f, 16.285f, 12.457f)
                curveTo(16.253f, 12.496f, 16.211f, 12.525f, 16.159f, 12.544f)
                curveTo(16.107f, 12.563f, 16.044f, 12.572f, 15.97f, 12.572f)
                curveTo(15.895f, 12.572f, 15.832f, 12.563f, 15.782f, 12.544f)
                curveTo(15.731f, 12.525f, 15.69f, 12.496f, 15.659f, 12.457f)
                curveTo(15.628f, 12.418f, 15.606f, 12.37f, 15.593f, 12.311f)
                curveTo(15.579f, 12.252f, 15.573f, 12.183f, 15.573f, 12.103f)
                verticalLineTo(11.454f)
                horizontalLineTo(15.707f)
                close()
                moveTo(17.664f, 12.553f)
                lineTo(17.552f, 12.229f)
                horizontalLineTo(17.101f)
                lineTo(16.989f, 12.553f)
                horizontalLineTo(16.853f)
                lineTo(17.243f, 11.454f)
                horizontalLineTo(17.414f)
                lineTo(17.805f, 12.553f)
                horizontalLineTo(17.664f)
                close()
                moveTo(17.33f, 11.577f)
                horizontalLineTo(17.322f)
                lineTo(17.133f, 12.112f)
                horizontalLineTo(17.518f)
                lineTo(17.33f, 11.577f)
                close()
                moveTo(19.181f, 11.627f)
                horizontalLineTo(19.173f)
                lineTo(19.078f, 11.811f)
                lineTo(18.811f, 12.29f)
                lineTo(18.544f, 11.811f)
                lineTo(18.45f, 11.627f)
                horizontalLineTo(18.442f)
                verticalLineTo(12.553f)
                horizontalLineTo(18.31f)
                verticalLineTo(11.454f)
                horizontalLineTo(18.49f)
                lineTo(18.81f, 12.046f)
                horizontalLineTo(18.818f)
                lineTo(19.139f, 11.454f)
                horizontalLineTo(19.312f)
                verticalLineTo(12.553f)
                horizontalLineTo(19.181f)
                verticalLineTo(11.627f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Guam,
            contentDescription = "Guam Flag"
        )
    }
}
