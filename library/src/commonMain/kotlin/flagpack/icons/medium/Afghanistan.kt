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
 * Afghanistan Flag (20x15dp)
 *
 * - ISO Alpha-2: AF
 * - ISO Alpha-3: AFG
 * - ISO Numeric: 004
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Afghanistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Afghanistan:AF:AFG:004:Medium",
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
                fill = SolidColor(Color(0xFF67BD38)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD51700)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.705f, 4.986f)
                lineTo(7.921f, 5.121f)
                curveTo(7.561f, 5.728f, 7.319f, 6.284f, 7.193f, 6.789f)
                curveTo(7.246f, 6.838f, 7.28f, 6.881f, 7.313f, 6.939f)
                curveTo(7.411f, 7.109f, 7.494f, 7.273f, 7.56f, 7.432f)
                lineTo(7.273f, 7.555f)
                curveTo(7.228f, 7.447f, 7.174f, 7.336f, 7.113f, 7.222f)
                curveTo(7.084f, 7.468f, 7.086f, 7.701f, 7.119f, 7.92f)
                curveTo(7.172f, 7.926f, 7.216f, 7.937f, 7.267f, 7.956f)
                curveTo(7.451f, 8.022f, 7.619f, 8.095f, 7.773f, 8.175f)
                lineTo(7.631f, 8.453f)
                curveTo(7.5f, 8.386f, 7.357f, 8.322f, 7.2f, 8.264f)
                lineTo(7.203f, 8.273f)
                curveTo(7.337f, 8.677f, 7.541f, 9.048f, 7.817f, 9.388f)
                curveTo(7.86f, 9.379f, 7.9f, 9.375f, 7.947f, 9.375f)
                curveTo(8.143f, 9.375f, 8.326f, 9.386f, 8.498f, 9.408f)
                lineTo(8.46f, 9.718f)
                curveTo(8.343f, 9.703f, 8.22f, 9.694f, 8.09f, 9.69f)
                curveTo(8.337f, 9.938f, 8.628f, 10.167f, 8.963f, 10.376f)
                lineTo(8.831f, 10.598f)
                curveTo(8.416f, 10.339f, 8.063f, 10.049f, 7.773f, 9.729f)
                curveTo(7.735f, 9.744f, 7.689f, 9.764f, 7.63f, 9.789f)
                lineTo(7.608f, 9.799f)
                curveTo(7.862f, 10.065f, 8.162f, 10.31f, 8.508f, 10.533f)
                lineTo(8.374f, 10.754f)
                curveTo(7.973f, 10.495f, 7.63f, 10.209f, 7.345f, 9.894f)
                curveTo(7.21f, 9.928f, 7.095f, 9.928f, 6.961f, 9.888f)
                lineTo(7.044f, 9.588f)
                curveTo(7.064f, 9.594f, 7.084f, 9.598f, 7.104f, 9.601f)
                curveTo(6.84f, 9.249f, 6.64f, 8.865f, 6.507f, 8.45f)
                curveTo(6.483f, 8.377f, 6.463f, 8.302f, 6.446f, 8.226f)
                curveTo(6.342f, 8.206f, 6.255f, 8.167f, 6.164f, 8.101f)
                lineTo(6.346f, 7.847f)
                curveTo(6.361f, 7.858f, 6.377f, 7.868f, 6.393f, 7.877f)
                curveTo(6.361f, 7.494f, 6.406f, 7.081f, 6.527f, 6.638f)
                curveTo(6.451f, 6.55f, 6.404f, 6.46f, 6.376f, 6.342f)
                lineTo(6.641f, 6.273f)
                curveTo(6.784f, 5.868f, 6.987f, 5.439f, 7.248f, 4.987f)
                lineTo(7.466f, 5.12f)
                curveTo(7.181f, 5.613f, 6.97f, 6.074f, 6.832f, 6.502f)
                curveTo(6.871f, 6.537f, 6.918f, 6.575f, 6.976f, 6.618f)
                curveTo(7.114f, 6.114f, 7.358f, 5.57f, 7.705f, 4.986f)
                close()
                moveTo(6.899f, 6.949f)
                curveTo(6.871f, 6.927f, 6.837f, 6.902f, 6.796f, 6.872f)
                curveTo(6.776f, 6.857f, 6.758f, 6.843f, 6.739f, 6.829f)
                curveTo(6.643f, 7.227f, 6.614f, 7.594f, 6.653f, 7.931f)
                curveTo(6.7f, 7.931f, 6.753f, 7.929f, 6.814f, 7.925f)
                lineTo(6.863f, 7.922f)
                curveTo(6.822f, 7.618f, 6.834f, 7.294f, 6.899f, 6.949f)
                close()
                moveTo(6.827f, 8.236f)
                curveTo(6.864f, 8.234f, 6.897f, 8.232f, 6.925f, 8.231f)
                curveTo(6.937f, 8.273f, 6.949f, 8.316f, 6.963f, 8.357f)
                curveTo(7.097f, 8.762f, 7.297f, 9.136f, 7.563f, 9.479f)
                lineTo(7.511f, 9.502f)
                curveTo(7.467f, 9.521f, 7.427f, 9.538f, 7.39f, 9.552f)
                curveTo(7.1f, 9.193f, 6.886f, 8.798f, 6.747f, 8.368f)
                curveTo(6.734f, 8.327f, 6.722f, 8.285f, 6.711f, 8.242f)
                curveTo(6.747f, 8.241f, 6.786f, 8.239f, 6.827f, 8.236f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.087f, 4.986f)
                lineTo(11.871f, 5.121f)
                curveTo(12.231f, 5.728f, 12.473f, 6.284f, 12.598f, 6.789f)
                curveTo(12.545f, 6.838f, 12.512f, 6.881f, 12.478f, 6.939f)
                curveTo(12.38f, 7.109f, 12.298f, 7.273f, 12.231f, 7.432f)
                lineTo(12.519f, 7.555f)
                curveTo(12.564f, 7.447f, 12.617f, 7.336f, 12.679f, 7.222f)
                curveTo(12.708f, 7.468f, 12.706f, 7.701f, 12.673f, 7.92f)
                curveTo(12.62f, 7.926f, 12.576f, 7.937f, 12.525f, 7.956f)
                curveTo(12.341f, 8.022f, 12.172f, 8.095f, 12.019f, 8.175f)
                lineTo(12.16f, 8.453f)
                curveTo(12.291f, 8.386f, 12.435f, 8.322f, 12.592f, 8.264f)
                lineTo(12.589f, 8.273f)
                curveTo(12.455f, 8.677f, 12.251f, 9.048f, 11.975f, 9.388f)
                curveTo(11.932f, 9.379f, 11.892f, 9.375f, 11.845f, 9.375f)
                curveTo(11.649f, 9.375f, 11.465f, 9.386f, 11.294f, 9.408f)
                lineTo(11.332f, 9.718f)
                curveTo(11.448f, 9.703f, 11.572f, 9.694f, 11.702f, 9.69f)
                curveTo(11.454f, 9.938f, 11.163f, 10.167f, 10.829f, 10.376f)
                lineTo(10.961f, 10.598f)
                curveTo(11.375f, 10.339f, 11.728f, 10.049f, 12.019f, 9.729f)
                curveTo(12.057f, 9.744f, 12.103f, 9.764f, 12.162f, 9.789f)
                lineTo(12.184f, 9.799f)
                curveTo(11.93f, 10.065f, 11.63f, 10.31f, 11.284f, 10.533f)
                lineTo(11.418f, 10.754f)
                curveTo(11.819f, 10.495f, 12.161f, 10.209f, 12.446f, 9.894f)
                curveTo(12.582f, 9.928f, 12.697f, 9.928f, 12.831f, 9.888f)
                lineTo(12.747f, 9.588f)
                curveTo(12.727f, 9.594f, 12.708f, 9.598f, 12.688f, 9.601f)
                curveTo(12.952f, 9.249f, 13.151f, 8.865f, 13.285f, 8.45f)
                curveTo(13.309f, 8.377f, 13.329f, 8.302f, 13.346f, 8.226f)
                curveTo(13.449f, 8.206f, 13.537f, 8.167f, 13.627f, 8.101f)
                lineTo(13.446f, 7.847f)
                curveTo(13.43f, 7.858f, 13.415f, 7.868f, 13.398f, 7.877f)
                curveTo(13.431f, 7.494f, 13.386f, 7.081f, 13.265f, 6.638f)
                curveTo(13.341f, 6.55f, 13.387f, 6.46f, 13.416f, 6.342f)
                lineTo(13.15f, 6.273f)
                curveTo(13.007f, 5.868f, 12.805f, 5.439f, 12.544f, 4.987f)
                lineTo(12.326f, 5.12f)
                curveTo(12.611f, 5.613f, 12.822f, 6.074f, 12.96f, 6.502f)
                curveTo(12.921f, 6.537f, 12.874f, 6.575f, 12.816f, 6.618f)
                curveTo(12.677f, 6.114f, 12.434f, 5.57f, 12.087f, 4.986f)
                close()
                moveTo(12.893f, 6.949f)
                curveTo(12.921f, 6.927f, 12.955f, 6.902f, 12.996f, 6.872f)
                curveTo(13.015f, 6.857f, 13.034f, 6.843f, 13.052f, 6.829f)
                curveTo(13.149f, 7.227f, 13.177f, 7.594f, 13.138f, 7.931f)
                curveTo(13.092f, 7.931f, 13.039f, 7.929f, 12.978f, 7.925f)
                lineTo(12.929f, 7.922f)
                curveTo(12.97f, 7.618f, 12.958f, 7.294f, 12.893f, 6.949f)
                close()
                moveTo(12.965f, 8.236f)
                curveTo(12.928f, 8.234f, 12.895f, 8.232f, 12.866f, 8.231f)
                curveTo(12.855f, 8.273f, 12.842f, 8.316f, 12.829f, 8.357f)
                curveTo(12.694f, 8.762f, 12.495f, 9.136f, 12.229f, 9.479f)
                lineTo(12.281f, 9.502f)
                curveTo(12.325f, 9.521f, 12.365f, 9.538f, 12.402f, 9.552f)
                curveTo(12.692f, 9.193f, 12.906f, 8.798f, 13.044f, 8.368f)
                curveTo(13.058f, 8.327f, 13.07f, 8.285f, 13.081f, 8.242f)
                curveTo(13.044f, 8.241f, 13.006f, 8.239f, 12.965f, 8.236f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.808f, 10.165f)
                lineTo(8.11f, 10.855f)
                curveTo(8.11f, 10.855f, 8.712f, 11.224f, 9.846f, 11.224f)
                curveTo(10.98f, 11.224f, 11.64f, 10.855f, 11.64f, 10.855f)
                lineTo(11.11f, 10.165f)
                curveTo(11.11f, 10.165f, 10.387f, 10.445f, 9.875f, 10.445f)
                curveTo(9.364f, 10.445f, 8.808f, 10.165f, 8.808f, 10.165f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFC00001)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.823f, 10.606f)
                curveTo(8.823f, 10.606f, 9.413f, 10.745f, 9.866f, 10.745f)
                curveTo(10.319f, 10.745f, 10.91f, 10.606f, 10.91f, 10.606f)
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.457f, 5.911f)
                curveTo(10.457f, 6.185f, 10.208f, 6.406f, 9.9f, 6.406f)
                curveTo(9.592f, 6.406f, 9.343f, 6.185f, 9.343f, 5.911f)
                curveTo(9.343f, 5.638f, 9.592f, 5.417f, 9.9f, 5.417f)
                curveTo(10.208f, 5.417f, 10.457f, 5.638f, 10.457f, 5.911f)
                close()
                moveTo(9.9f, 6.406f)
                horizontalLineTo(9.3f)
                lineTo(9.135f, 6.533f)
                horizontalLineTo(9.102f)
                verticalLineTo(5.542f)
                horizontalLineTo(8.798f)
                verticalLineTo(6.533f)
                horizontalLineTo(8.532f)
                verticalLineTo(6.702f)
                horizontalLineTo(8.798f)
                verticalLineTo(8.488f)
                curveTo(8.762f, 8.773f, 8.679f, 8.934f, 8.562f, 8.99f)
                lineTo(7.941f, 9.288f)
                horizontalLineTo(11.677f)
                lineTo(11.409f, 9.02f)
                curveTo(11.173f, 8.784f, 11.06f, 8.603f, 11.06f, 8.498f)
                verticalLineTo(6.702f)
                horizontalLineTo(11.167f)
                verticalLineTo(6.533f)
                horizontalLineTo(11.06f)
                verticalLineTo(5.542f)
                horizontalLineTo(10.756f)
                verticalLineTo(6.533f)
                horizontalLineTo(10.658f)
                lineTo(10.462f, 6.406f)
                horizontalLineTo(9.9f)
                close()
                moveTo(9.102f, 6.702f)
                horizontalLineTo(10.756f)
                verticalLineTo(8.498f)
                curveTo(10.756f, 8.643f, 10.825f, 8.8f, 10.958f, 8.976f)
                horizontalLineTo(8.977f)
                curveTo(9.038f, 8.853f, 9.079f, 8.699f, 9.102f, 8.507f)
                verticalLineTo(6.702f)
                close()
                moveTo(9.951f, 7.5f)
                horizontalLineTo(9.292f)
                verticalLineTo(8.802f)
                horizontalLineTo(10.609f)
                lineTo(9.951f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.631f, 3.848f)
                lineTo(10.632f, 3.849f)
                lineTo(10.632f, 3.849f)
                lineTo(10.631f, 3.848f)
                close()
                moveTo(11.594f, 4.186f)
                lineTo(11.595f, 4.192f)
                lineTo(11.594f, 4.188f)
                lineTo(11.594f, 4.186f)
                close()
                moveTo(11.781f, 4.209f)
                lineTo(11.782f, 4.206f)
                lineTo(11.782f, 4.208f)
                lineTo(11.781f, 4.209f)
                close()
                moveTo(11.024f, 4.593f)
                lineTo(11.028f, 4.593f)
                lineTo(11.026f, 4.593f)
                lineTo(11.024f, 4.593f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.021f, 6.668f)
                lineTo(7.896f, 6.757f)
                lineTo(8.024f, 6.946f)
                curveTo(7.914f, 6.985f, 7.738f, 7.085f, 7.738f, 7.32f)
                curveTo(7.738f, 7.661f, 7.618f, 7.94f, 7.618f, 7.94f)
                lineTo(7.975f, 8.17f)
                curveTo(7.975f, 8.17f, 8.013f, 7.772f, 8.11f, 7.546f)
                curveTo(8.159f, 7.433f, 8.235f, 7.376f, 8.299f, 7.348f)
                lineTo(8.854f, 8.164f)
                lineTo(8.979f, 8.074f)
                lineTo(8.021f, 6.668f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.819f, 6.668f)
                lineTo(11.944f, 6.757f)
                lineTo(11.816f, 6.946f)
                curveTo(11.926f, 6.985f, 12.102f, 7.085f, 12.102f, 7.32f)
                curveTo(12.102f, 7.661f, 12.222f, 7.94f, 12.222f, 7.94f)
                lineTo(11.865f, 8.17f)
                curveTo(11.865f, 8.17f, 11.827f, 7.772f, 11.73f, 7.546f)
                curveTo(11.681f, 7.433f, 11.605f, 7.376f, 11.542f, 7.348f)
                lineTo(10.986f, 8.164f)
                lineTo(10.861f, 8.074f)
                lineTo(11.819f, 6.668f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AfghanistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Afghanistan,
            contentDescription = "Afghanistan Flag"
        )
    }
}
