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
 * Guam Flag (20x15dp)
 *
 * - ISO Alpha-2: GU
 * - ISO Alpha-3: GUM
 * - ISO Numeric: 316
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Guam: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guam:GU:GUM:316:Medium",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFCBDAFF)),
                strokeAlpha = 0.12f,
                strokeLineWidth = 1.25f
            ) {
                moveTo(2.625f, 2.625f)
                horizontalLineTo(17.375f)
                verticalLineTo(12.375f)
                horizontalLineTo(2.625f)
                verticalLineTo(2.625f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2.625f, 2.625f)
                horizontalLineTo(17.375f)
                verticalLineTo(12.375f)
                horizontalLineTo(2.625f)
                verticalLineTo(2.625f)
                close()
                moveTo(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFCCE0E5)),
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF6D87FB)),
                strokeAlpha = 0.4f,
                strokeLineWidth = 1.8125f
            ) {
                moveTo(10.25f, 3f)
                lineTo(10.656f, 2.19f)
                lineTo(10.241f, 1.982f)
                lineTo(9.829f, 2.198f)
                lineTo(10.25f, 3f)
                close()
                moveTo(10.25f, 3f)
                curveTo(10.656f, 2.19f, 10.656f, 2.19f, 10.657f, 2.19f)
                lineTo(10.657f, 2.19f)
                lineTo(10.659f, 2.191f)
                lineTo(10.663f, 2.193f)
                lineTo(10.674f, 2.199f)
                lineTo(10.71f, 2.218f)
                curveTo(10.74f, 2.234f, 10.782f, 2.256f, 10.833f, 2.285f)
                curveTo(10.935f, 2.342f, 11.078f, 2.426f, 11.247f, 2.534f)
                curveTo(11.583f, 2.749f, 12.033f, 3.068f, 12.488f, 3.486f)
                curveTo(13.374f, 4.3f, 14.406f, 5.61f, 14.406f, 7.341f)
                curveTo(14.406f, 9.056f, 13.39f, 10.44f, 12.521f, 11.323f)
                curveTo(12.073f, 11.779f, 11.628f, 12.138f, 11.296f, 12.383f)
                curveTo(11.129f, 12.506f, 10.989f, 12.602f, 10.888f, 12.668f)
                curveTo(10.838f, 12.701f, 10.797f, 12.727f, 10.768f, 12.745f)
                lineTo(10.733f, 12.767f)
                lineTo(10.722f, 12.774f)
                lineTo(10.718f, 12.776f)
                lineTo(10.717f, 12.777f)
                lineTo(10.716f, 12.777f)
                curveTo(10.716f, 12.777f, 10.716f, 12.778f, 10.25f, 12f)
                moveTo(10.25f, 3f)
                curveTo(9.829f, 2.198f, 9.829f, 2.198f, 9.828f, 2.198f)
                lineTo(9.828f, 2.198f)
                lineTo(9.826f, 2.199f)
                lineTo(9.823f, 2.201f)
                lineTo(9.811f, 2.207f)
                lineTo(9.776f, 2.226f)
                curveTo(9.746f, 2.243f, 9.705f, 2.266f, 9.654f, 2.295f)
                curveTo(9.553f, 2.355f, 9.411f, 2.44f, 9.243f, 2.551f)
                curveTo(8.909f, 2.772f, 8.46f, 3.098f, 8.008f, 3.519f)
                curveTo(7.131f, 4.334f, 6.094f, 5.645f, 6.094f, 7.341f)
                curveTo(6.094f, 9.021f, 7.114f, 10.406f, 7.975f, 11.291f)
                curveTo(8.422f, 11.75f, 8.864f, 12.115f, 9.195f, 12.365f)
                curveTo(9.361f, 12.491f, 9.501f, 12.589f, 9.601f, 12.657f)
                curveTo(9.651f, 12.691f, 9.691f, 12.718f, 9.72f, 12.737f)
                lineTo(9.755f, 12.759f)
                lineTo(9.765f, 12.766f)
                lineTo(9.769f, 12.768f)
                lineTo(9.77f, 12.769f)
                lineTo(9.771f, 12.769f)
                curveTo(9.771f, 12.769f, 9.771f, 12.769f, 10.25f, 12f)
                moveTo(10.25f, 12f)
                lineTo(10.716f, 12.778f)
                lineTo(10.241f, 13.062f)
                lineTo(9.771f, 12.769f)
                lineTo(10.25f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCCE0E5))) {
                moveTo(10.25f, 3.773f)
                lineTo(10.679f, 2.975f)
                lineTo(10.24f, 2.739f)
                lineTo(9.806f, 2.983f)
                lineTo(10.25f, 3.773f)
                close()
                moveTo(10.25f, 3.773f)
                curveTo(10.679f, 2.975f, 10.679f, 2.975f, 10.68f, 2.975f)
                lineTo(10.68f, 2.975f)
                lineTo(10.682f, 2.976f)
                lineTo(10.685f, 2.978f)
                lineTo(10.695f, 2.984f)
                lineTo(10.725f, 3f)
                curveTo(10.75f, 3.014f, 10.783f, 3.034f, 10.825f, 3.059f)
                curveTo(10.907f, 3.108f, 11.02f, 3.179f, 11.154f, 3.271f)
                curveTo(11.42f, 3.454f, 11.776f, 3.725f, 12.136f, 4.079f)
                curveTo(12.838f, 4.771f, 13.656f, 5.886f, 13.656f, 7.355f)
                curveTo(13.656f, 8.809f, 12.852f, 9.982f, 12.168f, 10.729f)
                curveTo(11.815f, 11.113f, 11.465f, 11.416f, 11.203f, 11.623f)
                curveTo(11.071f, 11.727f, 10.96f, 11.809f, 10.88f, 11.866f)
                curveTo(10.84f, 11.894f, 10.807f, 11.916f, 10.784f, 11.932f)
                lineTo(10.755f, 11.951f)
                lineTo(10.745f, 11.957f)
                lineTo(10.742f, 11.96f)
                lineTo(10.741f, 11.96f)
                lineTo(10.74f, 11.961f)
                curveTo(10.74f, 11.961f, 10.74f, 11.961f, 10.25f, 11.199f)
                moveTo(10.25f, 3.773f)
                curveTo(9.806f, 2.983f, 9.805f, 2.983f, 9.805f, 2.984f)
                lineTo(9.804f, 2.984f)
                lineTo(9.803f, 2.985f)
                lineTo(9.8f, 2.987f)
                lineTo(9.79f, 2.992f)
                lineTo(9.76f, 3.009f)
                curveTo(9.736f, 3.024f, 9.703f, 3.044f, 9.662f, 3.069f)
                curveTo(9.581f, 3.12f, 9.469f, 3.193f, 9.336f, 3.287f)
                curveTo(9.072f, 3.474f, 8.717f, 3.75f, 8.36f, 4.107f)
                curveTo(7.666f, 4.799f, 6.844f, 5.913f, 6.844f, 7.355f)
                curveTo(6.844f, 8.781f, 7.652f, 9.955f, 8.329f, 10.701f)
                curveTo(8.68f, 11.088f, 9.028f, 11.396f, 9.288f, 11.607f)
                curveTo(9.419f, 11.713f, 9.529f, 11.797f, 9.608f, 11.855f)
                curveTo(9.648f, 11.884f, 9.681f, 11.907f, 9.704f, 11.923f)
                lineTo(9.732f, 11.943f)
                lineTo(9.741f, 11.949f)
                lineTo(9.745f, 11.951f)
                lineTo(9.746f, 11.952f)
                lineTo(9.746f, 11.952f)
                curveTo(9.747f, 11.952f, 9.747f, 11.952f, 10.25f, 11.199f)
                moveTo(10.25f, 11.199f)
                lineTo(10.74f, 11.961f)
                lineTo(10.241f, 12.282f)
                lineTo(9.747f, 11.952f)
                lineTo(10.25f, 11.199f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC1C9F1)),
                strokeAlpha = 0.748217f,
                strokeLineWidth = 1.8125f
            ) {
                moveTo(10.25f, 3.773f)
                lineTo(10.679f, 2.975f)
                lineTo(10.24f, 2.739f)
                lineTo(9.806f, 2.983f)
                lineTo(10.25f, 3.773f)
                close()
                moveTo(10.25f, 3.773f)
                curveTo(10.679f, 2.975f, 10.679f, 2.975f, 10.68f, 2.975f)
                lineTo(10.68f, 2.975f)
                lineTo(10.682f, 2.976f)
                lineTo(10.685f, 2.978f)
                lineTo(10.695f, 2.984f)
                lineTo(10.725f, 3f)
                curveTo(10.75f, 3.014f, 10.783f, 3.034f, 10.825f, 3.059f)
                curveTo(10.907f, 3.108f, 11.02f, 3.179f, 11.154f, 3.271f)
                curveTo(11.42f, 3.454f, 11.776f, 3.725f, 12.136f, 4.079f)
                curveTo(12.838f, 4.771f, 13.656f, 5.886f, 13.656f, 7.355f)
                curveTo(13.656f, 8.809f, 12.852f, 9.982f, 12.168f, 10.729f)
                curveTo(11.815f, 11.113f, 11.465f, 11.416f, 11.203f, 11.623f)
                curveTo(11.071f, 11.727f, 10.96f, 11.809f, 10.88f, 11.866f)
                curveTo(10.84f, 11.894f, 10.807f, 11.916f, 10.784f, 11.932f)
                lineTo(10.755f, 11.951f)
                lineTo(10.745f, 11.957f)
                lineTo(10.742f, 11.96f)
                lineTo(10.741f, 11.96f)
                lineTo(10.74f, 11.961f)
                curveTo(10.74f, 11.961f, 10.74f, 11.961f, 10.25f, 11.199f)
                moveTo(10.25f, 3.773f)
                curveTo(9.806f, 2.983f, 9.805f, 2.983f, 9.805f, 2.984f)
                lineTo(9.804f, 2.984f)
                lineTo(9.803f, 2.985f)
                lineTo(9.8f, 2.987f)
                lineTo(9.79f, 2.992f)
                lineTo(9.76f, 3.009f)
                curveTo(9.736f, 3.024f, 9.703f, 3.044f, 9.662f, 3.069f)
                curveTo(9.581f, 3.12f, 9.469f, 3.193f, 9.336f, 3.287f)
                curveTo(9.072f, 3.474f, 8.717f, 3.75f, 8.36f, 4.107f)
                curveTo(7.666f, 4.799f, 6.844f, 5.913f, 6.844f, 7.355f)
                curveTo(6.844f, 8.781f, 7.652f, 9.955f, 8.329f, 10.701f)
                curveTo(8.68f, 11.088f, 9.028f, 11.396f, 9.288f, 11.607f)
                curveTo(9.419f, 11.713f, 9.529f, 11.797f, 9.608f, 11.855f)
                curveTo(9.648f, 11.884f, 9.681f, 11.907f, 9.704f, 11.923f)
                lineTo(9.732f, 11.943f)
                lineTo(9.741f, 11.949f)
                lineTo(9.745f, 11.951f)
                lineTo(9.746f, 11.952f)
                lineTo(9.746f, 11.952f)
                curveTo(9.747f, 11.952f, 9.747f, 11.952f, 10.25f, 11.199f)
                moveTo(10.25f, 11.199f)
                lineTo(10.74f, 11.961f)
                lineTo(10.241f, 12.282f)
                lineTo(9.747f, 11.952f)
                lineTo(10.25f, 11.199f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 1.8125f
            ) {
                moveTo(10.25f, 3.773f)
                lineTo(10.679f, 2.975f)
                lineTo(10.24f, 2.739f)
                lineTo(9.806f, 2.983f)
                lineTo(10.25f, 3.773f)
                close()
                moveTo(10.25f, 3.773f)
                curveTo(10.679f, 2.975f, 10.679f, 2.975f, 10.68f, 2.975f)
                lineTo(10.68f, 2.975f)
                lineTo(10.682f, 2.976f)
                lineTo(10.685f, 2.978f)
                lineTo(10.695f, 2.984f)
                lineTo(10.725f, 3f)
                curveTo(10.75f, 3.014f, 10.783f, 3.034f, 10.825f, 3.059f)
                curveTo(10.907f, 3.108f, 11.02f, 3.179f, 11.154f, 3.271f)
                curveTo(11.42f, 3.454f, 11.776f, 3.725f, 12.136f, 4.079f)
                curveTo(12.838f, 4.771f, 13.656f, 5.886f, 13.656f, 7.355f)
                curveTo(13.656f, 8.809f, 12.852f, 9.982f, 12.168f, 10.729f)
                curveTo(11.815f, 11.113f, 11.465f, 11.416f, 11.203f, 11.623f)
                curveTo(11.071f, 11.727f, 10.96f, 11.809f, 10.88f, 11.866f)
                curveTo(10.84f, 11.894f, 10.807f, 11.916f, 10.784f, 11.932f)
                lineTo(10.755f, 11.951f)
                lineTo(10.745f, 11.957f)
                lineTo(10.742f, 11.96f)
                lineTo(10.741f, 11.96f)
                lineTo(10.74f, 11.961f)
                curveTo(10.74f, 11.961f, 10.74f, 11.961f, 10.25f, 11.199f)
                moveTo(10.25f, 3.773f)
                curveTo(9.806f, 2.983f, 9.805f, 2.983f, 9.805f, 2.984f)
                lineTo(9.804f, 2.984f)
                lineTo(9.803f, 2.985f)
                lineTo(9.8f, 2.987f)
                lineTo(9.79f, 2.992f)
                lineTo(9.76f, 3.009f)
                curveTo(9.736f, 3.024f, 9.703f, 3.044f, 9.662f, 3.069f)
                curveTo(9.581f, 3.12f, 9.469f, 3.193f, 9.336f, 3.287f)
                curveTo(9.072f, 3.474f, 8.717f, 3.75f, 8.36f, 4.107f)
                curveTo(7.666f, 4.799f, 6.844f, 5.913f, 6.844f, 7.355f)
                curveTo(6.844f, 8.781f, 7.652f, 9.955f, 8.329f, 10.701f)
                curveTo(8.68f, 11.088f, 9.028f, 11.396f, 9.288f, 11.607f)
                curveTo(9.419f, 11.713f, 9.529f, 11.797f, 9.608f, 11.855f)
                curveTo(9.648f, 11.884f, 9.681f, 11.907f, 9.704f, 11.923f)
                lineTo(9.732f, 11.943f)
                lineTo(9.741f, 11.949f)
                lineTo(9.745f, 11.951f)
                lineTo(9.746f, 11.952f)
                lineTo(9.746f, 11.952f)
                curveTo(9.747f, 11.952f, 9.747f, 11.952f, 10.25f, 11.199f)
                moveTo(10.25f, 11.199f)
                lineTo(10.74f, 11.961f)
                lineTo(10.241f, 12.282f)
                lineTo(9.747f, 11.952f)
                lineTo(10.25f, 11.199f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10.832f, 9.503f)
                curveTo(10.633f, 9.721f, 10.432f, 9.907f, 10.257f, 10.055f)
                curveTo(10.08f, 9.901f, 9.875f, 9.708f, 9.671f, 9.483f)
                curveTo(9.098f, 8.852f, 8.656f, 8.104f, 8.656f, 7.355f)
                curveTo(8.656f, 6.621f, 9.084f, 5.945f, 9.64f, 5.39f)
                curveTo(9.856f, 5.174f, 10.074f, 4.995f, 10.258f, 4.857f)
                curveTo(10.439f, 4.989f, 10.652f, 5.162f, 10.864f, 5.37f)
                curveTo(11.412f, 5.91f, 11.844f, 6.586f, 11.844f, 7.355f)
                curveTo(11.844f, 8.138f, 11.398f, 8.887f, 10.832f, 9.503f)
                close()
                moveTo(10.832f, 9.503f)
                curveTo(10.633f, 9.721f, 10.432f, 9.907f, 10.257f, 10.055f)
                curveTo(10.08f, 9.901f, 9.875f, 9.708f, 9.671f, 9.483f)
                curveTo(9.098f, 8.852f, 8.656f, 8.104f, 8.656f, 7.355f)
                curveTo(8.656f, 6.621f, 9.084f, 5.945f, 9.64f, 5.39f)
                curveTo(9.856f, 5.174f, 10.074f, 4.995f, 10.258f, 4.857f)
                curveTo(10.439f, 4.989f, 10.652f, 5.162f, 10.864f, 5.37f)
                curveTo(11.412f, 5.91f, 11.844f, 6.586f, 11.844f, 7.355f)
                curveTo(11.844f, 8.138f, 11.398f, 8.887f, 10.832f, 9.503f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF91CBCB))) {
                moveTo(8.083f, 8.75f)
                horizontalLineToRelative(4.667f)
                verticalLineToRelative(0.938f)
                horizontalLineToRelative(-4.667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDF9A1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.501f, 9.499f)
                curveTo(8.501f, 9.499f, 11.81f, 9.5f, 12.114f, 9.386f)
                curveTo(12.418f, 9.272f, 11.543f, 11.578f, 10.425f, 11.578f)
                curveTo(9.307f, 11.578f, 8.501f, 9.499f, 8.501f, 9.499f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA68861))) {
                moveTo(11.621f, 9.222f)
                lineTo(11.027f, 9.679f)
                curveTo(10.09f, 8.462f, 9.697f, 7.202f, 9.865f, 5.917f)
                lineTo(10.608f, 6.014f)
                curveTo(10.468f, 7.091f, 10.8f, 8.155f, 11.621f, 9.222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.246f, 6.023f)
                lineTo(9.679f, 6.687f)
                curveTo(9.658f, 6.712f, 9.617f, 6.692f, 9.625f, 6.66f)
                lineTo(9.82f, 5.832f)
                horizontalLineTo(8.933f)
                curveTo(8.899f, 5.832f, 8.889f, 5.785f, 8.92f, 5.772f)
                lineTo(9.678f, 5.439f)
                lineTo(9.14f, 4.73f)
                curveTo(9.121f, 4.705f, 9.147f, 4.671f, 9.176f, 4.682f)
                lineTo(10.023f, 5.012f)
                lineTo(10.216f, 4.235f)
                curveTo(10.224f, 4.203f, 10.269f, 4.203f, 10.276f, 4.235f)
                lineTo(10.468f, 5.012f)
                lineTo(11.307f, 4.685f)
                curveTo(11.337f, 4.674f, 11.363f, 4.709f, 11.343f, 4.734f)
                lineTo(10.762f, 5.439f)
                lineTo(11.563f, 5.771f)
                curveTo(11.595f, 5.784f, 11.585f, 5.832f, 11.551f, 5.832f)
                horizontalLineTo(10.762f)
                lineTo(10.882f, 6.679f)
                curveTo(10.886f, 6.71f, 10.847f, 6.728f, 10.827f, 6.704f)
                lineTo(10.246f, 6.023f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.75f, 8.125f)
                horizontalLineTo(12.75f)
                verticalLineTo(8.781f)
                horizontalLineTo(9.75f)
                verticalLineTo(8.125f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.295f, 7.745f)
                horizontalLineTo(9.292f)
                curveTo(9.283f, 7.778f, 9.262f, 7.804f, 9.229f, 7.826f)
                curveTo(9.195f, 7.847f, 9.151f, 7.858f, 9.098f, 7.858f)
                curveTo(9.055f, 7.858f, 9.016f, 7.85f, 8.981f, 7.834f)
                curveTo(8.945f, 7.819f, 8.914f, 7.796f, 8.889f, 7.767f)
                curveTo(8.864f, 7.737f, 8.844f, 7.7f, 8.83f, 7.655f)
                curveTo(8.815f, 7.611f, 8.808f, 7.56f, 8.808f, 7.502f)
                curveTo(8.808f, 7.445f, 8.815f, 7.394f, 8.829f, 7.35f)
                curveTo(8.843f, 7.306f, 8.863f, 7.269f, 8.889f, 7.239f)
                curveTo(8.915f, 7.209f, 8.946f, 7.186f, 8.983f, 7.171f)
                curveTo(9.02f, 7.155f, 9.06f, 7.147f, 9.105f, 7.147f)
                curveTo(9.168f, 7.147f, 9.22f, 7.161f, 9.262f, 7.188f)
                curveTo(9.304f, 7.216f, 9.336f, 7.252f, 9.359f, 7.297f)
                lineTo(9.29f, 7.339f)
                curveTo(9.274f, 7.302f, 9.25f, 7.273f, 9.219f, 7.252f)
                curveTo(9.187f, 7.231f, 9.149f, 7.221f, 9.105f, 7.221f)
                curveTo(9.074f, 7.221f, 9.046f, 7.226f, 9.021f, 7.237f)
                curveTo(8.996f, 7.248f, 8.974f, 7.263f, 8.956f, 7.283f)
                curveTo(8.937f, 7.302f, 8.923f, 7.326f, 8.913f, 7.354f)
                curveTo(8.903f, 7.381f, 8.898f, 7.412f, 8.898f, 7.446f)
                verticalLineTo(7.557f)
                curveTo(8.898f, 7.591f, 8.903f, 7.622f, 8.913f, 7.65f)
                curveTo(8.923f, 7.678f, 8.937f, 7.702f, 8.956f, 7.722f)
                curveTo(8.974f, 7.741f, 8.996f, 7.757f, 9.023f, 7.768f)
                curveTo(9.05f, 7.778f, 9.08f, 7.784f, 9.113f, 7.784f)
                curveTo(9.137f, 7.784f, 9.16f, 7.781f, 9.182f, 7.774f)
                curveTo(9.203f, 7.768f, 9.222f, 7.759f, 9.239f, 7.746f)
                curveTo(9.255f, 7.734f, 9.268f, 7.718f, 9.277f, 7.7f)
                curveTo(9.286f, 7.681f, 9.291f, 7.659f, 9.291f, 7.633f)
                verticalLineTo(7.565f)
                horizontalLineTo(9.137f)
                verticalLineTo(7.492f)
                horizontalLineTo(9.373f)
                verticalLineTo(7.846f)
                horizontalLineTo(9.295f)
                verticalLineTo(7.745f)
                close()
                moveTo(9.817f, 7.159f)
                verticalLineTo(7.584f)
                curveTo(9.817f, 7.65f, 9.829f, 7.699f, 9.854f, 7.733f)
                curveTo(9.879f, 7.767f, 9.922f, 7.784f, 9.984f, 7.784f)
                curveTo(10.046f, 7.784f, 10.089f, 7.767f, 10.114f, 7.733f)
                curveTo(10.139f, 7.699f, 10.151f, 7.65f, 10.151f, 7.584f)
                verticalLineTo(7.159f)
                horizontalLineTo(10.235f)
                verticalLineTo(7.564f)
                curveTo(10.235f, 7.614f, 10.231f, 7.657f, 10.222f, 7.694f)
                curveTo(10.212f, 7.731f, 10.198f, 7.761f, 10.178f, 7.786f)
                curveTo(10.158f, 7.81f, 10.132f, 7.828f, 10.099f, 7.84f)
                curveTo(10.067f, 7.852f, 10.028f, 7.858f, 9.981f, 7.858f)
                curveTo(9.934f, 7.858f, 9.895f, 7.852f, 9.864f, 7.84f)
                curveTo(9.832f, 7.828f, 9.806f, 7.81f, 9.787f, 7.786f)
                curveTo(9.768f, 7.761f, 9.754f, 7.731f, 9.746f, 7.694f)
                curveTo(9.737f, 7.657f, 9.733f, 7.614f, 9.733f, 7.564f)
                verticalLineTo(7.159f)
                horizontalLineTo(9.817f)
                close()
                moveTo(11.04f, 7.846f)
                lineTo(10.97f, 7.643f)
                horizontalLineTo(10.688f)
                lineTo(10.618f, 7.846f)
                horizontalLineTo(10.533f)
                lineTo(10.777f, 7.159f)
                horizontalLineTo(10.884f)
                lineTo(11.128f, 7.846f)
                horizontalLineTo(11.04f)
                close()
                moveTo(10.831f, 7.235f)
                horizontalLineTo(10.826f)
                lineTo(10.708f, 7.57f)
                horizontalLineTo(10.949f)
                lineTo(10.831f, 7.235f)
                close()
                moveTo(11.988f, 7.267f)
                horizontalLineTo(11.983f)
                lineTo(11.924f, 7.382f)
                lineTo(11.757f, 7.681f)
                lineTo(11.59f, 7.382f)
                lineTo(11.531f, 7.267f)
                horizontalLineTo(11.526f)
                verticalLineTo(7.846f)
                horizontalLineTo(11.444f)
                verticalLineTo(7.159f)
                horizontalLineTo(11.556f)
                lineTo(11.756f, 7.529f)
                horizontalLineTo(11.761f)
                lineTo(11.962f, 7.159f)
                horizontalLineTo(12.07f)
                verticalLineTo(7.846f)
                horizontalLineTo(11.988f)
                verticalLineTo(7.267f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Guam,
            contentDescription = "Guam Flag"
        )
    }
}
