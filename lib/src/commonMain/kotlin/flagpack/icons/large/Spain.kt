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
 * Spain Flag (32x24dp)
 *
 * - ISO Alpha-2: ES
 * - ISO Alpha-3: ESP
 * - ISO Numeric: 724
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Spain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Spain:ES:ESP:724:Large",
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
                fill = SolidColor(Color(0xFFFFB400)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(5.008f, 10.272f)
                horizontalLineToRelative(1.12f)
                verticalLineToRelative(5.824f)
                horizontalLineToRelative(-1.12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.576f, 9.264f)
                horizontalLineTo(4.56f)
                verticalLineTo(9.824f)
                horizontalLineTo(4.896f)
                verticalLineTo(10.272f)
                horizontalLineTo(6.24f)
                verticalLineTo(9.824f)
                horizontalLineTo(6.576f)
                verticalLineTo(9.264f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.24f, 16.432f)
                horizontalLineTo(6.576f)
                verticalLineTo(16.992f)
                horizontalLineTo(4.56f)
                verticalLineTo(16.432f)
                horizontalLineTo(4.896f)
                verticalLineTo(15.984f)
                horizontalLineTo(6.24f)
                verticalLineTo(16.432f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAD1619)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.568f, 9.376f)
                curveTo(5.812f, 9.376f, 5.837f, 9.284f, 5.98f, 9.147f)
                curveTo(6.092f, 9.041f, 6.352f, 8.909f, 6.352f, 8.76f)
                curveTo(6.352f, 8.42f, 6.001f, 8.144f, 5.568f, 8.144f)
                curveTo(5.135f, 8.144f, 4.784f, 8.42f, 4.784f, 8.76f)
                curveTo(4.784f, 8.926f, 4.963f, 9.036f, 5.099f, 9.147f)
                curveTo(5.241f, 9.264f, 5.346f, 9.376f, 5.568f, 9.376f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.56f, 16.992f)
                horizontalLineTo(6.576f)
                verticalLineTo(17.888f)
                curveTo(6.576f, 17.888f, 6.324f, 17.776f, 6.072f, 17.776f)
                curveTo(5.82f, 17.776f, 5.568f, 17.888f, 5.568f, 17.888f)
                curveTo(5.568f, 17.888f, 5.316f, 17.776f, 5.064f, 17.776f)
                curveTo(4.812f, 17.776f, 4.56f, 17.888f, 4.56f, 17.888f)
                verticalLineTo(16.992f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(4.56f, 16.992f)
                horizontalLineTo(6.576f)
                verticalLineTo(17.888f)
                curveTo(6.576f, 17.888f, 6.324f, 17.776f, 6.072f, 17.776f)
                curveTo(5.82f, 17.776f, 5.568f, 17.888f, 5.568f, 17.888f)
                curveTo(5.568f, 17.888f, 5.316f, 17.776f, 5.064f, 17.776f)
                curveTo(4.812f, 17.776f, 4.56f, 17.888f, 4.56f, 17.888f)
                verticalLineTo(16.992f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(4.542f, 17.712f)
                lineTo(4.498f, 17.605f)
                curveTo(4.679f, 17.524f, 4.862f, 17.483f, 5.044f, 17.483f)
                curveTo(5.162f, 17.483f, 5.224f, 17.5f, 5.328f, 17.546f)
                curveTo(5.42f, 17.587f, 5.468f, 17.6f, 5.568f, 17.6f)
                curveTo(5.669f, 17.6f, 5.717f, 17.587f, 5.809f, 17.546f)
                curveTo(5.913f, 17.5f, 5.975f, 17.483f, 6.093f, 17.483f)
                curveTo(6.275f, 17.483f, 6.457f, 17.524f, 6.639f, 17.605f)
                lineTo(6.595f, 17.712f)
                curveTo(6.427f, 17.637f, 6.26f, 17.6f, 6.093f, 17.6f)
                curveTo(5.992f, 17.6f, 5.944f, 17.613f, 5.853f, 17.654f)
                curveTo(5.748f, 17.7f, 5.686f, 17.717f, 5.568f, 17.717f)
                curveTo(5.451f, 17.717f, 5.389f, 17.7f, 5.284f, 17.654f)
                curveTo(5.192f, 17.613f, 5.145f, 17.6f, 5.044f, 17.6f)
                curveTo(4.877f, 17.6f, 4.71f, 17.637f, 4.542f, 17.712f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(4.542f, 17.376f)
                lineTo(4.498f, 17.269f)
                curveTo(4.679f, 17.188f, 4.862f, 17.147f, 5.044f, 17.147f)
                curveTo(5.162f, 17.147f, 5.224f, 17.164f, 5.328f, 17.21f)
                curveTo(5.42f, 17.251f, 5.468f, 17.264f, 5.568f, 17.264f)
                curveTo(5.669f, 17.264f, 5.717f, 17.251f, 5.809f, 17.21f)
                curveTo(5.913f, 17.164f, 5.975f, 17.147f, 6.093f, 17.147f)
                curveTo(6.275f, 17.147f, 6.457f, 17.188f, 6.639f, 17.269f)
                lineTo(6.595f, 17.376f)
                curveTo(6.427f, 17.301f, 6.26f, 17.264f, 6.093f, 17.264f)
                curveTo(5.992f, 17.264f, 5.944f, 17.277f, 5.853f, 17.318f)
                curveTo(5.748f, 17.364f, 5.686f, 17.381f, 5.568f, 17.381f)
                curveTo(5.451f, 17.381f, 5.389f, 17.364f, 5.284f, 17.318f)
                curveTo(5.192f, 17.277f, 5.145f, 17.264f, 5.044f, 17.264f)
                curveTo(4.877f, 17.264f, 4.71f, 17.301f, 4.542f, 17.376f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(15.984f, 10.272f)
            horizontalLineToRelative(1.12f)
            verticalLineToRelative(5.824f)
            horizontalLineToRelative(-1.12f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(17.552f, 9.264f)
            horizontalLineTo(15.536f)
            verticalLineTo(9.824f)
            horizontalLineTo(15.872f)
            verticalLineTo(10.272f)
            horizontalLineTo(17.216f)
            verticalLineTo(9.824f)
            horizontalLineTo(17.552f)
            verticalLineTo(9.264f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(17.216f, 16.432f)
            horizontalLineTo(17.552f)
            verticalLineTo(16.992f)
            horizontalLineTo(15.536f)
            verticalLineTo(16.432f)
            horizontalLineTo(15.872f)
            verticalLineTo(15.984f)
            horizontalLineTo(17.216f)
            verticalLineTo(16.432f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.544f, 9.376f)
            curveTo(16.788f, 9.376f, 16.813f, 9.284f, 16.956f, 9.147f)
            curveTo(17.068f, 9.041f, 17.328f, 8.909f, 17.328f, 8.76f)
            curveTo(17.328f, 8.42f, 16.977f, 8.144f, 16.544f, 8.144f)
            curveTo(16.111f, 8.144f, 15.76f, 8.42f, 15.76f, 8.76f)
            curveTo(15.76f, 8.926f, 15.939f, 9.036f, 16.074f, 9.147f)
            curveTo(16.217f, 9.264f, 16.322f, 9.376f, 16.544f, 9.376f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.536f, 16.992f)
            horizontalLineTo(17.552f)
            verticalLineTo(17.888f)
            curveTo(17.552f, 17.888f, 17.3f, 17.776f, 17.048f, 17.776f)
            curveTo(16.796f, 17.776f, 16.544f, 17.888f, 16.544f, 17.888f)
            curveTo(16.544f, 17.888f, 16.292f, 17.776f, 16.04f, 17.776f)
            curveTo(15.788f, 17.776f, 15.536f, 17.888f, 15.536f, 17.888f)
            verticalLineTo(16.992f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(15.536f, 16.992f)
                horizontalLineTo(17.552f)
                verticalLineTo(17.888f)
                curveTo(17.552f, 17.888f, 17.3f, 17.776f, 17.048f, 17.776f)
                curveTo(16.796f, 17.776f, 16.544f, 17.888f, 16.544f, 17.888f)
                curveTo(16.544f, 17.888f, 16.292f, 17.776f, 16.04f, 17.776f)
                curveTo(15.788f, 17.776f, 15.536f, 17.888f, 15.536f, 17.888f)
                verticalLineTo(16.992f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(15.518f, 17.712f)
                lineTo(15.474f, 17.605f)
                curveTo(15.655f, 17.524f, 15.838f, 17.483f, 16.02f, 17.483f)
                curveTo(16.138f, 17.483f, 16.199f, 17.5f, 16.304f, 17.546f)
                curveTo(16.396f, 17.587f, 16.444f, 17.6f, 16.544f, 17.6f)
                curveTo(16.645f, 17.6f, 16.693f, 17.587f, 16.785f, 17.546f)
                curveTo(16.889f, 17.5f, 16.951f, 17.483f, 17.069f, 17.483f)
                curveTo(17.251f, 17.483f, 17.433f, 17.524f, 17.615f, 17.605f)
                lineTo(17.571f, 17.712f)
                curveTo(17.403f, 17.637f, 17.236f, 17.6f, 17.069f, 17.6f)
                curveTo(16.968f, 17.6f, 16.92f, 17.613f, 16.829f, 17.654f)
                curveTo(16.724f, 17.7f, 16.662f, 17.717f, 16.544f, 17.717f)
                curveTo(16.427f, 17.717f, 16.365f, 17.7f, 16.26f, 17.654f)
                curveTo(16.168f, 17.613f, 16.121f, 17.6f, 16.02f, 17.6f)
                curveTo(15.853f, 17.6f, 15.686f, 17.637f, 15.518f, 17.712f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(15.518f, 17.376f)
                lineTo(15.474f, 17.269f)
                curveTo(15.655f, 17.188f, 15.838f, 17.147f, 16.02f, 17.147f)
                curveTo(16.138f, 17.147f, 16.199f, 17.164f, 16.304f, 17.21f)
                curveTo(16.396f, 17.251f, 16.444f, 17.264f, 16.544f, 17.264f)
                curveTo(16.645f, 17.264f, 16.693f, 17.251f, 16.785f, 17.21f)
                curveTo(16.889f, 17.164f, 16.951f, 17.147f, 17.069f, 17.147f)
                curveTo(17.251f, 17.147f, 17.433f, 17.188f, 17.615f, 17.269f)
                lineTo(17.571f, 17.376f)
                curveTo(17.403f, 17.301f, 17.236f, 17.264f, 17.069f, 17.264f)
                curveTo(16.968f, 17.264f, 16.92f, 17.277f, 16.829f, 17.318f)
                curveTo(16.724f, 17.364f, 16.662f, 17.381f, 16.544f, 17.381f)
                curveTo(16.427f, 17.381f, 16.365f, 17.364f, 16.26f, 17.318f)
                curveTo(16.168f, 17.277f, 16.121f, 17.264f, 16.02f, 17.264f)
                curveTo(15.853f, 17.264f, 15.686f, 17.301f, 15.518f, 17.376f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.988f, 15.68f)
            curveTo(5.19f, 15.435f, 5.303f, 15.212f, 5.303f, 14.976f)
            curveTo(5.303f, 14.827f, 5.258f, 14.698f, 5.181f, 14.593f)
            lineTo(5.194f, 14.587f)
            curveTo(5.193f, 14.587f, 5.415f, 14.49f, 5.493f, 14.453f)
            curveTo(5.637f, 14.384f, 5.764f, 14.311f, 5.888f, 14.221f)
            curveTo(5.967f, 14.163f, 6.073f, 14.101f, 6.234f, 14.014f)
            curveTo(6.262f, 13.999f, 6.338f, 13.959f, 6.386f, 13.933f)
            lineTo(6.427f, 13.911f)
            curveTo(6.505f, 13.87f, 6.564f, 13.837f, 6.618f, 13.806f)
            curveTo(6.787f, 13.708f, 6.899f, 13.627f, 6.985f, 13.518f)
            curveTo(7.187f, 13.262f, 7.145f, 12.913f, 6.861f, 12.72f)
            curveTo(6.722f, 12.625f, 6.535f, 12.571f, 6.26f, 12.528f)
            lineTo(6.203f, 12.52f)
            curveTo(6.109f, 12.505f, 5.928f, 12.477f, 5.866f, 12.467f)
            curveTo(5.735f, 12.447f, 5.617f, 12.427f, 5.513f, 12.409f)
            curveTo(6.201f, 12.295f, 7.184f, 12.337f, 7.617f, 12.56f)
            lineTo(8.028f, 11.764f)
            curveTo(7.147f, 11.309f, 5.138f, 11.355f, 4.388f, 11.872f)
            curveTo(3.838f, 12.251f, 3.912f, 12.824f, 4.484f, 13.07f)
            curveTo(4.724f, 13.173f, 5.035f, 13.242f, 5.612f, 13.334f)
            curveTo(5.516f, 13.391f, 5.436f, 13.442f, 5.361f, 13.496f)
            curveTo(5.285f, 13.551f, 5.204f, 13.598f, 5.106f, 13.645f)
            curveTo(5.058f, 13.668f, 4.919f, 13.729f, 4.855f, 13.757f)
            lineTo(4.855f, 13.757f)
            lineTo(4.855f, 13.757f)
            lineTo(4.823f, 13.771f)
            curveTo(4.357f, 13.983f, 4.13f, 14.276f, 4.198f, 14.806f)
            lineTo(4.235f, 15.092f)
            lineTo(4.3f, 15.113f)
            lineTo(4.988f, 15.68f)
            close()
            moveTo(4.412f, 14.939f)
            lineTo(4.41f, 14.943f)
            lineTo(4.411f, 14.941f)
            lineTo(4.412f, 14.939f)
            close()
            moveTo(16.706f, 14.976f)
            curveTo(16.706f, 15.212f, 16.819f, 15.435f, 17.021f, 15.68f)
            lineTo(17.709f, 15.113f)
            lineTo(17.774f, 15.092f)
            lineTo(17.811f, 14.806f)
            curveTo(17.878f, 14.276f, 17.652f, 13.983f, 17.186f, 13.771f)
            lineTo(17.154f, 13.757f)
            curveTo(17.09f, 13.729f, 16.95f, 13.668f, 16.903f, 13.645f)
            curveTo(16.805f, 13.598f, 16.724f, 13.551f, 16.648f, 13.496f)
            curveTo(16.573f, 13.442f, 16.493f, 13.391f, 16.396f, 13.334f)
            curveTo(16.973f, 13.242f, 17.285f, 13.173f, 17.524f, 13.07f)
            curveTo(18.097f, 12.824f, 18.171f, 12.251f, 17.621f, 11.872f)
            curveTo(16.87f, 11.355f, 14.862f, 11.309f, 13.981f, 11.764f)
            lineTo(14.392f, 12.56f)
            curveTo(14.825f, 12.337f, 15.808f, 12.295f, 16.496f, 12.409f)
            curveTo(16.392f, 12.427f, 16.274f, 12.447f, 16.142f, 12.467f)
            curveTo(16.081f, 12.477f, 15.9f, 12.505f, 15.806f, 12.52f)
            lineTo(15.806f, 12.52f)
            lineTo(15.749f, 12.528f)
            curveTo(15.474f, 12.571f, 15.286f, 12.625f, 15.148f, 12.72f)
            curveTo(14.864f, 12.913f, 14.822f, 13.262f, 15.024f, 13.518f)
            curveTo(15.11f, 13.627f, 15.222f, 13.708f, 15.391f, 13.806f)
            curveTo(15.445f, 13.837f, 15.503f, 13.87f, 15.582f, 13.911f)
            lineTo(15.623f, 13.933f)
            curveTo(15.671f, 13.959f, 15.747f, 13.999f, 15.774f, 14.014f)
            curveTo(15.936f, 14.101f, 16.042f, 14.163f, 16.121f, 14.221f)
            curveTo(16.245f, 14.311f, 16.372f, 14.384f, 16.516f, 14.453f)
            curveTo(16.594f, 14.49f, 16.816f, 14.587f, 16.815f, 14.587f)
            lineTo(16.828f, 14.593f)
            curveTo(16.75f, 14.698f, 16.706f, 14.827f, 16.706f, 14.976f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(5.923f, 12.4f)
            lineTo(6.254f, 12.468f)
            verticalLineTo(12.961f)
            curveTo(5.902f, 13.242f, 5.008f, 13.716f, 5.008f, 13.716f)
            verticalLineTo(12.4f)
            horizontalLineTo(5.923f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(16.315f, 12.4f)
            lineTo(15.984f, 12.468f)
            verticalLineTo(12.961f)
            curveTo(16.336f, 13.242f, 17.23f, 13.716f, 17.23f, 13.716f)
            verticalLineTo(12.4f)
            horizontalLineTo(16.315f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.776f, 7.206f)
            verticalLineTo(7.042f)
            curveTo(14.2f, 6.629f, 13.597f, 6.422f, 12.966f, 6.422f)
            curveTo(12.362f, 6.154f, 11.75f, 6.051f, 11.131f, 6.11f)
            curveTo(11.131f, 6.108f, 11.131f, 6.107f, 11.131f, 6.107f)
            curveTo(10.2f, 6.016f, 9.262f, 6.422f, 9.262f, 6.422f)
            curveTo(8.316f, 6.422f, 7.452f, 7.042f, 7.452f, 7.042f)
            verticalLineTo(7.206f)
            lineTo(8.582f, 8.34f)
            curveTo(8.582f, 8.34f, 8.9f, 9.432f, 11.127f, 9.176f)
            verticalLineTo(9.179f)
            curveTo(11.127f, 9.179f, 12.601f, 9.138f, 12.705f, 9.104f)
            curveTo(12.746f, 9.09f, 12.788f, 9.078f, 12.832f, 9.065f)
            curveTo(13.121f, 8.981f, 13.45f, 8.885f, 13.646f, 8.34f)
            lineTo(14.776f, 7.206f)
            close()
            moveTo(11.127f, 6.161f)
            curveTo(11.094f, 6.538f, 10.911f, 8.815f, 11.127f, 9.168f)
            verticalLineTo(6.161f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.314f, 8.15f)
            lineTo(8.314f, 8.146f)
            lineTo(7.52f, 7.398f)
            lineTo(7.597f, 7.317f)
            lineTo(8.342f, 8.018f)
            lineTo(8.361f, 7.931f)
            curveTo(8.483f, 7.957f, 8.573f, 7.967f, 8.624f, 7.961f)
            verticalLineTo(7.809f)
            lineTo(8.79f, 7.899f)
            curveTo(8.871f, 7.943f, 8.988f, 7.955f, 9.141f, 7.93f)
            curveTo(9.254f, 7.911f, 9.33f, 7.78f, 9.354f, 7.502f)
            lineTo(9.405f, 6.939f)
            lineTo(9.573f, 7.478f)
            curveTo(9.649f, 7.722f, 9.765f, 7.83f, 9.931f, 7.83f)
            curveTo(10.092f, 7.83f, 10.157f, 7.771f, 10.164f, 7.621f)
            lineTo(10.185f, 7.198f)
            lineTo(10.376f, 7.576f)
            curveTo(10.445f, 7.712f, 10.54f, 7.774f, 10.675f, 7.774f)
            curveTo(10.869f, 7.774f, 10.998f, 7.613f, 10.998f, 7.36f)
            horizontalLineTo(11.002f)
            horizontalLineTo(11.222f)
            horizontalLineTo(11.226f)
            curveTo(11.226f, 7.613f, 11.355f, 7.774f, 11.548f, 7.774f)
            curveTo(11.684f, 7.774f, 11.779f, 7.712f, 11.848f, 7.576f)
            lineTo(12.039f, 7.198f)
            lineTo(12.06f, 7.621f)
            curveTo(12.067f, 7.771f, 12.132f, 7.83f, 12.293f, 7.83f)
            curveTo(12.459f, 7.83f, 12.575f, 7.722f, 12.651f, 7.478f)
            lineTo(12.819f, 6.939f)
            lineTo(12.869f, 7.502f)
            curveTo(12.894f, 7.78f, 12.97f, 7.911f, 13.083f, 7.93f)
            curveTo(13.236f, 7.955f, 13.353f, 7.943f, 13.434f, 7.899f)
            lineTo(13.599f, 7.809f)
            verticalLineTo(7.961f)
            curveTo(13.651f, 7.967f, 13.741f, 7.957f, 13.863f, 7.931f)
            lineTo(13.898f, 8.094f)
            lineTo(14.723f, 7.317f)
            lineTo(14.8f, 7.398f)
            lineTo(13.773f, 8.365f)
            curveTo(13.623f, 8.641f, 13.547f, 8.823f, 13.547f, 8.899f)
            curveTo(13.547f, 9.014f, 13.247f, 9.083f, 12.661f, 9.153f)
            curveTo(12.202f, 9.208f, 11.66f, 9.245f, 11.216f, 9.251f)
            verticalLineTo(9.252f)
            lineTo(11.16f, 9.251f)
            lineTo(11.104f, 9.252f)
            verticalLineTo(9.251f)
            curveTo(10.66f, 9.245f, 10.118f, 9.208f, 9.659f, 9.153f)
            curveTo(9.073f, 9.083f, 8.772f, 9.014f, 8.772f, 8.899f)
            curveTo(8.772f, 8.885f, 8.77f, 8.866f, 8.764f, 8.845f)
            curveTo(8.705f, 8.769f, 8.664f, 8.646f, 8.636f, 8.535f)
            curveTo(8.61f, 8.483f, 8.58f, 8.426f, 8.547f, 8.365f)
            lineTo(8.319f, 8.151f)
            lineTo(8.314f, 8.15f)
            close()
            moveTo(13.819f, 8.168f)
            curveTo(13.636f, 8.2f, 13.503f, 8.197f, 13.433f, 8.14f)
            curveTo(13.323f, 8.172f, 13.194f, 8.175f, 13.047f, 8.151f)
            curveTo(12.89f, 8.125f, 12.78f, 8.021f, 12.714f, 7.847f)
            curveTo(12.628f, 7.957f, 12.519f, 8.024f, 12.389f, 8.046f)
            curveTo(13.106f, 8.148f, 13.608f, 8.291f, 13.608f, 8.291f)
            curveTo(13.608f, 8.291f, 13.596f, 8.397f, 13.566f, 8.522f)
            curveTo(13.597f, 8.456f, 13.635f, 8.384f, 13.679f, 8.304f)
            lineTo(13.69f, 8.29f)
            lineTo(13.819f, 8.168f)
            close()
            moveTo(12.051f, 8.004f)
            curveTo(11.989f, 7.973f, 11.939f, 7.928f, 11.903f, 7.87f)
            curveTo(11.849f, 7.917f, 11.789f, 7.951f, 11.721f, 7.973f)
            curveTo(11.834f, 7.981f, 11.944f, 7.992f, 12.051f, 8.004f)
            close()
            moveTo(11.326f, 7.951f)
            curveTo(11.239f, 7.911f, 11.166f, 7.846f, 11.112f, 7.763f)
            curveTo(11.058f, 7.846f, 10.986f, 7.91f, 10.9f, 7.95f)
            curveTo(10.951f, 7.949f, 11.002f, 7.948f, 11.054f, 7.947f)
            verticalLineTo(7.946f)
            lineTo(11.099f, 7.947f)
            lineTo(11.144f, 7.946f)
            verticalLineTo(7.947f)
            curveTo(11.205f, 7.948f, 11.266f, 7.949f, 11.326f, 7.951f)
            close()
            moveTo(8.622f, 8.282f)
            lineTo(8.518f, 8.184f)
            curveTo(8.643f, 8.196f, 8.736f, 8.184f, 8.791f, 8.14f)
            curveTo(8.901f, 8.172f, 9.03f, 8.175f, 9.177f, 8.151f)
            curveTo(9.334f, 8.125f, 9.444f, 8.021f, 9.509f, 7.847f)
            curveTo(9.593f, 7.953f, 9.698f, 8.02f, 9.823f, 8.044f)
            curveTo(9.205f, 8.131f, 8.744f, 8.249f, 8.622f, 8.282f)
            close()
            moveTo(10.498f, 7.971f)
            curveTo(10.389f, 7.979f, 10.283f, 7.989f, 10.18f, 8f)
            curveTo(10.239f, 7.969f, 10.286f, 7.926f, 10.321f, 7.87f)
            curveTo(10.373f, 7.916f, 10.432f, 7.95f, 10.498f, 7.971f)
            close()
            moveTo(13.253f, 8.901f)
            curveTo(13.332f, 8.938f, 13.394f, 8.901f, 13.444f, 8.831f)
            curveTo(13.44f, 8.85f, 13.437f, 8.868f, 13.436f, 8.884f)
            curveTo(13.429f, 8.888f, 13.419f, 8.893f, 13.406f, 8.899f)
            curveTo(13.369f, 8.914f, 13.313f, 8.931f, 13.24f, 8.947f)
            curveTo(13.096f, 8.98f, 12.891f, 9.013f, 12.648f, 9.042f)
            curveTo(12.173f, 9.099f, 11.609f, 9.137f, 11.16f, 9.139f)
            curveTo(10.711f, 9.137f, 10.147f, 9.099f, 9.672f, 9.042f)
            curveTo(9.429f, 9.013f, 9.224f, 8.98f, 9.08f, 8.947f)
            curveTo(9.019f, 8.933f, 8.969f, 8.919f, 8.933f, 8.906f)
            curveTo(8.937f, 8.905f, 8.941f, 8.903f, 8.945f, 8.901f)
            curveTo(9.19f, 8.787f, 10.808f, 8.679f, 11.099f, 8.661f)
            curveTo(11.391f, 8.679f, 13.008f, 8.787f, 13.253f, 8.901f)
            close()
            moveTo(13.561f, 8.881f)
            lineTo(13.56f, 8.882f)
            lineTo(13.561f, 8.881f)
            lineTo(13.562f, 8.881f)
            lineTo(13.561f, 8.881f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.112f, 5.347f)
            curveTo(11.298f, 5.347f, 11.448f, 5.197f, 11.448f, 5.011f)
            curveTo(11.448f, 4.826f, 11.298f, 4.675f, 11.112f, 4.675f)
            curveTo(10.927f, 4.675f, 10.776f, 4.826f, 10.776f, 5.011f)
            curveTo(10.776f, 5.197f, 10.927f, 5.347f, 11.112f, 5.347f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.894f, 6.997f)
            curveTo(10.901f, 7.034f, 10.912f, 7.068f, 10.926f, 7.099f)
            curveTo(10.883f, 7.082f, 10.831f, 7.072f, 10.776f, 7.072f)
            curveTo(10.622f, 7.072f, 10.496f, 7.148f, 10.496f, 7.24f)
            curveTo(10.496f, 7.333f, 10.622f, 7.408f, 10.776f, 7.408f)
            curveTo(10.931f, 7.408f, 11.056f, 7.333f, 11.056f, 7.24f)
            curveTo(11.056f, 7.333f, 11.182f, 7.408f, 11.336f, 7.408f)
            curveTo(11.491f, 7.408f, 11.616f, 7.333f, 11.616f, 7.24f)
            curveTo(11.616f, 7.148f, 11.491f, 7.072f, 11.336f, 7.072f)
            curveTo(11.297f, 7.072f, 11.26f, 7.077f, 11.226f, 7.086f)
            curveTo(11.234f, 7.04f, 11.234f, 6.987f, 11.224f, 6.933f)
            curveTo(11.194f, 6.781f, 11.096f, 6.672f, 11.005f, 6.69f)
            curveTo(10.914f, 6.708f, 10.864f, 6.845f, 10.894f, 6.997f)
            close()
            moveTo(11.056f, 7.24f)
            lineTo(11.056f, 7.235f)
            lineTo(11.056f, 7.235f)
            lineTo(11.056f, 7.24f)
            close()
            moveTo(9.246f, 7.211f)
            curveTo(9.232f, 7.18f, 9.221f, 7.146f, 9.214f, 7.109f)
            curveTo(9.184f, 6.957f, 9.234f, 6.82f, 9.325f, 6.802f)
            curveTo(9.416f, 6.784f, 9.514f, 6.893f, 9.544f, 7.045f)
            curveTo(9.554f, 7.099f, 9.555f, 7.152f, 9.546f, 7.198f)
            curveTo(9.58f, 7.189f, 9.617f, 7.184f, 9.656f, 7.184f)
            curveTo(9.811f, 7.184f, 9.936f, 7.26f, 9.936f, 7.352f)
            curveTo(9.936f, 7.445f, 9.811f, 7.52f, 9.656f, 7.52f)
            curveTo(9.501f, 7.52f, 9.376f, 7.445f, 9.376f, 7.352f)
            lineTo(9.376f, 7.347f)
            lineTo(9.376f, 7.347f)
            lineTo(9.376f, 7.352f)
            curveTo(9.376f, 7.445f, 9.251f, 7.52f, 9.096f, 7.52f)
            curveTo(8.941f, 7.52f, 8.816f, 7.445f, 8.816f, 7.352f)
            curveTo(8.816f, 7.26f, 8.941f, 7.184f, 9.096f, 7.184f)
            curveTo(9.151f, 7.184f, 9.203f, 7.194f, 9.246f, 7.211f)
            close()
            moveTo(12.754f, 7.313f)
            curveTo(12.741f, 7.405f, 12.606f, 7.462f, 12.453f, 7.44f)
            curveTo(12.3f, 7.419f, 12.187f, 7.327f, 12.2f, 7.235f)
            curveTo(12.212f, 7.143f, 12.347f, 7.086f, 12.5f, 7.108f)
            curveTo(12.555f, 7.115f, 12.604f, 7.132f, 12.645f, 7.154f)
            curveTo(12.635f, 7.122f, 12.629f, 7.087f, 12.627f, 7.049f)
            curveTo(12.619f, 6.895f, 12.688f, 6.766f, 12.78f, 6.761f)
            curveTo(12.873f, 6.756f, 12.955f, 6.877f, 12.963f, 7.032f)
            curveTo(12.966f, 7.087f, 12.959f, 7.139f, 12.944f, 7.184f)
            curveTo(12.979f, 7.18f, 13.016f, 7.18f, 13.055f, 7.186f)
            curveTo(13.208f, 7.207f, 13.321f, 7.299f, 13.309f, 7.391f)
            curveTo(13.296f, 7.483f, 13.161f, 7.54f, 13.008f, 7.518f)
            curveTo(12.855f, 7.497f, 12.741f, 7.405f, 12.754f, 7.313f)
            close()
            moveTo(12.754f, 7.313f)
            lineTo(12.755f, 7.308f)
            lineTo(12.755f, 7.308f)
            lineTo(12.754f, 7.313f)
            close()
            moveTo(13.82f, 7.757f)
            curveTo(13.957f, 7.83f, 14.103f, 7.822f, 14.146f, 7.74f)
            lineTo(14.149f, 7.736f)
            curveTo(14.162f, 7.75f, 14.178f, 7.76f, 14.196f, 7.766f)
            curveTo(14.285f, 7.793f, 14.394f, 7.695f, 14.439f, 7.547f)
            curveTo(14.484f, 7.399f, 14.449f, 7.258f, 14.36f, 7.23f)
            curveTo(14.271f, 7.203f, 14.163f, 7.301f, 14.118f, 7.449f)
            curveTo(14.107f, 7.485f, 14.1f, 7.521f, 14.099f, 7.554f)
            curveTo(14.068f, 7.519f, 14.027f, 7.486f, 13.978f, 7.461f)
            curveTo(13.842f, 7.388f, 13.696f, 7.396f, 13.652f, 7.477f)
            curveTo(13.608f, 7.559f, 13.684f, 7.685f, 13.82f, 7.757f)
            close()
            moveTo(8.325f, 7.792f)
            curveTo(8.188f, 7.864f, 8.042f, 7.857f, 7.999f, 7.775f)
            curveTo(7.998f, 7.773f, 7.997f, 7.772f, 7.997f, 7.77f)
            curveTo(7.983f, 7.784f, 7.967f, 7.795f, 7.949f, 7.8f)
            curveTo(7.86f, 7.827f, 7.752f, 7.729f, 7.706f, 7.582f)
            curveTo(7.661f, 7.434f, 7.697f, 7.292f, 7.785f, 7.265f)
            curveTo(7.874f, 7.238f, 7.983f, 7.335f, 8.028f, 7.483f)
            curveTo(8.039f, 7.519f, 8.045f, 7.555f, 8.047f, 7.588f)
            curveTo(8.077f, 7.553f, 8.118f, 7.521f, 8.167f, 7.495f)
            curveTo(8.304f, 7.422f, 8.45f, 7.43f, 8.493f, 7.512f)
            curveTo(8.537f, 7.594f, 8.461f, 7.719f, 8.325f, 7.792f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.987f, 4.077f)
            horizontalLineTo(11.22f)
            verticalLineTo(4.224f)
            horizontalLineTo(11.373f)
            verticalLineTo(4.457f)
            horizontalLineTo(11.22f)
            verticalLineTo(4.924f)
            horizontalLineTo(11.373f)
            verticalLineTo(5.157f)
            horizontalLineTo(10.832f)
            verticalLineTo(4.924f)
            horizontalLineTo(10.987f)
            verticalLineTo(4.457f)
            horizontalLineTo(10.832f)
            verticalLineTo(4.224f)
            horizontalLineTo(10.987f)
            verticalLineTo(4.077f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(10.944f, 5.344f)
            horizontalLineToRelative(0.448f)
            verticalLineToRelative(1.456f)
            horizontalLineToRelative(-0.448f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(9.141f, 5.588f)
            lineTo(9.139f, 5.7f)
            curveTo(8.146f, 5.682f, 7.576f, 5.827f, 7.431f, 6.116f)
            curveTo(7.282f, 6.415f, 7.31f, 6.778f, 7.519f, 7.209f)
            lineTo(7.418f, 7.258f)
            curveTo(7.195f, 6.798f, 7.164f, 6.399f, 7.331f, 6.066f)
            curveTo(7.503f, 5.723f, 8.106f, 5.57f, 9.141f, 5.588f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(9.333f, 6.581f)
            lineTo(9.275f, 6.677f)
            curveTo(9.059f, 6.548f, 8.951f, 6.328f, 8.951f, 6.024f)
            curveTo(8.951f, 5.587f, 9.176f, 5.332f, 9.673f, 5.156f)
            curveTo(9.991f, 5.045f, 10.424f, 5.09f, 10.975f, 5.29f)
            lineTo(10.937f, 5.395f)
            curveTo(10.408f, 5.204f, 9.999f, 5.16f, 9.71f, 5.262f)
            curveTo(9.254f, 5.423f, 9.063f, 5.64f, 9.063f, 6.024f)
            curveTo(9.063f, 6.29f, 9.153f, 6.473f, 9.333f, 6.581f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(7.66f, 7.037f)
            lineTo(7.449f, 7.112f)
            curveTo(7.23f, 6.487f, 7.292f, 6.063f, 7.667f, 5.88f)
            curveTo(7.997f, 5.719f, 8.478f, 5.654f, 9.113f, 5.679f)
            lineTo(9.104f, 5.903f)
            curveTo(8.503f, 5.879f, 8.056f, 5.94f, 7.765f, 6.082f)
            curveTo(7.519f, 6.202f, 7.474f, 6.507f, 7.66f, 7.037f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(10.129f, 5.439f)
            curveTo(9.617f, 5.439f, 9.407f, 5.563f, 9.287f, 5.932f)
            curveTo(9.21f, 6.166f, 9.285f, 6.367f, 9.525f, 6.554f)
            lineTo(9.388f, 6.731f)
            curveTo(9.076f, 6.489f, 8.966f, 6.192f, 9.074f, 5.862f)
            curveTo(9.227f, 5.393f, 9.527f, 5.215f, 10.129f, 5.215f)
            curveTo(10.524f, 5.215f, 10.831f, 5.318f, 11.045f, 5.529f)
            lineTo(11.079f, 5.562f)
            verticalLineTo(6.642f)
            horizontalLineTo(10.855f)
            verticalLineTo(5.658f)
            curveTo(10.688f, 5.513f, 10.448f, 5.439f, 10.129f, 5.439f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(13.049f, 5.7f)
            lineTo(13.051f, 5.812f)
            curveTo(14.044f, 5.794f, 14.614f, 5.939f, 14.759f, 6.228f)
            curveTo(14.908f, 6.527f, 14.88f, 6.89f, 14.671f, 7.321f)
            lineTo(14.771f, 7.37f)
            curveTo(14.995f, 6.91f, 15.025f, 6.511f, 14.859f, 6.178f)
            curveTo(14.687f, 5.835f, 14.084f, 5.682f, 13.049f, 5.7f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(12.698f, 6.604f)
            lineTo(12.756f, 6.7f)
            curveTo(12.972f, 6.571f, 13.08f, 6.351f, 13.08f, 6.047f)
            curveTo(13.08f, 5.611f, 12.856f, 5.355f, 12.358f, 5.18f)
            curveTo(12.041f, 5.068f, 11.607f, 5.114f, 11.056f, 5.313f)
            lineTo(11.094f, 5.419f)
            curveTo(11.623f, 5.227f, 12.033f, 5.184f, 12.321f, 5.285f)
            curveTo(12.777f, 5.446f, 12.968f, 5.664f, 12.968f, 6.047f)
            curveTo(12.968f, 6.314f, 12.878f, 6.497f, 12.698f, 6.604f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(14.599f, 7.149f)
            lineTo(14.811f, 7.224f)
            curveTo(15.03f, 6.599f, 14.967f, 6.175f, 14.593f, 5.992f)
            curveTo(14.262f, 5.831f, 13.781f, 5.766f, 13.147f, 5.791f)
            lineTo(13.156f, 6.015f)
            curveTo(13.757f, 5.991f, 14.204f, 6.052f, 14.494f, 6.194f)
            curveTo(14.741f, 6.314f, 14.786f, 6.619f, 14.599f, 7.149f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(12.117f, 5.456f)
            curveTo(12.63f, 5.456f, 12.84f, 5.581f, 12.96f, 5.949f)
            curveTo(13.037f, 6.184f, 12.962f, 6.384f, 12.722f, 6.571f)
            lineTo(12.859f, 6.748f)
            curveTo(13.171f, 6.506f, 13.281f, 6.209f, 13.173f, 5.88f)
            curveTo(13.02f, 5.41f, 12.719f, 5.232f, 12.117f, 5.232f)
            curveTo(11.723f, 5.232f, 11.415f, 5.336f, 11.201f, 5.547f)
            lineTo(11.168f, 5.58f)
            verticalLineTo(6.659f)
            horizontalLineTo(11.392f)
            verticalLineTo(5.675f)
            curveTo(11.559f, 5.53f, 11.799f, 5.456f, 12.117f, 5.456f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE1E5E8)),
            fillAlpha = 0.3f,
            strokeAlpha = 0.3f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.472f, 9.264f)
            horizontalLineTo(14.752f)
            verticalLineTo(15.805f)
            curveTo(14.752f, 15.805f, 14.211f, 18f, 11.112f, 18f)
            curveTo(8.013f, 18f, 7.472f, 15.747f, 7.472f, 15.747f)
            verticalLineTo(9.264f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(7.472f, 9.264f)
                horizontalLineTo(14.752f)
                verticalLineTo(15.805f)
                curveTo(14.752f, 15.805f, 14.211f, 18f, 11.112f, 18f)
                curveTo(8.013f, 18f, 7.472f, 15.747f, 7.472f, 15.747f)
                verticalLineTo(9.264f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFFC034))) {
                moveTo(7.472f, 13.296f)
                horizontalLineToRelative(3.696f)
                verticalLineToRelative(4.368f)
                horizontalLineToRelative(-3.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(7.92f, 13.52f)
                horizontalLineToRelative(0.448f)
                verticalLineToRelative(4.144f)
                horizontalLineToRelative(-0.448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(9.488f, 13.52f)
                horizontalLineToRelative(0.448f)
                verticalLineToRelative(4.144f)
                horizontalLineToRelative(-0.448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(8.704f, 13.52f)
                horizontalLineToRelative(0.448f)
                verticalLineToRelative(4.144f)
                horizontalLineToRelative(-0.448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(10.272f, 13.52f)
                horizontalLineToRelative(0.448f)
                verticalLineToRelative(4.144f)
                horizontalLineToRelative(-0.448f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(7.472f, 9.152f)
                horizontalLineToRelative(3.696f)
                verticalLineToRelative(4.256f)
                horizontalLineToRelative(-3.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(11.056f, 13.184f)
                horizontalLineToRelative(3.696f)
                verticalLineToRelative(4.256f)
                horizontalLineToRelative(-3.696f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(11.056f, 9.264f)
                horizontalLineToRelative(3.92f)
                verticalLineToRelative(4.144f)
                horizontalLineToRelative(-3.92f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.04f, 9.6f)
                horizontalLineTo(9.376f)
                verticalLineTo(10.529f)
                horizontalLineTo(9.6f)
                verticalLineTo(10.065f)
                horizontalLineTo(9.936f)
                verticalLineTo(10.529f)
                horizontalLineTo(10.272f)
                verticalLineTo(11.11f)
                horizontalLineTo(9.936f)
                verticalLineTo(12.155f)
                horizontalLineTo(10.272f)
                verticalLineTo(12.736f)
                horizontalLineTo(8.256f)
                verticalLineTo(12.155f)
                horizontalLineTo(8.592f)
                verticalLineTo(11.11f)
                horizontalLineTo(8.256f)
                verticalLineTo(10.529f)
                horizontalLineTo(8.48f)
                verticalLineTo(10.065f)
                horizontalLineTo(8.816f)
                verticalLineTo(10.529f)
                horizontalLineTo(9.04f)
                verticalLineTo(9.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC88A02))) {
                moveTo(12.979f, 9.795f)
                lineTo(13.208f, 9.55f)
                lineTo(13.69f, 9.999f)
                lineTo(13.46f, 10.245f)
                lineTo(12.979f, 9.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.36f, 16.14f)
                verticalLineTo(13.688f)
                horizontalLineTo(11.56f)
                verticalLineTo(16.12f)
                lineTo(11.564f, 16.139f)
                curveTo(11.706f, 16.743f, 12.189f, 17.048f, 12.96f, 17.048f)
                curveTo(13.73f, 17.048f, 14.213f, 16.75f, 14.355f, 16.16f)
                lineTo(14.36f, 16.14f)
                close()
                moveTo(12.96f, 16.712f)
                curveTo(12.341f, 16.712f, 12.003f, 16.504f, 11.896f, 16.08f)
                verticalLineTo(14.024f)
                horizontalLineTo(14.024f)
                verticalLineTo(16.099f)
                curveTo(13.917f, 16.509f, 13.579f, 16.712f, 12.96f, 16.712f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.076f, 13.893f)
                horizontalLineTo(12.842f)
                verticalLineTo(15.005f)
                lineTo(11.922f, 14.004f)
                lineTo(11.758f, 14.156f)
                lineTo(12.589f, 15.061f)
                horizontalLineTo(11.836f)
                verticalLineTo(15.396f)
                horizontalLineTo(12.415f)
                horizontalLineTo(12.608f)
                lineTo(11.758f, 16.321f)
                lineTo(11.922f, 16.473f)
                lineTo(12.842f, 15.472f)
                verticalLineTo(16.772f)
                horizontalLineTo(13.076f)
                verticalLineTo(15.589f)
                lineTo(13.888f, 16.473f)
                lineTo(14.053f, 16.321f)
                lineTo(13.203f, 15.396f)
                horizontalLineTo(14.152f)
                verticalLineTo(15.061f)
                horizontalLineTo(13.221f)
                lineTo(14.053f, 14.156f)
                lineTo(13.888f, 14.004f)
                lineTo(13.076f, 14.888f)
                verticalLineTo(13.893f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.483f, 17.443f)
                curveTo(13.483f, 17.443f, 11.111f, 17.629f, 11.111f, 16.099f)
                curveTo(11.111f, 16.099f, 11.088f, 17.443f, 8.611f, 17.443f)
                verticalLineTo(18.65f)
                horizontalLineTo(13.483f)
                verticalLineTo(17.443f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                stroke = SolidColor(Color(0xFFAD1619)),
                strokeLineWidth = 1.16667f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.112f, 14.192f)
                curveTo(11.576f, 14.192f, 11.952f, 13.791f, 11.952f, 13.296f)
                curveTo(11.952f, 12.801f, 11.576f, 12.4f, 11.112f, 12.4f)
                curveTo(10.648f, 12.4f, 10.272f, 12.801f, 10.272f, 13.296f)
                curveTo(10.272f, 13.791f, 10.648f, 14.192f, 11.112f, 14.192f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SpainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Spain,
            contentDescription = "Spain Flag"
        )
    }
}
