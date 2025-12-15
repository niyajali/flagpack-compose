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
 * Oman Flag (32x24dp)
 *
 * - ISO Alpha-2: OM
 * - ISO Alpha-3: OMN
 * - ISO Numeric: 512
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Oman: ImageVector by lazy {
    ImageVector.Builder(
        name = "Oman:OM:OMN:512:Large",
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
                fill = SolidColor(Color(0xFFF50101)),
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
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.77f, 2.033f)
                curveTo(10.78f, 1.942f, 10.663f, 1.907f, 10.617f, 1.986f)
                curveTo(10.254f, 2.602f, 9.344f, 4.068f, 7.847f, 5.986f)
                verticalLineTo(5.068f)
                curveTo(7.704f, 4.913f, 7.249f, 4.496f, 7.249f, 4.496f)
                verticalLineTo(3.579f)
                lineTo(8.073f, 2.834f)
                lineTo(6.941f, 2f)
                lineTo(5.749f, 2.834f)
                lineTo(6.65f, 3.579f)
                verticalLineTo(4.496f)
                curveTo(6.65f, 4.935f, 6.104f, 5.068f, 6.104f, 5.068f)
                lineTo(6.004f, 5.877f)
                curveTo(4.611f, 4.068f, 3.742f, 2.658f, 3.375f, 2.027f)
                curveTo(3.327f, 1.946f, 3.208f, 1.984f, 3.222f, 2.077f)
                curveTo(3.333f, 2.815f, 3.665f, 4.45f, 4.582f, 6.196f)
                horizontalLineTo(4.336f)
                verticalLineTo(6.164f)
                curveTo(4.336f, 6.116f, 4.297f, 6.077f, 4.249f, 6.077f)
                horizontalLineTo(2.14f)
                curveTo(2.092f, 6.077f, 2.053f, 6.116f, 2.053f, 6.164f)
                verticalLineTo(7.49f)
                curveTo(2.053f, 7.538f, 2.092f, 7.577f, 2.14f, 7.577f)
                horizontalLineTo(4.249f)
                curveTo(4.297f, 7.577f, 4.336f, 7.538f, 4.336f, 7.49f)
                verticalLineTo(6.794f)
                horizontalLineTo(4.601f)
                curveTo(4.692f, 7.002f, 4.898f, 7.148f, 5.14f, 7.152f)
                curveTo(5.309f, 7.413f, 5.493f, 7.673f, 5.691f, 7.93f)
                curveTo(5.234f, 7.884f, 2.213f, 7.627f, 2.213f, 8.726f)
                curveTo(2.213f, 9.383f, 2.948f, 9.73f, 3.869f, 9.909f)
                curveTo(2.941f, 10.75f, 2.065f, 11.54f, 1.662f, 11.904f)
                curveTo(1.597f, 11.963f, 1.648f, 12.065f, 1.734f, 12.044f)
                curveTo(2.453f, 11.866f, 4.34f, 11.315f, 6.136f, 10.09f)
                lineTo(6.191f, 10.09f)
                curveTo(6.697f, 10.09f, 7.049f, 9.871f, 7.293f, 9.574f)
                curveTo(9.12f, 11.065f, 11.186f, 11.753f, 12.083f, 12f)
                curveTo(12.177f, 12.026f, 12.227f, 11.905f, 12.148f, 11.85f)
                curveTo(11.419f, 11.344f, 9.776f, 10.127f, 8.096f, 8.36f)
                lineTo(8.14f, 8.308f)
                curveTo(8.483f, 7.904f, 8.782f, 7.487f, 9.042f, 7.07f)
                curveTo(9.151f, 7.007f, 9.237f, 6.91f, 9.288f, 6.794f)
                horizontalLineTo(9.553f)
                lineTo(9.553f, 7.49f)
                curveTo(9.553f, 7.538f, 9.592f, 7.577f, 9.64f, 7.577f)
                horizontalLineTo(11.749f)
                curveTo(11.797f, 7.577f, 11.836f, 7.538f, 11.836f, 7.49f)
                verticalLineTo(6.164f)
                curveTo(11.836f, 6.116f, 11.797f, 6.077f, 11.749f, 6.077f)
                horizontalLineTo(9.64f)
                curveTo(9.618f, 6.077f, 9.598f, 6.085f, 9.582f, 6.099f)
                curveTo(10.445f, 4.354f, 10.698f, 2.734f, 10.77f, 2.033f)
                close()
                moveTo(9.553f, 6.196f)
                lineTo(9.553f, 6.164f)
                lineTo(9.554f, 6.157f)
                lineTo(9.534f, 6.196f)
                horizontalLineTo(9.553f)
                close()
                moveTo(5.64f, 6.561f)
                curveTo(5.64f, 6.828f, 5.421f, 7.045f, 5.151f, 7.045f)
                curveTo(4.881f, 7.045f, 4.662f, 6.828f, 4.662f, 6.561f)
                curveTo(4.662f, 6.294f, 4.881f, 6.077f, 5.151f, 6.077f)
                curveTo(5.421f, 6.077f, 5.64f, 6.294f, 5.64f, 6.561f)
                close()
                moveTo(8.249f, 6.561f)
                curveTo(8.249f, 6.828f, 8.468f, 7.045f, 8.738f, 7.045f)
                curveTo(9.008f, 7.045f, 9.227f, 6.828f, 9.227f, 6.561f)
                curveTo(9.227f, 6.294f, 9.008f, 6.077f, 8.738f, 6.077f)
                curveTo(8.468f, 6.077f, 8.249f, 6.294f, 8.249f, 6.561f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun OmanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Oman,
            contentDescription = "Oman Flag"
        )
    }
}
