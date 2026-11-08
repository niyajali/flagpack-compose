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
 * Jamaica Flag (16x12dp)
 *
 * - ISO Alpha-2: JM
 * - ISO Alpha-3: JAM
 * - ISO Numeric: 388
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Jamaica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jamaica:JM:JAM:388:Small",
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
                fill = SolidColor(Color(0xFF009933)),
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
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.35f
            ) {
                moveTo(-0.07f, -0.521f)
                lineTo(-1.175f, -1.432f)
                verticalLineTo(0f)
                verticalLineTo(12f)
                verticalLineTo(13.432f)
                lineTo(-0.07f, 12.521f)
                lineTo(7.199f, 6.521f)
                lineTo(7.829f, 6f)
                lineTo(7.199f, 5.479f)
                lineTo(-0.07f, -0.521f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.35f
            ) {
                moveTo(16.082f, -0.53f)
                lineTo(17.175f, -1.392f)
                verticalLineTo(0f)
                verticalLineTo(12f)
                verticalLineTo(13.392f)
                lineTo(16.082f, 12.53f)
                lineTo(8.473f, 6.53f)
                lineTo(7.8f, 6f)
                lineTo(8.473f, 5.47f)
                lineTo(16.082f, -0.53f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JamaicaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Jamaica,
            contentDescription = "Jamaica Flag"
        )
    }
}
