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
 * Tokelau Flag (32x24dp)
 *
 * - ISO Alpha-2: TK
 * - ISO Alpha-3: TKL
 * - ISO Numeric: 772
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Tokelau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tokelau:TK:TKL:772:Large",
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
                moveTo(3.294f, 10.063f)
                lineTo(2.409f, 10.611f)
                lineTo(2.753f, 9.691f)
                lineTo(2f, 8.995f)
                horizontalLineTo(2.913f)
                lineTo(3.294f, 8f)
                lineTo(3.586f, 8.995f)
                horizontalLineTo(4.5f)
                lineTo(3.841f, 9.691f)
                lineTo(4.164f, 10.611f)
                lineTo(3.294f, 10.063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.294f, 6.063f)
                lineTo(6.409f, 6.611f)
                lineTo(6.753f, 5.691f)
                lineTo(6f, 4.995f)
                horizontalLineTo(6.913f)
                lineTo(7.294f, 4f)
                lineTo(7.586f, 4.995f)
                horizontalLineTo(8.5f)
                lineTo(7.841f, 5.691f)
                lineTo(8.164f, 6.611f)
                lineTo(7.294f, 6.063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.295f, 10.063f)
                lineTo(10.409f, 10.611f)
                lineTo(10.753f, 9.691f)
                lineTo(10f, 8.995f)
                horizontalLineTo(10.913f)
                lineTo(11.295f, 8f)
                lineTo(11.586f, 8.995f)
                horizontalLineTo(12.5f)
                lineTo(11.841f, 9.691f)
                lineTo(12.164f, 10.611f)
                lineTo(11.295f, 10.063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.294f, 14.063f)
                lineTo(6.409f, 14.611f)
                lineTo(6.753f, 13.691f)
                lineTo(6f, 12.995f)
                horizontalLineTo(6.913f)
                lineTo(7.294f, 12f)
                lineTo(7.586f, 12.995f)
                horizontalLineTo(8.5f)
                lineTo(7.841f, 13.691f)
                lineTo(8.164f, 14.611f)
                lineTo(7.294f, 14.063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24.842f, 5.463f)
                curveTo(20.758f, 7.48f, 7.341f, 16.545f, 7.341f, 16.545f)
                horizontalLineTo(29.692f)
                curveTo(29.469f, 16.495f, 29.261f, 16.454f, 29.065f, 16.415f)
                curveTo(27.424f, 16.088f, 26.614f, 15.927f, 24.842f, 12.397f)
                curveTo(22.858f, 8.445f, 24.842f, 5.463f, 24.842f, 5.463f)
                close()
                moveTo(6.616f, 17.965f)
                lineTo(6.31f, 18.725f)
                lineTo(6.616f, 19.56f)
                lineTo(29.369f, 20f)
                lineTo(30f, 18.84f)
                lineTo(29.369f, 18.005f)
                lineTo(6.616f, 17.965f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TokelauPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Tokelau,
            contentDescription = "Tokelau Flag"
        )
    }
}
