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
 * Pitcairn Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: PN
 * - ISO Alpha-3: PCN
 * - ISO Numeric: 612
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.PitcairnIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Pitcairn Islands:PN:PCN:612:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.369f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.714f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.369f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.242f, -0.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(2.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(4.75f)
                horizontalLineTo(-0.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(3.242f)
                verticalLineTo(-0.75f)
                close()
                moveTo(3.992f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.308f, 5.835f)
            curveTo(10.308f, 5.835f, 10.357f, 6.355f, 10.249f, 6.649f)
            curveTo(10.141f, 6.944f, 10.086f, 7.115f, 10.086f, 6.926f)
            curveTo(10.086f, 6.738f, 10.01f, 6.589f, 9.949f, 6.589f)
            curveTo(9.888f, 6.589f, 9.936f, 6.776f, 9.874f, 6.776f)
            curveTo(9.813f, 6.776f, 9.601f, 6.808f, 9.601f, 6.698f)
            curveTo(9.601f, 6.589f, 9.573f, 6.992f, 9.711f, 7.028f)
            curveTo(9.848f, 7.064f, 9.644f, 7.176f, 9.553f, 7.141f)
            curveTo(9.553f, 7.141f, 9.928f, 7.257f, 10.075f, 7.356f)
            curveTo(10.075f, 7.356f, 10.515f, 7.878f, 10.927f, 7.814f)
            curveTo(10.927f, 7.814f, 10.366f, 7.63f, 10.465f, 7.279f)
            curveTo(10.564f, 6.927f, 10.927f, 6.876f, 10.927f, 6.876f)
            curveTo(10.927f, 6.876f, 11.098f, 6.93f, 11.093f, 7.072f)
            curveTo(11.087f, 7.214f, 11.217f, 7.028f, 11.217f, 7.028f)
            curveTo(11.217f, 7.028f, 11.238f, 6.849f, 11.215f, 6.805f)
            curveTo(11.192f, 6.761f, 11.606f, 6.676f, 11.632f, 6.492f)
            curveTo(11.632f, 6.492f, 11.209f, 6.51f, 11.18f, 6.463f)
            curveTo(11.151f, 6.415f, 11.311f, 6.341f, 11.261f, 6.249f)
            curveTo(11.211f, 6.156f, 10.465f, 6.776f, 10.465f, 6.776f)
            curveTo(10.465f, 6.776f, 10.723f, 6.354f, 10.723f, 6.128f)
            curveTo(10.723f, 5.901f, 10.657f, 5.746f, 10.465f, 5.746f)
            curveTo(10.273f, 5.746f, 10.308f, 5.835f, 10.308f, 5.835f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.192f, 5.958f)
            curveTo(14.191f, 5.959f, 14.192f, 5.96f, 14.193f, 5.959f)
            curveTo(14.22f, 5.933f, 14.392f, 5.783f, 14.535f, 5.902f)
            curveTo(14.692f, 6.031f, 14.456f, 6.157f, 14.456f, 6.157f)
            curveTo(14.456f, 6.157f, 14.566f, 6.258f, 14.692f, 6.258f)
            curveTo(14.818f, 6.258f, 14.849f, 6.157f, 14.849f, 6.157f)
            curveTo(14.849f, 6.157f, 14.859f, 6.382f, 15.269f, 6.468f)
            curveTo(15.269f, 6.468f, 15.416f, 6.268f, 15.269f, 6.159f)
            curveTo(15.269f, 6.159f, 15.443f, 6.125f, 15.43f, 5.991f)
            curveTo(15.43f, 5.991f, 15.288f, 6.037f, 15.186f, 5.932f)
            curveTo(15.085f, 5.826f, 14.887f, 5.777f, 14.743f, 5.801f)
            curveTo(14.378f, 5.676f, 14.214f, 5.921f, 14.192f, 5.958f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF96877D)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.702f, 7.097f)
            curveTo(11.702f, 7.097f, 12.126f, 7.856f, 11.861f, 8.013f)
            curveTo(11.596f, 8.17f, 13.123f, 8.058f, 13.267f, 8.013f)
            curveTo(13.411f, 7.968f, 13.238f, 7.728f, 13.078f, 7.662f)
            curveTo(12.919f, 7.596f, 12.262f, 7.375f, 12.088f, 7.208f)
            curveTo(11.913f, 7.041f, 12.02f, 6.982f, 12.161f, 6.818f)
            curveTo(12.301f, 6.653f, 12.822f, 6.587f, 12.822f, 6.434f)
            curveTo(12.822f, 6.28f, 13.152f, 5.646f, 13.382f, 5.598f)
            curveTo(13.613f, 5.55f, 13.488f, 5.475f, 13.435f, 5.475f)
            curveTo(13.382f, 5.475f, 13.063f, 5.787f, 12.943f, 5.731f)
            curveTo(12.822f, 5.674f, 12.807f, 5.678f, 12.943f, 5.542f)
            curveTo(13.078f, 5.406f, 13.18f, 5.249f, 13.001f, 5.362f)
            curveTo(12.822f, 5.475f, 12.526f, 5.653f, 12.384f, 5.653f)
            curveTo(12.241f, 5.653f, 11.735f, 5.592f, 11.798f, 5.731f)
            curveTo(11.861f, 5.869f, 11.888f, 6.109f, 12.161f, 6.271f)
            curveTo(12.434f, 6.434f, 12.315f, 6.552f, 12.088f, 6.709f)
            curveTo(11.861f, 6.865f, 11.702f, 7.097f, 11.702f, 7.097f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(14.519f, 6.094f)
            lineTo(13.71f, 7.635f)
            curveTo(13.71f, 7.635f, 13.687f, 8.071f, 14.265f, 7.781f)
            curveTo(14.844f, 7.49f, 14.821f, 7.285f, 14.988f, 7.285f)
            curveTo(15.154f, 7.285f, 15.207f, 7.197f, 15.207f, 7.197f)
            lineTo(15.096f, 7.114f)
            curveTo(15.096f, 7.114f, 15.083f, 6.962f, 15.154f, 6.928f)
            curveTo(15.154f, 6.928f, 15.016f, 6.856f, 14.996f, 6.916f)
            curveTo(14.976f, 6.977f, 14.879f, 6.79f, 14.934f, 6.79f)
            curveTo(14.934f, 6.79f, 14.812f, 6.977f, 14.786f, 7.05f)
            curveTo(14.786f, 7.05f, 14.61f, 6.982f, 14.619f, 6.667f)
            curveTo(14.627f, 6.352f, 14.519f, 6.094f, 14.519f, 6.094f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(10.668f, 5.85f)
            curveTo(10.668f, 5.85f, 10.256f, 5.941f, 10.301f, 6.036f)
            curveTo(10.345f, 6.13f, 10.41f, 6.033f, 10.209f, 6.147f)
            curveTo(10.209f, 6.147f, 9.854f, 6.408f, 9.777f, 6.379f)
            curveTo(9.7f, 6.351f, 9.832f, 6.445f, 9.832f, 6.147f)
            curveTo(9.832f, 5.85f, 9.626f, 6.092f, 9.832f, 5.893f)
            curveTo(10.038f, 5.695f, 10.11f, 5.85f, 10.209f, 5.735f)
            curveTo(10.308f, 5.621f, 10.219f, 5.682f, 10.487f, 5.682f)
            curveTo(10.756f, 5.682f, 10.668f, 5.85f, 10.668f, 5.85f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(11.925f, 7.382f)
            curveTo(11.925f, 7.382f, 10.772f, 8.243f, 10.541f, 8.307f)
            curveTo(10.311f, 8.371f, 11.015f, 8.289f, 11.188f, 8.176f)
            curveTo(11.36f, 8.062f, 11.925f, 7.382f, 11.925f, 7.382f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.212f, 8.892f)
            curveTo(14.212f, 8.892f, 14.323f, 9.571f, 14.034f, 9.504f)
            curveTo(13.745f, 9.437f, 13.625f, 9.403f, 13.625f, 9.403f)
            curveTo(13.625f, 9.403f, 13.731f, 9.719f, 13.882f, 9.719f)
            curveTo(13.882f, 9.719f, 14.141f, 10.197f, 14.041f, 10.348f)
            curveTo(14.041f, 10.348f, 14.486f, 10.005f, 14.414f, 9.733f)
            curveTo(14.342f, 9.46f, 14.529f, 9.777f, 14.529f, 9.777f)
            curveTo(14.529f, 9.777f, 14.693f, 9.852f, 14.811f, 9.769f)
            curveTo(14.929f, 9.685f, 14.809f, 9.722f, 14.691f, 9.562f)
            curveTo(14.573f, 9.403f, 14.602f, 8.955f, 14.242f, 8.722f)
            curveTo(13.882f, 8.49f, 13.799f, 8.498f, 13.799f, 8.498f)
            curveTo(13.799f, 8.498f, 13.534f, 8.086f, 13.693f, 8.113f)
            curveTo(13.693f, 8.113f, 14.83f, 8.484f, 14.86f, 8.579f)
            curveTo(14.889f, 8.674f, 15.191f, 8.656f, 15.04f, 8.385f)
            curveTo(14.889f, 8.113f, 14.076f, 7.95f, 13.979f, 7.873f)
            curveTo(13.882f, 7.796f, 13.972f, 7.506f, 13.799f, 7.443f)
            curveTo(13.625f, 7.38f, 13.15f, 6.931f, 13.151f, 6.714f)
            curveTo(13.151f, 6.498f, 12.927f, 6.396f, 12.733f, 6.396f)
            curveTo(12.539f, 6.396f, 12.173f, 6.343f, 12.019f, 6.343f)
            curveTo(11.864f, 6.343f, 11.72f, 6.589f, 11.869f, 6.589f)
            curveTo(12.019f, 6.589f, 11.891f, 7.048f, 11.641f, 7.149f)
            curveTo(11.391f, 7.249f, 11.198f, 7.394f, 10.912f, 7.394f)
            curveTo(10.627f, 7.394f, 11.316f, 7.628f, 11.426f, 7.535f)
            curveTo(11.536f, 7.443f, 11.5f, 7.305f, 11.869f, 7.149f)
            curveTo(12.238f, 6.992f, 12.59f, 6.9f, 12.546f, 7.024f)
            curveTo(12.501f, 7.149f, 12.615f, 7.357f, 12.789f, 7.282f)
            curveTo(12.963f, 7.206f, 13.019f, 7.016f, 13.019f, 7.149f)
            curveTo(13.019f, 7.282f, 13.285f, 7.965f, 13.489f, 8.231f)
            curveTo(13.693f, 8.498f, 14.212f, 8.892f, 14.212f, 8.892f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(11.786f, 6.399f)
            curveTo(11.786f, 6.399f, 11.65f, 6.604f, 11.786f, 6.604f)
            curveTo(11.921f, 6.604f, 12.138f, 6.604f, 12.006f, 6.502f)
            curveTo(11.873f, 6.399f, 11.786f, 6.399f, 11.786f, 6.399f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(12.238f, 6.394f)
            curveTo(12.238f, 6.394f, 12.238f, 6.53f, 12.332f, 6.53f)
            curveTo(12.426f, 6.53f, 12.509f, 6.666f, 12.509f, 6.53f)
            curveTo(12.509f, 6.394f, 12.639f, 6.439f, 12.438f, 6.394f)
            curveTo(12.238f, 6.349f, 12.238f, 6.394f, 12.238f, 6.394f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(12.815f, 6.425f)
            curveTo(12.815f, 6.425f, 12.724f, 6.49f, 12.77f, 6.605f)
            curveTo(12.815f, 6.721f, 12.917f, 6.949f, 12.77f, 6.949f)
            curveTo(12.622f, 6.949f, 12.501f, 7.031f, 12.616f, 7.031f)
            curveTo(12.731f, 7.031f, 12.936f, 7.113f, 12.936f, 7.031f)
            curveTo(12.936f, 6.949f, 13.019f, 7.167f, 13.019f, 7.031f)
            curveTo(13.019f, 6.895f, 13.019f, 6.831f, 13.019f, 6.751f)
            curveTo(13.019f, 6.671f, 13.103f, 6.649f, 13.019f, 6.537f)
            curveTo(12.936f, 6.425f, 12.815f, 6.425f, 12.815f, 6.425f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(13.024f, 7.219f)
            curveTo(13.024f, 7.219f, 13.212f, 7.782f, 13.314f, 7.855f)
            curveTo(13.417f, 7.927f, 13.463f, 8.539f, 13.508f, 8.605f)
            curveTo(13.552f, 8.672f, 14.165f, 9.007f, 14.165f, 9.188f)
            curveTo(14.165f, 9.368f, 14.354f, 9.049f, 14.259f, 8.871f)
            curveTo(14.165f, 8.692f, 13.868f, 8.313f, 13.655f, 8.23f)
            curveTo(13.441f, 8.147f, 13.468f, 7.947f, 13.423f, 7.806f)
            curveTo(13.378f, 7.665f, 13.689f, 7.92f, 13.423f, 7.6f)
            curveTo(13.158f, 7.28f, 13.165f, 7.452f, 13.24f, 7.452f)
            curveTo(13.314f, 7.452f, 13.389f, 7.414f, 13.314f, 7.365f)
            curveTo(13.24f, 7.315f, 13.024f, 7.219f, 13.024f, 7.219f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(11.027f, 8.38f)
            curveTo(11.027f, 8.38f, 10.415f, 9.407f, 10.306f, 9.46f)
            curveTo(10.197f, 9.513f, 10.116f, 9.523f, 10.06f, 9.46f)
            curveTo(10.004f, 9.396f, 9.998f, 9.631f, 10.06f, 9.695f)
            curveTo(10.121f, 9.76f, 10.306f, 9.76f, 10.409f, 9.645f)
            curveTo(10.409f, 9.645f, 10.425f, 9.934f, 10.585f, 10.152f)
            curveTo(10.745f, 10.369f, 10.811f, 10.309f, 10.811f, 10.432f)
            curveTo(10.811f, 10.555f, 10.849f, 10.718f, 10.898f, 10.718f)
            curveTo(10.946f, 10.718f, 10.984f, 11.106f, 10.898f, 11.106f)
            curveTo(10.811f, 11.106f, 11.098f, 11.138f, 11.223f, 11.041f)
            curveTo(11.348f, 10.944f, 11.402f, 10.87f, 11.375f, 10.87f)
            curveTo(11.348f, 10.87f, 11.027f, 10.709f, 11.027f, 10.596f)
            curveTo(11.027f, 10.482f, 10.811f, 10.393f, 10.811f, 10.224f)
            curveTo(10.811f, 10.056f, 10.699f, 9.855f, 10.699f, 9.775f)
            curveTo(10.699f, 9.695f, 10.795f, 9.806f, 10.898f, 9.73f)
            curveTo(11f, 9.655f, 11.027f, 9.46f, 11.027f, 9.46f)
            curveTo(11.027f, 9.46f, 10.865f, 9.563f, 10.811f, 9.511f)
            curveTo(10.757f, 9.46f, 10.587f, 9.358f, 10.699f, 9.183f)
            curveTo(10.811f, 9.008f, 11.027f, 8.38f, 11.027f, 8.38f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.087f, 5.144f)
            curveTo(12.087f, 5.144f, 11.868f, 5.236f, 11.941f, 5.374f)
            curveTo(12.014f, 5.511f, 12.04f, 5.572f, 12.087f, 5.542f)
            curveTo(12.134f, 5.511f, 12.462f, 5.454f, 12.389f, 5.299f)
            curveTo(12.315f, 5.144f, 12.161f, 5.144f, 12.161f, 5.144f)
            horizontalLineTo(12.087f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(12.847f, 5.069f)
            curveTo(12.847f, 5.069f, 12.558f, 4.948f, 12.654f, 5.069f)
            curveTo(12.75f, 5.191f, 12.874f, 5.255f, 12.963f, 5.255f)
            curveTo(13.051f, 5.255f, 13.236f, 5.23f, 13.144f, 5.181f)
            curveTo(13.051f, 5.132f, 12.847f, 5.069f, 12.847f, 5.069f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.991f, 8.23f)
            curveTo(9.992f, 8.223f, 9.983f, 8.217f, 9.978f, 8.222f)
            curveTo(9.918f, 8.277f, 9.736f, 8.459f, 9.813f, 8.618f)
            curveTo(9.905f, 8.807f, 9.996f, 8.872f, 9.996f, 8.872f)
            curveTo(9.996f, 8.872f, 10.052f, 9.161f, 10.167f, 9.24f)
            curveTo(10.167f, 9.24f, 10.321f, 9.232f, 10.329f, 9.007f)
            curveTo(10.329f, 9.007f, 10.592f, 8.934f, 10.669f, 9.09f)
            curveTo(10.669f, 9.09f, 10.618f, 9.108f, 10.618f, 9.24f)
            curveTo(10.618f, 9.372f, 10.737f, 9.516f, 10.737f, 9.516f)
            curveTo(10.737f, 9.516f, 10.791f, 9.059f, 11.036f, 8.765f)
            curveTo(11.281f, 8.47f, 11.351f, 8.412f, 11.351f, 8.412f)
            verticalLineTo(8.081f)
            curveTo(11.351f, 8.081f, 10.844f, 8.473f, 10.737f, 8.798f)
            curveTo(10.737f, 8.798f, 10.482f, 8.806f, 10.379f, 8.765f)
            curveTo(10.275f, 8.723f, 10.508f, 8.655f, 10.379f, 8.506f)
            curveTo(10.249f, 8.358f, 10.309f, 8.715f, 10.167f, 8.618f)
            curveTo(9.945f, 8.559f, 9.975f, 8.309f, 9.991f, 8.23f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF5EAA22)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.093f, 7.943f)
            lineTo(13.686f, 7.943f)
            verticalLineTo(9.447f)
            curveTo(13.686f, 9.447f, 13.474f, 10.677f, 12.345f, 11.282f)
            curveTo(12.345f, 11.282f, 11.252f, 10.668f, 11.093f, 9.447f)
            verticalLineTo(7.943f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(11.093f, 7.943f)
                lineTo(13.686f, 7.943f)
                verticalLineTo(9.447f)
                curveTo(13.686f, 9.447f, 13.474f, 10.677f, 12.345f, 11.282f)
                curveTo(12.345f, 11.282f, 11.252f, 10.668f, 11.093f, 9.447f)
                verticalLineTo(7.943f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF58A5FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.326f, 7.861f)
                lineTo(11.193f, 10.094f)
                lineTo(12.729f, 8.769f)
                lineTo(13.786f, 10.434f)
                verticalLineTo(7.861f)
                lineTo(12.729f, 8.684f)
                lineTo(12.326f, 7.861f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(12.29f, 9.476f)
                curveTo(12.29f, 9.429f, 12.328f, 9.391f, 12.375f, 9.391f)
                curveTo(12.421f, 9.391f, 12.459f, 9.429f, 12.459f, 9.476f)
                verticalLineTo(10.901f)
                curveTo(12.459f, 10.948f, 12.421f, 10.986f, 12.375f, 10.986f)
                curveTo(12.328f, 10.986f, 12.29f, 10.948f, 12.29f, 10.901f)
                lineTo(12.29f, 9.476f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(11.992f, 9.825f)
                curveTo(11.948f, 9.825f, 11.913f, 9.79f, 11.913f, 9.746f)
                curveTo(11.913f, 9.703f, 11.948f, 9.667f, 11.992f, 9.667f)
                horizontalLineTo(12.764f)
                curveTo(12.808f, 9.667f, 12.843f, 9.703f, 12.843f, 9.746f)
                curveTo(12.843f, 9.79f, 12.808f, 9.825f, 12.764f, 9.825f)
                horizontalLineTo(11.992f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(12.532f, 10.795f)
                lineTo(12.446f, 10.866f)
                curveTo(12.319f, 10.71f, 12.203f, 10.636f, 12.101f, 10.636f)
                curveTo(11.951f, 10.636f, 11.829f, 10.51f, 11.729f, 10.27f)
                lineTo(11.831f, 10.227f)
                curveTo(11.916f, 10.43f, 12.008f, 10.525f, 12.101f, 10.525f)
                curveTo(12.243f, 10.525f, 12.386f, 10.617f, 12.532f, 10.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.629f, 9.888f)
                curveTo(11.628f, 9.888f, 11.628f, 9.888f, 11.628f, 9.889f)
                verticalLineTo(10.43f)
                curveTo(11.628f, 10.431f, 11.628f, 10.431f, 11.629f, 10.431f)
                lineTo(12.033f, 10.263f)
                curveTo(12.034f, 10.263f, 12.034f, 10.262f, 12.033f, 10.262f)
                lineTo(11.629f, 9.888f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(12.254f, 10.795f)
                lineTo(12.34f, 10.866f)
                curveTo(12.467f, 10.71f, 12.583f, 10.636f, 12.685f, 10.636f)
                curveTo(12.835f, 10.636f, 12.957f, 10.51f, 13.057f, 10.27f)
                lineTo(12.955f, 10.227f)
                curveTo(12.87f, 10.43f, 12.778f, 10.525f, 12.685f, 10.525f)
                curveTo(12.543f, 10.525f, 12.4f, 10.617f, 12.254f, 10.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.157f, 9.888f)
                curveTo(13.157f, 9.888f, 13.158f, 9.888f, 13.158f, 9.889f)
                verticalLineTo(10.43f)
                curveTo(13.158f, 10.431f, 13.158f, 10.431f, 13.157f, 10.431f)
                lineTo(12.753f, 10.263f)
                curveTo(12.752f, 10.263f, 12.752f, 10.262f, 12.753f, 10.262f)
                lineTo(13.157f, 9.888f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.204f, 8.828f)
                horizontalLineToRelative(0.338f)
                verticalLineToRelative(0.478f)
                horizontalLineToRelative(-0.338f)
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
            imageVector = FlagIcons.Small.PitcairnIslands,
            contentDescription = "Pitcairn Islands Flag"
        )
    }
}
