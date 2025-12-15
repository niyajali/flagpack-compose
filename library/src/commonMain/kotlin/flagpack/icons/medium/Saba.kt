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
 * Saba Flag (20x15dp)
 *
 * - ISO Alpha-2: BQ-SA
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Saba: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saba:BQ-SA:::Medium",
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.29f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                lineTo(0f, 7.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF00000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 7.29f)
                verticalLineTo(0f)
                horizontalLineTo(10f)
                lineTo(20f, 7.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.29f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                lineTo(0f, 7.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 7.29f)
                verticalLineTo(15.21f)
                lineTo(10f, 15f)
                lineTo(20f, 7.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.821f, 8.91f)
                lineTo(7.623f, 10.477f)
                lineTo(8.43f, 7.889f)
                lineTo(6.25f, 6.304f)
                horizontalLineTo(8.965f)
                lineTo(9.821f, 3.75f)
                lineTo(10.728f, 6.304f)
                horizontalLineTo(13.37f)
                lineTo(11.209f, 7.889f)
                lineTo(12.031f, 10.477f)
                lineTo(9.821f, 8.91f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SabaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Saba,
            contentDescription = "Saba Flag"
        )
    }
}
