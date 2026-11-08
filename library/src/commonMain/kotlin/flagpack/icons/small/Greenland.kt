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
 * Greenland Flag (16x12dp)
 *
 * - ISO Alpha-2: GL
 * - ISO Alpha-3: GRL
 * - ISO Numeric: 304
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Greenland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Greenland:GL:GRL:304:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                curveTo(8.209f, 10f, 10f, 8.209f, 10f, 6f)
                curveTo(10f, 3.791f, 8.209f, 2f, 6f, 2f)
                curveTo(3.791f, 2f, 2f, 3.791f, 2f, 6f)
                curveTo(2f, 8.209f, 3.791f, 10f, 6f, 10f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            horizontalLineTo(16f)
            verticalLineTo(6f)
            horizontalLineTo(0f)
            verticalLineTo(0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 10f)
                curveTo(8.209f, 10f, 10f, 8.209f, 10f, 6f)
                curveTo(10f, 3.791f, 8.209f, 2f, 6f, 2f)
                curveTo(3.791f, 2f, 2f, 3.791f, 2f, 6f)
                curveTo(2f, 8.209f, 3.791f, 10f, 6f, 10f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GreenlandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Greenland,
            contentDescription = "Greenland Flag"
        )
    }
}
