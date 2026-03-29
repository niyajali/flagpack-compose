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
 * Sri Lanka Flag (20x15dp)
 *
 * - ISO Alpha-2: LK
 * - ISO Alpha-3: LKA
 * - ISO Numeric: 144
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SriLanka: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sri Lanka:LK:LKA:144:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1F8A6E))) {
                moveTo(1.25f, 1.25f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF56800))) {
                moveTo(5f, 1.25f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB01D00))) {
                moveTo(8.75f, 1.25f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE8AA00))) {
                moveTo(7.5f, 1.25f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.688f, 3.858f)
                curveTo(10.688f, 3.858f, 9.892f, 3.856f, 9.892f, 5.242f)
                verticalLineTo(7.275f)
                curveTo(9.892f, 7.275f, 9.513f, 7.342f, 9.513f, 7.578f)
                curveTo(9.513f, 7.813f, 9.593f, 8.019f, 9.742f, 8.019f)
                curveTo(9.892f, 8.019f, 10.041f, 8.71f, 9.892f, 8.71f)
                curveTo(9.742f, 8.71f, 9.593f, 9.006f, 9.742f, 9.006f)
                curveTo(9.778f, 9.006f, 9.805f, 9.001f, 9.826f, 8.998f)
                curveTo(9.848f, 8.994f, 9.862f, 8.991f, 9.872f, 8.997f)
                curveTo(9.892f, 9.008f, 9.892f, 9.054f, 9.892f, 9.191f)
                curveTo(9.892f, 9.46f, 9.742f, 9.568f, 9.742f, 9.568f)
                curveTo(9.742f, 9.568f, 9.602f, 9.529f, 9.602f, 9.688f)
                curveTo(9.602f, 9.846f, 9.742f, 9.886f, 9.742f, 9.886f)
                curveTo(9.742f, 9.886f, 9.823f, 9.921f, 9.668f, 9.996f)
                curveTo(9.513f, 10.071f, 9.513f, 10.107f, 9.513f, 10.107f)
                horizontalLineTo(9.892f)
                lineTo(10.082f, 10.454f)
                lineTo(10.263f, 10.107f)
                horizontalLineTo(10.637f)
                curveTo(10.637f, 10.107f, 10.448f, 9.987f, 10.426f, 9.961f)
                curveTo(10.404f, 9.936f, 10.377f, 9.899f, 10.426f, 9.857f)
                curveTo(10.441f, 9.845f, 10.461f, 9.835f, 10.484f, 9.825f)
                curveTo(10.538f, 9.801f, 10.601f, 9.772f, 10.601f, 9.688f)
                curveTo(10.601f, 9.568f, 10.363f, 9.568f, 10.363f, 9.568f)
                curveTo(10.363f, 9.568f, 10.217f, 9.305f, 10.263f, 9.191f)
                curveTo(10.275f, 9.158f, 10.283f, 9.13f, 10.289f, 9.105f)
                curveTo(10.305f, 9.042f, 10.314f, 9.006f, 10.392f, 9.006f)
                curveTo(10.501f, 9.006f, 10.564f, 8.869f, 10.426f, 8.71f)
                curveTo(10.426f, 8.71f, 10.584f, 8.879f, 10.537f, 9.099f)
                curveTo(10.491f, 9.318f, 10.586f, 9.418f, 10.637f, 9.418f)
                curveTo(10.688f, 9.418f, 10.769f, 9.342f, 10.769f, 9.342f)
                curveTo(10.769f, 9.342f, 11.194f, 9.722f, 11.38f, 9.722f)
                curveTo(11.567f, 9.722f, 11.835f, 9.418f, 11.835f, 9.418f)
                lineTo(12.219f, 9.634f)
                curveTo(12.219f, 9.634f, 12.5f, 10.028f, 12.459f, 10.299f)
                curveTo(12.417f, 10.569f, 12.257f, 10.72f, 12.068f, 10.678f)
                curveTo(11.88f, 10.637f, 11.573f, 10.722f, 11.549f, 10.839f)
                curveTo(11.546f, 10.857f, 11.541f, 10.878f, 11.535f, 10.902f)
                lineTo(11.535f, 10.902f)
                curveTo(11.502f, 11.035f, 11.454f, 11.233f, 11.602f, 11.184f)
                curveTo(11.776f, 11.127f, 11.81f, 11.082f, 11.81f, 11.082f)
                curveTo(11.81f, 11.082f, 11.788f, 11.184f, 11.928f, 11.184f)
                curveTo(12.068f, 11.184f, 12.109f, 11.082f, 12.109f, 11.082f)
                curveTo(12.109f, 11.082f, 12.254f, 11.184f, 12.356f, 11.184f)
                curveTo(12.459f, 11.184f, 12.573f, 11.106f, 12.573f, 11.106f)
                curveTo(12.573f, 11.106f, 12.648f, 11.222f, 12.815f, 11.184f)
                curveTo(12.981f, 11.146f, 13.107f, 10.711f, 12.986f, 10.614f)
                curveTo(12.986f, 10.614f, 13.388f, 10.556f, 13.491f, 10.206f)
                curveTo(13.491f, 10.206f, 13.102f, 10.2f, 13.142f, 9.961f)
                curveTo(13.183f, 9.722f, 13.388f, 9.568f, 13.388f, 9.568f)
                curveTo(13.388f, 9.568f, 13.979f, 9.282f, 14.233f, 9.191f)
                curveTo(14.488f, 9.099f, 14.91f, 9.006f, 15.015f, 9.006f)
                curveTo(15.058f, 9.006f, 15.088f, 9.106f, 15.129f, 9.24f)
                curveTo(15.189f, 9.437f, 15.273f, 9.709f, 15.45f, 9.857f)
                curveTo(15.749f, 10.107f, 15.545f, 10.678f, 15.545f, 10.678f)
                curveTo(15.545f, 10.678f, 14.88f, 10.745f, 14.88f, 10.925f)
                curveTo(14.88f, 11.106f, 14.89f, 11.184f, 15.015f, 11.184f)
                curveTo(15.14f, 11.184f, 15.137f, 11.082f, 15.137f, 11.082f)
                curveTo(15.137f, 11.082f, 15.211f, 11.184f, 15.33f, 11.184f)
                curveTo(15.45f, 11.184f, 15.545f, 11.082f, 15.545f, 11.082f)
                curveTo(15.545f, 11.082f, 15.577f, 11.184f, 15.733f, 11.184f)
                curveTo(15.89f, 11.184f, 15.889f, 11.082f, 15.889f, 11.082f)
                curveTo(15.889f, 11.082f, 15.917f, 11.184f, 16.055f, 11.184f)
                curveTo(16.192f, 11.184f, 16.476f, 11.082f, 16.476f, 11.082f)
                curveTo(16.476f, 11.082f, 16.52f, 11.184f, 16.663f, 11.184f)
                curveTo(16.806f, 11.184f, 16.809f, 11.082f, 16.809f, 11.082f)
                curveTo(16.809f, 11.082f, 16.886f, 11.184f, 17.01f, 11.184f)
                curveTo(17.134f, 11.184f, 17.207f, 11.082f, 17.207f, 11.082f)
                curveTo(17.207f, 11.082f, 17.385f, 11.184f, 17.508f, 11.184f)
                curveTo(17.631f, 11.184f, 17.587f, 11f, 17.508f, 10.839f)
                curveTo(17.488f, 10.799f, 17.465f, 10.764f, 17.444f, 10.732f)
                curveTo(17.382f, 10.638f, 17.337f, 10.571f, 17.442f, 10.454f)
                curveTo(17.472f, 10.421f, 17.506f, 10.388f, 17.541f, 10.355f)
                lineTo(17.541f, 10.355f)
                curveTo(17.669f, 10.23f, 17.797f, 10.105f, 17.703f, 9.996f)
                curveTo(17.675f, 9.963f, 17.642f, 9.941f, 17.609f, 9.918f)
                curveTo(17.502f, 9.843f, 17.392f, 9.767f, 17.442f, 9.342f)
                curveTo(17.472f, 9.088f, 17.53f, 8.882f, 17.583f, 8.69f)
                lineTo(17.583f, 8.69f)
                curveTo(17.646f, 8.464f, 17.703f, 8.258f, 17.703f, 8.019f)
                curveTo(17.703f, 7.578f, 17.442f, 7.073f, 17.442f, 7.073f)
                curveTo(17.442f, 7.073f, 17.793f, 6.828f, 17.793f, 6.33f)
                curveTo(17.793f, 5.832f, 17.01f, 5.777f, 17.01f, 5.777f)
                curveTo(17.01f, 5.777f, 16.232f, 5.977f, 15.889f, 5.877f)
                curveTo(15.811f, 5.855f, 15.746f, 5.838f, 15.692f, 5.825f)
                curveTo(15.507f, 5.779f, 15.45f, 5.764f, 15.45f, 5.636f)
                curveTo(15.45f, 5.47f, 15.2f, 5.777f, 15.2f, 5.777f)
                curveTo(15.2f, 5.777f, 15.004f, 5.699f, 15.137f, 5.536f)
                curveTo(15.27f, 5.373f, 15.33f, 5.309f, 15.33f, 5.309f)
                curveTo(15.33f, 5.309f, 15.213f, 5.175f, 15.015f, 5.242f)
                curveTo(14.817f, 5.309f, 14.782f, 5.42f, 14.782f, 5.42f)
                curveTo(14.782f, 5.42f, 14.556f, 5.189f, 14.696f, 5.021f)
                curveTo(14.837f, 4.853f, 15.015f, 5.021f, 15.015f, 5.021f)
                curveTo(15.015f, 5.021f, 15.217f, 5.127f, 15.234f, 4.988f)
                curveTo(15.25f, 4.849f, 15.234f, 4.739f, 15.234f, 4.739f)
                curveTo(15.234f, 4.739f, 15.741f, 4.884f, 15.598f, 5.111f)
                curveTo(15.454f, 5.337f, 15.545f, 5.42f, 15.545f, 5.42f)
                curveTo(15.545f, 5.42f, 15.894f, 5.442f, 15.957f, 5.201f)
                curveTo(15.981f, 5.11f, 15.977f, 5.022f, 15.959f, 4.952f)
                curveTo(16.06f, 5f, 16.174f, 5.056f, 16.142f, 5.149f)
                curveTo(16.083f, 5.32f, 15.957f, 5.536f, 15.957f, 5.536f)
                curveTo(15.957f, 5.536f, 16.305f, 5.515f, 16.409f, 5.242f)
                curveTo(16.513f, 4.969f, 16.476f, 5.309f, 16.476f, 5.309f)
                curveTo(16.476f, 5.309f, 16.609f, 5.304f, 16.809f, 5.42f)
                curveTo(17.01f, 5.536f, 16.809f, 5.242f, 16.809f, 5.242f)
                curveTo(16.809f, 5.242f, 17.226f, 5.758f, 17.619f, 5.697f)
                curveTo(18.013f, 5.636f, 17.991f, 5.309f, 17.991f, 5.309f)
                curveTo(17.991f, 5.309f, 17.898f, 5.149f, 17.703f, 5.149f)
                curveTo(17.508f, 5.149f, 17.619f, 5.309f, 17.619f, 5.309f)
                curveTo(17.619f, 5.309f, 17.809f, 5.417f, 17.508f, 5.309f)
                curveTo(17.421f, 5.278f, 17.291f, 5.177f, 17.129f, 5.051f)
                lineTo(17.129f, 5.051f)
                curveTo(16.733f, 4.743f, 16.148f, 4.288f, 15.545f, 4.358f)
                curveTo(14.696f, 4.456f, 14.401f, 4.835f, 14.401f, 4.835f)
                verticalLineTo(4.52f)
                curveTo(14.401f, 4.52f, 14.258f, 4.739f, 14.125f, 4.739f)
                curveTo(13.992f, 4.739f, 13.623f, 4.52f, 13.623f, 4.52f)
                lineTo(13.388f, 4.739f)
                curveTo(13.388f, 4.739f, 13.299f, 4.52f, 13.142f, 4.52f)
                curveTo(12.986f, 4.52f, 12.986f, 4.739f, 12.986f, 4.739f)
                curveTo(12.986f, 4.739f, 12.79f, 4.642f, 12.573f, 4.642f)
                curveTo(12.484f, 4.642f, 12.409f, 4.61f, 12.351f, 4.585f)
                curveTo(12.267f, 4.549f, 12.219f, 4.528f, 12.219f, 4.642f)
                curveTo(12.219f, 4.665f, 12.219f, 4.687f, 12.22f, 4.708f)
                verticalLineTo(4.708f)
                curveTo(12.224f, 4.863f, 12.226f, 4.959f, 12.002f, 4.988f)
                curveTo(11.746f, 5.021f, 11.549f, 5.021f, 11.549f, 5.021f)
                curveTo(11.549f, 5.021f, 11.397f, 4.835f, 11.278f, 4.835f)
                curveTo(11.159f, 4.835f, 11.021f, 4.979f, 11.021f, 5.111f)
                curveTo(11.021f, 5.242f, 11.175f, 5.617f, 11.278f, 5.697f)
                curveTo(11.305f, 5.718f, 11.3f, 5.716f, 11.278f, 5.706f)
                curveTo(11.216f, 5.677f, 11.021f, 5.588f, 11.021f, 5.777f)
                curveTo(11.021f, 5.908f, 11.054f, 5.941f, 11.078f, 5.964f)
                curveTo(11.101f, 5.988f, 11.116f, 6.002f, 11.085f, 6.09f)
                curveTo(11.072f, 6.127f, 11.054f, 6.169f, 11.035f, 6.213f)
                curveTo(10.963f, 6.384f, 10.88f, 6.583f, 11.021f, 6.583f)
                curveTo(11.098f, 6.583f, 11.171f, 6.566f, 11.222f, 6.554f)
                curveTo(11.291f, 6.538f, 11.322f, 6.531f, 11.278f, 6.583f)
                curveTo(11.26f, 6.604f, 11.236f, 6.629f, 11.212f, 6.654f)
                lineTo(11.212f, 6.654f)
                curveTo(11.13f, 6.74f, 11.046f, 6.828f, 11.192f, 6.761f)
                curveTo(11.269f, 6.726f, 11.333f, 6.675f, 11.387f, 6.633f)
                curveTo(11.464f, 6.571f, 11.518f, 6.529f, 11.549f, 6.583f)
                curveTo(11.569f, 6.617f, 11.553f, 6.663f, 11.54f, 6.703f)
                curveTo(11.517f, 6.768f, 11.501f, 6.816f, 11.665f, 6.761f)
                curveTo(11.722f, 6.742f, 11.756f, 6.728f, 11.775f, 6.717f)
                curveTo(11.776f, 6.728f, 11.785f, 6.742f, 11.81f, 6.761f)
                curveTo(11.866f, 6.802f, 11.855f, 6.84f, 11.847f, 6.869f)
                curveTo(11.838f, 6.903f, 11.832f, 6.924f, 11.928f, 6.924f)
                curveTo(12.02f, 6.924f, 12.149f, 6.853f, 12.226f, 6.811f)
                curveTo(12.301f, 6.77f, 12.326f, 6.756f, 12.219f, 6.861f)
                curveTo(12.151f, 6.926f, 12.054f, 6.97f, 11.946f, 7.019f)
                curveTo(11.705f, 7.128f, 11.411f, 7.26f, 11.278f, 7.712f)
                curveTo(11.098f, 8.321f, 11.179f, 8.447f, 11.191f, 8.461f)
                lineTo(10.637f, 7.855f)
                curveTo(10.637f, 7.855f, 10.769f, 7.751f, 10.769f, 7.578f)
                curveTo(10.769f, 7.404f, 10.426f, 7.275f, 10.426f, 7.275f)
                curveTo(10.426f, 7.275f, 10.438f, 5.114f, 10.537f, 4.642f)
                curveTo(10.637f, 4.171f, 10.688f, 3.858f, 10.688f, 3.858f)
                close()
                moveTo(11.792f, 6.696f)
                curveTo(11.786f, 6.696f, 11.774f, 6.703f, 11.775f, 6.717f)
                curveTo(11.799f, 6.703f, 11.799f, 6.696f, 11.792f, 6.696f)
                close()
                moveTo(15.959f, 4.952f)
                lineTo(15.952f, 4.949f)
                curveTo(15.871f, 4.911f, 15.801f, 4.878f, 15.828f, 4.835f)
                curveTo(15.866f, 4.775f, 15.931f, 4.838f, 15.959f, 4.952f)
                close()
                moveTo(16.326f, 9.629f)
                curveTo(16.326f, 9.629f, 16.063f, 9.886f, 16.23f, 9.943f)
                curveTo(16.281f, 9.96f, 16.342f, 9.969f, 16.399f, 9.978f)
                curveTo(16.53f, 9.999f, 16.639f, 10.016f, 16.539f, 10.113f)
                curveTo(16.397f, 10.252f, 16.276f, 10.441f, 16.276f, 10.612f)
                curveTo(16.276f, 10.784f, 16.28f, 10.929f, 16.326f, 10.856f)
                curveTo(16.351f, 10.817f, 16.455f, 10.775f, 16.566f, 10.73f)
                curveTo(16.658f, 10.693f, 16.755f, 10.654f, 16.819f, 10.612f)
                curveTo(16.939f, 10.533f, 16.937f, 10.447f, 16.934f, 10.293f)
                verticalLineTo(10.293f)
                curveTo(16.933f, 10.267f, 16.933f, 10.238f, 16.933f, 10.207f)
                curveTo(16.933f, 9.996f, 16.326f, 9.629f, 16.326f, 9.629f)
                close()
                moveTo(14.289f, 6.181f)
                curveTo(14.351f, 6.132f, 14.354f, 5.532f, 14.354f, 5.532f)
                curveTo(14.354f, 5.532f, 14.569f, 5.604f, 14.569f, 5.697f)
                curveTo(14.569f, 5.756f, 14.553f, 5.789f, 14.528f, 5.84f)
                curveTo(14.514f, 5.87f, 14.496f, 5.907f, 14.476f, 5.959f)
                curveTo(14.429f, 6.088f, 14.558f, 6.169f, 14.677f, 6.244f)
                curveTo(14.686f, 6.25f, 14.695f, 6.255f, 14.704f, 6.261f)
                curveTo(14.785f, 6.313f, 14.807f, 6.201f, 14.825f, 6.115f)
                curveTo(14.835f, 6.067f, 14.843f, 6.027f, 14.858f, 6.027f)
                curveTo(14.902f, 6.027f, 15.227f, 6.1f, 15.472f, 6.225f)
                curveTo(15.685f, 6.333f, 15.895f, 6.28f, 16.375f, 6.158f)
                curveTo(16.445f, 6.14f, 16.521f, 6.121f, 16.604f, 6.1f)
                curveTo(17.251f, 5.94f, 17.336f, 6.181f, 17.402f, 6.371f)
                curveTo(17.469f, 6.561f, 16.966f, 6.824f, 16.604f, 6.872f)
                curveTo(16.444f, 6.892f, 16.306f, 6.886f, 16.179f, 6.88f)
                curveTo(16.017f, 6.872f, 15.873f, 6.865f, 15.726f, 6.917f)
                curveTo(15.495f, 6.999f, 14.773f, 6.991f, 14.491f, 6.988f)
                curveTo(14.452f, 6.988f, 14.421f, 6.987f, 14.402f, 6.987f)
                curveTo(14.272f, 6.987f, 14.248f, 6.946f, 14.199f, 6.864f)
                curveTo(14.186f, 6.844f, 14.172f, 6.82f, 14.154f, 6.794f)
                curveTo(14.066f, 6.665f, 14.173f, 6.581f, 14.242f, 6.581f)
                curveTo(14.311f, 6.581f, 14.289f, 6.43f, 14.242f, 6.371f)
                curveTo(14.195f, 6.312f, 14.228f, 6.23f, 14.289f, 6.181f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.857f, 1.326f)
                verticalLineTo(1.552f)
                curveTo(8.857f, 1.58f, 8.845f, 1.618f, 8.832f, 1.66f)
                curveTo(8.789f, 1.795f, 8.732f, 1.976f, 8.996f, 2.026f)
                curveTo(9.343f, 2.093f, 9.599f, 2.245f, 9.677f, 2.388f)
                curveTo(9.726f, 2.48f, 9.712f, 2.327f, 9.696f, 2.147f)
                curveTo(9.687f, 2.046f, 9.677f, 1.937f, 9.677f, 1.857f)
                curveTo(9.677f, 1.636f, 9.429f, 1.205f, 9.253f, 1.326f)
                curveTo(9.077f, 1.448f, 8.857f, 1.326f, 8.857f, 1.326f)
                close()
                moveTo(8.857f, 13.442f)
                verticalLineTo(13.668f)
                curveTo(8.857f, 13.668f, 9.077f, 13.546f, 9.253f, 13.668f)
                curveTo(9.429f, 13.789f, 9.677f, 13.358f, 9.677f, 13.137f)
                curveTo(9.677f, 13.057f, 9.687f, 12.948f, 9.696f, 12.847f)
                curveTo(9.712f, 12.667f, 9.726f, 12.514f, 9.677f, 12.606f)
                curveTo(9.599f, 12.749f, 9.343f, 12.901f, 8.996f, 12.968f)
                curveTo(8.732f, 13.019f, 8.789f, 13.199f, 8.832f, 13.334f)
                curveTo(8.845f, 13.376f, 8.857f, 13.414f, 8.857f, 13.442f)
                close()
                moveTo(18.647f, 13.442f)
                verticalLineTo(13.668f)
                curveTo(18.647f, 13.668f, 18.427f, 13.546f, 18.251f, 13.668f)
                curveTo(18.076f, 13.789f, 17.828f, 13.358f, 17.828f, 13.137f)
                curveTo(17.828f, 13.057f, 17.818f, 12.948f, 17.809f, 12.847f)
                curveTo(17.792f, 12.667f, 17.778f, 12.514f, 17.828f, 12.606f)
                curveTo(17.906f, 12.749f, 18.161f, 12.901f, 18.508f, 12.968f)
                curveTo(18.772f, 13.019f, 18.715f, 13.199f, 18.673f, 13.334f)
                curveTo(18.659f, 13.376f, 18.647f, 13.414f, 18.647f, 13.442f)
                close()
                moveTo(18.647f, 1.552f)
                verticalLineTo(1.326f)
                curveTo(18.647f, 1.326f, 18.427f, 1.448f, 18.251f, 1.326f)
                curveTo(18.076f, 1.205f, 17.828f, 1.636f, 17.828f, 1.857f)
                curveTo(17.828f, 1.937f, 17.818f, 2.046f, 17.809f, 2.147f)
                curveTo(17.792f, 2.327f, 17.778f, 2.48f, 17.828f, 2.388f)
                curveTo(17.906f, 2.245f, 18.161f, 2.093f, 18.508f, 2.026f)
                curveTo(18.772f, 1.976f, 18.715f, 1.795f, 18.673f, 1.66f)
                curveTo(18.659f, 1.618f, 18.647f, 1.58f, 18.647f, 1.552f)
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
            imageVector = FlagIcons.Medium.SriLanka,
            contentDescription = "Sri Lanka Flag"
        )
    }
}
