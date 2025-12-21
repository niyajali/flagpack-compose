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
 * Jamaica Flag (32x24dp)
 *
 * - ISO Alpha-2: JM
 * - ISO Alpha-3: JAM
 * - ISO Numeric: 388
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Jamaica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jamaica:JM:JAM:388:Large",
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
                fill = SolidColor(Color(0xFF009933)),
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
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 2.7f
            ) {
                moveTo(-0.141f, -1.041f)
                lineTo(-2.35f, -2.865f)
                verticalLineTo(0f)
                verticalLineTo(24f)
                verticalLineTo(26.865f)
                lineTo(-0.141f, 25.041f)
                lineTo(14.397f, 13.041f)
                lineTo(15.658f, 12f)
                lineTo(14.397f, 10.959f)
                lineTo(-0.141f, -1.041f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 2.7f
            ) {
                moveTo(32.164f, -1.06f)
                lineTo(34.35f, -2.784f)
                verticalLineTo(0f)
                verticalLineTo(24f)
                verticalLineTo(26.784f)
                lineTo(32.164f, 25.06f)
                lineTo(16.945f, 13.06f)
                lineTo(15.601f, 12f)
                lineTo(16.945f, 10.94f)
                lineTo(32.164f, -1.06f)
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
            imageVector = FlagIcons.Large.Jamaica,
            contentDescription = "Jamaica Flag"
        )
    }
}
