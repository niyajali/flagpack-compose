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
 * British Indian Ocean Territory Flag (16x12dp)
 *
 * - ISO Alpha-2: IO
 * - ISO Alpha-3: IOT
 * - ISO Numeric: 086
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.BritishIndianOceanTerritory: ImageVector by lazy {
    ImageVector.Builder(
        name = "British Indian Ocean Territory:IO:IOT:086:Small",
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
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.753f, 1.646f)
                lineTo(-0.009f, 2.354f)
                curveTo(0.605f, 1.774f, 1.184f, 1.5f, 1.735f, 1.5f)
                curveTo(2.001f, 1.5f, 2.114f, 1.564f, 2.421f, 1.854f)
                curveTo(2.907f, 2.314f, 3.235f, 2.5f, 3.85f, 2.5f)
                curveTo(4.466f, 2.5f, 4.793f, 2.314f, 5.28f, 1.854f)
                curveTo(5.587f, 1.564f, 5.7f, 1.5f, 5.966f, 1.5f)
                curveTo(6.232f, 1.5f, 6.345f, 1.564f, 6.652f, 1.854f)
                curveTo(7.139f, 2.314f, 7.466f, 2.5f, 8.082f, 2.5f)
                curveTo(8.697f, 2.5f, 9.025f, 2.314f, 9.512f, 1.854f)
                curveTo(9.818f, 1.564f, 9.932f, 1.5f, 10.198f, 1.5f)
                curveTo(10.464f, 1.5f, 10.577f, 1.564f, 10.884f, 1.854f)
                curveTo(11.37f, 2.314f, 11.698f, 2.5f, 12.313f, 2.5f)
                curveTo(12.929f, 2.5f, 13.257f, 2.314f, 13.743f, 1.854f)
                curveTo(14.05f, 1.564f, 14.163f, 1.5f, 14.429f, 1.5f)
                curveTo(14.98f, 1.5f, 15.559f, 1.774f, 16.173f, 2.354f)
                lineTo(16.917f, 1.646f)
                curveTo(16.12f, 0.893f, 15.289f, 0.5f, 14.429f, 0.5f)
                curveTo(13.814f, 0.5f, 13.486f, 0.686f, 13f, 1.146f)
                curveTo(12.693f, 1.436f, 12.579f, 1.5f, 12.313f, 1.5f)
                curveTo(12.047f, 1.5f, 11.934f, 1.436f, 11.627f, 1.146f)
                curveTo(11.141f, 0.686f, 10.813f, 0.5f, 10.198f, 0.5f)
                curveTo(9.582f, 0.5f, 9.255f, 0.686f, 8.768f, 1.146f)
                curveTo(8.461f, 1.436f, 8.348f, 1.5f, 8.082f, 1.5f)
                curveTo(7.816f, 1.5f, 7.703f, 1.436f, 7.396f, 1.146f)
                curveTo(6.909f, 0.686f, 6.582f, 0.5f, 5.966f, 0.5f)
                curveTo(5.351f, 0.5f, 5.023f, 0.686f, 4.537f, 1.146f)
                curveTo(4.23f, 1.436f, 4.116f, 1.5f, 3.85f, 1.5f)
                curveTo(3.584f, 1.5f, 3.471f, 1.436f, 3.164f, 1.146f)
                curveTo(2.678f, 0.686f, 2.35f, 0.5f, 1.735f, 0.5f)
                curveTo(0.875f, 0.5f, 0.044f, 0.893f, -0.753f, 1.646f)
                close()
                moveTo(-0.009f, 4.354f)
                lineTo(-0.753f, 3.646f)
                curveTo(0.044f, 2.893f, 0.875f, 2.5f, 1.735f, 2.5f)
                curveTo(2.35f, 2.5f, 2.678f, 2.686f, 3.164f, 3.146f)
                curveTo(3.471f, 3.436f, 3.584f, 3.5f, 3.85f, 3.5f)
                curveTo(4.116f, 3.5f, 4.23f, 3.436f, 4.537f, 3.146f)
                curveTo(5.023f, 2.686f, 5.351f, 2.5f, 5.966f, 2.5f)
                curveTo(6.582f, 2.5f, 6.909f, 2.686f, 7.396f, 3.146f)
                curveTo(7.703f, 3.436f, 7.816f, 3.5f, 8.082f, 3.5f)
                curveTo(8.348f, 3.5f, 8.461f, 3.436f, 8.768f, 3.146f)
                curveTo(9.255f, 2.686f, 9.582f, 2.5f, 10.198f, 2.5f)
                curveTo(10.813f, 2.5f, 11.141f, 2.686f, 11.627f, 3.146f)
                curveTo(11.934f, 3.436f, 12.047f, 3.5f, 12.313f, 3.5f)
                curveTo(12.579f, 3.5f, 12.693f, 3.436f, 13f, 3.146f)
                curveTo(13.486f, 2.686f, 13.814f, 2.5f, 14.429f, 2.5f)
                curveTo(15.289f, 2.5f, 16.12f, 2.893f, 16.917f, 3.646f)
                lineTo(16.173f, 4.354f)
                curveTo(15.559f, 3.774f, 14.98f, 3.5f, 14.429f, 3.5f)
                curveTo(14.163f, 3.5f, 14.05f, 3.564f, 13.743f, 3.854f)
                curveTo(13.257f, 4.314f, 12.929f, 4.5f, 12.313f, 4.5f)
                curveTo(11.698f, 4.5f, 11.37f, 4.314f, 10.884f, 3.854f)
                curveTo(10.577f, 3.564f, 10.464f, 3.5f, 10.198f, 3.5f)
                curveTo(9.932f, 3.5f, 9.818f, 3.564f, 9.512f, 3.854f)
                curveTo(9.025f, 4.314f, 8.697f, 4.5f, 8.082f, 4.5f)
                curveTo(7.466f, 4.5f, 7.139f, 4.314f, 6.652f, 3.854f)
                curveTo(6.345f, 3.564f, 6.232f, 3.5f, 5.966f, 3.5f)
                curveTo(5.7f, 3.5f, 5.587f, 3.564f, 5.28f, 3.854f)
                curveTo(4.793f, 4.314f, 4.466f, 4.5f, 3.85f, 4.5f)
                curveTo(3.235f, 4.5f, 2.907f, 4.314f, 2.421f, 3.854f)
                curveTo(2.114f, 3.564f, 2.001f, 3.5f, 1.735f, 3.5f)
                curveTo(1.184f, 3.5f, 0.605f, 3.774f, -0.009f, 4.354f)
                close()
                moveTo(-0.009f, 6.354f)
                lineTo(-0.753f, 5.646f)
                curveTo(0.044f, 4.893f, 0.875f, 4.5f, 1.735f, 4.5f)
                curveTo(2.35f, 4.5f, 2.678f, 4.686f, 3.164f, 5.146f)
                curveTo(3.471f, 5.436f, 3.584f, 5.5f, 3.85f, 5.5f)
                curveTo(4.116f, 5.5f, 4.23f, 5.436f, 4.537f, 5.146f)
                curveTo(5.023f, 4.686f, 5.351f, 4.5f, 5.966f, 4.5f)
                curveTo(6.582f, 4.5f, 6.909f, 4.686f, 7.396f, 5.146f)
                curveTo(7.703f, 5.436f, 7.816f, 5.5f, 8.082f, 5.5f)
                curveTo(8.348f, 5.5f, 8.461f, 5.436f, 8.768f, 5.146f)
                curveTo(9.255f, 4.686f, 9.582f, 4.5f, 10.198f, 4.5f)
                curveTo(10.813f, 4.5f, 11.141f, 4.686f, 11.627f, 5.146f)
                curveTo(11.934f, 5.436f, 12.047f, 5.5f, 12.313f, 5.5f)
                curveTo(12.579f, 5.5f, 12.693f, 5.436f, 13f, 5.146f)
                curveTo(13.486f, 4.686f, 13.814f, 4.5f, 14.429f, 4.5f)
                curveTo(15.289f, 4.5f, 16.12f, 4.893f, 16.917f, 5.646f)
                lineTo(16.173f, 6.354f)
                curveTo(15.559f, 5.774f, 14.98f, 5.5f, 14.429f, 5.5f)
                curveTo(14.163f, 5.5f, 14.05f, 5.564f, 13.743f, 5.854f)
                curveTo(13.257f, 6.314f, 12.929f, 6.5f, 12.313f, 6.5f)
                curveTo(11.698f, 6.5f, 11.37f, 6.314f, 10.884f, 5.854f)
                curveTo(10.577f, 5.564f, 10.464f, 5.5f, 10.198f, 5.5f)
                curveTo(9.932f, 5.5f, 9.818f, 5.564f, 9.512f, 5.854f)
                curveTo(9.025f, 6.314f, 8.697f, 6.5f, 8.082f, 6.5f)
                curveTo(7.466f, 6.5f, 7.139f, 6.314f, 6.652f, 5.854f)
                curveTo(6.345f, 5.564f, 6.232f, 5.5f, 5.966f, 5.5f)
                curveTo(5.7f, 5.5f, 5.587f, 5.564f, 5.28f, 5.854f)
                curveTo(4.793f, 6.314f, 4.466f, 6.5f, 3.85f, 6.5f)
                curveTo(3.235f, 6.5f, 2.907f, 6.314f, 2.421f, 5.854f)
                curveTo(2.114f, 5.564f, 2.001f, 5.5f, 1.735f, 5.5f)
                curveTo(1.184f, 5.5f, 0.605f, 5.774f, -0.009f, 6.354f)
                close()
                moveTo(-0.009f, 8.354f)
                lineTo(-0.753f, 7.646f)
                curveTo(0.044f, 6.893f, 0.875f, 6.5f, 1.735f, 6.5f)
                curveTo(2.35f, 6.5f, 2.678f, 6.686f, 3.164f, 7.146f)
                curveTo(3.471f, 7.436f, 3.584f, 7.5f, 3.85f, 7.5f)
                curveTo(4.116f, 7.5f, 4.23f, 7.436f, 4.537f, 7.146f)
                curveTo(5.023f, 6.686f, 5.351f, 6.5f, 5.966f, 6.5f)
                curveTo(6.582f, 6.5f, 6.909f, 6.686f, 7.396f, 7.146f)
                curveTo(7.703f, 7.436f, 7.816f, 7.5f, 8.082f, 7.5f)
                curveTo(8.348f, 7.5f, 8.461f, 7.436f, 8.768f, 7.146f)
                curveTo(9.255f, 6.686f, 9.582f, 6.5f, 10.198f, 6.5f)
                curveTo(10.813f, 6.5f, 11.141f, 6.686f, 11.627f, 7.146f)
                curveTo(11.934f, 7.436f, 12.047f, 7.5f, 12.313f, 7.5f)
                curveTo(12.579f, 7.5f, 12.693f, 7.436f, 13f, 7.146f)
                curveTo(13.486f, 6.686f, 13.814f, 6.5f, 14.429f, 6.5f)
                curveTo(15.289f, 6.5f, 16.12f, 6.893f, 16.917f, 7.646f)
                lineTo(16.173f, 8.354f)
                curveTo(15.559f, 7.774f, 14.98f, 7.5f, 14.429f, 7.5f)
                curveTo(14.163f, 7.5f, 14.05f, 7.564f, 13.743f, 7.854f)
                curveTo(13.257f, 8.314f, 12.929f, 8.5f, 12.313f, 8.5f)
                curveTo(11.698f, 8.5f, 11.37f, 8.314f, 10.884f, 7.854f)
                curveTo(10.577f, 7.564f, 10.464f, 7.5f, 10.198f, 7.5f)
                curveTo(9.932f, 7.5f, 9.818f, 7.564f, 9.512f, 7.854f)
                curveTo(9.025f, 8.314f, 8.697f, 8.5f, 8.082f, 8.5f)
                curveTo(7.466f, 8.5f, 7.139f, 8.314f, 6.652f, 7.854f)
                curveTo(6.345f, 7.564f, 6.232f, 7.5f, 5.966f, 7.5f)
                curveTo(5.7f, 7.5f, 5.587f, 7.564f, 5.28f, 7.854f)
                curveTo(4.793f, 8.314f, 4.466f, 8.5f, 3.85f, 8.5f)
                curveTo(3.235f, 8.5f, 2.907f, 8.314f, 2.421f, 7.854f)
                curveTo(2.114f, 7.564f, 2.001f, 7.5f, 1.735f, 7.5f)
                curveTo(1.184f, 7.5f, 0.605f, 7.774f, -0.009f, 8.354f)
                close()
                moveTo(-0.009f, 10.354f)
                lineTo(-0.753f, 9.646f)
                curveTo(0.044f, 8.893f, 0.875f, 8.5f, 1.735f, 8.5f)
                curveTo(2.35f, 8.5f, 2.678f, 8.686f, 3.164f, 9.146f)
                curveTo(3.471f, 9.436f, 3.584f, 9.5f, 3.85f, 9.5f)
                curveTo(4.116f, 9.5f, 4.23f, 9.436f, 4.537f, 9.146f)
                curveTo(5.023f, 8.686f, 5.351f, 8.5f, 5.966f, 8.5f)
                curveTo(6.582f, 8.5f, 6.909f, 8.686f, 7.396f, 9.146f)
                curveTo(7.703f, 9.436f, 7.816f, 9.5f, 8.082f, 9.5f)
                curveTo(8.348f, 9.5f, 8.461f, 9.436f, 8.768f, 9.146f)
                curveTo(9.255f, 8.686f, 9.582f, 8.5f, 10.198f, 8.5f)
                curveTo(10.813f, 8.5f, 11.141f, 8.686f, 11.627f, 9.146f)
                curveTo(11.934f, 9.436f, 12.047f, 9.5f, 12.313f, 9.5f)
                curveTo(12.579f, 9.5f, 12.693f, 9.436f, 13f, 9.146f)
                curveTo(13.486f, 8.686f, 13.814f, 8.5f, 14.429f, 8.5f)
                curveTo(15.289f, 8.5f, 16.12f, 8.893f, 16.917f, 9.646f)
                lineTo(16.173f, 10.354f)
                curveTo(15.559f, 9.774f, 14.98f, 9.5f, 14.429f, 9.5f)
                curveTo(14.163f, 9.5f, 14.05f, 9.564f, 13.743f, 9.854f)
                curveTo(13.257f, 10.314f, 12.929f, 10.5f, 12.313f, 10.5f)
                curveTo(11.698f, 10.5f, 11.37f, 10.314f, 10.884f, 9.854f)
                curveTo(10.577f, 9.564f, 10.464f, 9.5f, 10.198f, 9.5f)
                curveTo(9.932f, 9.5f, 9.818f, 9.564f, 9.512f, 9.854f)
                curveTo(9.025f, 10.314f, 8.697f, 10.5f, 8.082f, 10.5f)
                curveTo(7.466f, 10.5f, 7.139f, 10.314f, 6.652f, 9.854f)
                curveTo(6.345f, 9.564f, 6.232f, 9.5f, 5.966f, 9.5f)
                curveTo(5.7f, 9.5f, 5.587f, 9.564f, 5.28f, 9.854f)
                curveTo(4.793f, 10.314f, 4.466f, 10.5f, 3.85f, 10.5f)
                curveTo(3.235f, 10.5f, 2.907f, 10.314f, 2.421f, 9.854f)
                curveTo(2.114f, 9.564f, 2.001f, 9.5f, 1.735f, 9.5f)
                curveTo(1.184f, 9.5f, 0.605f, 9.774f, -0.009f, 10.354f)
                close()
                moveTo(-0.009f, 12.354f)
                lineTo(-0.753f, 11.646f)
                curveTo(0.044f, 10.893f, 0.875f, 10.5f, 1.735f, 10.5f)
                curveTo(2.35f, 10.5f, 2.678f, 10.686f, 3.164f, 11.146f)
                curveTo(3.471f, 11.436f, 3.584f, 11.5f, 3.85f, 11.5f)
                curveTo(4.116f, 11.5f, 4.23f, 11.436f, 4.537f, 11.146f)
                curveTo(5.023f, 10.686f, 5.351f, 10.5f, 5.966f, 10.5f)
                curveTo(6.582f, 10.5f, 6.909f, 10.686f, 7.396f, 11.146f)
                curveTo(7.703f, 11.436f, 7.816f, 11.5f, 8.082f, 11.5f)
                curveTo(8.348f, 11.5f, 8.461f, 11.436f, 8.768f, 11.146f)
                curveTo(9.255f, 10.686f, 9.582f, 10.5f, 10.198f, 10.5f)
                curveTo(10.813f, 10.5f, 11.141f, 10.686f, 11.627f, 11.146f)
                curveTo(11.934f, 11.436f, 12.047f, 11.5f, 12.313f, 11.5f)
                curveTo(12.579f, 11.5f, 12.693f, 11.436f, 13f, 11.146f)
                curveTo(13.486f, 10.686f, 13.814f, 10.5f, 14.429f, 10.5f)
                curveTo(15.289f, 10.5f, 16.12f, 10.893f, 16.917f, 11.646f)
                lineTo(16.173f, 12.354f)
                curveTo(15.559f, 11.774f, 14.98f, 11.5f, 14.429f, 11.5f)
                curveTo(14.163f, 11.5f, 14.05f, 11.564f, 13.743f, 11.854f)
                curveTo(13.257f, 12.314f, 12.929f, 12.5f, 12.313f, 12.5f)
                curveTo(11.698f, 12.5f, 11.37f, 12.314f, 10.884f, 11.854f)
                curveTo(10.577f, 11.564f, 10.464f, 11.5f, 10.198f, 11.5f)
                curveTo(9.932f, 11.5f, 9.818f, 11.564f, 9.512f, 11.854f)
                curveTo(9.025f, 12.314f, 8.697f, 12.5f, 8.082f, 12.5f)
                curveTo(7.466f, 12.5f, 7.139f, 12.314f, 6.652f, 11.854f)
                curveTo(6.345f, 11.564f, 6.232f, 11.5f, 5.966f, 11.5f)
                curveTo(5.7f, 11.5f, 5.587f, 11.564f, 5.28f, 11.854f)
                curveTo(4.793f, 12.314f, 4.466f, 12.5f, 3.85f, 12.5f)
                curveTo(3.235f, 12.5f, 2.907f, 12.314f, 2.421f, 11.854f)
                curveTo(2.114f, 11.564f, 2.001f, 11.5f, 1.735f, 11.5f)
                curveTo(1.184f, 11.5f, 0.605f, 11.774f, -0.009f, 12.354f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.369f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.715f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.369f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.242f, -0.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(2.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(4.75f)
                horizontalLineTo(-0.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(3.242f)
                verticalLineTo(-0.75f)
                close()
                moveTo(3.992f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFD86D00))) {
            moveTo(10.45f, 4.689f)
            lineTo(10.45f, 4.689f)
            arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.7f, 4.939f)
            lineTo(10.7f, 10.75f)
            arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.45f, 11f)
            lineTo(10.45f, 11f)
            arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.2f, 10.75f)
            lineTo(10.2f, 4.939f)
            arcTo(0.25f, 0.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.45f, 4.689f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.202f, 1.029f)
            curveTo(10.713f, 1.729f, 10.778f, 2.67f, 10.713f, 3.513f)
            lineTo(10.314f, 3.484f)
            curveTo(10.376f, 2.68f, 10.202f, 1.029f, 10.202f, 1.029f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.854f, 3.692f)
            lineTo(10.486f, 3.54f)
            curveTo(10.84f, 2.417f, 12.61f, 1.462f, 12.61f, 1.462f)
            curveTo(11.817f, 1.841f, 11.548f, 2.867f, 10.854f, 3.692f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.688f, 3.925f)
            lineTo(10.495f, 3.585f)
            curveTo(11.441f, 2.928f, 12.969f, 2.786f, 12.969f, 2.786f)
            curveTo(12.181f, 3.009f, 11.384f, 3.552f, 10.688f, 3.925f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.442f, 4.091f)
            lineTo(10.609f, 3.738f)
            curveTo(12.459f, 4.312f, 12.73f, 5.272f, 12.73f, 5.272f)
            curveTo(12.487f, 5.058f, 11.716f, 4.657f, 10.442f, 4.091f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.248f, 4.065f)
            lineTo(10.64f, 3.992f)
            curveTo(10.776f, 4.681f, 11.127f, 5.099f, 11.313f, 5.542f)
            curveTo(11.313f, 5.542f, 10.274f, 5.078f, 10.248f, 4.065f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.218f, 3.742f)
            lineTo(10.641f, 3.848f)
            curveTo(9.946f, 4.698f, 8.914f, 5.144f, 8.505f, 5.29f)
            curveTo(8.505f, 5.29f, 9.403f, 4.481f, 10.218f, 3.742f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.406f, 3.558f)
            lineTo(10.341f, 3.952f)
            curveTo(9.514f, 3.7f, 8.024f, 3.806f, 8.024f, 3.806f)
            curveTo(8.649f, 3.658f, 9.514f, 3.412f, 10.406f, 3.558f)
            close()
        }
        path(fill = SolidColor(Color(0xFF449A01))) {
            moveTo(10.477f, 3.356f)
            lineTo(10.315f, 3.71f)
            curveTo(9.093f, 3.182f, 8.44f, 2.195f, 8.44f, 2.195f)
            curveTo(8.481f, 2.376f, 9.398f, 2.889f, 10.477f, 3.356f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF449A01)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.5f, 4f)
            curveTo(10.776f, 4f, 11f, 3.776f, 11f, 3.5f)
            curveTo(11f, 3.224f, 10.776f, 3f, 10.5f, 3f)
            curveTo(10.224f, 3f, 10f, 3.224f, 10f, 3.5f)
            curveTo(10f, 3.776f, 10.224f, 4f, 10.5f, 4f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(11.956f, 7.654f)
            verticalLineTo(7.582f)
            curveTo(11.726f, 7.4f, 11.484f, 7.309f, 11.232f, 7.309f)
            curveTo(10.99f, 7.191f, 10.745f, 7.145f, 10.498f, 7.172f)
            curveTo(10.498f, 7.171f, 10.498f, 7.17f, 10.498f, 7.17f)
            curveTo(10.126f, 7.13f, 9.75f, 7.309f, 9.75f, 7.309f)
            curveTo(9.372f, 7.309f, 9.026f, 7.582f, 9.026f, 7.582f)
            verticalLineTo(7.654f)
            lineTo(9.478f, 8.153f)
            curveTo(9.478f, 8.153f, 9.605f, 8.634f, 10.496f, 8.521f)
            verticalLineTo(8.522f)
            curveTo(10.496f, 8.522f, 11.086f, 8.504f, 11.127f, 8.489f)
            curveTo(11.144f, 8.483f, 11.161f, 8.478f, 11.178f, 8.472f)
            curveTo(11.294f, 8.435f, 11.426f, 8.393f, 11.504f, 8.153f)
            lineTo(11.956f, 7.654f)
            close()
            moveTo(10.496f, 7.194f)
            curveTo(10.483f, 7.36f, 10.41f, 8.362f, 10.496f, 8.517f)
            verticalLineTo(7.194f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.097f, 6.876f)
            curveTo(9.892f, 6.876f, 9.808f, 6.931f, 9.76f, 7.093f)
            curveTo(9.73f, 7.196f, 9.759f, 7.284f, 9.856f, 7.367f)
            lineTo(9.801f, 7.445f)
            curveTo(9.681f, 7.342f, 9.636f, 7.218f, 9.67f, 7.08f)
            curveTo(9.438f, 7.071f, 9.265f, 7.098f, 9.152f, 7.159f)
            curveTo(9.053f, 7.212f, 9.035f, 7.346f, 9.11f, 7.58f)
            lineTo(9.025f, 7.612f)
            curveTo(8.937f, 7.337f, 8.962f, 7.151f, 9.112f, 7.07f)
            curveTo(9.244f, 6.999f, 9.437f, 6.971f, 9.691f, 6.982f)
            lineTo(9.689f, 7.02f)
            curveTo(9.754f, 6.845f, 9.874f, 6.777f, 10.097f, 6.777f)
            curveTo(10.232f, 6.777f, 10.341f, 6.81f, 10.423f, 6.878f)
            verticalLineTo(6.834f)
            horizontalLineTo(10.602f)
            verticalLineTo(6.859f)
            curveTo(10.68f, 6.81f, 10.777f, 6.785f, 10.892f, 6.785f)
            curveTo(11.12f, 6.785f, 11.24f, 6.855f, 11.304f, 7.038f)
            lineTo(11.304f, 7.031f)
            curveTo(11.558f, 7.02f, 11.75f, 7.049f, 11.883f, 7.12f)
            curveTo(12.033f, 7.2f, 12.057f, 7.387f, 11.97f, 7.662f)
            lineTo(11.885f, 7.629f)
            curveTo(11.96f, 7.395f, 11.942f, 7.261f, 11.843f, 7.208f)
            curveTo(11.73f, 7.147f, 11.558f, 7.12f, 11.328f, 7.129f)
            curveTo(11.344f, 7.25f, 11.297f, 7.36f, 11.189f, 7.452f)
            lineTo(11.134f, 7.374f)
            curveTo(11.23f, 7.292f, 11.26f, 7.204f, 11.229f, 7.101f)
            curveTo(11.182f, 6.938f, 11.097f, 6.884f, 10.892f, 6.884f)
            curveTo(10.765f, 6.884f, 10.669f, 6.916f, 10.602f, 6.98f)
            verticalLineTo(7.413f)
            lineTo(10.602f, 7.475f)
            horizontalLineTo(10.423f)
            verticalLineTo(7.406f)
            horizontalLineTo(10.387f)
            verticalLineTo(6.972f)
            curveTo(10.321f, 6.909f, 10.224f, 6.876f, 10.097f, 6.876f)
            close()
            moveTo(9.084f, 7.703f)
            lineTo(9.053f, 7.738f)
            lineTo(9.464f, 8.164f)
            curveTo(9.478f, 8.191f, 9.49f, 8.216f, 9.5f, 8.239f)
            curveTo(9.511f, 8.288f, 9.528f, 8.342f, 9.551f, 8.375f)
            curveTo(9.553f, 8.385f, 9.555f, 8.393f, 9.555f, 8.399f)
            curveTo(9.555f, 8.45f, 9.675f, 8.48f, 9.909f, 8.511f)
            curveTo(10.093f, 8.535f, 10.31f, 8.551f, 10.487f, 8.554f)
            verticalLineTo(8.554f)
            lineTo(10.509f, 8.554f)
            lineTo(10.532f, 8.554f)
            verticalLineTo(8.554f)
            curveTo(10.709f, 8.551f, 10.926f, 8.535f, 11.11f, 8.511f)
            curveTo(11.344f, 8.48f, 11.465f, 8.45f, 11.465f, 8.399f)
            curveTo(11.465f, 8.366f, 11.495f, 8.285f, 11.555f, 8.164f)
            lineTo(11.966f, 7.738f)
            lineTo(11.935f, 7.703f)
            lineTo(11.521f, 8.131f)
            lineTo(11.517f, 8.137f)
            curveTo(11.5f, 8.172f, 11.484f, 8.204f, 11.472f, 8.233f)
            curveTo(11.484f, 8.178f, 11.489f, 8.131f, 11.489f, 8.131f)
            curveTo(11.489f, 8.131f, 11.026f, 7.986f, 10.503f, 7.98f)
            verticalLineTo(7.98f)
            lineTo(10.485f, 7.98f)
            lineTo(10.467f, 7.98f)
            verticalLineTo(7.98f)
            curveTo(9.995f, 7.986f, 9.572f, 8.104f, 9.494f, 8.127f)
            lineTo(9.084f, 7.703f)
            close()
            moveTo(11.423f, 8.369f)
            curveTo(11.403f, 8.4f, 11.378f, 8.416f, 11.347f, 8.4f)
            curveTo(11.249f, 8.349f, 10.602f, 8.302f, 10.485f, 8.294f)
            curveTo(10.369f, 8.302f, 9.722f, 8.349f, 9.624f, 8.4f)
            lineTo(9.619f, 8.402f)
            curveTo(9.633f, 8.408f, 9.653f, 8.414f, 9.678f, 8.42f)
            curveTo(9.735f, 8.435f, 9.817f, 8.449f, 9.915f, 8.462f)
            curveTo(10.104f, 8.487f, 10.33f, 8.503f, 10.509f, 8.505f)
            curveTo(10.689f, 8.503f, 10.915f, 8.487f, 11.105f, 8.462f)
            curveTo(11.202f, 8.449f, 11.284f, 8.435f, 11.341f, 8.42f)
            curveTo(11.371f, 8.413f, 11.393f, 8.406f, 11.408f, 8.399f)
            curveTo(11.413f, 8.396f, 11.417f, 8.394f, 11.42f, 8.392f)
            curveTo(11.42f, 8.385f, 11.422f, 8.377f, 11.423f, 8.369f)
            close()
            moveTo(11.476f, 8.392f)
            lineTo(11.477f, 8.391f)
            lineTo(11.477f, 8.391f)
            lineTo(11.476f, 8.392f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(9.702f, 6.942f)
            lineTo(9.701f, 6.991f)
            curveTo(9.304f, 6.983f, 9.076f, 7.047f, 9.018f, 7.174f)
            curveTo(8.958f, 7.306f, 8.969f, 7.465f, 9.053f, 7.655f)
            lineTo(9.013f, 7.677f)
            curveTo(8.923f, 7.474f, 8.911f, 7.299f, 8.978f, 7.152f)
            curveTo(9.047f, 7.001f, 9.288f, 6.934f, 9.702f, 6.942f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(9.779f, 7.379f)
            lineTo(9.756f, 7.421f)
            curveTo(9.669f, 7.364f, 9.626f, 7.267f, 9.626f, 7.134f)
            curveTo(9.626f, 6.941f, 9.716f, 6.829f, 9.915f, 6.752f)
            curveTo(10.042f, 6.702f, 10.215f, 6.723f, 10.436f, 6.811f)
            lineTo(10.42f, 6.857f)
            curveTo(10.209f, 6.772f, 10.045f, 6.753f, 9.93f, 6.798f)
            curveTo(9.747f, 6.869f, 9.671f, 6.965f, 9.671f, 7.134f)
            curveTo(9.671f, 7.251f, 9.707f, 7.331f, 9.779f, 7.379f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(11.265f, 6.991f)
            lineTo(11.266f, 7.04f)
            curveTo(11.663f, 7.033f, 11.891f, 7.096f, 11.949f, 7.223f)
            curveTo(12.009f, 7.355f, 11.998f, 7.515f, 11.914f, 7.704f)
            lineTo(11.954f, 7.726f)
            curveTo(12.043f, 7.523f, 12.056f, 7.348f, 11.989f, 7.201f)
            curveTo(11.92f, 7.05f, 11.679f, 6.983f, 11.265f, 6.991f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(11.125f, 7.389f)
            lineTo(11.148f, 7.431f)
            curveTo(11.234f, 7.374f, 11.278f, 7.277f, 11.278f, 7.144f)
            curveTo(11.278f, 6.952f, 11.188f, 6.839f, 10.989f, 6.762f)
            curveTo(10.862f, 6.713f, 10.688f, 6.733f, 10.468f, 6.821f)
            lineTo(10.483f, 6.867f)
            curveTo(10.695f, 6.783f, 10.858f, 6.764f, 10.974f, 6.808f)
            curveTo(11.156f, 6.879f, 11.233f, 6.975f, 11.233f, 7.144f)
            curveTo(11.233f, 7.261f, 11.197f, 7.342f, 11.125f, 7.389f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BritishIndianOceanTerritoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.BritishIndianOceanTerritory,
            contentDescription = "British Indian Ocean Territory Flag"
        )
    }
}
