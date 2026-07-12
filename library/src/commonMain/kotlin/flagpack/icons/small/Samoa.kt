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
 * Samoa Flag (16x12dp)
 *
 * - ISO Alpha-2: WS
 * - ISO Alpha-3: WSM
 * - ISO Numeric: 882
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Samoa: ImageVector by lazy {
    ImageVector.Builder(
        name = "Samoa:WS:WSM:882:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.783f, 3.886f)
                lineTo(1.253f, 4.206f)
                lineTo(1.374f, 3.582f)
                lineTo(0.932f, 3.114f)
                lineTo(1.53f, 3.089f)
                lineTo(1.783f, 2.506f)
                lineTo(2.036f, 3.089f)
                horizontalLineTo(2.632f)
                lineTo(2.192f, 3.582f)
                lineTo(2.325f, 4.206f)
                lineTo(1.783f, 3.886f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.783f, 3.886f)
                lineTo(5.253f, 4.206f)
                lineTo(5.374f, 3.582f)
                lineTo(4.932f, 3.114f)
                lineTo(5.53f, 3.089f)
                lineTo(5.783f, 2.506f)
                lineTo(6.036f, 3.089f)
                horizontalLineTo(6.632f)
                lineTo(6.192f, 3.582f)
                lineTo(6.325f, 4.206f)
                lineTo(5.783f, 3.886f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.733f, 2.069f)
                lineTo(3.234f, 2.37f)
                lineTo(3.348f, 1.782f)
                lineTo(2.932f, 1.343f)
                lineTo(3.495f, 1.319f)
                lineTo(3.733f, 0.77f)
                lineTo(3.971f, 1.319f)
                horizontalLineTo(4.532f)
                lineTo(4.118f, 1.782f)
                lineTo(4.243f, 2.37f)
                lineTo(3.733f, 2.069f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.273f, 4.213f)
                lineTo(3.961f, 4.401f)
                lineTo(4.032f, 4.034f)
                lineTo(3.773f, 3.759f)
                lineTo(4.124f, 3.744f)
                lineTo(4.273f, 3.401f)
                lineTo(4.422f, 3.744f)
                horizontalLineTo(4.773f)
                lineTo(4.514f, 4.034f)
                lineTo(4.592f, 4.401f)
                lineTo(4.273f, 4.213f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.704f, 6.414f)
                lineTo(2.956f, 6.866f)
                lineTo(3.127f, 5.984f)
                lineTo(2.504f, 5.325f)
                lineTo(3.347f, 5.289f)
                lineTo(3.704f, 4.466f)
                lineTo(4.061f, 5.289f)
                horizontalLineTo(4.904f)
                lineTo(4.282f, 5.984f)
                lineTo(4.469f, 6.866f)
                lineTo(3.704f, 6.414f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SamoaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Samoa,
            contentDescription = "Samoa Flag"
        )
    }
}
