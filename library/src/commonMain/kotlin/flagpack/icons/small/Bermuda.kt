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
 * Bermuda Flag (16x12dp)
 *
 * - ISO Alpha-2: BM
 * - ISO Alpha-3: BMU
 * - ISO Numeric: 060
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Bermuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bermuda:BM:BMU:060:Small",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
                moveTo(11.004f, 6f)
                curveTo(11.004f, 8.943f, 11.282f, 9.966f, 12.96f, 9.966f)
                curveTo(14.637f, 9.966f, 15.097f, 8.483f, 14.955f, 6f)
                horizontalLineTo(11.004f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.05f, 7.7f)
                curveTo(13.519f, 7.7f, 13.9f, 7.252f, 13.9f, 6.7f)
                curveTo(13.9f, 6.148f, 13.519f, 5.7f, 13.05f, 5.7f)
                curveTo(12.581f, 5.7f, 12.2f, 6.148f, 12.2f, 6.7f)
                curveTo(12.2f, 7.252f, 12.581f, 7.7f, 13.05f, 7.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.397f, 9.157f)
                curveTo(11.696f, 9.824f, 12.218f, 10.157f, 12.965f, 10.157f)
                curveTo(13.707f, 10.157f, 14.231f, 9.828f, 14.538f, 9.17f)
                lineTo(11.397f, 9.157f)
                close()
            }
            path(fill = SolidColor(Color(0xFF82B2CB))) {
                moveTo(11.81f, 7.515f)
                lineTo(11.531f, 6.819f)
                curveTo(12.043f, 6.614f, 12.537f, 6.51f, 13.011f, 6.51f)
                curveTo(13.486f, 6.51f, 13.979f, 6.614f, 14.492f, 6.819f)
                lineTo(14.213f, 7.515f)
                curveTo(13.785f, 7.344f, 13.385f, 7.26f, 13.011f, 7.26f)
                curveTo(12.637f, 7.26f, 12.237f, 7.344f, 11.81f, 7.515f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.5f, 8f)
                curveTo(12.776f, 8f, 13f, 7.776f, 13f, 7.5f)
                curveTo(13f, 7.224f, 12.776f, 7f, 12.5f, 7f)
                curveTo(12.224f, 7f, 12f, 7.224f, 12f, 7.5f)
                curveTo(12f, 7.776f, 12.224f, 8f, 12.5f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8A4E22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.8f, 8.8f)
                curveTo(13.076f, 8.8f, 13.3f, 8.576f, 13.3f, 8.3f)
                curveTo(13.3f, 8.024f, 13.076f, 7.8f, 12.8f, 7.8f)
                curveTo(12.524f, 7.8f, 12.3f, 8.024f, 12.3f, 8.3f)
                curveTo(12.3f, 8.576f, 12.524f, 8.8f, 12.8f, 8.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 8.4f)
                curveTo(12.276f, 8.4f, 12.5f, 8.176f, 12.5f, 7.9f)
                curveTo(12.5f, 7.624f, 12.276f, 7.4f, 12f, 7.4f)
                curveTo(11.724f, 7.4f, 11.5f, 7.624f, 11.5f, 7.9f)
                curveTo(11.5f, 8.176f, 11.724f, 8.4f, 12f, 8.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.7f, 8.4f)
                curveTo(13.976f, 8.4f, 14.2f, 8.176f, 14.2f, 7.9f)
                curveTo(14.2f, 7.624f, 13.976f, 7.4f, 13.7f, 7.4f)
                curveTo(13.424f, 7.4f, 13.2f, 7.624f, 13.2f, 7.9f)
                curveTo(13.2f, 8.176f, 13.424f, 8.4f, 13.7f, 8.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.35f, 9.5f)
                curveTo(13.543f, 9.5f, 13.7f, 9.276f, 13.7f, 9f)
                curveTo(13.7f, 8.724f, 13.543f, 8.5f, 13.35f, 8.5f)
                curveTo(13.157f, 8.5f, 13f, 8.724f, 13f, 9f)
                curveTo(13f, 9.276f, 13.157f, 9.5f, 13.35f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.15f, 9.5f)
                curveTo(12.343f, 9.5f, 12.5f, 9.276f, 12.5f, 9f)
                curveTo(12.5f, 8.724f, 12.343f, 8.5f, 12.15f, 8.5f)
                curveTo(11.957f, 8.5f, 11.8f, 8.724f, 11.8f, 9f)
                curveTo(11.8f, 9.276f, 11.957f, 9.5f, 12.15f, 9.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.369f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.714f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.369f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.242f, -0.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(2.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(4.75f)
                horizontalLineTo(-0.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(3.242f)
                verticalLineTo(-0.75f)
                close()
                moveTo(3.992f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
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
            imageVector = FlagIcons.Small.Bermuda,
            contentDescription = "Bermuda Flag"
        )
    }
}
