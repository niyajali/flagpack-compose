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
 * United Kingdom Flag (16x12dp)
 *
 * - ISO Alpha-2: GB-UKM
 * - ISO Alpha-3: GBR
 * - ISO Numeric: 836
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.UnitedKingdom: ImageVector by lazy {
    ImageVector.Builder(
        name = "United Kingdom:GB-UKM:GBR:836:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
            path(fill = SolidColor(Color.White)) {
                moveTo(-1.781f, 11.143f)
                lineTo(1.739f, 12.632f)
                lineTo(16.08f, 1.619f)
                lineTo(17.937f, -0.594f)
                lineTo(14.172f, -1.091f)
                lineTo(8.323f, 3.654f)
                lineTo(3.615f, 6.852f)
                lineTo(-1.781f, 11.143f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.299f, 12.186f)
                lineTo(0.494f, 13.05f)
                lineTo(17.27f, -0.799f)
                horizontalLineTo(14.752f)
                lineTo(-1.299f, 12.186f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(17.782f, 11.143f)
                lineTo(14.261f, 12.632f)
                lineTo(-0.08f, 1.619f)
                lineTo(-1.937f, -0.594f)
                lineTo(1.828f, -1.091f)
                lineTo(7.677f, 3.654f)
                lineTo(12.385f, 6.852f)
                lineTo(17.782f, 11.143f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(17.662f, 11.891f)
                lineTo(15.868f, 12.756f)
                lineTo(8.724f, 6.826f)
                lineTo(6.607f, 6.163f)
                lineTo(-2.116f, -0.586f)
                horizontalLineTo(0.403f)
                lineTo(9.12f, 6.003f)
                lineTo(11.436f, 6.798f)
                lineTo(17.662f, 11.891f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.889f, -1f)
                horizontalLineTo(6.111f)
                verticalLineTo(4f)
                horizontalLineTo(-0.986f)
                verticalLineTo(8f)
                horizontalLineTo(6.111f)
                verticalLineTo(13f)
                horizontalLineTo(9.889f)
                verticalLineTo(8f)
                horizontalLineTo(17.014f)
                verticalLineTo(4f)
                horizontalLineTo(9.889f)
                verticalLineTo(-1f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(9.889f, -1f)
                horizontalLineTo(6.111f)
                verticalLineTo(4f)
                horizontalLineTo(-0.986f)
                verticalLineTo(8f)
                horizontalLineTo(6.111f)
                verticalLineTo(13f)
                horizontalLineTo(9.889f)
                verticalLineTo(8f)
                horizontalLineTo(17.014f)
                verticalLineTo(4f)
                horizontalLineTo(9.889f)
                verticalLineTo(-1f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(6.111f, -1f)
                verticalLineTo(-2f)
                horizontalLineTo(5.111f)
                verticalLineTo(-1f)
                horizontalLineTo(6.111f)
                close()
                moveTo(9.889f, -1f)
                horizontalLineTo(10.889f)
                verticalLineTo(-2f)
                horizontalLineTo(9.889f)
                verticalLineTo(-1f)
                close()
                moveTo(6.111f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(7.111f)
                verticalLineTo(4f)
                horizontalLineTo(6.111f)
                close()
                moveTo(-0.986f, 4f)
                verticalLineTo(3f)
                horizontalLineTo(-1.986f)
                verticalLineTo(4f)
                horizontalLineTo(-0.986f)
                close()
                moveTo(-0.986f, 8f)
                horizontalLineTo(-1.986f)
                verticalLineTo(9f)
                horizontalLineTo(-0.986f)
                verticalLineTo(8f)
                close()
                moveTo(6.111f, 8f)
                horizontalLineTo(7.111f)
                verticalLineTo(7f)
                horizontalLineTo(6.111f)
                verticalLineTo(8f)
                close()
                moveTo(6.111f, 13f)
                horizontalLineTo(5.111f)
                verticalLineTo(14f)
                horizontalLineTo(6.111f)
                verticalLineTo(13f)
                close()
                moveTo(9.889f, 13f)
                verticalLineTo(14f)
                horizontalLineTo(10.889f)
                verticalLineTo(13f)
                horizontalLineTo(9.889f)
                close()
                moveTo(9.889f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(8.889f)
                verticalLineTo(8f)
                horizontalLineTo(9.889f)
                close()
                moveTo(17.014f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(18.014f)
                verticalLineTo(8f)
                horizontalLineTo(17.014f)
                close()
                moveTo(17.014f, 4f)
                horizontalLineTo(18.014f)
                verticalLineTo(3f)
                horizontalLineTo(17.014f)
                verticalLineTo(4f)
                close()
                moveTo(9.889f, 4f)
                horizontalLineTo(8.889f)
                verticalLineTo(5f)
                horizontalLineTo(9.889f)
                verticalLineTo(4f)
                close()
                moveTo(6.111f, 0f)
                horizontalLineTo(9.889f)
                verticalLineTo(-2f)
                horizontalLineTo(6.111f)
                verticalLineTo(0f)
                close()
                moveTo(7.111f, 4f)
                verticalLineTo(-1f)
                horizontalLineTo(5.111f)
                verticalLineTo(4f)
                horizontalLineTo(7.111f)
                close()
                moveTo(-0.986f, 5f)
                horizontalLineTo(6.111f)
                verticalLineTo(3f)
                horizontalLineTo(-0.986f)
                verticalLineTo(5f)
                close()
                moveTo(0.014f, 8f)
                verticalLineTo(4f)
                horizontalLineTo(-1.986f)
                verticalLineTo(8f)
                horizontalLineTo(0.014f)
                close()
                moveTo(6.111f, 7f)
                horizontalLineTo(-0.986f)
                verticalLineTo(9f)
                horizontalLineTo(6.111f)
                verticalLineTo(7f)
                close()
                moveTo(7.111f, 13f)
                verticalLineTo(8f)
                horizontalLineTo(5.111f)
                verticalLineTo(13f)
                horizontalLineTo(7.111f)
                close()
                moveTo(9.889f, 12f)
                horizontalLineTo(6.111f)
                verticalLineTo(14f)
                horizontalLineTo(9.889f)
                verticalLineTo(12f)
                close()
                moveTo(8.889f, 8f)
                verticalLineTo(13f)
                horizontalLineTo(10.889f)
                verticalLineTo(8f)
                horizontalLineTo(8.889f)
                close()
                moveTo(17.014f, 7f)
                horizontalLineTo(9.889f)
                verticalLineTo(9f)
                horizontalLineTo(17.014f)
                verticalLineTo(7f)
                close()
                moveTo(16.014f, 4f)
                verticalLineTo(8f)
                horizontalLineTo(18.014f)
                verticalLineTo(4f)
                horizontalLineTo(16.014f)
                close()
                moveTo(9.889f, 5f)
                horizontalLineTo(17.014f)
                verticalLineTo(3f)
                horizontalLineTo(9.889f)
                verticalLineTo(5f)
                close()
                moveTo(8.889f, -1f)
                verticalLineTo(4f)
                horizontalLineTo(10.889f)
                verticalLineTo(-1f)
                horizontalLineTo(8.889f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UnitedKingdomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.UnitedKingdom,
            contentDescription = "United Kingdom Flag"
        )
    }
}
