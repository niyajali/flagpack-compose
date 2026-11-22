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
 * Georgia Flag (16x12dp)
 *
 * - ISO Alpha-2: GE
 * - ISO Alpha-3: GEO
 * - ISO Numeric: 268
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Georgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Georgia:GE:GEO:268:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.999f, 8.611f)
                lineTo(6.1f, 8.5f)
                verticalLineTo(9.5f)
                curveTo(6.1f, 9.5f, 4.999f, 9.431f, 4.999f, 9.451f)
                curveTo(4.999f, 9.471f, 5.1f, 10.5f, 5.1f, 10.5f)
                horizontalLineTo(4.1f)
                lineTo(4.18f, 9.5f)
                horizontalLineTo(3.1f)
                verticalLineTo(8.5f)
                lineTo(4.18f, 8.611f)
                lineTo(4.1f, 7.5f)
                horizontalLineTo(5.1f)
                lineTo(4.999f, 8.611f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.999f, 2.611f)
                lineTo(6.1f, 2.5f)
                verticalLineTo(3.5f)
                curveTo(6.1f, 3.5f, 4.999f, 3.431f, 4.999f, 3.451f)
                curveTo(4.999f, 3.471f, 5.1f, 4.5f, 5.1f, 4.5f)
                horizontalLineTo(4.1f)
                lineTo(4.18f, 3.5f)
                horizontalLineTo(3.1f)
                verticalLineTo(2.5f)
                lineTo(4.18f, 2.611f)
                lineTo(4.1f, 1.5f)
                horizontalLineTo(5.1f)
                lineTo(4.999f, 2.611f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.999f, 2.611f)
                lineTo(13.1f, 2.5f)
                verticalLineTo(3.5f)
                curveTo(13.1f, 3.5f, 11.999f, 3.431f, 11.999f, 3.451f)
                curveTo(11.999f, 3.471f, 12.1f, 4.5f, 12.1f, 4.5f)
                horizontalLineTo(11.1f)
                lineTo(11.18f, 3.5f)
                horizontalLineTo(10.1f)
                verticalLineTo(2.5f)
                lineTo(11.18f, 2.611f)
                lineTo(11.1f, 1.5f)
                horizontalLineTo(12.1f)
                lineTo(11.999f, 2.611f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.999f, 8.611f)
                lineTo(13.1f, 8.5f)
                verticalLineTo(9.5f)
                curveTo(13.1f, 9.5f, 11.999f, 9.431f, 11.999f, 9.451f)
                curveTo(11.999f, 9.471f, 12.1f, 10.5f, 12.1f, 10.5f)
                horizontalLineTo(11.1f)
                lineTo(11.18f, 9.5f)
                horizontalLineTo(10.1f)
                verticalLineTo(8.5f)
                lineTo(11.18f, 8.611f)
                lineTo(11.1f, 7.5f)
                horizontalLineTo(12.1f)
                lineTo(11.999f, 8.611f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GeorgiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Georgia,
            contentDescription = "Georgia Flag"
        )
    }
}
