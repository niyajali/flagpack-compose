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
 * Congo Flag (32x24dp)
 *
 * - ISO Alpha-2: CG
 * - ISO Alpha-3: COG
 * - ISO Numeric: 178
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Congo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Congo:CG:COG:178:Large",
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
                fill = SolidColor(Color(0xFFFA1111)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                lineTo(32f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF07A907)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 24f)
                verticalLineTo(0f)
                horizontalLineTo(32f)
                lineTo(0f, 24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(29.492f, -5.8f)
                lineTo(-1f, 23.576f)
                lineTo(5.052f, 26.588f)
                lineTo(34.641f, -0.212f)
                lineTo(29.492f, -5.8f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(29.492f, -5.8f)
                lineTo(-1f, 23.576f)
                lineTo(5.052f, 26.588f)
                lineTo(34.641f, -0.212f)
                lineTo(29.492f, -5.8f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun CongoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Congo,
            contentDescription = "Congo Flag"
        )
    }
}
