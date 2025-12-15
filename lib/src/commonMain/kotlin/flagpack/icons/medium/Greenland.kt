package flagpack.icons.medium

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
 * Greenland Flag (20x15dp)
 *
 * - ISO Alpha-2: GL
 * - ISO Alpha-3: GRL
 * - ISO Numeric: 304
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Greenland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Greenland:GL:GRL:304:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(7.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 7.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(7.5f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 12.5f)
                curveTo(10.261f, 12.5f, 12.5f, 10.261f, 12.5f, 7.5f)
                curveTo(12.5f, 4.739f, 10.261f, 2.5f, 7.5f, 2.5f)
                curveTo(4.739f, 2.5f, 2.5f, 4.739f, 2.5f, 7.5f)
                curveTo(2.5f, 10.261f, 4.739f, 12.5f, 7.5f, 12.5f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            horizontalLineTo(20f)
            verticalLineTo(7.5f)
            horizontalLineTo(0f)
            verticalLineTo(0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 12.5f)
                curveTo(10.261f, 12.5f, 12.5f, 10.261f, 12.5f, 7.5f)
                curveTo(12.5f, 4.739f, 10.261f, 2.5f, 7.5f, 2.5f)
                curveTo(4.739f, 2.5f, 2.5f, 4.739f, 2.5f, 7.5f)
                curveTo(2.5f, 10.261f, 4.739f, 12.5f, 7.5f, 12.5f)
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
            imageVector = FlagIcons.Medium.Greenland,
            contentDescription = "Greenland Flag"
        )
    }
}
