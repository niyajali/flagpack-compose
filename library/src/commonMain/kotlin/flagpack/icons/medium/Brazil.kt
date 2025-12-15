package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
 * Brazil Flag (20x15dp)
 *
 * - ISO Alpha-2: BR
 * - ISO Alpha-3: BRA
 * - ISO Numeric: 076
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Brazil: ImageVector by lazy {
    ImageVector.Builder(
        name = "Brazil:BR:BRA:076:Medium",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.954f, 2.315f)
                lineTo(17.58f, 7.63f)
                lineTo(9.851f, 12.607f)
                lineTo(2.381f, 7.527f)
                lineTo(9.954f, 2.315f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFC600),
                        1f to Color(0xFFFFDE42)
                    ),
                    start = Offset(20f, 15f),
                    end = Offset(20f, 0f)
                ),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.954f, 2.315f)
                lineTo(17.58f, 7.63f)
                lineTo(9.851f, 12.607f)
                lineTo(2.381f, 7.527f)
                lineTo(9.954f, 2.315f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 10.75f)
                curveTo(11.726f, 10.75f, 13.125f, 9.351f, 13.125f, 7.625f)
                curveTo(13.125f, 5.899f, 11.726f, 4.5f, 10f, 4.5f)
                curveTo(8.274f, 4.5f, 6.875f, 5.899f, 6.875f, 7.625f)
                curveTo(6.875f, 9.351f, 8.274f, 10.75f, 10f, 10.75f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 10.75f)
                curveTo(11.726f, 10.75f, 13.125f, 9.351f, 13.125f, 7.625f)
                curveTo(13.125f, 5.899f, 11.726f, 4.5f, 10f, 4.5f)
                curveTo(8.274f, 4.5f, 6.875f, 5.899f, 6.875f, 7.625f)
                curveTo(6.875f, 9.351f, 8.274f, 10.75f, 10f, 10.75f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.988f, 9.106f)
                lineTo(8.848f, 9.18f)
                lineTo(8.875f, 9.024f)
                lineTo(8.762f, 8.914f)
                lineTo(8.918f, 8.891f)
                lineTo(8.988f, 8.75f)
                lineTo(9.057f, 8.891f)
                lineTo(9.213f, 8.914f)
                lineTo(9.1f, 9.024f)
                lineTo(9.127f, 9.18f)
                lineTo(8.988f, 9.106f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.238f, 9.106f)
                lineTo(10.098f, 9.18f)
                lineTo(10.125f, 9.024f)
                lineTo(10.012f, 8.914f)
                lineTo(10.168f, 8.891f)
                lineTo(10.238f, 8.75f)
                lineTo(10.307f, 8.891f)
                lineTo(10.463f, 8.914f)
                lineTo(10.35f, 9.024f)
                lineTo(10.377f, 9.18f)
                lineTo(10.238f, 9.106f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.238f, 9.856f)
                lineTo(10.098f, 9.93f)
                lineTo(10.125f, 9.774f)
                lineTo(10.012f, 9.664f)
                lineTo(10.168f, 9.641f)
                lineTo(10.238f, 9.5f)
                lineTo(10.307f, 9.641f)
                lineTo(10.463f, 9.664f)
                lineTo(10.35f, 9.774f)
                lineTo(10.377f, 9.93f)
                lineTo(10.238f, 9.856f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.613f, 7.231f)
                lineTo(9.473f, 7.305f)
                lineTo(9.5f, 7.149f)
                lineTo(9.387f, 7.039f)
                lineTo(9.543f, 7.016f)
                lineTo(9.613f, 6.875f)
                lineTo(9.682f, 7.016f)
                lineTo(9.838f, 7.039f)
                lineTo(9.725f, 7.149f)
                lineTo(9.752f, 7.305f)
                lineTo(9.613f, 7.231f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.613f, 8.481f)
                lineTo(9.473f, 8.555f)
                lineTo(9.5f, 8.399f)
                lineTo(9.387f, 8.289f)
                lineTo(9.543f, 8.266f)
                lineTo(9.613f, 8.125f)
                lineTo(9.682f, 8.266f)
                lineTo(9.838f, 8.289f)
                lineTo(9.725f, 8.399f)
                lineTo(9.752f, 8.555f)
                lineTo(9.613f, 8.481f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.737f, 7.856f)
                lineTo(8.598f, 7.93f)
                lineTo(8.625f, 7.774f)
                lineTo(8.512f, 7.664f)
                lineTo(8.668f, 7.641f)
                lineTo(8.737f, 7.5f)
                lineTo(8.807f, 7.641f)
                lineTo(8.963f, 7.664f)
                lineTo(8.85f, 7.774f)
                lineTo(8.877f, 7.93f)
                lineTo(8.737f, 7.856f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.862f, 8.356f)
                lineTo(7.723f, 8.43f)
                lineTo(7.75f, 8.274f)
                lineTo(7.637f, 8.164f)
                lineTo(7.793f, 8.141f)
                lineTo(7.862f, 8f)
                lineTo(7.932f, 8.141f)
                lineTo(8.088f, 8.164f)
                lineTo(7.975f, 8.274f)
                lineTo(8.002f, 8.43f)
                lineTo(7.862f, 8.356f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.738f, 6.231f)
                lineTo(10.598f, 6.305f)
                lineTo(10.625f, 6.149f)
                lineTo(10.512f, 6.039f)
                lineTo(10.668f, 6.016f)
                lineTo(10.738f, 5.875f)
                lineTo(10.807f, 6.016f)
                lineTo(10.963f, 6.039f)
                lineTo(10.851f, 6.149f)
                lineTo(10.877f, 6.305f)
                lineTo(10.738f, 6.231f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(6.203f, 6.873f)
                lineTo(6.297f, 5.627f)
                curveTo(9.296f, 5.853f, 11.663f, 6.839f, 13.368f, 8.593f)
                lineTo(12.471f, 9.464f)
                curveTo(10.993f, 7.944f, 8.914f, 7.078f, 6.203f, 6.873f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BrazilPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Brazil,
            contentDescription = "Brazil Flag"
        )
    }
}
