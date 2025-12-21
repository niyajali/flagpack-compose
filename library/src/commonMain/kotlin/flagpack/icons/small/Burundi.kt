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
 * Burundi Flag (16x12dp)
 *
 * - ISO Alpha-2: BI
 * - ISO Alpha-3: BDI
 * - ISO Numeric: 108
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Burundi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Burundi:BI:BDI:108:Small",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(1f, 0f)
                lineTo(15f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 1f)
                lineTo(16f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                lineTo(1f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11f)
                lineTo(0f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDD2C2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                lineTo(16f, 0f)
                horizontalLineTo(0f)
                lineTo(8f, 6f)
                close()
                moveTo(8f, 6f)
                lineTo(0f, 12f)
                horizontalLineTo(16f)
                lineTo(8f, 6f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-4f, -2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-24f)
                close()
                moveTo(8f, 6f)
                lineTo(16f, 0f)
                horizontalLineTo(0f)
                lineTo(8f, 6f)
                close()
                moveTo(8f, 6f)
                lineTo(0f, 12f)
                horizontalLineTo(16f)
                lineTo(8f, 6f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(16f, 0f)
                lineTo(16.75f, 1f)
                lineTo(19.75f, -1.25f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                close()
                moveTo(0f, 0f)
                verticalLineTo(-1.25f)
                horizontalLineTo(-3.75f)
                lineTo(-0.75f, 1f)
                lineTo(0f, 0f)
                close()
                moveTo(0f, 12f)
                lineTo(-0.75f, 11f)
                lineTo(-3.75f, 13.25f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                close()
                moveTo(16f, 12f)
                verticalLineTo(13.25f)
                horizontalLineTo(19.75f)
                lineTo(16.75f, 11f)
                lineTo(16f, 12f)
                close()
                moveTo(15.25f, -1f)
                lineTo(7.25f, 5f)
                lineTo(8.75f, 7f)
                lineTo(16.75f, 1f)
                lineTo(15.25f, -1f)
                close()
                moveTo(0f, 1.25f)
                horizontalLineTo(16f)
                verticalLineTo(-1.25f)
                horizontalLineTo(0f)
                verticalLineTo(1.25f)
                close()
                moveTo(8.75f, 5f)
                lineTo(0.75f, -1f)
                lineTo(-0.75f, 1f)
                lineTo(7.25f, 7f)
                lineTo(8.75f, 5f)
                close()
                moveTo(7.25f, 5f)
                lineTo(-0.75f, 11f)
                lineTo(0.75f, 13f)
                lineTo(8.75f, 7f)
                lineTo(7.25f, 5f)
                close()
                moveTo(0f, 13.25f)
                horizontalLineTo(16f)
                verticalLineTo(10.75f)
                horizontalLineTo(0f)
                verticalLineTo(13.25f)
                close()
                moveTo(16.75f, 11f)
                lineTo(8.75f, 5f)
                lineTo(7.25f, 7f)
                lineTo(15.25f, 13f)
                lineTo(16.75f, 11f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 9f)
            curveTo(9.657f, 9f, 11f, 7.657f, 11f, 6f)
            curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
            curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
            curveTo(5f, 7.657f, 6.343f, 9f, 8f, 9f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.083f, 5.214f)
            lineTo(7.496f, 5.523f)
            lineTo(7.608f, 4.869f)
            lineTo(7.132f, 4.405f)
            horizontalLineTo(7.79f)
            lineTo(8.083f, 3.714f)
            lineTo(8.377f, 4.405f)
            horizontalLineTo(9.035f)
            lineTo(8.559f, 4.869f)
            lineTo(8.671f, 5.523f)
            lineTo(8.083f, 5.214f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.681f, 7.214f)
            lineTo(6.093f, 7.523f)
            lineTo(6.206f, 6.869f)
            lineTo(5.73f, 6.405f)
            horizontalLineTo(6.387f)
            lineTo(6.681f, 5.714f)
            lineTo(6.975f, 6.405f)
            horizontalLineTo(7.632f)
            lineTo(7.157f, 6.869f)
            lineTo(7.269f, 7.523f)
            lineTo(6.681f, 7.214f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.481f, 7.214f)
            lineTo(8.893f, 7.523f)
            lineTo(9.006f, 6.869f)
            lineTo(8.53f, 6.405f)
            horizontalLineTo(9.187f)
            lineTo(9.481f, 5.714f)
            lineTo(9.775f, 6.405f)
            horizontalLineTo(10.432f)
            lineTo(9.957f, 6.869f)
            lineTo(10.069f, 7.523f)
            lineTo(9.481f, 7.214f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BurundiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Burundi,
            contentDescription = "Burundi Flag"
        )
    }
}
