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
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(6.298f, 3.998f)
                horizontalLineToRelative(7.125f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-7.125f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.703125f
            ) {
                moveTo(6.658f, 5.6f)
                horizontalLineTo(12.988f)
                curveTo(12.999f, 6.081f, 13.002f, 6.919f, 13.002f, 7.726f)
                curveTo(13.002f, 8.247f, 13f, 8.749f, 12.999f, 9.12f)
                lineTo(12.997f, 9.566f)
                lineTo(12.997f, 9.69f)
                lineTo(12.997f, 9.707f)
                lineTo(12.996f, 9.709f)
                curveTo(12.993f, 9.726f, 12.989f, 9.752f, 12.981f, 9.787f)
                curveTo(12.967f, 9.855f, 12.943f, 9.956f, 12.904f, 10.079f)
                curveTo(12.827f, 10.325f, 12.694f, 10.651f, 12.472f, 10.974f)
                curveTo(12.038f, 11.608f, 11.25f, 12.26f, 9.781f, 12.26f)
                curveTo(8.314f, 12.26f, 7.564f, 11.609f, 7.165f, 10.981f)
                curveTo(6.96f, 10.659f, 6.843f, 10.334f, 6.778f, 10.089f)
                curveTo(6.745f, 9.966f, 6.726f, 9.865f, 6.715f, 9.797f)
                curveTo(6.709f, 9.762f, 6.706f, 9.736f, 6.704f, 9.72f)
                lineTo(6.702f, 9.709f)
                lineTo(6.702f, 9.681f)
                lineTo(6.701f, 9.559f)
                lineTo(6.695f, 9.116f)
                curveTo(6.691f, 8.747f, 6.685f, 8.247f, 6.679f, 7.728f)
                curveTo(6.67f, 6.934f, 6.661f, 6.096f, 6.658f, 5.6f)
                close()
                moveTo(6.701f, 9.699f)
                curveTo(6.701f, 9.699f, 6.701f, 9.699f, 6.701f, 9.699f)
                lineTo(6.701f, 9.699f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6.658f, 5.6f)
                horizontalLineTo(12.988f)
                curveTo(12.999f, 6.081f, 13.002f, 6.919f, 13.002f, 7.726f)
                curveTo(13.002f, 8.247f, 13f, 8.749f, 12.999f, 9.12f)
                lineTo(12.997f, 9.566f)
                lineTo(12.997f, 9.69f)
                lineTo(12.997f, 9.707f)
                lineTo(12.996f, 9.709f)
                curveTo(12.993f, 9.726f, 12.989f, 9.752f, 12.981f, 9.787f)
                curveTo(12.967f, 9.855f, 12.943f, 9.956f, 12.904f, 10.079f)
                curveTo(12.827f, 10.325f, 12.694f, 10.651f, 12.472f, 10.974f)
                curveTo(12.038f, 11.608f, 11.25f, 12.26f, 9.781f, 12.26f)
                curveTo(8.314f, 12.26f, 7.564f, 11.609f, 7.165f, 10.981f)
                curveTo(6.96f, 10.659f, 6.843f, 10.334f, 6.778f, 10.089f)
                curveTo(6.745f, 9.966f, 6.726f, 9.865f, 6.715f, 9.797f)
                curveTo(6.709f, 9.762f, 6.706f, 9.736f, 6.704f, 9.72f)
                lineTo(6.702f, 9.709f)
                lineTo(6.702f, 9.681f)
                lineTo(6.701f, 9.559f)
                lineTo(6.695f, 9.116f)
                curveTo(6.691f, 8.747f, 6.685f, 8.247f, 6.679f, 7.728f)
                curveTo(6.67f, 6.934f, 6.661f, 6.096f, 6.658f, 5.6f)
                close()
                moveTo(6.701f, 9.699f)
                curveTo(6.701f, 9.699f, 6.701f, 9.699f, 6.701f, 9.699f)
                lineTo(6.701f, 9.699f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.562f, 5.65f)
                horizontalLineTo(7.88f)
                verticalLineTo(6.989f)
                horizontalLineTo(6.562f)
                verticalLineTo(5.65f)
                close()
                moveTo(9.198f, 6.989f)
                horizontalLineTo(7.88f)
                verticalLineTo(8.327f)
                horizontalLineTo(6.562f)
                verticalLineTo(9.666f)
                lineTo(7.88f, 9.666f)
                verticalLineTo(11.005f)
                horizontalLineTo(6.562f)
                verticalLineTo(12.343f)
                horizontalLineTo(7.88f)
                verticalLineTo(11.005f)
                horizontalLineTo(9.198f)
                verticalLineTo(12.343f)
                horizontalLineTo(10.517f)
                verticalLineTo(11.005f)
                horizontalLineTo(11.835f)
                verticalLineTo(12.343f)
                horizontalLineTo(13.153f)
                verticalLineTo(11.005f)
                horizontalLineTo(11.835f)
                verticalLineTo(9.666f)
                lineTo(13.153f, 9.666f)
                verticalLineTo(8.327f)
                horizontalLineTo(11.835f)
                verticalLineTo(6.989f)
                horizontalLineTo(13.153f)
                verticalLineTo(5.65f)
                horizontalLineTo(11.835f)
                verticalLineTo(6.989f)
                horizontalLineTo(10.517f)
                verticalLineTo(5.65f)
                horizontalLineTo(9.198f)
                verticalLineTo(6.989f)
                close()
                moveTo(9.198f, 8.327f)
                verticalLineTo(6.989f)
                horizontalLineTo(10.517f)
                verticalLineTo(8.327f)
                horizontalLineTo(9.198f)
                close()
                moveTo(9.198f, 9.666f)
                verticalLineTo(8.327f)
                horizontalLineTo(7.88f)
                verticalLineTo(9.666f)
                horizontalLineTo(9.198f)
                close()
                moveTo(10.517f, 9.666f)
                verticalLineTo(11.005f)
                horizontalLineTo(9.198f)
                verticalLineTo(9.666f)
                horizontalLineTo(10.517f)
                close()
                moveTo(10.517f, 9.666f)
                verticalLineTo(8.327f)
                horizontalLineTo(11.835f)
                verticalLineTo(9.666f)
                horizontalLineTo(10.517f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.533f, 5.102f)
            curveTo(6.533f, 5.102f, 6.941f, 4.884f, 7.289f, 4.772f)
            curveTo(7.637f, 4.659f, 7.911f, 4.598f, 7.911f, 4.598f)
            lineTo(7.394f, 2.69f)
            lineTo(6.358f, 2.303f)
            lineTo(5.771f, 3.271f)
            lineTo(6.533f, 5.102f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(6.363f, 4.057f)
            lineTo(6.482f, 3.999f)
            curveTo(6.605f, 4.262f, 6.767f, 4.344f, 6.99f, 4.261f)
            curveTo(7.217f, 4.176f, 7.309f, 4.016f, 7.276f, 3.762f)
            lineTo(7.407f, 3.745f)
            curveTo(7.448f, 4.06f, 7.321f, 4.28f, 7.035f, 4.386f)
            curveTo(6.745f, 4.495f, 6.514f, 4.379f, 6.363f, 4.057f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.645f, 3.464f)
            lineTo(6.531f, 3.533f)
            curveTo(6.506f, 3.548f, 6.475f, 3.526f, 6.481f, 3.497f)
            lineTo(6.506f, 3.366f)
            lineTo(6.39f, 3.302f)
            curveTo(6.364f, 3.288f, 6.367f, 3.25f, 6.395f, 3.241f)
            lineTo(6.521f, 3.198f)
            lineTo(6.518f, 3.065f)
            curveTo(6.518f, 3.035f, 6.552f, 3.019f, 6.575f, 3.038f)
            lineTo(6.675f, 3.126f)
            lineTo(6.789f, 3.057f)
            curveTo(6.814f, 3.042f, 6.845f, 3.064f, 6.839f, 3.093f)
            lineTo(6.814f, 3.223f)
            lineTo(6.93f, 3.287f)
            curveTo(6.956f, 3.302f, 6.953f, 3.34f, 6.925f, 3.349f)
            lineTo(6.799f, 3.392f)
            lineTo(6.802f, 3.525f)
            curveTo(6.802f, 3.555f, 6.768f, 3.571f, 6.745f, 3.551f)
            lineTo(6.645f, 3.464f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.088f, 4.422f)
            curveTo(9.088f, 4.422f, 9.436f, 4.391f, 9.801f, 4.398f)
            curveTo(10.167f, 4.406f, 10.476f, 4.408f, 10.476f, 4.408f)
            lineTo(10.654f, 2.527f)
            lineTo(9.871f, 1.82f)
            lineTo(9.001f, 2.544f)
            lineTo(9.088f, 4.422f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.844f, 4.116f)
            curveTo(10.145f, 4.116f, 10.174f, 3.79f, 10.174f, 3.568f)
            curveTo(10.097f, 3.445f, 10.113f, 3.357f, 9.866f, 3.357f)
            curveTo(9.618f, 3.357f, 9.59f, 3.432f, 9.518f, 3.568f)
            curveTo(9.518f, 3.79f, 9.542f, 4.116f, 9.844f, 4.116f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.183f, 3.196f)
            curveTo(10.485f, 3.196f, 10.514f, 2.87f, 10.514f, 2.648f)
            curveTo(10.436f, 2.525f, 10.452f, 2.437f, 10.205f, 2.437f)
            curveTo(9.958f, 2.437f, 9.93f, 2.512f, 9.857f, 2.648f)
            curveTo(9.857f, 2.87f, 9.882f, 3.196f, 10.183f, 3.196f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.524f, 3.196f)
            curveTo(9.825f, 3.196f, 9.854f, 2.87f, 9.854f, 2.648f)
            curveTo(9.777f, 2.525f, 9.793f, 2.437f, 9.546f, 2.437f)
            curveTo(9.299f, 2.437f, 9.27f, 2.512f, 9.198f, 2.648f)
            curveTo(9.198f, 2.87f, 9.222f, 3.196f, 9.524f, 3.196f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(7.643f, 4.627f)
            lineTo(7.715f, 4.871f)
            lineTo(7.958f, 4.794f)
            lineTo(7.958f, 4.794f)
            lineTo(7.958f, 4.794f)
            lineTo(7.958f, 4.794f)
            lineTo(7.959f, 4.794f)
            lineTo(7.962f, 4.793f)
            lineTo(7.974f, 4.789f)
            lineTo(8.021f, 4.775f)
            curveTo(8.062f, 4.763f, 8.118f, 4.746f, 8.181f, 4.729f)
            curveTo(8.311f, 4.693f, 8.46f, 4.657f, 8.564f, 4.642f)
            curveTo(8.676f, 4.627f, 8.818f, 4.615f, 8.934f, 4.607f)
            curveTo(8.992f, 4.603f, 9.043f, 4.601f, 9.078f, 4.599f)
            lineTo(9.12f, 4.597f)
            lineTo(9.131f, 4.596f)
            lineTo(9.134f, 4.596f)
            lineTo(9.135f, 4.596f)
            lineTo(9.135f, 4.596f)
            horizontalLineTo(9.135f)
            lineTo(9.135f, 4.596f)
            lineTo(9.135f, 4.596f)
            lineTo(9.396f, 4.585f)
            lineTo(9.374f, 4.325f)
            lineTo(9.216f, 2.497f)
            lineTo(9.206f, 2.382f)
            lineTo(9.112f, 2.315f)
            lineTo(8.26f, 1.71f)
            lineTo(8.085f, 1.585f)
            lineTo(7.935f, 1.74f)
            lineTo(7.161f, 2.543f)
            lineTo(7.06f, 2.647f)
            lineTo(7.101f, 2.787f)
            lineTo(7.643f, 4.627f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(7.643f, 4.627f)
                lineTo(7.715f, 4.871f)
                lineTo(7.958f, 4.794f)
                lineTo(7.958f, 4.794f)
                lineTo(7.958f, 4.794f)
                lineTo(7.958f, 4.794f)
                lineTo(7.959f, 4.794f)
                lineTo(7.962f, 4.793f)
                lineTo(7.974f, 4.789f)
                lineTo(8.021f, 4.775f)
                curveTo(8.062f, 4.763f, 8.118f, 4.746f, 8.181f, 4.729f)
                curveTo(8.311f, 4.693f, 8.46f, 4.657f, 8.564f, 4.642f)
                curveTo(8.676f, 4.627f, 8.818f, 4.615f, 8.934f, 4.607f)
                curveTo(8.992f, 4.603f, 9.043f, 4.601f, 9.078f, 4.599f)
                lineTo(9.12f, 4.597f)
                lineTo(9.131f, 4.596f)
                lineTo(9.134f, 4.596f)
                lineTo(9.135f, 4.596f)
                lineTo(9.135f, 4.596f)
                horizontalLineTo(9.135f)
                lineTo(9.135f, 4.596f)
                lineTo(9.135f, 4.596f)
                lineTo(9.396f, 4.585f)
                lineTo(9.374f, 4.325f)
                lineTo(9.216f, 2.497f)
                lineTo(9.206f, 2.382f)
                lineTo(9.112f, 2.315f)
                lineTo(8.26f, 1.71f)
                lineTo(8.085f, 1.585f)
                lineTo(7.935f, 1.74f)
                lineTo(7.161f, 2.543f)
                lineTo(7.06f, 2.647f)
                lineTo(7.101f, 2.787f)
                lineTo(7.643f, 4.627f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(7.773f, 4.149f)
                lineTo(7.616f, 3.78f)
                curveTo(7.952f, 3.633f, 8.52f, 3.542f, 9.118f, 3.507f)
                lineTo(9.141f, 3.908f)
                curveTo(8.586f, 3.941f, 8.06f, 4.023f, 7.773f, 4.149f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(7.509f, 3.257f)
                lineTo(7.352f, 2.888f)
                curveTo(7.688f, 2.741f, 8.411f, 2.621f, 9.009f, 2.586f)
                lineTo(9.032f, 2.987f)
                curveTo(8.476f, 3.02f, 7.796f, 3.131f, 7.509f, 3.257f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(11.988f, 4.621f)
            lineTo(11.92f, 4.873f)
            lineTo(11.672f, 4.794f)
            lineTo(11.672f, 4.794f)
            lineTo(11.672f, 4.794f)
            lineTo(11.672f, 4.794f)
            lineTo(11.671f, 4.794f)
            lineTo(11.668f, 4.793f)
            lineTo(11.655f, 4.789f)
            lineTo(11.608f, 4.775f)
            curveTo(11.568f, 4.763f, 11.512f, 4.746f, 11.449f, 4.729f)
            curveTo(11.318f, 4.693f, 11.17f, 4.657f, 11.066f, 4.642f)
            curveTo(10.954f, 4.627f, 10.812f, 4.615f, 10.695f, 4.607f)
            curveTo(10.637f, 4.603f, 10.587f, 4.601f, 10.551f, 4.599f)
            lineTo(10.509f, 4.597f)
            lineTo(10.498f, 4.596f)
            lineTo(10.496f, 4.596f)
            lineTo(10.495f, 4.596f)
            lineTo(10.495f, 4.596f)
            horizontalLineTo(10.495f)
            lineTo(10.495f, 4.596f)
            lineTo(10.495f, 4.596f)
            lineTo(10.234f, 4.585f)
            lineTo(10.256f, 4.325f)
            lineTo(10.414f, 2.497f)
            lineTo(10.424f, 2.382f)
            lineTo(10.518f, 2.315f)
            lineTo(11.37f, 1.71f)
            lineTo(11.55f, 1.582f)
            lineTo(11.699f, 1.745f)
            lineTo(12.429f, 2.545f)
            lineTo(12.521f, 2.646f)
            lineTo(12.486f, 2.778f)
            lineTo(11.988f, 4.621f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(11.988f, 4.621f)
                lineTo(11.92f, 4.873f)
                lineTo(11.672f, 4.794f)
                lineTo(11.672f, 4.794f)
                lineTo(11.672f, 4.794f)
                lineTo(11.672f, 4.794f)
                lineTo(11.671f, 4.794f)
                lineTo(11.668f, 4.793f)
                lineTo(11.655f, 4.789f)
                lineTo(11.608f, 4.775f)
                curveTo(11.568f, 4.763f, 11.512f, 4.746f, 11.449f, 4.729f)
                curveTo(11.318f, 4.693f, 11.17f, 4.657f, 11.066f, 4.642f)
                curveTo(10.954f, 4.627f, 10.812f, 4.615f, 10.695f, 4.607f)
                curveTo(10.637f, 4.603f, 10.587f, 4.601f, 10.551f, 4.599f)
                lineTo(10.509f, 4.597f)
                lineTo(10.498f, 4.596f)
                lineTo(10.496f, 4.596f)
                lineTo(10.495f, 4.596f)
                lineTo(10.495f, 4.596f)
                horizontalLineTo(10.495f)
                lineTo(10.495f, 4.596f)
                lineTo(10.495f, 4.596f)
                lineTo(10.234f, 4.585f)
                lineTo(10.256f, 4.325f)
                lineTo(10.414f, 2.497f)
                lineTo(10.424f, 2.382f)
                lineTo(10.518f, 2.315f)
                lineTo(11.37f, 1.71f)
                lineTo(11.55f, 1.582f)
                lineTo(11.699f, 1.745f)
                lineTo(12.429f, 2.545f)
                lineTo(12.521f, 2.646f)
                lineTo(12.486f, 2.778f)
                lineTo(11.988f, 4.621f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.499f, 4.042f)
                curveTo(11.499f, 4.042f, 11.682f, 3.939f, 11.709f, 3.767f)
                curveTo(11.735f, 3.594f, 12.019f, 3.382f, 11.877f, 3.407f)
                curveTo(11.735f, 3.433f, 11.817f, 3.452f, 11.611f, 3.407f)
                curveTo(11.405f, 3.362f, 11.139f, 3.333f, 11.139f, 3.206f)
                curveTo(11.139f, 3.08f, 11.271f, 2.979f, 11.163f, 2.979f)
                curveTo(11.055f, 2.979f, 10.824f, 2.859f, 10.87f, 2.951f)
                curveTo(10.917f, 3.042f, 10.764f, 2.939f, 10.84f, 3.129f)
                curveTo(10.917f, 3.319f, 10.824f, 3.51f, 10.87f, 3.561f)
                curveTo(10.917f, 3.611f, 10.84f, 3.858f, 10.84f, 3.858f)
                curveTo(10.84f, 3.858f, 10.868f, 3.95f, 10.917f, 3.812f)
                curveTo(10.967f, 3.675f, 11.074f, 3.579f, 11.02f, 3.696f)
                curveTo(10.967f, 3.812f, 10.898f, 4.09f, 10.959f, 4.042f)
                curveTo(11.02f, 3.993f, 11.081f, 3.858f, 11.081f, 3.812f)
                curveTo(11.081f, 3.767f, 11.236f, 3.588f, 11.236f, 3.723f)
                curveTo(11.236f, 3.858f, 11.09f, 3.964f, 11.163f, 3.964f)
                curveTo(11.236f, 3.964f, 11.276f, 3.993f, 11.322f, 3.858f)
                curveTo(11.368f, 3.723f, 11.479f, 3.634f, 11.524f, 3.723f)
                curveTo(11.569f, 3.812f, 11.559f, 3.808f, 11.499f, 3.925f)
                curveTo(11.438f, 4.042f, 11.499f, 4.042f, 11.499f, 4.042f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.067f, 3.042f)
                lineTo(10.999f, 2.927f)
                curveTo(11.121f, 2.851f, 11.234f, 2.831f, 11.333f, 2.874f)
                curveTo(11.378f, 2.893f, 11.412f, 2.915f, 11.5f, 2.977f)
                lineTo(11.512f, 2.985f)
                curveTo(11.604f, 3.049f, 11.653f, 3.076f, 11.683f, 3.076f)
                verticalLineTo(3.209f)
                curveTo(11.614f, 3.209f, 11.555f, 3.177f, 11.437f, 3.095f)
                lineTo(11.425f, 3.087f)
                curveTo(11.346f, 3.031f, 11.315f, 3.011f, 11.282f, 2.997f)
                curveTo(11.227f, 2.974f, 11.157f, 2.986f, 11.067f, 3.042f)
                close()
                moveTo(10.851f, 3.915f)
                curveTo(10.889f, 3.915f, 10.921f, 3.884f, 10.921f, 3.845f)
                curveTo(10.921f, 3.807f, 10.889f, 3.776f, 10.851f, 3.776f)
                curveTo(10.812f, 3.776f, 10.78f, 3.807f, 10.78f, 3.845f)
                curveTo(10.78f, 3.884f, 10.812f, 3.915f, 10.851f, 3.915f)
                close()
                moveTo(11.053f, 3.979f)
                curveTo(11.053f, 4.017f, 11.021f, 4.049f, 10.982f, 4.049f)
                curveTo(10.944f, 4.049f, 10.912f, 4.017f, 10.912f, 3.979f)
                curveTo(10.912f, 3.941f, 10.944f, 3.91f, 10.982f, 3.91f)
                curveTo(11.021f, 3.91f, 11.053f, 3.941f, 11.053f, 3.979f)
                close()
                moveTo(11.219f, 4.043f)
                curveTo(11.258f, 4.043f, 11.29f, 4.012f, 11.29f, 3.974f)
                curveTo(11.29f, 3.936f, 11.258f, 3.904f, 11.219f, 3.904f)
                curveTo(11.18f, 3.904f, 11.149f, 3.936f, 11.149f, 3.974f)
                curveTo(11.149f, 4.012f, 11.18f, 4.043f, 11.219f, 4.043f)
                close()
                moveTo(11.51f, 4.085f)
                curveTo(11.51f, 4.123f, 11.478f, 4.155f, 11.439f, 4.155f)
                curveTo(11.401f, 4.155f, 11.369f, 4.123f, 11.369f, 4.085f)
                curveTo(11.369f, 4.047f, 11.401f, 4.016f, 11.439f, 4.016f)
                curveTo(11.478f, 4.016f, 11.51f, 4.047f, 11.51f, 4.085f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(13.431f, 5.154f)
            lineTo(13.323f, 5.402f)
            lineTo(13.084f, 5.275f)
            lineTo(13.084f, 5.275f)
            lineTo(13.084f, 5.275f)
            lineTo(13.084f, 5.275f)
            lineTo(13.084f, 5.275f)
            lineTo(13.083f, 5.274f)
            lineTo(13.08f, 5.273f)
            lineTo(13.068f, 5.266f)
            curveTo(13.057f, 5.26f, 13.04f, 5.252f, 13.02f, 5.241f)
            curveTo(12.978f, 5.22f, 12.918f, 5.19f, 12.848f, 5.157f)
            curveTo(12.706f, 5.09f, 12.528f, 5.013f, 12.37f, 4.962f)
            curveTo(12.201f, 4.908f, 12.05f, 4.865f, 11.941f, 4.837f)
            curveTo(11.887f, 4.823f, 11.843f, 4.812f, 11.814f, 4.805f)
            lineTo(11.78f, 4.797f)
            lineTo(11.771f, 4.795f)
            lineTo(11.77f, 4.794f)
            lineTo(11.769f, 4.794f)
            lineTo(11.769f, 4.794f)
            lineTo(11.769f, 4.794f)
            lineTo(11.769f, 4.794f)
            lineTo(11.769f, 4.794f)
            lineTo(11.511f, 4.737f)
            lineTo(11.583f, 4.482f)
            lineTo(12.112f, 2.622f)
            lineTo(12.146f, 2.501f)
            lineTo(12.265f, 2.456f)
            lineTo(13.301f, 2.069f)
            lineTo(13.495f, 1.997f)
            lineTo(13.603f, 2.174f)
            lineTo(14.19f, 3.141f)
            lineTo(14.257f, 3.252f)
            lineTo(14.205f, 3.37f)
            lineTo(13.431f, 5.154f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(13.431f, 5.154f)
                lineTo(13.323f, 5.402f)
                lineTo(13.084f, 5.275f)
                lineTo(13.084f, 5.275f)
                lineTo(13.084f, 5.275f)
                lineTo(13.084f, 5.275f)
                lineTo(13.084f, 5.275f)
                lineTo(13.083f, 5.274f)
                lineTo(13.08f, 5.273f)
                lineTo(13.068f, 5.266f)
                curveTo(13.057f, 5.26f, 13.04f, 5.252f, 13.02f, 5.241f)
                curveTo(12.978f, 5.22f, 12.918f, 5.19f, 12.848f, 5.157f)
                curveTo(12.706f, 5.09f, 12.528f, 5.013f, 12.37f, 4.962f)
                curveTo(12.201f, 4.908f, 12.05f, 4.865f, 11.941f, 4.837f)
                curveTo(11.887f, 4.823f, 11.843f, 4.812f, 11.814f, 4.805f)
                lineTo(11.78f, 4.797f)
                lineTo(11.771f, 4.795f)
                lineTo(11.77f, 4.794f)
                lineTo(11.769f, 4.794f)
                lineTo(11.769f, 4.794f)
                lineTo(11.769f, 4.794f)
                lineTo(11.769f, 4.794f)
                lineTo(11.769f, 4.794f)
                lineTo(11.511f, 4.737f)
                lineTo(11.583f, 4.482f)
                lineTo(12.112f, 2.622f)
                lineTo(12.146f, 2.501f)
                lineTo(12.265f, 2.456f)
                lineTo(13.301f, 2.069f)
                lineTo(13.495f, 1.997f)
                lineTo(13.603f, 2.174f)
                lineTo(14.19f, 3.141f)
                lineTo(14.257f, 3.252f)
                lineTo(14.205f, 3.37f)
                lineTo(13.431f, 5.154f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.205f, 3.181f)
                lineTo(13.116f, 3.28f)
                curveTo(13.096f, 3.302f, 13.06f, 3.29f, 13.057f, 3.261f)
                lineTo(13.043f, 3.128f)
                lineTo(12.913f, 3.101f)
                curveTo(12.884f, 3.095f, 12.876f, 3.058f, 12.9f, 3.04f)
                lineTo(13.008f, 2.963f)
                lineTo(12.967f, 2.836f)
                curveTo(12.958f, 2.808f, 12.986f, 2.783f, 13.013f, 2.795f)
                lineTo(13.134f, 2.849f)
                lineTo(13.223f, 2.75f)
                curveTo(13.243f, 2.728f, 13.279f, 2.74f, 13.282f, 2.769f)
                lineTo(13.295f, 2.902f)
                lineTo(13.426f, 2.929f)
                curveTo(13.455f, 2.935f, 13.462f, 2.972f, 13.439f, 2.989f)
                lineTo(13.331f, 3.067f)
                lineTo(13.372f, 3.194f)
                curveTo(13.381f, 3.222f, 13.353f, 3.247f, 13.326f, 3.235f)
                lineTo(13.205f, 3.181f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(11.872f, 4.055f)
                lineTo(12.005f, 3.537f)
                curveTo(12.593f, 3.692f, 13.206f, 3.891f, 13.655f, 4.083f)
                lineTo(13.45f, 4.577f)
                curveTo(13.026f, 4.395f, 12.437f, 4.204f, 11.872f, 4.055f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.052f, 3.576f)
                lineTo(12.083f, 3.446f)
                curveTo(12.647f, 3.586f, 13.246f, 3.809f, 13.682f, 4.017f)
                lineTo(13.625f, 4.138f)
                curveTo(13.198f, 3.934f, 12.608f, 3.714f, 12.052f, 3.576f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(11.885f, 4.11f)
                lineTo(11.916f, 3.98f)
                curveTo(12.48f, 4.12f, 13.001f, 4.31f, 13.436f, 4.518f)
                lineTo(13.38f, 4.639f)
                curveTo(12.953f, 4.435f, 12.44f, 4.248f, 11.885f, 4.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(12.139f, 3.859f)
                lineTo(12.26f, 3.805f)
                curveTo(12.311f, 3.924f, 12.374f, 3.95f, 12.479f, 3.899f)
                curveTo(12.726f, 3.779f, 13.341f, 3.947f, 13.341f, 4.174f)
                curveTo(13.341f, 4.262f, 13.29f, 4.316f, 13.212f, 4.313f)
                curveTo(13.167f, 4.311f, 13.12f, 4.294f, 13.051f, 4.259f)
                curveTo(13.042f, 4.255f, 13.037f, 4.252f, 13.023f, 4.246f)
                curveTo(12.947f, 4.207f, 12.941f, 4.204f, 12.921f, 4.196f)
                lineTo(12.964f, 4.068f)
                curveTo(12.992f, 4.079f, 12.997f, 4.081f, 13.082f, 4.124f)
                curveTo(13.095f, 4.131f, 13.1f, 4.133f, 13.108f, 4.137f)
                curveTo(13.161f, 4.163f, 13.196f, 4.177f, 13.217f, 4.177f)
                curveTo(13.218f, 4.177f, 13.209f, 4.187f, 13.209f, 4.174f)
                curveTo(13.209f, 4.074f, 12.709f, 3.937f, 12.535f, 4.022f)
                curveTo(12.361f, 4.106f, 12.219f, 4.047f, 12.139f, 3.859f)
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
