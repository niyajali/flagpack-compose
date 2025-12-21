package flagpack.icons.large

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
 * Nicaragua Flag (32x24dp)
 *
 * - ISO Alpha-2: NI
 * - ISO Alpha-3: NIC
 * - ISO Numeric: 558
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Nicaragua: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nicaragua:NI:NIC:558:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF0080EC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0080EC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD0AB00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 8f)
                curveTo(16.188f, 8f, 16.374f, 8.013f, 16.555f, 8.038f)
                lineTo(16.357f, 9.314f)
                curveTo(16.24f, 9.299f, 16.121f, 9.291f, 16f, 9.291f)
                curveTo(15.824f, 9.291f, 15.652f, 9.308f, 15.485f, 9.34f)
                lineTo(15.392f, 8.046f)
                curveTo(15.59f, 8.016f, 15.793f, 8f, 16f, 8f)
                close()
                moveTo(17.152f, 8.168f)
                lineTo(16.805f, 9.412f)
                curveTo(17.908f, 9.755f, 18.709f, 10.784f, 18.709f, 12f)
                curveTo(18.709f, 12.03f, 18.709f, 12.06f, 18.708f, 12.089f)
                lineTo(19.995f, 12.198f)
                curveTo(19.998f, 12.133f, 20f, 12.067f, 20f, 12f)
                curveTo(20f, 10.191f, 18.8f, 8.663f, 17.152f, 8.168f)
                close()
                moveTo(19.513f, 13.914f)
                curveTo(18.88f, 15.075f, 17.687f, 15.887f, 16.296f, 15.989f)
                verticalLineTo(14.693f)
                curveTo(17.037f, 14.613f, 17.688f, 14.233f, 18.126f, 13.679f)
                lineTo(19.513f, 13.914f)
                close()
                moveTo(12.577f, 14.07f)
                curveTo(13.241f, 15.166f, 14.416f, 15.917f, 15.771f, 15.994f)
                verticalLineTo(14.7f)
                curveTo(14.981f, 14.634f, 14.288f, 14.229f, 13.836f, 13.63f)
                lineTo(12.577f, 14.07f)
                close()
                moveTo(12.004f, 12.172f)
                curveTo(12.001f, 12.115f, 12f, 12.057f, 12f, 12f)
                curveTo(12f, 10.302f, 13.059f, 8.85f, 14.552f, 8.27f)
                lineTo(14.886f, 9.53f)
                curveTo(13.951f, 9.952f, 13.299f, 10.89f, 13.291f, 11.981f)
                lineTo(12.004f, 12.172f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7CDFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.975f, 8.95f)
                lineTo(13.238f, 13.681f)
                horizontalLineTo(18.755f)
                lineTo(15.975f, 8.95f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(15.975f, 8.95f)
                lineTo(13.238f, 13.681f)
                horizontalLineTo(18.755f)
                lineTo(15.975f, 8.95f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1f
            ) {
                moveTo(16f, 15.118f)
                curveTo(17.32f, 15.118f, 18.391f, 14.048f, 18.391f, 12.727f)
                curveTo(18.391f, 11.407f, 17.32f, 10.336f, 16f, 10.336f)
                curveTo(14.68f, 10.336f, 13.609f, 11.407f, 13.609f, 12.727f)
                curveTo(13.609f, 14.048f, 14.68f, 15.118f, 16f, 15.118f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 1f
            ) {
                moveTo(16f, 15.118f)
                curveTo(17.32f, 15.118f, 18.391f, 14.048f, 18.391f, 12.727f)
                curveTo(18.391f, 11.407f, 17.32f, 10.336f, 16f, 10.336f)
                curveTo(14.68f, 10.336f, 13.609f, 11.407f, 13.609f, 12.727f)
                curveTo(13.609f, 14.048f, 14.68f, 15.118f, 16f, 15.118f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF4EDD00)),
                strokeLineWidth = 1f
            ) {
                moveTo(16f, 15.118f)
                curveTo(17.32f, 15.118f, 18.391f, 14.048f, 18.391f, 12.727f)
                curveTo(18.391f, 11.407f, 17.32f, 10.336f, 16f, 10.336f)
                curveTo(14.68f, 10.336f, 13.609f, 11.407f, 13.609f, 12.727f)
                curveTo(13.609f, 14.048f, 14.68f, 15.118f, 16f, 15.118f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF3D58DB)),
                strokeLineWidth = 1f
            ) {
                moveTo(16f, 15.118f)
                curveTo(17.32f, 15.118f, 18.391f, 14.048f, 18.391f, 12.727f)
                curveTo(18.391f, 11.407f, 17.32f, 10.336f, 16f, 10.336f)
                curveTo(14.68f, 10.336f, 13.609f, 11.407f, 13.609f, 12.727f)
                curveTo(13.609f, 14.048f, 14.68f, 15.118f, 16f, 15.118f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3D58DB))) {
                moveTo(13.018f, 12.218f)
                horizontalLineToRelative(6.255f)
                verticalLineToRelative(1.818f)
                horizontalLineToRelative(-6.255f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF97C923)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.437f, 12.991f)
                lineTo(14.684f, 11.751f)
                lineTo(15.066f, 12.371f)
                lineTo(15.333f, 11.615f)
                lineTo(15.63f, 12.182f)
                lineTo(15.942f, 11.751f)
                lineTo(16.345f, 12.182f)
                lineTo(16.715f, 11.615f)
                lineTo(17.031f, 12.182f)
                lineTo(17.394f, 11.751f)
                lineTo(18.242f, 12.652f)
                lineTo(18.394f, 12.991f)
                lineTo(13.437f, 13.242f)
                verticalLineTo(12.991f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NicaraguaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Nicaragua,
            contentDescription = "Nicaragua Flag"
        )
    }
}
