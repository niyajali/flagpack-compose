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
 * Malaysia Flag (32x24dp)
 *
 * - ISO Alpha-2: MY
 * - ISO Alpha-3: MYS
 * - ISO Numeric: 458
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Malaysia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malaysia:MY:MYS:458:Large",
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
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.027f, 5f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.027f, 10.2f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(2.9f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.112f, 15.2f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.112f, 20.2f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(2.7f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(2.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.594f, 6.202f)
                curveTo(3.594f, 7.578f, 4.242f, 8.88f, 5.56f, 8.88f)
                curveTo(7.539f, 8.88f, 7.924f, 8.458f, 8.847f, 7.876f)
                curveTo(9.066f, 8.366f, 8.329f, 10.464f, 5.533f, 10.464f)
                curveTo(3.297f, 10.419f, 1.49f, 8.623f, 1.49f, 6.202f)
                curveTo(1.49f, 3.424f, 3.534f, 1.923f, 5.477f, 1.94f)
                curveTo(7.193f, 1.94f, 9.013f, 2.914f, 8.958f, 4.156f)
                curveTo(8.149f, 3.366f, 7.271f, 3.366f, 5.81f, 3.366f)
                curveTo(4.348f, 3.366f, 3.594f, 4.826f, 3.594f, 6.202f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 7.3f)
                lineTo(10.073f, 8.653f)
                lineTo(10.118f, 7.014f)
                lineTo(8.573f, 7.563f)
                lineTo(9.573f, 6.264f)
                lineTo(8f, 5.8f)
                lineTo(9.573f, 5.336f)
                lineTo(8.573f, 4.037f)
                lineTo(10.118f, 4.586f)
                lineTo(10.073f, 2.947f)
                lineTo(11f, 4.3f)
                lineTo(11.927f, 2.947f)
                lineTo(11.882f, 4.586f)
                lineTo(13.427f, 4.037f)
                lineTo(12.427f, 5.336f)
                lineTo(14f, 5.8f)
                lineTo(12.427f, 6.264f)
                lineTo(13.427f, 7.563f)
                lineTo(11.882f, 7.014f)
                lineTo(11.927f, 8.653f)
                lineTo(11f, 7.3f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MalaysiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Malaysia,
            contentDescription = "Malaysia Flag"
        )
    }
}
