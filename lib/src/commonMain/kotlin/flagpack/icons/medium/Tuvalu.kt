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
 * Tuvalu Flag (20x15dp)
 *
 * - ISO Alpha-2: TV
 * - ISO Alpha-3: TUV
 * - ISO Numeric: 798
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Tuvalu: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tuvalu:TV:TUV:798:Medium",
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
                fill = SolidColor(Color(0xFF00B4FF)),
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
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.253f, 8.125f)
                lineTo(1.223f, 9.211f)
                lineTo(11.306f, 1.18f)
                lineTo(12.612f, -0.433f)
                lineTo(9.965f, -0.796f)
                lineTo(5.852f, 2.665f)
                lineTo(2.542f, 4.996f)
                lineTo(-1.253f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.914f, 8.886f)
                lineTo(0.347f, 9.516f)
                lineTo(12.143f, -0.583f)
                horizontalLineTo(10.372f)
                lineTo(-0.914f, 8.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.503f, 8.125f)
                lineTo(10.306f, 9.521f)
                lineTo(-0.056f, 1.18f)
                lineTo(-1.362f, -0.433f)
                lineTo(1.285f, -0.796f)
                lineTo(5.398f, 2.665f)
                lineTo(8.708f, 4.996f)
                lineTo(12.503f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(12.418f, 8.671f)
                lineTo(11.157f, 9.301f)
                lineTo(6.134f, 4.977f)
                lineTo(4.645f, 4.494f)
                lineTo(-1.488f, -0.427f)
                horizontalLineTo(0.283f)
                lineTo(6.413f, 4.377f)
                lineTo(8.041f, 4.957f)
                lineTo(12.418f, 8.671f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.063f, 0f)
                horizontalLineTo(6.938f)
                verticalLineTo(3.063f)
                lineTo(11f, 3f)
                verticalLineTo(5.875f)
                lineTo(6.938f, 5.938f)
                verticalLineTo(9f)
                horizontalLineTo(4.063f)
                verticalLineTo(5.938f)
                lineTo(0f, 5.875f)
                verticalLineTo(3f)
                lineTo(4.063f, 3.063f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.785f, 6.678f)
            lineTo(17.165f, 5.975f)
            lineTo(17.997f, 5.95f)
            lineTo(17.353f, 5.411f)
            lineTo(17.575f, 4.685f)
            lineTo(17.019f, 5.019f)
            lineTo(16.317f, 4.593f)
            lineTo(16.385f, 5.4f)
            lineTo(15.755f, 5.778f)
            lineTo(16.573f, 5.88f)
            lineTo(16.785f, 6.678f)
            close()
            moveTo(14.665f, 7.225f)
            lineTo(14.285f, 7.928f)
            lineTo(14.073f, 7.13f)
            lineTo(13.255f, 7.028f)
            lineTo(13.885f, 6.65f)
            lineTo(13.817f, 5.843f)
            lineTo(14.519f, 6.269f)
            lineTo(15.075f, 5.935f)
            lineTo(14.853f, 6.661f)
            lineTo(15.498f, 7.2f)
            lineTo(14.665f, 7.225f)
            close()
            moveTo(13.035f, 9.178f)
            lineTo(13.415f, 8.475f)
            lineTo(14.248f, 8.45f)
            lineTo(13.603f, 7.911f)
            lineTo(13.825f, 7.185f)
            lineTo(13.269f, 7.519f)
            lineTo(12.567f, 7.093f)
            lineTo(12.635f, 7.9f)
            lineTo(12.005f, 8.278f)
            lineTo(12.823f, 8.38f)
            lineTo(13.035f, 9.178f)
            close()
            moveTo(10.535f, 11.678f)
            lineTo(10.915f, 10.975f)
            lineTo(11.748f, 10.95f)
            lineTo(11.103f, 10.411f)
            lineTo(11.325f, 9.685f)
            lineTo(10.769f, 10.019f)
            lineTo(10.067f, 9.593f)
            lineTo(10.135f, 10.4f)
            lineTo(9.505f, 10.778f)
            lineTo(10.323f, 10.88f)
            lineTo(10.535f, 11.678f)
            close()
            moveTo(8.109f, 13.585f)
            lineTo(7.421f, 13.992f)
            lineTo(7.65f, 13.199f)
            lineTo(7.002f, 12.69f)
            horizontalLineTo(7.736f)
            lineTo(8.094f, 11.963f)
            lineTo(8.476f, 12.69f)
            horizontalLineTo(9.125f)
            lineTo(8.56f, 13.199f)
            lineTo(8.835f, 13.992f)
            lineTo(8.109f, 13.585f)
            close()
            moveTo(10.915f, 13.475f)
            lineTo(10.535f, 14.178f)
            lineTo(10.323f, 13.38f)
            lineTo(9.505f, 13.278f)
            lineTo(10.135f, 12.9f)
            lineTo(10.067f, 12.093f)
            lineTo(10.769f, 12.519f)
            lineTo(11.325f, 12.185f)
            lineTo(11.103f, 12.911f)
            lineTo(11.748f, 13.45f)
            lineTo(10.915f, 13.475f)
            close()
            moveTo(13.415f, 12.225f)
            lineTo(13.035f, 12.928f)
            lineTo(12.823f, 12.13f)
            lineTo(12.005f, 12.028f)
            lineTo(12.635f, 11.65f)
            lineTo(12.567f, 10.843f)
            lineTo(13.269f, 11.269f)
            lineTo(13.825f, 10.935f)
            lineTo(13.603f, 11.661f)
            lineTo(14.248f, 12.2f)
            lineTo(13.415f, 12.225f)
            close()
            moveTo(15.915f, 10.975f)
            lineTo(15.535f, 11.678f)
            lineTo(15.323f, 10.88f)
            lineTo(14.505f, 10.778f)
            lineTo(15.135f, 10.4f)
            lineTo(15.067f, 9.593f)
            lineTo(15.769f, 10.019f)
            lineTo(16.325f, 9.685f)
            lineTo(16.103f, 10.411f)
            lineTo(16.747f, 10.95f)
            lineTo(15.915f, 10.975f)
            close()
            moveTo(16.785f, 10.428f)
            lineTo(17.165f, 9.725f)
            lineTo(17.997f, 9.7f)
            lineTo(17.353f, 9.161f)
            lineTo(17.575f, 8.435f)
            lineTo(17.019f, 8.769f)
            lineTo(16.317f, 8.343f)
            lineTo(16.385f, 9.15f)
            lineTo(15.755f, 9.528f)
            lineTo(16.573f, 9.63f)
            lineTo(16.785f, 10.428f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TuvaluPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Tuvalu,
            contentDescription = "Tuvalu Flag"
        )
    }
}
