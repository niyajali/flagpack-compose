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
 * Somalia Flag (32x24dp)
 *
 * - ISO Alpha-2: SO
 * - ISO Alpha-3: SOM
 * - ISO Numeric: 706
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Somalia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Somalia:SO:SOM:706:Large",
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
                fill = SolidColor(Color(0xFF56C6F5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.179f, 14.717f)
                lineTo(12.415f, 17.111f)
                lineTo(13.677f, 12.921f)
                lineTo(10.993f, 10.184f)
                lineTo(14.694f, 10.103f)
                lineTo(16.331f, 5.967f)
                lineTo(17.824f, 10.158f)
                lineTo(21.516f, 10.222f)
                lineTo(18.741f, 13.01f)
                lineTo(20.037f, 16.995f)
                lineTo(16.179f, 14.717f)
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
            imageVector = FlagIcons.Large.Somalia,
            contentDescription = "Somalia Flag"
        )
    }
}
