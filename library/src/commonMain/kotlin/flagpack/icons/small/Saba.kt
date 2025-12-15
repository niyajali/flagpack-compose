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
 * Saba Flag (16x12dp)
 *
 * - ISO Alpha-2: BQ-SA
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Saba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saba:BQ-SA:::Small",
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
                fill = SolidColor(Color.White),
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
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5.832f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                lineTo(0f, 5.832f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 5.832f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                lineTo(16f, 5.832f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5.832f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                lineTo(0f, 5.832f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 5.832f)
                verticalLineTo(12.168f)
                lineTo(8f, 12f)
                lineTo(16f, 5.832f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.857f, 7.128f)
                lineTo(6.098f, 8.382f)
                lineTo(6.744f, 6.311f)
                lineTo(5f, 5.043f)
                horizontalLineTo(7.172f)
                lineTo(7.857f, 3f)
                lineTo(8.583f, 5.043f)
                horizontalLineTo(10.696f)
                lineTo(8.967f, 6.311f)
                lineTo(9.624f, 8.382f)
                lineTo(7.857f, 7.128f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SabaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Saba,
            contentDescription = "Saba Flag"
        )
    }
}
