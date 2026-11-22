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
 * Suriname Flag (20x15dp)
 *
 * - ISO Alpha-2: SR
 * - ISO Alpha-3: SUR
 * - ISO Numeric: 740
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Suriname: ImageVector by lazy {
    ImageVector.Builder(
        name = "Suriname:SR:SUR:740:Medium",
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
                fill = SolidColor(Color(0xFF4E8B1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4E8B1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(3.75f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1.875f
            ) {
                moveTo(0f, 4.063f)
                horizontalLineTo(-0.938f)
                verticalLineTo(5f)
                verticalLineTo(10f)
                verticalLineTo(10.938f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.938f)
                verticalLineTo(10f)
                verticalLineTo(5f)
                verticalLineTo(4.063f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.002f, 9.059f)
                lineTo(8.443f, 10f)
                lineTo(8.798f, 8.164f)
                lineTo(7.5f, 6.789f)
                lineTo(9.258f, 6.715f)
                lineTo(10.002f, 5f)
                lineTo(10.745f, 6.715f)
                horizontalLineTo(12.5f)
                lineTo(11.205f, 8.164f)
                lineTo(11.595f, 10f)
                lineTo(10.002f, 9.059f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SurinamePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Suriname,
            contentDescription = "Suriname Flag"
        )
    }
}
