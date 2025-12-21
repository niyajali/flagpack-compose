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
 * Croatia Flag (32x24dp)
 *
 * - ISO Alpha-2: HR
 * - ISO Alpha-3: HRV
 * - ISO Numeric: 191
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Croatia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Croatia:HR:HRV:191:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(10.076f, 6.397f)
                horizontalLineToRelative(11.4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-11.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.125f
            ) {
                moveTo(10.652f, 8.96f)
                horizontalLineTo(20.781f)
                curveTo(20.798f, 9.729f, 20.803f, 11.07f, 20.803f, 12.361f)
                curveTo(20.803f, 13.195f, 20.801f, 13.998f, 20.798f, 14.593f)
                curveTo(20.797f, 14.89f, 20.796f, 15.135f, 20.795f, 15.306f)
                lineTo(20.795f, 15.503f)
                lineTo(20.794f, 15.532f)
                curveTo(20.794f, 15.533f, 20.794f, 15.534f, 20.794f, 15.535f)
                curveTo(20.789f, 15.562f, 20.782f, 15.604f, 20.77f, 15.658f)
                curveTo(20.747f, 15.769f, 20.708f, 15.93f, 20.647f, 16.126f)
                curveTo(20.523f, 16.519f, 20.31f, 17.041f, 19.955f, 17.559f)
                curveTo(19.261f, 18.573f, 18f, 19.615f, 15.65f, 19.615f)
                curveTo(13.303f, 19.615f, 12.103f, 18.574f, 11.464f, 17.57f)
                curveTo(11.136f, 17.054f, 10.949f, 16.535f, 10.844f, 16.142f)
                curveTo(10.792f, 15.946f, 10.761f, 15.785f, 10.743f, 15.675f)
                curveTo(10.734f, 15.62f, 10.729f, 15.578f, 10.726f, 15.551f)
                curveTo(10.725f, 15.545f, 10.724f, 15.54f, 10.724f, 15.535f)
                lineTo(10.723f, 15.49f)
                lineTo(10.721f, 15.294f)
                lineTo(10.712f, 14.585f)
                curveTo(10.705f, 13.994f, 10.696f, 13.196f, 10.687f, 12.365f)
                curveTo(10.672f, 11.095f, 10.658f, 9.753f, 10.652f, 8.96f)
                close()
                moveTo(10.722f, 15.519f)
                curveTo(10.722f, 15.518f, 10.722f, 15.518f, 10.722f, 15.519f)
                lineTo(10.722f, 15.519f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10.652f, 8.96f)
                horizontalLineTo(20.781f)
                curveTo(20.798f, 9.729f, 20.803f, 11.07f, 20.803f, 12.361f)
                curveTo(20.803f, 13.195f, 20.801f, 13.998f, 20.798f, 14.593f)
                curveTo(20.797f, 14.89f, 20.796f, 15.135f, 20.795f, 15.306f)
                lineTo(20.795f, 15.503f)
                lineTo(20.794f, 15.532f)
                curveTo(20.794f, 15.533f, 20.794f, 15.534f, 20.794f, 15.535f)
                curveTo(20.789f, 15.562f, 20.782f, 15.604f, 20.77f, 15.658f)
                curveTo(20.747f, 15.769f, 20.708f, 15.93f, 20.647f, 16.126f)
                curveTo(20.523f, 16.519f, 20.31f, 17.041f, 19.955f, 17.559f)
                curveTo(19.261f, 18.573f, 18f, 19.615f, 15.65f, 19.615f)
                curveTo(13.303f, 19.615f, 12.103f, 18.574f, 11.464f, 17.57f)
                curveTo(11.136f, 17.054f, 10.949f, 16.535f, 10.844f, 16.142f)
                curveTo(10.792f, 15.946f, 10.761f, 15.785f, 10.743f, 15.675f)
                curveTo(10.734f, 15.62f, 10.729f, 15.578f, 10.726f, 15.551f)
                curveTo(10.725f, 15.545f, 10.724f, 15.54f, 10.724f, 15.535f)
                lineTo(10.723f, 15.49f)
                lineTo(10.721f, 15.294f)
                lineTo(10.712f, 14.585f)
                curveTo(10.705f, 13.994f, 10.696f, 13.196f, 10.687f, 12.365f)
                curveTo(10.672f, 11.095f, 10.658f, 9.753f, 10.652f, 8.96f)
                close()
                moveTo(10.722f, 15.519f)
                curveTo(10.722f, 15.518f, 10.722f, 15.518f, 10.722f, 15.519f)
                lineTo(10.722f, 15.519f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.498f, 9.04f)
                horizontalLineTo(12.608f)
                verticalLineTo(11.182f)
                horizontalLineTo(10.498f)
                verticalLineTo(9.04f)
                close()
                moveTo(14.717f, 11.182f)
                horizontalLineTo(12.608f)
                verticalLineTo(13.324f)
                horizontalLineTo(10.498f)
                verticalLineTo(15.466f)
                horizontalLineTo(12.608f)
                verticalLineTo(17.608f)
                horizontalLineTo(10.498f)
                verticalLineTo(19.749f)
                horizontalLineTo(12.608f)
                verticalLineTo(17.608f)
                horizontalLineTo(14.717f)
                verticalLineTo(19.749f)
                horizontalLineTo(16.826f)
                verticalLineTo(17.608f)
                horizontalLineTo(18.936f)
                verticalLineTo(19.749f)
                horizontalLineTo(21.045f)
                verticalLineTo(17.608f)
                horizontalLineTo(18.936f)
                verticalLineTo(15.466f)
                horizontalLineTo(21.045f)
                verticalLineTo(13.324f)
                horizontalLineTo(18.936f)
                verticalLineTo(11.182f)
                horizontalLineTo(21.045f)
                verticalLineTo(9.04f)
                horizontalLineTo(18.936f)
                verticalLineTo(11.182f)
                horizontalLineTo(16.826f)
                verticalLineTo(9.04f)
                horizontalLineTo(14.717f)
                verticalLineTo(11.182f)
                close()
                moveTo(14.717f, 13.324f)
                verticalLineTo(11.182f)
                horizontalLineTo(16.826f)
                verticalLineTo(13.324f)
                horizontalLineTo(14.717f)
                close()
                moveTo(14.717f, 15.466f)
                verticalLineTo(13.324f)
                horizontalLineTo(12.608f)
                verticalLineTo(15.466f)
                horizontalLineTo(14.717f)
                close()
                moveTo(16.826f, 15.466f)
                verticalLineTo(17.608f)
                horizontalLineTo(14.717f)
                verticalLineTo(15.466f)
                horizontalLineTo(16.826f)
                close()
                moveTo(16.826f, 15.466f)
                verticalLineTo(13.324f)
                horizontalLineTo(18.936f)
                verticalLineTo(15.466f)
                horizontalLineTo(16.826f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.453f, 8.163f)
            curveTo(10.453f, 8.163f, 11.106f, 7.814f, 11.662f, 7.635f)
            curveTo(12.218f, 7.455f, 12.658f, 7.357f, 12.658f, 7.357f)
            lineTo(11.83f, 4.305f)
            lineTo(10.172f, 3.685f)
            lineTo(9.233f, 5.233f)
            lineTo(10.453f, 8.163f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(10.181f, 6.491f)
            lineTo(10.372f, 6.399f)
            curveTo(10.568f, 6.82f, 10.828f, 6.95f, 11.183f, 6.817f)
            curveTo(11.547f, 6.682f, 11.694f, 6.425f, 11.642f, 6.019f)
            lineTo(11.851f, 5.991f)
            curveTo(11.916f, 6.496f, 11.713f, 6.848f, 11.256f, 7.018f)
            curveTo(10.792f, 7.192f, 10.422f, 7.006f, 10.181f, 6.491f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.632f, 5.542f)
            lineTo(10.45f, 5.652f)
            curveTo(10.41f, 5.677f, 10.36f, 5.642f, 10.369f, 5.595f)
            lineTo(10.41f, 5.386f)
            lineTo(10.224f, 5.284f)
            curveTo(10.182f, 5.261f, 10.188f, 5.2f, 10.232f, 5.185f)
            lineTo(10.434f, 5.116f)
            lineTo(10.429f, 4.903f)
            curveTo(10.428f, 4.856f, 10.484f, 4.83f, 10.519f, 4.861f)
            lineTo(10.679f, 5.002f)
            lineTo(10.862f, 4.891f)
            curveTo(10.902f, 4.867f, 10.952f, 4.902f, 10.943f, 4.948f)
            lineTo(10.902f, 5.157f)
            lineTo(11.088f, 5.26f)
            curveTo(11.13f, 5.283f, 11.124f, 5.343f, 11.08f, 5.359f)
            lineTo(10.878f, 5.427f)
            lineTo(10.882f, 5.64f)
            curveTo(10.884f, 5.687f, 10.828f, 5.713f, 10.792f, 5.682f)
            lineTo(10.632f, 5.542f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.541f, 7.076f)
            curveTo(14.541f, 7.076f, 15.097f, 7.026f, 15.682f, 7.037f)
            curveTo(16.266f, 7.049f, 16.761f, 7.053f, 16.761f, 7.053f)
            lineTo(17.046f, 4.044f)
            lineTo(15.794f, 2.912f)
            lineTo(14.402f, 4.07f)
            lineTo(14.541f, 7.076f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.75f, 6.585f)
            curveTo(16.233f, 6.585f, 16.279f, 6.064f, 16.279f, 5.709f)
            curveTo(16.155f, 5.512f, 16.18f, 5.371f, 15.785f, 5.371f)
            curveTo(15.389f, 5.371f, 15.344f, 5.491f, 15.229f, 5.709f)
            curveTo(15.229f, 6.064f, 15.268f, 6.585f, 15.75f, 6.585f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.293f, 5.113f)
            curveTo(16.775f, 5.113f, 16.822f, 4.592f, 16.822f, 4.237f)
            curveTo(16.698f, 4.04f, 16.723f, 3.899f, 16.328f, 3.899f)
            curveTo(15.932f, 3.899f, 15.887f, 4.019f, 15.772f, 4.237f)
            curveTo(15.772f, 4.592f, 15.811f, 5.113f, 16.293f, 5.113f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 5.113f)
            curveTo(15.721f, 5.113f, 15.767f, 4.592f, 15.767f, 4.237f)
            curveTo(15.644f, 4.04f, 15.668f, 3.899f, 15.273f, 3.899f)
            curveTo(14.878f, 3.899f, 14.833f, 4.019f, 14.717f, 4.237f)
            curveTo(14.717f, 4.592f, 14.756f, 5.113f, 15.238f, 5.113f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(12.445f, 7.605f)
            lineTo(12.373f, 7.36f)
            lineTo(11.506f, 4.416f)
            lineTo(11.465f, 4.277f)
            lineTo(11.566f, 4.172f)
            lineTo(12.804f, 2.888f)
            lineTo(12.954f, 2.734f)
            lineTo(13.129f, 2.858f)
            lineTo(14.492f, 3.826f)
            lineTo(14.586f, 3.893f)
            lineTo(14.596f, 4.008f)
            lineTo(14.848f, 6.933f)
            lineTo(14.871f, 7.193f)
            lineTo(14.61f, 7.204f)
            lineTo(14.61f, 7.204f)
            lineTo(14.61f, 7.204f)
            lineTo(14.609f, 7.204f)
            lineTo(14.608f, 7.204f)
            lineTo(14.604f, 7.204f)
            lineTo(14.586f, 7.205f)
            lineTo(14.518f, 7.208f)
            curveTo(14.46f, 7.211f, 14.379f, 7.216f, 14.285f, 7.222f)
            curveTo(14.097f, 7.234f, 13.866f, 7.253f, 13.681f, 7.279f)
            curveTo(13.504f, 7.304f, 13.259f, 7.364f, 13.05f, 7.422f)
            curveTo(12.947f, 7.45f, 12.856f, 7.477f, 12.791f, 7.496f)
            curveTo(12.759f, 7.506f, 12.733f, 7.514f, 12.715f, 7.52f)
            lineTo(12.694f, 7.526f)
            lineTo(12.689f, 7.527f)
            lineTo(12.688f, 7.528f)
            lineTo(12.688f, 7.528f)
            lineTo(12.688f, 7.528f)
            lineTo(12.445f, 7.605f)
            close()
            moveTo(12.445f, 7.605f)
            lineTo(12.688f, 7.528f)
            lineTo(12.445f, 7.605f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(12.445f, 7.605f)
                lineTo(12.373f, 7.36f)
                lineTo(11.506f, 4.416f)
                lineTo(11.465f, 4.277f)
                lineTo(11.566f, 4.172f)
                lineTo(12.804f, 2.888f)
                lineTo(12.954f, 2.734f)
                lineTo(13.129f, 2.858f)
                lineTo(14.492f, 3.826f)
                lineTo(14.586f, 3.893f)
                lineTo(14.596f, 4.008f)
                lineTo(14.848f, 6.933f)
                lineTo(14.871f, 7.193f)
                lineTo(14.61f, 7.204f)
                lineTo(14.61f, 7.204f)
                lineTo(14.61f, 7.204f)
                lineTo(14.609f, 7.204f)
                lineTo(14.608f, 7.204f)
                lineTo(14.604f, 7.204f)
                lineTo(14.586f, 7.205f)
                lineTo(14.518f, 7.208f)
                curveTo(14.46f, 7.211f, 14.379f, 7.216f, 14.285f, 7.222f)
                curveTo(14.097f, 7.234f, 13.866f, 7.253f, 13.681f, 7.279f)
                curveTo(13.504f, 7.304f, 13.259f, 7.364f, 13.05f, 7.422f)
                curveTo(12.947f, 7.45f, 12.856f, 7.477f, 12.791f, 7.496f)
                curveTo(12.759f, 7.506f, 12.733f, 7.514f, 12.715f, 7.52f)
                lineTo(12.694f, 7.526f)
                lineTo(12.689f, 7.527f)
                lineTo(12.688f, 7.528f)
                lineTo(12.688f, 7.528f)
                lineTo(12.688f, 7.528f)
                lineTo(12.445f, 7.605f)
                close()
                moveTo(12.445f, 7.605f)
                lineTo(12.688f, 7.528f)
                lineTo(12.445f, 7.605f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(12.436f, 6.638f)
                lineTo(12.186f, 6.048f)
                curveTo(12.724f, 5.812f, 13.633f, 5.668f, 14.589f, 5.611f)
                lineTo(14.626f, 6.253f)
                curveTo(13.737f, 6.305f, 12.896f, 6.437f, 12.436f, 6.638f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(12.014f, 5.21f)
                lineTo(11.763f, 4.62f)
                curveTo(12.301f, 4.385f, 13.458f, 4.194f, 14.414f, 4.138f)
                lineTo(14.451f, 4.779f)
                curveTo(13.562f, 4.832f, 12.473f, 5.009f, 12.014f, 5.21f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(18.969f, 7.607f)
            lineTo(19.037f, 7.355f)
            lineTo(19.832f, 4.406f)
            lineTo(19.868f, 4.274f)
            lineTo(19.776f, 4.172f)
            lineTo(18.608f, 2.893f)
            lineTo(18.459f, 2.73f)
            lineTo(18.279f, 2.858f)
            lineTo(16.916f, 3.826f)
            lineTo(16.822f, 3.893f)
            lineTo(16.812f, 4.008f)
            lineTo(16.559f, 6.933f)
            lineTo(16.537f, 7.193f)
            lineTo(16.798f, 7.204f)
            lineTo(16.798f, 7.204f)
            lineTo(16.798f, 7.204f)
            lineTo(16.798f, 7.204f)
            lineTo(16.799f, 7.204f)
            lineTo(16.804f, 7.204f)
            lineTo(16.822f, 7.205f)
            lineTo(16.89f, 7.208f)
            curveTo(16.948f, 7.211f, 17.029f, 7.216f, 17.122f, 7.222f)
            curveTo(17.31f, 7.234f, 17.541f, 7.253f, 17.727f, 7.279f)
            curveTo(17.903f, 7.304f, 18.149f, 7.364f, 18.358f, 7.422f)
            curveTo(18.46f, 7.45f, 18.551f, 7.477f, 18.617f, 7.496f)
            curveTo(18.649f, 7.506f, 18.675f, 7.514f, 18.693f, 7.52f)
            lineTo(18.713f, 7.526f)
            lineTo(18.718f, 7.527f)
            lineTo(18.72f, 7.528f)
            lineTo(18.72f, 7.528f)
            lineTo(18.72f, 7.528f)
            lineTo(18.969f, 7.607f)
            close()
            moveTo(18.969f, 7.607f)
            lineTo(18.72f, 7.528f)
            lineTo(18.969f, 7.607f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(18.969f, 7.607f)
                lineTo(19.037f, 7.355f)
                lineTo(19.832f, 4.406f)
                lineTo(19.868f, 4.274f)
                lineTo(19.776f, 4.172f)
                lineTo(18.608f, 2.893f)
                lineTo(18.459f, 2.73f)
                lineTo(18.279f, 2.858f)
                lineTo(16.916f, 3.826f)
                lineTo(16.822f, 3.893f)
                lineTo(16.812f, 4.008f)
                lineTo(16.559f, 6.933f)
                lineTo(16.537f, 7.193f)
                lineTo(16.798f, 7.204f)
                lineTo(16.798f, 7.204f)
                lineTo(16.798f, 7.204f)
                lineTo(16.798f, 7.204f)
                lineTo(16.799f, 7.204f)
                lineTo(16.804f, 7.204f)
                lineTo(16.822f, 7.205f)
                lineTo(16.89f, 7.208f)
                curveTo(16.948f, 7.211f, 17.029f, 7.216f, 17.122f, 7.222f)
                curveTo(17.31f, 7.234f, 17.541f, 7.253f, 17.727f, 7.279f)
                curveTo(17.903f, 7.304f, 18.149f, 7.364f, 18.358f, 7.422f)
                curveTo(18.46f, 7.45f, 18.551f, 7.477f, 18.617f, 7.496f)
                curveTo(18.649f, 7.506f, 18.675f, 7.514f, 18.693f, 7.52f)
                lineTo(18.713f, 7.526f)
                lineTo(18.718f, 7.527f)
                lineTo(18.72f, 7.528f)
                lineTo(18.72f, 7.528f)
                lineTo(18.72f, 7.528f)
                lineTo(18.969f, 7.607f)
                close()
                moveTo(18.969f, 7.607f)
                lineTo(18.72f, 7.528f)
                lineTo(18.969f, 7.607f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.398f, 6.466f)
                curveTo(18.398f, 6.466f, 18.692f, 6.303f, 18.734f, 6.027f)
                curveTo(18.777f, 5.751f, 19.231f, 5.411f, 19.004f, 5.452f)
                curveTo(18.777f, 5.492f, 18.907f, 5.524f, 18.577f, 5.452f)
                curveTo(18.248f, 5.38f, 17.822f, 5.332f, 17.822f, 5.13f)
                curveTo(17.822f, 4.927f, 18.034f, 4.767f, 17.861f, 4.767f)
                curveTo(17.688f, 4.767f, 17.318f, 4.575f, 17.392f, 4.722f)
                curveTo(17.466f, 4.868f, 17.222f, 4.702f, 17.344f, 5.006f)
                curveTo(17.466f, 5.31f, 17.318f, 5.617f, 17.392f, 5.697f)
                curveTo(17.466f, 5.778f, 17.344f, 6.173f, 17.344f, 6.173f)
                curveTo(17.344f, 6.173f, 17.389f, 6.32f, 17.468f, 6.1f)
                curveTo(17.546f, 5.88f, 17.719f, 5.726f, 17.632f, 5.913f)
                curveTo(17.546f, 6.1f, 17.437f, 6.545f, 17.535f, 6.466f)
                curveTo(17.632f, 6.388f, 17.73f, 6.173f, 17.73f, 6.1f)
                curveTo(17.73f, 6.027f, 17.977f, 5.741f, 17.977f, 5.957f)
                curveTo(17.977f, 6.173f, 17.744f, 6.343f, 17.861f, 6.343f)
                curveTo(17.977f, 6.343f, 18.042f, 6.389f, 18.115f, 6.173f)
                curveTo(18.188f, 5.957f, 18.366f, 5.814f, 18.438f, 5.957f)
                curveTo(18.511f, 6.1f, 18.495f, 6.092f, 18.398f, 6.279f)
                curveTo(18.301f, 6.466f, 18.398f, 6.466f, 18.398f, 6.466f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.707f, 4.867f)
                lineTo(17.598f, 4.683f)
                curveTo(17.794f, 4.562f, 17.975f, 4.53f, 18.133f, 4.598f)
                curveTo(18.205f, 4.628f, 18.259f, 4.663f, 18.4f, 4.763f)
                lineTo(18.419f, 4.776f)
                curveTo(18.566f, 4.879f, 18.644f, 4.921f, 18.692f, 4.921f)
                verticalLineTo(5.135f)
                curveTo(18.582f, 5.135f, 18.487f, 5.084f, 18.299f, 4.952f)
                lineTo(18.28f, 4.939f)
                curveTo(18.153f, 4.849f, 18.104f, 4.818f, 18.051f, 4.795f)
                curveTo(17.964f, 4.758f, 17.851f, 4.778f, 17.707f, 4.867f)
                close()
                moveTo(17.361f, 6.263f)
                curveTo(17.423f, 6.263f, 17.473f, 6.214f, 17.473f, 6.152f)
                curveTo(17.473f, 6.091f, 17.423f, 6.041f, 17.361f, 6.041f)
                curveTo(17.299f, 6.041f, 17.248f, 6.091f, 17.248f, 6.152f)
                curveTo(17.248f, 6.214f, 17.299f, 6.263f, 17.361f, 6.263f)
                close()
                moveTo(17.684f, 6.367f)
                curveTo(17.684f, 6.428f, 17.634f, 6.478f, 17.572f, 6.478f)
                curveTo(17.51f, 6.478f, 17.459f, 6.428f, 17.459f, 6.367f)
                curveTo(17.459f, 6.305f, 17.51f, 6.255f, 17.572f, 6.255f)
                curveTo(17.634f, 6.255f, 17.684f, 6.305f, 17.684f, 6.367f)
                close()
                moveTo(17.951f, 6.469f)
                curveTo(18.013f, 6.469f, 18.063f, 6.42f, 18.063f, 6.358f)
                curveTo(18.063f, 6.297f, 18.013f, 6.247f, 17.951f, 6.247f)
                curveTo(17.889f, 6.247f, 17.838f, 6.297f, 17.838f, 6.358f)
                curveTo(17.838f, 6.42f, 17.889f, 6.469f, 17.951f, 6.469f)
                close()
                moveTo(18.416f, 6.536f)
                curveTo(18.416f, 6.597f, 18.365f, 6.647f, 18.303f, 6.647f)
                curveTo(18.241f, 6.647f, 18.191f, 6.597f, 18.191f, 6.536f)
                curveTo(18.191f, 6.475f, 18.241f, 6.425f, 18.303f, 6.425f)
                curveTo(18.365f, 6.425f, 18.416f, 6.475f, 18.416f, 6.536f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.5f
        ) {
            moveTo(21.352f, 8.186f)
            lineTo(21.244f, 8.435f)
            lineTo(21.005f, 8.307f)
            lineTo(21.005f, 8.307f)
            lineTo(21.005f, 8.307f)
            lineTo(21.005f, 8.307f)
            lineTo(21.004f, 8.306f)
            lineTo(20.999f, 8.304f)
            lineTo(20.978f, 8.293f)
            curveTo(20.96f, 8.283f, 20.933f, 8.269f, 20.899f, 8.252f)
            curveTo(20.831f, 8.217f, 20.734f, 8.169f, 20.621f, 8.116f)
            curveTo(20.392f, 8.008f, 20.101f, 7.881f, 19.837f, 7.796f)
            curveTo(19.565f, 7.708f, 19.32f, 7.64f, 19.144f, 7.594f)
            curveTo(19.056f, 7.571f, 18.985f, 7.553f, 18.937f, 7.542f)
            lineTo(18.881f, 7.529f)
            lineTo(18.868f, 7.526f)
            lineTo(18.864f, 7.525f)
            lineTo(18.864f, 7.525f)
            lineTo(18.863f, 7.525f)
            lineTo(18.863f, 7.525f)
            lineTo(18.863f, 7.525f)
            lineTo(18.863f, 7.525f)
            lineTo(18.605f, 7.467f)
            lineTo(18.677f, 7.212f)
            lineTo(19.523f, 4.236f)
            lineTo(19.558f, 4.115f)
            lineTo(19.676f, 4.071f)
            lineTo(21.335f, 3.451f)
            lineTo(21.528f, 3.379f)
            lineTo(21.636f, 3.555f)
            lineTo(22.575f, 5.104f)
            lineTo(22.642f, 5.214f)
            lineTo(22.591f, 5.333f)
            lineTo(21.352f, 8.186f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(21.352f, 8.186f)
                lineTo(21.244f, 8.435f)
                lineTo(21.005f, 8.307f)
                lineTo(21.005f, 8.307f)
                lineTo(21.005f, 8.307f)
                lineTo(21.005f, 8.307f)
                lineTo(21.004f, 8.306f)
                lineTo(20.999f, 8.304f)
                lineTo(20.978f, 8.293f)
                curveTo(20.96f, 8.283f, 20.933f, 8.269f, 20.899f, 8.252f)
                curveTo(20.831f, 8.217f, 20.734f, 8.169f, 20.621f, 8.116f)
                curveTo(20.392f, 8.008f, 20.101f, 7.881f, 19.837f, 7.796f)
                curveTo(19.565f, 7.708f, 19.32f, 7.64f, 19.144f, 7.594f)
                curveTo(19.056f, 7.571f, 18.985f, 7.553f, 18.937f, 7.542f)
                lineTo(18.881f, 7.529f)
                lineTo(18.868f, 7.526f)
                lineTo(18.864f, 7.525f)
                lineTo(18.864f, 7.525f)
                lineTo(18.863f, 7.525f)
                lineTo(18.863f, 7.525f)
                lineTo(18.863f, 7.525f)
                lineTo(18.863f, 7.525f)
                lineTo(18.605f, 7.467f)
                lineTo(18.677f, 7.212f)
                lineTo(19.523f, 4.236f)
                lineTo(19.558f, 4.115f)
                lineTo(19.676f, 4.071f)
                lineTo(21.335f, 3.451f)
                lineTo(21.528f, 3.379f)
                lineTo(21.636f, 3.555f)
                lineTo(22.575f, 5.104f)
                lineTo(22.642f, 5.214f)
                lineTo(22.591f, 5.333f)
                lineTo(21.352f, 8.186f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.127f, 5.089f)
                lineTo(20.985f, 5.248f)
                curveTo(20.954f, 5.283f, 20.896f, 5.264f, 20.891f, 5.217f)
                lineTo(20.87f, 5.005f)
                lineTo(20.661f, 4.962f)
                curveTo(20.615f, 4.952f, 20.602f, 4.892f, 20.64f, 4.865f)
                lineTo(20.813f, 4.74f)
                lineTo(20.747f, 4.538f)
                curveTo(20.732f, 4.493f, 20.777f, 4.452f, 20.82f, 4.471f)
                lineTo(21.015f, 4.559f)
                lineTo(21.157f, 4.4f)
                curveTo(21.188f, 4.365f, 21.246f, 4.384f, 21.251f, 4.431f)
                lineTo(21.272f, 4.643f)
                lineTo(21.481f, 4.686f)
                curveTo(21.527f, 4.696f, 21.54f, 4.756f, 21.502f, 4.783f)
                lineTo(21.329f, 4.908f)
                lineTo(21.395f, 5.11f)
                curveTo(21.41f, 5.155f, 21.365f, 5.196f, 21.322f, 5.176f)
                lineTo(21.127f, 5.089f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(18.995f, 6.488f)
                lineTo(19.208f, 5.658f)
                curveTo(20.148f, 5.907f, 21.129f, 6.225f, 21.848f, 6.533f)
                lineTo(21.521f, 7.323f)
                curveTo(20.841f, 7.032f, 19.899f, 6.726f, 18.995f, 6.488f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(19.283f, 5.722f)
                lineTo(19.333f, 5.514f)
                curveTo(20.235f, 5.738f, 21.194f, 6.095f, 21.89f, 6.427f)
                lineTo(21.801f, 6.621f)
                curveTo(21.117f, 6.295f, 20.172f, 5.943f, 19.283f, 5.722f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(19.016f, 6.577f)
                lineTo(19.066f, 6.368f)
                curveTo(19.968f, 6.592f, 20.801f, 6.896f, 21.498f, 7.229f)
                lineTo(21.408f, 7.422f)
                curveTo(20.725f, 7.096f, 19.905f, 6.797f, 19.016f, 6.577f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(19.423f, 6.175f)
                lineTo(19.616f, 6.088f)
                curveTo(19.697f, 6.278f, 19.798f, 6.32f, 19.966f, 6.238f)
                curveTo(20.362f, 6.046f, 21.346f, 6.315f, 21.346f, 6.678f)
                curveTo(21.346f, 6.82f, 21.264f, 6.906f, 21.138f, 6.901f)
                curveTo(21.068f, 6.898f, 20.992f, 6.87f, 20.881f, 6.815f)
                curveTo(20.868f, 6.808f, 20.859f, 6.804f, 20.837f, 6.793f)
                curveTo(20.715f, 6.73f, 20.705f, 6.726f, 20.673f, 6.714f)
                lineTo(20.743f, 6.509f)
                curveTo(20.788f, 6.526f, 20.795f, 6.529f, 20.931f, 6.599f)
                curveTo(20.952f, 6.609f, 20.96f, 6.613f, 20.973f, 6.62f)
                curveTo(21.058f, 6.662f, 21.114f, 6.683f, 21.146f, 6.684f)
                curveTo(21.149f, 6.684f, 21.135f, 6.699f, 21.135f, 6.678f)
                curveTo(21.135f, 6.518f, 20.334f, 6.299f, 20.056f, 6.435f)
                curveTo(19.778f, 6.569f, 19.551f, 6.475f, 19.423f, 6.175f)
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
            imageVector = FlagIcons.Large.Croatia,
            contentDescription = "Croatia Flag"
        )
    }
}
