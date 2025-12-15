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
 * Nepal Flag (20x15dp)
 *
 * - ISO Alpha-2: NP
 * - ISO Alpha-3: NPL
 * - ISO Numeric: 524
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Nepal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nepal:NP:NPL:524:Medium",
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
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFF4857A1)),
                strokeLineWidth = 1f
            ) {
                moveTo(7.118f, 7.938f)
                lineTo(12.672f, 14.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.978f)
                lineTo(12.001f, 7.115f)
                horizontalLineTo(7.5f)
                horizontalLineTo(6.422f)
                lineTo(7.118f, 7.938f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.118f, 7.938f)
                lineTo(12.672f, 14.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.978f)
                lineTo(12.001f, 7.115f)
                horizontalLineTo(7.5f)
                horizontalLineTo(6.422f)
                lineTo(7.118f, 7.938f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.644f, 12.545f)
                lineTo(2.878f, 13.523f)
                lineTo(2.842f, 12.288f)
                lineTo(1.639f, 12.637f)
                lineTo(2.347f, 11.618f)
                lineTo(1.166f, 11.203f)
                lineTo(2.347f, 10.788f)
                lineTo(1.639f, 9.769f)
                lineTo(2.842f, 10.117f)
                lineTo(2.878f, 8.882f)
                lineTo(3.644f, 9.861f)
                lineTo(4.409f, 8.882f)
                lineTo(4.445f, 10.117f)
                lineTo(5.648f, 9.769f)
                lineTo(4.94f, 10.788f)
                lineTo(6.121f, 11.203f)
                lineTo(4.94f, 11.618f)
                lineTo(5.648f, 12.637f)
                lineTo(4.445f, 12.288f)
                lineTo(4.409f, 13.523f)
                lineTo(3.644f, 12.545f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.625f, 5.239f)
                lineTo(3.225f, 5.75f)
                lineTo(3.207f, 5.105f)
                lineTo(2.578f, 5.287f)
                lineTo(2.948f, 4.755f)
                lineTo(2.331f, 4.538f)
                lineTo(2.948f, 4.322f)
                lineTo(2.578f, 3.789f)
                lineTo(3.207f, 3.971f)
                lineTo(3.225f, 3.327f)
                lineTo(3.625f, 3.838f)
                lineTo(4.025f, 3.327f)
                lineTo(4.043f, 3.971f)
                lineTo(4.672f, 3.789f)
                lineTo(4.302f, 4.322f)
                lineTo(4.919f, 4.538f)
                lineTo(4.302f, 4.755f)
                lineTo(4.672f, 5.287f)
                lineTo(4.043f, 5.105f)
                lineTo(4.025f, 5.75f)
                lineTo(3.625f, 5.239f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.541f, 5.089f)
                curveTo(4.911f, 5.095f, 5.641f, 4.305f, 5.641f, 4.305f)
                curveTo(5.786f, 5.206f, 4.67f, 5.805f, 3.554f, 5.805f)
                curveTo(2.438f, 5.805f, 1.762f, 4.988f, 1.346f, 4.305f)
                curveTo(1.346f, 4.305f, 2.171f, 5.084f, 3.541f, 5.089f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NepalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Nepal,
            contentDescription = "Nepal Flag"
        )
    }
}
