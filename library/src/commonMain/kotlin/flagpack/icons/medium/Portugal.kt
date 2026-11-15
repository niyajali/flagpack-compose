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
 * Portugal Flag (20x15dp)
 *
 * - ISO Alpha-2: PT
 * - ISO Alpha-3: PRT
 * - ISO Numeric: 620
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Portugal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Portugal:PT:PRT:620:Medium",
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
                fill = SolidColor(Color(0xFFEF0000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.44f, 12.38f)
                curveTo(4.778f, 12.38f, 2.619f, 10.195f, 2.619f, 7.5f)
                curveTo(2.619f, 4.805f, 4.778f, 2.62f, 7.44f, 2.62f)
                curveTo(10.103f, 2.62f, 12.262f, 4.805f, 12.262f, 7.5f)
                curveTo(12.262f, 10.195f, 10.103f, 12.38f, 7.44f, 12.38f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.143f, 2.5f)
                horizontalLineTo(7.768f)
                verticalLineTo(4.187f)
                horizontalLineTo(7.143f)
                verticalLineTo(2.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.143f, 10.934f)
                horizontalLineTo(7.768f)
                verticalLineTo(12.5f)
                horizontalLineTo(7.143f)
                verticalLineTo(10.934f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(2.697f, 7.752f)
                lineTo(2.522f, 7.304f)
                curveTo(4.45f, 6.534f, 5.905f, 6.038f, 6.893f, 5.814f)
                curveTo(8.342f, 5.486f, 9.934f, 5.243f, 11.669f, 5.085f)
                lineTo(11.711f, 5.565f)
                curveTo(9.996f, 5.721f, 8.425f, 5.961f, 6.997f, 6.284f)
                curveTo(6.039f, 6.501f, 4.604f, 6.991f, 2.697f, 7.752f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(11.963f, 4.79f)
                lineTo(11.821f, 5.25f)
                curveTo(10.364f, 4.79f, 9.177f, 4.592f, 8.264f, 4.653f)
                lineTo(8.233f, 4.173f)
                curveTo(9.212f, 4.107f, 10.454f, 4.314f, 11.963f, 4.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(12.467f, 7.362f)
                lineTo(12.198f, 7.76f)
                curveTo(11.455f, 7.244f, 10.54f, 6.985f, 9.446f, 6.985f)
                verticalLineTo(6.503f)
                curveTo(10.632f, 6.503f, 11.641f, 6.789f, 12.467f, 7.362f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(12.064f, 7.507f)
                lineTo(12.187f, 7.972f)
                curveTo(10.585f, 8.406f, 9.082f, 8.652f, 7.676f, 8.71f)
                curveTo(6.26f, 8.768f, 4.61f, 8.521f, 2.724f, 7.971f)
                lineTo(2.856f, 7.508f)
                curveTo(4.696f, 8.045f, 6.297f, 8.285f, 7.656f, 8.229f)
                curveTo(9.025f, 8.172f, 10.495f, 7.932f, 12.064f, 7.507f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(11.882f, 9.772f)
                lineTo(11.13f, 10.544f)
                curveTo(9.699f, 9.115f, 8.44f, 8.093f, 7.359f, 7.479f)
                curveTo(6.26f, 6.855f, 4.827f, 6.221f, 3.062f, 5.579f)
                lineTo(3.424f, 4.559f)
                curveTo(5.241f, 5.219f, 6.727f, 5.876f, 7.884f, 6.534f)
                curveTo(9.059f, 7.201f, 10.389f, 8.281f, 11.882f, 9.772f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(3.411f, 10.21f)
                lineTo(3.127f, 9.823f)
                curveTo(3.166f, 9.793f, 3.237f, 9.743f, 3.335f, 9.68f)
                curveTo(3.497f, 9.575f, 3.676f, 9.47f, 3.869f, 9.372f)
                curveTo(4.4f, 9.103f, 4.933f, 8.934f, 5.442f, 8.919f)
                curveTo(5.467f, 8.918f, 5.492f, 8.918f, 5.516f, 8.918f)
                verticalLineTo(9.4f)
                curveTo(5.496f, 9.4f, 5.476f, 9.4f, 5.456f, 9.4f)
                curveTo(5.028f, 9.413f, 4.557f, 9.562f, 4.082f, 9.803f)
                curveTo(3.905f, 9.893f, 3.74f, 9.989f, 3.592f, 10.085f)
                curveTo(3.541f, 10.119f, 3.495f, 10.15f, 3.456f, 10.177f)
                curveTo(3.433f, 10.193f, 3.418f, 10.204f, 3.411f, 10.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(3.633f, 10.377f)
                lineTo(3.753f, 9.91f)
                curveTo(5.34f, 10.328f, 6.564f, 10.537f, 7.418f, 10.537f)
                curveTo(8.269f, 10.537f, 9.536f, 10.291f, 11.21f, 9.798f)
                lineTo(11.343f, 10.26f)
                curveTo(9.629f, 10.765f, 8.324f, 11.019f, 7.418f, 11.019f)
                curveTo(6.516f, 11.019f, 5.256f, 10.804f, 3.633f, 10.377f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(3.014f, 6.059f)
                lineTo(3.768f, 5.289f)
                lineTo(4.873f, 6.398f)
                lineTo(4.119f, 7.168f)
                lineTo(3.014f, 6.059f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(9.272f, 9.905f)
                lineTo(9.834f, 8.981f)
                lineTo(11.586f, 10.071f)
                lineTo(11.025f, 10.995f)
                lineTo(9.272f, 9.905f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.619f, 7.5f)
            curveTo(2.619f, 10.195f, 4.778f, 12.38f, 7.44f, 12.38f)
            curveTo(10.103f, 12.38f, 12.262f, 10.195f, 12.262f, 7.5f)
            curveTo(12.262f, 4.805f, 10.103f, 2.62f, 7.44f, 2.62f)
            curveTo(4.778f, 2.62f, 2.619f, 4.805f, 2.619f, 7.5f)
            close()
            moveTo(11.667f, 7.56f)
            curveTo(11.667f, 9.889f, 9.801f, 11.777f, 7.5f, 11.777f)
            curveTo(5.199f, 11.777f, 3.333f, 9.889f, 3.333f, 7.56f)
            curveTo(3.333f, 5.231f, 5.199f, 3.343f, 7.5f, 3.343f)
            curveTo(9.801f, 3.343f, 11.667f, 5.231f, 11.667f, 7.56f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(4.785f, 4.491f)
            verticalLineTo(8.404f)
            curveTo(5.043f, 9.953f, 5.911f, 10.727f, 7.389f, 10.727f)
            curveTo(8.867f, 10.727f, 9.735f, 9.953f, 9.992f, 8.404f)
            verticalLineTo(4.491f)
            horizontalLineTo(4.785f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC51918))) {
            moveTo(4.428f, 4.129f)
            horizontalLineTo(10.349f)
            verticalLineTo(8.434f)
            lineTo(10.344f, 8.464f)
            curveTo(10.058f, 10.184f, 9.044f, 11.088f, 7.389f, 11.088f)
            curveTo(5.733f, 11.088f, 4.719f, 10.184f, 4.433f, 8.464f)
            lineTo(4.428f, 8.434f)
            verticalLineTo(4.129f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(5.783f, 5.444f)
            horizontalLineTo(8.995f)
            verticalLineTo(8.22f)
            curveTo(8.995f, 8.22f, 8.757f, 9.653f, 7.389f, 9.653f)
            curveTo(6.021f, 9.653f, 5.783f, 8.22f, 5.783f, 8.22f)
            verticalLineTo(5.444f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 4.428f)
            horizontalLineTo(5.452f)
            verticalLineTo(4.729f)
            horizontalLineTo(5f)
            verticalLineTo(4.428f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 4.548f)
            horizontalLineTo(5.595f)
            verticalLineTo(4.699f)
            horizontalLineTo(4.762f)
            verticalLineTo(4.548f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 4.669f)
            horizontalLineTo(5.214f)
            verticalLineTo(4.819f)
            horizontalLineTo(4.762f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.238f, 4.669f)
            horizontalLineTo(5.69f)
            verticalLineTo(4.819f)
            horizontalLineTo(5.238f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 5.03f)
            horizontalLineTo(5.063f)
            verticalLineTo(5.482f)
            horizontalLineTo(4.762f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.357f, 5.03f)
            horizontalLineTo(5.658f)
            verticalLineTo(5.482f)
            horizontalLineTo(5.357f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.119f, 5.03f)
            horizontalLineTo(5.27f)
            verticalLineTo(5.482f)
            horizontalLineTo(5.119f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 4.91f)
            horizontalLineTo(5.595f)
            verticalLineTo(5.06f)
            horizontalLineTo(4.762f)
            verticalLineTo(4.91f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 5.271f)
            horizontalLineTo(5.595f)
            verticalLineTo(5.422f)
            horizontalLineTo(4.762f)
            verticalLineTo(5.271f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.881f, 4.789f)
            horizontalLineTo(5.032f)
            verticalLineTo(4.94f)
            horizontalLineTo(4.881f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.357f, 4.789f)
            horizontalLineTo(5.508f)
            verticalLineTo(4.94f)
            horizontalLineTo(5.357f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.119f, 4.669f)
            horizontalLineTo(5.27f)
            verticalLineTo(4.97f)
            horizontalLineTo(5.119f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.262f, 4.428f)
            horizontalLineTo(7.714f)
            verticalLineTo(4.729f)
            horizontalLineTo(7.262f)
            verticalLineTo(4.428f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.024f, 4.548f)
            horizontalLineTo(7.857f)
            verticalLineTo(4.699f)
            horizontalLineTo(7.024f)
            verticalLineTo(4.548f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.024f, 4.669f)
            horizontalLineTo(7.476f)
            verticalLineTo(4.819f)
            horizontalLineTo(7.024f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.5f, 4.669f)
            horizontalLineTo(7.952f)
            verticalLineTo(4.819f)
            horizontalLineTo(7.5f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.024f, 5.03f)
            horizontalLineTo(7.325f)
            verticalLineTo(5.482f)
            horizontalLineTo(7.024f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 5.03f)
            horizontalLineTo(7.92f)
            verticalLineTo(5.482f)
            horizontalLineTo(7.619f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.381f, 5.03f)
            horizontalLineTo(7.532f)
            verticalLineTo(5.482f)
            horizontalLineTo(7.381f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.024f, 4.91f)
            horizontalLineTo(7.857f)
            verticalLineTo(5.06f)
            horizontalLineTo(7.024f)
            verticalLineTo(4.91f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.024f, 5.271f)
            horizontalLineTo(7.857f)
            verticalLineTo(5.422f)
            horizontalLineTo(7.024f)
            verticalLineTo(5.271f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.143f, 4.789f)
            horizontalLineTo(7.293f)
            verticalLineTo(4.94f)
            horizontalLineTo(7.143f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 4.789f)
            horizontalLineTo(7.77f)
            verticalLineTo(4.94f)
            horizontalLineTo(7.619f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.381f, 4.669f)
            horizontalLineTo(7.532f)
            verticalLineTo(4.97f)
            horizontalLineTo(7.381f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.405f, 4.428f)
            horizontalLineTo(9.857f)
            verticalLineTo(4.729f)
            horizontalLineTo(9.405f)
            verticalLineTo(4.428f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 4.548f)
            horizontalLineTo(10f)
            verticalLineTo(4.699f)
            horizontalLineTo(9.167f)
            verticalLineTo(4.548f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 4.669f)
            horizontalLineTo(9.618f)
            verticalLineTo(4.819f)
            horizontalLineTo(9.167f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.643f, 4.669f)
            horizontalLineTo(10.095f)
            verticalLineTo(4.819f)
            horizontalLineTo(9.643f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 5.03f)
            horizontalLineTo(9.468f)
            verticalLineTo(5.482f)
            horizontalLineTo(9.167f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.762f, 5.03f)
            horizontalLineTo(10.063f)
            verticalLineTo(5.482f)
            horizontalLineTo(9.762f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 5.03f)
            horizontalLineTo(9.674f)
            verticalLineTo(5.482f)
            horizontalLineTo(9.524f)
            verticalLineTo(5.03f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 4.91f)
            horizontalLineTo(10f)
            verticalLineTo(5.06f)
            horizontalLineTo(9.167f)
            verticalLineTo(4.91f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 5.271f)
            horizontalLineTo(10f)
            verticalLineTo(5.422f)
            horizontalLineTo(9.167f)
            verticalLineTo(5.271f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.286f, 4.789f)
            horizontalLineTo(9.436f)
            verticalLineTo(4.94f)
            horizontalLineTo(9.286f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.762f, 4.789f)
            horizontalLineTo(9.913f)
            verticalLineTo(4.94f)
            horizontalLineTo(9.762f)
            verticalLineTo(4.789f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 4.669f)
            horizontalLineTo(9.674f)
            verticalLineTo(4.97f)
            horizontalLineTo(9.524f)
            verticalLineTo(4.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.405f, 6.596f)
            horizontalLineTo(9.857f)
            verticalLineTo(6.898f)
            horizontalLineTo(9.405f)
            verticalLineTo(6.596f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 6.717f)
            horizontalLineTo(10f)
            verticalLineTo(6.867f)
            horizontalLineTo(9.167f)
            verticalLineTo(6.717f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 6.837f)
            horizontalLineTo(9.618f)
            verticalLineTo(6.988f)
            horizontalLineTo(9.167f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.643f, 6.837f)
            horizontalLineTo(10.095f)
            verticalLineTo(6.988f)
            horizontalLineTo(9.643f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 7.199f)
            horizontalLineTo(9.468f)
            verticalLineTo(7.651f)
            horizontalLineTo(9.167f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.762f, 7.199f)
            horizontalLineTo(10.063f)
            verticalLineTo(7.651f)
            horizontalLineTo(9.762f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 7.199f)
            horizontalLineTo(9.674f)
            verticalLineTo(7.651f)
            horizontalLineTo(9.524f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 7.078f)
            horizontalLineTo(10f)
            verticalLineTo(7.229f)
            horizontalLineTo(9.167f)
            verticalLineTo(7.078f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.167f, 7.44f)
            horizontalLineTo(10f)
            verticalLineTo(7.59f)
            horizontalLineTo(9.167f)
            verticalLineTo(7.44f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.286f, 6.958f)
            horizontalLineTo(9.436f)
            verticalLineTo(7.108f)
            horizontalLineTo(9.286f)
            verticalLineTo(6.958f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.762f, 6.958f)
            horizontalLineTo(9.913f)
            verticalLineTo(7.108f)
            horizontalLineTo(9.762f)
            verticalLineTo(6.958f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 6.837f)
            horizontalLineTo(9.674f)
            verticalLineTo(7.139f)
            horizontalLineTo(9.524f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 6.596f)
            horizontalLineTo(5.452f)
            verticalLineTo(6.898f)
            horizontalLineTo(5f)
            verticalLineTo(6.596f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 6.717f)
            horizontalLineTo(5.595f)
            verticalLineTo(6.867f)
            horizontalLineTo(4.762f)
            verticalLineTo(6.717f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 6.837f)
            horizontalLineTo(5.214f)
            verticalLineTo(6.988f)
            horizontalLineTo(4.762f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.238f, 6.837f)
            horizontalLineTo(5.69f)
            verticalLineTo(6.988f)
            horizontalLineTo(5.238f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 7.199f)
            horizontalLineTo(5.063f)
            verticalLineTo(7.651f)
            horizontalLineTo(4.762f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.357f, 7.199f)
            horizontalLineTo(5.658f)
            verticalLineTo(7.651f)
            horizontalLineTo(5.357f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.119f, 7.199f)
            horizontalLineTo(5.27f)
            verticalLineTo(7.651f)
            horizontalLineTo(5.119f)
            verticalLineTo(7.199f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 7.078f)
            horizontalLineTo(5.595f)
            verticalLineTo(7.229f)
            horizontalLineTo(4.762f)
            verticalLineTo(7.078f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.762f, 7.44f)
            horizontalLineTo(5.595f)
            verticalLineTo(7.59f)
            horizontalLineTo(4.762f)
            verticalLineTo(7.44f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.881f, 6.958f)
            horizontalLineTo(5.032f)
            verticalLineTo(7.108f)
            horizontalLineTo(4.881f)
            verticalLineTo(6.958f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.357f, 6.958f)
            horizontalLineTo(5.508f)
            verticalLineTo(7.108f)
            horizontalLineTo(5.357f)
            verticalLineTo(6.958f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.119f, 6.837f)
            horizontalLineTo(5.27f)
            verticalLineTo(7.139f)
            horizontalLineTo(5.119f)
            verticalLineTo(6.837f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.29f, 9.315f)
            lineTo(5.58f, 8.969f)
            lineTo(5.811f, 9.162f)
            lineTo(5.521f, 9.509f)
            lineTo(5.29f, 9.315f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.229f, 9.575f)
            lineTo(5.765f, 8.936f)
            lineTo(5.88f, 9.033f)
            lineTo(5.344f, 9.672f)
            lineTo(5.229f, 9.575f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.321f, 9.652f)
            lineTo(5.612f, 9.306f)
            lineTo(5.727f, 9.403f)
            lineTo(5.437f, 9.749f)
            lineTo(5.321f, 9.652f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.627f, 9.287f)
            lineTo(5.918f, 8.941f)
            lineTo(6.033f, 9.038f)
            lineTo(5.743f, 9.384f)
            lineTo(5.627f, 9.287f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.598f, 9.885f)
            lineTo(5.792f, 9.654f)
            lineTo(6.138f, 9.944f)
            lineTo(5.944f, 10.175f)
            lineTo(5.598f, 9.885f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.981f, 9.429f)
            lineTo(6.174f, 9.198f)
            lineTo(6.521f, 9.488f)
            lineTo(6.327f, 9.719f)
            lineTo(5.981f, 9.429f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.828f, 9.611f)
            lineTo(5.925f, 9.496f)
            lineTo(6.271f, 9.786f)
            lineTo(6.174f, 9.901f)
            lineTo(5.828f, 9.611f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.506f, 9.807f)
            lineTo(6.042f, 9.169f)
            lineTo(6.157f, 9.266f)
            lineTo(5.621f, 9.904f)
            lineTo(5.506f, 9.807f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.783f, 10.04f)
            lineTo(6.319f, 9.401f)
            lineTo(6.434f, 9.498f)
            lineTo(5.898f, 10.136f)
            lineTo(5.783f, 10.04f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.49f, 9.638f)
            lineTo(5.587f, 9.523f)
            lineTo(5.702f, 9.62f)
            lineTo(5.606f, 9.735f)
            lineTo(5.49f, 9.638f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.796f, 9.274f)
            lineTo(5.893f, 9.158f)
            lineTo(6.008f, 9.255f)
            lineTo(5.912f, 9.371f)
            lineTo(5.796f, 9.274f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.551f, 9.379f)
            lineTo(5.648f, 9.263f)
            lineTo(5.878f, 9.457f)
            lineTo(5.782f, 9.572f)
            lineTo(5.551f, 9.379f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.362f, 9.041f)
            lineTo(9.652f, 9.387f)
            lineTo(9.421f, 9.581f)
            lineTo(9.131f, 9.235f)
            lineTo(9.362f, 9.041f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.116f, 8.936f)
            lineTo(9.652f, 9.575f)
            lineTo(9.536f, 9.672f)
            lineTo(9.001f, 9.033f)
            lineTo(9.116f, 8.936f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.024f, 9.014f)
            lineTo(9.314f, 9.36f)
            lineTo(9.199f, 9.457f)
            lineTo(8.909f, 9.111f)
            lineTo(9.024f, 9.014f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.33f, 9.379f)
            lineTo(9.62f, 9.725f)
            lineTo(9.505f, 9.822f)
            lineTo(9.215f, 9.475f)
            lineTo(9.33f, 9.379f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.747f, 9.246f)
            lineTo(8.941f, 9.477f)
            lineTo(8.595f, 9.767f)
            lineTo(8.401f, 9.537f)
            lineTo(8.747f, 9.246f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.13f, 9.702f)
            lineTo(9.323f, 9.933f)
            lineTo(8.977f, 10.223f)
            lineTo(8.784f, 9.993f)
            lineTo(9.13f, 9.702f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.977f, 9.52f)
            lineTo(9.073f, 9.635f)
            lineTo(8.727f, 9.926f)
            lineTo(8.63f, 9.81f)
            lineTo(8.977f, 9.52f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.839f, 9.169f)
            lineTo(9.375f, 9.807f)
            lineTo(9.26f, 9.904f)
            lineTo(8.724f, 9.266f)
            lineTo(8.839f, 9.169f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.562f, 9.401f)
            lineTo(9.098f, 10.04f)
            lineTo(8.983f, 10.136f)
            lineTo(8.447f, 9.498f)
            lineTo(8.562f, 9.401f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.008f, 9.182f)
            lineTo(9.105f, 9.298f)
            lineTo(8.99f, 9.395f)
            lineTo(8.893f, 9.279f)
            lineTo(9.008f, 9.182f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.314f, 9.547f)
            lineTo(9.411f, 9.663f)
            lineTo(9.296f, 9.759f)
            lineTo(9.199f, 9.644f)
            lineTo(9.314f, 9.547f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.253f, 9.287f)
            lineTo(9.35f, 9.403f)
            lineTo(9.12f, 9.596f)
            lineTo(9.023f, 9.481f)
            lineTo(9.253f, 9.287f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.849f, 5.753f)
            horizontalLineTo(7.024f)
            verticalLineTo(6.354f)
            curveTo(7.024f, 6.354f, 7.085f, 6.664f, 7.436f, 6.664f)
            curveTo(7.788f, 6.664f, 7.849f, 6.354f, 7.849f, 6.354f)
            verticalLineTo(5.753f)
            close()
            moveTo(7.381f, 5.994f)
            curveTo(7.381f, 6.06f, 7.328f, 6.114f, 7.262f, 6.114f)
            curveTo(7.196f, 6.114f, 7.143f, 6.06f, 7.143f, 5.994f)
            curveTo(7.143f, 5.927f, 7.196f, 5.873f, 7.262f, 5.873f)
            curveTo(7.328f, 5.873f, 7.381f, 5.927f, 7.381f, 5.994f)
            close()
            moveTo(7.262f, 6.596f)
            curveTo(7.328f, 6.596f, 7.381f, 6.542f, 7.381f, 6.476f)
            curveTo(7.381f, 6.409f, 7.328f, 6.355f, 7.262f, 6.355f)
            curveTo(7.196f, 6.355f, 7.143f, 6.409f, 7.143f, 6.476f)
            curveTo(7.143f, 6.542f, 7.196f, 6.596f, 7.262f, 6.596f)
            close()
            moveTo(7.738f, 6.476f)
            curveTo(7.738f, 6.542f, 7.685f, 6.596f, 7.619f, 6.596f)
            curveTo(7.553f, 6.596f, 7.5f, 6.542f, 7.5f, 6.476f)
            curveTo(7.5f, 6.409f, 7.553f, 6.355f, 7.619f, 6.355f)
            curveTo(7.685f, 6.355f, 7.738f, 6.409f, 7.738f, 6.476f)
            close()
            moveTo(7.44f, 6.355f)
            curveTo(7.506f, 6.355f, 7.56f, 6.301f, 7.56f, 6.235f)
            curveTo(7.56f, 6.168f, 7.506f, 6.114f, 7.44f, 6.114f)
            curveTo(7.375f, 6.114f, 7.321f, 6.168f, 7.321f, 6.235f)
            curveTo(7.321f, 6.301f, 7.375f, 6.355f, 7.44f, 6.355f)
            close()
            moveTo(7.738f, 5.994f)
            curveTo(7.738f, 6.06f, 7.685f, 6.114f, 7.619f, 6.114f)
            curveTo(7.553f, 6.114f, 7.5f, 6.06f, 7.5f, 5.994f)
            curveTo(7.5f, 5.927f, 7.553f, 5.873f, 7.619f, 5.873f)
            curveTo(7.685f, 5.873f, 7.738f, 5.927f, 7.738f, 5.994f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.849f, 7.078f)
            horizontalLineTo(7.024f)
            verticalLineTo(7.679f)
            curveTo(7.024f, 7.679f, 7.085f, 7.99f, 7.436f, 7.99f)
            curveTo(7.788f, 7.99f, 7.849f, 7.679f, 7.849f, 7.679f)
            verticalLineTo(7.078f)
            close()
            moveTo(7.381f, 7.319f)
            curveTo(7.381f, 7.386f, 7.328f, 7.44f, 7.262f, 7.44f)
            curveTo(7.196f, 7.44f, 7.143f, 7.386f, 7.143f, 7.319f)
            curveTo(7.143f, 7.253f, 7.196f, 7.199f, 7.262f, 7.199f)
            curveTo(7.328f, 7.199f, 7.381f, 7.253f, 7.381f, 7.319f)
            close()
            moveTo(7.262f, 7.922f)
            curveTo(7.328f, 7.922f, 7.381f, 7.868f, 7.381f, 7.801f)
            curveTo(7.381f, 7.735f, 7.328f, 7.681f, 7.262f, 7.681f)
            curveTo(7.196f, 7.681f, 7.143f, 7.735f, 7.143f, 7.801f)
            curveTo(7.143f, 7.868f, 7.196f, 7.922f, 7.262f, 7.922f)
            close()
            moveTo(7.738f, 7.801f)
            curveTo(7.738f, 7.868f, 7.685f, 7.922f, 7.619f, 7.922f)
            curveTo(7.553f, 7.922f, 7.5f, 7.868f, 7.5f, 7.801f)
            curveTo(7.5f, 7.735f, 7.553f, 7.681f, 7.619f, 7.681f)
            curveTo(7.685f, 7.681f, 7.738f, 7.735f, 7.738f, 7.801f)
            close()
            moveTo(7.44f, 7.681f)
            curveTo(7.506f, 7.681f, 7.56f, 7.627f, 7.56f, 7.56f)
            curveTo(7.56f, 7.494f, 7.506f, 7.44f, 7.44f, 7.44f)
            curveTo(7.375f, 7.44f, 7.321f, 7.494f, 7.321f, 7.56f)
            curveTo(7.321f, 7.627f, 7.375f, 7.681f, 7.44f, 7.681f)
            close()
            moveTo(7.738f, 7.319f)
            curveTo(7.738f, 7.386f, 7.685f, 7.44f, 7.619f, 7.44f)
            curveTo(7.553f, 7.44f, 7.5f, 7.386f, 7.5f, 7.319f)
            curveTo(7.5f, 7.253f, 7.553f, 7.199f, 7.619f, 7.199f)
            curveTo(7.685f, 7.199f, 7.738f, 7.253f, 7.738f, 7.319f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.92f, 7.078f)
            horizontalLineTo(8.095f)
            verticalLineTo(7.679f)
            curveTo(8.095f, 7.679f, 8.156f, 7.99f, 8.508f, 7.99f)
            curveTo(8.859f, 7.99f, 8.92f, 7.679f, 8.92f, 7.679f)
            verticalLineTo(7.078f)
            close()
            moveTo(8.452f, 7.319f)
            curveTo(8.452f, 7.386f, 8.399f, 7.44f, 8.333f, 7.44f)
            curveTo(8.268f, 7.44f, 8.214f, 7.386f, 8.214f, 7.319f)
            curveTo(8.214f, 7.253f, 8.268f, 7.199f, 8.333f, 7.199f)
            curveTo(8.399f, 7.199f, 8.452f, 7.253f, 8.452f, 7.319f)
            close()
            moveTo(8.333f, 7.922f)
            curveTo(8.399f, 7.922f, 8.452f, 7.868f, 8.452f, 7.801f)
            curveTo(8.452f, 7.735f, 8.399f, 7.681f, 8.333f, 7.681f)
            curveTo(8.268f, 7.681f, 8.214f, 7.735f, 8.214f, 7.801f)
            curveTo(8.214f, 7.868f, 8.268f, 7.922f, 8.333f, 7.922f)
            close()
            moveTo(8.81f, 7.801f)
            curveTo(8.81f, 7.868f, 8.756f, 7.922f, 8.69f, 7.922f)
            curveTo(8.625f, 7.922f, 8.571f, 7.868f, 8.571f, 7.801f)
            curveTo(8.571f, 7.735f, 8.625f, 7.681f, 8.69f, 7.681f)
            curveTo(8.756f, 7.681f, 8.81f, 7.735f, 8.81f, 7.801f)
            close()
            moveTo(8.512f, 7.681f)
            curveTo(8.578f, 7.681f, 8.631f, 7.627f, 8.631f, 7.56f)
            curveTo(8.631f, 7.494f, 8.578f, 7.44f, 8.512f, 7.44f)
            curveTo(8.446f, 7.44f, 8.393f, 7.494f, 8.393f, 7.56f)
            curveTo(8.393f, 7.627f, 8.446f, 7.681f, 8.512f, 7.681f)
            close()
            moveTo(8.81f, 7.319f)
            curveTo(8.81f, 7.386f, 8.756f, 7.44f, 8.69f, 7.44f)
            curveTo(8.625f, 7.44f, 8.571f, 7.386f, 8.571f, 7.319f)
            curveTo(8.571f, 7.253f, 8.625f, 7.199f, 8.69f, 7.199f)
            curveTo(8.756f, 7.199f, 8.81f, 7.253f, 8.81f, 7.319f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.778f, 7.078f)
            horizontalLineTo(5.952f)
            verticalLineTo(7.679f)
            curveTo(5.952f, 7.679f, 6.014f, 7.99f, 6.365f, 7.99f)
            curveTo(6.716f, 7.99f, 6.778f, 7.679f, 6.778f, 7.679f)
            verticalLineTo(7.078f)
            close()
            moveTo(6.31f, 7.319f)
            curveTo(6.31f, 7.386f, 6.256f, 7.44f, 6.19f, 7.44f)
            curveTo(6.125f, 7.44f, 6.071f, 7.386f, 6.071f, 7.319f)
            curveTo(6.071f, 7.253f, 6.125f, 7.199f, 6.19f, 7.199f)
            curveTo(6.256f, 7.199f, 6.31f, 7.253f, 6.31f, 7.319f)
            close()
            moveTo(6.19f, 7.922f)
            curveTo(6.256f, 7.922f, 6.31f, 7.868f, 6.31f, 7.801f)
            curveTo(6.31f, 7.735f, 6.256f, 7.681f, 6.19f, 7.681f)
            curveTo(6.125f, 7.681f, 6.071f, 7.735f, 6.071f, 7.801f)
            curveTo(6.071f, 7.868f, 6.125f, 7.922f, 6.19f, 7.922f)
            close()
            moveTo(6.667f, 7.801f)
            curveTo(6.667f, 7.868f, 6.613f, 7.922f, 6.548f, 7.922f)
            curveTo(6.482f, 7.922f, 6.429f, 7.868f, 6.429f, 7.801f)
            curveTo(6.429f, 7.735f, 6.482f, 7.681f, 6.548f, 7.681f)
            curveTo(6.613f, 7.681f, 6.667f, 7.735f, 6.667f, 7.801f)
            close()
            moveTo(6.369f, 7.681f)
            curveTo(6.435f, 7.681f, 6.488f, 7.627f, 6.488f, 7.56f)
            curveTo(6.488f, 7.494f, 6.435f, 7.44f, 6.369f, 7.44f)
            curveTo(6.303f, 7.44f, 6.25f, 7.494f, 6.25f, 7.56f)
            curveTo(6.25f, 7.627f, 6.303f, 7.681f, 6.369f, 7.681f)
            close()
            moveTo(6.667f, 7.319f)
            curveTo(6.667f, 7.386f, 6.613f, 7.44f, 6.548f, 7.44f)
            curveTo(6.482f, 7.44f, 6.429f, 7.386f, 6.429f, 7.319f)
            curveTo(6.429f, 7.253f, 6.482f, 7.199f, 6.548f, 7.199f)
            curveTo(6.613f, 7.199f, 6.667f, 7.253f, 6.667f, 7.319f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.849f, 8.404f)
            horizontalLineTo(7.024f)
            verticalLineTo(9.005f)
            curveTo(7.024f, 9.005f, 7.085f, 9.315f, 7.436f, 9.315f)
            curveTo(7.788f, 9.315f, 7.849f, 9.005f, 7.849f, 9.005f)
            verticalLineTo(8.404f)
            close()
            moveTo(7.381f, 8.645f)
            curveTo(7.381f, 8.711f, 7.328f, 8.765f, 7.262f, 8.765f)
            curveTo(7.196f, 8.765f, 7.143f, 8.711f, 7.143f, 8.645f)
            curveTo(7.143f, 8.578f, 7.196f, 8.524f, 7.262f, 8.524f)
            curveTo(7.328f, 8.524f, 7.381f, 8.578f, 7.381f, 8.645f)
            close()
            moveTo(7.262f, 9.247f)
            curveTo(7.328f, 9.247f, 7.381f, 9.193f, 7.381f, 9.126f)
            curveTo(7.381f, 9.06f, 7.328f, 9.006f, 7.262f, 9.006f)
            curveTo(7.196f, 9.006f, 7.143f, 9.06f, 7.143f, 9.126f)
            curveTo(7.143f, 9.193f, 7.196f, 9.247f, 7.262f, 9.247f)
            close()
            moveTo(7.738f, 9.126f)
            curveTo(7.738f, 9.193f, 7.685f, 9.247f, 7.619f, 9.247f)
            curveTo(7.553f, 9.247f, 7.5f, 9.193f, 7.5f, 9.126f)
            curveTo(7.5f, 9.06f, 7.553f, 9.006f, 7.619f, 9.006f)
            curveTo(7.685f, 9.006f, 7.738f, 9.06f, 7.738f, 9.126f)
            close()
            moveTo(7.44f, 9.006f)
            curveTo(7.506f, 9.006f, 7.56f, 8.952f, 7.56f, 8.886f)
            curveTo(7.56f, 8.819f, 7.506f, 8.765f, 7.44f, 8.765f)
            curveTo(7.375f, 8.765f, 7.321f, 8.819f, 7.321f, 8.886f)
            curveTo(7.321f, 8.952f, 7.375f, 9.006f, 7.44f, 9.006f)
            close()
            moveTo(7.738f, 8.645f)
            curveTo(7.738f, 8.711f, 7.685f, 8.765f, 7.619f, 8.765f)
            curveTo(7.553f, 8.765f, 7.5f, 8.711f, 7.5f, 8.645f)
            curveTo(7.5f, 8.578f, 7.553f, 8.524f, 7.619f, 8.524f)
            curveTo(7.685f, 8.524f, 7.738f, 8.578f, 7.738f, 8.645f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortugalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Portugal,
            contentDescription = "Portugal Flag"
        )
    }
}
