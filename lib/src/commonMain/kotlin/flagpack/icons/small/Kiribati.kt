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
 * Kiribati Flag (16x12dp)
 *
 * - ISO Alpha-2: KI
 * - ISO Alpha-3: KIR
 * - ISO Numeric: 296
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Kiribati: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kiribati:KI:KIR:296:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFFFC84A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.662f, 8.588f)
                lineTo(7.891f, 8.092f)
                lineTo(8.119f, 8.588f)
                lineTo(8.255f, 8.06f)
                lineTo(8.57f, 8.507f)
                lineTo(8.608f, 7.963f)
                lineTo(8.999f, 8.348f)
                lineTo(8.938f, 7.805f)
                lineTo(9.392f, 8.115f)
                lineTo(9.235f, 7.592f)
                lineTo(9.736f, 7.816f)
                lineTo(9.488f, 7.329f)
                lineTo(10.022f, 7.461f)
                lineTo(9.69f, 7.026f)
                lineTo(10.239f, 7.061f)
                lineTo(9.833f, 6.692f)
                lineTo(10.38f, 6.629f)
                lineTo(9.915f, 6.338f)
                lineTo(10.442f, 6.179f)
                lineTo(9.931f, 5.975f)
                lineTo(10.421f, 5.726f)
                lineTo(9.882f, 5.615f)
                lineTo(10.319f, 5.283f)
                lineTo(9.769f, 5.269f)
                lineTo(10.139f, 4.866f)
                lineTo(9.596f, 4.95f)
                lineTo(9.887f, 4.487f)
                lineTo(9.367f, 4.665f)
                lineTo(9.571f, 4.158f)
                lineTo(9.091f, 4.426f)
                lineTo(9.2f, 3.891f)
                lineTo(8.777f, 4.24f)
                lineTo(8.788f, 3.694f)
                lineTo(8.434f, 4.113f)
                lineTo(8.347f, 3.574f)
                lineTo(8.074f, 4.048f)
                lineTo(7.891f, 3.533f)
                lineTo(7.707f, 4.048f)
                lineTo(7.435f, 3.574f)
                lineTo(7.347f, 4.113f)
                lineTo(6.993f, 3.694f)
                lineTo(7.004f, 4.24f)
                lineTo(6.581f, 3.891f)
                lineTo(6.69f, 4.426f)
                lineTo(6.21f, 4.158f)
                lineTo(6.414f, 4.665f)
                lineTo(5.894f, 4.487f)
                lineTo(6.186f, 4.95f)
                lineTo(5.642f, 4.866f)
                lineTo(6.012f, 5.269f)
                lineTo(5.462f, 5.283f)
                lineTo(5.899f, 5.615f)
                lineTo(5.36f, 5.726f)
                lineTo(5.85f, 5.975f)
                lineTo(5.339f, 6.179f)
                lineTo(5.866f, 6.338f)
                lineTo(5.401f, 6.629f)
                lineTo(5.948f, 6.692f)
                lineTo(5.542f, 7.061f)
                lineTo(6.092f, 7.026f)
                lineTo(5.759f, 7.461f)
                lineTo(6.293f, 7.329f)
                lineTo(6.045f, 7.816f)
                lineTo(6.546f, 7.592f)
                lineTo(6.39f, 8.115f)
                lineTo(6.843f, 7.805f)
                lineTo(6.783f, 8.348f)
                lineTo(7.173f, 7.963f)
                lineTo(7.211f, 8.507f)
                lineTo(7.526f, 8.06f)
                lineTo(7.662f, 8.588f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.396f, 6.96f)
                lineTo(0.911f, 6.429f)
                curveTo(1.102f, 6.352f, 1.315f, 6.353f, 1.505f, 6.432f)
                lineTo(3.321f, 7.188f)
                curveTo(3.526f, 7.273f, 3.758f, 7.267f, 3.959f, 7.171f)
                lineTo(5.423f, 6.468f)
                curveTo(5.633f, 6.367f, 5.877f, 6.365f, 6.089f, 6.463f)
                lineTo(7.622f, 7.172f)
                curveTo(7.829f, 7.267f, 8.067f, 7.268f, 8.274f, 7.173f)
                lineTo(9.843f, 6.457f)
                curveTo(10.05f, 6.363f, 10.288f, 6.364f, 10.495f, 6.459f)
                lineTo(12.044f, 7.174f)
                curveTo(12.248f, 7.268f, 12.481f, 7.27f, 12.686f, 7.18f)
                lineTo(14.379f, 6.434f)
                curveTo(14.563f, 6.354f, 14.77f, 6.347f, 14.958f, 6.414f)
                lineTo(16.476f, 6.96f)
                verticalLineTo(11.967f)
                horizontalLineTo(-0.441f)
                lineTo(-0.396f, 6.96f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-0.396f, 6.96f)
                lineTo(0.911f, 6.429f)
                curveTo(1.102f, 6.352f, 1.315f, 6.353f, 1.505f, 6.432f)
                lineTo(3.321f, 7.188f)
                curveTo(3.526f, 7.273f, 3.758f, 7.267f, 3.959f, 7.171f)
                lineTo(5.423f, 6.468f)
                curveTo(5.633f, 6.367f, 5.877f, 6.365f, 6.089f, 6.463f)
                lineTo(7.622f, 7.172f)
                curveTo(7.829f, 7.267f, 8.067f, 7.268f, 8.274f, 7.173f)
                lineTo(9.843f, 6.457f)
                curveTo(10.05f, 6.363f, 10.288f, 6.364f, 10.495f, 6.459f)
                lineTo(12.044f, 7.174f)
                curveTo(12.248f, 7.268f, 12.481f, 7.27f, 12.686f, 7.18f)
                lineTo(14.379f, 6.434f)
                curveTo(14.563f, 6.354f, 14.77f, 6.347f, 14.958f, 6.414f)
                lineTo(16.476f, 6.96f)
                verticalLineTo(11.967f)
                horizontalLineTo(-0.441f)
                lineTo(-0.396f, 6.96f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 1f
            ) {
                moveTo(-0.396f, 8.123f)
                lineTo(0.911f, 7.592f)
                curveTo(1.102f, 7.515f, 1.315f, 7.516f, 1.505f, 7.595f)
                lineTo(3.321f, 8.35f)
                curveTo(3.526f, 8.436f, 3.758f, 8.43f, 3.959f, 8.333f)
                lineTo(5.423f, 7.631f)
                curveTo(5.633f, 7.53f, 5.877f, 7.528f, 6.088f, 7.626f)
                lineTo(7.622f, 8.334f)
                curveTo(7.829f, 8.43f, 8.067f, 8.43f, 8.274f, 8.336f)
                lineTo(9.843f, 7.62f)
                curveTo(10.05f, 7.526f, 10.288f, 7.526f, 10.495f, 7.622f)
                lineTo(12.044f, 8.337f)
                curveTo(12.248f, 8.431f, 12.481f, 8.433f, 12.686f, 8.343f)
                lineTo(14.379f, 7.597f)
                curveTo(14.563f, 7.517f, 14.77f, 7.509f, 14.958f, 7.577f)
                lineTo(16.476f, 8.123f)
            }
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 1f
            ) {
                moveTo(-0.396f, 9.787f)
                lineTo(0.911f, 9.257f)
                curveTo(1.102f, 9.179f, 1.315f, 9.18f, 1.505f, 9.259f)
                lineTo(3.321f, 10.015f)
                curveTo(3.526f, 10.1f, 3.758f, 10.094f, 3.959f, 9.998f)
                lineTo(5.423f, 9.295f)
                curveTo(5.633f, 9.194f, 5.877f, 9.193f, 6.088f, 9.29f)
                lineTo(7.622f, 9.999f)
                curveTo(7.829f, 10.094f, 8.067f, 10.095f, 8.274f, 10f)
                lineTo(9.843f, 9.285f)
                curveTo(10.05f, 9.19f, 10.288f, 9.191f, 10.495f, 9.286f)
                lineTo(12.044f, 10.002f)
                curveTo(12.248f, 10.095f, 12.481f, 10.097f, 12.686f, 10.007f)
                lineTo(14.379f, 9.262f)
                curveTo(14.563f, 9.181f, 14.77f, 9.174f, 14.958f, 9.242f)
                lineTo(16.476f, 9.787f)
            }
            path(
                fill = SolidColor(Color(0xFF015989)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.396f, 11.114f)
                lineTo(0.15f, 10.892f)
                curveTo(0.828f, 10.617f, 1.588f, 10.62f, 2.264f, 10.901f)
                lineTo(3.321f, 11.341f)
                curveTo(3.526f, 11.427f, 3.758f, 11.42f, 3.959f, 11.324f)
                lineTo(4.574f, 11.029f)
                curveTo(5.322f, 10.67f, 6.19f, 10.664f, 6.943f, 11.012f)
                lineTo(7.622f, 11.325f)
                curveTo(7.829f, 11.421f, 8.067f, 11.421f, 8.274f, 11.327f)
                lineTo(9.008f, 10.992f)
                curveTo(9.745f, 10.656f, 10.592f, 10.658f, 11.328f, 10.997f)
                lineTo(12.044f, 11.328f)
                curveTo(12.248f, 11.422f, 12.481f, 11.424f, 12.686f, 11.333f)
                lineTo(13.648f, 10.91f)
                curveTo(14.301f, 10.623f, 15.039f, 10.597f, 15.71f, 10.838f)
                lineTo(16.476f, 11.114f)
                verticalLineTo(12.771f)
                horizontalLineTo(-0.304f)
                lineTo(-0.396f, 11.114f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFC84A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.801f, 1.199f)
            curveTo(4.801f, 1.199f, 5.513f, 1.342f, 5.747f, 1.342f)
            curveTo(5.982f, 1.342f, 6.51f, 0.983f, 6.816f, 1.103f)
            curveTo(7.122f, 1.222f, 7.71f, 1.787f, 7.71f, 1.787f)
            curveTo(7.71f, 1.787f, 8.543f, 1.162f, 9.05f, 1.162f)
            curveTo(9.556f, 1.162f, 10.487f, 1.23f, 10.487f, 1.23f)
            curveTo(10.487f, 1.23f, 10.272f, 1.787f, 9.669f, 1.881f)
            curveTo(9.066f, 1.975f, 8.344f, 2.437f, 8.344f, 2.437f)
            curveTo(8.344f, 2.437f, 9.175f, 2.437f, 9.325f, 2.437f)
            curveTo(9.474f, 2.437f, 9.969f, 2.714f, 9.969f, 2.714f)
            curveTo(9.969f, 2.714f, 9.267f, 2.936f, 9.066f, 2.936f)
            curveTo(8.865f, 2.936f, 8.643f, 2.936f, 8.643f, 2.936f)
            curveTo(8.643f, 2.936f, 8.216f, 3.303f, 7.688f, 3.225f)
            curveTo(7.161f, 3.147f, 6.792f, 2.808f, 6.792f, 2.808f)
            curveTo(6.792f, 2.808f, 6.047f, 2.759f, 6.047f, 2.68f)
            curveTo(6.047f, 2.68f, 5.763f, 2.534f, 5.677f, 2.68f)
            curveTo(5.591f, 2.825f, 6.047f, 2.484f, 6.047f, 2.484f)
            curveTo(6.047f, 2.484f, 6.459f, 2.15f, 6.598f, 2.15f)
            curveTo(6.738f, 2.15f, 7.203f, 2.437f, 7.203f, 2.437f)
            lineTo(7.314f, 2.322f)
            lineTo(6.738f, 1.881f)
            curveTo(5.561f, 2.004f, 4.801f, 1.199f, 4.801f, 1.199f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KiribatiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Kiribati,
            contentDescription = "Kiribati Flag"
        )
    }
}
