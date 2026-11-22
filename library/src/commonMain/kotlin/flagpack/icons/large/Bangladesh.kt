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
 * Bangladesh Flag (32x24dp)
 *
 * - ISO Alpha-2: BD
 * - ISO Alpha-3: BGD
 * - ISO Numeric: 050
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Bangladesh: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bangladesh:BD:BGD:050:Large",
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
            path(fill = SolidColor(Color(0xFF38A17E))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF72E45)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 19f)
                curveTo(16.866f, 19f, 20f, 15.866f, 20f, 12f)
                curveTo(20f, 8.134f, 16.866f, 5f, 13f, 5f)
                curveTo(9.134f, 5f, 6f, 8.134f, 6f, 12f)
                curveTo(6f, 15.866f, 9.134f, 19f, 13f, 19f)
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
            imageVector = FlagIcons.Large.Bangladesh,
            contentDescription = "Bangladesh Flag"
        )
    }
}
