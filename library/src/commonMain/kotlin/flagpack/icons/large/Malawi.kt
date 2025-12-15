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
 * Malawi Flag (32x24dp)
 *
 * - ISO Alpha-2: MW
 * - ISO Alpha-3: MWI
 * - ISO Numeric: 454
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Malawi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malawi:MW:MWI:454:Large",
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
                fill = SolidColor(Color(0xFFE11C1B)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(10f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.002f, 11.946f)
                verticalLineTo(11.943f)
                lineTo(3.992f, 11.945f)
                lineTo(4.002f, 11.946f)
                close()
                moveTo(4.63f, 8.127f)
                horizontalLineTo(4.733f)
                lineTo(4.575f, 8.103f)
                lineTo(4.63f, 8.127f)
                close()
                moveTo(7.558f, 8.127f)
                curveTo(7.61f, 8.026f, 7.665f, 7.927f, 7.722f, 7.828f)
                lineTo(5.432f, 6.313f)
                lineTo(8.133f, 7.191f)
                curveTo(8.284f, 6.98f, 8.445f, 6.775f, 8.618f, 6.577f)
                lineTo(6.633f, 4.688f)
                lineTo(9.162f, 6.008f)
                curveTo(9.348f, 5.831f, 9.542f, 5.661f, 9.745f, 5.498f)
                lineTo(8.14f, 3.281f)
                lineTo(10.406f, 5.015f)
                curveTo(10.617f, 4.875f, 10.835f, 4.742f, 11.06f, 4.618f)
                lineTo(9.904f, 2.137f)
                lineTo(11.818f, 4.239f)
                curveTo(12.047f, 4.137f, 12.28f, 4.042f, 12.519f, 3.957f)
                lineTo(11.868f, 1.292f)
                lineTo(13.351f, 3.696f)
                curveTo(13.589f, 3.633f, 13.832f, 3.577f, 14.078f, 3.529f)
                lineTo(13.969f, 0.774f)
                lineTo(14.956f, 3.398f)
                curveTo(15.199f, 3.372f, 15.446f, 3.353f, 15.694f, 3.344f)
                lineTo(16.141f, 0.6f)
                lineTo(16.587f, 3.344f)
                curveTo(16.836f, 3.355f, 17.082f, 3.373f, 17.325f, 3.4f)
                lineTo(18.312f, 0.774f)
                lineTo(18.203f, 3.533f)
                curveTo(18.449f, 3.581f, 18.691f, 3.637f, 18.929f, 3.701f)
                lineTo(20.414f, 1.292f)
                lineTo(19.761f, 3.963f)
                curveTo(19.999f, 4.049f, 20.231f, 4.143f, 20.458f, 4.245f)
                lineTo(22.378f, 2.137f)
                lineTo(21.218f, 4.626f)
                curveTo(21.441f, 4.751f, 21.657f, 4.883f, 21.866f, 5.022f)
                lineTo(24.142f, 3.281f)
                lineTo(22.53f, 5.508f)
                curveTo(22.731f, 5.67f, 22.923f, 5.839f, 23.107f, 6.014f)
                lineTo(25.649f, 4.688f)
                lineTo(23.653f, 6.588f)
                curveTo(23.824f, 6.784f, 23.984f, 6.987f, 24.133f, 7.196f)
                lineTo(26.85f, 6.313f)
                lineTo(24.546f, 7.838f)
                curveTo(24.601f, 7.933f, 24.654f, 8.029f, 24.705f, 8.127f)
                horizontalLineTo(22.74f)
                curveTo(21.385f, 6.25f, 18.911f, 4.993f, 16.082f, 4.993f)
                curveTo(13.253f, 4.993f, 10.778f, 6.25f, 9.424f, 8.127f)
                horizontalLineTo(7.558f)
                close()
                moveTo(10.56f, 8.127f)
                curveTo(11.843f, 6.804f, 13.857f, 5.951f, 16.122f, 5.951f)
                curveTo(18.387f, 5.951f, 20.402f, 6.804f, 21.684f, 8.127f)
                horizontalLineTo(10.56f)
                close()
                moveTo(27.549f, 8.127f)
                horizontalLineTo(27.652f)
                lineTo(27.707f, 8.103f)
                lineTo(27.549f, 8.127f)
                close()
                moveTo(28.282f, 11.944f)
                lineTo(28.29f, 11.945f)
                lineTo(28.282f, 11.946f)
                verticalLineTo(11.944f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MalawiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Malawi,
            contentDescription = "Malawi Flag"
        )
    }
}
