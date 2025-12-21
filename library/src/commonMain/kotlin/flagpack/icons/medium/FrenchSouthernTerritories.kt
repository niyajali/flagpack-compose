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
 * French Southern Territories Flag (20x15dp)
 *
 * - ISO Alpha-2: TF
 * - ISO Alpha-3: ATF
 * - ISO Numeric: 260
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.FrenchSouthernTerritories: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Southern Territories:TF:ATF:260:Medium",
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
                moveTo(11.743f, 3.875f)
                horizontalLineTo(14.248f)
                horizontalLineTo(14.268f)
                horizontalLineTo(16.773f)
                lineTo(16.283f, 4.815f)
                horizontalLineTo(14.757f)
                verticalLineTo(5.32f)
                horizontalLineTo(15.927f)
                lineTo(15.45f, 6.194f)
                horizontalLineTo(14.757f)
                verticalLineTo(7.943f)
                lineTo(15.899f, 6.144f)
                lineTo(17.377f, 8.703f)
                horizontalLineTo(16.773f)
                lineTo(16.562f, 8.423f)
                horizontalLineTo(15.225f)
                lineTo(14.284f, 10.161f)
                lineTo(14.284f, 10.257f)
                lineTo(14.258f, 10.209f)
                lineTo(14.232f, 10.257f)
                lineTo(14.232f, 10.161f)
                lineTo(13.292f, 8.423f)
                horizontalLineTo(11.954f)
                lineTo(11.743f, 8.703f)
                horizontalLineTo(11.139f)
                lineTo(12.617f, 6.144f)
                lineTo(13.759f, 7.943f)
                verticalLineTo(4.815f)
                horizontalLineTo(12.233f)
                lineTo(11.743f, 3.875f)
                close()
                moveTo(15.929f, 7.193f)
                lineTo(15.6f, 7.698f)
                horizontalLineTo(16.222f)
                lineTo(15.929f, 7.193f)
                close()
                moveTo(12.588f, 7.193f)
                lineTo(12.916f, 7.698f)
                horizontalLineTo(12.295f)
                lineTo(12.588f, 7.193f)
                close()
                moveTo(10.196f, 6.633f)
                lineTo(10.715f, 6.25f)
                lineTo(11.235f, 6.633f)
                lineTo(11.052f, 5.992f)
                lineTo(11.556f, 5.587f)
                lineTo(10.923f, 5.573f)
                lineTo(10.715f, 4.94f)
                lineTo(10.508f, 5.573f)
                lineTo(9.875f, 5.587f)
                lineTo(10.379f, 5.992f)
                lineTo(10.196f, 6.633f)
                close()
                moveTo(17.785f, 6.25f)
                lineTo(17.265f, 6.633f)
                lineTo(17.448f, 5.992f)
                lineTo(16.944f, 5.587f)
                lineTo(17.577f, 5.573f)
                lineTo(17.785f, 4.94f)
                lineTo(17.992f, 5.573f)
                lineTo(18.625f, 5.587f)
                lineTo(18.121f, 5.992f)
                lineTo(18.304f, 6.633f)
                lineTo(17.785f, 6.25f)
                close()
                moveTo(15.675f, 11.127f)
                lineTo(16.194f, 10.744f)
                lineTo(16.713f, 11.127f)
                lineTo(16.53f, 10.485f)
                lineTo(17.034f, 10.08f)
                lineTo(16.402f, 10.067f)
                lineTo(16.194f, 9.433f)
                lineTo(15.986f, 10.067f)
                lineTo(15.354f, 10.08f)
                lineTo(15.858f, 10.485f)
                lineTo(15.675f, 11.127f)
                close()
                moveTo(12.306f, 10.744f)
                lineTo(11.787f, 11.127f)
                lineTo(11.97f, 10.485f)
                lineTo(11.466f, 10.08f)
                lineTo(12.098f, 10.067f)
                lineTo(12.306f, 9.433f)
                lineTo(12.514f, 10.067f)
                lineTo(13.146f, 10.08f)
                lineTo(12.642f, 10.485f)
                lineTo(12.825f, 11.127f)
                lineTo(12.306f, 10.744f)
                close()
                moveTo(13.731f, 12.625f)
                lineTo(14.25f, 12.242f)
                lineTo(14.769f, 12.625f)
                lineTo(14.586f, 11.983f)
                lineTo(15.09f, 11.578f)
                lineTo(14.458f, 11.565f)
                lineTo(14.25f, 10.931f)
                lineTo(14.042f, 11.565f)
                lineTo(13.41f, 11.578f)
                lineTo(13.914f, 11.983f)
                lineTo(13.731f, 12.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(7.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(2.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.5f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(6.25f)
                horizontalLineTo(2.5f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchSouthernTerritoriesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.FrenchSouthernTerritories,
            contentDescription = "French Southern Territories Flag"
        )
    }
}
