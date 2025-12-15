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
 * Japan Flag (16x12dp)
 *
 * - ISO Alpha-2: JP
 * - ISO Alpha-3: JPN
 * - ISO Numeric: 392
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Japan: ImageVector
    get() {
        if (_japan != null) {
            return _japan!!
        }
        _japan = ImageVector.Builder(
            name = "Japan",
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
        return _japan!!
    }

@Suppress("ObjectPropertyName")
private var _japan: ImageVector? = null

@Preview
@Composable
private fun JapanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Japan,
            contentDescription = "Japan Flag"
        )
    }
}
