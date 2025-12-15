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
 * Cote dIvoire Flag (16x12dp)
 *
 * - ISO Alpha-2: CI
 * - ISO Alpha-3: CIV
 * - ISO Numeric: 384
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.CoteDivoire: ImageVector
    get() {
        if (_coteDivoire != null) {
            return _coteDivoire!!
        }
        _coteDivoire = ImageVector.Builder(
            name = "CoteDivoire",
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
        return _coteDivoire!!
    }

@Suppress("ObjectPropertyName")
private var _coteDivoire: ImageVector? = null

@Preview
@Composable
private fun CoteDivoirePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.CoteDivoire,
            contentDescription = "Cote dIvoire Flag"
        )
    }
}
