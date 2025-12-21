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
 * Burkina Faso Flag (16x12dp)
 *
 * - ISO Alpha-2: BF
 * - ISO Alpha-3: BFA
 * - ISO Numeric: 854
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.BurkinaFaso: ImageVector by lazy {
    ImageVector.Builder(
        name = "Burkina Faso:BF:BFA:854:Small",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.018f, 7.885f)
                lineTo(5.666f, 9.665f)
                lineTo(6.419f, 6.766f)
                lineTo(4.213f, 5.002f)
                horizontalLineTo(6.842f)
                lineTo(8.017f, 2.429f)
                lineTo(9.193f, 5.002f)
                horizontalLineTo(11.822f)
                lineTo(9.593f, 6.769f)
                lineTo(10.368f, 9.665f)
                lineTo(8.018f, 7.885f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BurkinaFasoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.BurkinaFaso,
            contentDescription = "Burkina Faso Flag"
        )
    }
}
