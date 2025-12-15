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
 * Taiwan Flag (20x15dp)
 *
 * - ISO Alpha-2: TW
 * - ISO Alpha-3: TWN
 * - ISO Numeric: 158
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Taiwan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Taiwan:TW:TWN:158:Medium",
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
                fill = SolidColor(Color(0xFFEF0000)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.25f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.456f, 6.757f)
                lineTo(4.53f, 7.912f)
                lineTo(4.306f, 6.448f)
                lineTo(2.926f, 6.986f)
                lineTo(3.464f, 5.606f)
                lineTo(2f, 5.382f)
                lineTo(3.155f, 4.456f)
                lineTo(2f, 3.53f)
                lineTo(3.464f, 3.306f)
                lineTo(2.926f, 1.926f)
                lineTo(4.306f, 2.464f)
                lineTo(4.53f, 1f)
                lineTo(5.456f, 2.155f)
                lineTo(6.382f, 1f)
                lineTo(6.606f, 2.464f)
                lineTo(7.986f, 1.926f)
                lineTo(7.448f, 3.306f)
                lineTo(8.912f, 3.53f)
                lineTo(7.757f, 4.456f)
                lineTo(8.912f, 5.382f)
                lineTo(7.448f, 5.606f)
                lineTo(7.986f, 6.986f)
                lineTo(6.606f, 6.448f)
                lineTo(6.382f, 7.912f)
                lineTo(5.456f, 6.757f)
                close()
                moveTo(5.456f, 6.245f)
                curveTo(6.444f, 6.245f, 7.245f, 5.444f, 7.245f, 4.456f)
                curveTo(7.245f, 3.468f, 6.444f, 2.667f, 5.456f, 2.667f)
                curveTo(4.468f, 2.667f, 3.667f, 3.468f, 3.667f, 4.456f)
                curveTo(3.667f, 5.444f, 4.468f, 6.245f, 5.456f, 6.245f)
                close()
                moveTo(6.887f, 4.456f)
                curveTo(6.887f, 5.246f, 6.246f, 5.887f, 5.456f, 5.887f)
                curveTo(4.666f, 5.887f, 4.025f, 5.246f, 4.025f, 4.456f)
                curveTo(4.025f, 3.666f, 4.666f, 3.025f, 5.456f, 3.025f)
                curveTo(6.246f, 3.025f, 6.887f, 3.666f, 6.887f, 4.456f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TaiwanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Taiwan,
            contentDescription = "Taiwan Flag"
        )
    }
}
