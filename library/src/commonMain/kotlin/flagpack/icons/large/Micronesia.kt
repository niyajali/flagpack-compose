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
 * Micronesia Flag (32x24dp)
 *
 * - ISO Alpha-2: FM
 * - ISO Alpha-3: FSM
 * - ISO Numeric: 583
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Micronesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Micronesia:FM:FSM:583:Large",
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
                fill = SolidColor(Color(0xFF63B3E1)),
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
                moveTo(16f, 7.3f)
                lineTo(14.237f, 8.227f)
                lineTo(14.573f, 6.264f)
                lineTo(13.147f, 4.873f)
                lineTo(15.118f, 4.586f)
                lineTo(16f, 2.8f)
                lineTo(16.882f, 4.586f)
                lineTo(18.853f, 4.873f)
                lineTo(17.427f, 6.264f)
                lineTo(17.763f, 8.227f)
                lineTo(16f, 7.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 19.3f)
                lineTo(14.237f, 20.227f)
                lineTo(14.573f, 18.264f)
                lineTo(13.147f, 16.873f)
                lineTo(15.118f, 16.587f)
                lineTo(16f, 14.8f)
                lineTo(16.882f, 16.587f)
                lineTo(18.853f, 16.873f)
                lineTo(17.427f, 18.264f)
                lineTo(17.763f, 20.227f)
                lineTo(16f, 19.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.8f, 13.5f)
                lineTo(8.037f, 14.427f)
                lineTo(8.373f, 12.464f)
                lineTo(6.947f, 11.073f)
                lineTo(8.918f, 10.786f)
                lineTo(9.8f, 9f)
                lineTo(10.682f, 10.786f)
                lineTo(12.653f, 11.073f)
                lineTo(11.227f, 12.464f)
                lineTo(11.563f, 14.427f)
                lineTo(9.8f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 13.5f)
                lineTo(20.237f, 14.427f)
                lineTo(20.573f, 12.464f)
                lineTo(19.147f, 11.073f)
                lineTo(21.118f, 10.786f)
                lineTo(22f, 9f)
                lineTo(22.882f, 10.786f)
                lineTo(24.853f, 11.073f)
                lineTo(23.427f, 12.464f)
                lineTo(23.763f, 14.427f)
                lineTo(22f, 13.5f)
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
            imageVector = FlagIcons.Large.Micronesia,
            contentDescription = "Micronesia Flag"
        )
    }
}
