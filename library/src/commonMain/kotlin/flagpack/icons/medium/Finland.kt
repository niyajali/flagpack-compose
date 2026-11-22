package flagpack.icons.medium

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
 * Finland Flag (20x15dp)
 *
 * - ISO Alpha-2: FI
 * - ISO Alpha-3: FIN
 * - ISO Numeric: 246
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Finland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Finland:FI:FIN:246:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                stroke = SolidColor(Color(0xFF2E42A5)),
                strokeLineWidth = 1f
            ) {
                moveTo(7f, 0.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(1f)
                verticalLineTo(6.5f)
                horizontalLineTo(0f)
                horizontalLineTo(-0.5f)
                verticalLineTo(7f)
                verticalLineTo(8f)
                verticalLineTo(8.5f)
                horizontalLineTo(0f)
                horizontalLineTo(6.5f)
                verticalLineTo(15f)
                verticalLineTo(15.5f)
                horizontalLineTo(7f)
                horizontalLineTo(8f)
                horizontalLineTo(8.5f)
                verticalLineTo(15f)
                verticalLineTo(8.5f)
                horizontalLineTo(20f)
                horizontalLineTo(20.5f)
                verticalLineTo(8f)
                verticalLineTo(7f)
                verticalLineTo(6.5f)
                horizontalLineTo(20f)
                horizontalLineTo(8.5f)
                verticalLineTo(1f)
                verticalLineTo(0.5f)
                horizontalLineTo(8f)
                horizontalLineTo(7f)
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
            imageVector = FlagIcons.Medium.Finland,
            contentDescription = "Finland Flag"
        )
    }
}
