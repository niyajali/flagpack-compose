package flagpack.icons.medium

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
 * Tunisia Flag (20x15dp)
 *
 * - ISO Alpha-2: TN
 * - ISO Alpha-3: TUN
 * - ISO Numeric: 788
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Tunisia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tunisia:TN:TUN:788:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 12.5f)
                curveTo(12.761f, 12.5f, 15f, 10.261f, 15f, 7.5f)
                curveTo(15f, 4.739f, 12.761f, 2.5f, 10f, 2.5f)
                curveTo(7.239f, 2.5f, 5f, 4.739f, 5f, 7.5f)
                curveTo(5f, 10.261f, 7.239f, 12.5f, 10f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.877f, 11.032f)
                curveTo(10.877f, 11.032f, 8.241f, 10.313f, 8.241f, 7.483f)
                curveTo(8.241f, 4.654f, 10.877f, 3.873f, 10.877f, 3.873f)
                curveTo(9.787f, 3.452f, 6.598f, 4.099f, 6.598f, 7.483f)
                curveTo(6.598f, 10.868f, 9.876f, 11.477f, 10.877f, 11.032f)
                close()
                moveTo(10.732f, 6.868f)
                lineTo(9.424f, 7.345f)
                lineTo(10.829f, 7.837f)
                lineTo(10.877f, 9.152f)
                lineTo(11.732f, 8.13f)
                lineTo(13.142f, 8.23f)
                lineTo(12.126f, 7.401f)
                lineTo(12.738f, 6.204f)
                lineTo(11.543f, 6.607f)
                lineTo(10.715f, 5.572f)
                lineTo(10.732f, 6.868f)
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
            imageVector = FlagIcons.Medium.Tunisia,
            contentDescription = "Tunisia Flag"
        )
    }
}
