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
 * Mozambique Flag (16x12dp)
 *
 * - ISO Alpha-2: MZ
 * - ISO Alpha-3: MOZ
 * - ISO Numeric: 508
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Mozambique: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mozambique:MZ:MOZ:508:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 3.5f)
                horizontalLineTo(-0.5f)
                verticalLineTo(4f)
                verticalLineTo(8f)
                verticalLineTo(8.5f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.5f)
                verticalLineTo(8f)
                verticalLineTo(4f)
                verticalLineTo(3.5f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(12f)
            lineTo(9f, 6f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(9f, 6f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.034f, 7.177f)
                lineTo(2.145f, 8.702f)
                lineTo(3.012f, 6.664f)
                lineTo(1.522f, 5.229f)
                horizontalLineTo(3.28f)
                lineTo(4.002f, 3.5f)
                lineTo(4.768f, 5.229f)
                horizontalLineTo(6.522f)
                lineTo(4.955f, 6.664f)
                lineTo(5.739f, 8.702f)
                lineTo(4.034f, 7.177f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.078f, 5.992f)
                lineTo(2.758f, 7.062f)
                curveTo(2.758f, 7.062f, 3.839f, 7.052f, 3.969f, 7.161f)
                curveTo(4.361f, 6.917f, 5.167f, 7.062f, 5.167f, 7.062f)
                lineTo(4.738f, 5.917f)
                curveTo(4.738f, 5.917f, 4.195f, 5.671f, 3.969f, 5.806f)
                curveTo(3.417f, 5.681f, 3.078f, 5.992f, 3.078f, 5.992f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.782f, 7.608f)
                curveTo(5.865f, 7.718f, 5.843f, 7.875f, 5.733f, 7.958f)
                curveTo(5.622f, 8.041f, 5.466f, 8.019f, 5.382f, 7.909f)
                lineTo(3.292f, 5.133f)
                curveTo(3.209f, 5.023f, 3.231f, 4.866f, 3.342f, 4.783f)
                curveTo(3.452f, 4.7f, 3.609f, 4.722f, 3.692f, 4.833f)
                lineTo(5.782f, 7.608f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.487f, 4.92f)
                lineTo(3.287f, 4.68f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.802f, 4.681f)
                lineTo(2.198f, 5.649f)
                lineTo(2.5f, 6.172f)
                lineTo(3.191f, 5.145f)
                lineTo(3.316f, 4.828f)
                lineTo(3.191f, 4.681f)
                horizontalLineTo(2.802f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.019f, 7.554f)
                lineTo(2.484f, 8.094f)
                lineTo(5.998f, 4.022f)
                lineTo(4.401f, 5.017f)
                lineTo(2.019f, 7.554f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MozambiquePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Mozambique,
            contentDescription = "Mozambique Flag"
        )
    }
}
