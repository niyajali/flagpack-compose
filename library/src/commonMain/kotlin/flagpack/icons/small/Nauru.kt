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
 * Nauru Flag (16x12dp)
 *
 * - ISO Alpha-2: NR
 * - ISO Alpha-3: NRU
 * - ISO Numeric: 520
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Nauru: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nauru:NR:NRU:520:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.415f, 9.79f)
                lineTo(3.642f, 10.792f)
                lineTo(3.607f, 9.527f)
                lineTo(2.392f, 9.884f)
                lineTo(3.107f, 8.84f)
                lineTo(1.915f, 8.415f)
                lineTo(3.107f, 7.99f)
                lineTo(2.392f, 6.945f)
                lineTo(3.607f, 7.302f)
                lineTo(3.642f, 6.037f)
                lineTo(4.415f, 7.04f)
                lineTo(5.187f, 6.037f)
                lineTo(5.223f, 7.302f)
                lineTo(6.437f, 6.945f)
                lineTo(5.723f, 7.99f)
                lineTo(6.915f, 8.415f)
                lineTo(5.723f, 8.84f)
                lineTo(6.437f, 9.884f)
                lineTo(5.223f, 9.527f)
                lineTo(5.187f, 10.792f)
                lineTo(4.415f, 9.79f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NauruPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Nauru,
            contentDescription = "Nauru Flag"
        )
    }
}
