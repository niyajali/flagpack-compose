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
 * Venezuela Flag (32x24dp)
 *
 * - ISO Alpha-2: VE
 * - ISO Alpha-3: VEN
 * - ISO Numeric: 862
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Venezuela: ImageVector by lazy {
    ImageVector.Builder(
        name = "Venezuela:VE:VEN:862:Large",
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
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.737f, 11.859f)
                lineTo(13.719f, 11.302f)
                lineTo(14.822f, 11.859f)
                lineTo(14.426f, 10.726f)
                lineTo(15.25f, 9.894f)
                horizontalLineTo(14.202f)
                lineTo(13.718f, 8.822f)
                lineTo(13.306f, 9.894f)
                horizontalLineTo(12.076f)
                lineTo(13.001f, 10.712f)
                horizontalLineTo(11.964f)
                lineTo(11.48f, 9.639f)
                lineTo(11.068f, 10.712f)
                horizontalLineTo(9.838f)
                lineTo(10.78f, 11.544f)
                lineTo(10.6f, 12.27f)
                horizontalLineTo(9.815f)
                lineTo(9.332f, 11.198f)
                lineTo(8.919f, 12.27f)
                horizontalLineTo(7.69f)
                lineTo(8.631f, 13.103f)
                lineTo(8.457f, 13.806f)
                horizontalLineTo(8.114f)
                lineTo(7.63f, 12.734f)
                lineTo(7.218f, 13.806f)
                horizontalLineTo(5.988f)
                lineTo(6.93f, 14.639f)
                lineTo(6.649f, 15.771f)
                lineTo(7.632f, 15.214f)
                lineTo(8.734f, 15.771f)
                lineTo(8.338f, 14.639f)
                lineTo(9.162f, 13.806f)
                horizontalLineTo(9.109f)
                lineTo(9.333f, 13.679f)
                lineTo(10.436f, 14.236f)
                lineTo(10.04f, 13.103f)
                lineTo(10.512f, 12.626f)
                lineTo(10.499f, 12.677f)
                lineTo(11.482f, 12.12f)
                lineTo(12.584f, 12.677f)
                lineTo(12.188f, 11.544f)
                lineTo(13.007f, 10.717f)
                lineTo(13.017f, 10.726f)
                lineTo(12.737f, 11.859f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.223f, 11.816f)
                lineTo(18.24f, 11.258f)
                lineTo(17.138f, 11.816f)
                lineTo(17.534f, 10.683f)
                lineTo(16.71f, 9.85f)
                horizontalLineTo(17.758f)
                lineTo(18.242f, 8.778f)
                lineTo(18.654f, 9.85f)
                horizontalLineTo(19.884f)
                lineTo(18.959f, 10.668f)
                horizontalLineTo(20.001f)
                lineTo(20.484f, 9.595f)
                lineTo(20.897f, 10.668f)
                horizontalLineTo(22.126f)
                lineTo(21.185f, 11.5f)
                lineTo(21.365f, 12.227f)
                horizontalLineTo(22.149f)
                lineTo(22.633f, 11.154f)
                lineTo(23.045f, 12.227f)
                horizontalLineTo(24.275f)
                lineTo(23.334f, 13.059f)
                lineTo(23.508f, 13.762f)
                horizontalLineTo(23.851f)
                lineTo(24.335f, 12.69f)
                lineTo(24.747f, 13.762f)
                horizontalLineTo(25.977f)
                lineTo(25.035f, 14.595f)
                lineTo(25.316f, 15.728f)
                lineTo(24.333f, 15.17f)
                lineTo(23.231f, 15.728f)
                lineTo(23.627f, 14.595f)
                lineTo(22.803f, 13.762f)
                horizontalLineTo(22.856f)
                lineTo(22.632f, 13.635f)
                lineTo(21.529f, 14.192f)
                lineTo(21.925f, 13.059f)
                lineTo(21.453f, 12.582f)
                lineTo(21.466f, 12.633f)
                lineTo(20.483f, 12.076f)
                lineTo(19.38f, 12.633f)
                lineTo(19.776f, 11.5f)
                lineTo(18.956f, 10.671f)
                lineTo(18.942f, 10.683f)
                lineTo(19.223f, 11.816f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.833f, 10.535f)
                lineTo(14.85f, 11.092f)
                lineTo(15.131f, 9.959f)
                lineTo(14.19f, 9.127f)
                horizontalLineTo(15.419f)
                lineTo(15.832f, 8.054f)
                lineTo(16.315f, 9.127f)
                horizontalLineTo(17.363f)
                lineTo(16.54f, 9.959f)
                lineTo(16.936f, 11.092f)
                lineTo(15.833f, 10.535f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VenezuelaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Venezuela,
            contentDescription = "Venezuela Flag"
        )
    }
}
