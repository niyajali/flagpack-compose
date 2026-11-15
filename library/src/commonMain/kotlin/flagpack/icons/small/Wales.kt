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
 * Wales Flag (16x12dp)
 *
 * - ISO Alpha-2: GB-WLS
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Wales: ImageVector by lazy {
    ImageVector.Builder(
        name = "Wales:GB-WLS:::Small",
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
                fill = SolidColor(Color(0xFF5DAA22)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD21034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.346f, 4.454f)
                curveTo(7.337f, 4.169f, 7.328f, 3.895f, 7.68f, 3.567f)
                curveTo(8.596f, 2.753f, 9.529f, 2.114f, 10.57f, 1.5f)
                curveTo(10.359f, 1.876f, 10.208f, 2.575f, 10.762f, 2.619f)
                curveTo(10.94f, 2.622f, 12.887f, 1.748f, 12.887f, 1.748f)
                curveTo(12.21f, 2.275f, 11.431f, 3.011f, 12.335f, 3.329f)
                curveTo(11.505f, 3.604f, 10.817f, 4.499f, 11.42f, 5.22f)
                curveTo(10.989f, 5.089f, 10.424f, 5.386f, 10.322f, 5.72f)
                curveTo(10.428f, 5.719f, 10.616f, 5.735f, 10.845f, 5.756f)
                curveTo(11.674f, 5.829f, 13.054f, 5.95f, 13.123f, 5.473f)
                curveTo(12.676f, 5.706f, 11.902f, 5.611f, 11.878f, 4.943f)
                curveTo(11.884f, 4.37f, 12.691f, 4.048f, 13.378f, 4.477f)
                curveTo(13.414f, 4.4f, 13.449f, 4.323f, 13.483f, 4.246f)
                curveTo(13.519f, 4.168f, 13.554f, 4.089f, 13.59f, 4.011f)
                curveTo(13.338f, 4.044f, 12.976f, 4.059f, 12.716f, 3.994f)
                curveTo(13.245f, 3.459f, 14.049f, 2.415f, 14.5f, 1.821f)
                curveTo(14.401f, 2.562f, 14.464f, 4.248f, 14.636f, 4.599f)
                curveTo(14.427f, 4.519f, 14.058f, 4.264f, 13.943f, 4.017f)
                lineTo(13.699f, 4.827f)
                curveTo(14.093f, 5.68f, 13.671f, 6.945f, 13.448f, 7.613f)
                curveTo(13.379f, 7.821f, 13.329f, 7.971f, 13.329f, 8.032f)
                curveTo(13.148f, 8.105f, 13.016f, 7.992f, 12.883f, 7.879f)
                curveTo(12.817f, 7.822f, 12.751f, 7.766f, 12.679f, 7.733f)
                curveTo(12.792f, 8.048f, 12.712f, 8.547f, 12.641f, 8.983f)
                curveTo(12.615f, 9.147f, 12.59f, 9.302f, 12.577f, 9.435f)
                curveTo(12.558f, 9.628f, 12.638f, 9.763f, 12.677f, 9.828f)
                curveTo(12.685f, 9.843f, 12.692f, 9.855f, 12.695f, 9.862f)
                curveTo(12.802f, 9.907f, 13.052f, 10.029f, 13.069f, 10.046f)
                curveTo(13.069f, 10.046f, 13.378f, 10.062f, 13.358f, 10.395f)
                curveTo(13.207f, 10.2f, 13.002f, 10.262f, 13.002f, 10.262f)
                curveTo(12.976f, 10.28f, 12.742f, 10.201f, 12.742f, 10.201f)
                curveTo(12.625f, 10.118f, 12.291f, 10.047f, 11.945f, 10.062f)
                curveTo(11.72f, 10.072f, 11.447f, 10.146f, 11.397f, 10.16f)
                curveTo(11.392f, 10.161f, 11.389f, 10.162f, 11.389f, 10.162f)
                curveTo(11.384f, 10.162f, 11.103f, 10.362f, 11.103f, 10.362f)
                curveTo(11.103f, 10.362f, 11.035f, 10.345f, 11.03f, 10.345f)
                lineTo(11.03f, 10.345f)
                curveTo(11.019f, 10.345f, 10.844f, 10.343f, 10.614f, 10.5f)
                curveTo(10.646f, 10.324f, 10.766f, 10.177f, 10.921f, 10.09f)
                curveTo(11.029f, 10.03f, 11.158f, 10.001f, 11.239f, 9.983f)
                curveTo(11.265f, 9.977f, 11.287f, 9.972f, 11.3f, 9.968f)
                curveTo(11.207f, 9.934f, 11.029f, 9.887f, 10.904f, 9.899f)
                curveTo(10.872f, 9.902f, 10.828f, 9.903f, 10.778f, 9.904f)
                curveTo(10.601f, 9.908f, 10.352f, 9.914f, 10.286f, 10.029f)
                curveTo(10.281f, 9.894f, 10.417f, 9.741f, 10.57f, 9.668f)
                curveTo(10.647f, 9.632f, 10.73f, 9.621f, 10.787f, 9.614f)
                curveTo(10.826f, 9.609f, 10.852f, 9.605f, 10.857f, 9.597f)
                curveTo(10.888f, 9.54f, 10.786f, 9.45f, 10.753f, 9.422f)
                curveTo(10.748f, 9.417f, 10.744f, 9.414f, 10.744f, 9.413f)
                curveTo(10.744f, 9.408f, 10.552f, 9.284f, 10.416f, 9.424f)
                curveTo(10.443f, 9.13f, 10.878f, 9.126f, 10.921f, 9.169f)
                curveTo(10.964f, 9.214f, 11.006f, 9.258f, 11.048f, 9.302f)
                curveTo(11.091f, 9.347f, 11.133f, 9.391f, 11.176f, 9.435f)
                curveTo(11.215f, 9.461f, 11.254f, 9.488f, 11.293f, 9.514f)
                curveTo(11.334f, 9.542f, 11.375f, 9.569f, 11.415f, 9.597f)
                curveTo(11.547f, 9.658f, 11.887f, 9.609f, 12.059f, 9.413f)
                curveTo(12.16f, 9.299f, 12.162f, 9.085f, 12.163f, 8.976f)
                curveTo(12.163f, 8.958f, 12.163f, 8.942f, 12.164f, 8.931f)
                curveTo(12.166f, 8.899f, 12.169f, 8.857f, 12.172f, 8.809f)
                curveTo(12.189f, 8.579f, 12.217f, 8.202f, 12.164f, 8.018f)
                curveTo(12.141f, 7.936f, 11.947f, 7.946f, 11.698f, 7.959f)
                curveTo(11.447f, 7.972f, 11.141f, 7.988f, 10.895f, 7.916f)
                curveTo(10.507f, 7.802f, 10.115f, 7.575f, 9.878f, 7.437f)
                curveTo(9.758f, 7.367f, 9.678f, 7.321f, 9.657f, 7.323f)
                curveTo(9.642f, 7.348f, 9.611f, 7.373f, 9.575f, 7.402f)
                curveTo(9.517f, 7.448f, 9.447f, 7.505f, 9.412f, 7.59f)
                curveTo(9.325f, 7.802f, 9.342f, 8.103f, 9.412f, 8.182f)
                curveTo(9.412f, 8.182f, 10.023f, 8.187f, 10.16f, 8.263f)
                curveTo(10.502f, 8.454f, 10.481f, 8.738f, 10.471f, 8.884f)
                curveTo(10.469f, 8.902f, 10.468f, 8.918f, 10.468f, 8.931f)
                curveTo(10.332f, 8.887f, 10.092f, 8.796f, 9.96f, 8.746f)
                curveTo(9.939f, 8.738f, 9.921f, 8.731f, 9.907f, 8.726f)
                curveTo(9.571f, 9.303f, 9.094f, 9.708f, 8.413f, 9.895f)
                curveTo(8.488f, 9.933f, 8.638f, 9.968f, 8.761f, 9.996f)
                curveTo(8.85f, 10.016f, 8.924f, 10.033f, 8.944f, 10.046f)
                curveTo(9.146f, 10.091f, 9.289f, 10.159f, 9.287f, 10.362f)
                curveTo(9.152f, 10.201f, 9.02f, 10.205f, 8.913f, 10.284f)
                curveTo(8.769f, 10.348f, 8.666f, 10.276f, 8.563f, 10.204f)
                curveTo(8.511f, 10.167f, 8.46f, 10.131f, 8.403f, 10.112f)
                curveTo(8.259f, 10.001f, 7.687f, 10.069f, 7.524f, 10.09f)
                curveTo(7.321f, 10.112f, 7.089f, 10.167f, 6.988f, 10.289f)
                curveTo(6.936f, 10.333f, 6.909f, 10.293f, 6.896f, 10.275f)
                curveTo(6.893f, 10.269f, 6.89f, 10.266f, 6.889f, 10.267f)
                curveTo(6.655f, 10.187f, 6.551f, 10.406f, 6.551f, 10.406f)
                curveTo(6.496f, 10.152f, 6.616f, 10.098f, 6.743f, 10.062f)
                lineTo(6.483f, 9.901f)
                curveTo(6.478f, 9.87f, 6.305f, 9.835f, 6.192f, 9.945f)
                curveTo(6.202f, 9.714f, 6.47f, 9.57f, 6.582f, 9.646f)
                curveTo(6.664f, 9.582f, 6.811f, 9.571f, 6.92f, 9.668f)
                curveTo(7.043f, 9.767f, 7.229f, 9.78f, 7.352f, 9.741f)
                curveTo(7.299f, 9.584f, 7.13f, 9.492f, 7.035f, 9.486f)
                curveTo(7.006f, 9.478f, 6.975f, 9.452f, 6.94f, 9.421f)
                curveTo(6.904f, 9.389f, 6.862f, 9.353f, 6.812f, 9.33f)
                curveTo(6.688f, 9.274f, 6.531f, 9.273f, 6.457f, 9.33f)
                curveTo(6.505f, 9.044f, 7.035f, 8.964f, 7.248f, 9.297f)
                curveTo(7.376f, 9.436f, 7.574f, 9.508f, 7.737f, 9.535f)
                curveTo(8.036f, 9.499f, 8.339f, 9.248f, 8.53f, 9.089f)
                curveTo(8.603f, 9.028f, 8.66f, 8.981f, 8.694f, 8.964f)
                curveTo(8.694f, 8.964f, 8.15f, 8.404f, 7.737f, 8.115f)
                curveTo(7.352f, 7.845f, 6.249f, 8.369f, 6.1f, 8.44f)
                curveTo(6.089f, 8.445f, 6.083f, 8.448f, 6.083f, 8.448f)
                curveTo(6.056f, 8.699f, 5.869f, 8.931f, 5.869f, 8.931f)
                curveTo(5.838f, 8.849f, 5.799f, 8.774f, 5.762f, 8.701f)
                curveTo(5.687f, 8.557f, 5.617f, 8.421f, 5.625f, 8.263f)
                curveTo(5.423f, 8.542f, 5.278f, 8.692f, 5.132f, 8.84f)
                curveTo(5.058f, 8.917f, 4.984f, 8.993f, 4.902f, 9.086f)
                curveTo(4.707f, 9.3f, 4.607f, 9.551f, 4.538f, 9.829f)
                curveTo(4.684f, 9.918f, 5.09f, 9.996f, 5.09f, 9.996f)
                curveTo(5.267f, 10f, 5.398f, 10.104f, 5.396f, 10.301f)
                curveTo(5.238f, 10.126f, 5.079f, 10.234f, 5.079f, 10.234f)
                curveTo(4.949f, 10.349f, 4.784f, 10.297f, 4.626f, 10.234f)
                curveTo(4.489f, 10.078f, 3.827f, 10.03f, 3.513f, 10.218f)
                curveTo(3.289f, 10.435f, 2.978f, 10.455f, 2.894f, 10.323f)
                curveTo(2.894f, 10.323f, 2.754f, 10.317f, 2.509f, 10.406f)
                curveTo(2.571f, 10.001f, 2.805f, 10.112f, 2.805f, 10.112f)
                curveTo(2.804f, 10.091f, 2.805f, 10.076f, 2.805f, 10.062f)
                curveTo(2.806f, 10.048f, 2.807f, 10.034f, 2.805f, 10.012f)
                lineTo(2.717f, 9.979f)
                curveTo(2.559f, 9.905f, 2.363f, 9.923f, 2.275f, 10.001f)
                curveTo(2.335f, 9.736f, 2.566f, 9.734f, 2.738f, 9.763f)
                curveTo(2.761f, 9.736f, 2.776f, 9.688f, 2.79f, 9.644f)
                curveTo(2.795f, 9.627f, 2.8f, 9.611f, 2.805f, 9.597f)
                curveTo(2.797f, 9.588f, 2.789f, 9.579f, 2.781f, 9.57f)
                curveTo(2.692f, 9.473f, 2.592f, 9.364f, 2.482f, 9.461f)
                curveTo(2.587f, 9.007f, 3.109f, 9.354f, 3.29f, 9.475f)
                curveTo(3.307f, 9.486f, 3.321f, 9.496f, 3.331f, 9.502f)
                curveTo(3.701f, 9.634f, 4.663f, 8.124f, 4.71f, 8.018f)
                curveTo(4.436f, 8.005f, 4.129f, 8.035f, 3.914f, 8.115f)
                curveTo(3.853f, 8.314f, 3.745f, 8.418f, 3.618f, 8.54f)
                curveTo(3.597f, 8.56f, 3.575f, 8.581f, 3.553f, 8.603f)
                curveTo(3.556f, 8.032f, 3.303f, 7.744f, 2.94f, 7.332f)
                curveTo(2.92f, 7.309f, 2.899f, 7.285f, 2.878f, 7.262f)
                curveTo(2.424f, 6.944f, 2.223f, 6.305f, 2.187f, 6.096f)
                curveTo(2.117f, 6.291f, 2.066f, 6.35f, 2.05f, 6.368f)
                curveTo(2.047f, 6.371f, 2.046f, 6.373f, 2.046f, 6.374f)
                curveTo(1.945f, 6.491f, 1.636f, 6.459f, 1.705f, 6.413f)
                curveTo(1.748f, 6.404f, 1.952f, 6.08f, 1.952f, 6.08f)
                lineTo(2.041f, 5.209f)
                curveTo(1.975f, 5.18f, 1.925f, 5.051f, 1.865f, 4.895f)
                curveTo(1.846f, 4.845f, 1.825f, 4.791f, 1.802f, 4.738f)
                curveTo(1.705f, 4.507f, 1.576f, 4.271f, 1.5f, 4.25f)
                curveTo(1.644f, 4.223f, 1.833f, 4.22f, 1.952f, 4.364f)
                curveTo(2.058f, 4.491f, 2.095f, 4.589f, 2.127f, 4.673f)
                curveTo(2.145f, 4.72f, 2.161f, 4.762f, 2.187f, 4.802f)
                curveTo(2.137f, 4.675f, 2.174f, 4.587f, 2.232f, 4.448f)
                curveTo(2.257f, 4.391f, 2.284f, 4.325f, 2.311f, 4.244f)
                curveTo(2.311f, 4.231f, 2.311f, 4.219f, 2.312f, 4.207f)
                curveTo(2.313f, 4.08f, 2.314f, 4.002f, 2.187f, 3.923f)
                curveTo(2.441f, 3.916f, 2.509f, 4.114f, 2.529f, 4.173f)
                curveTo(2.532f, 4.181f, 2.534f, 4.187f, 2.535f, 4.188f)
                curveTo(2.646f, 4.342f, 2.6f, 4.468f, 2.563f, 4.569f)
                curveTo(2.539f, 4.636f, 2.519f, 4.692f, 2.551f, 4.738f)
                curveTo(2.57f, 4.722f, 2.586f, 4.7f, 2.602f, 4.678f)
                curveTo(2.634f, 4.634f, 2.666f, 4.59f, 2.723f, 4.599f)
                curveTo(2.794f, 4.516f, 2.848f, 4.426f, 2.842f, 4.239f)
                curveTo(3.021f, 4.348f, 2.978f, 4.508f, 2.92f, 4.665f)
                curveTo(2.931f, 4.901f, 2.9f, 4.965f, 2.754f, 5.048f)
                curveTo(2.607f, 5.141f, 2.58f, 5.218f, 2.597f, 5.331f)
                curveTo(2.628f, 5.367f, 2.65f, 5.442f, 2.677f, 5.539f)
                curveTo(2.721f, 5.694f, 2.78f, 5.904f, 2.92f, 6.096f)
                curveTo(3.126f, 6.381f, 3.456f, 6.641f, 3.626f, 6.776f)
                curveTo(3.681f, 6.818f, 3.718f, 6.848f, 3.731f, 6.862f)
                curveTo(3.753f, 6.828f, 3.84f, 6.755f, 3.924f, 6.685f)
                curveTo(3.974f, 6.644f, 4.023f, 6.603f, 4.054f, 6.573f)
                curveTo(3.951f, 6.488f, 4.021f, 5.72f, 4.229f, 5.02f)
                curveTo(4.429f, 4.349f, 4.764f, 3.744f, 4.829f, 3.734f)
                curveTo(4.829f, 3.728f, 4.741f, 3.512f, 4.741f, 3.512f)
                curveTo(4.741f, 3.512f, 4.317f, 3.58f, 4.242f, 3.994f)
                curveTo(4.189f, 3.908f, 4.137f, 3.779f, 4.137f, 3.779f)
                curveTo(4.137f, 3.779f, 3.769f, 4.261f, 3.764f, 4.25f)
                curveTo(3.66f, 4.183f, 3.619f, 3.906f, 3.589f, 3.7f)
                curveTo(3.577f, 3.615f, 3.566f, 3.542f, 3.553f, 3.501f)
                curveTo(3.354f, 3.492f, 3.206f, 3.482f, 3.057f, 3.473f)
                curveTo(2.908f, 3.464f, 2.76f, 3.455f, 2.561f, 3.446f)
                curveTo(2.561f, 3.446f, 2.597f, 3.756f, 2.597f, 3.751f)
                curveTo(2.456f, 3.753f, 1.5f, 2.915f, 1.562f, 2.275f)
                curveTo(1.914f, 2.571f, 2.463f, 2.921f, 2.863f, 3.007f)
                curveTo(2.81f, 3.035f, 2.758f, 3.062f, 2.705f, 3.09f)
                curveTo(2.652f, 3.118f, 2.599f, 3.146f, 2.546f, 3.174f)
                curveTo(3.642f, 3.274f, 4.777f, 3.057f, 4.772f, 3.052f)
                curveTo(4.649f, 2.779f, 4.247f, 2.78f, 4.247f, 2.78f)
                lineTo(4.229f, 3.007f)
                curveTo(4.229f, 3.007f, 3.729f, 3.035f, 3.726f, 3.029f)
                curveTo(3.675f, 2.752f, 3.43f, 2.747f, 3.43f, 2.747f)
                curveTo(3.237f, 2.721f, 3.073f, 2.741f, 2.909f, 2.761f)
                curveTo(2.827f, 2.771f, 2.746f, 2.781f, 2.66f, 2.785f)
                curveTo(2.979f, 2.359f, 3.399f, 2.327f, 3.82f, 2.295f)
                curveTo(3.897f, 2.289f, 3.973f, 2.283f, 4.049f, 2.275f)
                curveTo(4.085f, 2.051f, 4.27f, 1.986f, 4.486f, 1.954f)
                curveTo(4.486f, 1.954f, 5.5f, 2.009f, 5.505f, 2.009f)
                curveTo(5.636f, 1.825f, 6.53f, 1.5f, 6.743f, 1.5f)
                curveTo(6.71f, 1.752f, 6.271f, 2.189f, 6.153f, 2.27f)
                curveTo(6.034f, 2.463f, 6.044f, 2.483f, 6.09f, 2.569f)
                curveTo(6.094f, 2.578f, 6.099f, 2.587f, 6.104f, 2.597f)
                curveTo(6.124f, 2.634f, 6.136f, 2.653f, 6.148f, 2.672f)
                curveTo(6.16f, 2.691f, 6.172f, 2.71f, 6.192f, 2.747f)
                curveTo(6.386f, 2.671f, 6.681f, 3.032f, 6.726f, 3.174f)
                curveTo(6.508f, 3.146f, 6.241f, 3.133f, 6.244f, 3.235f)
                curveTo(6.247f, 3.285f, 6.324f, 3.316f, 6.394f, 3.345f)
                curveTo(6.428f, 3.359f, 6.46f, 3.372f, 6.482f, 3.387f)
                curveTo(6.608f, 3.512f, 6.649f, 3.623f, 6.655f, 3.779f)
                curveTo(6.602f, 3.775f, 6.542f, 3.745f, 6.483f, 3.714f)
                curveTo(6.365f, 3.653f, 6.246f, 3.592f, 6.171f, 3.751f)
                curveTo(6.118f, 3.867f, 6.16f, 3.942f, 6.3f, 3.994f)
                curveTo(6.557f, 4.069f, 6.726f, 4.355f, 6.726f, 4.516f)
                curveTo(6.726f, 4.595f, 6.608f, 4.533f, 6.47f, 4.462f)
                curveTo(6.325f, 4.387f, 6.16f, 4.302f, 6.087f, 4.355f)
                curveTo(6f, 4.418f, 6.056f, 4.738f, 6.082f, 4.888f)
                curveTo(6.087f, 4.918f, 6.091f, 4.941f, 6.093f, 4.954f)
                curveTo(6.121f, 5.194f, 6.159f, 5.444f, 6.176f, 5.498f)
                curveTo(6.337f, 5.463f, 6.498f, 5.428f, 6.659f, 5.393f)
                curveTo(6.824f, 5.358f, 6.99f, 5.322f, 7.154f, 5.287f)
                curveTo(7.297f, 5.148f, 7.361f, 4.918f, 7.347f, 4.671f)
                curveTo(7.35f, 4.597f, 7.348f, 4.525f, 7.346f, 4.454f)
                close()
                moveTo(13.085f, 5.027f)
                curveTo(12.936f, 4.858f, 12.783f, 4.8f, 12.655f, 4.802f)
                curveTo(12.469f, 4.805f, 12.336f, 4.935f, 12.349f, 5.034f)
                curveTo(12.39f, 5.36f, 13.013f, 5.247f, 13.085f, 5.027f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun WalesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Wales,
            contentDescription = "Wales Flag"
        )
    }
}
