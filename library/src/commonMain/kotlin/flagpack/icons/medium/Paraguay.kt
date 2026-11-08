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
 * Paraguay Flag (20x15dp)
 *
 * - ISO Alpha-2: PY
 * - ISO Alpha-3: PRY
 * - ISO Numeric: 600
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Paraguay: ImageVector by lazy {
    ImageVector.Builder(
        name = "Paraguay:PY:PRY:600:Medium",
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
                stroke = SolidColor(Color(0xFF272727)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.188f, 7.5f)
                curveTo(12.188f, 8.708f, 11.208f, 9.688f, 10f, 9.688f)
                curveTo(8.792f, 9.688f, 7.813f, 8.708f, 7.813f, 7.5f)
                curveTo(7.813f, 6.292f, 8.792f, 5.313f, 10f, 5.313f)
                curveTo(11.208f, 5.313f, 12.188f, 6.292f, 12.188f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF05234)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.174f, 6.36f)
                curveTo(9.174f, 6.36f, 8.47f, 6.847f, 8.723f, 7.792f)
                curveTo(8.976f, 8.737f, 9.963f, 8.771f, 9.963f, 8.771f)
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.73f, 6.36f)
                curveTo(10.73f, 6.36f, 11.434f, 6.847f, 11.181f, 7.792f)
                curveTo(10.927f, 8.737f, 9.94f, 8.771f, 9.94f, 8.771f)
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.002f, 7.967f)
                curveTo(10.347f, 7.967f, 10.627f, 7.687f, 10.627f, 7.342f)
                curveTo(10.627f, 6.997f, 10.347f, 6.717f, 10.002f, 6.717f)
                curveTo(9.656f, 6.717f, 9.377f, 6.997f, 9.377f, 7.342f)
                curveTo(9.377f, 7.687f, 9.656f, 7.967f, 10.002f, 7.967f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ParaguayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Paraguay,
            contentDescription = "Paraguay Flag"
        )
    }
}
