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
 * Guernsey Flag (16x12dp)
 *
 * - ISO Alpha-2: GG
 * - ISO Alpha-3: GGY
 * - ISO Numeric: 831
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Guernsey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guernsey:GG:GGY:831:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.503f, 1.523f)
                lineTo(7f, 2.4f)
                verticalLineTo(5f)
                horizontalLineTo(3.433f)
                verticalLineTo(4.971f)
                lineTo(2.553f, 4.473f)
                verticalLineTo(7.453f)
                lineTo(3.385f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9.526f)
                lineTo(6.503f, 10.403f)
                horizontalLineTo(9.483f)
                lineTo(9.004f, 9.523f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(12.6f)
                lineTo(13.433f, 7.453f)
                verticalLineTo(4.473f)
                lineTo(12.553f, 4.971f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(2.403f)
                horizontalLineTo(9.004f)
                lineTo(9.483f, 1.523f)
                horizontalLineTo(6.503f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuernseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Guernsey,
            contentDescription = "Guernsey Flag"
        )
    }
}
