package flagpack.icons.small

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
 * French Polynesia Flag (16x12dp)
 *
 * - ISO Alpha-2: PF
 * - ISO Alpha-3: PYF
 * - ISO Numeric: 258
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.FrenchPolynesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Polynesia:PF:PYF:258:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(8f, 9f)
                curveTo(9.657f, 9f, 11f, 7.657f, 11f, 6f)
                curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
                curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
                curveTo(5f, 7.657f, 6.343f, 9f, 8f, 9f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFA8F21)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.019f, 6.688f)
                lineTo(7.239f, 3.075f)
                curveTo(5.951f, 3.339f, 5f, 4.314f, 5f, 6.102f)
                curveTo(5f, 7.045f, 5.627f, 6.933f, 6.553f, 6.767f)
                curveTo(6.701f, 6.741f, 6.857f, 6.713f, 7.019f, 6.688f)
                close()
                moveTo(8.447f, 3.027f)
                lineTo(8.958f, 6.699f)
                curveTo(9.143f, 6.733f, 9.319f, 6.771f, 9.486f, 6.808f)
                curveTo(10.39f, 7.004f, 11f, 7.137f, 11f, 6.102f)
                curveTo(11f, 4.257f, 9.892f, 3.204f, 8.447f, 3.027f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(9.657f, 9f, 11f, 8.105f, 11f, 7f)
                curveTo(11f, 5.895f, 9.657f, 5f, 8f, 5f)
                curveTo(6.343f, 5f, 5f, 5.895f, 5f, 7f)
                curveTo(5f, 8.105f, 6.343f, 9f, 8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.274f, 6.882f)
                curveTo(5.247f, 6.797f, 5.34f, 6.722f, 5.417f, 6.767f)
                lineTo(5.604f, 6.876f)
                curveTo(5.632f, 6.892f, 5.666f, 6.893f, 5.695f, 6.88f)
                lineTo(6.157f, 6.664f)
                curveTo(6.189f, 6.649f, 6.227f, 6.652f, 6.256f, 6.673f)
                lineTo(6.754f, 7.033f)
                lineTo(7.443f, 6.662f)
                curveTo(7.469f, 6.648f, 7.501f, 6.646f, 7.529f, 6.658f)
                lineTo(8.047f, 6.884f)
                curveTo(8.074f, 6.895f, 8.103f, 6.895f, 8.129f, 6.882f)
                lineTo(8.595f, 6.658f)
                curveTo(8.619f, 6.646f, 8.648f, 6.645f, 8.674f, 6.655f)
                lineTo(9.249f, 6.885f)
                curveTo(9.275f, 6.896f, 9.305f, 6.895f, 9.33f, 6.882f)
                lineTo(9.776f, 6.662f)
                curveTo(9.804f, 6.648f, 9.837f, 6.648f, 9.865f, 6.663f)
                lineTo(10.274f, 6.877f)
                curveTo(10.303f, 6.892f, 10.339f, 6.892f, 10.368f, 6.875f)
                lineTo(10.581f, 6.755f)
                curveTo(10.656f, 6.712f, 10.747f, 6.781f, 10.724f, 6.866f)
                lineTo(10.68f, 7.033f)
                horizontalLineTo(5.322f)
                lineTo(5.274f, 6.882f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.272f, 7.475f)
                curveTo(5.246f, 7.389f, 5.34f, 7.316f, 5.417f, 7.362f)
                lineTo(5.587f, 7.464f)
                curveTo(5.616f, 7.481f, 5.651f, 7.483f, 5.681f, 7.469f)
                lineTo(6.119f, 7.256f)
                curveTo(6.153f, 7.24f, 6.192f, 7.243f, 6.221f, 7.265f)
                lineTo(6.699f, 7.623f)
                lineTo(7.361f, 7.254f)
                curveTo(7.388f, 7.238f, 7.421f, 7.237f, 7.449f, 7.25f)
                lineTo(7.944f, 7.473f)
                curveTo(7.971f, 7.485f, 8.002f, 7.484f, 8.029f, 7.471f)
                lineTo(8.472f, 7.25f)
                curveTo(8.498f, 7.237f, 8.528f, 7.236f, 8.554f, 7.247f)
                lineTo(9.104f, 7.474f)
                curveTo(9.131f, 7.485f, 9.161f, 7.484f, 9.187f, 7.471f)
                lineTo(9.611f, 7.253f)
                curveTo(9.64f, 7.238f, 9.675f, 7.239f, 9.703f, 7.254f)
                lineTo(10.092f, 7.465f)
                curveTo(10.122f, 7.482f, 10.159f, 7.481f, 10.189f, 7.464f)
                lineTo(10.384f, 7.349f)
                curveTo(10.459f, 7.305f, 10.551f, 7.374f, 10.529f, 7.458f)
                lineTo(10.487f, 7.623f)
                horizontalLineTo(5.318f)
                lineTo(5.272f, 7.475f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.371f, 7.869f)
                curveTo(5.344f, 7.783f, 5.438f, 7.709f, 5.516f, 7.756f)
                lineTo(5.686f, 7.858f)
                curveTo(5.714f, 7.875f, 5.749f, 7.876f, 5.779f, 7.862f)
                lineTo(6.218f, 7.649f)
                curveTo(6.251f, 7.633f, 6.29f, 7.637f, 6.32f, 7.659f)
                lineTo(6.798f, 8.016f)
                lineTo(7.459f, 7.647f)
                curveTo(7.487f, 7.632f, 7.519f, 7.63f, 7.548f, 7.643f)
                lineTo(8.043f, 7.866f)
                curveTo(8.07f, 7.878f, 8.101f, 7.878f, 8.127f, 7.864f)
                lineTo(8.571f, 7.643f)
                curveTo(8.596f, 7.63f, 8.626f, 7.629f, 8.652f, 7.64f)
                lineTo(9.202f, 7.868f)
                curveTo(9.229f, 7.879f, 9.259f, 7.878f, 9.285f, 7.864f)
                lineTo(9.71f, 7.647f)
                curveTo(9.739f, 7.632f, 9.773f, 7.632f, 9.802f, 7.648f)
                lineTo(10.19f, 7.859f)
                curveTo(10.221f, 7.875f, 10.257f, 7.875f, 10.287f, 7.857f)
                lineTo(10.482f, 7.743f)
                curveTo(10.558f, 7.698f, 10.649f, 7.767f, 10.627f, 7.852f)
                lineTo(10.585f, 8.016f)
                horizontalLineTo(5.416f)
                lineTo(5.371f, 7.869f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.961f, 8.262f)
                curveTo(5.934f, 8.176f, 6.028f, 8.102f, 6.106f, 8.149f)
                lineTo(6.276f, 8.251f)
                curveTo(6.304f, 8.268f, 6.339f, 8.27f, 6.369f, 8.255f)
                lineTo(6.808f, 8.043f)
                curveTo(6.841f, 8.026f, 6.88f, 8.03f, 6.91f, 8.052f)
                lineTo(7.388f, 8.41f)
                lineTo(8.05f, 8.04f)
                curveTo(8.077f, 8.025f, 8.11f, 8.024f, 8.138f, 8.037f)
                lineTo(8.633f, 8.26f)
                curveTo(8.66f, 8.272f, 8.691f, 8.271f, 8.717f, 8.258f)
                lineTo(9.161f, 8.036f)
                curveTo(9.186f, 8.024f, 9.216f, 8.023f, 9.242f, 8.034f)
                lineTo(9.793f, 8.261f)
                curveTo(9.819f, 8.272f, 9.849f, 8.271f, 9.875f, 8.258f)
                lineTo(10.3f, 8.04f)
                curveTo(10.329f, 8.025f, 10.363f, 8.026f, 10.392f, 8.041f)
                lineTo(10.781f, 8.252f)
                curveTo(10.811f, 8.269f, 10.847f, 8.268f, 10.877f, 8.251f)
                lineTo(11.072f, 8.136f)
                curveTo(11.148f, 8.092f, 11.239f, 8.161f, 11.217f, 8.245f)
                lineTo(11.175f, 8.41f)
                horizontalLineTo(6.006f)
                lineTo(5.961f, 8.262f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.174f, 8.754f)
                curveTo(5.148f, 8.668f, 5.241f, 8.594f, 5.319f, 8.641f)
                lineTo(5.489f, 8.743f)
                curveTo(5.517f, 8.76f, 5.553f, 8.762f, 5.582f, 8.747f)
                lineTo(6.021f, 8.534f)
                curveTo(6.054f, 8.518f, 6.093f, 8.522f, 6.123f, 8.544f)
                lineTo(6.601f, 8.902f)
                lineTo(7.263f, 8.532f)
                curveTo(7.29f, 8.517f, 7.323f, 8.516f, 7.351f, 8.529f)
                lineTo(7.846f, 8.751f)
                curveTo(7.873f, 8.763f, 7.904f, 8.763f, 7.93f, 8.75f)
                lineTo(8.374f, 8.528f)
                curveTo(8.4f, 8.516f, 8.429f, 8.514f, 8.456f, 8.525f)
                lineTo(9.006f, 8.753f)
                curveTo(9.032f, 8.764f, 9.063f, 8.763f, 9.088f, 8.75f)
                lineTo(9.513f, 8.532f)
                curveTo(9.542f, 8.517f, 9.576f, 8.517f, 9.605f, 8.533f)
                lineTo(9.994f, 8.744f)
                curveTo(10.024f, 8.76f, 10.061f, 8.76f, 10.09f, 8.742f)
                lineTo(10.285f, 8.628f)
                curveTo(10.361f, 8.584f, 10.452f, 8.652f, 10.431f, 8.737f)
                lineTo(10.388f, 8.902f)
                horizontalLineTo(5.22f)
                lineTo(5.174f, 8.754f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(6.334f, 4.723f)
                horizontalLineTo(6.834f)
                lineTo(6.822f, 6.699f)
                curveTo(6.906f, 6.965f, 7.026f, 7.069f, 7.211f, 7.069f)
                verticalLineTo(7.569f)
                curveTo(6.789f, 7.569f, 6.49f, 7.31f, 6.334f, 6.774f)
                verticalLineTo(4.723f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(9.596f, 4.723f)
                horizontalLineTo(9.096f)
                lineTo(9.108f, 6.699f)
                curveTo(9.024f, 6.965f, 8.904f, 7.069f, 8.718f, 7.069f)
                verticalLineTo(7.569f)
                curveTo(9.14f, 7.569f, 9.439f, 7.31f, 9.596f, 6.774f)
                verticalLineTo(4.723f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.362f, 3.454f)
                curveTo(8.362f, 3.454f, 7.533f, 3.237f, 7.533f, 3.787f)
                curveTo(7.533f, 4.337f, 7.533f, 5.518f, 7.533f, 5.518f)
                lineTo(8.5f, 5.806f)
                verticalLineTo(4.391f)
                curveTo(8.5f, 4.391f, 8.016f, 4.095f, 8.016f, 3.864f)
                curveTo(8.016f, 3.633f, 8.362f, 3.454f, 8.362f, 3.454f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.967f, 6.445f)
                lineTo(7.282f, 6.042f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.254f, 6.432f)
                lineTo(6.952f, 6.027f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.419f, 6.445f)
                lineTo(7.735f, 6.042f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.707f, 6.432f)
                lineTo(7.405f, 6.027f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.852f, 6.445f)
                lineTo(8.168f, 6.042f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.14f, 6.432f)
                lineTo(7.838f, 6.027f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.305f, 6.445f)
                lineTo(8.62f, 6.042f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.592f, 6.432f)
                lineTo(8.29f, 6.027f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.757f, 6.445f)
                lineTo(9.072f, 6.042f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.045f, 6.432f)
                lineTo(8.742f, 6.027f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchPolynesiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.FrenchPolynesia,
            contentDescription = "French Polynesia Flag"
        )
    }
}
