package flagpack.icons.small

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
 * Isle of Man Flag (16x12dp)
 *
 * - ISO Alpha-2: IM
 * - ISO Alpha-3: IMN
 * - ISO Numeric: 833
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.IsleOfMan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Isle of Man:IM:IMN:833:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.047f, 2.07f)
                curveTo(3.043f, 2.024f, 3.098f, 2.002f, 3.13f, 2.036f)
                curveTo(3.354f, 2.282f, 3.948f, 2.894f, 4.291f, 2.894f)
                curveTo(4.72f, 2.894f, 6.407f, 1.473f, 6.906f, 1.704f)
                curveTo(7.404f, 1.936f, 8.414f, 4.356f, 8.414f, 4.356f)
                lineTo(7.756f, 5.182f)
                lineTo(6.906f, 4.718f)
                lineTo(6.67f, 3.172f)
                curveTo(6.67f, 3.172f, 5.109f, 3.954f, 4.291f, 3.649f)
                lineTo(3.831f, 3.816f)
                curveTo(3.831f, 3.816f, 3.389f, 2.94f, 3.214f, 2.672f)
                curveTo(3.099f, 2.494f, 3.06f, 2.229f, 3.047f, 2.07f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4.138f)
                lineTo(3.412f, 4.447f)
                lineTo(3.524f, 3.792f)
                lineTo(3.049f, 3.329f)
                lineTo(3.706f, 3.233f)
                lineTo(4f, 2.638f)
                lineTo(4.294f, 3.233f)
                lineTo(4.951f, 3.329f)
                lineTo(4.476f, 3.792f)
                lineTo(4.588f, 4.447f)
                lineTo(4f, 4.138f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.566f, 1.768f)
                curveTo(6.573f, 1.674f, 6.652f, 1.602f, 6.746f, 1.602f)
                curveTo(6.851f, 1.602f, 6.935f, 1.692f, 6.926f, 1.797f)
                lineTo(6.816f, 3.179f)
                curveTo(6.808f, 3.273f, 6.73f, 3.346f, 6.635f, 3.346f)
                curveTo(6.53f, 3.346f, 6.447f, 3.256f, 6.455f, 3.15f)
                lineTo(6.566f, 1.768f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.61f, 2.552f)
                curveTo(12.651f, 2.573f, 12.641f, 2.632f, 12.595f, 2.64f)
                curveTo(12.268f, 2.7f, 11.434f, 2.879f, 11.252f, 3.17f)
                curveTo(11.025f, 3.535f, 11.336f, 5.718f, 10.876f, 6.019f)
                curveTo(10.415f, 6.319f, 7.827f, 5.892f, 7.827f, 5.892f)
                lineTo(7.476f, 4.897f)
                lineTo(8.32f, 4.422f)
                lineTo(9.801f, 5.012f)
                curveTo(9.801f, 5.012f, 9.94f, 3.333f, 10.633f, 2.801f)
                lineTo(10.714f, 2.292f)
                curveTo(10.714f, 2.292f, 11.692f, 2.381f, 12.011f, 2.375f)
                curveTo(12.223f, 2.371f, 12.468f, 2.479f, 12.61f, 2.552f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.252f, 2.428f)
                lineTo(10.302f, 1.766f)
                lineTo(10.797f, 2.208f)
                lineTo(11.443f, 2.05f)
                lineTo(11.175f, 2.658f)
                lineTo(11.525f, 3.223f)
                lineTo(10.864f, 3.157f)
                lineTo(10.435f, 3.663f)
                lineTo(10.293f, 3.015f)
                lineTo(9.679f, 2.763f)
                lineTo(10.252f, 2.428f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.977f, 5.599f)
                curveTo(11.057f, 5.658f, 11.08f, 5.768f, 11.031f, 5.854f)
                curveTo(10.972f, 5.957f, 10.836f, 5.983f, 10.742f, 5.911f)
                lineTo(9.78f, 5.164f)
                curveTo(9.719f, 5.117f, 9.696f, 5.036f, 9.723f, 4.963f)
                curveTo(9.764f, 4.854f, 9.898f, 4.813f, 9.993f, 4.882f)
                lineTo(10.977f, 5.599f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.431f, 10.492f)
                curveTo(7.392f, 10.517f, 7.346f, 10.479f, 7.362f, 10.435f)
                curveTo(7.474f, 10.121f, 7.735f, 9.31f, 7.574f, 9.007f)
                curveTo(7.372f, 8.628f, 5.326f, 7.805f, 5.296f, 7.257f)
                curveTo(5.266f, 6.708f, 6.93f, 4.68f, 6.93f, 4.68f)
                lineTo(7.967f, 4.873f)
                lineTo(7.957f, 5.842f)
                lineTo(6.611f, 6.828f)
                curveTo(6.611f, 6.828f, 8.127f, 7.779f, 8.241f, 8.644f)
                lineTo(8.604f, 8.98f)
                curveTo(8.604f, 8.98f, 8.038f, 9.782f, 7.883f, 10.062f)
                curveTo(7.781f, 10.247f, 7.565f, 10.406f, 7.431f, 10.492f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.946f, 8.457f)
                lineTo(9.495f, 8.831f)
                lineTo(8.864f, 9.039f)
                lineTo(8.678f, 9.677f)
                lineTo(8.285f, 9.141f)
                lineTo(7.622f, 9.161f)
                lineTo(8.009f, 8.622f)
                lineTo(7.785f, 7.997f)
                lineTo(8.418f, 8.199f)
                lineTo(8.943f, 7.793f)
                lineTo(8.946f, 8.457f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.552f, 7.478f)
                curveTo(5.44f, 7.521f, 5.316f, 7.459f, 5.284f, 7.344f)
                curveTo(5.255f, 7.243f, 5.308f, 7.137f, 5.405f, 7.099f)
                lineTo(6.414f, 6.705f)
                curveTo(6.507f, 6.668f, 6.612f, 6.703f, 6.665f, 6.788f)
                curveTo(6.733f, 6.898f, 6.685f, 7.044f, 6.563f, 7.09f)
                lineTo(5.552f, 7.478f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(6.831f, 4.882f)
                curveTo(6.769f, 4.861f, 6.736f, 4.791f, 6.757f, 4.728f)
                curveTo(6.778f, 4.664f, 6.878f, 4.557f, 6.94f, 4.579f)
                lineTo(7.808f, 4.882f)
                curveTo(7.853f, 4.898f, 7.884f, 4.939f, 7.888f, 4.988f)
                lineTo(7.966f, 5.94f)
                curveTo(7.971f, 6.007f, 7.874f, 6.061f, 7.808f, 6.067f)
                curveTo(7.743f, 6.072f, 7.685f, 6.022f, 7.68f, 5.955f)
                lineTo(7.608f, 5.137f)
                lineTo(6.831f, 4.882f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(8.34f, 4.384f)
                curveTo(8.392f, 4.342f, 8.485f, 4.39f, 8.525f, 4.444f)
                curveTo(8.566f, 4.497f, 8.556f, 4.573f, 8.504f, 4.615f)
                lineTo(7.903f, 5.231f)
                curveTo(7.851f, 5.272f, 7.735f, 5.192f, 7.694f, 5.138f)
                curveTo(7.654f, 5.085f, 7.642f, 4.94f, 7.694f, 4.899f)
                lineTo(8.34f, 4.384f)
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
            imageVector = FlagIcons.Small.IsleOfMan,
            contentDescription = "Isle of Man Flag"
        )
    }
}
