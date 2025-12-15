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
 * Slovakia Flag (16x12dp)
 *
 * - ISO Alpha-2: SK
 * - ISO Alpha-3: SVK
 * - ISO Numeric: 703
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Slovakia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovakia:SK:SVK:703:Small",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.802f, 3.015f)
                lineTo(8.051f, 2.989f)
                lineTo(8.027f, 2.765f)
                horizontalLineTo(7.802f)
                horizontalLineTo(3.172f)
                horizontalLineTo(2.939f)
                lineTo(2.923f, 2.998f)
                lineTo(3.172f, 3.015f)
                lineTo(2.923f, 2.998f)
                lineTo(2.923f, 2.999f)
                lineTo(2.923f, 2.999f)
                lineTo(2.923f, 3f)
                lineTo(2.922f, 3.006f)
                lineTo(2.921f, 3.03f)
                lineTo(2.915f, 3.118f)
                curveTo(2.91f, 3.194f, 2.904f, 3.303f, 2.896f, 3.437f)
                curveTo(2.88f, 3.705f, 2.861f, 4.071f, 2.844f, 4.462f)
                curveTo(2.812f, 5.231f, 2.79f, 6.133f, 2.846f, 6.553f)
                curveTo(2.956f, 7.375f, 3.456f, 9.218f, 5.39f, 10.054f)
                lineTo(5.491f, 10.097f)
                lineTo(5.591f, 10.052f)
                curveTo(7.428f, 9.231f, 8.043f, 7.577f, 8.184f, 6.555f)
                curveTo(8.256f, 6.039f, 8.22f, 5.137f, 8.169f, 4.387f)
                curveTo(8.144f, 4.007f, 8.114f, 3.658f, 8.091f, 3.403f)
                curveTo(8.079f, 3.276f, 8.069f, 3.173f, 8.062f, 3.101f)
                lineTo(8.054f, 3.018f)
                lineTo(8.051f, 2.996f)
                lineTo(8.051f, 2.991f)
                lineTo(8.051f, 2.989f)
                lineTo(8.051f, 2.989f)
                lineTo(8.051f, 2.989f)
                lineTo(7.802f, 3.015f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.802f, 3.015f)
                lineTo(8.051f, 2.989f)
                lineTo(8.027f, 2.765f)
                horizontalLineTo(7.802f)
                horizontalLineTo(3.172f)
                horizontalLineTo(2.939f)
                lineTo(2.923f, 2.998f)
                lineTo(3.172f, 3.015f)
                lineTo(2.923f, 2.998f)
                lineTo(2.923f, 2.999f)
                lineTo(2.923f, 2.999f)
                lineTo(2.923f, 3f)
                lineTo(2.922f, 3.006f)
                lineTo(2.921f, 3.03f)
                lineTo(2.915f, 3.118f)
                curveTo(2.91f, 3.194f, 2.904f, 3.303f, 2.896f, 3.437f)
                curveTo(2.88f, 3.705f, 2.861f, 4.071f, 2.844f, 4.462f)
                curveTo(2.812f, 5.231f, 2.79f, 6.133f, 2.846f, 6.553f)
                curveTo(2.956f, 7.375f, 3.456f, 9.218f, 5.39f, 10.054f)
                lineTo(5.491f, 10.097f)
                lineTo(5.591f, 10.052f)
                curveTo(7.428f, 9.231f, 8.043f, 7.577f, 8.184f, 6.555f)
                curveTo(8.256f, 6.039f, 8.22f, 5.137f, 8.169f, 4.387f)
                curveTo(8.144f, 4.007f, 8.114f, 3.658f, 8.091f, 3.403f)
                curveTo(8.079f, 3.276f, 8.069f, 3.173f, 8.062f, 3.101f)
                lineTo(8.054f, 3.018f)
                lineTo(8.051f, 2.996f)
                lineTo(8.051f, 2.991f)
                lineTo(8.051f, 2.989f)
                lineTo(8.051f, 2.989f)
                lineTo(8.051f, 2.989f)
                lineTo(7.802f, 3.015f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.931f, 3.295f)
                curveTo(4.931f, 3.295f, 5.034f, 3.452f, 5.081f, 3.693f)
                curveTo(5.127f, 3.933f, 5.135f, 4.207f, 5.135f, 4.207f)
                lineTo(4.353f, 4.086f)
                verticalLineTo(4.977f)
                lineTo(5.157f, 4.849f)
                lineTo(5.133f, 5.783f)
                curveTo(5.133f, 5.783f, 5.031f, 5.814f, 4.785f, 5.783f)
                curveTo(4.539f, 5.752f, 4.055f, 5.622f, 4.055f, 5.622f)
                verticalLineTo(6.472f)
                curveTo(4.055f, 6.472f, 4.547f, 6.315f, 4.785f, 6.279f)
                curveTo(5.023f, 6.243f, 5.133f, 6.279f, 5.133f, 6.279f)
                lineTo(5.141f, 7.094f)
                horizontalLineTo(5.938f)
                lineTo(5.93f, 6.279f)
                curveTo(5.93f, 6.279f, 6.181f, 6.24f, 6.446f, 6.282f)
                curveTo(6.711f, 6.324f, 6.963f, 6.472f, 6.963f, 6.472f)
                verticalLineTo(5.622f)
                curveTo(6.963f, 5.622f, 6.708f, 5.749f, 6.468f, 5.78f)
                curveTo(6.227f, 5.812f, 5.93f, 5.783f, 5.93f, 5.783f)
                lineTo(5.954f, 4.849f)
                curveTo(5.954f, 4.849f, 6.093f, 4.815f, 6.28f, 4.84f)
                curveTo(6.467f, 4.866f, 6.7f, 4.977f, 6.7f, 4.977f)
                verticalLineTo(4.086f)
                curveTo(6.7f, 4.086f, 6.472f, 4.21f, 6.293f, 4.233f)
                curveTo(6.114f, 4.255f, 5.932f, 4.207f, 5.932f, 4.207f)
                curveTo(5.932f, 4.207f, 5.939f, 3.92f, 5.977f, 3.708f)
                curveTo(6.016f, 3.496f, 6.125f, 3.295f, 6.125f, 3.295f)
                horizontalLineTo(4.931f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.449f, 8.123f)
                curveTo(3.449f, 8.123f, 3.668f, 7.651f, 4.026f, 7.561f)
                curveTo(4.384f, 7.472f, 4.759f, 7.842f, 4.759f, 7.842f)
                curveTo(4.759f, 7.842f, 4.988f, 7.094f, 5.546f, 7.094f)
                curveTo(6.104f, 7.094f, 6.299f, 7.842f, 6.299f, 7.842f)
                curveTo(6.299f, 7.842f, 6.538f, 7.561f, 6.88f, 7.561f)
                curveTo(7.222f, 7.561f, 7.54f, 8.123f, 7.54f, 8.123f)
                curveTo(7.54f, 8.123f, 6.517f, 9.979f, 5.494f, 9.979f)
                curveTo(4.471f, 9.979f, 3.449f, 8.123f, 3.449f, 8.123f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SlovakiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Slovakia,
            contentDescription = "Slovakia Flag"
        )
    }
}
