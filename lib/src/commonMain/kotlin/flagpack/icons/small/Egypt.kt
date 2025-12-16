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
 * Egypt Flag (16x12dp)
 *
 * - ISO Alpha-2: EG
 * - ISO Alpha-3: EGY
 * - ISO Numeric: 818
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Egypt: ImageVector by lazy {
    ImageVector.Builder(
        name = "Egypt:EG:EGY:818:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(6.13f, 5.11f)
                lineTo(6.63f, 5.133f)
                lineTo(6.504f, 7.868f)
                lineTo(6.005f, 7.845f)
                lineTo(6.13f, 5.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(6.652f, 5.28f)
                lineTo(7.151f, 5.308f)
                lineTo(7.026f, 7.526f)
                lineTo(6.527f, 7.498f)
                lineTo(6.652f, 5.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(7.174f, 5.446f)
                lineTo(7.673f, 5.487f)
                lineTo(7.547f, 7.015f)
                lineTo(7.049f, 6.974f)
                lineTo(7.174f, 5.446f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(9.87f, 5.11f)
                lineTo(9.37f, 5.133f)
                lineTo(9.496f, 7.868f)
                lineTo(9.995f, 7.845f)
                lineTo(9.87f, 5.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(9.348f, 5.28f)
                lineTo(8.849f, 5.308f)
                lineTo(8.974f, 7.526f)
                lineTo(9.473f, 7.498f)
                lineTo(9.348f, 5.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.826f, 5.446f)
                lineTo(8.327f, 5.487f)
                lineTo(8.453f, 7.015f)
                lineTo(8.951f, 6.974f)
                lineTo(8.826f, 5.446f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(7.987f, 7.663f)
                lineTo(7.499f, 7.552f)
                lineTo(7.706f, 6.651f)
                lineTo(8.193f, 6.763f)
                lineTo(7.987f, 7.663f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.36f, 7.663f)
                lineTo(8.847f, 7.552f)
                lineTo(8.641f, 6.651f)
                lineTo(8.153f, 6.763f)
                lineTo(8.36f, 7.663f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.236f, 7.655f)
                horizontalLineTo(7.736f)
                verticalLineTo(6.771f)
                horizontalLineTo(8.236f)
                verticalLineTo(7.655f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(7.317f, 5.457f)
                lineTo(7.817f, 5.469f)
                lineTo(7.788f, 6.659f)
                lineTo(7.288f, 6.647f)
                lineTo(7.317f, 5.457f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.187f, 5.457f)
                lineTo(8.687f, 5.469f)
                lineTo(8.658f, 6.659f)
                lineTo(8.158f, 6.647f)
                lineTo(8.187f, 5.457f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(6.669f, 7.961f)
                lineTo(6.799f, 7.479f)
                curveTo(7.329f, 7.621f, 7.737f, 7.692f, 8.014f, 7.692f)
                curveTo(8.292f, 7.692f, 8.7f, 7.621f, 9.23f, 7.479f)
                lineTo(9.36f, 7.961f)
                curveTo(8.791f, 8.114f, 8.344f, 8.192f, 8.014f, 8.192f)
                curveTo(7.685f, 8.192f, 7.238f, 8.114f, 6.669f, 7.961f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(6.141f, 5.111f)
                curveTo(6.108f, 4.781f, 6.301f, 4.557f, 6.629f, 4.586f)
                curveTo(6.736f, 4.595f, 6.857f, 4.627f, 7.019f, 4.682f)
                curveTo(7.066f, 4.698f, 7.066f, 4.698f, 7.111f, 4.714f)
                curveTo(7.333f, 4.793f, 7.393f, 4.813f, 7.406f, 4.816f)
                curveTo(7.357f, 4.805f, 7.501f, 4.543f, 7.534f, 4.499f)
                curveTo(7.538f, 4.527f, 7.522f, 4.523f, 7.482f, 4.515f)
                lineTo(7.031f, 4.425f)
                lineTo(7.352f, 4.096f)
                curveTo(7.464f, 3.981f, 7.613f, 3.924f, 7.784f, 3.924f)
                curveTo(7.802f, 3.924f, 7.818f, 3.923f, 7.872f, 3.919f)
                curveTo(7.912f, 3.917f, 7.912f, 3.917f, 7.957f, 3.915f)
                curveTo(8.269f, 3.905f, 8.493f, 3.993f, 8.493f, 4.314f)
                curveTo(8.493f, 4.429f, 8.508f, 4.613f, 8.531f, 4.753f)
                curveTo(8.54f, 4.801f, 8.555f, 4.845f, 8.509f, 4.864f)
                curveTo(8.511f, 4.847f, 8.62f, 4.804f, 8.79f, 4.733f)
                lineTo(8.811f, 4.725f)
                curveTo(9.304f, 4.518f, 9.362f, 4.499f, 9.521f, 4.596f)
                curveTo(9.627f, 4.661f, 9.728f, 4.776f, 9.841f, 4.949f)
                lineTo(9.423f, 5.223f)
                curveTo(9.35f, 5.112f, 9.292f, 5.044f, 9.264f, 5.025f)
                curveTo(9.327f, 5.069f, 9.115f, 5.139f, 9.003f, 5.186f)
                lineTo(8.983f, 5.194f)
                curveTo(8.599f, 5.355f, 8.548f, 5.374f, 8.438f, 5.374f)
                curveTo(8.139f, 5.374f, 8.032f, 5.068f, 8.002f, 4.629f)
                curveTo(7.91f, 4.933f, 7.635f, 5.316f, 7.408f, 5.316f)
                curveTo(7.309f, 5.316f, 7.356f, 5.332f, 6.944f, 5.185f)
                curveTo(6.901f, 5.17f, 6.901f, 5.17f, 6.858f, 5.155f)
                curveTo(6.733f, 5.113f, 6.643f, 5.089f, 6.586f, 5.084f)
                curveTo(6.588f, 5.081f, 6.597f, 5.072f, 6.606f, 5.064f)
                lineTo(6.141f, 5.111f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EgyptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Egypt,
            contentDescription = "Egypt Flag"
        )
    }
}
