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
 * Jordan Flag (20x15dp)
 *
 * - ISO Alpha-2: JO
 * - ISO Alpha-3: JOR
 * - ISO Numeric: 400
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Jordan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jordan:JO:JOR:400:Medium",
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF009933)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFE31D1C)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(15f)
            lineTo(12.5f, 7.5f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(12.5f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.626f, 8.669f)
                lineTo(4.457f, 9.375f)
                lineTo(4.724f, 7.998f)
                lineTo(3.75f, 6.967f)
                lineTo(5.068f, 6.911f)
                lineTo(5.626f, 5.625f)
                lineTo(6.184f, 6.911f)
                horizontalLineTo(7.5f)
                lineTo(6.529f, 7.998f)
                lineTo(6.821f, 9.375f)
                lineTo(5.626f, 8.669f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JordanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Jordan,
            contentDescription = "Jordan Flag"
        )
    }
}
