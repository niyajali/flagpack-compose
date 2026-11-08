package flagpack.icons.large

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
 * Mozambique Flag (32x24dp)
 *
 * - ISO Alpha-2: MZ
 * - ISO Alpha-3: MOZ
 * - ISO Numeric: 508
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Mozambique: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mozambique:MZ:MOZ:508:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 7f)
                horizontalLineTo(-1f)
                verticalLineTo(8f)
                verticalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(16f)
                verticalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(24f)
            lineTo(18f, 12f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(18f, 12f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.069f, 14.353f)
                lineTo(4.29f, 17.404f)
                lineTo(6.023f, 13.327f)
                lineTo(3.045f, 10.459f)
                horizontalLineTo(6.56f)
                lineTo(8.003f, 7f)
                lineTo(9.535f, 10.459f)
                horizontalLineTo(13.045f)
                lineTo(9.909f, 13.327f)
                lineTo(11.478f, 17.404f)
                lineTo(8.069f, 14.353f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.156f, 11.984f)
                lineTo(5.515f, 14.125f)
                curveTo(5.515f, 14.125f, 7.679f, 14.103f, 7.939f, 14.322f)
                curveTo(8.722f, 13.834f, 10.333f, 14.125f, 10.333f, 14.125f)
                lineTo(9.476f, 11.834f)
                curveTo(9.476f, 11.834f, 8.389f, 11.341f, 7.939f, 11.611f)
                curveTo(6.834f, 11.362f, 6.156f, 11.984f, 6.156f, 11.984f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.564f, 15.216f)
                curveTo(11.73f, 15.437f, 11.686f, 15.75f, 11.465f, 15.917f)
                curveTo(11.245f, 16.083f, 10.931f, 16.038f, 10.765f, 15.818f)
                lineTo(6.585f, 10.267f)
                curveTo(6.419f, 10.046f, 6.463f, 9.732f, 6.684f, 9.566f)
                curveTo(6.904f, 9.4f, 7.218f, 9.444f, 7.384f, 9.665f)
                lineTo(11.564f, 15.216f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.974f, 9.84f)
                lineTo(6.574f, 9.36f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.605f, 9.363f)
                lineTo(4.396f, 11.298f)
                lineTo(5f, 12.345f)
                lineTo(6.383f, 10.29f)
                lineTo(6.631f, 9.655f)
                lineTo(6.383f, 9.363f)
                horizontalLineTo(5.605f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.039f, 15.108f)
                lineTo(4.622f, 15.93f)
                lineTo(9.117f, 10.611f)
                lineTo(9.304f, 10.82f)
                lineTo(10.34f, 9.845f)
                lineTo(11.996f, 8.043f)
                lineTo(10.34f, 9.397f)
                lineTo(9.804f, 9.248f)
                lineTo(9.304f, 10.035f)
                horizontalLineTo(8.801f)
                lineTo(5.129f, 14.122f)
                lineTo(4.039f, 15.108f)
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
            imageVector = FlagIcons.Large.Mozambique,
            contentDescription = "Mozambique Flag"
        )
    }
}
