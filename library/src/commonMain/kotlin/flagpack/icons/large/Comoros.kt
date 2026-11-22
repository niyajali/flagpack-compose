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
 * Comoros Flag (32x24dp)
 *
 * - ISO Alpha-2: KM
 * - ISO Alpha-3: COM
 * - ISO Numeric: 174
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Comoros: ImageVector by lazy {
    ImageVector.Builder(
        name = "Comoros:KM:COM:174:Large",
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
                fill = SolidColor(Color(0xFF5196ED)),
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
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(19f, 12f)
                lineTo(0f, 24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.305f, 16.501f)
                curveTo(7.305f, 16.501f, 3.721f, 15.278f, 3.848f, 11.449f)
                curveTo(3.975f, 7.62f, 7.623f, 6.87f, 7.623f, 6.87f)
                curveTo(6.346f, 5.947f, 1.773f, 7.029f, 1.627f, 11.449f)
                curveTo(1.481f, 15.87f, 5.942f, 16.852f, 7.305f, 16.501f)
                close()
                moveTo(7.412f, 9.809f)
                lineTo(7.524f, 9.155f)
                lineTo(7.049f, 8.691f)
                lineTo(7.706f, 8.595f)
                lineTo(8f, 8f)
                lineTo(8.294f, 8.595f)
                lineTo(8.951f, 8.691f)
                lineTo(8.476f, 9.155f)
                lineTo(8.588f, 9.809f)
                lineTo(8f, 9.5f)
                lineTo(7.412f, 9.809f)
                close()
                moveTo(7.524f, 11.155f)
                lineTo(7.412f, 11.809f)
                lineTo(8f, 11.5f)
                lineTo(8.588f, 11.809f)
                lineTo(8.476f, 11.155f)
                lineTo(8.951f, 10.691f)
                lineTo(8.294f, 10.595f)
                lineTo(8f, 10f)
                lineTo(7.706f, 10.595f)
                lineTo(7.049f, 10.691f)
                lineTo(7.524f, 11.155f)
                close()
                moveTo(7.412f, 13.809f)
                lineTo(7.524f, 13.155f)
                lineTo(7.049f, 12.691f)
                lineTo(7.706f, 12.595f)
                lineTo(8f, 12f)
                lineTo(8.294f, 12.595f)
                lineTo(8.951f, 12.691f)
                lineTo(8.476f, 13.155f)
                lineTo(8.588f, 13.809f)
                lineTo(8f, 13.5f)
                lineTo(7.412f, 13.809f)
                close()
                moveTo(7.412f, 15.809f)
                lineTo(7.524f, 15.155f)
                lineTo(7.049f, 14.691f)
                lineTo(7.706f, 14.595f)
                lineTo(8f, 14f)
                lineTo(8.294f, 14.595f)
                lineTo(8.951f, 14.691f)
                lineTo(8.476f, 15.155f)
                lineTo(8.588f, 15.809f)
                lineTo(8f, 15.5f)
                lineTo(7.412f, 15.809f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ComorosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Comoros,
            contentDescription = "Comoros Flag"
        )
    }
}
