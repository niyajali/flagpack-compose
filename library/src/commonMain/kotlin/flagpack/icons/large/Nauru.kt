package flagpack.icons.large

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Nauru Flag (32x24dp)
 *
 * - ISO Alpha-2: NR
 * - ISO Alpha-3: NRU
 * - ISO Numeric: 520
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Nauru: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nauru:NR:NRU:520:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.83f, 19.58f)
                lineTo(7.285f, 21.585f)
                lineTo(7.213f, 19.054f)
                lineTo(4.785f, 19.769f)
                lineTo(6.214f, 17.679f)
                lineTo(3.83f, 16.83f)
                lineTo(6.214f, 15.98f)
                lineTo(4.785f, 13.891f)
                lineTo(7.213f, 14.605f)
                lineTo(7.285f, 12.074f)
                lineTo(8.83f, 14.08f)
                lineTo(10.375f, 12.074f)
                lineTo(10.446f, 14.605f)
                lineTo(12.875f, 13.891f)
                lineTo(11.445f, 15.98f)
                lineTo(13.83f, 16.83f)
                lineTo(11.445f, 17.679f)
                lineTo(12.875f, 19.769f)
                lineTo(10.446f, 19.054f)
                lineTo(10.375f, 21.585f)
                lineTo(8.83f, 19.58f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NauruPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Nauru,
            contentDescription = "Nauru Flag"
        )
    }
}
