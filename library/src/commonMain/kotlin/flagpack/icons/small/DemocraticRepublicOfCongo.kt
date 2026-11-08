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
 * Democratic Republic of Congo Flag (16x12dp)
 *
 * - ISO Alpha-2: CD
 * - ISO Alpha-3: COD
 * - ISO Numeric: 180
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.DemocraticRepublicOfCongo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Democratic Republic of Congo:CD:COD:180:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFFECA00)),
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
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.465f, 4.303f)
                lineTo(0.723f, 5.512f)
                lineTo(1.279f, 3.442f)
                lineTo(0f, 2.119f)
                lineTo(1.732f, 2.047f)
                lineTo(2.465f, 0f)
                lineTo(3.198f, 2.047f)
                horizontalLineTo(4.928f)
                lineTo(3.651f, 3.442f)
                lineTo(4.291f, 5.39f)
                lineTo(2.465f, 4.303f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DemocraticRepublicOfCongoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.DemocraticRepublicOfCongo,
            contentDescription = "Democratic Republic of Congo Flag"
        )
    }
}
