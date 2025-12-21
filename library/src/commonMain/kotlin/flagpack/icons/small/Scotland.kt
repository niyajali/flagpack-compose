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
 * Scotland Flag (16x12dp)
 *
 * - ISO Alpha-2: GB-SCT
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Scotland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Scotland:GB-SCT:::Small",
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
            path(fill = SolidColor(Color(0xFF265AAD))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 7.25f)
                lineTo(0.6f, 12.8f)
                lineTo(-0.6f, 11.2f)
                lineTo(6.333f, 6f)
                lineTo(-0.6f, 0.8f)
                lineTo(0.6f, -0.8f)
                lineTo(8f, 4.75f)
                lineTo(15.4f, -0.8f)
                lineTo(16.6f, 0.8f)
                lineTo(9.667f, 6f)
                lineTo(16.6f, 11.2f)
                lineTo(15.4f, 12.8f)
                lineTo(8f, 7.25f)
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
            imageVector = FlagIcons.Small.Scotland,
            contentDescription = "Scotland Flag"
        )
    }
}
