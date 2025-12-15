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
 * Jamaica Flag (20x15dp)
 *
 * - ISO Alpha-2: JM
 * - ISO Alpha-3: JAM
 * - ISO Numeric: 388
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Jamaica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jamaica:JM:JAM:388:Medium",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.6875f
            ) {
                moveTo(-0.088f, -0.651f)
                lineTo(-1.469f, -1.791f)
                verticalLineTo(0f)
                verticalLineTo(15f)
                verticalLineTo(16.791f)
                lineTo(-0.088f, 15.651f)
                lineTo(8.998f, 8.151f)
                lineTo(9.787f, 7.5f)
                lineTo(8.998f, 6.849f)
                lineTo(-0.088f, -0.651f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.6875f
            ) {
                moveTo(20.103f, -0.663f)
                lineTo(21.469f, -1.74f)
                verticalLineTo(0f)
                verticalLineTo(15f)
                verticalLineTo(16.74f)
                lineTo(20.103f, 15.663f)
                lineTo(10.591f, 8.163f)
                lineTo(9.751f, 7.5f)
                lineTo(10.591f, 6.837f)
                lineTo(20.103f, -0.663f)
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
            imageVector = FlagIcons.Medium.Jamaica,
            contentDescription = "Jamaica Flag"
        )
    }
}
