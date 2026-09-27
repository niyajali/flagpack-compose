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
 * Puerto Rico Flag (16x12dp)
 *
 * - ISO Alpha-2: PR
 * - ISO Alpha-3: PRI
 * - ISO Numeric: 630
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.PuertoRico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Puerto Rico:PR:PRI:630:Small",
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
                fill = SolidColor(Color(0xFFEF0000)),
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
                fill = SolidColor(Color(0xFFEF0000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 4f)
                horizontalLineTo(-1f)
                verticalLineTo(5f)
                verticalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                verticalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF3D58DB)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(12f)
            lineTo(9f, 6f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(9f, 6f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.344f, 7.108f)
                lineTo(1.508f, 8.077f)
                lineTo(2.402f, 6.13f)
                lineTo(1.263f, 5.09f)
                lineTo(2.669f, 5.038f)
                lineTo(3.344f, 3.278f)
                lineTo(3.859f, 5.038f)
                horizontalLineTo(5.263f)
                lineTo(4.327f, 6.13f)
                lineTo(5.071f, 8.077f)
                lineTo(3.344f, 7.108f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PuertoRicoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.PuertoRico,
            contentDescription = "Puerto Rico Flag"
        )
    }
}
