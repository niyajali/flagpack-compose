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
 * Tokelau Flag (16x12dp)
 *
 * - ISO Alpha-2: TK
 * - ISO Alpha-3: TKL
 * - ISO Numeric: 772
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Tokelau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tokelau:TK:TKL:772:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.647f, 5.032f)
                lineTo(1.204f, 5.306f)
                lineTo(1.376f, 4.846f)
                lineTo(1f, 4.498f)
                horizontalLineTo(1.457f)
                lineTo(1.647f, 4f)
                lineTo(1.793f, 4.498f)
                horizontalLineTo(2.25f)
                lineTo(1.921f, 4.846f)
                lineTo(2.082f, 5.306f)
                lineTo(1.647f, 5.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.647f, 3.032f)
                lineTo(3.204f, 3.306f)
                lineTo(3.376f, 2.846f)
                lineTo(3f, 2.498f)
                horizontalLineTo(3.457f)
                lineTo(3.647f, 2f)
                lineTo(3.793f, 2.498f)
                horizontalLineTo(4.25f)
                lineTo(3.921f, 2.846f)
                lineTo(4.082f, 3.306f)
                lineTo(3.647f, 3.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.647f, 5.032f)
                lineTo(5.204f, 5.306f)
                lineTo(5.376f, 4.846f)
                lineTo(5f, 4.498f)
                horizontalLineTo(5.457f)
                lineTo(5.647f, 4f)
                lineTo(5.793f, 4.498f)
                horizontalLineTo(6.25f)
                lineTo(5.92f, 4.846f)
                lineTo(6.082f, 5.306f)
                lineTo(5.647f, 5.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.647f, 7.032f)
                lineTo(3.204f, 7.306f)
                lineTo(3.376f, 6.846f)
                lineTo(3f, 6.498f)
                horizontalLineTo(3.457f)
                lineTo(3.647f, 6f)
                lineTo(3.793f, 6.498f)
                horizontalLineTo(4.25f)
                lineTo(3.921f, 6.846f)
                lineTo(4.082f, 7.306f)
                lineTo(3.647f, 7.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.421f, 2.732f)
                curveTo(10.379f, 3.74f, 3.671f, 8.273f, 3.671f, 8.273f)
                horizontalLineTo(14.846f)
                curveTo(14.735f, 8.248f, 14.63f, 8.227f, 14.532f, 8.207f)
                curveTo(13.712f, 8.044f, 13.307f, 7.963f, 12.421f, 6.199f)
                curveTo(11.429f, 4.222f, 12.421f, 2.732f, 12.421f, 2.732f)
                close()
                moveTo(3.308f, 8.983f)
                lineTo(3.155f, 9.363f)
                lineTo(3.308f, 9.78f)
                lineTo(14.685f, 10f)
                lineTo(15f, 9.42f)
                lineTo(14.685f, 9.003f)
                lineTo(3.308f, 8.983f)
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
            imageVector = FlagIcons.Small.Tokelau,
            contentDescription = "Tokelau Flag"
        )
    }
}
