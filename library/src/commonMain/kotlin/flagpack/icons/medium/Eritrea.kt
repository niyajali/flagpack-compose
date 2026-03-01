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
 * Eritrea Flag (20x15dp)
 *
 * - ISO Alpha-2: ER
 * - ISO Alpha-3: ERI
 * - ISO Numeric: 232
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Eritrea: ImageVector by lazy {
    ImageVector.Builder(
        name = "Eritrea:ER:ERI:232:Medium",
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
                fill = SolidColor(Color(0xFF43B764)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20.25f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB4D7F4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                verticalLineTo(15f)
                horizontalLineTo(20.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBE0027)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(20.875f, 7.5f)
                lineTo(0f, 15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF3E294)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.063f, 11.572f)
                curveTo(5.141f, 11.493f, 5.241f, 11.422f, 5.367f, 11.38f)
                curveTo(5.374f, 10.981f, 5.37f, 10.547f, 5.345f, 10.134f)
                curveTo(5.312f, 10.085f, 5.255f, 10.044f, 5.155f, 10.044f)
                curveTo(4.905f, 10.044f, 4.356f, 9.83f, 4.356f, 9.523f)
                curveTo(4.356f, 9.523f, 4.765f, 9.708f, 4.88f, 9.615f)
                curveTo(4.928f, 9.576f, 4.801f, 9.454f, 4.648f, 9.306f)
                curveTo(4.441f, 9.107f, 4.186f, 8.862f, 4.248f, 8.71f)
                curveTo(4.248f, 8.71f, 4.65f, 9.066f, 4.735f, 9.066f)
                curveTo(4.774f, 9.066f, 4.748f, 8.951f, 4.721f, 8.835f)
                curveTo(4.689f, 8.697f, 4.657f, 8.558f, 4.735f, 8.612f)
                curveTo(4.88f, 8.71f, 5.28f, 9.39f, 5.28f, 9.615f)
                curveTo(5.28f, 9.737f, 5.312f, 9.93f, 5.342f, 10.08f)
                lineTo(5.341f, 10.075f)
                curveTo(5.325f, 9.817f, 5.301f, 9.584f, 5.269f, 9.385f)
                curveTo(5.089f, 8.26f, 5.083f, 7.107f, 5.333f, 6.494f)
                curveTo(5.208f, 6.416f, 5.117f, 6.318f, 5.117f, 6.205f)
                curveTo(5.117f, 6.205f, 5.527f, 6.371f, 5.641f, 6.288f)
                curveTo(5.689f, 6.253f, 5.563f, 6.143f, 5.409f, 6.01f)
                curveTo(5.202f, 5.831f, 4.948f, 5.61f, 5.009f, 5.474f)
                curveTo(5.009f, 5.474f, 5.411f, 5.794f, 5.497f, 5.794f)
                curveTo(5.536f, 5.794f, 5.509f, 5.69f, 5.482f, 5.586f)
                curveTo(5.45f, 5.462f, 5.418f, 5.337f, 5.497f, 5.386f)
                curveTo(5.641f, 5.474f, 6.041f, 6.086f, 6.041f, 6.288f)
                lineTo(6.042f, 6.293f)
                curveTo(6.197f, 6.1f, 6.378f, 5.921f, 6.473f, 5.876f)
                curveTo(6.575f, 5.828f, 6.533f, 5.952f, 6.492f, 6.076f)
                curveTo(6.457f, 6.181f, 6.422f, 6.284f, 6.473f, 6.284f)
                curveTo(6.584f, 6.284f, 7.106f, 5.965f, 7.106f, 5.965f)
                curveTo(7.187f, 6.101f, 6.855f, 6.321f, 6.587f, 6.5f)
                curveTo(6.387f, 6.633f, 6.222f, 6.743f, 6.285f, 6.778f)
                curveTo(6.434f, 6.861f, 6.966f, 6.695f, 6.966f, 6.695f)
                curveTo(6.966f, 6.972f, 6.252f, 7.164f, 5.928f, 7.164f)
                curveTo(5.807f, 7.164f, 5.734f, 7.196f, 5.69f, 7.236f)
                curveTo(5.668f, 7.428f, 5.658f, 7.645f, 5.659f, 7.877f)
                curveTo(5.822f, 7.668f, 6.024f, 7.463f, 6.127f, 7.414f)
                curveTo(6.229f, 7.366f, 6.187f, 7.491f, 6.146f, 7.615f)
                curveTo(6.111f, 7.719f, 6.076f, 7.823f, 6.127f, 7.823f)
                curveTo(6.239f, 7.823f, 6.761f, 7.503f, 6.761f, 7.503f)
                curveTo(6.841f, 7.639f, 6.51f, 7.86f, 6.241f, 8.039f)
                curveTo(6.041f, 8.171f, 5.876f, 8.281f, 5.94f, 8.317f)
                curveTo(6.088f, 8.4f, 6.62f, 8.233f, 6.62f, 8.233f)
                curveTo(6.62f, 8.479f, 6.056f, 8.658f, 5.703f, 8.695f)
                curveTo(5.723f, 8.897f, 5.749f, 9.102f, 5.781f, 9.305f)
                curveTo(5.816f, 9.521f, 5.841f, 9.769f, 5.859f, 10.043f)
                curveTo(5.867f, 10.16f, 5.873f, 10.28f, 5.877f, 10.399f)
                curveTo(5.893f, 10.3f, 5.904f, 10.201f, 5.904f, 10.128f)
                curveTo(5.904f, 9.903f, 6.305f, 9.223f, 6.449f, 9.125f)
                curveTo(6.528f, 9.071f, 6.495f, 9.21f, 6.463f, 9.348f)
                curveTo(6.437f, 9.463f, 6.41f, 9.579f, 6.449f, 9.579f)
                curveTo(6.535f, 9.579f, 6.936f, 9.223f, 6.936f, 9.223f)
                curveTo(6.998f, 9.375f, 6.743f, 9.62f, 6.537f, 9.819f)
                lineTo(6.537f, 9.819f)
                curveTo(6.383f, 9.966f, 6.256f, 10.089f, 6.305f, 10.128f)
                curveTo(6.419f, 10.22f, 6.829f, 10.035f, 6.829f, 10.035f)
                curveTo(6.829f, 10.343f, 6.28f, 10.557f, 6.03f, 10.557f)
                curveTo(5.965f, 10.557f, 5.917f, 10.574f, 5.883f, 10.6f)
                curveTo(5.89f, 10.864f, 5.89f, 11.127f, 5.886f, 11.377f)
                curveTo(6.022f, 11.421f, 6.128f, 11.498f, 6.21f, 11.584f)
                curveTo(6.371f, 11.573f, 6.529f, 11.549f, 6.684f, 11.511f)
                curveTo(6.984f, 11.346f, 7.649f, 10.814f, 7.817f, 10.605f)
                curveTo(7.944f, 10.447f, 7.993f, 10.135f, 8.039f, 9.84f)
                curveTo(8.065f, 9.672f, 8.091f, 9.509f, 8.129f, 9.383f)
                curveTo(8.236f, 9.039f, 8.425f, 9.802f, 8.425f, 9.921f)
                curveTo(8.425f, 10.04f, 8.58f, 9.48f, 8.58f, 9.088f)
                curveTo(8.58f, 8.891f, 8.541f, 8.765f, 8.502f, 8.639f)
                curveTo(8.463f, 8.513f, 8.425f, 8.388f, 8.425f, 8.193f)
                curveTo(8.425f, 7.964f, 8.559f, 8.004f, 8.683f, 8.123f)
                curveTo(8.627f, 7.967f, 8.58f, 7.774f, 8.58f, 7.575f)
                curveTo(8.58f, 7.321f, 8.548f, 7.244f, 8.534f, 7.225f)
                curveTo(8.547f, 7.231f, 8.58f, 7.234f, 8.65f, 7.196f)
                curveTo(8.77f, 7.131f, 8.826f, 7.211f, 8.873f, 7.278f)
                curveTo(8.914f, 7.337f, 8.948f, 7.385f, 9.012f, 7.318f)
                curveTo(9.082f, 7.245f, 8.931f, 7.162f, 8.707f, 7.038f)
                curveTo(8.492f, 6.92f, 8.209f, 6.764f, 7.99f, 6.544f)
                curveTo(7.542f, 6.094f, 8.129f, 5.94f, 8.23f, 6.097f)
                curveTo(8.33f, 6.254f, 8.927f, 6.43f, 8.58f, 5.908f)
                curveTo(8.369f, 5.591f, 8.109f, 5.595f, 7.872f, 5.599f)
                curveTo(7.719f, 5.601f, 7.576f, 5.603f, 7.463f, 5.519f)
                curveTo(7.267f, 5.373f, 7.54f, 5.223f, 7.689f, 5.141f)
                curveTo(7.76f, 5.102f, 7.803f, 5.079f, 7.753f, 5.079f)
                curveTo(7.689f, 5.079f, 7.608f, 5.056f, 7.513f, 5.029f)
                curveTo(7.376f, 4.991f, 7.21f, 4.945f, 7.023f, 4.945f)
                curveTo(6.705f, 4.945f, 6.078f, 4.661f, 6.295f, 4.661f)
                curveTo(6.372f, 4.661f, 6.486f, 4.634f, 6.612f, 4.603f)
                curveTo(6.75f, 4.57f, 6.902f, 4.534f, 7.032f, 4.527f)
                curveTo(6.651f, 4.351f, 6.216f, 4.203f, 5.725f, 4.082f)
                lineTo(5.808f, 3.75f)
                curveTo(6.294f, 3.87f, 6.731f, 4.016f, 7.118f, 4.191f)
                curveTo(7.052f, 4.088f, 6.979f, 3.976f, 6.919f, 3.871f)
                curveTo(6.711f, 3.509f, 7.36f, 4.072f, 7.616f, 4.444f)
                lineTo(7.617f, 4.445f)
                curveTo(8.035f, 4.688f, 8.379f, 4.971f, 8.65f, 5.294f)
                verticalLineTo(4.56f)
                curveTo(8.893f, 4.643f, 9.031f, 5.427f, 9.103f, 6.017f)
                curveTo(9.156f, 6.135f, 9.202f, 6.258f, 9.24f, 6.384f)
                curveTo(9.334f, 6.133f, 9.512f, 5.865f, 9.673f, 6.097f)
                curveTo(9.863f, 6.372f, 9.526f, 7.935f, 9.402f, 8.475f)
                curveTo(9.397f, 8.532f, 9.391f, 8.588f, 9.384f, 8.644f)
                curveTo(9.679f, 8.456f, 9.832f, 8.021f, 9.911f, 7.798f)
                curveTo(9.979f, 7.606f, 9.991f, 7.572f, 9.991f, 7.989f)
                curveTo(9.991f, 8.529f, 9.571f, 9.063f, 9.227f, 9.41f)
                curveTo(9.177f, 9.581f, 9.119f, 9.747f, 9.052f, 9.909f)
                curveTo(9.289f, 9.834f, 9.492f, 9.703f, 9.649f, 9.601f)
                curveTo(9.925f, 9.423f, 10.06f, 9.335f, 9.991f, 9.802f)
                curveTo(9.915f, 10.311f, 9.176f, 10.5f, 8.712f, 10.568f)
                curveTo(8.678f, 10.622f, 8.643f, 10.675f, 8.607f, 10.728f)
                lineTo(8.587f, 10.752f)
                curveTo(8.515f, 10.825f, 8.443f, 10.894f, 8.369f, 10.96f)
                curveTo(8.416f, 10.941f, 8.461f, 10.92f, 8.505f, 10.9f)
                curveTo(8.687f, 10.818f, 8.852f, 10.743f, 9.061f, 10.743f)
                curveTo(9.187f, 10.743f, 9.014f, 10.809f, 8.77f, 10.902f)
                curveTo(8.482f, 11.012f, 8.093f, 11.16f, 7.979f, 11.283f)
                curveTo(7.932f, 11.335f, 7.9f, 11.377f, 7.875f, 11.41f)
                curveTo(7.801f, 11.509f, 7.778f, 11.539f, 7.545f, 11.546f)
                curveTo(7.184f, 11.737f, 6.809f, 11.858f, 6.418f, 11.907f)
                curveTo(6.443f, 11.966f, 6.453f, 12.005f, 6.453f, 12.005f)
                horizontalLineTo(4.808f)
                curveTo(4.808f, 12.005f, 4.821f, 11.957f, 4.852f, 11.888f)
                curveTo(4.51f, 11.83f, 4.179f, 11.716f, 3.86f, 11.547f)
                curveTo(3.852f, 11.547f, 3.843f, 11.547f, 3.834f, 11.547f)
                curveTo(3.478f, 11.547f, 3.461f, 11.525f, 3.375f, 11.41f)
                curveTo(3.35f, 11.377f, 3.318f, 11.335f, 3.271f, 11.283f)
                curveTo(3.157f, 11.16f, 2.768f, 11.012f, 2.48f, 10.902f)
                curveTo(2.236f, 10.809f, 2.063f, 10.743f, 2.189f, 10.743f)
                curveTo(2.398f, 10.743f, 2.563f, 10.818f, 2.745f, 10.9f)
                curveTo(2.802f, 10.926f, 2.861f, 10.953f, 2.924f, 10.978f)
                curveTo(2.983f, 11.002f, 3.062f, 11.031f, 3.149f, 11.061f)
                curveTo(3.036f, 10.966f, 2.925f, 10.863f, 2.815f, 10.752f)
                lineTo(2.796f, 10.728f)
                curveTo(2.764f, 10.682f, 2.733f, 10.635f, 2.704f, 10.588f)
                curveTo(2.273f, 10.541f, 1.353f, 10.374f, 1.268f, 9.802f)
                curveTo(1.199f, 9.335f, 1.334f, 9.423f, 1.61f, 9.601f)
                curveTo(1.776f, 9.708f, 1.993f, 9.849f, 2.247f, 9.921f)
                curveTo(2.293f, 9.934f, 2.334f, 9.945f, 2.37f, 9.954f)
                curveTo(2.321f, 9.84f, 2.277f, 9.724f, 2.237f, 9.605f)
                curveTo(1.886f, 9.291f, 1.268f, 8.644f, 1.268f, 7.989f)
                curveTo(1.268f, 7.572f, 1.28f, 7.606f, 1.348f, 7.798f)
                curveTo(1.429f, 8.027f, 1.588f, 8.479f, 1.9f, 8.659f)
                curveTo(1.9f, 8.659f, 1.355f, 6.431f, 1.586f, 6.097f)
                curveTo(1.818f, 5.763f, 2.086f, 6.468f, 2.086f, 6.666f)
                curveTo(2.086f, 6.701f, 2.09f, 6.663f, 2.097f, 6.577f)
                curveTo(2.134f, 6.171f, 2.269f, 4.677f, 2.609f, 4.56f)
                verticalLineTo(5.368f)
                curveTo(2.609f, 5.405f, 2.625f, 5.42f, 2.655f, 5.416f)
                curveTo(2.881f, 5.118f, 3.167f, 4.851f, 3.511f, 4.618f)
                curveTo(3.562f, 4.554f, 3.607f, 4.495f, 3.642f, 4.444f)
                curveTo(3.899f, 4.072f, 4.547f, 3.509f, 4.34f, 3.871f)
                curveTo(4.278f, 3.98f, 4.202f, 4.095f, 4.134f, 4.201f)
                lineTo(4.134f, 4.201f)
                curveTo(4.114f, 4.231f, 4.095f, 4.261f, 4.077f, 4.289f)
                curveTo(4.514f, 4.071f, 5.02f, 3.891f, 5.595f, 3.75f)
                lineTo(5.678f, 4.082f)
                curveTo(5.176f, 4.206f, 4.731f, 4.358f, 4.344f, 4.54f)
                curveTo(4.443f, 4.555f, 4.549f, 4.58f, 4.647f, 4.603f)
                curveTo(4.773f, 4.634f, 4.887f, 4.661f, 4.964f, 4.661f)
                curveTo(5.181f, 4.661f, 4.554f, 4.945f, 4.236f, 4.945f)
                curveTo(4.049f, 4.945f, 3.883f, 4.991f, 3.746f, 5.029f)
                curveTo(3.651f, 5.056f, 3.57f, 5.079f, 3.506f, 5.079f)
                curveTo(3.456f, 5.079f, 3.499f, 5.102f, 3.57f, 5.141f)
                curveTo(3.719f, 5.223f, 3.992f, 5.373f, 3.796f, 5.519f)
                curveTo(3.682f, 5.603f, 3.539f, 5.601f, 3.387f, 5.599f)
                curveTo(3.218f, 5.596f, 3.036f, 5.593f, 2.87f, 5.708f)
                curveTo(2.758f, 5.868f, 2.664f, 6.039f, 2.589f, 6.219f)
                curveTo(2.665f, 6.318f, 2.961f, 6.203f, 3.029f, 6.097f)
                curveTo(3.129f, 5.94f, 3.717f, 6.094f, 3.269f, 6.544f)
                curveTo(3.049f, 6.764f, 2.767f, 6.92f, 2.552f, 7.038f)
                curveTo(2.482f, 7.077f, 2.419f, 7.112f, 2.367f, 7.143f)
                curveTo(2.36f, 7.205f, 2.354f, 7.266f, 2.348f, 7.327f)
                curveTo(2.361f, 7.314f, 2.373f, 7.296f, 2.386f, 7.278f)
                curveTo(2.432f, 7.211f, 2.488f, 7.131f, 2.609f, 7.196f)
                curveTo(2.679f, 7.234f, 2.712f, 7.231f, 2.725f, 7.225f)
                curveTo(2.711f, 7.244f, 2.679f, 7.321f, 2.679f, 7.575f)
                curveTo(2.679f, 7.774f, 2.632f, 7.967f, 2.575f, 8.123f)
                curveTo(2.7f, 8.004f, 2.834f, 7.964f, 2.834f, 8.193f)
                curveTo(2.834f, 8.388f, 2.795f, 8.513f, 2.757f, 8.639f)
                curveTo(2.718f, 8.765f, 2.679f, 8.891f, 2.679f, 9.088f)
                curveTo(2.679f, 9.48f, 2.834f, 10.04f, 2.834f, 9.921f)
                curveTo(2.834f, 9.802f, 3.023f, 9.039f, 3.129f, 9.383f)
                curveTo(3.168f, 9.509f, 3.194f, 9.672f, 3.22f, 9.84f)
                curveTo(3.266f, 10.135f, 3.315f, 10.447f, 3.442f, 10.605f)
                curveTo(3.588f, 10.787f, 4.107f, 11.211f, 4.438f, 11.428f)
                curveTo(4.642f, 11.5f, 4.85f, 11.548f, 5.063f, 11.572f)
                close()
                moveTo(2.731f, 7.22f)
                curveTo(2.731f, 7.219f, 2.728f, 7.22f, 2.725f, 7.225f)
                curveTo(2.729f, 7.223f, 2.731f, 7.221f, 2.731f, 7.22f)
                close()
                moveTo(8.534f, 7.225f)
                curveTo(8.531f, 7.22f, 8.528f, 7.219f, 8.528f, 7.22f)
                curveTo(8.528f, 7.221f, 8.529f, 7.223f, 8.534f, 7.225f)
                close()
                moveTo(8.646f, 9.971f)
                curveTo(8.66f, 9.941f, 8.674f, 9.912f, 8.687f, 9.882f)
                curveTo(8.652f, 9.916f, 8.626f, 9.952f, 8.646f, 9.971f)
                close()
                moveTo(5.76f, 6.843f)
                curveTo(5.752f, 6.927f, 5.729f, 7.031f, 5.704f, 7.125f)
                curveTo(5.719f, 7.021f, 5.738f, 6.927f, 5.76f, 6.843f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EritreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Eritrea,
            contentDescription = "Eritrea Flag"
        )
    }
}
