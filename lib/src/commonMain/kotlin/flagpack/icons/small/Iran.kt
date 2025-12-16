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
 * Iran Flag (16x12dp)
 *
 * - ISO Alpha-2: IR
 * - ISO Alpha-3: IRN
 * - ISO Numeric: 364
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Iran: ImageVector by lazy {
    ImageVector.Builder(
        name = "Iran:IR:IRN:364:Small",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.186f, 8.683f)
                horizontalLineTo(-0.951f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(-0.962f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(-0.592f)
                verticalLineTo(9.125f)
                horizontalLineTo(-0.218f)
                verticalLineTo(8.873f)
                horizontalLineTo(-0.412f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.169f, 9.123f)
                horizontalLineTo(-0.019f)
                verticalLineTo(8.878f)
                horizontalLineTo(0.377f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(0.557f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.759f, 8.704f)
                curveTo(0.759f, 8.729f, 0.759f, 9.125f, 0.759f, 9.125f)
                horizontalLineTo(0.573f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.138f, 8.683f)
                horizontalLineTo(1f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.989f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(1.359f)
                verticalLineTo(9.125f)
                horizontalLineTo(1.733f)
                verticalLineTo(8.873f)
                horizontalLineTo(1.539f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.155f, 9.123f)
                horizontalLineTo(1.967f)
                verticalLineTo(8.878f)
                horizontalLineTo(2.363f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(2.543f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.745f, 8.704f)
                curveTo(2.745f, 8.729f, 2.745f, 9.125f, 2.745f, 9.125f)
                horizontalLineTo(2.559f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.124f, 8.683f)
                horizontalLineTo(2.987f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.975f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(3.345f)
                verticalLineTo(9.125f)
                horizontalLineTo(3.719f)
                verticalLineTo(8.873f)
                horizontalLineTo(3.525f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.106f, 9.123f)
                horizontalLineTo(3.918f)
                verticalLineTo(8.878f)
                horizontalLineTo(4.315f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(4.494f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.696f, 8.704f)
                curveTo(4.696f, 8.729f, 4.696f, 9.125f, 4.696f, 9.125f)
                horizontalLineTo(4.51f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.075f, 8.683f)
                horizontalLineTo(4.938f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.926f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(5.296f)
                verticalLineTo(9.125f)
                horizontalLineTo(5.67f)
                verticalLineTo(8.873f)
                horizontalLineTo(5.476f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.058f, 9.123f)
                horizontalLineTo(5.869f)
                verticalLineTo(8.878f)
                horizontalLineTo(6.266f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(6.446f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.648f, 8.704f)
                curveTo(6.648f, 8.729f, 6.648f, 9.125f, 6.648f, 9.125f)
                horizontalLineTo(6.461f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.026f, 8.683f)
                horizontalLineTo(6.889f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.877f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(7.247f)
                verticalLineTo(9.125f)
                horizontalLineTo(7.621f)
                verticalLineTo(8.873f)
                horizontalLineTo(7.427f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.044f, 9.123f)
                horizontalLineTo(7.855f)
                verticalLineTo(8.878f)
                horizontalLineTo(8.252f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(8.432f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.634f, 8.704f)
                curveTo(8.634f, 8.729f, 8.634f, 9.125f, 8.634f, 9.125f)
                horizontalLineTo(8.447f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.012f, 8.683f)
                horizontalLineTo(8.875f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.863f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(9.234f)
                verticalLineTo(9.125f)
                horizontalLineTo(9.608f)
                verticalLineTo(8.873f)
                horizontalLineTo(9.414f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.03f, 9.123f)
                horizontalLineTo(9.841f)
                verticalLineTo(8.878f)
                horizontalLineTo(10.238f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(10.418f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.62f, 8.704f)
                curveTo(10.62f, 8.729f, 10.62f, 9.125f, 10.62f, 9.125f)
                horizontalLineTo(10.433f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.998f, 8.683f)
                horizontalLineTo(10.861f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.849f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(11.22f)
                verticalLineTo(9.125f)
                horizontalLineTo(11.594f)
                verticalLineTo(8.873f)
                horizontalLineTo(11.4f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.016f, 9.123f)
                horizontalLineTo(11.827f)
                verticalLineTo(8.878f)
                horizontalLineTo(12.224f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(12.404f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.606f, 8.704f)
                curveTo(12.606f, 8.729f, 12.606f, 9.125f, 12.606f, 9.125f)
                horizontalLineTo(12.419f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(13.984f, 8.683f)
                horizontalLineTo(12.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.835f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(13.206f)
                verticalLineTo(9.125f)
                horizontalLineTo(13.58f)
                verticalLineTo(8.873f)
                horizontalLineTo(13.386f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(13.967f, 9.123f)
                horizontalLineTo(13.779f)
                verticalLineTo(8.878f)
                horizontalLineTo(14.175f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(14.355f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.557f, 8.704f)
                curveTo(14.557f, 8.729f, 14.557f, 9.125f, 14.557f, 9.125f)
                horizontalLineTo(14.371f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.936f, 8.683f)
                horizontalLineTo(14.799f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.787f, 9.134f)
                verticalLineTo(8.873f)
                horizontalLineTo(15.157f)
                verticalLineTo(9.125f)
                horizontalLineTo(15.531f)
                verticalLineTo(8.873f)
                horizontalLineTo(15.337f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.023f, 9.123f)
                horizontalLineTo(15.834f)
                verticalLineTo(8.878f)
                horizontalLineTo(16.231f)
                verticalLineTo(8.678f)
                verticalLineTo(9.123f)
                horizontalLineTo(16.411f)
                verticalLineTo(8.678f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.186f, 2.583f)
                horizontalLineTo(-0.951f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(-0.962f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(-0.592f)
                verticalLineTo(3.025f)
                horizontalLineTo(-0.218f)
                verticalLineTo(2.773f)
                horizontalLineTo(-0.412f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.169f, 3.023f)
                horizontalLineTo(-0.019f)
                verticalLineTo(2.778f)
                horizontalLineTo(0.377f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(0.557f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.759f, 2.604f)
                curveTo(0.759f, 2.629f, 0.759f, 3.025f, 0.759f, 3.025f)
                horizontalLineTo(0.573f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.138f, 2.583f)
                horizontalLineTo(1f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(0.989f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(1.359f)
                verticalLineTo(3.025f)
                horizontalLineTo(1.733f)
                verticalLineTo(2.773f)
                horizontalLineTo(1.539f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.155f, 3.023f)
                horizontalLineTo(1.967f)
                verticalLineTo(2.778f)
                horizontalLineTo(2.363f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(2.543f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.745f, 2.604f)
                curveTo(2.745f, 2.629f, 2.745f, 3.025f, 2.745f, 3.025f)
                horizontalLineTo(2.559f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.124f, 2.583f)
                horizontalLineTo(2.987f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.975f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(3.345f)
                verticalLineTo(3.025f)
                horizontalLineTo(3.719f)
                verticalLineTo(2.773f)
                horizontalLineTo(3.525f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.106f, 3.023f)
                horizontalLineTo(3.918f)
                verticalLineTo(2.778f)
                horizontalLineTo(4.315f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(4.494f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.696f, 2.604f)
                curveTo(4.696f, 2.629f, 4.696f, 3.025f, 4.696f, 3.025f)
                horizontalLineTo(4.51f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.075f, 2.583f)
                horizontalLineTo(4.938f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.926f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(5.296f)
                verticalLineTo(3.025f)
                horizontalLineTo(5.67f)
                verticalLineTo(2.773f)
                horizontalLineTo(5.476f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.058f, 3.023f)
                horizontalLineTo(5.869f)
                verticalLineTo(2.778f)
                horizontalLineTo(6.266f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(6.446f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.648f, 2.604f)
                curveTo(6.648f, 2.629f, 6.648f, 3.025f, 6.648f, 3.025f)
                horizontalLineTo(6.461f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.026f, 2.583f)
                horizontalLineTo(6.889f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(6.877f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(7.247f)
                verticalLineTo(3.025f)
                horizontalLineTo(7.621f)
                verticalLineTo(2.773f)
                horizontalLineTo(7.427f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.044f, 3.023f)
                horizontalLineTo(7.855f)
                verticalLineTo(2.778f)
                horizontalLineTo(8.252f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(8.432f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.634f, 2.604f)
                curveTo(8.634f, 2.629f, 8.634f, 3.025f, 8.634f, 3.025f)
                horizontalLineTo(8.447f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.012f, 2.583f)
                horizontalLineTo(8.875f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.863f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(9.234f)
                verticalLineTo(3.025f)
                horizontalLineTo(9.608f)
                verticalLineTo(2.773f)
                horizontalLineTo(9.414f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.03f, 3.023f)
                horizontalLineTo(9.841f)
                verticalLineTo(2.778f)
                horizontalLineTo(10.238f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(10.418f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.62f, 2.604f)
                curveTo(10.62f, 2.629f, 10.62f, 3.025f, 10.62f, 3.025f)
                horizontalLineTo(10.433f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.998f, 2.583f)
                horizontalLineTo(10.861f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.849f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(11.22f)
                verticalLineTo(3.025f)
                horizontalLineTo(11.594f)
                verticalLineTo(2.773f)
                horizontalLineTo(11.4f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.016f, 3.023f)
                horizontalLineTo(11.827f)
                verticalLineTo(2.778f)
                horizontalLineTo(12.224f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(12.404f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.606f, 2.604f)
                curveTo(12.606f, 2.629f, 12.606f, 3.025f, 12.606f, 3.025f)
                horizontalLineTo(12.419f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(13.984f, 2.583f)
                horizontalLineTo(12.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.835f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(13.206f)
                verticalLineTo(3.025f)
                horizontalLineTo(13.58f)
                verticalLineTo(2.773f)
                horizontalLineTo(13.386f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(13.967f, 3.023f)
                horizontalLineTo(13.779f)
                verticalLineTo(2.778f)
                horizontalLineTo(14.175f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(14.355f)
                verticalLineTo(2.578f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.557f, 2.604f)
                curveTo(14.557f, 2.629f, 14.557f, 3.025f, 14.557f, 3.025f)
                horizontalLineTo(14.371f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.936f, 2.583f)
                horizontalLineTo(14.799f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(14.787f, 3.034f)
                verticalLineTo(2.773f)
                horizontalLineTo(15.157f)
                verticalLineTo(3.025f)
                horizontalLineTo(15.531f)
                verticalLineTo(2.773f)
                horizontalLineTo(15.337f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.023f, 3.023f)
                horizontalLineTo(15.834f)
                verticalLineTo(2.778f)
                horizontalLineTo(16.231f)
                verticalLineTo(2.578f)
                verticalLineTo(3.023f)
                horizontalLineTo(16.411f)
                verticalLineTo(2.578f)
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.303f, 4.125f)
                curveTo(7.303f, 4.125f, 7.517f, 4.238f, 7.735f, 4.238f)
                curveTo(7.954f, 4.238f, 8.174f, 4.125f, 8.174f, 4.125f)
                verticalLineTo(4.275f)
                curveTo(8.174f, 4.275f, 7.934f, 4.387f, 7.721f, 4.387f)
                curveTo(7.508f, 4.387f, 7.303f, 4.275f, 7.303f, 4.275f)
                verticalLineTo(4.125f)
                close()
                moveTo(5.728f, 5.895f)
                curveTo(5.728f, 5.006f, 6.949f, 4.425f, 6.949f, 4.425f)
                curveTo(6.949f, 4.425f, 6.243f, 4.803f, 6.243f, 5.858f)
                curveTo(6.243f, 6.913f, 6.61f, 7.37f, 6.61f, 7.37f)
                curveTo(6.61f, 7.37f, 5.728f, 6.784f, 5.728f, 5.895f)
                close()
                moveTo(9.847f, 5.846f)
                curveTo(9.847f, 4.957f, 8.627f, 4.425f, 8.627f, 4.425f)
                curveTo(8.627f, 4.425f, 9.333f, 4.803f, 9.333f, 5.858f)
                curveTo(9.333f, 6.913f, 8.967f, 7.37f, 8.967f, 7.37f)
                curveTo(8.967f, 7.37f, 9.847f, 6.735f, 9.847f, 5.846f)
                close()
                moveTo(6.562f, 6.089f)
                curveTo(6.515f, 5.201f, 7.254f, 4.405f, 7.254f, 4.405f)
                curveTo(7.254f, 4.405f, 6.985f, 4.771f, 7.04f, 5.824f)
                curveTo(7.059f, 6.186f, 7.202f, 6.724f, 7.381f, 7.042f)
                verticalLineTo(4.463f)
                horizontalLineTo(8.131f)
                verticalLineTo(7.064f)
                curveTo(8.311f, 6.768f, 8.449f, 6.262f, 8.469f, 5.895f)
                curveTo(8.524f, 4.842f, 8.268f, 4.405f, 8.268f, 4.405f)
                curveTo(8.268f, 4.405f, 9.006f, 5.201f, 8.96f, 6.089f)
                curveTo(8.932f, 6.618f, 8.525f, 7.177f, 8.201f, 7.543f)
                curveTo(8.358f, 7.578f, 8.57f, 7.621f, 8.86f, 7.678f)
                curveTo(8.867f, 7.71f, 8.802f, 7.709f, 8.673f, 7.706f)
                curveTo(8.531f, 7.702f, 8.311f, 7.697f, 8.023f, 7.734f)
                curveTo(7.89f, 7.87f, 7.798f, 7.95f, 7.798f, 7.95f)
                curveTo(7.798f, 7.95f, 7.783f, 7.93f, 7.761f, 7.903f)
                curveTo(7.738f, 7.93f, 7.724f, 7.95f, 7.724f, 7.95f)
                curveTo(7.724f, 7.95f, 7.631f, 7.87f, 7.499f, 7.734f)
                curveTo(7.21f, 7.697f, 6.99f, 7.702f, 6.848f, 7.706f)
                curveTo(6.72f, 7.709f, 6.655f, 7.71f, 6.661f, 7.678f)
                curveTo(6.952f, 7.621f, 7.163f, 7.578f, 7.321f, 7.543f)
                curveTo(6.996f, 7.177f, 6.589f, 6.618f, 6.562f, 6.089f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IranPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Iran,
            contentDescription = "Iran Flag"
        )
    }
}
