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
 * New Zealand Flag (16x12dp)
 *
 * - ISO Alpha-2: NZ
 * - ISO Alpha-3: NZL
 * - ISO Numeric: 554
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.NewZealand: ImageVector by lazy {
    ImageVector.Builder(
        name = "New Zealand:NZ:NZL:554:Small",
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
                lineTo(9.714f, -0.466f)
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
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.35f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.427f, 10.25f)
            lineTo(11.545f, 10.714f)
            lineTo(11.713f, 9.732f)
            lineTo(11f, 9.036f)
            lineTo(11.986f, 8.893f)
            lineTo(12.427f, 8f)
            lineTo(12.867f, 8.893f)
            lineTo(13.853f, 9.036f)
            lineTo(13.14f, 9.732f)
            lineTo(13.308f, 10.714f)
            lineTo(12.427f, 10.25f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.35f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.6f, 6.935f)
            lineTo(9.92f, 7.292f)
            lineTo(10.05f, 6.535f)
            lineTo(9.5f, 5.999f)
            lineTo(10.26f, 5.889f)
            lineTo(10.6f, 5.2f)
            lineTo(10.94f, 5.889f)
            lineTo(11.7f, 5.999f)
            lineTo(11.15f, 6.535f)
            lineTo(11.28f, 7.292f)
            lineTo(10.6f, 6.935f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.35f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.099f, 6.933f)
            lineTo(13.42f, 7.29f)
            lineTo(13.549f, 6.534f)
            lineTo(13f, 5.998f)
            lineTo(13.759f, 5.888f)
            lineTo(14.099f, 5.2f)
            lineTo(14.438f, 5.888f)
            lineTo(15.198f, 5.998f)
            lineTo(14.648f, 6.534f)
            lineTo(14.778f, 7.29f)
            lineTo(14.099f, 6.933f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.35f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.6f, 4.135f)
            lineTo(11.92f, 4.492f)
            lineTo(12.05f, 3.735f)
            lineTo(11.5f, 3.199f)
            lineTo(12.26f, 3.089f)
            lineTo(12.6f, 2.4f)
            lineTo(12.94f, 3.089f)
            lineTo(13.7f, 3.199f)
            lineTo(13.15f, 3.735f)
            lineTo(13.28f, 4.492f)
            lineTo(12.6f, 4.135f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NewZealandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.NewZealand,
            contentDescription = "New Zealand Flag"
        )
    }
}
