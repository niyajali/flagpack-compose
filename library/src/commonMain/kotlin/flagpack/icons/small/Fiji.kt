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
 * Fiji Flag (16x12dp)
 *
 * - ISO Alpha-2: FJ
 * - ISO Alpha-3: FJI
 * - ISO Numeric: 242
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Fiji: ImageVector by lazy {
    ImageVector.Builder(
        name = "Fiji:FJ:FJI:242:Small",
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
                fill = SolidColor(Color(0xFF67BFE5)),
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
                lineTo(9.715f, -0.466f)
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
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 5f)
            horizontalLineTo(14.828f)
            verticalLineTo(9.167f)
            curveTo(14.828f, 9.167f, 14.423f, 11f, 12.414f, 11f)
            curveTo(10.405f, 11f, 10f, 9.167f, 10f, 9.167f)
            verticalLineTo(5f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 5f)
                horizontalLineTo(14.828f)
                verticalLineTo(9.167f)
                curveTo(14.828f, 9.167f, 14.423f, 11f, 12.414f, 11f)
                curveTo(10.405f, 11f, 10f, 9.167f, 10f, 9.167f)
                verticalLineTo(5f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(10f, 5f)
                horizontalLineToRelative(4.828f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC3352C))) {
                moveTo(12.069f, 6.333f)
                horizontalLineToRelative(0.69f)
                verticalLineToRelative(4.667f)
                horizontalLineToRelative(-0.69f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC3352C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8.167f)
                horizontalLineTo(14.828f)
                verticalLineTo(8.833f)
                horizontalLineTo(10f)
                verticalLineTo(8.167f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.27f, 10.368f)
                curveTo(11.561f, 10.779f, 11.797f, 10.939f, 11.964f, 10.697f)
                curveTo(12.082f, 10.527f, 12.094f, 10.357f, 11.927f, 10.324f)
                curveTo(11.829f, 10.201f, 11.761f, 10.104f, 11.722f, 10.037f)
                lineTo(11.727f, 10.032f)
                curveTo(11.774f, 9.986f, 11.776f, 9.925f, 11.767f, 9.903f)
                curveTo(11.763f, 9.872f, 11.786f, 9.829f, 11.937f, 9.714f)
                curveTo(12.074f, 9.61f, 12.135f, 9.511f, 12.045f, 9.403f)
                curveTo(11.998f, 9.346f, 11.956f, 9.335f, 11.822f, 9.314f)
                lineTo(11.781f, 9.308f)
                curveTo(11.742f, 9.301f, 11.713f, 9.295f, 11.695f, 9.29f)
                lineTo(11.602f, 9.112f)
                curveTo(11.408f, 9.106f, 11.257f, 9.14f, 11.091f, 9.21f)
                curveTo(11.02f, 9.24f, 10.972f, 9.261f, 10.94f, 9.274f)
                curveTo(10.891f, 9.295f, 10.879f, 9.3f, 10.879f, 9.299f)
                curveTo(10.879f, 9.299f, 10.88f, 9.298f, 10.881f, 9.297f)
                curveTo(10.885f, 9.294f, 10.891f, 9.289f, 10.882f, 9.289f)
                curveTo(10.847f, 9.289f, 10.809f, 9.285f, 10.704f, 9.272f)
                lineTo(10.684f, 9.269f)
                curveTo(10.382f, 9.231f, 10.306f, 9.232f, 10.257f, 9.373f)
                curveTo(10.183f, 9.587f, 10.623f, 9.978f, 10.857f, 10.026f)
                curveTo(10.974f, 10.049f, 11.115f, 10.161f, 11.27f, 10.368f)
                close()
                moveTo(11.598f, 10.074f)
                curveTo(11.627f, 10.074f, 11.649f, 10.073f, 11.668f, 10.068f)
                lineTo(11.674f, 10.055f)
                curveTo(11.658f, 10.066f, 11.634f, 10.074f, 11.598f, 10.074f)
                close()
                moveTo(10.497f, 9.484f)
                curveTo(10.491f, 9.477f, 10.489f, 9.467f, 10.493f, 9.455f)
                curveTo(10.493f, 9.458f, 10.495f, 9.463f, 10.501f, 9.471f)
                curveTo(10.507f, 9.479f, 10.516f, 9.489f, 10.527f, 9.5f)
                curveTo(10.514f, 9.496f, 10.503f, 9.491f, 10.497f, 9.484f)
                close()
                moveTo(10.907f, 9.78f)
                curveTo(10.823f, 9.764f, 10.61f, 9.586f, 10.527f, 9.5f)
                curveTo(10.549f, 9.506f, 10.578f, 9.509f, 10.61f, 9.513f)
                curveTo(10.624f, 9.514f, 10.638f, 9.515f, 10.653f, 9.517f)
                lineTo(10.673f, 9.52f)
                curveTo(10.791f, 9.535f, 10.832f, 9.539f, 10.882f, 9.539f)
                curveTo(10.911f, 9.539f, 10.905f, 9.549f, 10.901f, 9.555f)
                curveTo(10.9f, 9.557f, 10.899f, 9.558f, 10.9f, 9.559f)
                curveTo(10.901f, 9.562f, 10.924f, 9.552f, 11.038f, 9.504f)
                lineTo(11.038f, 9.504f)
                lineTo(11.189f, 9.44f)
                curveTo(11.277f, 9.403f, 11.358f, 9.379f, 11.447f, 9.368f)
                curveTo(11.456f, 9.41f, 11.481f, 9.448f, 11.52f, 9.478f)
                curveTo(11.574f, 9.52f, 11.634f, 9.537f, 11.737f, 9.554f)
                curveTo(11.609f, 9.66f, 11.544f, 9.748f, 11.524f, 9.834f)
                curveTo(11.408f, 9.871f, 11.419f, 10.001f, 11.488f, 10.132f)
                curveTo(11.536f, 10.222f, 11.628f, 10.351f, 11.764f, 10.521f)
                lineTo(11.861f, 10.568f)
                curveTo(11.833f, 10.568f, 11.816f, 10.555f, 11.804f, 10.545f)
                curveTo(11.789f, 10.532f, 11.78f, 10.525f, 11.759f, 10.555f)
                curveTo(11.757f, 10.557f, 11.666f, 10.495f, 11.472f, 10.221f)
                curveTo(11.281f, 9.967f, 11.096f, 9.819f, 10.907f, 9.78f)
                close()
                moveTo(11.516f, 9.93f)
                curveTo(11.518f, 9.929f, 11.518f, 9.927f, 11.518f, 9.925f)
                lineTo(11.518f, 9.925f)
                lineTo(11.516f, 9.93f)
                close()
                moveTo(11.596f, 9.824f)
                lineTo(11.589f, 9.824f)
                lineTo(11.592f, 9.825f)
                curveTo(11.594f, 9.824f, 11.595f, 9.824f, 11.596f, 9.824f)
                close()
                moveTo(11.598f, 9.824f)
                curveTo(11.598f, 9.824f, 11.597f, 9.824f, 11.596f, 9.824f)
                lineTo(11.598f, 9.824f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.828f, 8.055f)
                curveTo(10.828f, 8.055f, 10.589f, 7.725f, 10.589f, 7.607f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.679f, 7.771f)
                curveTo(10.679f, 7.771f, 10.374f, 7.641f, 10.374f, 7.771f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.674f, 7.634f)
                curveTo(10.674f, 7.634f, 10.46f, 7.362f, 10.299f, 7.362f)
                curveTo(10.137f, 7.362f, 10.141f, 7.498f, 10.141f, 7.498f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.552f, 7.361f)
                curveTo(10.552f, 7.361f, 10.456f, 6.915f, 10.303f, 6.915f)
                curveTo(10.15f, 6.915f, 10.15f, 7.138f, 10.15f, 7.138f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.591f, 7.36f)
                curveTo(10.591f, 7.36f, 10.548f, 6.978f, 10.745f, 6.978f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.131f, 7.991f)
                curveTo(11.131f, 7.991f, 11.019f, 7.599f, 11.06f, 7.488f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.088f, 7.673f)
                curveTo(11.088f, 7.673f, 10.846f, 7.447f, 10.802f, 7.569f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.131f, 7.543f)
                curveTo(11.131f, 7.543f, 11.022f, 7.213f, 10.871f, 7.158f)
                curveTo(10.719f, 7.103f, 10.676f, 7.232f, 10.676f, 7.232f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.109f, 7.244f)
                curveTo(11.109f, 7.244f, 11.172f, 6.792f, 11.028f, 6.739f)
                curveTo(10.884f, 6.687f, 10.807f, 6.897f, 10.807f, 6.897f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.146f, 7.257f)
                curveTo(11.146f, 7.257f, 11.236f, 6.882f, 11.422f, 6.95f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(11.376f, 8.13f)
                curveTo(11.376f, 8.13f, 11.534f, 7.755f, 11.508f, 7.64f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(11.457f, 7.82f)
                curveTo(11.457f, 7.82f, 11.724f, 7.625f, 11.754f, 7.752f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(11.431f, 7.686f)
                curveTo(11.431f, 7.686f, 11.578f, 7.372f, 11.735f, 7.335f)
                curveTo(11.893f, 7.299f, 11.92f, 7.433f, 11.92f, 7.433f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(11.488f, 7.392f)
                curveTo(11.488f, 7.392f, 11.481f, 6.935f, 11.631f, 6.901f)
                curveTo(11.78f, 6.866f, 11.83f, 7.084f, 11.83f, 7.084f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(11.45f, 7.4f)
                curveTo(11.45f, 7.4f, 11.406f, 7.017f, 11.214f, 7.062f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(13.349f, 7.901f)
                curveTo(13.349f, 7.901f, 13.47f, 7.344f, 13.814f, 7.344f)
                curveTo(14.159f, 7.344f, 14.313f, 7.932f, 14.313f, 7.932f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(13.065f, 7.521f)
                curveTo(13.065f, 7.521f, 13.25f, 7.192f, 13.862f, 7.219f)
                curveTo(14.474f, 7.246f, 14.585f, 7.521f, 14.585f, 7.521f)
            }
            path(
                stroke = SolidColor(Color(0xFF2A8E51)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(12.941f, 7.103f)
                curveTo(12.941f, 7.103f, 13.277f, 6.686f, 13.748f, 7.039f)
                lineTo(13.908f, 7.103f)
                curveTo(13.908f, 7.103f, 14.068f, 6.631f, 14.841f, 7.103f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(13.869f, 8.018f)
                curveTo(13.869f, 8.018f, 13.894f, 7.499f, 13.976f, 7.356f)
            }
            path(
                stroke = SolidColor(Color(0xFF964C36)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.549f, 9.157f)
                curveTo(14.549f, 9.157f, 14.24f, 9.012f, 14.148f, 9.157f)
                curveTo(14.055f, 9.302f, 12.941f, 10.638f, 12.941f, 10.638f)
            }
            path(
                fill = SolidColor(Color(0xFFFFF203)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.482f, 9.298f)
                lineTo(14.173f, 9.78f)
                curveTo(14.173f, 9.78f, 14.49f, 9.554f, 14.332f, 9.426f)
                curveTo(14.173f, 9.298f, 13.74f, 9.072f, 13.74f, 9.072f)
                lineTo(13.482f, 9.298f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A651)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.458f, 9.322f)
                curveTo(13.458f, 9.322f, 13.298f, 9.49f, 13.298f, 9.618f)
                curveTo(13.298f, 9.746f, 13.149f, 10.089f, 13.149f, 10.089f)
                curveTo(13.149f, 10.089f, 13.566f, 10.345f, 13.652f, 10.182f)
                curveTo(13.739f, 10.019f, 14.3f, 10.116f, 14.201f, 9.867f)
                curveTo(14.102f, 9.618f, 13.458f, 9.322f, 13.458f, 9.322f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.528f, 5.591f)
                curveTo(10.528f, 5.591f, 10.897f, 5.402f, 11.079f, 5.591f)
                curveTo(11.262f, 5.78f, 11.411f, 5.575f, 11.411f, 5.461f)
                curveTo(11.411f, 5.347f, 11.701f, 4.956f, 11.701f, 5.273f)
                curveTo(11.701f, 5.591f, 11.611f, 5.771f, 11.866f, 5.771f)
                curveTo(12.12f, 5.771f, 13.267f, 5.332f, 13.542f, 5.461f)
                curveTo(13.817f, 5.591f, 14.028f, 5.559f, 13.958f, 5.373f)
                curveTo(13.888f, 5.186f, 13.708f, 5.07f, 13.362f, 5.172f)
                curveTo(13.016f, 5.273f, 13.098f, 5.373f, 12.799f, 5.373f)
                curveTo(12.5f, 5.373f, 12.167f, 5.273f, 12.167f, 5.273f)
                curveTo(12.167f, 5.273f, 12.26f, 5.106f, 12.602f, 5.225f)
                curveTo(12.943f, 5.344f, 13.414f, 5.078f, 13.542f, 5.078f)
                curveTo(13.67f, 5.078f, 14.023f, 5.07f, 14.057f, 5.172f)
                curveTo(14.092f, 5.273f, 14.305f, 5.367f, 14.143f, 5.461f)
                curveTo(13.981f, 5.556f, 13.713f, 5.615f, 13.897f, 5.737f)
                curveTo(14.081f, 5.858f, 14.505f, 5.835f, 14.525f, 5.961f)
                curveTo(14.545f, 6.087f, 14.746f, 6.276f, 14.665f, 6.276f)
                curveTo(14.585f, 6.276f, 14.439f, 6.454f, 14.304f, 6.4f)
                curveTo(14.169f, 6.346f, 14.153f, 6.298f, 14.283f, 6.254f)
                curveTo(14.413f, 6.21f, 14.411f, 6.026f, 14.304f, 6.026f)
                curveTo(14.197f, 6.026f, 14.249f, 6.09f, 14.005f, 6.026f)
                curveTo(13.761f, 5.961f, 13.438f, 5.889f, 13.458f, 6.026f)
                curveTo(13.477f, 6.162f, 13.636f, 6.372f, 13.343f, 6.4f)
                curveTo(13.05f, 6.428f, 12.913f, 6.54f, 12.856f, 6.449f)
                curveTo(12.799f, 6.359f, 12.595f, 6.239f, 12.755f, 6.2f)
                curveTo(12.915f, 6.162f, 13.069f, 6.331f, 13.126f, 6.304f)
                curveTo(13.184f, 6.276f, 13.315f, 6.261f, 13.205f, 6.143f)
                curveTo(13.096f, 6.026f, 12.915f, 5.957f, 13.083f, 5.869f)
                curveTo(13.25f, 5.781f, 13.118f, 5.779f, 12.799f, 5.961f)
                curveTo(12.479f, 6.143f, 12.302f, 6.298f, 12.022f, 6.276f)
                curveTo(11.741f, 6.254f, 11.637f, 6.284f, 11.546f, 6.254f)
                curveTo(11.456f, 6.225f, 11.018f, 6.58f, 10.891f, 6.49f)
                curveTo(10.765f, 6.4f, 10.357f, 6.365f, 10.431f, 6.254f)
                curveTo(10.504f, 6.143f, 10.602f, 6.086f, 10.712f, 6.143f)
                curveTo(10.822f, 6.2f, 10.931f, 6.257f, 11.005f, 6.2f)
                curveTo(11.079f, 6.143f, 11.293f, 5.947f, 11.239f, 5.908f)
                curveTo(11.186f, 5.869f, 11.238f, 5.737f, 10.933f, 5.737f)
                curveTo(10.628f, 5.737f, 10.521f, 5.884f, 10.449f, 5.791f)
                curveTo(10.377f, 5.699f, 10.528f, 5.591f, 10.528f, 5.591f)
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
            imageVector = FlagIcons.Small.Fiji,
            contentDescription = "Fiji Flag"
        )
    }
}
