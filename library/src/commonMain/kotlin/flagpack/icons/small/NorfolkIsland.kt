package flagpack.icons.small

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
 * Norfolk Island Flag (16x12dp)
 *
 * - ISO Alpha-2: NF
 * - ISO Alpha-3: NFK
 * - ISO Numeric: 574
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.NorfolkIsland: ImageVector
    get() {
        if (_norfolkIsland != null) {
            return _norfolkIsland!!
        }
        _norfolkIsland = ImageVector.Builder(
            name = "NorfolkIsland",
            defaultWidth = 16.dp,
            defaultHeight = 12.dp,
            viewportWidth = 16f,
            viewportHeight = 12f
        ).apply {
            // Placeholder path - flag could not be converted
            path(fill = SolidColor(Color.Gray)) {
                moveTo(0f, 0f)
                lineTo(16f, 0f)
                lineTo(16f, 12f)
                lineTo(0f, 12f)
                close()
            }
        }.build()
        return _norfolkIsland!!
    }

@Suppress("ObjectPropertyName")
private var _norfolkIsland: ImageVector? = null

@Preview
@Composable
private fun NorfolkIslandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.NorfolkIsland,
            contentDescription = "Norfolk Island Flag"
        )
    }
}
