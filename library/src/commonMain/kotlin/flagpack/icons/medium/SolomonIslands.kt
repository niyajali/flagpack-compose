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
 * Solomon Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: SB
 * - ISO Alpha-3: SLB
 * - ISO Numeric: 090
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SolomonIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Solomon Islands:SB:SLB:090:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                lineTo(0f, 15f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(-0.489f, 15.466f)
                lineTo(-1.616f, 13.906f)
                lineTo(21.047f, -1.221f)
                lineTo(22.174f, 0.339f)
                lineTo(-0.489f, 15.466f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.283f, 4.092f)
                lineTo(3.136f, 3.5f)
                lineTo(4.028f, 4.032f)
                lineTo(3.715f, 3.079f)
                lineTo(4.34f, 2.397f)
                horizontalLineTo(3.494f)
                lineTo(3.136f, 1.396f)
                lineTo(2.777f, 2.397f)
                lineTo(1.93f, 2.432f)
                lineTo(2.556f, 3.079f)
                lineTo(2.283f, 4.092f)
                close()
                moveTo(5.82f, 4.092f)
                lineTo(6.672f, 3.5f)
                lineTo(7.564f, 4.032f)
                lineTo(7.252f, 3.079f)
                lineTo(7.876f, 2.397f)
                horizontalLineTo(7.03f)
                lineTo(6.672f, 1.396f)
                lineTo(6.313f, 2.397f)
                lineTo(5.466f, 2.432f)
                lineTo(6.092f, 3.079f)
                lineTo(5.82f, 4.092f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.155f, 5.909f)
                lineTo(5.007f, 5.318f)
                lineTo(5.9f, 5.849f)
                lineTo(5.587f, 4.897f)
                lineTo(6.211f, 4.215f)
                horizontalLineTo(5.366f)
                lineTo(5.007f, 3.214f)
                lineTo(4.649f, 4.215f)
                lineTo(3.802f, 4.25f)
                lineTo(4.427f, 4.897f)
                lineTo(4.155f, 5.909f)
                close()
                moveTo(3.136f, 7.25f)
                lineTo(2.283f, 7.842f)
                lineTo(2.556f, 6.829f)
                lineTo(1.93f, 6.182f)
                lineTo(2.777f, 6.147f)
                lineTo(3.136f, 5.146f)
                lineTo(3.494f, 6.147f)
                horizontalLineTo(4.34f)
                lineTo(3.715f, 6.829f)
                lineTo(4.028f, 7.782f)
                lineTo(3.136f, 7.25f)
                close()
                moveTo(6.672f, 7.25f)
                lineTo(5.82f, 7.842f)
                lineTo(6.092f, 6.829f)
                lineTo(5.466f, 6.182f)
                lineTo(6.313f, 6.147f)
                lineTo(6.672f, 5.146f)
                lineTo(7.03f, 6.147f)
                horizontalLineTo(7.876f)
                lineTo(7.252f, 6.829f)
                lineTo(7.564f, 7.782f)
                lineTo(6.672f, 7.25f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SolomonIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SolomonIslands,
            contentDescription = "Solomon Islands Flag"
        )
    }
}
