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
 * Philippines Flag (20x15dp)
 *
 * - ISO Alpha-2: PH
 * - ISO Alpha-3: PHL
 * - ISO Numeric: 608
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Philippines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Philippines:PH:PHL:608:Medium",
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
                fill = SolidColor(Color(0xFFBF2714)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(-1.25f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(15f)
            lineTo(11.25f, 7.5f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(11.25f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.503f, 6.825f)
                lineTo(9.301f, 7.133f)
                lineTo(9.775f, 6.574f)
                lineTo(9.788f, 7.321f)
                lineTo(10.521f, 7.56f)
                lineTo(9.749f, 7.822f)
                lineTo(9.8f, 8.508f)
                lineTo(9.291f, 7.982f)
                lineTo(8.491f, 8.135f)
                lineTo(8.964f, 7.529f)
                lineTo(8.503f, 6.825f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.003f, 10.575f)
                lineTo(1.736f, 10.899f)
                lineTo(2.275f, 10.324f)
                lineTo(2.223f, 11.088f)
                lineTo(3.022f, 11.31f)
                lineTo(2.185f, 11.589f)
                lineTo(2.3f, 12.258f)
                lineTo(1.717f, 11.78f)
                lineTo(0.991f, 11.885f)
                lineTo(1.399f, 11.296f)
                lineTo(1.003f, 10.575f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.003f, 3.075f)
                lineTo(1.814f, 3.374f)
                lineTo(2.275f, 2.824f)
                lineTo(2.301f, 3.562f)
                lineTo(3.022f, 3.81f)
                lineTo(2.263f, 4.063f)
                lineTo(2.3f, 4.758f)
                lineTo(1.795f, 4.254f)
                lineTo(0.991f, 4.385f)
                lineTo(1.477f, 3.771f)
                lineTo(1.003f, 3.075f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.076f, 9.083f)
                curveTo(5.939f, 9.083f, 6.638f, 8.383f, 6.638f, 7.521f)
                curveTo(6.638f, 6.658f, 5.939f, 5.958f, 5.076f, 5.958f)
                curveTo(4.213f, 5.958f, 3.513f, 6.658f, 3.513f, 7.521f)
                curveTo(3.513f, 8.383f, 4.213f, 9.083f, 5.076f, 9.083f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.891f, 5.15f)
                lineTo(4.975f, 6.154f)
                curveTo(4.983f, 6.215f, 5.03f, 6.263f, 5.091f, 6.273f)
                curveTo(5.167f, 6.286f, 5.239f, 6.235f, 5.252f, 6.158f)
                lineTo(5.363f, 5.158f)
                curveTo(5.365f, 5.146f, 5.366f, 5.135f, 5.366f, 5.123f)
                curveTo(5.368f, 4.991f, 5.263f, 4.883f, 5.132f, 4.88f)
                curveTo(5.12f, 4.88f, 5.108f, 4.881f, 5.096f, 4.882f)
                curveTo(4.966f, 4.9f, 4.874f, 5.019f, 4.891f, 5.15f)
                close()
                moveTo(4.63f, 5.635f)
                lineTo(4.76f, 6.072f)
                curveTo(4.772f, 6.112f, 4.812f, 6.137f, 4.858f, 6.129f)
                curveTo(4.896f, 6.12f, 4.919f, 6.083f, 4.91f, 6.045f)
                lineTo(4.806f, 5.607f)
                curveTo(4.794f, 5.556f, 4.746f, 5.524f, 4.694f, 5.532f)
                curveTo(4.691f, 5.533f, 4.688f, 5.533f, 4.684f, 5.534f)
                curveTo(4.642f, 5.547f, 4.617f, 5.592f, 4.63f, 5.635f)
                close()
                moveTo(5.332f, 6.09f)
                curveTo(5.322f, 6.127f, 5.343f, 6.165f, 5.385f, 6.177f)
                curveTo(5.426f, 6.185f, 5.467f, 6.162f, 5.481f, 6.121f)
                lineTo(5.626f, 5.69f)
                curveTo(5.64f, 5.647f, 5.617f, 5.601f, 5.575f, 5.587f)
                curveTo(5.572f, 5.586f, 5.568f, 5.585f, 5.565f, 5.585f)
                curveTo(5.514f, 5.575f, 5.464f, 5.605f, 5.45f, 5.655f)
                lineTo(5.332f, 6.09f)
                close()
                moveTo(6.63f, 5.651f)
                lineTo(5.931f, 6.422f)
                curveTo(5.894f, 6.471f, 5.893f, 6.539f, 5.928f, 6.589f)
                curveTo(5.973f, 6.651f, 6.061f, 6.666f, 6.123f, 6.621f)
                lineTo(6.957f, 5.99f)
                curveTo(6.967f, 5.983f, 6.976f, 5.976f, 6.985f, 5.967f)
                curveTo(7.079f, 5.876f, 7.082f, 5.725f, 6.99f, 5.63f)
                curveTo(6.982f, 5.622f, 6.973f, 5.614f, 6.964f, 5.607f)
                curveTo(6.86f, 5.527f, 6.71f, 5.546f, 6.63f, 5.651f)
                close()
                moveTo(6.417f, 7.288f)
                lineTo(7.46f, 7.208f)
                curveTo(7.591f, 7.19f, 7.711f, 7.282f, 7.728f, 7.413f)
                curveTo(7.729f, 7.424f, 7.73f, 7.436f, 7.73f, 7.448f)
                curveTo(7.728f, 7.58f, 7.619f, 7.685f, 7.487f, 7.682f)
                curveTo(7.476f, 7.682f, 7.464f, 7.681f, 7.452f, 7.679f)
                lineTo(6.413f, 7.565f)
                curveTo(6.336f, 7.552f, 6.285f, 7.48f, 6.298f, 7.404f)
                curveTo(6.308f, 7.343f, 6.356f, 7.296f, 6.417f, 7.288f)
                close()
                moveTo(6.959f, 8.95f)
                lineTo(6.149f, 8.244f)
                curveTo(6.1f, 8.207f, 6.032f, 8.206f, 5.982f, 8.242f)
                curveTo(5.919f, 8.286f, 5.905f, 8.374f, 5.95f, 8.437f)
                lineTo(6.62f, 9.277f)
                curveTo(6.626f, 9.287f, 6.634f, 9.296f, 6.642f, 9.304f)
                curveTo(6.734f, 9.399f, 6.885f, 9.402f, 6.979f, 9.31f)
                curveTo(6.988f, 9.302f, 6.996f, 9.293f, 7.003f, 9.284f)
                curveTo(7.083f, 9.179f, 7.063f, 9.03f, 6.959f, 8.95f)
                close()
                moveTo(5.283f, 8.731f)
                lineTo(5.344f, 9.784f)
                curveTo(5.362f, 9.914f, 5.27f, 10.034f, 5.139f, 10.051f)
                curveTo(5.128f, 10.053f, 5.116f, 10.053f, 5.104f, 10.053f)
                curveTo(4.972f, 10.051f, 4.868f, 9.942f, 4.87f, 9.811f)
                curveTo(4.87f, 9.799f, 4.871f, 9.787f, 4.873f, 9.775f)
                lineTo(5.006f, 8.726f)
                curveTo(5.019f, 8.65f, 5.091f, 8.598f, 5.167f, 8.611f)
                curveTo(5.228f, 8.621f, 5.275f, 8.67f, 5.283f, 8.731f)
                close()
                moveTo(3.638f, 9.299f)
                lineTo(4.326f, 8.462f)
                curveTo(4.364f, 8.413f, 4.365f, 8.346f, 4.329f, 8.295f)
                curveTo(4.285f, 8.233f, 4.197f, 8.218f, 4.134f, 8.263f)
                lineTo(3.311f, 8.96f)
                curveTo(3.301f, 8.967f, 3.292f, 8.975f, 3.283f, 8.983f)
                curveTo(3.189f, 9.074f, 3.186f, 9.225f, 3.278f, 9.32f)
                curveTo(3.286f, 9.328f, 3.295f, 9.336f, 3.304f, 9.344f)
                curveTo(3.408f, 9.424f, 3.558f, 9.404f, 3.638f, 9.299f)
                close()
                moveTo(3.84f, 7.596f)
                lineTo(2.791f, 7.682f)
                curveTo(2.66f, 7.699f, 2.541f, 7.608f, 2.523f, 7.477f)
                curveTo(2.522f, 7.465f, 2.521f, 7.454f, 2.521f, 7.442f)
                curveTo(2.524f, 7.31f, 2.632f, 7.205f, 2.764f, 7.208f)
                curveTo(2.776f, 7.208f, 2.787f, 7.209f, 2.799f, 7.211f)
                lineTo(3.845f, 7.319f)
                curveTo(3.921f, 7.332f, 3.973f, 7.404f, 3.96f, 7.48f)
                curveTo(3.95f, 7.541f, 3.901f, 7.588f, 3.84f, 7.596f)
                close()
                moveTo(3.219f, 5.951f)
                lineTo(4.109f, 6.64f)
                curveTo(4.158f, 6.677f, 4.225f, 6.678f, 4.275f, 6.643f)
                curveTo(4.338f, 6.598f, 4.353f, 6.51f, 4.308f, 6.447f)
                lineTo(3.558f, 5.624f)
                curveTo(3.551f, 5.614f, 3.544f, 5.605f, 3.535f, 5.597f)
                curveTo(3.444f, 5.502f, 3.293f, 5.499f, 3.198f, 5.591f)
                curveTo(3.19f, 5.599f, 3.182f, 5.608f, 3.175f, 5.617f)
                curveTo(3.095f, 5.722f, 3.115f, 5.871f, 3.219f, 5.951f)
                close()
                moveTo(5.837f, 6.212f)
                lineTo(6.054f, 5.811f)
                curveTo(6.075f, 5.772f, 6.124f, 5.758f, 6.163f, 5.779f)
                curveTo(6.166f, 5.78f, 6.169f, 5.782f, 6.172f, 5.784f)
                curveTo(6.214f, 5.815f, 6.226f, 5.872f, 6.198f, 5.916f)
                lineTo(5.962f, 6.299f)
                curveTo(5.942f, 6.332f, 5.899f, 6.342f, 5.866f, 6.322f)
                curveTo(5.828f, 6.295f, 5.817f, 6.249f, 5.837f, 6.212f)
                close()
                moveTo(6.936f, 6.943f)
                lineTo(6.499f, 7.073f)
                curveTo(6.459f, 7.085f, 6.434f, 7.125f, 6.442f, 7.171f)
                curveTo(6.451f, 7.209f, 6.488f, 7.232f, 6.526f, 7.223f)
                lineTo(6.964f, 7.119f)
                curveTo(7.014f, 7.108f, 7.047f, 7.059f, 7.039f, 7.008f)
                curveTo(7.038f, 7.004f, 7.037f, 7.001f, 7.036f, 6.998f)
                curveTo(7.024f, 6.955f, 6.979f, 6.93f, 6.936f, 6.943f)
                close()
                moveTo(6.359f, 8.15f)
                lineTo(6.76f, 8.367f)
                curveTo(6.799f, 8.388f, 6.813f, 8.437f, 6.792f, 8.477f)
                curveTo(6.79f, 8.48f, 6.789f, 8.483f, 6.787f, 8.485f)
                curveTo(6.756f, 8.527f, 6.699f, 8.539f, 6.655f, 8.512f)
                lineTo(6.272f, 8.275f)
                curveTo(6.239f, 8.255f, 6.229f, 8.212f, 6.249f, 8.179f)
                curveTo(6.275f, 8.141f, 6.322f, 8.13f, 6.359f, 8.15f)
                close()
                moveTo(5.628f, 9.249f)
                lineTo(5.498f, 8.813f)
                curveTo(5.486f, 8.772f, 5.446f, 8.747f, 5.4f, 8.755f)
                curveTo(5.362f, 8.764f, 5.339f, 8.801f, 5.348f, 8.839f)
                lineTo(5.451f, 9.277f)
                curveTo(5.463f, 9.328f, 5.512f, 9.36f, 5.563f, 9.352f)
                curveTo(5.567f, 9.351f, 5.57f, 9.351f, 5.573f, 9.35f)
                curveTo(5.616f, 9.337f, 5.641f, 9.292f, 5.628f, 9.249f)
                close()
                moveTo(4.421f, 8.672f)
                lineTo(4.204f, 9.073f)
                curveTo(4.183f, 9.112f, 4.134f, 9.127f, 4.094f, 9.105f)
                curveTo(4.091f, 9.104f, 4.088f, 9.102f, 4.086f, 9.1f)
                curveTo(4.044f, 9.069f, 4.032f, 9.012f, 4.059f, 8.968f)
                lineTo(4.296f, 8.585f)
                curveTo(4.316f, 8.552f, 4.359f, 8.542f, 4.392f, 8.562f)
                curveTo(4.43f, 8.589f, 4.441f, 8.635f, 4.421f, 8.672f)
                close()
                moveTo(3.322f, 7.941f)
                lineTo(3.758f, 7.811f)
                curveTo(3.799f, 7.799f, 3.824f, 7.759f, 3.816f, 7.713f)
                curveTo(3.807f, 7.675f, 3.769f, 7.652f, 3.732f, 7.661f)
                lineTo(3.294f, 7.765f)
                curveTo(3.243f, 7.777f, 3.211f, 7.825f, 3.219f, 7.876f)
                curveTo(3.22f, 7.88f, 3.22f, 7.883f, 3.221f, 7.887f)
                curveTo(3.234f, 7.929f, 3.279f, 7.954f, 3.322f, 7.941f)
                close()
                moveTo(3.899f, 6.734f)
                lineTo(3.498f, 6.517f)
                curveTo(3.459f, 6.496f, 3.444f, 6.447f, 3.466f, 6.407f)
                curveTo(3.467f, 6.404f, 3.469f, 6.402f, 3.471f, 6.399f)
                curveTo(3.501f, 6.357f, 3.559f, 6.345f, 3.603f, 6.372f)
                lineTo(3.986f, 6.609f)
                curveTo(4.019f, 6.629f, 4.029f, 6.672f, 4.009f, 6.705f)
                curveTo(3.982f, 6.743f, 3.936f, 6.754f, 3.899f, 6.734f)
                close()
                moveTo(6.228f, 6.629f)
                curveTo(6.195f, 6.648f, 6.183f, 6.691f, 6.205f, 6.728f)
                curveTo(6.228f, 6.763f, 6.274f, 6.776f, 6.312f, 6.757f)
                lineTo(6.719f, 6.554f)
                curveTo(6.759f, 6.534f, 6.776f, 6.486f, 6.756f, 6.446f)
                curveTo(6.754f, 6.443f, 6.753f, 6.44f, 6.751f, 6.437f)
                curveTo(6.722f, 6.394f, 6.665f, 6.38f, 6.62f, 6.406f)
                lineTo(6.228f, 6.629f)
                close()
                moveTo(6.394f, 7.698f)
                curveTo(6.406f, 7.657f, 6.444f, 7.635f, 6.481f, 7.645f)
                lineTo(6.916f, 7.764f)
                curveTo(6.965f, 7.777f, 6.996f, 7.827f, 6.986f, 7.878f)
                curveTo(6.986f, 7.881f, 6.985f, 7.885f, 6.984f, 7.888f)
                curveTo(6.969f, 7.93f, 6.924f, 7.953f, 6.881f, 7.939f)
                lineTo(6.45f, 7.794f)
                curveTo(6.409f, 7.781f, 6.386f, 7.739f, 6.394f, 7.698f)
                close()
                moveTo(5.942f, 8.542f)
                curveTo(5.923f, 8.508f, 5.88f, 8.497f, 5.843f, 8.518f)
                curveTo(5.807f, 8.541f, 5.795f, 8.587f, 5.814f, 8.625f)
                lineTo(6.017f, 9.033f)
                curveTo(6.037f, 9.073f, 6.085f, 9.089f, 6.125f, 9.069f)
                curveTo(6.128f, 9.067f, 6.131f, 9.066f, 6.134f, 9.064f)
                curveTo(6.177f, 9.035f, 6.19f, 8.978f, 6.165f, 8.933f)
                lineTo(5.942f, 8.542f)
                close()
                moveTo(4.873f, 8.708f)
                curveTo(4.914f, 8.719f, 4.936f, 8.757f, 4.926f, 8.794f)
                lineTo(4.807f, 9.229f)
                curveTo(4.794f, 9.279f, 4.744f, 9.31f, 4.693f, 9.299f)
                curveTo(4.689f, 9.299f, 4.686f, 9.298f, 4.683f, 9.297f)
                curveTo(4.641f, 9.283f, 4.618f, 9.237f, 4.632f, 9.195f)
                lineTo(4.777f, 8.763f)
                curveTo(4.79f, 8.723f, 4.832f, 8.699f, 4.873f, 8.708f)
                close()
                moveTo(4.029f, 8.255f)
                curveTo(4.063f, 8.236f, 4.074f, 8.193f, 4.053f, 8.156f)
                curveTo(4.03f, 8.121f, 3.984f, 8.108f, 3.946f, 8.127f)
                lineTo(3.538f, 8.33f)
                curveTo(3.498f, 8.35f, 3.482f, 8.398f, 3.502f, 8.438f)
                curveTo(3.504f, 8.441f, 3.505f, 8.444f, 3.507f, 8.447f)
                curveTo(3.536f, 8.49f, 3.593f, 8.504f, 3.638f, 8.478f)
                lineTo(4.029f, 8.255f)
                close()
                moveTo(3.863f, 7.186f)
                curveTo(3.852f, 7.228f, 3.814f, 7.249f, 3.777f, 7.239f)
                lineTo(3.342f, 7.12f)
                curveTo(3.292f, 7.107f, 3.261f, 7.057f, 3.271f, 7.006f)
                curveTo(3.272f, 7.003f, 3.273f, 6.999f, 3.274f, 6.996f)
                curveTo(3.288f, 6.954f, 3.334f, 6.931f, 3.376f, 6.945f)
                lineTo(3.808f, 7.09f)
                curveTo(3.848f, 7.104f, 3.872f, 7.145f, 3.863f, 7.186f)
                close()
                moveTo(4.316f, 6.342f)
                curveTo(4.335f, 6.376f, 4.378f, 6.388f, 4.415f, 6.366f)
                curveTo(4.45f, 6.343f, 4.463f, 6.297f, 4.444f, 6.259f)
                lineTo(4.241f, 5.852f)
                curveTo(4.221f, 5.812f, 4.173f, 5.795f, 4.133f, 5.815f)
                curveTo(4.13f, 5.817f, 4.127f, 5.818f, 4.124f, 5.82f)
                curveTo(4.081f, 5.849f, 4.067f, 5.906f, 4.093f, 5.951f)
                lineTo(4.316f, 6.342f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PhilippinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Philippines,
            contentDescription = "Philippines Flag"
        )
    }
}
