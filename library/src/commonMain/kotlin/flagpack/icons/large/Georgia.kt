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
 * Georgia Flag (32x24dp)
 *
 * - ISO Alpha-2: GE
 * - ISO Alpha-3: GEO
 * - ISO Numeric: 268
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Georgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Georgia:GE:GEO:268:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(24f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.999f, 17.222f)
                lineTo(12.2f, 17f)
                verticalLineTo(19f)
                curveTo(12.2f, 19f, 9.999f, 18.862f, 9.999f, 18.902f)
                curveTo(9.999f, 18.942f, 10.2f, 21f, 10.2f, 21f)
                horizontalLineTo(8.2f)
                lineTo(8.36f, 19f)
                horizontalLineTo(6.2f)
                verticalLineTo(17f)
                lineTo(8.36f, 17.222f)
                lineTo(8.2f, 15f)
                horizontalLineTo(10.2f)
                lineTo(9.999f, 17.222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.999f, 5.222f)
                lineTo(12.2f, 5f)
                verticalLineTo(7f)
                curveTo(12.2f, 7f, 9.999f, 6.862f, 9.999f, 6.902f)
                curveTo(9.999f, 6.942f, 10.2f, 9f, 10.2f, 9f)
                horizontalLineTo(8.2f)
                lineTo(8.36f, 7f)
                horizontalLineTo(6.2f)
                verticalLineTo(5f)
                lineTo(8.36f, 5.222f)
                lineTo(8.2f, 3f)
                horizontalLineTo(10.2f)
                lineTo(9.999f, 5.222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.999f, 5.222f)
                lineTo(26.2f, 5f)
                verticalLineTo(7f)
                curveTo(26.2f, 7f, 23.999f, 6.862f, 23.999f, 6.902f)
                curveTo(23.999f, 6.942f, 24.2f, 9f, 24.2f, 9f)
                horizontalLineTo(22.2f)
                lineTo(22.36f, 7f)
                horizontalLineTo(20.2f)
                verticalLineTo(5f)
                lineTo(22.36f, 5.222f)
                lineTo(22.2f, 3f)
                horizontalLineTo(24.2f)
                lineTo(23.999f, 5.222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.999f, 17.222f)
                lineTo(26.2f, 17f)
                verticalLineTo(19f)
                curveTo(26.2f, 19f, 23.999f, 18.862f, 23.999f, 18.902f)
                curveTo(23.999f, 18.942f, 24.2f, 21f, 24.2f, 21f)
                horizontalLineTo(22.2f)
                lineTo(22.36f, 19f)
                horizontalLineTo(20.2f)
                verticalLineTo(17f)
                lineTo(22.36f, 17.222f)
                lineTo(22.2f, 15f)
                horizontalLineTo(24.2f)
                lineTo(23.999f, 17.222f)
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
            imageVector = FlagIcons.Large.Georgia,
            contentDescription = "Georgia Flag"
        )
    }
}
