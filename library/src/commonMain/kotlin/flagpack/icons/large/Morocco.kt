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
 * Morocco Flag (32x24dp)
 *
 * - ISO Alpha-2: MA
 * - ISO Alpha-3: MAR
 * - ISO Numeric: 504
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Morocco: ImageVector by lazy {
    ImageVector.Builder(
        name = "Morocco:MA:MAR:504:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(22f)
                curveTo(32f, 23.105f, 31.105f, 24f, 30f, 24f)
                horizontalLineTo(2f)
                curveTo(0.895f, 24f, 0f, 23.105f, 0f, 22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.482f, 19.626f)
                lineTo(16.166f, 2.701f)
                horizontalLineTo(15.892f)
                lineTo(9.795f, 19.626f)
                lineTo(16.126f, 15.821f)
                lineTo(22.482f, 19.626f)
                close()
                moveTo(15.467f, 8.222f)
                lineTo(16.144f, 5.584f)
                lineTo(16.846f, 8.298f)
                lineTo(18.865f, 13.954f)
                lineTo(20.05f, 16.693f)
                lineTo(17.492f, 14.89f)
                lineTo(16.125f, 14.072f)
                lineTo(14.781f, 14.88f)
                lineTo(12.281f, 16.693f)
                lineTo(13.437f, 13.898f)
                lineTo(15.467f, 8.222f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.663f, 13.473f)
                lineTo(16.159f, 15.797f)
                lineTo(19.421f, 13.473f)
                lineTo(25.616f, 8.236f)
                horizontalLineTo(6.385f)
                lineTo(12.663f, 13.473f)
                close()
                moveTo(12.735f, 11.474f)
                lineTo(10.358f, 10.019f)
                horizontalLineTo(13.258f)
                horizontalLineTo(19.022f)
                horizontalLineTo(21.581f)
                lineTo(19.54f, 11.312f)
                lineTo(16.143f, 13.889f)
                lineTo(12.735f, 11.474f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MoroccoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Morocco,
            contentDescription = "Morocco Flag"
        )
    }
}
