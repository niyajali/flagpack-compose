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
 * Singapore Flag (16x12dp)
 *
 * - ISO Alpha-2: SG
 * - ISO Alpha-3: SGP
 * - ISO Numeric: 702
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Singapore: ImageVector by lazy {
    ImageVector.Builder(
        name = "Singapore:SG:SGP:702:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.434f, 5.295f)
                curveTo(4.434f, 5.295f, 3.021f, 4.727f, 3.021f, 3.187f)
                curveTo(3.021f, 1.647f, 4.434f, 1.098f, 4.434f, 1.098f)
                curveTo(3.748f, 0.924f, 1.925f, 1.079f, 1.925f, 3.187f)
                curveTo(1.925f, 5.295f, 3.72f, 5.692f, 4.434f, 5.295f)
                close()
                moveTo(4.796f, 5.04f)
                lineTo(5.201f, 4.796f)
                lineTo(5.616f, 5.04f)
                lineTo(5.514f, 4.563f)
                lineTo(5.851f, 4.186f)
                horizontalLineTo(5.395f)
                lineTo(5.201f, 3.74f)
                lineTo(5.008f, 4.186f)
                lineTo(4.551f, 4.206f)
                lineTo(4.889f, 4.563f)
                lineTo(4.796f, 5.04f)
                close()
                moveTo(6.675f, 4.768f)
                lineTo(6.269f, 5.013f)
                lineTo(6.362f, 4.536f)
                lineTo(6.024f, 4.178f)
                lineTo(6.481f, 4.159f)
                lineTo(6.675f, 3.713f)
                lineTo(6.868f, 4.159f)
                horizontalLineTo(7.324f)
                lineTo(6.988f, 4.536f)
                lineTo(7.089f, 5.013f)
                lineTo(6.675f, 4.768f)
                close()
                moveTo(5.644f, 2.885f)
                lineTo(6.049f, 2.64f)
                lineTo(6.463f, 2.885f)
                lineTo(6.362f, 2.407f)
                lineTo(6.699f, 2.031f)
                horizontalLineTo(6.242f)
                lineTo(6.049f, 1.585f)
                lineTo(5.856f, 2.031f)
                lineTo(5.398f, 2.05f)
                lineTo(5.736f, 2.407f)
                lineTo(5.644f, 2.885f)
                close()
                moveTo(4.685f, 3.611f)
                lineTo(4.28f, 3.856f)
                lineTo(4.372f, 3.379f)
                lineTo(4.035f, 3.021f)
                lineTo(4.492f, 3.002f)
                lineTo(4.685f, 2.556f)
                lineTo(4.878f, 3.002f)
                horizontalLineTo(5.334f)
                lineTo(4.998f, 3.379f)
                lineTo(5.099f, 3.856f)
                lineTo(4.685f, 3.611f)
                close()
                moveTo(6.959f, 3.834f)
                lineTo(7.364f, 3.589f)
                lineTo(7.778f, 3.834f)
                lineTo(7.677f, 3.357f)
                lineTo(8.014f, 2.98f)
                horizontalLineTo(7.557f)
                lineTo(7.364f, 2.534f)
                lineTo(7.171f, 2.98f)
                lineTo(6.714f, 2.999f)
                lineTo(7.051f, 3.357f)
                lineTo(6.959f, 3.834f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SingaporePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Singapore,
            contentDescription = "Singapore Flag"
        )
    }
}
