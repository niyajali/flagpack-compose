package flagpack.icons.medium

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
 * Saint Kitts and Nevis Flag (20x15dp)
 *
 * - ISO Alpha-2: KN
 * - ISO Alpha-3: KNA
 * - ISO Numeric: 659
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SaintKittsAndNevis: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Kitts and Nevis:KN:KNA:659:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(20f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 1.5625f
            ) {
                moveTo(0.397f, 17.47f)
                lineTo(0.85f, 17.974f)
                lineTo(1.413f, 17.598f)
                lineTo(24.076f, 2.471f)
                lineTo(24.826f, 1.971f)
                lineTo(24.224f, 1.3f)
                lineTo(20.899f, -2.41f)
                lineTo(20.446f, -2.914f)
                lineTo(19.883f, -2.538f)
                lineTo(-2.78f, 12.589f)
                lineTo(-3.53f, 13.089f)
                lineTo(-2.928f, 13.76f)
                lineTo(0.397f, 17.47f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.555f, 10.574f)
                lineTo(6.875f, 11.758f)
                lineTo(6.44f, 10.424f)
                lineTo(5.089f, 9.995f)
                lineTo(6.215f, 9.307f)
                lineTo(6.08f, 7.911f)
                lineTo(7.191f, 8.766f)
                lineTo(8.342f, 8.128f)
                lineTo(8.019f, 9.549f)
                lineTo(8.943f, 10.612f)
                lineTo(7.555f, 10.574f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.805f, 6.478f)
                lineTo(13.125f, 7.662f)
                lineTo(12.691f, 6.328f)
                lineTo(11.339f, 5.899f)
                lineTo(12.465f, 5.211f)
                lineTo(12.33f, 3.816f)
                lineTo(13.441f, 4.67f)
                lineTo(14.592f, 4.032f)
                lineTo(14.269f, 5.453f)
                lineTo(15.193f, 6.516f)
                lineTo(13.805f, 6.478f)
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
            imageVector = FlagIcons.Medium.SaintKittsAndNevis,
            contentDescription = "Saint Kitts and Nevis Flag"
        )
    }
}
