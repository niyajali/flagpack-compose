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
 * Montenegro Flag (16x12dp)
 *
 * - ISO Alpha-2: ME
 * - ISO Alpha-3: MNE
 * - ISO Numeric: 499
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Montenegro: ImageVector by lazy {
    ImageVector.Builder(
        name = "Montenegro:ME:MNE:499:Small",
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
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.115f, 7.876f)
                curveTo(10.319f, 7.876f, 10.485f, 7.706f, 10.485f, 7.497f)
                curveTo(10.485f, 7.288f, 10.319f, 7.119f, 10.115f, 7.119f)
                curveTo(9.911f, 7.119f, 9.746f, 7.288f, 9.746f, 7.497f)
                curveTo(9.746f, 7.706f, 9.911f, 7.876f, 10.115f, 7.876f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.314f, 6.166f)
                curveTo(4.345f, 5.04f, 5.733f, 3.087f, 5.733f, 3.087f)
                curveTo(5.733f, 3.087f, 5.941f, 4.253f, 6.709f, 5.039f)
                curveTo(6.709f, 5.094f, 6.637f, 5.177f, 6.563f, 5.26f)
                curveTo(6.512f, 5.318f, 6.46f, 5.377f, 6.432f, 5.427f)
                curveTo(6.365f, 5.55f, 6.597f, 5.62f, 6.709f, 5.62f)
                curveTo(6.76f, 5.62f, 6.787f, 5.693f, 6.813f, 5.759f)
                curveTo(6.844f, 5.84f, 6.87f, 5.911f, 6.93f, 5.821f)
                curveTo(7.038f, 5.66f, 6.822f, 5.304f, 6.822f, 5.304f)
                lineTo(7.164f, 4.944f)
                lineTo(7.279f, 4.711f)
                horizontalLineTo(7.164f)
                verticalLineTo(4.471f)
                lineTo(7.083f, 4.537f)
                curveTo(7.083f, 4.537f, 6.994f, 4.323f, 6.822f, 4.323f)
                curveTo(6.65f, 4.323f, 6.597f, 4.225f, 6.597f, 4.225f)
                horizontalLineTo(6.822f)
                curveTo(6.935f, 4.225f, 6.804f, 4.075f, 6.709f, 3.997f)
                curveTo(6.667f, 3.963f, 6.602f, 3.975f, 6.544f, 3.985f)
                curveTo(6.472f, 3.999f, 6.41f, 4.01f, 6.41f, 3.931f)
                curveTo(6.41f, 3.843f, 6.478f, 3.831f, 6.557f, 3.818f)
                curveTo(6.609f, 3.809f, 6.665f, 3.8f, 6.709f, 3.768f)
                curveTo(6.783f, 3.715f, 6.882f, 3.731f, 6.989f, 3.749f)
                curveTo(7.046f, 3.758f, 7.105f, 3.768f, 7.164f, 3.768f)
                horizontalLineTo(7.442f)
                curveTo(7.543f, 3.768f, 7.279f, 3.931f, 7.279f, 3.931f)
                lineTo(7.442f, 4.075f)
                lineTo(7.684f, 4.323f)
                lineTo(7.563f, 4.395f)
                lineTo(7.813f, 4.637f)
                curveTo(7.813f, 4.637f, 7.728f, 4.775f, 7.813f, 4.775f)
                curveTo(7.848f, 4.775f, 7.871f, 4.804f, 7.886f, 4.837f)
                curveTo(7.901f, 4.804f, 7.924f, 4.775f, 7.959f, 4.775f)
                curveTo(8.044f, 4.775f, 7.959f, 4.637f, 7.959f, 4.637f)
                lineTo(8.209f, 4.395f)
                lineTo(8.088f, 4.323f)
                lineTo(8.33f, 4.075f)
                lineTo(8.493f, 3.931f)
                curveTo(8.493f, 3.931f, 8.23f, 3.768f, 8.33f, 3.768f)
                horizontalLineTo(8.609f)
                curveTo(8.668f, 3.768f, 8.727f, 3.758f, 8.783f, 3.749f)
                curveTo(8.891f, 3.731f, 8.99f, 3.715f, 9.063f, 3.768f)
                curveTo(9.108f, 3.8f, 9.164f, 3.809f, 9.215f, 3.818f)
                curveTo(9.294f, 3.831f, 9.362f, 3.843f, 9.362f, 3.931f)
                curveTo(9.362f, 4.01f, 9.3f, 3.999f, 9.228f, 3.985f)
                curveTo(9.17f, 3.975f, 9.106f, 3.963f, 9.063f, 3.997f)
                curveTo(8.969f, 4.075f, 8.838f, 4.225f, 8.95f, 4.225f)
                horizontalLineTo(9.176f)
                curveTo(9.176f, 4.225f, 9.122f, 4.323f, 8.95f, 4.323f)
                curveTo(8.779f, 4.323f, 8.69f, 4.537f, 8.69f, 4.537f)
                lineTo(8.609f, 4.471f)
                verticalLineTo(4.711f)
                horizontalLineTo(8.493f)
                lineTo(8.609f, 4.944f)
                lineTo(8.95f, 5.304f)
                curveTo(8.95f, 5.304f, 8.735f, 5.66f, 8.843f, 5.821f)
                curveTo(8.902f, 5.911f, 8.929f, 5.84f, 8.96f, 5.759f)
                curveTo(8.985f, 5.693f, 9.013f, 5.62f, 9.063f, 5.62f)
                curveTo(9.176f, 5.62f, 9.408f, 5.55f, 9.34f, 5.427f)
                curveTo(9.312f, 5.377f, 9.261f, 5.318f, 9.209f, 5.26f)
                curveTo(9.136f, 5.177f, 9.063f, 5.094f, 9.063f, 5.039f)
                curveTo(9.831f, 4.253f, 10.039f, 3.087f, 10.039f, 3.087f)
                curveTo(10.039f, 3.087f, 11.427f, 5.04f, 10.459f, 6.166f)
                curveTo(9.49f, 7.292f, 8.779f, 6.952f, 8.779f, 6.952f)
                curveTo(8.779f, 6.952f, 9.637f, 7.751f, 9.732f, 7.751f)
                curveTo(9.745f, 7.751f, 9.715f, 7.677f, 9.685f, 7.604f)
                curveTo(9.656f, 7.532f, 9.627f, 7.46f, 9.64f, 7.461f)
                curveTo(9.668f, 7.462f, 9.722f, 7.528f, 9.777f, 7.593f)
                curveTo(9.82f, 7.646f, 9.864f, 7.698f, 9.894f, 7.719f)
                curveTo(9.913f, 7.732f, 9.989f, 7.705f, 10.06f, 7.681f)
                curveTo(10.12f, 7.66f, 10.175f, 7.641f, 10.189f, 7.648f)
                curveTo(10.249f, 7.678f, 10.233f, 7.739f, 10.219f, 7.796f)
                curveTo(10.215f, 7.811f, 10.212f, 7.826f, 10.209f, 7.84f)
                curveTo(10.207f, 7.852f, 10.283f, 7.803f, 10.363f, 7.751f)
                curveTo(10.448f, 7.697f, 10.536f, 7.639f, 10.543f, 7.648f)
                curveTo(10.544f, 7.65f, 10.546f, 7.652f, 10.547f, 7.653f)
                curveTo(10.576f, 7.688f, 10.622f, 7.743f, 10.282f, 8.005f)
                curveTo(10.282f, 8.056f, 10.284f, 8.097f, 10.285f, 8.13f)
                curveTo(10.29f, 8.237f, 10.291f, 8.265f, 10.218f, 8.265f)
                curveTo(10.186f, 8.265f, 10.141f, 8.281f, 10.088f, 8.3f)
                curveTo(9.954f, 8.347f, 9.772f, 8.412f, 9.64f, 8.265f)
                curveTo(9.457f, 8.061f, 8.33f, 7.241f, 8.33f, 7.241f)
                lineTo(8.209f, 7.308f)
                curveTo(8.209f, 7.308f, 8.622f, 8.447f, 8.843f, 8.455f)
                curveTo(8.952f, 8.459f, 8.786f, 8.565f, 8.565f, 8.707f)
                curveTo(8.342f, 8.849f, 8.063f, 9.027f, 7.959f, 9.171f)
                curveTo(7.928f, 9.213f, 7.904f, 9.148f, 7.886f, 9.007f)
                curveTo(7.868f, 9.148f, 7.844f, 9.213f, 7.813f, 9.171f)
                curveTo(7.71f, 9.027f, 7.431f, 8.849f, 7.207f, 8.707f)
                curveTo(6.987f, 8.565f, 6.82f, 8.459f, 6.93f, 8.455f)
                curveTo(7.151f, 8.447f, 7.563f, 7.308f, 7.563f, 7.308f)
                lineTo(7.442f, 7.241f)
                lineTo(6.994f, 7.756f)
                curveTo(6.994f, 7.756f, 6.315f, 8.061f, 6.132f, 8.265f)
                curveTo(6f, 8.412f, 5.819f, 8.347f, 5.684f, 8.3f)
                curveTo(5.632f, 8.281f, 5.586f, 8.265f, 5.554f, 8.265f)
                curveTo(5.439f, 8.265f, 5.4f, 8.104f, 5.554f, 7.906f)
                curveTo(5.644f, 7.79f, 5.783f, 7.774f, 5.915f, 7.759f)
                curveTo(6.007f, 7.749f, 6.097f, 7.739f, 6.164f, 7.694f)
                curveTo(6.328f, 7.587f, 6.597f, 7.308f, 6.597f, 7.308f)
                lineTo(6.994f, 6.952f)
                curveTo(6.994f, 6.952f, 6.282f, 7.292f, 5.314f, 6.166f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.217f, 8.515f)
                lineTo(5.779f, 7.748f)
                curveTo(5.779f, 7.748f, 5.207f, 6.429f, 5.207f, 6.269f)
                curveTo(5.207f, 6.109f, 4.977f, 5.634f, 4.977f, 5.772f)
                curveTo(4.977f, 5.91f, 4.958f, 7.014f, 4.958f, 7.014f)
                lineTo(5.942f, 8.443f)
                verticalLineTo(8.615f)
                horizontalLineTo(6.072f)
                lineTo(6.217f, 8.515f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(9.721f, 7.482f)
                lineTo(9.788f, 7.262f)
                lineTo(10.601f, 7.506f)
                lineTo(10.534f, 7.727f)
                lineTo(9.721f, 7.482f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(10.154f, 7.08f)
                lineTo(10.374f, 7.152f)
                lineTo(10.159f, 7.841f)
                lineTo(9.939f, 7.769f)
                lineTo(10.154f, 7.08f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.069f, 2.646f)
                curveTo(8.037f, 2.634f, 8.003f, 2.622f, 7.967f, 2.611f)
                lineTo(7.964f, 2.62f)
                curveTo(7.933f, 2.615f, 7.903f, 2.611f, 7.877f, 2.611f)
                curveTo(7.868f, 2.611f, 7.858f, 2.612f, 7.848f, 2.612f)
                lineTo(7.847f, 2.611f)
                curveTo(7.845f, 2.612f, 7.843f, 2.612f, 7.841f, 2.613f)
                curveTo(7.784f, 2.618f, 7.716f, 2.636f, 7.647f, 2.658f)
                curveTo(7.283f, 2.699f, 7.095f, 2.86f, 7.115f, 3.135f)
                curveTo(7.126f, 3.277f, 7.174f, 3.378f, 7.253f, 3.435f)
                verticalLineTo(3.52f)
                curveTo(7.253f, 3.52f, 7.669f, 3.79f, 7.877f, 3.79f)
                curveTo(8.085f, 3.79f, 8.501f, 3.52f, 8.501f, 3.52f)
                verticalLineTo(3.467f)
                curveTo(8.615f, 3.422f, 8.684f, 3.309f, 8.697f, 3.135f)
                curveTo(8.718f, 2.851f, 8.518f, 2.69f, 8.132f, 2.655f)
                lineTo(8.131f, 2.666f)
                curveTo(8.11f, 2.659f, 8.089f, 2.652f, 8.069f, 2.646f)
                close()
                moveTo(8.501f, 3.301f)
                verticalLineTo(2.933f)
                curveTo(8.546f, 2.984f, 8.564f, 3.048f, 8.559f, 3.125f)
                curveTo(8.553f, 3.206f, 8.534f, 3.264f, 8.501f, 3.301f)
                close()
                moveTo(7.253f, 3.119f)
                verticalLineTo(3.078f)
                curveTo(7.252f, 3.091f, 7.252f, 3.105f, 7.253f, 3.119f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.977f, 5.18f)
                curveTo(6.977f, 5.18f, 7.546f, 5.072f, 7.854f, 5.072f)
                curveTo(8.13f, 5.072f, 8.731f, 5.18f, 8.731f, 5.18f)
                curveTo(8.731f, 5.86f, 8.922f, 6.276f, 8.731f, 6.741f)
                curveTo(8.539f, 7.205f, 8.072f, 6.982f, 7.86f, 7.426f)
                curveTo(7.59f, 7.005f, 7.224f, 7.237f, 6.977f, 6.636f)
                curveTo(6.73f, 6.036f, 7.127f, 5.76f, 6.977f, 5.18f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6.977f, 5.18f)
                curveTo(6.977f, 5.18f, 7.546f, 5.072f, 7.854f, 5.072f)
                curveTo(8.13f, 5.072f, 8.731f, 5.18f, 8.731f, 5.18f)
                curveTo(8.731f, 5.86f, 8.922f, 6.276f, 8.731f, 6.741f)
                curveTo(8.539f, 7.205f, 8.072f, 6.982f, 7.86f, 7.426f)
                curveTo(7.59f, 7.005f, 7.224f, 7.237f, 6.977f, 6.636f)
                curveTo(6.73f, 6.036f, 7.127f, 5.76f, 6.977f, 5.18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(6.977f, 6.599f)
                horizontalLineToRelative(1.754f)
                verticalLineToRelative(0.851f)
                horizontalLineToRelative(-1.754f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF6C540)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.9f, 6.4f)
            curveTo(8.176f, 6.4f, 8.4f, 6.176f, 8.4f, 5.9f)
            curveTo(8.4f, 5.624f, 8.176f, 5.4f, 7.9f, 5.4f)
            curveTo(7.624f, 5.4f, 7.4f, 5.624f, 7.4f, 5.9f)
            curveTo(7.4f, 6.176f, 7.624f, 6.4f, 7.9f, 6.4f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MontenegroPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Montenegro,
            contentDescription = "Montenegro Flag"
        )
    }
}
