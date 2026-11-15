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
 * Nauru Flag (20x15dp)
 *
 * - ISO Alpha-2: NR
 * - ISO Alpha-3: NRU
 * - ISO Numeric: 520
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Nauru: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nauru:NR:NRU:520:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.519f, 12.237f)
                lineTo(4.553f, 13.491f)
                lineTo(4.508f, 11.909f)
                lineTo(2.99f, 12.355f)
                lineTo(3.884f, 11.05f)
                lineTo(2.394f, 10.519f)
                lineTo(3.884f, 9.987f)
                lineTo(2.99f, 8.682f)
                lineTo(4.508f, 9.128f)
                lineTo(4.553f, 7.546f)
                lineTo(5.519f, 8.8f)
                lineTo(6.484f, 7.546f)
                lineTo(6.529f, 9.128f)
                lineTo(8.047f, 8.682f)
                lineTo(7.153f, 9.987f)
                lineTo(8.644f, 10.519f)
                lineTo(7.153f, 11.05f)
                lineTo(8.047f, 12.355f)
                lineTo(6.529f, 11.909f)
                lineTo(6.484f, 13.491f)
                lineTo(5.519f, 12.237f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NauruPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Nauru,
            contentDescription = "Nauru Flag"
        )
    }
}
