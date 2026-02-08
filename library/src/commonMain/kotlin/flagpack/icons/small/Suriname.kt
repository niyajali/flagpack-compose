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
 * Suriname Flag (16x12dp)
 *
 * - ISO Alpha-2: SR
 * - ISO Alpha-3: SUR
 * - ISO Numeric: 740
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Suriname: ImageVector by lazy {
    ImageVector.Builder(
        name = "Suriname:SR:SUR:740:Small",
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
                fill = SolidColor(Color(0xFF4E8B1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4E8B1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1.5f
            ) {
                moveTo(0f, 3.25f)
                horizontalLineTo(-0.75f)
                verticalLineTo(4f)
                verticalLineTo(8f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.75f)
                verticalLineTo(8f)
                verticalLineTo(4f)
                verticalLineTo(3.25f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.001f, 7.247f)
                lineTo(6.754f, 8f)
                lineTo(7.039f, 6.531f)
                lineTo(6f, 5.431f)
                lineTo(7.406f, 5.372f)
                lineTo(8.001f, 4f)
                lineTo(8.596f, 5.372f)
                horizontalLineTo(10f)
                lineTo(8.964f, 6.531f)
                lineTo(9.276f, 8f)
                lineTo(8.001f, 7.247f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SurinamePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Suriname,
            contentDescription = "Suriname Flag"
        )
    }
}
