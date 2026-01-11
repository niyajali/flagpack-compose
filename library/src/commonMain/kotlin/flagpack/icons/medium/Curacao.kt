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
 * Curacao Flag (20x15dp)
 *
 * - ISO Alpha-2: CW
 * - ISO Alpha-3: CUW
 * - ISO Numeric: 531
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Curacao: ImageVector by lazy {
    ImageVector.Builder(
        name = "Curacao:CW:CUW:531:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.659f, 3.843f)
                lineTo(1.416f, 4.499f)
                lineTo(2.016f, 3.332f)
                lineTo(1.25f, 2.477f)
                lineTo(2.202f, 2.442f)
                lineTo(2.659f, 1.25f)
                lineTo(3.008f, 2.442f)
                lineTo(4.122f, 2.477f)
                lineTo(3.32f, 3.332f)
                lineTo(3.829f, 4.499f)
                lineTo(2.659f, 3.843f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.095f, 6.923f)
                lineTo(5.561f, 7.565f)
                lineTo(6.163f, 5.955f)
                lineTo(4.829f, 4.875f)
                horizontalLineTo(6.427f)
                lineTo(7.095f, 3.133f)
                lineTo(7.605f, 4.875f)
                horizontalLineTo(9.206f)
                lineTo(8.068f, 5.955f)
                lineTo(8.633f, 7.565f)
                lineTo(7.095f, 6.923f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9E813)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
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
            imageVector = FlagIcons.Medium.Curacao,
            contentDescription = "Curacao Flag"
        )
    }
}
