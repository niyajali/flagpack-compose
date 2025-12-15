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
 * Burundi Flag (20x15dp)
 *
 * - ISO Alpha-2: BI
 * - ISO Alpha-3: BDI
 * - ISO Numeric: 108
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Burundi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Burundi:BI:BDI:108:Medium",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(1.25f, 0f)
                lineTo(18.75f, 0f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 1.25f)
                lineTo(20f, 13.75f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.75f, 15f)
                lineTo(1.25f, 15f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 13.75f)
                lineTo(0f, 1.25f)
                arcTo(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDD2C2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7.5f)
                lineTo(20f, 0f)
                horizontalLineTo(0f)
                lineTo(10f, 7.5f)
                close()
                moveTo(10f, 7.5f)
                lineTo(0f, 15f)
                horizontalLineTo(20f)
                lineTo(10f, 7.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-5f, -2f)
                horizontalLineToRelative(30f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(-30f)
                close()
                moveTo(10f, 7.5f)
                lineTo(20f, 0f)
                horizontalLineTo(0f)
                lineTo(10f, 7.5f)
                close()
                moveTo(10f, 7.5f)
                lineTo(0f, 15f)
                horizontalLineTo(20f)
                lineTo(10f, 7.5f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(20f, 0f)
                lineTo(20.938f, 1.25f)
                lineTo(24.688f, -1.563f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                close()
                moveTo(0f, 0f)
                verticalLineTo(-1.563f)
                horizontalLineTo(-4.688f)
                lineTo(-0.938f, 1.25f)
                lineTo(0f, 0f)
                close()
                moveTo(0f, 15f)
                lineTo(-0.938f, 13.75f)
                lineTo(-4.688f, 16.563f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                close()
                moveTo(20f, 15f)
                verticalLineTo(16.563f)
                horizontalLineTo(24.688f)
                lineTo(20.938f, 13.75f)
                lineTo(20f, 15f)
                close()
                moveTo(19.063f, -1.25f)
                lineTo(9.063f, 6.25f)
                lineTo(10.938f, 8.75f)
                lineTo(20.938f, 1.25f)
                lineTo(19.063f, -1.25f)
                close()
                moveTo(0f, 1.563f)
                horizontalLineTo(20f)
                verticalLineTo(-1.563f)
                horizontalLineTo(0f)
                verticalLineTo(1.563f)
                close()
                moveTo(10.938f, 6.25f)
                lineTo(0.938f, -1.25f)
                lineTo(-0.938f, 1.25f)
                lineTo(9.063f, 8.75f)
                lineTo(10.938f, 6.25f)
                close()
                moveTo(9.063f, 6.25f)
                lineTo(-0.938f, 13.75f)
                lineTo(0.938f, 16.25f)
                lineTo(10.938f, 8.75f)
                lineTo(9.063f, 6.25f)
                close()
                moveTo(0f, 16.563f)
                horizontalLineTo(20f)
                verticalLineTo(13.438f)
                horizontalLineTo(0f)
                verticalLineTo(16.563f)
                close()
                moveTo(20.938f, 13.75f)
                lineTo(10.938f, 6.25f)
                lineTo(9.063f, 8.75f)
                lineTo(19.063f, 16.25f)
                lineTo(20.938f, 13.75f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 11.25f)
            curveTo(12.071f, 11.25f, 13.75f, 9.571f, 13.75f, 7.5f)
            curveTo(13.75f, 5.429f, 12.071f, 3.75f, 10f, 3.75f)
            curveTo(7.929f, 3.75f, 6.25f, 5.429f, 6.25f, 7.5f)
            curveTo(6.25f, 9.571f, 7.929f, 11.25f, 10f, 11.25f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.104f, 6.518f)
            lineTo(9.37f, 6.904f)
            lineTo(9.51f, 6.086f)
            lineTo(8.916f, 5.507f)
            horizontalLineTo(9.737f)
            lineTo(10.104f, 4.643f)
            lineTo(10.472f, 5.507f)
            horizontalLineTo(11.293f)
            lineTo(10.699f, 6.086f)
            lineTo(10.839f, 6.904f)
            lineTo(10.104f, 6.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.351f, 9.018f)
            lineTo(7.617f, 9.404f)
            lineTo(7.757f, 8.586f)
            lineTo(7.162f, 8.007f)
            horizontalLineTo(7.984f)
            lineTo(8.351f, 7.143f)
            lineTo(8.719f, 8.007f)
            horizontalLineTo(9.54f)
            lineTo(8.946f, 8.586f)
            lineTo(9.086f, 9.404f)
            lineTo(8.351f, 9.018f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDD2C2B)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.851f, 9.018f)
            lineTo(11.117f, 9.404f)
            lineTo(11.257f, 8.586f)
            lineTo(10.663f, 8.007f)
            horizontalLineTo(11.484f)
            lineTo(11.851f, 7.143f)
            lineTo(12.219f, 8.007f)
            horizontalLineTo(13.04f)
            lineTo(12.446f, 8.586f)
            lineTo(12.586f, 9.404f)
            lineTo(11.851f, 9.018f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BurundiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Burundi,
            contentDescription = "Burundi Flag"
        )
    }
}
