package flagpack.icons.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Afghanistan Flag (32x24dp)
 *
 * - ISO Alpha-2: AF
 * - ISO Alpha-3: AFG
 * - ISO Numeric: 004
 *
 * Note: This flag could not be fully converted from SVG.
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Afghanistan: ImageVector
    get() {
        if (_afghanistan != null) {
            return _afghanistan!!
        }
        _afghanistan = ImageVector.Builder(
            name = "Afghanistan",
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
        return _afghanistan!!
    }

@Suppress("ObjectPropertyName")
private var _afghanistan: ImageVector? = null

@Preview
@Composable
private fun AfghanistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Afghanistan,
            contentDescription = "Afghanistan Flag"
        )
    }
}
