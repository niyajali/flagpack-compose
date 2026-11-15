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
 * Aruba Flag (20x15dp)
 *
 * - ISO Alpha-2: AW
 * - ISO Alpha-3: ABW
 * - ISO Numeric: 533
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Aruba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Aruba:AW:ABW:533:Medium",
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
                fill = SolidColor(Color(0xFF5BA3DA)),
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
                fill = SolidColor(Color(0xFFEF2929)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.546f, 4.975f)
                lineTo(0.808f, 4.397f)
                lineTo(3.58f, 3.848f)
                lineTo(4.381f, 0.98f)
                lineTo(5.014f, 3.825f)
                lineTo(7.488f, 4.4f)
                lineTo(5.043f, 4.975f)
                lineTo(4.337f, 7.315f)
                lineTo(3.546f, 4.975f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.546f, 4.975f)
                lineTo(0.808f, 4.397f)
                lineTo(3.58f, 3.848f)
                lineTo(4.381f, 0.98f)
                lineTo(5.014f, 3.825f)
                lineTo(7.488f, 4.4f)
                lineTo(5.043f, 4.975f)
                lineTo(4.337f, 7.315f)
                lineTo(3.546f, 4.975f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFAD615)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                close()
                moveTo(20f, 11f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ArubaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Aruba,
            contentDescription = "Aruba Flag"
        )
    }
}
