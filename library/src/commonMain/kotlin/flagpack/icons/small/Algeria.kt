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
 * Algeria Flag (16x12dp)
 *
 * - ISO Alpha-2: DZ
 * - ISO Alpha-3: DZA
 * - ISO Numeric: 012
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Algeria: ImageVector by lazy {
    ImageVector.Builder(
        name = "Algeria:DZ:DZA:012:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF36A400)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.313f, 2.816f)
                curveTo(10.089f, 2.816f, 10.803f, 3.075f, 11.375f, 3.512f)
                curveTo(10.593f, 2.52f, 9.381f, 1.882f, 8.019f, 1.882f)
                curveTo(5.662f, 1.882f, 3.751f, 3.793f, 3.751f, 6.151f)
                curveTo(3.751f, 8.508f, 5.662f, 10.419f, 8.019f, 10.419f)
                curveTo(9.229f, 10.419f, 10.321f, 9.916f, 11.098f, 9.107f)
                curveTo(10.579f, 9.428f, 9.968f, 9.613f, 9.313f, 9.613f)
                curveTo(7.437f, 9.613f, 5.915f, 8.091f, 5.915f, 6.214f)
                curveTo(5.915f, 4.337f, 7.437f, 2.816f, 9.313f, 2.816f)
                close()
                moveTo(10.745f, 4.068f)
                lineTo(9.675f, 5.281f)
                lineTo(8.138f, 4.857f)
                lineTo(8.99f, 6.19f)
                lineTo(8.138f, 7.609f)
                lineTo(9.75f, 7.028f)
                lineTo(10.631f, 8.404f)
                verticalLineTo(6.807f)
                lineTo(12.071f, 6.19f)
                lineTo(10.631f, 5.674f)
                lineTo(10.745f, 4.068f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AlgeriaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Algeria,
            contentDescription = "Algeria Flag"
        )
    }
}
