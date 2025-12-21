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
 * Tanzania Flag (16x12dp)
 *
 * - ISO Alpha-2: TZ
 * - ISO Alpha-3: TZA
 * - ISO Numeric: 834
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Tanzania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tanzania:TZ:TZA:834:Small",
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
                fill = SolidColor(Color(0xFF3195F9)),
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
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(16f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(-0.911f, 12.72f)
                lineTo(-0.564f, 13.24f)
                lineTo(-0.044f, 12.892f)
                lineTo(18.086f, 0.791f)
                lineTo(18.606f, 0.444f)
                lineTo(18.259f, -0.076f)
                lineTo(17.149f, -1.74f)
                lineTo(16.802f, -2.259f)
                lineTo(16.282f, -1.912f)
                lineTo(-1.848f, 10.189f)
                lineTo(-2.368f, 10.536f)
                lineTo(-2.021f, 11.056f)
                lineTo(-0.911f, 12.72f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TanzaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Tanzania,
            contentDescription = "Tanzania Flag"
        )
    }
}
