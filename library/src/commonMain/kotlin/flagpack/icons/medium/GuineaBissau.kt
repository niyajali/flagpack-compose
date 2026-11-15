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
 * Guinea Bissau Flag (20x15dp)
 *
 * - ISO Alpha-2: GW
 * - ISO Alpha-3: GNB
 * - ISO Numeric: 624
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.GuineaBissau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guinea Bissau:GW:GNB:624:Medium",
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
                moveTo(10f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7.5f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.582f, 9.129f)
                lineTo(3.403f, 10.64f)
                lineTo(4.099f, 8.052f)
                lineTo(2.5f, 6.399f)
                lineTo(4.665f, 6.309f)
                lineTo(5.582f, 3.75f)
                lineTo(6.498f, 6.309f)
                horizontalLineTo(8.66f)
                lineTo(7.064f, 8.052f)
                lineTo(7.863f, 10.487f)
                lineTo(5.582f, 9.129f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuineaBissauPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.GuineaBissau,
            contentDescription = "Guinea Bissau Flag"
        )
    }
}
