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
 * Northern Ireland Flag (32x24dp)
 *
 * - ISO Alpha-2: GB-NIR
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.NorthernIreland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Northern Ireland:GB-NIR:::Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
            path(fill = SolidColor(Color.White)) {
                moveTo(-3.563f, 22.285f)
                lineTo(3.478f, 25.264f)
                lineTo(32.16f, 3.238f)
                lineTo(35.874f, -1.188f)
                lineTo(28.344f, -2.183f)
                lineTo(16.646f, 7.308f)
                lineTo(7.23f, 13.703f)
                lineTo(-3.563f, 22.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-2.599f, 24.372f)
                lineTo(0.988f, 26.1f)
                lineTo(34.54f, -1.599f)
                horizontalLineTo(29.503f)
                lineTo(-2.599f, 24.372f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(35.563f, 22.285f)
                lineTo(28.521f, 25.264f)
                lineTo(-0.16f, 3.238f)
                lineTo(-3.874f, -1.188f)
                lineTo(3.656f, -2.183f)
                lineTo(15.354f, 7.308f)
                lineTo(24.77f, 13.703f)
                lineTo(35.563f, 22.285f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(35.323f, 23.783f)
                lineTo(31.736f, 25.511f)
                lineTo(17.449f, 13.652f)
                lineTo(13.213f, 12.327f)
                lineTo(-4.232f, -1.172f)
                horizontalLineTo(0.806f)
                lineTo(18.24f, 12.006f)
                lineTo(22.871f, 13.595f)
                lineTo(35.323f, 23.783f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.778f, -2f)
                horizontalLineTo(12.222f)
                verticalLineTo(8f)
                horizontalLineTo(-1.973f)
                verticalLineTo(16f)
                horizontalLineTo(12.222f)
                verticalLineTo(26f)
                horizontalLineTo(19.778f)
                verticalLineTo(16f)
                horizontalLineTo(34.028f)
                verticalLineTo(8f)
                horizontalLineTo(19.778f)
                verticalLineTo(-2f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(19.778f, -2f)
                horizontalLineTo(12.222f)
                verticalLineTo(8f)
                horizontalLineTo(-1.973f)
                verticalLineTo(16f)
                horizontalLineTo(12.222f)
                verticalLineTo(26f)
                horizontalLineTo(19.778f)
                verticalLineTo(16f)
                horizontalLineTo(34.028f)
                verticalLineTo(8f)
                horizontalLineTo(19.778f)
                verticalLineTo(-2f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(12.222f, -2f)
                verticalLineTo(-4f)
                horizontalLineTo(10.222f)
                verticalLineTo(-2f)
                horizontalLineTo(12.222f)
                close()
                moveTo(19.778f, -2f)
                horizontalLineTo(21.778f)
                verticalLineTo(-4f)
                horizontalLineTo(19.778f)
                verticalLineTo(-2f)
                close()
                moveTo(12.222f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(14.222f)
                verticalLineTo(8f)
                horizontalLineTo(12.222f)
                close()
                moveTo(-1.973f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(-3.973f)
                verticalLineTo(8f)
                horizontalLineTo(-1.973f)
                close()
                moveTo(-1.973f, 16f)
                horizontalLineTo(-3.973f)
                verticalLineTo(18f)
                horizontalLineTo(-1.973f)
                verticalLineTo(16f)
                close()
                moveTo(12.222f, 16f)
                horizontalLineTo(14.222f)
                verticalLineTo(14f)
                horizontalLineTo(12.222f)
                verticalLineTo(16f)
                close()
                moveTo(12.222f, 26f)
                horizontalLineTo(10.222f)
                verticalLineTo(28f)
                horizontalLineTo(12.222f)
                verticalLineTo(26f)
                close()
                moveTo(19.778f, 26f)
                verticalLineTo(28f)
                horizontalLineTo(21.778f)
                verticalLineTo(26f)
                horizontalLineTo(19.778f)
                close()
                moveTo(19.778f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(17.778f)
                verticalLineTo(16f)
                horizontalLineTo(19.778f)
                close()
                moveTo(34.028f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(36.028f)
                verticalLineTo(16f)
                horizontalLineTo(34.028f)
                close()
                moveTo(34.028f, 8f)
                horizontalLineTo(36.028f)
                verticalLineTo(6f)
                horizontalLineTo(34.028f)
                verticalLineTo(8f)
                close()
                moveTo(19.778f, 8f)
                horizontalLineTo(17.778f)
                verticalLineTo(10f)
                horizontalLineTo(19.778f)
                verticalLineTo(8f)
                close()
                moveTo(12.222f, 0f)
                horizontalLineTo(19.778f)
                verticalLineTo(-4f)
                horizontalLineTo(12.222f)
                verticalLineTo(0f)
                close()
                moveTo(14.222f, 8f)
                verticalLineTo(-2f)
                horizontalLineTo(10.222f)
                verticalLineTo(8f)
                horizontalLineTo(14.222f)
                close()
                moveTo(-1.973f, 10f)
                horizontalLineTo(12.222f)
                verticalLineTo(6f)
                horizontalLineTo(-1.973f)
                verticalLineTo(10f)
                close()
                moveTo(0.027f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(-3.973f)
                verticalLineTo(16f)
                horizontalLineTo(0.027f)
                close()
                moveTo(12.222f, 14f)
                horizontalLineTo(-1.973f)
                verticalLineTo(18f)
                horizontalLineTo(12.222f)
                verticalLineTo(14f)
                close()
                moveTo(14.222f, 26f)
                verticalLineTo(16f)
                horizontalLineTo(10.222f)
                verticalLineTo(26f)
                horizontalLineTo(14.222f)
                close()
                moveTo(19.778f, 24f)
                horizontalLineTo(12.222f)
                verticalLineTo(28f)
                horizontalLineTo(19.778f)
                verticalLineTo(24f)
                close()
                moveTo(17.778f, 16f)
                verticalLineTo(26f)
                horizontalLineTo(21.778f)
                verticalLineTo(16f)
                horizontalLineTo(17.778f)
                close()
                moveTo(34.028f, 14f)
                horizontalLineTo(19.778f)
                verticalLineTo(18f)
                horizontalLineTo(34.028f)
                verticalLineTo(14f)
                close()
                moveTo(32.028f, 8f)
                verticalLineTo(16f)
                horizontalLineTo(36.028f)
                verticalLineTo(8f)
                horizontalLineTo(32.028f)
                close()
                moveTo(19.778f, 10f)
                horizontalLineTo(34.028f)
                verticalLineTo(6f)
                horizontalLineTo(19.778f)
                verticalLineTo(10f)
                close()
                moveTo(17.778f, -2f)
                verticalLineTo(8f)
                horizontalLineTo(21.778f)
                verticalLineTo(-2f)
                horizontalLineTo(17.778f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthernIrelandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.NorthernIreland,
            contentDescription = "Northern Ireland Flag"
        )
    }
}
