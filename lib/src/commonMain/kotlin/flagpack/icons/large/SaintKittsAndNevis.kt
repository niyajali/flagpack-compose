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
 * Saint Kitts and Nevis Flag (32x24dp)
 *
 * - ISO Alpha-2: KN
 * - ISO Alpha-3: KNA
 * - ISO Numeric: 659
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SaintKittsAndNevis: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Kitts and Nevis:KN:KNA:659:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(32f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 2.5f
            ) {
                moveTo(0.636f, 27.952f)
                lineTo(1.359f, 28.759f)
                lineTo(2.261f, 28.157f)
                lineTo(38.521f, 3.954f)
                lineTo(39.721f, 3.153f)
                lineTo(38.758f, 2.08f)
                lineTo(33.438f, -3.856f)
                lineTo(32.714f, -4.663f)
                lineTo(31.813f, -4.061f)
                lineTo(-4.448f, 20.142f)
                lineTo(-5.647f, 20.943f)
                lineTo(-4.685f, 22.016f)
                lineTo(0.636f, 27.952f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.089f, 16.918f)
                lineTo(11f, 18.813f)
                lineTo(10.305f, 16.679f)
                lineTo(8.143f, 15.991f)
                lineTo(9.944f, 14.891f)
                lineTo(9.727f, 12.658f)
                lineTo(11.505f, 14.025f)
                lineTo(13.347f, 13.005f)
                lineTo(12.831f, 15.278f)
                lineTo(14.308f, 16.979f)
                lineTo(12.089f, 16.918f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.089f, 10.365f)
                lineTo(21f, 12.26f)
                lineTo(20.305f, 10.125f)
                lineTo(18.143f, 9.438f)
                lineTo(19.944f, 8.338f)
                lineTo(19.727f, 6.105f)
                lineTo(21.505f, 7.472f)
                lineTo(23.347f, 6.451f)
                lineTo(22.831f, 8.725f)
                lineTo(24.308f, 10.426f)
                lineTo(22.089f, 10.365f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaintKittsAndNevisPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SaintKittsAndNevis,
            contentDescription = "Saint Kitts and Nevis Flag"
        )
    }
}
