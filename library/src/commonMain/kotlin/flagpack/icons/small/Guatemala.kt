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
 * Guatemala Flag (16x12dp)
 *
 * - ISO Alpha-2: GT
 * - ISO Alpha-3: GTM
 * - ISO Numeric: 320
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Guatemala: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guatemala:GT:GTM:320:Small",
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC6C6C6))) {
                moveTo(6.382f, 8.519f)
                lineTo(6.019f, 8.175f)
                lineTo(9.863f, 4.111f)
                lineTo(10.226f, 4.455f)
                lineTo(6.382f, 8.519f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.492f, 4.053f)
                curveTo(6.492f, 4.053f, 5.262f, 4.795f, 5.262f, 6.657f)
                curveTo(5.262f, 8.518f, 8.258f, 8.77f, 8.258f, 8.77f)
                curveTo(8.258f, 8.77f, 6.465f, 7.677f, 6.23f, 6.894f)
                curveTo(5.996f, 6.111f, 6.492f, 4.053f, 6.492f, 4.053f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.527f, 4.053f)
                curveTo(9.527f, 4.053f, 10.758f, 4.795f, 10.758f, 6.657f)
                curveTo(10.758f, 8.518f, 7.762f, 8.77f, 7.762f, 8.77f)
                curveTo(7.762f, 8.77f, 9.646f, 7.69f, 9.91f, 6.657f)
                curveTo(10.174f, 5.624f, 9.527f, 4.053f, 9.527f, 4.053f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5AB92D))) {
                moveTo(7.404f, 3.8f)
                lineTo(7.902f, 3.845f)
                curveTo(7.885f, 4.025f, 7.984f, 4.209f, 8.228f, 4.406f)
                curveTo(9.012f, 5.04f, 9.434f, 5.832f, 9.103f, 6.731f)
                curveTo(8.863f, 7.384f, 8.538f, 7.934f, 8.126f, 8.382f)
                lineTo(7.758f, 8.043f)
                curveTo(8.124f, 7.646f, 8.416f, 7.152f, 8.634f, 6.559f)
                curveTo(8.871f, 5.913f, 8.55f, 5.31f, 7.913f, 4.795f)
                curveTo(7.55f, 4.501f, 7.371f, 4.166f, 7.404f, 3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEFE298)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.087f, 4.904f)
                lineTo(7.612f, 6.388f)
                horizontalLineTo(7.226f)
                curveTo(7.226f, 6.388f, 7.087f, 6.856f, 7.349f, 6.856f)
                curveTo(7.612f, 6.856f, 8.963f, 6.856f, 8.963f, 6.856f)
                curveTo(8.963f, 6.856f, 9.139f, 6.738f, 9.051f, 6.388f)
                curveTo(8.963f, 6.037f, 8.519f, 5.069f, 8.519f, 5.069f)
                curveTo(8.519f, 5.069f, 8.709f, 4.908f, 8.709f, 4.789f)
                curveTo(8.709f, 4.67f, 8.519f, 4.657f, 8.519f, 4.657f)
                horizontalLineTo(7.322f)
                curveTo(7.169f, 4.683f, 7.087f, 4.904f, 7.087f, 4.904f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuatemalaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Guatemala,
            contentDescription = "Guatemala Flag"
        )
    }
}
