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
 * Mauritania Flag (16x12dp)
 *
 * - ISO Alpha-2: MR
 * - ISO Alpha-3: MRT
 * - ISO Numeric: 478
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Mauritania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mauritania:MR:MRT:478:Small",
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
                fill = SolidColor(Color(0xFF1C7B4D)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.121f, 7.189f)
                curveTo(10.714f, 7.204f, 11.444f, 5.033f, 11.444f, 5.033f)
                curveTo(11.297f, 6.89f, 10.27f, 8.15f, 8.121f, 8.15f)
                curveTo(5.972f, 8.15f, 5.183f, 6.518f, 4.798f, 4.89f)
                curveTo(4.798f, 4.89f, 5.528f, 7.175f, 8.121f, 7.189f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.819f, 4.907f)
                lineTo(8.987f, 5.889f)
                lineTo(8.105f, 5.425f)
                lineTo(7.224f, 5.889f)
                lineTo(7.392f, 4.907f)
                lineTo(6.679f, 4.14f)
                lineTo(7.664f, 4.14f)
                lineTo(8.105f, 3.175f)
                lineTo(8.546f, 4.14f)
                lineTo(9.532f, 4.14f)
                lineTo(8.819f, 4.907f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MauritaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Mauritania,
            contentDescription = "Mauritania Flag"
        )
    }
}
