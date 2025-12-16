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
 * French Guiana Flag (20x15dp)
 *
 * - ISO Alpha-2: GF
 * - ISO Alpha-3: GUF
 * - ISO Numeric: 254
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.FrenchGuiana: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Guiana:GF:GUF:254:Medium",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(20f, 15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE21835)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.957f, 9.004f)
                lineTo(7.778f, 10.515f)
                lineTo(8.474f, 7.927f)
                lineTo(6.875f, 6.274f)
                lineTo(9.04f, 6.184f)
                lineTo(9.957f, 3.625f)
                lineTo(10.873f, 6.184f)
                horizontalLineTo(13.035f)
                lineTo(11.439f, 7.927f)
                lineTo(12.238f, 10.362f)
                lineTo(9.957f, 9.004f)
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
            imageVector = FlagIcons.Medium.FrenchGuiana,
            contentDescription = "French Guiana Flag"
        )
    }
}
