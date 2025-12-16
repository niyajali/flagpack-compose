package flagpack.icons.large

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
 * Fiji Flag (32x24dp)
 *
 * - ISO Alpha-2: FJ
 * - ISO Alpha-3: FJI
 * - ISO Numeric: 242
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Fiji: ImageVector by lazy {
    ImageVector.Builder(
        name = "Fiji:FJ:FJI:242:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF67BFE5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-2.004f, 13f)
                lineTo(1.957f, 14.737f)
                lineTo(18.09f, 1.889f)
                lineTo(20.179f, -0.693f)
                lineTo(15.943f, -1.273f)
                lineTo(9.363f, 4.263f)
                lineTo(4.067f, 7.994f)
                lineTo(-2.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.462f, 14.217f)
                lineTo(0.556f, 15.225f)
                lineTo(19.429f, -0.933f)
                horizontalLineTo(16.596f)
                lineTo(-1.462f, 14.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(20.004f, 13f)
                lineTo(16.043f, 14.737f)
                lineTo(-0.09f, 1.889f)
                lineTo(-2.179f, -0.693f)
                lineTo(2.056f, -1.273f)
                lineTo(8.637f, 4.263f)
                lineTo(13.933f, 7.994f)
                lineTo(20.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(19.869f, 13.873f)
                lineTo(17.851f, 14.882f)
                lineTo(9.815f, 7.964f)
                lineTo(7.432f, 7.191f)
                lineTo(-2.38f, -0.684f)
                horizontalLineTo(0.453f)
                lineTo(10.26f, 7.004f)
                lineTo(12.865f, 7.931f)
                lineTo(19.869f, 13.873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.985f, 0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.485f, 0f)
                horizontalLineTo(11.484f)
                verticalLineTo(4.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.484f)
                lineTo(11.5f, 14f)
                horizontalLineTo(6.5f)
                lineTo(6.485f, 9.5f)
                horizontalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.485f)
                verticalLineTo(0f)
                close()
                moveTo(7.985f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(20f, 10f)
            horizontalLineTo(29.655f)
            verticalLineTo(18.333f)
            curveTo(29.655f, 18.333f, 28.846f, 22f, 24.828f, 22f)
            curveTo(20.81f, 22f, 20f, 18.333f, 20f, 18.333f)
            verticalLineTo(10f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(20f, 10f)
                horizontalLineTo(29.655f)
                verticalLineTo(18.333f)
                curveTo(29.655f, 18.333f, 28.846f, 22f, 24.828f, 22f)
                curveTo(20.81f, 22f, 20f, 18.333f, 20f, 18.333f)
                verticalLineTo(10f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(20f, 10f)
                horizontalLineToRelative(9.655f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-9.655f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(24.138f, 12.667f)
                horizontalLineToRelative(1.379f)
                verticalLineToRelative(9.333f)
                horizontalLineToRelative(-1.379f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(20f, 16.333f)
                horizontalLineToRelative(9.655f)
                verticalLineToRelative(1.333f)
                horizontalLineToRelative(-9.655f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.541f, 20.737f)
                curveTo(23.121f, 21.558f, 23.594f, 21.878f, 23.929f, 21.394f)
                curveTo(24.164f, 21.055f, 24.188f, 20.715f, 23.853f, 20.648f)
                curveTo(23.659f, 20.401f, 23.522f, 20.209f, 23.443f, 20.074f)
                lineTo(23.455f, 20.064f)
                curveTo(23.549f, 19.973f, 23.552f, 19.851f, 23.534f, 19.806f)
                curveTo(23.527f, 19.743f, 23.573f, 19.659f, 23.875f, 19.428f)
                curveTo(24.148f, 19.219f, 24.269f, 19.023f, 24.09f, 18.806f)
                curveTo(23.996f, 18.692f, 23.911f, 18.669f, 23.645f, 18.628f)
                lineTo(23.563f, 18.615f)
                curveTo(23.483f, 18.603f, 23.426f, 18.59f, 23.39f, 18.579f)
                lineTo(23.204f, 18.224f)
                curveTo(22.817f, 18.212f, 22.514f, 18.28f, 22.183f, 18.42f)
                curveTo(22.04f, 18.48f, 21.944f, 18.521f, 21.879f, 18.549f)
                curveTo(21.782f, 18.59f, 21.758f, 18.6f, 21.757f, 18.599f)
                curveTo(21.757f, 18.598f, 21.759f, 18.597f, 21.762f, 18.594f)
                curveTo(21.77f, 18.588f, 21.782f, 18.578f, 21.764f, 18.578f)
                curveTo(21.694f, 18.578f, 21.618f, 18.57f, 21.409f, 18.544f)
                lineTo(21.367f, 18.538f)
                curveTo(20.764f, 18.463f, 20.613f, 18.465f, 20.515f, 18.746f)
                curveTo(20.366f, 19.173f, 21.247f, 19.957f, 21.715f, 20.051f)
                curveTo(21.949f, 20.098f, 22.229f, 20.323f, 22.541f, 20.737f)
                close()
                moveTo(23.197f, 20.149f)
                curveTo(23.253f, 20.149f, 23.297f, 20.146f, 23.336f, 20.136f)
                lineTo(23.347f, 20.11f)
                curveTo(23.316f, 20.132f, 23.269f, 20.149f, 23.197f, 20.149f)
                close()
                moveTo(20.994f, 18.968f)
                curveTo(20.982f, 18.954f, 20.978f, 18.935f, 20.987f, 18.91f)
                curveTo(20.985f, 18.915f, 20.991f, 18.926f, 21.003f, 18.942f)
                curveTo(21.014f, 18.957f, 21.032f, 18.977f, 21.054f, 19f)
                curveTo(21.027f, 18.993f, 21.006f, 18.982f, 20.994f, 18.968f)
                close()
                moveTo(21.813f, 19.561f)
                curveTo(21.646f, 19.527f, 21.219f, 19.173f, 21.054f, 19f)
                curveTo(21.097f, 19.013f, 21.156f, 19.019f, 21.22f, 19.025f)
                curveTo(21.248f, 19.028f, 21.276f, 19.031f, 21.305f, 19.035f)
                lineTo(21.346f, 19.04f)
                curveTo(21.581f, 19.07f, 21.664f, 19.078f, 21.764f, 19.078f)
                curveTo(21.822f, 19.078f, 21.81f, 19.098f, 21.803f, 19.11f)
                curveTo(21.8f, 19.114f, 21.799f, 19.117f, 21.799f, 19.118f)
                curveTo(21.803f, 19.124f, 21.848f, 19.105f, 22.076f, 19.008f)
                lineTo(22.076f, 19.008f)
                lineTo(22.076f, 19.008f)
                curveTo(22.154f, 18.975f, 22.252f, 18.933f, 22.377f, 18.881f)
                curveTo(22.554f, 18.806f, 22.716f, 18.757f, 22.893f, 18.736f)
                curveTo(22.913f, 18.819f, 22.962f, 18.895f, 23.041f, 18.957f)
                curveTo(23.147f, 19.039f, 23.268f, 19.074f, 23.475f, 19.108f)
                curveTo(23.217f, 19.319f, 23.088f, 19.496f, 23.048f, 19.669f)
                curveTo(22.816f, 19.742f, 22.837f, 20.003f, 22.976f, 20.263f)
                curveTo(23.073f, 20.445f, 23.256f, 20.702f, 23.528f, 21.042f)
                lineTo(23.723f, 21.136f)
                curveTo(23.665f, 21.136f, 23.633f, 21.11f, 23.609f, 21.09f)
                curveTo(23.578f, 21.065f, 23.559f, 21.049f, 23.517f, 21.11f)
                curveTo(23.514f, 21.114f, 23.333f, 20.991f, 22.944f, 20.443f)
                curveTo(22.563f, 19.934f, 22.192f, 19.637f, 21.813f, 19.561f)
                close()
                moveTo(23.033f, 19.861f)
                curveTo(23.036f, 19.858f, 23.036f, 19.854f, 23.035f, 19.85f)
                lineTo(23.035f, 19.85f)
                lineTo(23.033f, 19.861f)
                close()
                moveTo(23.193f, 19.649f)
                lineTo(23.178f, 19.649f)
                lineTo(23.185f, 19.649f)
                curveTo(23.187f, 19.649f, 23.19f, 19.649f, 23.193f, 19.649f)
                close()
                moveTo(23.197f, 19.649f)
                curveTo(23.195f, 19.649f, 23.194f, 19.649f, 23.193f, 19.649f)
                lineTo(23.197f, 19.649f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 1f
            ) {
                moveTo(21.655f, 16.11f)
                curveTo(21.655f, 16.11f, 21.178f, 15.45f, 21.178f, 15.215f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(21.359f, 15.543f)
                curveTo(21.359f, 15.543f, 20.749f, 15.282f, 20.749f, 15.543f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(21.349f, 15.269f)
                curveTo(21.349f, 15.269f, 20.92f, 14.723f, 20.597f, 14.723f)
                curveTo(20.275f, 14.723f, 20.282f, 14.996f, 20.282f, 14.996f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(21.104f, 14.722f)
                curveTo(21.104f, 14.722f, 20.913f, 13.829f, 20.606f, 13.829f)
                curveTo(20.299f, 13.829f, 20.299f, 14.276f, 20.299f, 14.276f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(21.181f, 14.72f)
                curveTo(21.181f, 14.72f, 21.096f, 13.955f, 21.491f, 13.955f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 1f
            ) {
                moveTo(22.261f, 15.981f)
                curveTo(22.261f, 15.981f, 22.038f, 15.198f, 22.119f, 14.977f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(22.177f, 15.347f)
                curveTo(22.177f, 15.347f, 21.693f, 14.893f, 21.604f, 15.138f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(22.261f, 15.086f)
                curveTo(22.261f, 15.086f, 22.045f, 14.426f, 21.742f, 14.316f)
                curveTo(21.438f, 14.205f, 21.352f, 14.465f, 21.352f, 14.465f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(22.218f, 14.488f)
                curveTo(22.218f, 14.488f, 22.344f, 13.584f, 22.055f, 13.479f)
                curveTo(21.767f, 13.374f, 21.615f, 13.793f, 21.615f, 13.793f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 1f
            ) {
                moveTo(22.291f, 14.513f)
                curveTo(22.291f, 14.513f, 22.473f, 13.765f, 22.844f, 13.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(22.752f, 16.26f)
                curveTo(22.752f, 16.26f, 23.068f, 15.51f, 23.015f, 15.28f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(22.913f, 15.641f)
                curveTo(22.913f, 15.641f, 23.449f, 15.25f, 23.507f, 15.503f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(22.861f, 15.372f)
                curveTo(22.861f, 15.372f, 23.156f, 14.743f, 23.471f, 14.671f)
                curveTo(23.785f, 14.598f, 23.839f, 14.866f, 23.839f, 14.866f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(22.977f, 14.783f)
                curveTo(22.977f, 14.783f, 22.962f, 13.871f, 23.261f, 13.802f)
                curveTo(23.56f, 13.733f, 23.66f, 14.167f, 23.66f, 14.167f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(22.901f, 14.799f)
                curveTo(22.901f, 14.799f, 22.812f, 14.035f, 22.427f, 14.123f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(26.698f, 15.802f)
                curveTo(26.698f, 15.802f, 26.94f, 14.688f, 27.629f, 14.688f)
                curveTo(28.317f, 14.688f, 28.625f, 15.865f, 28.625f, 15.865f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(26.129f, 15.042f)
                curveTo(26.129f, 15.042f, 26.5f, 14.384f, 27.724f, 14.438f)
                curveTo(28.948f, 14.491f, 29.171f, 15.042f, 29.171f, 15.042f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.7f
            ) {
                moveTo(25.882f, 14.205f)
                curveTo(25.882f, 14.205f, 26.554f, 13.373f, 27.496f, 14.078f)
                lineTo(27.816f, 14.205f)
                curveTo(27.816f, 14.205f, 28.136f, 13.262f, 29.682f, 14.205f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 1f
            ) {
                moveTo(27.738f, 16.037f)
                curveTo(27.738f, 16.037f, 27.788f, 14.998f, 27.952f, 14.712f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 1f
            ) {
                moveTo(29.099f, 18.314f)
                curveTo(29.099f, 18.314f, 28.481f, 18.023f, 28.296f, 18.314f)
                curveTo(28.111f, 18.605f, 25.883f, 21.276f, 25.883f, 21.276f)
            }
            path(
                fill = SolidColor(Color(0xFFFFF203)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(26.964f, 18.595f)
                lineTo(28.345f, 19.56f)
                curveTo(28.345f, 19.56f, 28.98f, 19.107f, 28.663f, 18.851f)
                curveTo(28.345f, 18.595f, 27.479f, 18.144f, 27.479f, 18.144f)
                lineTo(26.964f, 18.595f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A651)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(26.917f, 18.645f)
                curveTo(26.917f, 18.645f, 26.597f, 18.979f, 26.597f, 19.235f)
                curveTo(26.597f, 19.491f, 26.299f, 20.177f, 26.299f, 20.177f)
                curveTo(26.299f, 20.177f, 27.132f, 20.69f, 27.304f, 20.363f)
                curveTo(27.477f, 20.037f, 28.6f, 20.233f, 28.402f, 19.734f)
                curveTo(28.204f, 19.235f, 26.917f, 18.645f, 26.917f, 18.645f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.056f, 11.182f)
                curveTo(21.056f, 11.182f, 21.794f, 10.804f, 22.159f, 11.182f)
                curveTo(22.524f, 11.561f, 22.823f, 11.151f, 22.823f, 10.923f)
                curveTo(22.823f, 10.694f, 23.402f, 9.911f, 23.402f, 10.547f)
                curveTo(23.402f, 11.182f, 23.222f, 11.541f, 23.731f, 11.541f)
                curveTo(24.24f, 11.541f, 26.534f, 10.663f, 27.084f, 10.923f)
                curveTo(27.634f, 11.182f, 28.055f, 11.118f, 27.915f, 10.745f)
                curveTo(27.775f, 10.373f, 27.416f, 10.14f, 26.724f, 10.343f)
                curveTo(26.032f, 10.547f, 26.196f, 10.745f, 25.598f, 10.745f)
                curveTo(25f, 10.745f, 24.334f, 10.547f, 24.334f, 10.547f)
                curveTo(24.334f, 10.547f, 24.521f, 10.213f, 25.204f, 10.45f)
                curveTo(25.886f, 10.688f, 26.828f, 10.156f, 27.084f, 10.156f)
                curveTo(27.34f, 10.156f, 28.045f, 10.14f, 28.115f, 10.343f)
                curveTo(28.185f, 10.547f, 28.611f, 10.733f, 28.286f, 10.923f)
                curveTo(27.962f, 11.112f, 27.427f, 11.231f, 27.795f, 11.474f)
                curveTo(28.163f, 11.717f, 29.009f, 11.67f, 29.05f, 11.922f)
                curveTo(29.091f, 12.175f, 29.492f, 12.552f, 29.331f, 12.552f)
                curveTo(29.17f, 12.552f, 28.879f, 12.908f, 28.608f, 12.8f)
                curveTo(28.337f, 12.691f, 28.305f, 12.596f, 28.565f, 12.508f)
                curveTo(28.825f, 12.421f, 28.823f, 12.052f, 28.608f, 12.052f)
                curveTo(28.394f, 12.052f, 28.499f, 12.181f, 28.011f, 12.052f)
                curveTo(27.523f, 11.922f, 26.877f, 11.779f, 26.916f, 12.052f)
                curveTo(26.955f, 12.325f, 27.272f, 12.744f, 26.686f, 12.8f)
                curveTo(26.1f, 12.855f, 25.826f, 13.08f, 25.712f, 12.899f)
                curveTo(25.598f, 12.718f, 25.19f, 12.478f, 25.51f, 12.401f)
                curveTo(25.831f, 12.323f, 26.138f, 12.663f, 26.253f, 12.608f)
                curveTo(26.368f, 12.552f, 26.63f, 12.521f, 26.411f, 12.286f)
                curveTo(26.192f, 12.052f, 25.83f, 11.913f, 26.165f, 11.738f)
                curveTo(26.5f, 11.562f, 26.236f, 11.558f, 25.598f, 11.922f)
                curveTo(24.959f, 12.286f, 24.604f, 12.596f, 24.044f, 12.552f)
                curveTo(23.483f, 12.508f, 23.273f, 12.567f, 23.093f, 12.508f)
                curveTo(22.913f, 12.449f, 22.035f, 13.16f, 21.783f, 12.98f)
                curveTo(21.53f, 12.8f, 20.714f, 12.73f, 20.861f, 12.508f)
                curveTo(21.008f, 12.286f, 21.205f, 12.172f, 21.425f, 12.286f)
                curveTo(21.644f, 12.401f, 21.862f, 12.515f, 22.01f, 12.401f)
                curveTo(22.159f, 12.286f, 22.586f, 11.894f, 22.479f, 11.816f)
                curveTo(22.371f, 11.738f, 22.475f, 11.474f, 21.866f, 11.474f)
                curveTo(21.257f, 11.474f, 21.043f, 11.768f, 20.899f, 11.583f)
                curveTo(20.754f, 11.397f, 21.056f, 11.182f, 21.056f, 11.182f)
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
            imageVector = FlagIcons.Large.Fiji,
            contentDescription = "Fiji Flag"
        )
    }
}
