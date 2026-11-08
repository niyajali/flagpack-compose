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
 * Algeria Flag (20x15dp)
 *
 * - ISO Alpha-2: DZ
 * - ISO Alpha-3: DZA
 * - ISO Numeric: 012
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Algeria: ImageVector by lazy {
    ImageVector.Builder(
        name = "Algeria:DZ:DZA:012:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF36A400)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.637f, 3.908f)
                curveTo(12.537f, 3.908f, 13.375f, 4.155f, 14.078f, 4.581f)
                curveTo(13.102f, 3.434f, 11.648f, 2.706f, 10.024f, 2.706f)
                curveTo(7.084f, 2.706f, 4.701f, 5.089f, 4.701f, 8.029f)
                curveTo(4.701f, 10.968f, 7.084f, 13.351f, 10.024f, 13.351f)
                curveTo(11.488f, 13.351f, 12.814f, 12.76f, 13.776f, 11.803f)
                curveTo(13.14f, 12.125f, 12.412f, 12.308f, 11.637f, 12.308f)
                curveTo(9.155f, 12.308f, 7.143f, 10.428f, 7.143f, 8.108f)
                curveTo(7.143f, 5.788f, 9.155f, 3.908f, 11.637f, 3.908f)
                close()
                moveTo(13.397f, 5.516f)
                lineTo(12.105f, 6.981f)
                lineTo(10.248f, 6.47f)
                lineTo(11.278f, 8.079f)
                lineTo(10.248f, 9.793f)
                lineTo(12.196f, 9.092f)
                lineTo(13.26f, 10.754f)
                verticalLineTo(8.825f)
                lineTo(15f, 8.079f)
                lineTo(13.26f, 7.456f)
                lineTo(13.397f, 5.516f)
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
            imageVector = FlagIcons.Medium.Algeria,
            contentDescription = "Algeria Flag"
        )
    }
}
