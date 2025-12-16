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
 * Christmas Island Flag (20x15dp)
 *
 * - ISO Alpha-2: CX
 * - ISO Alpha-3: CXR
 * - ISO Numeric: 162
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.ChristmasIsland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Christmas Island:CX:CXR:162:Medium",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4141DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(20f, 15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 5.625f)
                lineTo(3.125f, 6.083f)
                lineTo(3.209f, 5.313f)
                lineTo(2.5f, 5f)
                lineTo(3.209f, 4.688f)
                lineTo(3.125f, 3.917f)
                lineTo(3.75f, 4.375f)
                lineTo(4.375f, 3.917f)
                lineTo(4.291f, 4.688f)
                lineTo(5f, 5f)
                lineTo(4.291f, 5.313f)
                lineTo(4.375f, 6.083f)
                lineTo(3.75f, 5.625f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.5f, 9.375f)
                lineTo(1.875f, 9.833f)
                lineTo(1.959f, 9.063f)
                lineTo(1.25f, 8.75f)
                lineTo(1.959f, 8.438f)
                lineTo(1.875f, 7.667f)
                lineTo(2.5f, 8.125f)
                lineTo(3.125f, 7.667f)
                lineTo(3.041f, 8.438f)
                lineTo(3.75f, 8.75f)
                lineTo(3.041f, 9.063f)
                lineTo(3.125f, 9.833f)
                lineTo(2.5f, 9.375f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 13.125f)
                lineTo(4.375f, 13.583f)
                lineTo(4.459f, 12.813f)
                lineTo(3.75f, 12.5f)
                lineTo(4.459f, 12.188f)
                lineTo(4.375f, 11.417f)
                lineTo(5f, 11.875f)
                lineTo(5.625f, 11.417f)
                lineTo(5.541f, 12.188f)
                lineTo(6.25f, 12.5f)
                lineTo(5.541f, 12.813f)
                lineTo(5.625f, 13.583f)
                lineTo(5f, 13.125f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.625f, 7.188f)
                lineTo(5.313f, 7.416f)
                lineTo(5.354f, 7.031f)
                lineTo(5f, 6.875f)
                lineTo(5.354f, 6.719f)
                lineTo(5.313f, 6.334f)
                lineTo(5.625f, 6.563f)
                lineTo(5.938f, 6.334f)
                lineTo(5.896f, 6.719f)
                lineTo(6.25f, 6.875f)
                lineTo(5.896f, 7.031f)
                lineTo(5.938f, 7.416f)
                lineTo(5.625f, 7.188f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.476f, 7.64f)
                curveTo(13.242f, 7.396f, 15.345f, 6.824f, 15.563f, 6.085f)
                curveTo(15.851f, 5.442f, 15.658f, 4.921f, 14.567f, 4.464f)
                curveTo(13.476f, 4.006f, 12.373f, 3.121f, 13.641f, 3.121f)
                curveTo(14.909f, 3.121f, 14.909f, 3.302f, 15.25f, 3.836f)
                curveTo(15.591f, 4.369f, 16.327f, 4.483f, 16.343f, 3.836f)
                curveTo(16.343f, 2.732f, 16.447f, 2.584f, 15.556f, 1.624f)
                curveTo(14.665f, 0.665f, 17.79f, 2.018f, 17.532f, 3.663f)
                curveTo(17.274f, 5.308f, 16.962f, 4.777f, 17.16f, 5.053f)
                curveTo(17.357f, 5.329f, 18.545f, 4.472f, 18.397f, 5.614f)
                curveTo(17.981f, 6.271f, 17.157f, 7.248f, 13.476f, 7.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 10.625f)
                curveTo(11.726f, 10.625f, 13.125f, 9.226f, 13.125f, 7.5f)
                curveTo(13.125f, 5.774f, 11.726f, 4.375f, 10f, 4.375f)
                curveTo(8.274f, 4.375f, 6.875f, 5.774f, 6.875f, 7.5f)
                curveTo(6.875f, 9.226f, 8.274f, 10.625f, 10f, 10.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF548650)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.096f, 6.351f)
                curveTo(8.45f, 6.272f, 8.935f, 7.221f, 9.81f, 6.865f)
                curveTo(10.684f, 6.509f, 10.867f, 5.83f, 11.283f, 6.079f)
                curveTo(11.698f, 6.327f, 11.753f, 6.926f, 11.476f, 7.227f)
                curveTo(11.199f, 7.528f, 10.729f, 7.599f, 10.729f, 7.98f)
                curveTo(10.729f, 8.36f, 10.637f, 9.717f, 10.458f, 9.324f)
                curveTo(9.919f, 8.887f, 10.248f, 8.191f, 9.584f, 7.98f)
                curveTo(8.921f, 7.769f, 8.518f, 7.776f, 8.029f, 7.865f)
                curveTo(7.54f, 7.954f, 8.358f, 7.62f, 8.531f, 7.303f)
                curveTo(8.884f, 6.963f, 7.934f, 6.464f, 8.096f, 6.351f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChristmasIslandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.ChristmasIsland,
            contentDescription = "Christmas Island Flag"
        )
    }
}
