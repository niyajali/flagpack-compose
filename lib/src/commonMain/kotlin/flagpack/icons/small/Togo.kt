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
 * Togo Flag (16x12dp)
 *
 * - ISO Alpha-2: TG
 * - ISO Alpha-3: TGO
 * - ISO Numeric: 768
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Togo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Togo:TG:TGO:768:Small",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                moveTo(0f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.125f, 5.072f)
                lineTo(2.265f, 6.223f)
                lineTo(2.987f, 4.291f)
                lineTo(1.5f, 2.99f)
                horizontalLineTo(3.324f)
                lineTo(4.125f, 1.065f)
                lineTo(4.736f, 2.99f)
                horizontalLineTo(6.538f)
                lineTo(5.273f, 4.291f)
                lineTo(5.896f, 6.128f)
                lineTo(4.125f, 5.072f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TogoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Togo,
            contentDescription = "Togo Flag"
        )
    }
}
