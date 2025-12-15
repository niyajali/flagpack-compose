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
 * China Flag (20x15dp)
 *
 * - ISO Alpha-2: CN
 * - ISO Alpha-3: CHN
 * - ISO Numeric: 156
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.China: ImageVector by lazy {
    ImageVector.Builder(
        name = "China:CN:CHN:156:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.446f, 6.097f)
                lineTo(2.013f, 8.004f)
                lineTo(2.942f, 5.12f)
                lineTo(1.319f, 3.62f)
                lineTo(3.517f, 3.539f)
                lineTo(4.446f, 1.218f)
                lineTo(5.376f, 3.539f)
                horizontalLineTo(7.569f)
                lineTo(5.95f, 5.12f)
                lineTo(6.688f, 8.004f)
                lineTo(4.446f, 6.097f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.385f, 3.857f)
                lineTo(8.364f, 4.474f)
                lineTo(8.597f, 3.271f)
                lineTo(7.747f, 2.371f)
                lineTo(8.898f, 2.322f)
                lineTo(9.385f, 1.199f)
                lineTo(9.872f, 2.322f)
                horizontalLineTo(11.022f)
                lineTo(10.173f, 3.271f)
                lineTo(10.429f, 4.474f)
                lineTo(9.385f, 3.857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.635f, 6.357f)
                lineTo(9.614f, 6.974f)
                lineTo(9.847f, 5.771f)
                lineTo(8.997f, 4.871f)
                lineTo(10.148f, 4.822f)
                lineTo(10.635f, 3.699f)
                lineTo(11.122f, 4.822f)
                horizontalLineTo(12.272f)
                lineTo(11.423f, 5.771f)
                lineTo(11.679f, 6.974f)
                lineTo(10.635f, 6.357f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.385f, 8.857f)
                lineTo(8.364f, 9.474f)
                lineTo(8.597f, 8.271f)
                lineTo(7.747f, 7.371f)
                lineTo(8.898f, 7.322f)
                lineTo(9.385f, 6.199f)
                lineTo(9.872f, 7.322f)
                horizontalLineTo(11.022f)
                lineTo(10.173f, 8.271f)
                lineTo(10.429f, 9.474f)
                lineTo(9.385f, 8.857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.885f, 10.107f)
                lineTo(5.864f, 10.724f)
                lineTo(6.097f, 9.521f)
                lineTo(5.247f, 8.621f)
                lineTo(6.398f, 8.572f)
                lineTo(6.885f, 7.449f)
                lineTo(7.372f, 8.572f)
                horizontalLineTo(8.522f)
                lineTo(7.673f, 9.521f)
                lineTo(7.929f, 10.724f)
                lineTo(6.885f, 10.107f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChinaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.China,
            contentDescription = "China Flag"
        )
    }
}
