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
 * Wales Flag (20x15dp)
 *
 * - ISO Alpha-2: GB-WLS
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Wales: ImageVector by lazy {
    ImageVector.Builder(
        name = "Wales:GB-WLS:::Medium",
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
                fill = SolidColor(Color(0xFF5DAA22)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD21034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.195f, 5.61f)
                curveTo(9.184f, 5.262f, 9.173f, 4.927f, 9.606f, 4.527f)
                curveTo(10.734f, 3.532f, 11.881f, 2.751f, 13.163f, 2f)
                curveTo(12.904f, 2.46f, 12.718f, 3.314f, 13.399f, 3.368f)
                curveTo(13.618f, 3.372f, 16.015f, 2.304f, 16.015f, 2.304f)
                curveTo(15.181f, 2.948f, 14.222f, 3.846f, 15.336f, 4.235f)
                curveTo(14.314f, 4.572f, 13.467f, 5.666f, 14.209f, 6.547f)
                curveTo(13.679f, 6.387f, 12.983f, 6.749f, 12.858f, 7.157f)
                curveTo(12.989f, 7.156f, 13.219f, 7.177f, 13.501f, 7.201f)
                curveTo(14.522f, 7.291f, 16.22f, 7.439f, 16.305f, 6.856f)
                curveTo(15.755f, 7.141f, 14.802f, 7.025f, 14.773f, 6.208f)
                curveTo(14.78f, 5.508f, 15.774f, 5.115f, 16.62f, 5.639f)
                curveTo(16.663f, 5.545f, 16.706f, 5.45f, 16.749f, 5.356f)
                curveTo(16.792f, 5.26f, 16.836f, 5.165f, 16.88f, 5.069f)
                curveTo(16.842f, 5.074f, 16.805f, 5.079f, 16.769f, 5.084f)
                curveTo(16.502f, 5.121f, 16.252f, 5.156f, 15.97f, 5.086f)
                curveTo(16.621f, 4.432f, 17.234f, 3.788f, 17.788f, 3.063f)
                curveTo(17.666f, 3.967f, 17.788f, 5.278f, 18f, 5.706f)
                curveTo(17.743f, 5.609f, 17.456f, 5.378f, 17.314f, 5.076f)
                curveTo(17.264f, 5.241f, 17.214f, 5.406f, 17.164f, 5.571f)
                curveTo(17.114f, 5.736f, 17.064f, 5.901f, 17.014f, 6.066f)
                curveTo(17.499f, 7.109f, 16.98f, 8.655f, 16.706f, 9.471f)
                curveTo(16.621f, 9.725f, 16.559f, 9.909f, 16.559f, 9.984f)
                curveTo(16.336f, 10.072f, 16.173f, 9.934f, 16.01f, 9.796f)
                curveTo(15.929f, 9.727f, 15.847f, 9.658f, 15.758f, 9.618f)
                curveTo(15.898f, 10.003f, 15.799f, 10.613f, 15.712f, 11.146f)
                curveTo(15.679f, 11.346f, 15.649f, 11.536f, 15.633f, 11.698f)
                curveTo(15.61f, 11.934f, 15.708f, 12.099f, 15.756f, 12.179f)
                curveTo(15.767f, 12.197f, 15.775f, 12.211f, 15.778f, 12.22f)
                curveTo(15.911f, 12.275f, 16.218f, 12.424f, 16.239f, 12.445f)
                curveTo(16.239f, 12.445f, 16.62f, 12.465f, 16.595f, 12.872f)
                curveTo(16.409f, 12.633f, 16.156f, 12.708f, 16.156f, 12.708f)
                curveTo(16.124f, 12.731f, 15.836f, 12.635f, 15.836f, 12.635f)
                curveTo(15.692f, 12.533f, 15.282f, 12.447f, 14.856f, 12.465f)
                curveTo(14.578f, 12.477f, 14.243f, 12.567f, 14.181f, 12.584f)
                curveTo(14.175f, 12.586f, 14.171f, 12.587f, 14.171f, 12.587f)
                curveTo(14.165f, 12.587f, 13.819f, 12.831f, 13.819f, 12.831f)
                curveTo(13.819f, 12.831f, 13.736f, 12.811f, 13.729f, 12.811f)
                lineTo(13.729f, 12.811f)
                curveTo(13.715f, 12.811f, 13.5f, 12.808f, 13.217f, 13f)
                curveTo(13.257f, 12.785f, 13.404f, 12.605f, 13.595f, 12.499f)
                curveTo(13.729f, 12.426f, 13.887f, 12.39f, 13.986f, 12.368f)
                curveTo(14.019f, 12.361f, 14.045f, 12.355f, 14.062f, 12.35f)
                curveTo(13.947f, 12.309f, 13.728f, 12.25f, 13.574f, 12.265f)
                curveTo(13.534f, 12.269f, 13.48f, 12.27f, 13.42f, 12.272f)
                curveTo(13.202f, 12.276f, 12.895f, 12.283f, 12.814f, 12.424f)
                curveTo(12.808f, 12.259f, 12.975f, 12.072f, 13.163f, 11.983f)
                curveTo(13.257f, 11.939f, 13.36f, 11.926f, 13.43f, 11.917f)
                curveTo(13.478f, 11.911f, 13.511f, 11.906f, 13.517f, 11.896f)
                curveTo(13.555f, 11.827f, 13.428f, 11.717f, 13.389f, 11.682f)
                curveTo(13.382f, 11.676f, 13.377f, 11.672f, 13.377f, 11.672f)
                curveTo(13.377f, 11.665f, 13.141f, 11.514f, 12.974f, 11.686f)
                curveTo(13.006f, 11.326f, 13.542f, 11.321f, 13.595f, 11.374f)
                curveTo(13.647f, 11.428f, 13.7f, 11.482f, 13.752f, 11.536f)
                curveTo(13.804f, 11.59f, 13.856f, 11.644f, 13.909f, 11.698f)
                curveTo(13.957f, 11.731f, 14.005f, 11.763f, 14.054f, 11.795f)
                curveTo(14.103f, 11.829f, 14.153f, 11.863f, 14.203f, 11.896f)
                curveTo(14.365f, 11.972f, 14.784f, 11.91f, 14.996f, 11.672f)
                curveTo(15.12f, 11.532f, 15.123f, 11.27f, 15.124f, 11.137f)
                curveTo(15.124f, 11.115f, 15.124f, 11.096f, 15.125f, 11.082f)
                curveTo(15.127f, 11.043f, 15.131f, 10.992f, 15.135f, 10.933f)
                curveTo(15.156f, 10.653f, 15.189f, 10.191f, 15.125f, 9.967f)
                curveTo(15.096f, 9.866f, 14.858f, 9.878f, 14.551f, 9.894f)
                curveTo(14.243f, 9.91f, 13.866f, 9.93f, 13.563f, 9.842f)
                curveTo(13.085f, 9.703f, 12.603f, 9.425f, 12.311f, 9.256f)
                curveTo(12.164f, 9.171f, 12.065f, 9.114f, 12.039f, 9.117f)
                curveTo(12.021f, 9.147f, 11.983f, 9.178f, 11.939f, 9.213f)
                curveTo(11.868f, 9.27f, 11.781f, 9.339f, 11.738f, 9.443f)
                curveTo(11.631f, 9.703f, 11.651f, 10.071f, 11.738f, 10.167f)
                curveTo(11.738f, 10.167f, 12.49f, 10.173f, 12.659f, 10.266f)
                curveTo(13.08f, 10.499f, 13.054f, 10.847f, 13.041f, 11.025f)
                curveTo(13.039f, 11.047f, 13.038f, 11.066f, 13.038f, 11.082f)
                curveTo(12.87f, 11.029f, 12.575f, 10.917f, 12.412f, 10.856f)
                curveTo(12.387f, 10.846f, 12.365f, 10.838f, 12.347f, 10.831f)
                curveTo(11.933f, 11.537f, 11.346f, 12.032f, 10.508f, 12.261f)
                curveTo(10.601f, 12.307f, 10.786f, 12.349f, 10.936f, 12.384f)
                curveTo(11.046f, 12.409f, 11.137f, 12.429f, 11.162f, 12.445f)
                curveTo(11.411f, 12.5f, 11.586f, 12.583f, 11.584f, 12.831f)
                curveTo(11.418f, 12.634f, 11.255f, 12.639f, 11.123f, 12.736f)
                curveTo(10.946f, 12.815f, 10.82f, 12.726f, 10.693f, 12.638f)
                curveTo(10.629f, 12.594f, 10.566f, 12.549f, 10.496f, 12.526f)
                curveTo(10.319f, 12.391f, 9.615f, 12.474f, 9.414f, 12.499f)
                curveTo(9.164f, 12.525f, 8.879f, 12.593f, 8.755f, 12.743f)
                curveTo(8.691f, 12.796f, 8.657f, 12.747f, 8.641f, 12.725f)
                curveTo(8.637f, 12.718f, 8.634f, 12.714f, 8.633f, 12.716f)
                curveTo(8.345f, 12.617f, 8.217f, 12.885f, 8.217f, 12.885f)
                curveTo(8.149f, 12.575f, 8.296f, 12.509f, 8.453f, 12.465f)
                lineTo(8.133f, 12.269f)
                curveTo(8.127f, 12.23f, 7.913f, 12.187f, 7.775f, 12.322f)
                curveTo(7.787f, 12.04f, 8.117f, 11.863f, 8.255f, 11.957f)
                curveTo(8.355f, 11.879f, 8.537f, 11.864f, 8.671f, 11.983f)
                curveTo(8.822f, 12.104f, 9.051f, 12.12f, 9.202f, 12.072f)
                curveTo(9.137f, 11.881f, 8.929f, 11.768f, 8.812f, 11.76f)
                curveTo(8.777f, 11.751f, 8.739f, 11.719f, 8.696f, 11.682f)
                curveTo(8.651f, 11.642f, 8.599f, 11.598f, 8.538f, 11.57f)
                curveTo(8.385f, 11.501f, 8.192f, 11.5f, 8.101f, 11.57f)
                curveTo(8.159f, 11.221f, 8.812f, 11.123f, 9.074f, 11.53f)
                curveTo(9.232f, 11.7f, 9.476f, 11.788f, 9.676f, 11.821f)
                curveTo(10.045f, 11.777f, 10.417f, 11.47f, 10.653f, 11.275f)
                curveTo(10.742f, 11.201f, 10.812f, 11.144f, 10.854f, 11.123f)
                curveTo(10.854f, 11.123f, 10.184f, 10.438f, 9.676f, 10.085f)
                curveTo(9.202f, 9.755f, 7.845f, 10.396f, 7.661f, 10.482f)
                curveTo(7.648f, 10.489f, 7.641f, 10.492f, 7.64f, 10.492f)
                curveTo(7.608f, 10.799f, 7.377f, 11.082f, 7.377f, 11.082f)
                curveTo(7.339f, 10.983f, 7.291f, 10.891f, 7.245f, 10.801f)
                curveTo(7.153f, 10.625f, 7.067f, 10.459f, 7.077f, 10.266f)
                curveTo(6.829f, 10.607f, 6.649f, 10.79f, 6.47f, 10.972f)
                curveTo(6.379f, 11.065f, 6.287f, 11.158f, 6.187f, 11.271f)
                curveTo(5.947f, 11.533f, 5.824f, 11.84f, 5.739f, 12.18f)
                curveTo(5.918f, 12.289f, 6.418f, 12.384f, 6.418f, 12.384f)
                curveTo(6.636f, 12.388f, 6.797f, 12.516f, 6.795f, 12.756f)
                curveTo(6.6f, 12.543f, 6.405f, 12.675f, 6.405f, 12.675f)
                curveTo(6.245f, 12.816f, 6.042f, 12.752f, 5.847f, 12.675f)
                curveTo(5.679f, 12.485f, 4.865f, 12.426f, 4.478f, 12.655f)
                curveTo(4.202f, 12.92f, 3.82f, 12.944f, 3.715f, 12.783f)
                curveTo(3.715f, 12.783f, 3.543f, 12.777f, 3.242f, 12.885f)
                curveTo(3.319f, 12.39f, 3.607f, 12.526f, 3.607f, 12.526f)
                curveTo(3.604f, 12.5f, 3.606f, 12.482f, 3.607f, 12.465f)
                curveTo(3.608f, 12.448f, 3.609f, 12.43f, 3.607f, 12.404f)
                lineTo(3.498f, 12.363f)
                curveTo(3.303f, 12.273f, 3.063f, 12.295f, 2.954f, 12.39f)
                curveTo(3.028f, 12.066f, 3.312f, 12.064f, 3.524f, 12.099f)
                curveTo(3.552f, 12.066f, 3.57f, 12.008f, 3.587f, 11.954f)
                curveTo(3.594f, 11.933f, 3.6f, 11.913f, 3.607f, 11.896f)
                curveTo(3.597f, 11.885f, 3.587f, 11.874f, 3.576f, 11.863f)
                curveTo(3.467f, 11.744f, 3.344f, 11.611f, 3.209f, 11.73f)
                curveTo(3.338f, 11.175f, 3.98f, 11.6f, 4.203f, 11.747f)
                curveTo(4.224f, 11.761f, 4.241f, 11.773f, 4.254f, 11.781f)
                curveTo(4.709f, 11.942f, 5.893f, 10.095f, 5.951f, 9.967f)
                curveTo(5.614f, 9.951f, 5.235f, 9.988f, 4.971f, 10.085f)
                curveTo(4.896f, 10.328f, 4.763f, 10.455f, 4.606f, 10.605f)
                curveTo(4.58f, 10.629f, 4.554f, 10.655f, 4.527f, 10.681f)
                curveTo(4.531f, 9.984f, 4.219f, 9.632f, 3.772f, 9.127f)
                curveTo(3.747f, 9.099f, 3.722f, 9.071f, 3.696f, 9.042f)
                curveTo(3.137f, 8.654f, 2.89f, 7.873f, 2.845f, 7.618f)
                curveTo(2.759f, 7.856f, 2.696f, 7.928f, 2.678f, 7.949f)
                curveTo(2.674f, 7.954f, 2.672f, 7.956f, 2.672f, 7.957f)
                curveTo(2.548f, 8.1f, 2.167f, 8.061f, 2.253f, 8.004f)
                curveTo(2.306f, 7.993f, 2.557f, 7.597f, 2.557f, 7.597f)
                lineTo(2.666f, 6.534f)
                curveTo(2.6f, 6.505f, 2.57f, 6.402f, 2.531f, 6.265f)
                curveTo(2.507f, 6.178f, 2.478f, 6.079f, 2.435f, 5.975f)
                curveTo(2.315f, 5.693f, 2.093f, 5.387f, 2f, 5.361f)
                curveTo(2.177f, 5.328f, 2.41f, 5.325f, 2.557f, 5.5f)
                curveTo(2.685f, 5.654f, 2.77f, 5.898f, 2.838f, 6.09f)
                curveTo(2.877f, 6.2f, 2.909f, 6.294f, 2.941f, 6.344f)
                curveTo(2.827f, 5.955f, 2.885f, 5.693f, 2.998f, 5.354f)
                curveTo(2.998f, 5.338f, 2.999f, 5.323f, 2.999f, 5.308f)
                curveTo(3f, 5.153f, 3.001f, 5.058f, 2.845f, 4.961f)
                curveTo(3.158f, 4.953f, 3.241f, 5.195f, 3.266f, 5.266f)
                curveTo(3.27f, 5.277f, 3.272f, 5.284f, 3.274f, 5.286f)
                curveTo(3.41f, 5.474f, 3.354f, 5.628f, 3.309f, 5.751f)
                curveTo(3.279f, 5.833f, 3.254f, 5.901f, 3.293f, 5.957f)
                curveTo(3.316f, 5.939f, 3.336f, 5.912f, 3.356f, 5.885f)
                curveTo(3.395f, 5.831f, 3.435f, 5.777f, 3.505f, 5.788f)
                curveTo(3.592f, 5.686f, 3.658f, 5.576f, 3.652f, 5.348f)
                curveTo(3.872f, 5.481f, 3.819f, 5.677f, 3.748f, 5.869f)
                curveTo(3.761f, 6.156f, 3.723f, 6.235f, 3.543f, 6.337f)
                curveTo(3.363f, 6.45f, 3.329f, 6.544f, 3.35f, 6.682f)
                curveTo(3.389f, 6.726f, 3.415f, 6.818f, 3.449f, 6.937f)
                curveTo(3.503f, 7.126f, 3.576f, 7.382f, 3.748f, 7.618f)
                curveTo(4.001f, 7.965f, 4.408f, 8.284f, 4.617f, 8.448f)
                curveTo(4.684f, 8.5f, 4.73f, 8.537f, 4.746f, 8.554f)
                curveTo(4.773f, 8.511f, 4.881f, 8.422f, 4.983f, 8.338f)
                curveTo(5.045f, 8.287f, 5.105f, 8.237f, 5.143f, 8.201f)
                curveTo(5.017f, 8.096f, 5.103f, 7.158f, 5.359f, 6.302f)
                curveTo(5.605f, 5.482f, 6.018f, 4.743f, 6.097f, 4.731f)
                curveTo(6.097f, 4.724f, 5.988f, 4.459f, 5.988f, 4.459f)
                curveTo(5.988f, 4.459f, 5.467f, 4.542f, 5.374f, 5.049f)
                curveTo(5.31f, 4.943f, 5.246f, 4.785f, 5.246f, 4.785f)
                curveTo(5.246f, 4.785f, 4.792f, 5.374f, 4.786f, 5.361f)
                curveTo(4.606f, 5.245f, 4.687f, 4.961f, 4.687f, 4.961f)
                curveTo(4.6f, 4.86f, 4.582f, 4.741f, 4.563f, 4.622f)
                curveTo(4.554f, 4.562f, 4.545f, 4.503f, 4.527f, 4.446f)
                curveTo(4.282f, 4.434f, 4.099f, 4.423f, 3.916f, 4.412f)
                curveTo(3.733f, 4.401f, 3.55f, 4.389f, 3.306f, 4.378f)
                curveTo(3.306f, 4.378f, 3.472f, 4.703f, 3.472f, 4.696f)
                curveTo(3.299f, 4.7f, 2.452f, 3.933f, 2.288f, 3.28f)
                curveTo(2.716f, 3.636f, 3.172f, 3.734f, 3.657f, 3.838f)
                curveTo(3.663f, 3.839f, 3.67f, 3.841f, 3.677f, 3.842f)
                curveTo(3.612f, 3.876f, 3.548f, 3.91f, 3.483f, 3.943f)
                curveTo(3.418f, 3.978f, 3.352f, 4.012f, 3.287f, 4.046f)
                curveTo(4.636f, 4.169f, 6.033f, 3.903f, 6.027f, 3.897f)
                curveTo(5.876f, 3.563f, 5.38f, 3.565f, 5.38f, 3.565f)
                lineTo(5.359f, 3.769f)
                curveTo(5.359f, 3.769f, 4.743f, 3.876f, 4.74f, 3.869f)
                curveTo(4.677f, 3.53f, 4.375f, 3.524f, 4.375f, 3.524f)
                curveTo(4.138f, 3.492f, 3.936f, 3.516f, 3.735f, 3.541f)
                curveTo(3.634f, 3.553f, 3.533f, 3.566f, 3.428f, 3.571f)
                curveTo(3.82f, 3.05f, 4.337f, 3.011f, 4.855f, 2.972f)
                curveTo(4.95f, 2.965f, 5.044f, 2.958f, 5.137f, 2.948f)
                curveTo(5.182f, 2.674f, 5.409f, 2.594f, 5.675f, 2.555f)
                curveTo(5.675f, 2.555f, 6.923f, 2.622f, 6.929f, 2.622f)
                curveTo(7.09f, 2.397f, 8.038f, 2.196f, 8.3f, 2.196f)
                curveTo(8.259f, 2.504f, 7.872f, 2.842f, 7.727f, 2.941f)
                curveTo(7.58f, 3.177f, 7.593f, 3.201f, 7.649f, 3.307f)
                curveTo(7.654f, 3.317f, 7.66f, 3.328f, 7.666f, 3.341f)
                lineTo(7.814f, 3.612f)
                curveTo(8.063f, 3.693f, 8.244f, 3.805f, 8.3f, 3.978f)
                curveTo(8.031f, 3.944f, 7.835f, 3.996f, 7.839f, 4.12f)
                curveTo(7.843f, 4.181f, 7.937f, 4.22f, 8.024f, 4.255f)
                curveTo(8.065f, 4.272f, 8.105f, 4.288f, 8.132f, 4.306f)
                curveTo(8.287f, 4.459f, 8.338f, 4.595f, 8.345f, 4.785f)
                curveTo(8.279f, 4.781f, 8.206f, 4.744f, 8.133f, 4.706f)
                curveTo(7.987f, 4.632f, 7.841f, 4.557f, 7.749f, 4.751f)
                curveTo(7.683f, 4.893f, 7.756f, 5.086f, 7.929f, 5.15f)
                curveTo(8.245f, 5.242f, 8.274f, 5.7f, 8.268f, 5.7f)
                curveTo(8.267f, 5.7f, 8.264f, 5.698f, 8.258f, 5.696f)
                curveTo(8.185f, 5.662f, 7.743f, 5.457f, 7.775f, 5.876f)
                curveTo(7.773f, 5.908f, 7.753f, 5.931f, 7.73f, 5.958f)
                curveTo(7.688f, 6.007f, 7.634f, 6.07f, 7.652f, 6.221f)
                curveTo(7.688f, 6.515f, 7.734f, 6.821f, 7.755f, 6.886f)
                curveTo(7.954f, 6.844f, 8.152f, 6.801f, 8.35f, 6.759f)
                curveTo(8.553f, 6.715f, 8.756f, 6.671f, 8.959f, 6.628f)
                curveTo(9.135f, 6.459f, 9.214f, 6.178f, 9.196f, 5.876f)
                curveTo(9.201f, 5.786f, 9.198f, 5.697f, 9.195f, 5.61f)
                close()
                moveTo(16.258f, 6.311f)
                curveTo(16.075f, 6.104f, 15.886f, 6.034f, 15.729f, 6.036f)
                curveTo(15.5f, 6.039f, 15.337f, 6.199f, 15.352f, 6.319f)
                curveTo(15.403f, 6.718f, 16.17f, 6.58f, 16.258f, 6.311f)
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
            imageVector = FlagIcons.Medium.Wales,
            contentDescription = "Wales Flag"
        )
    }
}
