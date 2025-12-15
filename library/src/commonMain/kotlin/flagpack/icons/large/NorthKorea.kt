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
 * North Korea Flag (32x24dp)
 *
 * - ISO Alpha-2: KP
 * - ISO Alpha-3: PRK
 * - ISO Numeric: 408
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.NorthKorea: ImageVector
    get() {
        if (_northKorea != null) {
            return _northKorea!!
        }
        _northKorea = ImageVector.Builder(
            name = "NorthKorea",
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
        return _northKorea!!
    }

@Suppress("ObjectPropertyName")
private var _northKorea: ImageVector? = null

@Preview
@Composable
private fun NorthKoreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.NorthKorea,
            contentDescription = "North Korea Flag"
        )
    }
}
