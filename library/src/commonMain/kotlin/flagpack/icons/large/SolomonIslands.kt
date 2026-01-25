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
 * Solomon Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: SB
 * - ISO Alpha-3: SLB
 * - ISO Numeric: 090
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SolomonIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Solomon Islands:SB:SLB:090:Large",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                lineTo(0f, 24f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(-0.782f, 24.745f)
                lineTo(-2.586f, 22.249f)
                lineTo(33.675f, -1.954f)
                lineTo(35.479f, 0.542f)
                lineTo(-0.782f, 24.745f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.653f, 6.547f)
                lineTo(5.017f, 5.601f)
                lineTo(6.445f, 6.451f)
                lineTo(5.945f, 4.927f)
                lineTo(6.943f, 3.836f)
                horizontalLineTo(5.59f)
                lineTo(5.017f, 2.234f)
                lineTo(4.443f, 3.836f)
                lineTo(3.088f, 3.892f)
                lineTo(4.089f, 4.927f)
                lineTo(3.653f, 6.547f)
                close()
                moveTo(9.311f, 6.547f)
                lineTo(10.675f, 5.601f)
                lineTo(12.103f, 6.451f)
                lineTo(11.603f, 4.927f)
                lineTo(12.602f, 3.836f)
                horizontalLineTo(11.248f)
                lineTo(10.675f, 2.234f)
                lineTo(10.102f, 3.836f)
                lineTo(8.746f, 3.892f)
                lineTo(9.747f, 4.927f)
                lineTo(9.311f, 6.547f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.648f, 9.455f)
                lineTo(8.012f, 8.509f)
                lineTo(9.44f, 9.359f)
                lineTo(8.939f, 7.835f)
                lineTo(9.938f, 6.744f)
                horizontalLineTo(8.585f)
                lineTo(8.012f, 5.142f)
                lineTo(7.438f, 6.744f)
                lineTo(6.083f, 6.8f)
                lineTo(7.084f, 7.835f)
                lineTo(6.648f, 9.455f)
                close()
                moveTo(5.017f, 11.601f)
                lineTo(3.653f, 12.547f)
                lineTo(4.089f, 10.927f)
                lineTo(3.088f, 9.892f)
                lineTo(4.443f, 9.836f)
                lineTo(5.017f, 8.234f)
                lineTo(5.59f, 9.836f)
                horizontalLineTo(6.943f)
                lineTo(5.945f, 10.927f)
                lineTo(6.445f, 12.451f)
                lineTo(5.017f, 11.601f)
                close()
                moveTo(10.675f, 11.601f)
                lineTo(9.311f, 12.547f)
                lineTo(9.747f, 10.927f)
                lineTo(8.746f, 9.892f)
                lineTo(10.102f, 9.836f)
                lineTo(10.675f, 8.234f)
                lineTo(11.248f, 9.836f)
                horizontalLineTo(12.602f)
                lineTo(11.603f, 10.927f)
                lineTo(12.103f, 12.451f)
                lineTo(10.675f, 11.601f)
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
            imageVector = FlagIcons.Large.SolomonIslands,
            contentDescription = "Solomon Islands Flag"
        )
    }
}
