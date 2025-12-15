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
 * Cocos Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: CC
 * - ISO Alpha-3: CCK
 * - ISO Numeric: 166
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.CocosIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cocos Islands:CC:CCK:166:Small",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 3.5f)
                lineTo(11.5f, 3.866f)
                lineTo(11.567f, 3.25f)
                lineTo(11f, 3f)
                lineTo(11.567f, 2.75f)
                lineTo(11.5f, 2.134f)
                lineTo(12f, 2.5f)
                lineTo(12.5f, 2.134f)
                lineTo(12.433f, 2.75f)
                lineTo(13f, 3f)
                lineTo(12.433f, 3.25f)
                lineTo(12.5f, 3.866f)
                lineTo(12f, 3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.481f, 6.839f)
                lineTo(10.981f, 7.205f)
                lineTo(11.048f, 6.589f)
                lineTo(10.481f, 6.339f)
                lineTo(11.048f, 6.089f)
                lineTo(10.981f, 5.473f)
                lineTo(11.481f, 5.839f)
                lineTo(11.981f, 5.473f)
                lineTo(11.915f, 6.089f)
                lineTo(12.481f, 6.339f)
                lineTo(11.915f, 6.589f)
                lineTo(11.981f, 7.205f)
                lineTo(11.481f, 6.839f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 9.5f)
                lineTo(12.5f, 9.866f)
                lineTo(12.567f, 9.25f)
                lineTo(12f, 9f)
                lineTo(12.567f, 8.75f)
                lineTo(12.5f, 8.134f)
                lineTo(13f, 8.5f)
                lineTo(13.5f, 8.134f)
                lineTo(13.433f, 8.75f)
                lineTo(14f, 9f)
                lineTo(13.433f, 9.25f)
                lineTo(13.5f, 9.866f)
                lineTo(13f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.5f, 4.75f)
                lineTo(13.25f, 4.933f)
                lineTo(13.283f, 4.625f)
                lineTo(13f, 4.5f)
                lineTo(13.283f, 4.375f)
                lineTo(13.25f, 4.067f)
                lineTo(13.5f, 4.25f)
                lineTo(13.75f, 4.067f)
                lineTo(13.717f, 4.375f)
                lineTo(14f, 4.5f)
                lineTo(13.717f, 4.625f)
                lineTo(13.75f, 4.933f)
                lineTo(13.5f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 7f)
                curveTo(4.881f, 7f, 6f, 5.881f, 6f, 4.5f)
                curveTo(6f, 3.119f, 4.881f, 2f, 3.5f, 2f)
                curveTo(2.119f, 2f, 1f, 3.119f, 1f, 4.5f)
                curveTo(1f, 5.881f, 2.119f, 7f, 3.5f, 7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF915E2B))) {
                moveTo(3.245f, 5.994f)
                lineTo(3.065f, 5.867f)
                curveTo(3.462f, 5.347f, 3.357f, 4.621f, 3.245f, 4.143f)
                lineTo(3.975f, 3.971f)
                curveTo(4.142f, 4.683f, 3.77f, 5.305f, 3.245f, 5.994f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.949f, 7.472f)
                curveTo(9.62f, 8.037f, 9.097f, 8.294f, 8.397f, 8.294f)
                curveTo(7.349f, 8.294f, 6.5f, 7.444f, 6.5f, 6.397f)
                curveTo(6.5f, 5.349f, 7.349f, 4.5f, 8.397f, 4.5f)
                curveTo(9.196f, 4.5f, 9.834f, 4.78f, 10.126f, 5.541f)
                curveTo(9.895f, 5.312f, 9.536f, 5.154f, 9f, 5.174f)
                curveTo(8.172f, 5.174f, 7.633f, 5.819f, 7.633f, 6.372f)
                curveTo(7.633f, 6.924f, 8.172f, 7.675f, 9f, 7.675f)
                curveTo(9.417f, 7.669f, 9.724f, 7.592f, 9.949f, 7.472f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 4.37f)
                curveTo(4.328f, 4.37f, 4.857f, 4.146f, 4.857f, 3.87f)
                curveTo(4.857f, 3.594f, 4.328f, 3.37f, 3.5f, 3.37f)
                curveTo(2.672f, 3.37f, 2.242f, 3.594f, 2.242f, 3.87f)
                curveTo(2.242f, 4.146f, 2.672f, 4.37f, 3.5f, 4.37f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CocosIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.CocosIslands,
            contentDescription = "Cocos Islands Flag"
        )
    }
}
