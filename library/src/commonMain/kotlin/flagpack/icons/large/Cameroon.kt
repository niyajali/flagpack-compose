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
 * Cameroon Flag (32x24dp)
 *
 * - ISO Alpha-2: CM
 * - ISO Alpha-3: CMR
 * - ISO Numeric: 120
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Cameroon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cameroon:CM:CMR:120:Large",
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
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.075f, 14.49f)
                lineTo(12.59f, 16.908f)
                lineTo(13.704f, 12.767f)
                lineTo(11.145f, 10.122f)
                lineTo(14.61f, 9.979f)
                lineTo(16.075f, 5.884f)
                lineTo(17.541f, 9.979f)
                horizontalLineTo(21f)
                lineTo(18.447f, 12.767f)
                lineTo(19.726f, 16.664f)
                lineTo(16.075f, 14.49f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CameroonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Cameroon,
            contentDescription = "Cameroon Flag"
        )
    }
}
