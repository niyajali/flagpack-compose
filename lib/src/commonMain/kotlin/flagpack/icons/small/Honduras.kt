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
 * Honduras Flag (16x12dp)
 *
 * - ISO Alpha-2: HN
 * - ISO Alpha-3: HND
 * - ISO Numeric: 340
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Honduras: ImageVector by lazy {
    ImageVector.Builder(
        name = "Honduras:HN:HND:340:Small",
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.409f, 6.566f)
                lineTo(7.821f, 6.875f)
                lineTo(7.934f, 6.22f)
                lineTo(7.458f, 5.709f)
                horizontalLineTo(8.115f)
                lineTo(8.409f, 5.066f)
                lineTo(8.703f, 5.709f)
                horizontalLineTo(9.36f)
                lineTo(8.885f, 6.22f)
                lineTo(8.997f, 6.875f)
                lineTo(8.409f, 6.566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.409f, 5.566f)
                lineTo(4.821f, 5.875f)
                lineTo(4.934f, 5.22f)
                lineTo(4.458f, 4.709f)
                horizontalLineTo(5.115f)
                lineTo(5.409f, 4.066f)
                lineTo(5.703f, 4.709f)
                horizontalLineTo(6.36f)
                lineTo(5.885f, 5.22f)
                lineTo(5.997f, 5.875f)
                lineTo(5.409f, 5.566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.409f, 7.566f)
                lineTo(4.821f, 7.875f)
                lineTo(4.934f, 7.22f)
                lineTo(4.458f, 6.709f)
                horizontalLineTo(5.115f)
                lineTo(5.409f, 6.066f)
                lineTo(5.703f, 6.709f)
                horizontalLineTo(6.36f)
                lineTo(5.885f, 7.22f)
                lineTo(5.997f, 7.875f)
                lineTo(5.409f, 7.566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.409f, 5.566f)
                lineTo(10.821f, 5.875f)
                lineTo(10.934f, 5.22f)
                lineTo(10.458f, 4.709f)
                horizontalLineTo(11.115f)
                lineTo(11.409f, 4.066f)
                lineTo(11.703f, 4.709f)
                horizontalLineTo(12.36f)
                lineTo(11.885f, 5.22f)
                lineTo(11.997f, 5.875f)
                lineTo(11.409f, 5.566f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.409f, 7.566f)
                lineTo(10.821f, 7.875f)
                lineTo(10.934f, 7.22f)
                lineTo(10.458f, 6.709f)
                horizontalLineTo(11.115f)
                lineTo(11.409f, 6.066f)
                lineTo(11.703f, 6.709f)
                horizontalLineTo(12.36f)
                lineTo(11.885f, 7.22f)
                lineTo(11.997f, 7.875f)
                lineTo(11.409f, 7.566f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HondurasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Honduras,
            contentDescription = "Honduras Flag"
        )
    }
}
