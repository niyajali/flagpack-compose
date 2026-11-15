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
 * Dominican Republic Flag (32x24dp)
 *
 * - ISO Alpha-2: DO
 * - ISO Alpha-3: DOM
 * - ISO Numeric: 214
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.DominicanRepublic: ImageVector by lazy {
    ImageVector.Builder(
        name = "Dominican Republic:DO:DOM:214:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
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
            path(fill = SolidColor(Color(0xFF4257BF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4257BF))) {
                moveTo(18f, 14f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 0f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(32f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(24f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.865f, 10.525f)
                curveTo(13.828f, 10.35f, 13.785f, 10.133f, 13.785f, 10.133f)
                curveTo(13.69f, 10.364f, 13.66f, 10.573f, 13.699f, 10.761f)
                curveTo(13.658f, 10.82f, 13.622f, 10.875f, 13.589f, 10.927f)
                curveTo(13.487f, 10.784f, 13.36f, 10.515f, 13.36f, 10.515f)
                curveTo(13.365f, 10.593f, 13.363f, 10.673f, 13.361f, 10.75f)
                curveTo(13.356f, 10.932f, 13.352f, 11.102f, 13.432f, 11.208f)
                lineTo(13.431f, 11.21f)
                curveTo(13.415f, 11.245f, 13.4f, 11.28f, 13.385f, 11.315f)
                curveTo(13.275f, 11.197f, 13.092f, 10.986f, 13.092f, 10.986f)
                curveTo(13.106f, 11.24f, 13.172f, 11.439f, 13.292f, 11.582f)
                curveTo(13.27f, 11.657f, 13.252f, 11.731f, 13.238f, 11.804f)
                curveTo(13.146f, 11.702f, 13.056f, 11.601f, 13.056f, 11.601f)
                curveTo(13.069f, 11.833f, 13.106f, 11.986f, 13.2f, 12.114f)
                curveTo(13.198f, 12.151f, 13.197f, 12.188f, 13.197f, 12.224f)
                curveTo(13.099f, 12.116f, 13f, 12.004f, 13f, 12.004f)
                curveTo(13.014f, 12.248f, 13.103f, 12.409f, 13.221f, 12.543f)
                curveTo(13.233f, 12.62f, 13.248f, 12.697f, 13.269f, 12.773f)
                lineTo(13.28f, 12.814f)
                curveTo(13.144f, 12.743f, 12.995f, 12.662f, 12.995f, 12.662f)
                curveTo(13.085f, 12.873f, 13.213f, 12.993f, 13.358f, 13.077f)
                curveTo(13.389f, 13.175f, 13.423f, 13.27f, 13.458f, 13.361f)
                curveTo(13.298f, 13.312f, 13.058f, 13.232f, 13.058f, 13.232f)
                curveTo(13.202f, 13.452f, 13.374f, 13.545f, 13.557f, 13.601f)
                curveTo(13.595f, 13.685f, 13.634f, 13.765f, 13.674f, 13.841f)
                curveTo(13.522f, 13.793f, 13.342f, 13.733f, 13.342f, 13.733f)
                curveTo(13.482f, 13.946f, 13.648f, 14.04f, 13.826f, 14.097f)
                curveTo(13.943f, 14.274f, 14.069f, 14.42f, 14.2f, 14.529f)
                curveTo(14.049f, 14.592f, 13.856f, 14.668f, 13.856f, 14.668f)
                curveTo(14.07f, 14.733f, 14.24f, 14.714f, 14.394f, 14.661f)
                lineTo(14.405f, 14.666f)
                curveTo(14.469f, 14.699f, 14.539f, 14.729f, 14.619f, 14.759f)
                curveTo(14.495f, 14.81f, 14.375f, 14.857f, 14.375f, 14.857f)
                curveTo(14.585f, 14.92f, 14.753f, 14.903f, 14.905f, 14.853f)
                lineTo(14.913f, 14.855f)
                curveTo(14.984f, 14.875f, 15.057f, 14.895f, 15.153f, 14.921f)
                curveTo(15.089f, 14.904f, 15.323f, 14.965f, 15.371f, 14.978f)
                curveTo(15.523f, 15.02f, 15.609f, 15.049f, 15.651f, 15.074f)
                curveTo(15.655f, 15.076f, 15.658f, 15.078f, 15.66f, 15.079f)
                curveTo(15.661f, 15.08f, 15.662f, 15.081f, 15.662f, 15.08f)
                lineTo(15.778f, 14.99f)
                curveTo(15.765f, 14.97f, 15.746f, 14.955f, 15.722f, 14.94f)
                curveTo(15.665f, 14.906f, 15.572f, 14.875f, 15.406f, 14.83f)
                curveTo(15.359f, 14.817f, 15.133f, 14.757f, 15.184f, 14.771f)
                curveTo(15.091f, 14.746f, 15.02f, 14.727f, 14.951f, 14.707f)
                lineTo(14.897f, 14.691f)
                curveTo(14.91f, 14.531f, 14.885f, 14.363f, 14.773f, 14.175f)
                curveTo(14.773f, 14.175f, 14.734f, 14.468f, 14.707f, 14.629f)
                curveTo(14.615f, 14.596f, 14.536f, 14.563f, 14.467f, 14.528f)
                curveTo(14.447f, 14.518f, 14.427f, 14.507f, 14.408f, 14.495f)
                curveTo(14.394f, 14.33f, 14.342f, 14.166f, 14.195f, 13.995f)
                curveTo(14.195f, 13.995f, 14.203f, 14.178f, 14.207f, 14.335f)
                curveTo(14.109f, 14.239f, 14.014f, 14.12f, 13.924f, 13.979f)
                lineTo(14.009f, 14.026f)
                curveTo(14.009f, 13.825f, 13.972f, 13.625f, 13.792f, 13.416f)
                curveTo(13.792f, 13.416f, 13.8f, 13.613f, 13.805f, 13.775f)
                curveTo(13.752f, 13.676f, 13.701f, 13.569f, 13.652f, 13.455f)
                curveTo(13.697f, 13.294f, 13.706f, 13.12f, 13.625f, 12.906f)
                curveTo(13.625f, 12.906f, 13.584f, 13.036f, 13.541f, 13.167f)
                curveTo(13.528f, 13.131f, 13.516f, 13.095f, 13.504f, 13.058f)
                curveTo(13.597f, 12.889f, 13.657f, 12.703f, 13.608f, 12.443f)
                curveTo(13.608f, 12.443f, 13.503f, 12.645f, 13.423f, 12.79f)
                curveTo(13.418f, 12.771f, 13.412f, 12.751f, 13.407f, 12.731f)
                curveTo(13.39f, 12.666f, 13.376f, 12.6f, 13.365f, 12.534f)
                curveTo(13.5f, 12.412f, 13.609f, 12.26f, 13.649f, 12.014f)
                curveTo(13.649f, 12.014f, 13.468f, 12.179f, 13.342f, 12.289f)
                curveTo(13.34f, 12.234f, 13.341f, 12.177f, 13.344f, 12.121f)
                curveTo(13.489f, 12.025f, 13.615f, 11.896f, 13.693f, 11.671f)
                curveTo(13.693f, 11.671f, 13.513f, 11.786f, 13.372f, 11.872f)
                curveTo(13.382f, 11.817f, 13.394f, 11.762f, 13.408f, 11.706f)
                curveTo(13.581f, 11.606f, 13.733f, 11.474f, 13.823f, 11.216f)
                curveTo(13.823f, 11.216f, 13.642f, 11.331f, 13.501f, 11.417f)
                curveTo(13.519f, 11.37f, 13.539f, 11.324f, 13.56f, 11.277f)
                curveTo(13.585f, 11.221f, 13.621f, 11.155f, 13.668f, 11.078f)
                curveTo(13.823f, 11.022f, 13.967f, 10.93f, 14.094f, 10.744f)
                curveTo(14.094f, 10.744f, 13.965f, 10.784f, 13.833f, 10.824f)
                curveTo(13.908f, 10.717f, 13.994f, 10.596f, 14.094f, 10.463f)
                lineTo(13.982f, 10.367f)
                curveTo(13.941f, 10.422f, 13.902f, 10.474f, 13.865f, 10.525f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.913f, 10.525f)
                curveTo(17.95f, 10.35f, 17.993f, 10.133f, 17.993f, 10.133f)
                curveTo(18.088f, 10.364f, 18.118f, 10.573f, 18.08f, 10.761f)
                curveTo(18.12f, 10.82f, 18.156f, 10.875f, 18.189f, 10.927f)
                curveTo(18.291f, 10.784f, 18.418f, 10.515f, 18.418f, 10.515f)
                curveTo(18.413f, 10.593f, 18.415f, 10.673f, 18.417f, 10.75f)
                curveTo(18.422f, 10.932f, 18.426f, 11.102f, 18.346f, 11.208f)
                lineTo(18.347f, 11.21f)
                curveTo(18.363f, 11.245f, 18.378f, 11.28f, 18.392f, 11.315f)
                curveTo(18.503f, 11.197f, 18.686f, 10.986f, 18.686f, 10.986f)
                curveTo(18.672f, 11.24f, 18.606f, 11.439f, 18.486f, 11.582f)
                curveTo(18.508f, 11.657f, 18.526f, 11.731f, 18.54f, 11.804f)
                curveTo(18.632f, 11.702f, 18.722f, 11.601f, 18.722f, 11.601f)
                curveTo(18.709f, 11.833f, 18.672f, 11.986f, 18.578f, 12.114f)
                curveTo(18.58f, 12.151f, 18.581f, 12.188f, 18.581f, 12.224f)
                curveTo(18.679f, 12.116f, 18.778f, 12.004f, 18.778f, 12.004f)
                curveTo(18.764f, 12.248f, 18.675f, 12.409f, 18.557f, 12.543f)
                curveTo(18.546f, 12.62f, 18.53f, 12.697f, 18.51f, 12.773f)
                lineTo(18.498f, 12.814f)
                curveTo(18.634f, 12.743f, 18.784f, 12.662f, 18.784f, 12.662f)
                curveTo(18.693f, 12.873f, 18.565f, 12.993f, 18.42f, 13.077f)
                curveTo(18.389f, 13.175f, 18.355f, 13.27f, 18.32f, 13.361f)
                curveTo(18.48f, 13.312f, 18.72f, 13.232f, 18.72f, 13.232f)
                curveTo(18.576f, 13.452f, 18.404f, 13.545f, 18.221f, 13.601f)
                curveTo(18.183f, 13.685f, 18.144f, 13.765f, 18.104f, 13.841f)
                curveTo(18.256f, 13.793f, 18.436f, 13.733f, 18.436f, 13.733f)
                curveTo(18.296f, 13.946f, 18.13f, 14.04f, 17.952f, 14.097f)
                curveTo(17.835f, 14.274f, 17.709f, 14.42f, 17.578f, 14.529f)
                curveTo(17.729f, 14.592f, 17.922f, 14.668f, 17.922f, 14.668f)
                curveTo(17.708f, 14.733f, 17.538f, 14.714f, 17.384f, 14.661f)
                lineTo(17.373f, 14.666f)
                curveTo(17.31f, 14.699f, 17.239f, 14.729f, 17.159f, 14.759f)
                curveTo(17.283f, 14.81f, 17.403f, 14.857f, 17.403f, 14.857f)
                curveTo(17.193f, 14.92f, 17.025f, 14.903f, 16.873f, 14.853f)
                lineTo(16.865f, 14.855f)
                curveTo(16.794f, 14.875f, 16.721f, 14.895f, 16.625f, 14.921f)
                curveTo(16.689f, 14.904f, 16.455f, 14.965f, 16.407f, 14.978f)
                curveTo(16.255f, 15.02f, 16.169f, 15.049f, 16.127f, 15.074f)
                curveTo(16.123f, 15.076f, 16.12f, 15.078f, 16.118f, 15.079f)
                curveTo(16.117f, 15.08f, 16.116f, 15.081f, 16.116f, 15.08f)
                lineTo(16f, 14.99f)
                curveTo(16.013f, 14.97f, 16.032f, 14.955f, 16.056f, 14.94f)
                curveTo(16.113f, 14.906f, 16.206f, 14.875f, 16.372f, 14.83f)
                curveTo(16.419f, 14.817f, 16.646f, 14.757f, 16.594f, 14.771f)
                curveTo(16.687f, 14.746f, 16.758f, 14.727f, 16.827f, 14.707f)
                lineTo(16.881f, 14.691f)
                curveTo(16.869f, 14.531f, 16.893f, 14.363f, 17.005f, 14.175f)
                curveTo(17.005f, 14.175f, 17.044f, 14.468f, 17.071f, 14.629f)
                curveTo(17.163f, 14.596f, 17.242f, 14.563f, 17.311f, 14.528f)
                curveTo(17.331f, 14.518f, 17.351f, 14.507f, 17.37f, 14.495f)
                curveTo(17.384f, 14.33f, 17.436f, 14.166f, 17.583f, 13.995f)
                curveTo(17.583f, 13.995f, 17.575f, 14.178f, 17.571f, 14.335f)
                curveTo(17.669f, 14.239f, 17.764f, 14.12f, 17.854f, 13.979f)
                lineTo(17.769f, 14.026f)
                curveTo(17.768f, 13.825f, 17.806f, 13.625f, 17.986f, 13.416f)
                curveTo(17.986f, 13.416f, 17.978f, 13.613f, 17.973f, 13.775f)
                curveTo(18.027f, 13.676f, 18.077f, 13.569f, 18.126f, 13.455f)
                curveTo(18.081f, 13.294f, 18.072f, 13.12f, 18.153f, 12.906f)
                curveTo(18.153f, 12.906f, 18.194f, 13.036f, 18.237f, 13.167f)
                curveTo(18.25f, 13.131f, 18.262f, 13.095f, 18.274f, 13.058f)
                curveTo(18.181f, 12.889f, 18.121f, 12.703f, 18.17f, 12.443f)
                curveTo(18.17f, 12.443f, 18.275f, 12.645f, 18.355f, 12.79f)
                curveTo(18.36f, 12.771f, 18.366f, 12.751f, 18.371f, 12.731f)
                curveTo(18.388f, 12.666f, 18.402f, 12.6f, 18.413f, 12.534f)
                curveTo(18.278f, 12.412f, 18.169f, 12.26f, 18.129f, 12.014f)
                curveTo(18.129f, 12.014f, 18.31f, 12.179f, 18.436f, 12.289f)
                curveTo(18.438f, 12.234f, 18.437f, 12.177f, 18.434f, 12.121f)
                curveTo(18.289f, 12.025f, 18.163f, 11.896f, 18.085f, 11.671f)
                curveTo(18.085f, 11.671f, 18.265f, 11.786f, 18.406f, 11.872f)
                curveTo(18.396f, 11.817f, 18.384f, 11.762f, 18.37f, 11.706f)
                curveTo(18.198f, 11.606f, 18.045f, 11.474f, 17.955f, 11.216f)
                curveTo(17.955f, 11.216f, 18.136f, 11.331f, 18.277f, 11.417f)
                curveTo(18.259f, 11.37f, 18.239f, 11.324f, 18.218f, 11.277f)
                curveTo(18.192f, 11.221f, 18.157f, 11.155f, 18.11f, 11.078f)
                curveTo(17.956f, 11.022f, 17.811f, 10.93f, 17.684f, 10.744f)
                curveTo(17.684f, 10.744f, 17.813f, 10.784f, 17.945f, 10.824f)
                curveTo(17.871f, 10.717f, 17.784f, 10.596f, 17.684f, 10.463f)
                lineTo(17.796f, 10.367f)
                curveTo(17.837f, 10.422f, 17.876f, 10.474f, 17.913f, 10.525f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(13.252f, 9.316f)
                curveTo(13.651f, 9.035f, 14.384f, 8.792f, 14.761f, 8.792f)
                curveTo(14.763f, 8.792f, 14.767f, 8.791f, 14.777f, 8.787f)
                curveTo(14.809f, 8.774f, 15.015f, 8.646f, 15.028f, 8.639f)
                curveTo(15.295f, 8.486f, 15.573f, 8.406f, 15.953f, 8.406f)
                verticalLineTo(9.073f)
                curveTo(15.68f, 9.073f, 15.502f, 9.124f, 15.323f, 9.226f)
                curveTo(15.355f, 9.208f, 15.088f, 9.373f, 15.003f, 9.408f)
                curveTo(14.924f, 9.441f, 14.845f, 9.459f, 14.761f, 9.459f)
                curveTo(14.508f, 9.459f, 13.895f, 9.662f, 13.595f, 9.872f)
                curveTo(13.488f, 9.948f, 13.498f, 9.925f, 13.501f, 9.97f)
                curveTo(13.513f, 10.134f, 13.501f, 10.234f, 13.4f, 10.362f)
                curveTo(13.387f, 10.379f, 13.366f, 10.47f, 13.364f, 10.631f)
                lineTo(12.739f, 10.623f)
                curveTo(12.742f, 10.361f, 12.782f, 10.154f, 12.877f, 9.998f)
                curveTo(12.863f, 9.729f, 12.957f, 9.523f, 13.252f, 9.316f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBCA5E))) {
                moveTo(13.586f, 9.565f)
                lineTo(13.517f, 9.454f)
                curveTo(13.837f, 9.228f, 14.137f, 9.113f, 14.414f, 9.113f)
                curveTo(14.506f, 9.113f, 14.611f, 9.089f, 14.733f, 9.042f)
                curveTo(14.815f, 9.01f, 14.898f, 8.971f, 15.011f, 8.914f)
                curveTo(15.418f, 8.707f, 15.429f, 8.702f, 15.537f, 8.702f)
                horizontalLineTo(15.906f)
                verticalLineTo(8.835f)
                horizontalLineTo(15.537f)
                curveTo(15.459f, 8.835f, 15.434f, 8.847f, 15.064f, 9.035f)
                curveTo(14.949f, 9.093f, 14.862f, 9.134f, 14.776f, 9.167f)
                curveTo(14.641f, 9.219f, 14.523f, 9.247f, 14.414f, 9.247f)
                curveTo(14.164f, 9.247f, 13.887f, 9.352f, 13.586f, 9.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(18.498f, 9.316f)
                curveTo(18.099f, 9.035f, 17.366f, 8.792f, 16.989f, 8.792f)
                curveTo(16.987f, 8.792f, 16.983f, 8.791f, 16.972f, 8.787f)
                curveTo(16.941f, 8.774f, 16.735f, 8.646f, 16.722f, 8.639f)
                curveTo(16.455f, 8.486f, 16.177f, 8.406f, 15.797f, 8.406f)
                verticalLineTo(9.073f)
                curveTo(16.07f, 9.073f, 16.248f, 9.124f, 16.426f, 9.226f)
                curveTo(16.395f, 9.208f, 16.662f, 9.373f, 16.747f, 9.408f)
                curveTo(16.826f, 9.441f, 16.905f, 9.459f, 16.989f, 9.459f)
                curveTo(17.242f, 9.459f, 17.855f, 9.662f, 18.154f, 9.872f)
                curveTo(18.262f, 9.948f, 18.252f, 9.925f, 18.249f, 9.97f)
                curveTo(18.237f, 10.134f, 18.249f, 10.234f, 18.35f, 10.362f)
                curveTo(18.363f, 10.379f, 18.384f, 10.47f, 18.386f, 10.631f)
                lineTo(19.011f, 10.623f)
                curveTo(19.008f, 10.361f, 18.968f, 10.154f, 18.873f, 9.998f)
                curveTo(18.887f, 9.729f, 18.792f, 9.523f, 18.498f, 9.316f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEBCA5E))) {
                moveTo(18.114f, 9.565f)
                lineTo(18.183f, 9.454f)
                curveTo(17.862f, 9.228f, 17.563f, 9.113f, 17.286f, 9.113f)
                curveTo(17.194f, 9.113f, 17.089f, 9.089f, 16.967f, 9.042f)
                curveTo(16.885f, 9.01f, 16.802f, 8.971f, 16.689f, 8.914f)
                curveTo(16.282f, 8.707f, 16.27f, 8.702f, 16.163f, 8.702f)
                horizontalLineTo(15.794f)
                verticalLineTo(8.835f)
                horizontalLineTo(16.163f)
                curveTo(16.241f, 8.835f, 16.266f, 8.847f, 16.635f, 9.035f)
                curveTo(16.751f, 9.093f, 16.838f, 9.134f, 16.924f, 9.167f)
                curveTo(17.059f, 9.219f, 17.177f, 9.247f, 17.286f, 9.247f)
                curveTo(17.536f, 9.247f, 17.812f, 9.352f, 18.114f, 9.565f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(13.822f, 10.019f)
                lineTo(14.148f, 10.374f)
                verticalLineTo(11.847f)
                horizontalLineTo(14.477f)
                verticalLineTo(11.94f)
                lineTo(14.959f, 12.172f)
                curveTo(14.959f, 12.172f, 15.032f, 11.198f, 14.806f, 10.941f)
                curveTo(14.579f, 10.684f, 14.959f, 10.621f, 14.959f, 10.621f)
                lineTo(15.538f, 11.2f)
                verticalLineTo(10.019f)
                horizontalLineTo(13.822f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD62818))) {
                moveTo(17.738f, 10.019f)
                lineTo(17.412f, 10.374f)
                verticalLineTo(11.847f)
                horizontalLineTo(17.082f)
                verticalLineTo(11.94f)
                lineTo(16.601f, 12.172f)
                curveTo(16.601f, 12.172f, 16.528f, 11.198f, 16.754f, 10.941f)
                curveTo(16.981f, 10.684f, 16.601f, 10.621f, 16.601f, 10.621f)
                lineTo(16.022f, 11.2f)
                verticalLineTo(10.019f)
                horizontalLineTo(17.738f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFC300))) {
                moveTo(14.877f, 10.597f)
                lineTo(14.828f, 10.657f)
                lineTo(15.79f, 11.546f)
                lineTo(15.841f, 11.543f)
                lineTo(16.637f, 10.654f)
                lineTo(16.582f, 10.599f)
                lineTo(15.812f, 11.461f)
                lineTo(14.877f, 10.597f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFC300))) {
                moveTo(14.74f, 10.97f)
                lineTo(14.678f, 11.03f)
                lineTo(15.905f, 11.919f)
                lineTo(15.971f, 11.917f)
                lineTo(16.987f, 11.028f)
                lineTo(16.917f, 10.973f)
                lineTo(15.934f, 11.834f)
                lineTo(14.74f, 10.97f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD62818))) {
                moveTo(14.177f, 12.422f)
                horizontalLineTo(14.599f)
                lineTo(14.887f, 12.51f)
                curveTo(14.887f, 12.51f, 14.979f, 13.171f, 15.442f, 13.171f)
                lineTo(15.518f, 14.017f)
                lineTo(15.16f, 13.823f)
                curveTo(15.16f, 13.823f, 14.926f, 13.926f, 14.887f, 13.926f)
                curveTo(14.847f, 13.926f, 14.515f, 14.113f, 14.515f, 13.926f)
                curveTo(14.515f, 13.74f, 14.177f, 13.438f, 14.177f, 13.438f)
                verticalLineTo(12.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(17.518f, 12.422f)
                horizontalLineTo(17.096f)
                lineTo(16.808f, 12.51f)
                curveTo(16.808f, 12.51f, 16.715f, 13.171f, 16.253f, 13.171f)
                lineTo(16.177f, 14.017f)
                lineTo(16.535f, 13.823f)
                curveTo(16.535f, 13.823f, 16.768f, 13.926f, 16.808f, 13.926f)
                curveTo(16.847f, 13.926f, 17.18f, 14.113f, 17.18f, 13.926f)
                curveTo(17.18f, 13.74f, 17.518f, 13.438f, 17.518f, 13.438f)
                verticalLineTo(12.422f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD62818))) {
                moveTo(16.614f, 12.502f)
                lineTo(17.114f, 12.502f)
                curveTo(17.114f, 12.876f, 16.982f, 13.179f, 16.722f, 13.384f)
                lineTo(16.424f, 12.955f)
                curveTo(16.552f, 12.855f, 16.614f, 12.713f, 16.614f, 12.502f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD62818))) {
                moveTo(15.304f, 11.473f)
                verticalLineTo(12.175f)
                horizontalLineTo(15.885f)
                curveTo(15.885f, 12.175f, 15.831f, 12.7f, 15.831f, 13.032f)
                curveTo(15.831f, 13.364f, 15.885f, 13.795f, 15.885f, 13.795f)
                curveTo(15.885f, 13.795f, 16.028f, 13.723f, 16.028f, 13.275f)
                curveTo(16.028f, 12.826f, 16.028f, 12.126f, 16.028f, 12.126f)
                lineTo(16.487f, 12.175f)
                lineTo(16.438f, 11.542f)
                horizontalLineTo(16.245f)
                curveTo(16.245f, 11.542f, 16.542f, 11.936f, 16.245f, 11.936f)
                curveTo(15.947f, 11.936f, 15.604f, 12.013f, 15.54f, 12.013f)
                curveTo(15.475f, 12.013f, 15.304f, 11.473f, 15.304f, 11.473f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(15.809f, 12.321f)
                curveTo(15.809f, 12.321f, 15.483f, 12.513f, 15.483f, 12.826f)
                curveTo(15.483f, 13.139f, 15.646f, 13.496f, 15.646f, 13.496f)
                curveTo(15.646f, 13.496f, 15.569f, 12.791f, 15.689f, 12.604f)
                curveTo(15.809f, 12.416f, 15.809f, 12.321f, 15.809f, 12.321f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(15.278f, 12.552f)
                curveTo(15.278f, 12.552f, 15.26f, 12.779f, 15.394f, 12.779f)
                curveTo(15.528f, 12.779f, 15.278f, 12.552f, 15.278f, 12.552f)
                close()
            }
            path(fill = SolidColor(Color(0xFF373737))) {
                moveTo(16.428f, 11.944f)
                lineTo(16.479f, 12.122f)
                lineTo(15.624f, 12.402f)
                lineTo(15.433f, 11.606f)
                lineTo(15.602f, 11.56f)
                lineTo(15.748f, 12.166f)
                lineTo(16.428f, 11.944f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD62818)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.036f, 15.409f)
                lineTo(13.961f, 15.472f)
                curveTo(13.936f, 15.439f, 13.914f, 15.405f, 13.896f, 15.371f)
                curveTo(13.821f, 15.345f, 13.75f, 15.311f, 13.691f, 15.269f)
                curveTo(13.61f, 15.212f, 13.527f, 15.212f, 13.421f, 15.275f)
                lineTo(13.3f, 15.041f)
                curveTo(13.484f, 14.933f, 13.667f, 14.933f, 13.829f, 15.047f)
                curveTo(13.831f, 15.048f, 13.833f, 15.049f, 13.835f, 15.051f)
                curveTo(13.858f, 14.919f, 13.944f, 14.802f, 14.093f, 14.717f)
                curveTo(14.347f, 14.572f, 15.463f, 14.419f, 15.802f, 14.419f)
                verticalLineTo(14.846f)
                curveTo(15.526f, 14.846f, 14.459f, 14.992f, 14.281f, 15.094f)
                curveTo(14.276f, 15.097f, 14.271f, 15.099f, 14.267f, 15.102f)
                curveTo(14.243f, 15.115f, 14.23f, 15.122f, 14.228f, 15.132f)
                curveTo(14.226f, 15.139f, 14.231f, 15.149f, 14.244f, 15.166f)
                curveTo(14.253f, 15.165f, 14.26f, 15.164f, 14.262f, 15.161f)
                lineTo(14.44f, 15.349f)
                curveTo(14.366f, 15.428f, 14.203f, 15.441f, 14.036f, 15.409f)
                close()
                moveTo(12.841f, 15.416f)
                curveTo(12.841f, 15.416f, 13.211f, 15.741f, 13.478f, 15.662f)
                curveTo(13.745f, 15.583f, 13.827f, 15.495f, 13.827f, 15.495f)
                curveTo(13.827f, 15.495f, 13.561f, 15.459f, 13.278f, 15.416f)
                curveTo(12.995f, 15.373f, 12.841f, 15.416f, 12.841f, 15.416f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEBCA5E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.065f, 15.179f)
                lineTo(14.11f, 15.115f)
                curveTo(13.978f, 15.01f, 14.012f, 14.951f, 14.265f, 14.894f)
                curveTo(14.287f, 14.889f, 14.31f, 14.884f, 14.332f, 14.879f)
                lineTo(14.332f, 14.879f)
                curveTo(14.565f, 14.83f, 14.819f, 14.788f, 15.073f, 14.757f)
                curveTo(15.353f, 14.723f, 15.632f, 14.704f, 15.881f, 14.704f)
                curveTo(15.632f, 14.704f, 15.353f, 14.723f, 15.073f, 14.757f)
                curveTo(14.818f, 14.788f, 14.563f, 14.83f, 14.332f, 14.879f)
                lineTo(14.318f, 14.801f)
                curveTo(14.553f, 14.751f, 14.81f, 14.708f, 15.066f, 14.677f)
                curveTo(15.347f, 14.644f, 15.629f, 14.624f, 15.881f, 14.624f)
                curveTo(15.629f, 14.624f, 15.348f, 14.643f, 15.066f, 14.677f)
                curveTo(14.783f, 14.711f, 14.5f, 14.759f, 14.25f, 14.816f)
                curveTo(13.945f, 14.884f, 13.866f, 15.02f, 14.065f, 15.179f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD62818)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.464f, 15.409f)
                lineTo(17.539f, 15.472f)
                curveTo(17.564f, 15.439f, 17.586f, 15.405f, 17.603f, 15.371f)
                curveTo(17.679f, 15.345f, 17.75f, 15.311f, 17.808f, 15.269f)
                curveTo(17.889f, 15.212f, 17.973f, 15.212f, 18.079f, 15.275f)
                lineTo(18.2f, 15.041f)
                curveTo(18.016f, 14.933f, 17.833f, 14.933f, 17.671f, 15.047f)
                curveTo(17.669f, 15.048f, 17.667f, 15.049f, 17.665f, 15.051f)
                curveTo(17.642f, 14.919f, 17.556f, 14.802f, 17.407f, 14.717f)
                curveTo(17.152f, 14.572f, 16.037f, 14.419f, 15.698f, 14.419f)
                verticalLineTo(14.846f)
                curveTo(15.973f, 14.846f, 17.041f, 14.992f, 17.219f, 15.094f)
                curveTo(17.224f, 15.097f, 17.229f, 15.099f, 17.233f, 15.102f)
                curveTo(17.257f, 15.115f, 17.27f, 15.122f, 17.272f, 15.132f)
                curveTo(17.274f, 15.139f, 17.268f, 15.149f, 17.256f, 15.166f)
                curveTo(17.247f, 15.165f, 17.24f, 15.164f, 17.237f, 15.161f)
                lineTo(17.06f, 15.349f)
                curveTo(17.134f, 15.428f, 17.297f, 15.441f, 17.464f, 15.409f)
                close()
                moveTo(18.659f, 15.416f)
                curveTo(18.659f, 15.416f, 18.289f, 15.741f, 18.022f, 15.662f)
                curveTo(17.755f, 15.583f, 17.673f, 15.495f, 17.673f, 15.495f)
                curveTo(17.673f, 15.495f, 17.939f, 15.459f, 18.222f, 15.416f)
                curveTo(18.505f, 15.373f, 18.659f, 15.416f, 18.659f, 15.416f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEBCA5E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.435f, 15.179f)
                lineTo(17.39f, 15.115f)
                curveTo(17.522f, 15.01f, 17.487f, 14.951f, 17.235f, 14.894f)
                curveTo(17.213f, 14.889f, 17.19f, 14.884f, 17.168f, 14.879f)
                lineTo(17.168f, 14.879f)
                curveTo(16.935f, 14.83f, 16.68f, 14.788f, 16.427f, 14.757f)
                curveTo(16.147f, 14.723f, 15.868f, 14.704f, 15.619f, 14.704f)
                curveTo(15.868f, 14.704f, 16.147f, 14.723f, 16.427f, 14.757f)
                curveTo(16.682f, 14.788f, 16.937f, 14.83f, 17.168f, 14.879f)
                lineTo(17.182f, 14.801f)
                curveTo(16.947f, 14.751f, 16.69f, 14.708f, 16.434f, 14.677f)
                curveTo(16.152f, 14.644f, 15.87f, 14.624f, 15.619f, 14.624f)
                curveTo(15.87f, 14.624f, 16.152f, 14.643f, 16.434f, 14.677f)
                curveTo(16.717f, 14.711f, 16.999f, 14.759f, 17.25f, 14.816f)
                curveTo(17.555f, 14.884f, 17.634f, 15.02f, 17.435f, 15.179f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD62818))) {
                moveTo(15.366f, 15.51f)
                lineTo(15.171f, 15.168f)
                curveTo(15.348f, 15.054f, 15.575f, 15f, 15.851f, 15f)
                curveTo(16.128f, 15f, 16.353f, 15.054f, 16.524f, 15.171f)
                lineTo(16.322f, 15.508f)
                curveTo(16.219f, 15.438f, 16.063f, 15.399f, 15.851f, 15.399f)
                curveTo(15.639f, 15.399f, 15.477f, 15.438f, 15.366f, 15.51f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DominicanRepublicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.DominicanRepublic,
            contentDescription = "Dominican Republic Flag"
        )
    }
}
