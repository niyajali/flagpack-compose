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
 * Antigua and Barbuda Flag (32x24dp)
 *
 * - ISO Alpha-2: AG
 * - ISO Alpha-3: ATG
 * - ISO Numeric: 028
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.AntiguaAndBarbuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antigua and Barbuda:AG:ATG:028:Large",
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
                fill = SolidColor(Color(0xFF1B1B1B)),
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
                fill = SolidColor(Color(0xFFF9D313)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 14f)
                lineTo(13.997f, 17.799f)
                lineTo(14.047f, 13.604f)
                lineTo(10.389f, 16.255f)
                lineTo(12.482f, 12.494f)
                lineTo(7.891f, 13.471f)
                lineTo(11.613f, 10.89f)
                lineTo(7f, 10f)
                lineTo(11.613f, 9.11f)
                lineTo(7.891f, 6.529f)
                lineTo(12.482f, 7.506f)
                lineTo(10.389f, 3.745f)
                lineTo(14.047f, 6.396f)
                lineTo(13.997f, 2.201f)
                lineTo(16f, 6f)
                lineTo(18.003f, 2.201f)
                lineTo(17.952f, 6.396f)
                lineTo(21.611f, 3.745f)
                lineTo(19.518f, 7.506f)
                lineTo(24.109f, 6.529f)
                lineTo(20.387f, 9.11f)
                lineTo(25f, 10f)
                lineTo(20.387f, 10.89f)
                lineTo(24.109f, 13.471f)
                lineTo(19.518f, 12.494f)
                lineTo(21.611f, 16.255f)
                lineTo(17.952f, 13.604f)
                lineTo(18.003f, 17.799f)
                lineTo(16f, 14f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(6f, 14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4A80E8))) {
                moveTo(2f, 10f)
                horizontalLineToRelative(28f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-28f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                lineTo(16f, 24f)
                lineTo(32f, 6f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AntiguaAndBarbudaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.AntiguaAndBarbuda,
            contentDescription = "Antigua and Barbuda Flag"
        )
    }
}
