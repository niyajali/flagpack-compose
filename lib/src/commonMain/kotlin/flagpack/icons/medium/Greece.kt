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
 * Greece Flag (20x15dp)
 *
 * - ISO Alpha-2: GR
 * - ISO Alpha-3: GRC
 * - ISO Numeric: 300
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Greece: ImageVector by lazy {
    ImageVector.Builder(
        name = "Greece:GR:GRC:300:Medium",
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
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.017f, 3.438f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(1.875f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(-0.037f, 6.875f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.07f, 10.25f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4564F9))) {
                moveTo(0.063f, 13.438f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF4564F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.044f, 0f)
                horizontalLineTo(6.022f)
                verticalLineTo(3.438f)
                horizontalLineTo(10f)
                verticalLineTo(5.804f)
                horizontalLineTo(6.022f)
                verticalLineTo(9.375f)
                horizontalLineTo(4.044f)
                verticalLineTo(5.804f)
                horizontalLineTo(0f)
                verticalLineTo(3.438f)
                horizontalLineTo(4.044f)
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
            imageVector = FlagIcons.Medium.Greece,
            contentDescription = "Greece Flag"
        )
    }
}
