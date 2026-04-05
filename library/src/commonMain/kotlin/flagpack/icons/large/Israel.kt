package flagpack.icons.large

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
 * Israel Flag (32x24dp)
 *
 * - ISO Alpha-2: IL
 * - ISO Alpha-3: ISR
 * - ISO Numeric: 376
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Israel: ImageVector by lazy {
    ImageVector.Builder(
        name = "Israel:IL:ISR:376:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                verticalLineTo(21f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.381f, 14.939f)
                horizontalLineTo(20.758f)
                lineTo(16.116f, 6.62f)
                lineTo(11.381f, 14.939f)
                close()
                moveTo(19.153f, 13.929f)
                horizontalLineTo(13.021f)
                lineTo(16.107f, 8.46f)
                lineTo(19.153f, 13.929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.264f, 9.076f)
                horizontalLineTo(20.681f)
                lineTo(16.136f, 17.162f)
                lineTo(11.264f, 9.076f)
                close()
                moveTo(19.045f, 10.05f)
                horizontalLineTo(13.051f)
                lineTo(16.109f, 15.531f)
                lineTo(19.045f, 10.05f)
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
            imageVector = FlagIcons.Large.Israel,
            contentDescription = "Israel Flag"
        )
    }
}
