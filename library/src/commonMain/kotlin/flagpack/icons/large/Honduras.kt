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
 * Honduras Flag (32x24dp)
 *
 * - ISO Alpha-2: HN
 * - ISO Alpha-3: HND
 * - ISO Numeric: 340
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Honduras: ImageVector by lazy {
    ImageVector.Builder(
        name = "Honduras:HN:HND:340:Large",
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
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
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.402f, 12.671f)
                lineTo(15.536f, 13.118f)
                lineTo(15.701f, 12.171f)
                lineTo(15f, 11.431f)
                horizontalLineTo(15.969f)
                lineTo(16.402f, 10.5f)
                lineTo(16.835f, 11.431f)
                horizontalLineTo(17.804f)
                lineTo(17.103f, 12.171f)
                lineTo(17.269f, 13.118f)
                lineTo(16.402f, 12.671f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.318f, 10.503f)
                lineTo(9.452f, 10.95f)
                lineTo(9.617f, 10.003f)
                lineTo(8.916f, 9.263f)
                horizontalLineTo(9.885f)
                lineTo(10.318f, 8.332f)
                lineTo(10.751f, 9.263f)
                horizontalLineTo(11.72f)
                lineTo(11.019f, 10.003f)
                lineTo(11.185f, 10.95f)
                lineTo(10.318f, 10.503f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.318f, 14.703f)
                lineTo(9.452f, 15.15f)
                lineTo(9.617f, 14.203f)
                lineTo(8.916f, 13.463f)
                horizontalLineTo(9.885f)
                lineTo(10.318f, 12.532f)
                lineTo(10.751f, 13.463f)
                horizontalLineTo(11.72f)
                lineTo(11.019f, 14.203f)
                lineTo(11.185f, 15.15f)
                lineTo(10.318f, 14.703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.318f, 10.503f)
                lineTo(21.452f, 10.95f)
                lineTo(21.617f, 10.003f)
                lineTo(20.916f, 9.263f)
                horizontalLineTo(21.885f)
                lineTo(22.318f, 8.332f)
                lineTo(22.751f, 9.263f)
                horizontalLineTo(23.72f)
                lineTo(23.019f, 10.003f)
                lineTo(23.185f, 10.95f)
                lineTo(22.318f, 10.503f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00BCE4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.318f, 14.703f)
                lineTo(21.452f, 15.15f)
                lineTo(21.617f, 14.203f)
                lineTo(20.916f, 13.463f)
                horizontalLineTo(21.885f)
                lineTo(22.318f, 12.532f)
                lineTo(22.751f, 13.463f)
                horizontalLineTo(23.72f)
                lineTo(23.019f, 14.203f)
                lineTo(23.185f, 15.15f)
                lineTo(22.318f, 14.703f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HondurasPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Honduras,
            contentDescription = "Honduras Flag"
        )
    }
}
