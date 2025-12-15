package flagpack.icons.medium

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
 * Faroe Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: FO
 * - ISO Alpha-3: FRO
 * - ISO Numeric: 234
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.FaroeIslands: ImageVector
    get() {
        if (_faroeIslands != null) {
            return _faroeIslands!!
        }
        _faroeIslands = ImageVector.Builder(
            name = "FaroeIslands",
            defaultWidth = 20.dp,
            defaultHeight = 15.dp,
            viewportWidth = 20f,
            viewportHeight = 15f
        ).apply {
            // Placeholder path - flag could not be converted
            path(fill = SolidColor(Color.Gray)) {
                moveTo(0f, 0f)
                lineTo(20f, 0f)
                lineTo(20f, 15f)
                lineTo(0f, 15f)
                close()
            }
        }.build()
        return _faroeIslands!!
    }

@Suppress("ObjectPropertyName")
private var _faroeIslands: ImageVector? = null

@Preview
@Composable
private fun FaroeIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.FaroeIslands,
            contentDescription = "Faroe Islands Flag"
        )
    }
}
