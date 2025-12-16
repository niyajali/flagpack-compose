package flagpack.icons.small

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
 * Liechtenstein Flag (16x12dp)
 *
 * - ISO Alpha-2: LI
 * - ISO Alpha-3: LIE
 * - ISO Numeric: 438
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Liechtenstein: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liechtenstein:LI:LIE:438:Small",
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
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.399f, 5.527f)
                curveTo(2.399f, 5.527f, 3.003f, 5.902f, 4.401f, 5.902f)
                curveTo(5.799f, 5.902f, 6.541f, 5.527f, 6.541f, 5.527f)
                curveTo(6.541f, 5.527f, 5.444f, 4.889f, 4.464f, 4.889f)
                curveTo(3.484f, 4.889f, 2.399f, 5.527f, 2.399f, 5.527f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.25f
            ) {
                moveTo(2.435f, 3.371f)
                lineTo(2.327f, 3.434f)
                lineTo(2.363f, 3.496f)
                horizontalLineTo(2.435f)
                horizontalLineTo(6.598f)
                horizontalLineTo(6.689f)
                lineTo(6.717f, 3.409f)
                lineTo(6.598f, 3.371f)
                lineTo(6.717f, 3.409f)
                lineTo(6.717f, 3.409f)
                lineTo(6.717f, 3.408f)
                lineTo(6.718f, 3.407f)
                lineTo(6.718f, 3.405f)
                lineTo(6.721f, 3.395f)
                curveTo(6.724f, 3.386f, 6.727f, 3.374f, 6.731f, 3.359f)
                curveTo(6.74f, 3.328f, 6.751f, 3.284f, 6.762f, 3.23f)
                curveTo(6.785f, 3.123f, 6.809f, 2.974f, 6.816f, 2.808f)
                curveTo(6.83f, 2.484f, 6.776f, 2.061f, 6.462f, 1.788f)
                curveTo(6.166f, 1.53f, 5.753f, 1.402f, 5.363f, 1.337f)
                curveTo(4.97f, 1.271f, 4.583f, 1.265f, 4.327f, 1.265f)
                curveTo(3.798f, 1.265f, 3.312f, 1.328f, 2.525f, 1.773f)
                curveTo(2.306f, 1.898f, 2.18f, 2.071f, 2.121f, 2.26f)
                curveTo(2.063f, 2.446f, 2.07f, 2.641f, 2.101f, 2.812f)
                curveTo(2.132f, 2.983f, 2.189f, 3.138f, 2.237f, 3.249f)
                curveTo(2.261f, 3.305f, 2.283f, 3.35f, 2.299f, 3.382f)
                curveTo(2.307f, 3.398f, 2.314f, 3.411f, 2.319f, 3.419f)
                lineTo(2.325f, 3.43f)
                lineTo(2.326f, 3.433f)
                lineTo(2.327f, 3.433f)
                lineTo(2.327f, 3.434f)
                lineTo(2.327f, 3.434f)
                curveTo(2.327f, 3.434f, 2.327f, 3.434f, 2.435f, 3.371f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.25f
            ) {
                moveTo(1.943f, 3.453f)
                lineTo(2.001f, 3.564f)
                curveTo(1.943f, 3.453f, 1.943f, 3.453f, 1.943f, 3.453f)
                lineTo(1.943f, 3.453f)
                lineTo(1.944f, 3.453f)
                lineTo(1.944f, 3.452f)
                lineTo(1.947f, 3.451f)
                lineTo(1.956f, 3.447f)
                curveTo(1.963f, 3.443f, 1.974f, 3.438f, 1.987f, 3.432f)
                curveTo(2.015f, 3.419f, 2.056f, 3.401f, 2.109f, 3.38f)
                curveTo(2.216f, 3.338f, 2.375f, 3.283f, 2.586f, 3.228f)
                curveTo(3.009f, 3.118f, 3.641f, 3.009f, 4.488f, 3.009f)
                curveTo(5.334f, 3.009f, 5.966f, 3.118f, 6.389f, 3.228f)
                curveTo(6.6f, 3.283f, 6.759f, 3.338f, 6.866f, 3.38f)
                curveTo(6.92f, 3.401f, 6.96f, 3.419f, 6.988f, 3.432f)
                curveTo(7.002f, 3.438f, 7.012f, 3.443f, 7.02f, 3.447f)
                lineTo(7.028f, 3.451f)
                lineTo(7.031f, 3.452f)
                lineTo(7.032f, 3.453f)
                lineTo(7.032f, 3.453f)
                lineTo(7.032f, 3.453f)
                curveTo(7.032f, 3.453f, 7.032f, 3.453f, 6.974f, 3.564f)
                lineTo(7.032f, 3.453f)
                lineTo(7.129f, 3.504f)
                lineTo(7.091f, 3.607f)
                lineTo(6.498f, 5.192f)
                lineTo(6.457f, 5.302f)
                lineTo(1.943f, 3.453f)
                close()
                moveTo(1.943f, 3.453f)
                lineTo(1.847f, 3.504f)
                lineTo(1.884f, 3.606f)
                lineTo(2.46f, 5.191f)
                lineTo(2.501f, 5.301f)
                lineTo(2.613f, 5.268f)
                lineTo(1.943f, 3.453f)
                close()
                moveTo(6.345f, 5.267f)
                lineTo(6.345f, 5.267f)
                lineTo(2.613f, 5.268f)
                lineTo(2.613f, 5.268f)
                lineTo(2.614f, 5.267f)
                lineTo(2.616f, 5.267f)
                lineTo(2.623f, 5.265f)
                lineTo(2.654f, 5.256f)
                curveTo(2.681f, 5.248f, 2.722f, 5.238f, 2.773f, 5.225f)
                curveTo(2.876f, 5.198f, 3.023f, 5.163f, 3.2f, 5.128f)
                curveTo(3.555f, 5.058f, 4.026f, 4.989f, 4.497f, 4.989f)
                curveTo(4.968f, 4.989f, 5.43f, 5.058f, 5.776f, 5.128f)
                curveTo(5.949f, 5.163f, 6.091f, 5.198f, 6.191f, 5.224f)
                curveTo(6.24f, 5.237f, 6.279f, 5.248f, 6.305f, 5.256f)
                lineTo(6.335f, 5.264f)
                lineTo(6.342f, 5.267f)
                lineTo(6.344f, 5.267f)
                lineTo(6.344f, 5.267f)
                lineTo(6.345f, 5.267f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.563f, 0f)
                horizontalLineTo(4.311f)
                lineTo(4.343f, 0.461f)
                lineTo(4.059f, 0.423f)
                verticalLineTo(0.74f)
                lineTo(4.348f, 0.7f)
                lineTo(4.311f, 1.426f)
                horizontalLineTo(4.563f)
                lineTo(4.526f, 0.699f)
                lineTo(4.815f, 0.74f)
                verticalLineTo(0.423f)
                lineTo(4.531f, 0.463f)
                lineTo(4.563f, 0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3.059f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(4.563f, 0f)
                horizontalLineTo(4.311f)
                lineTo(4.343f, 0.461f)
                lineTo(4.059f, 0.423f)
                verticalLineTo(0.74f)
                lineTo(4.348f, 0.7f)
                lineTo(4.311f, 1.426f)
                horizontalLineTo(4.563f)
                lineTo(4.526f, 0.699f)
                lineTo(4.815f, 0.74f)
                verticalLineTo(0.423f)
                lineTo(4.531f, 0.463f)
                lineTo(4.563f, 0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.311f, 0f)
                verticalLineTo(-0.25f)
                horizontalLineTo(4.043f)
                lineTo(4.061f, 0.018f)
                lineTo(4.311f, 0f)
                close()
                moveTo(4.563f, 0f)
                lineTo(4.812f, 0.017f)
                lineTo(4.831f, -0.25f)
                horizontalLineTo(4.563f)
                verticalLineTo(0f)
                close()
                moveTo(4.343f, 0.461f)
                lineTo(4.31f, 0.709f)
                lineTo(4.614f, 0.751f)
                lineTo(4.593f, 0.444f)
                lineTo(4.343f, 0.461f)
                close()
                moveTo(4.059f, 0.423f)
                lineTo(4.092f, 0.175f)
                lineTo(3.809f, 0.136f)
                verticalLineTo(0.423f)
                horizontalLineTo(4.059f)
                close()
                moveTo(4.059f, 0.74f)
                horizontalLineTo(3.809f)
                verticalLineTo(1.026f)
                lineTo(4.093f, 0.987f)
                lineTo(4.059f, 0.74f)
                close()
                moveTo(4.348f, 0.7f)
                lineTo(4.597f, 0.712f)
                lineTo(4.613f, 0.411f)
                lineTo(4.314f, 0.452f)
                lineTo(4.348f, 0.7f)
                close()
                moveTo(4.311f, 1.426f)
                lineTo(4.061f, 1.414f)
                lineTo(4.048f, 1.676f)
                horizontalLineTo(4.311f)
                verticalLineTo(1.426f)
                close()
                moveTo(4.563f, 1.426f)
                verticalLineTo(1.676f)
                horizontalLineTo(4.826f)
                lineTo(4.813f, 1.414f)
                lineTo(4.563f, 1.426f)
                close()
                moveTo(4.526f, 0.699f)
                lineTo(4.561f, 0.451f)
                lineTo(4.26f, 0.409f)
                lineTo(4.276f, 0.711f)
                lineTo(4.526f, 0.699f)
                close()
                moveTo(4.815f, 0.74f)
                lineTo(4.78f, 0.987f)
                lineTo(5.065f, 1.028f)
                verticalLineTo(0.74f)
                horizontalLineTo(4.815f)
                close()
                moveTo(4.815f, 0.423f)
                horizontalLineTo(5.065f)
                verticalLineTo(0.134f)
                lineTo(4.78f, 0.175f)
                lineTo(4.815f, 0.423f)
                close()
                moveTo(4.531f, 0.463f)
                lineTo(4.281f, 0.446f)
                lineTo(4.26f, 0.755f)
                lineTo(4.566f, 0.711f)
                lineTo(4.531f, 0.463f)
                close()
                moveTo(4.311f, 0.25f)
                horizontalLineTo(4.563f)
                verticalLineTo(-0.25f)
                horizontalLineTo(4.311f)
                verticalLineTo(0.25f)
                close()
                moveTo(4.593f, 0.444f)
                lineTo(4.56f, -0.018f)
                lineTo(4.061f, 0.018f)
                lineTo(4.094f, 0.479f)
                lineTo(4.593f, 0.444f)
                close()
                moveTo(4.025f, 0.67f)
                lineTo(4.31f, 0.709f)
                lineTo(4.377f, 0.214f)
                lineTo(4.092f, 0.175f)
                lineTo(4.025f, 0.67f)
                close()
                moveTo(4.309f, 0.74f)
                verticalLineTo(0.423f)
                horizontalLineTo(3.809f)
                verticalLineTo(0.74f)
                horizontalLineTo(4.309f)
                close()
                moveTo(4.314f, 0.452f)
                lineTo(4.025f, 0.492f)
                lineTo(4.093f, 0.987f)
                lineTo(4.382f, 0.947f)
                lineTo(4.314f, 0.452f)
                close()
                moveTo(4.561f, 1.439f)
                lineTo(4.597f, 0.712f)
                lineTo(4.098f, 0.687f)
                lineTo(4.061f, 1.414f)
                lineTo(4.561f, 1.439f)
                close()
                moveTo(4.563f, 1.176f)
                horizontalLineTo(4.311f)
                verticalLineTo(1.676f)
                horizontalLineTo(4.563f)
                verticalLineTo(1.176f)
                close()
                moveTo(4.276f, 0.711f)
                lineTo(4.313f, 1.439f)
                lineTo(4.813f, 1.414f)
                lineTo(4.775f, 0.686f)
                lineTo(4.276f, 0.711f)
                close()
                moveTo(4.85f, 0.492f)
                lineTo(4.561f, 0.451f)
                lineTo(4.491f, 0.946f)
                lineTo(4.78f, 0.987f)
                lineTo(4.85f, 0.492f)
                close()
                moveTo(4.565f, 0.423f)
                verticalLineTo(0.74f)
                horizontalLineTo(5.065f)
                verticalLineTo(0.423f)
                horizontalLineTo(4.565f)
                close()
                moveTo(4.566f, 0.711f)
                lineTo(4.851f, 0.67f)
                lineTo(4.78f, 0.175f)
                lineTo(4.495f, 0.216f)
                lineTo(4.566f, 0.711f)
                close()
                moveTo(4.314f, -0.017f)
                lineTo(4.281f, 0.446f)
                lineTo(4.78f, 0.481f)
                lineTo(4.812f, 0.017f)
                lineTo(4.314f, -0.017f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LiechtensteinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Liechtenstein,
            contentDescription = "Liechtenstein Flag"
        )
    }
}
