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
 * American Samoa Flag (16x12dp)
 *
 * - ISO Alpha-2: AS
 * - ISO Alpha-3: ASM
 * - ISO Numeric: 016
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.AmericanSamoa: ImageVector by lazy {
    ImageVector.Builder(
        name = "American Samoa:AS:ASM:016:Small",
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
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3547A0)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, -0.5f)
                horizontalLineTo(-0.5f)
                verticalLineTo(0f)
                verticalLineTo(5.654f)
                lineTo(-1.424f, 6f)
                lineTo(-0.5f, 6.346f)
                verticalLineTo(12f)
                verticalLineTo(12.5f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                lineTo(16.176f, 11.532f)
                lineTo(1.424f, 6f)
                lineTo(16.176f, 0.468f)
                lineTo(16f, -0.5f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC44800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.045f, 3.014f)
                curveTo(14.045f, 3.014f, 10.013f, 4.06f, 10.013f, 4.221f)
                curveTo(10.013f, 4.383f, 9.65f, 4.893f, 9.725f, 5.026f)
                curveTo(9.799f, 5.159f, 9.992f, 5.336f, 10.15f, 5.248f)
                curveTo(10.309f, 5.159f, 10.685f, 4.805f, 10.559f, 5.026f)
                curveTo(10.432f, 5.248f, 11.238f, 5.505f, 10.898f, 5.994f)
                curveTo(10.898f, 5.994f, 11.306f, 5.759f, 11.108f, 7.096f)
                lineTo(12.079f, 7.373f)
                curveTo(12.079f, 7.373f, 13.164f, 7.089f, 12.669f, 6.275f)
                horizontalLineTo(13.243f)
                curveTo(13.243f, 6.275f, 13.005f, 5.221f, 13.357f, 5.026f)
                curveTo(13.709f, 4.831f, 12.998f, 4.683f, 12.998f, 4.683f)
                curveTo(14.501f, 3.828f, 14.045f, 3.014f, 14.045f, 3.014f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.377f, 7.485f)
                lineTo(10.944f, 7.074f)
                lineTo(10.625f, 6.647f)
                lineTo(9.243f, 6.925f)
                lineTo(10.456f, 7.613f)
                lineTo(10.864f, 7.393f)
                lineTo(13.377f, 7.794f)
                verticalLineTo(7.485f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.751f, 7.859f)
                verticalLineTo(7.618f)
                lineTo(11.023f, 7.452f)
                curveTo(11.023f, 7.452f, 10.858f, 7.3f, 10.452f, 7.3f)
                curveTo(10.046f, 7.3f, 10f, 7.618f, 10f, 7.618f)
                curveTo(10f, 7.618f, 10.233f, 8.082f, 10.684f, 8.082f)
                curveTo(11.135f, 8.082f, 11.837f, 8.191f, 12.027f, 8.414f)
                curveTo(12.217f, 8.637f, 13.005f, 8.299f, 13.005f, 8.299f)
                curveTo(13.005f, 8.299f, 12.668f, 7.72f, 12.236f, 7.901f)
                curveTo(11.804f, 8.082f, 11.023f, 7.814f, 11.023f, 7.716f)
                curveTo(11.023f, 7.618f, 13.751f, 7.859f, 13.751f, 7.859f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.143f, 5.907f)
                curveTo(9.143f, 5.907f, 8.878f, 6.474f, 8.974f, 6.688f)
                curveTo(9.397f, 7.13f, 10.165f, 6.427f, 10.165f, 6.427f)
                lineTo(9.143f, 5.907f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF979797)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.314f, 6.178f)
                curveTo(13.594f, 6.033f, 13.738f, 5.766f, 13.738f, 5.417f)
                curveTo(13.738f, 5.148f, 13.674f, 4.936f, 13.532f, 4.801f)
                verticalLineTo(4.618f)
                lineTo(13.285f, 4.615f)
                curveTo(11.065f, 4.595f, 9.816f, 4.815f, 9.454f, 5.364f)
                curveTo(9.087f, 5.92f, 9.119f, 6.394f, 9.618f, 6.625f)
                lineTo(9.838f, 6.619f)
                curveTo(10.916f, 6.057f, 12.012f, 5.918f, 13.139f, 6.198f)
                lineTo(13.314f, 6.178f)
                close()
                moveTo(9.662f, 5.502f)
                curveTo(9.955f, 5.058f, 11.161f, 4.846f, 13.282f, 4.865f)
                verticalLineTo(4.929f)
                curveTo(13.419f, 4.994f, 13.488f, 5.157f, 13.488f, 5.417f)
                curveTo(13.488f, 5.677f, 13.392f, 5.856f, 13.199f, 5.955f)
                curveTo(12.013f, 5.66f, 10.854f, 5.808f, 9.723f, 6.398f)
                curveTo(9.39f, 6.244f, 9.37f, 5.945f, 9.662f, 5.502f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(13.282f, 4.865f)
                curveTo(11.161f, 4.846f, 9.955f, 5.058f, 9.662f, 5.502f)
                curveTo(9.37f, 5.945f, 9.39f, 6.244f, 9.723f, 6.398f)
                curveTo(10.854f, 5.808f, 12.013f, 5.66f, 13.199f, 5.955f)
                curveTo(13.392f, 5.856f, 13.488f, 5.677f, 13.488f, 5.417f)
                curveTo(13.488f, 5.157f, 13.419f, 4.994f, 13.282f, 4.929f)
                verticalLineTo(4.865f)
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
            imageVector = FlagIcons.Small.AmericanSamoa,
            contentDescription = "American Samoa Flag"
        )
    }
}
