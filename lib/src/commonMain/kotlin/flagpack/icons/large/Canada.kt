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
 * Canada Flag (32x24dp)
 *
 * - ISO Alpha-2: CA
 * - ISO Alpha-3: CAN
 * - ISO Numeric: 124
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Canada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Canada:CA:CAN:124:Large",
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
                moveTo(8f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.976f, 7f)
                lineTo(16f, 19f)
                horizontalLineTo(15.401f)
                lineTo(15.768f, 16.03f)
                curveTo(13.078f, 16.514f, 11.844f, 16.634f, 12.067f, 16.39f)
                curveTo(12.289f, 16.146f, 12.464f, 15.8f, 12.592f, 15.352f)
                lineTo(9f, 12.955f)
                curveTo(9.378f, 12.951f, 9.72f, 12.857f, 10.028f, 12.674f)
                curveTo(10.335f, 12.491f, 10.181f, 11.858f, 9.567f, 10.774f)
                lineTo(11.38f, 11.038f)
                lineTo(12.067f, 10.292f)
                lineTo(13.435f, 11.724f)
                horizontalLineTo(14.05f)
                lineTo(13.435f, 8.443f)
                lineTo(14.538f, 9.059f)
                lineTo(15.976f, 7f)
                close()
                moveTo(15.976f, 7f)
                lineTo(17.462f, 9.059f)
                lineTo(18.565f, 8.443f)
                lineTo(17.95f, 11.724f)
                horizontalLineTo(18.565f)
                lineTo(19.933f, 10.292f)
                lineTo(20.619f, 11.038f)
                lineTo(22.433f, 10.774f)
                curveTo(21.819f, 11.858f, 21.665f, 12.491f, 21.972f, 12.674f)
                curveTo(22.28f, 12.857f, 22.622f, 12.951f, 23f, 12.955f)
                lineTo(19.407f, 15.352f)
                curveTo(19.536f, 15.8f, 19.711f, 16.146f, 19.933f, 16.39f)
                curveTo(20.156f, 16.634f, 18.922f, 16.514f, 16.232f, 16.03f)
                lineTo(16.6f, 19f)
                horizontalLineTo(16f)
                lineTo(15.976f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CanadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Canada,
            contentDescription = "Canada Flag"
        )
    }
}
