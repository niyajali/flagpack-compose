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
 * Canada Flag (20x15dp)
 *
 * - ISO Alpha-2: CA
 * - ISO Alpha-3: CAN
 * - ISO Numeric: 124
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Canada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Canada:CA:CAN:124:Medium",
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
                moveTo(5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.956f, 5.252f)
                lineTo(9.983f, 3.75f)
                lineTo(10f, 12.5f)
                horizontalLineTo(9.572f)
                lineTo(9.835f, 10.335f)
                curveTo(9.835f, 10.335f, 6.952f, 10.864f, 7.191f, 10.597f)
                curveTo(7.429f, 10.33f, 7.566f, 9.84f, 7.566f, 9.84f)
                lineTo(5f, 8.092f)
                curveTo(5f, 8.092f, 5.405f, 8.087f, 5.734f, 7.887f)
                curveTo(6.063f, 7.687f, 5.405f, 6.502f, 5.405f, 6.502f)
                lineTo(6.7f, 6.694f)
                lineTo(7.191f, 6.15f)
                lineTo(8.168f, 7.195f)
                horizontalLineTo(8.607f)
                lineTo(8.168f, 4.802f)
                lineTo(8.956f, 5.252f)
                close()
                moveTo(10f, 12.5f)
                verticalLineTo(3.75f)
                lineTo(11.044f, 5.252f)
                lineTo(11.832f, 4.802f)
                lineTo(11.393f, 7.195f)
                horizontalLineTo(11.832f)
                lineTo(12.809f, 6.15f)
                lineTo(13.3f, 6.694f)
                lineTo(14.595f, 6.502f)
                curveTo(14.595f, 6.502f, 13.937f, 7.687f, 14.266f, 7.887f)
                curveTo(14.595f, 8.087f, 15f, 8.092f, 15f, 8.092f)
                lineTo(12.434f, 9.84f)
                curveTo(12.434f, 9.84f, 12.571f, 10.33f, 12.809f, 10.597f)
                curveTo(13.048f, 10.864f, 10.165f, 10.335f, 10.165f, 10.335f)
                lineTo(10.428f, 12.5f)
                horizontalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CanadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Canada,
            contentDescription = "Canada Flag"
        )
    }
}
