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
 * Palestine Flag (32x24dp)
 *
 * - ISO Alpha-2: PS
 * - ISO Alpha-3: PSE
 * - ISO Numeric: 275
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Palestine: ImageVector by lazy {
    ImageVector.Builder(
        name = "Palestine:PS:PSE:275:Large",
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
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(-8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                lineToRelative(16f, 10f)
                lineTo(0f, 22f)
                verticalLineTo(2f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PalestinePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Palestine,
            contentDescription = "Palestine Flag"
        )
    }
}
