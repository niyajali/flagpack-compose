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
 * Nepal Flag (32x24dp)
 *
 * - ISO Alpha-2: NP
 * - ISO Alpha-3: NPL
 * - ISO Numeric: 524
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Nepal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nepal:NP:NPL:524:Large",
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
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFF4857A1)),
                strokeLineWidth = 1f
            ) {
                moveTo(11.616f, 12.32f)
                lineTo(20.933f, 23.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.842f)
                lineTo(20.039f, 11.5f)
                horizontalLineTo(12f)
                horizontalLineTo(10.932f)
                lineTo(11.616f, 12.32f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(11.616f, 12.32f)
                lineTo(20.933f, 23.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.842f)
                lineTo(20.039f, 11.5f)
                horizontalLineTo(12f)
                horizontalLineTo(10.932f)
                lineTo(11.616f, 12.32f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.83f, 20.01f)
                lineTo(4.604f, 21.6f)
                lineTo(4.548f, 19.594f)
                lineTo(2.622f, 20.16f)
                lineTo(3.756f, 18.503f)
                lineTo(1.865f, 17.83f)
                lineTo(3.756f, 17.156f)
                lineTo(2.622f, 15.499f)
                lineTo(4.548f, 16.066f)
                lineTo(4.604f, 14.059f)
                lineTo(5.83f, 15.649f)
                lineTo(7.055f, 14.059f)
                lineTo(7.111f, 16.066f)
                lineTo(9.037f, 15.499f)
                lineTo(7.904f, 17.156f)
                lineTo(9.794f, 17.83f)
                lineTo(7.904f, 18.503f)
                lineTo(9.037f, 20.16f)
                lineTo(7.111f, 19.594f)
                lineTo(7.055f, 21.6f)
                lineTo(5.83f, 20.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.8f, 8.139f)
                lineTo(5.16f, 8.969f)
                lineTo(5.131f, 7.921f)
                lineTo(4.125f, 8.217f)
                lineTo(4.717f, 7.352f)
                lineTo(3.73f, 7f)
                lineTo(4.717f, 6.648f)
                lineTo(4.125f, 5.783f)
                lineTo(5.131f, 6.079f)
                lineTo(5.16f, 5.031f)
                lineTo(5.8f, 5.861f)
                lineTo(6.44f, 5.031f)
                lineTo(6.469f, 6.079f)
                lineTo(7.475f, 5.783f)
                lineTo(6.883f, 6.648f)
                lineTo(7.871f, 7f)
                lineTo(6.883f, 7.352f)
                lineTo(7.475f, 8.217f)
                lineTo(6.469f, 7.921f)
                lineTo(6.44f, 8.969f)
                lineTo(5.8f, 8.139f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.666f, 7.894f)
                curveTo(7.892f, 7.903f, 9.079f, 6.64f, 9.079f, 6.64f)
                curveTo(9.314f, 8.081f, 7.501f, 9.04f, 5.688f, 9.04f)
                curveTo(3.874f, 9.04f, 2.776f, 7.733f, 2.1f, 6.64f)
                curveTo(2.1f, 6.64f, 3.44f, 7.885f, 5.666f, 7.894f)
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
            imageVector = FlagIcons.Large.Nepal,
            contentDescription = "Nepal Flag"
        )
    }
}
