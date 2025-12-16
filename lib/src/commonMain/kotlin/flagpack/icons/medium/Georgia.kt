package flagpack.icons.medium

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
 * Georgia Flag (20x15dp)
 *
 * - ISO Alpha-2: GE
 * - ISO Alpha-3: GEO
 * - ISO Numeric: 268
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Georgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Georgia:GE:GEO:268:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.75f, 0f)
                horizontalLineTo(11.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(15f)
                horizontalLineTo(8.75f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                verticalLineTo(6.25f)
                horizontalLineTo(8.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.249f, 10.764f)
                lineTo(7.625f, 10.625f)
                verticalLineTo(11.875f)
                curveTo(7.625f, 11.875f, 6.249f, 11.789f, 6.249f, 11.814f)
                curveTo(6.249f, 11.839f, 6.375f, 13.125f, 6.375f, 13.125f)
                horizontalLineTo(5.125f)
                lineTo(5.225f, 11.875f)
                horizontalLineTo(3.875f)
                verticalLineTo(10.625f)
                lineTo(5.225f, 10.764f)
                lineTo(5.125f, 9.375f)
                horizontalLineTo(6.375f)
                lineTo(6.249f, 10.764f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.249f, 3.264f)
                lineTo(7.625f, 3.125f)
                verticalLineTo(4.375f)
                curveTo(7.625f, 4.375f, 6.249f, 4.289f, 6.249f, 4.314f)
                curveTo(6.249f, 4.339f, 6.375f, 5.625f, 6.375f, 5.625f)
                horizontalLineTo(5.125f)
                lineTo(5.225f, 4.375f)
                horizontalLineTo(3.875f)
                verticalLineTo(3.125f)
                lineTo(5.225f, 3.264f)
                lineTo(5.125f, 1.875f)
                horizontalLineTo(6.375f)
                lineTo(6.249f, 3.264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.999f, 3.264f)
                lineTo(16.375f, 3.125f)
                verticalLineTo(4.375f)
                curveTo(16.375f, 4.375f, 14.999f, 4.289f, 14.999f, 4.314f)
                curveTo(14.999f, 4.339f, 15.125f, 5.625f, 15.125f, 5.625f)
                horizontalLineTo(13.875f)
                lineTo(13.975f, 4.375f)
                horizontalLineTo(12.625f)
                verticalLineTo(3.125f)
                lineTo(13.975f, 3.264f)
                lineTo(13.875f, 1.875f)
                horizontalLineTo(15.125f)
                lineTo(14.999f, 3.264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.999f, 10.764f)
                lineTo(16.375f, 10.625f)
                verticalLineTo(11.875f)
                curveTo(16.375f, 11.875f, 14.999f, 11.789f, 14.999f, 11.814f)
                curveTo(14.999f, 11.839f, 15.125f, 13.125f, 15.125f, 13.125f)
                horizontalLineTo(13.875f)
                lineTo(13.975f, 11.875f)
                horizontalLineTo(12.625f)
                verticalLineTo(10.625f)
                lineTo(13.975f, 10.764f)
                lineTo(13.875f, 9.375f)
                horizontalLineTo(15.125f)
                lineTo(14.999f, 10.764f)
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
            imageVector = FlagIcons.Medium.Georgia,
            contentDescription = "Georgia Flag"
        )
    }
}
