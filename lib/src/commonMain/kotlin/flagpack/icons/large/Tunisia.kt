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
 * Tunisia Flag (32x24dp)
 *
 * - ISO Alpha-2: TN
 * - ISO Alpha-3: TUN
 * - ISO Numeric: 788
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Tunisia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tunisia:TN:TUN:788:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                moveTo(16f, 20f)
                curveTo(20.418f, 20f, 24f, 16.418f, 24f, 12f)
                curveTo(24f, 7.582f, 20.418f, 4f, 16f, 4f)
                curveTo(11.582f, 4f, 8f, 7.582f, 8f, 12f)
                curveTo(8f, 16.418f, 11.582f, 20f, 16f, 20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.403f, 17.651f)
                curveTo(17.403f, 17.651f, 13.186f, 16.5f, 13.186f, 11.974f)
                curveTo(13.186f, 7.446f, 17.403f, 6.198f, 17.403f, 6.198f)
                curveTo(15.659f, 5.523f, 10.557f, 6.558f, 10.557f, 11.974f)
                curveTo(10.557f, 17.389f, 15.802f, 18.364f, 17.403f, 17.651f)
                close()
                moveTo(17.171f, 10.988f)
                lineTo(15.079f, 11.753f)
                lineTo(17.327f, 12.539f)
                lineTo(17.403f, 14.644f)
                lineTo(18.771f, 13.008f)
                lineTo(21.027f, 13.168f)
                lineTo(19.402f, 11.842f)
                lineTo(20.381f, 9.927f)
                lineTo(18.468f, 10.571f)
                lineTo(17.143f, 8.915f)
                lineTo(17.171f, 10.988f)
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
            imageVector = FlagIcons.Large.Tunisia,
            contentDescription = "Tunisia Flag"
        )
    }
}
