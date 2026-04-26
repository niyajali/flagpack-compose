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
 * Laos Flag (16x12dp)
 *
 * - ISO Alpha-2: LA
 * - ISO Alpha-3: LAO
 * - ISO Numeric: 418
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Laos: ImageVector by lazy {
    ImageVector.Builder(
        name = "Laos:LA:LAO:418:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 7.87f)
                curveTo(9.036f, 7.87f, 9.875f, 7.031f, 9.875f, 5.995f)
                curveTo(9.875f, 4.959f, 9.036f, 4.12f, 8f, 4.12f)
                curveTo(6.964f, 4.12f, 6.125f, 4.959f, 6.125f, 5.995f)
                curveTo(6.125f, 7.031f, 6.964f, 7.87f, 8f, 7.87f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LaosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Laos,
            contentDescription = "Laos Flag"
        )
    }
}
