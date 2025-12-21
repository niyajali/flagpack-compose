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
 * Timor Leste Flag (20x15dp)
 *
 * - ISO Alpha-2: TL
 * - ISO Alpha-3: TLS
 * - ISO Numeric: 626
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.TimorLeste: ImageVector by lazy {
    ImageVector.Builder(
        name = "Timor Leste:TL:TLS:626:Medium",
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
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, -0.625f)
                horizontalLineTo(-0.625f)
                verticalLineTo(0f)
                verticalLineTo(15f)
                verticalLineTo(15.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(15f)
                verticalLineTo(0f)
                verticalLineTo(-0.625f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(15f, 7.5f)
                lineTo(0f, 15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(10f, 7.5f)
                lineTo(0f, 15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.155f, 9.005f)
                lineTo(2.893f, 10.318f)
                lineTo(2.761f, 8.452f)
                lineTo(1.151f, 7.46f)
                lineTo(2.83f, 6.934f)
                lineTo(3.104f, 5.085f)
                lineTo(4.267f, 6.549f)
                lineTo(5.962f, 6.095f)
                lineTo(5.085f, 7.829f)
                lineTo(5.937f, 9.502f)
                lineTo(4.155f, 9.005f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TimorLestePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.TimorLeste,
            contentDescription = "Timor Leste Flag"
        )
    }
}
