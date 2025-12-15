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
 * Burundi Flag (32x24dp)
 *
 * - ISO Alpha-2: BI
 * - ISO Alpha-3: BDI
 * - ISO Numeric: 108
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Burundi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Burundi:BI:BDI:108:Large",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(2f, 0f)
                lineTo(30f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 2f)
                lineTo(32f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30f, 24f)
                lineTo(2f, 24f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                lineTo(0f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDD2C2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 12f)
                lineTo(32f, 0f)
                horizontalLineTo(0f)
                lineTo(16f, 12f)
                close()
                moveTo(16f, 12f)
                lineTo(0f, 24f)
                horizontalLineTo(32f)
                lineTo(16f, 12f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-8f, -3f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(-48f)
                close()
                moveTo(16f, 12f)
                lineTo(32f, 0f)
                horizontalLineTo(0f)
                lineTo(16f, 12f)
                close()
                moveTo(16f, 12f)
                lineTo(0f, 24f)
                horizontalLineTo(32f)
                lineTo(16f, 12f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(32f, 0f)
                lineTo(33.5f, 2f)
                lineTo(39.5f, -2.5f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                close()
                moveTo(0f, 0f)
                verticalLineTo(-2.5f)
                horizontalLineTo(-7.5f)
                lineTo(-1.5f, 2f)
                lineTo(0f, 0f)
                close()
                moveTo(0f, 24f)
                lineTo(-1.5f, 22f)
                lineTo(-7.5f, 26.5f)
                horizontalLineTo(0f)
                verticalLineTo(24f)
                close()
                moveTo(32f, 24f)
                verticalLineTo(26.5f)
                horizontalLineTo(39.5f)
                lineTo(33.5f, 22f)
                lineTo(32f, 24f)
                close()
                moveTo(30.5f, -2f)
                lineTo(14.5f, 10f)
                lineTo(17.5f, 14f)
                lineTo(33.5f, 2f)
                lineTo(30.5f, -2f)
                close()
                moveTo(0f, 2.5f)
                horizontalLineTo(32f)
                verticalLineTo(-2.5f)
                horizontalLineTo(0f)
                verticalLineTo(2.5f)
                close()
                moveTo(17.5f, 10f)
                lineTo(1.5f, -2f)
                lineTo(-1.5f, 2f)
                lineTo(14.5f, 14f)
                lineTo(17.5f, 10f)
                close()
                moveTo(14.5f, 10f)
                lineTo(-1.5f, 22f)
                lineTo(1.5f, 26f)
                lineTo(17.5f, 14f)
                lineTo(14.5f, 10f)
                close()
                moveTo(0f, 26.5f)
                horizontalLineTo(32f)
                verticalLineTo(21.5f)
                horizontalLineTo(0f)
                verticalLineTo(26.5f)
                close()
                moveTo(33.5f, 22f)
                lineTo(17.5f, 10f)
                lineTo(14.5f, 14f)
                lineTo(30.5f, 26f)
                lineTo(33.5f, 22f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16f, 18f)
            curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
            curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
            curveTo(12.686f, 6f, 10f, 8.686f, 10f, 12f)
            curveTo(10f, 15.314f, 12.686f, 18f, 16f, 18f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            stroke = SolidColor(Color(0xFF5EAA22)),
            strokeLineWidth = 0.25f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.43f, 10.387f)
            lineTo(14.268f, 10.4f)
            lineTo(14.86f, 9.4f)
            lineTo(14.268f, 8.4f)
            lineTo(15.43f, 8.413f)
            lineTo(16f, 7.4f)
            lineTo(16.57f, 8.413f)
            lineTo(17.732f, 8.4f)
            lineTo(17.14f, 9.4f)
            lineTo(17.732f, 10.4f)
            lineTo(16.57f, 10.387f)
            lineTo(16f, 11.4f)
            lineTo(15.43f, 10.387f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            stroke = SolidColor(Color(0xFF5EAA22)),
            strokeLineWidth = 0.25f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.93f, 14.487f)
            lineTo(11.768f, 14.5f)
            lineTo(12.36f, 13.5f)
            lineTo(11.768f, 12.5f)
            lineTo(12.93f, 12.513f)
            lineTo(13.5f, 11.5f)
            lineTo(14.07f, 12.513f)
            lineTo(15.232f, 12.5f)
            lineTo(14.64f, 13.5f)
            lineTo(15.232f, 14.5f)
            lineTo(14.07f, 14.487f)
            lineTo(13.5f, 15.5f)
            lineTo(12.93f, 14.487f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            stroke = SolidColor(Color(0xFF5EAA22)),
            strokeLineWidth = 0.25f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(17.93f, 14.487f)
            lineTo(16.768f, 14.5f)
            lineTo(17.36f, 13.5f)
            lineTo(16.768f, 12.5f)
            lineTo(17.93f, 12.513f)
            lineTo(18.5f, 11.5f)
            lineTo(19.07f, 12.513f)
            lineTo(20.232f, 12.5f)
            lineTo(19.64f, 13.5f)
            lineTo(20.232f, 14.5f)
            lineTo(19.07f, 14.487f)
            lineTo(18.5f, 15.5f)
            lineTo(17.93f, 14.487f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BurundiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Burundi,
            contentDescription = "Burundi Flag"
        )
    }
}
