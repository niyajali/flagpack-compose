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
 * Japan Flag (20x15dp)
 *
 * - ISO Alpha-2: JP
 * - ISO Alpha-3: JPN
 * - ISO Numeric: 392
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Japan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Japan:JP:JPN:392:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 12.188f)
                curveTo(12.589f, 12.188f, 14.688f, 10.089f, 14.688f, 7.5f)
                curveTo(14.688f, 4.911f, 12.589f, 2.813f, 10f, 2.813f)
                curveTo(7.411f, 2.813f, 5.313f, 4.911f, 5.313f, 7.5f)
                curveTo(5.313f, 10.089f, 7.411f, 12.188f, 10f, 12.188f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JapanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Japan,
            contentDescription = "Japan Flag"
        )
    }
}
