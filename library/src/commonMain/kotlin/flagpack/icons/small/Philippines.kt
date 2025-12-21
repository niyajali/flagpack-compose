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
 * Philippines Flag (16x12dp)
 *
 * - ISO Alpha-2: PH
 * - ISO Alpha-3: PHL
 * - ISO Numeric: 608
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Philippines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Philippines:PH:PHL:608:Small",
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
                fill = SolidColor(Color(0xFFBF2714)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(-1f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(12f)
            lineTo(9f, 6f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(9f, 6f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.803f, 5.46f)
                lineTo(7.441f, 5.706f)
                lineTo(7.82f, 5.259f)
                lineTo(7.83f, 5.857f)
                lineTo(8.417f, 6.048f)
                lineTo(7.799f, 6.258f)
                lineTo(7.84f, 6.806f)
                lineTo(7.433f, 6.386f)
                lineTo(6.793f, 6.508f)
                lineTo(7.171f, 6.023f)
                lineTo(6.803f, 5.46f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.803f, 8.46f)
                lineTo(1.389f, 8.719f)
                lineTo(1.82f, 8.259f)
                lineTo(1.779f, 8.87f)
                lineTo(2.417f, 9.048f)
                lineTo(1.748f, 9.271f)
                lineTo(1.84f, 9.806f)
                lineTo(1.374f, 9.424f)
                lineTo(0.793f, 9.508f)
                lineTo(1.119f, 9.037f)
                lineTo(0.803f, 8.46f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.803f, 2.46f)
                lineTo(1.451f, 2.699f)
                lineTo(1.82f, 2.259f)
                lineTo(1.841f, 2.85f)
                lineTo(2.417f, 3.048f)
                lineTo(1.81f, 3.251f)
                lineTo(1.84f, 3.806f)
                lineTo(1.436f, 3.404f)
                lineTo(0.793f, 3.508f)
                lineTo(1.182f, 3.016f)
                lineTo(0.803f, 2.46f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.061f, 7.266f)
                curveTo(4.751f, 7.266f, 5.311f, 6.707f, 5.311f, 6.016f)
                curveTo(5.311f, 5.326f, 4.751f, 4.766f, 4.061f, 4.766f)
                curveTo(3.37f, 4.766f, 2.811f, 5.326f, 2.811f, 6.016f)
                curveTo(2.811f, 6.707f, 3.37f, 7.266f, 4.061f, 7.266f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.913f, 4.12f)
                lineTo(3.98f, 4.923f)
                curveTo(3.987f, 4.972f, 4.024f, 5.01f, 4.073f, 5.019f)
                curveTo(4.134f, 5.029f, 4.191f, 4.988f, 4.201f, 4.927f)
                lineTo(4.29f, 4.126f)
                curveTo(4.292f, 4.117f, 4.292f, 4.108f, 4.293f, 4.098f)
                curveTo(4.294f, 3.993f, 4.211f, 3.906f, 4.105f, 3.904f)
                curveTo(4.096f, 3.904f, 4.086f, 3.905f, 4.077f, 3.906f)
                curveTo(3.973f, 3.92f, 3.899f, 4.015f, 3.913f, 4.12f)
                close()
                moveTo(3.704f, 4.508f)
                lineTo(3.808f, 4.857f)
                curveTo(3.817f, 4.89f, 3.85f, 4.91f, 3.886f, 4.903f)
                curveTo(3.916f, 4.896f, 3.935f, 4.866f, 3.928f, 4.836f)
                lineTo(3.845f, 4.486f)
                curveTo(3.836f, 4.445f, 3.796f, 4.419f, 3.756f, 4.426f)
                curveTo(3.753f, 4.426f, 3.75f, 4.427f, 3.747f, 4.428f)
                curveTo(3.713f, 4.438f, 3.694f, 4.474f, 3.704f, 4.508f)
                close()
                moveTo(4.265f, 4.872f)
                curveTo(4.257f, 4.902f, 4.275f, 4.932f, 4.308f, 4.941f)
                curveTo(4.341f, 4.948f, 4.374f, 4.929f, 4.385f, 4.897f)
                lineTo(4.501f, 4.552f)
                curveTo(4.512f, 4.518f, 4.494f, 4.481f, 4.46f, 4.47f)
                curveTo(4.457f, 4.469f, 4.455f, 4.468f, 4.452f, 4.468f)
                curveTo(4.411f, 4.46f, 4.371f, 4.484f, 4.36f, 4.524f)
                lineTo(4.265f, 4.872f)
                close()
                moveTo(5.304f, 4.521f)
                lineTo(4.745f, 5.138f)
                curveTo(4.715f, 5.177f, 4.714f, 5.231f, 4.743f, 5.271f)
                curveTo(4.779f, 5.321f, 4.848f, 5.333f, 4.899f, 5.297f)
                lineTo(5.566f, 4.792f)
                curveTo(5.574f, 4.787f, 5.581f, 4.78f, 5.588f, 4.774f)
                curveTo(5.663f, 4.701f, 5.665f, 4.58f, 5.592f, 4.504f)
                curveTo(5.586f, 4.498f, 5.579f, 4.491f, 5.571f, 4.486f)
                curveTo(5.488f, 4.421f, 5.368f, 4.437f, 5.304f, 4.521f)
                close()
                moveTo(5.134f, 5.831f)
                lineTo(5.968f, 5.766f)
                curveTo(6.073f, 5.752f, 6.169f, 5.826f, 6.182f, 5.93f)
                curveTo(6.184f, 5.94f, 6.184f, 5.949f, 6.184f, 5.958f)
                curveTo(6.182f, 6.064f, 6.095f, 6.148f, 5.99f, 6.146f)
                curveTo(5.981f, 6.146f, 5.971f, 6.145f, 5.962f, 6.143f)
                lineTo(5.13f, 6.052f)
                curveTo(5.069f, 6.042f, 5.028f, 5.984f, 5.038f, 5.923f)
                curveTo(5.046f, 5.875f, 5.085f, 5.837f, 5.134f, 5.831f)
                close()
                moveTo(5.567f, 7.16f)
                lineTo(4.919f, 6.596f)
                curveTo(4.88f, 6.566f, 4.826f, 6.565f, 4.786f, 6.593f)
                curveTo(4.736f, 6.629f, 4.724f, 6.699f, 4.76f, 6.749f)
                lineTo(5.296f, 7.422f)
                curveTo(5.301f, 7.429f, 5.307f, 7.437f, 5.314f, 7.444f)
                curveTo(5.387f, 7.519f, 5.508f, 7.521f, 5.583f, 7.448f)
                curveTo(5.59f, 7.442f, 5.596f, 7.435f, 5.602f, 7.427f)
                curveTo(5.666f, 7.344f, 5.651f, 7.224f, 5.567f, 7.16f)
                close()
                moveTo(4.226f, 6.984f)
                lineTo(4.276f, 7.827f)
                curveTo(4.289f, 7.931f, 4.216f, 8.027f, 4.111f, 8.041f)
                curveTo(4.102f, 8.042f, 4.093f, 8.043f, 4.083f, 8.042f)
                curveTo(3.978f, 8.041f, 3.894f, 7.954f, 3.896f, 7.849f)
                curveTo(3.896f, 7.839f, 3.897f, 7.83f, 3.898f, 7.82f)
                lineTo(4.005f, 6.981f)
                curveTo(4.015f, 6.92f, 4.073f, 6.879f, 4.134f, 6.889f)
                curveTo(4.182f, 6.897f, 4.22f, 6.936f, 4.226f, 6.984f)
                close()
                moveTo(2.911f, 7.44f)
                lineTo(3.461f, 6.769f)
                curveTo(3.491f, 6.73f, 3.492f, 6.676f, 3.463f, 6.636f)
                curveTo(3.428f, 6.586f, 3.358f, 6.574f, 3.307f, 6.61f)
                lineTo(2.649f, 7.168f)
                curveTo(2.641f, 7.174f, 2.634f, 7.18f, 2.627f, 7.186f)
                curveTo(2.551f, 7.26f, 2.549f, 7.38f, 2.622f, 7.456f)
                curveTo(2.629f, 7.463f, 2.636f, 7.469f, 2.643f, 7.475f)
                curveTo(2.727f, 7.539f, 2.846f, 7.523f, 2.911f, 7.44f)
                close()
                moveTo(3.072f, 6.077f)
                lineTo(2.233f, 6.146f)
                curveTo(2.128f, 6.16f, 2.033f, 6.086f, 2.019f, 5.982f)
                curveTo(2.018f, 5.972f, 2.017f, 5.963f, 2.017f, 5.953f)
                curveTo(2.019f, 5.848f, 2.106f, 5.764f, 2.211f, 5.766f)
                curveTo(2.221f, 5.766f, 2.23f, 5.767f, 2.239f, 5.769f)
                lineTo(3.076f, 5.855f)
                curveTo(3.137f, 5.866f, 3.178f, 5.923f, 3.168f, 5.984f)
                curveTo(3.16f, 6.033f, 3.121f, 6.07f, 3.072f, 6.077f)
                close()
                moveTo(2.575f, 4.761f)
                lineTo(3.287f, 5.312f)
                curveTo(3.326f, 5.342f, 3.38f, 5.343f, 3.42f, 5.314f)
                curveTo(3.471f, 5.278f, 3.482f, 5.208f, 3.446f, 5.158f)
                lineTo(2.846f, 4.499f)
                curveTo(2.841f, 4.491f, 2.835f, 4.484f, 2.828f, 4.477f)
                curveTo(2.755f, 4.402f, 2.635f, 4.399f, 2.559f, 4.473f)
                curveTo(2.552f, 4.479f, 2.546f, 4.486f, 2.54f, 4.494f)
                curveTo(2.476f, 4.577f, 2.492f, 4.697f, 2.575f, 4.761f)
                close()
                moveTo(4.67f, 4.97f)
                lineTo(4.843f, 4.649f)
                curveTo(4.86f, 4.618f, 4.899f, 4.606f, 4.931f, 4.623f)
                curveTo(4.933f, 4.624f, 4.936f, 4.626f, 4.938f, 4.627f)
                curveTo(4.971f, 4.652f, 4.981f, 4.698f, 4.959f, 4.733f)
                lineTo(4.769f, 5.04f)
                curveTo(4.753f, 5.066f, 4.719f, 5.074f, 4.693f, 5.058f)
                curveTo(4.662f, 5.036f, 4.653f, 4.999f, 4.67f, 4.97f)
                close()
                moveTo(5.549f, 5.554f)
                lineTo(5.199f, 5.658f)
                curveTo(5.167f, 5.668f, 5.147f, 5.7f, 5.153f, 5.737f)
                curveTo(5.161f, 5.767f, 5.191f, 5.786f, 5.221f, 5.778f)
                lineTo(5.571f, 5.696f)
                curveTo(5.612f, 5.686f, 5.638f, 5.647f, 5.631f, 5.606f)
                curveTo(5.631f, 5.603f, 5.63f, 5.601f, 5.629f, 5.598f)
                curveTo(5.619f, 5.564f, 5.583f, 5.544f, 5.549f, 5.554f)
                close()
                moveTo(5.087f, 6.52f)
                lineTo(5.408f, 6.694f)
                curveTo(5.439f, 6.711f, 5.451f, 6.75f, 5.434f, 6.781f)
                curveTo(5.432f, 6.784f, 5.431f, 6.786f, 5.429f, 6.788f)
                curveTo(5.405f, 6.822f, 5.359f, 6.831f, 5.324f, 6.809f)
                lineTo(5.017f, 6.62f)
                curveTo(4.991f, 6.604f, 4.983f, 6.569f, 4.999f, 6.543f)
                curveTo(5.02f, 6.513f, 5.057f, 6.504f, 5.087f, 6.52f)
                close()
                moveTo(4.502f, 7.399f)
                lineTo(4.398f, 7.05f)
                curveTo(4.389f, 7.018f, 4.356f, 6.998f, 4.32f, 7.004f)
                curveTo(4.29f, 7.011f, 4.271f, 7.041f, 4.278f, 7.071f)
                lineTo(4.361f, 7.422f)
                curveTo(4.371f, 7.462f, 4.41f, 7.488f, 4.451f, 7.482f)
                curveTo(4.453f, 7.481f, 4.456f, 7.481f, 4.459f, 7.48f)
                curveTo(4.493f, 7.47f, 4.512f, 7.434f, 4.502f, 7.399f)
                close()
                moveTo(3.537f, 6.938f)
                lineTo(3.363f, 7.258f)
                curveTo(3.346f, 7.29f, 3.307f, 7.301f, 3.275f, 7.284f)
                curveTo(3.273f, 7.283f, 3.271f, 7.281f, 3.268f, 7.28f)
                curveTo(3.235f, 7.256f, 3.226f, 7.209f, 3.247f, 7.174f)
                lineTo(3.437f, 6.868f)
                curveTo(3.453f, 6.842f, 3.487f, 6.833f, 3.514f, 6.85f)
                curveTo(3.544f, 6.871f, 3.553f, 6.908f, 3.537f, 6.938f)
                close()
                moveTo(2.657f, 6.353f)
                lineTo(3.007f, 6.249f)
                curveTo(3.039f, 6.239f, 3.059f, 6.207f, 3.053f, 6.17f)
                curveTo(3.046f, 6.14f, 3.016f, 6.122f, 2.986f, 6.129f)
                lineTo(2.635f, 6.212f)
                curveTo(2.595f, 6.221f, 2.569f, 6.26f, 2.575f, 6.301f)
                curveTo(2.576f, 6.304f, 2.576f, 6.307f, 2.577f, 6.309f)
                curveTo(2.587f, 6.343f, 2.623f, 6.363f, 2.657f, 6.353f)
                close()
                moveTo(3.119f, 5.387f)
                lineTo(2.799f, 5.214f)
                curveTo(2.767f, 5.197f, 2.756f, 5.157f, 2.773f, 5.126f)
                curveTo(2.774f, 5.124f, 2.775f, 5.121f, 2.777f, 5.119f)
                curveTo(2.801f, 5.085f, 2.847f, 5.076f, 2.882f, 5.098f)
                lineTo(3.189f, 5.287f)
                curveTo(3.215f, 5.304f, 3.223f, 5.338f, 3.207f, 5.364f)
                curveTo(3.186f, 5.395f, 3.149f, 5.403f, 3.119f, 5.387f)
                close()
                moveTo(4.983f, 5.303f)
                curveTo(4.956f, 5.319f, 4.947f, 5.353f, 4.964f, 5.382f)
                curveTo(4.982f, 5.411f, 5.019f, 5.421f, 5.049f, 5.406f)
                lineTo(5.376f, 5.243f)
                curveTo(5.407f, 5.227f, 5.421f, 5.189f, 5.405f, 5.157f)
                curveTo(5.403f, 5.154f, 5.402f, 5.152f, 5.4f, 5.15f)
                curveTo(5.377f, 5.115f, 5.332f, 5.104f, 5.296f, 5.125f)
                lineTo(4.983f, 5.303f)
                close()
                moveTo(5.116f, 6.158f)
                curveTo(5.124f, 6.125f, 5.155f, 6.108f, 5.185f, 6.116f)
                lineTo(5.532f, 6.211f)
                curveTo(5.572f, 6.222f, 5.597f, 6.262f, 5.589f, 6.302f)
                curveTo(5.589f, 6.305f, 5.588f, 6.308f, 5.587f, 6.31f)
                curveTo(5.576f, 6.344f, 5.539f, 6.363f, 5.505f, 6.351f)
                lineTo(5.16f, 6.235f)
                curveTo(5.128f, 6.224f, 5.109f, 6.191f, 5.116f, 6.158f)
                close()
                moveTo(4.753f, 6.833f)
                curveTo(4.738f, 6.807f, 4.704f, 6.797f, 4.674f, 6.814f)
                curveTo(4.646f, 6.833f, 4.636f, 6.87f, 4.651f, 6.9f)
                lineTo(4.813f, 7.226f)
                curveTo(4.829f, 7.258f, 4.868f, 7.271f, 4.9f, 7.255f)
                curveTo(4.903f, 7.254f, 4.905f, 7.253f, 4.907f, 7.251f)
                curveTo(4.942f, 7.228f, 4.952f, 7.182f, 4.932f, 7.146f)
                lineTo(4.753f, 6.833f)
                close()
                moveTo(3.898f, 6.966f)
                curveTo(3.931f, 6.975f, 3.949f, 7.006f, 3.941f, 7.035f)
                lineTo(3.846f, 7.383f)
                curveTo(3.835f, 7.423f, 3.795f, 7.448f, 3.754f, 7.44f)
                curveTo(3.752f, 7.439f, 3.749f, 7.438f, 3.746f, 7.437f)
                curveTo(3.712f, 7.426f, 3.694f, 7.389f, 3.706f, 7.356f)
                lineTo(3.822f, 7.01f)
                curveTo(3.832f, 6.978f, 3.865f, 6.959f, 3.898f, 6.966f)
                close()
                moveTo(3.223f, 6.604f)
                curveTo(3.25f, 6.589f, 3.26f, 6.555f, 3.242f, 6.525f)
                curveTo(3.224f, 6.497f, 3.187f, 6.487f, 3.157f, 6.502f)
                lineTo(2.831f, 6.664f)
                curveTo(2.799f, 6.68f, 2.786f, 6.719f, 2.802f, 6.751f)
                curveTo(2.803f, 6.753f, 2.804f, 6.755f, 2.806f, 6.758f)
                curveTo(2.829f, 6.792f, 2.875f, 6.803f, 2.911f, 6.782f)
                lineTo(3.223f, 6.604f)
                close()
                moveTo(3.091f, 5.749f)
                curveTo(3.082f, 5.782f, 3.051f, 5.8f, 3.021f, 5.791f)
                lineTo(2.674f, 5.696f)
                curveTo(2.634f, 5.685f, 2.609f, 5.646f, 2.617f, 5.605f)
                curveTo(2.618f, 5.602f, 2.618f, 5.599f, 2.619f, 5.597f)
                curveTo(2.631f, 5.563f, 2.667f, 5.545f, 2.701f, 5.556f)
                lineTo(3.047f, 5.672f)
                curveTo(3.079f, 5.683f, 3.098f, 5.716f, 3.091f, 5.749f)
                close()
                moveTo(3.453f, 5.074f)
                curveTo(3.468f, 5.101f, 3.502f, 5.11f, 3.532f, 5.093f)
                curveTo(3.56f, 5.075f, 3.57f, 5.038f, 3.555f, 5.007f)
                lineTo(3.393f, 4.681f)
                curveTo(3.377f, 4.649f, 3.338f, 4.636f, 3.306f, 4.652f)
                curveTo(3.304f, 4.653f, 3.301f, 4.655f, 3.299f, 4.656f)
                curveTo(3.265f, 4.679f, 3.254f, 4.725f, 3.274f, 4.761f)
                lineTo(3.453f, 5.074f)
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
            imageVector = FlagIcons.Small.Philippines,
            contentDescription = "Philippines Flag"
        )
    }
}
