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
 * Belarus Flag (16x12dp)
 *
 * - ISO Alpha-2: BY
 * - ISO Alpha-3: BLR
 * - ISO Numeric: 112
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Belarus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Belarus:BY:BLR:112:Small",
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD0181A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.5f, 0f)
                curveTo(0.776f, 0f, 1f, 0.224f, 1f, 0.5f)
                curveTo(1f, 0.776f, 0.776f, 1f, 0.5f, 1f)
                curveTo(0.224f, 1f, 0f, 0.776f, 0f, 0.5f)
                curveTo(0f, 0.224f, 0.224f, 0f, 0.5f, 0f)
                close()
                moveTo(2.5f, 0f)
                curveTo(2.776f, 0f, 3f, 0.224f, 3f, 0.5f)
                curveTo(3f, 0.776f, 2.776f, 1f, 2.5f, 1f)
                curveTo(2.224f, 1f, 2f, 0.776f, 2f, 0.5f)
                curveTo(2f, 0.224f, 2.224f, 0f, 2.5f, 0f)
                close()
                moveTo(1f, 2.5f)
                curveTo(1f, 2.224f, 0.776f, 2f, 0.5f, 2f)
                curveTo(0.224f, 2f, 0f, 2.224f, 0f, 2.5f)
                curveTo(0f, 2.776f, 0.224f, 3f, 0.5f, 3f)
                curveTo(0.776f, 3f, 1f, 2.776f, 1f, 2.5f)
                close()
                moveTo(2.5f, 2f)
                curveTo(2.776f, 2f, 3f, 2.224f, 3f, 2.5f)
                curveTo(3f, 2.776f, 2.776f, 3f, 2.5f, 3f)
                curveTo(2.224f, 3f, 2f, 2.776f, 2f, 2.5f)
                curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
                close()
                moveTo(2.5f, 9f)
                curveTo(2.776f, 9f, 3f, 9.224f, 3f, 9.5f)
                curveTo(3f, 9.776f, 2.776f, 10f, 2.5f, 10f)
                curveTo(2.224f, 10f, 2f, 9.776f, 2f, 9.5f)
                curveTo(2f, 9.224f, 2.224f, 9f, 2.5f, 9f)
                close()
                moveTo(1f, 9.5f)
                curveTo(1f, 9.224f, 0.776f, 9f, 0.5f, 9f)
                curveTo(0.224f, 9f, 0f, 9.224f, 0f, 9.5f)
                curveTo(0f, 9.776f, 0.224f, 10f, 0.5f, 10f)
                curveTo(0.776f, 10f, 1f, 9.776f, 1f, 9.5f)
                close()
                moveTo(0.5f, 11f)
                curveTo(0.776f, 11f, 1f, 11.224f, 1f, 11.5f)
                curveTo(1f, 11.776f, 0.776f, 12f, 0.5f, 12f)
                curveTo(0.224f, 12f, 0f, 11.776f, 0f, 11.5f)
                curveTo(0f, 11.224f, 0.224f, 11f, 0.5f, 11f)
                close()
                moveTo(3f, 11.5f)
                curveTo(3f, 11.224f, 2.776f, 11f, 2.5f, 11f)
                curveTo(2.224f, 11f, 2f, 11.224f, 2f, 11.5f)
                curveTo(2f, 11.776f, 2.224f, 12f, 2.5f, 12f)
                curveTo(2.776f, 12f, 3f, 11.776f, 3f, 11.5f)
                close()
                moveTo(1.5f, 10f)
                curveTo(1.776f, 10f, 2f, 10.224f, 2f, 10.5f)
                curveTo(2f, 10.776f, 1.776f, 11f, 1.5f, 11f)
                curveTo(1.224f, 11f, 1f, 10.776f, 1f, 10.5f)
                curveTo(1f, 10.224f, 1.224f, 10f, 1.5f, 10f)
                close()
                moveTo(2f, 1.5f)
                curveTo(2f, 1.224f, 1.776f, 1f, 1.5f, 1f)
                curveTo(1.224f, 1f, 1f, 1.224f, 1f, 1.5f)
                curveTo(1f, 1.776f, 1.224f, 2f, 1.5f, 2f)
                curveTo(1.776f, 2f, 2f, 1.776f, 2f, 1.5f)
                close()
                moveTo(2.055f, 6.019f)
                lineTo(3f, 7f)
                verticalLineTo(8f)
                lineTo(3.022f, 8.046f)
                lineTo(1.546f, 6.569f)
                lineTo(0.219f, 8f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                lineTo(0.991f, 6.014f)
                lineTo(0f, 5.022f)
                verticalLineTo(4f)
                horizontalLineTo(0.109f)
                lineTo(1.532f, 5.476f)
                lineTo(2.962f, 4.054f)
                lineTo(3f, 4f)
                verticalLineTo(5f)
                lineTo(2.055f, 6.019f)
                close()
                moveTo(1.5f, 3f)
                curveTo(1.776f, 3f, 2f, 3.224f, 2f, 3.5f)
                curveTo(2f, 3.776f, 1.776f, 4f, 1.5f, 4f)
                curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
                curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
                close()
                moveTo(2f, 8.5f)
                curveTo(2f, 8.224f, 1.776f, 8f, 1.5f, 8f)
                curveTo(1.224f, 8f, 1f, 8.224f, 1f, 8.5f)
                curveTo(1f, 8.776f, 1.224f, 9f, 1.5f, 9f)
                curveTo(1.776f, 9f, 2f, 8.776f, 2f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8F181A)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveTo(1f, 2f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(1f)
                verticalLineTo(2f)
                close()
                moveTo(0f, 4f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                close()
                moveTo(1f, 7f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                close()
                moveTo(0f, 9f)
                horizontalLineTo(1f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                close()
                moveTo(1f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                horizontalLineTo(1f)
                verticalLineTo(11f)
                close()
                moveTo(3f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                close()
                moveTo(3f, 0f)
                horizontalLineTo(2f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BelarusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Belarus,
            contentDescription = "Belarus Flag"
        )
    }
}
