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
 * Marshall Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: MH
 * - ISO Alpha-3: MHL
 * - ISO Numeric: 584
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.MarshallIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Marshall Islands:MH:MHL:584:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.875f)
                lineTo(4.489f, 8.715f)
                lineTo(4.494f, 6.805f)
                lineTo(3.506f, 8.44f)
                lineTo(4.026f, 6.602f)
                lineTo(2.633f, 7.909f)
                lineTo(3.63f, 6.28f)
                lineTo(1.936f, 7.163f)
                lineTo(3.335f, 5.863f)
                lineTo(1.467f, 6.256f)
                lineTo(3.164f, 5.381f)
                lineTo(1.259f, 5.256f)
                lineTo(3.129f, 4.872f)
                lineTo(1.328f, 4.237f)
                lineTo(3.233f, 4.372f)
                lineTo(1.67f, 3.275f)
                lineTo(3.468f, 3.919f)
                lineTo(2.259f, 2.44f)
                lineTo(3.817f, 3.546f)
                lineTo(3.052f, 1.796f)
                lineTo(4.253f, 3.28f)
                lineTo(3.988f, 1.389f)
                lineTo(4.745f, 3.142f)
                lineTo(5f, 1.25f)
                lineTo(5.255f, 3.142f)
                lineTo(6.012f, 1.389f)
                lineTo(5.747f, 3.28f)
                lineTo(6.948f, 1.796f)
                lineTo(6.183f, 3.546f)
                lineTo(7.741f, 2.44f)
                lineTo(6.532f, 3.919f)
                lineTo(8.33f, 3.275f)
                lineTo(6.767f, 4.372f)
                lineTo(8.672f, 4.237f)
                lineTo(6.871f, 4.872f)
                lineTo(8.741f, 5.256f)
                lineTo(6.836f, 5.381f)
                lineTo(8.533f, 6.256f)
                lineTo(6.665f, 5.863f)
                lineTo(8.064f, 7.163f)
                lineTo(6.37f, 6.28f)
                lineTo(7.367f, 7.909f)
                lineTo(5.974f, 6.602f)
                lineTo(6.494f, 8.44f)
                lineTo(5.506f, 6.805f)
                lineTo(5.511f, 8.715f)
                lineTo(5f, 6.875f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(-0.489f, 15.466f)
                lineTo(20.786f, 0.759f)
                verticalLineTo(5.554f)
                lineTo(-0.489f, 15.466f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE2AE57))) {
                moveTo(-0.489f, 15.466f)
                lineTo(20.786f, -2.991f)
                verticalLineTo(1.804f)
                lineTo(-0.489f, 15.466f)
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
            imageVector = FlagIcons.Medium.MarshallIslands,
            contentDescription = "Marshall Islands Flag"
        )
    }
}
