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
 * Pitcairn Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: PN
 * - ISO Alpha-3: PCN
 * - ISO Numeric: 612
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.PitcairnIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Pitcairn Islands:PN:PCN:612:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.943f, 7.032f)
                curveTo(12.943f, 7.032f, 13f, 7.675f, 12.874f, 8.039f)
                curveTo(12.748f, 8.403f, 12.684f, 8.614f, 12.684f, 8.382f)
                curveTo(12.684f, 8.149f, 12.595f, 7.964f, 12.524f, 7.964f)
                curveTo(12.452f, 7.964f, 12.509f, 8.195f, 12.437f, 8.195f)
                curveTo(12.365f, 8.195f, 12.118f, 8.235f, 12.118f, 8.1f)
                curveTo(12.118f, 7.964f, 12.086f, 8.463f, 12.246f, 8.507f)
                curveTo(12.406f, 8.552f, 12.168f, 8.69f, 12.062f, 8.647f)
                curveTo(12.062f, 8.647f, 12.499f, 8.79f, 12.67f, 8.912f)
                curveTo(12.67f, 8.912f, 13.184f, 9.558f, 13.665f, 9.479f)
                curveTo(13.665f, 9.479f, 13.011f, 9.252f, 13.126f, 8.817f)
                curveTo(13.241f, 8.382f, 13.665f, 8.32f, 13.665f, 8.32f)
                curveTo(13.665f, 8.32f, 13.864f, 8.387f, 13.858f, 8.562f)
                curveTo(13.852f, 8.737f, 14.003f, 8.507f, 14.003f, 8.507f)
                curveTo(14.003f, 8.507f, 14.028f, 8.285f, 14.001f, 8.231f)
                curveTo(13.974f, 8.177f, 14.457f, 8.073f, 14.487f, 7.844f)
                curveTo(14.487f, 7.844f, 13.994f, 7.867f, 13.96f, 7.808f)
                curveTo(13.926f, 7.75f, 14.113f, 7.658f, 14.054f, 7.544f)
                curveTo(13.996f, 7.429f, 13.126f, 8.195f, 13.126f, 8.195f)
                curveTo(13.126f, 8.195f, 13.426f, 7.674f, 13.426f, 7.394f)
                curveTo(13.426f, 7.114f, 13.35f, 6.923f, 13.126f, 6.923f)
                curveTo(12.902f, 6.923f, 12.943f, 7.032f, 12.943f, 7.032f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.474f, 7.185f)
                curveTo(17.473f, 7.186f, 17.474f, 7.186f, 17.475f, 7.186f)
                curveTo(17.507f, 7.154f, 17.707f, 6.968f, 17.875f, 7.115f)
                curveTo(18.057f, 7.274f, 17.782f, 7.43f, 17.782f, 7.43f)
                curveTo(17.782f, 7.43f, 17.911f, 7.555f, 18.058f, 7.555f)
                curveTo(18.205f, 7.555f, 18.241f, 7.43f, 18.241f, 7.43f)
                curveTo(18.241f, 7.43f, 18.252f, 7.709f, 18.731f, 7.815f)
                curveTo(18.731f, 7.815f, 18.902f, 7.568f, 18.731f, 7.432f)
                curveTo(18.731f, 7.432f, 18.933f, 7.39f, 18.918f, 7.226f)
                curveTo(18.918f, 7.226f, 18.752f, 7.283f, 18.634f, 7.152f)
                curveTo(18.515f, 7.021f, 18.285f, 6.961f, 18.117f, 6.991f)
                curveTo(17.691f, 6.836f, 17.499f, 7.14f, 17.474f, 7.185f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF96877D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.569f, 8.593f)
                curveTo(14.569f, 8.593f, 15.064f, 9.531f, 14.755f, 9.725f)
                curveTo(14.445f, 9.919f, 16.227f, 9.781f, 16.395f, 9.725f)
                curveTo(16.563f, 9.669f, 16.361f, 9.373f, 16.175f, 9.291f)
                curveTo(15.988f, 9.209f, 15.223f, 8.936f, 15.019f, 8.73f)
                curveTo(14.816f, 8.524f, 14.94f, 8.451f, 15.104f, 8.247f)
                curveTo(15.268f, 8.044f, 15.875f, 7.962f, 15.875f, 7.772f)
                curveTo(15.875f, 7.582f, 16.26f, 6.798f, 16.529f, 6.739f)
                curveTo(16.799f, 6.68f, 16.653f, 6.587f, 16.591f, 6.587f)
                curveTo(16.529f, 6.587f, 16.157f, 6.973f, 16.016f, 6.903f)
                curveTo(15.875f, 6.834f, 15.858f, 6.839f, 16.016f, 6.67f)
                curveTo(16.175f, 6.502f, 16.294f, 6.308f, 16.084f, 6.447f)
                curveTo(15.875f, 6.587f, 15.53f, 6.808f, 15.364f, 6.808f)
                curveTo(15.198f, 6.808f, 14.608f, 6.732f, 14.681f, 6.903f)
                curveTo(14.755f, 7.074f, 14.786f, 7.371f, 15.104f, 7.572f)
                curveTo(15.422f, 7.772f, 15.284f, 7.919f, 15.019f, 8.112f)
                curveTo(14.755f, 8.306f, 14.569f, 8.593f, 14.569f, 8.593f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(17.856f, 7.352f)
                lineTo(16.912f, 9.258f)
                curveTo(16.912f, 9.258f, 16.884f, 9.796f, 17.559f, 9.438f)
                curveTo(18.234f, 9.079f, 18.208f, 8.824f, 18.402f, 8.824f)
                curveTo(18.597f, 8.824f, 18.659f, 8.716f, 18.659f, 8.716f)
                lineTo(18.529f, 8.613f)
                curveTo(18.529f, 8.613f, 18.514f, 8.426f, 18.596f, 8.384f)
                curveTo(18.596f, 8.384f, 18.435f, 8.295f, 18.412f, 8.369f)
                curveTo(18.389f, 8.444f, 18.275f, 8.213f, 18.34f, 8.213f)
                curveTo(18.34f, 8.213f, 18.198f, 8.445f, 18.168f, 8.535f)
                curveTo(18.168f, 8.535f, 17.962f, 8.451f, 17.972f, 8.061f)
                curveTo(17.982f, 7.672f, 17.856f, 7.352f, 17.856f, 7.352f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(13.363f, 7.05f)
                curveTo(13.363f, 7.05f, 12.882f, 7.163f, 12.934f, 7.28f)
                curveTo(12.986f, 7.397f, 13.062f, 7.277f, 12.827f, 7.418f)
                curveTo(12.827f, 7.418f, 12.413f, 7.74f, 12.323f, 7.705f)
                curveTo(12.233f, 7.67f, 12.387f, 7.786f, 12.387f, 7.418f)
                curveTo(12.387f, 7.05f, 12.147f, 7.35f, 12.387f, 7.104f)
                curveTo(12.627f, 6.859f, 12.712f, 7.05f, 12.827f, 6.909f)
                curveTo(12.942f, 6.768f, 12.839f, 6.843f, 13.152f, 6.843f)
                curveTo(13.465f, 6.843f, 13.363f, 7.05f, 13.363f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(14.83f, 8.944f)
                curveTo(14.83f, 8.944f, 13.484f, 10.009f, 13.215f, 10.089f)
                curveTo(12.946f, 10.168f, 13.768f, 10.067f, 13.969f, 9.926f)
                curveTo(14.17f, 9.786f, 14.83f, 8.944f, 14.83f, 8.944f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.498f, 10.812f)
                curveTo(17.498f, 10.812f, 17.627f, 11.651f, 17.29f, 11.568f)
                curveTo(16.952f, 11.486f, 16.812f, 11.443f, 16.812f, 11.443f)
                curveTo(16.812f, 11.443f, 16.936f, 11.834f, 17.113f, 11.834f)
                curveTo(17.113f, 11.834f, 17.414f, 12.425f, 17.298f, 12.611f)
                curveTo(17.298f, 12.611f, 17.817f, 12.187f, 17.733f, 11.851f)
                curveTo(17.649f, 11.514f, 17.867f, 11.906f, 17.867f, 11.906f)
                curveTo(17.867f, 11.906f, 18.058f, 11.999f, 18.196f, 11.895f)
                curveTo(18.334f, 11.792f, 18.194f, 11.838f, 18.056f, 11.64f)
                curveTo(17.918f, 11.443f, 17.952f, 10.889f, 17.533f, 10.602f)
                curveTo(17.113f, 10.315f, 17.015f, 10.324f, 17.015f, 10.324f)
                curveTo(17.015f, 10.324f, 16.706f, 9.815f, 16.891f, 9.849f)
                curveTo(16.891f, 9.849f, 18.218f, 10.307f, 18.253f, 10.424f)
                curveTo(18.287f, 10.542f, 18.639f, 10.52f, 18.463f, 10.184f)
                curveTo(18.287f, 9.849f, 17.339f, 9.646f, 17.226f, 9.552f)
                curveTo(17.113f, 9.457f, 17.218f, 9.098f, 17.015f, 9.02f)
                curveTo(16.812f, 8.942f, 16.258f, 8.387f, 16.259f, 8.119f)
                curveTo(16.259f, 7.852f, 15.998f, 7.726f, 15.772f, 7.726f)
                curveTo(15.545f, 7.726f, 15.118f, 7.66f, 14.938f, 7.66f)
                curveTo(14.758f, 7.66f, 14.59f, 7.964f, 14.764f, 7.964f)
                curveTo(14.938f, 7.964f, 14.789f, 8.532f, 14.498f, 8.656f)
                curveTo(14.206f, 8.781f, 13.981f, 8.959f, 13.648f, 8.959f)
                curveTo(13.315f, 8.959f, 14.119f, 9.248f, 14.247f, 9.134f)
                curveTo(14.375f, 9.02f, 14.333f, 8.85f, 14.764f, 8.656f)
                curveTo(15.195f, 8.463f, 15.606f, 8.348f, 15.554f, 8.502f)
                curveTo(15.502f, 8.656f, 15.634f, 8.914f, 15.837f, 8.821f)
                curveTo(16.04f, 8.728f, 16.105f, 8.492f, 16.105f, 8.656f)
                curveTo(16.105f, 8.821f, 16.416f, 9.665f, 16.654f, 9.994f)
                curveTo(16.891f, 10.324f, 17.498f, 10.812f, 17.498f, 10.812f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(14.667f, 7.73f)
                curveTo(14.667f, 7.73f, 14.509f, 7.983f, 14.667f, 7.983f)
                curveTo(14.824f, 7.983f, 15.078f, 7.983f, 14.924f, 7.856f)
                curveTo(14.769f, 7.73f, 14.667f, 7.73f, 14.667f, 7.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.194f, 7.724f)
                curveTo(15.194f, 7.724f, 15.194f, 7.892f, 15.304f, 7.892f)
                curveTo(15.413f, 7.892f, 15.51f, 8.06f, 15.51f, 7.892f)
                curveTo(15.51f, 7.724f, 15.663f, 7.779f, 15.428f, 7.724f)
                curveTo(15.194f, 7.668f, 15.194f, 7.724f, 15.194f, 7.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.867f, 7.762f)
                curveTo(15.867f, 7.762f, 15.762f, 7.842f, 15.815f, 7.985f)
                curveTo(15.867f, 8.127f, 15.986f, 8.409f, 15.815f, 8.409f)
                curveTo(15.643f, 8.409f, 15.501f, 8.511f, 15.635f, 8.511f)
                curveTo(15.77f, 8.511f, 16.009f, 8.613f, 16.009f, 8.511f)
                curveTo(16.009f, 8.409f, 16.106f, 8.679f, 16.106f, 8.511f)
                curveTo(16.106f, 8.343f, 16.106f, 8.263f, 16.106f, 8.165f)
                curveTo(16.106f, 8.066f, 16.203f, 8.038f, 16.106f, 7.9f)
                curveTo(16.009f, 7.762f, 15.867f, 7.762f, 15.867f, 7.762f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(16.111f, 8.743f)
                curveTo(16.111f, 8.743f, 16.331f, 9.439f, 16.45f, 9.529f)
                curveTo(16.57f, 9.619f, 16.623f, 10.375f, 16.676f, 10.457f)
                curveTo(16.728f, 10.539f, 17.442f, 10.954f, 17.442f, 11.177f)
                curveTo(17.442f, 11.399f, 17.663f, 11.006f, 17.552f, 10.785f)
                curveTo(17.442f, 10.565f, 17.096f, 10.095f, 16.847f, 9.993f)
                curveTo(16.598f, 9.891f, 16.63f, 9.643f, 16.577f, 9.469f)
                curveTo(16.525f, 9.294f, 16.887f, 9.609f, 16.577f, 9.214f)
                curveTo(16.267f, 8.819f, 16.275f, 9.031f, 16.363f, 9.031f)
                curveTo(16.45f, 9.031f, 16.537f, 8.985f, 16.45f, 8.923f)
                curveTo(16.363f, 8.862f, 16.111f, 8.743f, 16.111f, 8.743f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(13.782f, 10.179f)
                curveTo(13.782f, 10.179f, 13.068f, 11.448f, 12.941f, 11.513f)
                curveTo(12.813f, 11.579f, 12.718f, 11.592f, 12.653f, 11.513f)
                curveTo(12.588f, 11.434f, 12.581f, 11.725f, 12.653f, 11.804f)
                curveTo(12.725f, 11.884f, 12.941f, 11.884f, 13.06f, 11.743f)
                curveTo(13.06f, 11.743f, 13.079f, 12.1f, 13.266f, 12.369f)
                curveTo(13.452f, 12.638f, 13.53f, 12.564f, 13.53f, 12.716f)
                curveTo(13.53f, 12.868f, 13.574f, 13.069f, 13.63f, 13.069f)
                curveTo(13.687f, 13.069f, 13.731f, 13.548f, 13.63f, 13.548f)
                curveTo(13.53f, 13.548f, 13.864f, 13.588f, 14.01f, 13.468f)
                curveTo(14.156f, 13.348f, 14.219f, 13.257f, 14.188f, 13.257f)
                curveTo(14.156f, 13.257f, 13.782f, 13.058f, 13.782f, 12.918f)
                curveTo(13.782f, 12.777f, 13.53f, 12.667f, 13.53f, 12.459f)
                curveTo(13.53f, 12.25f, 13.399f, 12.002f, 13.399f, 11.903f)
                curveTo(13.399f, 11.804f, 13.511f, 11.941f, 13.63f, 11.848f)
                curveTo(13.75f, 11.754f, 13.782f, 11.513f, 13.782f, 11.513f)
                curveTo(13.782f, 11.513f, 13.593f, 11.641f, 13.53f, 11.577f)
                curveTo(13.466f, 11.513f, 13.268f, 11.387f, 13.399f, 11.171f)
                curveTo(13.53f, 10.955f, 13.782f, 10.179f, 13.782f, 10.179f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.018f, 6.177f)
                curveTo(15.018f, 6.177f, 14.763f, 6.292f, 14.848f, 6.462f)
                curveTo(14.933f, 6.632f, 14.964f, 6.707f, 15.018f, 6.67f)
                curveTo(15.073f, 6.632f, 15.456f, 6.561f, 15.37f, 6.369f)
                curveTo(15.284f, 6.177f, 15.104f, 6.177f, 15.104f, 6.177f)
                horizontalLineTo(15.018f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.905f, 6.086f)
                curveTo(15.905f, 6.086f, 15.567f, 5.935f, 15.68f, 6.086f)
                curveTo(15.792f, 6.236f, 15.936f, 6.315f, 16.04f, 6.315f)
                curveTo(16.143f, 6.315f, 16.358f, 6.284f, 16.251f, 6.223f)
                curveTo(16.143f, 6.163f, 15.905f, 6.086f, 15.905f, 6.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.573f, 9.992f)
                curveTo(12.574f, 9.984f, 12.564f, 9.977f, 12.557f, 9.984f)
                curveTo(12.488f, 10.051f, 12.276f, 10.276f, 12.365f, 10.472f)
                curveTo(12.472f, 10.706f, 12.579f, 10.787f, 12.579f, 10.787f)
                curveTo(12.579f, 10.787f, 12.644f, 11.144f, 12.778f, 11.242f)
                curveTo(12.778f, 11.242f, 12.958f, 11.232f, 12.967f, 10.954f)
                curveTo(12.967f, 10.954f, 13.274f, 10.864f, 13.364f, 11.056f)
                curveTo(13.364f, 11.056f, 13.304f, 11.078f, 13.304f, 11.242f)
                curveTo(13.304f, 11.405f, 13.443f, 11.583f, 13.443f, 11.583f)
                curveTo(13.443f, 11.583f, 13.507f, 11.018f, 13.792f, 10.654f)
                curveTo(14.077f, 10.29f, 14.159f, 10.218f, 14.159f, 10.218f)
                verticalLineTo(9.809f)
                curveTo(14.159f, 9.809f, 13.569f, 10.293f, 13.443f, 10.696f)
                curveTo(13.443f, 10.696f, 13.146f, 10.706f, 13.025f, 10.654f)
                curveTo(12.904f, 10.603f, 13.176f, 10.518f, 13.025f, 10.335f)
                curveTo(12.874f, 10.151f, 12.943f, 10.593f, 12.778f, 10.472f)
                curveTo(12.519f, 10.4f, 12.555f, 10.089f, 12.573f, 9.992f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.859f, 9.638f)
                lineTo(16.883f, 9.638f)
                verticalLineTo(11.498f)
                curveTo(16.883f, 11.498f, 16.637f, 13.018f, 15.32f, 13.767f)
                curveTo(15.32f, 13.767f, 14.044f, 13.007f, 13.859f, 11.498f)
                verticalLineTo(9.638f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(13.859f, 9.638f)
                lineTo(16.883f, 9.638f)
                verticalLineTo(11.498f)
                curveTo(16.883f, 11.498f, 16.637f, 13.018f, 15.32f, 13.767f)
                curveTo(15.32f, 13.767f, 14.044f, 13.007f, 13.859f, 11.498f)
                verticalLineTo(9.638f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF58A5FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.297f, 9.537f)
                lineTo(13.976f, 12.298f)
                lineTo(15.767f, 10.659f)
                lineTo(17.001f, 12.717f)
                verticalLineTo(9.537f)
                lineTo(15.767f, 10.555f)
                lineTo(15.297f, 9.537f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.255f, 11.527f)
                curveTo(15.255f, 11.473f, 15.299f, 11.429f, 15.354f, 11.429f)
                curveTo(15.408f, 11.429f, 15.452f, 11.473f, 15.452f, 11.527f)
                verticalLineTo(13.301f)
                curveTo(15.452f, 13.356f, 15.408f, 13.4f, 15.354f, 13.4f)
                curveTo(15.299f, 13.4f, 15.255f, 13.356f, 15.255f, 13.301f)
                lineTo(15.255f, 11.527f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(14.913f, 11.965f)
                curveTo(14.859f, 11.965f, 14.816f, 11.921f, 14.816f, 11.867f)
                curveTo(14.816f, 11.814f, 14.859f, 11.77f, 14.913f, 11.77f)
                horizontalLineTo(15.803f)
                curveTo(15.856f, 11.77f, 15.9f, 11.814f, 15.9f, 11.867f)
                curveTo(15.9f, 11.921f, 15.856f, 11.965f, 15.803f, 11.965f)
                horizontalLineTo(14.913f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.498f, 13.439f)
                lineTo(15.412f, 13.509f)
                curveTo(15.285f, 13.354f, 15.17f, 13.28f, 15.068f, 13.28f)
                curveTo(14.917f, 13.28f, 14.795f, 13.153f, 14.695f, 12.914f)
                lineTo(14.798f, 12.871f)
                curveTo(14.882f, 13.074f, 14.974f, 13.168f, 15.068f, 13.168f)
                curveTo(15.21f, 13.168f, 15.352f, 13.26f, 15.498f, 13.439f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.595f, 12.532f)
                curveTo(14.595f, 12.531f, 14.594f, 12.532f, 14.594f, 12.533f)
                verticalLineTo(13.073f)
                curveTo(14.594f, 13.074f, 14.594f, 13.075f, 14.595f, 13.074f)
                lineTo(14.999f, 12.907f)
                curveTo(15f, 12.907f, 15f, 12.906f, 14.999f, 12.905f)
                lineTo(14.595f, 12.532f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(15.319f, 13.439f)
                lineTo(15.405f, 13.509f)
                curveTo(15.532f, 13.354f, 15.647f, 13.28f, 15.75f, 13.28f)
                curveTo(15.9f, 13.28f, 16.022f, 13.153f, 16.122f, 12.914f)
                lineTo(16.019f, 12.871f)
                curveTo(15.935f, 13.074f, 15.843f, 13.168f, 15.75f, 13.168f)
                curveTo(15.608f, 13.168f, 15.465f, 13.26f, 15.319f, 13.439f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.222f, 12.532f)
                curveTo(16.222f, 12.531f, 16.223f, 12.532f, 16.223f, 12.533f)
                verticalLineTo(13.073f)
                curveTo(16.223f, 13.074f, 16.222f, 13.075f, 16.222f, 13.074f)
                lineTo(15.818f, 12.907f)
                curveTo(15.817f, 12.907f, 15.817f, 12.906f, 15.818f, 12.905f)
                lineTo(16.222f, 12.532f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(15.155f, 10.732f)
                horizontalLineToRelative(0.394f)
                verticalLineToRelative(0.592f)
                horizontalLineToRelative(-0.394f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.253f, 8.125f)
                lineTo(1.223f, 9.211f)
                lineTo(11.306f, 1.18f)
                lineTo(12.612f, -0.433f)
                lineTo(9.965f, -0.796f)
                lineTo(5.852f, 2.665f)
                lineTo(2.542f, 4.996f)
                lineTo(-1.253f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.914f, 8.886f)
                lineTo(0.347f, 9.516f)
                lineTo(12.143f, -0.583f)
                horizontalLineTo(10.372f)
                lineTo(-0.914f, 8.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.503f, 8.125f)
                lineTo(10.306f, 9.521f)
                lineTo(-0.056f, 1.18f)
                lineTo(-1.362f, -0.433f)
                lineTo(1.285f, -0.796f)
                lineTo(5.398f, 2.665f)
                lineTo(8.708f, 4.996f)
                lineTo(12.503f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(12.418f, 8.671f)
                lineTo(11.157f, 9.301f)
                lineTo(6.134f, 4.977f)
                lineTo(4.645f, 4.494f)
                lineTo(-1.488f, -0.427f)
                horizontalLineTo(0.283f)
                lineTo(6.413f, 4.377f)
                lineTo(8.041f, 4.957f)
                lineTo(12.418f, 8.671f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.063f, 0f)
                horizontalLineTo(6.938f)
                verticalLineTo(3.063f)
                lineTo(11f, 3f)
                verticalLineTo(5.875f)
                lineTo(6.938f, 5.938f)
                verticalLineTo(9f)
                horizontalLineTo(4.063f)
                verticalLineTo(5.938f)
                lineTo(0f, 5.875f)
                verticalLineTo(3f)
                lineTo(4.063f, 3.063f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PitcairnIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.PitcairnIslands,
            contentDescription = "Pitcairn Islands Flag"
        )
    }
}
