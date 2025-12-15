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
 * Aland Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: AX
 * - ISO Alpha-3: ALA
 * - ISO Numeric: 248
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.AlandIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Aland Islands:AX:ALA:248:Large",
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
                fill = SolidColor(Color(0xFF0061C1)),
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
                fill = SolidColor(Color(0xFFD21034)),
                stroke = SolidColor(Color(0xFFFFCE00)),
                strokeLineWidth = 2f
            ) {
                moveTo(10f, -1f)
                horizontalLineTo(9f)
                verticalLineTo(0f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                horizontalLineTo(-1f)
                verticalLineTo(10f)
                verticalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                horizontalLineTo(9f)
                verticalLineTo(24f)
                verticalLineTo(25f)
                horizontalLineTo(10f)
                horizontalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                verticalLineTo(15f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(14f)
                verticalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(32f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                verticalLineTo(-1f)
                horizontalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AlandIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.AlandIslands,
            contentDescription = "Aland Islands Flag"
        )
    }
}
