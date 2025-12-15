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
 * American Samoa Flag (20x15dp)
 *
 * - ISO Alpha-2: AS
 * - ISO Alpha-3: ASM
 * - ISO Numeric: 016
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.AmericanSamoa: ImageVector by lazy {
    ImageVector.Builder(
        name = "American Samoa:AS:ASM:016:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF3547A0)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, -0.625f)
                horizontalLineTo(-0.625f)
                verticalLineTo(0f)
                verticalLineTo(7.067f)
                lineTo(-1.78f, 7.5f)
                lineTo(-0.625f, 7.933f)
                verticalLineTo(15f)
                verticalLineTo(15.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                lineTo(20.219f, 14.415f)
                lineTo(1.78f, 7.5f)
                lineTo(20.219f, 0.585f)
                lineTo(20f, -0.625f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC44800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.556f, 3.767f)
                curveTo(17.556f, 3.767f, 12.516f, 5.076f, 12.516f, 5.277f)
                curveTo(12.516f, 5.478f, 12.063f, 6.116f, 12.156f, 6.283f)
                curveTo(12.249f, 6.449f, 12.49f, 6.67f, 12.688f, 6.56f)
                curveTo(12.886f, 6.449f, 13.356f, 6.006f, 13.198f, 6.283f)
                curveTo(13.041f, 6.56f, 14.047f, 6.881f, 13.623f, 7.493f)
                curveTo(13.623f, 7.493f, 14.132f, 7.199f, 13.886f, 8.87f)
                lineTo(15.099f, 9.216f)
                curveTo(15.099f, 9.216f, 16.455f, 8.861f, 15.836f, 7.844f)
                horizontalLineTo(16.554f)
                curveTo(16.554f, 7.844f, 16.257f, 6.526f, 16.697f, 6.283f)
                curveTo(17.136f, 6.039f, 16.248f, 5.854f, 16.248f, 5.854f)
                curveTo(18.126f, 4.785f, 17.556f, 3.767f, 17.556f, 3.767f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.722f, 9.357f)
                lineTo(13.68f, 8.842f)
                lineTo(13.281f, 8.309f)
                lineTo(11.554f, 8.657f)
                lineTo(13.07f, 9.516f)
                lineTo(13.58f, 9.241f)
                lineTo(16.722f, 9.743f)
                verticalLineTo(9.357f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.189f, 9.824f)
                verticalLineTo(9.523f)
                lineTo(13.778f, 9.315f)
                curveTo(13.778f, 9.315f, 13.573f, 9.125f, 13.065f, 9.125f)
                curveTo(12.558f, 9.125f, 12.5f, 9.523f, 12.5f, 9.523f)
                curveTo(12.5f, 9.523f, 12.791f, 10.103f, 13.355f, 10.103f)
                curveTo(13.919f, 10.103f, 14.796f, 10.238f, 15.034f, 10.517f)
                curveTo(15.271f, 10.796f, 16.256f, 10.374f, 16.256f, 10.374f)
                curveTo(16.256f, 10.374f, 15.835f, 9.65f, 15.295f, 9.877f)
                curveTo(14.756f, 10.103f, 13.778f, 9.767f, 13.778f, 9.645f)
                curveTo(13.778f, 9.523f, 17.189f, 9.824f, 17.189f, 9.824f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.428f, 7.384f)
                curveTo(11.428f, 7.384f, 11.098f, 8.093f, 11.218f, 8.361f)
                curveTo(11.746f, 8.912f, 12.706f, 8.033f, 12.706f, 8.033f)
                lineTo(11.428f, 7.384f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.642f, 7.722f)
                curveTo(16.993f, 7.541f, 17.172f, 7.207f, 17.172f, 6.771f)
                curveTo(17.172f, 6.436f, 17.092f, 6.17f, 16.916f, 6.001f)
                verticalLineTo(5.772f)
                lineTo(16.606f, 5.769f)
                curveTo(13.832f, 5.744f, 12.27f, 6.018f, 11.817f, 6.705f)
                curveTo(11.359f, 7.4f, 11.399f, 7.993f, 12.022f, 8.281f)
                lineTo(12.298f, 8.274f)
                curveTo(13.645f, 7.572f, 15.015f, 7.397f, 16.424f, 7.747f)
                lineTo(16.642f, 7.722f)
                close()
                moveTo(12.078f, 6.877f)
                curveTo(12.443f, 6.323f, 13.952f, 6.058f, 16.603f, 6.082f)
                verticalLineTo(6.161f)
                curveTo(16.774f, 6.243f, 16.86f, 6.446f, 16.86f, 6.771f)
                curveTo(16.86f, 7.096f, 16.74f, 7.32f, 16.499f, 7.444f)
                curveTo(15.016f, 7.075f, 13.567f, 7.26f, 12.153f, 7.997f)
                curveTo(11.738f, 7.805f, 11.712f, 7.432f, 12.078f, 6.877f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(16.603f, 6.082f)
                curveTo(13.952f, 6.058f, 12.443f, 6.323f, 12.078f, 6.877f)
                curveTo(11.712f, 7.432f, 11.738f, 7.805f, 12.153f, 7.997f)
                curveTo(13.567f, 7.26f, 15.016f, 7.075f, 16.499f, 7.444f)
                curveTo(16.74f, 7.32f, 16.86f, 7.096f, 16.86f, 6.771f)
                curveTo(16.86f, 6.446f, 16.774f, 6.243f, 16.603f, 6.161f)
                verticalLineTo(6.082f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AmericanSamoaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.AmericanSamoa,
            contentDescription = "American Samoa Flag"
        )
    }
}
