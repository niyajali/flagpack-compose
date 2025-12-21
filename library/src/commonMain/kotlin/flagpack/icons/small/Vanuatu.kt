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
 * Vanuatu Flag (16x12dp)
 *
 * - ISO Alpha-2: VU
 * - ISO Alpha-3: VUT
 * - ISO Numeric: 548
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Vanuatu: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vanuatu:VU:VUT:548:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1f)
                lineTo(8.335f, 6f)
                lineTo(0f, 13f)
                verticalLineTo(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1.677f)
                lineTo(8.704f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(8.585f)
                lineTo(0f, 13.406f)
                verticalLineTo(11.17f)
                lineTo(7f, 6f)
                lineTo(0f, 0.767f)
                verticalLineTo(-1.677f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-1f, -4.677f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-18f)
                close()
                moveTo(0f, -1.677f)
                lineTo(8.704f, 5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(8.585f)
                lineTo(0f, 13.406f)
                verticalLineTo(11.17f)
                lineTo(7f, 6f)
                lineTo(0f, 0.767f)
                verticalLineTo(-1.677f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(8.704f, 5f)
                lineTo(8.095f, 5.793f)
                lineTo(8.365f, 6f)
                horizontalLineTo(8.704f)
                verticalLineTo(5f)
                close()
                moveTo(0f, -1.677f)
                lineTo(0.609f, -2.471f)
                lineTo(-1f, -3.705f)
                verticalLineTo(-1.677f)
                horizontalLineTo(0f)
                close()
                moveTo(16f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                close()
                moveTo(16f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
                moveTo(8.585f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(8.253f)
                lineTo(7.987f, 6.199f)
                lineTo(8.585f, 7f)
                close()
                moveTo(0f, 13.406f)
                horizontalLineTo(-1f)
                verticalLineTo(15.4f)
                lineTo(0.598f, 14.207f)
                lineTo(0f, 13.406f)
                close()
                moveTo(0f, 11.17f)
                lineTo(-0.594f, 10.366f)
                lineTo(-1f, 10.665f)
                verticalLineTo(11.17f)
                horizontalLineTo(0f)
                close()
                moveTo(7f, 6f)
                lineTo(7.594f, 6.804f)
                lineTo(8.677f, 6.005f)
                lineTo(7.599f, 5.199f)
                lineTo(7f, 6f)
                close()
                moveTo(0f, 0.767f)
                horizontalLineTo(-1f)
                verticalLineTo(1.268f)
                lineTo(-0.599f, 1.568f)
                lineTo(0f, 0.767f)
                close()
                moveTo(9.313f, 4.207f)
                lineTo(0.609f, -2.471f)
                lineTo(-0.609f, -0.884f)
                lineTo(8.095f, 5.793f)
                lineTo(9.313f, 4.207f)
                close()
                moveTo(16f, 4f)
                horizontalLineTo(8.704f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                close()
                moveTo(17f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                close()
                moveTo(8.585f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(8.585f)
                verticalLineTo(8f)
                close()
                moveTo(0.598f, 14.207f)
                lineTo(9.183f, 7.801f)
                lineTo(7.987f, 6.199f)
                lineTo(-0.598f, 12.604f)
                lineTo(0.598f, 14.207f)
                close()
                moveTo(-1f, 11.17f)
                verticalLineTo(13.406f)
                horizontalLineTo(1f)
                verticalLineTo(11.17f)
                horizontalLineTo(-1f)
                close()
                moveTo(6.406f, 5.196f)
                lineTo(-0.594f, 10.366f)
                lineTo(0.594f, 11.974f)
                lineTo(7.594f, 6.804f)
                lineTo(6.406f, 5.196f)
                close()
                moveTo(-0.599f, 1.568f)
                lineTo(6.401f, 6.801f)
                lineTo(7.599f, 5.199f)
                lineTo(0.599f, -0.034f)
                lineTo(-0.599f, 1.568f)
                close()
                moveTo(-1f, -1.677f)
                verticalLineTo(0.767f)
                horizontalLineTo(1f)
                verticalLineTo(-1.677f)
                horizontalLineTo(-1f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(2.437f, 8.384f)
            lineTo(2.438f, 7.594f)
            curveTo(3.142f, 7.438f, 3.608f, 7.236f, 3.836f, 6.993f)
            curveTo(4.395f, 6.304f, 4.023f, 4.69f, 2.874f, 4.7f)
            curveTo(2.305f, 4.7f, 1.717f, 4.972f, 1.717f, 5.61f)
            curveTo(1.717f, 6.403f, 1.88f, 6.742f, 2.438f, 6.742f)
            curveTo(2.992f, 6.742f, 3.196f, 6.771f, 3.561f, 6.273f)
            lineTo(3.957f, 6.396f)
            curveTo(3.566f, 6.929f, 3.038f, 7.351f, 2.437f, 7.351f)
            curveTo(1.446f, 7.351f, 0.907f, 6.604f, 0.907f, 5.74f)
            curveTo(0.907f, 4.673f, 1.773f, 3.926f, 2.817f, 3.926f)
            curveTo(3.596f, 3.926f, 4.828f, 4.88f, 4.828f, 5.74f)
            curveTo(4.828f, 6.599f, 4.828f, 6.993f, 4.152f, 7.594f)
            curveTo(3.88f, 7.836f, 3.206f, 8.268f, 2.437f, 8.384f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.496f, 4.94f)
            curveTo(2.458f, 4.93f, 2.418f, 4.953f, 2.408f, 4.991f)
            lineTo(2.381f, 5.094f)
            curveTo(2.38f, 5.092f, 2.378f, 5.091f, 2.377f, 5.089f)
            curveTo(2.353f, 5.058f, 2.308f, 5.052f, 2.277f, 5.076f)
            curveTo(2.246f, 5.1f, 2.24f, 5.145f, 2.264f, 5.176f)
            curveTo(2.28f, 5.198f, 2.297f, 5.219f, 2.313f, 5.24f)
            lineTo(2.231f, 5.316f)
            curveTo(2.202f, 5.342f, 2.2f, 5.388f, 2.227f, 5.417f)
            curveTo(2.253f, 5.446f, 2.299f, 5.447f, 2.328f, 5.421f)
            lineTo(2.4f, 5.353f)
            curveTo(2.444f, 5.41f, 2.485f, 5.465f, 2.525f, 5.517f)
            lineTo(2.388f, 5.591f)
            curveTo(2.353f, 5.61f, 2.34f, 5.653f, 2.359f, 5.688f)
            curveTo(2.378f, 5.722f, 2.421f, 5.735f, 2.456f, 5.717f)
            lineTo(2.612f, 5.633f)
            curveTo(2.65f, 5.683f, 2.685f, 5.73f, 2.719f, 5.776f)
            lineTo(2.531f, 5.877f)
            curveTo(2.496f, 5.895f, 2.483f, 5.939f, 2.502f, 5.973f)
            curveTo(2.521f, 6.008f, 2.564f, 6.021f, 2.599f, 6.003f)
            lineTo(2.804f, 5.892f)
            curveTo(2.859f, 5.967f, 2.907f, 6.034f, 2.948f, 6.092f)
            lineTo(2.817f, 6.162f)
            curveTo(2.782f, 6.181f, 2.769f, 6.224f, 2.788f, 6.259f)
            curveTo(2.806f, 6.294f, 2.85f, 6.307f, 2.884f, 6.288f)
            lineTo(3.03f, 6.21f)
            curveTo(3.09f, 6.3f, 3.121f, 6.354f, 3.121f, 6.369f)
            curveTo(3.121f, 6.408f, 3.153f, 6.44f, 3.193f, 6.44f)
            curveTo(3.232f, 6.44f, 3.264f, 6.408f, 3.264f, 6.369f)
            curveTo(3.264f, 6.332f, 3.227f, 6.256f, 3.148f, 6.134f)
            curveTo(3.149f, 6.132f, 3.15f, 6.13f, 3.151f, 6.128f)
            lineTo(3.257f, 5.896f)
            curveTo(3.273f, 5.86f, 3.257f, 5.817f, 3.221f, 5.801f)
            curveTo(3.185f, 5.785f, 3.143f, 5.801f, 3.127f, 5.837f)
            lineTo(3.055f, 5.996f)
            curveTo(3.009f, 5.931f, 2.957f, 5.857f, 2.896f, 5.775f)
            lineTo(2.971f, 5.61f)
            curveTo(2.987f, 5.574f, 2.972f, 5.532f, 2.936f, 5.515f)
            curveTo(2.9f, 5.499f, 2.857f, 5.515f, 2.841f, 5.551f)
            lineTo(2.799f, 5.643f)
            lineTo(2.727f, 5.547f)
            lineTo(2.828f, 5.324f)
            curveTo(2.845f, 5.288f, 2.829f, 5.246f, 2.793f, 5.23f)
            curveTo(2.757f, 5.213f, 2.714f, 5.229f, 2.698f, 5.265f)
            lineTo(2.629f, 5.417f)
            curveTo(2.585f, 5.36f, 2.539f, 5.3f, 2.491f, 5.237f)
            lineTo(2.547f, 5.027f)
            curveTo(2.557f, 4.989f, 2.534f, 4.95f, 2.496f, 4.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.976f, 4.94f)
            curveTo(3.014f, 4.93f, 3.053f, 4.953f, 3.063f, 4.991f)
            lineTo(3.091f, 5.094f)
            curveTo(3.092f, 5.092f, 3.093f, 5.091f, 3.095f, 5.089f)
            curveTo(3.119f, 5.058f, 3.164f, 5.052f, 3.195f, 5.076f)
            curveTo(3.226f, 5.1f, 3.232f, 5.145f, 3.208f, 5.176f)
            curveTo(3.191f, 5.198f, 3.175f, 5.219f, 3.159f, 5.24f)
            lineTo(3.241f, 5.316f)
            curveTo(3.27f, 5.342f, 3.272f, 5.388f, 3.245f, 5.417f)
            curveTo(3.218f, 5.446f, 3.173f, 5.447f, 3.144f, 5.421f)
            lineTo(3.072f, 5.353f)
            curveTo(3.028f, 5.41f, 2.986f, 5.465f, 2.947f, 5.517f)
            lineTo(3.084f, 5.591f)
            curveTo(3.118f, 5.61f, 3.131f, 5.653f, 3.113f, 5.688f)
            curveTo(3.094f, 5.722f, 3.051f, 5.735f, 3.016f, 5.717f)
            lineTo(2.86f, 5.633f)
            curveTo(2.822f, 5.683f, 2.787f, 5.73f, 2.753f, 5.776f)
            lineTo(2.941f, 5.877f)
            curveTo(2.976f, 5.895f, 2.989f, 5.939f, 2.97f, 5.973f)
            curveTo(2.951f, 6.008f, 2.908f, 6.021f, 2.873f, 6.003f)
            lineTo(2.667f, 5.892f)
            curveTo(2.613f, 5.967f, 2.565f, 6.034f, 2.524f, 6.092f)
            lineTo(2.655f, 6.162f)
            curveTo(2.69f, 6.181f, 2.703f, 6.224f, 2.684f, 6.259f)
            curveTo(2.666f, 6.294f, 2.622f, 6.307f, 2.588f, 6.288f)
            lineTo(2.442f, 6.21f)
            curveTo(2.382f, 6.3f, 2.35f, 6.354f, 2.35f, 6.369f)
            curveTo(2.35f, 6.408f, 2.319f, 6.44f, 2.279f, 6.44f)
            curveTo(2.24f, 6.44f, 2.208f, 6.408f, 2.208f, 6.369f)
            curveTo(2.208f, 6.332f, 2.245f, 6.256f, 2.324f, 6.134f)
            curveTo(2.323f, 6.132f, 2.322f, 6.13f, 2.321f, 6.128f)
            lineTo(2.215f, 5.896f)
            curveTo(2.199f, 5.86f, 2.215f, 5.817f, 2.25f, 5.801f)
            curveTo(2.286f, 5.785f, 2.329f, 5.801f, 2.345f, 5.837f)
            lineTo(2.417f, 5.996f)
            curveTo(2.462f, 5.931f, 2.515f, 5.857f, 2.576f, 5.775f)
            lineTo(2.501f, 5.61f)
            curveTo(2.484f, 5.574f, 2.5f, 5.532f, 2.536f, 5.515f)
            curveTo(2.572f, 5.499f, 2.614f, 5.515f, 2.631f, 5.551f)
            lineTo(2.673f, 5.643f)
            lineTo(2.745f, 5.547f)
            lineTo(2.644f, 5.324f)
            curveTo(2.627f, 5.288f, 2.643f, 5.246f, 2.679f, 5.23f)
            curveTo(2.715f, 5.213f, 2.757f, 5.229f, 2.774f, 5.265f)
            lineTo(2.843f, 5.417f)
            curveTo(2.886f, 5.36f, 2.932f, 5.3f, 2.981f, 5.237f)
            lineTo(2.925f, 5.027f)
            curveTo(2.915f, 4.989f, 2.938f, 4.95f, 2.976f, 4.94f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VanuatuPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Vanuatu,
            contentDescription = "Vanuatu Flag"
        )
    }
}
