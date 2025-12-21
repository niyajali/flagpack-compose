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
 * Malawi Flag (20x15dp)
 *
 * - ISO Alpha-2: MW
 * - ISO Alpha-3: MWI
 * - ISO Numeric: 454
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Malawi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malawi:MW:MWI:454:Medium",
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
                fill = SolidColor(Color(0xFFE11C1B)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.501f, 8.666f)
                verticalLineTo(8.665f)
                lineTo(2.495f, 8.666f)
                lineTo(2.501f, 8.666f)
                close()
                moveTo(2.894f, 6.279f)
                horizontalLineTo(2.958f)
                lineTo(2.86f, 6.264f)
                lineTo(2.894f, 6.279f)
                close()
                moveTo(4.724f, 6.279f)
                curveTo(4.756f, 6.216f, 4.79f, 6.154f, 4.826f, 6.093f)
                lineTo(3.395f, 5.145f)
                lineTo(5.083f, 5.694f)
                curveTo(5.177f, 5.562f, 5.278f, 5.434f, 5.386f, 5.311f)
                lineTo(4.146f, 4.13f)
                lineTo(5.726f, 4.955f)
                curveTo(5.842f, 4.844f, 5.964f, 4.738f, 6.09f, 4.636f)
                lineTo(5.087f, 3.251f)
                lineTo(6.504f, 4.334f)
                curveTo(6.636f, 4.247f, 6.772f, 4.164f, 6.912f, 4.086f)
                lineTo(6.19f, 2.536f)
                lineTo(7.386f, 3.849f)
                curveTo(7.529f, 3.785f, 7.675f, 3.727f, 7.824f, 3.673f)
                lineTo(7.417f, 2.008f)
                lineTo(8.344f, 3.51f)
                curveTo(8.493f, 3.47f, 8.645f, 3.435f, 8.799f, 3.406f)
                lineTo(8.731f, 1.684f)
                lineTo(9.347f, 3.324f)
                curveTo(9.499f, 3.307f, 9.653f, 3.296f, 9.809f, 3.29f)
                lineTo(10.088f, 1.575f)
                lineTo(10.367f, 3.29f)
                curveTo(10.523f, 3.297f, 10.676f, 3.308f, 10.828f, 3.325f)
                lineTo(11.445f, 1.684f)
                lineTo(11.377f, 3.408f)
                curveTo(11.531f, 3.438f, 11.682f, 3.473f, 11.83f, 3.513f)
                lineTo(12.759f, 2.008f)
                lineTo(12.351f, 3.677f)
                curveTo(12.499f, 3.731f, 12.644f, 3.789f, 12.786f, 3.853f)
                lineTo(13.986f, 2.536f)
                lineTo(13.261f, 4.091f)
                curveTo(13.401f, 4.169f, 13.536f, 4.252f, 13.666f, 4.339f)
                lineTo(15.089f, 3.251f)
                lineTo(14.081f, 4.643f)
                curveTo(14.207f, 4.743f, 14.327f, 4.849f, 14.442f, 4.959f)
                lineTo(16.03f, 4.13f)
                lineTo(14.783f, 5.317f)
                curveTo(14.89f, 5.44f, 14.99f, 5.567f, 15.083f, 5.698f)
                lineTo(16.781f, 5.145f)
                lineTo(15.341f, 6.099f)
                curveTo(15.376f, 6.158f, 15.409f, 6.218f, 15.44f, 6.279f)
                horizontalLineTo(14.212f)
                curveTo(13.366f, 5.106f, 11.819f, 4.321f, 10.051f, 4.321f)
                curveTo(8.283f, 4.321f, 6.736f, 5.106f, 5.89f, 6.279f)
                horizontalLineTo(4.724f)
                close()
                moveTo(6.6f, 6.279f)
                curveTo(7.402f, 5.452f, 8.661f, 4.919f, 10.076f, 4.919f)
                curveTo(11.492f, 4.919f, 12.751f, 5.452f, 13.553f, 6.279f)
                horizontalLineTo(6.6f)
                close()
                moveTo(17.218f, 6.279f)
                horizontalLineTo(17.282f)
                lineTo(17.317f, 6.264f)
                lineTo(17.218f, 6.279f)
                close()
                moveTo(17.676f, 8.665f)
                lineTo(17.681f, 8.666f)
                lineTo(17.676f, 8.666f)
                verticalLineTo(8.665f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MalawiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Malawi,
            contentDescription = "Malawi Flag"
        )
    }
}
