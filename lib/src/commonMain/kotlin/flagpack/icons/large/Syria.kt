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
 * Syria Flag (32x24dp)
 *
 * - ISO Alpha-2: SY
 * - ISO Alpha-3: SYR
 * - ISO Numeric: 760
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Syria: ImageVector by lazy {
    ImageVector.Builder(
        name = "Syria:SY:SYR:760:Large",
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
                fill = SolidColor(Color(0xFF409100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.001f, 13.247f)
                lineTo(7.754f, 14f)
                lineTo(8.039f, 12.531f)
                lineTo(7f, 11.431f)
                lineTo(8.406f, 11.372f)
                lineTo(9.001f, 10f)
                lineTo(9.596f, 11.372f)
                horizontalLineTo(11f)
                lineTo(9.964f, 12.531f)
                lineTo(10.276f, 14f)
                lineTo(9.001f, 13.247f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF409100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(23.001f, 13.247f)
                lineTo(21.754f, 14f)
                lineTo(22.038f, 12.531f)
                lineTo(21f, 11.431f)
                lineTo(22.406f, 11.372f)
                lineTo(23.001f, 10f)
                lineTo(23.596f, 11.372f)
                horizontalLineTo(25f)
                lineTo(23.964f, 12.531f)
                lineTo(24.276f, 14f)
                lineTo(23.001f, 13.247f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
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
            imageVector = FlagIcons.Large.Syria,
            contentDescription = "Syria Flag"
        )
    }
}
