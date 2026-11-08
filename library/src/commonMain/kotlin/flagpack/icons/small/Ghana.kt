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
 * Ghana Flag (16x12dp)
 *
 * - ISO Alpha-2: GH
 * - ISO Alpha-3: GHA
 * - ISO Numeric: 288
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Ghana: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ghana:GH:GHA:288:Small",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                fillAlpha = 0.9f,
                strokeAlpha = 0.9f,
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
        }
    }.build()
}

@Preview
@Composable
private fun GhanaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Ghana,
            contentDescription = "Ghana Flag"
        )
    }
}
