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
 * Comoros Flag (20x15dp)
 *
 * - ISO Alpha-2: KM
 * - ISO Alpha-3: COM
 * - ISO Numeric: 174
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Comoros: ImageVector by lazy {
    ImageVector.Builder(
        name = "Comoros:KM:COM:174:Medium",
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
                fill = SolidColor(Color(0xFF5196ED)),
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
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(3.75f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(12.5f, 7.5f)
                lineTo(0f, 15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.94f, 10.683f)
                curveTo(4.94f, 10.683f, 2.701f, 9.904f, 2.78f, 7.468f)
                curveTo(2.859f, 5.031f, 5.14f, 4.554f, 5.14f, 4.554f)
                curveTo(4.341f, 3.967f, 1.483f, 4.655f, 1.392f, 7.468f)
                curveTo(1.3f, 10.281f, 4.089f, 10.906f, 4.94f, 10.683f)
                close()
                moveTo(5.008f, 6.424f)
                lineTo(5.078f, 6.007f)
                lineTo(4.781f, 5.712f)
                lineTo(5.191f, 5.652f)
                lineTo(5.375f, 5.273f)
                lineTo(5.559f, 5.652f)
                lineTo(5.969f, 5.712f)
                lineTo(5.672f, 6.007f)
                lineTo(5.742f, 6.424f)
                lineTo(5.375f, 6.227f)
                lineTo(5.008f, 6.424f)
                close()
                moveTo(5.078f, 7.28f)
                lineTo(5.008f, 7.697f)
                lineTo(5.375f, 7.5f)
                lineTo(5.742f, 7.697f)
                lineTo(5.672f, 7.28f)
                lineTo(5.969f, 6.985f)
                lineTo(5.559f, 6.924f)
                lineTo(5.375f, 6.545f)
                lineTo(5.191f, 6.924f)
                lineTo(4.781f, 6.985f)
                lineTo(5.078f, 7.28f)
                close()
                moveTo(5.008f, 8.969f)
                lineTo(5.078f, 8.553f)
                lineTo(4.781f, 8.258f)
                lineTo(5.191f, 8.197f)
                lineTo(5.375f, 7.818f)
                lineTo(5.559f, 8.197f)
                lineTo(5.969f, 8.258f)
                lineTo(5.672f, 8.553f)
                lineTo(5.742f, 8.969f)
                lineTo(5.375f, 8.773f)
                lineTo(5.008f, 8.969f)
                close()
                moveTo(5.008f, 10.242f)
                lineTo(5.078f, 9.826f)
                lineTo(4.781f, 9.531f)
                lineTo(5.191f, 9.47f)
                lineTo(5.375f, 9.091f)
                lineTo(5.559f, 9.47f)
                lineTo(5.969f, 9.531f)
                lineTo(5.672f, 9.826f)
                lineTo(5.742f, 10.242f)
                lineTo(5.375f, 10.045f)
                lineTo(5.008f, 10.242f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ComorosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Comoros,
            contentDescription = "Comoros Flag"
        )
    }
}
