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
 * Curacao Flag (32x24dp)
 *
 * - ISO Alpha-2: CW
 * - ISO Alpha-3: CUW
 * - ISO Numeric: 531
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Curacao: ImageVector by lazy {
    ImageVector.Builder(
        name = "Curacao:CW:CUW:531:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.254f, 6.149f)
                lineTo(2.266f, 7.199f)
                lineTo(3.226f, 5.331f)
                lineTo(2f, 3.963f)
                lineTo(3.523f, 3.907f)
                lineTo(4.254f, 2f)
                lineTo(4.812f, 3.907f)
                lineTo(6.595f, 3.963f)
                lineTo(5.311f, 5.331f)
                lineTo(6.126f, 7.199f)
                lineTo(4.254f, 6.149f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.352f, 11.076f)
                lineTo(8.898f, 12.105f)
                lineTo(9.861f, 9.528f)
                lineTo(7.726f, 7.799f)
                horizontalLineTo(10.284f)
                lineTo(11.352f, 5.012f)
                lineTo(12.168f, 7.799f)
                horizontalLineTo(14.729f)
                lineTo(12.909f, 9.528f)
                lineTo(13.813f, 12.105f)
                lineTo(11.352f, 11.076f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9E813)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CuracaoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Curacao,
            contentDescription = "Curacao Flag"
        )
    }
}
