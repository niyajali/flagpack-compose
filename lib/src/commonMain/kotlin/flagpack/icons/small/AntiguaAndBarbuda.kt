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
 * Antigua and Barbuda Flag (16x12dp)
 *
 * - ISO Alpha-2: AG
 * - ISO Alpha-3: ATG
 * - ISO Numeric: 028
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.AntiguaAndBarbuda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antigua and Barbuda:AG:ATG:028:Small",
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
                fill = SolidColor(Color(0xFF1B1B1B)),
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
                fill = SolidColor(Color(0xFFF9D313)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 7f)
                lineTo(6.887f, 8.9f)
                lineTo(6.915f, 6.802f)
                lineTo(4.883f, 8.127f)
                lineTo(6.045f, 6.247f)
                lineTo(3.495f, 6.736f)
                lineTo(5.563f, 5.445f)
                lineTo(3f, 5f)
                lineTo(5.563f, 4.555f)
                lineTo(3.495f, 3.264f)
                lineTo(6.045f, 3.753f)
                lineTo(4.883f, 1.873f)
                lineTo(6.915f, 3.198f)
                lineTo(6.887f, 1.1f)
                lineTo(8f, 3f)
                lineTo(9.113f, 1.1f)
                lineTo(9.085f, 3.198f)
                lineTo(11.117f, 1.873f)
                lineTo(9.955f, 3.753f)
                lineTo(12.505f, 3.264f)
                lineTo(10.437f, 4.555f)
                lineTo(13f, 5f)
                lineTo(10.437f, 5.445f)
                lineTo(12.505f, 6.736f)
                lineTo(9.955f, 6.247f)
                lineTo(11.117f, 8.127f)
                lineTo(9.085f, 6.802f)
                lineTo(9.113f, 8.9f)
                lineTo(8f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(3f, 7f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4A80E8))) {
                moveTo(1f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                lineTo(8f, 12f)
                lineTo(16f, 3f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
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
            imageVector = FlagIcons.Small.AntiguaAndBarbuda,
            contentDescription = "Antigua and Barbuda Flag"
        )
    }
}
