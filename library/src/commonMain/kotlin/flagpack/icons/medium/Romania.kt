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
 * Romania Flag (20x15dp)
 *
 * - ISO Alpha-2: RO
 * - ISO Alpha-3: ROU
 * - ISO Numeric: 642
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Romania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Romania:RO:ROU:642:Medium",
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
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.25f, 0f)
                horizontalLineTo(13.75f)
                verticalLineTo(15f)
                horizontalLineTo(6.25f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.75f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(13.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6.25f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun RomaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Romania,
            contentDescription = "Romania Flag"
        )
    }
}
