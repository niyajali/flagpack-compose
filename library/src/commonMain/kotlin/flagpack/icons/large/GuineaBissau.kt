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
 * Guinea Bissau Flag (32x24dp)
 *
 * - ISO Alpha-2: GW
 * - ISO Alpha-3: GNB
 * - ISO Numeric: 624
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.GuineaBissau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guinea Bissau:GW:GNB:624:Large",
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
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 12f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.931f, 14.606f)
                lineTo(5.445f, 17.024f)
                lineTo(6.559f, 12.883f)
                lineTo(4f, 10.238f)
                lineTo(7.465f, 10.095f)
                lineTo(8.931f, 6f)
                lineTo(10.396f, 10.095f)
                horizontalLineTo(13.855f)
                lineTo(11.302f, 12.883f)
                lineTo(12.581f, 16.78f)
                lineTo(8.931f, 14.606f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuineaBissauPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.GuineaBissau,
            contentDescription = "Guinea Bissau Flag"
        )
    }
}
