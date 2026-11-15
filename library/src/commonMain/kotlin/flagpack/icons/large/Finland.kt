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
 * Finland Flag (32x24dp)
 *
 * - ISO Alpha-2: FI
 * - ISO Alpha-3: FIN
 * - ISO Numeric: 246
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Finland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Finland:FI:FIN:246:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                stroke = SolidColor(Color(0xFF2E42A5)),
                strokeLineWidth = 2f
            ) {
                moveTo(10.818f, 1f)
                horizontalLineTo(9.818f)
                verticalLineTo(2f)
                verticalLineTo(10.323f)
                horizontalLineTo(0f)
                horizontalLineTo(-1f)
                verticalLineTo(11.323f)
                verticalLineTo(13.323f)
                verticalLineTo(14.323f)
                horizontalLineTo(0f)
                horizontalLineTo(9.818f)
                verticalLineTo(24f)
                verticalLineTo(25f)
                horizontalLineTo(10.818f)
                horizontalLineTo(12.818f)
                horizontalLineTo(13.818f)
                verticalLineTo(24f)
                verticalLineTo(14.323f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(13.323f)
                verticalLineTo(11.323f)
                verticalLineTo(10.323f)
                horizontalLineTo(32f)
                horizontalLineTo(13.818f)
                verticalLineTo(2f)
                verticalLineTo(1f)
                horizontalLineTo(12.818f)
                horizontalLineTo(10.818f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FinlandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Finland,
            contentDescription = "Finland Flag"
        )
    }
}
