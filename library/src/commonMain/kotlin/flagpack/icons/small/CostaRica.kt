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
 * Costa Rica Flag (16x12dp)
 *
 * - ISO Alpha-2: CR
 * - ISO Alpha-3: CRI
 * - ISO Numeric: 188
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.CostaRica: ImageVector
    get() {
        if (_costaRica != null) {
            return _costaRica!!
        }
        _costaRica = ImageVector.Builder(
            name = "CostaRica",
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
        return _costaRica!!
    }

@Suppress("ObjectPropertyName")
private var _costaRica: ImageVector? = null

@Preview
@Composable
private fun CostaRicaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.CostaRica,
            contentDescription = "Costa Rica Flag"
        )
    }
}
