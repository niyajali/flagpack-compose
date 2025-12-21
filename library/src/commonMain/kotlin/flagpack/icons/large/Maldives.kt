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
 * Maldives Flag (32x24dp)
 *
 * - ISO Alpha-2: MV
 * - ISO Alpha-3: MDV
 * - ISO Numeric: 462
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Maldives: ImageVector by lazy {
    ImageVector.Builder(
        name = "Maldives:MV:MDV:462:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                moveTo(6f, 6f)
                horizontalLineTo(26f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB6EB9A)),
                strokeAlpha = 0.238111f,
                strokeLineWidth = 2f
            ) {
                moveTo(7f, 7f)
                horizontalLineTo(25f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7f, 7f)
                horizontalLineTo(25f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
                moveTo(6f, 6f)
                horizontalLineTo(26f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.033f, 12.462f)
                curveTo(16.016f, 15.528f, 18.429f, 17.163f, 18.429f, 17.163f)
                curveTo(15.675f, 17.486f, 13.843f, 14.99f, 13.843f, 12.492f)
                curveTo(13.843f, 9.995f, 16.341f, 7.932f, 18.429f, 7.001f)
                curveTo(18.429f, 7.001f, 16.05f, 9.397f, 16.033f, 12.462f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MaldivesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Maldives,
            contentDescription = "Maldives Flag"
        )
    }
}
