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
 * Guernsey Flag (20x15dp)
 *
 * - ISO Alpha-2: GG
 * - ISO Alpha-3: GGY
 * - ISO Numeric: 831
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Guernsey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guernsey:GG:GGY:831:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 0f)
                horizontalLineTo(12.5f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(12.5f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(7.5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.128f, 1.904f)
                lineTo(8.75f, 3f)
                verticalLineTo(6.25f)
                horizontalLineTo(4.291f)
                verticalLineTo(6.214f)
                lineTo(3.191f, 5.591f)
                verticalLineTo(9.316f)
                lineTo(4.232f, 8.75f)
                horizontalLineTo(8.75f)
                verticalLineTo(11.907f)
                lineTo(8.128f, 13.003f)
                horizontalLineTo(11.854f)
                lineTo(11.255f, 11.904f)
                horizontalLineTo(11.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(15.75f)
                lineTo(16.791f, 9.316f)
                verticalLineTo(5.591f)
                lineTo(15.691f, 6.214f)
                verticalLineTo(6.25f)
                horizontalLineTo(11.25f)
                verticalLineTo(3.003f)
                horizontalLineTo(11.255f)
                lineTo(11.854f, 1.904f)
                horizontalLineTo(8.128f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuernseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Guernsey,
            contentDescription = "Guernsey Flag"
        )
    }
}
