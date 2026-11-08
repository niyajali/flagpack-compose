package flagpack.icons.medium

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
 * Guyana Flag (20x15dp)
 *
 * - ISO Alpha-2: GY
 * - ISO Alpha-3: GUY
 * - ISO Numeric: 328
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Guyana: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guyana:GY:GUY:328:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0.625f, 14.117f)
                verticalLineTo(0.883f)
                lineTo(19.372f, 7.5f)
                lineTo(0.625f, 14.117f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                stroke = SolidColor(Color(0xFF272727)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(-0.625f, 14.972f)
                verticalLineTo(0.028f)
                lineTo(8.982f, 7.5f)
                lineTo(-0.625f, 14.972f)
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
            imageVector = FlagIcons.Medium.Guyana,
            contentDescription = "Guyana Flag"
        )
    }
}
