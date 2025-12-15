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
 * Mauritania Flag (32x24dp)
 *
 * - ISO Alpha-2: MR
 * - ISO Alpha-3: MRT
 * - ISO Numeric: 478
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Mauritania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mauritania:MR:MRT:478:Large",
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
                fill = SolidColor(Color(0xFF1C7B4D)),
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
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.242f, 14.378f)
                curveTo(21.427f, 14.407f, 22.888f, 10.065f, 22.888f, 10.065f)
                curveTo(22.594f, 13.78f, 20.539f, 16.299f, 16.242f, 16.299f)
                curveTo(11.945f, 16.299f, 10.367f, 13.036f, 9.596f, 9.781f)
                curveTo(9.596f, 9.781f, 11.057f, 14.35f, 16.242f, 14.378f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.637f, 9.814f)
                lineTo(17.974f, 11.777f)
                lineTo(16.211f, 10.85f)
                lineTo(14.447f, 11.777f)
                lineTo(14.784f, 9.814f)
                lineTo(13.357f, 8.28f)
                lineTo(15.329f, 8.28f)
                lineTo(16.211f, 6.35f)
                lineTo(17.092f, 8.28f)
                lineTo(19.064f, 8.28f)
                lineTo(17.637f, 9.814f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MauritaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Mauritania,
            contentDescription = "Mauritania Flag"
        )
    }
}
