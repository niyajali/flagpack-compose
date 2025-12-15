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
 * Togo Flag (20x15dp)
 *
 * - ISO Alpha-2: TG
 * - ISO Alpha-3: TGO
 * - ISO Numeric: 768
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Togo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Togo:TG:TGO:768:Medium",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, -0.625f)
                horizontalLineTo(-0.625f)
                verticalLineTo(0f)
                verticalLineTo(15f)
                verticalLineTo(15.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(15f)
                verticalLineTo(0f)
                verticalLineTo(-0.625f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.75f)
                verticalLineTo(6.25f)
                horizontalLineTo(20f)
                verticalLineTo(3.75f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(20f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.156f, 6.34f)
                lineTo(2.832f, 7.779f)
                lineTo(3.734f, 5.364f)
                lineTo(1.875f, 3.737f)
                horizontalLineTo(4.155f)
                lineTo(5.156f, 1.331f)
                lineTo(5.92f, 3.737f)
                horizontalLineTo(8.173f)
                lineTo(6.591f, 5.364f)
                lineTo(7.369f, 7.66f)
                lineTo(5.156f, 6.34f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TogoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Togo,
            contentDescription = "Togo Flag"
        )
    }
}
