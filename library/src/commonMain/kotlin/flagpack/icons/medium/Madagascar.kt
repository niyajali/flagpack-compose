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
 * Madagascar Flag (20x15dp)
 *
 * - ISO Alpha-2: MG
 * - ISO Alpha-3: MDG
 * - ISO Numeric: 450
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Madagascar: ImageVector by lazy {
    ImageVector.Builder(
        name = "Madagascar:MG:MDG:450:Medium",
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
                fill = SolidColor(Color(0xFF78D843)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 7.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MadagascarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Madagascar,
            contentDescription = "Madagascar Flag"
        )
    }
}
