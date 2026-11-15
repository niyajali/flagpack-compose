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
 * Uganda Flag (16x12dp)
 *
 * - ISO Alpha-2: UG
 * - ISO Alpha-3: UGA
 * - ISO Numeric: 800
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Uganda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uganda:UG:UGA:800:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 10f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(9.657f, 9f, 11f, 7.657f, 11f, 6f)
                curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
                curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
                curveTo(5f, 7.657f, 6.343f, 9f, 8f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.84f, 4.164f)
                lineTo(6.311f, 4.338f)
                lineTo(6.84f, 4.383f)
                curveTo(6.84f, 4.383f, 6.925f, 4.592f, 6.84f, 4.756f)
                curveTo(6.818f, 4.797f, 6.762f, 4.85f, 6.691f, 4.918f)
                curveTo(6.481f, 5.117f, 6.137f, 5.443f, 6.137f, 5.973f)
                curveTo(6.137f, 6.683f, 7.507f, 7.005f, 7.507f, 7.005f)
                verticalLineTo(7.342f)
                curveTo(7.507f, 7.342f, 7.666f, 7.441f, 6.759f, 7.441f)
                curveTo(5.972f, 7.441f, 6.021f, 7.74f, 6.048f, 7.903f)
                curveTo(6.052f, 7.929f, 6.056f, 7.95f, 6.056f, 7.968f)
                curveTo(6.056f, 8.097f, 6.434f, 7.838f, 6.611f, 7.581f)
                curveTo(6.704f, 7.446f, 7.094f, 7.453f, 7.495f, 7.49f)
                curveTo(7.526f, 7.493f, 7.819f, 8.112f, 7.565f, 8.431f)
                curveTo(7.458f, 8.566f, 7.091f, 8.583f, 6.861f, 8.594f)
                curveTo(6.744f, 8.6f, 6.662f, 8.604f, 6.67f, 8.62f)
                curveTo(6.676f, 8.633f, 6.745f, 8.629f, 6.846f, 8.623f)
                curveTo(6.971f, 8.615f, 7.146f, 8.605f, 7.307f, 8.62f)
                curveTo(7.331f, 8.623f, 7.237f, 8.705f, 7.141f, 8.788f)
                curveTo(7.042f, 8.874f, 6.942f, 8.96f, 6.971f, 8.962f)
                curveTo(7.002f, 8.963f, 7.187f, 8.861f, 7.355f, 8.768f)
                curveTo(7.494f, 8.691f, 7.621f, 8.62f, 7.64f, 8.62f)
                curveTo(7.767f, 8.62f, 7.881f, 8.636f, 7.982f, 8.65f)
                curveTo(8.15f, 8.673f, 8.278f, 8.69f, 8.359f, 8.62f)
                curveTo(8.384f, 8.599f, 8.239f, 8.564f, 8.092f, 8.529f)
                curveTo(7.941f, 8.493f, 7.786f, 8.456f, 7.81f, 8.431f)
                curveTo(7.95f, 8.293f, 7.891f, 8.003f, 7.846f, 7.775f)
                curveTo(7.825f, 7.672f, 7.807f, 7.582f, 7.81f, 7.524f)
                curveTo(7.822f, 7.317f, 8.042f, 7.425f, 8.214f, 7.511f)
                curveTo(8.289f, 7.548f, 8.356f, 7.581f, 8.392f, 7.581f)
                curveTo(8.719f, 7.581f, 8.313f, 7.168f, 8.091f, 6.942f)
                curveTo(8.071f, 6.922f, 8.053f, 6.903f, 8.037f, 6.887f)
                curveTo(7.924f, 6.77f, 8.003f, 6.786f, 8.183f, 6.821f)
                curveTo(8.32f, 6.848f, 8.515f, 6.887f, 8.727f, 6.887f)
                curveTo(9.217f, 6.887f, 9.575f, 6.727f, 9.451f, 6.296f)
                curveTo(9.369f, 6.011f, 8.92f, 5.915f, 8.451f, 5.813f)
                curveTo(8.208f, 5.761f, 7.961f, 5.708f, 7.756f, 5.627f)
                curveTo(7.251f, 5.428f, 7.277f, 5.138f, 7.299f, 4.893f)
                curveTo(7.303f, 4.845f, 7.307f, 4.799f, 7.307f, 4.756f)
                curveTo(7.307f, 4.49f, 7.756f, 4.164f, 7.756f, 4.164f)
                curveTo(7.756f, 4.164f, 7.551f, 3.821f, 7.211f, 3.821f)
                curveTo(6.872f, 3.821f, 6.84f, 4.164f, 6.84f, 4.164f)
                close()
                moveTo(7.764f, 7.288f)
                verticalLineTo(7.037f)
                curveTo(7.764f, 7.037f, 7.974f, 7.03f, 8.047f, 7.207f)
                curveTo(8.121f, 7.383f, 7.764f, 7.288f, 7.764f, 7.288f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.538f, 3.356f)
                lineTo(7.045f, 3.957f)
                lineTo(7.308f, 3.895f)
                lineTo(7.182f, 3.288f)
                lineTo(6.538f, 3.356f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.196f, 3.21f)
                lineTo(7.229f, 4.114f)
                lineTo(7.662f, 4.007f)
                lineTo(7.846f, 3.416f)
                lineTo(7.196f, 3.21f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.788f, 4.719f)
                curveTo(6.884f, 4.719f, 6.962f, 4.644f, 6.962f, 4.551f)
                curveTo(6.962f, 4.458f, 6.884f, 4.382f, 6.788f, 4.382f)
                curveTo(6.693f, 4.382f, 6.615f, 4.458f, 6.615f, 4.551f)
                curveTo(6.615f, 4.644f, 6.693f, 4.719f, 6.788f, 4.719f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.888f, 3.38f)
                lineTo(7.384f, 3.983f)
                lineTo(7.491f, 4.231f)
                lineTo(8.066f, 4.001f)
                lineTo(7.888f, 3.38f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.059f, 7.947f)
                curveTo(9.059f, 7.947f, 9.946f, 7.551f, 9.946f, 6.997f)
                curveTo(9.946f, 6.443f, 8.507f, 5.84f, 8.507f, 5.84f)
                curveTo(8.507f, 5.84f, 7.66f, 6.034f, 8.042f, 6.293f)
                curveTo(8.423f, 6.553f, 8.934f, 6.652f, 8.934f, 6.997f)
                curveTo(8.934f, 7.342f, 9.074f, 7.671f, 8.79f, 7.671f)
                curveTo(8.507f, 7.671f, 9.059f, 7.947f, 9.059f, 7.947f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFDFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.781f, 5.739f)
                curveTo(7.781f, 5.739f, 7.467f, 5.794f, 7.482f, 5.845f)
                curveTo(7.523f, 5.986f, 7.952f, 6.169f, 8.139f, 6.296f)
                curveTo(8.52f, 6.555f, 8.882f, 6.526f, 9.151f, 6.357f)
                curveTo(9.42f, 6.189f, 7.781f, 5.739f, 7.781f, 5.739f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UgandaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Uganda,
            contentDescription = "Uganda Flag"
        )
    }
}
