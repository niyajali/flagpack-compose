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
 * Dominica Flag (16x12dp)
 *
 * - ISO Alpha-2: DM
 * - ISO Alpha-3: DMA
 * - ISO Numeric: 212
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Dominica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Dominica:DM:DMA:212:Small",
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
                fill = SolidColor(Color(0xFF279E19)),
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
                moveTo(8f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 10f)
                curveTo(10.209f, 10f, 12f, 8.209f, 12f, 6f)
                curveTo(12f, 3.791f, 10.209f, 2f, 8f, 2f)
                curveTo(5.791f, 2f, 4f, 3.791f, 4f, 6f)
                curveTo(4f, 8.209f, 5.791f, 10f, 8f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF804BFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.363f, 4.206f)
                curveTo(7.363f, 4.206f, 7.553f, 3.59f, 7.994f, 3.908f)
                curveTo(8.686f, 4.249f, 8.915f, 4.641f, 9.182f, 5.084f)
                curveTo(9.449f, 5.528f, 8.527f, 5.203f, 8.355f, 4.953f)
                curveTo(8.183f, 4.704f, 7.228f, 4.623f, 7.363f, 4.415f)
                curveTo(7.498f, 4.206f, 7.363f, 4.206f, 7.363f, 4.206f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA95601)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.207f, 7.363f)
                curveTo(7.207f, 7.363f, 6.737f, 8.005f, 7.207f, 8.005f)
                curveTo(7.676f, 8.005f, 9.581f, 7.867f, 9.353f, 7.684f)
                curveTo(9.125f, 7.501f, 7.432f, 7.684f, 7.432f, 7.684f)
                lineTo(7.207f, 7.363f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF804BFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.909f, 7.342f)
                curveTo(7.86f, 7.288f, 7.004f, 5.345f, 7.402f, 4.941f)
                curveTo(7.8f, 4.537f, 8.034f, 4.775f, 8.034f, 5.38f)
                curveTo(8.034f, 5.985f, 8.058f, 7.492f, 7.909f, 7.342f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF279E19)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.859f, 7.027f)
                curveTo(7.859f, 7.027f, 7.809f, 7.499f, 8.052f, 8.051f)
                curveTo(8.295f, 8.602f, 8.785f, 8.591f, 8.785f, 8.14f)
                curveTo(8.785f, 7.689f, 9.143f, 8.112f, 9.281f, 8.413f)
                curveTo(9.418f, 8.715f, 9.062f, 5.74f, 8.557f, 5.074f)
                curveTo(8.052f, 4.408f, 7.565f, 4.366f, 7.712f, 4.796f)
                curveTo(7.859f, 5.226f, 7.859f, 7.027f, 7.859f, 7.027f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.564f, 3.8f)
                curveTo(7.564f, 3.8f, 7.35f, 3.937f, 7.35f, 4.314f)
                curveTo(7.35f, 4.692f, 7.856f, 4.198f, 7.856f, 4.198f)
                lineTo(7.564f, 3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.609f, 3.657f)
                lineTo(8.05f, 3.425f)
                lineTo(8.491f, 3.657f)
                lineTo(8.407f, 3.166f)
                lineTo(8.763f, 2.818f)
                lineTo(8.27f, 2.747f)
                lineTo(8.05f, 2.3f)
                lineTo(7.83f, 2.747f)
                lineTo(7.337f, 2.818f)
                lineTo(7.693f, 3.166f)
                lineTo(7.609f, 3.657f)
                close()
                moveTo(7.609f, 9.557f)
                lineTo(8.05f, 9.325f)
                lineTo(8.491f, 9.557f)
                lineTo(8.407f, 9.066f)
                lineTo(8.763f, 8.718f)
                lineTo(8.27f, 8.647f)
                lineTo(8.05f, 8.2f)
                lineTo(7.83f, 8.647f)
                lineTo(7.337f, 8.718f)
                lineTo(7.693f, 9.066f)
                lineTo(7.609f, 9.557f)
                close()
                moveTo(10.409f, 6.757f)
                lineTo(10.493f, 6.266f)
                lineTo(10.137f, 5.918f)
                lineTo(10.63f, 5.847f)
                lineTo(10.85f, 5.4f)
                lineTo(11.07f, 5.847f)
                lineTo(11.563f, 5.918f)
                lineTo(11.207f, 6.266f)
                lineTo(11.291f, 6.757f)
                lineTo(10.85f, 6.525f)
                lineTo(10.409f, 6.757f)
                close()
                moveTo(4.709f, 6.757f)
                lineTo(5.15f, 6.525f)
                lineTo(5.591f, 6.757f)
                lineTo(5.507f, 6.266f)
                lineTo(5.863f, 5.918f)
                lineTo(5.37f, 5.847f)
                lineTo(5.15f, 5.4f)
                lineTo(4.93f, 5.847f)
                lineTo(4.437f, 5.918f)
                lineTo(4.793f, 6.266f)
                lineTo(4.709f, 6.757f)
                close()
                moveTo(6.234f, 4.351f)
                lineTo(6.094f, 4.829f)
                lineTo(5.8f, 4.428f)
                lineTo(5.302f, 4.443f)
                lineTo(5.593f, 4.038f)
                lineTo(5.425f, 3.569f)
                lineTo(5.899f, 3.721f)
                lineTo(6.293f, 3.416f)
                lineTo(6.295f, 3.914f)
                lineTo(6.707f, 4.195f)
                lineTo(6.234f, 4.351f)
                close()
                moveTo(10.339f, 8.73f)
                lineTo(10.478f, 8.252f)
                lineTo(10.951f, 8.096f)
                lineTo(10.539f, 7.815f)
                lineTo(10.537f, 7.317f)
                lineTo(10.143f, 7.622f)
                lineTo(9.669f, 7.47f)
                lineTo(9.837f, 7.939f)
                lineTo(9.546f, 8.344f)
                lineTo(10.044f, 8.328f)
                lineTo(10.339f, 8.73f)
                close()
                moveTo(10.409f, 4.293f)
                lineTo(10.269f, 4.771f)
                lineTo(9.975f, 4.369f)
                lineTo(9.477f, 4.384f)
                lineTo(9.768f, 3.98f)
                lineTo(9.6f, 3.511f)
                lineTo(10.074f, 3.663f)
                lineTo(10.468f, 3.358f)
                lineTo(10.47f, 3.856f)
                lineTo(10.882f, 4.137f)
                lineTo(10.409f, 4.293f)
                close()
                moveTo(6.211f, 8.871f)
                lineTo(6.35f, 8.393f)
                lineTo(6.823f, 8.237f)
                lineTo(6.412f, 7.956f)
                lineTo(6.409f, 7.458f)
                lineTo(6.015f, 7.763f)
                lineTo(5.541f, 7.611f)
                lineTo(5.709f, 8.08f)
                lineTo(5.418f, 8.485f)
                lineTo(5.916f, 8.469f)
                lineTo(6.211f, 8.871f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DominicaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Dominica,
            contentDescription = "Dominica Flag"
        )
    }
}
