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
 * Macao Flag (16x12dp)
 *
 * - ISO Alpha-2: MO
 * - ISO Alpha-3: MAC
 * - ISO Numeric: 446
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Macao: ImageVector by lazy {
    ImageVector.Builder(
        name = "Macao:MO:MAC:446:Small",
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
                fill = SolidColor(Color(0xFF1C9975)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.011f, 3.427f)
                lineTo(7.194f, 3.92f)
                lineTo(7.38f, 2.958f)
                lineTo(6.7f, 2.237f)
                lineTo(7.621f, 2.199f)
                lineTo(8.011f, 1.3f)
                lineTo(8.401f, 2.199f)
                horizontalLineTo(9.32f)
                lineTo(8.641f, 2.958f)
                lineTo(8.846f, 3.92f)
                lineTo(8.011f, 3.427f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.691f, 3.792f)
                lineTo(5.186f, 4.097f)
                lineTo(5.301f, 3.502f)
                lineTo(4.881f, 3.057f)
                lineTo(5.45f, 3.033f)
                lineTo(5.691f, 2.477f)
                lineTo(5.932f, 3.033f)
                horizontalLineTo(6.501f)
                lineTo(6.081f, 3.502f)
                lineTo(6.208f, 4.097f)
                lineTo(5.691f, 3.792f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.291f, 3.792f)
                lineTo(9.786f, 4.097f)
                lineTo(9.901f, 3.502f)
                lineTo(9.48f, 3.057f)
                lineTo(10.05f, 3.033f)
                lineTo(10.291f, 2.477f)
                lineTo(10.531f, 3.033f)
                horizontalLineTo(11.1f)
                lineTo(10.681f, 3.502f)
                lineTo(10.807f, 4.097f)
                lineTo(10.291f, 3.792f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.383f, 4.805f)
                lineTo(3.978f, 5.05f)
                lineTo(4.07f, 4.573f)
                lineTo(3.733f, 4.215f)
                lineTo(4.19f, 4.196f)
                lineTo(4.383f, 3.75f)
                lineTo(4.577f, 4.196f)
                horizontalLineTo(5.033f)
                lineTo(4.696f, 4.573f)
                lineTo(4.798f, 5.05f)
                lineTo(4.383f, 4.805f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.78f, 4.805f)
                lineTo(11.375f, 5.05f)
                lineTo(11.467f, 4.573f)
                lineTo(11.13f, 4.215f)
                lineTo(11.587f, 4.196f)
                lineTo(11.78f, 3.75f)
                lineTo(11.974f, 4.196f)
                horizontalLineTo(12.43f)
                lineTo(12.093f, 4.573f)
                lineTo(12.195f, 5.05f)
                lineTo(11.78f, 4.805f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(8f, 11f)
                curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
                curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
                curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
                curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(6.31f, 11.639f)
                horizontalLineTo(4.358f)
                verticalLineTo(9.01f)
                lineTo(6.307f, 9.01f)
                curveTo(6.997f, 9.001f, 7.501f, 8.803f, 7.838f, 8.424f)
                lineTo(8.006f, 8.235f)
                lineTo(8.193f, 8.405f)
                curveTo(8.642f, 8.812f, 9.092f, 9.01f, 9.546f, 9.01f)
                horizontalLineTo(11.698f)
                verticalLineTo(11.639f)
                horizontalLineTo(9.546f)
                curveTo(9.024f, 11.639f, 8.52f, 11.443f, 8.038f, 11.059f)
                curveTo(7.612f, 11.437f, 7.032f, 11.629f, 6.31f, 11.639f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.017f, 3.804f)
            curveTo(8.017f, 3.804f, 7.163f, 4.648f, 7.163f, 5.806f)
            curveTo(7.163f, 6.054f, 7.202f, 6.288f, 7.264f, 6.503f)
            curveTo(6.988f, 5.893f, 6.969f, 5.232f, 7.207f, 4.51f)
            lineTo(6.884f, 4.404f)
            curveTo(6.642f, 5.138f, 6.641f, 5.828f, 6.881f, 6.467f)
            curveTo(6.384f, 6.168f, 5.813f, 5.967f, 5.227f, 5.903f)
            lineTo(5.19f, 6.241f)
            curveTo(5.702f, 6.298f, 6.202f, 6.468f, 6.641f, 6.721f)
            curveTo(6.533f, 6.678f, 6.419f, 6.64f, 6.3f, 6.609f)
            curveTo(5.219f, 6.333f, 4.158f, 6.725f, 4.158f, 6.725f)
            curveTo(4.158f, 6.725f, 4.77f, 8.098f, 5.955f, 8.3f)
            curveTo(6.015f, 8.31f, 6.073f, 8.318f, 6.131f, 8.324f)
            lineTo(6.122f, 8.324f)
            curveTo(5.556f, 8.324f, 5.031f, 8.093f, 4.539f, 7.624f)
            lineTo(4.304f, 7.87f)
            curveTo(4.857f, 8.397f, 5.465f, 8.665f, 6.122f, 8.665f)
            curveTo(6.764f, 8.665f, 7.361f, 8.409f, 7.906f, 7.904f)
            curveTo(7.994f, 7.851f, 8.045f, 7.814f, 8.053f, 7.808f)
            lineTo(8.075f, 7.826f)
            curveTo(8.064f, 7.845f, 8.058f, 7.856f, 8.058f, 7.856f)
            curveTo(8.058f, 7.856f, 8.112f, 7.888f, 8.209f, 7.934f)
            curveTo(8.747f, 8.351f, 9.421f, 8.665f, 9.954f, 8.665f)
            curveTo(10.611f, 8.665f, 11.219f, 8.397f, 11.772f, 7.87f)
            lineTo(11.537f, 7.624f)
            curveTo(11.045f, 8.093f, 10.519f, 8.324f, 9.954f, 8.324f)
            curveTo(9.747f, 8.324f, 9.545f, 8.291f, 9.346f, 8.224f)
            curveTo(9.624f, 8.239f, 9.931f, 8.214f, 10.248f, 8.117f)
            curveTo(11.415f, 7.76f, 11.902f, 6.68f, 11.902f, 6.68f)
            curveTo(11.902f, 6.68f, 11.281f, 6.345f, 10.491f, 6.341f)
            curveTo(10.668f, 6.296f, 10.853f, 6.262f, 11.045f, 6.241f)
            lineTo(11.008f, 5.903f)
            curveTo(10.268f, 5.984f, 9.627f, 6.234f, 9.09f, 6.651f)
            curveTo(9.404f, 5.961f, 9.429f, 5.208f, 9.164f, 4.404f)
            lineTo(8.84f, 4.51f)
            curveTo(9.057f, 5.168f, 9.06f, 5.776f, 8.851f, 6.34f)
            curveTo(8.887f, 6.173f, 8.908f, 5.995f, 8.908f, 5.806f)
            curveTo(8.908f, 4.585f, 8.017f, 3.804f, 8.017f, 3.804f)
            close()
            moveTo(8.393f, 7.378f)
            lineTo(8.381f, 7.396f)
            lineTo(8.396f, 7.378f)
            lineTo(8.393f, 7.378f)
            close()
            moveTo(7.567f, 7.298f)
            lineTo(7.601f, 7.267f)
            curveTo(7.631f, 7.318f, 7.662f, 7.365f, 7.691f, 7.41f)
            curveTo(7.653f, 7.374f, 7.612f, 7.336f, 7.567f, 7.298f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MacaoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Macao,
            contentDescription = "Macao Flag"
        )
    }
}
