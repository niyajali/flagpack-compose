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
 * Isle of Man Flag (20x15dp)
 *
 * - ISO Alpha-2: IM
 * - ISO Alpha-3: IMN
 * - ISO Numeric: 833
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.IsleOfMan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Isle of Man:IM:IMN:833:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.808f, 2.588f)
                curveTo(3.804f, 2.53f, 3.873f, 2.502f, 3.912f, 2.545f)
                curveTo(4.193f, 2.852f, 4.935f, 3.617f, 5.364f, 3.617f)
                curveTo(5.901f, 3.617f, 8.009f, 1.841f, 8.632f, 2.13f)
                curveTo(9.255f, 2.42f, 10.517f, 5.446f, 10.517f, 5.446f)
                lineTo(9.695f, 6.477f)
                lineTo(8.632f, 5.897f)
                lineTo(8.431f, 3.617f)
                curveTo(8.431f, 3.617f, 6.386f, 4.67f, 5.364f, 4.288f)
                lineTo(4.789f, 4.77f)
                curveTo(4.789f, 4.77f, 4.236f, 3.675f, 4.018f, 3.34f)
                curveTo(3.874f, 3.118f, 3.825f, 2.787f, 3.808f, 2.588f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.164f, 5.078f)
                lineTo(4.814f, 5.29f)
                lineTo(4.881f, 4.841f)
                lineTo(4.598f, 4.523f)
                lineTo(4.989f, 4.457f)
                lineTo(5.164f, 4.049f)
                lineTo(5.339f, 4.457f)
                lineTo(5.73f, 4.523f)
                lineTo(5.447f, 4.841f)
                lineTo(5.514f, 5.29f)
                lineTo(5.164f, 5.078f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.133f, 2.37f)
                curveTo(8.133f, 2.245f, 8.234f, 2.143f, 8.36f, 2.143f)
                curveTo(8.485f, 2.143f, 8.586f, 2.245f, 8.586f, 2.37f)
                verticalLineTo(3.441f)
                curveTo(8.586f, 3.566f, 8.485f, 3.668f, 8.36f, 3.668f)
                curveTo(8.234f, 3.668f, 8.133f, 3.566f, 8.133f, 3.441f)
                lineTo(8.133f, 2.37f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.763f, 3.19f)
                curveTo(15.814f, 3.216f, 15.801f, 3.29f, 15.744f, 3.3f)
                curveTo(15.335f, 3.375f, 14.293f, 3.599f, 14.066f, 3.963f)
                curveTo(13.781f, 4.418f, 14.17f, 7.148f, 13.595f, 7.523f)
                curveTo(13.019f, 7.898f, 9.784f, 7.365f, 9.784f, 7.365f)
                lineTo(9.345f, 6.121f)
                lineTo(10.4f, 5.527f)
                lineTo(12.44f, 6.565f)
                curveTo(12.44f, 6.565f, 12.632f, 4.272f, 13.497f, 3.608f)
                lineTo(13.392f, 2.865f)
                curveTo(13.392f, 2.865f, 14.615f, 2.976f, 15.014f, 2.969f)
                curveTo(15.279f, 2.964f, 15.585f, 3.098f, 15.763f, 3.19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.933f, 3.02f)
                lineTo(12.939f, 2.611f)
                lineTo(13.284f, 2.905f)
                lineTo(13.704f, 2.834f)
                lineTo(13.552f, 3.2f)
                lineTo(13.806f, 3.565f)
                lineTo(13.367f, 3.497f)
                lineTo(13.104f, 3.794f)
                lineTo(12.984f, 3.385f)
                lineTo(12.568f, 3.204f)
                lineTo(12.933f, 3.02f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.696f, 7.003f)
                curveTo(13.809f, 7.073f, 13.845f, 7.219f, 13.78f, 7.333f)
                curveTo(13.709f, 7.456f, 13.549f, 7.494f, 13.431f, 7.415f)
                lineTo(12.463f, 6.768f)
                curveTo(12.377f, 6.71f, 12.341f, 6.6f, 12.377f, 6.502f)
                curveTo(12.427f, 6.369f, 12.586f, 6.315f, 12.707f, 6.39f)
                lineTo(13.696f, 7.003f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.289f, 13.115f)
                curveTo(9.24f, 13.146f, 9.183f, 13.098f, 9.202f, 13.044f)
                curveTo(9.342f, 12.651f, 9.669f, 11.637f, 9.468f, 11.258f)
                curveTo(9.216f, 10.784f, 6.657f, 9.757f, 6.62f, 9.071f)
                curveTo(6.583f, 8.384f, 8.662f, 5.85f, 8.662f, 5.85f)
                lineTo(9.959f, 6.092f)
                lineTo(9.946f, 7.302f)
                lineTo(8.028f, 8.55f)
                curveTo(8.028f, 8.55f, 9.917f, 9.862f, 10.059f, 10.944f)
                lineTo(10.755f, 11.224f)
                curveTo(10.755f, 11.224f, 10.048f, 12.227f, 9.854f, 12.577f)
                curveTo(9.726f, 12.808f, 9.457f, 13.007f, 9.289f, 13.115f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.851f, 10.749f)
                lineTo(11.203f, 10.959f)
                lineTo(10.775f, 11.111f)
                lineTo(10.627f, 11.51f)
                lineTo(10.385f, 11.195f)
                lineTo(9.943f, 11.232f)
                lineTo(10.221f, 10.886f)
                lineTo(10.095f, 10.51f)
                lineTo(10.509f, 10.611f)
                lineTo(10.874f, 10.341f)
                lineTo(10.851f, 10.749f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.94f, 9.348f)
                curveTo(6.8f, 9.401f, 6.645f, 9.324f, 6.605f, 9.18f)
                curveTo(6.569f, 9.054f, 6.635f, 8.922f, 6.757f, 8.874f)
                lineTo(7.799f, 8.467f)
                curveTo(7.915f, 8.422f, 8.047f, 8.466f, 8.112f, 8.572f)
                curveTo(8.198f, 8.709f, 8.137f, 8.891f, 7.985f, 8.949f)
                lineTo(6.94f, 9.348f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(8.539f, 6.103f)
                curveTo(8.461f, 6.076f, 8.42f, 5.989f, 8.446f, 5.91f)
                curveTo(8.473f, 5.83f, 8.597f, 5.697f, 8.675f, 5.724f)
                lineTo(9.76f, 6.103f)
                curveTo(9.816f, 6.123f, 9.855f, 6.174f, 9.86f, 6.235f)
                lineTo(9.957f, 7.425f)
                curveTo(9.964f, 7.508f, 9.842f, 7.576f, 9.76f, 7.583f)
                curveTo(9.678f, 7.59f, 9.606f, 7.528f, 9.599f, 7.444f)
                lineTo(9.51f, 6.421f)
                lineTo(8.539f, 6.103f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(10.425f, 5.48f)
                curveTo(10.49f, 5.428f, 10.606f, 5.488f, 10.656f, 5.554f)
                curveTo(10.707f, 5.621f, 10.695f, 5.717f, 10.63f, 5.768f)
                lineTo(9.879f, 6.539f)
                curveTo(9.814f, 6.59f, 9.668f, 6.489f, 9.618f, 6.423f)
                curveTo(9.567f, 6.357f, 9.553f, 6.176f, 9.618f, 6.124f)
                lineTo(10.425f, 5.48f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IsleOfManPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.IsleOfMan,
            contentDescription = "Isle of Man Flag"
        )
    }
}
