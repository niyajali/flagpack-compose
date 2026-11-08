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
 * Marshall Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: MH
 * - ISO Alpha-3: MHL
 * - ISO Numeric: 584
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.MarshallIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Marshall Islands:MH:MHL:584:Large",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 11f)
                lineTo(7.183f, 13.944f)
                lineTo(7.191f, 10.889f)
                lineTo(5.61f, 13.503f)
                lineTo(6.441f, 10.563f)
                lineTo(4.213f, 12.654f)
                lineTo(5.807f, 10.048f)
                lineTo(3.098f, 11.46f)
                lineTo(5.336f, 9.38f)
                lineTo(2.346f, 10.009f)
                lineTo(5.063f, 8.61f)
                lineTo(2.014f, 8.409f)
                lineTo(5.007f, 7.795f)
                lineTo(2.125f, 6.779f)
                lineTo(5.173f, 6.995f)
                lineTo(2.673f, 5.24f)
                lineTo(5.549f, 6.27f)
                lineTo(3.615f, 3.905f)
                lineTo(6.107f, 5.673f)
                lineTo(4.883f, 2.873f)
                lineTo(6.805f, 5.248f)
                lineTo(6.381f, 2.223f)
                lineTo(7.591f, 5.028f)
                lineTo(8f, 2f)
                lineTo(8.408f, 5.028f)
                lineTo(9.619f, 2.223f)
                lineTo(9.195f, 5.248f)
                lineTo(11.118f, 2.873f)
                lineTo(9.893f, 5.673f)
                lineTo(12.385f, 3.905f)
                lineTo(10.451f, 6.27f)
                lineTo(13.327f, 5.24f)
                lineTo(10.827f, 6.995f)
                lineTo(13.875f, 6.779f)
                lineTo(10.993f, 7.795f)
                lineTo(13.986f, 8.409f)
                lineTo(10.937f, 8.61f)
                lineTo(13.654f, 10.009f)
                lineTo(10.664f, 9.38f)
                lineTo(12.902f, 11.46f)
                lineTo(10.193f, 10.048f)
                lineTo(11.786f, 12.654f)
                lineTo(9.559f, 10.563f)
                lineTo(10.39f, 13.503f)
                lineTo(8.809f, 10.889f)
                lineTo(8.817f, 13.944f)
                lineTo(8f, 11f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(-0.782f, 24.745f)
                lineTo(33.258f, 1.215f)
                verticalLineTo(8.886f)
                lineTo(-0.782f, 24.745f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE2AE57))) {
                moveTo(-0.782f, 24.745f)
                lineTo(33.258f, -4.785f)
                verticalLineTo(2.886f)
                lineTo(-0.782f, 24.745f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MarshallIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.MarshallIslands,
            contentDescription = "Marshall Islands Flag"
        )
    }
}
