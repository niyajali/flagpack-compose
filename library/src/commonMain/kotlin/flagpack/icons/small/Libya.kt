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
 * Libya Flag (16x12dp)
 *
 * - ISO Alpha-2: LY
 * - ISO Alpha-3: LBY
 * - ISO Numeric: 434
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Libya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Libya:LY:LBY:434:Small",
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
                fill = SolidColor(Color(0xFF55BA07)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.899f, 7.533f)
                curveTo(7.003f, 7.348f, 6.775f, 6.813f, 6.784f, 6.089f)
                curveTo(6.784f, 5.324f, 7.183f, 4.616f, 7.89f, 4.531f)
                curveTo(8.597f, 4.446f, 9.175f, 4.71f, 9.479f, 5.078f)
                curveTo(9.225f, 4.079f, 8.384f, 3.97f, 7.739f, 3.97f)
                curveTo(6.767f, 3.962f, 5.741f, 4.634f, 5.741f, 6.164f)
                curveTo(5.741f, 7.533f, 6.649f, 8.21f, 7.767f, 8.232f)
                curveTo(9.165f, 8.232f, 9.383f, 7.267f, 9.424f, 6.938f)
                curveTo(9.342f, 6.996f, 9.267f, 7.066f, 9.19f, 7.138f)
                curveTo(8.91f, 7.396f, 8.605f, 7.679f, 7.899f, 7.533f)
                close()
                moveTo(10.108f, 5.607f)
                lineTo(9.47f, 5.854f)
                lineTo(10.132f, 6.146f)
                lineTo(10.108f, 6.921f)
                lineTo(10.61f, 6.386f)
                lineTo(11.339f, 6.536f)
                lineTo(10.897f, 5.943f)
                lineTo(11.283f, 5.372f)
                lineTo(10.674f, 5.5f)
                lineTo(10.244f, 5.014f)
                lineTo(10.108f, 5.607f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LibyaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Libya,
            contentDescription = "Libya Flag"
        )
    }
}
