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
 * Portugal Flag (16x12dp)
 *
 * - ISO Alpha-2: PT
 * - ISO Alpha-3: PRT
 * - ISO Numeric: 620
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Portugal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Portugal:PT:PRT:620:Small",
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
                fill = SolidColor(Color(0xFFEF0000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.952f, 9.904f)
                curveTo(3.822f, 9.904f, 2.095f, 8.156f, 2.095f, 6f)
                curveTo(2.095f, 3.844f, 3.822f, 2.096f, 5.952f, 2.096f)
                curveTo(8.083f, 2.096f, 9.809f, 3.844f, 9.809f, 6f)
                curveTo(9.809f, 8.156f, 8.083f, 9.904f, 5.952f, 9.904f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.714f, 2f)
                horizontalLineTo(6.214f)
                verticalLineTo(3.349f)
                horizontalLineTo(5.714f)
                verticalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.714f, 8.747f)
                horizontalLineTo(6.214f)
                verticalLineTo(10f)
                horizontalLineTo(5.714f)
                verticalLineTo(8.747f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(2.157f, 6.202f)
                lineTo(2.017f, 5.843f)
                curveTo(3.56f, 5.227f, 4.724f, 4.83f, 5.514f, 4.651f)
                curveTo(6.673f, 4.389f, 7.947f, 4.194f, 9.335f, 4.068f)
                lineTo(9.369f, 4.452f)
                curveTo(7.997f, 4.577f, 6.74f, 4.769f, 5.598f, 5.027f)
                curveTo(4.831f, 5.201f, 3.683f, 5.593f, 2.157f, 6.202f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(9.57f, 3.832f)
                lineTo(9.457f, 4.2f)
                curveTo(8.291f, 3.832f, 7.341f, 3.674f, 6.611f, 3.723f)
                lineTo(6.586f, 3.338f)
                curveTo(7.37f, 3.285f, 8.364f, 3.451f, 9.57f, 3.832f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(9.974f, 5.89f)
                lineTo(9.758f, 6.208f)
                curveTo(9.164f, 5.795f, 8.432f, 5.588f, 7.557f, 5.588f)
                verticalLineTo(5.202f)
                curveTo(8.505f, 5.202f, 9.313f, 5.431f, 9.974f, 5.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(9.651f, 6.005f)
                lineTo(9.75f, 6.378f)
                curveTo(8.468f, 6.725f, 7.265f, 6.922f, 6.14f, 6.968f)
                curveTo(5.008f, 7.015f, 3.688f, 6.817f, 2.18f, 6.377f)
                lineTo(2.285f, 6.006f)
                curveTo(3.757f, 6.436f, 5.037f, 6.628f, 6.125f, 6.583f)
                curveTo(7.22f, 6.538f, 8.396f, 6.345f, 9.651f, 6.005f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(9.506f, 7.818f)
                lineTo(8.904f, 8.435f)
                curveTo(7.759f, 7.292f, 6.752f, 6.475f, 5.887f, 5.983f)
                curveTo(5.008f, 5.484f, 3.862f, 4.976f, 2.45f, 4.464f)
                lineTo(2.739f, 3.647f)
                curveTo(4.193f, 4.175f, 5.382f, 4.701f, 6.307f, 5.227f)
                curveTo(7.247f, 5.761f, 8.311f, 6.625f, 9.506f, 7.818f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(2.729f, 8.168f)
                lineTo(2.501f, 7.859f)
                curveTo(2.533f, 7.835f, 2.59f, 7.795f, 2.668f, 7.744f)
                curveTo(2.797f, 7.66f, 2.941f, 7.576f, 3.095f, 7.498f)
                curveTo(3.52f, 7.282f, 3.947f, 7.147f, 4.353f, 7.135f)
                curveTo(4.373f, 7.134f, 4.393f, 7.134f, 4.413f, 7.134f)
                verticalLineTo(7.52f)
                curveTo(4.397f, 7.52f, 4.381f, 7.52f, 4.365f, 7.52f)
                curveTo(4.022f, 7.531f, 3.646f, 7.65f, 3.266f, 7.842f)
                curveTo(3.124f, 7.914f, 2.992f, 7.991f, 2.874f, 8.068f)
                curveTo(2.833f, 8.095f, 2.796f, 8.12f, 2.765f, 8.142f)
                curveTo(2.747f, 8.155f, 2.735f, 8.163f, 2.729f, 8.168f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(2.906f, 8.301f)
                lineTo(3.002f, 7.928f)
                curveTo(4.272f, 8.263f, 5.251f, 8.429f, 5.934f, 8.429f)
                curveTo(6.615f, 8.429f, 7.629f, 8.233f, 8.968f, 7.838f)
                lineTo(9.074f, 8.208f)
                curveTo(7.703f, 8.612f, 6.659f, 8.815f, 5.934f, 8.815f)
                curveTo(5.213f, 8.815f, 4.205f, 8.643f, 2.906f, 8.301f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(2.411f, 4.847f)
                lineTo(3.015f, 4.231f)
                lineTo(3.898f, 5.118f)
                lineTo(3.295f, 5.734f)
                lineTo(2.411f, 4.847f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(7.418f, 7.924f)
                lineTo(7.867f, 7.185f)
                lineTo(9.269f, 8.057f)
                lineTo(8.82f, 8.796f)
                lineTo(7.418f, 7.924f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.095f, 6f)
            curveTo(2.095f, 8.156f, 3.822f, 9.904f, 5.952f, 9.904f)
            curveTo(8.083f, 9.904f, 9.809f, 8.156f, 9.809f, 6f)
            curveTo(9.809f, 3.844f, 8.083f, 2.096f, 5.952f, 2.096f)
            curveTo(3.822f, 2.096f, 2.095f, 3.844f, 2.095f, 6f)
            close()
            moveTo(9.333f, 6.048f)
            curveTo(9.333f, 7.911f, 7.841f, 9.422f, 6f, 9.422f)
            curveTo(4.159f, 9.422f, 2.667f, 7.911f, 2.667f, 6.048f)
            curveTo(2.667f, 4.185f, 4.159f, 2.675f, 6f, 2.675f)
            curveTo(7.841f, 2.675f, 9.333f, 4.185f, 9.333f, 6.048f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(3.828f, 3.593f)
            verticalLineTo(6.723f)
            curveTo(4.034f, 7.962f, 4.729f, 8.582f, 5.911f, 8.582f)
            curveTo(7.093f, 8.582f, 7.788f, 7.962f, 7.994f, 6.723f)
            verticalLineTo(3.593f)
            horizontalLineTo(3.828f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC51918))) {
            moveTo(3.043f, 3f)
            horizontalLineTo(8.579f)
            verticalLineTo(6.711f)
            lineTo(8.575f, 6.737f)
            curveTo(8.307f, 8.22f, 7.359f, 9f, 5.811f, 9f)
            curveTo(4.263f, 9f, 3.315f, 8.22f, 3.047f, 6.737f)
            lineTo(3.043f, 6.711f)
            verticalLineTo(3f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.524f, 3.953f)
            horizontalLineTo(3.624f)
            verticalLineTo(4.853f)
            horizontalLineTo(4.524f)
            verticalLineTo(3.953f)
            close()
            moveTo(8.024f, 3.953f)
            horizontalLineTo(7.124f)
            verticalLineTo(4.853f)
            horizontalLineTo(8.024f)
            verticalLineTo(3.953f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.624f, 5.953f)
            horizontalLineTo(4.524f)
            verticalLineTo(6.853f)
            horizontalLineTo(3.624f)
            verticalLineTo(5.953f)
            close()
            moveTo(7.174f, 5.967f)
            horizontalLineTo(8.074f)
            verticalLineTo(6.867f)
            horizontalLineTo(7.174f)
            verticalLineTo(5.967f)
            close()
            moveTo(7.187f, 7.425f)
            horizontalLineTo(6.287f)
            verticalLineTo(8.325f)
            horizontalLineTo(7.187f)
            verticalLineTo(7.425f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.324f, 7.421f)
            horizontalLineTo(5.224f)
            verticalLineTo(8.321f)
            horizontalLineTo(4.324f)
            verticalLineTo(7.421f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(4.426f, 4.355f)
            horizontalLineTo(7.396f)
            verticalLineTo(6.576f)
            curveTo(7.396f, 6.576f, 7.175f, 7.722f, 5.911f, 7.722f)
            curveTo(4.646f, 7.722f, 4.426f, 6.576f, 4.426f, 6.576f)
            verticalLineTo(4.355f)
            close()
        }
        path(fill = SolidColor(Color(0xFF013399))) {
            moveTo(5.619f, 4.602f)
            horizontalLineTo(6.279f)
            verticalLineTo(5.083f)
            curveTo(6.279f, 5.083f, 6.23f, 5.331f, 5.949f, 5.331f)
            curveTo(5.668f, 5.331f, 5.619f, 5.083f, 5.619f, 5.083f)
            verticalLineTo(4.602f)
            close()
        }
        path(fill = SolidColor(Color(0xFF013399))) {
            moveTo(5.619f, 5.663f)
            horizontalLineTo(6.279f)
            verticalLineTo(6.143f)
            curveTo(6.279f, 6.143f, 6.23f, 6.392f, 5.949f, 6.392f)
            curveTo(5.668f, 6.392f, 5.619f, 6.143f, 5.619f, 6.143f)
            verticalLineTo(5.663f)
            close()
        }
        path(fill = SolidColor(Color(0xFF013399))) {
            moveTo(6.476f, 5.663f)
            horizontalLineTo(7.136f)
            verticalLineTo(6.143f)
            curveTo(7.136f, 6.143f, 7.087f, 6.392f, 6.806f, 6.392f)
            curveTo(6.525f, 6.392f, 6.476f, 6.143f, 6.476f, 6.143f)
            verticalLineTo(5.663f)
            close()
        }
        path(fill = SolidColor(Color(0xFF013399))) {
            moveTo(4.762f, 5.663f)
            horizontalLineTo(5.422f)
            verticalLineTo(6.143f)
            curveTo(5.422f, 6.143f, 5.373f, 6.392f, 5.092f, 6.392f)
            curveTo(4.811f, 6.392f, 4.762f, 6.143f, 4.762f, 6.143f)
            verticalLineTo(5.663f)
            close()
        }
        path(fill = SolidColor(Color(0xFF013399))) {
            moveTo(5.619f, 6.723f)
            horizontalLineTo(6.279f)
            verticalLineTo(7.204f)
            curveTo(6.279f, 7.204f, 6.23f, 7.452f, 5.949f, 7.452f)
            curveTo(5.668f, 7.452f, 5.619f, 7.204f, 5.619f, 7.204f)
            verticalLineTo(6.723f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortugalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Portugal,
            contentDescription = "Portugal Flag"
        )
    }
}
