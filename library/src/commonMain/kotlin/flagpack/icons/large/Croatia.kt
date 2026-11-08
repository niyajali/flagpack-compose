package flagpack.icons.large

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
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.32f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.653f, 5.757f)
                lineToRelative(10.128f, 0f)
                lineToRelative(0f, 2.56f)
                lineToRelative(-10.128f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.32f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.652f, 8.32f)
                lineTo(20.781f, 8.32f)
                curveTo(20.798f, 9.089f, 20.803f, 10.43f, 20.803f, 11.722f)
                curveTo(20.803f, 12.555f, 20.801f, 13.358f, 20.799f, 13.953f)
                lineTo(20.796f, 14.666f)
                lineTo(20.795f, 14.863f)
                lineTo(20.794f, 14.892f)
                lineTo(20.794f, 14.895f)
                curveTo(20.789f, 14.922f, 20.782f, 14.963f, 20.77f, 15.018f)
                curveTo(20.747f, 15.129f, 20.709f, 15.29f, 20.647f, 15.486f)
                curveTo(20.523f, 15.879f, 20.31f, 16.401f, 19.955f, 16.919f)
                curveTo(19.261f, 17.933f, 18f, 18.975f, 15.65f, 18.975f)
                curveTo(13.303f, 18.975f, 12.103f, 17.934f, 11.464f, 16.93f)
                curveTo(11.136f, 16.414f, 10.949f, 15.895f, 10.844f, 15.502f)
                curveTo(10.792f, 15.306f, 10.761f, 15.145f, 10.743f, 15.035f)
                curveTo(10.735f, 14.98f, 10.729f, 14.938f, 10.726f, 14.911f)
                lineTo(10.724f, 14.894f)
                lineTo(10.723f, 14.85f)
                lineTo(10.721f, 14.654f)
                lineTo(10.713f, 13.945f)
                curveTo(10.706f, 13.354f, 10.696f, 12.556f, 10.687f, 11.725f)
                curveTo(10.672f, 10.455f, 10.658f, 9.113f, 10.652f, 8.32f)
                close()
                moveTo(10.722f, 14.879f)
                curveTo(10.722f, 14.878f, 10.722f, 14.878f, 10.722f, 14.879f)
                lineTo(10.722f, 14.879f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10.652f, 8.32f)
                lineTo(20.781f, 8.32f)
                curveTo(20.798f, 9.089f, 20.803f, 10.43f, 20.803f, 11.722f)
                curveTo(20.803f, 12.555f, 20.801f, 13.358f, 20.799f, 13.953f)
                lineTo(20.796f, 14.666f)
                lineTo(20.795f, 14.863f)
                lineTo(20.794f, 14.892f)
                lineTo(20.794f, 14.895f)
                curveTo(20.789f, 14.922f, 20.782f, 14.963f, 20.77f, 15.018f)
                curveTo(20.747f, 15.129f, 20.709f, 15.29f, 20.647f, 15.486f)
                curveTo(20.523f, 15.879f, 20.31f, 16.401f, 19.955f, 16.919f)
                curveTo(19.261f, 17.933f, 18f, 18.975f, 15.65f, 18.975f)
                curveTo(13.303f, 18.975f, 12.103f, 17.934f, 11.464f, 16.93f)
                curveTo(11.136f, 16.414f, 10.949f, 15.895f, 10.844f, 15.502f)
                curveTo(10.792f, 15.306f, 10.761f, 15.145f, 10.743f, 15.035f)
                curveTo(10.735f, 14.98f, 10.729f, 14.938f, 10.726f, 14.911f)
                lineTo(10.724f, 14.894f)
                lineTo(10.723f, 14.85f)
                lineTo(10.721f, 14.654f)
                lineTo(10.713f, 13.945f)
                curveTo(10.706f, 13.354f, 10.696f, 12.556f, 10.687f, 11.725f)
                curveTo(10.672f, 10.455f, 10.658f, 9.113f, 10.652f, 8.32f)
                close()
                moveTo(10.722f, 14.879f)
                curveTo(10.722f, 14.878f, 10.722f, 14.878f, 10.722f, 14.879f)
                lineTo(10.722f, 14.879f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.498f, 8.4f)
                lineTo(12.608f, 8.4f)
                lineTo(12.608f, 10.542f)
                lineTo(10.498f, 10.542f)
                lineTo(10.498f, 8.4f)
                close()
                moveTo(14.717f, 10.542f)
                lineTo(12.608f, 10.542f)
                lineTo(12.608f, 12.684f)
                lineTo(10.498f, 12.684f)
                lineTo(10.498f, 14.826f)
                lineTo(12.608f, 14.826f)
                lineTo(12.608f, 16.968f)
                lineTo(10.498f, 16.968f)
                lineTo(10.498f, 19.109f)
                lineTo(12.608f, 19.109f)
                lineTo(12.608f, 16.968f)
                lineTo(14.717f, 16.968f)
                lineTo(14.717f, 19.109f)
                lineTo(16.827f, 19.109f)
                lineTo(16.827f, 16.968f)
                lineTo(18.936f, 16.968f)
                lineTo(18.936f, 19.109f)
                lineTo(21.045f, 19.109f)
                lineTo(21.045f, 16.968f)
                lineTo(18.936f, 16.968f)
                lineTo(18.936f, 14.826f)
                lineTo(21.045f, 14.826f)
                lineTo(21.045f, 12.684f)
                lineTo(18.936f, 12.684f)
                lineTo(18.936f, 10.542f)
                lineTo(21.045f, 10.542f)
                lineTo(21.045f, 8.4f)
                lineTo(18.936f, 8.4f)
                lineTo(18.936f, 10.542f)
                lineTo(16.827f, 10.542f)
                lineTo(16.827f, 8.4f)
                lineTo(14.717f, 8.4f)
                lineTo(14.717f, 10.542f)
                close()
                moveTo(14.717f, 12.684f)
                lineTo(14.717f, 10.542f)
                lineTo(16.827f, 10.542f)
                lineTo(16.827f, 12.684f)
                lineTo(14.717f, 12.684f)
                close()
                moveTo(14.717f, 14.826f)
                lineTo(14.717f, 12.684f)
                lineTo(12.608f, 12.684f)
                lineTo(12.608f, 14.826f)
                lineTo(14.717f, 14.826f)
                close()
                moveTo(16.827f, 14.826f)
                lineTo(16.827f, 16.968f)
                lineTo(14.717f, 16.968f)
                lineTo(14.717f, 14.826f)
                lineTo(16.827f, 14.826f)
                close()
                moveTo(16.827f, 14.826f)
                lineTo(16.827f, 12.684f)
                lineTo(18.936f, 12.684f)
                lineTo(18.936f, 14.826f)
                lineTo(16.827f, 14.826f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.16f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.486f, 8.324f)
            curveTo(10.486f, 8.324f, 11.095f, 7.95f, 11.615f, 7.758f)
            curveTo(12.134f, 7.565f, 12.545f, 7.46f, 12.545f, 7.46f)
            lineTo(11.772f, 4.188f)
            lineTo(10.223f, 3.524f)
            lineTo(9.346f, 5.184f)
            lineTo(10.486f, 8.324f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(10.232f, 6.532f)
            lineTo(10.409f, 6.433f)
            curveTo(10.593f, 6.884f, 10.836f, 7.024f, 11.168f, 6.882f)
            curveTo(11.507f, 6.736f, 11.645f, 6.462f, 11.596f, 6.026f)
            lineTo(11.792f, 5.996f)
            curveTo(11.852f, 6.537f, 11.662f, 6.914f, 11.236f, 7.097f)
            curveTo(10.802f, 7.283f, 10.457f, 7.084f, 10.232f, 6.532f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.653f, 5.514f)
            lineTo(10.483f, 5.633f)
            curveTo(10.445f, 5.659f, 10.398f, 5.621f, 10.407f, 5.572f)
            lineTo(10.446f, 5.348f)
            lineTo(10.271f, 5.238f)
            curveTo(10.233f, 5.213f, 10.238f, 5.148f, 10.279f, 5.132f)
            lineTo(10.468f, 5.058f)
            lineTo(10.463f, 4.83f)
            curveTo(10.463f, 4.779f, 10.514f, 4.752f, 10.547f, 4.785f)
            lineTo(10.697f, 4.935f)
            lineTo(10.867f, 4.817f)
            curveTo(10.905f, 4.791f, 10.952f, 4.829f, 10.943f, 4.878f)
            lineTo(10.905f, 5.102f)
            lineTo(11.079f, 5.212f)
            curveTo(11.117f, 5.236f, 11.112f, 5.302f, 11.071f, 5.318f)
            lineTo(10.882f, 5.392f)
            lineTo(10.887f, 5.62f)
            curveTo(10.888f, 5.67f, 10.836f, 5.698f, 10.803f, 5.665f)
            lineTo(10.653f, 5.514f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.172f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.541f, 7.121f)
            curveTo(14.541f, 7.121f, 15.097f, 7.064f, 15.682f, 7.077f)
            curveTo(16.266f, 7.09f, 16.761f, 7.095f, 16.761f, 7.095f)
            lineTo(17.047f, 3.625f)
            lineTo(15.794f, 2.32f)
            lineTo(14.402f, 3.655f)
            lineTo(14.541f, 7.121f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.75f, 6.555f)
            curveTo(16.233f, 6.555f, 16.279f, 5.954f, 16.279f, 5.545f)
            curveTo(16.155f, 5.318f, 16.18f, 5.155f, 15.785f, 5.155f)
            curveTo(15.39f, 5.155f, 15.344f, 5.293f, 15.229f, 5.545f)
            curveTo(15.229f, 5.954f, 15.268f, 6.555f, 15.75f, 6.555f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.293f, 4.858f)
            curveTo(16.775f, 4.858f, 16.822f, 4.257f, 16.822f, 3.848f)
            curveTo(16.698f, 3.621f, 16.723f, 3.458f, 16.328f, 3.458f)
            curveTo(15.932f, 3.458f, 15.887f, 3.596f, 15.772f, 3.848f)
            curveTo(15.772f, 4.257f, 15.811f, 4.858f, 16.293f, 4.858f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.238f, 4.858f)
            curveTo(15.721f, 4.858f, 15.767f, 4.257f, 15.767f, 3.848f)
            curveTo(15.644f, 3.621f, 15.668f, 3.458f, 15.273f, 3.458f)
            curveTo(14.878f, 3.458f, 14.833f, 3.596f, 14.717f, 3.848f)
            curveTo(14.717f, 4.257f, 14.756f, 4.858f, 15.238f, 4.858f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.135f
        ) {
            moveTo(12.435f, 7.208f)
            lineTo(12.525f, 7.565f)
            lineTo(12.828f, 7.453f)
            lineTo(12.828f, 7.453f)
            lineTo(12.828f, 7.453f)
            lineTo(12.828f, 7.453f)
            lineTo(12.829f, 7.453f)
            lineTo(12.833f, 7.451f)
            lineTo(12.848f, 7.446f)
            lineTo(12.907f, 7.425f)
            curveTo(12.957f, 7.407f, 13.027f, 7.383f, 13.106f, 7.357f)
            curveTo(13.269f, 7.305f, 13.454f, 7.252f, 13.584f, 7.231f)
            curveTo(13.724f, 7.208f, 13.901f, 7.191f, 14.047f, 7.18f)
            curveTo(14.119f, 7.174f, 14.181f, 7.17f, 14.226f, 7.167f)
            lineTo(14.278f, 7.164f)
            lineTo(14.292f, 7.164f)
            lineTo(14.296f, 7.163f)
            lineTo(14.296f, 7.163f)
            lineTo(14.297f, 7.163f)
            lineTo(14.297f, 7.163f)
            lineTo(14.297f, 7.163f)
            lineTo(14.297f, 7.163f)
            lineTo(14.623f, 7.148f)
            lineTo(14.595f, 6.767f)
            lineTo(14.398f, 4.097f)
            lineTo(14.385f, 3.929f)
            lineTo(14.268f, 3.831f)
            lineTo(13.205f, 2.947f)
            lineTo(12.986f, 2.765f)
            lineTo(12.799f, 2.991f)
            lineTo(11.833f, 4.164f)
            lineTo(11.707f, 4.316f)
            lineTo(11.759f, 4.52f)
            lineTo(12.435f, 7.208f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(12.435f, 7.208f)
                lineTo(12.525f, 7.565f)
                lineTo(12.828f, 7.453f)
                lineTo(12.828f, 7.453f)
                lineTo(12.828f, 7.453f)
                lineTo(12.828f, 7.453f)
                lineTo(12.829f, 7.453f)
                lineTo(12.833f, 7.451f)
                lineTo(12.848f, 7.446f)
                lineTo(12.907f, 7.425f)
                curveTo(12.957f, 7.407f, 13.027f, 7.383f, 13.106f, 7.357f)
                curveTo(13.269f, 7.305f, 13.454f, 7.252f, 13.584f, 7.231f)
                curveTo(13.724f, 7.208f, 13.901f, 7.191f, 14.047f, 7.18f)
                curveTo(14.119f, 7.174f, 14.181f, 7.17f, 14.226f, 7.167f)
                lineTo(14.278f, 7.164f)
                lineTo(14.292f, 7.164f)
                lineTo(14.296f, 7.163f)
                lineTo(14.296f, 7.163f)
                lineTo(14.297f, 7.163f)
                lineTo(14.297f, 7.163f)
                lineTo(14.297f, 7.163f)
                lineTo(14.297f, 7.163f)
                lineTo(14.623f, 7.148f)
                lineTo(14.595f, 6.767f)
                lineTo(14.398f, 4.097f)
                lineTo(14.385f, 3.929f)
                lineTo(14.268f, 3.831f)
                lineTo(13.205f, 2.947f)
                lineTo(12.986f, 2.765f)
                lineTo(12.799f, 2.991f)
                lineTo(11.833f, 4.164f)
                lineTo(11.707f, 4.316f)
                lineTo(11.759f, 4.52f)
                lineTo(12.435f, 7.208f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(12.597f, 6.51f)
                lineTo(12.401f, 5.971f)
                curveTo(12.821f, 5.756f, 13.53f, 5.624f, 14.276f, 5.572f)
                lineTo(14.304f, 6.158f)
                curveTo(13.611f, 6.206f, 12.955f, 6.326f, 12.597f, 6.51f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(12.267f, 5.206f)
                lineTo(12.072f, 4.668f)
                curveTo(12.491f, 4.453f, 13.393f, 4.279f, 14.139f, 4.227f)
                lineTo(14.168f, 4.813f)
                curveTo(13.474f, 4.861f, 12.625f, 5.023f, 12.267f, 5.206f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.137f
        ) {
            moveTo(18.986f, 7.195f)
            lineTo(18.899f, 7.562f)
            lineTo(18.581f, 7.448f)
            lineTo(18.581f, 7.448f)
            lineTo(18.581f, 7.448f)
            lineTo(18.58f, 7.448f)
            lineTo(18.58f, 7.447f)
            lineTo(18.576f, 7.446f)
            lineTo(18.56f, 7.44f)
            lineTo(18.5f, 7.419f)
            curveTo(18.448f, 7.402f, 18.376f, 7.378f, 18.295f, 7.352f)
            curveTo(18.128f, 7.3f, 17.939f, 7.247f, 17.806f, 7.226f)
            curveTo(17.662f, 7.203f, 17.481f, 7.186f, 17.331f, 7.175f)
            curveTo(17.257f, 7.169f, 17.193f, 7.165f, 17.147f, 7.163f)
            lineTo(17.093f, 7.16f)
            lineTo(17.079f, 7.159f)
            lineTo(17.075f, 7.159f)
            lineTo(17.075f, 7.159f)
            lineTo(17.074f, 7.159f)
            lineTo(17.074f, 7.159f)
            lineTo(17.074f, 7.159f)
            lineTo(17.074f, 7.159f)
            lineTo(16.74f, 7.143f)
            lineTo(16.769f, 6.763f)
            lineTo(16.971f, 4.099f)
            lineTo(16.983f, 3.931f)
            lineTo(17.104f, 3.834f)
            lineTo(18.194f, 2.952f)
            lineTo(18.425f, 2.765f)
            lineTo(18.616f, 3.003f)
            lineTo(19.55f, 4.168f)
            lineTo(19.668f, 4.316f)
            lineTo(19.623f, 4.509f)
            lineTo(18.986f, 7.195f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(18.986f, 7.195f)
                lineTo(18.899f, 7.562f)
                lineTo(18.581f, 7.448f)
                lineTo(18.581f, 7.448f)
                lineTo(18.581f, 7.448f)
                lineTo(18.58f, 7.448f)
                lineTo(18.58f, 7.447f)
                lineTo(18.576f, 7.446f)
                lineTo(18.56f, 7.44f)
                lineTo(18.5f, 7.419f)
                curveTo(18.448f, 7.402f, 18.376f, 7.378f, 18.295f, 7.352f)
                curveTo(18.128f, 7.3f, 17.939f, 7.247f, 17.806f, 7.226f)
                curveTo(17.662f, 7.203f, 17.481f, 7.186f, 17.331f, 7.175f)
                curveTo(17.257f, 7.169f, 17.193f, 7.165f, 17.147f, 7.163f)
                lineTo(17.093f, 7.16f)
                lineTo(17.079f, 7.159f)
                lineTo(17.075f, 7.159f)
                lineTo(17.075f, 7.159f)
                lineTo(17.074f, 7.159f)
                lineTo(17.074f, 7.159f)
                lineTo(17.074f, 7.159f)
                lineTo(17.074f, 7.159f)
                lineTo(16.74f, 7.143f)
                lineTo(16.769f, 6.763f)
                lineTo(16.971f, 4.099f)
                lineTo(16.983f, 3.931f)
                lineTo(17.104f, 3.834f)
                lineTo(18.194f, 2.952f)
                lineTo(18.425f, 2.765f)
                lineTo(18.616f, 3.003f)
                lineTo(19.55f, 4.168f)
                lineTo(19.668f, 4.316f)
                lineTo(19.623f, 4.509f)
                lineTo(18.986f, 7.195f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.359f, 6.35f)
                curveTo(18.359f, 6.35f, 18.594f, 6.201f, 18.628f, 5.95f)
                curveTo(18.662f, 5.699f, 19.026f, 5.389f, 18.844f, 5.426f)
                curveTo(18.662f, 5.463f, 18.766f, 5.492f, 18.503f, 5.426f)
                curveTo(18.239f, 5.36f, 17.898f, 5.317f, 17.898f, 5.133f)
                curveTo(17.898f, 4.948f, 18.068f, 4.802f, 17.929f, 4.802f)
                curveTo(17.791f, 4.802f, 17.495f, 4.627f, 17.555f, 4.761f)
                curveTo(17.614f, 4.894f, 17.418f, 4.743f, 17.516f, 5.02f)
                curveTo(17.614f, 5.297f, 17.495f, 5.576f, 17.555f, 5.65f)
                curveTo(17.614f, 5.723f, 17.516f, 6.083f, 17.516f, 6.083f)
                curveTo(17.516f, 6.083f, 17.552f, 6.217f, 17.615f, 6.016f)
                curveTo(17.678f, 5.816f, 17.816f, 5.676f, 17.747f, 5.846f)
                curveTo(17.678f, 6.016f, 17.59f, 6.422f, 17.669f, 6.35f)
                curveTo(17.747f, 6.279f, 17.825f, 6.083f, 17.825f, 6.016f)
                curveTo(17.825f, 5.95f, 18.022f, 5.69f, 18.022f, 5.886f)
                curveTo(18.022f, 6.083f, 17.837f, 6.238f, 17.929f, 6.238f)
                curveTo(18.022f, 6.238f, 18.075f, 6.28f, 18.133f, 6.083f)
                curveTo(18.191f, 5.886f, 18.333f, 5.756f, 18.392f, 5.886f)
                curveTo(18.45f, 6.016f, 18.437f, 6.009f, 18.359f, 6.18f)
                curveTo(18.281f, 6.35f, 18.359f, 6.35f, 18.359f, 6.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.807f, 4.893f)
                lineTo(17.719f, 4.726f)
                curveTo(17.876f, 4.616f, 18.021f, 4.586f, 18.147f, 4.648f)
                curveTo(18.205f, 4.676f, 18.248f, 4.708f, 18.361f, 4.798f)
                lineTo(18.376f, 4.81f)
                curveTo(18.494f, 4.904f, 18.556f, 4.943f, 18.595f, 4.943f)
                lineTo(18.595f, 5.138f)
                curveTo(18.507f, 5.138f, 18.431f, 5.091f, 18.28f, 4.971f)
                lineTo(18.265f, 4.959f)
                curveTo(18.163f, 4.877f, 18.124f, 4.848f, 18.082f, 4.828f)
                curveTo(18.012f, 4.794f, 17.922f, 4.812f, 17.807f, 4.893f)
                close()
                moveTo(17.53f, 6.166f)
                curveTo(17.579f, 6.166f, 17.62f, 6.12f, 17.62f, 6.064f)
                curveTo(17.62f, 6.008f, 17.579f, 5.963f, 17.53f, 5.963f)
                curveTo(17.48f, 5.963f, 17.44f, 6.008f, 17.44f, 6.064f)
                curveTo(17.44f, 6.12f, 17.48f, 6.166f, 17.53f, 6.166f)
                close()
                moveTo(17.788f, 6.259f)
                curveTo(17.788f, 6.315f, 17.748f, 6.361f, 17.698f, 6.361f)
                curveTo(17.649f, 6.361f, 17.608f, 6.315f, 17.608f, 6.259f)
                curveTo(17.608f, 6.204f, 17.649f, 6.158f, 17.698f, 6.158f)
                curveTo(17.748f, 6.158f, 17.788f, 6.204f, 17.788f, 6.259f)
                close()
                moveTo(18.002f, 6.353f)
                curveTo(18.051f, 6.353f, 18.092f, 6.308f, 18.092f, 6.252f)
                curveTo(18.092f, 6.196f, 18.051f, 6.151f, 18.002f, 6.151f)
                curveTo(17.952f, 6.151f, 17.912f, 6.196f, 17.912f, 6.252f)
                curveTo(17.912f, 6.308f, 17.952f, 6.353f, 18.002f, 6.353f)
                close()
                moveTo(18.374f, 6.414f)
                curveTo(18.374f, 6.47f, 18.333f, 6.515f, 18.284f, 6.515f)
                curveTo(18.234f, 6.515f, 18.194f, 6.47f, 18.194f, 6.414f)
                curveTo(18.194f, 6.358f, 18.234f, 6.313f, 18.284f, 6.313f)
                curveTo(18.333f, 6.313f, 18.374f, 6.358f, 18.374f, 6.414f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.128f
        ) {
            moveTo(21.252f, 8.129f)
            lineTo(21.126f, 8.479f)
            lineTo(20.848f, 8.299f)
            lineTo(20.848f, 8.299f)
            lineTo(20.848f, 8.299f)
            lineTo(20.848f, 8.299f)
            lineTo(20.847f, 8.299f)
            lineTo(20.847f, 8.299f)
            lineTo(20.843f, 8.297f)
            lineTo(20.829f, 8.287f)
            curveTo(20.816f, 8.279f, 20.797f, 8.267f, 20.772f, 8.252f)
            curveTo(20.724f, 8.222f, 20.654f, 8.18f, 20.573f, 8.134f)
            curveTo(20.407f, 8.04f, 20.2f, 7.931f, 20.015f, 7.859f)
            curveTo(19.819f, 7.782f, 19.643f, 7.723f, 19.516f, 7.682f)
            curveTo(19.453f, 7.662f, 19.402f, 7.647f, 19.368f, 7.637f)
            lineTo(19.328f, 7.626f)
            lineTo(19.319f, 7.623f)
            lineTo(19.316f, 7.623f)
            lineTo(19.316f, 7.622f)
            lineTo(19.316f, 7.622f)
            lineTo(19.316f, 7.622f)
            lineTo(19.316f, 7.622f)
            lineTo(19.316f, 7.622f)
            lineTo(19.015f, 7.541f)
            lineTo(19.099f, 7.182f)
            lineTo(19.715f, 4.56f)
            lineTo(19.755f, 4.389f)
            lineTo(19.893f, 4.327f)
            lineTo(21.101f, 3.781f)
            lineTo(21.326f, 3.679f)
            lineTo(21.451f, 3.928f)
            lineTo(22.135f, 5.292f)
            lineTo(22.213f, 5.448f)
            lineTo(22.153f, 5.615f)
            lineTo(21.252f, 8.129f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(21.252f, 8.129f)
                lineTo(21.126f, 8.479f)
                lineTo(20.848f, 8.299f)
                lineTo(20.848f, 8.299f)
                lineTo(20.848f, 8.299f)
                lineTo(20.848f, 8.299f)
                lineTo(20.847f, 8.299f)
                lineTo(20.847f, 8.299f)
                lineTo(20.843f, 8.297f)
                lineTo(20.829f, 8.287f)
                curveTo(20.816f, 8.279f, 20.797f, 8.267f, 20.772f, 8.252f)
                curveTo(20.724f, 8.222f, 20.654f, 8.18f, 20.573f, 8.134f)
                curveTo(20.407f, 8.04f, 20.2f, 7.931f, 20.015f, 7.859f)
                curveTo(19.819f, 7.782f, 19.643f, 7.723f, 19.516f, 7.682f)
                curveTo(19.453f, 7.662f, 19.402f, 7.647f, 19.368f, 7.637f)
                lineTo(19.328f, 7.626f)
                lineTo(19.319f, 7.623f)
                lineTo(19.316f, 7.623f)
                lineTo(19.316f, 7.622f)
                lineTo(19.316f, 7.622f)
                lineTo(19.316f, 7.622f)
                lineTo(19.316f, 7.622f)
                lineTo(19.316f, 7.622f)
                lineTo(19.015f, 7.541f)
                lineTo(19.099f, 7.182f)
                lineTo(19.715f, 4.56f)
                lineTo(19.755f, 4.389f)
                lineTo(19.893f, 4.327f)
                lineTo(21.101f, 3.781f)
                lineTo(21.326f, 3.679f)
                lineTo(21.451f, 3.928f)
                lineTo(22.135f, 5.292f)
                lineTo(22.213f, 5.448f)
                lineTo(22.153f, 5.615f)
                lineTo(21.252f, 8.129f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.988f, 5.348f)
                lineTo(20.885f, 5.488f)
                curveTo(20.862f, 5.519f, 20.819f, 5.502f, 20.816f, 5.461f)
                lineTo(20.8f, 5.274f)
                lineTo(20.648f, 5.236f)
                curveTo(20.615f, 5.227f, 20.606f, 5.174f, 20.633f, 5.15f)
                lineTo(20.759f, 5.04f)
                lineTo(20.711f, 4.862f)
                curveTo(20.7f, 4.823f, 20.733f, 4.787f, 20.764f, 4.804f)
                lineTo(20.906f, 4.881f)
                lineTo(21.009f, 4.741f)
                curveTo(21.032f, 4.71f, 21.074f, 4.726f, 21.078f, 4.768f)
                lineTo(21.093f, 4.954f)
                lineTo(21.245f, 4.993f)
                curveTo(21.279f, 5.001f, 21.288f, 5.054f, 21.26f, 5.078f)
                lineTo(21.135f, 5.188f)
                lineTo(21.183f, 5.366f)
                curveTo(21.194f, 5.406f, 21.161f, 5.442f, 21.129f, 5.425f)
                lineTo(20.988f, 5.348f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(19.436f, 6.58f)
                lineTo(19.59f, 5.849f)
                curveTo(20.275f, 6.068f, 20.989f, 6.349f, 21.513f, 6.62f)
                lineTo(21.274f, 7.316f)
                curveTo(20.779f, 7.059f, 20.093f, 6.79f, 19.436f, 6.58f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(19.645f, 5.905f)
                lineTo(19.682f, 5.722f)
                curveTo(20.338f, 5.919f, 21.036f, 6.234f, 21.543f, 6.527f)
                lineTo(21.478f, 6.698f)
                curveTo(20.98f, 6.41f, 20.292f, 6.1f, 19.645f, 5.905f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(19.451f, 6.658f)
                lineTo(19.487f, 6.475f)
                curveTo(20.144f, 6.672f, 20.751f, 6.94f, 21.258f, 7.233f)
                lineTo(21.192f, 7.403f)
                curveTo(20.695f, 7.116f, 20.098f, 6.853f, 19.451f, 6.658f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(19.747f, 6.304f)
                lineTo(19.888f, 6.228f)
                curveTo(19.947f, 6.395f, 20.02f, 6.432f, 20.142f, 6.36f)
                curveTo(20.431f, 6.191f, 21.147f, 6.428f, 21.147f, 6.748f)
                curveTo(21.147f, 6.872f, 21.087f, 6.948f, 20.996f, 6.944f)
                curveTo(20.944f, 6.941f, 20.889f, 6.917f, 20.809f, 6.868f)
                curveTo(20.799f, 6.863f, 20.792f, 6.859f, 20.777f, 6.849f)
                curveTo(20.688f, 6.794f, 20.681f, 6.79f, 20.657f, 6.779f)
                lineTo(20.708f, 6.599f)
                curveTo(20.741f, 6.613f, 20.746f, 6.617f, 20.845f, 6.678f)
                curveTo(20.86f, 6.687f, 20.866f, 6.691f, 20.875f, 6.696f)
                curveTo(20.937f, 6.733f, 20.978f, 6.752f, 21.002f, 6.753f)
                curveTo(21.004f, 6.753f, 20.993f, 6.766f, 20.993f, 6.748f)
                curveTo(20.993f, 6.607f, 20.41f, 6.414f, 20.208f, 6.533f)
                curveTo(20.006f, 6.652f, 19.84f, 6.568f, 19.747f, 6.304f)
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
