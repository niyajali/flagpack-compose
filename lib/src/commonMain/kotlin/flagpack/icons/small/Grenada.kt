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
 * Grenada Flag (16x12dp)
 *
 * - ISO Alpha-2: GD
 * - ISO Alpha-3: GRD
 * - ISO Numeric: 308
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Grenada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Grenada:GD:GRD:308:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                curveTo(16f, 11.552f, 15.552f, 12f, 15f, 12f)
                horizontalLineTo(1f)
                curveTo(0.448f, 12f, 0f, 11.552f, 0f, 11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                lineTo(8f, 6f)
                lineTo(3f, 9f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 3f)
                lineTo(8f, 6f)
                lineTo(13f, 9f)
                verticalLineTo(3f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(13f, 3f)
                lineTo(8f, 6f)
                lineTo(13f, 9f)
                verticalLineTo(3f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 8f)
            curveTo(9.105f, 8f, 10f, 7.105f, 10f, 6f)
            curveTo(10f, 4.895f, 9.105f, 4f, 8f, 4f)
            curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
            curveTo(6f, 7.105f, 6.895f, 8f, 8f, 8f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.965f, 6.657f)
            lineTo(6.929f, 7.375f)
            lineTo(7.26f, 6.145f)
            lineTo(6.5f, 5.359f)
            lineTo(7.529f, 5.316f)
            lineTo(7.965f, 4.1f)
            lineTo(8.4f, 5.316f)
            horizontalLineTo(9.428f)
            lineTo(8.669f, 6.145f)
            lineTo(9.049f, 7.302f)
            lineTo(7.965f, 6.657f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.388f, 2.221f)
            lineTo(4.954f, 1.87f)
            lineTo(5.547f, 2.186f)
            lineTo(5.339f, 1.62f)
            lineTo(5.754f, 1.215f)
            horizontalLineTo(5.192f)
            lineTo(4.954f, 0.621f)
            lineTo(4.716f, 1.215f)
            lineTo(4.154f, 1.236f)
            lineTo(4.569f, 1.62f)
            lineTo(4.388f, 2.221f)
            close()
            moveTo(7.388f, 2.221f)
            lineTo(7.954f, 1.87f)
            lineTo(8.547f, 2.186f)
            lineTo(8.339f, 1.62f)
            lineTo(8.754f, 1.215f)
            horizontalLineTo(8.192f)
            lineTo(7.954f, 0.621f)
            lineTo(7.716f, 1.215f)
            lineTo(7.154f, 1.236f)
            lineTo(7.569f, 1.62f)
            lineTo(7.388f, 2.221f)
            close()
            moveTo(10.954f, 1.87f)
            lineTo(10.388f, 2.221f)
            lineTo(10.569f, 1.62f)
            lineTo(10.154f, 1.236f)
            lineTo(10.716f, 1.215f)
            lineTo(10.954f, 0.621f)
            lineTo(11.192f, 1.215f)
            horizontalLineTo(11.754f)
            lineTo(11.339f, 1.62f)
            lineTo(11.547f, 2.186f)
            lineTo(10.954f, 1.87f)
            close()
            moveTo(4.388f, 11.084f)
            lineTo(4.954f, 10.733f)
            lineTo(5.546f, 11.048f)
            lineTo(5.339f, 10.483f)
            lineTo(5.753f, 10.078f)
            horizontalLineTo(5.192f)
            lineTo(4.954f, 9.484f)
            lineTo(4.716f, 10.078f)
            lineTo(4.153f, 10.099f)
            lineTo(4.569f, 10.483f)
            lineTo(4.388f, 11.084f)
            close()
            moveTo(7.954f, 10.733f)
            lineTo(7.388f, 11.084f)
            lineTo(7.569f, 10.483f)
            lineTo(7.153f, 10.099f)
            lineTo(7.716f, 10.078f)
            lineTo(7.954f, 9.484f)
            lineTo(8.192f, 10.078f)
            horizontalLineTo(8.753f)
            lineTo(8.339f, 10.483f)
            lineTo(8.546f, 11.048f)
            lineTo(7.954f, 10.733f)
            close()
            moveTo(10.388f, 11.084f)
            lineTo(10.954f, 10.733f)
            lineTo(11.546f, 11.048f)
            lineTo(11.339f, 10.483f)
            lineTo(11.753f, 10.078f)
            horizontalLineTo(11.192f)
            lineTo(10.954f, 9.484f)
            lineTo(10.716f, 10.078f)
            lineTo(10.153f, 10.099f)
            lineTo(10.569f, 10.483f)
            lineTo(10.388f, 11.084f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.317f, 6.386f)
            curveTo(4.317f, 6.386f, 4.587f, 6.626f, 4.733f, 6.707f)
            curveTo(4.784f, 6.516f, 4.671f, 6.081f, 4.671f, 6.081f)
            curveTo(4.639f, 5.978f, 4.292f, 5.792f, 4.292f, 5.792f)
            curveTo(4.292f, 5.792f, 4.195f, 6.119f, 4.317f, 6.386f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.598f, 6.965f)
            curveTo(4.598f, 6.965f, 3.906f, 6.642f, 3.836f, 6.185f)
            curveTo(3.766f, 5.728f, 3.915f, 5f, 3.915f, 5f)
            curveTo(3.915f, 5f, 5.038f, 5.255f, 5.114f, 5.803f)
            curveTo(5.191f, 6.351f, 4.937f, 6.695f, 4.937f, 6.695f)
            curveTo(4.937f, 6.695f, 4.677f, 6.027f, 4.432f, 5.953f)
            curveTo(4.432f, 5.953f, 4.432f, 6.615f, 4.598f, 6.965f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GrenadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Grenada,
            contentDescription = "Grenada Flag"
        )
    }
}
