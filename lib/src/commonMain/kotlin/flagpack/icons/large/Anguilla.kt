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
 * Anguilla Flag (32x24dp)
 *
 * - ISO Alpha-2: AI
 * - ISO Alpha-3: AIA
 * - ISO Numeric: 660
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Anguilla: ImageVector by lazy {
    ImageVector.Builder(
        name = "Anguilla:AI:AIA:660:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFFBE625)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.943f, 11.856f)
                lineTo(20.946f, 12.207f)
                curveTo(20.973f, 15.157f, 21.082f, 17.087f, 21.276f, 18.011f)
                curveTo(21.436f, 18.779f, 22.021f, 20.052f, 22.708f, 21.073f)
                curveTo(23.572f, 22.356f, 24.494f, 23.137f, 25.377f, 23.137f)
                curveTo(26.263f, 23.137f, 27.185f, 22.411f, 28.046f, 21.201f)
                curveTo(28.752f, 20.208f, 29.357f, 18.949f, 29.598f, 18.02f)
                curveTo(29.896f, 16.871f, 30.035f, 14.936f, 30.018f, 12.203f)
                lineTo(30.016f, 11.856f)
                lineTo(29.698f, 12.02f)
                curveTo(29.058f, 12.352f, 28.368f, 12.517f, 27.626f, 12.517f)
                curveTo(26.892f, 12.517f, 26.184f, 12.298f, 25.498f, 11.856f)
                lineTo(25.38f, 11.781f)
                lineTo(25.26f, 11.854f)
                curveTo(24.536f, 12.298f, 23.855f, 12.517f, 23.217f, 12.517f)
                curveTo(22.57f, 12.517f, 21.92f, 12.352f, 21.265f, 12.019f)
                lineTo(20.943f, 11.856f)
                close()
                moveTo(21.489f, 17.969f)
                curveTo(21.299f, 17.063f, 21.19f, 15.141f, 21.163f, 12.205f)
                curveTo(21.85f, 12.553f, 22.534f, 12.727f, 23.217f, 12.727f)
                curveTo(23.9f, 12.727f, 24.62f, 12.495f, 25.377f, 12.031f)
                curveTo(26.098f, 12.495f, 26.848f, 12.727f, 27.626f, 12.727f)
                curveTo(28.403f, 12.727f, 29.129f, 12.553f, 29.801f, 12.205f)
                curveTo(29.818f, 14.92f, 29.68f, 16.842f, 29.387f, 17.969f)
                curveTo(28.948f, 19.661f, 27.108f, 22.927f, 25.377f, 22.927f)
                curveTo(23.646f, 22.927f, 21.774f, 19.33f, 21.489f, 17.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5FBFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.163f, 12.205f)
                curveTo(21.163f, 12.205f, 21.204f, 16.609f, 21.489f, 17.969f)
                curveTo(21.774f, 19.33f, 23.646f, 22.927f, 25.377f, 22.927f)
                curveTo(27.108f, 22.927f, 28.948f, 19.661f, 29.387f, 17.969f)
                curveTo(29.826f, 16.278f, 29.801f, 12.205f, 29.801f, 12.205f)
                curveTo(29.801f, 12.205f, 28.792f, 12.727f, 27.626f, 12.727f)
                curveTo(26.459f, 12.727f, 25.377f, 12.031f, 25.377f, 12.031f)
                curveTo(25.377f, 12.031f, 24.241f, 12.727f, 23.217f, 12.727f)
                curveTo(22.193f, 12.727f, 21.163f, 12.205f, 21.163f, 12.205f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(21.163f, 12.205f)
                curveTo(21.163f, 12.205f, 21.204f, 16.609f, 21.489f, 17.969f)
                curveTo(21.774f, 19.33f, 23.646f, 22.927f, 25.377f, 22.927f)
                curveTo(27.108f, 22.927f, 28.948f, 19.661f, 29.387f, 17.969f)
                curveTo(29.826f, 16.278f, 29.801f, 12.205f, 29.801f, 12.205f)
                curveTo(29.801f, 12.205f, 28.792f, 12.727f, 27.626f, 12.727f)
                curveTo(26.459f, 12.727f, 25.377f, 12.031f, 25.377f, 12.031f)
                curveTo(25.377f, 12.031f, 24.241f, 12.727f, 23.217f, 12.727f)
                curveTo(22.193f, 12.727f, 21.163f, 12.205f, 21.163f, 12.205f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFF9800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24.64f, 15.488f)
                curveTo(24.64f, 15.776f, 24.229f, 16.613f, 23.991f, 16.828f)
                curveTo(23.814f, 16.986f, 23.869f, 16.618f, 23.909f, 16.346f)
                lineTo(23.909f, 16.346f)
                curveTo(23.923f, 16.25f, 23.935f, 16.167f, 23.935f, 16.122f)
                lineTo(23.935f, 16.102f)
                curveTo(23.935f, 16.046f, 23.935f, 16.015f, 23.93f, 15.985f)
                curveTo(23.923f, 15.95f, 23.908f, 15.916f, 23.875f, 15.841f)
                lineTo(23.875f, 15.841f)
                curveTo(23.863f, 15.813f, 23.848f, 15.779f, 23.83f, 15.738f)
                curveTo(23.449f, 14.924f, 23.719f, 14.534f, 23.839f, 14.361f)
                curveTo(23.857f, 14.334f, 23.872f, 14.313f, 23.88f, 14.296f)
                curveTo(23.898f, 14.259f, 23.932f, 14.226f, 23.971f, 14.19f)
                curveTo(24.066f, 14.097f, 24.187f, 13.981f, 24.142f, 13.719f)
                curveTo(24.078f, 13.354f, 24.464f, 12.886f, 24.464f, 12.886f)
                curveTo(24.464f, 12.886f, 24.37f, 13.794f, 24.814f, 13.572f)
                curveTo(25.102f, 13.427f, 25.625f, 13.635f, 26.09f, 13.819f)
                curveTo(26.34f, 13.919f, 26.574f, 14.011f, 26.745f, 14.039f)
                curveTo(27.091f, 14.094f, 27.28f, 13.949f, 27.398f, 13.859f)
                curveTo(27.446f, 13.822f, 27.483f, 13.794f, 27.512f, 13.794f)
                curveTo(27.614f, 13.794f, 27.734f, 13.815f, 27.734f, 13.889f)
                curveTo(27.734f, 13.963f, 27.278f, 14.181f, 27.049f, 14.248f)
                curveTo(26.877f, 14.299f, 27.054f, 14.44f, 27.202f, 14.558f)
                curveTo(27.251f, 14.597f, 27.296f, 14.633f, 27.325f, 14.663f)
                curveTo(27.444f, 14.783f, 27.552f, 15.442f, 27.278f, 15.027f)
                curveTo(27.005f, 14.613f, 26.423f, 14.336f, 25.928f, 14.296f)
                curveTo(25.433f, 14.255f, 24.809f, 14.631f, 24.734f, 15.027f)
                curveTo(24.659f, 15.424f, 25.319f, 15.351f, 25.319f, 15.351f)
                curveTo(25.319f, 15.351f, 25.271f, 15.413f, 25.058f, 15.488f)
                curveTo(24.845f, 15.563f, 24.64f, 15.488f, 24.64f, 15.488f)
                close()
                moveTo(24.142f, 15.457f)
                curveTo(24.142f, 15.515f, 24.093f, 15.562f, 24.033f, 15.562f)
                curveTo(23.973f, 15.562f, 23.925f, 15.515f, 23.925f, 15.457f)
                curveTo(23.925f, 15.399f, 23.973f, 15.352f, 24.033f, 15.352f)
                curveTo(24.093f, 15.352f, 24.142f, 15.399f, 24.142f, 15.457f)
                close()
                moveTo(26.582f, 17.401f)
                curveTo(26.279f, 17.297f, 25.347f, 17.343f, 25.096f, 17.483f)
                curveTo(25.096f, 17.483f, 25.062f, 17.267f, 24.893f, 17.117f)
                curveTo(24.724f, 16.967f, 24.646f, 16.955f, 24.646f, 16.955f)
                curveTo(24.646f, 16.955f, 25.03f, 17.497f, 24.647f, 17.624f)
                curveTo(24.264f, 17.75f, 23.633f, 17.387f, 23.428f, 16.934f)
                curveTo(23.224f, 16.482f, 23.184f, 15.838f, 23.413f, 15.398f)
                curveTo(23.643f, 14.958f, 23.12f, 15.372f, 23.072f, 15.534f)
                curveTo(23.06f, 15.574f, 23.05f, 15.631f, 23.04f, 15.692f)
                curveTo(23.009f, 15.879f, 22.971f, 16.102f, 22.843f, 15.976f)
                curveTo(22.673f, 15.809f, 22.262f, 15.516f, 22.197f, 15.552f)
                curveTo(22.132f, 15.588f, 22.172f, 15.703f, 22.222f, 15.792f)
                curveTo(22.236f, 15.818f, 22.278f, 15.836f, 22.334f, 15.86f)
                curveTo(22.469f, 15.919f, 22.688f, 16.014f, 22.808f, 16.344f)
                curveTo(22.866f, 16.507f, 22.899f, 16.756f, 22.933f, 17.023f)
                curveTo(22.997f, 17.52f, 23.069f, 18.077f, 23.335f, 18.259f)
                curveTo(23.745f, 18.54f, 22.905f, 18.898f, 22.905f, 18.898f)
                curveTo(22.905f, 18.898f, 23.502f, 19.009f, 23.79f, 18.776f)
                curveTo(23.997f, 18.609f, 24.157f, 18.659f, 24.285f, 18.698f)
                lineTo(24.285f, 18.698f)
                curveTo(24.335f, 18.713f, 24.38f, 18.727f, 24.421f, 18.725f)
                curveTo(24.44f, 18.724f, 24.466f, 18.727f, 24.498f, 18.73f)
                curveTo(24.708f, 18.751f, 25.179f, 18.798f, 25.706f, 18.07f)
                curveTo(25.734f, 18.034f, 25.756f, 18.005f, 25.775f, 17.98f)
                lineTo(25.775f, 17.98f)
                curveTo(25.824f, 17.915f, 25.847f, 17.886f, 25.875f, 17.862f)
                curveTo(25.898f, 17.843f, 25.925f, 17.828f, 25.974f, 17.801f)
                lineTo(25.992f, 17.791f)
                curveTo(26.031f, 17.77f, 26.11f, 17.74f, 26.2f, 17.706f)
                lineTo(26.2f, 17.706f)
                lineTo(26.2f, 17.706f)
                curveTo(26.458f, 17.609f, 26.806f, 17.478f, 26.582f, 17.401f)
                close()
                moveTo(25.329f, 17.882f)
                curveTo(25.379f, 17.854f, 25.444f, 17.873f, 25.473f, 17.926f)
                curveTo(25.502f, 17.978f, 25.485f, 18.044f, 25.434f, 18.072f)
                curveTo(25.383f, 18.1f, 25.319f, 18.08f, 25.29f, 18.027f)
                curveTo(25.261f, 17.975f, 25.278f, 17.91f, 25.329f, 17.882f)
                close()
                moveTo(25.842f, 14.874f)
                curveTo(25.919f, 15.185f, 26.466f, 15.941f, 26.72f, 16.076f)
                curveTo(26.72f, 16.076f, 26.557f, 16.222f, 26.523f, 16.446f)
                curveTo(26.49f, 16.669f, 26.522f, 16.741f, 26.522f, 16.741f)
                curveTo(26.522f, 16.741f, 26.767f, 16.123f, 27.082f, 16.376f)
                curveTo(27.397f, 16.628f, 27.436f, 17.355f, 27.168f, 17.773f)
                curveTo(26.9f, 18.191f, 26.382f, 18.575f, 25.888f, 18.622f)
                curveTo(25.394f, 18.67f, 26.026f, 18.883f, 26.188f, 18.835f)
                curveTo(26.228f, 18.823f, 26.281f, 18.8f, 26.338f, 18.775f)
                curveTo(26.512f, 18.7f, 26.719f, 18.61f, 26.683f, 18.786f)
                curveTo(26.635f, 19.02f, 26.614f, 19.524f, 26.679f, 19.559f)
                curveTo(26.745f, 19.594f, 26.819f, 19.497f, 26.867f, 19.408f)
                curveTo(26.881f, 19.381f, 26.873f, 19.336f, 26.863f, 19.276f)
                curveTo(26.839f, 19.13f, 26.799f, 18.895f, 27.011f, 18.616f)
                curveTo(27.116f, 18.477f, 27.307f, 18.315f, 27.512f, 18.14f)
                curveTo(27.894f, 17.816f, 28.322f, 17.452f, 28.33f, 17.13f)
                curveTo(28.342f, 16.633f, 29.1f, 17.143f, 29.1f, 17.143f)
                curveTo(29.1f, 17.143f, 28.868f, 16.582f, 28.515f, 16.467f)
                curveTo(28.263f, 16.384f, 28.217f, 16.223f, 28.18f, 16.095f)
                curveTo(28.166f, 16.044f, 28.153f, 15.999f, 28.129f, 15.965f)
                curveTo(28.118f, 15.95f, 28.106f, 15.927f, 28.091f, 15.898f)
                curveTo(27.995f, 15.711f, 27.777f, 15.29f, 26.88f, 15.245f)
                curveTo(26.834f, 15.241f, 26.798f, 15.238f, 26.767f, 15.236f)
                curveTo(26.686f, 15.229f, 26.649f, 15.227f, 26.614f, 15.216f)
                curveTo(26.585f, 15.207f, 26.558f, 15.193f, 26.508f, 15.166f)
                curveTo(26.503f, 15.163f, 26.497f, 15.16f, 26.491f, 15.157f)
                curveTo(26.451f, 15.136f, 26.383f, 15.086f, 26.306f, 15.028f)
                lineTo(26.306f, 15.028f)
                curveTo(26.084f, 14.865f, 25.785f, 14.644f, 25.842f, 14.874f)
                close()
                moveTo(26.962f, 15.703f)
                curveTo(26.911f, 15.676f, 26.892f, 15.611f, 26.92f, 15.558f)
                curveTo(26.948f, 15.505f, 27.013f, 15.484f, 27.064f, 15.512f)
                curveTo(27.115f, 15.539f, 27.133f, 15.604f, 27.105f, 15.657f)
                curveTo(27.077f, 15.71f, 27.013f, 15.731f, 26.962f, 15.703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF36C6FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.426f, 19.752f)
                horizontalLineTo(28.705f)
                verticalLineTo(23.209f)
                horizontalLineTo(21.426f)
                verticalLineTo(19.752f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-2.004f, 13f)
                lineTo(1.957f, 14.737f)
                lineTo(18.09f, 1.889f)
                lineTo(20.179f, -0.693f)
                lineTo(15.943f, -1.273f)
                lineTo(9.363f, 4.263f)
                lineTo(4.067f, 7.994f)
                lineTo(-2.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.462f, 14.217f)
                lineTo(0.556f, 15.225f)
                lineTo(19.429f, -0.933f)
                horizontalLineTo(16.596f)
                lineTo(-1.462f, 14.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(20.004f, 13f)
                lineTo(16.043f, 14.737f)
                lineTo(-0.09f, 1.889f)
                lineTo(-2.179f, -0.693f)
                lineTo(2.056f, -1.273f)
                lineTo(8.637f, 4.263f)
                lineTo(13.933f, 7.994f)
                lineTo(20.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(19.869f, 13.873f)
                lineTo(17.851f, 14.882f)
                lineTo(9.815f, 7.964f)
                lineTo(7.432f, 7.191f)
                lineTo(-2.38f, -0.684f)
                horizontalLineTo(0.453f)
                lineTo(10.26f, 7.004f)
                lineTo(12.865f, 7.931f)
                lineTo(19.869f, 13.873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.985f, 0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.485f, 0f)
                horizontalLineTo(11.484f)
                verticalLineTo(4.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.484f)
                lineTo(11.5f, 14f)
                horizontalLineTo(6.5f)
                lineTo(6.485f, 9.5f)
                horizontalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.485f)
                verticalLineTo(0f)
                close()
                moveTo(7.985f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AnguillaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Anguilla,
            contentDescription = "Anguilla Flag"
        )
    }
}
