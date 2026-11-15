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
 * Anguilla Flag (16x12dp)
 *
 * - ISO Alpha-2: AI
 * - ISO Alpha-3: AIA
 * - ISO Numeric: 660
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Anguilla: ImageVector by lazy {
    ImageVector.Builder(
        name = "Anguilla:AI:AIA:660:Small",
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
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.369f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.715f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.369f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.242f, -0.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(2.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(4.75f)
                horizontalLineTo(-0.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(3.242f)
                verticalLineTo(-0.75f)
                close()
                moveTo(3.992f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            stroke = SolidColor(Color(0xFFE6E617)),
            strokeLineWidth = 0.5f
        ) {
            moveTo(12.37f, 10.562f)
            curveTo(11.767f, 10.562f, 11.362f, 10.424f, 11.079f, 10.196f)
            curveTo(10.795f, 9.966f, 10.602f, 9.619f, 10.477f, 9.14f)
            curveTo(10.351f, 8.659f, 10.299f, 8.065f, 10.279f, 7.366f)
            curveTo(10.265f, 6.875f, 10.268f, 6.343f, 10.271f, 5.77f)
            curveTo(10.271f, 5.606f, 10.272f, 5.439f, 10.273f, 5.269f)
            horizontalLineTo(14.528f)
            curveTo(14.603f, 6.64f, 14.622f, 7.952f, 14.351f, 8.936f)
            curveTo(14.209f, 9.451f, 13.993f, 9.853f, 13.684f, 10.127f)
            curveTo(13.379f, 10.397f, 12.961f, 10.562f, 12.37f, 10.562f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF82E5FF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.242f, 8.967f)
            curveTo(10.242f, 9.998f, 11.095f, 11.016f, 12.358f, 11.016f)
            curveTo(13.621f, 11.016f, 14.59f, 10.078f, 14.705f, 8.932f)
            lineTo(10.242f, 8.967f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE18600)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.867f, 7.1f)
            curveTo(10.867f, 7.874f, 11.515f, 8.5f, 12.313f, 8.5f)
            curveTo(13.111f, 8.5f, 13.759f, 7.874f, 13.759f, 7.1f)
            curveTo(13.759f, 6.326f, 13.111f, 5.7f, 12.313f, 5.7f)
            curveTo(11.515f, 5.7f, 10.867f, 6.326f, 10.867f, 7.1f)
            close()
            moveTo(13.159f, 7.1f)
            curveTo(13.159f, 7.551f, 12.78f, 7.917f, 12.313f, 7.917f)
            curveTo(11.846f, 7.917f, 11.467f, 7.551f, 11.467f, 7.1f)
            curveTo(11.467f, 6.649f, 11.846f, 6.283f, 12.313f, 6.283f)
            curveTo(12.78f, 6.283f, 13.159f, 6.649f, 13.159f, 7.1f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE18600)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.069f, 5.505f)
            curveTo(12.069f, 5.505f, 11.543f, 5.737f, 11.657f, 6.173f)
            curveTo(11.771f, 6.609f, 11.9f, 6.672f, 11.9f, 6.672f)
            curveTo(11.9f, 6.672f, 12.086f, 5.727f, 12.837f, 5.727f)
            lineTo(12.069f, 5.505f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE18600)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.127f, 7.862f)
            curveTo(11.127f, 7.862f, 11.559f, 8.241f, 11.906f, 7.953f)
            curveTo(12.253f, 7.665f, 12.255f, 7.522f, 12.255f, 7.522f)
            curveTo(12.255f, 7.522f, 11.321f, 7.753f, 11.003f, 7.072f)
            lineTo(11.127f, 7.862f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE18600)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.729f, 7.804f)
            curveTo(13.729f, 7.804f, 13.752f, 7.23f, 13.309f, 7.141f)
            curveTo(12.867f, 7.053f, 12.755f, 7.141f, 12.755f, 7.141f)
            curveTo(12.755f, 7.141f, 13.522f, 7.722f, 13.193f, 8.397f)
            lineTo(13.729f, 7.804f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AnguillaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Anguilla,
            contentDescription = "Anguilla Flag"
        )
    }
}
