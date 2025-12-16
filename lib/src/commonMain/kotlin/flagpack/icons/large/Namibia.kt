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
 * Namibia Flag (32x24dp)
 *
 * - ISO Alpha-2: NA
 * - ISO Alpha-3: NAM
 * - ISO Numeric: 516
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Namibia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Namibia:NA:NAM:516:Large",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF3195F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(32f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(-1.012f, 27.094f)
                lineTo(-0.482f, 28.055f)
                lineTo(0.426f, 27.437f)
                lineTo(35.258f, 3.728f)
                lineTo(35.96f, 3.25f)
                lineTo(35.602f, 2.48f)
                lineTo(33.26f, -2.56f)
                lineTo(32.769f, -3.617f)
                lineTo(31.799f, -2.97f)
                lineTo(-3.557f, 20.586f)
                lineTo(-4.323f, 21.096f)
                lineTo(-3.878f, 21.902f)
                lineTo(-1.012f, 27.094f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.23f, 9.245f)
                lineTo(4.936f, 10.859f)
                lineTo(4.622f, 8.814f)
                lineTo(2.694f, 9.565f)
                lineTo(3.445f, 7.637f)
                lineTo(1.4f, 7.324f)
                lineTo(3.015f, 6.03f)
                lineTo(1.4f, 4.736f)
                lineTo(3.445f, 4.422f)
                lineTo(2.694f, 2.494f)
                lineTo(4.622f, 3.245f)
                lineTo(4.936f, 1.2f)
                lineTo(6.23f, 2.815f)
                lineTo(7.524f, 1.2f)
                lineTo(7.837f, 3.245f)
                lineTo(9.765f, 2.494f)
                lineTo(9.014f, 4.422f)
                lineTo(11.059f, 4.736f)
                lineTo(9.445f, 6.03f)
                lineTo(11.059f, 7.324f)
                lineTo(9.014f, 7.637f)
                lineTo(9.765f, 9.565f)
                lineTo(7.837f, 8.814f)
                lineTo(7.524f, 10.859f)
                lineTo(6.23f, 9.245f)
                close()
                moveTo(6.23f, 8.53f)
                curveTo(7.61f, 8.53f, 8.73f, 7.41f, 8.73f, 6.03f)
                curveTo(8.73f, 4.649f, 7.61f, 3.53f, 6.23f, 3.53f)
                curveTo(4.849f, 3.53f, 3.73f, 4.649f, 3.73f, 6.03f)
                curveTo(3.73f, 7.41f, 4.849f, 8.53f, 6.23f, 8.53f)
                close()
                moveTo(8.23f, 6.03f)
                curveTo(8.23f, 7.134f, 7.334f, 8.03f, 6.23f, 8.03f)
                curveTo(5.125f, 8.03f, 4.23f, 7.134f, 4.23f, 6.03f)
                curveTo(4.23f, 4.925f, 5.125f, 4.03f, 6.23f, 4.03f)
                curveTo(7.334f, 4.03f, 8.23f, 4.925f, 8.23f, 6.03f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NamibiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Namibia,
            contentDescription = "Namibia Flag"
        )
    }
}
