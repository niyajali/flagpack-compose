package flagpack.icons.large

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Solomon Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: SB
 * - ISO Alpha-3: SLB
 * - ISO Numeric: 090
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SolomonIslands: ImageVector
    get() {
        if (_solomonIslands != null) {
            return _solomonIslands!!
        }
        _solomonIslands = ImageVector.Builder(
            name = "SolomonIslands",
            defaultWidth = 32.dp,
            defaultHeight = 24.dp,
            viewportWidth = 32f,
            viewportHeight = 24f
        ).apply {
            // Placeholder path - flag could not be converted
            path(fill = SolidColor(Color.Gray)) {
                moveTo(0f, 0f)
                lineTo(32f, 0f)
                lineTo(32f, 24f)
                lineTo(0f, 24f)
                close()
            }
        }.build()
        return _solomonIslands!!
    }

@Suppress("ObjectPropertyName")
private var _solomonIslands: ImageVector? = null

@Preview
@Composable
private fun SolomonIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SolomonIslands,
            contentDescription = "Solomon Islands Flag"
        )
    }
}
