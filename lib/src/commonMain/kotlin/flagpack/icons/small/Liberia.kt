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
 * Liberia Flag (16x12dp)
 *
 * - ISO Alpha-2: LR
 * - ISO Alpha-3: LBR
 * - ISO Numeric: 430
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Liberia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liberia:LR:LBR:430:Small",
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
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.014f, 2.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(1.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(-0.029f, 5.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.056f, 8.2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.051f, 10.75f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.066f, 4.607f)
                lineTo(2.606f, 5.62f)
                lineTo(3.072f, 3.884f)
                lineTo(2f, 2.776f)
                lineTo(3.452f, 2.716f)
                lineTo(4.066f, 1f)
                lineTo(4.681f, 2.716f)
                horizontalLineTo(6.13f)
                lineTo(5.06f, 3.884f)
                lineTo(5.596f, 5.517f)
                lineTo(4.066f, 4.607f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LiberiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Liberia,
            contentDescription = "Liberia Flag"
        )
    }
}
