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
 * Bangladesh Flag (20x15dp)
 *
 * - ISO Alpha-2: BD
 * - ISO Alpha-3: BGD
 * - ISO Numeric: 050
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bangladesh: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bangladesh:BD:BGD:050:Medium",
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
            path(fill = SolidColor(Color(0xFF38A17E))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF72E45)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 11.25f)
                curveTo(9.571f, 11.25f, 11.25f, 9.571f, 11.25f, 7.5f)
                curveTo(11.25f, 5.429f, 9.571f, 3.75f, 7.5f, 3.75f)
                curveTo(5.429f, 3.75f, 3.75f, 5.429f, 3.75f, 7.5f)
                curveTo(3.75f, 9.571f, 5.429f, 11.25f, 7.5f, 11.25f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BangladeshPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bangladesh,
            contentDescription = "Bangladesh Flag"
        )
    }
}
