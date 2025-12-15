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
 * Angola Flag (20x15dp)
 *
 * - ISO Alpha-2: AO
 * - ISO Alpha-3: AGO
 * - ISO Numeric: 024
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Angola: ImageVector by lazy {
    ImageVector.Builder(
        name = "Angola:AO:AGO:024:Medium",
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
                fill = SolidColor(Color(0xFF1D1D1D)),
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
                fill = SolidColor(Color(0xFFF50100)),
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
                fill = SolidColor(Color(0xFFFCFF01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.719f, 8.37f)
                curveTo(10.203f, 7.771f, 10.355f, 6.997f, 10.355f, 6.514f)
                curveTo(10.355f, 3.941f, 7.144f, 2.517f, 7.144f, 2.517f)
                curveTo(9.352f, 2.517f, 11.811f, 4.307f, 11.811f, 6.514f)
                curveTo(11.811f, 7.449f, 11.49f, 8.316f, 10.952f, 9.006f)
                curveTo(11.936f, 9.497f, 12.769f, 9.88f, 12.769f, 9.88f)
                curveTo(13.078f, 10.082f, 13.164f, 10.623f, 12.961f, 10.932f)
                curveTo(12.759f, 11.241f, 12.344f, 11.327f, 12.035f, 11.124f)
                curveTo(12.035f, 11.124f, 11.245f, 10.657f, 10.764f, 10.341f)
                curveTo(10.543f, 10.197f, 10.288f, 10.04f, 10.016f, 9.879f)
                curveTo(9.384f, 10.305f, 8.627f, 10.554f, 7.813f, 10.554f)
                curveTo(7.813f, 10.554f, 4.877f, 10.194f, 4.961f, 8.689f)
                curveTo(4.961f, 8.689f, 5.672f, 9.232f, 7.763f, 9.232f)
                curveTo(8.095f, 9.232f, 8.388f, 9.186f, 8.644f, 9.104f)
                curveTo(7.739f, 8.61f, 6.971f, 8.218f, 6.971f, 8.218f)
                curveTo(6.662f, 8.016f, 5.858f, 6.989f, 6.06f, 6.68f)
                curveTo(6.263f, 6.371f, 7.488f, 6.72f, 7.797f, 6.922f)
                curveTo(7.797f, 6.922f, 8.227f, 7.512f, 8.833f, 7.873f)
                curveTo(9.101f, 8.032f, 9.404f, 8.201f, 9.719f, 8.37f)
                close()
                moveTo(8.238f, 6.127f)
                lineTo(7.607f, 6.547f)
                lineTo(7.808f, 5.827f)
                lineTo(7.345f, 5.367f)
                lineTo(7.972f, 5.342f)
                lineTo(8.238f, 4.629f)
                lineTo(8.503f, 5.342f)
                horizontalLineTo(9.129f)
                lineTo(8.667f, 5.827f)
                lineTo(8.899f, 6.505f)
                lineTo(8.238f, 6.127f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEA42)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.719f, 8.37f)
                curveTo(10.203f, 7.771f, 10.355f, 6.997f, 10.355f, 6.514f)
                curveTo(10.355f, 3.941f, 7.144f, 2.517f, 7.144f, 2.517f)
                curveTo(9.352f, 2.517f, 11.811f, 4.307f, 11.811f, 6.514f)
                curveTo(11.811f, 7.449f, 11.49f, 8.316f, 10.952f, 9.006f)
                curveTo(11.936f, 9.497f, 12.769f, 9.88f, 12.769f, 9.88f)
                curveTo(13.078f, 10.082f, 13.164f, 10.623f, 12.961f, 10.932f)
                curveTo(12.759f, 11.241f, 12.344f, 11.327f, 12.035f, 11.124f)
                curveTo(12.035f, 11.124f, 11.245f, 10.657f, 10.764f, 10.341f)
                curveTo(10.543f, 10.197f, 10.288f, 10.04f, 10.016f, 9.879f)
                curveTo(9.384f, 10.305f, 8.627f, 10.554f, 7.813f, 10.554f)
                curveTo(7.813f, 10.554f, 4.877f, 10.194f, 4.961f, 8.689f)
                curveTo(4.961f, 8.689f, 5.672f, 9.232f, 7.763f, 9.232f)
                curveTo(8.095f, 9.232f, 8.388f, 9.186f, 8.644f, 9.104f)
                curveTo(7.739f, 8.61f, 6.971f, 8.218f, 6.971f, 8.218f)
                curveTo(6.662f, 8.016f, 5.858f, 6.989f, 6.06f, 6.68f)
                curveTo(6.263f, 6.371f, 7.488f, 6.72f, 7.797f, 6.922f)
                curveTo(7.797f, 6.922f, 8.227f, 7.512f, 8.833f, 7.873f)
                curveTo(9.101f, 8.032f, 9.404f, 8.201f, 9.719f, 8.37f)
                close()
                moveTo(8.238f, 6.127f)
                lineTo(7.607f, 6.547f)
                lineTo(7.808f, 5.827f)
                lineTo(7.345f, 5.367f)
                lineTo(7.972f, 5.342f)
                lineTo(8.238f, 4.629f)
                lineTo(8.503f, 5.342f)
                horizontalLineTo(9.129f)
                lineTo(8.667f, 5.827f)
                lineTo(8.899f, 6.505f)
                lineTo(8.238f, 6.127f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AngolaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Angola,
            contentDescription = "Angola Flag"
        )
    }
}
