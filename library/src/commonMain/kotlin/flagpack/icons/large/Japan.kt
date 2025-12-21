package flagpack.icons.large

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
 * Japan Flag (32x24dp)
 *
 * - ISO Alpha-2: JP
 * - ISO Alpha-3: JPN
 * - ISO Numeric: 392
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Japan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Japan:JP:JPN:392:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 19.5f)
                curveTo(20.142f, 19.5f, 23.5f, 16.142f, 23.5f, 12f)
                curveTo(23.5f, 7.858f, 20.142f, 4.5f, 16f, 4.5f)
                curveTo(11.858f, 4.5f, 8.5f, 7.858f, 8.5f, 12f)
                curveTo(8.5f, 16.142f, 11.858f, 19.5f, 16f, 19.5f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JapanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Japan,
            contentDescription = "Japan Flag"
        )
    }
}
