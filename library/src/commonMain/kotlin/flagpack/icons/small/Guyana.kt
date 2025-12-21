package flagpack.icons.small

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
 * Guyana Flag (16x12dp)
 *
 * - ISO Alpha-2: GY
 * - ISO Alpha-3: GUY
 * - ISO Numeric: 328
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Guyana: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guyana:GY:GUY:328:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(0.5f, 11.293f)
                verticalLineTo(0.707f)
                lineTo(15.498f, 6f)
                lineTo(0.5f, 11.293f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                stroke = SolidColor(Color(0xFF272727)),
                strokeLineWidth = 1f
            ) {
                moveTo(-0.5f, 11.978f)
                verticalLineTo(0.022f)
                lineTo(7.186f, 6f)
                lineTo(-0.5f, 11.978f)
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
            imageVector = FlagIcons.Small.Guyana,
            contentDescription = "Guyana Flag"
        )
    }
}
