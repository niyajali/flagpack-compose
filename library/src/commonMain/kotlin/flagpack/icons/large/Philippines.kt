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
 * Philippines Flag (32x24dp)
 *
 * - ISO Alpha-2: PH
 * - ISO Alpha-3: PHL
 * - ISO Numeric: 608
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Philippines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Philippines:PH:PHL:608:Large",
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
                fill = SolidColor(Color(0xFFBF2714)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -2f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(-2f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(24f)
            lineTo(18f, 12f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(18f, 12f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.605f, 10.92f)
                lineTo(14.881f, 11.412f)
                lineTo(15.64f, 10.519f)
                lineTo(15.66f, 11.714f)
                lineTo(16.834f, 12.095f)
                lineTo(15.598f, 12.515f)
                lineTo(15.68f, 13.613f)
                lineTo(14.866f, 12.772f)
                lineTo(13.586f, 13.015f)
                lineTo(14.342f, 12.047f)
                lineTo(13.605f, 10.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.605f, 16.92f)
                lineTo(2.778f, 17.439f)
                lineTo(3.64f, 16.519f)
                lineTo(3.557f, 17.74f)
                lineTo(4.834f, 18.096f)
                lineTo(3.495f, 18.542f)
                lineTo(3.68f, 19.613f)
                lineTo(2.747f, 18.847f)
                lineTo(1.586f, 19.015f)
                lineTo(2.239f, 18.073f)
                lineTo(1.605f, 16.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.605f, 4.92f)
                lineTo(2.903f, 5.398f)
                lineTo(3.64f, 4.519f)
                lineTo(3.682f, 5.7f)
                lineTo(4.834f, 6.096f)
                lineTo(3.62f, 6.501f)
                lineTo(3.68f, 7.613f)
                lineTo(2.872f, 6.807f)
                lineTo(1.586f, 7.015f)
                lineTo(2.364f, 6.033f)
                lineTo(1.605f, 4.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.121f, 14.533f)
                curveTo(9.502f, 14.533f, 10.622f, 13.413f, 10.622f, 12.033f)
                curveTo(10.622f, 10.652f, 9.502f, 9.533f, 8.121f, 9.533f)
                curveTo(6.741f, 9.533f, 5.621f, 10.652f, 5.621f, 12.033f)
                curveTo(5.621f, 13.413f, 6.741f, 14.533f, 8.121f, 14.533f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.826f, 8.24f)
                lineTo(7.96f, 9.846f)
                curveTo(7.973f, 9.943f, 8.048f, 10.021f, 8.145f, 10.037f)
                curveTo(8.267f, 10.058f, 8.382f, 9.975f, 8.403f, 9.853f)
                lineTo(8.58f, 8.253f)
                curveTo(8.583f, 8.234f, 8.585f, 8.215f, 8.585f, 8.197f)
                curveTo(8.589f, 7.986f, 8.421f, 7.812f, 8.211f, 7.809f)
                curveTo(8.192f, 7.808f, 8.173f, 7.809f, 8.154f, 7.812f)
                curveTo(7.945f, 7.839f, 7.798f, 8.031f, 7.826f, 8.24f)
                close()
                moveTo(7.408f, 9.016f)
                lineTo(7.615f, 9.715f)
                curveTo(7.635f, 9.779f, 7.7f, 9.82f, 7.773f, 9.807f)
                curveTo(7.833f, 9.792f, 7.87f, 9.732f, 7.856f, 9.672f)
                lineTo(7.69f, 8.971f)
                curveTo(7.671f, 8.89f, 7.593f, 8.838f, 7.511f, 8.851f)
                curveTo(7.506f, 8.852f, 7.5f, 8.854f, 7.495f, 8.855f)
                curveTo(7.427f, 8.875f, 7.388f, 8.947f, 7.408f, 9.016f)
                close()
                moveTo(8.531f, 9.744f)
                curveTo(8.514f, 9.803f, 8.549f, 9.865f, 8.616f, 9.882f)
                curveTo(8.682f, 9.896f, 8.748f, 9.858f, 8.769f, 9.794f)
                lineTo(9.001f, 9.103f)
                curveTo(9.024f, 9.036f, 8.987f, 8.962f, 8.92f, 8.94f)
                curveTo(8.915f, 8.938f, 8.909f, 8.936f, 8.904f, 8.935f)
                curveTo(8.822f, 8.919f, 8.743f, 8.969f, 8.721f, 9.049f)
                lineTo(8.531f, 9.744f)
                close()
                moveTo(10.608f, 9.041f)
                lineTo(9.49f, 10.276f)
                curveTo(9.43f, 10.354f, 9.428f, 10.462f, 9.485f, 10.542f)
                curveTo(9.557f, 10.642f, 9.697f, 10.666f, 9.798f, 10.594f)
                lineTo(11.132f, 9.584f)
                curveTo(11.147f, 9.573f, 11.162f, 9.561f, 11.175f, 9.548f)
                curveTo(11.327f, 9.402f, 11.331f, 9.16f, 11.185f, 9.009f)
                curveTo(11.172f, 8.995f, 11.157f, 8.983f, 11.142f, 8.971f)
                curveTo(10.975f, 8.843f, 10.736f, 8.874f, 10.608f, 9.041f)
                close()
                moveTo(10.268f, 11.661f)
                lineTo(11.937f, 11.532f)
                curveTo(12.146f, 11.505f, 12.337f, 11.652f, 12.365f, 11.861f)
                curveTo(12.367f, 11.879f, 12.368f, 11.898f, 12.368f, 11.917f)
                curveTo(12.364f, 12.127f, 12.19f, 12.295f, 11.98f, 12.292f)
                curveTo(11.961f, 12.291f, 11.942f, 12.29f, 11.924f, 12.286f)
                lineTo(10.26f, 12.104f)
                curveTo(10.138f, 12.083f, 10.056f, 11.968f, 10.076f, 11.846f)
                curveTo(10.093f, 11.749f, 10.17f, 11.674f, 10.268f, 11.661f)
                close()
                moveTo(11.134f, 14.32f)
                lineTo(9.838f, 13.191f)
                curveTo(9.76f, 13.131f, 9.652f, 13.129f, 9.572f, 13.186f)
                curveTo(9.471f, 13.258f, 9.448f, 13.398f, 9.519f, 13.499f)
                lineTo(10.591f, 14.844f)
                curveTo(10.602f, 14.859f, 10.614f, 14.873f, 10.627f, 14.887f)
                curveTo(10.774f, 15.038f, 11.015f, 15.043f, 11.167f, 14.896f)
                curveTo(11.18f, 14.883f, 11.193f, 14.869f, 11.204f, 14.854f)
                curveTo(11.333f, 14.687f, 11.301f, 14.448f, 11.134f, 14.32f)
                close()
                moveTo(8.452f, 13.969f)
                lineTo(8.551f, 15.654f)
                curveTo(8.579f, 15.863f, 8.432f, 16.054f, 8.223f, 16.082f)
                curveTo(8.204f, 16.084f, 8.185f, 16.085f, 8.166f, 16.085f)
                curveTo(7.956f, 16.081f, 7.788f, 15.908f, 7.792f, 15.697f)
                curveTo(7.792f, 15.678f, 7.794f, 15.659f, 7.797f, 15.641f)
                lineTo(8.01f, 13.961f)
                curveTo(8.03f, 13.839f, 8.145f, 13.757f, 8.267f, 13.777f)
                curveTo(8.364f, 13.794f, 8.439f, 13.871f, 8.452f, 13.969f)
                close()
                moveTo(5.821f, 14.879f)
                lineTo(6.922f, 13.539f)
                curveTo(6.982f, 13.461f, 6.984f, 13.353f, 6.927f, 13.273f)
                curveTo(6.855f, 13.172f, 6.715f, 13.149f, 6.615f, 13.221f)
                lineTo(5.297f, 14.337f)
                curveTo(5.282f, 14.348f, 5.267f, 14.36f, 5.254f, 14.373f)
                curveTo(5.102f, 14.519f, 5.098f, 14.76f, 5.244f, 14.912f)
                curveTo(5.257f, 14.925f, 5.271f, 14.938f, 5.286f, 14.95f)
                curveTo(5.453f, 15.078f, 5.693f, 15.046f, 5.821f, 14.879f)
                close()
                moveTo(6.145f, 12.153f)
                lineTo(4.465f, 12.292f)
                curveTo(4.257f, 12.319f, 4.065f, 12.172f, 4.038f, 11.963f)
                curveTo(4.035f, 11.945f, 4.034f, 11.926f, 4.034f, 11.907f)
                curveTo(4.038f, 11.696f, 4.212f, 11.529f, 4.422f, 11.532f)
                curveTo(4.441f, 11.533f, 4.46f, 11.534f, 4.479f, 11.537f)
                lineTo(6.152f, 11.711f)
                curveTo(6.274f, 11.731f, 6.356f, 11.846f, 6.336f, 11.968f)
                curveTo(6.32f, 12.065f, 6.242f, 12.14f, 6.145f, 12.153f)
                close()
                moveTo(5.15f, 9.522f)
                lineTo(6.575f, 10.623f)
                curveTo(6.653f, 10.683f, 6.761f, 10.685f, 6.841f, 10.628f)
                curveTo(6.941f, 10.556f, 6.965f, 10.417f, 6.893f, 10.316f)
                lineTo(5.693f, 8.998f)
                curveTo(5.682f, 8.983f, 5.67f, 8.968f, 5.657f, 8.955f)
                curveTo(5.51f, 8.803f, 5.269f, 8.799f, 5.118f, 8.945f)
                curveTo(5.104f, 8.958f, 5.091f, 8.972f, 5.08f, 8.987f)
                curveTo(4.952f, 9.155f, 4.983f, 9.394f, 5.15f, 9.522f)
                close()
                moveTo(9.339f, 9.939f)
                lineTo(9.686f, 9.298f)
                curveTo(9.72f, 9.235f, 9.799f, 9.212f, 9.861f, 9.246f)
                curveTo(9.866f, 9.249f, 9.871f, 9.252f, 9.876f, 9.255f)
                curveTo(9.943f, 9.303f, 9.961f, 9.396f, 9.917f, 9.466f)
                lineTo(9.539f, 10.079f)
                curveTo(9.506f, 10.132f, 9.438f, 10.148f, 9.385f, 10.115f)
                curveTo(9.324f, 10.073f, 9.307f, 9.999f, 9.339f, 9.939f)
                close()
                moveTo(11.098f, 11.109f)
                lineTo(10.399f, 11.317f)
                curveTo(10.334f, 11.336f, 10.294f, 11.401f, 10.307f, 11.474f)
                curveTo(10.321f, 11.534f, 10.381f, 11.571f, 10.441f, 11.557f)
                lineTo(11.142f, 11.391f)
                curveTo(11.223f, 11.372f, 11.275f, 11.294f, 11.262f, 11.212f)
                curveTo(11.261f, 11.207f, 11.26f, 11.201f, 11.258f, 11.196f)
                curveTo(11.238f, 11.128f, 11.166f, 11.089f, 11.098f, 11.109f)
                close()
                moveTo(10.174f, 13.04f)
                lineTo(10.815f, 13.387f)
                curveTo(10.878f, 13.421f, 10.901f, 13.5f, 10.867f, 13.563f)
                curveTo(10.865f, 13.567f, 10.862f, 13.572f, 10.858f, 13.577f)
                curveTo(10.81f, 13.644f, 10.718f, 13.662f, 10.647f, 13.619f)
                lineTo(10.034f, 13.24f)
                curveTo(9.982f, 13.208f, 9.966f, 13.139f, 9.998f, 13.086f)
                curveTo(10.041f, 13.025f, 10.115f, 13.008f, 10.174f, 13.04f)
                close()
                moveTo(9.005f, 14.799f)
                lineTo(8.797f, 14.1f)
                curveTo(8.778f, 14.035f, 8.713f, 13.995f, 8.64f, 14.008f)
                curveTo(8.58f, 14.022f, 8.542f, 14.082f, 8.557f, 14.142f)
                lineTo(8.722f, 14.844f)
                curveTo(8.741f, 14.924f, 8.819f, 14.976f, 8.901f, 14.963f)
                curveTo(8.907f, 14.962f, 8.912f, 14.961f, 8.917f, 14.96f)
                curveTo(8.986f, 14.939f, 9.025f, 14.867f, 9.005f, 14.799f)
                close()
                moveTo(7.073f, 13.875f)
                lineTo(6.726f, 14.516f)
                curveTo(6.692f, 14.579f, 6.614f, 14.602f, 6.551f, 14.568f)
                curveTo(6.546f, 14.566f, 6.541f, 14.563f, 6.537f, 14.56f)
                curveTo(6.47f, 14.511f, 6.451f, 14.419f, 6.495f, 14.349f)
                lineTo(6.874f, 13.736f)
                curveTo(6.906f, 13.683f, 6.975f, 13.667f, 7.027f, 13.699f)
                curveTo(7.088f, 13.742f, 7.106f, 13.816f, 7.073f, 13.875f)
                close()
                moveTo(5.315f, 12.706f)
                lineTo(6.013f, 12.498f)
                curveTo(6.078f, 12.479f, 6.118f, 12.414f, 6.106f, 12.341f)
                curveTo(6.091f, 12.281f, 6.031f, 12.243f, 5.971f, 12.258f)
                lineTo(5.27f, 12.423f)
                curveTo(5.189f, 12.443f, 5.137f, 12.521f, 5.15f, 12.602f)
                curveTo(5.151f, 12.608f, 5.152f, 12.613f, 5.154f, 12.618f)
                curveTo(5.174f, 12.687f, 5.246f, 12.726f, 5.315f, 12.706f)
                close()
                moveTo(6.238f, 10.774f)
                lineTo(5.597f, 10.427f)
                curveTo(5.534f, 10.393f, 5.511f, 10.315f, 5.545f, 10.252f)
                curveTo(5.548f, 10.247f, 5.551f, 10.243f, 5.554f, 10.238f)
                curveTo(5.602f, 10.171f, 5.695f, 10.152f, 5.765f, 10.196f)
                lineTo(6.378f, 10.575f)
                curveTo(6.43f, 10.607f, 6.447f, 10.676f, 6.414f, 10.728f)
                curveTo(6.372f, 10.789f, 6.297f, 10.807f, 6.238f, 10.774f)
                close()
                moveTo(9.966f, 10.607f)
                curveTo(9.912f, 10.637f, 9.893f, 10.706f, 9.927f, 10.765f)
                curveTo(9.964f, 10.822f, 10.038f, 10.842f, 10.099f, 10.811f)
                lineTo(10.751f, 10.487f)
                curveTo(10.815f, 10.455f, 10.841f, 10.377f, 10.809f, 10.313f)
                curveTo(10.807f, 10.309f, 10.804f, 10.304f, 10.801f, 10.299f)
                curveTo(10.755f, 10.23f, 10.663f, 10.209f, 10.591f, 10.25f)
                lineTo(9.966f, 10.607f)
                close()
                moveTo(10.231f, 12.317f)
                curveTo(10.249f, 12.25f, 10.31f, 12.215f, 10.37f, 12.232f)
                lineTo(11.065f, 12.422f)
                curveTo(11.145f, 12.444f, 11.194f, 12.524f, 11.178f, 12.605f)
                curveTo(11.177f, 12.61f, 11.176f, 12.616f, 11.174f, 12.621f)
                curveTo(11.151f, 12.689f, 11.078f, 12.725f, 11.01f, 12.702f)
                lineTo(10.319f, 12.47f)
                curveTo(10.255f, 12.449f, 10.217f, 12.383f, 10.231f, 12.317f)
                close()
                moveTo(9.507f, 13.667f)
                curveTo(9.476f, 13.613f, 9.408f, 13.594f, 9.349f, 13.628f)
                curveTo(9.292f, 13.665f, 9.272f, 13.739f, 9.302f, 13.8f)
                lineTo(9.627f, 14.452f)
                curveTo(9.659f, 14.516f, 9.736f, 14.542f, 9.8f, 14.51f)
                curveTo(9.805f, 14.508f, 9.81f, 14.505f, 9.814f, 14.502f)
                curveTo(9.883f, 14.456f, 9.905f, 14.364f, 9.864f, 14.292f)
                lineTo(9.507f, 13.667f)
                close()
                moveTo(7.797f, 13.932f)
                curveTo(7.863f, 13.95f, 7.898f, 14.012f, 7.882f, 14.071f)
                lineTo(7.692f, 14.766f)
                curveTo(7.67f, 14.846f, 7.59f, 14.895f, 7.509f, 14.879f)
                curveTo(7.503f, 14.878f, 7.498f, 14.877f, 7.493f, 14.875f)
                curveTo(7.425f, 14.852f, 7.388f, 14.779f, 7.411f, 14.711f)
                lineTo(7.643f, 14.02f)
                curveTo(7.665f, 13.956f, 7.731f, 13.918f, 7.797f, 13.932f)
                close()
                moveTo(6.447f, 13.208f)
                curveTo(6.5f, 13.177f, 6.519f, 13.109f, 6.485f, 13.05f)
                curveTo(6.448f, 12.993f, 6.374f, 12.973f, 6.314f, 13.003f)
                lineTo(5.661f, 13.328f)
                curveTo(5.597f, 13.36f, 5.571f, 13.437f, 5.603f, 13.501f)
                curveTo(5.606f, 13.506f, 5.608f, 13.511f, 5.611f, 13.516f)
                curveTo(5.658f, 13.584f, 5.749f, 13.606f, 5.821f, 13.565f)
                lineTo(6.447f, 13.208f)
                close()
                moveTo(6.181f, 11.498f)
                curveTo(6.163f, 11.564f, 6.102f, 11.599f, 6.043f, 11.583f)
                lineTo(5.348f, 11.393f)
                curveTo(5.268f, 11.371f, 5.218f, 11.291f, 5.234f, 11.21f)
                curveTo(5.235f, 11.204f, 5.237f, 11.199f, 5.239f, 11.194f)
                curveTo(5.261f, 11.126f, 5.335f, 11.09f, 5.402f, 11.112f)
                lineTo(6.093f, 11.344f)
                curveTo(6.157f, 11.366f, 6.195f, 11.432f, 6.181f, 11.498f)
                close()
                moveTo(6.906f, 10.148f)
                curveTo(6.936f, 10.201f, 7.004f, 10.22f, 7.064f, 10.186f)
                curveTo(7.12f, 10.149f, 7.14f, 10.075f, 7.11f, 10.015f)
                lineTo(6.786f, 9.362f)
                curveTo(6.754f, 9.298f, 6.676f, 9.272f, 6.612f, 9.304f)
                curveTo(6.607f, 9.307f, 6.603f, 9.309f, 6.598f, 9.313f)
                curveTo(6.529f, 9.359f, 6.508f, 9.45f, 6.549f, 9.522f)
                lineTo(6.906f, 10.148f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PhilippinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Philippines,
            contentDescription = "Philippines Flag"
        )
    }
}
