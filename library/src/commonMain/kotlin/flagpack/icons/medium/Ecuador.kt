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
 * Ecuador Flag (20x15dp)
 *
 * - ISO Alpha-2: EC
 * - ISO Alpha-3: ECU
 * - ISO Numeric: 218
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Ecuador: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ecuador:EC:ECU:218:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.25f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7B2900)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.758f, 3.62f)
                curveTo(5.683f, 3.45f, 8.577f, 2.591f, 8.794f, 2.591f)
                curveTo(9.011f, 2.591f, 9.285f, 3.106f, 9.285f, 3.106f)
                lineTo(11.045f, 3.248f)
                curveTo(11.045f, 3.248f, 10.837f, 2.591f, 11.045f, 2.591f)
                curveTo(11.253f, 2.591f, 14.44f, 3.698f, 14.44f, 3.698f)
                curveTo(14.44f, 3.698f, 10.456f, 4.178f, 10.456f, 4.287f)
                curveTo(10.456f, 4.395f, 10.717f, 4.988f, 10.717f, 4.988f)
                lineTo(9.981f, 5.23f)
                curveTo(9.981f, 5.23f, 10.024f, 4.514f, 9.904f, 4.514f)
                curveTo(9.784f, 4.514f, 9.427f, 5.37f, 9.427f, 5.37f)
                lineTo(9.077f, 4.287f)
                curveTo(9.077f, 4.287f, 5.833f, 3.79f, 5.758f, 3.62f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(5.77f, 6.261f)
                lineTo(6.558f, 6.45f)
                curveTo(5.734f, 9.897f, 6.496f, 11.551f, 8.842f, 11.704f)
                lineTo(8.789f, 12.513f)
                curveTo(5.849f, 12.32f, 4.843f, 10.138f, 5.77f, 6.261f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(6.25f, 5.796f)
                lineTo(7.051f, 5.922f)
                curveTo(6.486f, 9.53f, 6.938f, 11.161f, 8.206f, 11.116f)
                lineTo(8.234f, 11.926f)
                curveTo(6.209f, 11.997f, 5.615f, 9.854f, 6.25f, 5.796f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE10001))) {
                moveTo(7.06f, 5.466f)
                lineTo(7.861f, 5.591f)
                curveTo(7.296f, 9.199f, 7.748f, 10.83f, 9.016f, 10.786f)
                lineTo(9.044f, 11.595f)
                curveTo(7.02f, 11.667f, 6.425f, 9.523f, 7.06f, 5.466f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(8.564f, 12.046f)
                lineTo(9.37f, 11.967f)
                curveTo(9.437f, 12.65f, 9.386f, 13.239f, 9.213f, 13.733f)
                lineTo(8.449f, 13.466f)
                curveTo(8.579f, 13.093f, 8.62f, 12.619f, 8.564f, 12.046f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 0.810185f
            ) {
                moveTo(13.437f, 6.355f)
                curveTo(13.437f, 6.355f, 14.729f, 12.163f, 10.75f, 12.063f)
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(13.351f, 5.796f)
                lineTo(12.551f, 5.922f)
                curveTo(13.116f, 9.53f, 12.663f, 11.161f, 11.396f, 11.116f)
                lineTo(11.368f, 11.926f)
                curveTo(13.392f, 11.997f, 13.986f, 9.854f, 13.351f, 5.796f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE10001))) {
                moveTo(12.541f, 5.466f)
                lineTo(11.741f, 5.591f)
                curveTo(12.306f, 9.199f, 11.853f, 10.83f, 10.586f, 10.786f)
                lineTo(10.557f, 11.595f)
                curveTo(12.582f, 11.667f, 13.176f, 9.523f, 12.541f, 5.466f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(10.88f, 12.05f)
                lineTo(10.075f, 11.963f)
                curveTo(10.007f, 12.587f, 10.059f, 13.127f, 10.236f, 13.581f)
                lineTo(10.991f, 13.287f)
                curveTo(10.865f, 12.964f, 10.826f, 12.553f, 10.88f, 12.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF908F89))) {
                moveTo(8.667f, 10.938f)
                horizontalLineToRelative(2.431f)
                verticalLineToRelative(1.158f)
                horizontalLineToRelative(-2.431f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFEE901)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.882f, 11.25f)
                curveTo(10.567f, 11.25f, 11.159f, 10.864f, 11.568f, 10.296f)
                curveTo(11.977f, 9.729f, 12.22f, 8.96f, 12.22f, 8.125f)
                curveTo(12.22f, 7.29f, 11.977f, 6.521f, 11.568f, 5.954f)
                curveTo(11.159f, 5.386f, 10.567f, 5f, 9.882f, 5f)
                curveTo(9.197f, 5f, 8.605f, 5.386f, 8.196f, 5.954f)
                curveTo(7.787f, 6.521f, 7.544f, 7.29f, 7.544f, 8.125f)
                curveTo(7.544f, 8.96f, 7.787f, 9.729f, 8.196f, 10.296f)
                curveTo(8.605f, 10.864f, 9.197f, 11.25f, 9.882f, 11.25f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(9.882f, 11.25f)
                curveTo(10.567f, 11.25f, 11.159f, 10.864f, 11.568f, 10.296f)
                curveTo(11.977f, 9.729f, 12.22f, 8.96f, 12.22f, 8.125f)
                curveTo(12.22f, 7.29f, 11.977f, 6.521f, 11.568f, 5.954f)
                curveTo(11.159f, 5.386f, 10.567f, 5f, 9.882f, 5f)
                curveTo(9.197f, 5f, 8.605f, 5.386f, 8.196f, 5.954f)
                curveTo(7.787f, 6.521f, 7.544f, 7.29f, 7.544f, 8.125f)
                curveTo(7.544f, 8.96f, 7.787f, 9.729f, 8.196f, 10.296f)
                curveTo(8.605f, 10.864f, 9.197f, 11.25f, 9.882f, 11.25f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF8DDD61)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.349f, 9.628f)
                curveTo(11.349f, 9.628f, 10.364f, 9.092f, 10.082f, 8.901f)
                curveTo(9.799f, 8.71f, 9.962f, 8.284f, 9.475f, 8.398f)
                curveTo(8.989f, 8.512f, 8.598f, 8.71f, 8.598f, 9.254f)
                curveTo(8.598f, 9.798f, 8.215f, 10.121f, 8.085f, 9.749f)
                curveTo(7.955f, 9.378f, 7.342f, 7.64f, 8.085f, 7.64f)
                curveTo(8.828f, 7.64f, 10.564f, 8.03f, 11.075f, 8.03f)
                curveTo(11.586f, 8.03f, 11.883f, 8.295f, 11.883f, 8.775f)
                curveTo(11.883f, 9.419f, 11.349f, 9.628f, 11.349f, 9.628f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEE901)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.882f, 6.801f)
                curveTo(10.106f, 6.801f, 10.287f, 6.616f, 10.287f, 6.388f)
                curveTo(10.287f, 6.159f, 10.106f, 5.974f, 9.882f, 5.974f)
                curveTo(9.658f, 5.974f, 9.477f, 6.159f, 9.477f, 6.388f)
                curveTo(9.477f, 6.616f, 9.658f, 6.801f, 9.882f, 6.801f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.543f, 6.838f)
                curveTo(8.543f, 6.838f, 9.015f, 6.724f, 9.666f, 7.163f)
                curveTo(10.317f, 7.601f, 11.896f, 7.851f, 11.896f, 7.507f)
                curveTo(11.896f, 7.163f, 11.896f, 8.178f, 11.896f, 8.178f)
                curveTo(11.896f, 8.178f, 8.393f, 7.96f, 8.205f, 8.178f)
                curveTo(8.018f, 8.396f, 7.999f, 6.96f, 8.205f, 6.838f)
                curveTo(8.411f, 6.716f, 8.543f, 6.838f, 8.543f, 6.838f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EcuadorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Ecuador,
            contentDescription = "Ecuador Flag"
        )
    }
}
