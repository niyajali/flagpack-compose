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
 * Bolivia Flag (16x12dp)
 *
 * - ISO Alpha-2: BO
 * - ISO Alpha-3: BOL
 * - ISO Numeric: 068
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Bolivia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bolivia:BO:BOL:068:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFFDB501C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFDB501C)),
                strokeLineWidth = 0.75f
            ) {
                moveTo(5.824f, 5.63f)
                curveTo(5.824f, 5.63f, 5.638f, 7.535f, 7.331f, 7.535f)
                curveTo(9.023f, 7.535f, 8.592f, 7.535f, 8.592f, 7.535f)
                curveTo(8.592f, 7.535f, 10.373f, 7.418f, 10.166f, 5.63f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                stroke = SolidColor(Color(0xFF68B9E8)),
                strokeLineWidth = 0.75f
            ) {
                moveTo(9.125f, 5.9f)
                curveTo(9.125f, 6.521f, 8.621f, 7.025f, 8f, 7.025f)
                curveTo(7.379f, 7.025f, 6.875f, 6.521f, 6.875f, 5.9f)
                curveTo(6.875f, 5.279f, 7.379f, 4.775f, 8f, 4.775f)
                curveTo(8.621f, 4.775f, 9.125f, 5.279f, 9.125f, 5.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB501C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 6f)
                curveTo(8.276f, 6f, 8.5f, 5.776f, 8.5f, 5.5f)
                curveTo(8.5f, 5.224f, 8.276f, 5f, 8f, 5f)
                curveTo(7.724f, 5f, 7.5f, 5.224f, 7.5f, 5.5f)
                curveTo(7.5f, 5.776f, 7.724f, 6f, 8f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.05f, 6.8f)
                curveTo(8.519f, 6.8f, 8.9f, 6.621f, 8.9f, 6.4f)
                curveTo(8.9f, 6.179f, 8.519f, 6f, 8.05f, 6f)
                curveTo(7.581f, 6f, 7.2f, 6.179f, 7.2f, 6.4f)
                curveTo(7.2f, 6.621f, 7.581f, 6.8f, 8.05f, 6.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF674F28)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.05f, 5f)
                curveTo(8.713f, 5f, 9.25f, 4.821f, 9.25f, 4.6f)
                curveTo(9.25f, 4.379f, 8.713f, 4.2f, 8.05f, 4.2f)
                curveTo(7.387f, 4.2f, 6.85f, 4.379f, 6.85f, 4.6f)
                curveTo(6.85f, 4.821f, 7.387f, 5f, 8.05f, 5f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BoliviaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Bolivia,
            contentDescription = "Bolivia Flag"
        )
    }
}
