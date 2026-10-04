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
 * Cape Verde Flag (32x24dp)
 *
 * - ISO Alpha-2: CV
 * - ISO Alpha-3: CPV
 * - ISO Numeric: 132
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.CapeVerde: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cape Verde:CV:CPV:132:Large",
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
                fill = SolidColor(Color(0xFF4141DB)),
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
                fill = SolidColor(Color(0xFFF90000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 13f)
                horizontalLineTo(-1f)
                verticalLineTo(14f)
                verticalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(16f)
                verticalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDE00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.796f, 10.259f)
                lineTo(10.522f, 9.751f)
                lineTo(11.224f, 10.259f)
                lineTo(11.006f, 9.354f)
                lineTo(11.57f, 8.78f)
                horizontalLineTo(10.852f)
                lineTo(10.521f, 8.041f)
                lineTo(10.238f, 8.78f)
                horizontalLineTo(9.396f)
                lineTo(10.041f, 9.354f)
                lineTo(9.796f, 10.259f)
                close()
                moveTo(12.796f, 11.859f)
                lineTo(13.522f, 11.351f)
                lineTo(14.224f, 11.859f)
                lineTo(14.006f, 10.954f)
                lineTo(14.57f, 10.38f)
                horizontalLineTo(13.852f)
                lineTo(13.521f, 9.641f)
                lineTo(13.238f, 10.38f)
                horizontalLineTo(12.396f)
                lineTo(13.041f, 10.954f)
                lineTo(12.796f, 11.859f)
                close()
                moveTo(15.922f, 13.751f)
                lineTo(15.196f, 14.259f)
                lineTo(15.441f, 13.354f)
                lineTo(14.796f, 12.78f)
                horizontalLineTo(15.638f)
                lineTo(15.921f, 12.041f)
                lineTo(16.252f, 12.78f)
                horizontalLineTo(16.97f)
                lineTo(16.406f, 13.354f)
                lineTo(16.624f, 14.259f)
                lineTo(15.922f, 13.751f)
                close()
                moveTo(15.196f, 18.26f)
                lineTo(15.922f, 17.751f)
                lineTo(16.624f, 18.26f)
                lineTo(16.406f, 17.354f)
                lineTo(16.97f, 16.78f)
                horizontalLineTo(16.252f)
                lineTo(15.921f, 16.041f)
                lineTo(15.638f, 16.78f)
                horizontalLineTo(14.796f)
                lineTo(15.441f, 17.354f)
                lineTo(15.196f, 18.26f)
                close()
                moveTo(13.522f, 20.151f)
                lineTo(12.796f, 20.66f)
                lineTo(13.041f, 19.754f)
                lineTo(12.396f, 19.18f)
                horizontalLineTo(13.238f)
                lineTo(13.521f, 18.441f)
                lineTo(13.852f, 19.18f)
                horizontalLineTo(14.57f)
                lineTo(14.006f, 19.754f)
                lineTo(14.224f, 20.66f)
                lineTo(13.522f, 20.151f)
                close()
                moveTo(9.796f, 22.26f)
                lineTo(10.522f, 21.751f)
                lineTo(11.224f, 22.26f)
                lineTo(11.006f, 21.354f)
                lineTo(11.57f, 20.78f)
                horizontalLineTo(10.852f)
                lineTo(10.521f, 20.041f)
                lineTo(10.238f, 20.78f)
                horizontalLineTo(9.396f)
                lineTo(10.041f, 21.354f)
                lineTo(9.796f, 22.26f)
                close()
                moveTo(7.522f, 20.151f)
                lineTo(6.796f, 20.66f)
                lineTo(7.041f, 19.754f)
                lineTo(6.396f, 19.18f)
                horizontalLineTo(7.238f)
                lineTo(7.521f, 18.441f)
                lineTo(7.852f, 19.18f)
                horizontalLineTo(8.57f)
                lineTo(8.006f, 19.754f)
                lineTo(8.224f, 20.66f)
                lineTo(7.522f, 20.151f)
                close()
                moveTo(4.396f, 18.26f)
                lineTo(5.122f, 17.751f)
                lineTo(5.824f, 18.26f)
                lineTo(5.606f, 17.354f)
                lineTo(6.17f, 16.78f)
                horizontalLineTo(5.452f)
                lineTo(5.121f, 16.041f)
                lineTo(4.838f, 16.78f)
                horizontalLineTo(3.996f)
                lineTo(4.641f, 17.354f)
                lineTo(4.396f, 18.26f)
                close()
                moveTo(5.122f, 13.751f)
                lineTo(4.396f, 14.259f)
                lineTo(4.641f, 13.354f)
                lineTo(3.996f, 12.78f)
                horizontalLineTo(4.838f)
                lineTo(5.121f, 12.041f)
                lineTo(5.452f, 12.78f)
                horizontalLineTo(6.17f)
                lineTo(5.606f, 13.354f)
                lineTo(5.824f, 14.259f)
                lineTo(5.122f, 13.751f)
                close()
                moveTo(6.796f, 11.859f)
                lineTo(7.522f, 11.351f)
                lineTo(8.224f, 11.859f)
                lineTo(8.006f, 10.954f)
                lineTo(8.57f, 10.38f)
                horizontalLineTo(7.852f)
                lineTo(7.521f, 9.641f)
                lineTo(7.238f, 10.38f)
                horizontalLineTo(6.396f)
                lineTo(7.041f, 10.954f)
                lineTo(6.796f, 11.859f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CapeVerdePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.CapeVerde,
            contentDescription = "Cape Verde Flag"
        )
    }
}
