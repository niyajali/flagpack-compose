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
 * Comoros Flag (16x12dp)
 *
 * - ISO Alpha-2: KM
 * - ISO Alpha-3: COM
 * - ISO Numeric: 174
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Comoros: ImageVector by lazy {
    ImageVector.Builder(
        name = "Comoros:KM:COM:174:Small",
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
                fill = SolidColor(Color(0xFF5196ED)),
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
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(8f, 6f)
                lineTo(0f, 12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.152f, 8.728f)
                curveTo(3.152f, 8.728f, 1.361f, 8.061f, 1.424f, 5.972f)
                curveTo(1.487f, 3.884f, 3.312f, 3.475f, 3.312f, 3.475f)
                curveTo(2.673f, 2.971f, 0.387f, 3.561f, 0.314f, 5.972f)
                curveTo(0.24f, 8.383f, 2.471f, 8.919f, 3.152f, 8.728f)
                close()
                moveTo(3.247f, 5.143f)
                lineTo(3.315f, 4.75f)
                lineTo(3.029f, 4.472f)
                lineTo(3.424f, 4.415f)
                lineTo(3.6f, 4.057f)
                lineTo(3.776f, 4.415f)
                lineTo(4.171f, 4.472f)
                lineTo(3.885f, 4.75f)
                lineTo(3.953f, 5.143f)
                lineTo(3.6f, 4.957f)
                lineTo(3.247f, 5.143f)
                close()
                moveTo(3.315f, 5.75f)
                lineTo(3.247f, 6.143f)
                lineTo(3.6f, 5.957f)
                lineTo(3.953f, 6.143f)
                lineTo(3.885f, 5.75f)
                lineTo(4.171f, 5.472f)
                lineTo(3.776f, 5.415f)
                lineTo(3.6f, 5.057f)
                lineTo(3.424f, 5.415f)
                lineTo(3.029f, 5.472f)
                lineTo(3.315f, 5.75f)
                close()
                moveTo(3.247f, 7.143f)
                lineTo(3.315f, 6.75f)
                lineTo(3.029f, 6.472f)
                lineTo(3.424f, 6.415f)
                lineTo(3.6f, 6.057f)
                lineTo(3.776f, 6.415f)
                lineTo(4.171f, 6.472f)
                lineTo(3.885f, 6.75f)
                lineTo(3.953f, 7.143f)
                lineTo(3.6f, 6.957f)
                lineTo(3.247f, 7.143f)
                close()
                moveTo(3.247f, 8.143f)
                lineTo(3.315f, 7.75f)
                lineTo(3.029f, 7.472f)
                lineTo(3.424f, 7.415f)
                lineTo(3.6f, 7.057f)
                lineTo(3.776f, 7.415f)
                lineTo(4.171f, 7.472f)
                lineTo(3.885f, 7.75f)
                lineTo(3.953f, 8.143f)
                lineTo(3.6f, 7.957f)
                lineTo(3.247f, 8.143f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ComorosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Comoros,
            contentDescription = "Comoros Flag"
        )
    }
}
