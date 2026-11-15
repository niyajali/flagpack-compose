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
 * Timor Leste Flag (16x12dp)
 *
 * - ISO Alpha-2: TL
 * - ISO Alpha-3: TLS
 * - ISO Numeric: 626
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.TimorLeste: ImageVector by lazy {
    ImageVector.Builder(
        name = "Timor Leste:TL:TLS:626:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, -0.5f)
                horizontalLineTo(-0.5f)
                verticalLineTo(0f)
                verticalLineTo(12f)
                verticalLineTo(12.5f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.5f)
                verticalLineTo(12f)
                verticalLineTo(0f)
                verticalLineTo(-0.5f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(12f, 6f)
                lineTo(0f, 12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(8f, 6f)
                lineTo(0f, 12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.324f, 7.204f)
                lineTo(2.314f, 8.254f)
                lineTo(2.209f, 6.762f)
                lineTo(0.921f, 5.968f)
                lineTo(2.264f, 5.547f)
                lineTo(2.484f, 4.068f)
                lineTo(3.413f, 5.239f)
                lineTo(4.769f, 4.876f)
                lineTo(4.068f, 6.263f)
                lineTo(4.75f, 7.602f)
                lineTo(3.324f, 7.204f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TimorLestePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.TimorLeste,
            contentDescription = "Timor Leste Flag"
        )
    }
}
