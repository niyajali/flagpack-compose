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
 * Singapore Flag (32x24dp)
 *
 * - ISO Alpha-2: SG
 * - ISO Alpha-3: SGP
 * - ISO Numeric: 702
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Singapore: ImageVector by lazy {
    ImageVector.Builder(
        name = "Singapore:SG:SGP:702:Large",
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
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.868f, 10.59f)
                curveTo(8.868f, 10.59f, 6.043f, 9.453f, 6.043f, 6.374f)
                curveTo(6.043f, 3.295f, 8.868f, 2.195f, 8.868f, 2.195f)
                curveTo(7.495f, 1.847f, 3.851f, 2.158f, 3.851f, 6.374f)
                curveTo(3.851f, 10.59f, 7.44f, 11.385f, 8.868f, 10.59f)
                close()
                moveTo(9.592f, 10.081f)
                lineTo(10.403f, 9.591f)
                lineTo(11.231f, 10.081f)
                lineTo(11.029f, 9.126f)
                lineTo(11.702f, 8.372f)
                horizontalLineTo(10.79f)
                lineTo(10.403f, 7.481f)
                lineTo(10.016f, 8.372f)
                lineTo(9.102f, 8.411f)
                lineTo(9.777f, 9.126f)
                lineTo(9.592f, 10.081f)
                close()
                moveTo(13.349f, 9.537f)
                lineTo(12.539f, 10.026f)
                lineTo(12.724f, 9.071f)
                lineTo(12.049f, 8.356f)
                lineTo(12.963f, 8.318f)
                lineTo(13.349f, 7.426f)
                lineTo(13.736f, 8.318f)
                horizontalLineTo(14.649f)
                lineTo(13.975f, 9.071f)
                lineTo(14.178f, 10.026f)
                lineTo(13.349f, 9.537f)
                close()
                moveTo(11.287f, 5.77f)
                lineTo(12.098f, 5.281f)
                lineTo(12.926f, 5.77f)
                lineTo(12.724f, 4.815f)
                lineTo(13.397f, 4.062f)
                horizontalLineTo(12.484f)
                lineTo(12.098f, 3.17f)
                lineTo(11.711f, 4.062f)
                lineTo(10.797f, 4.1f)
                lineTo(11.472f, 4.815f)
                lineTo(11.287f, 5.77f)
                close()
                moveTo(9.37f, 7.223f)
                lineTo(8.559f, 7.712f)
                lineTo(8.744f, 6.757f)
                lineTo(8.069f, 6.042f)
                lineTo(8.983f, 6.004f)
                lineTo(9.37f, 5.112f)
                lineTo(9.757f, 6.004f)
                horizontalLineTo(10.669f)
                lineTo(9.996f, 6.757f)
                lineTo(10.198f, 7.712f)
                lineTo(9.37f, 7.223f)
                close()
                moveTo(13.918f, 7.668f)
                lineTo(14.728f, 7.179f)
                lineTo(15.557f, 7.668f)
                lineTo(15.354f, 6.713f)
                lineTo(16.027f, 5.96f)
                horizontalLineTo(15.115f)
                lineTo(14.728f, 5.068f)
                lineTo(14.342f, 5.96f)
                lineTo(13.427f, 5.999f)
                lineTo(14.102f, 6.713f)
                lineTo(13.918f, 7.668f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SingaporePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Singapore,
            contentDescription = "Singapore Flag"
        )
    }
}
