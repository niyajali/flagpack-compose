package flagpack.icons.small

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
 * Brazil Flag (16x12dp)
 *
 * - ISO Alpha-2: BR
 * - ISO Alpha-3: BRA
 * - ISO Numeric: 076
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Brazil: ImageVector by lazy {
    ImageVector.Builder(
        name = "Brazil:BR:BRA:076:Small",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.963f, 1.852f)
                lineTo(14.064f, 6.104f)
                lineTo(7.88f, 10.086f)
                lineTo(1.904f, 6.021f)
                lineTo(7.963f, 1.852f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC600),
                        1f to Color(0xFFFFDE42)
                    ),
                    start = Offset(16f, 12f),
                    end = Offset(16f, 0f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.963f, 1.852f)
                lineTo(14.064f, 6.104f)
                lineTo(7.88f, 10.086f)
                lineTo(1.904f, 6.021f)
                lineTo(7.963f, 1.852f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 8.6f)
                curveTo(9.381f, 8.6f, 10.5f, 7.481f, 10.5f, 6.1f)
                curveTo(10.5f, 4.719f, 9.381f, 3.6f, 8f, 3.6f)
                curveTo(6.619f, 3.6f, 5.5f, 4.719f, 5.5f, 6.1f)
                curveTo(5.5f, 7.481f, 6.619f, 8.6f, 8f, 8.6f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(8f, 8.6f)
                curveTo(9.381f, 8.6f, 10.5f, 7.481f, 10.5f, 6.1f)
                curveTo(10.5f, 4.719f, 9.381f, 3.6f, 8f, 3.6f)
                curveTo(6.619f, 3.6f, 5.5f, 4.719f, 5.5f, 6.1f)
                curveTo(5.5f, 7.481f, 6.619f, 8.6f, 8f, 8.6f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.19f, 7.285f)
                lineTo(7.078f, 7.344f)
                lineTo(7.1f, 7.219f)
                lineTo(7.009f, 7.131f)
                lineTo(7.134f, 7.113f)
                lineTo(7.19f, 7f)
                lineTo(7.246f, 7.113f)
                lineTo(7.371f, 7.131f)
                lineTo(7.28f, 7.219f)
                lineTo(7.302f, 7.344f)
                lineTo(7.19f, 7.285f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.19f, 7.285f)
                lineTo(8.078f, 7.344f)
                lineTo(8.1f, 7.219f)
                lineTo(8.009f, 7.131f)
                lineTo(8.134f, 7.113f)
                lineTo(8.19f, 7f)
                lineTo(8.246f, 7.113f)
                lineTo(8.371f, 7.131f)
                lineTo(8.28f, 7.219f)
                lineTo(8.302f, 7.344f)
                lineTo(8.19f, 7.285f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.19f, 7.885f)
                lineTo(8.078f, 7.944f)
                lineTo(8.1f, 7.819f)
                lineTo(8.009f, 7.731f)
                lineTo(8.134f, 7.713f)
                lineTo(8.19f, 7.6f)
                lineTo(8.246f, 7.713f)
                lineTo(8.371f, 7.731f)
                lineTo(8.28f, 7.819f)
                lineTo(8.302f, 7.944f)
                lineTo(8.19f, 7.885f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.69f, 5.785f)
                lineTo(7.578f, 5.844f)
                lineTo(7.6f, 5.719f)
                lineTo(7.509f, 5.631f)
                lineTo(7.634f, 5.613f)
                lineTo(7.69f, 5.5f)
                lineTo(7.746f, 5.613f)
                lineTo(7.871f, 5.631f)
                lineTo(7.78f, 5.719f)
                lineTo(7.802f, 5.844f)
                lineTo(7.69f, 5.785f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.69f, 6.785f)
                lineTo(7.578f, 6.844f)
                lineTo(7.6f, 6.719f)
                lineTo(7.509f, 6.631f)
                lineTo(7.634f, 6.613f)
                lineTo(7.69f, 6.5f)
                lineTo(7.746f, 6.613f)
                lineTo(7.871f, 6.631f)
                lineTo(7.78f, 6.719f)
                lineTo(7.802f, 6.844f)
                lineTo(7.69f, 6.785f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.99f, 6.285f)
                lineTo(6.878f, 6.344f)
                lineTo(6.9f, 6.219f)
                lineTo(6.809f, 6.131f)
                lineTo(6.934f, 6.113f)
                lineTo(6.99f, 6f)
                lineTo(7.046f, 6.113f)
                lineTo(7.171f, 6.131f)
                lineTo(7.08f, 6.219f)
                lineTo(7.102f, 6.344f)
                lineTo(6.99f, 6.285f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.29f, 6.685f)
                lineTo(6.178f, 6.744f)
                lineTo(6.2f, 6.619f)
                lineTo(6.109f, 6.531f)
                lineTo(6.234f, 6.513f)
                lineTo(6.29f, 6.4f)
                lineTo(6.346f, 6.513f)
                lineTo(6.471f, 6.531f)
                lineTo(6.38f, 6.619f)
                lineTo(6.402f, 6.744f)
                lineTo(6.29f, 6.685f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.59f, 4.985f)
                lineTo(8.478f, 5.044f)
                lineTo(8.5f, 4.919f)
                lineTo(8.409f, 4.831f)
                lineTo(8.534f, 4.813f)
                lineTo(8.59f, 4.7f)
                lineTo(8.646f, 4.813f)
                lineTo(8.771f, 4.831f)
                lineTo(8.68f, 4.919f)
                lineTo(8.702f, 5.044f)
                lineTo(8.59f, 4.985f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(4.962f, 5.499f)
                lineTo(5.038f, 4.501f)
                curveTo(7.437f, 4.682f, 9.33f, 5.471f, 10.694f, 6.874f)
                lineTo(9.977f, 7.571f)
                curveTo(8.795f, 6.355f, 7.131f, 5.662f, 4.962f, 5.499f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BrazilPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Brazil,
            contentDescription = "Brazil Flag"
        )
    }
}
