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
 * Cocos Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: CC
 * - ISO Alpha-3: CCK
 * - ISO Numeric: 166
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.CocosIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cocos Islands:CC:CCK:166:Large",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 7f)
                lineTo(23f, 7.732f)
                lineTo(23.134f, 6.5f)
                lineTo(22f, 6f)
                lineTo(23.134f, 5.5f)
                lineTo(23f, 4.268f)
                lineTo(24f, 5f)
                lineTo(25f, 4.268f)
                lineTo(24.866f, 5.5f)
                lineTo(26f, 6f)
                lineTo(24.866f, 6.5f)
                lineTo(25f, 7.732f)
                lineTo(24f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.963f, 13.679f)
                lineTo(21.963f, 14.411f)
                lineTo(22.097f, 13.179f)
                lineTo(20.963f, 12.679f)
                lineTo(22.097f, 12.179f)
                lineTo(21.963f, 10.947f)
                lineTo(22.963f, 11.679f)
                lineTo(23.963f, 10.947f)
                lineTo(23.829f, 12.179f)
                lineTo(24.963f, 12.679f)
                lineTo(23.829f, 13.179f)
                lineTo(23.963f, 14.411f)
                lineTo(22.963f, 13.679f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(26f, 19f)
                lineTo(25f, 19.732f)
                lineTo(25.134f, 18.5f)
                lineTo(24f, 18f)
                lineTo(25.134f, 17.5f)
                lineTo(25f, 16.268f)
                lineTo(26f, 17f)
                lineTo(27f, 16.268f)
                lineTo(26.866f, 17.5f)
                lineTo(28f, 18f)
                lineTo(26.866f, 18.5f)
                lineTo(27f, 19.732f)
                lineTo(26f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(27f, 9.5f)
                lineTo(26.5f, 9.866f)
                lineTo(26.567f, 9.25f)
                lineTo(26f, 9f)
                lineTo(26.567f, 8.75f)
                lineTo(26.5f, 8.134f)
                lineTo(27f, 8.5f)
                lineTo(27.5f, 8.134f)
                lineTo(27.433f, 8.75f)
                lineTo(28f, 9f)
                lineTo(27.433f, 9.25f)
                lineTo(27.5f, 9.866f)
                lineTo(27f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 14f)
                curveTo(9.761f, 14f, 12f, 11.761f, 12f, 9f)
                curveTo(12f, 6.239f, 9.761f, 4f, 7f, 4f)
                curveTo(4.239f, 4f, 2f, 6.239f, 2f, 9f)
                curveTo(2f, 11.761f, 4.239f, 14f, 7f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.898f, 14.945f)
                curveTo(19.24f, 16.074f, 18.194f, 16.587f, 16.794f, 16.587f)
                curveTo(14.698f, 16.587f, 13f, 14.889f, 13f, 12.794f)
                curveTo(13f, 10.698f, 14.698f, 9f, 16.794f, 9f)
                curveTo(18.392f, 9f, 19.668f, 9.559f, 20.253f, 11.083f)
                curveTo(19.789f, 10.623f, 19.073f, 10.308f, 18f, 10.348f)
                curveTo(16.343f, 10.348f, 15.265f, 11.639f, 15.265f, 12.743f)
                curveTo(15.265f, 13.848f, 16.343f, 15.349f, 18f, 15.349f)
                curveTo(18.833f, 15.337f, 19.449f, 15.185f, 19.898f, 14.945f)
                close()
            }
            path(fill = SolidColor(Color(0xFF915E2B))) {
                moveTo(7.582f, 8.694f)
                curveTo(7.582f, 8.694f, 6.605f, 12.275f, 6.201f, 12.613f)
                curveTo(6.022f, 12.692f, 7.82f, 12.613f, 7.82f, 12.613f)
                curveTo(7.82f, 12.613f, 7.146f, 12.319f, 7.383f, 11.926f)
                curveTo(7.621f, 11.534f, 7.931f, 9.01f, 7.82f, 8.15f)
                curveTo(7.709f, 7.29f, 7.582f, 8.694f, 7.582f, 8.694f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.79f, 8.827f)
                curveTo(7.79f, 8.827f, 8.839f, 9.141f, 8.839f, 9.677f)
                curveTo(8.839f, 10.213f, 9.711f, 10.966f, 9.711f, 10.253f)
                curveTo(9.711f, 9.54f, 9.548f, 8.827f, 9.193f, 8.827f)
                curveTo(8.839f, 8.827f, 9.367f, 8.347f, 9.67f, 8.745f)
                curveTo(9.973f, 9.143f, 11.036f, 8.708f, 10.82f, 8.429f)
                curveTo(10.604f, 8.149f, 9.838f, 7.801f, 9.711f, 7.801f)
                curveTo(9.584f, 7.801f, 10.583f, 7.12f, 9.711f, 7.12f)
                curveTo(8.839f, 7.12f, 9.339f, 7.702f, 8.748f, 7.085f)
                curveTo(8.157f, 6.467f, 9f, 7.386f, 9f, 6.349f)
                curveTo(9f, 5.313f, 8.76f, 4.89f, 7.971f, 5.471f)
                curveTo(7.182f, 6.053f, 7.333f, 5.684f, 7.052f, 5.465f)
                curveTo(6.771f, 5.245f, 6.524f, 6.268f, 6.834f, 6.477f)
                curveTo(7.143f, 6.685f, 7.486f, 7.203f, 7.176f, 7.203f)
                curveTo(6.867f, 7.203f, 6.649f, 6.904f, 6.649f, 6.69f)
                curveTo(6.649f, 6.477f, 5.808f, 6.099f, 5.009f, 6.099f)
                curveTo(4.21f, 6.099f, 4.727f, 6.69f, 5.009f, 6.69f)
                curveTo(5.291f, 6.69f, 6.553f, 7.12f, 5.922f, 7.12f)
                curveTo(5.291f, 7.12f, 5.971f, 6.802f, 5.175f, 6.802f)
                curveTo(4.38f, 6.802f, 3.455f, 6.44f, 3.455f, 7.12f)
                curveTo(3.455f, 7.801f, 4.25f, 8.102f, 4.498f, 7.801f)
                curveTo(4.746f, 7.499f, 5.034f, 6.991f, 5.034f, 7.499f)
                curveTo(5.034f, 8.006f, 4.401f, 7.799f, 3.455f, 8.114f)
                curveTo(2.509f, 8.429f, 2.78f, 9.258f, 3.909f, 9.056f)
                curveTo(5.037f, 8.853f, 4.915f, 8.864f, 5.368f, 8.549f)
                curveTo(5.821f, 8.235f, 6.382f, 8.322f, 5.922f, 8.827f)
                curveTo(5.462f, 9.331f, 5.002f, 10.253f, 5.462f, 10.253f)
                curveTo(5.922f, 10.253f, 6.219f, 10.378f, 6.219f, 9.891f)
                curveTo(6.219f, 9.404f, 6.486f, 8.455f, 6.486f, 9.056f)
                curveTo(6.486f, 9.657f, 6.834f, 10.109f, 7.143f, 9.891f)
                curveTo(7.452f, 9.672f, 7.071f, 8.989f, 7.424f, 8.989f)
                curveTo(7.777f, 8.989f, 7.79f, 8.827f, 7.79f, 8.827f)
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
            imageVector = FlagIcons.Large.CocosIslands,
            contentDescription = "Cocos Islands Flag"
        )
    }
}
