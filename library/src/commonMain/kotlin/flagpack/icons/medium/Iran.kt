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
 * Iran Flag (20x15dp)
 *
 * - ISO Alpha-2: IR
 * - ISO Alpha-3: IRN
 * - ISO Numeric: 364
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Iran: ImageVector by lazy {
    ImageVector.Builder(
        name = "Iran:IR:IRN:364:Medium",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.233f, 10.854f)
                horizontalLineTo(-1.188f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(-1.203f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(-0.74f)
                verticalLineTo(11.406f)
                horizontalLineTo(-0.273f)
                verticalLineTo(11.091f)
                horizontalLineTo(-0.515f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.211f, 11.404f)
                horizontalLineTo(-0.024f)
                verticalLineTo(11.098f)
                horizontalLineTo(0.472f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(0.696f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.949f, 10.88f)
                curveTo(0.949f, 10.911f, 0.949f, 11.406f, 0.949f, 11.406f)
                horizontalLineTo(0.716f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(2.672f, 10.854f)
                horizontalLineTo(1.251f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(1.236f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(1.699f)
                verticalLineTo(11.406f)
                horizontalLineTo(2.166f)
                verticalLineTo(11.091f)
                horizontalLineTo(1.924f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(2.694f, 11.404f)
                horizontalLineTo(2.458f)
                verticalLineTo(11.098f)
                horizontalLineTo(2.954f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(3.179f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(3.431f, 10.88f)
                curveTo(3.431f, 10.911f, 3.431f, 11.406f, 3.431f, 11.406f)
                horizontalLineTo(3.198f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.155f, 10.854f)
                horizontalLineTo(3.733f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(3.719f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(4.181f)
                verticalLineTo(11.406f)
                horizontalLineTo(4.649f)
                verticalLineTo(11.091f)
                horizontalLineTo(4.406f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.133f, 11.404f)
                horizontalLineTo(4.897f)
                verticalLineTo(11.098f)
                horizontalLineTo(5.393f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(5.618f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.87f, 10.88f)
                curveTo(5.87f, 10.911f, 5.87f, 11.406f, 5.87f, 11.406f)
                horizontalLineTo(5.637f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(7.594f, 10.854f)
                horizontalLineTo(6.172f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(6.158f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(6.62f)
                verticalLineTo(11.406f)
                horizontalLineTo(7.088f)
                verticalLineTo(11.091f)
                horizontalLineTo(6.845f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(7.572f, 11.404f)
                horizontalLineTo(7.336f)
                verticalLineTo(11.098f)
                horizontalLineTo(7.832f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(8.057f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.309f, 10.88f)
                curveTo(8.309f, 10.911f, 8.309f, 11.406f, 8.309f, 11.406f)
                horizontalLineTo(8.076f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.033f, 10.854f)
                horizontalLineTo(8.611f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.597f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(9.059f)
                verticalLineTo(11.406f)
                horizontalLineTo(9.527f)
                verticalLineTo(11.091f)
                horizontalLineTo(9.284f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.055f, 11.404f)
                horizontalLineTo(9.819f)
                verticalLineTo(11.098f)
                horizontalLineTo(10.315f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(10.54f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.792f, 10.88f)
                curveTo(10.792f, 10.911f, 10.792f, 11.406f, 10.792f, 11.406f)
                horizontalLineTo(10.559f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.515f, 10.854f)
                horizontalLineTo(11.094f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(11.079f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(11.542f)
                verticalLineTo(11.406f)
                horizontalLineTo(12.009f)
                verticalLineTo(11.091f)
                horizontalLineTo(11.767f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.537f, 11.404f)
                horizontalLineTo(12.302f)
                verticalLineTo(11.098f)
                horizontalLineTo(12.798f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(13.022f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.275f, 10.88f)
                curveTo(13.275f, 10.911f, 13.275f, 11.406f, 13.275f, 11.406f)
                horizontalLineTo(13.042f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(14.998f, 10.854f)
                horizontalLineTo(13.576f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.562f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(14.024f)
                verticalLineTo(11.406f)
                horizontalLineTo(14.492f)
                verticalLineTo(11.091f)
                horizontalLineTo(14.249f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(15.02f, 11.404f)
                horizontalLineTo(14.784f)
                verticalLineTo(11.098f)
                horizontalLineTo(15.28f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(15.505f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(15.757f, 10.88f)
                curveTo(15.757f, 10.911f, 15.757f, 11.406f, 15.757f, 11.406f)
                horizontalLineTo(15.524f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(17.48f, 10.854f)
                horizontalLineTo(16.059f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(16.044f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(16.507f)
                verticalLineTo(11.406f)
                horizontalLineTo(16.975f)
                verticalLineTo(11.091f)
                horizontalLineTo(16.732f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(17.459f, 11.404f)
                horizontalLineTo(17.223f)
                verticalLineTo(11.098f)
                horizontalLineTo(17.719f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(17.944f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(18.196f, 10.88f)
                curveTo(18.196f, 10.911f, 18.196f, 11.406f, 18.196f, 11.406f)
                horizontalLineTo(17.963f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(19.919f, 10.854f)
                horizontalLineTo(18.498f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(18.483f, 11.417f)
                verticalLineTo(11.091f)
                horizontalLineTo(18.946f)
                verticalLineTo(11.406f)
                horizontalLineTo(19.414f)
                verticalLineTo(11.091f)
                horizontalLineTo(19.171f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(20.028f, 11.404f)
                horizontalLineTo(19.793f)
                verticalLineTo(11.098f)
                horizontalLineTo(20.289f)
                verticalLineTo(10.847f)
                verticalLineTo(11.404f)
                horizontalLineTo(20.513f)
                verticalLineTo(10.847f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.233f, 3.229f)
                horizontalLineTo(-1.188f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(-1.203f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(-0.74f)
                verticalLineTo(3.781f)
                horizontalLineTo(-0.273f)
                verticalLineTo(3.466f)
                horizontalLineTo(-0.515f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.211f, 3.779f)
                horizontalLineTo(-0.024f)
                verticalLineTo(3.473f)
                horizontalLineTo(0.472f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(0.696f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(0.949f, 3.255f)
                curveTo(0.949f, 3.286f, 0.949f, 3.781f, 0.949f, 3.781f)
                horizontalLineTo(0.716f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(2.672f, 3.229f)
                horizontalLineTo(1.251f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(1.236f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(1.699f)
                verticalLineTo(3.781f)
                horizontalLineTo(2.166f)
                verticalLineTo(3.466f)
                horizontalLineTo(1.924f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(2.694f, 3.779f)
                horizontalLineTo(2.458f)
                verticalLineTo(3.473f)
                horizontalLineTo(2.954f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(3.179f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(3.431f, 3.255f)
                curveTo(3.431f, 3.286f, 3.431f, 3.781f, 3.431f, 3.781f)
                horizontalLineTo(3.198f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.155f, 3.229f)
                horizontalLineTo(3.733f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(3.719f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(4.181f)
                verticalLineTo(3.781f)
                horizontalLineTo(4.649f)
                verticalLineTo(3.466f)
                horizontalLineTo(4.406f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.133f, 3.779f)
                horizontalLineTo(4.897f)
                verticalLineTo(3.473f)
                horizontalLineTo(5.393f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(5.618f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(5.87f, 3.255f)
                curveTo(5.87f, 3.286f, 5.87f, 3.781f, 5.87f, 3.781f)
                horizontalLineTo(5.637f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(7.594f, 3.229f)
                horizontalLineTo(6.172f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(6.158f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(6.62f)
                verticalLineTo(3.781f)
                horizontalLineTo(7.088f)
                verticalLineTo(3.466f)
                horizontalLineTo(6.845f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(7.572f, 3.779f)
                horizontalLineTo(7.336f)
                verticalLineTo(3.473f)
                horizontalLineTo(7.832f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(8.057f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.309f, 3.255f)
                curveTo(8.309f, 3.286f, 8.309f, 3.781f, 8.309f, 3.781f)
                horizontalLineTo(8.076f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.033f, 3.229f)
                horizontalLineTo(8.611f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.597f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(9.059f)
                verticalLineTo(3.781f)
                horizontalLineTo(9.527f)
                verticalLineTo(3.466f)
                horizontalLineTo(9.284f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.055f, 3.779f)
                horizontalLineTo(9.819f)
                verticalLineTo(3.473f)
                horizontalLineTo(10.315f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(10.54f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.792f, 3.255f)
                curveTo(10.792f, 3.286f, 10.792f, 3.781f, 10.792f, 3.781f)
                horizontalLineTo(10.559f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.515f, 3.229f)
                horizontalLineTo(11.094f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(11.079f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(11.542f)
                verticalLineTo(3.781f)
                horizontalLineTo(12.009f)
                verticalLineTo(3.466f)
                horizontalLineTo(11.767f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.537f, 3.779f)
                horizontalLineTo(12.302f)
                verticalLineTo(3.473f)
                horizontalLineTo(12.798f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(13.022f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.275f, 3.255f)
                curveTo(13.275f, 3.286f, 13.275f, 3.781f, 13.275f, 3.781f)
                horizontalLineTo(13.042f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(14.998f, 3.229f)
                horizontalLineTo(13.576f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.562f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(14.024f)
                verticalLineTo(3.781f)
                horizontalLineTo(14.492f)
                verticalLineTo(3.466f)
                horizontalLineTo(14.249f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(15.02f, 3.779f)
                horizontalLineTo(14.784f)
                verticalLineTo(3.473f)
                horizontalLineTo(15.28f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(15.505f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(15.757f, 3.255f)
                curveTo(15.757f, 3.286f, 15.757f, 3.781f, 15.757f, 3.781f)
                horizontalLineTo(15.524f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(17.48f, 3.229f)
                horizontalLineTo(16.059f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(16.044f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(16.507f)
                verticalLineTo(3.781f)
                horizontalLineTo(16.975f)
                verticalLineTo(3.466f)
                horizontalLineTo(16.732f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(17.459f, 3.779f)
                horizontalLineTo(17.223f)
                verticalLineTo(3.473f)
                horizontalLineTo(17.719f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(17.944f)
                verticalLineTo(3.222f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(18.196f, 3.255f)
                curveTo(18.196f, 3.286f, 18.196f, 3.781f, 18.196f, 3.781f)
                horizontalLineTo(17.963f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(19.919f, 3.229f)
                horizontalLineTo(18.498f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(18.483f, 3.792f)
                verticalLineTo(3.466f)
                horizontalLineTo(18.946f)
                verticalLineTo(3.781f)
                horizontalLineTo(19.414f)
                verticalLineTo(3.466f)
                horizontalLineTo(19.171f)
            }
            path(
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(20.028f, 3.779f)
                horizontalLineTo(19.793f)
                verticalLineTo(3.473f)
                horizontalLineTo(20.289f)
                verticalLineTo(3.222f)
                verticalLineTo(3.779f)
                horizontalLineTo(20.513f)
                verticalLineTo(3.222f)
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.129f, 5.156f)
                curveTo(9.129f, 5.156f, 9.396f, 5.297f, 9.669f, 5.297f)
                curveTo(9.943f, 5.297f, 10.218f, 5.156f, 10.218f, 5.156f)
                verticalLineTo(5.344f)
                curveTo(10.218f, 5.344f, 9.917f, 5.484f, 9.652f, 5.484f)
                curveTo(9.386f, 5.484f, 9.129f, 5.344f, 9.129f, 5.344f)
                verticalLineTo(5.156f)
                close()
                moveTo(7.16f, 7.369f)
                curveTo(7.16f, 6.258f, 8.686f, 5.531f, 8.686f, 5.531f)
                curveTo(8.686f, 5.531f, 7.804f, 6.004f, 7.804f, 7.323f)
                curveTo(7.804f, 8.641f, 8.262f, 9.212f, 8.262f, 9.212f)
                curveTo(8.262f, 9.212f, 7.16f, 8.48f, 7.16f, 7.369f)
                close()
                moveTo(12.309f, 7.308f)
                curveTo(12.309f, 6.197f, 10.784f, 5.531f, 10.784f, 5.531f)
                curveTo(10.784f, 5.531f, 11.666f, 6.004f, 11.666f, 7.323f)
                curveTo(11.666f, 8.641f, 11.208f, 9.212f, 11.208f, 9.212f)
                curveTo(11.208f, 9.212f, 12.309f, 8.419f, 12.309f, 7.308f)
                close()
                moveTo(8.202f, 7.611f)
                curveTo(8.144f, 6.501f, 9.067f, 5.507f, 9.067f, 5.507f)
                curveTo(9.067f, 5.507f, 8.731f, 5.964f, 8.8f, 7.281f)
                curveTo(8.824f, 7.733f, 9.002f, 8.405f, 9.226f, 8.802f)
                verticalLineTo(5.578f)
                horizontalLineTo(10.164f)
                verticalLineTo(8.83f)
                curveTo(10.389f, 8.459f, 10.562f, 7.828f, 10.586f, 7.369f)
                curveTo(10.655f, 6.052f, 10.335f, 5.507f, 10.335f, 5.507f)
                curveTo(10.335f, 5.507f, 11.258f, 6.501f, 11.2f, 7.611f)
                curveTo(11.165f, 8.272f, 10.657f, 8.971f, 10.251f, 9.428f)
                curveTo(10.448f, 9.472f, 10.712f, 9.526f, 11.075f, 9.597f)
                curveTo(11.083f, 9.638f, 11.002f, 9.636f, 10.842f, 9.632f)
                curveTo(10.664f, 9.628f, 10.389f, 9.622f, 10.028f, 9.667f)
                curveTo(9.863f, 9.837f, 9.747f, 9.938f, 9.747f, 9.938f)
                curveTo(9.747f, 9.938f, 9.729f, 9.913f, 9.701f, 9.879f)
                curveTo(9.673f, 9.913f, 9.655f, 9.938f, 9.655f, 9.938f)
                curveTo(9.655f, 9.938f, 9.539f, 9.837f, 9.374f, 9.667f)
                curveTo(9.013f, 9.622f, 8.738f, 9.628f, 8.561f, 9.632f)
                curveTo(8.4f, 9.636f, 8.319f, 9.638f, 8.326f, 9.597f)
                curveTo(8.69f, 9.526f, 8.954f, 9.472f, 9.151f, 9.428f)
                curveTo(8.745f, 8.971f, 8.237f, 8.272f, 8.202f, 7.611f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IranPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Iran,
            contentDescription = "Iran Flag"
        )
    }
}
