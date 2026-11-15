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
 * Djibouti Flag (16x12dp)
 *
 * - ISO Alpha-2: DJ
 * - ISO Alpha-3: DJI
 * - ISO Numeric: 262
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Djibouti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Djibouti:DJ:DJI:262:Small",
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
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF6699FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(-1f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(12f)
            lineTo(9f, 6f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(9f, 6f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.501f, 6.947f)
                lineTo(2.254f, 7.7f)
                lineTo(2.539f, 6.231f)
                lineTo(1.5f, 5.131f)
                lineTo(2.906f, 5.072f)
                lineTo(3.501f, 3.7f)
                lineTo(4.096f, 5.072f)
                horizontalLineTo(5.5f)
                lineTo(4.464f, 6.231f)
                lineTo(4.776f, 7.7f)
                lineTo(3.501f, 6.947f)
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
            imageVector = FlagIcons.Small.Djibouti,
            contentDescription = "Djibouti Flag"
        )
    }
}
