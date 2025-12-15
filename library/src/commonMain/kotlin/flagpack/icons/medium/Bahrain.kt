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
 * Bahrain Flag (20x15dp)
 *
 * - ISO Alpha-2: BH
 * - ISO Alpha-3: BHR
 * - ISO Numeric: 048
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bahrain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bahrain:BH:BHR:048:Medium",
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
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(4.25f)
                lineTo(7.5f, 1.25f)
                lineTo(4.25f, 2.5f)
                lineTo(7.5f, 3.75f)
                lineTo(4.25f, 5f)
                lineTo(7.5f, 6.25f)
                lineTo(4.25f, 7.5f)
                lineTo(7.5f, 8.75f)
                lineTo(4.25f, 10f)
                lineTo(7.5f, 11.25f)
                lineTo(4.25f, 12.5f)
                lineTo(7.5f, 13.75f)
                lineTo(4.25f, 15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BahrainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bahrain,
            contentDescription = "Bahrain Flag"
        )
    }
}
