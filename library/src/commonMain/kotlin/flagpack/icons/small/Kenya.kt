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
 * Kenya Flag (16x12dp)
 *
 * - ISO Alpha-2: KE
 * - ISO Alpha-3: KEN
 * - ISO Numeric: 404
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Kenya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kenya:KE:KEN:404:Small",
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
                fill = SolidColor(Color(0xFF0067C3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
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
                fill = SolidColor(Color(0xFF4E8B1D)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
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
            path(fill = SolidColor(Color(0xFFAC2317))) {
                moveTo(6f, 6f)
                arcToRelative(2f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4f, 0f)
                arcToRelative(2f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4f, 0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(9.812f, 2.015f)
                curveTo(9.926f, 1.81f, 10.233f, 1.586f, 10.733f, 1.342f)
                curveTo(10.75f, 1.334f, 10.771f, 1.334f, 10.788f, 1.341f)
                curveTo(10.818f, 1.354f, 10.831f, 1.386f, 10.816f, 1.412f)
                lineTo(5.637f, 10.726f)
                lineTo(5.367f, 10.61f)
                lineTo(9.932f, 2.4f)
                curveTo(9.726f, 2.371f, 9.686f, 2.242f, 9.812f, 2.015f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(6.183f, 2.015f)
                curveTo(6.309f, 2.242f, 6.269f, 2.371f, 6.062f, 2.4f)
                lineTo(10.627f, 10.61f)
                lineTo(10.358f, 10.726f)
                lineTo(5.179f, 1.412f)
                curveTo(5.164f, 1.386f, 5.176f, 1.354f, 5.206f, 1.341f)
                curveTo(5.224f, 1.334f, 5.245f, 1.334f, 5.262f, 1.342f)
                curveTo(5.762f, 1.586f, 6.069f, 1.81f, 6.183f, 2.015f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.692f, 8.133f)
                curveTo(9.887f, 7.515f, 10f, 6.784f, 10f, 6f)
                curveTo(10f, 5.216f, 9.887f, 4.485f, 9.692f, 3.867f)
                curveTo(9.254f, 4.485f, 9f, 5.216f, 9f, 6f)
                curveTo(9f, 6.784f, 9.254f, 7.515f, 9.692f, 8.133f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.308f, 8.133f)
                curveTo(6.746f, 7.515f, 7f, 6.784f, 7f, 6f)
                curveTo(7f, 5.216f, 6.746f, 4.485f, 6.308f, 3.867f)
                curveTo(6.113f, 4.485f, 6f, 5.216f, 6f, 6f)
                curveTo(6f, 6.784f, 6.113f, 7.515f, 6.308f, 8.133f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.12f, 5.7f)
                curveTo(8.394f, 5.529f, 8.6f, 4.786f, 8.6f, 3.895f)
                curveTo(8.6f, 3.004f, 8.394f, 2.26f, 8.12f, 2.089f)
                verticalLineTo(5.7f)
                close()
                moveTo(7.82f, 5.653f)
                curveTo(7.577f, 5.418f, 7.4f, 4.72f, 7.4f, 3.895f)
                curveTo(7.4f, 3.07f, 7.577f, 2.372f, 7.82f, 2.137f)
                verticalLineTo(5.653f)
                close()
                moveTo(7.82f, 6.4f)
                verticalLineTo(9.916f)
                curveTo(7.577f, 9.681f, 7.4f, 8.983f, 7.4f, 8.158f)
                curveTo(7.4f, 7.333f, 7.577f, 6.635f, 7.82f, 6.4f)
                close()
                moveTo(7.999f, 10f)
                curveTo(8f, 10f, 8f, 10f, 8f, 10f)
                curveTo(8f, 10f, 8f, 10f, 8.001f, 10f)
                horizontalLineTo(7.999f)
                close()
                moveTo(8.12f, 9.963f)
                verticalLineTo(6.353f)
                curveTo(8.394f, 6.523f, 8.6f, 7.267f, 8.6f, 8.158f)
                curveTo(8.6f, 9.049f, 8.394f, 9.793f, 8.12f, 9.963f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(8f, 5.737f)
                curveTo(8.331f, 5.737f, 8.6f, 5.972f, 8.6f, 6.263f)
                curveTo(8.6f, 6.554f, 8.331f, 6.789f, 8f, 6.789f)
                curveTo(7.669f, 6.789f, 7.4f, 6.554f, 7.4f, 6.263f)
                curveTo(7.4f, 5.972f, 7.669f, 5.737f, 8f, 5.737f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun KenyaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Kenya,
            contentDescription = "Kenya Flag"
        )
    }
}
