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
 * Djibouti Flag (32x24dp)
 *
 * - ISO Alpha-2: DJ
 * - ISO Alpha-3: DJI
 * - ISO Numeric: 262
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Djibouti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Djibouti:DJ:DJI:262:Large",
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFF6699FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -2f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(-2f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(24f)
            lineTo(18f, 12f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(18f, 12f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.002f, 14.071f)
                lineTo(5.131f, 15.2f)
                lineTo(5.558f, 12.996f)
                lineTo(4f, 11.347f)
                lineTo(6.109f, 11.258f)
                lineTo(7.002f, 9.2f)
                lineTo(7.894f, 11.258f)
                horizontalLineTo(10f)
                lineTo(8.446f, 12.996f)
                lineTo(8.914f, 15.2f)
                lineTo(7.002f, 14.071f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DjiboutiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Djibouti,
            contentDescription = "Djibouti Flag"
        )
    }
}
