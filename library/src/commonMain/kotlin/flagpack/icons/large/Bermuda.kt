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
 * Bermuda Flag (32x24dp)
 *
 * - ISO Alpha-2: BM
 * - ISO Alpha-3: BMU
 * - ISO Numeric: 060
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Bermuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bermuda:BM:BMU:060:Large",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.03f, 11.043f)
                lineTo(29.919f, 11.043f)
                verticalLineTo(20.033f)
                curveTo(29.919f, 20.033f, 29.643f, 21.27f, 27.931f, 22.087f)
                curveTo(26.221f, 22.905f, 25.474f, 22.905f, 25.474f, 22.905f)
                curveTo(25.474f, 22.905f, 22.749f, 22.235f, 22.185f, 21.608f)
                curveTo(21.622f, 20.981f, 21.03f, 20.749f, 21.03f, 19.653f)
                curveTo(21.03f, 18.556f, 21.03f, 11.043f, 21.03f, 11.043f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(21.03f, 11.043f)
                lineTo(29.919f, 11.043f)
                verticalLineTo(20.033f)
                curveTo(29.919f, 20.033f, 29.643f, 21.27f, 27.931f, 22.087f)
                curveTo(26.221f, 22.905f, 25.474f, 22.905f, 25.474f, 22.905f)
                curveTo(25.474f, 22.905f, 22.749f, 22.235f, 22.185f, 21.608f)
                curveTo(21.622f, 20.981f, 21.03f, 20.749f, 21.03f, 19.653f)
                curveTo(21.03f, 18.556f, 21.03f, 11.043f, 21.03f, 11.043f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFCF142B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(25.455f, 11.57f)
                curveTo(25.489f, 11.522f, 25.506f, 11.476f, 25.506f, 11.476f)
                lineTo(25.503f, 11.626f)
                curveTo(25.535f, 11.656f, 25.574f, 11.678f, 25.62f, 11.678f)
                lineTo(25.817f, 11.561f)
                curveTo(25.817f, 11.561f, 25.772f, 11.819f, 25.831f, 11.812f)
                curveTo(25.831f, 11.812f, 26.015f, 11.69f, 26.088f, 11.756f)
                curveTo(26.088f, 11.756f, 25.874f, 12.001f, 26.131f, 12.002f)
                curveTo(26.131f, 12.002f, 26.455f, 11.95f, 26.427f, 12.101f)
                curveTo(26.427f, 12.101f, 26.184f, 12.546f, 26.286f, 12.574f)
                lineTo(26.687f, 12.563f)
                curveTo(26.687f, 12.563f, 26.418f, 12.796f, 26.426f, 12.894f)
                lineTo(26.559f, 12.999f)
                curveTo(26.559f, 12.999f, 26.634f, 12.815f, 26.697f, 12.966f)
                curveTo(26.697f, 12.966f, 26.706f, 13.24f, 26.664f, 13.24f)
                lineTo(26.308f, 13.354f)
                curveTo(26.308f, 13.354f, 26.285f, 13.488f, 26.412f, 13.488f)
                curveTo(26.412f, 13.488f, 26.706f, 13.363f, 26.715f, 13.49f)
                curveTo(26.715f, 13.49f, 26.676f, 13.636f, 26.659f, 13.76f)
                curveTo(26.659f, 13.76f, 26.64f, 14.208f, 26.637f, 14.247f)
                curveTo(26.637f, 14.247f, 26.661f, 14.23f, 26.885f, 14.494f)
                curveTo(26.885f, 14.494f, 27.45f, 14.852f, 27.554f, 14.769f)
                curveTo(27.582f, 14.747f, 27.601f, 14.7f, 27.622f, 14.648f)
                curveTo(27.678f, 14.51f, 27.75f, 14.33f, 28.063f, 14.427f)
                lineTo(28.066f, 14.428f)
                curveTo(28.495f, 14.561f, 28.6f, 14.594f, 28.491f, 14.769f)
                curveTo(28.382f, 14.946f, 27.969f, 15.365f, 27.969f, 15.365f)
                lineTo(27.61f, 16.803f)
                horizontalLineTo(28.378f)
                curveTo(28.61f, 16.803f, 28.822f, 16.893f, 28.863f, 17.085f)
                curveTo(28.904f, 17.277f, 28.915f, 17.651f, 28.915f, 17.695f)
                curveTo(28.915f, 17.701f, 28.914f, 17.709f, 28.913f, 17.719f)
                curveTo(28.905f, 17.782f, 28.891f, 17.905f, 29.074f, 17.905f)
                curveTo(29.074f, 17.905f, 29.441f, 17.953f, 29.365f, 17.979f)
                curveTo(29.365f, 17.979f, 29.105f, 17.929f, 29.103f, 18.158f)
                curveTo(29.103f, 18.158f, 29.003f, 18.188f, 29.052f, 18.471f)
                curveTo(29.052f, 18.471f, 29.253f, 19.09f, 29.119f, 18.963f)
                curveTo(29.119f, 18.963f, 28.845f, 18.641f, 28.845f, 18.503f)
                curveTo(28.845f, 18.503f, 28.649f, 18.581f, 28.655f, 18.782f)
                curveTo(28.655f, 18.782f, 28.47f, 19.031f, 28.475f, 18.788f)
                curveTo(28.475f, 18.788f, 28.789f, 18.192f, 28.614f, 18.327f)
                curveTo(28.614f, 18.327f, 28.386f, 18.819f, 28.357f, 18.745f)
                lineTo(27.513f, 18.516f)
                lineTo(27.191f, 19.931f)
                curveTo(27.191f, 19.931f, 27.277f, 20.197f, 27.513f, 20.197f)
                curveTo(27.598f, 20.197f, 27.674f, 20.163f, 27.743f, 20.133f)
                curveTo(27.865f, 20.079f, 27.966f, 20.035f, 28.063f, 20.197f)
                curveTo(28.214f, 20.451f, 28.281f, 20.474f, 28.357f, 20.474f)
                curveTo(28.431f, 20.474f, 28.519f, 20.572f, 28.475f, 20.721f)
                curveTo(28.431f, 20.87f, 28.235f, 20.982f, 28.149f, 20.982f)
                curveTo(28.117f, 20.982f, 28.125f, 21.009f, 28.136f, 21.043f)
                curveTo(28.154f, 21.101f, 28.179f, 21.181f, 28.019f, 21.181f)
                curveTo(27.892f, 21.181f, 27.828f, 21.165f, 27.765f, 21.15f)
                curveTo(27.702f, 21.135f, 27.638f, 21.12f, 27.513f, 21.12f)
                curveTo(27.483f, 21.12f, 27.454f, 21.12f, 27.425f, 21.121f)
                curveTo(27.208f, 21.123f, 27.024f, 21.125f, 27.024f, 20.982f)
                curveTo(27.024f, 20.843f, 26.857f, 20.72f, 26.709f, 20.611f)
                curveTo(26.684f, 20.593f, 26.66f, 20.575f, 26.637f, 20.557f)
                curveTo(26.478f, 20.435f, 26.131f, 19.059f, 26.131f, 19.059f)
                lineTo(25.475f, 14.926f)
                lineTo(25.455f, 13.967f)
                lineTo(25.436f, 14.926f)
                lineTo(24.78f, 19.059f)
                curveTo(24.78f, 19.059f, 24.433f, 20.435f, 24.274f, 20.557f)
                curveTo(24.251f, 20.575f, 24.226f, 20.593f, 24.202f, 20.611f)
                curveTo(24.054f, 20.72f, 23.887f, 20.843f, 23.887f, 20.982f)
                curveTo(23.887f, 21.125f, 23.703f, 21.123f, 23.486f, 21.121f)
                curveTo(23.457f, 21.12f, 23.428f, 21.12f, 23.398f, 21.12f)
                curveTo(23.272f, 21.12f, 23.209f, 21.135f, 23.146f, 21.15f)
                curveTo(23.083f, 21.165f, 23.019f, 21.181f, 22.892f, 21.181f)
                curveTo(22.732f, 21.181f, 22.757f, 21.101f, 22.775f, 21.043f)
                curveTo(22.785f, 21.009f, 22.794f, 20.982f, 22.762f, 20.982f)
                curveTo(22.676f, 20.982f, 22.479f, 20.87f, 22.436f, 20.721f)
                curveTo(22.392f, 20.572f, 22.479f, 20.474f, 22.554f, 20.474f)
                curveTo(22.629f, 20.474f, 22.697f, 20.451f, 22.848f, 20.197f)
                curveTo(22.945f, 20.035f, 23.046f, 20.079f, 23.168f, 20.133f)
                curveTo(23.237f, 20.163f, 23.313f, 20.197f, 23.398f, 20.197f)
                curveTo(23.634f, 20.197f, 23.72f, 19.931f, 23.72f, 19.931f)
                lineTo(23.398f, 18.516f)
                lineTo(22.554f, 18.745f)
                curveTo(22.524f, 18.819f, 22.297f, 18.327f, 22.297f, 18.327f)
                curveTo(22.121f, 18.192f, 22.436f, 18.788f, 22.436f, 18.788f)
                curveTo(22.441f, 19.031f, 22.256f, 18.782f, 22.256f, 18.782f)
                curveTo(22.262f, 18.581f, 22.066f, 18.503f, 22.066f, 18.503f)
                curveTo(22.066f, 18.641f, 21.791f, 18.963f, 21.791f, 18.963f)
                curveTo(21.657f, 19.09f, 21.859f, 18.471f, 21.859f, 18.471f)
                curveTo(21.908f, 18.188f, 21.808f, 18.158f, 21.808f, 18.158f)
                curveTo(21.806f, 17.929f, 21.545f, 17.979f, 21.545f, 17.979f)
                curveTo(21.469f, 17.953f, 21.837f, 17.905f, 21.837f, 17.905f)
                curveTo(22.02f, 17.905f, 22.006f, 17.782f, 21.998f, 17.719f)
                curveTo(21.997f, 17.709f, 21.996f, 17.701f, 21.996f, 17.695f)
                curveTo(21.996f, 17.651f, 22.007f, 17.277f, 22.048f, 17.085f)
                curveTo(22.088f, 16.893f, 22.301f, 16.803f, 22.533f, 16.803f)
                horizontalLineTo(23.301f)
                lineTo(22.942f, 15.365f)
                curveTo(22.942f, 15.365f, 22.529f, 14.946f, 22.42f, 14.769f)
                curveTo(22.311f, 14.594f, 22.416f, 14.561f, 22.845f, 14.428f)
                lineTo(22.848f, 14.427f)
                curveTo(23.161f, 14.33f, 23.233f, 14.51f, 23.289f, 14.648f)
                curveTo(23.31f, 14.7f, 23.328f, 14.747f, 23.357f, 14.769f)
                curveTo(23.461f, 14.852f, 24.026f, 14.494f, 24.026f, 14.494f)
                curveTo(24.25f, 14.23f, 24.274f, 14.247f, 24.274f, 14.247f)
                curveTo(24.271f, 14.208f, 24.252f, 13.76f, 24.252f, 13.76f)
                curveTo(24.235f, 13.636f, 24.196f, 13.49f, 24.196f, 13.49f)
                curveTo(24.204f, 13.363f, 24.499f, 13.488f, 24.499f, 13.488f)
                curveTo(24.626f, 13.488f, 24.603f, 13.354f, 24.603f, 13.354f)
                lineTo(24.247f, 13.24f)
                curveTo(24.205f, 13.24f, 24.213f, 12.966f, 24.213f, 12.966f)
                curveTo(24.277f, 12.815f, 24.352f, 12.999f, 24.352f, 12.999f)
                lineTo(24.485f, 12.894f)
                curveTo(24.492f, 12.796f, 24.224f, 12.563f, 24.224f, 12.563f)
                lineTo(24.625f, 12.574f)
                curveTo(24.726f, 12.546f, 24.484f, 12.101f, 24.484f, 12.101f)
                curveTo(24.456f, 11.95f, 24.78f, 12.002f, 24.78f, 12.002f)
                curveTo(25.037f, 12.001f, 24.823f, 11.756f, 24.823f, 11.756f)
                curveTo(24.896f, 11.69f, 25.08f, 11.812f, 25.08f, 11.812f)
                curveTo(25.139f, 11.819f, 25.094f, 11.561f, 25.094f, 11.561f)
                lineTo(25.291f, 11.678f)
                curveTo(25.337f, 11.678f, 25.376f, 11.656f, 25.408f, 11.626f)
                lineTo(25.405f, 11.476f)
                curveTo(25.405f, 11.476f, 25.422f, 11.522f, 25.455f, 11.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5DC852)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.222f, 20f)
                lineTo(20.895f, 19.679f)
                verticalLineTo(23.321f)
                horizontalLineTo(24.767f)
                horizontalLineTo(26.128f)
                horizontalLineTo(30f)
                verticalLineTo(19.679f)
                lineTo(29.673f, 20f)
                curveTo(29.722f, 19.616f, 29.648f, 19.739f, 29.559f, 19.887f)
                curveTo(29.517f, 19.957f, 29.472f, 20.032f, 29.435f, 20.062f)
                curveTo(29.4f, 20.089f, 29.392f, 19.977f, 29.385f, 19.867f)
                curveTo(29.378f, 19.77f, 29.371f, 19.674f, 29.346f, 19.679f)
                curveTo(29.346f, 19.679f, 29.247f, 19.521f, 29.186f, 19.58f)
                curveTo(29.174f, 19.592f, 29.165f, 19.68f, 29.155f, 19.78f)
                curveTo(29.143f, 19.887f, 29.131f, 20.008f, 29.112f, 20.062f)
                curveTo(29.089f, 20.124f, 29.019f, 20f, 29.019f, 20f)
                curveTo(29.019f, 20f, 29.022f, 19.533f, 28.951f, 19.463f)
                curveTo(28.879f, 19.393f, 28.872f, 20f, 28.872f, 20f)
                curveTo(28.872f, 20f, 28.763f, 19.55f, 28.652f, 19.58f)
                curveTo(28.634f, 19.586f, 28.624f, 19.703f, 28.614f, 19.83f)
                curveTo(28.604f, 19.953f, 28.593f, 20.084f, 28.572f, 20.129f)
                curveTo(28.531f, 20.22f, 28.433f, 19.58f, 28.433f, 19.58f)
                curveTo(28.433f, 19.58f, 28.404f, 20.105f, 28.306f, 20.129f)
                curveTo(28.29f, 20.133f, 28.274f, 20.048f, 28.258f, 19.955f)
                curveTo(28.242f, 19.865f, 28.224f, 19.767f, 28.203f, 19.731f)
                curveTo(28.158f, 19.656f, 27.944f, 19.949f, 27.944f, 19.949f)
                lineTo(27.795f, 19.345f)
                lineTo(27.384f, 19.679f)
                horizontalLineTo(26.128f)
                horizontalLineTo(24.767f)
                horizontalLineTo(23.512f)
                lineTo(23.1f, 19.345f)
                lineTo(22.951f, 19.949f)
                curveTo(22.951f, 19.949f, 22.738f, 19.656f, 22.692f, 19.731f)
                curveTo(22.671f, 19.767f, 22.654f, 19.865f, 22.638f, 19.955f)
                curveTo(22.621f, 20.048f, 22.606f, 20.133f, 22.59f, 20.129f)
                curveTo(22.492f, 20.105f, 22.463f, 19.58f, 22.463f, 19.58f)
                curveTo(22.463f, 19.58f, 22.365f, 20.22f, 22.323f, 20.129f)
                curveTo(22.303f, 20.084f, 22.292f, 19.953f, 22.282f, 19.83f)
                curveTo(22.271f, 19.703f, 22.262f, 19.586f, 22.243f, 19.58f)
                curveTo(22.133f, 19.55f, 22.023f, 20f, 22.023f, 20f)
                curveTo(22.023f, 20f, 22.016f, 19.393f, 21.944f, 19.463f)
                curveTo(21.873f, 19.533f, 21.876f, 20f, 21.876f, 20f)
                curveTo(21.876f, 20f, 21.806f, 20.124f, 21.784f, 20.062f)
                curveTo(21.764f, 20.008f, 21.752f, 19.887f, 21.741f, 19.78f)
                curveTo(21.73f, 19.68f, 21.722f, 19.592f, 21.709f, 19.58f)
                curveTo(21.649f, 19.521f, 21.549f, 19.679f, 21.549f, 19.679f)
                curveTo(21.524f, 19.674f, 21.518f, 19.77f, 21.511f, 19.867f)
                curveTo(21.503f, 19.977f, 21.495f, 20.089f, 21.46f, 20.062f)
                curveTo(21.424f, 20.032f, 21.378f, 19.957f, 21.336f, 19.887f)
                curveTo(21.248f, 19.739f, 21.173f, 19.616f, 21.222f, 20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4ABCE6)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(28.18f, 14.94f)
                curveTo(28.18f, 14.94f, 28.223f, 15.05f, 28.18f, 15.159f)
                verticalLineTo(14.94f)
                close()
                moveTo(25.486f, 14.763f)
                curveTo(25.56f, 14.774f, 25.626f, 14.792f, 25.682f, 14.807f)
                curveTo(25.814f, 14.842f, 25.893f, 14.864f, 25.893f, 14.752f)
                curveTo(25.893f, 14.67f, 26.11f, 14.776f, 26.408f, 14.922f)
                curveTo(26.796f, 15.111f, 27.324f, 15.369f, 27.694f, 15.369f)
                curveTo(28.016f, 15.369f, 28.139f, 15.265f, 28.18f, 15.159f)
                verticalLineTo(15.584f)
                curveTo(28.18f, 15.66f, 28.197f, 15.75f, 28.213f, 15.835f)
                curveTo(28.242f, 15.99f, 28.267f, 16.128f, 28.18f, 16.128f)
                curveTo(28.046f, 16.128f, 27.446f, 16.55f, 27.446f, 17.037f)
                curveTo(27.446f, 17.523f, 28.18f, 17.923f, 28.18f, 17.923f)
                curveTo(28.18f, 17.923f, 27.694f, 19.635f, 27.268f, 19.896f)
                curveTo(27.01f, 20.055f, 26.857f, 19.925f, 26.776f, 19.857f)
                curveTo(26.724f, 19.812f, 26.702f, 19.794f, 26.702f, 19.896f)
                curveTo(26.702f, 20.158f, 26.333f, 20.527f, 25.893f, 20.673f)
                curveTo(25.609f, 20.767f, 25.692f, 20.839f, 25.787f, 20.921f)
                curveTo(25.838f, 20.966f, 25.893f, 21.013f, 25.893f, 21.069f)
                curveTo(25.893f, 21.195f, 25.546f, 21.019f, 25.407f, 20.943f)
                curveTo(25.268f, 21.019f, 24.921f, 21.195f, 24.921f, 21.069f)
                curveTo(24.921f, 21.013f, 24.976f, 20.966f, 25.027f, 20.921f)
                curveTo(25.122f, 20.839f, 25.205f, 20.767f, 24.921f, 20.673f)
                curveTo(24.481f, 20.527f, 24.112f, 20.158f, 24.112f, 19.896f)
                curveTo(24.112f, 19.794f, 24.09f, 19.812f, 24.038f, 19.857f)
                curveTo(23.957f, 19.925f, 23.804f, 20.055f, 23.546f, 19.896f)
                curveTo(23.12f, 19.635f, 22.634f, 17.923f, 22.634f, 17.923f)
                curveTo(22.634f, 17.923f, 23.368f, 17.523f, 23.368f, 17.037f)
                curveTo(23.368f, 16.55f, 22.768f, 16.128f, 22.634f, 16.128f)
                curveTo(22.547f, 16.128f, 22.572f, 15.99f, 22.601f, 15.835f)
                curveTo(22.617f, 15.75f, 22.634f, 15.66f, 22.634f, 15.584f)
                verticalLineTo(15.159f)
                curveTo(22.675f, 15.265f, 22.798f, 15.369f, 23.12f, 15.369f)
                curveTo(23.49f, 15.369f, 24.018f, 15.111f, 24.406f, 14.922f)
                curveTo(24.704f, 14.776f, 24.921f, 14.67f, 24.921f, 14.752f)
                curveTo(24.921f, 14.864f, 25f, 14.842f, 25.132f, 14.807f)
                curveTo(25.188f, 14.792f, 25.254f, 14.774f, 25.328f, 14.763f)
                curveTo(25.335f, 14.756f, 25.343f, 14.752f, 25.35f, 14.752f)
                curveTo(25.369f, 14.752f, 25.388f, 14.753f, 25.407f, 14.754f)
                curveTo(25.426f, 14.753f, 25.444f, 14.752f, 25.464f, 14.752f)
                curveTo(25.472f, 14.752f, 25.479f, 14.756f, 25.486f, 14.763f)
                close()
                moveTo(22.634f, 14.94f)
                curveTo(22.634f, 14.94f, 22.591f, 15.05f, 22.634f, 15.159f)
                verticalLineTo(14.94f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(28.18f, 14.94f)
                curveTo(28.18f, 14.94f, 28.223f, 15.05f, 28.18f, 15.159f)
                verticalLineTo(14.94f)
                close()
                moveTo(25.486f, 14.763f)
                curveTo(25.56f, 14.774f, 25.626f, 14.792f, 25.682f, 14.807f)
                curveTo(25.814f, 14.842f, 25.893f, 14.864f, 25.893f, 14.752f)
                curveTo(25.893f, 14.67f, 26.11f, 14.776f, 26.408f, 14.922f)
                curveTo(26.796f, 15.111f, 27.324f, 15.369f, 27.694f, 15.369f)
                curveTo(28.016f, 15.369f, 28.139f, 15.265f, 28.18f, 15.159f)
                verticalLineTo(15.584f)
                curveTo(28.18f, 15.66f, 28.197f, 15.75f, 28.213f, 15.835f)
                curveTo(28.242f, 15.99f, 28.267f, 16.128f, 28.18f, 16.128f)
                curveTo(28.046f, 16.128f, 27.446f, 16.55f, 27.446f, 17.037f)
                curveTo(27.446f, 17.523f, 28.18f, 17.923f, 28.18f, 17.923f)
                curveTo(28.18f, 17.923f, 27.694f, 19.635f, 27.268f, 19.896f)
                curveTo(27.01f, 20.055f, 26.857f, 19.925f, 26.776f, 19.857f)
                curveTo(26.724f, 19.812f, 26.702f, 19.794f, 26.702f, 19.896f)
                curveTo(26.702f, 20.158f, 26.333f, 20.527f, 25.893f, 20.673f)
                curveTo(25.609f, 20.767f, 25.692f, 20.839f, 25.787f, 20.921f)
                curveTo(25.838f, 20.966f, 25.893f, 21.013f, 25.893f, 21.069f)
                curveTo(25.893f, 21.195f, 25.546f, 21.019f, 25.407f, 20.943f)
                curveTo(25.268f, 21.019f, 24.921f, 21.195f, 24.921f, 21.069f)
                curveTo(24.921f, 21.013f, 24.976f, 20.966f, 25.027f, 20.921f)
                curveTo(25.122f, 20.839f, 25.205f, 20.767f, 24.921f, 20.673f)
                curveTo(24.481f, 20.527f, 24.112f, 20.158f, 24.112f, 19.896f)
                curveTo(24.112f, 19.794f, 24.09f, 19.812f, 24.038f, 19.857f)
                curveTo(23.957f, 19.925f, 23.804f, 20.055f, 23.546f, 19.896f)
                curveTo(23.12f, 19.635f, 22.634f, 17.923f, 22.634f, 17.923f)
                curveTo(22.634f, 17.923f, 23.368f, 17.523f, 23.368f, 17.037f)
                curveTo(23.368f, 16.55f, 22.768f, 16.128f, 22.634f, 16.128f)
                curveTo(22.547f, 16.128f, 22.572f, 15.99f, 22.601f, 15.835f)
                curveTo(22.617f, 15.75f, 22.634f, 15.66f, 22.634f, 15.584f)
                verticalLineTo(15.159f)
                curveTo(22.675f, 15.265f, 22.798f, 15.369f, 23.12f, 15.369f)
                curveTo(23.49f, 15.369f, 24.018f, 15.111f, 24.406f, 14.922f)
                curveTo(24.704f, 14.776f, 24.921f, 14.67f, 24.921f, 14.752f)
                curveTo(24.921f, 14.864f, 25f, 14.842f, 25.132f, 14.807f)
                curveTo(25.188f, 14.792f, 25.254f, 14.774f, 25.328f, 14.763f)
                curveTo(25.335f, 14.756f, 25.343f, 14.752f, 25.35f, 14.752f)
                curveTo(25.369f, 14.752f, 25.388f, 14.753f, 25.407f, 14.754f)
                curveTo(25.426f, 14.753f, 25.444f, 14.752f, 25.464f, 14.752f)
                curveTo(25.472f, 14.752f, 25.479f, 14.756f, 25.486f, 14.763f)
                close()
                moveTo(22.634f, 14.94f)
                curveTo(22.634f, 14.94f, 22.591f, 15.05f, 22.634f, 15.159f)
                verticalLineTo(14.94f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.465f, 16.893f)
                curveTo(22.465f, 16.893f, 24.652f, 16.66f, 25.936f, 16.66f)
                curveTo(27.22f, 16.66f, 26.529f, 16.739f, 27.023f, 16.794f)
                curveTo(27.516f, 16.85f, 28.012f, 16.893f, 28.012f, 16.893f)
                verticalLineTo(21.286f)
                horizontalLineTo(22.465f)
                verticalLineTo(16.893f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDA3A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.985f, 16.273f)
                curveTo(22.985f, 16.273f, 22.806f, 15.923f, 23.531f, 15.797f)
                curveTo(24.256f, 15.672f, 24.48f, 15.619f, 24.755f, 15.946f)
                curveTo(25.03f, 16.273f, 25.588f, 17.679f, 25.172f, 18.057f)
                curveTo(24.755f, 18.435f, 24.465f, 18.833f, 24.3f, 18.694f)
                curveTo(24.135f, 18.556f, 24.488f, 18.057f, 23.616f, 18.057f)
                curveTo(22.745f, 18.057f, 22.447f, 18.057f, 22.447f, 18.057f)
                lineTo(22.985f, 16.273f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB35A1F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(26.657f, 16.612f)
                lineTo(25.094f, 17.091f)
                curveTo(25.094f, 17.091f, 25.236f, 18.158f, 24.833f, 18.158f)
                curveTo(24.43f, 18.158f, 24.258f, 15.849f, 24.258f, 15.849f)
                horizontalLineTo(24.092f)
                lineTo(24.623f, 18.389f)
                lineTo(24.258f, 18.625f)
                lineTo(25.375f, 19.121f)
                lineTo(27.267f, 18.158f)
                lineTo(26.657f, 16.612f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFD129)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(24.406f, 14.922f)
            curveTo(24.018f, 15.111f, 23.49f, 15.369f, 23.12f, 15.369f)
            curveTo(22.862f, 15.369f, 22.7f, 15.319f, 22.634f, 15.218f)
            verticalLineTo(15.584f)
            curveTo(22.634f, 15.66f, 22.617f, 15.75f, 22.601f, 15.835f)
            curveTo(22.572f, 15.99f, 22.547f, 16.128f, 22.634f, 16.128f)
            curveTo(22.768f, 16.128f, 23.368f, 16.55f, 23.368f, 17.037f)
            curveTo(23.368f, 17.361f, 23.123f, 17.656f, 22.634f, 17.923f)
            curveTo(22.958f, 19.064f, 23.262f, 19.722f, 23.546f, 19.896f)
            curveTo(23.774f, 20.037f, 23.92f, 19.951f, 24.011f, 19.879f)
            curveTo(24.021f, 19.871f, 24.03f, 19.864f, 24.038f, 19.857f)
            curveTo(24.09f, 19.812f, 24.112f, 19.794f, 24.112f, 19.896f)
            curveTo(24.112f, 19.906f, 24.112f, 19.916f, 24.114f, 19.931f)
            curveTo(24.144f, 20.19f, 24.5f, 20.533f, 24.921f, 20.673f)
            curveTo(25.205f, 20.767f, 25.122f, 20.839f, 25.027f, 20.921f)
            curveTo(24.976f, 20.966f, 24.921f, 21.013f, 24.921f, 21.069f)
            curveTo(24.921f, 21.168f, 25.083f, 21.127f, 25.407f, 20.944f)
            curveTo(25.731f, 21.127f, 25.893f, 21.168f, 25.893f, 21.069f)
            curveTo(25.893f, 21.013f, 25.838f, 20.966f, 25.787f, 20.921f)
            curveTo(25.692f, 20.839f, 25.609f, 20.767f, 25.893f, 20.673f)
            curveTo(26.314f, 20.533f, 26.67f, 20.19f, 26.701f, 19.925f)
            curveTo(26.702f, 19.916f, 26.702f, 19.906f, 26.702f, 19.896f)
            curveTo(26.702f, 19.794f, 26.724f, 19.812f, 26.779f, 19.858f)
            curveTo(26.787f, 19.866f, 26.797f, 19.874f, 26.807f, 19.882f)
            curveTo(26.894f, 19.951f, 27.04f, 20.037f, 27.268f, 19.896f)
            curveTo(27.552f, 19.722f, 27.856f, 19.064f, 28.18f, 17.923f)
            curveTo(27.691f, 17.656f, 27.446f, 17.361f, 27.446f, 17.037f)
            curveTo(27.446f, 16.55f, 28.046f, 16.128f, 28.18f, 16.128f)
            curveTo(28.267f, 16.128f, 28.242f, 15.99f, 28.213f, 15.835f)
            curveTo(28.197f, 15.75f, 28.18f, 15.66f, 28.18f, 15.584f)
            verticalLineTo(15.218f)
            curveTo(28.226f, 15.149f, 28.226f, 15.056f, 28.18f, 14.94f)
            verticalLineTo(15.218f)
            curveTo(28.114f, 15.319f, 27.952f, 15.369f, 27.694f, 15.369f)
            curveTo(27.324f, 15.369f, 26.796f, 15.111f, 26.408f, 14.922f)
            curveTo(26.11f, 14.776f, 25.893f, 14.67f, 25.893f, 14.752f)
            curveTo(25.893f, 14.864f, 25.814f, 14.842f, 25.682f, 14.807f)
            curveTo(25.627f, 14.792f, 25.562f, 14.774f, 25.49f, 14.763f)
            curveTo(25.482f, 14.756f, 25.473f, 14.752f, 25.464f, 14.752f)
            curveTo(25.444f, 14.752f, 25.426f, 14.753f, 25.407f, 14.754f)
            curveTo(25.388f, 14.753f, 25.369f, 14.752f, 25.35f, 14.752f)
            curveTo(25.341f, 14.752f, 25.332f, 14.756f, 25.324f, 14.763f)
            curveTo(25.252f, 14.774f, 25.187f, 14.792f, 25.132f, 14.807f)
            curveTo(25f, 14.842f, 24.921f, 14.864f, 24.921f, 14.752f)
            curveTo(24.921f, 14.67f, 24.704f, 14.776f, 24.406f, 14.922f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(29.919f, 11.043f)
            horizontalLineTo(21.03f)
            verticalLineTo(19.653f)
            curveTo(21.03f, 20.498f, 21.382f, 20.829f, 21.801f, 21.224f)
            curveTo(21.926f, 21.341f, 22.056f, 21.464f, 22.185f, 21.608f)
            curveTo(22.561f, 22.026f, 23.657f, 22.458f, 25.474f, 22.905f)
            curveTo(25.972f, 22.905f, 26.791f, 22.632f, 27.931f, 22.087f)
            curveTo(29.072f, 21.543f, 29.735f, 20.858f, 29.919f, 20.033f)
            verticalLineTo(11.043f)
            close()
            moveTo(21.809f, 20.94f)
            curveTo(21.39f, 20.534f, 21.239f, 20.239f, 21.239f, 19.653f)
            verticalLineTo(11.257f)
            horizontalLineTo(29.709f)
            verticalLineTo(20.008f)
            curveTo(29.534f, 20.749f, 28.919f, 21.379f, 27.843f, 21.893f)
            curveTo(26.748f, 22.416f, 25.96f, 22.681f, 25.498f, 22.69f)
            curveTo(23.738f, 22.256f, 22.674f, 21.836f, 22.339f, 21.463f)
            curveTo(22.313f, 21.433f, 22.286f, 21.404f, 22.258f, 21.375f)
            curveTo(22.188f, 21.301f, 22.117f, 21.231f, 22.024f, 21.143f)
            curveTo(22.029f, 21.148f, 21.855f, 20.984f, 21.809f, 20.94f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-2.004f, 13f)
                lineTo(1.957f, 14.737f)
                lineTo(18.09f, 1.889f)
                lineTo(20.179f, -0.693f)
                lineTo(15.943f, -1.273f)
                lineTo(9.363f, 4.263f)
                lineTo(4.067f, 7.994f)
                lineTo(-2.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.462f, 14.217f)
                lineTo(0.556f, 15.225f)
                lineTo(19.429f, -0.933f)
                horizontalLineTo(16.596f)
                lineTo(-1.462f, 14.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(20.004f, 13f)
                lineTo(16.043f, 14.737f)
                lineTo(-0.09f, 1.889f)
                lineTo(-2.179f, -0.693f)
                lineTo(2.056f, -1.273f)
                lineTo(8.637f, 4.263f)
                lineTo(13.933f, 7.994f)
                lineTo(20.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(19.869f, 13.873f)
                lineTo(17.851f, 14.882f)
                lineTo(9.815f, 7.964f)
                lineTo(7.432f, 7.191f)
                lineTo(-2.38f, -0.684f)
                horizontalLineTo(0.453f)
                lineTo(10.26f, 7.004f)
                lineTo(12.865f, 7.931f)
                lineTo(19.869f, 13.873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.985f, 0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.485f, 0f)
                horizontalLineTo(11.484f)
                verticalLineTo(4.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.484f)
                lineTo(11.5f, 14f)
                horizontalLineTo(6.5f)
                lineTo(6.485f, 9.5f)
                horizontalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.485f)
                verticalLineTo(0f)
                close()
                moveTo(7.985f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BermudaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Bermuda,
            contentDescription = "Bermuda Flag"
        )
    }
}
