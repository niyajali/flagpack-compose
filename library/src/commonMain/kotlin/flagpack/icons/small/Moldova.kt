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
 * Moldova Flag (16x12dp)
 *
 * - ISO Alpha-2: MD
 * - ISO Alpha-3: MDA
 * - ISO Numeric: 498
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Moldova: ImageVector by lazy {
    ImageVector.Builder(
        name = "Moldova:MD:MDA:498:Small",
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
                fill = SolidColor(Color(0xFFD9071E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFD1900)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.859f, 9.807f)
                lineTo(10.333f, 10.095f)
                lineTo(8.587f, 6.9f)
                lineTo(9.114f, 6.613f)
                lineTo(10.859f, 9.807f)
                close()
                moveTo(5.257f, 9.884f)
                lineTo(5.783f, 10.172f)
                lineTo(7.529f, 6.977f)
                lineTo(7.002f, 6.689f)
                lineTo(5.257f, 9.884f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA77B3B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.689f, 4.695f)
                verticalLineTo(7.47f)
                curveTo(5.689f, 8.087f, 5.158f, 8.89f, 4.89f, 9.189f)
                curveTo(4.623f, 9.488f, 4.091f, 10.173f, 4.091f, 10.173f)
                verticalLineTo(2.704f)
                curveTo(4.091f, 1.866f, 4.89f, 1.579f, 4.89f, 1.579f)
                curveTo(4.89f, 1.579f, 5.554f, 1.71f, 5.689f, 2.704f)
                verticalLineTo(3.673f)
                curveTo(5.895f, 3.835f, 6.581f, 4.331f, 7.024f, 4.122f)
                curveTo(7.55f, 3.873f, 7.732f, 3.16f, 7.732f, 3.16f)
                curveTo(7.732f, 3.16f, 7.683f, 2.44f, 7.467f, 2.44f)
                curveTo(7.251f, 2.44f, 7.234f, 1.425f, 8.061f, 1.425f)
                curveTo(8.888f, 1.425f, 8.985f, 1.816f, 8.985f, 2.128f)
                curveTo(8.985f, 2.291f, 8.854f, 2.553f, 8.729f, 2.803f)
                curveTo(8.616f, 3.029f, 8.508f, 3.245f, 8.508f, 3.368f)
                curveTo(8.508f, 3.624f, 8.702f, 4.122f, 8.985f, 4.122f)
                curveTo(9.183f, 4.122f, 10.138f, 3.751f, 10.691f, 3.529f)
                verticalLineTo(2.704f)
                curveTo(10.825f, 1.71f, 11.49f, 1.579f, 11.49f, 1.579f)
                curveTo(11.49f, 1.579f, 12.289f, 1.866f, 12.289f, 2.704f)
                verticalLineTo(10.173f)
                curveTo(12.289f, 10.173f, 11.757f, 9.488f, 11.49f, 9.189f)
                curveTo(11.222f, 8.89f, 10.691f, 8.087f, 10.691f, 7.47f)
                verticalLineTo(4.695f)
                horizontalLineTo(5.689f)
                close()
                moveTo(6.575f, 9.916f)
                curveTo(7.116f, 9.564f, 7.907f, 7.985f, 7.907f, 7.985f)
                lineTo(8.17f, 8.046f)
                curveTo(8.17f, 8.046f, 8.571f, 9.092f, 9.75f, 9.916f)
                curveTo(8.493f, 10.252f, 8.17f, 10.925f, 8.17f, 10.925f)
                curveTo(8.17f, 10.386f, 6.575f, 9.916f, 6.575f, 9.916f)
                close()
                moveTo(6.488f, 8.917f)
                curveTo(6.853f, 8.917f, 7.148f, 8.637f, 7.148f, 8.292f)
                curveTo(7.148f, 7.946f, 6.853f, 7.667f, 6.488f, 7.667f)
                curveTo(6.123f, 7.667f, 5.828f, 7.946f, 5.828f, 8.292f)
                curveTo(5.828f, 8.637f, 6.123f, 8.917f, 6.488f, 8.917f)
                close()
                moveTo(10.36f, 8.292f)
                curveTo(10.36f, 8.637f, 10.064f, 8.917f, 9.7f, 8.917f)
                curveTo(9.335f, 8.917f, 9.04f, 8.637f, 9.04f, 8.292f)
                curveTo(9.04f, 7.946f, 9.335f, 7.667f, 9.7f, 7.667f)
                curveTo(10.064f, 7.667f, 10.36f, 7.946f, 10.36f, 8.292f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFF00))) {
                moveTo(12.57f, 5.204f)
                lineTo(13.029f, 5.402f)
                lineTo(11.159f, 9.728f)
                lineTo(10.7f, 9.53f)
                lineTo(12.57f, 5.204f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE1E5E8)),
                fillAlpha = 0.3f,
                strokeAlpha = 0.3f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.52f, 3.917f)
                horizontalLineTo(10.8f)
                verticalLineTo(7.736f)
                curveTo(10.8f, 7.736f, 9.456f, 8.141f, 8.16f, 8.805f)
                curveTo(7.203f, 8.095f, 5.52f, 7.736f, 5.52f, 7.736f)
                verticalLineTo(3.917f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.52f, 3.917f)
                horizontalLineTo(10.8f)
                verticalLineTo(7.736f)
                curveTo(10.8f, 7.736f, 9.456f, 8.141f, 8.16f, 8.805f)
                curveTo(7.203f, 8.095f, 5.52f, 7.736f, 5.52f, 7.736f)
                verticalLineTo(3.917f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF3D58DB))) {
                moveTo(5.52f, 6.417f)
                horizontalLineToRelative(5.28f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD1900))) {
                moveTo(5.52f, 3.917f)
                horizontalLineToRelative(5.28f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5.28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.893f, 5.041f)
                lineTo(7.493f, 5.074f)
                lineTo(7.724f, 4.763f)
                lineTo(7.478f, 4.44f)
                lineTo(7.88f, 4.492f)
                lineTo(8.034f, 4.137f)
                lineTo(8.206f, 4.5f)
                lineTo(8.606f, 4.467f)
                lineTo(8.375f, 4.778f)
                lineTo(8.621f, 5.1f)
                lineTo(8.219f, 5.049f)
                lineTo(8.065f, 5.404f)
                lineTo(7.893f, 5.041f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.175f, 4.336f)
                curveTo(7.175f, 4.336f, 6.1f, 4.99f, 6.458f, 5.459f)
                curveTo(6.817f, 5.929f, 7.268f, 5.989f, 7.268f, 5.989f)
                curveTo(7.268f, 5.989f, 6.168f, 7.639f, 8.104f, 8.581f)
                curveTo(10.175f, 7.671f, 9.086f, 5.989f, 9.086f, 5.989f)
                curveTo(9.086f, 5.989f, 9.724f, 5.848f, 9.851f, 5.34f)
                curveTo(9.979f, 4.833f, 9.018f, 4.25f, 9.018f, 4.25f)
                curveTo(9.018f, 4.25f, 9.617f, 5.12f, 9.481f, 5.34f)
                curveTo(9.344f, 5.561f, 8.61f, 5.785f, 8.104f, 5.785f)
                curveTo(7.597f, 5.785f, 6.815f, 5.643f, 6.689f, 5.258f)
                curveTo(6.562f, 4.872f, 7.175f, 4.336f, 7.175f, 4.336f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF048F02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(2.368f, 5.764f)
            curveTo(2.368f, 5.764f, 2.895f, 6.388f, 3.392f, 6.184f)
            curveTo(3.888f, 5.98f, 3.768f, 5.25f, 3.768f, 5.25f)
            lineTo(3.392f, 5.591f)
            horizontalLineTo(3.072f)
            verticalLineTo(5.764f)
            lineTo(2.822f, 5.591f)
            verticalLineTo(5.764f)
            horizontalLineTo(2.368f)
            close()
            moveTo(2.725f, 6.722f)
            curveTo(2.725f, 6.722f, 3.367f, 7.282f, 3.8f, 7.124f)
            curveTo(4.233f, 6.966f, 4.124f, 6.207f, 4.124f, 6.207f)
            lineTo(3.748f, 6.548f)
            horizontalLineTo(3.428f)
            verticalLineTo(6.722f)
            lineTo(3.178f, 6.548f)
            verticalLineTo(6.722f)
            horizontalLineTo(2.725f)
            close()
            moveTo(4.455f, 7.993f)
            curveTo(4.022f, 8.152f, 3.38f, 7.592f, 3.38f, 7.592f)
            horizontalLineTo(3.833f)
            verticalLineTo(7.418f)
            lineTo(4.083f, 7.592f)
            verticalLineTo(7.418f)
            horizontalLineTo(4.403f)
            lineTo(4.779f, 7.077f)
            curveTo(4.779f, 7.077f, 4.888f, 7.835f, 4.455f, 7.993f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFDFF00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.99f, 1.124f)
            horizontalLineTo(6.49f)
            verticalLineTo(1.422f)
            horizontalLineTo(6.254f)
            verticalLineTo(1.922f)
            horizontalLineTo(6.49f)
            verticalLineTo(2.794f)
            horizontalLineTo(6.99f)
            verticalLineTo(1.922f)
            horizontalLineTo(7.276f)
            verticalLineTo(1.422f)
            horizontalLineTo(6.99f)
            verticalLineTo(1.124f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDB4400)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.579f, 1.692f)
            lineTo(6.421f, 1.991f)
            lineTo(7.579f, 2.357f)
            verticalLineTo(1.692f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoldovaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Moldova,
            contentDescription = "Moldova Flag"
        )
    }
}
