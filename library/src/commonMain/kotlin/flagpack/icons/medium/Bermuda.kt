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
 * Bermuda Flag (20x15dp)
 *
 * - ISO Alpha-2: BM
 * - ISO Alpha-3: BMU
 * - ISO Numeric: 060
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bermuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bermuda:BM:BMU:060:Medium",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
                moveTo(13.755f, 7.5f)
                curveTo(13.755f, 11.179f, 14.103f, 12.457f, 16.2f, 12.457f)
                curveTo(18.297f, 12.457f, 18.871f, 10.604f, 18.694f, 7.5f)
                horizontalLineTo(13.755f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.313f, 9.625f)
                curveTo(16.899f, 9.625f, 17.375f, 9.065f, 17.375f, 8.375f)
                curveTo(17.375f, 7.685f, 16.899f, 7.125f, 16.313f, 7.125f)
                curveTo(15.726f, 7.125f, 15.25f, 7.685f, 15.25f, 8.375f)
                curveTo(15.25f, 9.065f, 15.726f, 9.625f, 16.313f, 9.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.246f, 11.446f)
                curveTo(14.619f, 12.28f, 15.273f, 12.696f, 16.206f, 12.696f)
                curveTo(17.133f, 12.696f, 17.789f, 12.285f, 18.173f, 11.463f)
                lineTo(14.246f, 11.446f)
                close()
            }
            path(fill = SolidColor(Color(0xFF82B2CB))) {
                moveTo(14.762f, 9.394f)
                lineTo(14.413f, 8.524f)
                curveTo(15.053f, 8.267f, 15.671f, 8.137f, 16.264f, 8.137f)
                curveTo(16.857f, 8.137f, 17.474f, 8.267f, 18.115f, 8.524f)
                lineTo(17.766f, 9.394f)
                curveTo(17.232f, 9.18f, 16.732f, 9.075f, 16.264f, 9.075f)
                curveTo(15.796f, 9.075f, 15.296f, 9.18f, 14.762f, 9.394f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.625f, 10f)
                curveTo(15.97f, 10f, 16.25f, 9.72f, 16.25f, 9.375f)
                curveTo(16.25f, 9.03f, 15.97f, 8.75f, 15.625f, 8.75f)
                curveTo(15.28f, 8.75f, 15f, 9.03f, 15f, 9.375f)
                curveTo(15f, 9.72f, 15.28f, 10f, 15.625f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8A4E22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 11f)
                curveTo(16.345f, 11f, 16.625f, 10.72f, 16.625f, 10.375f)
                curveTo(16.625f, 10.03f, 16.345f, 9.75f, 16f, 9.75f)
                curveTo(15.655f, 9.75f, 15.375f, 10.03f, 15.375f, 10.375f)
                curveTo(15.375f, 10.72f, 15.655f, 11f, 16f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 10.5f)
                curveTo(15.345f, 10.5f, 15.625f, 10.22f, 15.625f, 9.875f)
                curveTo(15.625f, 9.53f, 15.345f, 9.25f, 15f, 9.25f)
                curveTo(14.655f, 9.25f, 14.375f, 9.53f, 14.375f, 9.875f)
                curveTo(14.375f, 10.22f, 14.655f, 10.5f, 15f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.125f, 10.5f)
                curveTo(17.47f, 10.5f, 17.75f, 10.22f, 17.75f, 9.875f)
                curveTo(17.75f, 9.53f, 17.47f, 9.25f, 17.125f, 9.25f)
                curveTo(16.78f, 9.25f, 16.5f, 9.53f, 16.5f, 9.875f)
                curveTo(16.5f, 10.22f, 16.78f, 10.5f, 17.125f, 10.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.688f, 11.875f)
                curveTo(16.929f, 11.875f, 17.125f, 11.595f, 17.125f, 11.25f)
                curveTo(17.125f, 10.905f, 16.929f, 10.625f, 16.688f, 10.625f)
                curveTo(16.446f, 10.625f, 16.25f, 10.905f, 16.25f, 11.25f)
                curveTo(16.25f, 11.595f, 16.446f, 11.875f, 16.688f, 11.875f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.188f, 11.875f)
                curveTo(15.429f, 11.875f, 15.625f, 11.595f, 15.625f, 11.25f)
                curveTo(15.625f, 10.905f, 15.429f, 10.625f, 15.188f, 10.625f)
                curveTo(14.946f, 10.625f, 14.75f, 10.905f, 14.75f, 11.25f)
                curveTo(14.75f, 11.595f, 14.946f, 11.875f, 15.188f, 11.875f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.253f, 8.125f)
                lineTo(1.223f, 9.211f)
                lineTo(11.306f, 1.18f)
                lineTo(12.612f, -0.433f)
                lineTo(9.965f, -0.796f)
                lineTo(5.852f, 2.665f)
                lineTo(2.542f, 4.996f)
                lineTo(-1.253f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.914f, 8.886f)
                lineTo(0.347f, 9.516f)
                lineTo(12.143f, -0.583f)
                horizontalLineTo(10.372f)
                lineTo(-0.914f, 8.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.503f, 8.125f)
                lineTo(10.306f, 9.521f)
                lineTo(-0.056f, 1.18f)
                lineTo(-1.362f, -0.433f)
                lineTo(1.285f, -0.796f)
                lineTo(5.398f, 2.665f)
                lineTo(8.708f, 4.996f)
                lineTo(12.503f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(12.418f, 8.671f)
                lineTo(11.157f, 9.301f)
                lineTo(6.134f, 4.977f)
                lineTo(4.645f, 4.494f)
                lineTo(-1.488f, -0.427f)
                horizontalLineTo(0.283f)
                lineTo(6.413f, 4.377f)
                lineTo(8.041f, 4.957f)
                lineTo(12.418f, 8.671f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.063f, 0f)
                horizontalLineTo(6.938f)
                verticalLineTo(3.063f)
                lineTo(11f, 3f)
                verticalLineTo(5.875f)
                lineTo(6.938f, 5.938f)
                verticalLineTo(9f)
                horizontalLineTo(4.063f)
                verticalLineTo(5.938f)
                lineTo(0f, 5.875f)
                verticalLineTo(3f)
                lineTo(4.063f, 3.063f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BermudaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bermuda,
            contentDescription = "Bermuda Flag"
        )
    }
}
