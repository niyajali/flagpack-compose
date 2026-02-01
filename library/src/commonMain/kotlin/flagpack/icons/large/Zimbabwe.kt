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
 * Zimbabwe Flag (32x24dp)
 *
 * - ISO Alpha-2: ZW
 * - ISO Alpha-3: ZWE
 * - ISO Numeric: 716
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Zimbabwe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Zimbabwe:ZW:ZWE:716:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(32f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 3.5f
            ) {
                moveTo(0f, 8.25f)
                horizontalLineTo(-1.75f)
                verticalLineTo(10f)
                verticalLineTo(14f)
                verticalLineTo(15.75f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33.75f)
                verticalLineTo(14f)
                verticalLineTo(10f)
                verticalLineTo(8.25f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                verticalLineTo(0f)
                horizontalLineTo(32f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                close()
                moveTo(0f, 24f)
                verticalLineTo(20f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            stroke = SolidColor(Color(0xFF272727)),
            strokeLineWidth = 2f
        ) {
            moveTo(0.597f, -0.802f)
            lineTo(-1f, -1.991f)
            verticalLineTo(0f)
            verticalLineTo(24f)
            verticalLineTo(25.961f)
            lineTo(0.587f, 24.809f)
            lineTo(16.919f, 12.961f)
            lineTo(18.02f, 12.162f)
            lineTo(16.928f, 11.35f)
            lineTo(0.597f, -0.802f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0.597f, -0.802f)
                lineTo(-1f, -1.991f)
                verticalLineTo(0f)
                verticalLineTo(24f)
                verticalLineTo(25.961f)
                lineTo(0.587f, 24.809f)
                lineTo(16.919f, 12.961f)
                lineTo(18.02f, 12.162f)
                lineTo(16.928f, 11.35f)
                lineTo(0.597f, -0.802f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.478f, 14.278f)
                lineTo(3.7f, 17.329f)
                lineTo(5.433f, 13.252f)
                lineTo(2.454f, 10.384f)
                horizontalLineTo(5.97f)
                lineTo(7.413f, 6.925f)
                lineTo(8.945f, 10.384f)
                horizontalLineTo(12.455f)
                lineTo(9.319f, 13.252f)
                lineTo(10.888f, 17.329f)
                lineTo(7.478f, 14.278f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.018f, 8.422f)
                curveTo(5.018f, 8.422f, 4.963f, 8.289f, 5.287f, 8.172f)
                curveTo(5.61f, 8.055f, 5.709f, 7.808f, 5.963f, 7.99f)
                curveTo(6.217f, 8.172f, 6.376f, 7.806f, 6.448f, 8.332f)
                curveTo(6.521f, 8.857f, 6.722f, 9.687f, 6.722f, 9.687f)
                lineTo(10.01f, 12.157f)
                horizontalLineTo(9.392f)
                curveTo(9.392f, 12.157f, 8.43f, 13.571f, 8.589f, 14.81f)
                curveTo(8.589f, 14.81f, 7.925f, 14.71f, 7.026f, 14.71f)
                curveTo(6.126f, 14.71f, 5.537f, 14.925f, 5.537f, 14.925f)
                lineTo(5.018f, 13.001f)
                curveTo(5.018f, 13.001f, 5.206f, 12.678f, 5.287f, 12.418f)
                curveTo(5.367f, 12.157f, 5.702f, 12.109f, 5.702f, 11.902f)
                curveTo(5.702f, 11.695f, 5.372f, 11.521f, 5.537f, 10.985f)
                curveTo(5.702f, 10.448f, 5.702f, 8.844f, 5.702f, 8.844f)
                curveTo(5.702f, 8.844f, 5.18f, 8.615f, 5.287f, 8.615f)
                curveTo(5.393f, 8.615f, 5.635f, 8.422f, 5.461f, 8.422f)
                curveTo(5.287f, 8.422f, 5.018f, 8.422f, 5.018f, 8.422f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF0A0A0A)),
                strokeLineWidth = 0.25f
            ) {
                moveTo(6.722f, 9.687f)
                lineTo(6.601f, 9.716f)
                lineTo(6.611f, 9.76f)
                lineTo(6.647f, 9.787f)
                lineTo(9.635f, 12.032f)
                horizontalLineTo(9.392f)
                horizontalLineTo(9.326f)
                lineTo(9.289f, 12.087f)
                lineTo(9.392f, 12.157f)
                lineTo(9.289f, 12.087f)
                lineTo(9.289f, 12.087f)
                lineTo(9.288f, 12.087f)
                lineTo(9.288f, 12.088f)
                lineTo(9.285f, 12.092f)
                lineTo(9.277f, 12.105f)
                curveTo(9.269f, 12.116f, 9.259f, 12.132f, 9.245f, 12.154f)
                curveTo(9.219f, 12.196f, 9.181f, 12.257f, 9.136f, 12.335f)
                curveTo(9.046f, 12.49f, 8.929f, 12.71f, 8.816f, 12.969f)
                curveTo(8.611f, 13.442f, 8.416f, 14.062f, 8.45f, 14.666f)
                curveTo(8.375f, 14.657f, 8.276f, 14.646f, 8.156f, 14.635f)
                curveTo(7.875f, 14.61f, 7.48f, 14.585f, 7.026f, 14.585f)
                curveTo(6.566f, 14.585f, 6.185f, 14.639f, 5.919f, 14.695f)
                curveTo(5.795f, 14.721f, 5.695f, 14.746f, 5.624f, 14.767f)
                lineTo(5.152f, 13.018f)
                curveTo(5.154f, 13.015f, 5.156f, 13.011f, 5.158f, 13.007f)
                curveTo(5.177f, 12.972f, 5.204f, 12.922f, 5.233f, 12.863f)
                curveTo(5.291f, 12.748f, 5.362f, 12.595f, 5.406f, 12.455f)
                curveTo(5.433f, 12.369f, 5.501f, 12.314f, 5.6f, 12.24f)
                lineTo(5.603f, 12.238f)
                curveTo(5.647f, 12.205f, 5.701f, 12.164f, 5.743f, 12.115f)
                curveTo(5.789f, 12.062f, 5.827f, 11.992f, 5.827f, 11.902f)
                curveTo(5.827f, 11.818f, 5.794f, 11.745f, 5.764f, 11.688f)
                curveTo(5.751f, 11.665f, 5.74f, 11.644f, 5.728f, 11.624f)
                curveTo(5.709f, 11.589f, 5.69f, 11.556f, 5.672f, 11.515f)
                curveTo(5.621f, 11.404f, 5.584f, 11.258f, 5.657f, 11.022f)
                curveTo(5.702f, 10.875f, 5.734f, 10.664f, 5.757f, 10.437f)
                curveTo(5.78f, 10.208f, 5.796f, 9.954f, 5.806f, 9.719f)
                curveTo(5.817f, 9.483f, 5.822f, 9.265f, 5.825f, 9.105f)
                curveTo(5.826f, 9.025f, 5.827f, 8.96f, 5.827f, 8.915f)
                lineTo(5.827f, 8.863f)
                lineTo(5.827f, 8.849f)
                lineTo(5.827f, 8.845f)
                lineTo(5.827f, 8.844f)
                lineTo(5.827f, 8.844f)
                verticalLineTo(8.844f)
                lineTo(5.702f, 8.844f)
                horizontalLineTo(5.827f)
                verticalLineTo(8.762f)
                lineTo(5.753f, 8.73f)
                lineTo(5.753f, 8.73f)
                lineTo(5.753f, 8.73f)
                lineTo(5.752f, 8.73f)
                lineTo(5.752f, 8.729f)
                lineTo(5.751f, 8.729f)
                lineTo(5.747f, 8.727f)
                lineTo(5.731f, 8.72f)
                lineTo(5.674f, 8.694f)
                curveTo(5.635f, 8.677f, 5.587f, 8.654f, 5.539f, 8.631f)
                curveTo(5.548f, 8.624f, 5.556f, 8.617f, 5.564f, 8.61f)
                curveTo(5.581f, 8.594f, 5.599f, 8.574f, 5.614f, 8.552f)
                curveTo(5.627f, 8.533f, 5.647f, 8.497f, 5.647f, 8.451f)
                curveTo(5.646f, 8.391f, 5.613f, 8.344f, 5.567f, 8.32f)
                curveTo(5.53f, 8.3f, 5.49f, 8.297f, 5.461f, 8.297f)
                horizontalLineTo(5.46f)
                horizontalLineTo(5.459f)
                horizontalLineTo(5.458f)
                horizontalLineTo(5.457f)
                horizontalLineTo(5.456f)
                horizontalLineTo(5.455f)
                horizontalLineTo(5.453f)
                horizontalLineTo(5.452f)
                horizontalLineTo(5.451f)
                horizontalLineTo(5.45f)
                horizontalLineTo(5.449f)
                horizontalLineTo(5.448f)
                horizontalLineTo(5.447f)
                horizontalLineTo(5.446f)
                horizontalLineTo(5.445f)
                horizontalLineTo(5.444f)
                horizontalLineTo(5.443f)
                horizontalLineTo(5.442f)
                horizontalLineTo(5.441f)
                horizontalLineTo(5.44f)
                horizontalLineTo(5.439f)
                horizontalLineTo(5.438f)
                horizontalLineTo(5.437f)
                horizontalLineTo(5.436f)
                horizontalLineTo(5.435f)
                horizontalLineTo(5.433f)
                horizontalLineTo(5.432f)
                horizontalLineTo(5.431f)
                horizontalLineTo(5.43f)
                horizontalLineTo(5.429f)
                horizontalLineTo(5.428f)
                horizontalLineTo(5.427f)
                horizontalLineTo(5.426f)
                horizontalLineTo(5.425f)
                horizontalLineTo(5.424f)
                horizontalLineTo(5.423f)
                horizontalLineTo(5.422f)
                horizontalLineTo(5.42f)
                horizontalLineTo(5.419f)
                horizontalLineTo(5.418f)
                horizontalLineTo(5.417f)
                horizontalLineTo(5.416f)
                horizontalLineTo(5.415f)
                horizontalLineTo(5.414f)
                horizontalLineTo(5.413f)
                horizontalLineTo(5.412f)
                horizontalLineTo(5.411f)
                horizontalLineTo(5.41f)
                horizontalLineTo(5.408f)
                horizontalLineTo(5.407f)
                horizontalLineTo(5.406f)
                horizontalLineTo(5.405f)
                horizontalLineTo(5.404f)
                horizontalLineTo(5.403f)
                horizontalLineTo(5.402f)
                horizontalLineTo(5.401f)
                horizontalLineTo(5.4f)
                horizontalLineTo(5.398f)
                horizontalLineTo(5.397f)
                horizontalLineTo(5.396f)
                horizontalLineTo(5.395f)
                horizontalLineTo(5.394f)
                horizontalLineTo(5.393f)
                horizontalLineTo(5.392f)
                horizontalLineTo(5.391f)
                horizontalLineTo(5.389f)
                horizontalLineTo(5.388f)
                horizontalLineTo(5.387f)
                horizontalLineTo(5.386f)
                horizontalLineTo(5.385f)
                horizontalLineTo(5.384f)
                horizontalLineTo(5.383f)
                horizontalLineTo(5.381f)
                horizontalLineTo(5.38f)
                horizontalLineTo(5.379f)
                horizontalLineTo(5.378f)
                horizontalLineTo(5.377f)
                horizontalLineTo(5.376f)
                horizontalLineTo(5.375f)
                horizontalLineTo(5.374f)
                horizontalLineTo(5.372f)
                horizontalLineTo(5.371f)
                horizontalLineTo(5.37f)
                horizontalLineTo(5.369f)
                horizontalLineTo(5.368f)
                horizontalLineTo(5.367f)
                horizontalLineTo(5.365f)
                horizontalLineTo(5.364f)
                horizontalLineTo(5.363f)
                horizontalLineTo(5.362f)
                horizontalLineTo(5.361f)
                horizontalLineTo(5.36f)
                horizontalLineTo(5.359f)
                horizontalLineTo(5.357f)
                horizontalLineTo(5.356f)
                horizontalLineTo(5.355f)
                horizontalLineTo(5.354f)
                horizontalLineTo(5.353f)
                horizontalLineTo(5.352f)
                horizontalLineTo(5.351f)
                horizontalLineTo(5.349f)
                horizontalLineTo(5.348f)
                horizontalLineTo(5.347f)
                horizontalLineTo(5.346f)
                horizontalLineTo(5.345f)
                horizontalLineTo(5.344f)
                horizontalLineTo(5.342f)
                horizontalLineTo(5.341f)
                horizontalLineTo(5.34f)
                horizontalLineTo(5.339f)
                horizontalLineTo(5.338f)
                horizontalLineTo(5.337f)
                horizontalLineTo(5.335f)
                horizontalLineTo(5.334f)
                horizontalLineTo(5.333f)
                horizontalLineTo(5.332f)
                horizontalLineTo(5.331f)
                horizontalLineTo(5.33f)
                horizontalLineTo(5.328f)
                horizontalLineTo(5.327f)
                horizontalLineTo(5.326f)
                horizontalLineTo(5.325f)
                horizontalLineTo(5.324f)
                horizontalLineTo(5.323f)
                horizontalLineTo(5.321f)
                horizontalLineTo(5.32f)
                horizontalLineTo(5.319f)
                horizontalLineTo(5.318f)
                horizontalLineTo(5.317f)
                horizontalLineTo(5.316f)
                horizontalLineTo(5.314f)
                horizontalLineTo(5.313f)
                horizontalLineTo(5.312f)
                horizontalLineTo(5.311f)
                curveTo(5.317f, 8.294f, 5.323f, 8.292f, 5.329f, 8.29f)
                curveTo(5.422f, 8.256f, 5.497f, 8.214f, 5.56f, 8.175f)
                curveTo(5.588f, 8.157f, 5.61f, 8.142f, 5.631f, 8.129f)
                curveTo(5.66f, 8.109f, 5.685f, 8.093f, 5.712f, 8.078f)
                curveTo(5.752f, 8.056f, 5.776f, 8.05f, 5.794f, 8.05f)
                curveTo(5.811f, 8.05f, 5.841f, 8.056f, 5.89f, 8.091f)
                curveTo(6.038f, 8.198f, 6.193f, 8.171f, 6.255f, 8.16f)
                curveTo(6.265f, 8.159f, 6.272f, 8.157f, 6.277f, 8.157f)
                curveTo(6.289f, 8.177f, 6.308f, 8.229f, 6.325f, 8.349f)
                curveTo(6.362f, 8.617f, 6.431f, 8.959f, 6.49f, 9.233f)
                curveTo(6.52f, 9.37f, 6.548f, 9.491f, 6.568f, 9.577f)
                curveTo(6.578f, 9.62f, 6.586f, 9.655f, 6.592f, 9.679f)
                lineTo(6.598f, 9.706f)
                lineTo(6.6f, 9.714f)
                lineTo(6.6f, 9.715f)
                lineTo(6.601f, 9.716f)
                lineTo(6.601f, 9.716f)
                lineTo(6.601f, 9.716f)
                lineTo(6.722f, 9.687f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ZimbabwePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Zimbabwe,
            contentDescription = "Zimbabwe Flag"
        )
    }
}
