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
 * Scotland Flag (20x15dp)
 *
 * - ISO Alpha-2: GB-SCT
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Scotland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Scotland:GB-SCT:::Medium",
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
            path(fill = SolidColor(Color(0xFF265AAD))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.917f, 7.5f)
                lineTo(-0.75f, 1f)
                lineTo(0.75f, -1f)
                lineTo(10f, 5.938f)
                lineTo(19.25f, -1f)
                lineTo(20.75f, 1f)
                lineTo(12.083f, 7.5f)
                lineTo(20.75f, 14f)
                lineTo(19.25f, 16f)
                lineTo(10f, 9.063f)
                lineTo(0.75f, 16f)
                lineTo(-0.75f, 14f)
                lineTo(7.917f, 7.5f)
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
            imageVector = FlagIcons.Medium.Scotland,
            contentDescription = "Scotland Flag"
        )
    }
}
