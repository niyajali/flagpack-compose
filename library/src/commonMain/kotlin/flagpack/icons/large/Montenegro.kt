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
 * Montenegro Flag (32x24dp)
 *
 * - ISO Alpha-2: ME
 * - ISO Alpha-3: MNE
 * - ISO Numeric: 499
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Montenegro: ImageVector by lazy {
    ImageVector.Builder(
        name = "Montenegro:ME:MNE:499:Large",
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
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                horizontalLineTo(28f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(4f, 4f)
                horizontalLineTo(28f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.231f, 15.751f)
                curveTo(20.639f, 15.751f, 20.969f, 15.413f, 20.969f, 14.995f)
                curveTo(20.969f, 14.577f, 20.639f, 14.238f, 20.231f, 14.238f)
                curveTo(19.823f, 14.238f, 19.492f, 14.577f, 19.492f, 14.995f)
                curveTo(19.492f, 15.413f, 19.823f, 15.751f, 20.231f, 15.751f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.628f, 12.332f)
                curveTo(8.69f, 10.08f, 11.467f, 6.173f, 11.467f, 6.173f)
                curveTo(11.467f, 6.173f, 11.882f, 8.507f, 13.418f, 10.077f)
                curveTo(13.418f, 10.189f, 13.273f, 10.353f, 13.126f, 10.52f)
                curveTo(13.024f, 10.636f, 12.92f, 10.753f, 12.865f, 10.854f)
                curveTo(12.73f, 11.1f, 13.193f, 11.24f, 13.418f, 11.24f)
                curveTo(13.519f, 11.24f, 13.575f, 11.386f, 13.625f, 11.518f)
                curveTo(13.687f, 11.68f, 13.741f, 11.821f, 13.86f, 11.643f)
                curveTo(14.076f, 11.319f, 13.644f, 10.609f, 13.644f, 10.609f)
                lineTo(14.327f, 9.888f)
                lineTo(14.559f, 9.422f)
                horizontalLineTo(14.327f)
                verticalLineTo(8.942f)
                lineTo(14.165f, 9.075f)
                curveTo(14.165f, 9.075f, 13.988f, 8.646f, 13.644f, 8.646f)
                curveTo(13.3f, 8.646f, 13.193f, 8.45f, 13.193f, 8.45f)
                horizontalLineTo(13.644f)
                curveTo(13.869f, 8.45f, 13.608f, 8.151f, 13.418f, 7.995f)
                curveTo(13.333f, 7.925f, 13.204f, 7.949f, 13.088f, 7.971f)
                curveTo(12.945f, 7.998f, 12.821f, 8.021f, 12.821f, 7.861f)
                curveTo(12.821f, 7.686f, 12.957f, 7.663f, 13.115f, 7.636f)
                curveTo(13.217f, 7.619f, 13.329f, 7.6f, 13.418f, 7.536f)
                curveTo(13.565f, 7.43f, 13.763f, 7.462f, 13.978f, 7.497f)
                curveTo(14.092f, 7.516f, 14.21f, 7.536f, 14.327f, 7.536f)
                horizontalLineTo(14.884f)
                curveTo(15.085f, 7.536f, 14.559f, 7.861f, 14.559f, 7.861f)
                lineTo(14.884f, 8.151f)
                lineTo(15.369f, 8.646f)
                lineTo(15.127f, 8.79f)
                lineTo(15.627f, 9.274f)
                curveTo(15.627f, 9.274f, 15.457f, 9.55f, 15.627f, 9.55f)
                curveTo(15.696f, 9.55f, 15.743f, 9.608f, 15.772f, 9.675f)
                curveTo(15.802f, 9.608f, 15.848f, 9.55f, 15.918f, 9.55f)
                curveTo(16.088f, 9.55f, 15.918f, 9.274f, 15.918f, 9.274f)
                lineTo(16.418f, 8.79f)
                lineTo(16.176f, 8.646f)
                lineTo(16.66f, 8.151f)
                lineTo(16.986f, 7.861f)
                curveTo(16.986f, 7.861f, 16.459f, 7.536f, 16.66f, 7.536f)
                horizontalLineTo(17.217f)
                curveTo(17.335f, 7.536f, 17.453f, 7.516f, 17.567f, 7.497f)
                curveTo(17.781f, 7.462f, 17.979f, 7.43f, 18.127f, 7.536f)
                curveTo(18.215f, 7.6f, 18.327f, 7.619f, 18.43f, 7.636f)
                curveTo(18.588f, 7.663f, 18.724f, 7.686f, 18.724f, 7.861f)
                curveTo(18.724f, 8.021f, 18.6f, 7.998f, 18.457f, 7.971f)
                curveTo(18.34f, 7.949f, 18.212f, 7.925f, 18.127f, 7.995f)
                curveTo(17.937f, 8.151f, 17.675f, 8.45f, 17.901f, 8.45f)
                horizontalLineTo(18.351f)
                curveTo(18.351f, 8.45f, 18.245f, 8.646f, 17.901f, 8.646f)
                curveTo(17.557f, 8.646f, 17.379f, 9.075f, 17.379f, 9.075f)
                lineTo(17.217f, 8.942f)
                verticalLineTo(9.422f)
                horizontalLineTo(16.986f)
                lineTo(17.217f, 9.888f)
                lineTo(17.901f, 10.609f)
                curveTo(17.901f, 10.609f, 17.469f, 11.319f, 17.685f, 11.643f)
                curveTo(17.804f, 11.821f, 17.858f, 11.68f, 17.92f, 11.518f)
                curveTo(17.97f, 11.386f, 18.026f, 11.24f, 18.127f, 11.24f)
                curveTo(18.351f, 11.24f, 18.815f, 11.1f, 18.68f, 10.854f)
                curveTo(18.625f, 10.753f, 18.521f, 10.636f, 18.419f, 10.52f)
                curveTo(18.272f, 10.353f, 18.127f, 10.189f, 18.127f, 10.077f)
                curveTo(19.663f, 8.507f, 20.078f, 6.173f, 20.078f, 6.173f)
                curveTo(20.078f, 6.173f, 22.854f, 10.08f, 20.917f, 12.332f)
                curveTo(18.98f, 14.583f, 17.557f, 13.904f, 17.557f, 13.904f)
                lineTo(18.351f, 14.617f)
                lineTo(18.127f, 14.811f)
                horizontalLineTo(18.788f)
                lineTo(18.545f, 14.974f)
                lineTo(18.724f, 15.052f)
                lineTo(18.914f, 15.135f)
                curveTo(18.914f, 15.135f, 18.403f, 15.512f, 18.914f, 15.512f)
                curveTo(18.994f, 15.512f, 19.08f, 15.509f, 19.168f, 15.507f)
                curveTo(19.264f, 15.504f, 19.364f, 15.501f, 19.463f, 15.501f)
                curveTo(19.49f, 15.502f, 19.43f, 15.354f, 19.371f, 15.208f)
                curveTo(19.312f, 15.064f, 19.254f, 14.921f, 19.281f, 14.922f)
                curveTo(19.336f, 14.924f, 19.444f, 15.055f, 19.553f, 15.187f)
                curveTo(19.64f, 15.292f, 19.727f, 15.397f, 19.788f, 15.437f)
                curveTo(19.827f, 15.463f, 19.979f, 15.411f, 20.12f, 15.362f)
                curveTo(20.239f, 15.32f, 20.35f, 15.281f, 20.378f, 15.296f)
                curveTo(20.497f, 15.356f, 20.467f, 15.477f, 20.438f, 15.593f)
                curveTo(20.431f, 15.623f, 20.423f, 15.652f, 20.419f, 15.68f)
                curveTo(20.414f, 15.705f, 20.567f, 15.606f, 20.727f, 15.502f)
                curveTo(20.895f, 15.393f, 21.072f, 15.278f, 21.085f, 15.296f)
                curveTo(21.088f, 15.299f, 21.091f, 15.303f, 21.094f, 15.307f)
                curveTo(21.152f, 15.376f, 21.244f, 15.486f, 20.564f, 16.011f)
                curveTo(20.564f, 16.111f, 20.567f, 16.194f, 20.57f, 16.26f)
                curveTo(20.58f, 16.475f, 20.582f, 16.53f, 20.437f, 16.53f)
                curveTo(20.372f, 16.53f, 20.281f, 16.563f, 20.177f, 16.6f)
                curveTo(19.907f, 16.695f, 19.544f, 16.824f, 19.281f, 16.53f)
                curveTo(18.914f, 16.123f, 18.351f, 15.512f, 18.351f, 15.512f)
                verticalLineTo(15.812f)
                lineTo(17.685f, 15.135f)
                lineTo(17.557f, 15.512f)
                lineTo(16.66f, 14.482f)
                lineTo(16.418f, 14.617f)
                curveTo(16.418f, 14.617f, 17.244f, 16.894f, 17.685f, 16.91f)
                curveTo(17.904f, 16.918f, 17.571f, 17.131f, 17.13f, 17.413f)
                curveTo(16.683f, 17.698f, 16.126f, 18.055f, 15.918f, 18.341f)
                curveTo(15.857f, 18.426f, 15.809f, 18.296f, 15.772f, 18.014f)
                curveTo(15.736f, 18.296f, 15.688f, 18.426f, 15.627f, 18.341f)
                curveTo(15.419f, 18.055f, 14.861f, 17.698f, 14.415f, 17.413f)
                curveTo(13.974f, 17.131f, 13.64f, 16.918f, 13.86f, 16.91f)
                curveTo(14.301f, 16.894f, 15.127f, 14.617f, 15.127f, 14.617f)
                lineTo(14.884f, 14.482f)
                lineTo(13.988f, 15.512f)
                lineTo(13.86f, 15.135f)
                lineTo(13.193f, 15.812f)
                verticalLineTo(15.512f)
                curveTo(13.193f, 15.512f, 12.631f, 16.123f, 12.264f, 16.53f)
                curveTo(12f, 16.824f, 11.637f, 16.695f, 11.368f, 16.6f)
                curveTo(11.263f, 16.563f, 11.173f, 16.53f, 11.108f, 16.53f)
                curveTo(10.877f, 16.53f, 10.8f, 16.208f, 11.108f, 15.812f)
                curveTo(11.368f, 15.479f, 11.907f, 15.494f, 12.377f, 15.507f)
                curveTo(12.465f, 15.509f, 12.55f, 15.512f, 12.631f, 15.512f)
                curveTo(13.142f, 15.512f, 12.631f, 15.135f, 12.631f, 15.135f)
                lineTo(12.821f, 15.052f)
                lineTo(13f, 14.974f)
                lineTo(12.756f, 14.811f)
                horizontalLineTo(13.418f)
                lineTo(13.193f, 14.617f)
                lineTo(13.988f, 13.904f)
                curveTo(13.988f, 13.904f, 12.565f, 14.583f, 10.628f, 12.332f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.433f, 17.03f)
                lineTo(11.558f, 15.496f)
                curveTo(11.558f, 15.496f, 10.414f, 12.858f, 10.414f, 12.538f)
                curveTo(10.414f, 12.217f, 9.953f, 11.269f, 9.953f, 11.544f)
                curveTo(9.953f, 11.82f, 9.953f, 12.538f, 9.953f, 12.538f)
                lineTo(11.884f, 16.887f)
                verticalLineTo(17.229f)
                horizontalLineTo(12.144f)
                lineTo(12.433f, 17.03f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(19.442f, 14.965f)
                lineTo(19.575f, 14.523f)
                lineTo(21.201f, 15.013f)
                lineTo(21.068f, 15.455f)
                lineTo(19.442f, 14.965f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF6C540))) {
                moveTo(20.308f, 14.16f)
                lineTo(20.747f, 14.304f)
                lineTo(20.318f, 15.682f)
                lineTo(19.878f, 15.538f)
                lineTo(20.308f, 14.16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.717f, 13.711f)
                lineTo(20.623f, 13.689f)
                lineTo(20.584f, 13.842f)
                lineTo(20.411f, 13.799f)
                lineTo(20.389f, 13.892f)
                lineTo(20.561f, 13.934f)
                lineTo(20.517f, 14.107f)
                lineTo(20.612f, 14.129f)
                lineTo(20.655f, 13.957f)
                lineTo(20.826f, 13.999f)
                lineTo(20.847f, 13.906f)
                lineTo(20.678f, 13.865f)
                lineTo(20.717f, 13.711f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.694f, 5.222f)
                lineTo(15.742f, 5.388f)
                horizontalLineTo(15.886f)
                lineTo(15.934f, 5.222f)
                curveTo(16.054f, 5.259f, 16.163f, 5.3f, 16.261f, 5.346f)
                lineTo(16.264f, 5.309f)
                curveTo(17.036f, 5.38f, 17.436f, 5.703f, 17.393f, 6.271f)
                curveTo(17.358f, 6.741f, 17.12f, 6.988f, 16.723f, 6.981f)
                verticalLineTo(7.332f)
                curveTo(16.723f, 7.332f, 16.077f, 7.58f, 15.754f, 7.58f)
                curveTo(15.431f, 7.58f, 14.785f, 7.332f, 14.785f, 7.332f)
                verticalLineTo(6.975f)
                curveTo(14.458f, 6.935f, 14.263f, 6.693f, 14.231f, 6.271f)
                curveTo(14.188f, 5.703f, 14.588f, 5.38f, 15.36f, 5.309f)
                lineTo(15.364f, 5.347f)
                curveTo(15.462f, 5.301f, 15.573f, 5.259f, 15.694f, 5.222f)
                close()
                moveTo(14.877f, 6.667f)
                curveTo(14.834f, 6.679f, 14.803f, 6.688f, 14.791f, 6.692f)
                curveTo(14.614f, 6.658f, 14.527f, 6.517f, 14.507f, 6.251f)
                curveTo(14.487f, 5.982f, 14.613f, 5.795f, 14.911f, 5.687f)
                curveTo(14.708f, 5.947f, 14.693f, 6.278f, 14.877f, 6.667f)
                close()
                moveTo(15.152f, 6.595f)
                curveTo(15.315f, 6.556f, 15.504f, 6.517f, 15.655f, 6.504f)
                verticalLineTo(5.533f)
                curveTo(15.035f, 5.751f, 14.886f, 6.083f, 15.152f, 6.595f)
                close()
                moveTo(15.932f, 6.512f)
                curveTo(16.139f, 6.54f, 16.392f, 6.602f, 16.555f, 6.646f)
                lineTo(16.473f, 6.601f)
                curveTo(16.749f, 6.074f, 16.589f, 5.737f, 15.932f, 5.519f)
                verticalLineTo(6.512f)
                close()
                moveTo(16.719f, 5.689f)
                curveTo(16.926f, 5.956f, 16.936f, 6.297f, 16.735f, 6.699f)
                curveTo(16.979f, 6.703f, 17.094f, 6.562f, 17.117f, 6.251f)
                curveTo(17.138f, 5.984f, 17.013f, 5.797f, 16.719f, 5.689f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.754f, 5.519f)
                curveTo(15.932f, 5.519f, 16.077f, 5.374f, 16.077f, 5.196f)
                curveTo(16.077f, 5.018f, 15.932f, 4.873f, 15.754f, 4.873f)
                curveTo(15.575f, 4.873f, 15.431f, 5.018f, 15.431f, 5.196f)
                curveTo(15.431f, 5.374f, 15.575f, 5.519f, 15.754f, 5.519f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.799f, 4.498f)
                lineTo(15.702f, 4.5f)
                lineTo(15.701f, 4.657f)
                lineTo(15.523f, 4.658f)
                lineTo(15.524f, 4.753f)
                lineTo(15.701f, 4.752f)
                lineTo(15.701f, 4.931f)
                lineTo(15.797f, 4.929f)
                lineTo(15.798f, 4.752f)
                lineTo(15.974f, 4.751f)
                lineTo(15.972f, 4.656f)
                lineTo(15.798f, 4.657f)
                lineTo(15.799f, 4.498f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E5E91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.954f, 10.359f)
                curveTo(13.954f, 10.359f, 15.092f, 10.145f, 15.708f, 10.145f)
                curveTo(16.261f, 10.145f, 17.462f, 10.359f, 17.462f, 10.359f)
                curveTo(17.462f, 11.719f, 17.844f, 12.552f, 17.462f, 13.481f)
                curveTo(17.079f, 14.41f, 16.143f, 13.964f, 15.72f, 14.852f)
                curveTo(15.179f, 14.009f, 14.449f, 14.473f, 13.954f, 13.273f)
                curveTo(13.459f, 12.072f, 14.255f, 11.519f, 13.954f, 10.359f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(13.954f, 10.359f)
                curveTo(13.954f, 10.359f, 15.092f, 10.145f, 15.708f, 10.145f)
                curveTo(16.261f, 10.145f, 17.462f, 10.359f, 17.462f, 10.359f)
                curveTo(17.462f, 11.719f, 17.844f, 12.552f, 17.462f, 13.481f)
                curveTo(17.079f, 14.41f, 16.143f, 13.964f, 15.72f, 14.852f)
                curveTo(15.179f, 14.009f, 14.449f, 14.473f, 13.954f, 13.273f)
                curveTo(13.459f, 12.072f, 14.255f, 11.519f, 13.954f, 10.359f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(13.954f, 13.197f)
                horizontalLineToRelative(3.508f)
                verticalLineToRelative(1.703f)
                horizontalLineToRelative(-3.508f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6C540)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.991f, 11.03f)
                curveTo(14.857f, 10.745f, 15.695f, 10.712f, 15.695f, 10.712f)
                curveTo(15.695f, 10.712f, 15.876f, 11.03f, 15.695f, 11.482f)
                curveTo(15.564f, 11.811f, 15.783f, 11.782f, 16.086f, 11.741f)
                curveTo(16.199f, 11.726f, 16.324f, 11.71f, 16.447f, 11.71f)
                curveTo(16.635f, 11.71f, 16.734f, 11.696f, 16.816f, 11.727f)
                curveTo(16.931f, 11.77f, 17.013f, 11.899f, 17.258f, 12.274f)
                curveTo(17.37f, 12.445f, 17.365f, 12.558f, 17.297f, 12.626f)
                curveTo(17.303f, 12.8f, 17.114f, 12.944f, 16.764f, 13.036f)
                lineTo(16.717f, 12.853f)
                curveTo(16.903f, 12.804f, 17.016f, 12.758f, 17.069f, 12.706f)
                curveTo(16.805f, 12.722f, 16.447f, 12.592f, 16.447f, 12.424f)
                curveTo(16.447f, 12.176f, 15.602f, 12.228f, 15.094f, 12.26f)
                curveTo(14.964f, 12.268f, 14.856f, 12.274f, 14.79f, 12.274f)
                curveTo(14.494f, 12.274f, 14.721f, 11.913f, 14.927f, 11.584f)
                curveTo(14.949f, 11.55f, 14.97f, 11.516f, 14.991f, 11.482f)
                curveTo(15.097f, 11.311f, 15.131f, 11.267f, 15.123f, 11.233f)
                curveTo(15.115f, 11.198f, 15.059f, 11.175f, 14.991f, 11.03f)
                close()
                moveTo(17.002f, 10.986f)
                curveTo(16.496f, 10.905f, 16.212f, 10.983f, 16.212f, 11.266f)
                curveTo(16.212f, 11.536f, 16.481f, 11.653f, 16.974f, 11.651f)
                curveTo(16.993f, 11.658f, 17.01f, 11.664f, 17.025f, 11.67f)
                curveTo(17.006f, 11.678f, 16.984f, 11.688f, 16.957f, 11.697f)
                lineTo(17.019f, 11.876f)
                curveTo(17.33f, 11.764f, 17.33f, 11.564f, 17.015f, 11.466f)
                lineTo(17.001f, 11.462f)
                lineTo(16.987f, 11.462f)
                curveTo(16.577f, 11.465f, 16.396f, 11.389f, 16.396f, 11.266f)
                curveTo(16.396f, 11.155f, 16.568f, 11.108f, 16.974f, 11.172f)
                lineTo(17.002f, 10.986f)
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
            imageVector = FlagIcons.Large.Montenegro,
            contentDescription = "Montenegro Flag"
        )
    }
}
