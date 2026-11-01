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
 * Tuvalu Flag (16x12dp)
 *
 * - ISO Alpha-2: TV
 * - ISO Alpha-3: TUV
 * - ISO Numeric: 798
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Tuvalu: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tuvalu:TV:TUV:798:Small",
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
                fill = SolidColor(Color(0xFF00B4FF)),
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
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.368f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.714f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.368f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-1f, -1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(3.992f, 0f)
                verticalLineTo(-0.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                close()
                moveTo(4.992f, 0f)
                horizontalLineTo(5.742f)
                verticalLineTo(-0.75f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
                moveTo(3.992f, 3f)
                verticalLineTo(3.75f)
                horizontalLineTo(4.742f)
                verticalLineTo(3f)
                horizontalLineTo(3.992f)
                close()
                moveTo(0f, 3f)
                verticalLineTo(2.25f)
                horizontalLineTo(-0.75f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
                moveTo(0f, 4f)
                horizontalLineTo(-0.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                close()
                moveTo(3.992f, 4f)
                horizontalLineTo(4.742f)
                verticalLineTo(3.25f)
                horizontalLineTo(3.992f)
                verticalLineTo(4f)
                close()
                moveTo(3.992f, 7f)
                horizontalLineTo(3.242f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                close()
                moveTo(4.992f, 7f)
                verticalLineTo(7.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                close()
                moveTo(4.992f, 4f)
                verticalLineTo(3.25f)
                horizontalLineTo(4.242f)
                verticalLineTo(4f)
                horizontalLineTo(4.992f)
                close()
                moveTo(9f, 4f)
                verticalLineTo(4.75f)
                horizontalLineTo(9.75f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                close()
                moveTo(9f, 3f)
                horizontalLineTo(9.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                close()
                moveTo(4.992f, 3f)
                horizontalLineTo(4.242f)
                verticalLineTo(3.75f)
                horizontalLineTo(4.992f)
                verticalLineTo(3f)
                close()
                moveTo(3.992f, 0.75f)
                horizontalLineTo(4.992f)
                verticalLineTo(-0.75f)
                horizontalLineTo(3.992f)
                verticalLineTo(0.75f)
                close()
                moveTo(4.742f, 3f)
                verticalLineTo(0f)
                horizontalLineTo(3.242f)
                verticalLineTo(3f)
                horizontalLineTo(4.742f)
                close()
                moveTo(0f, 3.75f)
                horizontalLineTo(3.992f)
                verticalLineTo(2.25f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                close()
                moveTo(0.75f, 4f)
                verticalLineTo(3f)
                horizontalLineTo(-0.75f)
                verticalLineTo(4f)
                horizontalLineTo(0.75f)
                close()
                moveTo(3.992f, 3.25f)
                horizontalLineTo(0f)
                verticalLineTo(4.75f)
                horizontalLineTo(3.992f)
                verticalLineTo(3.25f)
                close()
                moveTo(4.742f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(3.242f)
                verticalLineTo(7f)
                horizontalLineTo(4.742f)
                close()
                moveTo(4.992f, 6.25f)
                horizontalLineTo(3.992f)
                verticalLineTo(7.75f)
                horizontalLineTo(4.992f)
                verticalLineTo(6.25f)
                close()
                moveTo(4.242f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(5.742f)
                verticalLineTo(4f)
                horizontalLineTo(4.242f)
                close()
                moveTo(9f, 3.25f)
                horizontalLineTo(4.992f)
                verticalLineTo(4.75f)
                horizontalLineTo(9f)
                verticalLineTo(3.25f)
                close()
                moveTo(8.25f, 3f)
                verticalLineTo(4f)
                horizontalLineTo(9.75f)
                verticalLineTo(3f)
                horizontalLineTo(8.25f)
                close()
                moveTo(4.992f, 3.75f)
                horizontalLineTo(9f)
                verticalLineTo(2.25f)
                horizontalLineTo(4.992f)
                verticalLineTo(3.75f)
                close()
                moveTo(4.242f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(5.742f)
                verticalLineTo(0f)
                horizontalLineTo(4.242f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.428f, 5.342f)
            lineTo(13.732f, 4.78f)
            lineTo(14.398f, 4.76f)
            lineTo(13.882f, 4.329f)
            lineTo(14.06f, 3.748f)
            lineTo(13.616f, 4.015f)
            lineTo(13.054f, 3.674f)
            lineTo(13.108f, 4.32f)
            lineTo(12.604f, 4.622f)
            lineTo(13.258f, 4.704f)
            lineTo(13.428f, 5.342f)
            close()
            moveTo(11.732f, 5.78f)
            lineTo(11.428f, 6.342f)
            lineTo(11.258f, 5.704f)
            lineTo(10.604f, 5.622f)
            lineTo(11.108f, 5.32f)
            lineTo(11.054f, 4.674f)
            lineTo(11.616f, 5.015f)
            lineTo(12.06f, 4.748f)
            lineTo(11.882f, 5.329f)
            lineTo(12.398f, 5.76f)
            lineTo(11.732f, 5.78f)
            close()
            moveTo(10.428f, 7.342f)
            lineTo(10.732f, 6.78f)
            lineTo(11.398f, 6.76f)
            lineTo(10.882f, 6.329f)
            lineTo(11.06f, 5.748f)
            lineTo(10.616f, 6.015f)
            lineTo(10.054f, 5.674f)
            lineTo(10.108f, 6.32f)
            lineTo(9.604f, 6.622f)
            lineTo(10.258f, 6.704f)
            lineTo(10.428f, 7.342f)
            close()
            moveTo(8.428f, 9.342f)
            lineTo(8.732f, 8.78f)
            lineTo(9.398f, 8.76f)
            lineTo(8.882f, 8.329f)
            lineTo(9.06f, 7.748f)
            lineTo(8.616f, 8.015f)
            lineTo(8.054f, 7.674f)
            lineTo(8.108f, 8.32f)
            lineTo(7.604f, 8.622f)
            lineTo(8.258f, 8.704f)
            lineTo(8.428f, 9.342f)
            close()
            moveTo(6.487f, 10.868f)
            lineTo(5.937f, 11.194f)
            lineTo(6.12f, 10.559f)
            lineTo(5.602f, 10.152f)
            horizontalLineTo(6.189f)
            lineTo(6.475f, 9.571f)
            lineTo(6.781f, 10.152f)
            horizontalLineTo(7.3f)
            lineTo(6.848f, 10.559f)
            lineTo(7.068f, 11.194f)
            lineTo(6.487f, 10.868f)
            close()
            moveTo(8.732f, 10.78f)
            lineTo(8.428f, 11.342f)
            lineTo(8.258f, 10.704f)
            lineTo(7.604f, 10.623f)
            lineTo(8.108f, 10.32f)
            lineTo(8.054f, 9.674f)
            lineTo(8.616f, 10.015f)
            lineTo(9.06f, 9.748f)
            lineTo(8.882f, 10.329f)
            lineTo(9.398f, 10.76f)
            lineTo(8.732f, 10.78f)
            close()
            moveTo(10.732f, 9.78f)
            lineTo(10.428f, 10.342f)
            lineTo(10.258f, 9.704f)
            lineTo(9.604f, 9.622f)
            lineTo(10.108f, 9.32f)
            lineTo(10.054f, 8.674f)
            lineTo(10.616f, 9.015f)
            lineTo(11.06f, 8.748f)
            lineTo(10.882f, 9.329f)
            lineTo(11.398f, 9.76f)
            lineTo(10.732f, 9.78f)
            close()
            moveTo(12.732f, 8.78f)
            lineTo(12.428f, 9.342f)
            lineTo(12.258f, 8.704f)
            lineTo(11.604f, 8.622f)
            lineTo(12.108f, 8.32f)
            lineTo(12.054f, 7.674f)
            lineTo(12.616f, 8.015f)
            lineTo(13.06f, 7.748f)
            lineTo(12.882f, 8.329f)
            lineTo(13.398f, 8.76f)
            lineTo(12.732f, 8.78f)
            close()
            moveTo(13.428f, 8.342f)
            lineTo(13.732f, 7.78f)
            lineTo(14.398f, 7.76f)
            lineTo(13.882f, 7.329f)
            lineTo(14.06f, 6.748f)
            lineTo(13.616f, 7.015f)
            lineTo(13.054f, 6.674f)
            lineTo(13.108f, 7.32f)
            lineTo(12.604f, 7.622f)
            lineTo(13.258f, 7.704f)
            lineTo(13.428f, 8.342f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TuvaluPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Tuvalu,
            contentDescription = "Tuvalu Flag"
        )
    }
}
