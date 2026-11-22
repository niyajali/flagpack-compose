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
 * Grenada Flag (32x24dp)
 *
 * - ISO Alpha-2: GD
 * - ISO Alpha-3: GRD
 * - ISO Numeric: 308
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Grenada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Grenada:GD:GRD:308:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                horizontalLineTo(26f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6f, 6f)
                horizontalLineTo(26f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                lineTo(16f, 12f)
                lineTo(6f, 18f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(26f, 6f)
                lineTo(16f, 12f)
                lineTo(26f, 18f)
                verticalLineTo(6f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(26f, 6f)
                lineTo(16f, 12f)
                lineTo(26f, 18f)
                verticalLineTo(6f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16f, 16f)
            curveTo(18.209f, 16f, 20f, 14.209f, 20f, 12f)
            curveTo(20f, 9.791f, 18.209f, 8f, 16f, 8f)
            curveTo(13.791f, 8f, 12f, 9.791f, 12f, 12f)
            curveTo(12f, 14.209f, 13.791f, 16f, 16f, 16f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.929f, 13.313f)
            lineTo(13.858f, 14.75f)
            lineTo(14.52f, 12.289f)
            lineTo(13f, 10.718f)
            lineTo(15.059f, 10.633f)
            lineTo(15.929f, 8.2f)
            lineTo(16.8f, 10.633f)
            horizontalLineTo(18.855f)
            lineTo(17.339f, 12.289f)
            lineTo(18.098f, 14.604f)
            lineTo(15.929f, 13.313f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.777f, 4.442f)
            lineTo(9.908f, 3.74f)
            lineTo(11.094f, 4.371f)
            lineTo(10.679f, 3.24f)
            lineTo(11.507f, 2.431f)
            horizontalLineTo(10.384f)
            lineTo(9.908f, 1.242f)
            lineTo(9.432f, 2.431f)
            lineTo(8.307f, 2.472f)
            lineTo(9.138f, 3.24f)
            lineTo(8.777f, 4.442f)
            close()
            moveTo(14.777f, 4.442f)
            lineTo(15.908f, 3.74f)
            lineTo(17.094f, 4.371f)
            lineTo(16.679f, 3.24f)
            lineTo(17.507f, 2.431f)
            horizontalLineTo(16.384f)
            lineTo(15.908f, 1.242f)
            lineTo(15.432f, 2.431f)
            lineTo(14.307f, 2.472f)
            lineTo(15.138f, 3.24f)
            lineTo(14.777f, 4.442f)
            close()
            moveTo(21.908f, 3.74f)
            lineTo(20.777f, 4.442f)
            lineTo(21.138f, 3.24f)
            lineTo(20.308f, 2.472f)
            lineTo(21.433f, 2.431f)
            lineTo(21.908f, 1.242f)
            lineTo(22.384f, 2.431f)
            horizontalLineTo(23.507f)
            lineTo(22.679f, 3.24f)
            lineTo(23.094f, 4.371f)
            lineTo(21.908f, 3.74f)
            close()
            moveTo(8.776f, 22.167f)
            lineTo(9.907f, 21.465f)
            lineTo(11.093f, 22.096f)
            lineTo(10.678f, 20.965f)
            lineTo(11.507f, 20.156f)
            horizontalLineTo(10.383f)
            lineTo(9.907f, 18.967f)
            lineTo(9.432f, 20.156f)
            lineTo(8.307f, 20.197f)
            lineTo(9.137f, 20.965f)
            lineTo(8.776f, 22.167f)
            close()
            moveTo(15.908f, 21.465f)
            lineTo(14.776f, 22.167f)
            lineTo(15.137f, 20.965f)
            lineTo(14.307f, 20.197f)
            lineTo(15.432f, 20.156f)
            lineTo(15.908f, 18.967f)
            lineTo(16.383f, 20.156f)
            horizontalLineTo(17.507f)
            lineTo(16.678f, 20.965f)
            lineTo(17.093f, 22.096f)
            lineTo(15.908f, 21.465f)
            close()
            moveTo(20.776f, 22.167f)
            lineTo(21.907f, 21.465f)
            lineTo(23.093f, 22.096f)
            lineTo(22.678f, 20.965f)
            lineTo(23.507f, 20.156f)
            horizontalLineTo(22.383f)
            lineTo(21.907f, 18.967f)
            lineTo(21.431f, 20.156f)
            lineTo(20.306f, 20.197f)
            lineTo(21.137f, 20.965f)
            lineTo(20.776f, 22.167f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.635f, 12.772f)
            curveTo(8.635f, 12.772f, 9.173f, 13.251f, 9.467f, 13.415f)
            curveTo(9.568f, 13.031f, 9.342f, 12.163f, 9.342f, 12.163f)
            curveTo(9.279f, 11.955f, 8.584f, 11.583f, 8.584f, 11.583f)
            curveTo(8.584f, 11.583f, 8.389f, 12.238f, 8.635f, 12.772f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.196f, 13.93f)
            curveTo(9.196f, 13.93f, 7.813f, 13.284f, 7.672f, 12.37f)
            curveTo(7.531f, 11.457f, 7.83f, 10f, 7.83f, 10f)
            curveTo(7.83f, 10f, 10.076f, 10.511f, 10.229f, 11.606f)
            curveTo(10.381f, 12.701f, 9.874f, 13.389f, 9.874f, 13.389f)
            curveTo(9.874f, 13.389f, 9.354f, 12.054f, 8.864f, 11.906f)
            curveTo(8.864f, 11.906f, 8.864f, 13.229f, 9.196f, 13.93f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GrenadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Grenada,
            contentDescription = "Grenada Flag"
        )
    }
}
