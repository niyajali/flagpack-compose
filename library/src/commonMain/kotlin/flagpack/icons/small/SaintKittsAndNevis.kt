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
 * Saint Kitts and Nevis Flag (16x12dp)
 *
 * - ISO Alpha-2: KN
 * - ISO Alpha-3: KNA
 * - ISO Numeric: 659
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SaintKittsAndNevis: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Kitts and Nevis:KN:KNA:659:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
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
                moveTo(0.318f, 13.976f)
                lineTo(0.68f, 14.38f)
                lineTo(1.13f, 14.079f)
                lineTo(19.261f, 1.977f)
                lineTo(19.86f, 1.577f)
                lineTo(19.379f, 1.04f)
                lineTo(16.719f, -1.928f)
                lineTo(16.357f, -2.331f)
                lineTo(15.906f, -2.031f)
                lineTo(-2.224f, 10.071f)
                lineTo(-2.824f, 10.471f)
                lineTo(-2.342f, 11.008f)
                lineTo(0.318f, 13.976f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.044f, 8.459f)
                lineTo(5.5f, 9.406f)
                lineTo(5.152f, 8.339f)
                lineTo(4.071f, 7.996f)
                lineTo(4.972f, 7.445f)
                lineTo(4.864f, 6.329f)
                lineTo(5.753f, 7.013f)
                lineTo(6.674f, 6.502f)
                lineTo(6.415f, 7.639f)
                lineTo(7.154f, 8.49f)
                lineTo(6.044f, 8.459f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.044f, 5.183f)
                lineTo(10.5f, 6.13f)
                lineTo(10.152f, 5.063f)
                lineTo(9.071f, 4.719f)
                lineTo(9.972f, 4.169f)
                lineTo(9.864f, 3.053f)
                lineTo(10.753f, 3.736f)
                lineTo(11.674f, 3.226f)
                lineTo(11.415f, 4.363f)
                lineTo(12.154f, 5.213f)
                lineTo(11.044f, 5.183f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaintKittsAndNevisPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SaintKittsAndNevis,
            contentDescription = "Saint Kitts and Nevis Flag"
        )
    }
}
