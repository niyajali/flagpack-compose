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
 * Barbados Flag (16x12dp)
 *
 * - ISO Alpha-2: BB
 * - ISO Alpha-3: BRB
 * - ISO Numeric: 052
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Barbados: ImageVector by lazy {
    ImageVector.Builder(
        name = "Barbados:BB:BRB:052:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.217f, 7.637f)
                curveTo(9.534f, 6.982f, 9.899f, 5.788f, 9.899f, 5.788f)
                lineTo(10.175f, 4.965f)
                lineTo(9.078f, 5.363f)
                lineTo(9.338f, 5.514f)
                curveTo(9.338f, 5.514f, 8.885f, 6.419f, 8.657f, 6.861f)
                curveTo(8.429f, 7.303f, 8.406f, 7.011f, 8.406f, 7.011f)
                lineTo(8.445f, 3.926f)
                lineTo(8.697f, 3.858f)
                lineTo(8.069f, 2.652f)
                lineTo(7.269f, 3.875f)
                lineTo(7.621f, 3.884f)
                curveTo(7.621f, 3.884f, 7.592f, 7.138f, 7.543f, 7.011f)
                curveTo(7.516f, 6.938f, 7.443f, 7.162f, 7.407f, 7.075f)
                curveTo(7.185f, 6.53f, 6.881f, 5.474f, 6.881f, 5.474f)
                lineTo(7.059f, 5.307f)
                lineTo(5.864f, 5.062f)
                lineTo(6.221f, 5.796f)
                curveTo(6.221f, 5.796f, 6.535f, 7.104f, 6.881f, 7.743f)
                curveTo(6.958f, 7.945f, 7.334f, 8.031f, 7.334f, 8.031f)
                curveTo(7.334f, 8.031f, 7.517f, 7.845f, 7.563f, 8.031f)
                curveTo(7.608f, 8.217f, 7.563f, 8.969f, 7.563f, 8.969f)
                horizontalLineTo(8.406f)
                curveTo(8.406f, 8.969f, 8.347f, 8.26f, 8.406f, 8.031f)
                curveTo(8.466f, 7.803f, 8.65f, 8.031f, 8.65f, 8.031f)
                curveTo(8.65f, 8.031f, 9.14f, 7.839f, 9.217f, 7.637f)
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
            imageVector = FlagIcons.Small.Barbados,
            contentDescription = "Barbados Flag"
        )
    }
}
