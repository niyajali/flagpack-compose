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
 * Western Sahara Flag (16x12dp)
 *
 * - ISO Alpha-2: EH
 * - ISO Alpha-3: ESH
 * - ISO Numeric: 732
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.WesternSahara: ImageVector by lazy {
    ImageVector.Builder(
        name = "Western Sahara:EH:ESH:732:Small",
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(8f, 6f)
                lineTo(0f, 12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.844f, 7.739f)
                curveTo(10.844f, 7.739f, 9.707f, 7.051f, 9.707f, 5.915f)
                curveTo(9.707f, 4.779f, 10.844f, 4.182f, 10.844f, 4.182f)
                curveTo(10.335f, 3.859f, 8.57f, 4.32f, 8.57f, 5.952f)
                curveTo(8.57f, 7.585f, 10.318f, 7.886f, 10.844f, 7.739f)
                close()
                moveTo(11.764f, 5.656f)
                lineTo(11.102f, 5.036f)
                lineTo(11.331f, 5.828f)
                lineTo(10.69f, 6.131f)
                lineTo(11.477f, 6.387f)
                lineTo(11.819f, 7.245f)
                lineTo(11.968f, 6.451f)
                lineTo(12.745f, 6.623f)
                lineTo(12.157f, 6.048f)
                lineTo(12.356f, 5.436f)
                lineTo(11.764f, 5.656f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun WesternSaharaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.WesternSahara,
            contentDescription = "Western Sahara Flag"
        )
    }
}
