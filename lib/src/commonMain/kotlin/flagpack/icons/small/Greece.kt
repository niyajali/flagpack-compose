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
 * Greece Flag (16x12dp)
 *
 * - ISO Alpha-2: GR
 * - ISO Alpha-3: GRC
 * - ISO Numeric: 300
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Greece: ImageVector by lazy {
    ImageVector.Builder(
        name = "Greece:GR:GRC:300:Small",
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
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.014f, 2.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(1.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(-0.029f, 5.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.056f, 8.2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.051f, 10.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.236f, 0f)
                horizontalLineTo(4.818f)
                verticalLineTo(2.75f)
                horizontalLineTo(8f)
                verticalLineTo(4.643f)
                horizontalLineTo(4.818f)
                verticalLineTo(7.5f)
                horizontalLineTo(3.236f)
                verticalLineTo(4.643f)
                horizontalLineTo(0f)
                verticalLineTo(2.75f)
                horizontalLineTo(3.236f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GreecePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Greece,
            contentDescription = "Greece Flag"
        )
    }
}
