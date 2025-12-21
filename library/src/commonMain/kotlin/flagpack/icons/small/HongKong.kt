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
 * Hong Kong Flag (16x12dp)
 *
 * - ISO Alpha-2: HK
 * - ISO Alpha-3: HKG
 * - ISO Numeric: 344
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.HongKong: ImageVector by lazy {
    ImageVector.Builder(
        name = "Hong Kong:HK:HKG:344:Small",
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
                fill = SolidColor(Color(0xFFEA1A1A)),
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.935f, 5.787f)
                curveTo(7.935f, 5.787f, 5.04f, 3.206f, 8.494f, 1.702f)
                curveTo(8.494f, 1.702f, 9.499f, 2.81f, 8.745f, 4.054f)
                curveTo(8.498f, 4.462f, 8.289f, 4.754f, 8.133f, 4.973f)
                curveTo(7.812f, 5.421f, 7.708f, 5.566f, 7.935f, 5.787f)
                close()
                moveTo(3.662f, 3.934f)
                curveTo(3.464f, 7.696f, 7.067f, 6.261f, 7.067f, 6.261f)
                curveTo(6.768f, 6.365f, 6.685f, 6.207f, 6.427f, 5.72f)
                lineTo(6.427f, 5.72f)
                curveTo(6.301f, 5.482f, 6.134f, 5.165f, 5.879f, 4.761f)
                curveTo(5.103f, 3.531f, 3.662f, 3.934f, 3.662f, 3.934f)
                close()
                moveTo(9.119f, 5.914f)
                curveTo(9.119f, 5.914f, 12.835f, 7.026f, 10.343f, 9.852f)
                curveTo(10.343f, 9.852f, 8.963f, 9.273f, 9.119f, 7.827f)
                curveTo(9.17f, 7.353f, 9.236f, 7.001f, 9.285f, 6.736f)
                curveTo(9.386f, 6.193f, 9.418f, 6.018f, 9.119f, 5.914f)
                close()
                moveTo(8.142f, 6.781f)
                curveTo(8.142f, 6.781f, 8.809f, 10.602f, 5.167f, 9.636f)
                curveTo(5.167f, 9.636f, 5.068f, 8.144f, 6.431f, 7.636f)
                curveTo(6.878f, 7.47f, 7.222f, 7.371f, 7.481f, 7.297f)
                lineTo(7.481f, 7.297f)
                lineTo(7.481f, 7.297f)
                lineTo(7.481f, 7.297f)
                curveTo(8.011f, 7.144f, 8.182f, 7.095f, 8.142f, 6.781f)
                close()
                moveTo(12.739f, 5.138f)
                curveTo(10.462f, 2.137f, 8.637f, 5.559f, 8.637f, 5.559f)
                curveTo(8.799f, 5.287f, 8.964f, 5.353f, 9.475f, 5.559f)
                curveTo(9.725f, 5.66f, 10.057f, 5.793f, 10.513f, 5.937f)
                curveTo(11.9f, 6.376f, 12.739f, 5.138f, 12.739f, 5.138f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(5.081f, 5.104f)
                curveTo(5.081f, 5.104f, 5.808f, 6.25f, 7.001f, 6.25f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.93f, 3.525f)
                curveTo(7.93f, 3.525f, 7.277f, 4.73f, 7.837f, 5.783f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.055f, 4.881f)
                curveTo(11.055f, 4.881f, 9.53f, 4.65f, 8.732f, 5.535f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.164f, 7.672f)
                curveTo(10.164f, 7.672f, 9.86f, 6.16f, 8.755f, 5.714f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.967f, 8.493f)
                curveTo(6.967f, 8.493f, 8.284f, 7.69f, 8.325f, 6.499f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun HongKongPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.HongKong,
            contentDescription = "Hong Kong Flag"
        )
    }
}
