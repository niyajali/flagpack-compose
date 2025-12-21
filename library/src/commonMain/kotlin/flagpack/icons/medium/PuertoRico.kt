package flagpack.icons.medium

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
 * Puerto Rico Flag (20x15dp)
 *
 * - ISO Alpha-2: PR
 * - ISO Alpha-3: PRI
 * - ISO Numeric: 630
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.PuertoRico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Puerto Rico:PR:PRI:630:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEF0000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFEF0000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2.5f
            ) {
                moveTo(0f, 5f)
                horizontalLineTo(-1.25f)
                verticalLineTo(6.25f)
                verticalLineTo(8.75f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(21.25f)
                verticalLineTo(8.75f)
                verticalLineTo(6.25f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF3D58DB)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(15f)
            lineTo(11.25f, 7.5f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(11.25f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.18f, 8.886f)
                lineTo(1.885f, 10.097f)
                lineTo(3.002f, 7.663f)
                lineTo(1.578f, 6.363f)
                lineTo(3.336f, 6.298f)
                lineTo(4.18f, 4.098f)
                lineTo(4.824f, 6.298f)
                horizontalLineTo(6.578f)
                lineTo(5.409f, 7.663f)
                lineTo(6.339f, 10.097f)
                lineTo(4.18f, 8.886f)
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
            imageVector = FlagIcons.Medium.PuertoRico,
            contentDescription = "Puerto Rico Flag"
        )
    }
}
