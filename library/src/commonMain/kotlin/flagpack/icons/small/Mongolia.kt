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
 * Mongolia Flag (16x12dp)
 *
 * - ISO Alpha-2: MN
 * - ISO Alpha-3: MNG
 * - ISO Numeric: 496
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Mongolia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mongolia:MN:MNG:496:Small",
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
                fill = SolidColor(Color(0xFF4C67E8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF8D000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.007f, 3.442f)
                curveTo(2.5f, 3.442f, 2.567f, 2.948f, 2.567f, 2.948f)
                lineTo(2.807f, 2.43f)
                verticalLineTo(2.639f)
                verticalLineTo(2.948f)
                curveTo(2.807f, 3.015f, 2.898f, 2.882f, 2.898f, 2.721f)
                curveTo(2.898f, 2.56f, 3.007f, 2.32f, 3.007f, 2.32f)
                curveTo(3.007f, 2.32f, 3.011f, 2.239f, 3.014f, 2.16f)
                curveTo(3.032f, 2.201f, 3.067f, 2.236f, 3.12f, 2.29f)
                curveTo(3.129f, 2.299f, 3.139f, 2.309f, 3.149f, 2.32f)
                curveTo(3.212f, 2.384f, 3.203f, 2.554f, 3.196f, 2.701f)
                curveTo(3.189f, 2.834f, 3.184f, 2.948f, 3.233f, 2.948f)
                curveTo(3.335f, 2.948f, 3.328f, 2.489f, 3.328f, 2.489f)
                lineTo(3.5f, 2.948f)
                curveTo(3.5f, 2.948f, 3.514f, 3.442f, 3.007f, 3.442f)
                close()
                moveTo(3.007f, 2.032f)
                curveTo(3.02f, 1.957f, 3.018f, 2.058f, 3.014f, 2.16f)
                curveTo(3f, 2.126f, 2.997f, 2.088f, 3.007f, 2.032f)
                close()
                moveTo(3.769f, 4.342f)
                curveTo(3.769f, 4.743f, 3.433f, 5.069f, 3.019f, 5.069f)
                curveTo(2.605f, 5.069f, 2.269f, 4.743f, 2.269f, 4.342f)
                curveTo(2.269f, 3.941f, 2.605f, 3.615f, 3.019f, 3.615f)
                curveTo(3.433f, 3.615f, 3.769f, 3.941f, 3.769f, 4.342f)
                close()
                moveTo(1.885f, 5.702f)
                horizontalLineTo(1f)
                verticalLineTo(9.988f)
                horizontalLineTo(1.885f)
                verticalLineTo(5.702f)
                close()
                moveTo(5f, 5.702f)
                horizontalLineTo(4.115f)
                verticalLineTo(9.988f)
                horizontalLineTo(5f)
                verticalLineTo(5.702f)
                close()
                moveTo(2.115f, 5.739f)
                lineTo(2.978f, 6.273f)
                lineTo(3.95f, 5.739f)
                horizontalLineTo(2.115f)
                close()
                moveTo(2.978f, 10f)
                lineTo(2.115f, 9.466f)
                horizontalLineTo(3.95f)
                lineTo(2.978f, 10f)
                close()
                moveTo(2.115f, 6.447f)
                horizontalLineTo(3.923f)
                verticalLineTo(6.783f)
                horizontalLineTo(2.115f)
                verticalLineTo(6.447f)
                close()
                moveTo(3.923f, 8.944f)
                horizontalLineTo(2.115f)
                verticalLineTo(9.28f)
                horizontalLineTo(3.923f)
                verticalLineTo(8.944f)
                close()
                moveTo(3.038f, 8.758f)
                curveTo(3.548f, 8.758f, 3.962f, 8.358f, 3.962f, 7.864f)
                curveTo(3.962f, 7.37f, 3.548f, 6.969f, 3.038f, 6.969f)
                curveTo(2.529f, 6.969f, 2.115f, 7.37f, 2.115f, 7.864f)
                curveTo(2.115f, 8.358f, 2.529f, 8.758f, 3.038f, 8.758f)
                close()
                moveTo(2.002f, 4.608f)
                curveTo(2.002f, 4.608f, 2.033f, 5.542f, 2.953f, 5.542f)
                curveTo(3.873f, 5.542f, 4.022f, 4.608f, 4.022f, 4.608f)
                curveTo(4.022f, 4.608f, 3.666f, 5.18f, 3.012f, 5.18f)
                curveTo(2.358f, 5.18f, 2.002f, 4.608f, 2.002f, 4.608f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MongoliaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Mongolia,
            contentDescription = "Mongolia Flag"
        )
    }
}
