package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Croatia Flag (20x15dp)
 *
 * - ISO Alpha-2: HR
 * - ISO Alpha-3: HRV
 * - ISO Numeric: 191
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Croatia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Croatia:HR:HRV:191:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.658f, 3.598f)
                horizontalLineToRelative(6.33f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-6.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.2f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.658f, 5.2f)
                lineTo(12.988f, 5.2f)
                curveTo(12.999f, 5.681f, 13.002f, 6.519f, 13.002f, 7.326f)
                curveTo(13.002f, 7.847f, 13f, 8.349f, 12.999f, 8.72f)
                lineTo(12.997f, 9.166f)
                lineTo(12.997f, 9.29f)
                lineTo(12.997f, 9.307f)
                lineTo(12.996f, 9.309f)
                curveTo(12.993f, 9.326f, 12.989f, 9.352f, 12.981f, 9.387f)
                curveTo(12.967f, 9.455f, 12.943f, 9.556f, 12.904f, 9.679f)
                curveTo(12.827f, 9.925f, 12.694f, 10.251f, 12.472f, 10.574f)
                curveTo(12.038f, 11.208f, 11.25f, 11.86f, 9.781f, 11.86f)
                curveTo(8.314f, 11.86f, 7.564f, 11.209f, 7.165f, 10.581f)
                curveTo(6.96f, 10.259f, 6.843f, 9.934f, 6.778f, 9.689f)
                curveTo(6.745f, 9.566f, 6.726f, 9.465f, 6.715f, 9.397f)
                curveTo(6.709f, 9.362f, 6.706f, 9.336f, 6.704f, 9.32f)
                lineTo(6.702f, 9.309f)
                lineTo(6.702f, 9.281f)
                lineTo(6.701f, 9.159f)
                lineTo(6.695f, 8.716f)
                curveTo(6.691f, 8.347f, 6.685f, 7.847f, 6.679f, 7.328f)
                curveTo(6.67f, 6.534f, 6.661f, 5.696f, 6.658f, 5.2f)
                close()
                moveTo(6.701f, 9.299f)
                curveTo(6.701f, 9.299f, 6.701f, 9.299f, 6.701f, 9.299f)
                lineTo(6.701f, 9.299f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6.658f, 5.2f)
                lineTo(12.988f, 5.2f)
                curveTo(12.999f, 5.681f, 13.002f, 6.519f, 13.002f, 7.326f)
                curveTo(13.002f, 7.847f, 13f, 8.349f, 12.999f, 8.72f)
                lineTo(12.997f, 9.166f)
                lineTo(12.997f, 9.29f)
                lineTo(12.997f, 9.307f)
                lineTo(12.996f, 9.309f)
                curveTo(12.993f, 9.326f, 12.989f, 9.352f, 12.981f, 9.387f)
                curveTo(12.967f, 9.455f, 12.943f, 9.556f, 12.904f, 9.679f)
                curveTo(12.827f, 9.925f, 12.694f, 10.251f, 12.472f, 10.574f)
                curveTo(12.038f, 11.208f, 11.25f, 11.86f, 9.781f, 11.86f)
                curveTo(8.314f, 11.86f, 7.564f, 11.209f, 7.165f, 10.581f)
                curveTo(6.96f, 10.259f, 6.843f, 9.934f, 6.778f, 9.689f)
                curveTo(6.745f, 9.566f, 6.726f, 9.465f, 6.715f, 9.397f)
                curveTo(6.709f, 9.362f, 6.706f, 9.336f, 6.704f, 9.32f)
                lineTo(6.702f, 9.309f)
                lineTo(6.702f, 9.281f)
                lineTo(6.701f, 9.159f)
                lineTo(6.695f, 8.716f)
                curveTo(6.691f, 8.347f, 6.685f, 7.847f, 6.679f, 7.328f)
                curveTo(6.67f, 6.534f, 6.661f, 5.696f, 6.658f, 5.2f)
                close()
                moveTo(6.701f, 9.299f)
                curveTo(6.701f, 9.299f, 6.701f, 9.299f, 6.701f, 9.299f)
                lineTo(6.701f, 9.299f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.562f, 5.25f)
                lineTo(7.88f, 5.25f)
                lineTo(7.88f, 6.589f)
                lineTo(6.562f, 6.589f)
                lineTo(6.562f, 5.25f)
                close()
                moveTo(9.198f, 6.589f)
                lineTo(7.88f, 6.589f)
                lineTo(7.88f, 7.927f)
                lineTo(6.562f, 7.927f)
                lineTo(6.562f, 9.266f)
                lineTo(7.88f, 9.266f)
                lineTo(7.88f, 10.605f)
                lineTo(6.562f, 10.605f)
                lineTo(6.562f, 11.943f)
                lineTo(7.88f, 11.943f)
                lineTo(7.88f, 10.605f)
                lineTo(9.198f, 10.605f)
                lineTo(9.198f, 11.943f)
                lineTo(10.517f, 11.943f)
                lineTo(10.517f, 10.605f)
                lineTo(11.835f, 10.605f)
                lineTo(11.835f, 11.943f)
                lineTo(13.153f, 11.943f)
                lineTo(13.153f, 10.605f)
                lineTo(11.835f, 10.605f)
                lineTo(11.835f, 9.266f)
                lineTo(13.153f, 9.266f)
                lineTo(13.153f, 7.927f)
                lineTo(11.835f, 7.927f)
                lineTo(11.835f, 6.589f)
                lineTo(13.153f, 6.589f)
                lineTo(13.153f, 5.25f)
                lineTo(11.835f, 5.25f)
                lineTo(11.835f, 6.589f)
                lineTo(10.517f, 6.589f)
                lineTo(10.517f, 5.25f)
                lineTo(9.198f, 5.25f)
                lineTo(9.198f, 6.589f)
                close()
                moveTo(9.198f, 7.927f)
                lineTo(9.198f, 6.589f)
                lineTo(10.517f, 6.589f)
                lineTo(10.517f, 7.927f)
                lineTo(9.198f, 7.927f)
                close()
                moveTo(9.198f, 9.266f)
                lineTo(9.198f, 7.927f)
                lineTo(7.88f, 7.927f)
                lineTo(7.88f, 9.266f)
                lineTo(9.198f, 9.266f)
                close()
                moveTo(10.517f, 9.266f)
                lineTo(10.517f, 10.605f)
                lineTo(9.198f, 10.605f)
                lineTo(9.198f, 9.266f)
                lineTo(10.517f, 9.266f)
                close()
                moveTo(10.517f, 9.266f)
                lineTo(10.517f, 7.927f)
                lineTo(11.835f, 7.927f)
                lineTo(11.835f, 9.266f)
                lineTo(10.517f, 9.266f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.1f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.553f, 5.202f)
            curveTo(6.553f, 5.202f, 6.934f, 4.969f, 7.259f, 4.849f)
            curveTo(7.584f, 4.728f, 7.841f, 4.663f, 7.841f, 4.663f)
            lineTo(7.357f, 2.618f)
            lineTo(6.389f, 2.203f)
            lineTo(5.841f, 3.24f)
            lineTo(6.553f, 5.202f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(6.395f, 4.082f)
            lineTo(6.506f, 4.021f)
            curveTo(6.621f, 4.303f, 6.772f, 4.39f, 6.98f, 4.301f)
            curveTo(7.192f, 4.21f, 7.278f, 4.038f, 7.248f, 3.766f)
            lineTo(7.37f, 3.748f)
            curveTo(7.408f, 4.086f, 7.289f, 4.321f, 7.022f, 4.436f)
            curveTo(6.751f, 4.552f, 6.535f, 4.428f, 6.395f, 4.082f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.658f, 3.446f)
            lineTo(6.552f, 3.52f)
            curveTo(6.528f, 3.537f, 6.499f, 3.513f, 6.504f, 3.482f)
            lineTo(6.529f, 3.342f)
            lineTo(6.42f, 3.274f)
            curveTo(6.395f, 3.258f, 6.399f, 3.218f, 6.425f, 3.207f)
            lineTo(6.542f, 3.161f)
            lineTo(6.54f, 3.019f)
            curveTo(6.539f, 2.987f, 6.571f, 2.97f, 6.592f, 2.991f)
            lineTo(6.686f, 3.085f)
            lineTo(6.792f, 3.011f)
            curveTo(6.816f, 2.994f, 6.845f, 3.018f, 6.84f, 3.049f)
            lineTo(6.815f, 3.189f)
            lineTo(6.924f, 3.258f)
            curveTo(6.948f, 3.273f, 6.945f, 3.314f, 6.919f, 3.324f)
            lineTo(6.802f, 3.37f)
            lineTo(6.804f, 3.512f)
            curveTo(6.805f, 3.544f, 6.772f, 3.561f, 6.752f, 3.541f)
            lineTo(6.658f, 3.446f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.107f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.088f, 4.45f)
            curveTo(9.088f, 4.45f, 9.436f, 4.415f, 9.801f, 4.423f)
            curveTo(10.167f, 4.431f, 10.476f, 4.434f, 10.476f, 4.434f)
            lineTo(10.654f, 2.265f)
            lineTo(9.871f, 1.45f)
            lineTo(9.001f, 2.285f)
            lineTo(9.088f, 4.45f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.844f, 4.097f)
            curveTo(10.145f, 4.097f, 10.174f, 3.721f, 10.174f, 3.466f)
            curveTo(10.097f, 3.324f, 10.113f, 3.222f, 9.866f, 3.222f)
            curveTo(9.618f, 3.222f, 9.59f, 3.308f, 9.518f, 3.466f)
            curveTo(9.518f, 3.721f, 9.542f, 4.097f, 9.844f, 4.097f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.183f, 3.036f)
            curveTo(10.485f, 3.036f, 10.514f, 2.661f, 10.514f, 2.405f)
            curveTo(10.436f, 2.263f, 10.452f, 2.161f, 10.205f, 2.161f)
            curveTo(9.958f, 2.161f, 9.93f, 2.248f, 9.857f, 2.405f)
            curveTo(9.857f, 2.661f, 9.882f, 3.036f, 10.183f, 3.036f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 3.036f)
            curveTo(9.825f, 3.036f, 9.854f, 2.661f, 9.854f, 2.405f)
            curveTo(9.777f, 2.263f, 9.793f, 2.161f, 9.546f, 2.161f)
            curveTo(9.299f, 2.161f, 9.27f, 2.248f, 9.198f, 2.405f)
            curveTo(9.198f, 2.661f, 9.222f, 3.036f, 9.524f, 3.036f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.084f
        ) {
            moveTo(7.772f, 4.505f)
            lineTo(7.828f, 4.728f)
            lineTo(8.017f, 4.658f)
            lineTo(8.018f, 4.658f)
            lineTo(8.018f, 4.658f)
            lineTo(8.018f, 4.658f)
            lineTo(8.018f, 4.658f)
            lineTo(8.021f, 4.657f)
            lineTo(8.03f, 4.653f)
            lineTo(8.067f, 4.64f)
            curveTo(8.098f, 4.629f, 8.142f, 4.614f, 8.192f, 4.598f)
            curveTo(8.293f, 4.566f, 8.409f, 4.532f, 8.49f, 4.519f)
            curveTo(8.577f, 4.505f, 8.688f, 4.494f, 8.779f, 4.487f)
            curveTo(8.824f, 4.484f, 8.863f, 4.481f, 8.891f, 4.48f)
            lineTo(8.924f, 4.478f)
            lineTo(8.933f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(8.935f, 4.477f)
            lineTo(9.139f, 4.467f)
            lineTo(9.122f, 4.229f)
            lineTo(8.999f, 2.561f)
            lineTo(8.991f, 2.455f)
            lineTo(8.917f, 2.394f)
            lineTo(8.253f, 1.842f)
            lineTo(8.116f, 1.728f)
            lineTo(8f, 1.87f)
            lineTo(7.396f, 2.602f)
            lineTo(7.317f, 2.698f)
            lineTo(7.349f, 2.825f)
            lineTo(7.772f, 4.505f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(7.772f, 4.505f)
                lineTo(7.828f, 4.728f)
                lineTo(8.017f, 4.658f)
                lineTo(8.018f, 4.658f)
                lineTo(8.018f, 4.658f)
                lineTo(8.018f, 4.658f)
                lineTo(8.018f, 4.658f)
                lineTo(8.021f, 4.657f)
                lineTo(8.03f, 4.653f)
                lineTo(8.067f, 4.64f)
                curveTo(8.098f, 4.629f, 8.142f, 4.614f, 8.192f, 4.598f)
                curveTo(8.293f, 4.566f, 8.409f, 4.532f, 8.49f, 4.519f)
                curveTo(8.577f, 4.505f, 8.688f, 4.494f, 8.779f, 4.487f)
                curveTo(8.824f, 4.484f, 8.863f, 4.481f, 8.891f, 4.48f)
                lineTo(8.924f, 4.478f)
                lineTo(8.933f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(8.935f, 4.477f)
                lineTo(9.139f, 4.467f)
                lineTo(9.122f, 4.229f)
                lineTo(8.999f, 2.561f)
                lineTo(8.991f, 2.455f)
                lineTo(8.917f, 2.394f)
                lineTo(8.253f, 1.842f)
                lineTo(8.116f, 1.728f)
                lineTo(8f, 1.87f)
                lineTo(7.396f, 2.602f)
                lineTo(7.317f, 2.698f)
                lineTo(7.349f, 2.825f)
                lineTo(7.772f, 4.505f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(7.873f, 4.069f)
                lineTo(7.751f, 3.732f)
                curveTo(8.013f, 3.597f, 8.456f, 3.515f, 8.922f, 3.483f)
                lineTo(8.94f, 3.849f)
                curveTo(8.507f, 3.879f, 8.097f, 3.954f, 7.873f, 4.069f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(7.667f, 3.254f)
                lineTo(7.545f, 2.917f)
                curveTo(7.807f, 2.783f, 8.371f, 2.674f, 8.837f, 2.642f)
                lineTo(8.855f, 3.008f)
                curveTo(8.421f, 3.038f, 7.891f, 3.139f, 7.667f, 3.254f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.085f
        ) {
            moveTo(11.866f, 4.497f)
            lineTo(11.812f, 4.727f)
            lineTo(11.613f, 4.655f)
            lineTo(11.613f, 4.655f)
            lineTo(11.613f, 4.655f)
            lineTo(11.613f, 4.655f)
            lineTo(11.612f, 4.655f)
            lineTo(11.61f, 4.654f)
            lineTo(11.6f, 4.65f)
            lineTo(11.562f, 4.637f)
            curveTo(11.53f, 4.626f, 11.485f, 4.611f, 11.434f, 4.595f)
            curveTo(11.33f, 4.563f, 11.212f, 4.529f, 11.129f, 4.516f)
            curveTo(11.039f, 4.502f, 10.925f, 4.491f, 10.832f, 4.484f)
            curveTo(10.786f, 4.481f, 10.745f, 4.478f, 10.717f, 4.477f)
            lineTo(10.683f, 4.475f)
            lineTo(10.674f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.672f, 4.474f)
            lineTo(10.463f, 4.464f)
            lineTo(10.48f, 4.227f)
            lineTo(10.607f, 2.562f)
            lineTo(10.615f, 2.457f)
            lineTo(10.69f, 2.396f)
            lineTo(11.371f, 1.845f)
            lineTo(11.516f, 1.728f)
            lineTo(11.635f, 1.877f)
            lineTo(12.219f, 2.605f)
            lineTo(12.293f, 2.698f)
            lineTo(12.264f, 2.818f)
            lineTo(11.866f, 4.497f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(11.866f, 4.497f)
                lineTo(11.812f, 4.727f)
                lineTo(11.613f, 4.655f)
                lineTo(11.613f, 4.655f)
                lineTo(11.613f, 4.655f)
                lineTo(11.613f, 4.655f)
                lineTo(11.612f, 4.655f)
                lineTo(11.61f, 4.654f)
                lineTo(11.6f, 4.65f)
                lineTo(11.562f, 4.637f)
                curveTo(11.53f, 4.626f, 11.485f, 4.611f, 11.434f, 4.595f)
                curveTo(11.33f, 4.563f, 11.212f, 4.529f, 11.129f, 4.516f)
                curveTo(11.039f, 4.502f, 10.925f, 4.491f, 10.832f, 4.484f)
                curveTo(10.786f, 4.481f, 10.745f, 4.478f, 10.717f, 4.477f)
                lineTo(10.683f, 4.475f)
                lineTo(10.674f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.672f, 4.474f)
                lineTo(10.463f, 4.464f)
                lineTo(10.48f, 4.227f)
                lineTo(10.607f, 2.562f)
                lineTo(10.615f, 2.457f)
                lineTo(10.69f, 2.396f)
                lineTo(11.371f, 1.845f)
                lineTo(11.516f, 1.728f)
                lineTo(11.635f, 1.877f)
                lineTo(12.219f, 2.605f)
                lineTo(12.293f, 2.698f)
                lineTo(12.264f, 2.818f)
                lineTo(11.866f, 4.497f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.474f, 3.969f)
                curveTo(11.474f, 3.969f, 11.622f, 3.876f, 11.643f, 3.719f)
                curveTo(11.664f, 3.562f, 11.891f, 3.368f, 11.778f, 3.391f)
                curveTo(11.664f, 3.414f, 11.729f, 3.432f, 11.564f, 3.391f)
                curveTo(11.4f, 3.35f, 11.187f, 3.323f, 11.187f, 3.208f)
                curveTo(11.187f, 3.093f, 11.292f, 3.001f, 11.206f, 3.001f)
                curveTo(11.119f, 3.001f, 10.935f, 2.892f, 10.972f, 2.976f)
                curveTo(11.009f, 3.059f, 10.886f, 2.965f, 10.948f, 3.138f)
                curveTo(11.009f, 3.311f, 10.935f, 3.485f, 10.972f, 3.531f)
                curveTo(11.009f, 3.577f, 10.948f, 3.802f, 10.948f, 3.802f)
                curveTo(10.948f, 3.802f, 10.97f, 3.885f, 11.009f, 3.76f)
                curveTo(11.049f, 3.635f, 11.135f, 3.547f, 11.092f, 3.654f)
                curveTo(11.049f, 3.76f, 10.994f, 4.013f, 11.043f, 3.969f)
                curveTo(11.092f, 3.925f, 11.14f, 3.802f, 11.14f, 3.76f)
                curveTo(11.14f, 3.719f, 11.264f, 3.556f, 11.264f, 3.679f)
                curveTo(11.264f, 3.802f, 11.148f, 3.899f, 11.206f, 3.899f)
                curveTo(11.264f, 3.899f, 11.297f, 3.925f, 11.333f, 3.802f)
                curveTo(11.37f, 3.679f, 11.458f, 3.598f, 11.495f, 3.679f)
                curveTo(11.531f, 3.76f, 11.523f, 3.756f, 11.474f, 3.862f)
                curveTo(11.426f, 3.969f, 11.474f, 3.969f, 11.474f, 3.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.129f, 3.058f)
                lineTo(11.074f, 2.954f)
                curveTo(11.173f, 2.885f, 11.263f, 2.867f, 11.342f, 2.905f)
                curveTo(11.378f, 2.922f, 11.405f, 2.942f, 11.476f, 2.999f)
                lineTo(11.485f, 3.006f)
                curveTo(11.559f, 3.065f, 11.598f, 3.089f, 11.622f, 3.089f)
                lineTo(11.622f, 3.211f)
                curveTo(11.567f, 3.211f, 11.519f, 3.182f, 11.425f, 3.107f)
                lineTo(11.416f, 3.099f)
                curveTo(11.352f, 3.048f, 11.328f, 3.03f, 11.301f, 3.017f)
                curveTo(11.257f, 2.996f, 11.201f, 3.008f, 11.129f, 3.058f)
                close()
                moveTo(10.956f, 3.853f)
                curveTo(10.987f, 3.853f, 11.012f, 3.825f, 11.012f, 3.79f)
                curveTo(11.012f, 3.755f, 10.987f, 3.727f, 10.956f, 3.727f)
                curveTo(10.925f, 3.727f, 10.9f, 3.755f, 10.9f, 3.79f)
                curveTo(10.9f, 3.825f, 10.925f, 3.853f, 10.956f, 3.853f)
                close()
                moveTo(11.118f, 3.912f)
                curveTo(11.118f, 3.947f, 11.093f, 3.975f, 11.062f, 3.975f)
                curveTo(11.03f, 3.975f, 11.005f, 3.947f, 11.005f, 3.912f)
                curveTo(11.005f, 3.877f, 11.03f, 3.849f, 11.062f, 3.849f)
                curveTo(11.093f, 3.849f, 11.118f, 3.877f, 11.118f, 3.912f)
                close()
                moveTo(11.251f, 3.971f)
                curveTo(11.282f, 3.971f, 11.307f, 3.942f, 11.307f, 3.907f)
                curveTo(11.307f, 3.873f, 11.282f, 3.844f, 11.251f, 3.844f)
                curveTo(11.22f, 3.844f, 11.195f, 3.873f, 11.195f, 3.907f)
                curveTo(11.195f, 3.942f, 11.22f, 3.971f, 11.251f, 3.971f)
                close()
                moveTo(11.483f, 4.009f)
                curveTo(11.483f, 4.044f, 11.458f, 4.072f, 11.427f, 4.072f)
                curveTo(11.396f, 4.072f, 11.371f, 4.044f, 11.371f, 4.009f)
                curveTo(11.371f, 3.974f, 11.396f, 3.945f, 11.427f, 3.945f)
                curveTo(11.458f, 3.945f, 11.483f, 3.974f, 11.483f, 4.009f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.08f
        ) {
            moveTo(13.282f, 5.08f)
            lineTo(13.204f, 5.3f)
            lineTo(13.03f, 5.187f)
            lineTo(13.03f, 5.187f)
            lineTo(13.03f, 5.187f)
            lineTo(13.03f, 5.187f)
            lineTo(13.03f, 5.187f)
            lineTo(13.029f, 5.187f)
            lineTo(13.027f, 5.185f)
            lineTo(13.018f, 5.18f)
            curveTo(13.01f, 5.174f, 12.998f, 5.167f, 12.983f, 5.158f)
            curveTo(12.952f, 5.139f, 12.909f, 5.113f, 12.858f, 5.084f)
            curveTo(12.755f, 5.025f, 12.625f, 4.957f, 12.51f, 4.912f)
            curveTo(12.387f, 4.864f, 12.277f, 4.827f, 12.198f, 4.802f)
            curveTo(12.158f, 4.789f, 12.126f, 4.78f, 12.105f, 4.773f)
            lineTo(12.08f, 4.766f)
            lineTo(12.074f, 4.764f)
            lineTo(12.073f, 4.764f)
            lineTo(12.072f, 4.764f)
            lineTo(12.072f, 4.764f)
            lineTo(12.072f, 4.764f)
            lineTo(12.072f, 4.764f)
            lineTo(12.072f, 4.764f)
            lineTo(11.884f, 4.713f)
            lineTo(11.937f, 4.489f)
            lineTo(12.322f, 2.85f)
            lineTo(12.347f, 2.743f)
            lineTo(12.433f, 2.704f)
            lineTo(13.188f, 2.363f)
            lineTo(13.329f, 2.299f)
            lineTo(13.407f, 2.455f)
            lineTo(13.834f, 3.307f)
            lineTo(13.883f, 3.405f)
            lineTo(13.846f, 3.509f)
            lineTo(13.282f, 5.08f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(13.282f, 5.08f)
                lineTo(13.204f, 5.3f)
                lineTo(13.03f, 5.187f)
                lineTo(13.03f, 5.187f)
                lineTo(13.03f, 5.187f)
                lineTo(13.03f, 5.187f)
                lineTo(13.03f, 5.187f)
                lineTo(13.029f, 5.187f)
                lineTo(13.027f, 5.185f)
                lineTo(13.018f, 5.18f)
                curveTo(13.01f, 5.174f, 12.998f, 5.167f, 12.983f, 5.158f)
                curveTo(12.952f, 5.139f, 12.909f, 5.113f, 12.858f, 5.084f)
                curveTo(12.755f, 5.025f, 12.625f, 4.957f, 12.51f, 4.912f)
                curveTo(12.387f, 4.864f, 12.277f, 4.827f, 12.198f, 4.802f)
                curveTo(12.158f, 4.789f, 12.126f, 4.78f, 12.105f, 4.773f)
                lineTo(12.08f, 4.766f)
                lineTo(12.074f, 4.764f)
                lineTo(12.073f, 4.764f)
                lineTo(12.072f, 4.764f)
                lineTo(12.072f, 4.764f)
                lineTo(12.072f, 4.764f)
                lineTo(12.072f, 4.764f)
                lineTo(12.072f, 4.764f)
                lineTo(11.884f, 4.713f)
                lineTo(11.937f, 4.489f)
                lineTo(12.322f, 2.85f)
                lineTo(12.347f, 2.743f)
                lineTo(12.433f, 2.704f)
                lineTo(13.188f, 2.363f)
                lineTo(13.329f, 2.299f)
                lineTo(13.407f, 2.455f)
                lineTo(13.834f, 3.307f)
                lineTo(13.883f, 3.405f)
                lineTo(13.846f, 3.509f)
                lineTo(13.282f, 5.08f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.117f, 3.342f)
                lineTo(13.053f, 3.43f)
                curveTo(13.039f, 3.449f, 13.012f, 3.439f, 13.01f, 3.413f)
                lineTo(13f, 3.296f)
                lineTo(12.905f, 3.272f)
                curveTo(12.884f, 3.267f, 12.878f, 3.234f, 12.896f, 3.219f)
                lineTo(12.974f, 3.15f)
                lineTo(12.944f, 3.039f)
                curveTo(12.938f, 3.014f, 12.958f, 2.992f, 12.978f, 3.002f)
                lineTo(13.066f, 3.05f)
                lineTo(13.131f, 2.963f)
                curveTo(13.145f, 2.944f, 13.171f, 2.954f, 13.174f, 2.98f)
                lineTo(13.183f, 3.096f)
                lineTo(13.278f, 3.12f)
                curveTo(13.299f, 3.126f, 13.305f, 3.159f, 13.288f, 3.174f)
                lineTo(13.209f, 3.243f)
                lineTo(13.239f, 3.354f)
                curveTo(13.246f, 3.379f, 13.225f, 3.401f, 13.206f, 3.39f)
                lineTo(13.117f, 3.342f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(12.147f, 4.112f)
                lineTo(12.244f, 3.656f)
                curveTo(12.672f, 3.793f, 13.118f, 3.968f, 13.446f, 4.138f)
                lineTo(13.296f, 4.572f)
                curveTo(12.987f, 4.412f, 12.558f, 4.244f, 12.147f, 4.112f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.278f, 3.691f)
                lineTo(12.301f, 3.576f)
                curveTo(12.711f, 3.7f, 13.148f, 3.896f, 13.465f, 4.079f)
                lineTo(13.424f, 4.186f)
                curveTo(13.113f, 4.006f, 12.683f, 3.812f, 12.278f, 3.691f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.157f, 4.161f)
                lineTo(12.179f, 4.047f)
                curveTo(12.59f, 4.17f, 12.969f, 4.337f, 13.286f, 4.52f)
                lineTo(13.245f, 4.627f)
                curveTo(12.934f, 4.448f, 12.561f, 4.283f, 12.157f, 4.161f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(12.342f, 3.94f)
                lineTo(12.43f, 3.892f)
                curveTo(12.467f, 3.997f, 12.512f, 4.02f, 12.589f, 3.975f)
                curveTo(12.769f, 3.869f, 13.217f, 4.017f, 13.217f, 4.217f)
                curveTo(13.217f, 4.295f, 13.179f, 4.343f, 13.122f, 4.34f)
                curveTo(13.09f, 4.338f, 13.056f, 4.323f, 13.005f, 4.293f)
                curveTo(12.999f, 4.289f, 12.995f, 4.287f, 12.985f, 4.281f)
                curveTo(12.93f, 4.246f, 12.925f, 4.244f, 12.911f, 4.237f)
                lineTo(12.942f, 4.124f)
                curveTo(12.963f, 4.133f, 12.966f, 4.135f, 13.028f, 4.174f)
                curveTo(13.038f, 4.179f, 13.041f, 4.182f, 13.047f, 4.185f)
                curveTo(13.086f, 4.208f, 13.111f, 4.22f, 13.126f, 4.22f)
                curveTo(13.127f, 4.221f, 13.121f, 4.229f, 13.121f, 4.217f)
                curveTo(13.121f, 4.129f, 12.757f, 4.009f, 12.63f, 4.083f)
                curveTo(12.503f, 4.158f, 12.4f, 4.105f, 12.342f, 3.94f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CroatiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Croatia,
            contentDescription = "Croatia Flag"
        )
    }
}
