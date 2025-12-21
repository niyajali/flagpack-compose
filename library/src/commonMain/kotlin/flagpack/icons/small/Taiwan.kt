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
 * Taiwan Flag (16x12dp)
 *
 * - ISO Alpha-2: TW
 * - ISO Alpha-3: TWN
 * - ISO Numeric: 158
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Taiwan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Taiwan:TW:TWN:158:Small",
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
                fill = SolidColor(Color(0xFFEF0000)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.365f, 5.405f)
                lineTo(3.624f, 6.33f)
                lineTo(3.445f, 5.159f)
                lineTo(2.341f, 5.589f)
                lineTo(2.771f, 4.485f)
                lineTo(1.6f, 4.306f)
                lineTo(2.524f, 3.565f)
                lineTo(1.6f, 2.824f)
                lineTo(2.771f, 2.645f)
                lineTo(2.341f, 1.541f)
                lineTo(3.445f, 1.971f)
                lineTo(3.624f, 0.8f)
                lineTo(4.365f, 1.724f)
                lineTo(5.106f, 0.8f)
                lineTo(5.285f, 1.971f)
                lineTo(6.389f, 1.541f)
                lineTo(5.959f, 2.645f)
                lineTo(7.13f, 2.824f)
                lineTo(6.205f, 3.565f)
                lineTo(7.13f, 4.306f)
                lineTo(5.959f, 4.485f)
                lineTo(6.389f, 5.589f)
                lineTo(5.285f, 5.159f)
                lineTo(5.106f, 6.33f)
                lineTo(4.365f, 5.405f)
                close()
                moveTo(4.365f, 4.996f)
                curveTo(5.155f, 4.996f, 5.796f, 4.355f, 5.796f, 3.565f)
                curveTo(5.796f, 2.774f, 5.155f, 2.134f, 4.365f, 2.134f)
                curveTo(3.574f, 2.134f, 2.934f, 2.774f, 2.934f, 3.565f)
                curveTo(2.934f, 4.355f, 3.574f, 4.996f, 4.365f, 4.996f)
                close()
                moveTo(5.51f, 3.565f)
                curveTo(5.51f, 4.197f, 4.997f, 4.71f, 4.365f, 4.71f)
                curveTo(3.732f, 4.71f, 3.22f, 4.197f, 3.22f, 3.565f)
                curveTo(3.22f, 2.932f, 3.732f, 2.42f, 4.365f, 2.42f)
                curveTo(4.997f, 2.42f, 5.51f, 2.932f, 5.51f, 3.565f)
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
            imageVector = FlagIcons.Small.Taiwan,
            contentDescription = "Taiwan Flag"
        )
    }
}
