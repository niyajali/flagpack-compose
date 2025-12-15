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
 * Eritrea Flag (16x12dp)
 *
 * - ISO Alpha-2: ER
 * - ISO Alpha-3: ERI
 * - ISO Numeric: 232
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Eritrea: ImageVector by lazy {
    ImageVector.Builder(
        name = "Eritrea:ER:ERI:232:Small",
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
                fill = SolidColor(Color(0xFF43B764)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB4D7F4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBE0027)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(16.5f, 6f)
                lineTo(0f, 12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF3E294)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.557f, 8.684f)
                lineTo(4.08f, 8.695f)
                curveTo(4.045f, 8.65f, 4.014f, 8.607f, 3.984f, 8.566f)
                curveTo(3.748f, 8.104f, 3.629f, 7.618f, 3.629f, 7.108f)
                curveTo(3.629f, 7.153f, 3.629f, 7.196f, 3.629f, 7.237f)
                curveTo(3.627f, 7.819f, 3.627f, 8.065f, 3.984f, 8.566f)
                curveTo(4.086f, 8.764f, 4.209f, 8.958f, 4.353f, 9.147f)
                lineTo(4.97f, 8.674f)
                lineTo(4.557f, 8.684f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF3E294)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1f, 6.25f)
                curveTo(1f, 8.045f, 2.455f, 9.5f, 4.25f, 9.5f)
                curveTo(6.045f, 9.5f, 7.5f, 8.045f, 7.5f, 6.25f)
                curveTo(7.5f, 4.455f, 6.045f, 3f, 4.25f, 3f)
                curveTo(2.455f, 3f, 1f, 4.455f, 1f, 6.25f)
                close()
                moveTo(6.5f, 6.25f)
                curveTo(6.5f, 7.493f, 5.493f, 8.5f, 4.25f, 8.5f)
                curveTo(3.007f, 8.5f, 2f, 7.493f, 2f, 6.25f)
                curveTo(2f, 5.007f, 3.007f, 4f, 4.25f, 4f)
                curveTo(5.493f, 4f, 6.5f, 5.007f, 6.5f, 6.25f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EritreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Eritrea,
            contentDescription = "Eritrea Flag"
        )
    }
}
