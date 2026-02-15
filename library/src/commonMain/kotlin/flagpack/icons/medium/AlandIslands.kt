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
 * Aland Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: AX
 * - ISO Alpha-3: ALA
 * - ISO Numeric: 248
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.AlandIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Aland Islands:AX:ALA:248:Medium",
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
                fill = SolidColor(Color(0xFF0061C1)),
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
                fill = SolidColor(Color(0xFFD21034)),
                stroke = SolidColor(Color(0xFFFFCE00)),
                strokeLineWidth = 1f
            ) {
                moveTo(6f, -0.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(0f)
                verticalLineTo(5.5f)
                horizontalLineTo(0f)
                horizontalLineTo(-0.5f)
                verticalLineTo(6f)
                verticalLineTo(9f)
                verticalLineTo(9.5f)
                horizontalLineTo(0f)
                horizontalLineTo(5.5f)
                verticalLineTo(15f)
                verticalLineTo(15.5f)
                horizontalLineTo(6f)
                horizontalLineTo(9f)
                horizontalLineTo(9.5f)
                verticalLineTo(15f)
                verticalLineTo(9.5f)
                horizontalLineTo(20f)
                horizontalLineTo(20.5f)
                verticalLineTo(9f)
                verticalLineTo(6f)
                verticalLineTo(5.5f)
                horizontalLineTo(20f)
                horizontalLineTo(9.5f)
                verticalLineTo(0f)
                verticalLineTo(-0.5f)
                horizontalLineTo(9f)
                horizontalLineTo(6f)
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
            imageVector = FlagIcons.Medium.AlandIslands,
            contentDescription = "Aland Islands Flag"
        )
    }
}
