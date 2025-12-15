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
 * Sao Tome and Principe Flag (32x24dp)
 *
 * - ISO Alpha-2: ST
 * - ISO Alpha-3: STP
 * - ISO Numeric: 678
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SaoTomeAndPrincipe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sao Tome and Principe:ST:STP:678:Large",
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
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(10f, 12f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.002f, 13.871f)
                lineTo(15.131f, 15f)
                lineTo(15.558f, 12.796f)
                lineTo(14f, 11.147f)
                lineTo(16.109f, 11.058f)
                lineTo(17.002f, 9f)
                lineTo(17.894f, 11.058f)
                horizontalLineTo(20f)
                lineTo(18.446f, 12.796f)
                lineTo(18.914f, 15f)
                lineTo(17.002f, 13.871f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(25.002f, 13.871f)
                lineTo(23.131f, 15f)
                lineTo(23.558f, 12.796f)
                lineTo(22f, 11.147f)
                lineTo(24.109f, 11.058f)
                lineTo(25.002f, 9f)
                lineTo(25.894f, 11.058f)
                horizontalLineTo(28f)
                lineTo(26.446f, 12.796f)
                lineTo(26.914f, 15f)
                lineTo(25.002f, 13.871f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaoTomeAndPrincipePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SaoTomeAndPrincipe,
            contentDescription = "Sao Tome and Principe Flag"
        )
    }
}
