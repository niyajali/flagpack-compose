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
 * Israel Flag (16x12dp)
 *
 * - ISO Alpha-2: IL
 * - ISO Alpha-3: ISR
 * - ISO Numeric: 376
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Israel: ImageVector by lazy {
    ImageVector.Builder(
        name = "Israel:IL:ISR:376:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                verticalLineTo(3.783f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8.174f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(8.174f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.691f, 7.469f)
                horizontalLineTo(10.379f)
                lineTo(8.058f, 3.459f)
                lineTo(5.691f, 7.469f)
                close()
                moveTo(9.425f, 6.919f)
                horizontalLineTo(6.654f)
                lineTo(8.053f, 4.549f)
                lineTo(9.425f, 6.919f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.546f, 4.463f)
                horizontalLineTo(10.34f)
                lineTo(8.068f, 8.485f)
                lineTo(5.546f, 4.463f)
                close()
                moveTo(9.398f, 5.013f)
                horizontalLineTo(6.54f)
                lineTo(8.043f, 7.411f)
                lineTo(9.398f, 5.013f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IsraelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Israel,
            contentDescription = "Israel Flag"
        )
    }
}
