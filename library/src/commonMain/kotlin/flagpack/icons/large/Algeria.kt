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
 * Algeria Flag (32x24dp)
 *
 * - ISO Alpha-2: DZ
 * - ISO Alpha-3: DZA
 * - ISO Numeric: 012
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Algeria: ImageVector by lazy {
    ImageVector.Builder(
        name = "Algeria:DZ:DZA:012:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF36A400)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.791f, 6.795f)
                curveTo(19.313f, 6.795f, 20.704f, 7.357f, 21.767f, 8.284f)
                curveTo(20.421f, 6.584f, 18.338f, 5.493f, 16f, 5.493f)
                curveTo(11.939f, 5.493f, 8.647f, 8.785f, 8.647f, 12.846f)
                curveTo(8.647f, 16.907f, 11.939f, 20.199f, 16f, 20.199f)
                curveTo(18.338f, 20.199f, 20.421f, 19.108f, 21.767f, 17.407f)
                curveTo(20.704f, 18.335f, 19.313f, 18.897f, 17.791f, 18.897f)
                curveTo(14.449f, 18.897f, 11.74f, 16.188f, 11.74f, 12.846f)
                curveTo(11.74f, 9.504f, 14.449f, 6.795f, 17.791f, 6.795f)
                close()
                moveTo(20.611f, 9.544f)
                lineTo(18.909f, 11.473f)
                lineTo(16.463f, 10.799f)
                lineTo(17.819f, 12.92f)
                lineTo(16.463f, 15.177f)
                lineTo(19.028f, 14.253f)
                lineTo(20.431f, 16.442f)
                verticalLineTo(13.902f)
                lineTo(22.722f, 12.92f)
                lineTo(20.431f, 12.099f)
                lineTo(20.611f, 9.544f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AlgeriaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Algeria,
            contentDescription = "Algeria Flag"
        )
    }
}
