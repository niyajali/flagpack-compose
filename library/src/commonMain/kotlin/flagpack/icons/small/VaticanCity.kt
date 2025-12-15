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
 * Vatican City Flag (16x12dp)
 *
 * - ISO Alpha-2: VA
 * - ISO Alpha-3: VAT
 * - ISO Numeric: 336
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.VaticanCity: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vatican City:VA:VAT:336:Small",
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
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(11.391f, 6.376f)
                lineTo(11.218f, 6.387f)
                curveTo(11.259f, 6.98f, 11.387f, 7.438f, 11.603f, 7.761f)
                curveTo(11.952f, 8.282f, 12.412f, 8.685f, 12.719f, 8.685f)
                curveTo(12.789f, 8.685f, 12.806f, 8.711f, 12.783f, 8.775f)
                curveTo(12.75f, 8.866f, 12.646f, 8.956f, 12.513f, 8.99f)
                curveTo(12.291f, 9.048f, 11.786f, 9.077f, 11.007f, 9.077f)
                verticalLineTo(9.245f)
                curveTo(11.802f, 9.245f, 12.316f, 9.214f, 12.557f, 9.152f)
                curveTo(12.745f, 9.104f, 12.894f, 8.975f, 12.946f, 8.83f)
                curveTo(13.006f, 8.663f, 12.915f, 8.518f, 12.719f, 8.518f)
                curveTo(12.491f, 8.518f, 12.067f, 8.146f, 11.748f, 7.67f)
                curveTo(11.55f, 7.374f, 11.43f, 6.942f, 11.391f, 6.376f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAF0100))) {
                moveTo(10.573f, 6.376f)
                lineTo(10.746f, 6.387f)
                curveTo(10.705f, 6.98f, 10.578f, 7.438f, 10.361f, 7.761f)
                curveTo(10.013f, 8.282f, 9.553f, 8.685f, 9.245f, 8.685f)
                curveTo(9.175f, 8.685f, 9.159f, 8.711f, 9.182f, 8.775f)
                curveTo(9.215f, 8.866f, 9.318f, 8.956f, 9.452f, 8.99f)
                curveTo(9.674f, 9.048f, 10.178f, 9.077f, 10.957f, 9.077f)
                verticalLineTo(9.245f)
                curveTo(10.163f, 9.245f, 9.649f, 9.214f, 9.407f, 9.152f)
                curveTo(9.219f, 9.104f, 9.07f, 8.975f, 9.018f, 8.83f)
                curveTo(8.958f, 8.663f, 9.049f, 8.518f, 9.245f, 8.518f)
                curveTo(9.473f, 8.518f, 9.898f, 8.146f, 10.216f, 7.67f)
                curveTo(10.414f, 7.374f, 10.534f, 6.942f, 10.573f, 6.376f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.033f, 3.399f)
                lineTo(9.463f, 6.962f)
                curveTo(9.303f, 6.91f, 9.128f, 6.881f, 8.946f, 6.881f)
                curveTo(8.204f, 6.881f, 7.584f, 7.355f, 7.584f, 7.97f)
                curveTo(7.584f, 8.584f, 8.204f, 9.058f, 8.946f, 9.058f)
                curveTo(9.031f, 9.058f, 9.115f, 9.052f, 9.196f, 9.04f)
                curveTo(9.121f, 8.981f, 9.065f, 8.908f, 9.037f, 8.83f)
                curveTo(9.003f, 8.737f, 9.016f, 8.65f, 9.069f, 8.592f)
                curveTo(9.029f, 8.596f, 8.988f, 8.598f, 8.946f, 8.598f)
                curveTo(8.446f, 8.598f, 8.06f, 8.303f, 8.06f, 7.97f)
                curveTo(8.06f, 7.637f, 8.446f, 7.342f, 8.946f, 7.342f)
                curveTo(9.446f, 7.342f, 9.833f, 7.637f, 9.833f, 7.97f)
                curveTo(9.833f, 8.072f, 9.796f, 8.17f, 9.732f, 8.257f)
                curveTo(9.744f, 8.247f, 9.756f, 8.235f, 9.768f, 8.224f)
                curveTo(9.927f, 8.077f, 9.571f, 8.685f, 9.263f, 8.685f)
                curveTo(9.193f, 8.685f, 9.177f, 8.711f, 9.2f, 8.775f)
                curveTo(9.231f, 8.861f, 9.324f, 8.945f, 9.445f, 8.983f)
                curveTo(9.946f, 8.826f, 10.308f, 8.439f, 10.308f, 7.97f)
                curveTo(10.308f, 7.778f, 10.248f, 7.599f, 10.142f, 7.445f)
                lineTo(12.598f, 5.36f)
                lineTo(12.763f, 5.53f)
                lineTo(12.881f, 5.423f)
                lineTo(13.291f, 5.727f)
                lineTo(13.12f, 5.859f)
                lineTo(13.47f, 6.285f)
                lineTo(14.176f, 5.74f)
                lineTo(14.188f, 5.734f)
                lineTo(14.186f, 5.733f)
                lineTo(14.23f, 5.699f)
                lineTo(13.88f, 5.273f)
                lineTo(13.711f, 5.404f)
                lineTo(13.252f, 5.086f)
                lineTo(13.306f, 5.038f)
                lineTo(13.158f, 4.885f)
                lineTo(13.38f, 4.697f)
                lineTo(13.498f, 4.819f)
                lineTo(13.624f, 4.704f)
                lineTo(14.022f, 5.019f)
                lineTo(13.855f, 5.148f)
                lineTo(14.205f, 5.573f)
                lineTo(14.81f, 5.107f)
                lineTo(14.88f, 5.069f)
                lineTo(14.87f, 5.061f)
                lineTo(14.965f, 4.987f)
                lineTo(14.615f, 4.562f)
                lineTo(14.417f, 4.714f)
                lineTo(13.981f, 4.38f)
                lineTo(14.041f, 4.326f)
                lineTo(13.94f, 4.222f)
                lineTo(14.392f, 3.838f)
                lineTo(14.033f, 3.399f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBFBFBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.692f, 7.97f)
                curveTo(11.692f, 7.693f, 11.817f, 7.446f, 12.023f, 7.257f)
                lineTo(9.398f, 5.224f)
                lineTo(9.368f, 5.247f)
                lineTo(9.445f, 5.316f)
                lineTo(9.238f, 5.53f)
                lineTo(9.129f, 5.431f)
                lineTo(8.727f, 5.741f)
                lineTo(8.88f, 5.859f)
                lineTo(8.53f, 6.285f)
                lineTo(7.831f, 5.746f)
                lineTo(7.812f, 5.734f)
                lineTo(7.814f, 5.733f)
                lineTo(7.77f, 5.699f)
                lineTo(8.12f, 5.273f)
                lineTo(8.29f, 5.404f)
                lineTo(8.748f, 5.086f)
                lineTo(8.695f, 5.038f)
                lineTo(8.893f, 4.833f)
                lineTo(8.662f, 4.654f)
                lineTo(8.502f, 4.819f)
                lineTo(8.381f, 4.708f)
                lineTo(7.988f, 5.026f)
                lineTo(8.145f, 5.148f)
                lineTo(7.795f, 5.573f)
                lineTo(7.209f, 5.121f)
                lineTo(7.121f, 5.069f)
                lineTo(7.131f, 5.061f)
                lineTo(7.035f, 4.987f)
                lineTo(7.385f, 4.561f)
                lineTo(7.583f, 4.714f)
                lineTo(8.019f, 4.38f)
                lineTo(7.959f, 4.326f)
                lineTo(8.079f, 4.202f)
                lineTo(7.608f, 3.838f)
                lineTo(7.905f, 3.478f)
                lineTo(12.446f, 6.995f)
                curveTo(12.63f, 6.922f, 12.837f, 6.881f, 13.054f, 6.881f)
                curveTo(13.796f, 6.881f, 14.416f, 7.355f, 14.416f, 7.97f)
                curveTo(14.416f, 8.584f, 13.796f, 9.058f, 13.054f, 9.058f)
                curveTo(12.969f, 9.058f, 12.886f, 9.052f, 12.804f, 9.04f)
                curveTo(12.88f, 8.981f, 12.936f, 8.908f, 12.964f, 8.83f)
                curveTo(12.997f, 8.737f, 12.984f, 8.65f, 12.931f, 8.592f)
                curveTo(12.971f, 8.596f, 13.012f, 8.598f, 13.054f, 8.598f)
                curveTo(13.554f, 8.598f, 13.941f, 8.303f, 13.941f, 7.97f)
                curveTo(13.941f, 7.637f, 13.554f, 7.342f, 13.054f, 7.342f)
                curveTo(12.554f, 7.342f, 12.168f, 7.637f, 12.168f, 7.97f)
                curveTo(12.168f, 8.072f, 12.204f, 8.17f, 12.268f, 8.257f)
                curveTo(12.256f, 8.247f, 12.244f, 8.235f, 12.232f, 8.224f)
                curveTo(12.073f, 8.077f, 12.429f, 8.685f, 12.737f, 8.685f)
                curveTo(12.807f, 8.685f, 12.823f, 8.711f, 12.8f, 8.775f)
                curveTo(12.769f, 8.861f, 12.677f, 8.945f, 12.555f, 8.983f)
                curveTo(12.054f, 8.826f, 11.692f, 8.439f, 11.692f, 7.97f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.87f, 5.898f)
                curveTo(10.835f, 5.898f, 10.806f, 5.927f, 10.806f, 5.963f)
                verticalLineTo(6.233f)
                horizontalLineTo(10.566f)
                curveTo(10.531f, 6.233f, 10.503f, 6.261f, 10.503f, 6.295f)
                curveTo(10.503f, 6.33f, 10.531f, 6.358f, 10.566f, 6.358f)
                horizontalLineTo(10.806f)
                verticalLineTo(9.935f)
                curveTo(10.806f, 9.971f, 10.835f, 10f, 10.87f, 10f)
                horizontalLineTo(11f)
                curveTo(11.036f, 10f, 11.065f, 9.971f, 11.065f, 9.935f)
                verticalLineTo(6.358f)
                horizontalLineTo(11.435f)
                curveTo(11.469f, 6.358f, 11.497f, 6.33f, 11.497f, 6.295f)
                curveTo(11.497f, 6.261f, 11.469f, 6.233f, 11.435f, 6.233f)
                horizontalLineTo(11.065f)
                verticalLineTo(5.963f)
                curveTo(11.065f, 5.927f, 11.036f, 5.898f, 11f, 5.898f)
                horizontalLineTo(10.87f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.935f, 10.008f)
                curveTo(11.078f, 10.008f, 11.195f, 9.95f, 11.195f, 9.879f)
                curveTo(11.195f, 9.807f, 11.078f, 9.749f, 10.935f, 9.749f)
                curveTo(10.792f, 9.749f, 10.676f, 9.807f, 10.676f, 9.879f)
                curveTo(10.676f, 9.95f, 10.792f, 10.008f, 10.935f, 10.008f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4B300)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 2.9f)
                curveTo(10f, 2.403f, 10.403f, 2f, 10.9f, 2f)
                curveTo(11.397f, 2f, 11.8f, 2.403f, 11.8f, 2.9f)
                verticalLineTo(4.522f)
                horizontalLineTo(10f)
                lineTo(10f, 2.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.892f, 4.61f)
                curveTo(11.394f, 4.61f, 11.8f, 4.542f, 11.8f, 4.458f)
                curveTo(11.8f, 4.375f, 11.394f, 4.307f, 10.892f, 4.307f)
                curveTo(10.391f, 4.307f, 9.984f, 4.375f, 9.984f, 4.458f)
                curveTo(9.984f, 4.542f, 10.391f, 4.61f, 10.892f, 4.61f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VaticanCityPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.VaticanCity,
            contentDescription = "Vatican City Flag"
        )
    }
}
