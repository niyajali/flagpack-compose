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
 * Guyana Flag (32x24dp)
 *
 * - ISO Alpha-2: GY
 * - ISO Alpha-3: GUY
 * - ISO Numeric: 328
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Guyana: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guyana:GY:GUY:328:Large",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(1f, 22.587f)
                verticalLineTo(1.413f)
                lineTo(30.995f, 12f)
                lineTo(1f, 22.587f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                stroke = SolidColor(Color(0xFF272727)),
                strokeLineWidth = 2f
            ) {
                moveTo(-1f, 23.955f)
                verticalLineTo(0.045f)
                lineTo(14.371f, 12f)
                lineTo(-1f, 23.955f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuyanaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Guyana,
            contentDescription = "Guyana Flag"
        )
    }
}
