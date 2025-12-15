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
 * Heard Island and McDonald Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: HM
 * - ISO Alpha-3: HMD
 * - ISO Numeric: 334
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.HeardIslandAndMcdonaldIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Heard Island and McDonald Islands:HM:HMD:334:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
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
                lineTo(9.715f, -0.466f)
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
        group(
            clipPathData = PathData {
                moveTo(3f, 1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-12f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(4.408f, 9.834f)
                lineTo(3.818f, 10.38f)
                lineTo(3.876f, 9.578f)
                lineTo(3.081f, 9.457f)
                lineTo(3.745f, 9.002f)
                lineTo(3.344f, 8.305f)
                lineTo(4.113f, 8.541f)
                lineTo(4.408f, 7.793f)
                lineTo(4.703f, 8.541f)
                lineTo(5.472f, 8.305f)
                lineTo(5.071f, 9.002f)
                lineTo(5.735f, 9.457f)
                lineTo(4.94f, 9.578f)
                lineTo(4.998f, 10.38f)
                lineTo(4.408f, 9.834f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.776f, 6.069f)
                lineTo(10.382f, 6.433f)
                lineTo(10.421f, 5.898f)
                lineTo(9.892f, 5.817f)
                lineTo(10.334f, 5.514f)
                lineTo(10.067f, 5.05f)
                lineTo(10.579f, 5.207f)
                lineTo(10.776f, 4.708f)
                lineTo(10.973f, 5.207f)
                lineTo(11.485f, 5.05f)
                lineTo(11.218f, 5.514f)
                lineTo(11.66f, 5.817f)
                lineTo(11.131f, 5.898f)
                lineTo(11.17f, 6.433f)
                lineTo(10.776f, 6.069f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(11.715f, 2.377f)
                lineTo(11.321f, 2.74f)
                lineTo(11.36f, 2.206f)
                lineTo(10.83f, 2.125f)
                lineTo(11.273f, 1.822f)
                lineTo(11.005f, 1.357f)
                lineTo(11.518f, 1.514f)
                lineTo(11.715f, 1.016f)
                lineTo(11.911f, 1.514f)
                lineTo(12.424f, 1.357f)
                lineTo(12.157f, 1.822f)
                lineTo(12.599f, 2.125f)
                lineTo(12.069f, 2.206f)
                lineTo(12.108f, 2.74f)
                lineTo(11.715f, 2.377f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(14.061f, 4.223f)
                lineTo(13.668f, 4.587f)
                lineTo(13.707f, 4.052f)
                lineTo(13.177f, 3.971f)
                lineTo(13.619f, 3.668f)
                lineTo(13.352f, 3.204f)
                lineTo(13.865f, 3.361f)
                lineTo(14.061f, 2.862f)
                lineTo(14.258f, 3.361f)
                lineTo(14.771f, 3.204f)
                lineTo(14.504f, 3.668f)
                lineTo(14.946f, 3.971f)
                lineTo(14.416f, 4.052f)
                lineTo(14.455f, 4.587f)
                lineTo(14.061f, 4.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.184f, 9.531f)
                lineTo(11.79f, 9.894f)
                lineTo(11.829f, 9.36f)
                lineTo(11.3f, 9.279f)
                lineTo(11.742f, 8.976f)
                lineTo(11.475f, 8.511f)
                lineTo(11.987f, 8.668f)
                lineTo(12.184f, 8.17f)
                lineTo(12.381f, 8.668f)
                lineTo(12.893f, 8.511f)
                lineTo(12.626f, 8.976f)
                lineTo(13.068f, 9.279f)
                lineTo(12.539f, 9.36f)
                lineTo(12.578f, 9.894f)
                lineTo(12.184f, 9.531f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(13.827f, 6.648f)
                lineTo(13.427f, 6.858f)
                lineTo(13.503f, 6.413f)
                lineTo(13.179f, 6.097f)
                lineTo(13.627f, 6.032f)
                lineTo(13.827f, 5.627f)
                lineTo(14.027f, 6.032f)
                lineTo(14.474f, 6.097f)
                lineTo(14.15f, 6.413f)
                lineTo(14.227f, 6.858f)
                lineTo(13.827f, 6.648f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HeardIslandAndMcdonaldIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.HeardIslandAndMcdonaldIslands,
            contentDescription = "Heard Island and McDonald Islands Flag"
        )
    }
}
