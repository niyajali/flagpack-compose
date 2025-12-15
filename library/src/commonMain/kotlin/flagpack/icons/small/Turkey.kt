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
 * Turkey Flag (16x12dp)
 *
 * - ISO Alpha-2: TR
 * - ISO Alpha-3: TUR
 * - ISO Numeric: 792
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Turkey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Turkey:TR:TUR:792:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.013f, 8.057f)
                curveTo(6.942f, 7.793f, 6.103f, 6.897f, 6.113f, 5.583f)
                curveTo(6.122f, 4.353f, 6.867f, 3.314f, 8.044f, 3.033f)
                curveTo(9.221f, 2.751f, 10.257f, 3.349f, 10.257f, 3.349f)
                curveTo(9.932f, 2.581f, 8.802f, 2.041f, 7.875f, 2.043f)
                curveTo(6.15f, 2.046f, 4.312f, 3.444f, 4.296f, 5.583f)
                curveTo(4.28f, 7.801f, 6.265f, 9.064f, 8.011f, 9.061f)
                curveTo(9.41f, 9.058f, 10.074f, 8.101f, 10.212f, 7.693f)
                curveTo(10.212f, 7.693f, 9.083f, 8.321f, 8.013f, 8.057f)
                close()
                moveTo(10.452f, 5.163f)
                lineTo(9.385f, 5.555f)
                lineTo(10.589f, 5.98f)
                lineTo(10.568f, 7.248f)
                lineTo(11.361f, 6.297f)
                lineTo(12.671f, 6.392f)
                lineTo(11.633f, 5.499f)
                lineTo(12.314f, 4.548f)
                lineTo(11.205f, 4.921f)
                lineTo(10.412f, 4.039f)
                lineTo(10.452f, 5.163f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TurkeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Turkey,
            contentDescription = "Turkey Flag"
        )
    }
}
