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
 * Syria Flag (16x12dp)
 *
 * - ISO Alpha-2: SY
 * - ISO Alpha-3: SYR
 * - ISO Numeric: 760
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Syria: ImageVector by lazy {
    ImageVector.Builder(
        name = "Syria:SY:SYR:760:Small",
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
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF409100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.501f, 6.935f)
                lineTo(3.566f, 7.5f)
                lineTo(3.779f, 6.398f)
                lineTo(3f, 5.573f)
                lineTo(4.055f, 5.529f)
                lineTo(4.501f, 4.5f)
                lineTo(4.947f, 5.529f)
                horizontalLineTo(6f)
                lineTo(5.223f, 6.398f)
                lineTo(5.457f, 7.5f)
                lineTo(4.501f, 6.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF409100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.501f, 6.935f)
                lineTo(10.566f, 7.5f)
                lineTo(10.779f, 6.398f)
                lineTo(10f, 5.573f)
                lineTo(11.055f, 5.529f)
                lineTo(11.501f, 4.5f)
                lineTo(11.947f, 5.529f)
                horizontalLineTo(13f)
                lineTo(12.223f, 6.398f)
                lineTo(12.457f, 7.5f)
                lineTo(11.501f, 6.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SyriaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Syria,
            contentDescription = "Syria Flag"
        )
    }
}
