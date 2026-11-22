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
 * Maldives Flag (16x12dp)
 *
 * - ISO Alpha-2: MV
 * - ISO Alpha-3: MDV
 * - ISO Numeric: 462
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Maldives: ImageVector by lazy {
    ImageVector.Builder(
        name = "Maldives:MV:MDV:462:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                curveTo(16f, 11.552f, 15.552f, 12f, 15f, 12f)
                horizontalLineTo(1f)
                curveTo(0.448f, 12f, 0f, 11.552f, 0f, 11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB6EB9A)),
                strokeAlpha = 0.238111f,
                strokeLineWidth = 1f
            ) {
                moveTo(3.5f, 3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3.5f, 3.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(8.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.5f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.016f, 6.231f)
                curveTo(8.008f, 7.764f, 9.215f, 8.581f, 9.215f, 8.581f)
                curveTo(7.838f, 8.743f, 6.922f, 7.495f, 6.922f, 6.246f)
                curveTo(6.922f, 4.998f, 8.17f, 3.966f, 9.215f, 3.501f)
                curveTo(9.215f, 3.501f, 8.025f, 4.698f, 8.016f, 6.231f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MaldivesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Maldives,
            contentDescription = "Maldives Flag"
        )
    }
}
