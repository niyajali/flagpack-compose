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
 * Bonaire Flag (20x15dp)
 *
 * - ISO Alpha-2: BQ-BO
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bonaire: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bonaire:BQ-BO:::Medium",
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6.833f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                lineTo(0f, 6.833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                horizontalLineTo(20.006f)
                verticalLineTo(0f)
                lineTo(0f, 15f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.846f, 3.125f)
                lineTo(6.175f, 3.832f)
                curveTo(7.516f, 3.992f, 8.561f, 5.117f, 8.595f, 6.493f)
                lineTo(9.192f, 6.792f)
                lineTo(8.54f, 7.118f)
                curveTo(8.306f, 8.257f, 7.368f, 9.139f, 6.201f, 9.29f)
                lineTo(5.846f, 10f)
                lineTo(5.491f, 9.29f)
                curveTo(4.323f, 9.139f, 3.385f, 8.257f, 3.152f, 7.118f)
                lineTo(2.5f, 6.792f)
                lineTo(3.097f, 6.493f)
                curveTo(3.13f, 5.125f, 4.164f, 4.005f, 5.494f, 3.835f)
                lineTo(5.846f, 3.125f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.846f, 3.125f)
                lineTo(6.175f, 3.832f)
                curveTo(7.516f, 3.992f, 8.561f, 5.117f, 8.595f, 6.493f)
                lineTo(9.192f, 6.792f)
                lineTo(8.54f, 7.118f)
                curveTo(8.306f, 8.257f, 7.368f, 9.139f, 6.201f, 9.29f)
                lineTo(5.846f, 10f)
                lineTo(5.491f, 9.29f)
                curveTo(4.323f, 9.139f, 3.385f, 8.257f, 3.152f, 7.118f)
                lineTo(2.5f, 6.792f)
                lineTo(3.097f, 6.493f)
                curveTo(3.13f, 5.125f, 4.164f, 4.005f, 5.494f, 3.835f)
                lineTo(5.846f, 3.125f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.175f, 3.832f)
                lineTo(5.722f, 4.043f)
                lineTo(5.839f, 4.295f)
                lineTo(6.116f, 4.328f)
                lineTo(6.175f, 3.832f)
                close()
                moveTo(5.846f, 3.125f)
                lineTo(6.299f, 2.914f)
                lineTo(5.86f, 1.971f)
                lineTo(5.398f, 2.903f)
                lineTo(5.846f, 3.125f)
                close()
                moveTo(8.595f, 6.493f)
                lineTo(8.095f, 6.506f)
                lineTo(8.103f, 6.806f)
                lineTo(8.371f, 6.941f)
                lineTo(8.595f, 6.493f)
                close()
                moveTo(9.192f, 6.792f)
                lineTo(9.415f, 7.239f)
                lineTo(10.31f, 6.792f)
                lineTo(9.415f, 6.344f)
                lineTo(9.192f, 6.792f)
                close()
                moveTo(8.54f, 7.118f)
                lineTo(8.316f, 6.67f)
                lineTo(8.099f, 6.779f)
                lineTo(8.05f, 7.017f)
                lineTo(8.54f, 7.118f)
                close()
                moveTo(6.201f, 9.29f)
                lineTo(6.137f, 8.794f)
                lineTo(5.873f, 8.828f)
                lineTo(5.754f, 9.066f)
                lineTo(6.201f, 9.29f)
                close()
                moveTo(5.846f, 10f)
                lineTo(5.399f, 10.224f)
                lineTo(5.846f, 11.118f)
                lineTo(6.293f, 10.224f)
                lineTo(5.846f, 10f)
                close()
                moveTo(5.491f, 9.29f)
                lineTo(5.938f, 9.066f)
                lineTo(5.819f, 8.828f)
                lineTo(5.555f, 8.794f)
                lineTo(5.491f, 9.29f)
                close()
                moveTo(3.152f, 7.118f)
                lineTo(3.642f, 7.017f)
                lineTo(3.593f, 6.779f)
                lineTo(3.375f, 6.67f)
                lineTo(3.152f, 7.118f)
                close()
                moveTo(2.5f, 6.792f)
                lineTo(2.276f, 6.344f)
                lineTo(1.382f, 6.792f)
                lineTo(2.276f, 7.239f)
                lineTo(2.5f, 6.792f)
                close()
                moveTo(3.097f, 6.493f)
                lineTo(3.32f, 6.941f)
                lineTo(3.589f, 6.806f)
                lineTo(3.597f, 6.506f)
                lineTo(3.097f, 6.493f)
                close()
                moveTo(5.494f, 3.835f)
                lineTo(5.557f, 4.331f)
                lineTo(5.823f, 4.297f)
                lineTo(5.942f, 4.057f)
                lineTo(5.494f, 3.835f)
                close()
                moveTo(6.628f, 3.621f)
                lineTo(6.299f, 2.914f)
                lineTo(5.393f, 3.336f)
                lineTo(5.722f, 4.043f)
                lineTo(6.628f, 3.621f)
                close()
                moveTo(9.095f, 6.481f)
                curveTo(9.055f, 4.854f, 7.82f, 3.525f, 6.234f, 3.336f)
                lineTo(6.116f, 4.328f)
                curveTo(7.213f, 4.459f, 8.067f, 5.38f, 8.095f, 6.506f)
                lineTo(9.095f, 6.481f)
                close()
                moveTo(9.415f, 6.344f)
                lineTo(8.819f, 6.046f)
                lineTo(8.371f, 6.941f)
                lineTo(8.968f, 7.239f)
                lineTo(9.415f, 6.344f)
                close()
                moveTo(8.763f, 7.565f)
                lineTo(9.415f, 7.239f)
                lineTo(8.968f, 6.344f)
                lineTo(8.316f, 6.67f)
                lineTo(8.763f, 7.565f)
                close()
                moveTo(6.265f, 9.786f)
                curveTo(7.646f, 9.608f, 8.753f, 8.565f, 9.03f, 7.218f)
                lineTo(8.05f, 7.017f)
                curveTo(7.859f, 7.949f, 7.091f, 8.671f, 6.137f, 8.794f)
                lineTo(6.265f, 9.786f)
                close()
                moveTo(5.754f, 9.066f)
                lineTo(5.399f, 9.776f)
                lineTo(6.293f, 10.224f)
                lineTo(6.648f, 9.513f)
                lineTo(5.754f, 9.066f)
                close()
                moveTo(6.293f, 9.776f)
                lineTo(5.938f, 9.066f)
                lineTo(5.044f, 9.513f)
                lineTo(5.399f, 10.224f)
                lineTo(6.293f, 9.776f)
                close()
                moveTo(2.662f, 7.218f)
                curveTo(2.938f, 8.565f, 4.046f, 9.608f, 5.427f, 9.786f)
                lineTo(5.555f, 8.794f)
                curveTo(4.601f, 8.671f, 3.833f, 7.949f, 3.642f, 7.017f)
                lineTo(2.662f, 7.218f)
                close()
                moveTo(2.276f, 7.239f)
                lineTo(2.928f, 7.565f)
                lineTo(3.375f, 6.67f)
                lineTo(2.724f, 6.344f)
                lineTo(2.276f, 7.239f)
                close()
                moveTo(2.873f, 6.046f)
                lineTo(2.276f, 6.344f)
                lineTo(2.724f, 7.239f)
                lineTo(3.32f, 6.941f)
                lineTo(2.873f, 6.046f)
                close()
                moveTo(5.431f, 3.339f)
                curveTo(3.858f, 3.54f, 2.637f, 4.863f, 2.597f, 6.481f)
                lineTo(3.597f, 6.506f)
                curveTo(3.624f, 5.387f, 4.47f, 4.47f, 5.557f, 4.331f)
                lineTo(5.431f, 3.339f)
                close()
                moveTo(5.398f, 2.903f)
                lineTo(5.046f, 3.613f)
                lineTo(5.942f, 4.057f)
                lineTo(6.294f, 3.347f)
                lineTo(5.398f, 2.903f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF00A17)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.86f, 5.188f)
            lineTo(5.454f, 5.868f)
            horizontalLineTo(4.654f)
            lineTo(5.053f, 6.583f)
            lineTo(4.654f, 7.269f)
            horizontalLineTo(5.454f)
            lineTo(5.86f, 7.969f)
            lineTo(6.272f, 7.269f)
            horizontalLineTo(7.065f)
            lineTo(6.675f, 6.583f)
            lineTo(7.065f, 5.868f)
            horizontalLineTo(6.272f)
            lineTo(5.86f, 5.188f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BonairePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bonaire,
            contentDescription = "Bonaire Flag"
        )
    }
}
