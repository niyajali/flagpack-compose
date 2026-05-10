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
 * Congo Flag (20x15dp)
 *
 * - ISO Alpha-2: CG
 * - ISO Alpha-3: COG
 * - ISO Numeric: 178
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Congo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Congo:CG:COG:178:Medium",
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
            path(
                fill = SolidColor(Color(0xFFFA1111)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                lineTo(20f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF07A907)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                lineTo(0f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.432f, -3.625f)
                lineTo(-0.625f, 14.735f)
                lineTo(3.157f, 16.618f)
                lineTo(21.65f, -0.132f)
                lineTo(18.432f, -3.625f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(18.432f, -3.625f)
                lineTo(-0.625f, 14.735f)
                lineTo(3.157f, 16.618f)
                lineTo(21.65f, -0.132f)
                lineTo(18.432f, -3.625f)
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
            imageVector = FlagIcons.Medium.Congo,
            contentDescription = "Congo Flag"
        )
    }
}
