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
 * Pakistan Flag (20x15dp)
 *
 * - ISO Alpha-2: PK
 * - ISO Alpha-3: PAK
 * - ISO Numeric: 586
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Pakistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Pakistan:PK:PAK:586:Medium",
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
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.018f, 9.566f)
                curveTo(14.018f, 9.566f, 11.227f, 10.294f, 9.012f, 8.81f)
                curveTo(6.796f, 7.325f, 7.91f, 3.905f, 7.91f, 3.905f)
                curveTo(6.755f, 4.073f, 4.94f, 8.289f, 7.865f, 10.404f)
                curveTo(10.79f, 12.519f, 13.593f, 10.486f, 14.018f, 9.566f)
                close()
                moveTo(10.921f, 5.542f)
                lineTo(9.439f, 6.266f)
                lineTo(11.003f, 6.545f)
                lineTo(11.214f, 8.073f)
                lineTo(12.099f, 6.772f)
                lineTo(13.842f, 6.889f)
                lineTo(12.477f, 5.871f)
                lineTo(13.204f, 4.511f)
                lineTo(11.845f, 5.133f)
                lineTo(10.835f, 4.184f)
                lineTo(10.921f, 5.542f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PakistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Pakistan,
            contentDescription = "Pakistan Flag"
        )
    }
}
