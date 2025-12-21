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
 * Montenegro Flag (20x15dp)
 *
 * - ISO Alpha-2: ME
 * - ISO Alpha-3: MNE
 * - ISO Numeric: 499
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Montenegro: ImageVector by lazy {
    ImageVector.Builder(
        name = "Montenegro:ME:MNE:499:Medium",
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
                fill = SolidColor(Color(0xFFE8AA00)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2f, 2f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.644f, 9.845f)
                curveTo(12.899f, 9.845f, 13.106f, 9.633f, 13.106f, 9.372f)
                curveTo(13.106f, 9.11f, 12.899f, 8.899f, 12.644f, 8.899f)
                curveTo(12.389f, 8.899f, 12.183f, 9.11f, 12.183f, 9.372f)
                curveTo(12.183f, 9.633f, 12.389f, 9.845f, 12.644f, 9.845f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.642f, 7.707f)
                curveTo(5.431f, 6.3f, 7.167f, 3.858f, 7.167f, 3.858f)
                curveTo(7.167f, 3.858f, 7.426f, 5.317f, 8.386f, 6.298f)
                curveTo(8.386f, 6.368f, 8.296f, 6.471f, 8.204f, 6.575f)
                curveTo(8.14f, 6.647f, 8.075f, 6.721f, 8.04f, 6.784f)
                curveTo(7.956f, 6.937f, 8.246f, 7.025f, 8.386f, 7.025f)
                curveTo(8.45f, 7.025f, 8.484f, 7.116f, 8.516f, 7.199f)
                curveTo(8.554f, 7.3f, 8.588f, 7.388f, 8.662f, 7.277f)
                curveTo(8.797f, 7.075f, 8.527f, 6.63f, 8.527f, 6.63f)
                lineTo(8.955f, 6.18f)
                lineTo(9.099f, 5.888f)
                horizontalLineTo(8.955f)
                verticalLineTo(5.589f)
                lineTo(8.853f, 5.672f)
                curveTo(8.853f, 5.672f, 8.742f, 5.404f, 8.527f, 5.404f)
                curveTo(8.313f, 5.404f, 8.246f, 5.281f, 8.246f, 5.281f)
                horizontalLineTo(8.527f)
                curveTo(8.668f, 5.281f, 8.505f, 5.094f, 8.386f, 4.997f)
                curveTo(8.333f, 4.953f, 8.253f, 4.968f, 8.18f, 4.982f)
                curveTo(8.091f, 4.999f, 8.013f, 5.013f, 8.013f, 4.913f)
                curveTo(8.013f, 4.804f, 8.098f, 4.789f, 8.197f, 4.773f)
                curveTo(8.261f, 4.762f, 8.331f, 4.75f, 8.386f, 4.71f)
                curveTo(8.478f, 4.644f, 8.602f, 4.664f, 8.736f, 4.686f)
                curveTo(8.807f, 4.698f, 8.881f, 4.71f, 8.955f, 4.71f)
                horizontalLineTo(9.303f)
                curveTo(9.428f, 4.71f, 9.099f, 4.913f, 9.099f, 4.913f)
                lineTo(9.303f, 5.094f)
                lineTo(9.606f, 5.404f)
                lineTo(9.454f, 5.493f)
                lineTo(9.767f, 5.796f)
                curveTo(9.767f, 5.796f, 9.661f, 5.969f, 9.767f, 5.969f)
                curveTo(9.81f, 5.969f, 9.839f, 6.005f, 9.858f, 6.047f)
                curveTo(9.876f, 6.005f, 9.905f, 5.969f, 9.949f, 5.969f)
                curveTo(10.055f, 5.969f, 9.949f, 5.796f, 9.949f, 5.796f)
                lineTo(10.261f, 5.493f)
                lineTo(10.11f, 5.404f)
                lineTo(10.413f, 5.094f)
                lineTo(10.616f, 4.913f)
                curveTo(10.616f, 4.913f, 10.287f, 4.71f, 10.413f, 4.71f)
                horizontalLineTo(10.761f)
                curveTo(10.834f, 4.71f, 10.908f, 4.698f, 10.979f, 4.686f)
                curveTo(11.113f, 4.664f, 11.237f, 4.644f, 11.329f, 4.71f)
                curveTo(11.385f, 4.75f, 11.455f, 4.762f, 11.519f, 4.773f)
                curveTo(11.617f, 4.789f, 11.703f, 4.804f, 11.703f, 4.913f)
                curveTo(11.703f, 5.013f, 11.625f, 4.999f, 11.535f, 4.982f)
                curveTo(11.463f, 4.968f, 11.382f, 4.953f, 11.329f, 4.997f)
                curveTo(11.211f, 5.094f, 11.047f, 5.281f, 11.188f, 5.281f)
                horizontalLineTo(11.47f)
                curveTo(11.47f, 5.281f, 11.403f, 5.404f, 11.188f, 5.404f)
                curveTo(10.973f, 5.404f, 10.862f, 5.672f, 10.862f, 5.672f)
                lineTo(10.761f, 5.589f)
                verticalLineTo(5.888f)
                horizontalLineTo(10.616f)
                lineTo(10.761f, 6.18f)
                lineTo(11.188f, 6.63f)
                curveTo(11.188f, 6.63f, 10.918f, 7.075f, 11.053f, 7.277f)
                curveTo(11.128f, 7.388f, 11.161f, 7.3f, 11.2f, 7.199f)
                curveTo(11.231f, 7.116f, 11.266f, 7.025f, 11.329f, 7.025f)
                curveTo(11.47f, 7.025f, 11.759f, 6.937f, 11.675f, 6.784f)
                curveTo(11.64f, 6.721f, 11.576f, 6.647f, 11.512f, 6.575f)
                curveTo(11.42f, 6.471f, 11.329f, 6.368f, 11.329f, 6.298f)
                curveTo(12.289f, 5.317f, 12.549f, 3.858f, 12.549f, 3.858f)
                curveTo(12.549f, 3.858f, 14.284f, 6.3f, 13.073f, 7.707f)
                curveTo(11.863f, 9.115f, 10.973f, 8.69f, 10.973f, 8.69f)
                lineTo(11.47f, 9.135f)
                lineTo(11.329f, 9.257f)
                horizontalLineTo(11.743f)
                lineTo(11.591f, 9.359f)
                lineTo(11.703f, 9.408f)
                lineTo(11.821f, 9.46f)
                curveTo(11.821f, 9.46f, 11.502f, 9.695f, 11.821f, 9.695f)
                curveTo(11.872f, 9.695f, 11.925f, 9.693f, 11.98f, 9.692f)
                curveTo(12.04f, 9.69f, 12.102f, 9.688f, 12.165f, 9.688f)
                curveTo(12.181f, 9.688f, 12.144f, 9.596f, 12.107f, 9.505f)
                curveTo(12.07f, 9.415f, 12.034f, 9.326f, 12.05f, 9.326f)
                curveTo(12.085f, 9.328f, 12.153f, 9.41f, 12.221f, 9.492f)
                curveTo(12.275f, 9.557f, 12.33f, 9.623f, 12.367f, 9.648f)
                curveTo(12.392f, 9.665f, 12.487f, 9.632f, 12.575f, 9.601f)
                curveTo(12.649f, 9.575f, 12.719f, 9.551f, 12.737f, 9.56f)
                curveTo(12.811f, 9.597f, 12.792f, 9.673f, 12.774f, 9.745f)
                curveTo(12.769f, 9.764f, 12.764f, 9.782f, 12.762f, 9.8f)
                curveTo(12.759f, 9.816f, 12.854f, 9.754f, 12.954f, 9.689f)
                curveTo(13.059f, 9.621f, 13.17f, 9.549f, 13.178f, 9.56f)
                curveTo(13.18f, 9.562f, 13.182f, 9.564f, 13.184f, 9.567f)
                curveTo(13.22f, 9.61f, 13.277f, 9.679f, 12.852f, 10.007f)
                curveTo(12.852f, 10.07f, 12.855f, 10.121f, 12.856f, 10.163f)
                curveTo(12.862f, 10.297f, 12.864f, 10.332f, 12.773f, 10.332f)
                curveTo(12.733f, 10.332f, 12.676f, 10.352f, 12.61f, 10.375f)
                curveTo(12.442f, 10.434f, 12.215f, 10.515f, 12.05f, 10.332f)
                curveTo(11.821f, 10.077f, 11.47f, 9.695f, 11.47f, 9.695f)
                verticalLineTo(9.882f)
                lineTo(11.053f, 9.46f)
                lineTo(10.973f, 9.695f)
                lineTo(10.413f, 9.051f)
                lineTo(10.261f, 9.135f)
                curveTo(10.261f, 9.135f, 10.777f, 10.559f, 11.053f, 10.569f)
                curveTo(11.19f, 10.574f, 10.982f, 10.707f, 10.706f, 10.883f)
                curveTo(10.427f, 11.062f, 10.079f, 11.284f, 9.949f, 11.463f)
                curveTo(9.91f, 11.516f, 9.881f, 11.435f, 9.858f, 11.259f)
                curveTo(9.835f, 11.435f, 9.805f, 11.516f, 9.767f, 11.463f)
                curveTo(9.637f, 11.284f, 9.288f, 11.062f, 9.009f, 10.883f)
                curveTo(8.733f, 10.707f, 8.525f, 10.574f, 8.662f, 10.569f)
                curveTo(8.938f, 10.559f, 9.454f, 9.135f, 9.454f, 9.135f)
                lineTo(9.303f, 9.051f)
                lineTo(8.742f, 9.695f)
                lineTo(8.662f, 9.46f)
                lineTo(8.246f, 9.882f)
                verticalLineTo(9.695f)
                curveTo(8.246f, 9.695f, 7.894f, 10.077f, 7.665f, 10.332f)
                curveTo(7.5f, 10.515f, 7.273f, 10.434f, 7.105f, 10.375f)
                curveTo(7.04f, 10.352f, 6.983f, 10.332f, 6.943f, 10.332f)
                curveTo(6.798f, 10.332f, 6.75f, 10.13f, 6.943f, 9.882f)
                curveTo(7.105f, 9.674f, 7.442f, 9.684f, 7.735f, 9.692f)
                curveTo(7.79f, 9.693f, 7.844f, 9.695f, 7.894f, 9.695f)
                curveTo(8.214f, 9.695f, 7.894f, 9.46f, 7.894f, 9.46f)
                lineTo(8.013f, 9.408f)
                lineTo(8.125f, 9.359f)
                lineTo(7.973f, 9.257f)
                horizontalLineTo(8.386f)
                lineTo(8.246f, 9.135f)
                lineTo(8.742f, 8.69f)
                curveTo(8.742f, 8.69f, 7.853f, 9.115f, 6.642f, 7.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.771f, 10.644f)
                lineTo(7.224f, 9.685f)
                curveTo(7.224f, 9.685f, 6.509f, 8.036f, 6.509f, 7.836f)
                curveTo(6.509f, 7.636f, 6.221f, 7.043f, 6.221f, 7.215f)
                curveTo(6.221f, 7.387f, 6.221f, 7.836f, 6.221f, 7.836f)
                lineTo(7.427f, 10.554f)
                verticalLineTo(10.768f)
                horizontalLineTo(7.59f)
                lineTo(7.771f, 10.644f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(12.151f, 9.353f)
                lineTo(12.234f, 9.077f)
                lineTo(13.251f, 9.383f)
                lineTo(13.167f, 9.659f)
                lineTo(12.151f, 9.353f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(12.692f, 8.85f)
                lineTo(12.967f, 8.94f)
                lineTo(12.699f, 9.801f)
                lineTo(12.424f, 9.711f)
                lineTo(12.692f, 8.85f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.948f, 8.569f)
                lineTo(12.889f, 8.556f)
                lineTo(12.865f, 8.651f)
                lineTo(12.757f, 8.624f)
                lineTo(12.743f, 8.682f)
                lineTo(12.851f, 8.709f)
                lineTo(12.823f, 8.817f)
                lineTo(12.882f, 8.83f)
                lineTo(12.91f, 8.723f)
                lineTo(13.016f, 8.749f)
                lineTo(13.03f, 8.691f)
                lineTo(12.924f, 8.665f)
                lineTo(12.948f, 8.569f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.809f, 3.264f)
                lineTo(9.839f, 3.368f)
                horizontalLineTo(9.929f)
                lineTo(9.959f, 3.264f)
                curveTo(10.034f, 3.287f, 10.102f, 3.312f, 10.163f, 3.341f)
                lineTo(10.165f, 3.318f)
                curveTo(10.647f, 3.362f, 10.898f, 3.564f, 10.871f, 3.919f)
                curveTo(10.849f, 4.213f, 10.7f, 4.367f, 10.452f, 4.363f)
                verticalLineTo(4.583f)
                curveTo(10.452f, 4.583f, 10.048f, 4.738f, 9.846f, 4.738f)
                curveTo(9.644f, 4.738f, 9.24f, 4.583f, 9.24f, 4.583f)
                verticalLineTo(4.36f)
                curveTo(9.036f, 4.334f, 8.914f, 4.183f, 8.894f, 3.919f)
                curveTo(8.867f, 3.564f, 9.118f, 3.362f, 9.6f, 3.318f)
                lineTo(9.602f, 3.342f)
                curveTo(9.664f, 3.313f, 9.733f, 3.287f, 9.809f, 3.264f)
                close()
                moveTo(9.298f, 4.167f)
                curveTo(9.271f, 4.174f, 9.252f, 4.18f, 9.244f, 4.182f)
                curveTo(9.133f, 4.161f, 9.079f, 4.073f, 9.067f, 3.907f)
                curveTo(9.054f, 3.739f, 9.133f, 3.622f, 9.319f, 3.554f)
                curveTo(9.192f, 3.717f, 9.183f, 3.924f, 9.298f, 4.167f)
                close()
                moveTo(9.47f, 4.122f)
                curveTo(9.572f, 4.097f, 9.69f, 4.073f, 9.784f, 4.065f)
                verticalLineTo(3.458f)
                curveTo(9.397f, 3.594f, 9.304f, 3.802f, 9.47f, 4.122f)
                close()
                moveTo(9.957f, 4.07f)
                curveTo(10.087f, 4.087f, 10.245f, 4.126f, 10.347f, 4.154f)
                lineTo(10.295f, 4.125f)
                curveTo(10.468f, 3.796f, 10.368f, 3.585f, 9.957f, 3.449f)
                verticalLineTo(4.07f)
                close()
                moveTo(10.449f, 3.556f)
                curveTo(10.579f, 3.722f, 10.585f, 3.936f, 10.46f, 4.187f)
                curveTo(10.612f, 4.189f, 10.684f, 4.101f, 10.698f, 3.907f)
                curveTo(10.711f, 3.74f, 10.633f, 3.623f, 10.449f, 3.556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.846f, 3.449f)
                curveTo(9.958f, 3.449f, 10.048f, 3.359f, 10.048f, 3.248f)
                curveTo(10.048f, 3.136f, 9.958f, 3.046f, 9.846f, 3.046f)
                curveTo(9.735f, 3.046f, 9.644f, 3.136f, 9.644f, 3.248f)
                curveTo(9.644f, 3.359f, 9.735f, 3.449f, 9.846f, 3.449f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.874f, 2.811f)
                lineTo(9.814f, 2.813f)
                lineTo(9.813f, 2.911f)
                lineTo(9.702f, 2.911f)
                lineTo(9.703f, 2.971f)
                lineTo(9.813f, 2.97f)
                lineTo(9.813f, 3.082f)
                lineTo(9.873f, 3.081f)
                lineTo(9.874f, 2.97f)
                lineTo(9.984f, 2.97f)
                lineTo(9.983f, 2.91f)
                lineTo(9.874f, 2.91f)
                lineTo(9.874f, 2.811f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.721f, 6.475f)
                curveTo(8.721f, 6.475f, 9.432f, 6.34f, 9.817f, 6.34f)
                curveTo(10.163f, 6.34f, 10.913f, 6.475f, 10.913f, 6.475f)
                curveTo(10.913f, 7.325f, 11.153f, 7.845f, 10.913f, 8.426f)
                curveTo(10.674f, 9.006f, 10.09f, 8.727f, 9.825f, 9.283f)
                curveTo(9.487f, 8.756f, 9.03f, 9.046f, 8.721f, 8.295f)
                curveTo(8.412f, 7.545f, 8.909f, 7.199f, 8.721f, 6.475f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(8.721f, 6.475f)
                curveTo(8.721f, 6.475f, 9.432f, 6.34f, 9.817f, 6.34f)
                curveTo(10.163f, 6.34f, 10.913f, 6.475f, 10.913f, 6.475f)
                curveTo(10.913f, 7.325f, 11.153f, 7.845f, 10.913f, 8.426f)
                curveTo(10.674f, 9.006f, 10.09f, 8.727f, 9.825f, 9.283f)
                curveTo(9.487f, 8.756f, 9.03f, 9.046f, 8.721f, 8.295f)
                curveTo(8.412f, 7.545f, 8.909f, 7.199f, 8.721f, 6.475f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(8.721f, 8.248f)
                horizontalLineToRelative(2.192f)
                verticalLineToRelative(1.064f)
                horizontalLineToRelative(-2.192f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.369f, 6.894f)
                curveTo(9.286f, 6.716f, 9.81f, 6.695f, 9.81f, 6.695f)
                curveTo(9.81f, 6.695f, 9.923f, 6.894f, 9.81f, 7.176f)
                curveTo(9.727f, 7.382f, 9.864f, 7.364f, 10.054f, 7.338f)
                curveTo(10.124f, 7.329f, 10.203f, 7.318f, 10.279f, 7.318f)
                curveTo(10.397f, 7.318f, 10.459f, 7.31f, 10.51f, 7.329f)
                curveTo(10.582f, 7.356f, 10.633f, 7.437f, 10.786f, 7.671f)
                curveTo(10.856f, 7.778f, 10.853f, 7.849f, 10.811f, 7.891f)
                curveTo(10.814f, 8f, 10.696f, 8.09f, 10.477f, 8.148f)
                lineTo(10.448f, 8.033f)
                curveTo(10.564f, 8.003f, 10.635f, 7.973f, 10.668f, 7.941f)
                curveTo(10.503f, 7.951f, 10.279f, 7.87f, 10.279f, 7.765f)
                curveTo(10.279f, 7.61f, 9.751f, 7.643f, 9.433f, 7.662f)
                curveTo(9.353f, 7.667f, 9.285f, 7.671f, 9.244f, 7.671f)
                curveTo(9.059f, 7.671f, 9.201f, 7.446f, 9.33f, 7.24f)
                curveTo(9.343f, 7.218f, 9.356f, 7.197f, 9.369f, 7.176f)
                curveTo(9.436f, 7.069f, 9.457f, 7.042f, 9.452f, 7.021f)
                curveTo(9.447f, 6.999f, 9.412f, 6.984f, 9.369f, 6.894f)
                close()
                moveTo(10.626f, 6.866f)
                curveTo(10.31f, 6.816f, 10.132f, 6.864f, 10.132f, 7.041f)
                curveTo(10.132f, 7.21f, 10.301f, 7.283f, 10.609f, 7.282f)
                curveTo(10.621f, 7.286f, 10.631f, 7.29f, 10.64f, 7.294f)
                curveTo(10.629f, 7.299f, 10.615f, 7.305f, 10.598f, 7.311f)
                lineTo(10.637f, 7.422f)
                curveTo(10.831f, 7.352f, 10.831f, 7.228f, 10.634f, 7.166f)
                lineTo(10.626f, 7.164f)
                lineTo(10.617f, 7.164f)
                curveTo(10.361f, 7.166f, 10.248f, 7.118f, 10.248f, 7.041f)
                curveTo(10.248f, 6.972f, 10.355f, 6.943f, 10.609f, 6.983f)
                lineTo(10.626f, 6.866f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MontenegroPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Montenegro,
            contentDescription = "Montenegro Flag"
        )
    }
}
