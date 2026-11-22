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
 * Honduras Flag (20x15dp)
 *
 * - ISO Alpha-2: HN
 * - ISO Alpha-3: HND
 * - ISO Numeric: 340
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Honduras: ImageVector by lazy {
    ImageVector.Builder(
        name = "Honduras:HN:HND:340:Medium",
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.511f, 8.207f)
                lineTo(9.777f, 8.594f)
                lineTo(9.917f, 7.776f)
                lineTo(9.322f, 7.136f)
                horizontalLineTo(10.144f)
                lineTo(10.511f, 6.332f)
                lineTo(10.879f, 7.136f)
                horizontalLineTo(11.7f)
                lineTo(11.106f, 7.776f)
                lineTo(11.246f, 8.594f)
                lineTo(10.511f, 8.207f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.761f, 6.957f)
                lineTo(6.027f, 7.344f)
                lineTo(6.167f, 6.526f)
                lineTo(5.572f, 5.886f)
                horizontalLineTo(6.394f)
                lineTo(6.761f, 5.082f)
                lineTo(7.129f, 5.886f)
                horizontalLineTo(7.95f)
                lineTo(7.356f, 6.526f)
                lineTo(7.496f, 7.344f)
                lineTo(6.761f, 6.957f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.761f, 9.457f)
                lineTo(6.027f, 9.844f)
                lineTo(6.167f, 9.026f)
                lineTo(5.572f, 8.386f)
                horizontalLineTo(6.394f)
                lineTo(6.761f, 7.582f)
                lineTo(7.129f, 8.386f)
                horizontalLineTo(7.95f)
                lineTo(7.356f, 9.026f)
                lineTo(7.496f, 9.844f)
                lineTo(6.761f, 9.457f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.261f, 6.957f)
                lineTo(13.527f, 7.344f)
                lineTo(13.667f, 6.526f)
                lineTo(13.073f, 5.886f)
                horizontalLineTo(13.894f)
                lineTo(14.261f, 5.082f)
                lineTo(14.629f, 5.886f)
                horizontalLineTo(15.45f)
                lineTo(14.856f, 6.526f)
                lineTo(14.996f, 7.344f)
                lineTo(14.261f, 6.957f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.261f, 9.457f)
                lineTo(13.527f, 9.844f)
                lineTo(13.667f, 9.026f)
                lineTo(13.073f, 8.386f)
                horizontalLineTo(13.894f)
                lineTo(14.261f, 7.582f)
                lineTo(14.629f, 8.386f)
                horizontalLineTo(15.45f)
                lineTo(14.856f, 9.026f)
                lineTo(14.996f, 9.844f)
                lineTo(14.261f, 9.457f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HondurasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Honduras,
            contentDescription = "Honduras Flag"
        )
    }
}
