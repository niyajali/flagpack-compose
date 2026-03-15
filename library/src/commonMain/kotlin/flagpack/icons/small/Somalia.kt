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
 * Somalia Flag (16x12dp)
 *
 * - ISO Alpha-2: SO
 * - ISO Alpha-3: SOM
 * - ISO Numeric: 706
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Somalia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Somalia:SO:SOM:706:Small",
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
                fill = SolidColor(Color(0xFF56C6F5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.989f, 7.359f)
                lineTo(6.107f, 8.555f)
                lineTo(6.739f, 6.461f)
                lineTo(5.396f, 5.092f)
                lineTo(7.247f, 5.052f)
                lineTo(8.066f, 2.984f)
                lineTo(8.812f, 5.079f)
                lineTo(10.658f, 5.111f)
                lineTo(9.271f, 6.505f)
                lineTo(9.918f, 8.497f)
                lineTo(7.989f, 7.359f)
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
            imageVector = FlagIcons.Small.Somalia,
            contentDescription = "Somalia Flag"
        )
    }
}
