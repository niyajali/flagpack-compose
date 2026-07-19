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
 * Liberia Flag (32x24dp)
 *
 * - ISO Alpha-2: LR
 * - ISO Alpha-3: LBR
 * - ISO Numeric: 430
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Liberia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liberia:LR:LBR:430:Large",
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
                moveTo(0.027f, 5.5f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(-0.059f, 11f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.112f, 16.4f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.102f, 21.5f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.132f, 9.213f)
                lineTo(5.211f, 11.239f)
                lineTo(6.145f, 7.769f)
                lineTo(4f, 5.552f)
                lineTo(6.904f, 5.432f)
                lineTo(8.132f, 2f)
                lineTo(9.361f, 5.432f)
                horizontalLineTo(12.26f)
                lineTo(10.12f, 7.769f)
                lineTo(11.192f, 11.035f)
                lineTo(8.132f, 9.213f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LiberiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Liberia,
            contentDescription = "Liberia Flag"
        )
    }
}
