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
 * Barbados Flag (32x24dp)
 *
 * - ISO Alpha-2: BB
 * - ISO Alpha-3: BRB
 * - ISO Numeric: 052
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Barbados: ImageVector by lazy {
    ImageVector.Builder(
        name = "Barbados:BB:BRB:052:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.612f, 15.668f)
                curveTo(18.8f, 14.378f, 20.133f, 11.575f, 20.133f, 11.575f)
                lineTo(20.751f, 9.931f)
                lineTo(18.301f, 10.726f)
                lineTo(18.881f, 11.027f)
                lineTo(17.746f, 14.226f)
                lineTo(16.889f, 14.021f)
                verticalLineTo(7.853f)
                lineTo(17.567f, 7.803f)
                lineTo(15.895f, 5.372f)
                lineTo(14.263f, 7.853f)
                horizontalLineTo(15.05f)
                verticalLineTo(14.021f)
                lineTo(14.085f, 14.183f)
                lineTo(13.397f, 10.948f)
                lineTo(13.794f, 10.615f)
                lineTo(11.129f, 10.123f)
                lineTo(11.925f, 11.592f)
                curveTo(11.925f, 11.592f, 12.996f, 14.108f, 13.397f, 15.668f)
                lineTo(15.05f, 15.54f)
                verticalLineTo(17.938f)
                horizontalLineTo(16.889f)
                verticalLineTo(15.54f)
                lineTo(18.612f, 15.668f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BarbadosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Barbados,
            contentDescription = "Barbados Flag"
        )
    }
}
