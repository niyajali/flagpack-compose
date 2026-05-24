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
 * Faroe Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: FO
 * - ISO Alpha-3: FRO
 * - ISO Numeric: 234
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.FaroeIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Faroe Islands:FO:FRO:234:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFF50100)),
                stroke = SolidColor(Color(0xFF2E42A5)),
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
private fun FaroeIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.FaroeIslands,
            contentDescription = "Faroe Islands Flag"
        )
    }
}
