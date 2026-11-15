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
 * North Macedonia Flag (20x15dp)
 *
 * - ISO Alpha-2: MK
 * - ISO Alpha-3: MKD
 * - ISO Numeric: 807
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.NorthMacedonia: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Macedonia:MK:MKD:807:Medium",
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
                fill = SolidColor(Color(0xFFF50100)),
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
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.026f)
                verticalLineTo(2.526f)
                lineTo(8.75f, 6.246f)
                lineTo(2.035f, -0.026f)
                horizontalLineTo(0f)
                close()
                moveTo(10f, 7.5f)
                lineTo(11.875f, -0f)
                horizontalLineTo(8.125f)
                lineTo(10f, 7.5f)
                close()
                moveTo(10f, 7.5f)
                lineTo(8.125f, 15f)
                horizontalLineTo(11.875f)
                lineTo(10f, 7.5f)
                close()
                moveTo(0f, 12.469f)
                verticalLineTo(15.022f)
                lineTo(2.035f, 15.022f)
                lineTo(8.75f, 8.75f)
                lineTo(0f, 12.469f)
                close()
                moveTo(20f, 2.541f)
                verticalLineTo(-0.011f)
                lineTo(17.965f, -0.011f)
                lineTo(11.25f, 6.261f)
                lineTo(20f, 2.541f)
                close()
                moveTo(20f, 15.037f)
                verticalLineTo(12.485f)
                lineTo(11.25f, 8.765f)
                lineTo(17.965f, 15.037f)
                lineTo(20f, 15.037f)
                close()
                moveTo(20f, 5.625f)
                lineTo(12.5f, 7.5f)
                lineTo(20f, 9.375f)
                verticalLineTo(5.625f)
                close()
                moveTo(7.5f, 7.5f)
                lineTo(0f, 5.625f)
                verticalLineTo(9.375f)
                lineTo(7.5f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF50100)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(10f, 10.625f)
                curveTo(11.726f, 10.625f, 13.125f, 9.226f, 13.125f, 7.5f)
                curveTo(13.125f, 5.774f, 11.726f, 4.375f, 10f, 4.375f)
                curveTo(8.274f, 4.375f, 6.875f, 5.774f, 6.875f, 7.5f)
                curveTo(6.875f, 9.226f, 8.274f, 10.625f, 10f, 10.625f)
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
            imageVector = FlagIcons.Medium.NorthMacedonia,
            contentDescription = "North Macedonia Flag"
        )
    }
}
