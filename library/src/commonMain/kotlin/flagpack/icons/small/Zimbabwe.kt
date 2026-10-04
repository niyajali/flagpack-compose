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
 * Zimbabwe Flag (16x12dp)
 *
 * - ISO Alpha-2: ZW
 * - ISO Alpha-3: ZWE
 * - ISO Numeric: 716
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Zimbabwe: ImageVector by lazy {
    ImageVector.Builder(
        name = "Zimbabwe:ZW:ZWE:716:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 1f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(1f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.75f
            ) {
                moveTo(0f, 4.125f)
                horizontalLineTo(-0.875f)
                verticalLineTo(5f)
                verticalLineTo(7f)
                verticalLineTo(7.875f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.875f)
                verticalLineTo(7f)
                verticalLineTo(5f)
                verticalLineTo(4.125f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 2f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                verticalLineTo(2f)
                horizontalLineTo(0f)
                close()
                moveTo(0f, 12f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF7FCFF)),
            stroke = SolidColor(Color(0xFF272727)),
            strokeLineWidth = 1f
        ) {
            moveTo(0.298f, -0.401f)
            lineTo(-0.5f, -0.995f)
            verticalLineTo(0f)
            verticalLineTo(12f)
            verticalLineTo(12.981f)
            lineTo(0.294f, 12.405f)
            lineTo(8.459f, 6.481f)
            lineTo(9.01f, 6.081f)
            lineTo(8.464f, 5.675f)
            lineTo(0.298f, -0.401f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0.298f, -0.401f)
                lineTo(-0.5f, -0.995f)
                verticalLineTo(0f)
                verticalLineTo(12f)
                verticalLineTo(12.981f)
                lineTo(0.294f, 12.405f)
                lineTo(8.459f, 6.481f)
                lineTo(9.01f, 6.081f)
                lineTo(8.464f, 5.675f)
                lineTo(0.298f, -0.401f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.739f, 7.139f)
                lineTo(1.85f, 8.664f)
                lineTo(2.716f, 6.626f)
                lineTo(1.227f, 5.192f)
                horizontalLineTo(2.985f)
                lineTo(3.706f, 3.463f)
                lineTo(4.472f, 5.192f)
                horizontalLineTo(6.227f)
                lineTo(4.659f, 6.626f)
                lineTo(5.444f, 8.664f)
                lineTo(3.739f, 7.139f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.509f, 4.211f)
                curveTo(2.509f, 4.211f, 2.481f, 4.145f, 2.643f, 4.086f)
                curveTo(2.805f, 4.028f, 2.855f, 3.904f, 2.981f, 3.995f)
                curveTo(3.108f, 4.086f, 3.188f, 3.903f, 3.224f, 4.166f)
                curveTo(3.261f, 4.429f, 3.361f, 4.843f, 3.361f, 4.843f)
                lineTo(5.005f, 6.079f)
                horizontalLineTo(4.696f)
                curveTo(4.696f, 6.079f, 4.215f, 6.785f, 4.294f, 7.405f)
                curveTo(4.294f, 7.405f, 3.963f, 7.355f, 3.513f, 7.355f)
                curveTo(3.063f, 7.355f, 2.769f, 7.463f, 2.769f, 7.463f)
                lineTo(2.509f, 6.501f)
                curveTo(2.509f, 6.501f, 2.603f, 6.339f, 2.643f, 6.209f)
                curveTo(2.684f, 6.079f, 2.851f, 6.055f, 2.851f, 5.951f)
                curveTo(2.851f, 5.847f, 2.686f, 5.761f, 2.769f, 5.492f)
                curveTo(2.851f, 5.224f, 2.851f, 4.422f, 2.851f, 4.422f)
                curveTo(2.851f, 4.422f, 2.59f, 4.307f, 2.643f, 4.307f)
                curveTo(2.696f, 4.307f, 2.817f, 4.211f, 2.73f, 4.211f)
                curveTo(2.643f, 4.211f, 2.509f, 4.211f, 2.509f, 4.211f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ZimbabwePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Zimbabwe,
            contentDescription = "Zimbabwe Flag"
        )
    }
}
