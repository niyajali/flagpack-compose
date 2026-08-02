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
 * Guam Flag (16x12dp)
 *
 * - ISO Alpha-2: GU
 * - ISO Alpha-3: GUM
 * - ISO Numeric: 316
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Guam: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guam:GU:GUM:316:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFCBDAFF)),
                strokeAlpha = 0.1f,
                strokeLineWidth = 1f
            ) {
                moveTo(2.5f, 2.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.5f)
                verticalLineTo(2.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2.5f, 2.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.5f)
                verticalLineTo(2.5f)
                close()
                moveTo(2f, 2f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFCCE0E5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 2f)
                curveTo(8f, 2f, 11f, 3.448f, 11f, 5.859f)
                curveTo(11f, 8.27f, 8f, 10f, 8f, 10f)
                curveTo(8f, 10f, 5f, 8.202f, 5f, 5.859f)
                curveTo(5f, 3.516f, 8f, 2f, 8f, 2f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC1C9F1)),
                strokeAlpha = 0.1482f,
                strokeLineWidth = 1.45f
            ) {
                moveTo(8f, 2f)
                lineTo(8.315f, 1.347f)
                lineTo(7.993f, 1.191f)
                lineTo(7.673f, 1.353f)
                lineTo(8f, 2f)
                close()
                moveTo(8f, 2f)
                curveTo(8.315f, 1.347f, 8.315f, 1.347f, 8.316f, 1.347f)
                lineTo(8.316f, 1.347f)
                lineTo(8.317f, 1.348f)
                lineTo(8.321f, 1.35f)
                lineTo(8.331f, 1.355f)
                lineTo(8.363f, 1.371f)
                curveTo(8.39f, 1.384f, 8.427f, 1.404f, 8.473f, 1.429f)
                curveTo(8.566f, 1.479f, 8.695f, 1.552f, 8.849f, 1.647f)
                curveTo(9.155f, 1.835f, 9.566f, 2.116f, 9.98f, 2.482f)
                curveTo(10.787f, 3.195f, 11.725f, 4.342f, 11.725f, 5.859f)
                curveTo(11.725f, 7.362f, 10.8f, 8.575f, 10.007f, 9.352f)
                curveTo(9.598f, 9.752f, 9.192f, 10.068f, 8.889f, 10.283f)
                curveTo(8.737f, 10.391f, 8.609f, 10.475f, 8.517f, 10.533f)
                curveTo(8.471f, 10.562f, 8.435f, 10.585f, 8.408f, 10.601f)
                lineTo(8.377f, 10.619f)
                lineTo(8.367f, 10.625f)
                lineTo(8.364f, 10.627f)
                lineTo(8.363f, 10.627f)
                lineTo(8.363f, 10.628f)
                curveTo(8.362f, 10.628f, 8.362f, 10.628f, 8f, 10f)
                moveTo(8f, 2f)
                curveTo(7.673f, 1.353f, 7.673f, 1.353f, 7.673f, 1.353f)
                lineTo(7.672f, 1.353f)
                lineTo(7.671f, 1.354f)
                lineTo(7.668f, 1.356f)
                lineTo(7.658f, 1.361f)
                lineTo(7.626f, 1.377f)
                curveTo(7.6f, 1.391f, 7.563f, 1.411f, 7.516f, 1.437f)
                curveTo(7.424f, 1.489f, 7.296f, 1.564f, 7.142f, 1.661f)
                curveTo(6.838f, 1.855f, 6.429f, 2.141f, 6.016f, 2.511f)
                curveTo(5.217f, 3.226f, 4.275f, 4.373f, 4.275f, 5.859f)
                curveTo(4.275f, 7.33f, 5.203f, 8.545f, 5.99f, 9.323f)
                curveTo(6.397f, 9.727f, 6.802f, 10.048f, 7.104f, 10.268f)
                curveTo(7.256f, 10.379f, 7.383f, 10.465f, 7.474f, 10.525f)
                curveTo(7.519f, 10.554f, 7.556f, 10.578f, 7.582f, 10.594f)
                lineTo(7.613f, 10.613f)
                lineTo(7.622f, 10.619f)
                lineTo(7.625f, 10.621f)
                lineTo(7.626f, 10.621f)
                lineTo(7.627f, 10.622f)
                curveTo(7.627f, 10.622f, 7.627f, 10.622f, 8f, 10f)
                moveTo(8f, 10f)
                lineTo(8.362f, 10.628f)
                lineTo(7.993f, 10.841f)
                lineTo(7.627f, 10.622f)
                lineTo(8f, 10f)
                close()
            }
            path(fill = SolidColor(Color(0xFFCCE0E5))) {
                moveTo(8.2f, 3.018f)
                lineTo(8.543f, 2.38f)
                lineTo(8.192f, 2.191f)
                lineTo(7.844f, 2.387f)
                lineTo(8.2f, 3.018f)
                close()
                moveTo(8.2f, 3.018f)
                curveTo(8.543f, 2.38f, 8.543f, 2.38f, 8.544f, 2.38f)
                lineTo(8.544f, 2.38f)
                lineTo(8.545f, 2.381f)
                lineTo(8.548f, 2.382f)
                lineTo(8.556f, 2.387f)
                lineTo(8.58f, 2.4f)
                curveTo(8.6f, 2.411f, 8.627f, 2.427f, 8.66f, 2.447f)
                curveTo(8.725f, 2.486f, 8.816f, 2.543f, 8.923f, 2.617f)
                curveTo(9.136f, 2.763f, 9.421f, 2.98f, 9.709f, 3.263f)
                curveTo(10.271f, 3.817f, 10.925f, 4.708f, 10.925f, 5.884f)
                curveTo(10.925f, 7.047f, 10.282f, 7.986f, 9.734f, 8.583f)
                curveTo(9.452f, 8.89f, 9.172f, 9.133f, 8.962f, 9.299f)
                curveTo(8.857f, 9.382f, 8.768f, 9.447f, 8.704f, 9.492f)
                curveTo(8.672f, 9.515f, 8.646f, 9.533f, 8.627f, 9.546f)
                lineTo(8.604f, 9.561f)
                lineTo(8.596f, 9.566f)
                lineTo(8.594f, 9.568f)
                lineTo(8.593f, 9.568f)
                lineTo(8.592f, 9.569f)
                curveTo(8.592f, 9.569f, 8.592f, 9.569f, 8.2f, 8.959f)
                moveTo(8.2f, 3.018f)
                curveTo(7.844f, 2.387f, 7.844f, 2.387f, 7.844f, 2.387f)
                lineTo(7.844f, 2.387f)
                lineTo(7.842f, 2.388f)
                lineTo(7.84f, 2.389f)
                lineTo(7.832f, 2.394f)
                lineTo(7.808f, 2.407f)
                curveTo(7.789f, 2.419f, 7.762f, 2.435f, 7.73f, 2.455f)
                curveTo(7.665f, 2.496f, 7.575f, 2.554f, 7.469f, 2.63f)
                curveTo(7.257f, 2.779f, 6.974f, 3f, 6.688f, 3.285f)
                curveTo(6.133f, 3.839f, 5.475f, 4.731f, 5.475f, 5.884f)
                curveTo(5.475f, 7.025f, 6.121f, 7.964f, 6.663f, 8.561f)
                curveTo(6.944f, 8.87f, 7.222f, 9.117f, 7.43f, 9.286f)
                curveTo(7.535f, 9.371f, 7.623f, 9.437f, 7.687f, 9.484f)
                curveTo(7.719f, 9.507f, 7.744f, 9.525f, 7.763f, 9.538f)
                lineTo(7.786f, 9.554f)
                lineTo(7.793f, 9.559f)
                lineTo(7.796f, 9.561f)
                lineTo(7.797f, 9.561f)
                lineTo(7.797f, 9.562f)
                curveTo(7.797f, 9.562f, 7.798f, 9.562f, 8.2f, 8.959f)
                moveTo(8.2f, 8.959f)
                lineTo(8.592f, 9.569f)
                lineTo(8.192f, 9.825f)
                lineTo(7.798f, 9.562f)
                lineTo(8.2f, 8.959f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC1C9F1)),
                strokeAlpha = 0.748217f,
                strokeLineWidth = 1.45f
            ) {
                moveTo(8.2f, 3.018f)
                lineTo(8.543f, 2.38f)
                lineTo(8.192f, 2.191f)
                lineTo(7.844f, 2.387f)
                lineTo(8.2f, 3.018f)
                close()
                moveTo(8.2f, 3.018f)
                curveTo(8.543f, 2.38f, 8.543f, 2.38f, 8.544f, 2.38f)
                lineTo(8.544f, 2.38f)
                lineTo(8.545f, 2.381f)
                lineTo(8.548f, 2.382f)
                lineTo(8.556f, 2.387f)
                lineTo(8.58f, 2.4f)
                curveTo(8.6f, 2.411f, 8.627f, 2.427f, 8.66f, 2.447f)
                curveTo(8.725f, 2.486f, 8.816f, 2.543f, 8.923f, 2.617f)
                curveTo(9.136f, 2.763f, 9.421f, 2.98f, 9.709f, 3.263f)
                curveTo(10.271f, 3.817f, 10.925f, 4.708f, 10.925f, 5.884f)
                curveTo(10.925f, 7.047f, 10.282f, 7.986f, 9.734f, 8.583f)
                curveTo(9.452f, 8.89f, 9.172f, 9.133f, 8.962f, 9.299f)
                curveTo(8.857f, 9.382f, 8.768f, 9.447f, 8.704f, 9.492f)
                curveTo(8.672f, 9.515f, 8.646f, 9.533f, 8.627f, 9.546f)
                lineTo(8.604f, 9.561f)
                lineTo(8.596f, 9.566f)
                lineTo(8.594f, 9.568f)
                lineTo(8.593f, 9.568f)
                lineTo(8.592f, 9.569f)
                curveTo(8.592f, 9.569f, 8.592f, 9.569f, 8.2f, 8.959f)
                moveTo(8.2f, 3.018f)
                curveTo(7.844f, 2.387f, 7.844f, 2.387f, 7.844f, 2.387f)
                lineTo(7.844f, 2.387f)
                lineTo(7.842f, 2.388f)
                lineTo(7.84f, 2.389f)
                lineTo(7.832f, 2.394f)
                lineTo(7.808f, 2.407f)
                curveTo(7.789f, 2.419f, 7.762f, 2.435f, 7.73f, 2.455f)
                curveTo(7.665f, 2.496f, 7.575f, 2.554f, 7.469f, 2.63f)
                curveTo(7.257f, 2.779f, 6.974f, 3f, 6.688f, 3.285f)
                curveTo(6.133f, 3.839f, 5.475f, 4.731f, 5.475f, 5.884f)
                curveTo(5.475f, 7.025f, 6.121f, 7.964f, 6.663f, 8.561f)
                curveTo(6.944f, 8.87f, 7.222f, 9.117f, 7.43f, 9.286f)
                curveTo(7.535f, 9.371f, 7.623f, 9.437f, 7.687f, 9.484f)
                curveTo(7.719f, 9.507f, 7.744f, 9.525f, 7.763f, 9.538f)
                lineTo(7.786f, 9.554f)
                lineTo(7.793f, 9.559f)
                lineTo(7.796f, 9.561f)
                lineTo(7.797f, 9.561f)
                lineTo(7.797f, 9.562f)
                curveTo(7.797f, 9.562f, 7.798f, 9.562f, 8.2f, 8.959f)
                moveTo(8.2f, 8.959f)
                lineTo(8.592f, 9.569f)
                lineTo(8.192f, 9.825f)
                lineTo(7.798f, 9.562f)
                lineTo(8.2f, 8.959f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 1.45f
            ) {
                moveTo(8.2f, 3.018f)
                lineTo(8.543f, 2.38f)
                lineTo(8.192f, 2.191f)
                lineTo(7.844f, 2.387f)
                lineTo(8.2f, 3.018f)
                close()
                moveTo(8.2f, 3.018f)
                curveTo(8.543f, 2.38f, 8.543f, 2.38f, 8.544f, 2.38f)
                lineTo(8.544f, 2.38f)
                lineTo(8.545f, 2.381f)
                lineTo(8.548f, 2.382f)
                lineTo(8.556f, 2.387f)
                lineTo(8.58f, 2.4f)
                curveTo(8.6f, 2.411f, 8.627f, 2.427f, 8.66f, 2.447f)
                curveTo(8.725f, 2.486f, 8.816f, 2.543f, 8.923f, 2.617f)
                curveTo(9.136f, 2.763f, 9.421f, 2.98f, 9.709f, 3.263f)
                curveTo(10.271f, 3.817f, 10.925f, 4.708f, 10.925f, 5.884f)
                curveTo(10.925f, 7.047f, 10.282f, 7.986f, 9.734f, 8.583f)
                curveTo(9.452f, 8.89f, 9.172f, 9.133f, 8.962f, 9.299f)
                curveTo(8.857f, 9.382f, 8.768f, 9.447f, 8.704f, 9.492f)
                curveTo(8.672f, 9.515f, 8.646f, 9.533f, 8.627f, 9.546f)
                lineTo(8.604f, 9.561f)
                lineTo(8.596f, 9.566f)
                lineTo(8.594f, 9.568f)
                lineTo(8.593f, 9.568f)
                lineTo(8.592f, 9.569f)
                curveTo(8.592f, 9.569f, 8.592f, 9.569f, 8.2f, 8.959f)
                moveTo(8.2f, 3.018f)
                curveTo(7.844f, 2.387f, 7.844f, 2.387f, 7.844f, 2.387f)
                lineTo(7.844f, 2.387f)
                lineTo(7.842f, 2.388f)
                lineTo(7.84f, 2.389f)
                lineTo(7.832f, 2.394f)
                lineTo(7.808f, 2.407f)
                curveTo(7.789f, 2.419f, 7.762f, 2.435f, 7.73f, 2.455f)
                curveTo(7.665f, 2.496f, 7.575f, 2.554f, 7.469f, 2.63f)
                curveTo(7.257f, 2.779f, 6.974f, 3f, 6.688f, 3.285f)
                curveTo(6.133f, 3.839f, 5.475f, 4.731f, 5.475f, 5.884f)
                curveTo(5.475f, 7.025f, 6.121f, 7.964f, 6.663f, 8.561f)
                curveTo(6.944f, 8.87f, 7.222f, 9.117f, 7.43f, 9.286f)
                curveTo(7.535f, 9.371f, 7.623f, 9.437f, 7.687f, 9.484f)
                curveTo(7.719f, 9.507f, 7.744f, 9.525f, 7.763f, 9.538f)
                lineTo(7.786f, 9.554f)
                lineTo(7.793f, 9.559f)
                lineTo(7.796f, 9.561f)
                lineTo(7.797f, 9.561f)
                lineTo(7.797f, 9.562f)
                curveTo(7.797f, 9.562f, 7.798f, 9.562f, 8.2f, 8.959f)
                moveTo(8.2f, 8.959f)
                lineTo(8.592f, 9.569f)
                lineTo(8.192f, 9.825f)
                lineTo(7.798f, 9.562f)
                lineTo(8.2f, 8.959f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(8.666f, 7.603f)
                curveTo(8.506f, 7.776f, 8.346f, 7.925f, 8.206f, 8.044f)
                curveTo(8.064f, 7.921f, 7.9f, 7.766f, 7.737f, 7.587f)
                curveTo(7.279f, 7.082f, 6.925f, 6.483f, 6.925f, 5.884f)
                curveTo(6.925f, 5.297f, 7.267f, 4.756f, 7.712f, 4.312f)
                curveTo(7.885f, 4.139f, 8.06f, 3.996f, 8.206f, 3.886f)
                curveTo(8.351f, 3.991f, 8.522f, 4.129f, 8.691f, 4.296f)
                curveTo(9.129f, 4.728f, 9.475f, 5.269f, 9.475f, 5.884f)
                curveTo(9.475f, 6.511f, 9.118f, 7.11f, 8.666f, 7.603f)
                close()
                moveTo(8.666f, 7.603f)
                curveTo(8.506f, 7.776f, 8.346f, 7.925f, 8.206f, 8.044f)
                curveTo(8.064f, 7.921f, 7.9f, 7.766f, 7.737f, 7.587f)
                curveTo(7.279f, 7.082f, 6.925f, 6.483f, 6.925f, 5.884f)
                curveTo(6.925f, 5.297f, 7.267f, 4.756f, 7.712f, 4.312f)
                curveTo(7.885f, 4.139f, 8.06f, 3.996f, 8.206f, 3.886f)
                curveTo(8.351f, 3.991f, 8.522f, 4.129f, 8.691f, 4.296f)
                curveTo(9.129f, 4.728f, 9.475f, 5.269f, 9.475f, 5.884f)
                curveTo(9.475f, 6.511f, 9.118f, 7.11f, 8.666f, 7.603f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF91CBCB))) {
                moveTo(6.467f, 7f)
                horizontalLineToRelative(3.733f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-3.733f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDF9A1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.801f, 7.599f)
                curveTo(6.801f, 7.599f, 9.448f, 7.6f, 9.691f, 7.509f)
                curveTo(9.934f, 7.417f, 9.234f, 9.262f, 8.34f, 9.262f)
                curveTo(7.446f, 9.262f, 6.801f, 7.599f, 6.801f, 7.599f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA68861))) {
                moveTo(9.297f, 7.378f)
                lineTo(8.821f, 7.743f)
                curveTo(8.072f, 6.77f, 7.757f, 5.762f, 7.892f, 4.734f)
                lineTo(8.487f, 4.811f)
                curveTo(8.374f, 5.673f, 8.64f, 6.524f, 9.297f, 7.378f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.197f, 4.818f)
                lineTo(7.743f, 5.35f)
                curveTo(7.726f, 5.37f, 7.694f, 5.353f, 7.7f, 5.328f)
                lineTo(7.856f, 4.665f)
                horizontalLineTo(7.146f)
                curveTo(7.119f, 4.665f, 7.111f, 4.628f, 7.136f, 4.617f)
                lineTo(7.743f, 4.351f)
                lineTo(7.312f, 3.784f)
                curveTo(7.297f, 3.764f, 7.318f, 3.736f, 7.341f, 3.746f)
                lineTo(8.018f, 4.009f)
                lineTo(8.173f, 3.388f)
                curveTo(8.179f, 3.362f, 8.215f, 3.362f, 8.221f, 3.388f)
                lineTo(8.375f, 4.009f)
                lineTo(9.046f, 3.748f)
                curveTo(9.07f, 3.739f, 9.09f, 3.768f, 9.074f, 3.787f)
                lineTo(8.609f, 4.351f)
                lineTo(9.251f, 4.617f)
                curveTo(9.276f, 4.628f, 9.268f, 4.665f, 9.241f, 4.665f)
                horizontalLineTo(8.609f)
                lineTo(8.705f, 5.343f)
                curveTo(8.709f, 5.368f, 8.678f, 5.382f, 8.662f, 5.363f)
                lineTo(8.197f, 4.818f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF239E46)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.8f, 6.5f)
                horizontalLineTo(10.2f)
                verticalLineTo(7.025f)
                horizontalLineTo(7.8f)
                verticalLineTo(6.5f)
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
            imageVector = FlagIcons.Small.Guam,
            contentDescription = "Guam Flag"
        )
    }
}
