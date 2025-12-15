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
 * Guadeloupe Flag (20x15dp)
 *
 * - ISO Alpha-2: GP
 * - ISO Alpha-3: GLP
 * - ISO Numeric: 312
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Guadeloupe: ImageVector
    get() {
        if (_guadeloupe != null) {
            return _guadeloupe!!
        }
        _guadeloupe = ImageVector.Builder(
            name = "Guadeloupe",
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
        return _guadeloupe!!
    }

@Suppress("ObjectPropertyName")
private var _guadeloupe: ImageVector? = null

@Preview
@Composable
private fun GuadeloupePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Guadeloupe,
            contentDescription = "Guadeloupe Flag"
        )
    }
}
