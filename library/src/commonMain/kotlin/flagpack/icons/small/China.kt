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
 * China Flag (16x12dp)
 *
 * - ISO Alpha-2: CN
 * - ISO Alpha-3: CHN
 * - ISO Numeric: 156
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.China: ImageVector by lazy {
    ImageVector.Builder(
        name = "China:CN:CHN:156:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.557f, 4.878f)
                lineTo(1.61f, 6.403f)
                lineTo(2.354f, 4.096f)
                lineTo(1.055f, 2.896f)
                lineTo(2.813f, 2.831f)
                lineTo(3.557f, 0.974f)
                lineTo(4.301f, 2.831f)
                horizontalLineTo(6.055f)
                lineTo(4.76f, 4.096f)
                lineTo(5.35f, 6.403f)
                lineTo(3.557f, 4.878f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.508f, 3.086f)
                lineTo(6.691f, 3.579f)
                lineTo(6.878f, 2.617f)
                lineTo(6.197f, 1.897f)
                lineTo(7.118f, 1.858f)
                lineTo(7.508f, 0.959f)
                lineTo(7.898f, 1.858f)
                horizontalLineTo(8.817f)
                lineTo(8.139f, 2.617f)
                lineTo(8.343f, 3.579f)
                lineTo(7.508f, 3.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.508f, 5.086f)
                lineTo(7.691f, 5.579f)
                lineTo(7.878f, 4.617f)
                lineTo(7.197f, 3.897f)
                lineTo(8.118f, 3.858f)
                lineTo(8.508f, 2.959f)
                lineTo(8.898f, 3.858f)
                horizontalLineTo(9.817f)
                lineTo(9.139f, 4.617f)
                lineTo(9.343f, 5.579f)
                lineTo(8.508f, 5.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.508f, 7.086f)
                lineTo(6.691f, 7.579f)
                lineTo(6.878f, 6.617f)
                lineTo(6.197f, 5.897f)
                lineTo(7.118f, 5.858f)
                lineTo(7.508f, 4.959f)
                lineTo(7.898f, 5.858f)
                horizontalLineTo(8.817f)
                lineTo(8.139f, 6.617f)
                lineTo(8.343f, 7.579f)
                lineTo(7.508f, 7.086f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.508f, 8.086f)
                lineTo(4.691f, 8.579f)
                lineTo(4.878f, 7.617f)
                lineTo(4.197f, 6.897f)
                lineTo(5.118f, 6.858f)
                lineTo(5.508f, 5.959f)
                lineTo(5.898f, 6.858f)
                horizontalLineTo(6.817f)
                lineTo(6.139f, 7.617f)
                lineTo(6.343f, 8.579f)
                lineTo(5.508f, 8.086f)
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
            imageVector = FlagIcons.Small.China,
            contentDescription = "China Flag"
        )
    }
}
