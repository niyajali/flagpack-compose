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
 * Antigua and Barbuda Flag (20x15dp)
 *
 * - ISO Alpha-2: AG
 * - ISO Alpha-3: ATG
 * - ISO Numeric: 028
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.AntiguaAndBarbuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antigua and Barbuda:AG:ATG:028:Medium",
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
                fill = SolidColor(Color(0xFF1B1B1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9D313)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8.75f)
                lineTo(8.609f, 11.125f)
                lineTo(8.644f, 8.502f)
                lineTo(6.103f, 10.159f)
                lineTo(7.557f, 7.809f)
                lineTo(4.369f, 8.419f)
                lineTo(6.953f, 6.806f)
                lineTo(3.75f, 6.25f)
                lineTo(6.953f, 5.694f)
                lineTo(4.369f, 4.081f)
                lineTo(7.557f, 4.691f)
                lineTo(6.103f, 2.341f)
                lineTo(8.644f, 3.998f)
                lineTo(8.609f, 1.375f)
                lineTo(10f, 3.75f)
                lineTo(11.391f, 1.375f)
                lineTo(11.356f, 3.998f)
                lineTo(13.897f, 2.341f)
                lineTo(12.443f, 4.691f)
                lineTo(15.631f, 4.081f)
                lineTo(13.047f, 5.694f)
                lineTo(16.25f, 6.25f)
                lineTo(13.047f, 6.806f)
                lineTo(15.631f, 8.419f)
                lineTo(12.443f, 7.809f)
                lineTo(13.897f, 10.159f)
                lineTo(11.356f, 8.502f)
                lineTo(11.391f, 11.125f)
                lineTo(10f, 8.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(3.75f, 8.75f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(-12.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4A80E8))) {
                moveTo(1.25f, 6.25f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.75f)
                lineTo(10f, 15f)
                lineTo(20f, 3.75f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AntiguaAndBarbudaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.AntiguaAndBarbuda,
            contentDescription = "Antigua and Barbuda Flag"
        )
    }
}
