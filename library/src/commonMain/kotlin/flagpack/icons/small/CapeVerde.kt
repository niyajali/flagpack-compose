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
 * Cape Verde Flag (16x12dp)
 *
 * - ISO Alpha-2: CV
 * - ISO Alpha-3: CPV
 * - ISO Numeric: 132
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.CapeVerde: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cape Verde:CV:CPV:132:Small",
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
                fill = SolidColor(Color(0xFF4141DB)),
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
                fill = SolidColor(Color(0xFFF90000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 6.5f)
                horizontalLineTo(-0.5f)
                verticalLineTo(7f)
                verticalLineTo(8f)
                verticalLineTo(8.5f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.5f)
                verticalLineTo(8f)
                verticalLineTo(7f)
                verticalLineTo(6.5f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFDE00)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 11f)
                curveTo(7.433f, 11f, 9f, 9.433f, 9f, 7.5f)
                curveTo(9f, 5.567f, 7.433f, 4f, 5.5f, 4f)
                curveTo(3.567f, 4f, 2f, 5.567f, 2f, 7.5f)
                curveTo(2f, 9.433f, 3.567f, 11f, 5.5f, 11f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CapeVerdePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.CapeVerde,
            contentDescription = "Cape Verde Flag"
        )
    }
}
