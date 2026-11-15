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
 * Fiji Flag (20x15dp)
 *
 * - ISO Alpha-2: FJ
 * - ISO Alpha-3: FJI
 * - ISO Numeric: 242
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Fiji: ImageVector by lazy {
    ImageVector.Builder(
        name = "Fiji:FJ:FJI:242:Medium",
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
                fill = SolidColor(Color(0xFF67BFE5)),
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
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.5f, 6.25f)
            horizontalLineTo(18.535f)
            verticalLineTo(11.458f)
            curveTo(18.535f, 11.458f, 18.028f, 13.75f, 15.517f, 13.75f)
            curveTo(13.006f, 13.75f, 12.5f, 11.458f, 12.5f, 11.458f)
            verticalLineTo(6.25f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(12.5f, 6.25f)
                horizontalLineTo(18.535f)
                verticalLineTo(11.458f)
                curveTo(18.535f, 11.458f, 18.028f, 13.75f, 15.517f, 13.75f)
                curveTo(13.006f, 13.75f, 12.5f, 11.458f, 12.5f, 11.458f)
                verticalLineTo(6.25f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(12.5f, 6.25f)
                horizontalLineToRelative(6.034f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-6.034f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(15.086f, 7.917f)
                horizontalLineToRelative(0.862f)
                verticalLineToRelative(5.833f)
                horizontalLineToRelative(-0.862f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC3352C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.5f, 10.208f)
                horizontalLineTo(18.535f)
                verticalLineTo(11.042f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.208f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.088f, 12.961f)
                curveTo(14.451f, 13.474f, 14.746f, 13.674f, 14.955f, 13.372f)
                curveTo(15.102f, 13.159f, 15.117f, 12.947f, 14.908f, 12.905f)
                curveTo(14.787f, 12.751f, 14.701f, 12.63f, 14.652f, 12.547f)
                lineTo(14.659f, 12.54f)
                curveTo(14.718f, 12.483f, 14.72f, 12.407f, 14.708f, 12.378f)
                curveTo(14.704f, 12.34f, 14.733f, 12.287f, 14.922f, 12.143f)
                curveTo(15.092f, 12.012f, 15.168f, 11.889f, 15.056f, 11.754f)
                curveTo(14.998f, 11.683f, 14.945f, 11.668f, 14.778f, 11.643f)
                lineTo(14.727f, 11.635f)
                curveTo(14.677f, 11.627f, 14.641f, 11.619f, 14.619f, 11.612f)
                lineTo(14.503f, 11.39f)
                curveTo(14.26f, 11.382f, 14.071f, 11.425f, 13.864f, 11.512f)
                curveTo(13.775f, 11.55f, 13.715f, 11.576f, 13.675f, 11.593f)
                lineTo(13.675f, 11.593f)
                lineTo(13.675f, 11.593f)
                curveTo(13.614f, 11.619f, 13.599f, 11.625f, 13.599f, 11.624f)
                curveTo(13.598f, 11.624f, 13.6f, 11.623f, 13.601f, 11.622f)
                curveTo(13.606f, 11.618f, 13.614f, 11.611f, 13.602f, 11.611f)
                curveTo(13.559f, 11.611f, 13.512f, 11.606f, 13.38f, 11.59f)
                lineTo(13.355f, 11.587f)
                curveTo(12.977f, 11.539f, 12.883f, 11.541f, 12.822f, 11.716f)
                curveTo(12.729f, 11.983f, 13.279f, 12.473f, 13.572f, 12.532f)
                curveTo(13.718f, 12.561f, 13.893f, 12.702f, 14.088f, 12.961f)
                close()
                moveTo(14.498f, 12.593f)
                curveTo(14.533f, 12.593f, 14.561f, 12.591f, 14.585f, 12.585f)
                lineTo(14.592f, 12.569f)
                curveTo(14.573f, 12.582f, 14.543f, 12.593f, 14.498f, 12.593f)
                close()
                moveTo(13.121f, 11.855f)
                curveTo(13.114f, 11.846f, 13.111f, 11.834f, 13.117f, 11.819f)
                curveTo(13.116f, 11.822f, 13.119f, 11.829f, 13.127f, 11.839f)
                curveTo(13.134f, 11.848f, 13.145f, 11.861f, 13.159f, 11.875f)
                curveTo(13.142f, 11.87f, 13.129f, 11.864f, 13.121f, 11.855f)
                close()
                moveTo(13.633f, 12.226f)
                curveTo(13.529f, 12.205f, 13.262f, 11.983f, 13.159f, 11.875f)
                curveTo(13.186f, 11.883f, 13.223f, 11.887f, 13.262f, 11.891f)
                lineTo(13.262f, 11.891f)
                curveTo(13.28f, 11.892f, 13.298f, 11.894f, 13.316f, 11.897f)
                lineTo(13.341f, 11.9f)
                curveTo(13.488f, 11.918f, 13.54f, 11.924f, 13.602f, 11.924f)
                curveTo(13.639f, 11.924f, 13.631f, 11.936f, 13.627f, 11.944f)
                curveTo(13.625f, 11.946f, 13.624f, 11.948f, 13.625f, 11.949f)
                curveTo(13.627f, 11.953f, 13.655f, 11.94f, 13.798f, 11.88f)
                lineTo(13.798f, 11.88f)
                lineTo(13.986f, 11.8f)
                curveTo(14.096f, 11.754f, 14.197f, 11.723f, 14.308f, 11.71f)
                curveTo(14.321f, 11.762f, 14.351f, 11.809f, 14.401f, 11.848f)
                curveTo(14.467f, 11.899f, 14.542f, 11.921f, 14.672f, 11.942f)
                curveTo(14.511f, 12.075f, 14.43f, 12.185f, 14.405f, 12.293f)
                curveTo(14.26f, 12.339f, 14.273f, 12.502f, 14.36f, 12.664f)
                curveTo(14.42f, 12.778f, 14.535f, 12.939f, 14.705f, 13.152f)
                lineTo(14.827f, 13.21f)
                curveTo(14.791f, 13.21f, 14.771f, 13.194f, 14.755f, 13.181f)
                curveTo(14.736f, 13.165f, 14.724f, 13.156f, 14.698f, 13.194f)
                curveTo(14.697f, 13.196f, 14.583f, 13.119f, 14.34f, 12.777f)
                curveTo(14.102f, 12.458f, 13.87f, 12.273f, 13.633f, 12.226f)
                close()
                moveTo(14.396f, 12.413f)
                curveTo(14.398f, 12.411f, 14.397f, 12.409f, 14.397f, 12.406f)
                lineTo(14.397f, 12.406f)
                lineTo(14.396f, 12.413f)
                close()
                moveTo(14.495f, 12.28f)
                lineTo(14.486f, 12.281f)
                lineTo(14.49f, 12.281f)
                curveTo(14.492f, 12.281f, 14.494f, 12.281f, 14.495f, 12.28f)
                close()
                moveTo(14.498f, 12.28f)
                curveTo(14.497f, 12.28f, 14.496f, 12.28f, 14.495f, 12.28f)
                lineTo(14.498f, 12.28f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.534f, 10.069f)
                curveTo(13.534f, 10.069f, 13.236f, 9.656f, 13.236f, 9.509f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.349f, 9.714f)
                curveTo(13.349f, 9.714f, 12.968f, 9.551f, 12.968f, 9.714f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.343f, 9.543f)
                curveTo(13.343f, 9.543f, 13.075f, 9.202f, 12.873f, 9.202f)
                curveTo(12.672f, 9.202f, 12.677f, 9.372f, 12.677f, 9.372f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.19f, 9.201f)
                curveTo(13.19f, 9.201f, 13.07f, 8.643f, 12.879f, 8.643f)
                curveTo(12.687f, 8.643f, 12.687f, 8.922f, 12.687f, 8.922f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.238f, 9.2f)
                curveTo(13.238f, 9.2f, 13.185f, 8.722f, 13.432f, 8.722f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.913f, 9.988f)
                curveTo(13.913f, 9.988f, 13.774f, 9.499f, 13.824f, 9.36f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.86f, 9.592f)
                curveTo(13.86f, 9.592f, 13.558f, 9.308f, 13.502f, 9.461f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.913f, 9.429f)
                curveTo(13.913f, 9.429f, 13.778f, 9.016f, 13.588f, 8.947f)
                curveTo(13.399f, 8.878f, 13.345f, 9.04f, 13.345f, 9.04f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.886f, 9.055f)
                curveTo(13.886f, 9.055f, 13.965f, 8.49f, 13.785f, 8.424f)
                curveTo(13.604f, 8.359f, 13.509f, 8.621f, 13.509f, 8.621f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.932f, 9.071f)
                curveTo(13.932f, 9.071f, 14.046f, 8.603f, 14.277f, 8.687f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.22f, 10.163f)
                curveTo(14.22f, 10.163f, 14.418f, 9.694f, 14.385f, 9.55f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.321f, 9.775f)
                curveTo(14.321f, 9.775f, 14.656f, 9.531f, 14.692f, 9.69f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.288f, 9.607f)
                curveTo(14.288f, 9.607f, 14.473f, 9.214f, 14.669f, 9.169f)
                curveTo(14.866f, 9.124f, 14.899f, 9.291f, 14.899f, 9.291f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.36f, 9.24f)
                curveTo(14.36f, 9.24f, 14.351f, 8.669f, 14.538f, 8.626f)
                curveTo(14.725f, 8.583f, 14.788f, 8.855f, 14.788f, 8.855f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.313f, 9.25f)
                curveTo(14.313f, 9.25f, 14.257f, 8.772f, 14.017f, 8.827f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.686f, 9.876f)
                curveTo(16.686f, 9.876f, 16.837f, 9.18f, 17.268f, 9.18f)
                curveTo(17.698f, 9.18f, 17.891f, 9.915f, 17.891f, 9.915f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.331f, 9.401f)
                curveTo(16.331f, 9.401f, 16.563f, 8.99f, 17.327f, 9.024f)
                curveTo(18.092f, 9.057f, 18.232f, 9.401f, 18.232f, 9.401f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.176f, 8.878f)
                curveTo(16.176f, 8.878f, 16.596f, 8.358f, 17.185f, 8.799f)
                lineTo(17.385f, 8.878f)
                curveTo(17.385f, 8.878f, 17.585f, 8.289f, 18.551f, 8.878f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(17.337f, 10.023f)
                curveTo(17.337f, 10.023f, 17.367f, 9.374f, 17.47f, 9.195f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(18.187f, 11.446f)
                curveTo(18.187f, 11.446f, 17.8f, 11.264f, 17.685f, 11.446f)
                curveTo(17.569f, 11.628f, 16.177f, 13.297f, 16.177f, 13.297f)
            }
            path(
                fill = SolidColor(Color(0xFFFFF203)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.853f, 11.622f)
                lineTo(17.716f, 12.225f)
                curveTo(17.716f, 12.225f, 18.113f, 11.942f, 17.914f, 11.782f)
                curveTo(17.716f, 11.622f, 17.175f, 11.34f, 17.175f, 11.34f)
                lineTo(16.853f, 11.622f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A651)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.823f, 11.653f)
                curveTo(16.823f, 11.653f, 16.623f, 11.862f, 16.623f, 12.022f)
                curveTo(16.623f, 12.182f, 16.437f, 12.611f, 16.437f, 12.611f)
                curveTo(16.437f, 12.611f, 16.957f, 12.931f, 17.065f, 12.727f)
                curveTo(17.173f, 12.523f, 17.875f, 12.645f, 17.751f, 12.334f)
                curveTo(17.627f, 12.022f, 16.823f, 11.653f, 16.823f, 11.653f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.16f, 6.989f)
                curveTo(13.16f, 6.989f, 13.621f, 6.752f, 13.849f, 6.989f)
                curveTo(14.077f, 7.225f, 14.264f, 6.969f, 14.264f, 6.827f)
                curveTo(14.264f, 6.684f, 14.626f, 6.194f, 14.626f, 6.592f)
                curveTo(14.626f, 6.989f, 14.514f, 7.213f, 14.832f, 7.213f)
                curveTo(15.15f, 7.213f, 16.584f, 6.664f, 16.928f, 6.827f)
                curveTo(17.271f, 6.989f, 17.535f, 6.949f, 17.447f, 6.716f)
                curveTo(17.36f, 6.483f, 17.135f, 6.338f, 16.703f, 6.465f)
                curveTo(16.27f, 6.592f, 16.372f, 6.716f, 15.998f, 6.716f)
                curveTo(15.625f, 6.716f, 15.209f, 6.592f, 15.209f, 6.592f)
                curveTo(15.209f, 6.592f, 15.326f, 6.383f, 15.752f, 6.531f)
                curveTo(16.179f, 6.68f, 16.768f, 6.347f, 16.928f, 6.347f)
                curveTo(17.088f, 6.347f, 17.528f, 6.338f, 17.572f, 6.465f)
                curveTo(17.616f, 6.592f, 17.882f, 6.708f, 17.679f, 6.827f)
                curveTo(17.476f, 6.945f, 17.142f, 7.019f, 17.372f, 7.171f)
                curveTo(17.602f, 7.323f, 18.131f, 7.294f, 18.156f, 7.451f)
                curveTo(18.182f, 7.609f, 18.433f, 7.845f, 18.332f, 7.845f)
                curveTo(18.231f, 7.845f, 18.049f, 8.067f, 17.88f, 8f)
                curveTo(17.711f, 7.932f, 17.691f, 7.873f, 17.853f, 7.818f)
                curveTo(18.016f, 7.763f, 18.014f, 7.532f, 17.88f, 7.532f)
                curveTo(17.746f, 7.532f, 17.812f, 7.613f, 17.507f, 7.532f)
                curveTo(17.202f, 7.451f, 16.798f, 7.362f, 16.822f, 7.532f)
                curveTo(16.847f, 7.703f, 17.045f, 7.965f, 16.679f, 8f)
                curveTo(16.313f, 8.035f, 16.141f, 8.175f, 16.07f, 8.062f)
                curveTo(15.998f, 7.949f, 15.744f, 7.799f, 15.944f, 7.75f)
                curveTo(16.144f, 7.702f, 16.336f, 7.914f, 16.408f, 7.88f)
                curveTo(16.48f, 7.845f, 16.644f, 7.826f, 16.507f, 7.679f)
                curveTo(16.37f, 7.532f, 16.144f, 7.446f, 16.353f, 7.336f)
                curveTo(16.563f, 7.226f, 16.397f, 7.224f, 15.998f, 7.451f)
                curveTo(15.599f, 7.679f, 15.377f, 7.872f, 15.027f, 7.845f)
                curveTo(14.677f, 7.818f, 14.546f, 7.855f, 14.433f, 7.818f)
                curveTo(14.321f, 7.781f, 13.772f, 8.225f, 13.614f, 8.112f)
                curveTo(13.456f, 8f, 12.946f, 7.956f, 13.038f, 7.818f)
                curveTo(13.13f, 7.679f, 13.253f, 7.608f, 13.39f, 7.679f)
                curveTo(13.528f, 7.75f, 13.664f, 7.822f, 13.757f, 7.75f)
                curveTo(13.849f, 7.679f, 14.116f, 7.434f, 14.049f, 7.385f)
                curveTo(13.982f, 7.336f, 14.047f, 7.171f, 13.666f, 7.171f)
                curveTo(13.286f, 7.171f, 13.152f, 7.355f, 13.061f, 7.239f)
                curveTo(12.971f, 7.123f, 13.16f, 6.989f, 13.16f, 6.989f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FijiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Fiji,
            contentDescription = "Fiji Flag"
        )
    }
}
