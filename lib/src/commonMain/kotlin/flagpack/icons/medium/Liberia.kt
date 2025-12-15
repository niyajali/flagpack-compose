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
 * Liberia Flag (20x15dp)
 *
 * - ISO Alpha-2: LR
 * - ISO Alpha-3: LBR
 * - ISO Numeric: 430
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Liberia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liberia:LR:LBR:430:Medium",
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
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.017f, 3.438f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(1.875f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(-0.037f, 6.875f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.07f, 10.25f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.063f, 13.438f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.083f, 5.758f)
                lineTo(3.257f, 7.025f)
                lineTo(3.84f, 4.856f)
                lineTo(2.5f, 3.47f)
                lineTo(4.315f, 3.395f)
                lineTo(5.083f, 1.25f)
                lineTo(5.851f, 3.395f)
                horizontalLineTo(7.662f)
                lineTo(6.325f, 4.856f)
                lineTo(6.995f, 6.897f)
                lineTo(5.083f, 5.758f)
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
            imageVector = FlagIcons.Medium.Liberia,
            contentDescription = "Liberia Flag"
        )
    }
}
