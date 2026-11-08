package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * South Georgia Flag (20x15dp)
 *
 * - ISO Alpha-2: GS
 * - ISO Alpha-3: SGS
 * - ISO Numeric: 239
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SouthGeorgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Georgia:GS:SGS:239:Medium",
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
                fill = SolidColor(Color(0xFF2B409A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6A4C2D))) {
                moveTo(15.199f, 11.595f)
                curveTo(15.16f, 11.595f, 15.021f, 11.52f, 15.021f, 11.52f)
                curveTo(15.021f, 11.52f, 14.92f, 11.679f, 14.867f, 11.689f)
                curveTo(14.814f, 11.698f, 14.54f, 11.59f, 14.54f, 11.59f)
                curveTo(14.54f, 11.59f, 14.348f, 11.74f, 14.305f, 11.731f)
                curveTo(14.262f, 11.722f, 13.819f, 11.628f, 13.819f, 11.628f)
                lineTo(13.579f, 11.477f)
                curveTo(13.579f, 11.477f, 13.445f, 11.693f, 13.44f, 11.689f)
                curveTo(13.435f, 11.684f, 13.036f, 11.609f, 13.036f, 11.609f)
                curveTo(13.036f, 11.609f, 13.156f, 11.444f, 13.156f, 11.44f)
                curveTo(13.156f, 11.435f, 13.099f, 11.416f, 13.099f, 11.416f)
                lineTo(13.012f, 11.487f)
                lineTo(12.656f, 11.52f)
                lineTo(12.743f, 11.275f)
                lineTo(12.882f, 11.069f)
                lineTo(14.588f, 9.448f)
                lineTo(15.429f, 10.965f)
                lineTo(15.304f, 11.421f)
                curveTo(15.304f, 11.421f, 15.237f, 11.595f, 15.199f, 11.595f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFBB00)),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.569f, 11.288f)
                curveTo(13.628f, 11.36f, 14.411f, 12.16f, 14.538f, 12.539f)
                curveTo(14.665f, 12.917f, 13.509f, 12.434f, 13.509f, 12.434f)
                curveTo(13.509f, 12.434f, 14.965f, 11.488f, 15.692f, 11.488f)
                curveTo(16.419f, 11.488f, 17.849f, 12.434f, 17.849f, 12.434f)
                curveTo(17.849f, 12.434f, 16.89f, 13.109f, 16.899f, 12.683f)
                curveTo(16.909f, 12.257f, 17.35f, 11.418f, 17.875f, 11.288f)
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(18.464f, 11.35f)
                lineTo(18.225f, 11.261f)
                lineTo(18.013f, 10.981f)
                lineTo(17.136f, 10.916f)
                lineTo(16.337f, 10.698f)
                lineTo(16f, 10.923f)
                lineTo(16.181f, 11.16f)
                lineTo(16.625f, 11.323f)
                lineTo(18.464f, 11.35f)
                close()
            }
            path(fill = SolidColor(Color(0xFF656263))) {
                moveTo(14.962f, 6.166f)
                curveTo(14.97f, 6.187f, 15.149f, 6.15f, 15.187f, 6.258f)
                curveTo(15.379f, 5.973f, 15.605f, 6.244f, 15.605f, 6.244f)
                lineTo(15.795f, 6.019f)
                lineTo(16.01f, 6.223f)
                lineTo(16.206f, 6.207f)
                lineTo(16.412f, 6.69f)
                lineTo(14.789f, 6.66f)
                curveTo(14.789f, 6.66f, 14.954f, 6.146f, 14.962f, 6.166f)
                close()
            }
            path(fill = SolidColor(Color(0xFF656263))) {
                moveTo(16.645f, 8.221f)
                curveTo(16.632f, 8.068f, 16.496f, 8.05f, 16.42f, 8.056f)
                curveTo(16.345f, 8.061f, 16.277f, 8.124f, 16.277f, 8.124f)
                lineTo(16.027f, 7.969f)
                curveTo(16.027f, 7.969f, 16.152f, 7.197f, 16.285f, 7.148f)
                curveTo(16.411f, 7.059f, 16.433f, 7.021f, 16.433f, 7f)
                curveTo(16.433f, 6.98f, 16.386f, 6.897f, 16.386f, 6.897f)
                lineTo(15.57f, 6.803f)
                lineTo(14.798f, 6.892f)
                curveTo(14.798f, 6.892f, 14.738f, 7.013f, 14.746f, 7.049f)
                curveTo(14.754f, 7.084f, 14.756f, 7.123f, 14.894f, 7.227f)
                curveTo(15.047f, 7.342f, 15.153f, 8.002f, 15.153f, 8.002f)
                curveTo(15.153f, 8.002f, 14.936f, 8.106f, 14.923f, 8.094f)
                curveTo(14.91f, 8.081f, 14.845f, 8.068f, 14.811f, 8.073f)
                curveTo(14.777f, 8.079f, 14.665f, 8.135f, 14.665f, 8.28f)
                curveTo(14.665f, 8.425f, 14.777f, 8.509f, 14.777f, 8.509f)
                curveTo(14.777f, 8.509f, 15.515f, 9.05f, 15.625f, 9.249f)
                curveTo(15.732f, 9.009f, 16.433f, 8.468f, 16.517f, 8.428f)
                curveTo(16.551f, 8.407f, 16.658f, 8.374f, 16.645f, 8.221f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.381f, 7.501f)
                curveTo(17.443f, 7.461f, 17.851f, 7.441f, 17.949f, 7.501f)
                curveTo(18.047f, 7.561f, 18.084f, 7.856f, 18.084f, 7.856f)
                curveTo(18.084f, 7.856f, 18.145f, 7.96f, 18.149f, 8.036f)
                curveTo(18.153f, 8.112f, 18.162f, 8.164f, 18.162f, 8.164f)
                curveTo(18.162f, 8.164f, 18.488f, 8.579f, 18.492f, 8.954f)
                curveTo(18.529f, 9.21f, 18.521f, 9.892f, 18.419f, 10.151f)
                curveTo(18.415f, 10.475f, 18.276f, 10.686f, 18.276f, 10.686f)
                curveTo(18.276f, 10.686f, 18.309f, 10.742f, 18.305f, 10.802f)
                curveTo(18.3f, 10.862f, 18.268f, 10.918f, 18.268f, 10.918f)
                lineTo(17.962f, 11.05f)
                lineTo(17.622f, 10.994f)
                lineTo(17.238f, 9.872f)
                lineTo(17.328f, 7.976f)
                lineTo(17.353f, 7.88f)
                lineTo(17.312f, 7.625f)
                curveTo(17.312f, 7.625f, 17.32f, 7.541f, 17.381f, 7.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(15.164f, 8.496f)
                curveTo(15.164f, 8.496f, 15.577f, 8.496f, 15.622f, 8.627f)
                curveTo(15.7f, 8.453f, 16.057f, 8.464f, 16.057f, 8.464f)
                curveTo(16.273f, 8.456f, 16.489f, 8.449f, 16.705f, 8.442f)
                curveTo(16.709f, 8.951f, 16.712f, 9.461f, 16.716f, 9.97f)
                curveTo(16.59f, 10.563f, 16.15f, 10.981f, 15.666f, 11.16f)
                curveTo(15.089f, 10.978f, 14.724f, 10.501f, 14.605f, 9.959f)
                curveTo(14.583f, 9.475f, 14.561f, 8.991f, 14.538f, 8.507f)
                curveTo(14.747f, 8.504f, 14.955f, 8.5f, 15.164f, 8.496f)
                close()
            }
            path(fill = SolidColor(Color(0xFF006B00))) {
                moveTo(14.761f, 8.502f)
                lineTo(15.672f, 10.874f)
                lineTo(16.495f, 8.45f)
                curveTo(16.24f, 8.466f, 15.692f, 8.411f, 15.624f, 8.638f)
                curveTo(15.519f, 8.435f, 14.942f, 8.517f, 14.761f, 8.502f)
                verticalLineTo(8.502f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.817f, 8.674f)
                curveTo(15.817f, 8.674f, 15.9f, 8.89f, 15.817f, 8.997f)
                curveTo(15.734f, 9.104f, 15.824f, 9.192f, 15.874f, 9.192f)
                curveTo(15.924f, 9.192f, 16.096f, 9.362f, 15.956f, 9.362f)
                curveTo(15.817f, 9.362f, 15.738f, 9.309f, 15.738f, 9.458f)
                curveTo(15.738f, 9.607f, 16.045f, 10.539f, 16.001f, 10.336f)
                curveTo(15.956f, 10.133f, 15.913f, 10.181f, 15.913f, 10.005f)
                curveTo(15.913f, 9.83f, 15.956f, 9.635f, 15.956f, 9.635f)
                curveTo(15.956f, 9.635f, 16.029f, 9.69f, 15.977f, 9.89f)
                curveTo(15.925f, 10.09f, 15.686f, 10.381f, 15.627f, 10.392f)
                curveTo(15.567f, 10.403f, 15.475f, 10.497f, 15.463f, 10.325f)
                curveTo(15.451f, 10.153f, 15.402f, 10.072f, 15.441f, 10.039f)
                curveTo(15.481f, 10.005f, 15.533f, 9.886f, 15.55f, 9.98f)
                curveTo(15.567f, 10.074f, 15.493f, 10.164f, 15.505f, 10.198f)
                curveTo(15.517f, 10.231f, 15.524f, 10.308f, 15.575f, 10.244f)
                curveTo(15.627f, 10.18f, 15.657f, 10.074f, 15.696f, 10.172f)
                curveTo(15.734f, 10.27f, 15.735f, 10.193f, 15.655f, 10.005f)
                curveTo(15.575f, 9.818f, 15.507f, 9.714f, 15.517f, 9.55f)
                curveTo(15.527f, 9.385f, 15.514f, 9.324f, 15.527f, 9.271f)
                curveTo(15.54f, 9.218f, 15.384f, 8.961f, 15.423f, 8.887f)
                curveTo(15.463f, 8.813f, 15.478f, 8.573f, 15.527f, 8.617f)
                curveTo(15.575f, 8.66f, 15.6f, 8.717f, 15.575f, 8.782f)
                curveTo(15.55f, 8.846f, 15.525f, 8.91f, 15.55f, 8.954f)
                curveTo(15.575f, 8.997f, 15.661f, 9.122f, 15.678f, 9.091f)
                curveTo(15.696f, 9.059f, 15.753f, 9.09f, 15.753f, 8.911f)
                curveTo(15.753f, 8.733f, 15.689f, 8.67f, 15.729f, 8.627f)
                curveTo(15.77f, 8.585f, 15.817f, 8.674f, 15.817f, 8.674f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E5AA6))) {
                moveTo(16.5f, 8.45f)
                lineTo(16.623f, 8.447f)
                lineTo(16.404f, 8.719f)
                lineTo(16.667f, 9.019f)
                lineTo(16.149f, 9.657f)
                lineTo(16.638f, 10.231f)
                curveTo(16.584f, 10.36f, 16.522f, 10.477f, 16.439f, 10.583f)
                lineTo(16.158f, 10.28f)
                lineTo(16.667f, 9.66f)
                lineTo(16.249f, 9.197f)
                lineTo(16.5f, 8.45f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E5AA6))) {
                moveTo(14.613f, 8.508f)
                lineTo(14.859f, 8.768f)
                lineTo(14.599f, 9.085f)
                lineTo(15.14f, 9.66f)
                lineTo(14.692f, 10.246f)
                curveTo(14.746f, 10.375f, 14.823f, 10.517f, 14.906f, 10.623f)
                lineTo(15.172f, 10.294f)
                lineTo(14.625f, 9.7f)
                lineTo(15.026f, 9.202f)
                lineTo(14.745f, 8.505f)
                lineTo(14.613f, 8.508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E5AA6))) {
                moveTo(15.354f, 10.049f)
                lineTo(15.16f, 10.3f)
                lineTo(15.851f, 11.081f)
                curveTo(15.973f, 11.02f, 16.069f, 10.952f, 16.173f, 10.869f)
                lineTo(15.813f, 10.463f)
                lineTo(15.959f, 10.043f)
                lineTo(16.17f, 10.28f)
                lineTo(15.512f, 11.101f)
                curveTo(15.401f, 11.055f, 15.28f, 10.983f, 15.169f, 10.895f)
                lineTo(15.517f, 10.463f)
                lineTo(15.354f, 10.049f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD5DFFF),
                        1f to Color.White
                    ),
                    start = Offset(17.672f, 9.754f),
                    end = Offset(18.136f, 9.749f)
                )
            ) {
                moveTo(17.741f, 8.032f)
                curveTo(17.741f, 8.072f, 17.784f, 10.427f, 17.832f, 10.405f)
                curveTo(17.951f, 10.349f, 17.978f, 10.471f, 17.978f, 10.471f)
                curveTo(17.978f, 10.471f, 18.019f, 10.858f, 17.916f, 10.91f)
                curveTo(17.733f, 11.006f, 17.652f, 11.027f, 17.652f, 11.027f)
                lineTo(17.475f, 10.898f)
                curveTo(17.475f, 10.898f, 17.296f, 10.646f, 17.255f, 10.535f)
                curveTo(17.214f, 10.423f, 17.165f, 9.924f, 17.181f, 9.816f)
                curveTo(17.198f, 9.708f, 17.21f, 9.078f, 17.202f, 9.046f)
                curveTo(17.194f, 9.014f, 17.161f, 8.487f, 17.181f, 8.407f)
                curveTo(17.202f, 8.327f, 17.328f, 7.976f, 17.324f, 7.976f)
                curveTo(17.324f, 7.976f, 17.741f, 7.992f, 17.741f, 8.032f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(17.332f, 7.629f)
                curveTo(17.418f, 7.629f, 17.483f, 7.701f, 17.504f, 7.765f)
                curveTo(17.508f, 7.792f, 17.496f, 7.812f, 17.5f, 7.864f)
                curveTo(17.504f, 7.916f, 16.879f, 7.876f, 16.875f, 7.872f)
                curveTo(16.875f, 7.872f, 17.165f, 7.597f, 17.332f, 7.629f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.731f, 7.806f)
                curveTo(17.731f, 7.834f, 17.708f, 7.856f, 17.681f, 7.856f)
                curveTo(17.653f, 7.856f, 17.631f, 7.834f, 17.631f, 7.806f)
                curveTo(17.631f, 7.779f, 17.653f, 7.756f, 17.681f, 7.756f)
                curveTo(17.708f, 7.756f, 17.731f, 7.779f, 17.731f, 7.806f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(16.138f, 7.443f)
                curveTo(16.138f, 7.443f, 16.463f, 7.787f, 16.674f, 7.783f)
                curveTo(16.712f, 7.884f, 16.578f, 7.978f, 16.525f, 8.023f)
                curveTo(16.417f, 7.99f, 16.32f, 8.029f, 16.072f, 7.73f)
                curveTo(16.087f, 7.539f, 16.142f, 7.45f, 16.138f, 7.443f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(17.432f, 5.711f)
                curveTo(17.462f, 5.932f, 17.981f, 6.203f, 18.13f, 6.019f)
                curveTo(18.115f, 6.102f, 18.142f, 6.359f, 17.354f, 6.355f)
                curveTo(17.653f, 6.632f, 17.056f, 6.931f, 16.888f, 6.863f)
                curveTo(17.198f, 6.631f, 16.8f, 6.493f, 16.578f, 6.643f)
                curveTo(16.62f, 6.515f, 16.93f, 5.876f, 17.432f, 5.711f)
                close()
            }
            path(
                fill = SolidColor(Color.Blue),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.906f, 7.26f)
                curveTo(16.847f, 7.017f, 16.819f, 6.738f, 16.949f, 6.631f)
                curveTo(16.777f, 6.515f, 16.59f, 6.635f, 16.59f, 6.635f)
                curveTo(16.588f, 6.638f, 16.585f, 6.643f, 16.58f, 6.65f)
                curveTo(16.54f, 6.705f, 16.406f, 6.89f, 16.59f, 7.223f)
                curveTo(16.1f, 7.096f, 16.305f, 7.54f, 16.341f, 7.574f)
                curveTo(16.36f, 7.503f, 16.62f, 7.436f, 16.685f, 7.798f)
                curveTo(16.707f, 7.872f, 16.575f, 7.978f, 16.533f, 8.012f)
                curveTo(16.524f, 8.019f, 16.518f, 8.023f, 16.521f, 8.023f)
                curveTo(16.521f, 8.023f, 16.935f, 8.107f, 16.989f, 7.559f)
                curveTo(17.06f, 7.517f, 17.404f, 7.288f, 17.393f, 6.815f)
                curveTo(17.077f, 6.821f, 16.938f, 7.169f, 16.906f, 7.26f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(15.055f, 7.54f)
                curveTo(15.055f, 7.54f, 14.737f, 7.81f, 14.557f, 7.723f)
                curveTo(14.423f, 7.802f, 14.266f, 7.664f, 14.266f, 7.664f)
                curveTo(14.266f, 7.664f, 14.45f, 8.326f, 15.108f, 7.847f)
                curveTo(15.097f, 7.701f, 15.062f, 7.551f, 15.055f, 7.54f)
                close()
            }
            path(fill = SolidColor(Color.Blue)) {
                moveTo(14.553f, 7.712f)
                curveTo(14.58f, 7.574f, 14.691f, 7.506f, 14.779f, 7.637f)
                curveTo(14.898f, 7.66f, 15.017f, 7.185f, 14.595f, 7.263f)
                curveTo(14.714f, 6.643f, 14.358f, 6.411f, 14.358f, 6.411f)
                curveTo(14.358f, 6.411f, 14.232f, 7.099f, 14.289f, 7.226f)
                curveTo(14.347f, 7.353f, 14.205f, 6.99f, 13.75f, 6.889f)
                curveTo(13.742f, 7.409f, 14.259f, 7.652f, 14.259f, 7.652f)
                curveTo(14.259f, 7.652f, 14.404f, 7.783f, 14.553f, 7.712f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(14.123f, 6.962f)
                curveTo(13.989f, 7.003f, 13.663f, 6.806f, 13.87f, 6.552f)
                curveTo(13.192f, 6.537f, 12.824f, 5.965f, 13.049f, 6.074f)
                curveTo(13.275f, 6.183f, 13.436f, 5.95f, 13.605f, 6.074f)
                curveTo(13.398f, 5.887f, 13.677f, 5.737f, 13.677f, 5.737f)
                curveTo(13.677f, 5.737f, 14.255f, 5.906f, 14.358f, 6.407f)
                curveTo(14.324f, 6.504f, 14.309f, 6.676f, 14.301f, 6.669f)
                curveTo(14.301f, 6.665f, 13.943f, 6.662f, 14.123f, 6.962f)
                close()
            }
            path(fill = SolidColor(Color(0xFF923F00))) {
                moveTo(15.422f, 4.672f)
                curveTo(15.358f, 4.858f, 15.128f, 4.788f, 15.128f, 4.788f)
                curveTo(15.128f, 4.788f, 15.135f, 4.881f, 15.112f, 4.926f)
                curveTo(15.131f, 4.94f, 15.267f, 5.045f, 15.411f, 5.072f)
                curveTo(15.617f, 5.111f, 16.038f, 5.004f, 16.18f, 5.162f)
                curveTo(16.322f, 5.319f, 16.314f, 5.446f, 16.314f, 5.446f)
                curveTo(16.314f, 5.446f, 16.13f, 5.467f, 16.181f, 5.532f)
                curveTo(16.214f, 5.574f, 16.306f, 5.605f, 16.314f, 5.649f)
                curveTo(16.34f, 5.787f, 16.228f, 6.037f, 16.268f, 6.13f)
                curveTo(16.204f, 6.136f, 16.199f, 6.201f, 16.199f, 6.201f)
                curveTo(16.196f, 6.275f, 16.012f, 6.231f, 16.012f, 6.231f)
                curveTo(16.012f, 6.231f, 16.126f, 5.943f, 16.134f, 5.876f)
                curveTo(16.142f, 5.809f, 16.054f, 5.689f, 15.985f, 5.689f)
                curveTo(15.916f, 5.689f, 15.866f, 5.902f, 15.866f, 5.902f)
                curveTo(15.866f, 5.902f, 15.832f, 6.063f, 15.843f, 6.078f)
                curveTo(15.855f, 6.093f, 15.797f, 6.026f, 15.797f, 6.026f)
                curveTo(15.797f, 6.026f, 15.779f, 6.091f, 15.75f, 6.13f)
                curveTo(15.716f, 6.175f, 15.671f, 6.194f, 15.671f, 6.194f)
                curveTo(15.671f, 6.194f, 15.637f, 6.096f, 15.648f, 6.059f)
                curveTo(15.66f, 6.022f, 15.836f, 5.876f, 15.82f, 5.771f)
                curveTo(15.814f, 5.725f, 15.807f, 5.644f, 15.75f, 5.618f)
                curveTo(15.676f, 5.584f, 15.542f, 5.608f, 15.461f, 5.592f)
                curveTo(15.416f, 5.668f, 15.395f, 6.085f, 15.426f, 6.112f)
                curveTo(15.457f, 6.138f, 15.35f, 6.194f, 15.35f, 6.194f)
                lineTo(15.223f, 6.197f)
                curveTo(15.221f, 6.141f, 15.298f, 5.986f, 15.298f, 5.855f)
                curveTo(15.298f, 5.724f, 15.307f, 5.584f, 15.307f, 5.584f)
                curveTo(15.307f, 5.584f, 15.222f, 5.606f, 15.177f, 5.689f)
                curveTo(15.139f, 5.759f, 15.139f, 5.891f, 15.143f, 5.91f)
                curveTo(15.151f, 5.951f, 15.189f, 6.067f, 15.177f, 6.1f)
                curveTo(15.166f, 6.134f, 14.967f, 6.179f, 14.967f, 6.179f)
                lineTo(14.959f, 6.07f)
                curveTo(14.959f, 6.07f, 15.043f, 6.018f, 15.043f, 5.887f)
                curveTo(15.043f, 5.756f, 15.051f, 5.569f, 15.047f, 5.558f)
                curveTo(15.045f, 5.551f, 14.978f, 5.265f, 14.891f, 5.072f)
                curveTo(14.832f, 4.943f, 14.742f, 4.884f, 14.737f, 4.874f)
                curveTo(14.726f, 4.847f, 14.726f, 4.817f, 14.726f, 4.817f)
                curveTo(14.726f, 4.817f, 14.599f, 4.907f, 14.45f, 4.716f)
                curveTo(14.587f, 4.602f, 14.733f, 4.687f, 14.733f, 4.687f)
                curveTo(14.733f, 4.687f, 14.772f, 4.582f, 14.948f, 4.589f)
                curveTo(15.124f, 4.597f, 15.158f, 4.694f, 15.151f, 4.683f)
                curveTo(15.151f, 4.683f, 15.281f, 4.571f, 15.422f, 4.672f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB4B6B9))) {
                moveTo(14.767f, 7.102f)
                lineTo(15.573f, 7.617f)
                lineTo(16.298f, 7.141f)
                curveTo(16.298f, 7.141f, 16.449f, 7.059f, 16.436f, 7f)
                curveTo(16.423f, 6.942f, 16.371f, 6.965f, 16.345f, 6.975f)
                curveTo(16.319f, 6.985f, 15.586f, 7.492f, 15.586f, 7.492f)
                lineTo(14.806f, 7.01f)
                curveTo(14.806f, 7.01f, 14.748f, 6.993f, 14.738f, 7.028f)
                curveTo(14.728f, 7.064f, 14.759f, 7.084f, 14.767f, 7.102f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(17.467f, 10.892f)
                curveTo(17.467f, 10.892f, 17.167f, 10.872f, 17.213f, 10.959f)
                curveTo(17.238f, 11.007f, 17.635f, 11.001f, 17.635f, 11.001f)
                lineTo(17.467f, 10.892f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(17.609f, 11.008f)
                lineTo(17.297f, 11.017f)
                curveTo(17.297f, 11.017f, 17.218f, 11.087f, 17.213f, 11.104f)
                curveTo(17.208f, 11.121f, 17.265f, 11.125f, 17.265f, 11.125f)
                curveTo(17.265f, 11.125f, 17.587f, 11.207f, 17.831f, 11.154f)
                curveTo(17.954f, 11.112f, 17.976f, 11.062f, 17.889f, 11.031f)
                curveTo(17.803f, 11f, 17.612f, 11.01f, 17.609f, 11.008f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8A9396))) {
                moveTo(13.994f, 8.119f)
                curveTo(13.994f, 8.119f, 13.953f, 8.244f, 13.994f, 8.306f)
                curveTo(14.035f, 8.369f, 14.291f, 8.874f, 14.291f, 8.874f)
                curveTo(14.291f, 8.874f, 14.465f, 8.664f, 14.529f, 8.658f)
                curveTo(14.593f, 8.653f, 14.564f, 9.204f, 14.564f, 9.204f)
                curveTo(14.564f, 9.204f, 14.459f, 9.3f, 14.395f, 9.295f)
                curveTo(14.331f, 9.289f, 14.552f, 9.511f, 14.546f, 9.698f)
                curveTo(14.54f, 9.886f, 14.256f, 10.817f, 14.151f, 10.834f)
                curveTo(14.047f, 10.851f, 13.956f, 10.659f, 13.956f, 10.492f)
                curveTo(13.956f, 10.326f, 14.064f, 10.062f, 14.058f, 9.988f)
                curveTo(14.052f, 9.914f, 13.538f, 10.78f, 13.507f, 10.915f)
                curveTo(13.501f, 10.94f, 13.535f, 11.033f, 13.535f, 11.033f)
                curveTo(13.535f, 11.033f, 13.333f, 11.05f, 13.378f, 11.306f)
                curveTo(12.785f, 11.101f, 12.494f, 10.749f, 12.5f, 10.391f)
                curveTo(12.502f, 10.254f, 12.372f, 9.931f, 12.5f, 9.575f)
                curveTo(12.707f, 9.001f, 13.212f, 8.347f, 13.215f, 8.284f)
                curveTo(13.221f, 8.181f, 13.262f, 8.136f, 13.267f, 8.079f)
                curveTo(13.273f, 8.022f, 13.25f, 7.732f, 13.308f, 7.681f)
                curveTo(13.366f, 7.63f, 13.669f, 7.505f, 13.744f, 7.511f)
                curveTo(13.82f, 7.516f, 13.884f, 7.568f, 13.884f, 7.568f)
                curveTo(13.884f, 7.568f, 14.169f, 7.568f, 14.186f, 7.675f)
                curveTo(14.203f, 7.784f, 14.128f, 7.823f, 14.128f, 7.823f)
                curveTo(14.128f, 7.823f, 14.169f, 7.977f, 13.994f, 8.119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2B2B2B))) {
                moveTo(14.164f, 11.341f)
                curveTo(14.26f, 11.407f, 14.482f, 11.447f, 14.482f, 11.447f)
                curveTo(14.482f, 11.447f, 13.937f, 11.594f, 13.383f, 11.309f)
                curveTo(13.332f, 11.087f, 13.502f, 11.037f, 13.544f, 11.035f)
                curveTo(13.642f, 11.01f, 14.068f, 11.274f, 14.164f, 11.341f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00713D))) {
                moveTo(14.831f, 11.317f)
                curveTo(15.427f, 11.633f, 15.491f, 11.42f, 15.902f, 11.121f)
                curveTo(15.93f, 11.1f, 16.066f, 11.602f, 16.642f, 11.317f)
                curveTo(17.456f, 10.915f, 15.943f, 10.244f, 15.729f, 10.258f)
                curveTo(15.515f, 10.273f, 14.234f, 11.002f, 14.831f, 11.317f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFCDAD56)),
                strokeLineWidth = 0.25f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(14.815f, 4.64f)
                curveTo(14.815f, 4.64f, 14.538f, 4.276f, 14.538f, 4.193f)
            }
            path(
                stroke = SolidColor(Color(0xFFCDAD56)),
                strokeLineWidth = 0.25f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(15.038f, 4.64f)
                curveTo(15.038f, 4.64f, 15.315f, 4.276f, 15.315f, 4.193f)
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
private fun SouthGeorgiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SouthGeorgia,
            contentDescription = "South Georgia Flag"
        )
    }
}
