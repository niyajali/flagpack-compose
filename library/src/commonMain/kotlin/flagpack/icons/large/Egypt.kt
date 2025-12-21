package flagpack.icons.large

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
 * Egypt Flag (32x24dp)
 *
 * - ISO Alpha-2: EG
 * - ISO Alpha-3: EGY
 * - ISO Numeric: 818
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Egypt: ImageVector by lazy {
    ImageVector.Builder(
        name = "Egypt:EG:EGY:818:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(12.26f, 10.22f)
                lineTo(13.259f, 10.266f)
                lineTo(13.009f, 15.736f)
                lineTo(12.009f, 15.69f)
                lineTo(12.26f, 10.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(13.304f, 10.56f)
                lineTo(14.302f, 10.616f)
                lineTo(14.052f, 15.052f)
                lineTo(13.053f, 14.995f)
                lineTo(13.304f, 10.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(14.348f, 10.892f)
                lineTo(15.345f, 10.974f)
                lineTo(15.094f, 14.03f)
                lineTo(14.098f, 13.948f)
                lineTo(14.348f, 10.892f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(19.74f, 10.22f)
                lineTo(18.741f, 10.266f)
                lineTo(18.991f, 15.736f)
                lineTo(19.99f, 15.69f)
                lineTo(19.74f, 10.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(18.696f, 10.56f)
                lineTo(17.698f, 10.616f)
                lineTo(17.948f, 15.052f)
                lineTo(18.947f, 14.995f)
                lineTo(18.696f, 10.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(17.652f, 10.892f)
                lineTo(16.655f, 10.974f)
                lineTo(16.906f, 14.03f)
                lineTo(17.902f, 13.948f)
                lineTo(17.652f, 10.892f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(15.973f, 15.327f)
                lineTo(14.998f, 15.103f)
                lineTo(15.411f, 13.303f)
                lineTo(16.386f, 13.526f)
                lineTo(15.973f, 15.327f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(16.719f, 15.327f)
                lineTo(17.694f, 15.103f)
                lineTo(17.282f, 13.303f)
                lineTo(16.307f, 13.526f)
                lineTo(16.719f, 15.327f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(16.472f, 15.31f)
                horizontalLineTo(15.472f)
                verticalLineTo(13.542f)
                horizontalLineTo(16.472f)
                verticalLineTo(15.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(14.635f, 10.913f)
                lineTo(15.634f, 10.938f)
                lineTo(15.576f, 13.319f)
                lineTo(14.576f, 13.294f)
                lineTo(14.635f, 10.913f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(16.374f, 10.913f)
                lineTo(17.374f, 10.938f)
                lineTo(17.315f, 13.319f)
                lineTo(16.315f, 13.294f)
                lineTo(16.374f, 10.913f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(13.338f, 15.923f)
                lineTo(13.598f, 14.957f)
                curveTo(14.659f, 15.243f, 15.473f, 15.384f, 16.029f, 15.384f)
                curveTo(16.584f, 15.384f, 17.399f, 15.243f, 18.46f, 14.957f)
                lineTo(18.72f, 15.923f)
                curveTo(17.581f, 16.229f, 16.689f, 16.384f, 16.029f, 16.384f)
                curveTo(15.369f, 16.384f, 14.476f, 16.229f, 13.338f, 15.923f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(12.282f, 10.223f)
                curveTo(12.215f, 9.562f, 12.602f, 9.115f, 13.257f, 9.172f)
                curveTo(13.473f, 9.191f, 13.715f, 9.254f, 14.037f, 9.364f)
                curveTo(14.131f, 9.396f, 14.131f, 9.396f, 14.223f, 9.429f)
                curveTo(14.666f, 9.586f, 14.786f, 9.627f, 14.811f, 9.632f)
                curveTo(14.713f, 9.61f, 15.002f, 9.087f, 15.069f, 8.999f)
                curveTo(15.076f, 9.055f, 15.043f, 9.047f, 14.963f, 9.031f)
                lineTo(14.061f, 8.85f)
                lineTo(14.703f, 8.192f)
                curveTo(14.928f, 7.961f, 15.227f, 7.847f, 15.568f, 7.847f)
                curveTo(15.603f, 7.847f, 15.636f, 7.845f, 15.744f, 7.839f)
                curveTo(15.825f, 7.834f, 15.825f, 7.834f, 15.915f, 7.83f)
                curveTo(16.539f, 7.81f, 16.986f, 7.986f, 16.986f, 8.628f)
                curveTo(16.986f, 8.858f, 17.015f, 9.227f, 17.063f, 9.507f)
                curveTo(17.079f, 9.601f, 17.11f, 9.689f, 17.018f, 9.728f)
                curveTo(17.022f, 9.695f, 17.241f, 9.608f, 17.581f, 9.466f)
                lineTo(17.621f, 9.449f)
                curveTo(18.609f, 9.037f, 18.724f, 8.999f, 19.042f, 9.192f)
                curveTo(19.255f, 9.321f, 19.457f, 9.553f, 19.683f, 9.899f)
                lineTo(18.846f, 10.446f)
                curveTo(18.7f, 10.223f, 18.584f, 10.088f, 18.529f, 10.05f)
                curveTo(18.654f, 10.138f, 18.231f, 10.278f, 18.007f, 10.372f)
                lineTo(17.966f, 10.389f)
                curveTo(17.198f, 10.71f, 17.096f, 10.749f, 16.876f, 10.749f)
                curveTo(16.278f, 10.749f, 16.063f, 10.136f, 16.005f, 9.258f)
                curveTo(15.82f, 9.866f, 15.269f, 10.633f, 14.816f, 10.633f)
                curveTo(14.617f, 10.633f, 14.712f, 10.664f, 13.888f, 10.371f)
                curveTo(13.801f, 10.34f, 13.801f, 10.34f, 13.716f, 10.311f)
                curveTo(13.466f, 10.226f, 13.286f, 10.179f, 13.172f, 10.168f)
                curveTo(13.177f, 10.163f, 13.193f, 10.145f, 13.212f, 10.129f)
                lineTo(12.282f, 10.223f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EgyptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Egypt,
            contentDescription = "Egypt Flag"
        )
    }
}
