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
 * North Korea Flag (32x24dp)
 *
 * - ISO Alpha-2: KP
 * - ISO Alpha-3: PRK
 * - ISO Numeric: 408
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.NorthKorea: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Korea:KP:PRK:408:Large",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 5f)
                horizontalLineTo(-1f)
                verticalLineTo(6f)
                verticalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(18f)
                verticalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 17f)
                curveTo(12.761f, 17f, 15f, 14.761f, 15f, 12f)
                curveTo(15f, 9.239f, 12.761f, 7f, 10f, 7f)
                curveTo(7.239f, 7f, 5f, 9.239f, 5f, 12f)
                curveTo(5f, 14.761f, 7.239f, 17f, 10f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.995f, 13.87f)
                lineTo(7.279f, 15.76f)
                lineTo(8.237f, 12.592f)
                lineTo(5.6f, 10.593f)
                lineTo(8.909f, 10.526f)
                lineTo(9.995f, 7.4f)
                lineTo(11.082f, 10.526f)
                lineTo(14.39f, 10.593f)
                lineTo(11.753f, 12.592f)
                lineTo(12.711f, 15.76f)
                lineTo(9.995f, 13.87f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthKoreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.NorthKorea,
            contentDescription = "North Korea Flag"
        )
    }
}
