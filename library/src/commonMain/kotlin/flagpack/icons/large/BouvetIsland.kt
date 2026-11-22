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
 * Bouvet Island Flag (32x24dp)
 *
 * - ISO Alpha-2: BV
 * - ISO Alpha-3: BVT
 * - ISO Numeric: 074
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.BouvetIsland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bouvet Island:BV:BVT:074:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
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
private fun BouvetIslandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.BouvetIsland,
            contentDescription = "Bouvet Island Flag"
        )
    }
}
