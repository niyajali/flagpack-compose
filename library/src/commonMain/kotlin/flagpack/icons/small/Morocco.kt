package flagpack.icons.small

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
 * Morocco Flag (16x12dp)
 *
 * - ISO Alpha-2: MA
 * - ISO Alpha-3: MAR
 * - ISO Numeric: 504
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Morocco: ImageVector by lazy {
    ImageVector.Builder(
        name = "Morocco:MA:MAR:504:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                curveTo(16f, 11.552f, 15.552f, 12f, 15f, 12f)
                horizontalLineTo(1f)
                curveTo(0.448f, 12f, 0f, 11.552f, 0f, 11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.241f, 9.813f)
                lineTo(8.083f, 1.35f)
                horizontalLineTo(7.946f)
                lineTo(4.898f, 9.813f)
                lineTo(8.063f, 7.911f)
                lineTo(11.241f, 9.813f)
                close()
                moveTo(7.733f, 4.111f)
                lineTo(8.072f, 2.792f)
                lineTo(8.423f, 4.149f)
                lineTo(9.433f, 6.977f)
                lineTo(10.025f, 8.346f)
                lineTo(8.746f, 7.445f)
                lineTo(8.063f, 7.036f)
                lineTo(7.39f, 7.44f)
                lineTo(6.141f, 8.346f)
                lineTo(6.718f, 6.949f)
                lineTo(7.733f, 4.111f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.331f, 6.737f)
                lineTo(8.079f, 7.899f)
                lineTo(9.71f, 6.737f)
                lineTo(12.808f, 4.118f)
                horizontalLineTo(3.193f)
                lineTo(6.331f, 6.737f)
                close()
                moveTo(6.368f, 5.737f)
                lineTo(5.179f, 5.01f)
                horizontalLineTo(6.629f)
                horizontalLineTo(9.511f)
                horizontalLineTo(10.79f)
                lineTo(9.77f, 5.656f)
                lineTo(8.072f, 6.944f)
                lineTo(6.368f, 5.737f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MoroccoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Morocco,
            contentDescription = "Morocco Flag"
        )
    }
}
