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
 * New Zealand Flag (32x24dp)
 *
 * - ISO Alpha-2: NZ
 * - ISO Alpha-3: NZL
 * - ISO Numeric: 554
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.NewZealand: ImageVector
    get() {
        if (_newZealand != null) {
            return _newZealand!!
        }
        _newZealand = ImageVector.Builder(
            name = "NewZealand",
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
        return _newZealand!!
    }

@Suppress("ObjectPropertyName")
private var _newZealand: ImageVector? = null

@Preview
@Composable
private fun NewZealandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.NewZealand,
            contentDescription = "New Zealand Flag"
        )
    }
}
