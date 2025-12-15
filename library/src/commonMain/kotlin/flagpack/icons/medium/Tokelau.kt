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
 * Tokelau Flag (20x15dp)
 *
 * - ISO Alpha-2: TK
 * - ISO Alpha-3: TKL
 * - ISO Numeric: 772
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Tokelau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tokelau:TK:TKL:772:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.059f, 6.29f)
                lineTo(1.506f, 6.632f)
                lineTo(1.72f, 6.057f)
                lineTo(1.25f, 5.622f)
                horizontalLineTo(1.821f)
                lineTo(2.059f, 5f)
                lineTo(2.241f, 5.622f)
                horizontalLineTo(2.813f)
                lineTo(2.401f, 6.057f)
                lineTo(2.602f, 6.632f)
                lineTo(2.059f, 6.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.559f, 3.79f)
                lineTo(4.006f, 4.132f)
                lineTo(4.22f, 3.557f)
                lineTo(3.75f, 3.122f)
                horizontalLineTo(4.321f)
                lineTo(4.559f, 2.5f)
                lineTo(4.741f, 3.122f)
                horizontalLineTo(5.313f)
                lineTo(4.901f, 3.557f)
                lineTo(5.102f, 4.132f)
                lineTo(4.559f, 3.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.059f, 6.29f)
                lineTo(6.506f, 6.632f)
                lineTo(6.72f, 6.057f)
                lineTo(6.25f, 5.622f)
                horizontalLineTo(6.821f)
                lineTo(7.059f, 5f)
                lineTo(7.241f, 5.622f)
                horizontalLineTo(7.813f)
                lineTo(7.401f, 6.057f)
                lineTo(7.602f, 6.632f)
                lineTo(7.059f, 6.29f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.559f, 8.79f)
                lineTo(4.006f, 9.132f)
                lineTo(4.22f, 8.557f)
                lineTo(3.75f, 8.122f)
                horizontalLineTo(4.321f)
                lineTo(4.559f, 7.5f)
                lineTo(4.741f, 8.122f)
                horizontalLineTo(5.313f)
                lineTo(4.901f, 8.557f)
                lineTo(5.102f, 9.132f)
                lineTo(4.559f, 8.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.526f, 3.414f)
                curveTo(12.974f, 4.675f, 4.588f, 10.341f, 4.588f, 10.341f)
                horizontalLineTo(18.558f)
                curveTo(18.418f, 10.31f, 18.288f, 10.284f, 18.165f, 10.259f)
                curveTo(17.14f, 10.055f, 16.634f, 9.954f, 15.526f, 7.748f)
                curveTo(14.286f, 5.278f, 15.526f, 3.414f, 15.526f, 3.414f)
                close()
                moveTo(4.135f, 11.228f)
                lineTo(3.944f, 11.703f)
                lineTo(4.135f, 12.225f)
                lineTo(18.356f, 12.5f)
                lineTo(18.75f, 11.775f)
                lineTo(18.356f, 11.253f)
                lineTo(4.135f, 11.228f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TokelauPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Tokelau,
            contentDescription = "Tokelau Flag"
        )
    }
}
