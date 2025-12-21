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
 * Timor Leste Flag (32x24dp)
 *
 * - ISO Alpha-2: TL
 * - ISO Alpha-3: TLS
 * - ISO Numeric: 626
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.TimorLeste: ImageVector by lazy {
    ImageVector.Builder(
        name = "Timor Leste:TL:TLS:626:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, -1f)
                horizontalLineTo(-1f)
                verticalLineTo(0f)
                verticalLineTo(24f)
                verticalLineTo(25f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(24f)
                verticalLineTo(0f)
                verticalLineTo(-1f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(24f, 12f)
                lineTo(0f, 24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(16f, 12f)
                lineTo(0f, 24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.648f, 14.409f)
                lineTo(4.628f, 16.509f)
                lineTo(4.417f, 13.523f)
                lineTo(1.842f, 11.937f)
                lineTo(4.528f, 11.094f)
                lineTo(4.967f, 8.136f)
                lineTo(6.827f, 10.478f)
                lineTo(9.539f, 9.751f)
                lineTo(8.137f, 12.527f)
                lineTo(9.5f, 15.203f)
                lineTo(6.648f, 14.409f)
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
            imageVector = FlagIcons.Large.TimorLeste,
            contentDescription = "Timor Leste Flag"
        )
    }
}
