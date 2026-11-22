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
 * Sint Maarten Flag (32x24dp)
 *
 * - ISO Alpha-2: SX
 * - ISO Alpha-3: SXM
 * - ISO Numeric: 534
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SintMaarten: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Maarten:SX:SXM:534:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, -2f)
            verticalLineTo(26f)
            lineTo(20f, 12f)
            lineTo(0f, -2f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, -2f)
                verticalLineTo(26f)
                lineTo(20f, 12f)
                lineTo(0f, -2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.126f, 10.189f)
                curveTo(9.563f, 10.189f, 10.727f, 9.251f, 10.727f, 8.094f)
                curveTo(10.727f, 6.938f, 9.563f, 6f, 8.126f, 6f)
                curveTo(6.689f, 6f, 5.524f, 6.938f, 5.524f, 8.094f)
                curveTo(5.524f, 9.251f, 6.689f, 10.189f, 8.126f, 10.189f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDA610A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.353f, 6.385f)
                curveTo(8.141f, 6.385f, 7.99f, 6.522f, 7.99f, 6.728f)
                lineTo(7.99f, 6.751f)
                curveTo(7.979f, 6.785f, 7.973f, 6.823f, 7.971f, 6.866f)
                curveTo(7.968f, 6.976f, 8.009f, 7.067f, 8.095f, 7.151f)
                curveTo(8.1f, 7.175f, 8.103f, 7.195f, 8.102f, 7.207f)
                curveTo(8.097f, 7.189f, 8.076f, 7.174f, 8.037f, 7.145f)
                curveTo(7.981f, 7.105f, 7.887f, 7.037f, 7.746f, 6.894f)
                curveTo(7.544f, 6.689f, 7.391f, 6.608f, 7.201f, 6.64f)
                curveTo(7.143f, 6.65f, 7.086f, 6.67f, 7.019f, 6.697f)
                curveTo(6.911f, 6.736f, 6.811f, 6.745f, 6.628f, 6.71f)
                curveTo(6.117f, 6.613f, 5.558f, 6.708f, 4.952f, 6.989f)
                lineTo(5.162f, 7.443f)
                curveTo(5.679f, 7.203f, 6.135f, 7.125f, 6.534f, 7.201f)
                curveTo(6.808f, 7.254f, 6.998f, 7.236f, 7.188f, 7.168f)
                curveTo(7.27f, 7.137f, 7.277f, 7.134f, 7.283f, 7.133f)
                curveTo(7.277f, 7.134f, 7.281f, 7.138f, 7.307f, 7.163f)
                curveTo(7.324f, 7.179f, 7.351f, 7.205f, 7.391f, 7.245f)
                curveTo(7.448f, 7.303f, 7.508f, 7.356f, 7.569f, 7.403f)
                curveTo(7.451f, 7.435f, 7.457f, 7.456f, 7.479f, 7.533f)
                curveTo(7.488f, 7.564f, 7.499f, 7.605f, 7.506f, 7.659f)
                curveTo(7.52f, 7.778f, 7.496f, 7.84f, 7.517f, 7.869f)
                curveTo(7.54f, 7.902f, 7.62f, 7.895f, 7.872f, 7.884f)
                curveTo(7.94f, 7.88f, 8.031f, 7.873f, 8.137f, 7.863f)
                curveTo(8.345f, 7.844f, 8.58f, 7.815f, 8.725f, 7.792f)
                curveTo(8.865f, 7.769f, 8.902f, 7.76f, 8.961f, 7.717f)
                lineTo(8.961f, 7.717f)
                curveTo(8.981f, 7.692f, 8.999f, 7.671f, 9.013f, 7.652f)
                curveTo(9.493f, 7.581f, 9.92f, 7.531f, 10.3f, 7.497f)
                curveTo(10.436f, 7.484f, 10.545f, 7.476f, 10.651f, 7.468f)
                curveTo(10.663f, 7.468f, 10.663f, 7.468f, 10.725f, 7.455f)
                lineTo(10.725f, 7.455f)
                curveTo(10.752f, 7.444f, 10.763f, 7.439f, 10.767f, 7.437f)
                lineTo(10.767f, 7.438f)
                curveTo(10.768f, 7.437f, 10.769f, 7.436f, 10.767f, 7.437f)
                lineTo(10.889f, 7.147f)
                lineTo(10.763f, 6.994f)
                curveTo(10.687f, 6.97f, 10.679f, 6.968f, 10.67f, 6.967f)
                curveTo(10.67f, 6.967f, 10.668f, 6.967f, 10.667f, 6.967f)
                curveTo(10.657f, 6.967f, 10.654f, 6.966f, 10.65f, 6.966f)
                curveTo(10.648f, 6.966f, 10.646f, 6.966f, 10.643f, 6.966f)
                curveTo(10.629f, 6.966f, 10.62f, 6.966f, 10.611f, 6.966f)
                curveTo(10.594f, 6.966f, 10.577f, 6.966f, 10.528f, 6.966f)
                curveTo(10.445f, 6.966f, 10.38f, 6.959f, 10.285f, 6.942f)
                lineTo(10.196f, 6.926f)
                curveTo(9.807f, 6.854f, 9.445f, 6.854f, 8.678f, 6.969f)
                curveTo(8.664f, 6.958f, 8.65f, 6.947f, 8.636f, 6.936f)
                curveTo(8.759f, 6.915f, 8.909f, 6.9f, 9.068f, 6.892f)
                lineTo(9.068f, 6.892f)
                curveTo(9.164f, 6.887f, 9.164f, 6.887f, 9.218f, 6.886f)
                lineTo(9.242f, 6.885f)
                lineTo(9.239f, 6.385f)
                lineTo(9.201f, 6.385f)
                horizontalLineTo(8.353f)
                close()
                moveTo(7.939f, 7.833f)
                curveTo(7.954f, 7.83f, 7.97f, 7.826f, 7.987f, 7.823f)
                lineTo(8.034f, 7.813f)
                curveTo(8.026f, 7.815f, 8.016f, 7.817f, 8.005f, 7.819f)
                curveTo(7.987f, 7.823f, 7.965f, 7.827f, 7.939f, 7.833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF56C6F5)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1f
            ) {
                moveTo(7.925f, 8.581f)
                lineTo(8.006f, 8.594f)
                lineTo(8.087f, 8.581f)
                curveTo(9.08f, 8.418f, 9.734f, 8.437f, 10.113f, 8.564f)
                curveTo(10.549f, 8.71f, 11.031f, 8.669f, 11.539f, 8.498f)
                curveTo(11.378f, 9.216f, 11.295f, 9.894f, 11.295f, 10.532f)
                curveTo(11.295f, 11.259f, 11.436f, 11.846f, 11.564f, 12.361f)
                curveTo(11.567f, 12.375f, 11.57f, 12.389f, 11.574f, 12.402f)
                curveTo(11.699f, 12.907f, 11.802f, 13.325f, 11.802f, 13.804f)
                curveTo(11.802f, 14.235f, 11.66f, 14.461f, 11.46f, 14.603f)
                curveTo(11.229f, 14.766f, 10.843f, 14.87f, 10.272f, 14.87f)
                curveTo(9.466f, 14.87f, 8.712f, 15.088f, 8.017f, 15.512f)
                lineTo(8.006f, 15.504f)
                lineTo(7.995f, 15.512f)
                curveTo(7.3f, 15.088f, 6.546f, 14.87f, 5.74f, 14.87f)
                curveTo(5.169f, 14.87f, 4.783f, 14.766f, 4.552f, 14.603f)
                curveTo(4.352f, 14.461f, 4.209f, 14.235f, 4.209f, 13.804f)
                curveTo(4.209f, 13.325f, 4.313f, 12.907f, 4.438f, 12.402f)
                curveTo(4.441f, 12.389f, 4.445f, 12.375f, 4.448f, 12.361f)
                curveTo(4.576f, 11.846f, 4.717f, 11.259f, 4.717f, 10.532f)
                curveTo(4.717f, 9.894f, 4.634f, 9.216f, 4.473f, 8.498f)
                curveTo(4.98f, 8.669f, 5.463f, 8.71f, 5.899f, 8.564f)
                curveTo(6.278f, 8.437f, 6.932f, 8.418f, 7.925f, 8.581f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.785f, 10.624f)
                lineTo(8.013f, 9.938f)
                lineTo(7.242f, 10.624f)
                horizontalLineTo(7.471f)
                verticalLineTo(11.019f)
                lineTo(6.271f, 11.767f)
                verticalLineTo(13.596f)
                horizontalLineTo(6.042f)
                verticalLineTo(13.939f)
                horizontalLineTo(6.271f)
                horizontalLineTo(9.756f)
                horizontalLineTo(10.042f)
                verticalLineTo(13.596f)
                horizontalLineTo(9.756f)
                verticalLineTo(11.767f)
                lineTo(8.499f, 10.984f)
                verticalLineTo(10.624f)
                horizontalLineTo(8.785f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3B3B3B))) {
                moveTo(8.013f, 9.938f)
                lineTo(8.096f, 9.845f)
                lineTo(8.013f, 9.771f)
                lineTo(7.93f, 9.845f)
                lineTo(8.013f, 9.938f)
                close()
                moveTo(8.785f, 10.624f)
                verticalLineTo(10.749f)
                horizontalLineTo(9.114f)
                lineTo(8.868f, 10.531f)
                lineTo(8.785f, 10.624f)
                close()
                moveTo(7.242f, 10.624f)
                lineTo(7.159f, 10.531f)
                lineTo(6.913f, 10.749f)
                horizontalLineTo(7.242f)
                verticalLineTo(10.624f)
                close()
                moveTo(7.471f, 10.624f)
                horizontalLineTo(7.596f)
                verticalLineTo(10.499f)
                horizontalLineTo(7.471f)
                verticalLineTo(10.624f)
                close()
                moveTo(7.471f, 11.019f)
                lineTo(7.537f, 11.126f)
                lineTo(7.596f, 11.089f)
                verticalLineTo(11.019f)
                horizontalLineTo(7.471f)
                close()
                moveTo(6.271f, 11.767f)
                lineTo(6.204f, 11.661f)
                lineTo(6.146f, 11.698f)
                verticalLineTo(11.767f)
                horizontalLineTo(6.271f)
                close()
                moveTo(6.271f, 13.596f)
                verticalLineTo(13.721f)
                horizontalLineTo(6.396f)
                verticalLineTo(13.596f)
                horizontalLineTo(6.271f)
                close()
                moveTo(6.042f, 13.596f)
                verticalLineTo(13.471f)
                horizontalLineTo(5.917f)
                verticalLineTo(13.596f)
                horizontalLineTo(6.042f)
                close()
                moveTo(6.042f, 13.939f)
                horizontalLineTo(5.917f)
                verticalLineTo(14.064f)
                horizontalLineTo(6.042f)
                verticalLineTo(13.939f)
                close()
                moveTo(10.042f, 13.939f)
                verticalLineTo(14.064f)
                horizontalLineTo(10.167f)
                verticalLineTo(13.939f)
                horizontalLineTo(10.042f)
                close()
                moveTo(10.042f, 13.596f)
                horizontalLineTo(10.167f)
                verticalLineTo(13.471f)
                horizontalLineTo(10.042f)
                verticalLineTo(13.596f)
                close()
                moveTo(9.756f, 13.596f)
                horizontalLineTo(9.631f)
                verticalLineTo(13.721f)
                horizontalLineTo(9.756f)
                verticalLineTo(13.596f)
                close()
                moveTo(9.756f, 11.767f)
                horizontalLineTo(9.881f)
                verticalLineTo(11.698f)
                lineTo(9.822f, 11.661f)
                lineTo(9.756f, 11.767f)
                close()
                moveTo(8.499f, 10.984f)
                horizontalLineTo(8.374f)
                verticalLineTo(11.053f)
                lineTo(8.433f, 11.09f)
                lineTo(8.499f, 10.984f)
                close()
                moveTo(8.499f, 10.624f)
                verticalLineTo(10.499f)
                horizontalLineTo(8.374f)
                verticalLineTo(10.624f)
                horizontalLineTo(8.499f)
                close()
                moveTo(7.93f, 10.032f)
                lineTo(8.702f, 10.718f)
                lineTo(8.868f, 10.531f)
                lineTo(8.096f, 9.845f)
                lineTo(7.93f, 10.032f)
                close()
                moveTo(7.325f, 10.718f)
                lineTo(8.096f, 10.032f)
                lineTo(7.93f, 9.845f)
                lineTo(7.159f, 10.531f)
                lineTo(7.325f, 10.718f)
                close()
                moveTo(7.471f, 10.499f)
                horizontalLineTo(7.242f)
                verticalLineTo(10.749f)
                horizontalLineTo(7.471f)
                verticalLineTo(10.499f)
                close()
                moveTo(7.346f, 10.624f)
                verticalLineTo(11.019f)
                horizontalLineTo(7.596f)
                verticalLineTo(10.624f)
                horizontalLineTo(7.346f)
                close()
                moveTo(7.404f, 10.913f)
                lineTo(6.204f, 11.661f)
                lineTo(6.337f, 11.873f)
                lineTo(7.537f, 11.126f)
                lineTo(7.404f, 10.913f)
                close()
                moveTo(6.146f, 11.767f)
                verticalLineTo(13.596f)
                horizontalLineTo(6.396f)
                verticalLineTo(11.767f)
                horizontalLineTo(6.146f)
                close()
                moveTo(6.271f, 13.471f)
                horizontalLineTo(6.042f)
                verticalLineTo(13.721f)
                horizontalLineTo(6.271f)
                verticalLineTo(13.471f)
                close()
                moveTo(5.917f, 13.596f)
                verticalLineTo(13.939f)
                horizontalLineTo(6.167f)
                verticalLineTo(13.596f)
                horizontalLineTo(5.917f)
                close()
                moveTo(6.042f, 14.064f)
                horizontalLineTo(6.271f)
                verticalLineTo(13.814f)
                horizontalLineTo(6.042f)
                verticalLineTo(14.064f)
                close()
                moveTo(6.271f, 14.064f)
                horizontalLineTo(9.756f)
                verticalLineTo(13.814f)
                horizontalLineTo(6.271f)
                verticalLineTo(14.064f)
                close()
                moveTo(9.756f, 14.064f)
                horizontalLineTo(10.042f)
                verticalLineTo(13.814f)
                horizontalLineTo(9.756f)
                verticalLineTo(14.064f)
                close()
                moveTo(10.167f, 13.939f)
                verticalLineTo(13.596f)
                horizontalLineTo(9.917f)
                verticalLineTo(13.939f)
                horizontalLineTo(10.167f)
                close()
                moveTo(10.042f, 13.471f)
                horizontalLineTo(9.756f)
                verticalLineTo(13.721f)
                horizontalLineTo(10.042f)
                verticalLineTo(13.471f)
                close()
                moveTo(9.881f, 13.596f)
                verticalLineTo(11.767f)
                horizontalLineTo(9.631f)
                verticalLineTo(13.596f)
                horizontalLineTo(9.881f)
                close()
                moveTo(9.822f, 11.661f)
                lineTo(8.565f, 10.878f)
                lineTo(8.433f, 11.09f)
                lineTo(9.69f, 11.873f)
                lineTo(9.822f, 11.661f)
                close()
                moveTo(8.624f, 10.984f)
                verticalLineTo(10.624f)
                horizontalLineTo(8.374f)
                verticalLineTo(10.984f)
                horizontalLineTo(8.624f)
                close()
                moveTo(8.785f, 10.499f)
                horizontalLineTo(8.499f)
                verticalLineTo(10.749f)
                horizontalLineTo(8.785f)
                verticalLineTo(10.499f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBCD17))) {
                moveTo(7.952f, 17.02f)
                curveTo(9.013f, 17.02f, 9.743f, 16.904f, 10.12f, 16.707f)
                curveTo(10.218f, 16.539f, 10.391f, 16.445f, 10.575f, 16.452f)
                curveTo(11.402f, 16.482f, 12.042f, 16.134f, 12.545f, 15.369f)
                curveTo(13.089f, 14.542f, 13.198f, 13.368f, 12.843f, 11.826f)
                lineTo(13.743f, 11.619f)
                curveTo(14.149f, 13.385f, 14.016f, 14.811f, 13.316f, 15.876f)
                curveTo(12.689f, 16.83f, 11.833f, 17.34f, 10.789f, 17.375f)
                curveTo(10.255f, 17.77f, 9.321f, 17.943f, 7.952f, 17.943f)
                curveTo(6.628f, 17.943f, 5.646f, 17.686f, 5.016f, 17.14f)
                curveTo(3.587f, 16.802f, 2.678f, 16.232f, 2.321f, 15.387f)
                curveTo(1.94f, 14.486f, 1.94f, 13.235f, 2.295f, 11.623f)
                lineTo(3.197f, 11.822f)
                curveTo(2.879f, 13.264f, 2.879f, 14.336f, 3.171f, 15.027f)
                curveTo(3.375f, 15.51f, 3.968f, 15.904f, 4.972f, 16.177f)
                lineTo(5.904f, 16.376f)
                lineTo(5.86f, 16.612f)
                curveTo(6.315f, 16.878f, 7.01f, 17.02f, 7.952f, 17.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.767f, 9.176f)
                curveTo(4.664f, 9.432f, 4.788f, 9.724f, 5.044f, 9.827f)
                lineTo(5.06f, 9.833f)
                lineTo(5.036f, 9.883f)
                curveTo(4.86f, 10.248f, 5.16f, 10.623f, 5.514f, 10.601f)
                lineTo(5.503f, 10.658f)
                curveTo(5.4f, 11.162f, 5.982f, 11.414f, 6.304f, 11.158f)
                curveTo(6.509f, 11.153f, 6.711f, 11.03f, 6.772f, 10.773f)
                lineTo(6.829f, 10.532f)
                lineTo(6.852f, 10.539f)
                curveTo(7.324f, 10.681f, 7.643f, 10.161f, 7.434f, 9.809f)
                curveTo(7.497f, 9.695f, 7.516f, 9.557f, 7.474f, 9.422f)
                curveTo(7.394f, 9.158f, 7.114f, 9.01f, 6.85f, 9.09f)
                lineTo(6.334f, 9.249f)
                curveTo(6.265f, 9.229f, 6.191f, 9.225f, 6.117f, 9.238f)
                curveTo(6.067f, 9.181f, 6.004f, 9.135f, 5.929f, 9.105f)
                lineTo(5.417f, 8.899f)
                curveTo(5.161f, 8.796f, 4.87f, 8.92f, 4.767f, 9.176f)
                close()
                moveTo(6.829f, 10.532f)
                lineTo(6.951f, 10.015f)
                lineTo(6.32f, 10.379f)
                lineTo(6.829f, 10.532f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.205f, 10.476f)
                curveTo(6.482f, 10.476f, 6.705f, 10.252f, 6.705f, 9.976f)
                curveTo(6.705f, 9.7f, 6.482f, 9.476f, 6.205f, 9.476f)
                curveTo(5.929f, 9.476f, 5.705f, 9.7f, 5.705f, 9.976f)
                curveTo(5.705f, 10.252f, 5.929f, 10.476f, 6.205f, 10.476f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.241f, 10.073f)
                curveTo(10.233f, 9.737f, 10.196f, 8.969f, 10.025f, 8.969f)
                curveTo(9.853f, 8.969f, 9.827f, 9.746f, 9.824f, 10.079f)
                curveTo(9.528f, 10.176f, 9.306f, 10.43f, 9.306f, 10.43f)
                horizontalLineTo(10.778f)
                curveTo(10.778f, 10.43f, 10.546f, 10.165f, 10.241f, 10.073f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(2.55f, 12.568f)
                lineTo(2.797f, 12.611f)
                curveTo(2.597f, 13.757f, 2.597f, 14.579f, 2.79f, 15.069f)
                curveTo(3.014f, 15.64f, 4.336f, 16.405f, 4.71f, 16.405f)
                verticalLineTo(16.655f)
                curveTo(4.24f, 16.655f, 2.822f, 15.834f, 2.557f, 15.161f)
                curveTo(2.344f, 14.618f, 2.344f, 13.756f, 2.55f, 12.568f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(13.381f, 12.509f)
                lineTo(13.135f, 12.55f)
                curveTo(13.315f, 13.625f, 13.275f, 14.465f, 13.018f, 15.066f)
                curveTo(12.709f, 15.791f, 11.516f, 16.715f, 11.203f, 16.715f)
                verticalLineTo(16.965f)
                curveTo(11.624f, 16.965f, 12.903f, 15.975f, 13.248f, 15.164f)
                curveTo(13.526f, 14.512f, 13.569f, 13.627f, 13.381f, 12.509f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(6.393f, 17.424f)
                lineTo(6.44f, 17.178f)
                curveTo(7.237f, 17.331f, 7.781f, 17.407f, 8.066f, 17.407f)
                curveTo(8.35f, 17.407f, 8.865f, 17.331f, 9.604f, 17.179f)
                lineTo(9.655f, 17.424f)
                curveTo(8.9f, 17.579f, 8.372f, 17.657f, 8.066f, 17.657f)
                curveTo(7.76f, 17.657f, 7.205f, 17.58f, 6.393f, 17.424f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SintMaartenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SintMaarten,
            contentDescription = "Sint Maarten Flag"
        )
    }
}
