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
 * India Flag (20x15dp)
 *
 * - ISO Alpha-2: IN
 * - ISO Alpha-3: IND
 * - ISO Numeric: 356
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.India: ImageVector by lazy {
    ImageVector.Builder(
        name = "India:IN:IND:356:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFFF8C1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 7.5f)
                curveTo(7.5f, 8.881f, 8.619f, 10f, 10f, 10f)
                curveTo(11.381f, 10f, 12.5f, 8.881f, 12.5f, 7.5f)
                curveTo(12.5f, 6.119f, 11.381f, 5f, 10f, 5f)
                curveTo(8.619f, 5f, 7.5f, 6.119f, 7.5f, 7.5f)
                close()
                moveTo(11.875f, 7.5f)
                curveTo(11.875f, 8.536f, 11.035f, 9.375f, 10f, 9.375f)
                curveTo(8.964f, 9.375f, 8.125f, 8.536f, 8.125f, 7.5f)
                curveTo(8.125f, 6.464f, 8.964f, 5.625f, 10f, 5.625f)
                curveTo(11.035f, 5.625f, 11.875f, 6.464f, 11.875f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.997f, 8.038f)
                lineTo(9.475f, 9.959f)
                lineTo(9.781f, 7.992f)
                lineTo(8.523f, 9.535f)
                lineTo(9.602f, 7.862f)
                lineTo(7.826f, 8.76f)
                lineTo(9.492f, 7.671f)
                lineTo(7.503f, 7.769f)
                lineTo(9.468f, 7.451f)
                lineTo(7.612f, 6.732f)
                lineTo(9.537f, 7.241f)
                lineTo(8.134f, 5.829f)
                lineTo(9.684f, 7.077f)
                lineTo(8.977f, 5.217f)
                lineTo(9.886f, 6.987f)
                lineTo(9.997f, 5f)
                lineTo(10.107f, 6.987f)
                lineTo(11.016f, 5.217f)
                lineTo(10.309f, 7.077f)
                lineTo(11.86f, 5.829f)
                lineTo(10.457f, 7.241f)
                lineTo(12.381f, 6.732f)
                lineTo(10.525f, 7.451f)
                lineTo(12.49f, 7.769f)
                lineTo(10.502f, 7.671f)
                lineTo(12.168f, 8.76f)
                lineTo(10.391f, 7.862f)
                lineTo(11.47f, 9.535f)
                lineTo(10.213f, 7.992f)
                lineTo(10.518f, 9.959f)
                lineTo(9.997f, 8.038f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IndiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.India,
            contentDescription = "India Flag"
        )
    }
}
