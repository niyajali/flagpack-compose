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
 * North Macedonia Flag (16x12dp)
 *
 * - ISO Alpha-2: MK
 * - ISO Alpha-3: MKD
 * - ISO Numeric: 807
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.NorthMacedonia: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Macedonia:MK:MKD:807:Small",
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
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.021f)
                verticalLineTo(2.021f)
                lineTo(7f, 4.997f)
                lineTo(1.628f, -0.021f)
                horizontalLineTo(0f)
                close()
                moveTo(8f, 6f)
                lineTo(9.5f, -0f)
                horizontalLineTo(6.5f)
                lineTo(8f, 6f)
                close()
                moveTo(8f, 6f)
                lineTo(6.5f, 12f)
                horizontalLineTo(9.5f)
                lineTo(8f, 6f)
                close()
                moveTo(0f, 9.976f)
                verticalLineTo(12.018f)
                horizontalLineTo(1.628f)
                lineTo(7f, 7f)
                lineTo(0f, 9.976f)
                close()
                moveTo(16f, 2.033f)
                verticalLineTo(-0.009f)
                lineTo(14.372f, -0.009f)
                lineTo(9f, 5.009f)
                lineTo(16f, 2.033f)
                close()
                moveTo(16f, 12.03f)
                verticalLineTo(9.988f)
                lineTo(9f, 7.012f)
                lineTo(14.372f, 12.03f)
                horizontalLineTo(16f)
                close()
                moveTo(16f, 4.5f)
                lineTo(10f, 6f)
                lineTo(16f, 7.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(6f, 6f)
                lineTo(0f, 4.5f)
                verticalLineTo(7.5f)
                lineTo(6f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF50100)),
                strokeLineWidth = 1f
            ) {
                moveTo(8f, 8.5f)
                curveTo(9.381f, 8.5f, 10.5f, 7.381f, 10.5f, 6f)
                curveTo(10.5f, 4.619f, 9.381f, 3.5f, 8f, 3.5f)
                curveTo(6.619f, 3.5f, 5.5f, 4.619f, 5.5f, 6f)
                curveTo(5.5f, 7.381f, 6.619f, 8.5f, 8f, 8.5f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthMacedoniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.NorthMacedonia,
            contentDescription = "North Macedonia Flag"
        )
    }
}
