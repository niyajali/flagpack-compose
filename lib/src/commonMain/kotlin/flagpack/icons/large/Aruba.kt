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
 * Aruba Flag (32x24dp)
 *
 * - ISO Alpha-2: AW
 * - ISO Alpha-3: ABW
 * - ISO Numeric: 533
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Aruba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Aruba:AW:ABW:533:Large",
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
                fill = SolidColor(Color(0xFF5BA3DA)),
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
                fill = SolidColor(Color.Red),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.35f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.773f, 7.96f)
                lineTo(1.392f, 7.035f)
                lineTo(5.827f, 6.157f)
                lineTo(7.11f, 1.568f)
                lineTo(8.122f, 6.12f)
                lineTo(12.081f, 7.039f)
                lineTo(8.168f, 7.96f)
                lineTo(7.039f, 11.703f)
                lineTo(5.773f, 7.96f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFAD615)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 14f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                close()
                moveTo(32f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(20f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ArubaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Aruba,
            contentDescription = "Aruba Flag"
        )
    }
}
