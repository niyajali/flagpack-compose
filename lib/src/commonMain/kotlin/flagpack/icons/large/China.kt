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
 * China Flag (32x24dp)
 *
 * - ISO Alpha-2: CN
 * - ISO Alpha-3: CHN
 * - ISO Numeric: 156
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.China: ImageVector by lazy {
    ImageVector.Builder(
        name = "China:CN:CHN:156:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.016f, 4.548f)
                lineTo(14.006f, 5.158f)
                lineTo(14.236f, 3.968f)
                lineTo(13.395f, 3.078f)
                lineTo(14.534f, 3.029f)
                lineTo(15.016f, 1.918f)
                lineTo(15.498f, 3.029f)
                horizontalLineTo(16.635f)
                lineTo(15.795f, 3.968f)
                lineTo(16.048f, 5.158f)
                lineTo(15.016f, 4.548f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.018f, 9.607f)
                lineTo(4.137f, 11.158f)
                lineTo(4.794f, 8.132f)
                lineTo(2.395f, 5.867f)
                lineTo(5.643f, 5.744f)
                lineTo(7.018f, 2.918f)
                lineTo(8.392f, 5.744f)
                horizontalLineTo(11.635f)
                lineTo(9.241f, 8.132f)
                lineTo(9.962f, 11.158f)
                lineTo(7.018f, 9.607f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.016f, 8.548f)
                lineTo(16.006f, 9.158f)
                lineTo(16.236f, 7.968f)
                lineTo(15.395f, 7.077f)
                lineTo(16.534f, 7.029f)
                lineTo(17.016f, 5.918f)
                lineTo(17.498f, 7.029f)
                horizontalLineTo(18.635f)
                lineTo(17.795f, 7.968f)
                lineTo(18.048f, 9.158f)
                lineTo(17.016f, 8.548f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.016f, 12.548f)
                lineTo(15.006f, 13.158f)
                lineTo(15.236f, 11.968f)
                lineTo(14.395f, 11.078f)
                lineTo(15.534f, 11.029f)
                lineTo(16.016f, 9.918f)
                lineTo(16.498f, 11.029f)
                horizontalLineTo(17.635f)
                lineTo(16.795f, 11.968f)
                lineTo(17.048f, 13.158f)
                lineTo(16.016f, 12.548f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.016f, 15.548f)
                lineTo(12.006f, 16.158f)
                lineTo(12.236f, 14.968f)
                lineTo(11.395f, 14.078f)
                lineTo(12.534f, 14.029f)
                lineTo(13.016f, 12.918f)
                lineTo(13.498f, 14.029f)
                horizontalLineTo(14.635f)
                lineTo(13.795f, 14.968f)
                lineTo(14.048f, 16.158f)
                lineTo(13.016f, 15.548f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChinaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.China,
            contentDescription = "China Flag"
        )
    }
}
