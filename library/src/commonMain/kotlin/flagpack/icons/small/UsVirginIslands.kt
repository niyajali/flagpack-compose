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
 * US Virgin Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: VI
 * - ISO Alpha-3: VIR
 * - ISO Numeric: 850
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.UsVirginIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "US Virgin Islands:VI:VIR:850:Small",
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
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.574f, 2.964f)
                curveTo(8.574f, 3.056f, 8.995f, 4.353f, 8.995f, 4.353f)
                horizontalLineTo(6.951f)
                lineTo(7.525f, 3.231f)
                curveTo(7.525f, 3.231f, 7.609f, 3.017f, 7.404f, 2.964f)
                curveTo(7.198f, 2.909f, 6.951f, 3.142f, 6.951f, 3.142f)
                curveTo(6.951f, 3.142f, 7.011f, 2.77f, 7.092f, 2.689f)
                curveTo(7.173f, 2.608f, 7.644f, 2.402f, 8.038f, 2.402f)
                curveTo(8.431f, 2.402f, 8.574f, 2.871f, 8.574f, 2.964f)
                close()
                moveTo(1.389f, 2.435f)
                curveTo(1.545f, 2.367f, 3.139f, 2.842f, 4.333f, 3.198f)
                lineTo(4.333f, 3.198f)
                lineTo(4.333f, 3.198f)
                lineTo(4.333f, 3.198f)
                curveTo(5.019f, 3.403f, 5.574f, 3.568f, 5.646f, 3.568f)
                curveTo(5.846f, 3.568f, 6.666f, 4.411f, 6.666f, 4.411f)
                verticalLineTo(6.297f)
                curveTo(6.666f, 6.297f, 4.077f, 5.76f, 1.636f, 3.112f)
                curveTo(1.278f, 2.757f, 1.142f, 2.541f, 1.389f, 2.435f)
                close()
                moveTo(6.422f, 6.416f)
                curveTo(6.422f, 6.416f, 6.15f, 6.603f, 5.85f, 7.104f)
                curveTo(5.702f, 7.35f, 5.69f, 7.567f, 5.682f, 7.724f)
                curveTo(5.673f, 7.887f, 5.667f, 7.985f, 5.52f, 7.985f)
                curveTo(5.347f, 7.985f, 5.222f, 8.022f, 5.12f, 8.052f)
                curveTo(5.05f, 8.073f, 4.991f, 8.091f, 4.935f, 8.091f)
                curveTo(4.798f, 8.091f, 4.535f, 8.608f, 4.666f, 8.728f)
                curveTo(4.798f, 8.848f, 5.349f, 9.039f, 5.349f, 8.728f)
                curveTo(5.349f, 8.417f, 5.498f, 8.241f, 5.767f, 8.241f)
                curveTo(6.037f, 8.241f, 6.518f, 8.062f, 6.518f, 7.671f)
                curveTo(6.518f, 7.28f, 7.043f, 7.307f, 7.043f, 7.307f)
                lineTo(6.422f, 6.416f)
                close()
                moveTo(11.781f, 3.198f)
                curveTo(12.974f, 2.842f, 14.568f, 2.367f, 14.725f, 2.435f)
                curveTo(14.972f, 2.541f, 14.836f, 2.757f, 14.478f, 3.112f)
                curveTo(13.519f, 4.827f, 9.448f, 6.297f, 9.448f, 6.297f)
                verticalLineTo(4.411f)
                curveTo(9.448f, 4.411f, 10.268f, 3.568f, 10.467f, 3.568f)
                curveTo(10.54f, 3.568f, 11.094f, 3.403f, 11.781f, 3.198f)
                lineTo(11.781f, 3.198f)
                lineTo(11.781f, 3.198f)
                lineTo(11.781f, 3.198f)
                close()
                moveTo(9.692f, 6.416f)
                curveTo(9.692f, 6.416f, 9.963f, 6.603f, 10.264f, 7.104f)
                curveTo(10.411f, 7.35f, 10.423f, 7.567f, 10.432f, 7.724f)
                curveTo(10.441f, 7.887f, 10.446f, 7.985f, 10.594f, 7.985f)
                curveTo(10.767f, 7.985f, 10.892f, 8.022f, 10.994f, 8.052f)
                curveTo(11.064f, 8.073f, 11.123f, 8.091f, 11.179f, 8.091f)
                curveTo(11.316f, 8.091f, 11.579f, 8.608f, 11.447f, 8.728f)
                curveTo(11.316f, 8.848f, 10.764f, 9.039f, 10.764f, 8.728f)
                curveTo(10.764f, 8.417f, 10.616f, 8.241f, 10.346f, 8.241f)
                curveTo(10.077f, 8.241f, 9.595f, 8.062f, 9.595f, 7.671f)
                curveTo(9.595f, 7.28f, 9.07f, 7.307f, 9.07f, 7.307f)
                lineTo(9.692f, 6.416f)
                close()
                moveTo(6.254f, 8.501f)
                curveTo(6.254f, 8.33f, 7.075f, 7.419f, 7.075f, 7.419f)
                lineTo(7.993f, 7.032f)
                curveTo(7.993f, 7.032f, 7.997f, 7.119f, 8.004f, 7.264f)
                curveTo(8.011f, 7.119f, 8.016f, 7.032f, 8.016f, 7.032f)
                lineTo(8.933f, 7.419f)
                curveTo(8.933f, 7.419f, 9.754f, 8.33f, 9.754f, 8.501f)
                curveTo(9.754f, 8.672f, 8.18f, 10.066f, 8.016f, 10.066f)
                curveTo(8.012f, 10.066f, 8.008f, 10.064f, 8.004f, 10.06f)
                curveTo(8.001f, 10.064f, 7.997f, 10.066f, 7.993f, 10.066f)
                curveTo(7.829f, 10.066f, 6.254f, 8.672f, 6.254f, 8.501f)
                close()
            }
            path(fill = SolidColor(Color(0xFF46A000))) {
                moveTo(3.123f, 5.496f)
                lineTo(4.072f, 5.18f)
                curveTo(4.713f, 7.107f, 5.332f, 8.352f, 5.887f, 8.89f)
                lineTo(5.191f, 9.609f)
                curveTo(4.488f, 8.928f, 3.812f, 7.565f, 3.123f, 5.496f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0093E1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.346f, 5.169f)
                horizontalLineTo(13.277f)
                curveTo(13.277f, 5.169f, 13.504f, 5.169f, 13.529f, 5.388f)
                curveTo(13.529f, 5.388f, 13.534f, 7.235f, 13.529f, 7.38f)
                curveTo(13.523f, 7.525f, 13.277f, 7.575f, 13.277f, 7.575f)
                curveTo(13.277f, 7.575f, 14.574f, 7.579f, 14.346f, 7.575f)
                curveTo(14.118f, 7.571f, 14.068f, 7.38f, 14.068f, 7.38f)
                verticalLineTo(5.388f)
                curveTo(14.068f, 5.22f, 14.346f, 5.169f, 14.346f, 5.169f)
                close()
                moveTo(2.283f, 7.427f)
                curveTo(2.162f, 7.114f, 1.415f, 5.202f, 1.415f, 5.202f)
                horizontalLineTo(2.154f)
                curveTo(2.026f, 5.202f, 1.978f, 5.366f, 1.978f, 5.366f)
                lineTo(2.496f, 6.842f)
                curveTo(2.496f, 6.842f, 2.997f, 5.637f, 2.997f, 5.423f)
                curveTo(2.997f, 5.209f, 2.787f, 5.202f, 2.787f, 5.202f)
                horizontalLineTo(3.75f)
                lineTo(3.518f, 5.28f)
                curveTo(3.518f, 5.28f, 2.746f, 7.048f, 2.746f, 7.427f)
                curveTo(2.71f, 7.511f, 3.101f, 7.566f, 3.101f, 7.566f)
                horizontalLineTo(2.066f)
                lineTo(2.283f, 7.427f)
                close()
                moveTo(11.133f, 6.728f)
                lineTo(11.706f, 5.673f)
                lineTo(11.723f, 6.847f)
                lineTo(11.545f, 6.79f)
                lineTo(11.42f, 7.574f)
                lineTo(12.053f, 6.359f)
                lineTo(11.842f, 6.28f)
                lineTo(12.626f, 5.431f)
                lineTo(12.359f, 6.578f)
                lineTo(12.207f, 6.444f)
                lineTo(11.309f, 8.12f)
                lineTo(12.312f, 6.972f)
                lineTo(12.118f, 6.875f)
                lineTo(13.109f, 6.227f)
                lineTo(12.678f, 7.283f)
                lineTo(12.437f, 7.11f)
                lineTo(11.42f, 8.391f)
                lineTo(10.998f, 8.229f)
                lineTo(11.42f, 6.728f)
                horizontalLineTo(11.133f)
                close()
                moveTo(10.802f, 8.73f)
                horizontalLineTo(10.486f)
                verticalLineTo(8.971f)
                horizontalLineTo(10.236f)
                lineTo(9.53f, 9.79f)
                horizontalLineTo(9.92f)
                lineTo(10.055f, 10.251f)
                lineTo(10.236f, 10.089f)
                verticalLineTo(10.251f)
                lineTo(10.59f, 10.089f)
                lineTo(10.929f, 10.382f)
                lineTo(11.181f, 9.255f)
                lineTo(11.011f, 9.13f)
                lineTo(11.099f, 9.054f)
                lineTo(11.011f, 8.73f)
                horizontalLineTo(10.802f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.172f, 4.006f)
                curveTo(6.172f, 4.006f, 6.637f, 4.328f, 7.102f, 4.328f)
                curveTo(7.568f, 4.328f, 8.033f, 4.006f, 8.033f, 4.006f)
                curveTo(8.033f, 4.006f, 8.498f, 4.328f, 8.964f, 4.328f)
                curveTo(9.429f, 4.328f, 9.894f, 4.006f, 9.894f, 4.006f)
                verticalLineTo(5.457f)
                curveTo(9.894f, 6.957f, 8.033f, 8.119f, 8.033f, 8.119f)
                curveTo(8.033f, 8.119f, 6.082f, 7.052f, 6.172f, 5.439f)
                verticalLineTo(4.006f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6.172f, 4.006f)
                curveTo(6.172f, 4.006f, 6.637f, 4.328f, 7.102f, 4.328f)
                curveTo(7.568f, 4.328f, 8.033f, 4.006f, 8.033f, 4.006f)
                curveTo(8.033f, 4.006f, 8.498f, 4.328f, 8.964f, 4.328f)
                curveTo(9.429f, 4.328f, 9.894f, 4.006f, 9.894f, 4.006f)
                verticalLineTo(5.457f)
                curveTo(9.894f, 6.957f, 8.033f, 8.119f, 8.033f, 8.119f)
                curveTo(8.033f, 8.119f, 6.082f, 7.052f, 6.172f, 5.439f)
                verticalLineTo(4.006f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.04f, 3.91f)
                horizontalLineTo(9.96f)
                verticalLineTo(5.42f)
                horizontalLineTo(6.04f)
                verticalLineTo(3.91f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.798f, 5.42f)
                horizontalLineTo(6.468f)
                verticalLineTo(8.472f)
                horizontalLineTo(6.798f)
                verticalLineTo(5.42f)
                close()
                moveTo(7.358f, 5.42f)
                horizontalLineTo(7.028f)
                verticalLineTo(8.472f)
                horizontalLineTo(7.358f)
                verticalLineTo(5.42f)
                close()
                moveTo(7.588f, 5.42f)
                horizontalLineTo(7.918f)
                verticalLineTo(8.472f)
                horizontalLineTo(7.588f)
                verticalLineTo(5.42f)
                close()
                moveTo(8.478f, 5.42f)
                horizontalLineTo(8.148f)
                verticalLineTo(8.472f)
                horizontalLineTo(8.478f)
                verticalLineTo(5.42f)
                close()
                moveTo(8.708f, 5.42f)
                horizontalLineTo(9.038f)
                verticalLineTo(8.472f)
                horizontalLineTo(8.708f)
                verticalLineTo(5.42f)
                close()
                moveTo(9.598f, 5.42f)
                horizontalLineTo(9.268f)
                verticalLineTo(8.472f)
                horizontalLineTo(9.598f)
                verticalLineTo(5.42f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UsVirginIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.UsVirginIslands,
            contentDescription = "US Virgin Islands Flag"
        )
    }
}
