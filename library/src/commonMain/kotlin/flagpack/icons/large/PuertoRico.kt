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
 * Puerto Rico Flag (32x24dp)
 *
 * - ISO Alpha-2: PR
 * - ISO Alpha-3: PRI
 * - ISO Numeric: 630
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.PuertoRico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Puerto Rico:PR:PRI:630:Large",
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
                fill = SolidColor(Color(0xFFEF0000)),
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
                fill = SolidColor(Color(0xFFEF0000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 4f
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(-2f)
                verticalLineTo(10f)
                verticalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(34f)
                verticalLineTo(14f)
                verticalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF3D58DB)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(24f)
            lineTo(18f, 12f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(18f, 12f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.688f, 14.217f)
                lineTo(3.016f, 16.155f)
                lineTo(4.804f, 12.261f)
                lineTo(2.526f, 10.181f)
                lineTo(5.338f, 10.077f)
                lineTo(6.688f, 6.556f)
                lineTo(7.718f, 10.077f)
                horizontalLineTo(10.526f)
                lineTo(8.654f, 12.261f)
                lineTo(10.143f, 16.155f)
                lineTo(6.688f, 14.217f)
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
            imageVector = FlagIcons.Large.PuertoRico,
            contentDescription = "Puerto Rico Flag"
        )
    }
}
