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
 * South Sudan Flag (32x24dp)
 *
 * - ISO Alpha-2: SS
 * - ISO Alpha-3: SSD
 * - ISO Numeric: 728
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SouthSudan: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Sudan:SS:SSD:728:Large",
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
                fill = SolidColor(Color(0xFF272727)),
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
                fill = SolidColor(Color(0xFF4E8B1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 7f)
                horizontalLineTo(-1f)
                verticalLineTo(8f)
                verticalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(16f)
                verticalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(20f, 12f)
                lineTo(0f, 24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.648f, 14.409f)
                lineTo(4.628f, 16.509f)
                lineTo(4.417f, 13.523f)
                lineTo(1.842f, 11.937f)
                lineTo(4.528f, 11.094f)
                lineTo(4.967f, 8.136f)
                lineTo(6.827f, 10.478f)
                lineTo(9.539f, 9.751f)
                lineTo(8.137f, 12.527f)
                lineTo(9.5f, 15.203f)
                lineTo(6.648f, 14.409f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SouthSudanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SouthSudan,
            contentDescription = "South Sudan Flag"
        )
    }
}
