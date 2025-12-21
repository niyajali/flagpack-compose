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
 * Sao Tome and Principe Flag (20x15dp)
 *
 * - ISO Alpha-2: ST
 * - ISO Alpha-3: STP
 * - ISO Numeric: 678
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SaoTomeAndPrincipe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sao Tome and Principe:ST:STP:678:Medium",
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
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(6.25f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.626f, 8.669f)
                lineTo(9.457f, 9.375f)
                lineTo(9.724f, 7.998f)
                lineTo(8.75f, 6.967f)
                lineTo(10.068f, 6.911f)
                lineTo(10.626f, 5.625f)
                lineTo(11.184f, 6.911f)
                horizontalLineTo(12.5f)
                lineTo(11.529f, 7.998f)
                lineTo(11.821f, 9.375f)
                lineTo(10.626f, 8.669f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.626f, 8.669f)
                lineTo(14.457f, 9.375f)
                lineTo(14.724f, 7.998f)
                lineTo(13.75f, 6.967f)
                lineTo(15.068f, 6.911f)
                lineTo(15.626f, 5.625f)
                lineTo(16.184f, 6.911f)
                horizontalLineTo(17.5f)
                lineTo(16.529f, 7.998f)
                lineTo(16.821f, 9.375f)
                lineTo(15.626f, 8.669f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaoTomeAndPrincipePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SaoTomeAndPrincipe,
            contentDescription = "Sao Tome and Principe Flag"
        )
    }
}
