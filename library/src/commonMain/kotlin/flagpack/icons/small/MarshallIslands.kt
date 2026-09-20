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
 * Marshall Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: MH
 * - ISO Alpha-3: MHL
 * - ISO Numeric: 584
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.MarshallIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Marshall Islands:MH:MHL:584:Small",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                moveTo(4f, 5.5f)
                lineTo(3.592f, 6.972f)
                lineTo(3.595f, 5.444f)
                lineTo(2.805f, 6.752f)
                lineTo(3.221f, 5.282f)
                lineTo(2.107f, 6.327f)
                lineTo(2.904f, 5.024f)
                lineTo(1.549f, 5.73f)
                lineTo(2.668f, 4.69f)
                lineTo(1.173f, 5.005f)
                lineTo(2.531f, 4.305f)
                lineTo(1.007f, 4.205f)
                lineTo(2.503f, 3.898f)
                lineTo(1.063f, 3.39f)
                lineTo(2.587f, 3.498f)
                lineTo(1.336f, 2.62f)
                lineTo(2.775f, 3.135f)
                lineTo(1.807f, 1.952f)
                lineTo(3.053f, 2.836f)
                lineTo(2.441f, 1.437f)
                lineTo(3.402f, 2.624f)
                lineTo(3.191f, 1.111f)
                lineTo(3.796f, 2.514f)
                lineTo(4f, 1f)
                lineTo(4.204f, 2.514f)
                lineTo(4.809f, 1.111f)
                lineTo(4.598f, 2.624f)
                lineTo(5.559f, 1.437f)
                lineTo(4.947f, 2.836f)
                lineTo(6.193f, 1.952f)
                lineTo(5.225f, 3.135f)
                lineTo(6.664f, 2.62f)
                lineTo(5.413f, 3.498f)
                lineTo(6.937f, 3.39f)
                lineTo(5.497f, 3.898f)
                lineTo(6.993f, 4.205f)
                lineTo(5.469f, 4.305f)
                lineTo(6.827f, 5.005f)
                lineTo(5.332f, 4.69f)
                lineTo(6.451f, 5.73f)
                lineTo(5.096f, 5.024f)
                lineTo(5.893f, 6.327f)
                lineTo(4.779f, 5.282f)
                lineTo(5.195f, 6.752f)
                lineTo(4.405f, 5.444f)
                lineTo(4.409f, 6.972f)
                lineTo(4f, 5.5f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(-0.391f, 12.373f)
                lineTo(16.629f, 0.607f)
                verticalLineTo(4.443f)
                lineTo(-0.391f, 12.373f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE2AE57))) {
                moveTo(-0.391f, 12.373f)
                lineTo(16.629f, -2.393f)
                verticalLineTo(1.443f)
                lineTo(-0.391f, 12.373f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MarshallIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.MarshallIslands,
            contentDescription = "Marshall Islands Flag"
        )
    }
}
