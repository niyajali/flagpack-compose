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
 * Sint Maarten Flag (16x12dp)
 *
 * - ISO Alpha-2: SX
 * - ISO Alpha-3: SXM
 * - ISO Numeric: 534
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SintMaarten: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Maarten:SX:SXM:534:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, -1f)
            verticalLineTo(13f)
            lineTo(10f, 6f)
            lineTo(0f, -1f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, -1f)
                verticalLineTo(13f)
                lineTo(10f, 6f)
                lineTo(0f, -1f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.063f, 4.594f)
                curveTo(4.781f, 4.594f, 5.364f, 4.237f, 5.364f, 3.797f)
                curveTo(5.364f, 3.357f, 4.781f, 3f, 4.063f, 3f)
                curveTo(3.345f, 3f, 2.762f, 3.357f, 2.762f, 3.797f)
                curveTo(2.762f, 4.237f, 3.345f, 4.594f, 4.063f, 4.594f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDA610A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.177f, 3.193f)
                curveTo(4.071f, 3.193f, 3.995f, 3.261f, 3.995f, 3.364f)
                lineTo(3.995f, 3.375f)
                curveTo(3.989f, 3.393f, 3.986f, 3.412f, 3.986f, 3.433f)
                curveTo(3.984f, 3.488f, 4.005f, 3.534f, 4.047f, 3.575f)
                curveTo(4.05f, 3.588f, 4.051f, 3.598f, 4.051f, 3.603f)
                curveTo(4.048f, 3.594f, 4.038f, 3.587f, 4.018f, 3.573f)
                curveTo(3.99f, 3.552f, 3.944f, 3.518f, 3.873f, 3.447f)
                curveTo(3.772f, 3.344f, 3.695f, 3.304f, 3.6f, 3.32f)
                curveTo(3.571f, 3.325f, 3.543f, 3.335f, 3.509f, 3.349f)
                curveTo(3.455f, 3.368f, 3.406f, 3.373f, 3.314f, 3.355f)
                curveTo(3.059f, 3.306f, 2.779f, 3.354f, 2.476f, 3.495f)
                lineTo(2.581f, 3.721f)
                curveTo(2.84f, 3.602f, 3.068f, 3.563f, 3.267f, 3.601f)
                curveTo(3.404f, 3.627f, 3.499f, 3.618f, 3.594f, 3.584f)
                curveTo(3.635f, 3.569f, 3.639f, 3.567f, 3.642f, 3.567f)
                curveTo(3.639f, 3.567f, 3.641f, 3.569f, 3.653f, 3.581f)
                curveTo(3.662f, 3.589f, 3.675f, 3.602f, 3.695f, 3.623f)
                curveTo(3.724f, 3.652f, 3.754f, 3.678f, 3.784f, 3.702f)
                curveTo(3.726f, 3.717f, 3.729f, 3.728f, 3.739f, 3.767f)
                curveTo(3.744f, 3.782f, 3.749f, 3.802f, 3.753f, 3.829f)
                curveTo(3.76f, 3.889f, 3.748f, 3.92f, 3.758f, 3.935f)
                curveTo(3.77f, 3.951f, 3.81f, 3.947f, 3.936f, 3.942f)
                curveTo(3.97f, 3.94f, 4.016f, 3.937f, 4.069f, 3.932f)
                curveTo(4.173f, 3.922f, 4.29f, 3.908f, 4.362f, 3.896f)
                curveTo(4.432f, 3.884f, 4.451f, 3.88f, 4.481f, 3.859f)
                lineTo(4.481f, 3.859f)
                curveTo(4.491f, 3.846f, 4.499f, 3.836f, 4.507f, 3.826f)
                curveTo(4.747f, 3.791f, 4.96f, 3.766f, 5.15f, 3.748f)
                curveTo(5.218f, 3.742f, 5.272f, 3.738f, 5.325f, 3.734f)
                curveTo(5.332f, 3.734f, 5.332f, 3.734f, 5.362f, 3.728f)
                lineTo(5.362f, 3.728f)
                curveTo(5.376f, 3.722f, 5.382f, 3.72f, 5.383f, 3.719f)
                lineTo(5.383f, 3.719f)
                curveTo(5.384f, 3.718f, 5.385f, 3.718f, 5.383f, 3.719f)
                lineTo(5.445f, 3.574f)
                lineTo(5.381f, 3.497f)
                curveTo(5.344f, 3.485f, 5.339f, 3.484f, 5.335f, 3.484f)
                curveTo(5.335f, 3.484f, 5.334f, 3.484f, 5.334f, 3.484f)
                curveTo(5.329f, 3.483f, 5.327f, 3.483f, 5.325f, 3.483f)
                curveTo(5.324f, 3.483f, 5.323f, 3.483f, 5.321f, 3.483f)
                lineTo(5.264f, 3.483f)
                curveTo(5.223f, 3.483f, 5.19f, 3.48f, 5.142f, 3.471f)
                lineTo(5.098f, 3.463f)
                curveTo(4.903f, 3.427f, 4.723f, 3.427f, 4.339f, 3.484f)
                lineTo(4.318f, 3.468f)
                curveTo(4.38f, 3.457f, 4.455f, 3.45f, 4.534f, 3.446f)
                lineTo(4.534f, 3.446f)
                curveTo(4.582f, 3.444f, 4.582f, 3.444f, 4.609f, 3.443f)
                lineTo(4.621f, 3.443f)
                lineTo(4.619f, 3.193f)
                lineTo(4.6f, 3.193f)
                horizontalLineTo(4.177f)
                close()
                moveTo(3.97f, 3.916f)
                lineTo(3.994f, 3.911f)
                lineTo(4.017f, 3.906f)
                lineTo(3.97f, 3.916f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF56C6F5)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(3.963f, 4.29f)
                lineTo(4.003f, 4.297f)
                lineTo(4.043f, 4.29f)
                curveTo(4.54f, 4.209f, 4.867f, 4.218f, 5.056f, 4.282f)
                curveTo(5.274f, 4.355f, 5.516f, 4.334f, 5.769f, 4.249f)
                curveTo(5.689f, 4.608f, 5.648f, 4.947f, 5.648f, 5.266f)
                curveTo(5.648f, 5.629f, 5.718f, 5.923f, 5.782f, 6.18f)
                curveTo(5.783f, 6.187f, 5.785f, 6.194f, 5.787f, 6.201f)
                curveTo(5.849f, 6.453f, 5.901f, 6.662f, 5.901f, 6.902f)
                curveTo(5.901f, 7.117f, 5.83f, 7.231f, 5.73f, 7.301f)
                curveTo(5.614f, 7.383f, 5.422f, 7.435f, 5.136f, 7.435f)
                curveTo(4.733f, 7.435f, 4.356f, 7.544f, 4.009f, 7.756f)
                lineTo(4.003f, 7.752f)
                lineTo(3.997f, 7.756f)
                curveTo(3.65f, 7.544f, 3.273f, 7.435f, 2.87f, 7.435f)
                curveTo(2.584f, 7.435f, 2.392f, 7.383f, 2.276f, 7.301f)
                curveTo(2.176f, 7.231f, 2.105f, 7.117f, 2.105f, 6.902f)
                curveTo(2.105f, 6.662f, 2.157f, 6.453f, 2.219f, 6.201f)
                curveTo(2.221f, 6.194f, 2.222f, 6.187f, 2.224f, 6.18f)
                curveTo(2.288f, 5.923f, 2.358f, 5.629f, 2.358f, 5.266f)
                curveTo(2.358f, 4.947f, 2.317f, 4.608f, 2.237f, 4.249f)
                curveTo(2.49f, 4.334f, 2.731f, 4.355f, 2.95f, 4.282f)
                curveTo(3.139f, 4.218f, 3.466f, 4.209f, 3.963f, 4.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.392f, 5.112f)
                lineTo(4.007f, 4.769f)
                lineTo(3.621f, 5.112f)
                horizontalLineTo(3.735f)
                verticalLineTo(5.31f)
                lineTo(3.135f, 5.684f)
                verticalLineTo(6.598f)
                horizontalLineTo(3.021f)
                verticalLineTo(6.769f)
                horizontalLineTo(3.135f)
                horizontalLineTo(4.878f)
                horizontalLineTo(5.021f)
                verticalLineTo(6.598f)
                horizontalLineTo(4.878f)
                verticalLineTo(5.684f)
                lineTo(4.25f, 5.292f)
                verticalLineTo(5.112f)
                horizontalLineTo(4.392f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFBCD17))) {
                moveTo(3.976f, 8.51f)
                curveTo(4.506f, 8.51f, 4.872f, 8.452f, 5.06f, 8.354f)
                curveTo(5.109f, 8.27f, 5.196f, 8.222f, 5.288f, 8.226f)
                curveTo(5.701f, 8.241f, 6.021f, 8.067f, 6.272f, 7.684f)
                curveTo(6.544f, 7.271f, 6.599f, 6.684f, 6.422f, 5.913f)
                lineTo(6.872f, 5.81f)
                curveTo(7.075f, 6.693f, 7.008f, 7.405f, 6.658f, 7.938f)
                curveTo(6.344f, 8.415f, 5.916f, 8.67f, 5.394f, 8.687f)
                curveTo(5.128f, 8.885f, 4.66f, 8.972f, 3.976f, 8.972f)
                curveTo(3.314f, 8.972f, 2.823f, 8.843f, 2.508f, 8.57f)
                curveTo(1.793f, 8.401f, 1.339f, 8.116f, 1.16f, 7.693f)
                curveTo(0.97f, 7.243f, 0.97f, 6.617f, 1.148f, 5.812f)
                lineTo(1.598f, 5.911f)
                curveTo(1.439f, 6.632f, 1.439f, 7.168f, 1.585f, 7.514f)
                curveTo(1.687f, 7.755f, 1.984f, 7.952f, 2.486f, 8.088f)
                lineTo(2.952f, 8.188f)
                lineTo(2.93f, 8.306f)
                curveTo(3.157f, 8.439f, 3.505f, 8.51f, 3.976f, 8.51f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.357f, 4.412f)
                lineTo(2.613f, 4.515f)
                lineTo(2.485f, 4.781f)
                lineTo(2.842f, 4.596f)
                lineTo(2.815f, 4.733f)
                lineTo(2.738f, 5.109f)
                lineTo(2.885f, 4.681f)
                verticalLineTo(5.059f)
                lineTo(2.974f, 4.681f)
                lineTo(3.24f, 4.761f)
                lineTo(2.974f, 4.596f)
                lineTo(3.24f, 4.515f)
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.844f, 4.969f)
                curveTo(2.982f, 4.969f, 3.094f, 4.857f, 3.094f, 4.719f)
                curveTo(3.094f, 4.58f, 2.982f, 4.469f, 2.844f, 4.469f)
                curveTo(2.706f, 4.469f, 2.594f, 4.58f, 2.594f, 4.719f)
                curveTo(2.594f, 4.857f, 2.706f, 4.969f, 2.844f, 4.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.321f, 4.937f)
                curveTo(5.316f, 4.769f, 5.298f, 4.385f, 5.212f, 4.385f)
                curveTo(5.127f, 4.385f, 5.114f, 4.773f, 5.112f, 4.94f)
                curveTo(4.964f, 4.988f, 4.853f, 5.115f, 4.853f, 5.115f)
                horizontalLineTo(5.589f)
                curveTo(5.589f, 5.115f, 5.473f, 4.983f, 5.321f, 4.937f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SintMaartenPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SintMaarten,
            contentDescription = "Sint Maarten Flag"
        )
    }
}
