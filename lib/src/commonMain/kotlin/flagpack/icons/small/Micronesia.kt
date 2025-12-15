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
 * Micronesia Flag (16x12dp)
 *
 * - ISO Alpha-2: FM
 * - ISO Alpha-3: FSM
 * - ISO Numeric: 583
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Micronesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Micronesia:FM:FSM:583:Small",
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
                fill = SolidColor(Color(0xFF63B3E1)),
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
                moveTo(8f, 3.65f)
                lineTo(7.118f, 4.114f)
                lineTo(7.287f, 3.132f)
                lineTo(6.573f, 2.436f)
                lineTo(7.559f, 2.293f)
                lineTo(8f, 1.4f)
                lineTo(8.441f, 2.293f)
                lineTo(9.427f, 2.436f)
                lineTo(8.713f, 3.132f)
                lineTo(8.882f, 4.114f)
                lineTo(8f, 3.65f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9.65f)
                lineTo(7.118f, 10.113f)
                lineTo(7.287f, 9.132f)
                lineTo(6.573f, 8.436f)
                lineTo(7.559f, 8.293f)
                lineTo(8f, 7.4f)
                lineTo(8.441f, 8.293f)
                lineTo(9.427f, 8.436f)
                lineTo(8.713f, 9.132f)
                lineTo(8.882f, 10.113f)
                lineTo(8f, 9.65f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.9f, 6.75f)
                lineTo(4.018f, 7.214f)
                lineTo(4.187f, 6.232f)
                lineTo(3.473f, 5.536f)
                lineTo(4.459f, 5.393f)
                lineTo(4.9f, 4.5f)
                lineTo(5.341f, 5.393f)
                lineTo(6.327f, 5.536f)
                lineTo(5.613f, 6.232f)
                lineTo(5.782f, 7.214f)
                lineTo(4.9f, 6.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 6.75f)
                lineTo(10.118f, 7.214f)
                lineTo(10.287f, 6.232f)
                lineTo(9.573f, 5.536f)
                lineTo(10.559f, 5.393f)
                lineTo(11f, 4.5f)
                lineTo(11.441f, 5.393f)
                lineTo(12.427f, 5.536f)
                lineTo(11.713f, 6.232f)
                lineTo(11.882f, 7.214f)
                lineTo(11f, 6.75f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MicronesiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Micronesia,
            contentDescription = "Micronesia Flag"
        )
    }
}
