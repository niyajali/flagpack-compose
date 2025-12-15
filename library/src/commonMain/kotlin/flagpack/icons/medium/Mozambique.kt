package flagpack.icons.medium

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Mozambique Flag (20x15dp)
 *
 * - ISO Alpha-2: MZ
 * - ISO Alpha-3: MOZ
 * - ISO Numeric: 508
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Mozambique: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mozambique:MZ:MOZ:508:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, 4.375f)
                horizontalLineTo(-0.625f)
                verticalLineTo(5f)
                verticalLineTo(10f)
                verticalLineTo(10.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(10f)
                verticalLineTo(5f)
                verticalLineTo(4.375f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(15f)
            lineTo(11.25f, 7.5f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(11.25f, 7.5f)
                lineTo(0f, 0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.043f, 8.971f)
                lineTo(2.681f, 10.877f)
                lineTo(3.765f, 8.329f)
                lineTo(1.903f, 6.537f)
                horizontalLineTo(4.1f)
                lineTo(5.002f, 4.375f)
                lineTo(5.959f, 6.537f)
                horizontalLineTo(8.153f)
                lineTo(6.193f, 8.329f)
                lineTo(7.174f, 10.877f)
                lineTo(5.043f, 8.971f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.847f, 7.49f)
                lineTo(3.447f, 8.828f)
                curveTo(3.447f, 8.828f, 4.799f, 8.815f, 4.962f, 8.951f)
                curveTo(5.451f, 8.646f, 6.458f, 8.828f, 6.458f, 8.828f)
                lineTo(5.923f, 7.396f)
                curveTo(5.923f, 7.396f, 5.243f, 7.088f, 4.962f, 7.257f)
                curveTo(4.271f, 7.101f, 3.847f, 7.49f, 3.847f, 7.49f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.227f, 9.51f)
                curveTo(7.331f, 9.648f, 7.304f, 9.844f, 7.166f, 9.948f)
                curveTo(7.028f, 10.052f, 6.832f, 10.024f, 6.728f, 9.886f)
                lineTo(4.116f, 6.417f)
                curveTo(4.012f, 6.279f, 4.039f, 6.083f, 4.177f, 5.979f)
                curveTo(4.315f, 5.875f, 4.511f, 5.903f, 4.615f, 6.041f)
                lineTo(7.227f, 9.51f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.359f, 6.15f)
                lineTo(4.109f, 5.85f)
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.503f, 5.852f)
                lineTo(2.748f, 7.061f)
                lineTo(3.125f, 7.715f)
                lineTo(3.989f, 6.431f)
                lineTo(4.145f, 6.034f)
                lineTo(3.989f, 5.852f)
                horizontalLineTo(3.503f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.524f, 9.443f)
                lineTo(2.889f, 9.956f)
                lineTo(5.698f, 6.632f)
                lineTo(5.815f, 6.762f)
                lineTo(6.463f, 6.153f)
                lineTo(7.498f, 5.027f)
                lineTo(6.463f, 5.873f)
                lineTo(6.128f, 5.78f)
                lineTo(5.815f, 6.272f)
                horizontalLineTo(5.501f)
                lineTo(3.206f, 8.826f)
                lineTo(2.524f, 9.443f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MozambiquePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Mozambique,
            contentDescription = "Mozambique Flag"
        )
    }
}
