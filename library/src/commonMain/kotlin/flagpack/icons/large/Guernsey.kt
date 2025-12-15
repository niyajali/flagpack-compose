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
 * Guernsey Flag (32x24dp)
 *
 * - ISO Alpha-2: GG
 * - ISO Alpha-3: GGY
 * - ISO Numeric: 831
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Guernsey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guernsey:GG:GGY:831:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(24f)
                horizontalLineTo(12f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.005f, 3.046f)
                lineTo(14f, 4.8f)
                verticalLineTo(10f)
                horizontalLineTo(6.865f)
                verticalLineTo(9.943f)
                lineTo(5.106f, 8.945f)
                verticalLineTo(14.906f)
                lineTo(6.771f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(19.051f)
                lineTo(13.005f, 20.805f)
                horizontalLineTo(18.966f)
                lineTo(18.008f, 19.046f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(25.201f)
                lineTo(26.865f, 14.906f)
                verticalLineTo(8.945f)
                lineTo(25.106f, 9.943f)
                verticalLineTo(10f)
                horizontalLineTo(18f)
                verticalLineTo(4.805f)
                horizontalLineTo(18.008f)
                lineTo(18.966f, 3.046f)
                horizontalLineTo(13.005f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuernseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Guernsey,
            contentDescription = "Guernsey Flag"
        )
    }
}
