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
 * Slovenia Flag (32x24dp)
 *
 * - ISO Alpha-2: SI
 * - ISO Alpha-3: SVN
 * - ISO Numeric: 705
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Slovenia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovenia:SI:SVN:705:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.74f, 5.036f)
                curveTo(13.74f, 5.036f, 11.635f, 4.042f, 9.018f, 4.042f)
                curveTo(6.4f, 4.042f, 4.295f, 5.036f, 4.295f, 5.036f)
                curveTo(4.295f, 5.036f, 4.529f, 9.031f, 4.9f, 11.147f)
                curveTo(5.058f, 12.051f, 5.817f, 13.369f, 6.505f, 13.992f)
                curveTo(7.289f, 14.703f, 9.018f, 15.546f, 9.018f, 15.546f)
                curveTo(9.518f, 15.201f, 10.453f, 15.046f, 11.649f, 13.992f)
                curveTo(12.844f, 12.939f, 13.141f, 11.147f, 13.141f, 11.147f)
                lineTo(13.74f, 5.036f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(13.462f, 4.906f)
                lineTo(14.339f, 5.343f)
                lineTo(13.737f, 11.366f)
                curveTo(13.526f, 12.641f, 12.999f, 13.646f, 12.156f, 14.389f)
                curveTo(11.698f, 14.792f, 11.252f, 15.094f, 10.773f, 15.344f)
                curveTo(10.503f, 15.485f, 9.372f, 16.067f, 9.382f, 16.063f)
                curveTo(9.269f, 16.117f, 9.183f, 16.165f, 9.113f, 16.213f)
                lineTo(9.004f, 16.288f)
                lineTo(8.886f, 16.231f)
                curveTo(7.715f, 15.66f, 6.623f, 14.893f, 6.08f, 14.4f)
                curveTo(5.339f, 13.728f, 4.558f, 12.353f, 4.391f, 11.401f)
                curveTo(4.142f, 9.978f, 3.919f, 8.017f, 3.762f, 5.343f)
                lineTo(4.549f, 4.931f)
                curveTo(4.705f, 7.585f, 4.893f, 9.699f, 5.137f, 11.097f)
                curveTo(5.282f, 11.925f, 6.002f, 13.193f, 6.66f, 13.788f)
                curveTo(7.145f, 14.229f, 7.928f, 14.717f, 9.004f, 15.249f)
                curveTo(9.068f, 15.211f, 9.139f, 15.174f, 9.221f, 15.135f)
                curveTo(9.223f, 15.134f, 9.955f, 14.809f, 10.209f, 14.675f)
                curveTo(10.655f, 14.442f, 11.07f, 14.163f, 11.497f, 13.786f)
                curveTo(12.245f, 13.127f, 12.713f, 12.238f, 12.902f, 11.109f)
                lineTo(13.462f, 4.906f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.542f, 11.024f)
                curveTo(5.542f, 11.024f, 5.733f, 11.608f, 6.086f, 12.263f)
                curveTo(6.604f, 12.4f, 6.92f, 12.393f, 7.021f, 12.281f)
                curveTo(7.31f, 11.956f, 8.341f, 11.818f, 8.534f, 12.095f)
                curveTo(8.653f, 12.266f, 9.07f, 12.384f, 9.526f, 12.227f)
                lineTo(9.475f, 12.236f)
                curveTo(9.554f, 12.208f, 9.74f, 12.134f, 9.854f, 12.089f)
                curveTo(9.902f, 12.07f, 9.937f, 12.056f, 9.947f, 12.052f)
                curveTo(10.119f, 11.987f, 10.245f, 11.953f, 10.374f, 11.944f)
                curveTo(10.535f, 11.932f, 10.689f, 11.962f, 10.853f, 12.04f)
                curveTo(11.213f, 12.211f, 11.657f, 12.291f, 11.96f, 12.239f)
                curveTo(12.329f, 11.595f, 12.593f, 11.024f, 12.593f, 11.024f)
                lineTo(10.838f, 9.34f)
                lineTo(10.14f, 10.097f)
                lineTo(8.981f, 8.444f)
                lineTo(8.01f, 10.097f)
                lineTo(7.266f, 9.34f)
                lineTo(5.542f, 11.024f)
                close()
                moveTo(6.557f, 13.014f)
                curveTo(6.476f, 12.905f, 6.399f, 12.792f, 6.327f, 12.679f)
                curveTo(6.777f, 12.76f, 7.082f, 12.717f, 7.251f, 12.527f)
                curveTo(7.331f, 12.438f, 7.569f, 12.351f, 7.84f, 12.314f)
                curveTo(7.966f, 12.297f, 8.087f, 12.293f, 8.18f, 12.302f)
                curveTo(8.223f, 12.306f, 8.257f, 12.313f, 8.28f, 12.321f)
                curveTo(8.287f, 12.323f, 8.287f, 12.323f, 8.279f, 12.312f)
                lineTo(8.278f, 12.31f)
                curveTo(8.485f, 12.606f, 9.047f, 12.764f, 9.577f, 12.571f)
                lineTo(9.526f, 12.58f)
                curveTo(9.669f, 12.536f, 9.927f, 12.435f, 10.02f, 12.398f)
                lineTo(10.02f, 12.398f)
                lineTo(10.052f, 12.386f)
                curveTo(10.2f, 12.33f, 10.301f, 12.303f, 10.396f, 12.296f)
                curveTo(10.505f, 12.288f, 10.608f, 12.308f, 10.724f, 12.363f)
                curveTo(11.043f, 12.515f, 11.414f, 12.605f, 11.74f, 12.608f)
                curveTo(11.671f, 12.72f, 11.599f, 12.832f, 11.525f, 12.941f)
                curveTo(11.272f, 13f, 10.879f, 12.922f, 10.562f, 12.75f)
                curveTo(10.414f, 12.669f, 10.273f, 12.637f, 10.125f, 12.65f)
                curveTo(10.009f, 12.66f, 9.896f, 12.695f, 9.743f, 12.761f)
                curveTo(9.734f, 12.765f, 9.703f, 12.779f, 9.66f, 12.798f)
                curveTo(9.56f, 12.843f, 9.4f, 12.917f, 9.331f, 12.945f)
                lineTo(9.389f, 12.933f)
                curveTo(8.992f, 13.086f, 8.645f, 12.974f, 8.546f, 12.81f)
                curveTo(8.369f, 12.518f, 7.443f, 12.661f, 7.182f, 12.995f)
                curveTo(7.113f, 13.085f, 6.903f, 13.101f, 6.557f, 13.014f)
                close()
                moveTo(6.902f, 13.424f)
                curveTo(6.921f, 13.443f, 6.941f, 13.463f, 6.961f, 13.483f)
                curveTo(7.864f, 14.363f, 8.981f, 14.795f, 8.981f, 14.795f)
                curveTo(8.981f, 14.795f, 10.311f, 14.393f, 11.065f, 13.545f)
                curveTo(11.13f, 13.473f, 11.194f, 13.395f, 11.259f, 13.312f)
                curveTo(10.983f, 13.298f, 10.681f, 13.209f, 10.418f, 13.065f)
                curveTo(10.321f, 13.013f, 10.238f, 12.994f, 10.15f, 13.002f)
                curveTo(10.072f, 13.008f, 9.987f, 13.035f, 9.861f, 13.089f)
                curveTo(9.858f, 13.09f, 9.85f, 13.094f, 9.838f, 13.099f)
                curveTo(9.761f, 13.134f, 9.528f, 13.239f, 9.389f, 13.286f)
                lineTo(9.446f, 13.275f)
                curveTo(8.979f, 13.47f, 8.483f, 13.316f, 8.289f, 13.024f)
                curveTo(8.272f, 13.017f, 8.245f, 13.011f, 8.211f, 13.008f)
                curveTo(8.134f, 12.999f, 8.031f, 13.003f, 7.924f, 13.02f)
                curveTo(7.694f, 13.055f, 7.494f, 13.139f, 7.428f, 13.224f)
                curveTo(7.316f, 13.368f, 7.141f, 13.431f, 6.902f, 13.424f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.147f, 5.886f)
                horizontalLineTo(6.444f)
                lineTo(6.989f, 5.375f)
                lineTo(6.444f, 4.835f)
                horizontalLineTo(7.147f)
                lineTo(7.444f, 4.311f)
                lineTo(7.742f, 4.835f)
                horizontalLineTo(8.444f)
                lineTo(7.926f, 5.343f)
                lineTo(8.386f, 5.886f)
                horizontalLineTo(7.742f)
                lineTo(7.444f, 6.439f)
                lineTo(7.147f, 5.886f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.461f, 5.886f)
                horizontalLineTo(9.757f)
                lineTo(10.303f, 5.375f)
                lineTo(9.757f, 4.835f)
                horizontalLineTo(10.461f)
                lineTo(10.757f, 4.311f)
                lineTo(11.056f, 4.835f)
                horizontalLineTo(11.757f)
                lineTo(11.239f, 5.343f)
                lineTo(11.699f, 5.886f)
                horizontalLineTo(11.056f)
                lineTo(10.757f, 6.439f)
                lineTo(10.461f, 5.886f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.6f, 7.568f)
                horizontalLineTo(7.897f)
                lineTo(8.442f, 7.057f)
                lineTo(7.897f, 6.517f)
                horizontalLineTo(8.6f)
                lineTo(8.897f, 5.993f)
                lineTo(9.195f, 6.517f)
                horizontalLineTo(9.897f)
                lineTo(9.379f, 7.024f)
                lineTo(9.839f, 7.568f)
                horizontalLineTo(9.195f)
                lineTo(8.897f, 8.12f)
                lineTo(8.6f, 7.568f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SloveniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Slovenia,
            contentDescription = "Slovenia Flag"
        )
    }
}
