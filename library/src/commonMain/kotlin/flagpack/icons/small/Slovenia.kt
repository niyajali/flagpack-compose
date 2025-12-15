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
 * Slovenia Flag (16x12dp)
 *
 * - ISO Alpha-2: SI
 * - ISO Alpha-3: SVN
 * - ISO Numeric: 705
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Slovenia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovenia:SI:SVN:705:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.87f, 2.518f)
                curveTo(6.87f, 2.518f, 5.818f, 2.021f, 4.509f, 2.021f)
                curveTo(3.2f, 2.021f, 2.148f, 2.518f, 2.148f, 2.518f)
                curveTo(2.148f, 2.518f, 2.265f, 4.515f, 2.45f, 5.574f)
                curveTo(2.529f, 6.025f, 2.909f, 6.684f, 3.253f, 6.996f)
                curveTo(3.645f, 7.352f, 4.509f, 7.773f, 4.509f, 7.773f)
                curveTo(4.759f, 7.6f, 5.227f, 7.523f, 5.824f, 6.996f)
                curveTo(6.422f, 6.469f, 6.571f, 5.574f, 6.571f, 5.574f)
                lineTo(6.87f, 2.518f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(6.731f, 2.453f)
                lineTo(7.169f, 2.672f)
                lineTo(6.868f, 5.683f)
                curveTo(6.763f, 6.32f, 6.499f, 6.823f, 6.078f, 7.195f)
                curveTo(5.849f, 7.396f, 5.626f, 7.547f, 5.386f, 7.672f)
                curveTo(5.251f, 7.743f, 4.686f, 8.034f, 4.691f, 8.031f)
                curveTo(4.634f, 8.059f, 4.591f, 8.082f, 4.557f, 8.106f)
                lineTo(4.502f, 8.144f)
                lineTo(4.443f, 8.115f)
                curveTo(3.858f, 7.83f, 3.311f, 7.446f, 3.04f, 7.2f)
                curveTo(2.669f, 6.864f, 2.279f, 6.177f, 2.196f, 5.701f)
                curveTo(2.071f, 4.989f, 1.959f, 4.008f, 1.881f, 2.672f)
                lineTo(2.275f, 2.466f)
                curveTo(2.352f, 3.792f, 2.446f, 4.85f, 2.569f, 5.549f)
                curveTo(2.641f, 5.962f, 3.001f, 6.596f, 3.33f, 6.894f)
                curveTo(3.573f, 7.114f, 3.964f, 7.359f, 4.502f, 7.624f)
                curveTo(4.534f, 7.606f, 4.57f, 7.587f, 4.61f, 7.567f)
                curveTo(4.611f, 7.567f, 4.977f, 7.404f, 5.105f, 7.338f)
                curveTo(5.328f, 7.221f, 5.535f, 7.081f, 5.748f, 6.893f)
                curveTo(6.123f, 6.563f, 6.356f, 6.119f, 6.451f, 5.555f)
                lineTo(6.731f, 2.453f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.771f, 5.512f)
                curveTo(2.771f, 5.512f, 3.029f, 6.301f, 3.481f, 6.741f)
                curveTo(3.932f, 7.182f, 4.49f, 7.398f, 4.49f, 7.398f)
                curveTo(4.49f, 7.398f, 5.155f, 7.196f, 5.533f, 6.773f)
                curveTo(5.91f, 6.349f, 6.296f, 5.512f, 6.296f, 5.512f)
                lineTo(5.419f, 4.67f)
                lineTo(5.07f, 5.048f)
                lineTo(4.49f, 4.222f)
                lineTo(4.005f, 5.048f)
                lineTo(3.633f, 4.67f)
                lineTo(2.771f, 5.512f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.573f, 2.943f)
                horizontalLineTo(3.222f)
                lineTo(3.495f, 2.688f)
                lineTo(3.222f, 2.418f)
                horizontalLineTo(3.573f)
                lineTo(3.722f, 2.156f)
                lineTo(3.871f, 2.418f)
                horizontalLineTo(4.222f)
                lineTo(3.963f, 2.671f)
                lineTo(4.193f, 2.943f)
                horizontalLineTo(3.871f)
                lineTo(3.722f, 3.22f)
                lineTo(3.573f, 2.943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.23f, 2.943f)
                horizontalLineTo(4.879f)
                lineTo(5.151f, 2.688f)
                lineTo(4.879f, 2.418f)
                horizontalLineTo(5.23f)
                lineTo(5.379f, 2.156f)
                lineTo(5.528f, 2.418f)
                horizontalLineTo(5.879f)
                lineTo(5.62f, 2.671f)
                lineTo(5.85f, 2.943f)
                horizontalLineTo(5.528f)
                lineTo(5.379f, 3.22f)
                lineTo(5.23f, 2.943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.3f, 3.784f)
                horizontalLineTo(3.948f)
                lineTo(4.221f, 3.528f)
                lineTo(3.948f, 3.258f)
                horizontalLineTo(4.3f)
                lineTo(4.448f, 2.996f)
                lineTo(4.597f, 3.258f)
                horizontalLineTo(4.948f)
                lineTo(4.689f, 3.512f)
                lineTo(4.919f, 3.784f)
                horizontalLineTo(4.597f)
                lineTo(4.448f, 4.06f)
                lineTo(4.3f, 3.784f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SloveniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Slovenia,
            contentDescription = "Slovenia Flag"
        )
    }
}
