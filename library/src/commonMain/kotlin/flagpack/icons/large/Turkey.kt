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
 * Turkey Flag (32x24dp)
 *
 * - ISO Alpha-2: TR
 * - ISO Alpha-3: TUR
 * - ISO Numeric: 792
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Turkey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Turkey:TR:TUR:792:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.025f, 16.114f)
                curveTo(13.884f, 15.586f, 12.207f, 13.794f, 12.226f, 11.166f)
                curveTo(12.245f, 8.707f, 13.734f, 6.628f, 16.088f, 6.065f)
                curveTo(18.442f, 5.503f, 20.514f, 6.697f, 20.514f, 6.697f)
                curveTo(19.864f, 5.161f, 17.603f, 4.082f, 15.75f, 4.085f)
                curveTo(12.301f, 4.091f, 8.624f, 6.889f, 8.593f, 11.166f)
                curveTo(8.56f, 15.601f, 12.53f, 18.127f, 16.022f, 18.121f)
                curveTo(18.821f, 18.117f, 20.149f, 16.201f, 20.424f, 15.387f)
                curveTo(20.424f, 15.387f, 18.167f, 16.641f, 16.025f, 16.114f)
                close()
                moveTo(20.903f, 10.327f)
                lineTo(18.77f, 11.11f)
                lineTo(21.177f, 11.959f)
                lineTo(21.136f, 14.497f)
                lineTo(22.722f, 12.593f)
                lineTo(25.342f, 12.784f)
                lineTo(23.266f, 10.999f)
                lineTo(24.629f, 9.095f)
                lineTo(22.41f, 9.842f)
                lineTo(20.823f, 8.078f)
                lineTo(20.903f, 10.327f)
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
            imageVector = FlagIcons.Large.Turkey,
            contentDescription = "Turkey Flag"
        )
    }
}
