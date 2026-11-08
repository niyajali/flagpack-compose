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
 * Nicaragua Flag (16x12dp)
 *
 * - ISO Alpha-2: NI
 * - ISO Alpha-3: NIC
 * - ISO Numeric: 558
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Nicaragua: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nicaragua:NI:NIC:558:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF0080EC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0080EC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD0AB00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4f)
                curveTo(8.094f, 4f, 8.187f, 4.007f, 8.278f, 4.019f)
                lineTo(8.179f, 4.657f)
                curveTo(8.12f, 4.649f, 8.061f, 4.645f, 8f, 4.645f)
                curveTo(7.912f, 4.645f, 7.826f, 4.654f, 7.742f, 4.67f)
                lineTo(7.696f, 4.023f)
                curveTo(7.795f, 4.008f, 7.897f, 4f, 8f, 4f)
                close()
                moveTo(8.576f, 4.084f)
                lineTo(8.402f, 4.706f)
                curveTo(8.954f, 4.878f, 9.355f, 5.392f, 9.355f, 6f)
                curveTo(9.355f, 6.015f, 9.354f, 6.03f, 9.354f, 6.045f)
                lineTo(9.998f, 6.099f)
                curveTo(9.999f, 6.066f, 10f, 6.033f, 10f, 6f)
                curveTo(10f, 5.096f, 9.4f, 4.332f, 8.576f, 4.084f)
                close()
                moveTo(9.757f, 6.957f)
                curveTo(9.44f, 7.537f, 8.843f, 7.944f, 8.148f, 7.995f)
                verticalLineTo(7.347f)
                curveTo(8.518f, 7.306f, 8.844f, 7.117f, 9.063f, 6.839f)
                lineTo(9.757f, 6.957f)
                close()
                moveTo(6.288f, 7.035f)
                curveTo(6.62f, 7.583f, 7.208f, 7.959f, 7.886f, 7.997f)
                verticalLineTo(7.35f)
                curveTo(7.491f, 7.317f, 7.144f, 7.114f, 6.918f, 6.815f)
                lineTo(6.288f, 7.035f)
                close()
                moveTo(6.002f, 6.086f)
                curveTo(6.001f, 6.057f, 6f, 6.029f, 6f, 6f)
                curveTo(6f, 5.151f, 6.529f, 4.425f, 7.276f, 4.135f)
                lineTo(7.443f, 4.765f)
                curveTo(6.975f, 4.976f, 6.649f, 5.445f, 6.645f, 5.99f)
                lineTo(6.002f, 6.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7CDFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.987f, 4.475f)
                lineTo(6.619f, 6.84f)
                horizontalLineTo(9.377f)
                lineTo(7.987f, 4.475f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.987f, 4.475f)
                lineTo(6.619f, 6.84f)
                horizontalLineTo(9.377f)
                lineTo(7.987f, 4.475f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8f, 7.559f)
                curveTo(8.66f, 7.559f, 9.195f, 7.024f, 9.195f, 6.364f)
                curveTo(9.195f, 5.703f, 8.66f, 5.168f, 8f, 5.168f)
                curveTo(7.34f, 5.168f, 6.805f, 5.703f, 6.805f, 6.364f)
                curveTo(6.805f, 7.024f, 7.34f, 7.559f, 8f, 7.559f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8f, 7.559f)
                curveTo(8.66f, 7.559f, 9.195f, 7.024f, 9.195f, 6.364f)
                curveTo(9.195f, 5.703f, 8.66f, 5.168f, 8f, 5.168f)
                curveTo(7.34f, 5.168f, 6.805f, 5.703f, 6.805f, 6.364f)
                curveTo(6.805f, 7.024f, 7.34f, 7.559f, 8f, 7.559f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF4EDD00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8f, 7.559f)
                curveTo(8.66f, 7.559f, 9.195f, 7.024f, 9.195f, 6.364f)
                curveTo(9.195f, 5.703f, 8.66f, 5.168f, 8f, 5.168f)
                curveTo(7.34f, 5.168f, 6.805f, 5.703f, 6.805f, 6.364f)
                curveTo(6.805f, 7.024f, 7.34f, 7.559f, 8f, 7.559f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF3D58DB)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8f, 7.559f)
                curveTo(8.66f, 7.559f, 9.195f, 7.024f, 9.195f, 6.364f)
                curveTo(9.195f, 5.703f, 8.66f, 5.168f, 8f, 5.168f)
                curveTo(7.34f, 5.168f, 6.805f, 5.703f, 6.805f, 6.364f)
                curveTo(6.805f, 7.024f, 7.34f, 7.559f, 8f, 7.559f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3D58DB))) {
                moveTo(6.509f, 6.109f)
                horizontalLineToRelative(3.127f)
                verticalLineToRelative(0.909f)
                horizontalLineToRelative(-3.127f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF97C923)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.719f, 6.495f)
                lineTo(7.342f, 5.876f)
                lineTo(7.533f, 6.186f)
                lineTo(7.667f, 5.808f)
                lineTo(7.815f, 6.091f)
                lineTo(7.971f, 5.876f)
                lineTo(8.173f, 6.091f)
                lineTo(8.358f, 5.808f)
                lineTo(8.516f, 6.091f)
                lineTo(8.697f, 5.876f)
                lineTo(9.121f, 6.326f)
                lineTo(9.197f, 6.495f)
                lineTo(6.719f, 6.621f)
                verticalLineTo(6.495f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NicaraguaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Nicaragua,
            contentDescription = "Nicaragua Flag"
        )
    }
}
