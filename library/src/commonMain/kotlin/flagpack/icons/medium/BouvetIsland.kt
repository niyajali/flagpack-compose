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
 * Bouvet Island Flag (20x15dp)
 *
 * - ISO Alpha-2: BV
 * - ISO Alpha-3: BVT
 * - ISO Numeric: 074
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.BouvetIsland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bouvet Island:BV:BVT:074:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(6.25f, -0.625f)
                horizontalLineTo(5.625f)
                verticalLineTo(0f)
                verticalLineTo(5.625f)
                horizontalLineTo(0f)
                horizontalLineTo(-0.625f)
                verticalLineTo(6.25f)
                verticalLineTo(8.75f)
                verticalLineTo(9.375f)
                horizontalLineTo(0f)
                horizontalLineTo(5.625f)
                verticalLineTo(15f)
                verticalLineTo(15.625f)
                horizontalLineTo(6.25f)
                horizontalLineTo(8.75f)
                horizontalLineTo(9.375f)
                verticalLineTo(15f)
                verticalLineTo(9.375f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(8.75f)
                verticalLineTo(6.25f)
                verticalLineTo(5.625f)
                horizontalLineTo(20f)
                horizontalLineTo(9.375f)
                verticalLineTo(0f)
                verticalLineTo(-0.625f)
                horizontalLineTo(8.75f)
                horizontalLineTo(6.25f)
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
            imageVector = FlagIcons.Medium.BouvetIsland,
            contentDescription = "Bouvet Island Flag"
        )
    }
}
