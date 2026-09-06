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
 * Norway Flag (16x12dp)
 *
 * - ISO Alpha-2: NO
 * - ISO Alpha-3: NOR
 * - ISO Numeric: 578
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Norway: ImageVector by lazy {
    ImageVector.Builder(
        name = "Norway:NO:NOR:578:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(5f, -0.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(0f)
                horizontalLineTo(-0.5f)
                verticalLineTo(5f)
                verticalLineTo(7f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                horizontalLineTo(4.5f)
                verticalLineTo(12f)
                verticalLineTo(12.5f)
                horizontalLineTo(5f)
                horizontalLineTo(7f)
                horizontalLineTo(7.5f)
                verticalLineTo(12f)
                verticalLineTo(7.5f)
                horizontalLineTo(16f)
                horizontalLineTo(16.5f)
                verticalLineTo(7f)
                verticalLineTo(5f)
                verticalLineTo(4.5f)
                horizontalLineTo(16f)
                horizontalLineTo(7.5f)
                verticalLineTo(0f)
                verticalLineTo(-0.5f)
                horizontalLineTo(7f)
                horizontalLineTo(5f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorwayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Norway,
            contentDescription = "Norway Flag"
        )
    }
}
