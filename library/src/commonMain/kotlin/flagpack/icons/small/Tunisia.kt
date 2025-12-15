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
 * Tunisia Flag (16x12dp)
 *
 * - ISO Alpha-2: TN
 * - ISO Alpha-3: TUN
 * - ISO Numeric: 788
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Tunisia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tunisia:TN:TUN:788:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                moveTo(8f, 10f)
                curveTo(10.209f, 10f, 12f, 8.209f, 12f, 6f)
                curveTo(12f, 3.791f, 10.209f, 2f, 8f, 2f)
                curveTo(5.791f, 2f, 4f, 3.791f, 4f, 6f)
                curveTo(4f, 8.209f, 5.791f, 10f, 8f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.701f, 8.825f)
                curveTo(8.701f, 8.825f, 6.593f, 8.25f, 6.593f, 5.987f)
                curveTo(6.593f, 3.723f, 8.701f, 3.099f, 8.701f, 3.099f)
                curveTo(7.83f, 2.761f, 5.278f, 3.279f, 5.278f, 5.987f)
                curveTo(5.278f, 8.694f, 7.901f, 9.182f, 8.701f, 8.825f)
                close()
                moveTo(8.585f, 5.494f)
                lineTo(7.539f, 5.876f)
                lineTo(8.664f, 6.269f)
                lineTo(8.701f, 7.322f)
                lineTo(9.386f, 6.504f)
                lineTo(10.514f, 6.584f)
                lineTo(9.701f, 5.921f)
                lineTo(10.19f, 4.964f)
                lineTo(9.234f, 5.285f)
                lineTo(8.572f, 4.457f)
                lineTo(8.585f, 5.494f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TunisiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Tunisia,
            contentDescription = "Tunisia Flag"
        )
    }
}
