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
 * Scotland Flag (32x24dp)
 *
 * - ISO Alpha-2: GB-SCT
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Scotland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Scotland:GB-SCT:::Large",
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
            path(fill = SolidColor(Color(0xFF265AAD))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 14.5f)
                lineTo(1.2f, 25.6f)
                lineTo(-1.2f, 22.4f)
                lineTo(12.667f, 12f)
                lineTo(-1.2f, 1.6f)
                lineTo(1.2f, -1.6f)
                lineTo(16f, 9.5f)
                lineTo(30.8f, -1.6f)
                lineTo(33.2f, 1.6f)
                lineTo(19.333f, 12f)
                lineTo(33.2f, 22.4f)
                lineTo(30.8f, 25.6f)
                lineTo(16f, 14.5f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ScotlandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Scotland,
            contentDescription = "Scotland Flag"
        )
    }
}
