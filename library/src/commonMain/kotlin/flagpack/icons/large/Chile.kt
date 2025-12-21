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
 * Chile Flag (32x24dp)
 *
 * - ISO Alpha-2: CL
 * - ISO Alpha-3: CHL
 * - ISO Numeric: 152
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Chile: ImageVector by lazy {
    ImageVector.Builder(
        name = "Chile:CL:CHL:152:Large",
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
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, -2f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 14f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.014f, 9.783f)
                lineTo(3.211f, 12.055f)
                lineTo(5.088f, 8.19f)
                lineTo(1.764f, 5.68f)
                lineTo(5.601f, 5.639f)
                lineTo(7.049f, 2.211f)
                lineTo(7.981f, 5.639f)
                lineTo(11.613f, 5.656f)
                lineTo(8.851f, 8.111f)
                lineTo(10.285f, 12.055f)
                lineTo(7.014f, 9.783f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Chile,
            contentDescription = "Chile Flag"
        )
    }
}
