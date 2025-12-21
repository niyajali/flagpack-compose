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
 * Cyprus Flag (32x24dp)
 *
 * - ISO Alpha-2: CY
 * - ISO Alpha-3: CYP
 * - ISO Numeric: 196
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Cyprus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cyprus:CY:CYP:196:Large",
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
                fill = SolidColor(Color(0xFF006B49)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.6f, 14.321f)
                curveTo(7.172f, 14.023f, 7.364f, 13.37f, 7.364f, 13.37f)
                curveTo(7.364f, 13.37f, 8f, 13.731f, 8.222f, 13.899f)
                curveTo(8.445f, 14.067f, 8.606f, 14.758f, 8.606f, 14.758f)
                curveTo(8.606f, 14.758f, 8.028f, 14.618f, 7.6f, 14.321f)
                close()
                moveTo(8.744f, 15.254f)
                curveTo(8.722f, 15.066f, 8.775f, 14.897f, 8.775f, 14.897f)
                curveTo(8.775f, 14.897f, 9.312f, 15.184f, 9.5f, 15.317f)
                curveTo(9.688f, 15.45f, 9.823f, 15.999f, 9.823f, 15.999f)
                curveTo(9.823f, 15.999f, 9.335f, 15.888f, 8.974f, 15.651f)
                curveTo(8.843f, 15.566f, 8.78f, 15.442f, 8.755f, 15.32f)
                curveTo(8.647f, 15.354f, 8.371f, 15.425f, 8.088f, 15.398f)
                curveTo(7.723f, 15.363f, 7.46f, 14.851f, 7.46f, 14.851f)
                curveTo(7.46f, 14.851f, 7.957f, 14.849f, 8.154f, 14.876f)
                curveTo(8.307f, 14.897f, 8.615f, 15.145f, 8.744f, 15.254f)
                close()
                moveTo(10.435f, 16.23f)
                curveTo(10.435f, 16.23f, 10.474f, 16.767f, 10.863f, 16.877f)
                curveTo(11.252f, 16.987f, 11.706f, 16.94f, 11.706f, 16.94f)
                curveTo(11.706f, 16.94f, 11.403f, 16.466f, 11.197f, 16.4f)
                curveTo(10.991f, 16.333f, 10.435f, 16.23f, 10.435f, 16.23f)
                close()
                moveTo(12.741f, 17.669f)
                curveTo(12.339f, 17.628f, 12.208f, 17.106f, 12.208f, 17.106f)
                curveTo(12.208f, 17.106f, 12.773f, 17.11f, 12.987f, 17.14f)
                curveTo(13.202f, 17.17f, 13.583f, 17.584f, 13.583f, 17.584f)
                curveTo(13.583f, 17.584f, 13.144f, 17.709f, 12.741f, 17.669f)
                close()
                moveTo(13.455f, 16.701f)
                curveTo(13.455f, 16.701f, 13.401f, 17.328f, 13.805f, 17.538f)
                curveTo(14.209f, 17.749f, 14.712f, 17.792f, 14.712f, 17.792f)
                curveTo(14.712f, 17.792f, 14.467f, 17.181f, 14.254f, 17.06f)
                curveTo(14.042f, 16.939f, 13.455f, 16.701f, 13.455f, 16.701f)
                close()
                moveTo(13.738f, 18.302f)
                curveTo(13.292f, 18.393f, 12.939f, 17.872f, 12.939f, 17.872f)
                curveTo(12.939f, 17.872f, 13.545f, 17.687f, 13.786f, 17.648f)
                curveTo(14.028f, 17.608f, 14.603f, 17.928f, 14.603f, 17.928f)
                curveTo(14.603f, 17.928f, 14.184f, 18.211f, 13.738f, 18.302f)
                close()
                moveTo(10.511f, 17.177f)
                curveTo(10.511f, 17.177f, 10.723f, 17.672f, 11.126f, 17.649f)
                curveTo(11.53f, 17.627f, 11.944f, 17.434f, 11.944f, 17.434f)
                curveTo(11.944f, 17.434f, 11.503f, 17.085f, 11.287f, 17.089f)
                curveTo(11.07f, 17.093f, 10.511f, 17.177f, 10.511f, 17.177f)
                close()
                moveTo(11.683f, 16.609f)
                curveTo(11.322f, 16.427f, 11.387f, 15.892f, 11.387f, 15.892f)
                curveTo(11.387f, 15.892f, 11.913f, 16.099f, 12.102f, 16.204f)
                curveTo(12.291f, 16.309f, 12.499f, 16.832f, 12.499f, 16.832f)
                curveTo(12.499f, 16.832f, 12.044f, 16.791f, 11.683f, 16.609f)
                close()
                moveTo(9.65f, 14.653f)
                curveTo(9.65f, 14.653f, 9.651f, 15.314f, 9.922f, 15.572f)
                curveTo(10.194f, 15.83f, 10.52f, 15.92f, 10.52f, 15.92f)
                curveTo(10.52f, 15.92f, 10.327f, 15.251f, 10.184f, 15.104f)
                curveTo(10.04f, 14.957f, 9.65f, 14.653f, 9.65f, 14.653f)
                close()
                moveTo(8.654f, 16.113f)
                curveTo(8.654f, 16.113f, 9.059f, 16.641f, 9.477f, 16.614f)
                curveTo(9.895f, 16.587f, 10.262f, 16.378f, 10.262f, 16.378f)
                curveTo(10.262f, 16.378f, 9.667f, 16.008f, 9.44f, 16.014f)
                curveTo(9.213f, 16.02f, 8.654f, 16.113f, 8.654f, 16.113f)
                close()
                moveTo(8.751f, 15.993f)
                curveTo(8.529f, 16.013f, 8.321f, 15.736f, 8.321f, 15.736f)
                curveTo(8.321f, 15.736f, 8.619f, 15.678f, 8.74f, 15.672f)
                curveTo(8.861f, 15.666f, 9.171f, 15.856f, 9.171f, 15.856f)
                curveTo(9.171f, 15.856f, 8.974f, 15.972f, 8.751f, 15.993f)
                close()
                moveTo(8.936f, 13.854f)
                curveTo(8.936f, 13.854f, 8.7f, 14.107f, 8.759f, 14.323f)
                curveTo(8.817f, 14.538f, 8.966f, 14.712f, 8.966f, 14.712f)
                curveTo(8.966f, 14.712f, 9.099f, 14.374f, 9.072f, 14.256f)
                curveTo(9.045f, 14.138f, 8.936f, 13.854f, 8.936f, 13.854f)
                close()
                moveTo(10.895f, 16.083f)
                curveTo(10.758f, 16.032f, 10.79f, 15.866f, 10.79f, 15.866f)
                curveTo(10.79f, 15.866f, 10.991f, 15.923f, 11.063f, 15.953f)
                curveTo(11.135f, 15.983f, 11.209f, 16.142f, 11.209f, 16.142f)
                curveTo(11.209f, 16.142f, 11.033f, 16.135f, 10.895f, 16.083f)
                close()
                moveTo(10.181f, 16.724f)
                curveTo(10.181f, 16.724f, 10.149f, 16.89f, 10.287f, 16.942f)
                curveTo(10.424f, 16.994f, 10.6f, 17f, 10.6f, 17f)
                curveTo(10.6f, 17f, 10.526f, 16.841f, 10.454f, 16.812f)
                curveTo(10.382f, 16.781f, 10.181f, 16.724f, 10.181f, 16.724f)
                close()
                moveTo(12.823f, 16.942f)
                curveTo(12.685f, 16.89f, 12.717f, 16.724f, 12.717f, 16.724f)
                curveTo(12.717f, 16.724f, 12.918f, 16.781f, 12.99f, 16.812f)
                curveTo(13.062f, 16.841f, 13.136f, 17f, 13.136f, 17f)
                curveTo(13.136f, 17f, 12.96f, 16.994f, 12.823f, 16.942f)
                close()
                moveTo(12.21f, 17.774f)
                curveTo(12.21f, 17.774f, 12.178f, 17.94f, 12.316f, 17.992f)
                curveTo(12.453f, 18.043f, 12.629f, 18.05f, 12.629f, 18.05f)
                curveTo(12.629f, 18.05f, 12.555f, 17.891f, 12.483f, 17.861f)
                curveTo(12.411f, 17.831f, 12.21f, 17.774f, 12.21f, 17.774f)
                close()
                moveTo(14.931f, 18.912f)
                lineTo(14.485f, 18.541f)
                curveTo(14.763f, 18.38f, 15.049f, 18.253f, 15.293f, 18.157f)
                curveTo(15.226f, 18.11f, 15.165f, 18.076f, 15.116f, 18.059f)
                verticalLineTo(17.937f)
                curveTo(15.116f, 17.937f, 15.282f, 17.98f, 15.532f, 18.068f)
                curveTo(15.781f, 17.98f, 15.948f, 17.937f, 15.948f, 17.937f)
                verticalLineTo(18.059f)
                curveTo(15.898f, 18.076f, 15.838f, 18.11f, 15.77f, 18.157f)
                curveTo(16.015f, 18.253f, 16.301f, 18.38f, 16.579f, 18.541f)
                lineTo(16.133f, 18.912f)
                curveTo(16.133f, 18.912f, 15.827f, 18.593f, 15.532f, 18.343f)
                curveTo(15.237f, 18.593f, 14.931f, 18.912f, 14.931f, 18.912f)
                close()
                moveTo(23.699f, 13.37f)
                curveTo(23.699f, 13.37f, 23.892f, 14.023f, 23.464f, 14.321f)
                curveTo(23.036f, 14.618f, 22.458f, 14.758f, 22.458f, 14.758f)
                curveTo(22.458f, 14.758f, 22.618f, 14.067f, 22.841f, 13.899f)
                curveTo(23.064f, 13.731f, 23.699f, 13.37f, 23.699f, 13.37f)
                close()
                moveTo(22.32f, 15.254f)
                curveTo(22.341f, 15.066f, 22.288f, 14.897f, 22.288f, 14.897f)
                curveTo(22.288f, 14.897f, 21.752f, 15.184f, 21.564f, 15.317f)
                curveTo(21.376f, 15.45f, 21.24f, 15.999f, 21.24f, 15.999f)
                curveTo(21.24f, 15.999f, 21.728f, 15.888f, 22.09f, 15.651f)
                curveTo(22.221f, 15.566f, 22.283f, 15.442f, 22.309f, 15.32f)
                curveTo(22.417f, 15.354f, 22.692f, 15.425f, 22.976f, 15.398f)
                curveTo(23.34f, 15.363f, 23.604f, 14.851f, 23.604f, 14.851f)
                curveTo(23.604f, 14.851f, 23.106f, 14.849f, 22.909f, 14.876f)
                curveTo(22.756f, 14.897f, 22.448f, 15.145f, 22.32f, 15.254f)
                close()
                moveTo(20.628f, 16.23f)
                curveTo(20.628f, 16.23f, 20.59f, 16.767f, 20.201f, 16.877f)
                curveTo(19.812f, 16.987f, 19.357f, 16.94f, 19.357f, 16.94f)
                curveTo(19.357f, 16.94f, 19.661f, 16.466f, 19.867f, 16.4f)
                curveTo(20.073f, 16.333f, 20.628f, 16.23f, 20.628f, 16.23f)
                close()
                moveTo(18.322f, 17.669f)
                curveTo(18.724f, 17.628f, 18.856f, 17.106f, 18.856f, 17.106f)
                curveTo(18.856f, 17.106f, 18.291f, 17.11f, 18.076f, 17.14f)
                curveTo(17.862f, 17.17f, 17.481f, 17.584f, 17.481f, 17.584f)
                curveTo(17.481f, 17.584f, 17.92f, 17.709f, 18.322f, 17.669f)
                close()
                moveTo(17.608f, 16.701f)
                curveTo(17.608f, 16.701f, 17.663f, 17.328f, 17.259f, 17.538f)
                curveTo(16.855f, 17.749f, 16.351f, 17.792f, 16.351f, 17.792f)
                curveTo(16.351f, 17.792f, 16.597f, 17.181f, 16.809f, 17.06f)
                curveTo(17.021f, 16.939f, 17.608f, 16.701f, 17.608f, 16.701f)
                close()
                moveTo(17.326f, 18.302f)
                curveTo(17.772f, 18.393f, 18.124f, 17.872f, 18.124f, 17.872f)
                curveTo(18.124f, 17.872f, 17.518f, 17.687f, 17.277f, 17.648f)
                curveTo(17.036f, 17.608f, 16.461f, 17.928f, 16.461f, 17.928f)
                curveTo(16.461f, 17.928f, 16.879f, 18.211f, 17.326f, 18.302f)
                close()
                moveTo(20.552f, 17.177f)
                curveTo(20.552f, 17.177f, 20.341f, 17.672f, 19.937f, 17.649f)
                curveTo(19.534f, 17.627f, 19.119f, 17.434f, 19.119f, 17.434f)
                curveTo(19.119f, 17.434f, 19.561f, 17.085f, 19.777f, 17.089f)
                curveTo(19.993f, 17.093f, 20.552f, 17.177f, 20.552f, 17.177f)
                close()
                moveTo(19.381f, 16.609f)
                curveTo(19.742f, 16.427f, 19.677f, 15.892f, 19.677f, 15.892f)
                curveTo(19.677f, 15.892f, 19.151f, 16.099f, 18.962f, 16.204f)
                curveTo(18.772f, 16.309f, 18.565f, 16.832f, 18.565f, 16.832f)
                curveTo(18.565f, 16.832f, 19.02f, 16.791f, 19.381f, 16.609f)
                close()
                moveTo(21.414f, 14.653f)
                curveTo(21.414f, 14.653f, 21.413f, 15.314f, 21.141f, 15.572f)
                curveTo(20.87f, 15.83f, 20.544f, 15.92f, 20.544f, 15.92f)
                curveTo(20.544f, 15.92f, 20.736f, 15.251f, 20.88f, 15.104f)
                curveTo(21.023f, 14.957f, 21.414f, 14.653f, 21.414f, 14.653f)
                close()
                moveTo(22.41f, 16.113f)
                curveTo(22.41f, 16.113f, 22.004f, 16.641f, 21.586f, 16.614f)
                curveTo(21.168f, 16.587f, 20.802f, 16.378f, 20.802f, 16.378f)
                curveTo(20.802f, 16.378f, 21.396f, 16.008f, 21.623f, 16.014f)
                curveTo(21.85f, 16.02f, 22.41f, 16.113f, 22.41f, 16.113f)
                close()
                moveTo(22.312f, 15.993f)
                curveTo(22.534f, 16.013f, 22.742f, 15.736f, 22.742f, 15.736f)
                curveTo(22.742f, 15.736f, 22.444f, 15.678f, 22.323f, 15.672f)
                curveTo(22.203f, 15.666f, 21.892f, 15.856f, 21.892f, 15.856f)
                curveTo(21.892f, 15.856f, 22.09f, 15.972f, 22.312f, 15.993f)
                close()
                moveTo(22.127f, 13.854f)
                curveTo(22.127f, 13.854f, 22.364f, 14.107f, 22.305f, 14.323f)
                curveTo(22.246f, 14.538f, 22.097f, 14.712f, 22.097f, 14.712f)
                curveTo(22.097f, 14.712f, 21.964f, 14.374f, 21.991f, 14.256f)
                curveTo(22.018f, 14.138f, 22.127f, 13.854f, 22.127f, 13.854f)
                close()
                moveTo(20.168f, 16.083f)
                curveTo(20.306f, 16.032f, 20.274f, 15.866f, 20.274f, 15.866f)
                curveTo(20.274f, 15.866f, 20.073f, 15.923f, 20.001f, 15.953f)
                curveTo(19.929f, 15.983f, 19.855f, 16.142f, 19.855f, 16.142f)
                curveTo(19.855f, 16.142f, 20.031f, 16.135f, 20.168f, 16.083f)
                close()
                moveTo(20.883f, 16.724f)
                curveTo(20.883f, 16.724f, 20.914f, 16.89f, 20.777f, 16.942f)
                curveTo(20.639f, 16.994f, 20.464f, 17f, 20.464f, 17f)
                curveTo(20.464f, 17f, 20.537f, 16.841f, 20.609f, 16.812f)
                curveTo(20.681f, 16.781f, 20.883f, 16.724f, 20.883f, 16.724f)
                close()
                moveTo(18.241f, 16.942f)
                curveTo(18.378f, 16.89f, 18.346f, 16.724f, 18.346f, 16.724f)
                curveTo(18.346f, 16.724f, 18.145f, 16.781f, 18.073f, 16.812f)
                curveTo(18.001f, 16.841f, 17.927f, 17f, 17.927f, 17f)
                curveTo(17.927f, 17f, 18.103f, 16.994f, 18.241f, 16.942f)
                close()
                moveTo(18.854f, 17.774f)
                curveTo(18.854f, 17.774f, 18.885f, 17.94f, 18.748f, 17.992f)
                curveTo(18.61f, 18.043f, 18.435f, 18.05f, 18.435f, 18.05f)
                curveTo(18.435f, 18.05f, 18.508f, 17.891f, 18.58f, 17.861f)
                curveTo(18.653f, 17.831f, 18.854f, 17.774f, 18.854f, 17.774f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF57A01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(27.806f, 3.017f)
                curveTo(27.806f, 3.017f, 28.152f, 3.462f, 27.806f, 3.462f)
                curveTo(27.46f, 3.462f, 26.58f, 3.943f, 26.58f, 3.943f)
                curveTo(26.58f, 3.943f, 26.161f, 4.568f, 25.654f, 4.71f)
                curveTo(25.147f, 4.851f, 24.976f, 5.376f, 24.233f, 5.595f)
                curveTo(23.491f, 5.814f, 23.415f, 5.873f, 23.415f, 6.095f)
                curveTo(23.415f, 6.316f, 23.542f, 6.691f, 23.035f, 6.691f)
                curveTo(22.528f, 6.691f, 22.17f, 5.982f, 21.895f, 6.691f)
                curveTo(21.621f, 7.401f, 21.343f, 7.609f, 21.723f, 8.043f)
                curveTo(22.103f, 8.478f, 22.606f, 8.893f, 22.82f, 9.144f)
                curveTo(23.035f, 9.395f, 24.463f, 10.129f, 23.415f, 10.129f)
                curveTo(22.367f, 10.129f, 22.894f, 9.464f, 22.087f, 9.707f)
                curveTo(21.28f, 9.95f, 21.743f, 10.308f, 21.127f, 10.129f)
                curveTo(20.51f, 9.95f, 20.099f, 9.786f, 19.907f, 9.868f)
                curveTo(19.716f, 9.95f, 19.409f, 9.414f, 19.409f, 10.129f)
                curveTo(19.409f, 10.843f, 19.984f, 10.553f, 18.75f, 11.342f)
                curveTo(17.516f, 12.131f, 17.761f, 11.913f, 17.195f, 11.913f)
                curveTo(16.628f, 11.913f, 16.43f, 12.27f, 16.052f, 12.27f)
                curveTo(15.674f, 12.27f, 15.72f, 12.27f, 15.295f, 12.27f)
                curveTo(14.87f, 12.27f, 15.325f, 11.818f, 14.6f, 12.27f)
                curveTo(13.875f, 12.722f, 13.615f, 12.812f, 13.615f, 12.986f)
                curveTo(13.615f, 13.159f, 13.615f, 13.619f, 13.615f, 13.619f)
                curveTo(13.615f, 13.619f, 12.95f, 14f, 12.95f, 13.619f)
                curveTo(12.95f, 13.239f, 12.745f, 13.142f, 12.47f, 12.986f)
                curveTo(12.194f, 12.829f, 11.644f, 12.942f, 11.056f, 12.986f)
                curveTo(10.468f, 13.029f, 9.803f, 12.392f, 9.292f, 12.392f)
                curveTo(8.782f, 12.392f, 8.687f, 11.913f, 8.547f, 11.913f)
                curveTo(8.408f, 11.913f, 8.693f, 11.503f, 8.099f, 11.136f)
                curveTo(7.504f, 10.768f, 7.296f, 10.723f, 7.296f, 10.129f)
                curveTo(7.296f, 9.535f, 7.023f, 9.372f, 7.023f, 9.011f)
                curveTo(7.023f, 8.65f, 7.314f, 9.144f, 7.931f, 9.144f)
                curveTo(8.547f, 9.144f, 8.588f, 8.762f, 9.292f, 8.403f)
                curveTo(9.997f, 8.043f, 10.236f, 7.847f, 10.824f, 8.043f)
                curveTo(11.411f, 8.24f, 11.99f, 8.973f, 12.47f, 8.269f)
                curveTo(12.95f, 7.566f, 12.95f, 6.762f, 12.95f, 6.356f)
                curveTo(12.95f, 5.95f, 12.666f, 5.834f, 13.433f, 6.095f)
                curveTo(14.2f, 6.356f, 14.646f, 6.356f, 15.92f, 6.356f)
                curveTo(17.195f, 6.356f, 18.719f, 6.772f, 19.188f, 6.356f)
                curveTo(19.658f, 5.939f, 20.16f, 5.595f, 21.378f, 5.595f)
                curveTo(22.597f, 5.595f, 22.995f, 4.996f, 23.814f, 4.71f)
                curveTo(24.633f, 4.423f, 23.425f, 5.029f, 25.263f, 4.245f)
                curveTo(27.101f, 3.462f, 27.806f, 3.017f, 27.806f, 3.017f)
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
            imageVector = FlagIcons.Large.Cyprus,
            contentDescription = "Cyprus Flag"
        )
    }
}
