package flagpack.icons.small

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Northern Mariana Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: MP
 * - ISO Alpha-3: MNP
 * - ISO Numeric: 580
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.NorthernMarianaIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Northern Mariana Islands:MP:MNP:580:Small",
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
                fill = SolidColor(Color(0xFF2993EC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.106f, 5.792f)
                curveTo(3.106f, 8.438f, 5.297f, 10.583f, 8f, 10.583f)
                curveTo(10.703f, 10.583f, 12.894f, 8.438f, 12.894f, 5.792f)
                curveTo(12.894f, 3.145f, 10.703f, 1f, 8f, 1f)
                curveTo(5.297f, 1f, 3.106f, 3.145f, 3.106f, 5.792f)
                close()
                moveTo(11.83f, 5.792f)
                curveTo(11.83f, 7.863f, 10.115f, 9.542f, 8f, 9.542f)
                curveTo(5.885f, 9.542f, 4.17f, 7.863f, 4.17f, 5.792f)
                curveTo(4.17f, 3.721f, 5.885f, 2.042f, 8f, 2.042f)
                curveTo(10.115f, 2.042f, 11.83f, 3.721f, 11.83f, 5.792f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.532f, 5.792f)
                curveTo(3.532f, 8.208f, 5.532f, 10.167f, 8f, 10.167f)
                curveTo(10.468f, 10.167f, 12.468f, 8.208f, 12.468f, 5.792f)
                curveTo(12.468f, 3.375f, 10.468f, 1.417f, 8f, 1.417f)
                curveTo(5.532f, 1.417f, 3.532f, 3.375f, 3.532f, 5.792f)
                close()
                moveTo(12.255f, 5.792f)
                curveTo(12.255f, 8.093f, 10.35f, 9.958f, 8f, 9.958f)
                curveTo(5.65f, 9.958f, 3.745f, 8.093f, 3.745f, 5.792f)
                curveTo(3.745f, 3.49f, 5.65f, 1.625f, 8f, 1.625f)
                curveTo(10.35f, 1.625f, 12.255f, 3.49f, 12.255f, 5.792f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(8f, 10.092f)
                curveTo(5.572f, 10.092f, 3.607f, 8.165f, 3.607f, 5.792f)
                horizontalLineTo(3.457f)
                curveTo(3.457f, 8.251f, 5.492f, 10.242f, 8f, 10.242f)
                verticalLineTo(10.092f)
                close()
                moveTo(12.393f, 5.792f)
                curveTo(12.393f, 8.165f, 10.428f, 10.092f, 8f, 10.092f)
                verticalLineTo(10.242f)
                curveTo(10.508f, 10.242f, 12.543f, 8.251f, 12.543f, 5.792f)
                horizontalLineTo(12.393f)
                close()
                moveTo(8f, 1.492f)
                curveTo(10.428f, 1.492f, 12.393f, 3.418f, 12.393f, 5.792f)
                horizontalLineTo(12.543f)
                curveTo(12.543f, 3.333f, 10.508f, 1.342f, 8f, 1.342f)
                verticalLineTo(1.492f)
                close()
                moveTo(3.607f, 5.792f)
                curveTo(3.607f, 3.418f, 5.572f, 1.492f, 8f, 1.492f)
                verticalLineTo(1.342f)
                curveTo(5.492f, 1.342f, 3.457f, 3.333f, 3.457f, 5.792f)
                horizontalLineTo(3.607f)
                close()
                moveTo(8f, 10.033f)
                curveTo(10.39f, 10.033f, 12.33f, 8.136f, 12.33f, 5.792f)
                horizontalLineTo(12.18f)
                curveTo(12.18f, 8.05f, 10.31f, 9.883f, 8f, 9.883f)
                verticalLineTo(10.033f)
                close()
                moveTo(3.67f, 5.792f)
                curveTo(3.67f, 8.136f, 5.61f, 10.033f, 8f, 10.033f)
                verticalLineTo(9.883f)
                curveTo(5.69f, 9.883f, 3.82f, 8.05f, 3.82f, 5.792f)
                horizontalLineTo(3.67f)
                close()
                moveTo(8f, 1.55f)
                curveTo(5.61f, 1.55f, 3.67f, 3.448f, 3.67f, 5.792f)
                horizontalLineTo(3.82f)
                curveTo(3.82f, 3.533f, 5.69f, 1.7f, 8f, 1.7f)
                verticalLineTo(1.55f)
                close()
                moveTo(12.33f, 5.792f)
                curveTo(12.33f, 3.448f, 10.39f, 1.55f, 8f, 1.55f)
                verticalLineTo(1.7f)
                curveTo(10.31f, 1.7f, 12.18f, 3.533f, 12.18f, 5.792f)
                horizontalLineTo(12.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA7A7A7)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.293f, 2.875f)
                curveTo(7.11f, 2.875f, 6.973f, 3.045f, 7.012f, 3.224f)
                lineTo(7.206f, 4.108f)
                curveTo(7.223f, 4.185f, 7.27f, 4.25f, 7.334f, 4.29f)
                curveTo(7.275f, 4.335f, 7.235f, 4.404f, 7.225f, 4.482f)
                lineTo(6.531f, 10.305f)
                curveTo(6.519f, 10.412f, 6.566f, 10.517f, 6.66f, 10.57f)
                curveTo(6.921f, 10.719f, 7.487f, 11f, 8.053f, 11f)
                curveTo(8.619f, 11f, 9.185f, 10.719f, 9.447f, 10.57f)
                curveTo(9.54f, 10.517f, 9.588f, 10.412f, 9.575f, 10.305f)
                lineTo(8.881f, 4.482f)
                curveTo(8.872f, 4.404f, 8.831f, 4.335f, 8.772f, 4.29f)
                curveTo(8.836f, 4.25f, 8.884f, 4.185f, 8.901f, 4.108f)
                lineTo(9.094f, 3.224f)
                curveTo(9.133f, 3.045f, 8.997f, 2.875f, 8.813f, 2.875f)
                horizontalLineTo(7.293f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(3.26f, 6.006f)
                curveTo(3.285f, 5.924f, 3.375f, 5.877f, 3.459f, 5.903f)
                curveTo(3.543f, 5.928f, 3.591f, 6.015f, 3.565f, 6.098f)
                curveTo(3.52f, 6.241f, 3.52f, 6.451f, 3.569f, 6.727f)
                curveTo(3.588f, 6.833f, 3.611f, 6.915f, 3.638f, 6.987f)
                curveTo(3.649f, 7.016f, 3.661f, 7.042f, 3.676f, 7.075f)
                curveTo(3.669f, 7.06f, 3.706f, 7.139f, 3.715f, 7.159f)
                curveTo(3.763f, 7.267f, 3.784f, 7.362f, 3.784f, 7.501f)
                curveTo(3.784f, 7.587f, 3.713f, 7.657f, 3.624f, 7.657f)
                curveTo(3.536f, 7.657f, 3.465f, 7.587f, 3.465f, 7.501f)
                curveTo(3.465f, 7.406f, 3.453f, 7.353f, 3.422f, 7.284f)
                curveTo(3.415f, 7.267f, 3.38f, 7.194f, 3.385f, 7.204f)
                curveTo(3.367f, 7.166f, 3.353f, 7.133f, 3.339f, 7.097f)
                curveTo(3.305f, 7.006f, 3.277f, 6.906f, 3.255f, 6.781f)
                curveTo(3.198f, 6.461f, 3.198f, 6.204f, 3.26f, 6.006f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.106f, 8.09f)
                lineTo(6.049f, 9.491f)
                lineTo(6.775f, 7.142f)
                lineTo(4.778f, 5.66f)
                lineTo(7.283f, 5.61f)
                lineTo(8.106f, 3.292f)
                lineTo(8.929f, 5.61f)
                lineTo(11.435f, 5.66f)
                lineTo(9.438f, 7.142f)
                lineTo(10.164f, 9.491f)
                lineTo(8.106f, 8.09f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(12.78f, 6.215f)
                curveTo(12.754f, 6.132f, 12.665f, 6.086f, 12.58f, 6.111f)
                curveTo(12.496f, 6.136f, 12.449f, 6.224f, 12.474f, 6.306f)
                curveTo(12.519f, 6.449f, 12.519f, 6.66f, 12.47f, 6.936f)
                curveTo(12.451f, 7.042f, 12.429f, 7.123f, 12.401f, 7.195f)
                curveTo(12.39f, 7.224f, 12.379f, 7.251f, 12.363f, 7.283f)
                curveTo(12.37f, 7.269f, 12.333f, 7.347f, 12.324f, 7.368f)
                curveTo(12.276f, 7.476f, 12.255f, 7.57f, 12.255f, 7.709f)
                curveTo(12.255f, 7.795f, 12.327f, 7.865f, 12.415f, 7.865f)
                curveTo(12.503f, 7.865f, 12.575f, 7.795f, 12.575f, 7.709f)
                curveTo(12.575f, 7.614f, 12.586f, 7.562f, 12.617f, 7.492f)
                curveTo(12.624f, 7.475f, 12.659f, 7.402f, 12.654f, 7.413f)
                curveTo(12.672f, 7.374f, 12.686f, 7.341f, 12.7f, 7.305f)
                curveTo(12.734f, 7.214f, 12.762f, 7.114f, 12.784f, 6.99f)
                curveTo(12.841f, 6.669f, 12.841f, 6.412f, 12.78f, 6.215f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.03f, 1.574f)
                curveTo(8.03f, 1.574f, 8.613f, 1.833f, 8.361f, 2.242f)
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.456f, 1.574f)
                curveTo(8.456f, 1.574f, 9.038f, 1.833f, 8.787f, 2.242f)
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(4.63f, 3.178f)
                curveTo(4.672f, 3.105f, 4.761f, 3.083f, 4.828f, 3.129f)
                curveTo(4.895f, 3.175f, 4.915f, 3.272f, 4.873f, 3.345f)
                curveTo(4.792f, 3.485f, 4.75f, 3.677f, 4.75f, 3.924f)
                curveTo(4.75f, 4.01f, 4.686f, 4.08f, 4.606f, 4.08f)
                curveTo(4.527f, 4.08f, 4.463f, 4.01f, 4.463f, 3.924f)
                curveTo(4.463f, 3.622f, 4.517f, 3.373f, 4.63f, 3.178f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(4.404f, 4.606f)
                curveTo(4.404f, 4.693f, 4.34f, 4.763f, 4.261f, 4.763f)
                curveTo(4.181f, 4.763f, 4.117f, 4.693f, 4.117f, 4.606f)
                verticalLineTo(4.161f)
                curveTo(4.117f, 3.846f, 4.166f, 3.598f, 4.271f, 3.417f)
                curveTo(4.313f, 3.344f, 4.401f, 3.322f, 4.468f, 3.368f)
                curveTo(4.536f, 3.413f, 4.556f, 3.51f, 4.514f, 3.583f)
                curveTo(4.443f, 3.707f, 4.404f, 3.9f, 4.404f, 4.161f)
                verticalLineTo(4.606f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(11.742f, 4.398f)
                curveTo(11.742f, 4.484f, 11.806f, 4.554f, 11.886f, 4.554f)
                curveTo(11.965f, 4.554f, 12.029f, 4.484f, 12.029f, 4.398f)
                verticalLineTo(3.953f)
                curveTo(12.029f, 3.638f, 11.98f, 3.39f, 11.876f, 3.209f)
                curveTo(11.834f, 3.136f, 11.745f, 3.113f, 11.678f, 3.159f)
                curveTo(11.611f, 3.205f, 11.59f, 3.301f, 11.632f, 3.375f)
                curveTo(11.704f, 3.499f, 11.742f, 3.692f, 11.742f, 3.953f)
                verticalLineTo(4.398f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(12.168f, 5.127f)
                curveTo(12.168f, 5.213f, 12.232f, 5.283f, 12.311f, 5.283f)
                curveTo(12.391f, 5.283f, 12.455f, 5.213f, 12.455f, 5.127f)
                verticalLineTo(4.682f)
                curveTo(12.455f, 4.367f, 12.405f, 4.119f, 12.301f, 3.938f)
                curveTo(12.259f, 3.865f, 12.171f, 3.843f, 12.103f, 3.888f)
                curveTo(12.036f, 3.934f, 12.016f, 4.031f, 12.058f, 4.104f)
                curveTo(12.129f, 4.228f, 12.168f, 4.421f, 12.168f, 4.682f)
                verticalLineTo(5.127f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthernMarianaIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.NorthernMarianaIslands,
            contentDescription = "Northern Mariana Islands Flag"
        )
    }
}
