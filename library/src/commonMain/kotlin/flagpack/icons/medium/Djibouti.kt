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
 * Djibouti Flag (20x15dp)
 *
 * - ISO Alpha-2: DJ
 * - ISO Alpha-3: DJI
 * - ISO Numeric: 262
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Djibouti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Djibouti:DJ:DJI:262:Medium",
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFF6699FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1.25f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(-1.25f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(15f)
            lineTo(11.25f, 7.5f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(11.25f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.376f, 8.794f)
                lineTo(3.207f, 9.5f)
                lineTo(3.474f, 8.123f)
                lineTo(2.5f, 7.092f)
                lineTo(3.818f, 7.036f)
                lineTo(4.376f, 5.75f)
                lineTo(4.934f, 7.036f)
                horizontalLineTo(6.25f)
                lineTo(5.279f, 8.123f)
                lineTo(5.571f, 9.5f)
                lineTo(4.376f, 8.794f)
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
            imageVector = FlagIcons.Medium.Djibouti,
            contentDescription = "Djibouti Flag"
        )
    }
}
