package flagpack.icons.medium

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
 * Vanuatu Flag (20x15dp)
 *
 * - ISO Alpha-2: VU
 * - ISO Alpha-3: VUT
 * - ISO Numeric: 548
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Vanuatu: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vanuatu:VU:VUT:548:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1.25f)
                lineTo(10.418f, 7.5f)
                lineTo(0f, 16.25f)
                verticalLineTo(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -2.097f)
                lineTo(10.88f, 6.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(10.731f)
                lineTo(0f, 16.757f)
                verticalLineTo(13.963f)
                lineTo(8.75f, 7.5f)
                lineTo(0f, 0.959f)
                verticalLineTo(-2.097f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-2f, -5.097f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(25f)
                horizontalLineToRelative(-24f)
                close()
                moveTo(0f, -2.097f)
                lineTo(10.88f, 6.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(10.731f)
                lineTo(0f, 16.757f)
                verticalLineTo(13.963f)
                lineTo(8.75f, 7.5f)
                lineTo(0f, 0.959f)
                verticalLineTo(-2.097f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(10.88f, 6.25f)
                lineTo(10.119f, 7.242f)
                lineTo(10.456f, 7.5f)
                horizontalLineTo(10.88f)
                verticalLineTo(6.25f)
                close()
                moveTo(0f, -2.097f)
                lineTo(0.761f, -3.089f)
                lineTo(-1.25f, -4.631f)
                verticalLineTo(-2.097f)
                horizontalLineTo(0f)
                close()
                moveTo(20f, 6.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(6.25f)
                close()
                moveTo(20f, 8.75f)
                verticalLineTo(10f)
                horizontalLineTo(21.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(20f)
                close()
                moveTo(10.731f, 8.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.316f)
                lineTo(9.983f, 7.748f)
                lineTo(10.731f, 8.75f)
                close()
                moveTo(0f, 16.757f)
                horizontalLineTo(-1.25f)
                verticalLineTo(19.25f)
                lineTo(0.748f, 17.759f)
                lineTo(0f, 16.757f)
                close()
                moveTo(0f, 13.963f)
                lineTo(-0.743f, 12.957f)
                lineTo(-1.25f, 13.332f)
                verticalLineTo(13.963f)
                horizontalLineTo(0f)
                close()
                moveTo(8.75f, 7.5f)
                lineTo(9.493f, 8.505f)
                lineTo(10.846f, 7.506f)
                lineTo(9.498f, 6.499f)
                lineTo(8.75f, 7.5f)
                close()
                moveTo(0f, 0.959f)
                horizontalLineTo(-1.25f)
                verticalLineTo(1.585f)
                lineTo(-0.748f, 1.96f)
                lineTo(0f, 0.959f)
                close()
                moveTo(11.641f, 5.258f)
                lineTo(0.761f, -3.089f)
                lineTo(-0.761f, -1.105f)
                lineTo(10.119f, 7.242f)
                lineTo(11.641f, 5.258f)
                close()
                moveTo(20f, 5f)
                horizontalLineTo(10.88f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                close()
                moveTo(21.25f, 8.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(18.75f)
                verticalLineTo(8.75f)
                horizontalLineTo(21.25f)
                close()
                moveTo(10.731f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(10.731f)
                verticalLineTo(10f)
                close()
                moveTo(0.748f, 17.759f)
                lineTo(11.478f, 9.752f)
                lineTo(9.983f, 7.748f)
                lineTo(-0.748f, 15.755f)
                lineTo(0.748f, 17.759f)
                close()
                moveTo(-1.25f, 13.963f)
                verticalLineTo(16.757f)
                horizontalLineTo(1.25f)
                verticalLineTo(13.963f)
                horizontalLineTo(-1.25f)
                close()
                moveTo(8.007f, 6.495f)
                lineTo(-0.743f, 12.957f)
                lineTo(0.743f, 14.968f)
                lineTo(9.493f, 8.505f)
                lineTo(8.007f, 6.495f)
                close()
                moveTo(-0.748f, 1.96f)
                lineTo(8.002f, 8.501f)
                lineTo(9.498f, 6.499f)
                lineTo(0.748f, -0.042f)
                lineTo(-0.748f, 1.96f)
                close()
                moveTo(-1.25f, -2.097f)
                verticalLineTo(0.959f)
                horizontalLineTo(1.25f)
                verticalLineTo(-2.097f)
                horizontalLineTo(-1.25f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(3.046f, 10.48f)
            lineTo(3.047f, 9.492f)
            curveTo(3.928f, 9.298f, 4.511f, 9.046f, 4.794f, 8.742f)
            curveTo(5.493f, 7.88f, 5.029f, 5.862f, 3.593f, 5.876f)
            curveTo(2.882f, 5.876f, 2.146f, 6.215f, 2.146f, 7.012f)
            curveTo(2.146f, 8.003f, 2.35f, 8.427f, 3.047f, 8.427f)
            curveTo(3.74f, 8.427f, 3.995f, 8.464f, 4.451f, 7.842f)
            lineTo(4.947f, 7.995f)
            curveTo(4.457f, 8.662f, 3.798f, 9.188f, 3.046f, 9.188f)
            curveTo(1.808f, 9.188f, 1.134f, 8.255f, 1.134f, 7.175f)
            curveTo(1.134f, 5.841f, 2.216f, 4.908f, 3.521f, 4.908f)
            curveTo(4.495f, 4.908f, 6.035f, 6.1f, 6.035f, 7.175f)
            curveTo(6.035f, 8.249f, 6.035f, 8.742f, 5.19f, 9.492f)
            curveTo(4.85f, 9.795f, 4.007f, 10.335f, 3.046f, 10.48f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.12f, 6.175f)
            curveTo(3.072f, 6.162f, 3.023f, 6.191f, 3.011f, 6.238f)
            lineTo(2.976f, 6.368f)
            curveTo(2.975f, 6.365f, 2.973f, 6.363f, 2.971f, 6.361f)
            curveTo(2.941f, 6.322f, 2.885f, 6.315f, 2.846f, 6.345f)
            curveTo(2.807f, 6.375f, 2.8f, 6.431f, 2.83f, 6.47f)
            curveTo(2.851f, 6.497f, 2.871f, 6.523f, 2.891f, 6.55f)
            lineTo(2.788f, 6.645f)
            curveTo(2.752f, 6.678f, 2.75f, 6.735f, 2.783f, 6.771f)
            curveTo(2.817f, 6.807f, 2.873f, 6.809f, 2.909f, 6.776f)
            lineTo(3f, 6.692f)
            curveTo(3.055f, 6.763f, 3.107f, 6.831f, 3.156f, 6.897f)
            lineTo(2.985f, 6.989f)
            curveTo(2.942f, 7.012f, 2.925f, 7.066f, 2.949f, 7.11f)
            curveTo(2.972f, 7.153f, 3.026f, 7.169f, 3.07f, 7.146f)
            lineTo(3.265f, 7.041f)
            curveTo(3.312f, 7.104f, 3.356f, 7.163f, 3.398f, 7.22f)
            lineTo(3.164f, 7.346f)
            curveTo(3.12f, 7.369f, 3.104f, 7.423f, 3.127f, 7.467f)
            curveTo(3.151f, 7.51f, 3.205f, 7.527f, 3.248f, 7.503f)
            lineTo(3.505f, 7.365f)
            curveTo(3.574f, 7.459f, 3.634f, 7.542f, 3.685f, 7.615f)
            lineTo(3.521f, 7.703f)
            curveTo(3.477f, 7.726f, 3.461f, 7.78f, 3.484f, 7.824f)
            curveTo(3.508f, 7.867f, 3.562f, 7.884f, 3.605f, 7.86f)
            lineTo(3.787f, 7.763f)
            curveTo(3.863f, 7.875f, 3.902f, 7.943f, 3.902f, 7.961f)
            curveTo(3.902f, 8.01f, 3.942f, 8.05f, 3.991f, 8.05f)
            curveTo(4.04f, 8.05f, 4.08f, 8.01f, 4.08f, 7.961f)
            curveTo(4.08f, 7.916f, 4.033f, 7.82f, 3.935f, 7.668f)
            curveTo(3.936f, 7.666f, 3.938f, 7.663f, 3.939f, 7.661f)
            lineTo(4.071f, 7.37f)
            curveTo(4.091f, 7.325f, 4.072f, 7.272f, 4.027f, 7.251f)
            curveTo(3.982f, 7.231f, 3.929f, 7.251f, 3.908f, 7.296f)
            lineTo(3.818f, 7.494f)
            curveTo(3.762f, 7.413f, 3.696f, 7.321f, 3.62f, 7.218f)
            lineTo(3.714f, 7.012f)
            curveTo(3.734f, 6.968f, 3.714f, 6.915f, 3.669f, 6.894f)
            curveTo(3.625f, 6.874f, 3.572f, 6.894f, 3.551f, 6.939f)
            lineTo(3.499f, 7.054f)
            curveTo(3.47f, 7.015f, 3.44f, 6.975f, 3.409f, 6.934f)
            lineTo(3.535f, 6.655f)
            curveTo(3.556f, 6.61f, 3.536f, 6.557f, 3.491f, 6.537f)
            curveTo(3.446f, 6.517f, 3.393f, 6.537f, 3.373f, 6.581f)
            lineTo(3.286f, 6.772f)
            curveTo(3.232f, 6.7f, 3.174f, 6.625f, 3.114f, 6.546f)
            lineTo(3.183f, 6.284f)
            curveTo(3.196f, 6.236f, 3.167f, 6.188f, 3.12f, 6.175f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.72f, 6.175f)
            curveTo(3.768f, 6.162f, 3.817f, 6.191f, 3.829f, 6.238f)
            lineTo(3.863f, 6.368f)
            curveTo(3.865f, 6.365f, 3.867f, 6.363f, 3.869f, 6.361f)
            curveTo(3.899f, 6.322f, 3.955f, 6.315f, 3.994f, 6.345f)
            curveTo(4.033f, 6.375f, 4.04f, 6.431f, 4.01f, 6.47f)
            curveTo(3.989f, 6.497f, 3.969f, 6.523f, 3.949f, 6.55f)
            lineTo(4.051f, 6.645f)
            curveTo(4.088f, 6.678f, 4.09f, 6.735f, 4.057f, 6.771f)
            curveTo(4.023f, 6.807f, 3.967f, 6.809f, 3.93f, 6.776f)
            lineTo(3.839f, 6.692f)
            curveTo(3.785f, 6.763f, 3.733f, 6.831f, 3.683f, 6.897f)
            lineTo(3.855f, 6.989f)
            curveTo(3.898f, 7.012f, 3.914f, 7.066f, 3.891f, 7.11f)
            curveTo(3.868f, 7.153f, 3.814f, 7.169f, 3.77f, 7.146f)
            lineTo(3.575f, 7.041f)
            curveTo(3.528f, 7.104f, 3.483f, 7.163f, 3.441f, 7.22f)
            lineTo(3.676f, 7.346f)
            curveTo(3.719f, 7.369f, 3.736f, 7.423f, 3.712f, 7.467f)
            curveTo(3.689f, 7.51f, 3.635f, 7.527f, 3.592f, 7.503f)
            lineTo(3.334f, 7.365f)
            curveTo(3.266f, 7.459f, 3.206f, 7.542f, 3.155f, 7.615f)
            lineTo(3.319f, 7.703f)
            curveTo(3.362f, 7.726f, 3.379f, 7.78f, 3.355f, 7.824f)
            curveTo(3.332f, 7.867f, 3.278f, 7.884f, 3.234f, 7.86f)
            lineTo(3.053f, 7.763f)
            curveTo(2.977f, 7.875f, 2.938f, 7.943f, 2.938f, 7.961f)
            curveTo(2.938f, 8.01f, 2.898f, 8.05f, 2.849f, 8.05f)
            curveTo(2.8f, 8.05f, 2.76f, 8.01f, 2.76f, 7.961f)
            curveTo(2.76f, 7.916f, 2.807f, 7.82f, 2.905f, 7.668f)
            curveTo(2.903f, 7.666f, 2.902f, 7.663f, 2.901f, 7.661f)
            lineTo(2.769f, 7.37f)
            curveTo(2.748f, 7.325f, 2.768f, 7.272f, 2.813f, 7.251f)
            curveTo(2.858f, 7.231f, 2.911f, 7.251f, 2.931f, 7.296f)
            lineTo(3.022f, 7.494f)
            curveTo(3.078f, 7.413f, 3.144f, 7.321f, 3.219f, 7.218f)
            lineTo(3.126f, 7.012f)
            curveTo(3.106f, 6.968f, 3.125f, 6.915f, 3.17f, 6.894f)
            curveTo(3.215f, 6.874f, 3.268f, 6.894f, 3.288f, 6.939f)
            lineTo(3.341f, 7.054f)
            curveTo(3.37f, 7.015f, 3.4f, 6.975f, 3.431f, 6.934f)
            lineTo(3.304f, 6.655f)
            curveTo(3.284f, 6.61f, 3.304f, 6.557f, 3.349f, 6.537f)
            curveTo(3.394f, 6.517f, 3.447f, 6.537f, 3.467f, 6.581f)
            lineTo(3.554f, 6.772f)
            curveTo(3.608f, 6.7f, 3.665f, 6.625f, 3.726f, 6.546f)
            lineTo(3.657f, 6.284f)
            curveTo(3.644f, 6.236f, 3.672f, 6.188f, 3.72f, 6.175f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VanuatuPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Vanuatu,
            contentDescription = "Vanuatu Flag"
        )
    }
}
