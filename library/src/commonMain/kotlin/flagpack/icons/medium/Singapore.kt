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
 * Singapore Flag (20x15dp)
 *
 * - ISO Alpha-2: SG
 * - ISO Alpha-3: SGP
 * - ISO Numeric: 702
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Singapore: ImageVector by lazy {
    ImageVector.Builder(
        name = "Singapore:SG:SGP:702:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.543f, 6.619f)
                curveTo(5.543f, 6.619f, 3.777f, 5.908f, 3.777f, 3.984f)
                curveTo(3.777f, 2.059f, 5.543f, 1.372f, 5.543f, 1.372f)
                curveTo(4.684f, 1.155f, 2.407f, 1.349f, 2.407f, 3.984f)
                curveTo(2.407f, 6.619f, 4.65f, 7.115f, 5.543f, 6.619f)
                close()
                moveTo(5.995f, 6.3f)
                lineTo(6.502f, 5.995f)
                lineTo(7.02f, 6.3f)
                lineTo(6.893f, 5.704f)
                lineTo(7.314f, 5.233f)
                horizontalLineTo(6.744f)
                lineTo(6.502f, 4.675f)
                lineTo(6.26f, 5.233f)
                lineTo(5.689f, 5.257f)
                lineTo(6.111f, 5.704f)
                lineTo(5.995f, 6.3f)
                close()
                moveTo(8.343f, 5.96f)
                lineTo(7.837f, 6.266f)
                lineTo(7.952f, 5.669f)
                lineTo(7.53f, 5.223f)
                lineTo(8.102f, 5.199f)
                lineTo(8.343f, 4.641f)
                lineTo(8.585f, 5.199f)
                horizontalLineTo(9.155f)
                lineTo(8.734f, 5.669f)
                lineTo(8.861f, 6.266f)
                lineTo(8.343f, 5.96f)
                close()
                moveTo(7.054f, 3.606f)
                lineTo(7.561f, 3.3f)
                lineTo(8.079f, 3.606f)
                lineTo(7.952f, 3.009f)
                lineTo(8.373f, 2.539f)
                horizontalLineTo(7.803f)
                lineTo(7.561f, 1.981f)
                lineTo(7.319f, 2.539f)
                lineTo(6.748f, 2.563f)
                lineTo(7.17f, 3.009f)
                lineTo(7.054f, 3.606f)
                close()
                moveTo(5.856f, 4.514f)
                lineTo(5.349f, 4.82f)
                lineTo(5.465f, 4.223f)
                lineTo(5.043f, 3.776f)
                lineTo(5.614f, 3.752f)
                lineTo(5.856f, 3.195f)
                lineTo(6.098f, 3.752f)
                horizontalLineTo(6.668f)
                lineTo(6.247f, 4.223f)
                lineTo(6.374f, 4.82f)
                lineTo(5.856f, 4.514f)
                close()
                moveTo(8.698f, 4.793f)
                lineTo(9.205f, 4.487f)
                lineTo(9.723f, 4.793f)
                lineTo(9.596f, 4.196f)
                lineTo(10.017f, 3.725f)
                horizontalLineTo(9.447f)
                lineTo(9.205f, 3.168f)
                lineTo(8.963f, 3.725f)
                lineTo(8.392f, 3.749f)
                lineTo(8.814f, 4.196f)
                lineTo(8.698f, 4.793f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SingaporePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Singapore,
            contentDescription = "Singapore Flag"
        )
    }
}
