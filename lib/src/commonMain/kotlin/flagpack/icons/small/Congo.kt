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
 * Congo Flag (16x12dp)
 *
 * - ISO Alpha-2: CG
 * - ISO Alpha-3: COG
 * - ISO Numeric: 178
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Congo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Congo:CG:COG:178:Small",
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
                fill = SolidColor(Color(0xFFFA1111)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                lineTo(16f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF07A907)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                lineTo(0f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.746f, -2.9f)
                lineTo(-0.5f, 11.788f)
                lineTo(2.526f, 13.294f)
                lineTo(17.32f, -0.106f)
                lineTo(14.746f, -2.9f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(14.746f, -2.9f)
                lineTo(-0.5f, 11.788f)
                lineTo(2.526f, 13.294f)
                lineTo(17.32f, -0.106f)
                lineTo(14.746f, -2.9f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun CongoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Congo,
            contentDescription = "Congo Flag"
        )
    }
}
