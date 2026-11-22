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
 * Haiti Flag (16x12dp)
 *
 * - ISO Alpha-2: HT
 * - ISO Alpha-3: HTI
 * - ISO Numeric: 332
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Haiti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Haiti:HT:HTI:332:Small",
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
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(3f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-10f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-10f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF279E19)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 8.385f)
                curveTo(3f, 8.385f, 5.4f, 7.321f, 8f, 7.386f)
                curveTo(10.6f, 7.451f, 13f, 8.635f, 13f, 8.635f)
                verticalLineTo(10f)
                horizontalLineTo(3f)
                lineTo(3f, 8.385f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF026A16)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.72f, 3.509f)
                curveTo(5.693f, 3.541f, 5.692f, 3.586f, 5.714f, 3.621f)
                curveTo(5.874f, 3.875f, 6.58f, 4.878f, 7.725f, 4.878f)
                curveTo(8.827f, 4.878f, 9.648f, 3.948f, 9.881f, 3.652f)
                curveTo(9.92f, 3.604f, 9.908f, 3.535f, 9.855f, 3.502f)
                curveTo(9.685f, 3.399f, 9.302f, 3.2f, 8.86f, 3.2f)
                curveTo(8.263f, 3.2f, 7.725f, 3.455f, 7.725f, 3.455f)
                curveTo(7.725f, 3.455f, 6.924f, 3.2f, 6.414f, 3.2f)
                curveTo(6.028f, 3.2f, 5.805f, 3.408f, 5.72f, 3.509f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.895f, 7.407f)
                lineTo(6.999f, 6.84f)
                curveTo(6.475f, 7.083f, 6.213f, 7.562f, 6.213f, 8.279f)
                lineTo(6.907f, 9.419f)
                horizontalLineTo(8.324f)
                horizontalLineTo(9.024f)
                lineTo(9.525f, 8.279f)
                curveTo(9.525f, 8.279f, 9.72f, 6.806f, 9.024f, 6.569f)
                lineTo(7.895f, 7.407f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.934f, 5.816f)
                curveTo(5.934f, 5.816f, 4.581f, 6.286f, 4.581f, 8.018f)
                lineTo(6.386f, 8.375f)
                curveTo(6.386f, 8.375f, 6.364f, 7.382f, 6.904f, 6.917f)
                lineTo(5.934f, 5.816f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(5.268f, 5.264f)
                lineTo(5.483f, 5.046f)
                lineTo(8f, 7.523f)
                lineTo(7.785f, 7.741f)
                lineTo(5.268f, 5.264f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(4.481f, 5.845f)
                lineTo(4.658f, 5.593f)
                lineTo(7.895f, 8.056f)
                lineTo(7.718f, 8.308f)
                lineTo(4.481f, 5.845f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(3.943f, 6.811f)
                lineTo(4.082f, 6.534f)
                lineTo(7.759f, 8.538f)
                lineTo(7.62f, 8.815f)
                lineTo(3.943f, 6.811f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.591f, 8.004f)
                lineTo(7.011f, 8.322f)
                lineTo(6.875f, 8.717f)
                horizontalLineTo(6.491f)
                lineTo(6.753f, 8.941f)
                lineTo(7.342f, 9.103f)
                verticalLineTo(8.717f)
                horizontalLineTo(7.858f)
                verticalLineTo(9.536f)
                horizontalLineTo(6.753f)
                lineTo(6.329f, 8.941f)
                curveTo(6.329f, 8.941f, 5.972f, 9.352f, 5.625f, 9.352f)
                curveTo(5.277f, 9.352f, 4.935f, 9.219f, 4.935f, 8.77f)
                curveTo(4.935f, 8.322f, 4.935f, 8.458f, 4.935f, 8.458f)
                lineTo(4.591f, 8.322f)
                verticalLineTo(8.004f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.808f, 5.723f)
                curveTo(9.808f, 5.723f, 11.394f, 6.286f, 11.394f, 8.018f)
                lineTo(9.574f, 8.374f)
                curveTo(9.574f, 8.374f, 9.491f, 7.093f, 8.93f, 6.628f)
                lineTo(9.808f, 5.723f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(10.679f, 5.264f)
                lineTo(10.455f, 5.046f)
                lineTo(7.743f, 7.323f)
                lineTo(7.968f, 7.54f)
                lineTo(10.679f, 5.264f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(11.499f, 5.845f)
                lineTo(11.314f, 5.593f)
                lineTo(7.943f, 8.056f)
                verticalLineTo(8.518f)
                lineTo(11.499f, 5.845f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFD018))) {
                moveTo(12.058f, 6.811f)
                lineTo(11.915f, 6.534f)
                lineTo(7.857f, 8.505f)
                lineTo(8f, 8.783f)
                lineTo(12.058f, 6.811f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.385f, 8.004f)
                lineTo(8.863f, 8.322f)
                lineTo(9.005f, 8.717f)
                horizontalLineTo(9.405f)
                lineTo(9.133f, 8.941f)
                lineTo(8.519f, 9.103f)
                verticalLineTo(8.717f)
                horizontalLineTo(7.981f)
                verticalLineTo(9.536f)
                horizontalLineTo(9.133f)
                lineTo(9.574f, 8.941f)
                curveTo(9.574f, 8.941f, 9.945f, 9.352f, 10.307f, 9.352f)
                curveTo(10.669f, 9.352f, 11.026f, 9.219f, 11.026f, 8.77f)
                curveTo(11.026f, 8.322f, 11.026f, 8.458f, 11.026f, 8.458f)
                lineTo(11.385f, 8.322f)
                verticalLineTo(8.004f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.692f, 4.679f)
                curveTo(7.692f, 4.679f, 7.528f, 5.882f, 7.528f, 6.372f)
                curveTo(7.528f, 6.862f, 7.692f, 9.466f, 7.692f, 9.466f)
                horizontalLineTo(8.112f)
                curveTo(8.112f, 9.466f, 8.112f, 6.781f, 8.112f, 6.372f)
                curveTo(8.112f, 5.963f, 7.865f, 4.679f, 7.865f, 4.679f)
                horizontalLineTo(7.692f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HaitiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Haiti,
            contentDescription = "Haiti Flag"
        )
    }
}
