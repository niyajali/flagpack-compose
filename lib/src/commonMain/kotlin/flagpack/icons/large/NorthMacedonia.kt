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
 * North Macedonia Flag (32x24dp)
 *
 * - ISO Alpha-2: MK
 * - ISO Alpha-3: MKD
 * - ISO Numeric: 807
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.NorthMacedonia: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Macedonia:MK:MKD:807:Large",
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
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -0.042f)
                verticalLineTo(4.042f)
                lineTo(14f, 9.993f)
                lineTo(3.255f, -0.042f)
                horizontalLineTo(0f)
                close()
                moveTo(16f, 12f)
                lineTo(19f, -0f)
                horizontalLineTo(13f)
                lineTo(16f, 12f)
                close()
                moveTo(16f, 12f)
                lineTo(13f, 24f)
                horizontalLineTo(19f)
                lineTo(16f, 12f)
                close()
                moveTo(0f, 19.951f)
                verticalLineTo(24.035f)
                horizontalLineTo(3.255f)
                lineTo(14f, 14f)
                lineTo(0f, 19.951f)
                close()
                moveTo(32f, 4.066f)
                verticalLineTo(-0.018f)
                lineTo(28.745f, -0.018f)
                lineTo(18f, 10.018f)
                lineTo(32f, 4.066f)
                close()
                moveTo(32f, 24.059f)
                verticalLineTo(19.976f)
                lineTo(18f, 14.024f)
                lineTo(28.745f, 24.059f)
                horizontalLineTo(32f)
                close()
                moveTo(32f, 9f)
                lineTo(20f, 12f)
                lineTo(32f, 15f)
                verticalLineTo(9f)
                close()
                moveTo(12f, 12f)
                lineTo(0f, 9f)
                verticalLineTo(15f)
                lineTo(12f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF50100)),
                strokeLineWidth = 2f
            ) {
                moveTo(16f, 17f)
                curveTo(18.761f, 17f, 21f, 14.761f, 21f, 12f)
                curveTo(21f, 9.239f, 18.761f, 7f, 16f, 7f)
                curveTo(13.239f, 7f, 11f, 9.239f, 11f, 12f)
                curveTo(11f, 14.761f, 13.239f, 17f, 16f, 17f)
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
            imageVector = FlagIcons.Large.NorthMacedonia,
            contentDescription = "North Macedonia Flag"
        )
    }
}
