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
 * Greece Flag (32x24dp)
 *
 * - ISO Alpha-2: GR
 * - ISO Alpha-3: GRC
 * - ISO Numeric: 300
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Greece: ImageVector by lazy {
    ImageVector.Builder(
        name = "Greece:GR:GRC:300:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5.5f)
                horizontalLineTo(32f)
                verticalLineTo(8.457f)
                horizontalLineTo(0f)
                verticalLineTo(5.5f)
                close()
                moveTo(0f, 10.815f)
                horizontalLineTo(32f)
                verticalLineTo(13.772f)
                horizontalLineTo(0f)
                verticalLineTo(10.815f)
                close()
                moveTo(32f, 15.943f)
                horizontalLineTo(0f)
                verticalLineTo(18.9f)
                horizontalLineTo(32f)
                verticalLineTo(15.943f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0f, 21f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(13.8f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(5.504f)
                horizontalLineTo(15f)
                verticalLineTo(8.439f)
                horizontalLineTo(9f)
                verticalLineTo(14.5f)
                horizontalLineTo(6f)
                verticalLineTo(8.439f)
                horizontalLineTo(0f)
                verticalLineTo(5.504f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GreecePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Greece,
            contentDescription = "Greece Flag"
        )
    }
}
