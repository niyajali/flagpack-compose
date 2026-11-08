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
 * Vietnam Flag (16x12dp)
 *
 * - ISO Alpha-2: VN
 * - ISO Alpha-3: VNM
 * - ISO Numeric: 704
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Vietnam: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vietnam:VN:VNM:704:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.031f, 7.99f)
                lineTo(5.456f, 9.627f)
                lineTo(6.319f, 6.761f)
                lineTo(4.482f, 4.888f)
                lineTo(7.015f, 4.833f)
                lineTo(8.135f, 2.003f)
                lineTo(9.157f, 4.87f)
                lineTo(11.683f, 4.914f)
                lineTo(9.784f, 6.821f)
                lineTo(10.671f, 9.548f)
                lineTo(8.031f, 7.99f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VietnamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Vietnam,
            contentDescription = "Vietnam Flag"
        )
    }
}
