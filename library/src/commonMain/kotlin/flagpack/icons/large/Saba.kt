package flagpack.icons.large

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
 * Saba Flag (32x24dp)
 *
 * - ISO Alpha-2: BQ-SA
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Saba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saba:BQ-SA:::Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.664f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                lineTo(0f, 11.664f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 11.664f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                lineTo(32f, 11.664f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.664f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                lineTo(0f, 11.664f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 11.664f)
                verticalLineTo(24.336f)
                lineTo(16f, 24f)
                lineTo(32f, 11.664f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.714f, 14.256f)
                lineTo(12.196f, 16.763f)
                lineTo(13.487f, 12.622f)
                lineTo(10f, 10.087f)
                horizontalLineTo(14.345f)
                lineTo(15.714f, 6f)
                lineTo(17.166f, 10.087f)
                horizontalLineTo(21.392f)
                lineTo(17.935f, 12.622f)
                lineTo(19.249f, 16.763f)
                lineTo(15.714f, 14.256f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SabaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Saba,
            contentDescription = "Saba Flag"
        )
    }
}
