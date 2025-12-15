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
 * Curacao Flag (16x12dp)
 *
 * - ISO Alpha-2: CW
 * - ISO Alpha-3: CUW
 * - ISO Numeric: 531
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Curacao: ImageVector by lazy {
    ImageVector.Builder(
        name = "Curacao:CW:CUW:531:Small",
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
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.127f, 3.075f)
                lineTo(1.133f, 3.599f)
                lineTo(1.613f, 2.665f)
                lineTo(1f, 1.982f)
                lineTo(1.762f, 1.953f)
                lineTo(2.127f, 1f)
                lineTo(2.406f, 1.953f)
                lineTo(3.297f, 1.982f)
                lineTo(2.656f, 2.665f)
                lineTo(3.063f, 3.599f)
                lineTo(2.127f, 3.075f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.676f, 5.538f)
                lineTo(4.449f, 6.052f)
                lineTo(4.93f, 4.764f)
                lineTo(3.863f, 3.9f)
                horizontalLineTo(5.142f)
                lineTo(5.676f, 2.506f)
                lineTo(6.084f, 3.9f)
                horizontalLineTo(7.365f)
                lineTo(6.455f, 4.764f)
                lineTo(6.906f, 6.052f)
                lineTo(5.676f, 5.538f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9E813)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CuracaoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Curacao,
            contentDescription = "Curacao Flag"
        )
    }
}
