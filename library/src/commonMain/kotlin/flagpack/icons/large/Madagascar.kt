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
 * Madagascar Flag (32x24dp)
 *
 * - ISO Alpha-2: MG
 * - ISO Alpha-3: MDG
 * - ISO Numeric: 450
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Madagascar: ImageVector by lazy {
    ImageVector.Builder(
        name = "Madagascar:MG:MDG:450:Large",
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
                fill = SolidColor(Color(0xFF78D843)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
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
            imageVector = FlagIcons.Large.Madagascar,
            contentDescription = "Madagascar Flag"
        )
    }
}
