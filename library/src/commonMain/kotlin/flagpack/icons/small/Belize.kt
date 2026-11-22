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
 * Belize Flag (16x12dp)
 *
 * - ISO Alpha-2: BZ
 * - ISO Alpha-3: BLZ
 * - ISO Numeric: 084
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Belize: ImageVector by lazy {
    ImageVector.Builder(
        name = "Belize:BZ:BLZ:084:Small",
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
                fill = SolidColor(Color(0xFF0168B4)),
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
                fill = SolidColor(Color(0xFFE93C43)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE93C43)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(8f, 9f)
                curveTo(6.343f, 9f, 5f, 7.657f, 5f, 6f)
                curveTo(5f, 4.343f, 6.343f, 3f, 8f, 3f)
                curveTo(9.657f, 3f, 11f, 4.343f, 11f, 6f)
                curveTo(11f, 7.657f, 9.657f, 9f, 8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.5f, 6f)
                curveTo(4.5f, 7.933f, 6.067f, 9.5f, 8f, 9.5f)
                curveTo(9.933f, 9.5f, 11.5f, 7.933f, 11.5f, 6f)
                curveTo(11.5f, 4.067f, 9.933f, 2.5f, 8f, 2.5f)
                curveTo(6.067f, 2.5f, 4.5f, 4.067f, 4.5f, 6f)
                close()
                moveTo(11f, 6f)
                curveTo(11f, 7.657f, 9.657f, 9f, 8f, 9f)
                curveTo(6.343f, 9f, 5f, 7.657f, 5f, 6f)
                curveTo(5f, 4.343f, 6.343f, 3f, 8f, 3f)
                curveTo(9.657f, 3f, 11f, 4.343f, 11f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6f)
                curveTo(5f, 7.657f, 6.343f, 9f, 8f, 9f)
                curveTo(9.657f, 9f, 11f, 7.657f, 11f, 6f)
                curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
                curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
                close()
                moveTo(10.3f, 6f)
                curveTo(10.3f, 7.27f, 9.27f, 8.3f, 8f, 8.3f)
                curveTo(6.73f, 8.3f, 5.7f, 7.27f, 5.7f, 6f)
                curveTo(5.7f, 4.73f, 6.73f, 3.7f, 8f, 3.7f)
                curveTo(9.27f, 3.7f, 10.3f, 4.73f, 10.3f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 7f)
                lineTo(7.97f, 6.812f)
                lineTo(9.5f, 7f)
                verticalLineTo(7.5f)
                lineTo(7.97f, 7.312f)
                lineTo(6.5f, 7.5f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF769DF1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5f)
                horizontalLineTo(9f)
                curveTo(9f, 5f, 9.141f, 8f, 8f, 8f)
                curveTo(6.859f, 8f, 7f, 5f, 7f, 5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(8f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6F7F8)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f
            ) {
                moveTo(7f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                fillAlpha = 0.66f,
                strokeAlpha = 0.66f
            ) {
                moveTo(7.5f, 4f)
                lineTo(8.5f, 4f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 4.5f)
                lineTo(9f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 5f)
                lineTo(7.5f, 5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 4.5f)
                lineTo(7f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9AD35)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.9f, 6.4f)
                curveTo(7.176f, 6.4f, 7.4f, 5.952f, 7.4f, 5.4f)
                curveTo(7.4f, 4.848f, 7.176f, 4.4f, 6.9f, 4.4f)
                curveTo(6.624f, 4.4f, 6.4f, 4.848f, 6.4f, 5.4f)
                curveTo(6.4f, 5.952f, 6.624f, 6.4f, 6.9f, 6.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5C2216)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.1f, 6.4f)
                curveTo(9.376f, 6.4f, 9.6f, 5.952f, 9.6f, 5.4f)
                curveTo(9.6f, 4.848f, 9.376f, 4.4f, 9.1f, 4.4f)
                curveTo(8.824f, 4.4f, 8.6f, 4.848f, 8.6f, 5.4f)
                curveTo(8.6f, 5.952f, 8.824f, 6.4f, 9.1f, 6.4f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BelizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Belize,
            contentDescription = "Belize Flag"
        )
    }
}
