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
 * Sao Tome and Principe Flag (16x12dp)
 *
 * - ISO Alpha-2: ST
 * - ISO Alpha-3: STP
 * - ISO Numeric: 678
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SaoTomeAndPrincipe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sao Tome and Principe:ST:STP:678:Small",
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
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(5f, 6f)
                lineTo(0f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.501f, 6.935f)
                lineTo(7.566f, 7.5f)
                lineTo(7.779f, 6.398f)
                lineTo(7f, 5.573f)
                lineTo(8.055f, 5.529f)
                lineTo(8.501f, 4.5f)
                lineTo(8.947f, 5.529f)
                horizontalLineTo(10f)
                lineTo(9.223f, 6.398f)
                lineTo(9.457f, 7.5f)
                lineTo(8.501f, 6.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.501f, 6.935f)
                lineTo(11.566f, 7.5f)
                lineTo(11.779f, 6.398f)
                lineTo(11f, 5.573f)
                lineTo(12.055f, 5.529f)
                lineTo(12.501f, 4.5f)
                lineTo(12.947f, 5.529f)
                horizontalLineTo(14f)
                lineTo(13.223f, 6.398f)
                lineTo(13.457f, 7.5f)
                lineTo(12.501f, 6.935f)
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
            imageVector = FlagIcons.Small.SaoTomeAndPrincipe,
            contentDescription = "Sao Tome and Principe Flag"
        )
    }
}
