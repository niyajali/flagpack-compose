package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Sint Maarten Flag (20x15dp)
 *
 * - ISO Alpha-2: SX
 * - ISO Alpha-3: SXM
 * - ISO Numeric: 534
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SintMaarten: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Maarten:SX:SXM:534:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, -1.25f)
            verticalLineTo(16.25f)
            lineTo(12.5f, 7.5f)
            lineTo(0f, -1.25f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, -1.25f)
                verticalLineTo(16.25f)
                lineTo(12.5f, 7.5f)
                lineTo(0f, -1.25f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.079f, 5.743f)
                curveTo(5.977f, 5.743f, 6.705f, 5.297f, 6.705f, 4.747f)
                curveTo(6.705f, 4.196f, 5.977f, 3.75f, 5.079f, 3.75f)
                curveTo(4.181f, 3.75f, 3.453f, 4.196f, 3.453f, 4.747f)
                curveTo(3.453f, 5.297f, 4.181f, 5.743f, 5.079f, 5.743f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDA610A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.221f, 3.991f)
                curveTo(5.088f, 3.991f, 4.994f, 4.076f, 4.994f, 4.205f)
                lineTo(4.994f, 4.219f)
                curveTo(4.987f, 4.241f, 4.983f, 4.265f, 4.982f, 4.291f)
                curveTo(4.98f, 4.36f, 5.006f, 4.417f, 5.059f, 4.469f)
                curveTo(5.063f, 4.484f, 5.064f, 4.497f, 5.064f, 4.504f)
                curveTo(5.061f, 4.493f, 5.048f, 4.484f, 5.023f, 4.466f)
                curveTo(4.988f, 4.44f, 4.93f, 4.398f, 4.842f, 4.309f)
                curveTo(4.715f, 4.18f, 4.619f, 4.13f, 4.5f, 4.15f)
                curveTo(4.464f, 4.156f, 4.429f, 4.169f, 4.387f, 4.186f)
                curveTo(4.319f, 4.21f, 4.257f, 4.216f, 4.142f, 4.194f)
                curveTo(3.823f, 4.133f, 3.474f, 4.193f, 3.095f, 4.368f)
                lineTo(3.226f, 4.652f)
                curveTo(3.55f, 4.502f, 3.835f, 4.453f, 4.084f, 4.501f)
                curveTo(4.255f, 4.534f, 4.374f, 4.523f, 4.493f, 4.48f)
                curveTo(4.544f, 4.461f, 4.548f, 4.459f, 4.552f, 4.458f)
                curveTo(4.548f, 4.459f, 4.551f, 4.461f, 4.567f, 4.477f)
                curveTo(4.577f, 4.487f, 4.594f, 4.503f, 4.619f, 4.528f)
                curveTo(4.655f, 4.565f, 4.692f, 4.597f, 4.73f, 4.627f)
                curveTo(4.657f, 4.647f, 4.661f, 4.66f, 4.674f, 4.708f)
                curveTo(4.68f, 4.728f, 4.687f, 4.753f, 4.691f, 4.787f)
                curveTo(4.7f, 4.861f, 4.685f, 4.9f, 4.698f, 4.918f)
                curveTo(4.713f, 4.939f, 4.762f, 4.934f, 4.92f, 4.927f)
                curveTo(4.962f, 4.925f, 5.02f, 4.921f, 5.086f, 4.915f)
                curveTo(5.216f, 4.902f, 5.363f, 4.885f, 5.453f, 4.87f)
                curveTo(5.541f, 4.855f, 5.564f, 4.85f, 5.601f, 4.823f)
                curveTo(5.613f, 4.808f, 5.624f, 4.794f, 5.633f, 4.782f)
                curveTo(5.933f, 4.738f, 6.2f, 4.707f, 6.437f, 4.686f)
                curveTo(6.522f, 4.678f, 6.591f, 4.672f, 6.657f, 4.668f)
                curveTo(6.658f, 4.668f, 6.659f, 4.668f, 6.66f, 4.668f)
                curveTo(6.666f, 4.667f, 6.671f, 4.666f, 6.703f, 4.66f)
                curveTo(6.72f, 4.652f, 6.727f, 4.649f, 6.729f, 4.648f)
                lineTo(6.729f, 4.648f)
                curveTo(6.73f, 4.648f, 6.73f, 4.648f, 6.73f, 4.648f)
                curveTo(6.73f, 4.648f, 6.73f, 4.648f, 6.729f, 4.648f)
                lineTo(6.806f, 4.467f)
                lineTo(6.727f, 4.371f)
                curveTo(6.674f, 4.355f, 6.674f, 4.355f, 6.667f, 4.355f)
                lineTo(6.667f, 4.355f)
                curveTo(6.657f, 4.354f, 6.657f, 4.354f, 6.652f, 4.354f)
                curveTo(6.627f, 4.354f, 6.627f, 4.354f, 6.58f, 4.354f)
                curveTo(6.528f, 4.354f, 6.487f, 4.349f, 6.428f, 4.339f)
                lineTo(6.373f, 4.329f)
                curveTo(6.129f, 4.284f, 5.903f, 4.284f, 5.424f, 4.356f)
                lineTo(5.397f, 4.335f)
                curveTo(5.474f, 4.322f, 5.568f, 4.313f, 5.668f, 4.307f)
                curveTo(5.728f, 4.304f, 5.728f, 4.304f, 5.761f, 4.304f)
                lineTo(5.776f, 4.303f)
                lineTo(5.774f, 3.991f)
                lineTo(5.75f, 3.991f)
                horizontalLineTo(5.221f)
                close()
                moveTo(4.962f, 4.896f)
                lineTo(4.992f, 4.889f)
                lineTo(5.021f, 4.883f)
                curveTo(5.016f, 4.884f, 5.01f, 4.885f, 5.003f, 4.887f)
                curveTo(4.992f, 4.889f, 4.978f, 4.892f, 4.962f, 4.896f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF56C6F5)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(4.953f, 5.363f)
                lineTo(5.004f, 5.371f)
                lineTo(5.054f, 5.363f)
                curveTo(5.675f, 5.261f, 6.084f, 5.273f, 6.32f, 5.353f)
                curveTo(6.593f, 5.444f, 6.895f, 5.418f, 7.212f, 5.311f)
                curveTo(7.111f, 5.76f, 7.06f, 6.184f, 7.06f, 6.582f)
                curveTo(7.06f, 7.037f, 7.147f, 7.404f, 7.227f, 7.726f)
                curveTo(7.229f, 7.734f, 7.231f, 7.743f, 7.234f, 7.751f)
                curveTo(7.312f, 8.067f, 7.376f, 8.328f, 7.376f, 8.628f)
                curveTo(7.376f, 8.897f, 7.287f, 9.038f, 7.162f, 9.127f)
                curveTo(7.018f, 9.229f, 6.777f, 9.294f, 6.42f, 9.294f)
                curveTo(5.916f, 9.294f, 5.445f, 9.43f, 5.011f, 9.695f)
                lineTo(5.004f, 9.69f)
                lineTo(4.997f, 9.695f)
                curveTo(4.563f, 9.43f, 4.091f, 9.294f, 3.588f, 9.294f)
                curveTo(3.23f, 9.294f, 2.989f, 9.229f, 2.845f, 9.127f)
                curveTo(2.72f, 9.038f, 2.631f, 8.897f, 2.631f, 8.628f)
                curveTo(2.631f, 8.328f, 2.696f, 8.067f, 2.774f, 7.751f)
                curveTo(2.776f, 7.743f, 2.778f, 7.734f, 2.78f, 7.726f)
                curveTo(2.86f, 7.404f, 2.948f, 7.037f, 2.948f, 6.582f)
                curveTo(2.948f, 6.184f, 2.896f, 5.76f, 2.796f, 5.311f)
                curveTo(3.113f, 5.418f, 3.414f, 5.444f, 3.687f, 5.353f)
                curveTo(3.924f, 5.273f, 4.332f, 5.261f, 4.953f, 5.363f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.49f, 6.39f)
                lineTo(5.008f, 5.962f)
                lineTo(4.526f, 6.39f)
                horizontalLineTo(4.669f)
                verticalLineTo(6.637f)
                lineTo(3.919f, 7.104f)
                verticalLineTo(8.247f)
                horizontalLineTo(3.776f)
                verticalLineTo(8.462f)
                horizontalLineTo(3.919f)
                horizontalLineTo(6.098f)
                horizontalLineTo(6.276f)
                verticalLineTo(8.247f)
                horizontalLineTo(6.098f)
                verticalLineTo(7.104f)
                lineTo(5.312f, 6.615f)
                verticalLineTo(6.39f)
                horizontalLineTo(5.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBCD17))) {
                moveTo(4.97f, 10.638f)
                curveTo(5.633f, 10.638f, 6.09f, 10.565f, 6.325f, 10.442f)
                curveTo(6.386f, 10.337f, 6.494f, 10.278f, 6.609f, 10.282f)
                curveTo(7.126f, 10.301f, 7.526f, 10.084f, 7.84f, 9.606f)
                curveTo(8.18f, 9.089f, 8.249f, 8.355f, 8.027f, 7.391f)
                lineTo(8.589f, 7.262f)
                curveTo(8.843f, 8.366f, 8.76f, 9.257f, 8.323f, 9.922f)
                curveTo(7.93f, 10.519f, 7.396f, 10.838f, 6.743f, 10.859f)
                curveTo(6.409f, 11.106f, 5.825f, 11.215f, 4.97f, 11.215f)
                curveTo(4.142f, 11.215f, 3.529f, 11.054f, 3.135f, 10.713f)
                curveTo(2.242f, 10.502f, 1.674f, 10.145f, 1.45f, 9.617f)
                curveTo(1.212f, 9.054f, 1.212f, 8.272f, 1.434f, 7.264f)
                lineTo(1.998f, 7.389f)
                curveTo(1.799f, 8.29f, 1.799f, 8.96f, 1.982f, 9.392f)
                curveTo(2.109f, 9.694f, 2.48f, 9.94f, 3.107f, 10.111f)
                lineTo(3.69f, 10.235f)
                lineTo(3.662f, 10.382f)
                curveTo(3.947f, 10.549f, 4.381f, 10.638f, 4.97f, 10.638f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.625f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.946f, 5.515f)
                lineTo(3.266f, 5.644f)
                lineTo(3.106f, 5.976f)
                lineTo(3.553f, 5.745f)
                lineTo(3.518f, 5.916f)
                lineTo(3.422f, 6.387f)
                lineTo(3.606f, 5.851f)
                verticalLineTo(6.324f)
                lineTo(3.718f, 5.851f)
                lineTo(4.05f, 5.951f)
                lineTo(3.718f, 5.745f)
                lineTo(4.05f, 5.644f)
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.556f, 6.211f)
                curveTo(3.728f, 6.211f, 3.868f, 6.071f, 3.868f, 5.898f)
                curveTo(3.868f, 5.726f, 3.728f, 5.586f, 3.556f, 5.586f)
                curveTo(3.383f, 5.586f, 3.243f, 5.726f, 3.243f, 5.898f)
                curveTo(3.243f, 6.071f, 3.383f, 6.211f, 3.556f, 6.211f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.651f, 6.171f)
                curveTo(6.646f, 5.961f, 6.622f, 5.481f, 6.516f, 5.481f)
                curveTo(6.408f, 5.481f, 6.392f, 5.966f, 6.39f, 6.174f)
                curveTo(6.205f, 6.235f, 6.066f, 6.394f, 6.066f, 6.394f)
                horizontalLineTo(6.986f)
                curveTo(6.986f, 6.394f, 6.841f, 6.228f, 6.651f, 6.171f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SintMaartenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SintMaarten,
            contentDescription = "Sint Maarten Flag"
        )
    }
}
