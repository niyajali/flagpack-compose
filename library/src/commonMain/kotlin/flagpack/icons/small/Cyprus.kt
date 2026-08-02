package flagpack.icons.small

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
 * Cyprus Flag (16x12dp)
 *
 * - ISO Alpha-2: CY
 * - ISO Alpha-3: CYP
 * - ISO Numeric: 196
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Cyprus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cyprus:CY:CYP:196:Small",
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
                fill = SolidColor(Color(0xFFF57A01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.284f, 2.38f)
                curveTo(12.284f, 2.38f, 9.643f, 3.839f, 9.31f, 3.931f)
                curveTo(8.978f, 4.023f, 9.199f, 4.079f, 8.627f, 4.042f)
                curveTo(8.054f, 4.005f, 6.928f, 4.248f, 6.669f, 4.082f)
                curveTo(6.411f, 3.915f, 6.318f, 3.62f, 6.3f, 4.119f)
                curveTo(6.281f, 4.617f, 6.688f, 5.042f, 6.171f, 5.079f)
                curveTo(5.654f, 5.116f, 5.598f, 4.635f, 5.247f, 4.931f)
                curveTo(4.896f, 5.226f, 4.601f, 5.891f, 4.379f, 5.725f)
                curveTo(4.158f, 5.559f, 3.844f, 5.116f, 3.936f, 5.54f)
                curveTo(4.028f, 5.965f, 4.305f, 7.035f, 5.192f, 7.054f)
                curveTo(6.078f, 7.072f, 6.263f, 6.758f, 6.3f, 7.017f)
                curveTo(6.337f, 7.275f, 6.725f, 7.312f, 6.817f, 6.98f)
                curveTo(6.909f, 6.647f, 7.667f, 7.35f, 8.073f, 6.999f)
                curveTo(8.479f, 6.649f, 8.812f, 6.353f, 8.941f, 6.15f)
                curveTo(9.07f, 5.947f, 9.513f, 5.984f, 9.938f, 5.984f)
                curveTo(10.363f, 5.984f, 10.991f, 6.168f, 10.658f, 5.762f)
                curveTo(10.326f, 5.356f, 9.753f, 5.171f, 10.086f, 4.765f)
                curveTo(10.418f, 4.359f, 13.24f, 3.008f, 13.369f, 2.86f)
                curveTo(13.498f, 2.712f, 12.671f, 2.158f, 12.284f, 2.38f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFEA5113),
                        1f to Color(0xFFFC9B58)
                    ),
                    start = Offset(15f, 9f),
                    end = Offset(15f, 1f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.284f, 2.38f)
                curveTo(12.284f, 2.38f, 9.643f, 3.839f, 9.31f, 3.931f)
                curveTo(8.978f, 4.023f, 9.199f, 4.079f, 8.627f, 4.042f)
                curveTo(8.054f, 4.005f, 6.928f, 4.248f, 6.669f, 4.082f)
                curveTo(6.411f, 3.915f, 6.318f, 3.62f, 6.3f, 4.119f)
                curveTo(6.281f, 4.617f, 6.688f, 5.042f, 6.171f, 5.079f)
                curveTo(5.654f, 5.116f, 5.598f, 4.635f, 5.247f, 4.931f)
                curveTo(4.896f, 5.226f, 4.601f, 5.891f, 4.379f, 5.725f)
                curveTo(4.158f, 5.559f, 3.844f, 5.116f, 3.936f, 5.54f)
                curveTo(4.028f, 5.965f, 4.305f, 7.035f, 5.192f, 7.054f)
                curveTo(6.078f, 7.072f, 6.263f, 6.758f, 6.3f, 7.017f)
                curveTo(6.337f, 7.275f, 6.725f, 7.312f, 6.817f, 6.98f)
                curveTo(6.909f, 6.647f, 7.667f, 7.35f, 8.073f, 6.999f)
                curveTo(8.479f, 6.649f, 8.812f, 6.353f, 8.941f, 6.15f)
                curveTo(9.07f, 5.947f, 9.513f, 5.984f, 9.938f, 5.984f)
                curveTo(10.363f, 5.984f, 10.991f, 6.168f, 10.658f, 5.762f)
                curveTo(10.326f, 5.356f, 9.753f, 5.171f, 10.086f, 4.765f)
                curveTo(10.418f, 4.359f, 13.24f, 3.008f, 13.369f, 2.86f)
                curveTo(13.498f, 2.712f, 12.671f, 2.158f, 12.284f, 2.38f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF006B49)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.456f, 8.052f)
                curveTo(6.767f, 8.052f, 7.894f, 9.511f, 7.894f, 9.511f)
                curveTo(7.913f, 9.53f, 7.93f, 9.548f, 7.946f, 9.566f)
                curveTo(7.963f, 9.548f, 7.98f, 9.53f, 7.999f, 9.511f)
                curveTo(7.999f, 9.511f, 9.313f, 8.052f, 10.624f, 8.052f)
                curveTo(11.936f, 8.052f, 9.68f, 10.176f, 8.221f, 10.176f)
                curveTo(8.221f, 10.176f, 8.071f, 10.162f, 7.946f, 10.1f)
                curveTo(7.822f, 10.162f, 7.672f, 10.176f, 7.672f, 10.176f)
                curveTo(6.213f, 10.176f, 4.145f, 8.052f, 5.456f, 8.052f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF008057),
                        1f to Color(0xFF00B77C)
                    ),
                    start = Offset(11.019f, 10.176f),
                    end = Offset(11.019f, 8.052f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.456f, 8.052f)
                curveTo(6.767f, 8.052f, 7.894f, 9.511f, 7.894f, 9.511f)
                curveTo(7.913f, 9.53f, 7.93f, 9.548f, 7.946f, 9.566f)
                curveTo(7.963f, 9.548f, 7.98f, 9.53f, 7.999f, 9.511f)
                curveTo(7.999f, 9.511f, 9.313f, 8.052f, 10.624f, 8.052f)
                curveTo(11.936f, 8.052f, 9.68f, 10.176f, 8.221f, 10.176f)
                curveTo(8.221f, 10.176f, 8.071f, 10.162f, 7.946f, 10.1f)
                curveTo(7.822f, 10.162f, 7.672f, 10.176f, 7.672f, 10.176f)
                curveTo(6.213f, 10.176f, 4.145f, 8.052f, 5.456f, 8.052f)
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
            imageVector = FlagIcons.Small.Cyprus,
            contentDescription = "Cyprus Flag"
        )
    }
}
