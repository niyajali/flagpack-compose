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
 * Aruba Flag (16x12dp)
 *
 * - ISO Alpha-2: AW
 * - ISO Alpha-3: ABW
 * - ISO Numeric: 533
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Aruba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Aruba:AW:ABW:533:Small",
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
                fill = SolidColor(Color(0xFF5BA3DA)),
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
                fill = SolidColor(Color(0xFFEF2929)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.78f, 4.29f)
                lineTo(0.242f, 3.536f)
                lineTo(2.837f, 2.797f)
                lineTo(3.47f, 0.436f)
                lineTo(4.201f, 2.869f)
                lineTo(6.601f, 3.51f)
                lineTo(4.194f, 4.234f)
                lineTo(3.476f, 6.558f)
                lineTo(2.78f, 4.29f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.78f, 4.29f)
                lineTo(0.242f, 3.536f)
                lineTo(2.837f, 2.797f)
                lineTo(3.47f, 0.436f)
                lineTo(4.201f, 2.869f)
                lineTo(6.601f, 3.51f)
                lineTo(4.194f, 4.234f)
                lineTo(3.476f, 6.558f)
                lineTo(2.78f, 4.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFAD615)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 7f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                close()
                moveTo(16f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
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
            imageVector = FlagIcons.Small.Aruba,
            contentDescription = "Aruba Flag"
        )
    }
}
