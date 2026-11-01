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
 * Costa Rica Flag (32x24dp)
 *
 * - ISO Alpha-2: CR
 * - ISO Alpha-3: CRI
 * - ISO Numeric: 188
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.CostaRica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Costa Rica:CR:CRI:188:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 4f
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(-2f)
                verticalLineTo(10f)
                verticalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(34f)
                verticalLineTo(14f)
                verticalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CostaRicaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.CostaRica,
            contentDescription = "Costa Rica Flag"
        )
    }
}
