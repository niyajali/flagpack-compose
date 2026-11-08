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
 * Portugal Flag (32x24dp)
 *
 * - ISO Alpha-2: PT
 * - ISO Alpha-3: PRT
 * - ISO Numeric: 620
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Portugal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Portugal:PT:PRT:620:Large",
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
                fill = SolidColor(Color(0xFFEF0000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(11.905f, 19.807f)
                curveTo(7.644f, 19.807f, 4.19f, 16.312f, 4.19f, 12f)
                curveTo(4.19f, 7.688f, 7.644f, 4.193f, 11.905f, 4.193f)
                curveTo(16.165f, 4.193f, 19.619f, 7.688f, 19.619f, 12f)
                curveTo(19.619f, 16.312f, 16.165f, 19.807f, 11.905f, 19.807f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.429f, 4f)
                horizontalLineTo(12.429f)
                verticalLineTo(6.699f)
                horizontalLineTo(11.429f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE017)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.429f, 17.494f)
                horizontalLineTo(12.429f)
                verticalLineTo(20f)
                horizontalLineTo(11.429f)
                verticalLineTo(17.494f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(4.314f, 12.404f)
                lineTo(4.035f, 11.686f)
                curveTo(7.12f, 10.455f, 9.449f, 9.66f, 11.028f, 9.303f)
                curveTo(13.347f, 8.777f, 15.894f, 8.389f, 18.67f, 8.136f)
                lineTo(18.738f, 8.904f)
                curveTo(15.994f, 9.154f, 13.479f, 9.537f, 11.195f, 10.055f)
                curveTo(9.662f, 10.402f, 7.366f, 11.186f, 4.314f, 12.404f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(19.141f, 7.664f)
                lineTo(18.914f, 8.4f)
                curveTo(16.582f, 7.664f, 14.683f, 7.347f, 13.223f, 7.445f)
                lineTo(13.172f, 6.676f)
                curveTo(14.74f, 6.571f, 16.727f, 6.902f, 19.141f, 7.664f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(19.948f, 11.78f)
                lineTo(19.517f, 12.416f)
                curveTo(18.328f, 11.59f, 16.864f, 11.176f, 15.113f, 11.176f)
                verticalLineTo(10.405f)
                curveTo(17.011f, 10.405f, 18.625f, 10.862f, 19.948f, 11.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(19.302f, 12.011f)
                lineTo(19.499f, 12.755f)
                curveTo(16.936f, 13.45f, 14.53f, 13.843f, 12.281f, 13.936f)
                curveTo(10.016f, 14.03f, 7.376f, 13.634f, 4.359f, 12.753f)
                lineTo(4.57f, 12.013f)
                curveTo(7.514f, 12.872f, 10.075f, 13.255f, 12.25f, 13.166f)
                curveTo(14.441f, 13.075f, 16.792f, 12.691f, 19.302f, 12.011f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(19.012f, 15.636f)
                lineTo(17.807f, 16.871f)
                curveTo(15.519f, 14.584f, 13.504f, 12.949f, 11.775f, 11.967f)
                curveTo(10.017f, 10.967f, 7.724f, 9.953f, 4.9f, 8.927f)
                lineTo(5.479f, 7.294f)
                curveTo(8.386f, 8.35f, 10.763f, 9.402f, 12.614f, 10.454f)
                curveTo(14.495f, 11.522f, 16.623f, 13.249f, 19.012f, 15.636f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(5.458f, 16.335f)
                lineTo(5.002f, 15.717f)
                curveTo(5.066f, 15.669f, 5.18f, 15.589f, 5.336f, 15.488f)
                curveTo(5.595f, 15.32f, 5.882f, 15.152f, 6.19f, 14.995f)
                curveTo(7.041f, 14.564f, 7.893f, 14.295f, 8.707f, 14.27f)
                curveTo(8.747f, 14.269f, 8.786f, 14.268f, 8.826f, 14.268f)
                verticalLineTo(15.039f)
                curveTo(8.794f, 15.039f, 8.762f, 15.04f, 8.73f, 15.041f)
                curveTo(8.044f, 15.062f, 7.291f, 15.299f, 6.532f, 15.685f)
                curveTo(6.248f, 15.828f, 5.985f, 15.983f, 5.748f, 16.136f)
                curveTo(5.665f, 16.19f, 5.592f, 16.239f, 5.53f, 16.284f)
                curveTo(5.493f, 16.309f, 5.469f, 16.327f, 5.458f, 16.335f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(5.812f, 16.603f)
                lineTo(6.004f, 15.856f)
                curveTo(8.544f, 16.525f, 10.502f, 16.859f, 11.869f, 16.859f)
                curveTo(13.231f, 16.859f, 15.257f, 16.465f, 17.936f, 15.676f)
                lineTo(18.149f, 16.417f)
                curveTo(15.407f, 17.225f, 13.318f, 17.63f, 11.869f, 17.63f)
                curveTo(10.425f, 17.63f, 8.409f, 17.287f, 5.812f, 16.603f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(4.822f, 9.694f)
                lineTo(6.029f, 8.462f)
                lineTo(7.797f, 10.236f)
                lineTo(6.59f, 11.468f)
                lineTo(4.822f, 9.694f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFE017))) {
                moveTo(14.836f, 15.848f)
                lineTo(15.734f, 14.37f)
                lineTo(18.537f, 16.114f)
                lineTo(17.64f, 17.592f)
                lineTo(14.836f, 15.848f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.19f, 12f)
            curveTo(4.19f, 16.312f, 7.644f, 19.807f, 11.905f, 19.807f)
            curveTo(16.165f, 19.807f, 19.619f, 16.312f, 19.619f, 12f)
            curveTo(19.619f, 7.688f, 16.165f, 4.193f, 11.905f, 4.193f)
            curveTo(7.644f, 4.193f, 4.19f, 7.688f, 4.19f, 12f)
            close()
            moveTo(18.667f, 12.096f)
            curveTo(18.667f, 15.823f, 15.682f, 18.843f, 12f, 18.843f)
            curveTo(8.318f, 18.843f, 5.333f, 15.823f, 5.333f, 12.096f)
            curveTo(5.333f, 8.37f, 8.318f, 5.349f, 12f, 5.349f)
            curveTo(15.682f, 5.349f, 18.667f, 8.37f, 18.667f, 12.096f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(7.657f, 7.185f)
            verticalLineTo(13.446f)
            curveTo(8.069f, 15.924f, 9.457f, 17.163f, 11.822f, 17.163f)
            curveTo(14.187f, 17.163f, 15.575f, 15.924f, 15.987f, 13.446f)
            verticalLineTo(7.185f)
            horizontalLineTo(7.657f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC51918))) {
            moveTo(7.085f, 6.607f)
            horizontalLineTo(16.559f)
            verticalLineTo(13.494f)
            lineTo(16.551f, 13.542f)
            curveTo(16.093f, 16.294f, 14.471f, 17.741f, 11.822f, 17.741f)
            curveTo(9.173f, 17.741f, 7.551f, 16.294f, 7.093f, 13.542f)
            lineTo(7.085f, 13.494f)
            verticalLineTo(6.607f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(9.252f, 8.711f)
            horizontalLineTo(14.392f)
            verticalLineTo(13.152f)
            curveTo(14.392f, 13.152f, 14.01f, 15.445f, 11.822f, 15.445f)
            curveTo(9.634f, 15.445f, 9.252f, 13.152f, 9.252f, 13.152f)
            verticalLineTo(8.711f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 7.084f)
            horizontalLineTo(8.723f)
            verticalLineTo(7.566f)
            horizontalLineTo(8f)
            verticalLineTo(7.084f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 7.277f)
            horizontalLineTo(8.952f)
            verticalLineTo(7.518f)
            horizontalLineTo(7.619f)
            verticalLineTo(7.277f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 7.47f)
            horizontalLineTo(8.342f)
            verticalLineTo(7.711f)
            horizontalLineTo(7.619f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.381f, 7.47f)
            horizontalLineTo(9.104f)
            verticalLineTo(7.711f)
            horizontalLineTo(8.381f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 8.048f)
            horizontalLineTo(8.101f)
            verticalLineTo(8.771f)
            horizontalLineTo(7.619f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.571f, 8.048f)
            horizontalLineTo(9.053f)
            verticalLineTo(8.771f)
            horizontalLineTo(8.571f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.19f, 8.048f)
            horizontalLineTo(8.431f)
            verticalLineTo(8.771f)
            horizontalLineTo(8.19f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 7.855f)
            horizontalLineTo(8.952f)
            verticalLineTo(8.096f)
            horizontalLineTo(7.619f)
            verticalLineTo(7.855f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 8.434f)
            horizontalLineTo(8.952f)
            verticalLineTo(8.675f)
            horizontalLineTo(7.619f)
            verticalLineTo(8.434f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.809f, 7.663f)
            horizontalLineTo(8.05f)
            verticalLineTo(7.904f)
            horizontalLineTo(7.809f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.571f, 7.663f)
            horizontalLineTo(8.812f)
            verticalLineTo(7.904f)
            horizontalLineTo(8.571f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.19f, 7.47f)
            horizontalLineTo(8.431f)
            verticalLineTo(7.952f)
            horizontalLineTo(8.19f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.619f, 7.084f)
            horizontalLineTo(12.342f)
            verticalLineTo(7.566f)
            horizontalLineTo(11.619f)
            verticalLineTo(7.084f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.238f, 7.277f)
            horizontalLineTo(12.571f)
            verticalLineTo(7.518f)
            horizontalLineTo(11.238f)
            verticalLineTo(7.277f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.238f, 7.47f)
            horizontalLineTo(11.961f)
            verticalLineTo(7.711f)
            horizontalLineTo(11.238f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12f, 7.47f)
            horizontalLineTo(12.723f)
            verticalLineTo(7.711f)
            horizontalLineTo(12f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.238f, 8.048f)
            horizontalLineTo(11.72f)
            verticalLineTo(8.771f)
            horizontalLineTo(11.238f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.19f, 8.048f)
            horizontalLineTo(12.672f)
            verticalLineTo(8.771f)
            horizontalLineTo(12.19f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.809f, 8.048f)
            horizontalLineTo(12.05f)
            verticalLineTo(8.771f)
            horizontalLineTo(11.809f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.238f, 7.855f)
            horizontalLineTo(12.571f)
            verticalLineTo(8.096f)
            horizontalLineTo(11.238f)
            verticalLineTo(7.855f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.238f, 8.434f)
            horizontalLineTo(12.571f)
            verticalLineTo(8.675f)
            horizontalLineTo(11.238f)
            verticalLineTo(8.434f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.429f, 7.663f)
            horizontalLineTo(11.669f)
            verticalLineTo(7.904f)
            horizontalLineTo(11.429f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.19f, 7.663f)
            horizontalLineTo(12.431f)
            verticalLineTo(7.904f)
            horizontalLineTo(12.19f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.809f, 7.47f)
            horizontalLineTo(12.05f)
            verticalLineTo(7.952f)
            horizontalLineTo(11.809f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.048f, 7.084f)
            horizontalLineTo(15.771f)
            verticalLineTo(7.566f)
            horizontalLineTo(15.048f)
            verticalLineTo(7.084f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 7.277f)
            horizontalLineTo(16f)
            verticalLineTo(7.518f)
            horizontalLineTo(14.667f)
            verticalLineTo(7.277f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 7.47f)
            horizontalLineTo(15.389f)
            verticalLineTo(7.711f)
            horizontalLineTo(14.667f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.429f, 7.47f)
            horizontalLineTo(16.152f)
            verticalLineTo(7.711f)
            horizontalLineTo(15.429f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 8.048f)
            horizontalLineTo(15.149f)
            verticalLineTo(8.771f)
            horizontalLineTo(14.667f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.619f, 8.048f)
            horizontalLineTo(16.101f)
            verticalLineTo(8.771f)
            horizontalLineTo(15.619f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 8.048f)
            horizontalLineTo(15.479f)
            verticalLineTo(8.771f)
            horizontalLineTo(15.238f)
            verticalLineTo(8.048f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 7.855f)
            horizontalLineTo(16f)
            verticalLineTo(8.096f)
            horizontalLineTo(14.667f)
            verticalLineTo(7.855f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 8.434f)
            horizontalLineTo(16f)
            verticalLineTo(8.675f)
            horizontalLineTo(14.667f)
            verticalLineTo(8.434f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.857f, 7.663f)
            horizontalLineTo(15.098f)
            verticalLineTo(7.904f)
            horizontalLineTo(14.857f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.619f, 7.663f)
            horizontalLineTo(15.86f)
            verticalLineTo(7.904f)
            horizontalLineTo(15.619f)
            verticalLineTo(7.663f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 7.47f)
            horizontalLineTo(15.479f)
            verticalLineTo(7.952f)
            horizontalLineTo(15.238f)
            verticalLineTo(7.47f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.048f, 10.554f)
            horizontalLineTo(15.771f)
            verticalLineTo(11.036f)
            horizontalLineTo(15.048f)
            verticalLineTo(10.554f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 10.747f)
            horizontalLineTo(16f)
            verticalLineTo(10.988f)
            horizontalLineTo(14.667f)
            verticalLineTo(10.747f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 10.94f)
            horizontalLineTo(15.389f)
            verticalLineTo(11.181f)
            horizontalLineTo(14.667f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.429f, 10.94f)
            horizontalLineTo(16.152f)
            verticalLineTo(11.181f)
            horizontalLineTo(15.429f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 11.518f)
            horizontalLineTo(15.149f)
            verticalLineTo(12.241f)
            horizontalLineTo(14.667f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.619f, 11.518f)
            horizontalLineTo(16.101f)
            verticalLineTo(12.241f)
            horizontalLineTo(15.619f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 11.518f)
            horizontalLineTo(15.479f)
            verticalLineTo(12.241f)
            horizontalLineTo(15.238f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 11.325f)
            horizontalLineTo(16f)
            verticalLineTo(11.566f)
            horizontalLineTo(14.667f)
            verticalLineTo(11.325f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.667f, 11.904f)
            horizontalLineTo(16f)
            verticalLineTo(12.145f)
            horizontalLineTo(14.667f)
            verticalLineTo(11.904f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.857f, 11.132f)
            horizontalLineTo(15.098f)
            verticalLineTo(11.373f)
            horizontalLineTo(14.857f)
            verticalLineTo(11.132f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.619f, 11.132f)
            horizontalLineTo(15.86f)
            verticalLineTo(11.373f)
            horizontalLineTo(15.619f)
            verticalLineTo(11.132f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 10.94f)
            horizontalLineTo(15.479f)
            verticalLineTo(11.422f)
            horizontalLineTo(15.238f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 10.554f)
            horizontalLineTo(8.723f)
            verticalLineTo(11.036f)
            horizontalLineTo(8f)
            verticalLineTo(10.554f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 10.747f)
            horizontalLineTo(8.952f)
            verticalLineTo(10.988f)
            horizontalLineTo(7.619f)
            verticalLineTo(10.747f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 10.94f)
            horizontalLineTo(8.342f)
            verticalLineTo(11.181f)
            horizontalLineTo(7.619f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.381f, 10.94f)
            horizontalLineTo(9.104f)
            verticalLineTo(11.181f)
            horizontalLineTo(8.381f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 11.518f)
            horizontalLineTo(8.101f)
            verticalLineTo(12.241f)
            horizontalLineTo(7.619f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.571f, 11.518f)
            horizontalLineTo(9.053f)
            verticalLineTo(12.241f)
            horizontalLineTo(8.571f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.19f, 11.518f)
            horizontalLineTo(8.431f)
            verticalLineTo(12.241f)
            horizontalLineTo(8.19f)
            verticalLineTo(11.518f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 11.325f)
            horizontalLineTo(8.952f)
            verticalLineTo(11.566f)
            horizontalLineTo(7.619f)
            verticalLineTo(11.325f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 11.904f)
            horizontalLineTo(8.952f)
            verticalLineTo(12.145f)
            horizontalLineTo(7.619f)
            verticalLineTo(11.904f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.809f, 11.132f)
            horizontalLineTo(8.05f)
            verticalLineTo(11.373f)
            horizontalLineTo(7.809f)
            verticalLineTo(11.132f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.571f, 11.132f)
            horizontalLineTo(8.812f)
            verticalLineTo(11.373f)
            horizontalLineTo(8.571f)
            verticalLineTo(11.132f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.19f, 10.94f)
            horizontalLineTo(8.431f)
            verticalLineTo(11.422f)
            horizontalLineTo(8.19f)
            verticalLineTo(10.94f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.464f, 14.904f)
            lineTo(8.928f, 14.35f)
            lineTo(9.298f, 14.66f)
            lineTo(8.833f, 15.214f)
            lineTo(8.464f, 14.904f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.367f, 15.32f)
            lineTo(9.224f, 14.298f)
            lineTo(9.408f, 14.453f)
            lineTo(8.551f, 15.475f)
            lineTo(8.367f, 15.32f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.514f, 15.444f)
            lineTo(8.979f, 14.89f)
            lineTo(9.163f, 15.045f)
            lineTo(8.699f, 15.599f)
            lineTo(8.514f, 15.444f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.004f, 14.86f)
            lineTo(9.469f, 14.306f)
            lineTo(9.653f, 14.461f)
            lineTo(9.189f, 15.015f)
            lineTo(9.004f, 14.86f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.957f, 15.815f)
            lineTo(9.267f, 15.446f)
            lineTo(9.821f, 15.911f)
            lineTo(9.511f, 16.28f)
            lineTo(8.957f, 15.815f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.569f, 15.086f)
            lineTo(9.879f, 14.717f)
            lineTo(10.433f, 15.181f)
            lineTo(10.123f, 15.55f)
            lineTo(9.569f, 15.086f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.325f, 15.378f)
            lineTo(9.479f, 15.193f)
            lineTo(10.033f, 15.658f)
            lineTo(9.878f, 15.842f)
            lineTo(9.325f, 15.378f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.81f, 15.691f)
            lineTo(9.667f, 14.67f)
            lineTo(9.851f, 14.825f)
            lineTo(8.994f, 15.846f)
            lineTo(8.81f, 15.691f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.253f, 16.063f)
            lineTo(10.11f, 15.042f)
            lineTo(10.294f, 15.197f)
            lineTo(9.437f, 16.218f)
            lineTo(9.253f, 16.063f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.784f, 15.422f)
            lineTo(8.939f, 15.237f)
            lineTo(9.124f, 15.392f)
            lineTo(8.969f, 15.576f)
            lineTo(8.784f, 15.422f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.274f, 14.838f)
            lineTo(9.429f, 14.653f)
            lineTo(9.614f, 14.808f)
            lineTo(9.459f, 14.993f)
            lineTo(9.274f, 14.838f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.881f, 15.006f)
            lineTo(9.036f, 14.821f)
            lineTo(9.406f, 15.131f)
            lineTo(9.251f, 15.316f)
            lineTo(8.881f, 15.006f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.978f, 14.466f)
            lineTo(15.443f, 15.02f)
            lineTo(15.074f, 15.33f)
            lineTo(14.609f, 14.776f)
            lineTo(14.978f, 14.466f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.586f, 14.298f)
            lineTo(15.443f, 15.32f)
            lineTo(15.258f, 15.475f)
            lineTo(14.401f, 14.453f)
            lineTo(14.586f, 14.298f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.438f, 14.422f)
            lineTo(14.903f, 14.976f)
            lineTo(14.718f, 15.131f)
            lineTo(14.254f, 14.577f)
            lineTo(14.438f, 14.422f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.928f, 15.006f)
            lineTo(15.393f, 15.56f)
            lineTo(15.208f, 15.715f)
            lineTo(14.743f, 15.161f)
            lineTo(14.928f, 15.006f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.995f, 14.794f)
            lineTo(14.305f, 15.163f)
            lineTo(13.751f, 15.628f)
            lineTo(13.441f, 15.259f)
            lineTo(13.995f, 14.794f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.607f, 15.524f)
            lineTo(14.917f, 15.893f)
            lineTo(14.363f, 16.357f)
            lineTo(14.054f, 15.988f)
            lineTo(14.607f, 15.524f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.362f, 15.232f)
            lineTo(14.517f, 15.416f)
            lineTo(13.964f, 15.881f)
            lineTo(13.809f, 15.696f)
            lineTo(14.362f, 15.232f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.143f, 14.67f)
            lineTo(15f, 15.691f)
            lineTo(14.815f, 15.846f)
            lineTo(13.958f, 14.825f)
            lineTo(14.143f, 14.67f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF060101)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.7f, 15.042f)
            lineTo(14.557f, 16.063f)
            lineTo(14.372f, 16.218f)
            lineTo(13.515f, 15.197f)
            lineTo(13.7f, 15.042f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.413f, 14.692f)
            lineTo(14.568f, 14.877f)
            lineTo(14.383f, 15.031f)
            lineTo(14.228f, 14.847f)
            lineTo(14.413f, 14.692f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.903f, 15.276f)
            lineTo(15.058f, 15.46f)
            lineTo(14.873f, 15.615f)
            lineTo(14.718f, 15.431f)
            lineTo(14.903f, 15.276f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF9E813)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.806f, 14.86f)
            lineTo(14.96f, 15.045f)
            lineTo(14.591f, 15.354f)
            lineTo(14.436f, 15.17f)
            lineTo(14.806f, 14.86f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.558f, 9.205f)
            horizontalLineTo(11.238f)
            verticalLineTo(10.166f)
            curveTo(11.238f, 10.166f, 11.336f, 10.663f, 11.898f, 10.663f)
            curveTo(12.46f, 10.663f, 12.558f, 10.166f, 12.558f, 10.166f)
            verticalLineTo(9.205f)
            close()
            moveTo(11.809f, 9.59f)
            curveTo(11.809f, 9.697f, 11.724f, 9.783f, 11.619f, 9.783f)
            curveTo(11.514f, 9.783f, 11.429f, 9.697f, 11.429f, 9.59f)
            curveTo(11.429f, 9.484f, 11.514f, 9.398f, 11.619f, 9.398f)
            curveTo(11.724f, 9.398f, 11.809f, 9.484f, 11.809f, 9.59f)
            close()
            moveTo(11.619f, 10.554f)
            curveTo(11.724f, 10.554f, 11.809f, 10.468f, 11.809f, 10.361f)
            curveTo(11.809f, 10.255f, 11.724f, 10.169f, 11.619f, 10.169f)
            curveTo(11.514f, 10.169f, 11.429f, 10.255f, 11.429f, 10.361f)
            curveTo(11.429f, 10.468f, 11.514f, 10.554f, 11.619f, 10.554f)
            close()
            moveTo(12.381f, 10.361f)
            curveTo(12.381f, 10.468f, 12.296f, 10.554f, 12.19f, 10.554f)
            curveTo(12.085f, 10.554f, 12f, 10.468f, 12f, 10.361f)
            curveTo(12f, 10.255f, 12.085f, 10.169f, 12.19f, 10.169f)
            curveTo(12.296f, 10.169f, 12.381f, 10.255f, 12.381f, 10.361f)
            close()
            moveTo(11.905f, 10.169f)
            curveTo(12.01f, 10.169f, 12.095f, 10.082f, 12.095f, 9.976f)
            curveTo(12.095f, 9.869f, 12.01f, 9.783f, 11.905f, 9.783f)
            curveTo(11.8f, 9.783f, 11.714f, 9.869f, 11.714f, 9.976f)
            curveTo(11.714f, 10.082f, 11.8f, 10.169f, 11.905f, 10.169f)
            close()
            moveTo(12.381f, 9.59f)
            curveTo(12.381f, 9.697f, 12.296f, 9.783f, 12.19f, 9.783f)
            curveTo(12.085f, 9.783f, 12f, 9.697f, 12f, 9.59f)
            curveTo(12f, 9.484f, 12.085f, 9.398f, 12.19f, 9.398f)
            curveTo(12.296f, 9.398f, 12.381f, 9.484f, 12.381f, 9.59f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.558f, 11.325f)
            horizontalLineTo(11.238f)
            verticalLineTo(12.287f)
            curveTo(11.238f, 12.287f, 11.336f, 12.783f, 11.898f, 12.783f)
            curveTo(12.46f, 12.783f, 12.558f, 12.287f, 12.558f, 12.287f)
            verticalLineTo(11.325f)
            close()
            moveTo(11.809f, 11.711f)
            curveTo(11.809f, 11.817f, 11.724f, 11.904f, 11.619f, 11.904f)
            curveTo(11.514f, 11.904f, 11.429f, 11.817f, 11.429f, 11.711f)
            curveTo(11.429f, 11.604f, 11.514f, 11.518f, 11.619f, 11.518f)
            curveTo(11.724f, 11.518f, 11.809f, 11.604f, 11.809f, 11.711f)
            close()
            moveTo(11.619f, 12.675f)
            curveTo(11.724f, 12.675f, 11.809f, 12.588f, 11.809f, 12.482f)
            curveTo(11.809f, 12.375f, 11.724f, 12.289f, 11.619f, 12.289f)
            curveTo(11.514f, 12.289f, 11.429f, 12.375f, 11.429f, 12.482f)
            curveTo(11.429f, 12.588f, 11.514f, 12.675f, 11.619f, 12.675f)
            close()
            moveTo(12.381f, 12.482f)
            curveTo(12.381f, 12.588f, 12.296f, 12.675f, 12.19f, 12.675f)
            curveTo(12.085f, 12.675f, 12f, 12.588f, 12f, 12.482f)
            curveTo(12f, 12.375f, 12.085f, 12.289f, 12.19f, 12.289f)
            curveTo(12.296f, 12.289f, 12.381f, 12.375f, 12.381f, 12.482f)
            close()
            moveTo(11.905f, 12.289f)
            curveTo(12.01f, 12.289f, 12.095f, 12.203f, 12.095f, 12.096f)
            curveTo(12.095f, 11.99f, 12.01f, 11.904f, 11.905f, 11.904f)
            curveTo(11.8f, 11.904f, 11.714f, 11.99f, 11.714f, 12.096f)
            curveTo(11.714f, 12.203f, 11.8f, 12.289f, 11.905f, 12.289f)
            close()
            moveTo(12.381f, 11.711f)
            curveTo(12.381f, 11.817f, 12.296f, 11.904f, 12.19f, 11.904f)
            curveTo(12.085f, 11.904f, 12f, 11.817f, 12f, 11.711f)
            curveTo(12f, 11.604f, 12.085f, 11.518f, 12.19f, 11.518f)
            curveTo(12.296f, 11.518f, 12.381f, 11.604f, 12.381f, 11.711f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.273f, 11.325f)
            horizontalLineTo(12.952f)
            verticalLineTo(12.287f)
            curveTo(12.952f, 12.287f, 13.05f, 12.783f, 13.612f, 12.783f)
            curveTo(14.175f, 12.783f, 14.273f, 12.287f, 14.273f, 12.287f)
            verticalLineTo(11.325f)
            close()
            moveTo(13.524f, 11.711f)
            curveTo(13.524f, 11.817f, 13.438f, 11.904f, 13.333f, 11.904f)
            curveTo(13.228f, 11.904f, 13.143f, 11.817f, 13.143f, 11.711f)
            curveTo(13.143f, 11.604f, 13.228f, 11.518f, 13.333f, 11.518f)
            curveTo(13.438f, 11.518f, 13.524f, 11.604f, 13.524f, 11.711f)
            close()
            moveTo(13.333f, 12.675f)
            curveTo(13.438f, 12.675f, 13.524f, 12.588f, 13.524f, 12.482f)
            curveTo(13.524f, 12.375f, 13.438f, 12.289f, 13.333f, 12.289f)
            curveTo(13.228f, 12.289f, 13.143f, 12.375f, 13.143f, 12.482f)
            curveTo(13.143f, 12.588f, 13.228f, 12.675f, 13.333f, 12.675f)
            close()
            moveTo(14.095f, 12.482f)
            curveTo(14.095f, 12.588f, 14.01f, 12.675f, 13.905f, 12.675f)
            curveTo(13.8f, 12.675f, 13.714f, 12.588f, 13.714f, 12.482f)
            curveTo(13.714f, 12.375f, 13.8f, 12.289f, 13.905f, 12.289f)
            curveTo(14.01f, 12.289f, 14.095f, 12.375f, 14.095f, 12.482f)
            close()
            moveTo(13.619f, 12.289f)
            curveTo(13.724f, 12.289f, 13.809f, 12.203f, 13.809f, 12.096f)
            curveTo(13.809f, 11.99f, 13.724f, 11.904f, 13.619f, 11.904f)
            curveTo(13.514f, 11.904f, 13.429f, 11.99f, 13.429f, 12.096f)
            curveTo(13.429f, 12.203f, 13.514f, 12.289f, 13.619f, 12.289f)
            close()
            moveTo(14.095f, 11.711f)
            curveTo(14.095f, 11.817f, 14.01f, 11.904f, 13.905f, 11.904f)
            curveTo(13.8f, 11.904f, 13.714f, 11.817f, 13.714f, 11.711f)
            curveTo(13.714f, 11.604f, 13.8f, 11.518f, 13.905f, 11.518f)
            curveTo(14.01f, 11.518f, 14.095f, 11.604f, 14.095f, 11.711f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.844f, 11.325f)
            horizontalLineTo(9.524f)
            verticalLineTo(12.287f)
            curveTo(9.524f, 12.287f, 9.622f, 12.783f, 10.184f, 12.783f)
            curveTo(10.746f, 12.783f, 10.844f, 12.287f, 10.844f, 12.287f)
            verticalLineTo(11.325f)
            close()
            moveTo(10.095f, 11.711f)
            curveTo(10.095f, 11.817f, 10.01f, 11.904f, 9.905f, 11.904f)
            curveTo(9.8f, 11.904f, 9.714f, 11.817f, 9.714f, 11.711f)
            curveTo(9.714f, 11.604f, 9.8f, 11.518f, 9.905f, 11.518f)
            curveTo(10.01f, 11.518f, 10.095f, 11.604f, 10.095f, 11.711f)
            close()
            moveTo(9.905f, 12.675f)
            curveTo(10.01f, 12.675f, 10.095f, 12.588f, 10.095f, 12.482f)
            curveTo(10.095f, 12.375f, 10.01f, 12.289f, 9.905f, 12.289f)
            curveTo(9.8f, 12.289f, 9.714f, 12.375f, 9.714f, 12.482f)
            curveTo(9.714f, 12.588f, 9.8f, 12.675f, 9.905f, 12.675f)
            close()
            moveTo(10.667f, 12.482f)
            curveTo(10.667f, 12.588f, 10.581f, 12.675f, 10.476f, 12.675f)
            curveTo(10.371f, 12.675f, 10.286f, 12.588f, 10.286f, 12.482f)
            curveTo(10.286f, 12.375f, 10.371f, 12.289f, 10.476f, 12.289f)
            curveTo(10.581f, 12.289f, 10.667f, 12.375f, 10.667f, 12.482f)
            close()
            moveTo(10.191f, 12.289f)
            curveTo(10.296f, 12.289f, 10.381f, 12.203f, 10.381f, 12.096f)
            curveTo(10.381f, 11.99f, 10.296f, 11.904f, 10.191f, 11.904f)
            curveTo(10.085f, 11.904f, 10f, 11.99f, 10f, 12.096f)
            curveTo(10f, 12.203f, 10.085f, 12.289f, 10.191f, 12.289f)
            close()
            moveTo(10.667f, 11.711f)
            curveTo(10.667f, 11.817f, 10.581f, 11.904f, 10.476f, 11.904f)
            curveTo(10.371f, 11.904f, 10.286f, 11.817f, 10.286f, 11.711f)
            curveTo(10.286f, 11.604f, 10.371f, 11.518f, 10.476f, 11.518f)
            curveTo(10.581f, 11.518f, 10.667f, 11.604f, 10.667f, 11.711f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF013399)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(12.558f, 13.446f)
            horizontalLineTo(11.238f)
            verticalLineTo(14.407f)
            curveTo(11.238f, 14.407f, 11.336f, 14.904f, 11.898f, 14.904f)
            curveTo(12.46f, 14.904f, 12.558f, 14.407f, 12.558f, 14.407f)
            verticalLineTo(13.446f)
            close()
            moveTo(11.809f, 13.831f)
            curveTo(11.809f, 13.938f, 11.724f, 14.024f, 11.619f, 14.024f)
            curveTo(11.514f, 14.024f, 11.429f, 13.938f, 11.429f, 13.831f)
            curveTo(11.429f, 13.725f, 11.514f, 13.639f, 11.619f, 13.639f)
            curveTo(11.724f, 13.639f, 11.809f, 13.725f, 11.809f, 13.831f)
            close()
            moveTo(11.619f, 14.795f)
            curveTo(11.724f, 14.795f, 11.809f, 14.709f, 11.809f, 14.602f)
            curveTo(11.809f, 14.496f, 11.724f, 14.41f, 11.619f, 14.41f)
            curveTo(11.514f, 14.41f, 11.429f, 14.496f, 11.429f, 14.602f)
            curveTo(11.429f, 14.709f, 11.514f, 14.795f, 11.619f, 14.795f)
            close()
            moveTo(12.381f, 14.602f)
            curveTo(12.381f, 14.709f, 12.296f, 14.795f, 12.19f, 14.795f)
            curveTo(12.085f, 14.795f, 12f, 14.709f, 12f, 14.602f)
            curveTo(12f, 14.496f, 12.085f, 14.41f, 12.19f, 14.41f)
            curveTo(12.296f, 14.41f, 12.381f, 14.496f, 12.381f, 14.602f)
            close()
            moveTo(11.905f, 14.41f)
            curveTo(12.01f, 14.41f, 12.095f, 14.323f, 12.095f, 14.217f)
            curveTo(12.095f, 14.11f, 12.01f, 14.024f, 11.905f, 14.024f)
            curveTo(11.8f, 14.024f, 11.714f, 14.11f, 11.714f, 14.217f)
            curveTo(11.714f, 14.323f, 11.8f, 14.41f, 11.905f, 14.41f)
            close()
            moveTo(12.381f, 13.831f)
            curveTo(12.381f, 13.938f, 12.296f, 14.024f, 12.19f, 14.024f)
            curveTo(12.085f, 14.024f, 12f, 13.938f, 12f, 13.831f)
            curveTo(12f, 13.725f, 12.085f, 13.639f, 12.19f, 13.639f)
            curveTo(12.296f, 13.639f, 12.381f, 13.725f, 12.381f, 13.831f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PortugalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Portugal,
            contentDescription = "Portugal Flag"
        )
    }
}
