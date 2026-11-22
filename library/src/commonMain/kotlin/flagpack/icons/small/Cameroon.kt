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
 * Cameroon Flag (16x12dp)
 *
 * - ISO Alpha-2: CM
 * - ISO Alpha-3: CMR
 * - ISO Numeric: 120
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Cameroon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cameroon:CM:CMR:120:Small",
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
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.038f, 7.245f)
                lineTo(6.295f, 8.454f)
                lineTo(6.852f, 6.384f)
                lineTo(5.572f, 5.061f)
                lineTo(7.305f, 4.989f)
                lineTo(8.038f, 2.942f)
                lineTo(8.771f, 4.989f)
                horizontalLineTo(10.5f)
                lineTo(9.224f, 6.384f)
                lineTo(9.863f, 8.332f)
                lineTo(8.038f, 7.245f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CameroonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Cameroon,
            contentDescription = "Cameroon Flag"
        )
    }
}
