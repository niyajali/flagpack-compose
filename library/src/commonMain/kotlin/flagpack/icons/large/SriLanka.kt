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
 * Sri Lanka Flag (32x24dp)
 *
 * - ISO Alpha-2: LK
 * - ISO Alpha-3: LKA
 * - ISO Numeric: 144
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SriLanka: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sri Lanka:LK:LKA:144:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F8A6E))) {
                moveTo(2f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF56800))) {
                moveTo(8f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB01D00))) {
                moveTo(14f, 2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE8AA00))) {
                moveTo(12f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.101f, 6.173f)
                curveTo(17.101f, 6.173f, 15.827f, 6.17f, 15.827f, 8.388f)
                verticalLineTo(11.64f)
                curveTo(15.827f, 11.64f, 15.22f, 11.748f, 15.22f, 12.125f)
                curveTo(15.22f, 12.501f, 15.349f, 12.831f, 15.588f, 12.831f)
                curveTo(15.827f, 12.831f, 16.066f, 13.936f, 15.827f, 13.936f)
                curveTo(15.588f, 13.936f, 15.349f, 14.41f, 15.588f, 14.41f)
                curveTo(15.645f, 14.41f, 15.689f, 14.402f, 15.722f, 14.396f)
                curveTo(15.756f, 14.39f, 15.78f, 14.386f, 15.795f, 14.395f)
                curveTo(15.827f, 14.413f, 15.827f, 14.486f, 15.827f, 14.705f)
                curveTo(15.827f, 15.135f, 15.588f, 15.31f, 15.588f, 15.31f)
                curveTo(15.588f, 15.31f, 15.363f, 15.247f, 15.363f, 15.5f)
                curveTo(15.363f, 15.753f, 15.588f, 15.818f, 15.588f, 15.818f)
                curveTo(15.588f, 15.818f, 15.717f, 15.873f, 15.469f, 15.993f)
                curveTo(15.22f, 16.113f, 15.22f, 16.171f, 15.22f, 16.171f)
                horizontalLineTo(15.827f)
                lineTo(16.131f, 16.727f)
                lineTo(16.42f, 16.171f)
                horizontalLineTo(17.019f)
                curveTo(17.019f, 16.171f, 16.717f, 15.979f, 16.682f, 15.938f)
                curveTo(16.647f, 15.898f, 16.604f, 15.839f, 16.682f, 15.771f)
                curveTo(16.705f, 15.752f, 16.738f, 15.736f, 16.774f, 15.72f)
                curveTo(16.861f, 15.681f, 16.962f, 15.635f, 16.962f, 15.5f)
                curveTo(16.962f, 15.31f, 16.58f, 15.31f, 16.58f, 15.31f)
                curveTo(16.58f, 15.31f, 16.347f, 14.889f, 16.42f, 14.705f)
                curveTo(16.441f, 14.653f, 16.452f, 14.608f, 16.462f, 14.569f)
                curveTo(16.488f, 14.467f, 16.503f, 14.41f, 16.628f, 14.41f)
                curveTo(16.802f, 14.41f, 16.902f, 14.19f, 16.682f, 13.936f)
                curveTo(16.682f, 13.936f, 16.934f, 14.207f, 16.86f, 14.558f)
                curveTo(16.786f, 14.91f, 16.937f, 15.069f, 17.019f, 15.069f)
                curveTo(17.101f, 15.069f, 17.231f, 14.948f, 17.231f, 14.948f)
                curveTo(17.231f, 14.948f, 17.91f, 15.555f, 18.209f, 15.555f)
                curveTo(18.507f, 15.555f, 18.935f, 15.069f, 18.935f, 15.069f)
                lineTo(19.55f, 15.414f)
                curveTo(19.55f, 15.414f, 20f, 16.044f, 19.934f, 16.478f)
                curveTo(19.867f, 16.911f, 19.611f, 17.152f, 19.309f, 17.085f)
                curveTo(19.007f, 17.018f, 18.516f, 17.156f, 18.479f, 17.343f)
                curveTo(18.473f, 17.371f, 18.465f, 17.406f, 18.456f, 17.443f)
                curveTo(18.404f, 17.656f, 18.327f, 17.973f, 18.563f, 17.895f)
                curveTo(18.842f, 17.802f, 18.897f, 17.732f, 18.897f, 17.732f)
                curveTo(18.897f, 17.732f, 18.86f, 17.895f, 19.085f, 17.895f)
                curveTo(19.309f, 17.895f, 19.374f, 17.732f, 19.374f, 17.732f)
                curveTo(19.374f, 17.732f, 19.607f, 17.895f, 19.77f, 17.895f)
                curveTo(19.934f, 17.895f, 20.117f, 17.769f, 20.117f, 17.769f)
                curveTo(20.117f, 17.769f, 20.237f, 17.956f, 20.504f, 17.895f)
                curveTo(20.77f, 17.834f, 20.972f, 17.138f, 20.778f, 16.982f)
                curveTo(20.778f, 16.982f, 21.421f, 16.889f, 21.586f, 16.33f)
                curveTo(21.586f, 16.33f, 20.964f, 16.321f, 21.028f, 15.938f)
                curveTo(21.092f, 15.555f, 21.421f, 15.31f, 21.421f, 15.31f)
                curveTo(21.421f, 15.31f, 22.366f, 14.852f, 22.773f, 14.705f)
                curveTo(23.18f, 14.558f, 23.857f, 14.41f, 24.024f, 14.41f)
                curveTo(24.092f, 14.41f, 24.141f, 14.569f, 24.207f, 14.785f)
                curveTo(24.303f, 15.099f, 24.436f, 15.534f, 24.72f, 15.771f)
                curveTo(25.198f, 16.171f, 24.872f, 17.085f, 24.872f, 17.085f)
                curveTo(24.872f, 17.085f, 23.808f, 17.193f, 23.808f, 17.481f)
                curveTo(23.808f, 17.769f, 23.825f, 17.895f, 24.024f, 17.895f)
                curveTo(24.223f, 17.895f, 24.219f, 17.732f, 24.219f, 17.732f)
                curveTo(24.219f, 17.732f, 24.338f, 17.895f, 24.529f, 17.895f)
                curveTo(24.72f, 17.895f, 24.872f, 17.732f, 24.872f, 17.732f)
                curveTo(24.872f, 17.732f, 24.923f, 17.895f, 25.173f, 17.895f)
                curveTo(25.423f, 17.895f, 25.422f, 17.732f, 25.422f, 17.732f)
                curveTo(25.422f, 17.732f, 25.467f, 17.895f, 25.687f, 17.895f)
                curveTo(25.908f, 17.895f, 26.361f, 17.732f, 26.361f, 17.732f)
                curveTo(26.361f, 17.732f, 26.432f, 17.895f, 26.661f, 17.895f)
                curveTo(26.89f, 17.895f, 26.895f, 17.732f, 26.895f, 17.732f)
                curveTo(26.895f, 17.732f, 27.018f, 17.895f, 27.216f, 17.895f)
                curveTo(27.414f, 17.895f, 27.531f, 17.732f, 27.531f, 17.732f)
                curveTo(27.531f, 17.732f, 27.816f, 17.895f, 28.013f, 17.895f)
                curveTo(28.21f, 17.895f, 28.139f, 17.6f, 28.013f, 17.343f)
                curveTo(27.981f, 17.278f, 27.944f, 17.222f, 27.91f, 17.171f)
                curveTo(27.811f, 17.021f, 27.739f, 16.913f, 27.908f, 16.727f)
                curveTo(27.955f, 16.674f, 28.01f, 16.621f, 28.065f, 16.567f)
                lineTo(28.065f, 16.567f)
                curveTo(28.27f, 16.368f, 28.475f, 16.169f, 28.325f, 15.993f)
                curveTo(28.28f, 15.941f, 28.228f, 15.905f, 28.175f, 15.868f)
                curveTo(28.003f, 15.749f, 27.827f, 15.627f, 27.908f, 14.948f)
                curveTo(27.956f, 14.541f, 28.048f, 14.211f, 28.133f, 13.904f)
                lineTo(28.133f, 13.904f)
                curveTo(28.233f, 13.542f, 28.325f, 13.213f, 28.325f, 12.831f)
                curveTo(28.325f, 12.125f, 27.908f, 11.317f, 27.908f, 11.317f)
                curveTo(27.908f, 11.317f, 28.469f, 10.925f, 28.469f, 10.128f)
                curveTo(28.469f, 9.33f, 27.216f, 9.243f, 27.216f, 9.243f)
                curveTo(27.216f, 9.243f, 25.971f, 9.564f, 25.422f, 9.404f)
                curveTo(25.298f, 9.368f, 25.194f, 9.342f, 25.107f, 9.32f)
                lineTo(25.107f, 9.32f)
                curveTo(24.811f, 9.246f, 24.72f, 9.223f, 24.72f, 9.017f)
                curveTo(24.72f, 8.752f, 24.32f, 9.243f, 24.32f, 9.243f)
                curveTo(24.32f, 9.243f, 24.006f, 9.118f, 24.219f, 8.857f)
                curveTo(24.433f, 8.597f, 24.529f, 8.495f, 24.529f, 8.495f)
                curveTo(24.529f, 8.495f, 24.341f, 8.281f, 24.024f, 8.388f)
                curveTo(23.707f, 8.495f, 23.651f, 8.672f, 23.651f, 8.672f)
                curveTo(23.651f, 8.672f, 23.289f, 8.302f, 23.514f, 8.034f)
                curveTo(23.74f, 7.765f, 24.024f, 8.034f, 24.024f, 8.034f)
                curveTo(24.024f, 8.034f, 24.348f, 8.203f, 24.374f, 7.981f)
                curveTo(24.4f, 7.759f, 24.374f, 7.582f, 24.374f, 7.582f)
                curveTo(24.374f, 7.582f, 25.186f, 7.815f, 24.956f, 8.177f)
                curveTo(24.727f, 8.54f, 24.872f, 8.672f, 24.872f, 8.672f)
                curveTo(24.872f, 8.672f, 25.43f, 8.706f, 25.531f, 8.321f)
                curveTo(25.569f, 8.176f, 25.563f, 8.035f, 25.535f, 7.924f)
                curveTo(25.696f, 7.999f, 25.878f, 8.089f, 25.827f, 8.238f)
                curveTo(25.734f, 8.512f, 25.531f, 8.857f, 25.531f, 8.857f)
                curveTo(25.531f, 8.857f, 26.089f, 8.825f, 26.255f, 8.388f)
                curveTo(26.421f, 7.951f, 26.361f, 8.495f, 26.361f, 8.495f)
                curveTo(26.361f, 8.495f, 26.574f, 8.487f, 26.895f, 8.672f)
                curveTo(27.216f, 8.857f, 26.895f, 8.388f, 26.895f, 8.388f)
                curveTo(26.895f, 8.388f, 27.561f, 9.213f, 28.191f, 9.115f)
                curveTo(28.821f, 9.017f, 28.786f, 8.495f, 28.786f, 8.495f)
                curveTo(28.786f, 8.495f, 28.637f, 8.238f, 28.325f, 8.238f)
                curveTo(28.013f, 8.238f, 28.191f, 8.495f, 28.191f, 8.495f)
                curveTo(28.191f, 8.495f, 28.495f, 8.668f, 28.013f, 8.495f)
                curveTo(27.873f, 8.445f, 27.665f, 8.283f, 27.406f, 8.082f)
                curveTo(26.772f, 7.589f, 25.836f, 6.862f, 24.872f, 6.973f)
                curveTo(23.514f, 7.13f, 23.041f, 7.736f, 23.041f, 7.736f)
                verticalLineTo(7.231f)
                curveTo(23.041f, 7.231f, 22.813f, 7.582f, 22.6f, 7.582f)
                curveTo(22.387f, 7.582f, 21.797f, 7.231f, 21.797f, 7.231f)
                lineTo(21.421f, 7.582f)
                curveTo(21.421f, 7.582f, 21.278f, 7.231f, 21.028f, 7.231f)
                curveTo(20.778f, 7.231f, 20.778f, 7.582f, 20.778f, 7.582f)
                curveTo(20.778f, 7.582f, 20.463f, 7.428f, 20.117f, 7.428f)
                curveTo(19.975f, 7.428f, 19.854f, 7.376f, 19.761f, 7.336f)
                curveTo(19.627f, 7.278f, 19.55f, 7.245f, 19.55f, 7.428f)
                curveTo(19.55f, 7.465f, 19.551f, 7.5f, 19.552f, 7.533f)
                verticalLineTo(7.534f)
                curveTo(19.558f, 7.78f, 19.562f, 7.934f, 19.202f, 7.981f)
                curveTo(18.794f, 8.034f, 18.479f, 8.034f, 18.479f, 8.034f)
                curveTo(18.479f, 8.034f, 18.235f, 7.736f, 18.045f, 7.736f)
                curveTo(17.855f, 7.736f, 17.634f, 7.967f, 17.634f, 8.177f)
                curveTo(17.634f, 8.388f, 17.881f, 8.987f, 18.045f, 9.115f)
                curveTo(18.088f, 9.149f, 18.08f, 9.145f, 18.045f, 9.129f)
                curveTo(17.946f, 9.084f, 17.634f, 8.94f, 17.634f, 9.243f)
                curveTo(17.634f, 9.453f, 17.687f, 9.505f, 17.725f, 9.543f)
                curveTo(17.762f, 9.58f, 17.785f, 9.604f, 17.736f, 9.744f)
                curveTo(17.715f, 9.803f, 17.686f, 9.87f, 17.657f, 9.941f)
                curveTo(17.541f, 10.215f, 17.407f, 10.533f, 17.634f, 10.533f)
                curveTo(17.757f, 10.533f, 17.873f, 10.506f, 17.955f, 10.487f)
                lineTo(17.955f, 10.487f)
                curveTo(18.065f, 10.461f, 18.116f, 10.449f, 18.045f, 10.533f)
                curveTo(18.016f, 10.566f, 17.978f, 10.606f, 17.94f, 10.647f)
                curveTo(17.809f, 10.784f, 17.674f, 10.925f, 17.907f, 10.818f)
                curveTo(18.03f, 10.762f, 18.133f, 10.68f, 18.218f, 10.613f)
                curveTo(18.343f, 10.514f, 18.429f, 10.446f, 18.479f, 10.533f)
                curveTo(18.511f, 10.588f, 18.485f, 10.661f, 18.464f, 10.724f)
                curveTo(18.427f, 10.829f, 18.401f, 10.905f, 18.664f, 10.818f)
                curveTo(18.756f, 10.788f, 18.81f, 10.764f, 18.84f, 10.747f)
                curveTo(18.841f, 10.764f, 18.855f, 10.788f, 18.897f, 10.818f)
                curveTo(18.985f, 10.883f, 18.968f, 10.944f, 18.955f, 10.991f)
                curveTo(18.94f, 11.044f, 18.931f, 11.079f, 19.085f, 11.079f)
                curveTo(19.232f, 11.079f, 19.439f, 10.965f, 19.562f, 10.897f)
                curveTo(19.681f, 10.832f, 19.721f, 10.81f, 19.55f, 10.977f)
                curveTo(19.442f, 11.082f, 19.286f, 11.153f, 19.113f, 11.231f)
                curveTo(18.728f, 11.404f, 18.258f, 11.616f, 18.045f, 12.339f)
                curveTo(17.757f, 13.314f, 17.886f, 13.515f, 17.905f, 13.538f)
                lineTo(17.019f, 12.568f)
                curveTo(17.019f, 12.568f, 17.231f, 12.402f, 17.231f, 12.125f)
                curveTo(17.231f, 11.847f, 16.682f, 11.64f, 16.682f, 11.64f)
                curveTo(16.682f, 11.64f, 16.701f, 8.182f, 16.86f, 7.428f)
                curveTo(17.019f, 6.673f, 17.101f, 6.173f, 17.101f, 6.173f)
                close()
                moveTo(17.905f, 13.538f)
                lineTo(17.907f, 13.541f)
                curveTo(17.907f, 13.541f, 17.907f, 13.54f, 17.906f, 13.54f)
                curveTo(17.906f, 13.539f, 17.905f, 13.539f, 17.905f, 13.538f)
                close()
                moveTo(18.868f, 10.714f)
                curveTo(18.858f, 10.714f, 18.838f, 10.725f, 18.84f, 10.747f)
                curveTo(18.878f, 10.725f, 18.878f, 10.714f, 18.868f, 10.714f)
                close()
                moveTo(25.535f, 7.924f)
                lineTo(25.523f, 7.918f)
                curveTo(25.393f, 7.857f, 25.282f, 7.805f, 25.325f, 7.736f)
                curveTo(25.385f, 7.641f, 25.489f, 7.741f, 25.535f, 7.924f)
                close()
                moveTo(26.121f, 15.406f)
                curveTo(26.121f, 15.406f, 25.701f, 15.818f, 25.968f, 15.908f)
                curveTo(26.049f, 15.936f, 26.147f, 15.951f, 26.239f, 15.965f)
                curveTo(26.449f, 15.998f, 26.622f, 16.025f, 26.463f, 16.18f)
                curveTo(26.235f, 16.403f, 26.041f, 16.705f, 26.041f, 16.98f)
                curveTo(26.041f, 17.254f, 26.048f, 17.486f, 26.121f, 17.37f)
                curveTo(26.162f, 17.307f, 26.327f, 17.24f, 26.506f, 17.168f)
                curveTo(26.653f, 17.109f, 26.808f, 17.047f, 26.91f, 16.98f)
                curveTo(27.102f, 16.853f, 27.099f, 16.716f, 27.094f, 16.469f)
                curveTo(27.093f, 16.427f, 27.092f, 16.381f, 27.092f, 16.331f)
                curveTo(27.092f, 15.994f, 26.121f, 15.406f, 26.121f, 15.406f)
                close()
                moveTo(22.863f, 9.89f)
                curveTo(22.961f, 9.812f, 22.967f, 8.852f, 22.967f, 8.852f)
                curveTo(22.967f, 8.852f, 23.31f, 8.966f, 23.31f, 9.116f)
                curveTo(23.31f, 9.209f, 23.285f, 9.263f, 23.245f, 9.343f)
                curveTo(23.222f, 9.392f, 23.193f, 9.451f, 23.162f, 9.535f)
                curveTo(23.087f, 9.741f, 23.292f, 9.87f, 23.483f, 9.99f)
                curveTo(23.497f, 10f, 23.512f, 10.009f, 23.526f, 10.018f)
                curveTo(23.655f, 10.1f, 23.692f, 9.921f, 23.72f, 9.783f)
                curveTo(23.735f, 9.707f, 23.748f, 9.643f, 23.773f, 9.643f)
                curveTo(23.843f, 9.643f, 24.363f, 9.761f, 24.755f, 9.96f)
                curveTo(25.097f, 10.133f, 25.432f, 10.048f, 26.2f, 9.853f)
                curveTo(26.312f, 9.824f, 26.434f, 9.793f, 26.566f, 9.761f)
                curveTo(27.601f, 9.504f, 27.737f, 9.89f, 27.844f, 10.193f)
                curveTo(27.95f, 10.497f, 27.146f, 10.918f, 26.566f, 10.994f)
                curveTo(26.311f, 11.028f, 26.09f, 11.017f, 25.887f, 11.007f)
                curveTo(25.628f, 10.995f, 25.397f, 10.984f, 25.162f, 11.068f)
                curveTo(24.792f, 11.199f, 23.636f, 11.186f, 23.185f, 11.181f)
                curveTo(23.123f, 11.18f, 23.074f, 11.18f, 23.043f, 11.18f)
                curveTo(22.836f, 11.18f, 22.797f, 11.114f, 22.718f, 10.983f)
                curveTo(22.698f, 10.95f, 22.675f, 10.912f, 22.647f, 10.87f)
                curveTo(22.506f, 10.664f, 22.677f, 10.529f, 22.788f, 10.529f)
                curveTo(22.898f, 10.529f, 22.863f, 10.287f, 22.788f, 10.193f)
                curveTo(22.712f, 10.1f, 22.765f, 9.967f, 22.863f, 9.89f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.171f, 2.122f)
                verticalLineTo(2.483f)
                curveTo(14.171f, 2.528f, 14.152f, 2.588f, 14.13f, 2.656f)
                curveTo(14.062f, 2.872f, 13.971f, 3.161f, 14.393f, 3.242f)
                curveTo(14.949f, 3.349f, 15.358f, 3.592f, 15.482f, 3.821f)
                curveTo(15.562f, 3.968f, 15.54f, 3.724f, 15.513f, 3.435f)
                verticalLineTo(3.435f)
                curveTo(15.498f, 3.274f, 15.482f, 3.099f, 15.482f, 2.972f)
                curveTo(15.482f, 2.618f, 15.086f, 1.928f, 14.805f, 2.122f)
                curveTo(14.524f, 2.317f, 14.171f, 2.122f, 14.171f, 2.122f)
                close()
                moveTo(14.171f, 21.507f)
                verticalLineTo(21.868f)
                curveTo(14.171f, 21.868f, 14.524f, 21.674f, 14.805f, 21.868f)
                curveTo(15.086f, 22.063f, 15.482f, 21.373f, 15.482f, 21.019f)
                curveTo(15.482f, 20.892f, 15.498f, 20.717f, 15.513f, 20.555f)
                curveTo(15.54f, 20.267f, 15.562f, 20.022f, 15.482f, 20.169f)
                curveTo(15.358f, 20.399f, 14.949f, 20.642f, 14.393f, 20.748f)
                curveTo(13.971f, 20.83f, 14.062f, 21.119f, 14.13f, 21.334f)
                curveTo(14.152f, 21.402f, 14.171f, 21.463f, 14.171f, 21.507f)
                close()
                moveTo(29.836f, 21.507f)
                verticalLineTo(21.868f)
                curveTo(29.836f, 21.868f, 29.483f, 21.674f, 29.202f, 21.868f)
                curveTo(28.921f, 22.063f, 28.524f, 21.373f, 28.524f, 21.019f)
                curveTo(28.524f, 20.892f, 28.508f, 20.717f, 28.494f, 20.555f)
                lineTo(28.494f, 20.555f)
                curveTo(28.467f, 20.267f, 28.445f, 20.022f, 28.524f, 20.169f)
                curveTo(28.649f, 20.399f, 29.058f, 20.642f, 29.614f, 20.748f)
                curveTo(30.036f, 20.83f, 29.944f, 21.119f, 29.876f, 21.334f)
                curveTo(29.855f, 21.402f, 29.836f, 21.463f, 29.836f, 21.507f)
                close()
                moveTo(29.836f, 2.483f)
                verticalLineTo(2.122f)
                curveTo(29.836f, 2.122f, 29.483f, 2.317f, 29.202f, 2.122f)
                curveTo(28.921f, 1.928f, 28.524f, 2.618f, 28.524f, 2.972f)
                curveTo(28.524f, 3.099f, 28.508f, 3.274f, 28.494f, 3.435f)
                curveTo(28.467f, 3.724f, 28.445f, 3.968f, 28.524f, 3.821f)
                curveTo(28.649f, 3.592f, 29.058f, 3.349f, 29.614f, 3.242f)
                curveTo(30.036f, 3.161f, 29.944f, 2.872f, 29.876f, 2.656f)
                curveTo(29.855f, 2.588f, 29.836f, 2.528f, 29.836f, 2.483f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SriLankaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SriLanka,
            contentDescription = "Sri Lanka Flag"
        )
    }
}
