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
 * Panama Flag (32x24dp)
 *
 * - ISO Alpha-2: PA
 * - ISO Alpha-3: PAN
 * - ISO Numeric: 591
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Panama: ImageVector by lazy {
    ImageVector.Builder(
        name = "Panama:PA:PAN:591:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.021f, 19.15f)
                lineTo(20.718f, 20.574f)
                lineTo(21.612f, 18.183f)
                lineTo(19.655f, 16.372f)
                horizontalLineTo(22.029f)
                lineTo(23.021f, 13.785f)
                lineTo(23.778f, 16.372f)
                horizontalLineTo(26.155f)
                lineTo(24.442f, 18.183f)
                lineTo(25.281f, 20.574f)
                lineTo(23.021f, 19.15f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.021f, 8.365f)
                lineTo(6.718f, 9.79f)
                lineTo(7.612f, 7.398f)
                lineTo(5.655f, 5.587f)
                horizontalLineTo(8.029f)
                lineTo(9.021f, 3f)
                lineTo(9.778f, 5.587f)
                horizontalLineTo(12.155f)
                lineTo(10.442f, 7.398f)
                lineTo(11.281f, 9.79f)
                lineTo(9.021f, 8.365f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PanamaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Panama,
            contentDescription = "Panama Flag"
        )
    }
}
