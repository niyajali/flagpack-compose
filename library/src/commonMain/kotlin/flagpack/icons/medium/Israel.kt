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
 * Israel Flag (20x15dp)
 *
 * - ISO Alpha-2: IL
 * - ISO Alpha-3: ISR
 * - ISO Numeric: 376
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Israel: ImageVector by lazy {
    ImageVector.Builder(
        name = "Israel:IL:ISR:376:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2.5f)
                verticalLineTo(4.728f)
                horizontalLineTo(20f)
                verticalLineTo(2.5f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10.217f)
                verticalLineTo(12.5f)
                horizontalLineTo(20f)
                verticalLineTo(10.217f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.113f, 9.337f)
                horizontalLineTo(12.974f)
                lineTo(10.072f, 4.324f)
                lineTo(7.113f, 9.337f)
                close()
                moveTo(11.782f, 8.649f)
                horizontalLineTo(8.317f)
                lineTo(10.067f, 5.686f)
                lineTo(11.782f, 8.649f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.932f, 5.578f)
                horizontalLineTo(12.925f)
                lineTo(10.085f, 10.607f)
                lineTo(6.932f, 5.578f)
                close()
                moveTo(11.748f, 6.266f)
                horizontalLineTo(8.175f)
                lineTo(10.054f, 9.264f)
                lineTo(11.748f, 6.266f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IsraelPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Israel,
            contentDescription = "Israel Flag"
        )
    }
}
