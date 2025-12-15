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
 * India Flag (16x12dp)
 *
 * - ISO Alpha-2: IN
 * - ISO Alpha-3: IND
 * - ISO Numeric: 356
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.India: ImageVector by lazy {
    ImageVector.Builder(
        name = "India:IN:IND:356:Small",
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
                fill = SolidColor(Color(0xFFFF8C1A)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                curveTo(6f, 7.105f, 6.895f, 8f, 8f, 8f)
                curveTo(9.105f, 8f, 10f, 7.105f, 10f, 6f)
                curveTo(10f, 4.895f, 9.105f, 4f, 8f, 4f)
                curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
                close()
                moveTo(9.5f, 6f)
                curveTo(9.5f, 6.828f, 8.828f, 7.5f, 8f, 7.5f)
                curveTo(7.172f, 7.5f, 6.5f, 6.828f, 6.5f, 6f)
                curveTo(6.5f, 5.172f, 7.172f, 4.5f, 8f, 4.5f)
                curveTo(8.828f, 4.5f, 9.5f, 5.172f, 9.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.997f, 6.43f)
                lineTo(7.58f, 7.967f)
                lineTo(7.824f, 6.394f)
                lineTo(6.818f, 7.628f)
                lineTo(7.682f, 6.29f)
                lineTo(6.26f, 7.008f)
                lineTo(7.593f, 6.137f)
                lineTo(6.003f, 6.215f)
                lineTo(7.575f, 5.961f)
                lineTo(6.09f, 5.386f)
                lineTo(7.629f, 5.793f)
                lineTo(6.507f, 4.664f)
                lineTo(7.748f, 5.662f)
                lineTo(7.181f, 4.173f)
                lineTo(7.909f, 5.59f)
                lineTo(7.997f, 4f)
                lineTo(8.086f, 5.59f)
                lineTo(8.813f, 4.173f)
                lineTo(8.247f, 5.662f)
                lineTo(9.488f, 4.664f)
                lineTo(8.365f, 5.793f)
                lineTo(9.905f, 5.386f)
                lineTo(8.42f, 5.961f)
                lineTo(9.992f, 6.215f)
                lineTo(8.401f, 6.137f)
                lineTo(9.734f, 7.008f)
                lineTo(8.313f, 6.29f)
                lineTo(9.176f, 7.628f)
                lineTo(8.17f, 6.394f)
                lineTo(8.414f, 7.967f)
                lineTo(7.997f, 6.43f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IndiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.India,
            contentDescription = "India Flag"
        )
    }
}
