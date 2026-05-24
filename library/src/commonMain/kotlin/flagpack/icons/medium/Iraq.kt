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
 * Iraq Flag (20x15dp)
 *
 * - ISO Alpha-2: IQ
 * - ISO Alpha-3: IRQ
 * - ISO Numeric: 368
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Iraq: ImageVector by lazy {
    ImageVector.Builder(
        name = "Iraq:IQ:IRQ:368:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF009C4E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.335f, 8.007f)
                curveTo(3.904f, 8.823f, 3.125f, 9.375f, 3.125f, 9.375f)
                curveTo(3.125f, 9.375f, 3.806f, 9.375f, 4.067f, 8.829f)
                horizontalLineTo(9.64f)
                verticalLineTo(7.625f)
                curveTo(9.64f, 7.625f, 9.524f, 7.047f, 9.027f, 7.047f)
                curveTo(8.531f, 7.047f, 8.419f, 7.625f, 8.419f, 7.625f)
                horizontalLineTo(6.459f)
                lineTo(8.356f, 5.951f)
                lineTo(7.987f, 5.625f)
                lineTo(5.88f, 7.485f)
                verticalLineTo(7.879f)
                horizontalLineTo(8.871f)
                verticalLineTo(7.647f)
                curveTo(8.871f, 7.647f, 8.887f, 7.513f, 9.027f, 7.513f)
                curveTo(9.167f, 7.513f, 9.133f, 7.647f, 9.133f, 7.647f)
                verticalLineTo(8.143f)
                horizontalLineTo(5.364f)
                verticalLineTo(7.465f)
                lineTo(4.956f, 7.647f)
                verticalLineTo(8.143f)
                curveTo(4.956f, 8.143f, 4.456f, 8.007f, 4.14f, 8.007f)
                curveTo(3.825f, 8.007f, 3.806f, 7.647f, 3.806f, 7.647f)
                lineTo(3.335f, 8.007f)
                close()
                moveTo(10.904f, 8.053f)
                lineTo(11.21f, 8.814f)
                horizontalLineTo(9.994f)
                verticalLineTo(5.759f)
                lineTo(10.507f, 5.923f)
                verticalLineTo(8.053f)
                horizontalLineTo(10.904f)
                close()
                moveTo(16.569f, 8.053f)
                lineTo(16.875f, 8.814f)
                horizontalLineTo(15.659f)
                verticalLineTo(5.759f)
                lineTo(16.172f, 5.923f)
                verticalLineTo(8.053f)
                horizontalLineTo(16.569f)
                close()
                moveTo(15.063f, 5.791f)
                lineTo(14.747f, 6.005f)
                verticalLineTo(8.051f)
                horizontalLineTo(14.424f)
                verticalLineTo(6.41f)
                lineTo(13.892f, 6.717f)
                verticalLineTo(8.051f)
                horizontalLineTo(13.535f)
                verticalLineTo(7.125f)
                lineTo(13.131f, 7.385f)
                verticalLineTo(7.636f)
                curveTo(13.131f, 7.636f, 12.353f, 7.69f, 12.353f, 8.789f)
                horizontalLineTo(15.06f)
                lineTo(15.063f, 5.791f)
                close()
                moveTo(4.682f, 9.354f)
                curveTo(4.78f, 9.354f, 4.859f, 9.284f, 4.859f, 9.197f)
                curveTo(4.859f, 9.111f, 4.78f, 9.041f, 4.682f, 9.041f)
                curveTo(4.585f, 9.041f, 4.505f, 9.111f, 4.505f, 9.197f)
                curveTo(4.505f, 9.284f, 4.585f, 9.354f, 4.682f, 9.354f)
                close()
                moveTo(13.697f, 6.026f)
                curveTo(13.559f, 6.207f, 13.142f, 6.026f, 13.142f, 6.026f)
                lineTo(14.325f, 5.889f)
                curveTo(14.203f, 6.127f, 13.697f, 6.026f, 13.697f, 6.026f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IraqPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Iraq,
            contentDescription = "Iraq Flag"
        )
    }
}
