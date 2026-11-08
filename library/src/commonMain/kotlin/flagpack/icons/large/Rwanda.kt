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
 * Rwanda Flag (32x24dp)
 *
 * - ISO Alpha-2: RW
 * - ISO Alpha-3: RWA
 * - ISO Numeric: 646
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Rwanda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Rwanda:RW:RWA:646:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF3CA5D9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5A962A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24.082f, 11.866f)
                curveTo(24.049f, 11.866f, 24.015f, 11.867f, 23.982f, 11.867f)
                curveTo(23.954f, 11.867f, 23.925f, 11.866f, 23.897f, 11.866f)
                lineTo(23.292f, 13.84f)
                lineTo(23.164f, 11.784f)
                curveTo(23.103f, 11.771f, 23.042f, 11.757f, 22.982f, 11.742f)
                lineTo(21.935f, 13.522f)
                lineTo(22.29f, 11.495f)
                curveTo(22.233f, 11.469f, 22.176f, 11.441f, 22.121f, 11.412f)
                lineTo(20.689f, 12.903f)
                lineTo(21.506f, 11.014f)
                curveTo(21.456f, 10.975f, 21.407f, 10.935f, 21.36f, 10.893f)
                lineTo(19.621f, 12.016f)
                lineTo(20.854f, 10.368f)
                curveTo(20.814f, 10.318f, 20.775f, 10.267f, 20.738f, 10.215f)
                lineTo(18.789f, 10.91f)
                lineTo(20.369f, 9.59f)
                curveTo(20.342f, 9.531f, 20.316f, 9.472f, 20.291f, 9.413f)
                lineTo(18.236f, 9.644f)
                lineTo(20.08f, 8.72f)
                curveTo(20.067f, 8.657f, 20.055f, 8.593f, 20.045f, 8.529f)
                lineTo(17.994f, 8.285f)
                lineTo(20.002f, 7.808f)
                curveTo(20.004f, 7.743f, 20.008f, 7.678f, 20.013f, 7.613f)
                lineTo(18.076f, 6.909f)
                lineTo(20.138f, 6.902f)
                curveTo(20.156f, 6.839f, 20.175f, 6.776f, 20.195f, 6.714f)
                lineTo(18.475f, 5.587f)
                lineTo(20.485f, 6.051f)
                curveTo(20.516f, 5.994f, 20.549f, 5.938f, 20.584f, 5.882f)
                lineTo(19.173f, 4.393f)
                lineTo(21.021f, 5.304f)
                curveTo(21.065f, 5.255f, 21.11f, 5.208f, 21.156f, 5.162f)
                lineTo(20.129f, 3.39f)
                lineTo(21.716f, 4.698f)
                curveTo(21.77f, 4.662f, 21.825f, 4.626f, 21.88f, 4.592f)
                lineTo(21.294f, 2.632f)
                lineTo(22.534f, 4.268f)
                curveTo(22.595f, 4.245f, 22.656f, 4.223f, 22.718f, 4.202f)
                lineTo(22.604f, 2.16f)
                lineTo(23.43f, 4.037f)
                curveTo(23.494f, 4.029f, 23.558f, 4.021f, 23.623f, 4.016f)
                lineTo(23.989f, 2f)
                lineTo(24.356f, 4.017f)
                curveTo(24.42f, 4.023f, 24.484f, 4.03f, 24.547f, 4.039f)
                lineTo(25.374f, 2.16f)
                lineTo(25.26f, 4.207f)
                curveTo(25.321f, 4.227f, 25.382f, 4.249f, 25.441f, 4.272f)
                lineTo(26.684f, 2.632f)
                lineTo(26.096f, 4.599f)
                curveTo(26.15f, 4.633f, 26.203f, 4.668f, 26.256f, 4.704f)
                lineTo(27.849f, 3.39f)
                lineTo(26.817f, 5.171f)
                curveTo(26.862f, 5.216f, 26.905f, 5.262f, 26.948f, 5.309f)
                lineTo(28.806f, 4.393f)
                lineTo(27.386f, 5.891f)
                curveTo(27.419f, 5.945f, 27.451f, 5.999f, 27.481f, 6.054f)
                lineTo(29.503f, 5.587f)
                lineTo(27.772f, 6.722f)
                curveTo(27.791f, 6.781f, 27.809f, 6.841f, 27.826f, 6.902f)
                lineTo(29.903f, 6.909f)
                lineTo(27.951f, 7.618f)
                curveTo(27.956f, 7.68f, 27.96f, 7.742f, 27.962f, 7.804f)
                lineTo(29.984f, 8.285f)
                lineTo(27.918f, 8.531f)
                curveTo(27.909f, 8.592f, 27.898f, 8.653f, 27.886f, 8.714f)
                lineTo(29.742f, 9.644f)
                lineTo(27.674f, 9.411f)
                curveTo(27.65f, 9.468f, 27.625f, 9.525f, 27.599f, 9.581f)
                lineTo(29.19f, 10.91f)
                lineTo(27.229f, 10.211f)
                curveTo(27.193f, 10.261f, 27.156f, 10.31f, 27.118f, 10.358f)
                lineTo(28.357f, 12.016f)
                lineTo(26.611f, 10.888f)
                curveTo(26.564f, 10.928f, 26.517f, 10.967f, 26.469f, 11.005f)
                lineTo(27.289f, 12.903f)
                lineTo(25.853f, 11.407f)
                curveTo(25.798f, 11.435f, 25.743f, 11.463f, 25.688f, 11.489f)
                lineTo(26.043f, 13.522f)
                lineTo(24.994f, 11.738f)
                curveTo(24.935f, 11.754f, 24.875f, 11.768f, 24.814f, 11.781f)
                lineTo(24.686f, 13.84f)
                lineTo(24.082f, 11.866f)
                close()
                moveTo(23.946f, 10.415f)
                curveTo(25.347f, 10.415f, 26.482f, 9.296f, 26.482f, 7.916f)
                curveTo(26.482f, 6.535f, 25.347f, 5.417f, 23.946f, 5.417f)
                curveTo(22.545f, 5.417f, 21.41f, 6.535f, 21.41f, 7.916f)
                curveTo(21.41f, 9.296f, 22.545f, 10.415f, 23.946f, 10.415f)
                close()
                moveTo(25.405f, 7.989f)
                curveTo(25.405f, 8.778f, 24.765f, 9.418f, 23.975f, 9.418f)
                curveTo(23.186f, 9.418f, 22.546f, 8.778f, 22.546f, 7.989f)
                curveTo(22.546f, 7.2f, 23.186f, 6.56f, 23.975f, 6.56f)
                curveTo(24.765f, 6.56f, 25.405f, 7.2f, 25.405f, 7.989f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun RwandaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Rwanda,
            contentDescription = "Rwanda Flag"
        )
    }
}
