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
 * Saudi Arabia Flag (16x12dp)
 *
 * - ISO Alpha-2: SA
 * - ISO Alpha-3: SAU
 * - ISO Numeric: 682
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SaudiArabia: ImageVector
    get() {
        if (_saudiArabia != null) {
            return _saudiArabia!!
        }
        _saudiArabia = ImageVector.Builder(
            name = "SaudiArabia",
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
        return _saudiArabia!!
    }

@Suppress("ObjectPropertyName")
private var _saudiArabia: ImageVector? = null

@Preview
@Composable
private fun SaudiArabiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SaudiArabia,
            contentDescription = "Saudi Arabia Flag"
        )
    }
}
