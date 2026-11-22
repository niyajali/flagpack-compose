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
 * US Virgin Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: VI
 * - ISO Alpha-3: VIR
 * - ISO Numeric: 850
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.UsVirginIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "US Virgin Islands:VI:VIR:850:Medium",
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
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.002f, 5.134f)
                curveTo(11.153f, 5.22f, 11.243f, 5.441f, 11.243f, 5.441f)
                horizontalLineTo(8.689f)
                lineTo(8.865f, 5.134f)
                curveTo(8.865f, 5.134f, 8.689f, 5.054f, 8.777f, 5.054f)
                curveTo(8.866f, 5.054f, 9.119f, 4.699f, 9.119f, 4.699f)
                horizontalLineTo(9.013f)
                curveTo(9.013f, 4.699f, 8.959f, 4.611f, 9.119f, 4.611f)
                curveTo(9.279f, 4.611f, 9.407f, 4.039f, 9.407f, 4.039f)
                curveTo(9.407f, 4.039f, 9.512f, 3.772f, 9.255f, 3.704f)
                curveTo(8.998f, 3.637f, 8.689f, 3.928f, 8.689f, 3.928f)
                curveTo(8.689f, 3.928f, 8.764f, 3.462f, 8.865f, 3.361f)
                curveTo(8.912f, 3.315f, 8.999f, 3.307f, 9.08f, 3.3f)
                curveTo(9.172f, 3.292f, 9.255f, 3.285f, 9.255f, 3.22f)
                curveTo(9.255f, 3.097f, 9.555f, 3.002f, 10.047f, 3.002f)
                curveTo(10.538f, 3.002f, 10.717f, 3.589f, 10.717f, 3.704f)
                curveTo(10.717f, 3.82f, 10.885f, 4.433f, 10.885f, 4.433f)
                curveTo(10.885f, 4.433f, 10.717f, 4.433f, 10.717f, 4.512f)
                curveTo(10.717f, 4.591f, 11.243f, 4.932f, 11.243f, 4.932f)
                curveTo(11.243f, 4.932f, 10.85f, 5.048f, 11.002f, 5.134f)
                close()
                moveTo(1.736f, 3.043f)
                curveTo(1.932f, 2.959f, 3.924f, 3.553f, 5.416f, 3.998f)
                curveTo(6.274f, 4.253f, 6.967f, 4.46f, 7.058f, 4.46f)
                curveTo(7.307f, 4.46f, 7.776f, 5.063f, 7.541f, 5.317f)
                curveTo(7.307f, 5.571f, 7.228f, 5.719f, 7.385f, 5.719f)
                curveTo(7.541f, 5.719f, 8.332f, 5.514f, 8.332f, 5.514f)
                verticalLineTo(7.871f)
                curveTo(8.332f, 7.871f, 7.574f, 8.051f, 7.385f, 7.871f)
                curveTo(7.293f, 7.784f, 7.153f, 7.779f, 7.033f, 7.774f)
                curveTo(6.905f, 7.77f, 6.799f, 7.766f, 6.799f, 7.665f)
                curveTo(6.799f, 7.469f, 6.363f, 7.438f, 6.363f, 7.438f)
                curveTo(6.363f, 7.438f, 5.959f, 7.304f, 5.959f, 7.179f)
                curveTo(5.959f, 7.054f, 5.694f, 6.699f, 5.694f, 6.699f)
                curveTo(5.694f, 6.699f, 4.686f, 6.129f, 3.829f, 5.502f)
                curveTo(3.656f, 5.376f, 3.485f, 5.257f, 3.321f, 5.142f)
                lineTo(3.321f, 5.142f)
                curveTo(2.674f, 4.692f, 2.14f, 4.32f, 2.045f, 3.889f)
                curveTo(1.597f, 3.446f, 1.427f, 3.176f, 1.736f, 3.043f)
                close()
                moveTo(8.027f, 8.02f)
                curveTo(8.027f, 8.02f, 7.688f, 8.254f, 7.313f, 8.88f)
                curveTo(7.128f, 9.188f, 7.113f, 9.459f, 7.102f, 9.656f)
                curveTo(7.091f, 9.858f, 7.084f, 9.981f, 6.899f, 9.981f)
                curveTo(6.684f, 9.981f, 6.527f, 10.027f, 6.4f, 10.065f)
                curveTo(6.312f, 10.092f, 6.239f, 10.113f, 6.169f, 10.113f)
                curveTo(5.997f, 10.113f, 5.668f, 10.76f, 5.833f, 10.91f)
                curveTo(5.997f, 11.06f, 6.687f, 11.298f, 6.687f, 10.91f)
                curveTo(6.687f, 10.522f, 6.872f, 10.301f, 7.209f, 10.301f)
                curveTo(7.546f, 10.301f, 8.148f, 10.078f, 8.148f, 9.589f)
                curveTo(8.148f, 9.099f, 8.804f, 9.134f, 8.804f, 9.134f)
                lineTo(8.027f, 8.02f)
                close()
                moveTo(14.726f, 3.998f)
                curveTo(16.218f, 3.553f, 18.21f, 2.959f, 18.406f, 3.043f)
                curveTo(18.715f, 3.176f, 18.545f, 3.446f, 18.097f, 3.889f)
                curveTo(18.001f, 4.32f, 17.468f, 4.692f, 16.821f, 5.142f)
                lineTo(16.821f, 5.143f)
                curveTo(16.657f, 5.257f, 16.486f, 5.376f, 16.313f, 5.502f)
                curveTo(15.456f, 6.129f, 14.448f, 6.699f, 14.448f, 6.699f)
                curveTo(14.448f, 6.699f, 14.183f, 7.054f, 14.183f, 7.179f)
                curveTo(14.183f, 7.304f, 13.779f, 7.438f, 13.779f, 7.438f)
                curveTo(13.779f, 7.438f, 13.342f, 7.469f, 13.342f, 7.665f)
                curveTo(13.342f, 7.766f, 13.237f, 7.77f, 13.109f, 7.774f)
                curveTo(12.989f, 7.779f, 12.849f, 7.784f, 12.757f, 7.871f)
                curveTo(12.568f, 8.051f, 11.81f, 7.871f, 11.81f, 7.871f)
                verticalLineTo(5.514f)
                curveTo(11.81f, 5.514f, 12.601f, 5.719f, 12.757f, 5.719f)
                curveTo(12.914f, 5.719f, 12.835f, 5.571f, 12.601f, 5.317f)
                curveTo(12.366f, 5.063f, 12.835f, 4.46f, 13.084f, 4.46f)
                curveTo(13.175f, 4.46f, 13.868f, 4.253f, 14.726f, 3.998f)
                lineTo(14.726f, 3.998f)
                close()
                moveTo(12.115f, 8.02f)
                curveTo(12.115f, 8.02f, 12.454f, 8.254f, 12.829f, 8.88f)
                curveTo(13.014f, 9.188f, 13.029f, 9.459f, 13.04f, 9.656f)
                curveTo(13.051f, 9.858f, 13.057f, 9.981f, 13.242f, 9.981f)
                curveTo(13.458f, 9.981f, 13.615f, 10.027f, 13.742f, 10.065f)
                curveTo(13.83f, 10.092f, 13.903f, 10.113f, 13.973f, 10.113f)
                curveTo(14.144f, 10.113f, 14.473f, 10.76f, 14.309f, 10.91f)
                curveTo(14.144f, 11.06f, 13.455f, 11.298f, 13.455f, 10.91f)
                curveTo(13.455f, 10.522f, 13.27f, 10.301f, 12.933f, 10.301f)
                curveTo(12.596f, 10.301f, 11.994f, 10.078f, 11.994f, 9.589f)
                curveTo(11.994f, 9.099f, 11.338f, 9.134f, 11.338f, 9.134f)
                lineTo(12.115f, 8.02f)
                close()
                moveTo(8.463f, 9.651f)
                curveTo(8.463f, 9.436f, 8.844f, 9.273f, 8.844f, 9.273f)
                lineTo(9.991f, 8.789f)
                curveTo(9.991f, 8.789f, 9.997f, 8.899f, 10.005f, 9.08f)
                curveTo(10.014f, 8.899f, 10.02f, 8.789f, 10.02f, 8.789f)
                lineTo(11.167f, 9.273f)
                curveTo(11.167f, 9.273f, 11.548f, 9.436f, 11.548f, 9.651f)
                curveTo(11.548f, 9.759f, 11.71f, 9.951f, 11.871f, 10.141f)
                curveTo(12.032f, 10.331f, 12.193f, 10.52f, 12.193f, 10.627f)
                curveTo(12.193f, 10.815f, 11.758f, 11.238f, 11.495f, 11.493f)
                lineTo(11.495f, 11.493f)
                curveTo(11.46f, 11.528f, 11.427f, 11.56f, 11.399f, 11.587f)
                curveTo(11.339f, 11.647f, 11.274f, 11.721f, 11.206f, 11.797f)
                curveTo(11.013f, 12.016f, 10.799f, 12.259f, 10.62f, 12.259f)
                curveTo(10.494f, 12.259f, 10.392f, 12.347f, 10.294f, 12.431f)
                curveTo(10.204f, 12.508f, 10.118f, 12.582f, 10.02f, 12.582f)
                curveTo(10.015f, 12.582f, 10.01f, 12.58f, 10.005f, 12.575f)
                curveTo(10.001f, 12.58f, 9.996f, 12.582f, 9.991f, 12.582f)
                curveTo(9.893f, 12.582f, 9.807f, 12.508f, 9.717f, 12.431f)
                curveTo(9.619f, 12.347f, 9.517f, 12.259f, 9.391f, 12.259f)
                curveTo(9.212f, 12.259f, 8.998f, 12.016f, 8.805f, 11.797f)
                curveTo(8.737f, 11.721f, 8.672f, 11.647f, 8.612f, 11.587f)
                curveTo(8.584f, 11.56f, 8.551f, 11.528f, 8.516f, 11.493f)
                lineTo(8.516f, 11.493f)
                lineTo(8.516f, 11.493f)
                curveTo(8.253f, 11.238f, 7.818f, 10.815f, 7.818f, 10.627f)
                curveTo(7.818f, 10.52f, 7.978f, 10.331f, 8.139f, 10.141f)
                curveTo(8.301f, 9.951f, 8.463f, 9.759f, 8.463f, 9.651f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF46A000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.381f, 6.671f)
                curveTo(4.406f, 6.96f, 4.489f, 7.13f, 4.489f, 7.13f)
                curveTo(4.489f, 7.13f, 4.633f, 7.358f, 4.715f, 7.361f)
                curveTo(4.758f, 7.465f, 4.803f, 7.573f, 4.853f, 7.682f)
                curveTo(5.078f, 8.282f, 5.385f, 9.071f, 5.699f, 9.789f)
                curveTo(5.679f, 9.774f, 5.65f, 9.757f, 5.61f, 9.738f)
                curveTo(5.347f, 9.615f, 5.158f, 9.601f, 5.158f, 9.601f)
                curveTo(5.158f, 9.601f, 4.806f, 9.616f, 4.842f, 9.716f)
                curveTo(4.878f, 9.816f, 5.315f, 10.033f, 5.493f, 9.969f)
                curveTo(5.513f, 9.961f, 5.533f, 9.955f, 5.552f, 9.948f)
                curveTo(5.634f, 9.92f, 5.709f, 9.894f, 5.73f, 9.86f)
                curveTo(5.772f, 9.955f, 5.814f, 10.048f, 5.856f, 10.139f)
                curveTo(5.593f, 10.017f, 5.405f, 10.003f, 5.405f, 10.003f)
                curveTo(5.405f, 10.003f, 5.053f, 10.018f, 5.089f, 10.118f)
                curveTo(5.126f, 10.218f, 5.562f, 10.435f, 5.74f, 10.37f)
                curveTo(5.76f, 10.363f, 5.78f, 10.356f, 5.799f, 10.349f)
                curveTo(5.849f, 10.332f, 5.895f, 10.316f, 5.93f, 10.299f)
                curveTo(6.246f, 10.974f, 6.552f, 11.513f, 6.77f, 11.649f)
                horizontalLineTo(7.211f)
                curveTo(7.211f, 11.649f, 6.83f, 11.111f, 6.35f, 10.358f)
                curveTo(6.495f, 10.256f, 6.696f, 10.029f, 6.696f, 9.887f)
                curveTo(6.696f, 9.866f, 6.697f, 9.844f, 6.697f, 9.824f)
                curveTo(6.7f, 9.657f, 6.702f, 9.516f, 6.519f, 9.698f)
                curveTo(6.314f, 9.903f, 6.236f, 10.075f, 6.236f, 10.075f)
                curveTo(6.236f, 10.075f, 6.227f, 10.105f, 6.217f, 10.147f)
                curveTo(6.178f, 10.085f, 6.139f, 10.023f, 6.1f, 9.959f)
                curveTo(6.244f, 9.858f, 6.449f, 9.629f, 6.449f, 9.485f)
                curveTo(6.449f, 9.464f, 6.449f, 9.443f, 6.45f, 9.422f)
                curveTo(6.453f, 9.256f, 6.455f, 9.114f, 6.272f, 9.296f)
                curveTo(6.067f, 9.501f, 5.989f, 9.674f, 5.989f, 9.674f)
                curveTo(5.989f, 9.674f, 5.98f, 9.704f, 5.969f, 9.746f)
                curveTo(5.914f, 9.655f, 5.858f, 9.562f, 5.802f, 9.468f)
                curveTo(5.944f, 9.394f, 6.202f, 9.124f, 6.202f, 8.963f)
                curveTo(6.202f, 8.942f, 6.202f, 8.921f, 6.203f, 8.9f)
                curveTo(6.206f, 8.734f, 6.208f, 8.592f, 6.025f, 8.774f)
                curveTo(5.82f, 8.979f, 5.742f, 9.152f, 5.742f, 9.152f)
                curveTo(5.742f, 9.152f, 5.719f, 9.225f, 5.705f, 9.304f)
                curveTo(5.632f, 9.179f, 5.56f, 9.052f, 5.488f, 8.925f)
                curveTo(5.49f, 8.926f, 5.493f, 8.926f, 5.495f, 8.926f)
                curveTo(5.601f, 8.926f, 5.955f, 8.59f, 5.955f, 8.401f)
                curveTo(5.955f, 8.38f, 5.955f, 8.358f, 5.956f, 8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                verticalLineTo(8.338f)
                curveTo(5.958f, 8.171f, 5.961f, 8.03f, 5.778f, 8.212f)
                curveTo(5.573f, 8.417f, 5.495f, 8.59f, 5.495f, 8.59f)
                curveTo(5.495f, 8.59f, 5.443f, 8.755f, 5.448f, 8.854f)
                curveTo(5.35f, 8.677f, 5.254f, 8.499f, 5.163f, 8.323f)
                lineTo(5.166f, 8.323f)
                curveTo(5.272f, 8.323f, 5.626f, 7.987f, 5.626f, 7.798f)
                curveTo(5.626f, 7.777f, 5.626f, 7.756f, 5.626f, 7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                verticalLineTo(7.735f)
                curveTo(5.629f, 7.569f, 5.631f, 7.427f, 5.449f, 7.61f)
                curveTo(5.243f, 7.815f, 5.166f, 7.987f, 5.166f, 7.987f)
                curveTo(5.166f, 7.987f, 5.119f, 8.136f, 5.118f, 8.236f)
                curveTo(5.023f, 8.048f, 4.933f, 7.862f, 4.853f, 7.682f)
                curveTo(4.809f, 7.566f, 4.769f, 7.458f, 4.732f, 7.358f)
                curveTo(4.737f, 7.355f, 4.742f, 7.352f, 4.746f, 7.347f)
                curveTo(4.815f, 7.265f, 4.784f, 6.778f, 4.64f, 6.657f)
                curveTo(4.623f, 6.643f, 4.607f, 6.629f, 4.592f, 6.616f)
                curveTo(4.466f, 6.507f, 4.359f, 6.414f, 4.381f, 6.671f)
                close()
                moveTo(4.87f, 7.411f)
                curveTo(4.87f, 7.411f, 4.884f, 7.222f, 5.007f, 6.959f)
                curveTo(5.116f, 6.725f, 5.163f, 6.859f, 5.217f, 7.016f)
                lineTo(5.217f, 7.016f)
                curveTo(5.224f, 7.036f, 5.231f, 7.056f, 5.238f, 7.076f)
                curveTo(5.302f, 7.253f, 5.085f, 7.69f, 4.985f, 7.727f)
                curveTo(4.885f, 7.763f, 4.87f, 7.411f, 4.87f, 7.411f)
                close()
                moveTo(5.363f, 9.216f)
                curveTo(5.1f, 9.093f, 4.911f, 9.079f, 4.911f, 9.079f)
                curveTo(4.911f, 9.079f, 4.559f, 9.094f, 4.595f, 9.194f)
                curveTo(4.631f, 9.294f, 5.068f, 9.511f, 5.246f, 9.447f)
                curveTo(5.266f, 9.439f, 5.286f, 9.432f, 5.305f, 9.426f)
                curveTo(5.463f, 9.371f, 5.596f, 9.325f, 5.363f, 9.216f)
                close()
                moveTo(4.664f, 8.517f)
                curveTo(4.664f, 8.517f, 4.853f, 8.531f, 5.116f, 8.654f)
                curveTo(5.349f, 8.763f, 5.215f, 8.809f, 5.058f, 8.863f)
                curveTo(5.039f, 8.87f, 5.018f, 8.877f, 4.999f, 8.884f)
                curveTo(4.821f, 8.949f, 4.384f, 8.732f, 4.348f, 8.632f)
                curveTo(4.312f, 8.532f, 4.664f, 8.517f, 4.664f, 8.517f)
                close()
                moveTo(4.91f, 8.092f)
                curveTo(4.647f, 7.969f, 4.458f, 7.955f, 4.458f, 7.955f)
                curveTo(4.458f, 7.955f, 4.106f, 7.97f, 4.142f, 8.07f)
                curveTo(4.178f, 8.17f, 4.615f, 8.387f, 4.793f, 8.322f)
                curveTo(4.813f, 8.315f, 4.833f, 8.308f, 4.852f, 8.301f)
                curveTo(5.01f, 8.247f, 5.143f, 8.201f, 4.91f, 8.092f)
                close()
                moveTo(4.359f, 7.278f)
                curveTo(4.359f, 7.278f, 4.532f, 7.356f, 4.737f, 7.561f)
                curveTo(4.919f, 7.744f, 4.778f, 7.741f, 4.611f, 7.739f)
                horizontalLineTo(4.611f)
                curveTo(4.59f, 7.738f, 4.569f, 7.738f, 4.548f, 7.738f)
                curveTo(4.359f, 7.738f, 4.023f, 7.384f, 4.023f, 7.278f)
                curveTo(4.023f, 7.172f, 4.359f, 7.278f, 4.359f, 7.278f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0093E1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.932f, 6.462f)
                horizontalLineTo(16.597f)
                curveTo(16.597f, 6.462f, 16.88f, 6.462f, 16.911f, 6.735f)
                curveTo(16.911f, 6.735f, 16.917f, 9.044f, 16.911f, 9.225f)
                curveTo(16.904f, 9.407f, 16.597f, 9.468f, 16.597f, 9.468f)
                curveTo(16.597f, 9.468f, 18.217f, 9.473f, 17.932f, 9.468f)
                curveTo(17.648f, 9.463f, 17.585f, 9.225f, 17.585f, 9.225f)
                verticalLineTo(6.735f)
                curveTo(17.585f, 6.524f, 17.932f, 6.462f, 17.932f, 6.462f)
                close()
                moveTo(2.853f, 9.283f)
                curveTo(2.702f, 8.893f, 1.769f, 6.503f, 1.769f, 6.503f)
                horizontalLineTo(2.693f)
                curveTo(2.532f, 6.503f, 2.473f, 6.707f, 2.473f, 6.707f)
                lineTo(3.12f, 8.553f)
                curveTo(3.12f, 8.553f, 3.746f, 7.046f, 3.746f, 6.779f)
                curveTo(3.746f, 6.511f, 3.483f, 6.503f, 3.483f, 6.503f)
                horizontalLineTo(4.688f)
                lineTo(4.397f, 6.6f)
                curveTo(4.397f, 6.6f, 3.433f, 8.81f, 3.433f, 9.283f)
                curveTo(3.387f, 9.388f, 3.877f, 9.458f, 3.877f, 9.458f)
                horizontalLineTo(2.583f)
                lineTo(2.853f, 9.283f)
                close()
                moveTo(13.917f, 8.41f)
                lineTo(14.633f, 7.091f)
                lineTo(14.654f, 8.559f)
                lineTo(14.432f, 8.487f)
                lineTo(14.275f, 9.467f)
                lineTo(15.066f, 7.949f)
                lineTo(14.803f, 7.85f)
                lineTo(15.783f, 6.789f)
                lineTo(15.449f, 8.223f)
                lineTo(15.259f, 8.055f)
                lineTo(14.136f, 10.151f)
                lineTo(15.39f, 8.715f)
                lineTo(15.148f, 8.594f)
                lineTo(16.386f, 7.784f)
                lineTo(15.847f, 9.104f)
                lineTo(15.546f, 8.888f)
                lineTo(14.275f, 10.489f)
                lineTo(13.747f, 10.286f)
                lineTo(14.275f, 8.41f)
                horizontalLineTo(13.917f)
                close()
                moveTo(13.503f, 10.913f)
                horizontalLineTo(13.107f)
                verticalLineTo(11.214f)
                horizontalLineTo(12.795f)
                lineTo(11.913f, 12.238f)
                horizontalLineTo(12.4f)
                lineTo(12.569f, 12.814f)
                lineTo(12.795f, 12.611f)
                verticalLineTo(12.814f)
                lineTo(13.238f, 12.611f)
                lineTo(13.661f, 12.977f)
                lineTo(13.977f, 11.569f)
                lineTo(13.764f, 11.413f)
                lineTo(13.873f, 11.318f)
                lineTo(13.764f, 10.913f)
                horizontalLineTo(13.503f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.715f, 5.008f)
                curveTo(7.715f, 5.008f, 8.296f, 5.41f, 8.878f, 5.41f)
                curveTo(9.46f, 5.41f, 10.041f, 5.008f, 10.041f, 5.008f)
                curveTo(10.041f, 5.008f, 10.623f, 5.41f, 11.204f, 5.41f)
                curveTo(11.786f, 5.41f, 12.368f, 5.008f, 12.368f, 5.008f)
                verticalLineTo(6.821f)
                curveTo(12.368f, 8.696f, 10.041f, 10.149f, 10.041f, 10.149f)
                curveTo(10.041f, 10.149f, 7.602f, 8.815f, 7.715f, 6.799f)
                verticalLineTo(5.008f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.715f, 5.008f)
                curveTo(7.715f, 5.008f, 8.296f, 5.41f, 8.878f, 5.41f)
                curveTo(9.46f, 5.41f, 10.041f, 5.008f, 10.041f, 5.008f)
                curveTo(10.041f, 5.008f, 10.623f, 5.41f, 11.204f, 5.41f)
                curveTo(11.786f, 5.41f, 12.368f, 5.008f, 12.368f, 5.008f)
                verticalLineTo(6.821f)
                curveTo(12.368f, 8.696f, 10.041f, 10.149f, 10.041f, 10.149f)
                curveTo(10.041f, 10.149f, 7.602f, 8.815f, 7.715f, 6.799f)
                verticalLineTo(5.008f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.55f, 4.888f)
                horizontalLineTo(12.45f)
                verticalLineTo(6.775f)
                horizontalLineTo(7.55f)
                verticalLineTo(4.888f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.497f, 6.775f)
                horizontalLineTo(8.085f)
                verticalLineTo(10.59f)
                horizontalLineTo(8.497f)
                verticalLineTo(6.775f)
                close()
                moveTo(9.197f, 6.775f)
                horizontalLineTo(8.785f)
                verticalLineTo(10.59f)
                horizontalLineTo(9.197f)
                verticalLineTo(6.775f)
                close()
                moveTo(9.485f, 6.775f)
                horizontalLineTo(9.897f)
                verticalLineTo(10.59f)
                horizontalLineTo(9.485f)
                verticalLineTo(6.775f)
                close()
                moveTo(10.597f, 6.775f)
                horizontalLineTo(10.185f)
                verticalLineTo(10.59f)
                horizontalLineTo(10.597f)
                verticalLineTo(6.775f)
                close()
                moveTo(10.885f, 6.775f)
                horizontalLineTo(11.297f)
                verticalLineTo(10.59f)
                horizontalLineTo(10.885f)
                verticalLineTo(6.775f)
                close()
                moveTo(11.997f, 6.775f)
                horizontalLineTo(11.585f)
                verticalLineTo(10.59f)
                horizontalLineTo(11.997f)
                verticalLineTo(6.775f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UsVirginIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.UsVirginIslands,
            contentDescription = "US Virgin Islands Flag"
        )
    }
}
