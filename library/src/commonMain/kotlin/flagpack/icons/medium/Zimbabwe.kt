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
 * Zimbabwe Flag (20x15dp)
 *
 * - ISO Alpha-2: ZW
 * - ISO Alpha-3: ZWE
 * - ISO Numeric: 716
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Zimbabwe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Zimbabwe:ZW:ZWE:716:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 1.25f)
                verticalLineTo(13.75f)
                horizontalLineTo(20f)
                verticalLineTo(1.25f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 2.1875f
            ) {
                moveTo(0f, 5.156f)
                horizontalLineTo(-1.094f)
                verticalLineTo(6.25f)
                verticalLineTo(8.75f)
                verticalLineTo(9.844f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(21.094f)
                verticalLineTo(8.75f)
                verticalLineTo(6.25f)
                verticalLineTo(5.156f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2.5f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(2.5f)
                horizontalLineTo(0f)
                close()
                moveTo(0f, 15f)
                verticalLineTo(12.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            stroke = SolidColor(Color(0xFF272727)),
            strokeLineWidth = 1.25f
        ) {
            moveTo(0.373f, -0.501f)
            lineTo(-0.625f, -1.244f)
            verticalLineTo(0f)
            verticalLineTo(15f)
            verticalLineTo(16.226f)
            lineTo(0.367f, 15.506f)
            lineTo(10.574f, 8.101f)
            lineTo(11.263f, 7.601f)
            lineTo(10.58f, 7.094f)
            lineTo(0.373f, -0.501f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0.373f, -0.501f)
                lineTo(-0.625f, -1.244f)
                verticalLineTo(0f)
                verticalLineTo(15f)
                verticalLineTo(16.226f)
                lineTo(0.367f, 15.506f)
                lineTo(10.574f, 8.101f)
                lineTo(11.263f, 7.601f)
                lineTo(10.58f, 7.094f)
                lineTo(0.373f, -0.501f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.674f, 8.924f)
                lineTo(2.312f, 10.83f)
                lineTo(3.396f, 8.283f)
                lineTo(1.534f, 6.49f)
                horizontalLineTo(3.731f)
                lineTo(4.633f, 4.328f)
                lineTo(5.591f, 6.49f)
                horizontalLineTo(7.784f)
                lineTo(5.824f, 8.283f)
                lineTo(6.805f, 10.83f)
                lineTo(4.674f, 8.924f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.136f, 5.263f)
                curveTo(3.136f, 5.263f, 3.102f, 5.181f, 3.304f, 5.108f)
                curveTo(3.506f, 5.035f, 3.568f, 4.88f, 3.727f, 4.994f)
                curveTo(3.886f, 5.108f, 3.985f, 4.879f, 4.03f, 5.207f)
                curveTo(4.076f, 5.536f, 4.201f, 6.054f, 4.201f, 6.054f)
                lineTo(6.256f, 7.598f)
                horizontalLineTo(5.87f)
                curveTo(5.87f, 7.598f, 5.269f, 8.482f, 5.368f, 9.256f)
                curveTo(5.368f, 9.256f, 4.953f, 9.193f, 4.391f, 9.193f)
                curveTo(3.829f, 9.193f, 3.461f, 9.328f, 3.461f, 9.328f)
                lineTo(3.136f, 8.126f)
                curveTo(3.136f, 8.126f, 3.254f, 7.924f, 3.304f, 7.761f)
                curveTo(3.355f, 7.598f, 3.564f, 7.568f, 3.564f, 7.439f)
                curveTo(3.564f, 7.309f, 3.357f, 7.201f, 3.461f, 6.865f)
                curveTo(3.564f, 6.53f, 3.564f, 5.528f, 3.564f, 5.528f)
                curveTo(3.564f, 5.528f, 3.238f, 5.384f, 3.304f, 5.384f)
                curveTo(3.37f, 5.384f, 3.522f, 5.263f, 3.413f, 5.263f)
                curveTo(3.304f, 5.263f, 3.136f, 5.263f, 3.136f, 5.263f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ZimbabwePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Zimbabwe,
            contentDescription = "Zimbabwe Flag"
        )
    }
}
