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
 * Chile Flag (20x15dp)
 *
 * - ISO Alpha-2: CL
 * - ISO Alpha-3: CHL
 * - ISO Numeric: 152
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Chile: ImageVector by lazy {
    ImageVector.Builder(
        name = "Chile:CL:CHL:152:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.75f, -1.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.384f, 5.615f)
                lineTo(2.007f, 7.034f)
                lineTo(3.18f, 4.619f)
                lineTo(1.102f, 3.05f)
                lineTo(3.501f, 3.024f)
                lineTo(4.406f, 0.882f)
                lineTo(4.988f, 3.024f)
                lineTo(7.258f, 3.035f)
                lineTo(5.532f, 4.569f)
                lineTo(6.428f, 7.034f)
                lineTo(4.384f, 5.615f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Chile,
            contentDescription = "Chile Flag"
        )
    }
}
