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
 * Switzerland Flag (20x15dp)
 *
 * - ISO Alpha-2: CH
 * - ISO Alpha-3: CHE
 * - ISO Numeric: 756
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Switzerland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Switzerland:CH:CHE:756:Medium",
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
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.25f, 3.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(6.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(13.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SwitzerlandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Switzerland,
            contentDescription = "Switzerland Flag"
        )
    }
}
