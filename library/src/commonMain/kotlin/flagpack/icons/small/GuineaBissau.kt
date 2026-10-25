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
 * Guinea Bissau Flag (16x12dp)
 *
 * - ISO Alpha-2: GW
 * - ISO Alpha-3: GNB
 * - ISO Numeric: 624
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.GuineaBissau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guinea Bissau:GW:GNB:624:Small",
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
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.465f, 7.303f)
                lineTo(2.723f, 8.512f)
                lineTo(3.279f, 6.442f)
                lineTo(2f, 5.119f)
                lineTo(3.732f, 5.047f)
                lineTo(4.465f, 3f)
                lineTo(5.198f, 5.047f)
                horizontalLineTo(6.928f)
                lineTo(5.651f, 6.442f)
                lineTo(6.291f, 8.39f)
                lineTo(4.465f, 7.303f)
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
            imageVector = FlagIcons.Small.GuineaBissau,
            contentDescription = "Guinea Bissau Flag"
        )
    }
}
