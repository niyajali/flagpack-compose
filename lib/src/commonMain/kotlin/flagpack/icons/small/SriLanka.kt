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
 * Sri Lanka Flag (16x12dp)
 *
 * - ISO Alpha-2: LK
 * - ISO Alpha-3: LKA
 * - ISO Numeric: 144
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SriLanka: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sri Lanka:LK:LKA:144:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F8A6E))) {
                moveTo(1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF56800))) {
                moveTo(4f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB01D00))) {
                moveTo(7f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.471f, 3f)
                curveTo(8.471f, 3f, 7.828f, 2.998f, 7.828f, 4.119f)
                verticalLineTo(5.762f)
                curveTo(7.828f, 5.762f, 7.521f, 5.816f, 7.521f, 6.007f)
                curveTo(7.521f, 6.197f, 7.586f, 6.364f, 7.707f, 6.364f)
                curveTo(7.828f, 6.364f, 7.948f, 6.922f, 7.828f, 6.922f)
                curveTo(7.707f, 6.922f, 7.586f, 7.161f, 7.707f, 7.161f)
                curveTo(7.736f, 7.161f, 7.758f, 7.157f, 7.775f, 7.155f)
                curveTo(7.792f, 7.151f, 7.804f, 7.149f, 7.812f, 7.154f)
                curveTo(7.828f, 7.163f, 7.828f, 7.2f, 7.828f, 7.311f)
                curveTo(7.828f, 7.528f, 7.707f, 7.616f, 7.707f, 7.616f)
                curveTo(7.707f, 7.616f, 7.593f, 7.584f, 7.593f, 7.712f)
                curveTo(7.593f, 7.84f, 7.707f, 7.873f, 7.707f, 7.873f)
                curveTo(7.707f, 7.873f, 7.772f, 7.901f, 7.647f, 7.962f)
                curveTo(7.521f, 8.022f, 7.521f, 8.051f, 7.521f, 8.051f)
                horizontalLineTo(7.828f)
                lineTo(7.981f, 8.332f)
                lineTo(8.128f, 8.051f)
                horizontalLineTo(8.43f)
                curveTo(8.43f, 8.051f, 8.278f, 7.954f, 8.26f, 7.934f)
                curveTo(8.242f, 7.913f, 8.22f, 7.883f, 8.26f, 7.849f)
                curveTo(8.271f, 7.839f, 8.288f, 7.832f, 8.306f, 7.824f)
                curveTo(8.35f, 7.804f, 8.402f, 7.781f, 8.402f, 7.712f)
                curveTo(8.402f, 7.616f, 8.209f, 7.616f, 8.209f, 7.616f)
                curveTo(8.209f, 7.616f, 8.091f, 7.403f, 8.128f, 7.311f)
                curveTo(8.138f, 7.285f, 8.144f, 7.261f, 8.149f, 7.242f)
                curveTo(8.162f, 7.191f, 8.169f, 7.161f, 8.233f, 7.161f)
                curveTo(8.32f, 7.161f, 8.371f, 7.05f, 8.26f, 6.922f)
                curveTo(8.26f, 6.922f, 8.387f, 7.059f, 8.35f, 7.236f)
                curveTo(8.312f, 7.414f, 8.389f, 7.494f, 8.43f, 7.494f)
                curveTo(8.471f, 7.494f, 8.537f, 7.433f, 8.537f, 7.433f)
                curveTo(8.537f, 7.433f, 8.88f, 7.74f, 9.031f, 7.74f)
                curveTo(9.182f, 7.74f, 9.398f, 7.494f, 9.398f, 7.494f)
                lineTo(9.709f, 7.669f)
                curveTo(9.709f, 7.669f, 9.936f, 7.987f, 9.903f, 8.206f)
                curveTo(9.869f, 8.425f, 9.74f, 8.547f, 9.587f, 8.513f)
                curveTo(9.435f, 8.479f, 9.187f, 8.549f, 9.168f, 8.643f)
                curveTo(9.165f, 8.658f, 9.161f, 8.675f, 9.156f, 8.694f)
                lineTo(9.156f, 8.694f)
                curveTo(9.13f, 8.801f, 9.091f, 8.962f, 9.21f, 8.922f)
                curveTo(9.351f, 8.876f, 9.379f, 8.84f, 9.379f, 8.84f)
                curveTo(9.379f, 8.84f, 9.36f, 8.922f, 9.474f, 8.922f)
                curveTo(9.587f, 8.922f, 9.62f, 8.84f, 9.62f, 8.84f)
                curveTo(9.62f, 8.84f, 9.738f, 8.922f, 9.82f, 8.922f)
                curveTo(9.903f, 8.922f, 9.995f, 8.859f, 9.995f, 8.859f)
                curveTo(9.995f, 8.859f, 10.056f, 8.953f, 10.191f, 8.922f)
                curveTo(10.325f, 8.891f, 10.427f, 8.54f, 10.329f, 8.461f)
                curveTo(10.329f, 8.461f, 10.654f, 8.414f, 10.738f, 8.132f)
                curveTo(10.738f, 8.132f, 10.423f, 8.127f, 10.456f, 7.934f)
                curveTo(10.488f, 7.74f, 10.654f, 7.616f, 10.654f, 7.616f)
                curveTo(10.654f, 7.616f, 11.132f, 7.385f, 11.337f, 7.311f)
                curveTo(11.543f, 7.236f, 11.885f, 7.161f, 11.969f, 7.161f)
                curveTo(12.004f, 7.161f, 12.029f, 7.242f, 12.062f, 7.351f)
                curveTo(12.111f, 7.51f, 12.178f, 7.729f, 12.321f, 7.849f)
                curveTo(12.563f, 8.051f, 12.398f, 8.513f, 12.398f, 8.513f)
                curveTo(12.398f, 8.513f, 11.86f, 8.567f, 11.86f, 8.713f)
                curveTo(11.86f, 8.859f, 11.869f, 8.922f, 11.969f, 8.922f)
                curveTo(12.07f, 8.922f, 12.068f, 8.84f, 12.068f, 8.84f)
                curveTo(12.068f, 8.84f, 12.128f, 8.922f, 12.224f, 8.922f)
                curveTo(12.321f, 8.922f, 12.398f, 8.84f, 12.398f, 8.84f)
                curveTo(12.398f, 8.84f, 12.424f, 8.922f, 12.55f, 8.922f)
                curveTo(12.677f, 8.922f, 12.676f, 8.84f, 12.676f, 8.84f)
                curveTo(12.676f, 8.84f, 12.698f, 8.922f, 12.81f, 8.922f)
                curveTo(12.921f, 8.922f, 13.15f, 8.84f, 13.15f, 8.84f)
                curveTo(13.15f, 8.84f, 13.186f, 8.922f, 13.302f, 8.922f)
                curveTo(13.417f, 8.922f, 13.42f, 8.84f, 13.42f, 8.84f)
                curveTo(13.42f, 8.84f, 13.482f, 8.922f, 13.582f, 8.922f)
                curveTo(13.682f, 8.922f, 13.741f, 8.84f, 13.741f, 8.84f)
                curveTo(13.741f, 8.84f, 13.885f, 8.922f, 13.985f, 8.922f)
                curveTo(14.084f, 8.922f, 14.049f, 8.773f, 13.985f, 8.643f)
                curveTo(13.969f, 8.61f, 13.95f, 8.582f, 13.933f, 8.557f)
                curveTo(13.883f, 8.481f, 13.846f, 8.426f, 13.932f, 8.332f)
                curveTo(13.956f, 8.306f, 13.984f, 8.279f, 14.011f, 8.252f)
                lineTo(14.011f, 8.252f)
                curveTo(14.115f, 8.151f, 14.219f, 8.05f, 14.142f, 7.962f)
                curveTo(14.12f, 7.935f, 14.093f, 7.917f, 14.067f, 7.898f)
                curveTo(13.98f, 7.838f, 13.891f, 7.776f, 13.932f, 7.433f)
                curveTo(13.956f, 7.228f, 14.002f, 7.061f, 14.045f, 6.906f)
                lineTo(14.045f, 6.906f)
                lineTo(14.045f, 6.906f)
                curveTo(14.096f, 6.723f, 14.142f, 6.557f, 14.142f, 6.364f)
                curveTo(14.142f, 6.007f, 13.932f, 5.599f, 13.932f, 5.599f)
                curveTo(13.932f, 5.599f, 14.215f, 5.401f, 14.215f, 4.998f)
                curveTo(14.215f, 4.595f, 13.582f, 4.551f, 13.582f, 4.551f)
                curveTo(13.582f, 4.551f, 12.953f, 4.713f, 12.676f, 4.632f)
                curveTo(12.613f, 4.614f, 12.561f, 4.601f, 12.517f, 4.59f)
                curveTo(12.367f, 4.552f, 12.321f, 4.541f, 12.321f, 4.437f)
                curveTo(12.321f, 4.303f, 12.119f, 4.551f, 12.119f, 4.551f)
                curveTo(12.119f, 4.551f, 11.96f, 4.488f, 12.068f, 4.356f)
                curveTo(12.176f, 4.224f, 12.224f, 4.173f, 12.224f, 4.173f)
                curveTo(12.224f, 4.173f, 12.13f, 4.065f, 11.969f, 4.119f)
                curveTo(11.809f, 4.173f, 11.781f, 4.262f, 11.781f, 4.262f)
                curveTo(11.781f, 4.262f, 11.598f, 4.076f, 11.712f, 3.94f)
                curveTo(11.826f, 3.804f, 11.969f, 3.94f, 11.969f, 3.94f)
                curveTo(11.969f, 3.94f, 12.133f, 4.025f, 12.146f, 3.913f)
                curveTo(12.159f, 3.801f, 12.146f, 3.712f, 12.146f, 3.712f)
                curveTo(12.146f, 3.712f, 12.556f, 3.829f, 12.441f, 4.012f)
                curveTo(12.325f, 4.195f, 12.398f, 4.262f, 12.398f, 4.262f)
                curveTo(12.398f, 4.262f, 12.68f, 4.28f, 12.731f, 4.085f)
                curveTo(12.75f, 4.012f, 12.747f, 3.94f, 12.733f, 3.884f)
                curveTo(12.814f, 3.923f, 12.906f, 3.968f, 12.88f, 4.043f)
                curveTo(12.833f, 4.181f, 12.731f, 4.356f, 12.731f, 4.356f)
                curveTo(12.731f, 4.356f, 13.013f, 4.339f, 13.097f, 4.119f)
                curveTo(13.181f, 3.898f, 13.15f, 4.173f, 13.15f, 4.173f)
                curveTo(13.15f, 4.173f, 13.258f, 4.169f, 13.42f, 4.262f)
                curveTo(13.582f, 4.356f, 13.42f, 4.119f, 13.42f, 4.119f)
                curveTo(13.42f, 4.119f, 13.757f, 4.536f, 14.075f, 4.486f)
                curveTo(14.393f, 4.437f, 14.375f, 4.173f, 14.375f, 4.173f)
                curveTo(14.375f, 4.173f, 14.3f, 4.043f, 14.142f, 4.043f)
                curveTo(13.985f, 4.043f, 14.075f, 4.173f, 14.075f, 4.173f)
                curveTo(14.075f, 4.173f, 14.228f, 4.26f, 13.985f, 4.173f)
                curveTo(13.914f, 4.147f, 13.809f, 4.066f, 13.678f, 3.964f)
                curveTo(13.358f, 3.715f, 12.885f, 3.348f, 12.398f, 3.404f)
                curveTo(11.712f, 3.483f, 11.473f, 3.79f, 11.473f, 3.79f)
                verticalLineTo(3.534f)
                curveTo(11.473f, 3.534f, 11.357f, 3.712f, 11.25f, 3.712f)
                curveTo(11.142f, 3.712f, 10.844f, 3.534f, 10.844f, 3.534f)
                lineTo(10.654f, 3.712f)
                curveTo(10.654f, 3.712f, 10.582f, 3.534f, 10.456f, 3.534f)
                curveTo(10.329f, 3.534f, 10.329f, 3.712f, 10.329f, 3.712f)
                curveTo(10.329f, 3.712f, 10.17f, 3.634f, 9.995f, 3.634f)
                curveTo(9.924f, 3.634f, 9.863f, 3.607f, 9.816f, 3.587f)
                curveTo(9.748f, 3.558f, 9.709f, 3.541f, 9.709f, 3.634f)
                curveTo(9.709f, 3.652f, 9.709f, 3.67f, 9.71f, 3.687f)
                curveTo(9.713f, 3.812f, 9.715f, 3.89f, 9.533f, 3.913f)
                curveTo(9.327f, 3.94f, 9.168f, 3.94f, 9.168f, 3.94f)
                curveTo(9.168f, 3.94f, 9.044f, 3.79f, 8.948f, 3.79f)
                curveTo(8.852f, 3.79f, 8.741f, 3.906f, 8.741f, 4.012f)
                curveTo(8.741f, 4.119f, 8.865f, 4.422f, 8.948f, 4.486f)
                curveTo(8.97f, 4.503f, 8.966f, 4.502f, 8.948f, 4.493f)
                curveTo(8.899f, 4.47f, 8.741f, 4.398f, 8.741f, 4.551f)
                curveTo(8.741f, 4.657f, 8.767f, 4.683f, 8.787f, 4.702f)
                curveTo(8.805f, 4.721f, 8.817f, 4.733f, 8.792f, 4.804f)
                curveTo(8.782f, 4.834f, 8.767f, 4.868f, 8.752f, 4.903f)
                curveTo(8.694f, 5.042f, 8.626f, 5.203f, 8.741f, 5.203f)
                curveTo(8.803f, 5.203f, 8.862f, 5.189f, 8.903f, 5.179f)
                curveTo(8.959f, 5.166f, 8.984f, 5.16f, 8.948f, 5.203f)
                curveTo(8.934f, 5.219f, 8.915f, 5.24f, 8.895f, 5.26f)
                curveTo(8.829f, 5.33f, 8.761f, 5.401f, 8.879f, 5.347f)
                curveTo(8.941f, 5.318f, 8.993f, 5.277f, 9.036f, 5.243f)
                curveTo(9.099f, 5.193f, 9.143f, 5.159f, 9.168f, 5.203f)
                curveTo(9.184f, 5.23f, 9.171f, 5.268f, 9.16f, 5.299f)
                curveTo(9.142f, 5.352f, 9.129f, 5.391f, 9.261f, 5.347f)
                curveTo(9.308f, 5.331f, 9.335f, 5.319f, 9.35f, 5.311f)
                curveTo(9.351f, 5.319f, 9.358f, 5.331f, 9.379f, 5.347f)
                curveTo(9.423f, 5.379f, 9.415f, 5.41f, 9.408f, 5.434f)
                curveTo(9.401f, 5.461f, 9.396f, 5.478f, 9.474f, 5.478f)
                curveTo(9.548f, 5.478f, 9.653f, 5.421f, 9.715f, 5.387f)
                curveTo(9.775f, 5.354f, 9.795f, 5.342f, 9.709f, 5.427f)
                curveTo(9.655f, 5.48f, 9.576f, 5.516f, 9.488f, 5.555f)
                curveTo(9.294f, 5.643f, 9.056f, 5.75f, 8.948f, 6.115f)
                curveTo(8.803f, 6.608f, 8.868f, 6.709f, 8.878f, 6.721f)
                lineTo(8.43f, 6.231f)
                curveTo(8.43f, 6.231f, 8.537f, 6.147f, 8.537f, 6.007f)
                curveTo(8.537f, 5.866f, 8.26f, 5.762f, 8.26f, 5.762f)
                curveTo(8.26f, 5.762f, 8.27f, 4.015f, 8.35f, 3.634f)
                curveTo(8.43f, 3.252f, 8.471f, 3f, 8.471f, 3f)
                close()
                moveTo(9.364f, 5.294f)
                curveTo(9.359f, 5.294f, 9.349f, 5.3f, 9.35f, 5.311f)
                curveTo(9.37f, 5.3f, 9.369f, 5.294f, 9.364f, 5.294f)
                close()
                moveTo(12.733f, 3.884f)
                lineTo(12.727f, 3.882f)
                curveTo(12.661f, 3.851f, 12.605f, 3.824f, 12.627f, 3.79f)
                curveTo(12.657f, 3.741f, 12.71f, 3.792f, 12.733f, 3.884f)
                close()
                moveTo(13.029f, 7.665f)
                curveTo(13.029f, 7.665f, 12.817f, 7.873f, 12.952f, 7.918f)
                curveTo(12.993f, 7.932f, 13.042f, 7.94f, 13.088f, 7.947f)
                lineTo(13.088f, 7.947f)
                curveTo(13.195f, 7.964f, 13.282f, 7.977f, 13.202f, 8.056f)
                curveTo(13.086f, 8.169f, 12.989f, 8.321f, 12.989f, 8.46f)
                curveTo(12.989f, 8.599f, 12.992f, 8.716f, 13.029f, 8.657f)
                curveTo(13.05f, 8.625f, 13.133f, 8.591f, 13.224f, 8.555f)
                curveTo(13.298f, 8.525f, 13.376f, 8.494f, 13.428f, 8.46f)
                curveTo(13.524f, 8.396f, 13.523f, 8.327f, 13.521f, 8.202f)
                curveTo(13.52f, 8.18f, 13.52f, 8.157f, 13.52f, 8.132f)
                curveTo(13.52f, 7.962f, 13.029f, 7.665f, 13.029f, 7.665f)
                close()
                moveTo(11.383f, 4.878f)
                curveTo(11.432f, 4.838f, 11.436f, 4.353f, 11.436f, 4.353f)
                curveTo(11.436f, 4.353f, 11.609f, 4.411f, 11.609f, 4.487f)
                curveTo(11.609f, 4.534f, 11.596f, 4.561f, 11.576f, 4.602f)
                curveTo(11.564f, 4.626f, 11.55f, 4.656f, 11.534f, 4.698f)
                curveTo(11.496f, 4.803f, 11.6f, 4.868f, 11.696f, 4.928f)
                curveTo(11.703f, 4.933f, 11.711f, 4.938f, 11.718f, 4.942f)
                curveTo(11.783f, 4.984f, 11.802f, 4.894f, 11.816f, 4.824f)
                curveTo(11.824f, 4.785f, 11.83f, 4.753f, 11.843f, 4.753f)
                curveTo(11.878f, 4.753f, 12.141f, 4.812f, 12.339f, 4.913f)
                curveTo(12.511f, 5.001f, 12.681f, 4.958f, 13.069f, 4.859f)
                curveTo(13.126f, 4.845f, 13.187f, 4.829f, 13.254f, 4.812f)
                curveTo(13.777f, 4.683f, 13.846f, 4.878f, 13.899f, 5.031f)
                curveTo(13.953f, 5.185f, 13.547f, 5.397f, 13.254f, 5.436f)
                curveTo(13.125f, 5.453f, 13.013f, 5.447f, 12.911f, 5.442f)
                curveTo(12.78f, 5.436f, 12.663f, 5.43f, 12.544f, 5.473f)
                curveTo(12.358f, 5.539f, 11.774f, 5.533f, 11.546f, 5.53f)
                curveTo(11.514f, 5.53f, 11.49f, 5.529f, 11.474f, 5.529f)
                curveTo(11.369f, 5.529f, 11.349f, 5.496f, 11.31f, 5.43f)
                curveTo(11.3f, 5.413f, 11.288f, 5.394f, 11.274f, 5.373f)
                curveTo(11.203f, 5.269f, 11.289f, 5.201f, 11.345f, 5.201f)
                curveTo(11.401f, 5.201f, 11.383f, 5.078f, 11.345f, 5.031f)
                curveTo(11.307f, 4.984f, 11.333f, 4.917f, 11.383f, 4.878f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE8AA00))) {
                moveTo(6f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.086f, 1.061f)
                verticalLineTo(1.242f)
                curveTo(7.086f, 1.264f, 7.076f, 1.294f, 7.065f, 1.328f)
                curveTo(7.031f, 1.436f, 6.985f, 1.581f, 7.197f, 1.621f)
                curveTo(7.474f, 1.675f, 7.679f, 1.796f, 7.741f, 1.911f)
                curveTo(7.781f, 1.984f, 7.77f, 1.862f, 7.757f, 1.718f)
                verticalLineTo(1.718f)
                curveTo(7.749f, 1.637f, 7.741f, 1.55f, 7.741f, 1.486f)
                curveTo(7.741f, 1.309f, 7.543f, 0.964f, 7.402f, 1.061f)
                curveTo(7.262f, 1.158f, 7.086f, 1.061f, 7.086f, 1.061f)
                close()
                moveTo(7.086f, 10.754f)
                verticalLineTo(10.934f)
                curveTo(7.086f, 10.934f, 7.262f, 10.837f, 7.402f, 10.934f)
                curveTo(7.543f, 11.031f, 7.741f, 10.686f, 7.741f, 10.509f)
                curveTo(7.741f, 10.446f, 7.749f, 10.358f, 7.757f, 10.278f)
                curveTo(7.77f, 10.134f, 7.781f, 10.011f, 7.741f, 10.085f)
                curveTo(7.679f, 10.199f, 7.474f, 10.321f, 7.197f, 10.374f)
                curveTo(6.985f, 10.415f, 7.031f, 10.559f, 7.065f, 10.667f)
                curveTo(7.076f, 10.701f, 7.086f, 10.731f, 7.086f, 10.754f)
                close()
                moveTo(14.918f, 10.754f)
                verticalLineTo(10.934f)
                curveTo(14.918f, 10.934f, 14.741f, 10.837f, 14.601f, 10.934f)
                curveTo(14.46f, 11.031f, 14.262f, 10.686f, 14.262f, 10.509f)
                curveTo(14.262f, 10.446f, 14.254f, 10.358f, 14.247f, 10.278f)
                lineTo(14.247f, 10.278f)
                curveTo(14.234f, 10.134f, 14.222f, 10.011f, 14.262f, 10.085f)
                curveTo(14.324f, 10.199f, 14.529f, 10.321f, 14.807f, 10.374f)
                curveTo(15.018f, 10.415f, 14.972f, 10.559f, 14.938f, 10.667f)
                curveTo(14.927f, 10.701f, 14.918f, 10.731f, 14.918f, 10.754f)
                close()
                moveTo(14.918f, 1.242f)
                verticalLineTo(1.061f)
                curveTo(14.918f, 1.061f, 14.741f, 1.158f, 14.601f, 1.061f)
                curveTo(14.46f, 0.964f, 14.262f, 1.309f, 14.262f, 1.486f)
                curveTo(14.262f, 1.55f, 14.254f, 1.637f, 14.247f, 1.718f)
                curveTo(14.234f, 1.862f, 14.222f, 1.984f, 14.262f, 1.911f)
                curveTo(14.324f, 1.796f, 14.529f, 1.675f, 14.807f, 1.621f)
                curveTo(15.018f, 1.581f, 14.972f, 1.436f, 14.938f, 1.328f)
                curveTo(14.927f, 1.294f, 14.918f, 1.264f, 14.918f, 1.242f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SriLankaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SriLanka,
            contentDescription = "Sri Lanka Flag"
        )
    }
}
