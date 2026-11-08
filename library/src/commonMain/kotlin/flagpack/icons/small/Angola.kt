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
 * Angola Flag (16x12dp)
 *
 * - ISO Alpha-2: AO
 * - ISO Alpha-3: AGO
 * - ISO Numeric: 024
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Angola: ImageVector by lazy {
    ImageVector.Builder(
        name = "Angola:AO:AGO:024:Small",
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
                fill = SolidColor(Color(0xFF1D1D1D)),
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
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCFF01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.775f, 6.696f)
                curveTo(8.163f, 6.217f, 8.284f, 5.598f, 8.284f, 5.211f)
                curveTo(8.284f, 3.152f, 5.715f, 2.013f, 5.715f, 2.013f)
                curveTo(7.481f, 2.013f, 9.448f, 3.445f, 9.448f, 5.211f)
                curveTo(9.448f, 5.959f, 9.192f, 6.653f, 8.762f, 7.205f)
                curveTo(9.549f, 7.597f, 10.215f, 7.904f, 10.215f, 7.904f)
                curveTo(10.462f, 8.066f, 10.531f, 8.498f, 10.369f, 8.745f)
                curveTo(10.207f, 8.992f, 9.875f, 9.061f, 9.628f, 8.899f)
                curveTo(9.628f, 8.899f, 8.996f, 8.526f, 8.611f, 8.273f)
                curveTo(8.434f, 8.157f, 8.23f, 8.032f, 8.013f, 7.903f)
                curveTo(7.508f, 8.244f, 6.902f, 8.443f, 6.25f, 8.443f)
                curveTo(6.25f, 8.443f, 3.902f, 8.155f, 3.969f, 6.951f)
                curveTo(3.969f, 6.951f, 4.537f, 7.386f, 6.21f, 7.386f)
                curveTo(6.476f, 7.386f, 6.71f, 7.349f, 6.915f, 7.283f)
                curveTo(6.191f, 6.888f, 5.577f, 6.574f, 5.577f, 6.574f)
                curveTo(5.329f, 6.412f, 4.686f, 5.591f, 4.848f, 5.344f)
                curveTo(5.01f, 5.096f, 5.991f, 5.376f, 6.238f, 5.538f)
                curveTo(6.238f, 5.538f, 6.581f, 6.01f, 7.067f, 6.298f)
                curveTo(7.281f, 6.426f, 7.523f, 6.561f, 7.775f, 6.696f)
                close()
                moveTo(6.59f, 4.901f)
                lineTo(6.085f, 5.238f)
                lineTo(6.247f, 4.661f)
                lineTo(5.876f, 4.293f)
                lineTo(6.378f, 4.273f)
                lineTo(6.59f, 3.704f)
                lineTo(6.803f, 4.273f)
                horizontalLineTo(7.304f)
                lineTo(6.934f, 4.661f)
                lineTo(7.119f, 5.204f)
                lineTo(6.59f, 4.901f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEA42)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.775f, 6.696f)
                curveTo(8.163f, 6.217f, 8.284f, 5.598f, 8.284f, 5.211f)
                curveTo(8.284f, 3.152f, 5.715f, 2.013f, 5.715f, 2.013f)
                curveTo(7.481f, 2.013f, 9.448f, 3.445f, 9.448f, 5.211f)
                curveTo(9.448f, 5.959f, 9.192f, 6.653f, 8.762f, 7.205f)
                curveTo(9.549f, 7.597f, 10.215f, 7.904f, 10.215f, 7.904f)
                curveTo(10.462f, 8.066f, 10.531f, 8.498f, 10.369f, 8.745f)
                curveTo(10.207f, 8.992f, 9.875f, 9.061f, 9.628f, 8.899f)
                curveTo(9.628f, 8.899f, 8.996f, 8.526f, 8.611f, 8.273f)
                curveTo(8.434f, 8.157f, 8.23f, 8.032f, 8.013f, 7.903f)
                curveTo(7.508f, 8.244f, 6.902f, 8.443f, 6.25f, 8.443f)
                curveTo(6.25f, 8.443f, 3.902f, 8.155f, 3.969f, 6.951f)
                curveTo(3.969f, 6.951f, 4.537f, 7.386f, 6.21f, 7.386f)
                curveTo(6.476f, 7.386f, 6.71f, 7.349f, 6.915f, 7.283f)
                curveTo(6.191f, 6.888f, 5.577f, 6.574f, 5.577f, 6.574f)
                curveTo(5.329f, 6.412f, 4.686f, 5.591f, 4.848f, 5.344f)
                curveTo(5.01f, 5.096f, 5.991f, 5.376f, 6.238f, 5.538f)
                curveTo(6.238f, 5.538f, 6.581f, 6.01f, 7.067f, 6.298f)
                curveTo(7.281f, 6.426f, 7.523f, 6.561f, 7.775f, 6.696f)
                close()
                moveTo(6.59f, 4.901f)
                lineTo(6.085f, 5.238f)
                lineTo(6.247f, 4.661f)
                lineTo(5.876f, 4.293f)
                lineTo(6.378f, 4.273f)
                lineTo(6.59f, 3.704f)
                lineTo(6.803f, 4.273f)
                horizontalLineTo(7.304f)
                lineTo(6.934f, 4.661f)
                lineTo(7.119f, 5.204f)
                lineTo(6.59f, 4.901f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AngolaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Angola,
            contentDescription = "Angola Flag"
        )
    }
}
