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
 * Somalia Flag (20x15dp)
 *
 * - ISO Alpha-2: SO
 * - ISO Alpha-3: SOM
 * - ISO Numeric: 706
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Somalia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Somalia:SO:SOM:706:Medium",
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
                fill = SolidColor(Color(0xFF56C6F5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.112f, 9.198f)
                lineTo(7.759f, 10.694f)
                lineTo(8.548f, 8.076f)
                lineTo(6.87f, 6.365f)
                lineTo(9.184f, 6.315f)
                lineTo(10.207f, 3.73f)
                lineTo(11.14f, 6.349f)
                lineTo(13.448f, 6.389f)
                lineTo(11.713f, 8.131f)
                lineTo(12.523f, 10.622f)
                lineTo(10.112f, 9.198f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SomaliaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Somalia,
            contentDescription = "Somalia Flag"
        )
    }
}
