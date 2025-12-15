package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
 * Cyprus Flag (20x15dp)
 *
 * - ISO Alpha-2: CY
 * - ISO Alpha-3: CYP
 * - ISO Numeric: 196
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Cyprus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cyprus:CY:CYP:196:Medium",
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
                fill = SolidColor(Color(0xFFF57A01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.355f, 2.974f)
                curveTo(15.355f, 2.974f, 12.053f, 4.798f, 11.638f, 4.914f)
                curveTo(11.222f, 5.029f, 11.499f, 5.098f, 10.783f, 5.052f)
                curveTo(10.068f, 5.006f, 8.66f, 5.31f, 8.337f, 5.102f)
                curveTo(8.013f, 4.894f, 7.898f, 4.525f, 7.875f, 5.148f)
                curveTo(7.852f, 5.771f, 8.36f, 6.302f, 7.713f, 6.349f)
                curveTo(7.067f, 6.395f, 6.998f, 5.794f, 6.559f, 6.164f)
                curveTo(6.121f, 6.533f, 5.751f, 7.364f, 5.474f, 7.156f)
                curveTo(5.197f, 6.949f, 4.805f, 6.395f, 4.92f, 6.926f)
                curveTo(5.035f, 7.456f, 5.382f, 8.794f, 6.49f, 8.817f)
                curveTo(7.598f, 8.84f, 7.829f, 8.448f, 7.875f, 8.771f)
                curveTo(7.921f, 9.094f, 8.406f, 9.14f, 8.521f, 8.724f)
                curveTo(8.637f, 8.309f, 9.583f, 9.188f, 10.091f, 8.749f)
                curveTo(10.599f, 8.311f, 11.014f, 7.941f, 11.176f, 7.687f)
                curveTo(11.338f, 7.433f, 11.892f, 7.48f, 12.423f, 7.48f)
                curveTo(12.954f, 7.48f, 13.738f, 7.71f, 13.323f, 7.203f)
                curveTo(12.908f, 6.695f, 12.192f, 6.464f, 12.608f, 5.956f)
                curveTo(13.023f, 5.448f, 16.549f, 3.759f, 16.711f, 3.575f)
                curveTo(16.873f, 3.39f, 15.839f, 2.698f, 15.355f, 2.974f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEA5113),
                        1f to Color(0xFFFC9B58)
                    ),
                    start = Offset(18.75f, 11.25f),
                    end = Offset(18.75f, 1.25f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.355f, 2.974f)
                curveTo(15.355f, 2.974f, 12.053f, 4.798f, 11.638f, 4.914f)
                curveTo(11.222f, 5.029f, 11.499f, 5.098f, 10.783f, 5.052f)
                curveTo(10.068f, 5.006f, 8.66f, 5.31f, 8.337f, 5.102f)
                curveTo(8.013f, 4.894f, 7.898f, 4.525f, 7.875f, 5.148f)
                curveTo(7.852f, 5.771f, 8.36f, 6.302f, 7.713f, 6.349f)
                curveTo(7.067f, 6.395f, 6.998f, 5.794f, 6.559f, 6.164f)
                curveTo(6.121f, 6.533f, 5.751f, 7.364f, 5.474f, 7.156f)
                curveTo(5.197f, 6.949f, 4.805f, 6.395f, 4.92f, 6.926f)
                curveTo(5.035f, 7.456f, 5.382f, 8.794f, 6.49f, 8.817f)
                curveTo(7.598f, 8.84f, 7.829f, 8.448f, 7.875f, 8.771f)
                curveTo(7.921f, 9.094f, 8.406f, 9.14f, 8.521f, 8.724f)
                curveTo(8.637f, 8.309f, 9.583f, 9.188f, 10.091f, 8.749f)
                curveTo(10.599f, 8.311f, 11.014f, 7.941f, 11.176f, 7.687f)
                curveTo(11.338f, 7.433f, 11.892f, 7.48f, 12.423f, 7.48f)
                curveTo(12.954f, 7.48f, 13.738f, 7.71f, 13.323f, 7.203f)
                curveTo(12.908f, 6.695f, 12.192f, 6.464f, 12.608f, 5.956f)
                curveTo(13.023f, 5.448f, 16.549f, 3.759f, 16.711f, 3.575f)
                curveTo(16.873f, 3.39f, 15.839f, 2.698f, 15.355f, 2.974f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF006B49)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.82f, 10.065f)
                curveTo(8.459f, 10.065f, 9.867f, 11.889f, 9.867f, 11.889f)
                curveTo(9.891f, 11.913f, 9.913f, 11.936f, 9.933f, 11.958f)
                curveTo(9.953f, 11.936f, 9.975f, 11.913f, 9.999f, 11.889f)
                curveTo(9.999f, 11.889f, 11.641f, 10.065f, 13.28f, 10.065f)
                curveTo(14.919f, 10.065f, 12.099f, 12.72f, 10.276f, 12.72f)
                curveTo(10.276f, 12.72f, 10.088f, 12.703f, 9.933f, 12.625f)
                curveTo(9.778f, 12.703f, 9.59f, 12.72f, 9.59f, 12.72f)
                curveTo(7.767f, 12.72f, 5.181f, 10.065f, 6.82f, 10.065f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF008057),
                        1f to Color(0xFF00B77C)
                    ),
                    start = Offset(13.774f, 12.72f),
                    end = Offset(13.774f, 10.065f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.82f, 10.065f)
                curveTo(8.459f, 10.065f, 9.867f, 11.889f, 9.867f, 11.889f)
                curveTo(9.891f, 11.913f, 9.913f, 11.936f, 9.933f, 11.958f)
                curveTo(9.953f, 11.936f, 9.975f, 11.913f, 9.999f, 11.889f)
                curveTo(9.999f, 11.889f, 11.641f, 10.065f, 13.28f, 10.065f)
                curveTo(14.919f, 10.065f, 12.099f, 12.72f, 10.276f, 12.72f)
                curveTo(10.276f, 12.72f, 10.088f, 12.703f, 9.933f, 12.625f)
                curveTo(9.778f, 12.703f, 9.59f, 12.72f, 9.59f, 12.72f)
                curveTo(7.767f, 12.72f, 5.181f, 10.065f, 6.82f, 10.065f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CyprusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Cyprus,
            contentDescription = "Cyprus Flag"
        )
    }
}
