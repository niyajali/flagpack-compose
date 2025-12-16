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
 * Oman Flag (16x12dp)
 *
 * - ISO Alpha-2: OM
 * - ISO Alpha-3: OMN
 * - ISO Numeric: 512
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Oman: ImageVector by lazy {
    ImageVector.Builder(
        name = "Oman:OM:OMN:512:Small",
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
                fill = SolidColor(Color(0xFFF50101)),
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
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.385f, 1.016f)
                curveTo(5.39f, 0.971f, 5.332f, 0.953f, 5.308f, 0.993f)
                curveTo(5.127f, 1.301f, 4.672f, 2.034f, 3.923f, 2.993f)
                verticalLineTo(2.534f)
                curveTo(3.852f, 2.457f, 3.624f, 2.248f, 3.624f, 2.248f)
                verticalLineTo(1.79f)
                lineTo(4.036f, 1.417f)
                lineTo(3.471f, 1f)
                lineTo(2.874f, 1.417f)
                lineTo(3.325f, 1.79f)
                verticalLineTo(2.248f)
                curveTo(3.325f, 2.468f, 3.052f, 2.534f, 3.052f, 2.534f)
                lineTo(3.002f, 2.938f)
                curveTo(2.305f, 2.034f, 1.871f, 1.329f, 1.687f, 1.014f)
                curveTo(1.664f, 0.973f, 1.604f, 0.992f, 1.611f, 1.039f)
                curveTo(1.666f, 1.407f, 1.832f, 2.225f, 2.291f, 3.098f)
                horizontalLineTo(2.168f)
                verticalLineTo(3.082f)
                curveTo(2.168f, 3.058f, 2.148f, 3.038f, 2.124f, 3.038f)
                horizontalLineTo(1.07f)
                curveTo(1.046f, 3.038f, 1.027f, 3.058f, 1.027f, 3.082f)
                verticalLineTo(3.745f)
                curveTo(1.027f, 3.769f, 1.046f, 3.788f, 1.07f, 3.788f)
                horizontalLineTo(2.124f)
                curveTo(2.148f, 3.788f, 2.168f, 3.769f, 2.168f, 3.745f)
                verticalLineTo(3.397f)
                horizontalLineTo(2.301f)
                curveTo(2.346f, 3.501f, 2.449f, 3.574f, 2.57f, 3.576f)
                curveTo(2.655f, 3.706f, 2.746f, 3.836f, 2.846f, 3.965f)
                curveTo(2.617f, 3.942f, 1.106f, 3.814f, 1.106f, 4.363f)
                curveTo(1.106f, 4.691f, 1.474f, 4.865f, 1.935f, 4.955f)
                curveTo(1.471f, 5.375f, 1.033f, 5.77f, 0.831f, 5.952f)
                curveTo(0.798f, 5.981f, 0.824f, 6.033f, 0.867f, 6.022f)
                curveTo(1.227f, 5.933f, 2.17f, 5.658f, 3.068f, 5.045f)
                lineTo(3.096f, 5.045f)
                curveTo(3.349f, 5.045f, 3.524f, 4.935f, 3.647f, 4.787f)
                curveTo(4.56f, 5.532f, 5.593f, 5.877f, 6.042f, 6f)
                curveTo(6.088f, 6.013f, 6.113f, 5.953f, 6.074f, 5.925f)
                curveTo(5.709f, 5.672f, 4.888f, 5.064f, 4.048f, 4.18f)
                lineTo(4.07f, 4.154f)
                curveTo(4.241f, 3.952f, 4.391f, 3.744f, 4.521f, 3.535f)
                curveTo(4.575f, 3.503f, 4.619f, 3.455f, 4.644f, 3.397f)
                horizontalLineTo(4.777f)
                lineTo(4.777f, 3.745f)
                curveTo(4.777f, 3.769f, 4.796f, 3.788f, 4.82f, 3.788f)
                horizontalLineTo(5.874f)
                curveTo(5.898f, 3.788f, 5.918f, 3.769f, 5.918f, 3.745f)
                verticalLineTo(3.082f)
                curveTo(5.918f, 3.058f, 5.898f, 3.038f, 5.874f, 3.038f)
                horizontalLineTo(4.82f)
                curveTo(4.809f, 3.038f, 4.799f, 3.043f, 4.791f, 3.05f)
                curveTo(5.222f, 2.177f, 5.349f, 1.367f, 5.385f, 1.016f)
                close()
                moveTo(4.777f, 3.098f)
                lineTo(4.777f, 3.082f)
                lineTo(4.777f, 3.078f)
                lineTo(4.767f, 3.098f)
                horizontalLineTo(4.777f)
                close()
                moveTo(2.82f, 3.28f)
                curveTo(2.82f, 3.414f, 2.711f, 3.522f, 2.576f, 3.522f)
                curveTo(2.44f, 3.522f, 2.331f, 3.414f, 2.331f, 3.28f)
                curveTo(2.331f, 3.147f, 2.44f, 3.038f, 2.576f, 3.038f)
                curveTo(2.711f, 3.038f, 2.82f, 3.147f, 2.82f, 3.28f)
                close()
                moveTo(4.124f, 3.28f)
                curveTo(4.124f, 3.414f, 4.234f, 3.522f, 4.369f, 3.522f)
                curveTo(4.504f, 3.522f, 4.614f, 3.414f, 4.614f, 3.28f)
                curveTo(4.614f, 3.147f, 4.504f, 3.038f, 4.369f, 3.038f)
                curveTo(4.234f, 3.038f, 4.124f, 3.147f, 4.124f, 3.28f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun OmanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Oman,
            contentDescription = "Oman Flag"
        )
    }
}
