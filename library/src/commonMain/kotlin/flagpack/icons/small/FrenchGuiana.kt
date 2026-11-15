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
 * French Guiana Flag (16x12dp)
 *
 * - ISO Alpha-2: GF
 * - ISO Alpha-3: GUF
 * - ISO Numeric: 254
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.FrenchGuiana: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Guiana:GF:GUF:254:Small",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(1f, 0f)
                lineTo(15f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 1f)
                lineTo(16f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                lineTo(1f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11f)
                lineTo(0f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(16f, 12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE21835)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.965f, 7.203f)
                lineTo(6.223f, 8.412f)
                lineTo(6.779f, 6.342f)
                lineTo(5.5f, 5.019f)
                lineTo(7.232f, 4.947f)
                lineTo(7.965f, 2.9f)
                lineTo(8.698f, 4.947f)
                horizontalLineTo(10.428f)
                lineTo(9.151f, 6.342f)
                lineTo(9.791f, 8.29f)
                lineTo(7.965f, 7.203f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchGuianaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.FrenchGuiana,
            contentDescription = "French Guiana Flag"
        )
    }
}
