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
 * Spain Flag (16x12dp)
 *
 * - ISO Alpha-2: ES
 * - ISO Alpha-3: ESP
 * - ISO Numeric: 724
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Spain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Spain:ES:ESP:724:Small",
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
                fill = SolidColor(Color(0xFFFFB400)),
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
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(2.504f, 5.136f)
                horizontalLineToRelative(0.56f)
                verticalLineToRelative(2.912f)
                horizontalLineToRelative(-0.56f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.288f, 4.632f)
                horizontalLineTo(2.28f)
                verticalLineTo(4.912f)
                horizontalLineTo(2.448f)
                verticalLineTo(5.136f)
                horizontalLineTo(3.12f)
                verticalLineTo(4.912f)
                horizontalLineTo(3.288f)
                verticalLineTo(4.632f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.12f, 8.216f)
                horizontalLineTo(3.288f)
                verticalLineTo(8.496f)
                horizontalLineTo(2.28f)
                verticalLineTo(8.216f)
                horizontalLineTo(2.448f)
                verticalLineTo(7.992f)
                horizontalLineTo(3.12f)
                verticalLineTo(8.216f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAD1619)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.784f, 4.688f)
                curveTo(2.906f, 4.688f, 2.918f, 4.642f, 2.99f, 4.574f)
                curveTo(3.046f, 4.52f, 3.176f, 4.454f, 3.176f, 4.38f)
                curveTo(3.176f, 4.21f, 3.001f, 4.072f, 2.784f, 4.072f)
                curveTo(2.568f, 4.072f, 2.392f, 4.21f, 2.392f, 4.38f)
                curveTo(2.392f, 4.463f, 2.482f, 4.518f, 2.549f, 4.574f)
                curveTo(2.621f, 4.632f, 2.673f, 4.688f, 2.784f, 4.688f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.28f, 8.496f)
                horizontalLineTo(3.288f)
                verticalLineTo(8.944f)
                curveTo(3.288f, 8.944f, 3.162f, 8.888f, 3.036f, 8.888f)
                curveTo(2.91f, 8.888f, 2.784f, 8.944f, 2.784f, 8.944f)
                curveTo(2.784f, 8.944f, 2.658f, 8.888f, 2.532f, 8.888f)
                curveTo(2.406f, 8.888f, 2.28f, 8.944f, 2.28f, 8.944f)
                verticalLineTo(8.496f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2.28f, 8.496f)
                horizontalLineTo(3.288f)
                verticalLineTo(8.944f)
                curveTo(3.288f, 8.944f, 3.162f, 8.888f, 3.036f, 8.888f)
                curveTo(2.91f, 8.888f, 2.784f, 8.944f, 2.784f, 8.944f)
                curveTo(2.784f, 8.944f, 2.658f, 8.888f, 2.532f, 8.888f)
                curveTo(2.406f, 8.888f, 2.28f, 8.944f, 2.28f, 8.944f)
                verticalLineTo(8.496f)
                close()
            }
        ) {
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(7.992f, 5.136f)
            horizontalLineToRelative(0.56f)
            verticalLineToRelative(2.912f)
            horizontalLineToRelative(-0.56f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.776f, 4.632f)
            horizontalLineTo(7.768f)
            verticalLineTo(4.912f)
            horizontalLineTo(7.936f)
            verticalLineTo(5.136f)
            horizontalLineTo(8.608f)
            verticalLineTo(4.912f)
            horizontalLineTo(8.776f)
            verticalLineTo(4.632f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.608f, 8.216f)
            horizontalLineTo(8.776f)
            verticalLineTo(8.496f)
            horizontalLineTo(7.768f)
            verticalLineTo(8.216f)
            horizontalLineTo(7.936f)
            verticalLineTo(7.992f)
            horizontalLineTo(8.608f)
            verticalLineTo(8.216f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.272f, 4.688f)
            curveTo(8.394f, 4.688f, 8.406f, 4.642f, 8.478f, 4.574f)
            curveTo(8.534f, 4.52f, 8.664f, 4.454f, 8.664f, 4.38f)
            curveTo(8.664f, 4.21f, 8.488f, 4.072f, 8.272f, 4.072f)
            curveTo(8.056f, 4.072f, 7.88f, 4.21f, 7.88f, 4.38f)
            curveTo(7.88f, 4.463f, 7.97f, 4.518f, 8.037f, 4.574f)
            curveTo(8.109f, 4.632f, 8.161f, 4.688f, 8.272f, 4.688f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.768f, 8.496f)
            horizontalLineTo(8.776f)
            verticalLineTo(8.944f)
            curveTo(8.776f, 8.944f, 8.65f, 8.888f, 8.524f, 8.888f)
            curveTo(8.398f, 8.888f, 8.272f, 8.944f, 8.272f, 8.944f)
            curveTo(8.272f, 8.944f, 8.146f, 8.888f, 8.02f, 8.888f)
            curveTo(7.894f, 8.888f, 7.768f, 8.944f, 7.768f, 8.944f)
            verticalLineTo(8.496f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(7.768f, 8.496f)
                horizontalLineTo(8.776f)
                verticalLineTo(8.944f)
                curveTo(8.776f, 8.944f, 8.65f, 8.888f, 8.524f, 8.888f)
                curveTo(8.398f, 8.888f, 8.272f, 8.944f, 8.272f, 8.944f)
                curveTo(8.272f, 8.944f, 8.146f, 8.888f, 8.02f, 8.888f)
                curveTo(7.894f, 8.888f, 7.768f, 8.944f, 7.768f, 8.944f)
                verticalLineTo(8.496f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.494f, 7.84f)
            curveTo(2.595f, 7.718f, 2.651f, 7.606f, 2.651f, 7.488f)
            curveTo(2.651f, 7.413f, 2.629f, 7.349f, 2.59f, 7.296f)
            lineTo(2.597f, 7.293f)
            curveTo(2.596f, 7.294f, 2.708f, 7.245f, 2.746f, 7.226f)
            curveTo(2.819f, 7.192f, 2.882f, 7.155f, 2.944f, 7.11f)
            curveTo(2.983f, 7.082f, 3.036f, 7.05f, 3.117f, 7.007f)
            lineTo(3.214f, 6.956f)
            curveTo(3.253f, 6.935f, 3.282f, 6.919f, 3.309f, 6.903f)
            curveTo(3.394f, 6.854f, 3.45f, 6.813f, 3.492f, 6.759f)
            curveTo(3.594f, 6.631f, 3.573f, 6.457f, 3.431f, 6.36f)
            curveTo(3.361f, 6.313f, 3.267f, 6.286f, 3.13f, 6.264f)
            lineTo(2.933f, 6.234f)
            curveTo(2.867f, 6.223f, 2.809f, 6.214f, 2.756f, 6.205f)
            curveTo(3.101f, 6.147f, 3.592f, 6.168f, 3.808f, 6.28f)
            lineTo(4.014f, 5.882f)
            curveTo(3.573f, 5.654f, 2.569f, 5.678f, 2.194f, 5.936f)
            curveTo(1.919f, 6.125f, 1.956f, 6.412f, 2.242f, 6.535f)
            curveTo(2.362f, 6.587f, 2.518f, 6.621f, 2.806f, 6.667f)
            curveTo(2.758f, 6.695f, 2.718f, 6.721f, 2.68f, 6.748f)
            curveTo(2.643f, 6.776f, 2.602f, 6.799f, 2.553f, 6.823f)
            curveTo(2.529f, 6.834f, 2.46f, 6.864f, 2.428f, 6.878f)
            lineTo(2.428f, 6.878f)
            lineTo(2.428f, 6.878f)
            lineTo(2.411f, 6.886f)
            curveTo(2.178f, 6.992f, 2.065f, 7.138f, 2.099f, 7.403f)
            lineTo(2.117f, 7.546f)
            lineTo(2.15f, 7.556f)
            lineTo(2.494f, 7.84f)
            close()
            moveTo(2.206f, 7.47f)
            lineTo(2.205f, 7.472f)
            lineTo(2.206f, 7.47f)
            lineTo(2.206f, 7.47f)
            close()
            moveTo(8.353f, 7.488f)
            curveTo(8.353f, 7.606f, 8.409f, 7.718f, 8.51f, 7.84f)
            lineTo(8.854f, 7.556f)
            lineTo(8.887f, 7.546f)
            lineTo(8.905f, 7.403f)
            curveTo(8.939f, 7.138f, 8.826f, 6.992f, 8.593f, 6.886f)
            lineTo(8.577f, 6.878f)
            curveTo(8.545f, 6.864f, 8.475f, 6.834f, 8.452f, 6.823f)
            curveTo(8.402f, 6.799f, 8.362f, 6.776f, 8.324f, 6.748f)
            curveTo(8.287f, 6.721f, 8.247f, 6.695f, 8.198f, 6.667f)
            curveTo(8.487f, 6.621f, 8.643f, 6.587f, 8.762f, 6.535f)
            curveTo(9.048f, 6.412f, 9.085f, 6.125f, 8.81f, 5.936f)
            curveTo(8.435f, 5.678f, 7.431f, 5.654f, 6.99f, 5.882f)
            lineTo(7.196f, 6.28f)
            curveTo(7.412f, 6.168f, 7.904f, 6.147f, 8.248f, 6.205f)
            curveTo(8.196f, 6.214f, 8.137f, 6.223f, 8.071f, 6.234f)
            lineTo(7.875f, 6.264f)
            curveTo(7.737f, 6.286f, 7.643f, 6.313f, 7.574f, 6.36f)
            curveTo(7.432f, 6.457f, 7.411f, 6.631f, 7.512f, 6.759f)
            curveTo(7.555f, 6.813f, 7.611f, 6.854f, 7.695f, 6.903f)
            curveTo(7.722f, 6.919f, 7.752f, 6.935f, 7.791f, 6.956f)
            lineTo(7.887f, 7.007f)
            curveTo(7.968f, 7.05f, 8.021f, 7.082f, 8.06f, 7.11f)
            curveTo(8.122f, 7.155f, 8.186f, 7.192f, 8.258f, 7.226f)
            curveTo(8.297f, 7.245f, 8.408f, 7.294f, 8.408f, 7.293f)
            lineTo(8.414f, 7.296f)
            curveTo(8.375f, 7.349f, 8.353f, 7.413f, 8.353f, 7.488f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(2.962f, 6.2f)
            lineTo(3.127f, 6.234f)
            verticalLineTo(6.481f)
            curveTo(2.951f, 6.621f, 2.504f, 6.858f, 2.504f, 6.858f)
            verticalLineTo(6.2f)
            horizontalLineTo(2.962f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(8.157f, 6.2f)
            lineTo(7.992f, 6.234f)
            verticalLineTo(6.481f)
            curveTo(8.168f, 6.621f, 8.615f, 6.858f, 8.615f, 6.858f)
            verticalLineTo(6.2f)
            horizontalLineTo(8.157f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.388f, 3.603f)
            verticalLineTo(3.521f)
            curveTo(7.1f, 3.314f, 6.798f, 3.211f, 6.483f, 3.211f)
            curveTo(6.181f, 3.077f, 5.875f, 3.025f, 5.565f, 3.055f)
            curveTo(5.565f, 3.054f, 5.566f, 3.054f, 5.566f, 3.054f)
            curveTo(5.1f, 3.008f, 4.631f, 3.211f, 4.631f, 3.211f)
            curveTo(4.158f, 3.211f, 3.726f, 3.521f, 3.726f, 3.521f)
            verticalLineTo(3.603f)
            lineTo(4.291f, 4.17f)
            curveTo(4.291f, 4.17f, 4.45f, 4.716f, 5.563f, 4.588f)
            curveTo(5.563f, 4.589f, 5.563f, 4.589f, 5.563f, 4.589f)
            curveTo(5.563f, 4.589f, 6.3f, 4.569f, 6.352f, 4.552f)
            curveTo(6.373f, 4.545f, 6.394f, 4.539f, 6.416f, 4.533f)
            curveTo(6.56f, 4.49f, 6.725f, 4.442f, 6.823f, 4.17f)
            lineTo(7.388f, 3.603f)
            close()
            moveTo(5.563f, 3.085f)
            curveTo(5.561f, 3.112f, 5.557f, 3.157f, 5.552f, 3.214f)
            curveTo(5.558f, 3.173f, 5.562f, 3.13f, 5.563f, 3.085f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.76f, 3.699f)
            lineTo(3.798f, 3.658f)
            lineTo(4.311f, 4.141f)
            curveTo(4.408f, 4.115f, 4.937f, 3.98f, 5.527f, 3.973f)
            verticalLineTo(3.973f)
            lineTo(5.55f, 3.973f)
            lineTo(5.572f, 3.973f)
            verticalLineTo(3.973f)
            curveTo(6.226f, 3.981f, 6.804f, 4.145f, 6.804f, 4.145f)
            curveTo(6.804f, 4.145f, 6.798f, 4.198f, 6.783f, 4.261f)
            curveTo(6.799f, 4.228f, 6.818f, 4.192f, 6.839f, 4.152f)
            lineTo(6.845f, 4.145f)
            lineTo(7.362f, 3.658f)
            lineTo(7.4f, 3.699f)
            lineTo(6.886f, 4.182f)
            curveTo(6.812f, 4.32f, 6.774f, 4.412f, 6.774f, 4.449f)
            curveTo(6.774f, 4.507f, 6.624f, 4.541f, 6.33f, 4.577f)
            curveTo(6.101f, 4.604f, 5.83f, 4.623f, 5.608f, 4.625f)
            verticalLineTo(4.626f)
            lineTo(5.58f, 4.626f)
            lineTo(5.552f, 4.626f)
            verticalLineTo(4.625f)
            curveTo(5.33f, 4.623f, 5.059f, 4.604f, 4.83f, 4.577f)
            curveTo(4.536f, 4.541f, 4.386f, 4.507f, 4.386f, 4.449f)
            curveTo(4.386f, 4.442f, 4.385f, 4.433f, 4.382f, 4.422f)
            curveTo(4.353f, 4.385f, 4.332f, 4.323f, 4.318f, 4.268f)
            curveTo(4.305f, 4.242f, 4.29f, 4.213f, 4.274f, 4.182f)
            lineTo(3.76f, 3.699f)
            close()
            moveTo(6.627f, 4.451f)
            curveTo(6.666f, 4.469f, 6.697f, 4.451f, 6.722f, 4.415f)
            curveTo(6.72f, 4.425f, 6.719f, 4.434f, 6.718f, 4.442f)
            curveTo(6.715f, 4.444f, 6.71f, 4.447f, 6.703f, 4.449f)
            curveTo(6.685f, 4.457f, 6.656f, 4.465f, 6.62f, 4.474f)
            curveTo(6.548f, 4.49f, 6.445f, 4.506f, 6.324f, 4.521f)
            curveTo(6.086f, 4.55f, 5.804f, 4.568f, 5.58f, 4.57f)
            curveTo(5.356f, 4.568f, 5.074f, 4.55f, 4.836f, 4.521f)
            curveTo(4.715f, 4.506f, 4.612f, 4.49f, 4.54f, 4.474f)
            curveTo(4.509f, 4.467f, 4.485f, 4.46f, 4.467f, 4.453f)
            lineTo(4.473f, 4.451f)
            curveTo(4.595f, 4.393f, 5.404f, 4.34f, 5.55f, 4.33f)
            curveTo(5.695f, 4.34f, 6.504f, 4.393f, 6.627f, 4.451f)
            close()
            moveTo(6.781f, 4.44f)
            lineTo(6.78f, 4.441f)
            lineTo(6.78f, 4.441f)
            lineTo(6.781f, 4.44f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.556f, 2.674f)
            curveTo(5.649f, 2.674f, 5.724f, 2.598f, 5.724f, 2.506f)
            curveTo(5.724f, 2.413f, 5.649f, 2.338f, 5.556f, 2.338f)
            curveTo(5.463f, 2.338f, 5.388f, 2.413f, 5.388f, 2.506f)
            curveTo(5.388f, 2.598f, 5.463f, 2.674f, 5.556f, 2.674f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.493f, 2.038f)
            horizontalLineTo(5.61f)
            verticalLineTo(2.112f)
            horizontalLineTo(5.686f)
            verticalLineTo(2.229f)
            horizontalLineTo(5.61f)
            verticalLineTo(2.462f)
            horizontalLineTo(5.686f)
            verticalLineTo(2.579f)
            horizontalLineTo(5.416f)
            verticalLineTo(2.462f)
            horizontalLineTo(5.493f)
            verticalLineTo(2.229f)
            horizontalLineTo(5.416f)
            verticalLineTo(2.112f)
            horizontalLineTo(5.493f)
            verticalLineTo(2.038f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(5.472f, 2.672f)
            horizontalLineToRelative(0.224f)
            verticalLineToRelative(0.728f)
            horizontalLineToRelative(-0.224f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(3.854f, 3.648f)
            lineTo(3.546f, 3.637f)
            curveTo(3.691f, 2.798f, 4.406f, 2.387f, 5.548f, 2.387f)
            curveTo(6.692f, 2.387f, 7.404f, 2.8f, 7.539f, 3.642f)
            lineTo(7.123f, 3.685f)
            curveTo(7.057f, 3.276f, 6.371f, 2.905f, 5.554f, 2.905f)
            curveTo(4.736f, 2.905f, 3.925f, 3.236f, 3.854f, 3.648f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE1E5E8)),
            fillAlpha = 0.3f,
            strokeAlpha = 0.3f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.736f, 4.632f)
            horizontalLineTo(7.376f)
            verticalLineTo(7.902f)
            curveTo(7.376f, 7.902f, 7.106f, 9f, 5.556f, 9f)
            curveTo(4.006f, 9f, 3.736f, 7.873f, 3.736f, 7.873f)
            verticalLineTo(4.632f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(3.736f, 4.632f)
                horizontalLineTo(7.376f)
                verticalLineTo(7.902f)
                curveTo(7.376f, 7.902f, 7.106f, 9f, 5.556f, 9f)
                curveTo(4.006f, 9f, 3.736f, 7.873f, 3.736f, 7.873f)
                verticalLineTo(4.632f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFFC034))) {
                moveTo(3.736f, 6.648f)
                horizontalLineToRelative(1.848f)
                verticalLineToRelative(2.184f)
                horizontalLineToRelative(-1.848f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(3.736f, 4.576f)
                horizontalLineToRelative(1.848f)
                verticalLineToRelative(2.128f)
                horizontalLineToRelative(-1.848f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(5.528f, 6.592f)
                horizontalLineToRelative(1.848f)
                verticalLineToRelative(2.128f)
                horizontalLineToRelative(-1.848f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(5.528f, 4.632f)
                horizontalLineToRelative(1.96f)
                verticalLineToRelative(2.072f)
                horizontalLineToRelative(-1.96f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.741f, 8.721f)
                curveTo(6.741f, 8.721f, 5.555f, 8.815f, 5.555f, 8.05f)
                curveTo(5.555f, 8.05f, 5.544f, 8.721f, 4.305f, 8.721f)
                verticalLineTo(9.325f)
                horizontalLineTo(6.741f)
                verticalLineTo(8.721f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                stroke = SolidColor(Color(0xFFAD1619)),
                strokeLineWidth = 0.583333f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.556f, 7.096f)
                curveTo(5.788f, 7.096f, 5.976f, 6.895f, 5.976f, 6.648f)
                curveTo(5.976f, 6.401f, 5.788f, 6.2f, 5.556f, 6.2f)
                curveTo(5.324f, 6.2f, 5.136f, 6.401f, 5.136f, 6.648f)
                curveTo(5.136f, 6.895f, 5.324f, 7.096f, 5.556f, 7.096f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.5f, 6f)
            curveTo(4.776f, 6f, 5f, 5.776f, 5f, 5.5f)
            curveTo(5f, 5.224f, 4.776f, 5f, 4.5f, 5f)
            curveTo(4.224f, 5f, 4f, 5.224f, 4f, 5.5f)
            curveTo(4f, 5.776f, 4.224f, 6f, 4.5f, 6f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC37C9C)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.5f, 6f)
            curveTo(6.776f, 6f, 7f, 5.776f, 7f, 5.5f)
            curveTo(7f, 5.224f, 6.776f, 5f, 6.5f, 5f)
            curveTo(6.224f, 5f, 6f, 5.224f, 6f, 5.5f)
            curveTo(6f, 5.776f, 6.224f, 6f, 6.5f, 6f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFC034)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.5f, 8f)
            curveTo(6.776f, 8f, 7f, 7.776f, 7f, 7.5f)
            curveTo(7f, 7.224f, 6.776f, 7f, 6.5f, 7f)
            curveTo(6.224f, 7f, 6f, 7.224f, 6f, 7.5f)
            curveTo(6f, 7.776f, 6.224f, 8f, 6.5f, 8f)
            close()
        }
        path(fill = SolidColor(Color(0xFFAD1619))) {
            moveTo(4.5f, 8f)
            curveTo(4.776f, 8f, 5f, 7.776f, 5f, 7.5f)
            curveTo(5f, 7.224f, 4.776f, 7f, 4.5f, 7f)
            curveTo(4.224f, 7f, 4f, 7.224f, 4f, 7.5f)
            curveTo(4f, 7.776f, 4.224f, 8f, 4.5f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SpainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Spain,
            contentDescription = "Spain Flag"
        )
    }
}
