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
 * Western Sahara Flag (32x24dp)
 *
 * - ISO Alpha-2: EH
 * - ISO Alpha-3: ESH
 * - ISO Numeric: 732
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.WesternSahara: ImageVector by lazy {
    ImageVector.Builder(
        name = "Western Sahara:EH:ESH:732:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(16f, 12f)
                lineTo(0f, 24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.688f, 15.477f)
                curveTo(21.688f, 15.477f, 19.413f, 14.102f, 19.413f, 11.83f)
                curveTo(19.413f, 9.559f, 21.688f, 8.364f, 21.688f, 8.364f)
                curveTo(20.67f, 7.718f, 17.139f, 8.64f, 17.139f, 11.905f)
                curveTo(17.139f, 15.17f, 20.636f, 15.773f, 21.688f, 15.477f)
                close()
                moveTo(23.528f, 11.313f)
                lineTo(22.205f, 10.072f)
                lineTo(22.662f, 11.656f)
                lineTo(21.381f, 12.263f)
                lineTo(22.954f, 12.775f)
                lineTo(23.637f, 14.489f)
                lineTo(23.936f, 12.902f)
                lineTo(25.49f, 13.245f)
                lineTo(24.315f, 12.097f)
                lineTo(24.712f, 10.872f)
                lineTo(23.528f, 11.313f)
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
            imageVector = FlagIcons.Large.WesternSahara,
            contentDescription = "Western Sahara Flag"
        )
    }
}
