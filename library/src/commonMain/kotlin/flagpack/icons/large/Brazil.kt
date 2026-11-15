package flagpack.icons.large

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
 * Brazil Flag (32x24dp)
 *
 * - ISO Alpha-2: BR
 * - ISO Alpha-3: BRA
 * - ISO Numeric: 076
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Brazil: ImageVector by lazy {
    ImageVector.Builder(
        name = "Brazil:BR:BRA:076:Large",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.927f, 3.704f)
                lineTo(28.129f, 12.208f)
                lineTo(15.761f, 20.171f)
                lineTo(3.809f, 12.043f)
                lineTo(15.927f, 3.704f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC600),
                        1f to Color(0xFFFFDE42)
                    ),
                    start = Offset(32f, 24f),
                    end = Offset(32f, 0f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.927f, 3.704f)
                lineTo(28.129f, 12.208f)
                lineTo(15.761f, 20.171f)
                lineTo(3.809f, 12.043f)
                lineTo(15.927f, 3.704f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 17.2f)
                curveTo(18.761f, 17.2f, 21f, 14.961f, 21f, 12.2f)
                curveTo(21f, 9.439f, 18.761f, 7.2f, 16f, 7.2f)
                curveTo(13.239f, 7.2f, 11f, 9.439f, 11f, 12.2f)
                curveTo(11f, 14.961f, 13.239f, 17.2f, 16f, 17.2f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(16f, 17.2f)
                curveTo(18.761f, 17.2f, 21f, 14.961f, 21f, 12.2f)
                curveTo(21f, 9.439f, 18.761f, 7.2f, 16f, 7.2f)
                curveTo(13.239f, 7.2f, 11f, 9.439f, 11f, 12.2f)
                curveTo(11f, 14.961f, 13.239f, 17.2f, 16f, 17.2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.38f, 14.57f)
                lineTo(14.157f, 14.687f)
                lineTo(14.199f, 14.439f)
                lineTo(14.019f, 14.263f)
                lineTo(14.268f, 14.226f)
                lineTo(14.38f, 14f)
                lineTo(14.492f, 14.226f)
                lineTo(14.741f, 14.263f)
                lineTo(14.561f, 14.439f)
                lineTo(14.603f, 14.687f)
                lineTo(14.38f, 14.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.38f, 14.57f)
                lineTo(16.157f, 14.687f)
                lineTo(16.199f, 14.439f)
                lineTo(16.019f, 14.263f)
                lineTo(16.268f, 14.226f)
                lineTo(16.38f, 14f)
                lineTo(16.492f, 14.226f)
                lineTo(16.741f, 14.263f)
                lineTo(16.561f, 14.439f)
                lineTo(16.603f, 14.687f)
                lineTo(16.38f, 14.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.38f, 15.77f)
                lineTo(16.157f, 15.887f)
                lineTo(16.199f, 15.639f)
                lineTo(16.019f, 15.463f)
                lineTo(16.268f, 15.426f)
                lineTo(16.38f, 15.2f)
                lineTo(16.492f, 15.426f)
                lineTo(16.741f, 15.463f)
                lineTo(16.561f, 15.639f)
                lineTo(16.603f, 15.887f)
                lineTo(16.38f, 15.77f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.38f, 11.57f)
                lineTo(15.157f, 11.687f)
                lineTo(15.199f, 11.439f)
                lineTo(15.019f, 11.263f)
                lineTo(15.268f, 11.226f)
                lineTo(15.38f, 11f)
                lineTo(15.492f, 11.226f)
                lineTo(15.741f, 11.263f)
                lineTo(15.561f, 11.439f)
                lineTo(15.603f, 11.687f)
                lineTo(15.38f, 11.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.38f, 13.57f)
                lineTo(15.157f, 13.687f)
                lineTo(15.199f, 13.439f)
                lineTo(15.019f, 13.263f)
                lineTo(15.268f, 13.226f)
                lineTo(15.38f, 13f)
                lineTo(15.492f, 13.226f)
                lineTo(15.741f, 13.263f)
                lineTo(15.561f, 13.439f)
                lineTo(15.603f, 13.687f)
                lineTo(15.38f, 13.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.98f, 12.57f)
                lineTo(13.757f, 12.687f)
                lineTo(13.799f, 12.439f)
                lineTo(13.619f, 12.263f)
                lineTo(13.868f, 12.226f)
                lineTo(13.98f, 12f)
                lineTo(14.092f, 12.226f)
                lineTo(14.341f, 12.263f)
                lineTo(14.161f, 12.439f)
                lineTo(14.203f, 12.687f)
                lineTo(13.98f, 12.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.58f, 13.37f)
                lineTo(12.357f, 13.487f)
                lineTo(12.399f, 13.239f)
                lineTo(12.219f, 13.063f)
                lineTo(12.468f, 13.026f)
                lineTo(12.58f, 12.8f)
                lineTo(12.692f, 13.026f)
                lineTo(12.941f, 13.063f)
                lineTo(12.761f, 13.239f)
                lineTo(12.803f, 13.487f)
                lineTo(12.58f, 13.37f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.18f, 9.97f)
                lineTo(16.957f, 10.087f)
                lineTo(16.999f, 9.839f)
                lineTo(16.819f, 9.663f)
                lineTo(17.068f, 9.626f)
                lineTo(17.18f, 9.4f)
                lineTo(17.292f, 9.626f)
                lineTo(17.542f, 9.663f)
                lineTo(17.361f, 9.839f)
                lineTo(17.403f, 10.087f)
                lineTo(17.18f, 9.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(9.925f, 10.997f)
                lineTo(10.075f, 9.003f)
                curveTo(14.873f, 9.365f, 18.66f, 10.942f, 21.388f, 13.748f)
                lineTo(19.954f, 15.142f)
                curveTo(17.59f, 12.71f, 14.262f, 11.324f, 9.925f, 10.997f)
                close()
            }
            path(fill = SolidColor(Color(0xFF009933))) {
                moveTo(12.289f, 10.603f)
                lineTo(12.341f, 10.106f)
                curveTo(15.434f, 10.426f, 18.087f, 11.611f, 20.292f, 13.657f)
                lineTo(19.952f, 14.023f)
                curveTo(17.827f, 12.052f, 15.276f, 10.912f, 12.289f, 10.603f)
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
            imageVector = FlagIcons.Large.Brazil,
            contentDescription = "Brazil Flag"
        )
    }
}
