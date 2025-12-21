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
 * Samoa Flag (32x24dp)
 *
 * - ISO Alpha-2: WS
 * - ISO Alpha-3: WSM
 * - ISO Numeric: 882
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Samoa: ImageVector by lazy {
    ImageVector.Builder(
        name = "Samoa:WS:WSM:882:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.566f, 7.772f)
                lineTo(2.506f, 8.412f)
                lineTo(2.747f, 7.163f)
                lineTo(1.865f, 6.229f)
                lineTo(3.06f, 6.178f)
                lineTo(3.566f, 5.012f)
                lineTo(4.071f, 6.178f)
                horizontalLineTo(5.265f)
                lineTo(4.384f, 7.163f)
                lineTo(4.649f, 8.412f)
                lineTo(3.566f, 7.772f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.566f, 7.772f)
                lineTo(10.506f, 8.412f)
                lineTo(10.747f, 7.163f)
                lineTo(9.865f, 6.229f)
                lineTo(11.06f, 6.178f)
                lineTo(11.566f, 5.012f)
                lineTo(12.071f, 6.178f)
                horizontalLineTo(13.265f)
                lineTo(12.384f, 7.163f)
                lineTo(12.649f, 8.412f)
                lineTo(11.566f, 7.772f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.466f, 4.138f)
                lineTo(6.468f, 4.74f)
                lineTo(6.695f, 3.565f)
                lineTo(5.865f, 2.685f)
                lineTo(6.99f, 2.638f)
                lineTo(7.466f, 1.54f)
                lineTo(7.942f, 2.638f)
                horizontalLineTo(9.065f)
                lineTo(8.236f, 3.565f)
                lineTo(8.485f, 4.74f)
                lineTo(7.466f, 4.138f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.546f, 8.425f)
                lineTo(7.923f, 8.802f)
                lineTo(8.065f, 8.067f)
                lineTo(7.546f, 7.517f)
                lineTo(8.249f, 7.488f)
                lineTo(8.546f, 6.802f)
                lineTo(8.844f, 7.488f)
                horizontalLineTo(9.546f)
                lineTo(9.028f, 8.067f)
                lineTo(9.184f, 8.802f)
                lineTo(8.546f, 8.425f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.409f, 12.828f)
                lineTo(5.912f, 13.732f)
                lineTo(6.254f, 11.969f)
                lineTo(5.007f, 10.649f)
                lineTo(6.695f, 10.578f)
                lineTo(7.409f, 8.932f)
                lineTo(8.123f, 10.578f)
                horizontalLineTo(9.807f)
                lineTo(8.564f, 11.969f)
                lineTo(8.938f, 13.732f)
                lineTo(7.409f, 12.828f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SamoaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Samoa,
            contentDescription = "Samoa Flag"
        )
    }
}
