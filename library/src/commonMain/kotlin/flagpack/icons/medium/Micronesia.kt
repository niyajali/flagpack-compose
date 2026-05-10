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
 * Micronesia Flag (20x15dp)
 *
 * - ISO Alpha-2: FM
 * - ISO Alpha-3: FSM
 * - ISO Numeric: 583
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Micronesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Micronesia:FM:FSM:583:Medium",
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
                fill = SolidColor(Color(0xFF63B3E1)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 4.563f)
                lineTo(8.898f, 5.142f)
                lineTo(9.108f, 3.915f)
                lineTo(8.217f, 3.046f)
                lineTo(9.449f, 2.867f)
                lineTo(10f, 1.75f)
                lineTo(10.551f, 2.867f)
                lineTo(11.783f, 3.046f)
                lineTo(10.892f, 3.915f)
                lineTo(11.102f, 5.142f)
                lineTo(10f, 4.563f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 12.063f)
                lineTo(8.898f, 12.642f)
                lineTo(9.108f, 11.415f)
                lineTo(8.217f, 10.546f)
                lineTo(9.449f, 10.366f)
                lineTo(10f, 9.25f)
                lineTo(10.551f, 10.366f)
                lineTo(11.783f, 10.546f)
                lineTo(10.892f, 11.415f)
                lineTo(11.102f, 12.642f)
                lineTo(10f, 12.063f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.125f, 8.438f)
                lineTo(5.023f, 9.017f)
                lineTo(5.233f, 7.79f)
                lineTo(4.342f, 6.921f)
                lineTo(5.574f, 6.742f)
                lineTo(6.125f, 5.625f)
                lineTo(6.676f, 6.742f)
                lineTo(7.908f, 6.921f)
                lineTo(7.017f, 7.79f)
                lineTo(7.227f, 9.017f)
                lineTo(6.125f, 8.438f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.75f, 8.438f)
                lineTo(12.648f, 9.017f)
                lineTo(12.858f, 7.79f)
                lineTo(11.967f, 6.921f)
                lineTo(13.199f, 6.742f)
                lineTo(13.75f, 5.625f)
                lineTo(14.301f, 6.742f)
                lineTo(15.533f, 6.921f)
                lineTo(14.642f, 7.79f)
                lineTo(14.852f, 9.017f)
                lineTo(13.75f, 8.438f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MicronesiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Micronesia,
            contentDescription = "Micronesia Flag"
        )
    }
}
