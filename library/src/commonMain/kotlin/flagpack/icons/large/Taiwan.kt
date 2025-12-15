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
 * Taiwan Flag (32x24dp)
 *
 * - ISO Alpha-2: TW
 * - ISO Alpha-3: TWN
 * - ISO Numeric: 158
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Taiwan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Taiwan:TW:TWN:158:Large",
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
                fill = SolidColor(Color(0xFFEF0000)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.73f, 10.811f)
                lineTo(7.248f, 12.659f)
                lineTo(6.889f, 10.318f)
                lineTo(4.682f, 11.178f)
                lineTo(5.542f, 8.97f)
                lineTo(3.2f, 8.611f)
                lineTo(5.048f, 7.13f)
                lineTo(3.2f, 5.648f)
                lineTo(5.542f, 5.289f)
                lineTo(4.682f, 3.082f)
                lineTo(6.889f, 3.942f)
                lineTo(7.248f, 1.6f)
                lineTo(8.73f, 3.448f)
                lineTo(10.211f, 1.6f)
                lineTo(10.57f, 3.942f)
                lineTo(12.778f, 3.082f)
                lineTo(11.917f, 5.289f)
                lineTo(14.259f, 5.648f)
                lineTo(12.411f, 7.13f)
                lineTo(14.259f, 8.611f)
                lineTo(11.917f, 8.97f)
                lineTo(12.778f, 11.178f)
                lineTo(10.57f, 10.318f)
                lineTo(10.211f, 12.659f)
                lineTo(8.73f, 10.811f)
                close()
                moveTo(8.73f, 9.992f)
                curveTo(10.31f, 9.992f, 11.592f, 8.71f, 11.592f, 7.13f)
                curveTo(11.592f, 5.549f, 10.31f, 4.267f, 8.73f, 4.267f)
                curveTo(7.149f, 4.267f, 5.867f, 5.549f, 5.867f, 7.13f)
                curveTo(5.867f, 8.71f, 7.149f, 9.992f, 8.73f, 9.992f)
                close()
                moveTo(11.019f, 7.13f)
                curveTo(11.019f, 8.394f, 9.994f, 9.419f, 8.73f, 9.419f)
                curveTo(7.465f, 9.419f, 6.44f, 8.394f, 6.44f, 7.13f)
                curveTo(6.44f, 5.865f, 7.465f, 4.84f, 8.73f, 4.84f)
                curveTo(9.994f, 4.84f, 11.019f, 5.865f, 11.019f, 7.13f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TaiwanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Taiwan,
            contentDescription = "Taiwan Flag"
        )
    }
}
