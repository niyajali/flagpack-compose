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
 * Libya Flag (32x24dp)
 *
 * - ISO Alpha-2: LY
 * - ISO Alpha-3: LBY
 * - ISO Numeric: 434
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Libya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Libya:LY:LBY:434:Large",
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
                fill = SolidColor(Color(0xFF55BA07)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.798f, 15.066f)
                curveTo(14.005f, 14.696f, 13.54f, 13.758f, 13.56f, 12.311f)
                curveTo(13.56f, 10.781f, 14.366f, 9.232f, 15.779f, 9.062f)
                curveTo(17.193f, 8.893f, 18.351f, 9.42f, 18.958f, 10.156f)
                curveTo(18.45f, 8.159f, 16.768f, 7.94f, 15.477f, 7.94f)
                curveTo(13.534f, 7.923f, 11.54f, 9.4f, 11.54f, 12.179f)
                curveTo(11.54f, 14.599f, 13.297f, 16.419f, 15.533f, 16.464f)
                curveTo(18.329f, 16.464f, 18.767f, 14.534f, 18.847f, 13.876f)
                curveTo(18.686f, 13.992f, 18.535f, 14.13f, 18.381f, 14.273f)
                curveTo(17.819f, 14.79f, 17.204f, 15.356f, 15.798f, 15.066f)
                close()
                moveTo(20.263f, 11.291f)
                lineTo(18.939f, 11.708f)
                lineTo(20.422f, 12.288f)
                lineTo(20.215f, 13.842f)
                lineTo(21.22f, 12.773f)
                lineTo(22.678f, 13.073f)
                lineTo(21.693f, 11.921f)
                lineTo(22.565f, 10.744f)
                lineTo(21.347f, 11.001f)
                lineTo(20.487f, 10.029f)
                lineTo(20.263f, 11.291f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LibyaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Libya,
            contentDescription = "Libya Flag"
        )
    }
}
