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
 * Panama Flag (20x15dp)
 *
 * - ISO Alpha-2: PA
 * - ISO Alpha-3: PAN
 * - ISO Numeric: 591
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Panama: ImageVector by lazy {
    ImageVector.Builder(
        name = "Panama:PA:PAN:591:Medium",
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
                moveTo(10f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.388f, 11.969f)
                lineTo(12.949f, 12.859f)
                lineTo(13.508f, 11.364f)
                lineTo(12.285f, 10.233f)
                horizontalLineTo(13.768f)
                lineTo(14.388f, 8.616f)
                lineTo(14.861f, 10.233f)
                horizontalLineTo(16.347f)
                lineTo(15.276f, 11.364f)
                lineTo(15.8f, 12.859f)
                lineTo(14.388f, 11.969f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.638f, 5.228f)
                lineTo(4.199f, 6.118f)
                lineTo(4.758f, 4.624f)
                lineTo(3.535f, 3.492f)
                horizontalLineTo(5.018f)
                lineTo(5.638f, 1.875f)
                lineTo(6.111f, 3.492f)
                horizontalLineTo(7.597f)
                lineTo(6.526f, 4.624f)
                lineTo(7.05f, 6.118f)
                lineTo(5.638f, 5.228f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PanamaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Panama,
            contentDescription = "Panama Flag"
        )
    }
}
