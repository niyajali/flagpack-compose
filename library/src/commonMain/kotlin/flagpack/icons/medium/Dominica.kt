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
 * Dominica Flag (20x15dp)
 *
 * - ISO Alpha-2: DM
 * - ISO Alpha-3: DMA
 * - ISO Numeric: 212
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Dominica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Dominica:DM:DMA:212:Medium",
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
                fill = SolidColor(Color(0xFF279E19)),
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
                moveTo(10f, 0f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(11.25f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineTo(8.75f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.75f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(8.75f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                verticalLineTo(7.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 0f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                verticalLineTo(6.25f)
                horizontalLineTo(7.5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 12.5f)
                curveTo(12.761f, 12.5f, 15f, 10.261f, 15f, 7.5f)
                curveTo(15f, 4.739f, 12.761f, 2.5f, 10f, 2.5f)
                curveTo(7.239f, 2.5f, 5f, 4.739f, 5f, 7.5f)
                curveTo(5f, 10.261f, 7.239f, 12.5f, 10f, 12.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF804BFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.204f, 5.258f)
                curveTo(9.204f, 5.258f, 9.441f, 4.488f, 9.993f, 4.886f)
                curveTo(10.858f, 5.312f, 11.143f, 5.801f, 11.477f, 6.355f)
                curveTo(11.811f, 6.91f, 10.658f, 6.504f, 10.443f, 6.192f)
                curveTo(10.228f, 5.88f, 9.035f, 5.779f, 9.204f, 5.518f)
                curveTo(9.372f, 5.258f, 9.204f, 5.258f, 9.204f, 5.258f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA95601)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.008f, 9.203f)
                curveTo(9.008f, 9.203f, 8.421f, 10.007f, 9.008f, 10.007f)
                curveTo(9.595f, 10.007f, 11.977f, 9.834f, 11.691f, 9.605f)
                curveTo(11.406f, 9.376f, 9.29f, 9.605f, 9.29f, 9.605f)
                lineTo(9.008f, 9.203f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF804BFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.886f, 9.178f)
                curveTo(9.825f, 9.109f, 8.755f, 6.681f, 9.253f, 6.176f)
                curveTo(9.75f, 5.672f, 10.042f, 5.968f, 10.042f, 6.725f)
                curveTo(10.042f, 7.482f, 10.072f, 9.365f, 9.886f, 9.178f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF279E19)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.823f, 8.784f)
                curveTo(9.823f, 8.784f, 9.762f, 9.374f, 10.065f, 10.063f)
                curveTo(10.369f, 10.752f, 10.982f, 10.739f, 10.982f, 10.175f)
                curveTo(10.982f, 9.611f, 11.429f, 10.14f, 11.601f, 10.517f)
                curveTo(11.773f, 10.893f, 11.328f, 7.174f, 10.696f, 6.343f)
                curveTo(10.065f, 5.511f, 9.456f, 5.457f, 9.64f, 5.995f)
                curveTo(9.823f, 6.532f, 9.823f, 8.784f, 9.823f, 8.784f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.455f, 4.75f)
                curveTo(9.455f, 4.75f, 9.187f, 4.921f, 9.187f, 5.393f)
                curveTo(9.187f, 5.865f, 9.82f, 5.247f, 9.82f, 5.247f)
                lineTo(9.455f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.511f, 4.571f)
                lineTo(10.063f, 4.281f)
                lineTo(10.613f, 4.571f)
                lineTo(10.508f, 3.957f)
                lineTo(10.954f, 3.523f)
                lineTo(10.338f, 3.433f)
                lineTo(10.063f, 2.875f)
                lineTo(9.787f, 3.433f)
                lineTo(9.171f, 3.523f)
                lineTo(9.617f, 3.957f)
                lineTo(9.511f, 4.571f)
                close()
                moveTo(9.511f, 11.946f)
                lineTo(10.063f, 11.656f)
                lineTo(10.613f, 11.946f)
                lineTo(10.508f, 11.332f)
                lineTo(10.954f, 10.898f)
                lineTo(10.338f, 10.808f)
                lineTo(10.063f, 10.25f)
                lineTo(9.787f, 10.808f)
                lineTo(9.171f, 10.898f)
                lineTo(9.617f, 11.332f)
                lineTo(9.511f, 11.946f)
                close()
                moveTo(13.563f, 8.156f)
                lineTo(13.011f, 8.446f)
                lineTo(13.117f, 7.832f)
                lineTo(12.671f, 7.398f)
                lineTo(13.287f, 7.308f)
                lineTo(13.563f, 6.75f)
                lineTo(13.838f, 7.308f)
                lineTo(14.454f, 7.398f)
                lineTo(14.008f, 7.832f)
                lineTo(14.113f, 8.446f)
                lineTo(13.563f, 8.156f)
                close()
                moveTo(5.992f, 7.832f)
                lineTo(5.886f, 8.446f)
                lineTo(6.438f, 8.156f)
                lineTo(6.989f, 8.446f)
                lineTo(6.883f, 7.832f)
                lineTo(7.329f, 7.398f)
                lineTo(6.713f, 7.308f)
                lineTo(6.438f, 6.75f)
                lineTo(6.162f, 7.308f)
                lineTo(5.546f, 7.398f)
                lineTo(5.992f, 7.832f)
                close()
                moveTo(7.792f, 5.439f)
                lineTo(7.618f, 6.036f)
                lineTo(7.25f, 5.534f)
                lineTo(6.627f, 5.553f)
                lineTo(6.991f, 5.048f)
                lineTo(6.781f, 4.462f)
                lineTo(7.374f, 4.651f)
                lineTo(7.866f, 4.271f)
                lineTo(7.869f, 4.893f)
                lineTo(8.384f, 5.244f)
                lineTo(7.792f, 5.439f)
                close()
                moveTo(12.923f, 10.913f)
                lineTo(13.098f, 10.315f)
                lineTo(13.689f, 10.12f)
                lineTo(13.174f, 9.769f)
                lineTo(13.171f, 9.147f)
                lineTo(12.679f, 9.528f)
                lineTo(12.086f, 9.338f)
                lineTo(12.296f, 9.924f)
                lineTo(11.933f, 10.429f)
                lineTo(12.555f, 10.411f)
                lineTo(12.923f, 10.913f)
                close()
                moveTo(13.011f, 5.366f)
                lineTo(12.837f, 5.964f)
                lineTo(12.469f, 5.462f)
                lineTo(11.846f, 5.48f)
                lineTo(12.21f, 4.975f)
                lineTo(12f, 4.389f)
                lineTo(12.593f, 4.579f)
                lineTo(13.085f, 4.198f)
                lineTo(13.088f, 4.82f)
                lineTo(13.602f, 5.171f)
                lineTo(13.011f, 5.366f)
                close()
                moveTo(7.763f, 11.089f)
                lineTo(7.938f, 10.491f)
                lineTo(8.529f, 10.296f)
                lineTo(8.015f, 9.945f)
                lineTo(8.012f, 9.323f)
                lineTo(7.519f, 9.704f)
                lineTo(6.926f, 9.514f)
                lineTo(7.136f, 10.1f)
                lineTo(6.773f, 10.606f)
                lineTo(7.395f, 10.587f)
                lineTo(7.763f, 11.089f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DominicaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Dominica,
            contentDescription = "Dominica Flag"
        )
    }
}
