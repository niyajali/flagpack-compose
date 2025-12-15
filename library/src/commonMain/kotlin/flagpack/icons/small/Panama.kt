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
 * Panama Flag (16x12dp)
 *
 * - ISO Alpha-2: PA
 * - ISO Alpha-3: PAN
 * - ISO Numeric: 591
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Panama: ImageVector by lazy {
    ImageVector.Builder(
        name = "Panama:PA:PAN:591:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                moveTo(8f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.51f, 9.575f)
                lineTo(10.359f, 10.287f)
                lineTo(10.806f, 9.091f)
                lineTo(9.828f, 8.186f)
                horizontalLineTo(11.014f)
                lineTo(11.51f, 6.892f)
                lineTo(11.889f, 8.186f)
                horizontalLineTo(13.078f)
                lineTo(12.221f, 9.091f)
                lineTo(12.64f, 10.287f)
                lineTo(11.51f, 9.575f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.51f, 4.182f)
                lineTo(3.359f, 4.895f)
                lineTo(3.806f, 3.699f)
                lineTo(2.828f, 2.794f)
                horizontalLineTo(4.015f)
                lineTo(4.51f, 1.5f)
                lineTo(4.889f, 2.794f)
                horizontalLineTo(6.078f)
                lineTo(5.221f, 3.699f)
                lineTo(5.64f, 4.895f)
                lineTo(4.51f, 4.182f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PanamaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Panama,
            contentDescription = "Panama Flag"
        )
    }
}
