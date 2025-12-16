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
 * Togo Flag (32x24dp)
 *
 * - ISO Alpha-2: TG
 * - ISO Alpha-3: TGO
 * - ISO Numeric: 768
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Togo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Togo:TG:TGO:768:Large",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, -1f)
                horizontalLineTo(-1f)
                verticalLineTo(0f)
                verticalLineTo(24f)
                verticalLineTo(25f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(24f)
                verticalLineTo(0f)
                verticalLineTo(-1f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(10f)
                horizontalLineTo(32f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 14f)
                verticalLineTo(18f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.25f, 10.144f)
                lineTo(4.531f, 12.446f)
                lineTo(5.975f, 8.582f)
                lineTo(3f, 5.979f)
                horizontalLineTo(6.648f)
                lineTo(8.25f, 2.13f)
                lineTo(9.473f, 5.979f)
                horizontalLineTo(13.077f)
                lineTo(10.545f, 8.582f)
                lineTo(11.791f, 12.256f)
                lineTo(8.25f, 10.144f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TogoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Togo,
            contentDescription = "Togo Flag"
        )
    }
}
