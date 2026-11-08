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
 * Liechtenstein Flag (32x24dp)
 *
 * - ISO Alpha-2: LI
 * - ISO Alpha-3: LIE
 * - ISO Numeric: 438
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Liechtenstein: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liechtenstein:LI:LIE:438:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.798f, 11.053f)
                curveTo(4.798f, 11.053f, 6.005f, 11.804f, 8.801f, 11.804f)
                curveTo(11.597f, 11.804f, 13.082f, 11.053f, 13.082f, 11.053f)
                curveTo(13.082f, 11.053f, 10.889f, 9.778f, 8.928f, 9.778f)
                curveTo(6.967f, 9.778f, 4.798f, 11.053f, 4.798f, 11.053f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(4.871f, 6.742f)
                lineTo(4.654f, 6.868f)
                lineTo(4.727f, 6.992f)
                horizontalLineTo(4.871f)
                horizontalLineTo(13.196f)
                horizontalLineTo(13.379f)
                lineTo(13.434f, 6.818f)
                lineTo(13.196f, 6.742f)
                curveTo(13.434f, 6.818f, 13.434f, 6.817f, 13.434f, 6.817f)
                lineTo(13.434f, 6.817f)
                lineTo(13.434f, 6.817f)
                lineTo(13.435f, 6.815f)
                lineTo(13.437f, 6.809f)
                lineTo(13.443f, 6.79f)
                curveTo(13.448f, 6.773f, 13.455f, 6.749f, 13.463f, 6.718f)
                curveTo(13.479f, 6.656f, 13.501f, 6.569f, 13.524f, 6.461f)
                curveTo(13.57f, 6.246f, 13.619f, 5.947f, 13.633f, 5.616f)
                curveTo(13.659f, 4.968f, 13.552f, 4.123f, 12.923f, 3.576f)
                curveTo(12.282f, 3.018f, 11.469f, 3.105f, 10.767f, 3.28f)
                curveTo(10.528f, 3.34f, 10.284f, 3.415f, 10.056f, 3.485f)
                curveTo(9.949f, 3.519f, 9.844f, 3.551f, 9.746f, 3.58f)
                curveTo(9.424f, 3.674f, 9.157f, 3.736f, 8.941f, 3.736f)
                curveTo(8.726f, 3.736f, 8.49f, 3.679f, 8.212f, 3.591f)
                curveTo(8.128f, 3.565f, 8.039f, 3.535f, 7.946f, 3.504f)
                curveTo(7.746f, 3.437f, 7.53f, 3.365f, 7.313f, 3.308f)
                curveTo(6.654f, 3.135f, 5.894f, 3.069f, 5.051f, 3.547f)
                curveTo(4.612f, 3.795f, 4.361f, 4.141f, 4.242f, 4.521f)
                curveTo(4.125f, 4.893f, 4.14f, 5.282f, 4.202f, 5.623f)
                curveTo(4.264f, 5.966f, 4.377f, 6.276f, 4.473f, 6.498f)
                curveTo(4.521f, 6.61f, 4.566f, 6.701f, 4.599f, 6.764f)
                curveTo(4.615f, 6.796f, 4.628f, 6.821f, 4.638f, 6.839f)
                lineTo(4.65f, 6.859f)
                lineTo(4.653f, 6.865f)
                lineTo(4.654f, 6.867f)
                lineTo(4.654f, 6.868f)
                lineTo(4.654f, 6.868f)
                curveTo(4.654f, 6.868f, 4.654f, 6.868f, 4.871f, 6.742f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(3.886f, 6.906f)
                lineTo(4.003f, 7.127f)
                curveTo(3.886f, 6.906f, 3.886f, 6.906f, 3.886f, 6.906f)
                lineTo(3.887f, 6.906f)
                lineTo(3.887f, 6.905f)
                lineTo(3.889f, 6.905f)
                lineTo(3.894f, 6.902f)
                lineTo(3.911f, 6.893f)
                curveTo(3.926f, 6.886f, 3.947f, 6.876f, 3.975f, 6.863f)
                curveTo(4.03f, 6.838f, 4.111f, 6.802f, 4.218f, 6.76f)
                curveTo(4.432f, 6.676f, 4.75f, 6.565f, 5.173f, 6.455f)
                curveTo(6.018f, 6.235f, 7.283f, 6.018f, 8.975f, 6.018f)
                curveTo(10.667f, 6.018f, 11.932f, 6.235f, 12.777f, 6.455f)
                curveTo(13.2f, 6.565f, 13.518f, 6.676f, 13.732f, 6.76f)
                curveTo(13.839f, 6.802f, 13.92f, 6.838f, 13.975f, 6.863f)
                curveTo(14.003f, 6.876f, 14.024f, 6.886f, 14.039f, 6.893f)
                lineTo(14.057f, 6.902f)
                lineTo(14.061f, 6.905f)
                lineTo(14.063f, 6.905f)
                lineTo(14.064f, 6.906f)
                lineTo(14.064f, 6.906f)
                curveTo(14.064f, 6.906f, 14.064f, 6.906f, 13.948f, 7.127f)
                lineTo(14.064f, 6.906f)
                lineTo(14.259f, 7.009f)
                lineTo(14.182f, 7.215f)
                lineTo(12.997f, 10.383f)
                lineTo(12.914f, 10.604f)
                lineTo(3.886f, 6.906f)
                close()
                moveTo(3.886f, 6.906f)
                lineTo(3.693f, 7.008f)
                lineTo(3.768f, 7.213f)
                lineTo(4.921f, 10.381f)
                lineTo(5.001f, 10.602f)
                lineTo(5.227f, 10.535f)
                lineTo(3.886f, 6.906f)
                close()
                moveTo(12.689f, 10.534f)
                lineTo(12.689f, 10.534f)
                lineTo(5.227f, 10.535f)
                lineTo(5.227f, 10.535f)
                lineTo(5.228f, 10.535f)
                lineTo(5.231f, 10.534f)
                lineTo(5.247f, 10.529f)
                curveTo(5.26f, 10.526f, 5.281f, 10.52f, 5.308f, 10.512f)
                curveTo(5.363f, 10.497f, 5.443f, 10.475f, 5.546f, 10.449f)
                curveTo(5.751f, 10.397f, 6.046f, 10.327f, 6.4f, 10.257f)
                curveTo(7.11f, 10.117f, 8.052f, 9.978f, 8.994f, 9.978f)
                curveTo(9.936f, 9.978f, 10.86f, 10.117f, 11.552f, 10.257f)
                curveTo(11.897f, 10.327f, 12.183f, 10.396f, 12.382f, 10.449f)
                curveTo(12.481f, 10.475f, 12.559f, 10.496f, 12.611f, 10.511f)
                curveTo(12.637f, 10.519f, 12.657f, 10.525f, 12.67f, 10.529f)
                lineTo(12.685f, 10.533f)
                lineTo(12.688f, 10.534f)
                lineTo(12.689f, 10.534f)
                lineTo(12.689f, 10.534f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.874f, 4.265f)
                curveTo(9.434f, 4.265f, 9.796f, 3.718f, 9.796f, 3.17f)
                curveTo(9.796f, 2.621f, 9.434f, 2.075f, 8.874f, 2.075f)
                curveTo(8.314f, 2.075f, 7.952f, 2.621f, 7.952f, 3.17f)
                curveTo(7.952f, 3.718f, 8.314f, 4.265f, 8.874f, 4.265f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.126f, 0f)
                horizontalLineTo(8.622f)
                lineTo(8.687f, 0.923f)
                lineTo(8.118f, 0.845f)
                verticalLineTo(1.479f)
                lineTo(8.695f, 1.4f)
                lineTo(8.622f, 2.853f)
                horizontalLineTo(9.126f)
                lineTo(9.051f, 1.397f)
                lineTo(9.63f, 1.479f)
                verticalLineTo(0.845f)
                lineTo(9.062f, 0.927f)
                lineTo(9.126f, 0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.118f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(9.126f, 0f)
                horizontalLineTo(8.622f)
                lineTo(8.687f, 0.923f)
                lineTo(8.118f, 0.845f)
                verticalLineTo(1.479f)
                lineTo(8.695f, 1.4f)
                lineTo(8.622f, 2.853f)
                horizontalLineTo(9.126f)
                lineTo(9.051f, 1.397f)
                lineTo(9.63f, 1.479f)
                verticalLineTo(0.845f)
                lineTo(9.062f, 0.927f)
                lineTo(9.126f, 0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.622f, 0f)
                verticalLineTo(-0.5f)
                horizontalLineTo(8.085f)
                lineTo(8.123f, 0.035f)
                lineTo(8.622f, 0f)
                close()
                moveTo(9.126f, 0f)
                lineTo(9.625f, 0.035f)
                lineTo(9.662f, -0.5f)
                horizontalLineTo(9.126f)
                verticalLineTo(0f)
                close()
                moveTo(8.687f, 0.923f)
                lineTo(8.619f, 1.418f)
                lineTo(9.229f, 1.501f)
                lineTo(9.185f, 0.888f)
                lineTo(8.687f, 0.923f)
                close()
                moveTo(8.118f, 0.845f)
                lineTo(8.185f, 0.35f)
                lineTo(7.618f, 0.273f)
                verticalLineTo(0.845f)
                horizontalLineTo(8.118f)
                close()
                moveTo(8.118f, 1.479f)
                horizontalLineTo(7.618f)
                verticalLineTo(2.053f)
                lineTo(8.186f, 1.975f)
                lineTo(8.118f, 1.479f)
                close()
                moveTo(8.695f, 1.4f)
                lineTo(9.195f, 1.425f)
                lineTo(9.225f, 0.822f)
                lineTo(8.627f, 0.904f)
                lineTo(8.695f, 1.4f)
                close()
                moveTo(8.622f, 2.853f)
                lineTo(8.122f, 2.828f)
                lineTo(8.096f, 3.353f)
                horizontalLineTo(8.622f)
                verticalLineTo(2.853f)
                close()
                moveTo(9.126f, 2.853f)
                verticalLineTo(3.353f)
                horizontalLineTo(9.652f)
                lineTo(9.625f, 2.827f)
                lineTo(9.126f, 2.853f)
                close()
                moveTo(9.051f, 1.397f)
                lineTo(9.121f, 0.902f)
                lineTo(8.521f, 0.817f)
                lineTo(8.552f, 1.423f)
                lineTo(9.051f, 1.397f)
                close()
                moveTo(9.63f, 1.479f)
                lineTo(9.56f, 1.974f)
                lineTo(10.13f, 2.055f)
                verticalLineTo(1.479f)
                horizontalLineTo(9.63f)
                close()
                moveTo(9.63f, 0.845f)
                horizontalLineTo(10.13f)
                verticalLineTo(0.268f)
                lineTo(9.559f, 0.35f)
                lineTo(9.63f, 0.845f)
                close()
                moveTo(9.062f, 0.927f)
                lineTo(8.563f, 0.892f)
                lineTo(8.52f, 1.51f)
                lineTo(9.133f, 1.422f)
                lineTo(9.062f, 0.927f)
                close()
                moveTo(8.622f, 0.5f)
                horizontalLineTo(9.126f)
                verticalLineTo(-0.5f)
                horizontalLineTo(8.622f)
                verticalLineTo(0.5f)
                close()
                moveTo(9.185f, 0.888f)
                lineTo(9.121f, -0.035f)
                lineTo(8.123f, 0.035f)
                lineTo(8.188f, 0.958f)
                lineTo(9.185f, 0.888f)
                close()
                moveTo(8.05f, 1.341f)
                lineTo(8.619f, 1.418f)
                lineTo(8.754f, 0.427f)
                lineTo(8.185f, 0.35f)
                lineTo(8.05f, 1.341f)
                close()
                moveTo(8.618f, 1.479f)
                verticalLineTo(0.845f)
                horizontalLineTo(7.618f)
                verticalLineTo(1.479f)
                horizontalLineTo(8.618f)
                close()
                moveTo(8.627f, 0.904f)
                lineTo(8.049f, 0.984f)
                lineTo(8.186f, 1.975f)
                lineTo(8.764f, 1.895f)
                lineTo(8.627f, 0.904f)
                close()
                moveTo(9.121f, 2.878f)
                lineTo(9.195f, 1.425f)
                lineTo(8.196f, 1.374f)
                lineTo(8.122f, 2.828f)
                lineTo(9.121f, 2.878f)
                close()
                moveTo(9.126f, 2.353f)
                horizontalLineTo(8.622f)
                verticalLineTo(3.353f)
                horizontalLineTo(9.126f)
                verticalLineTo(2.353f)
                close()
                moveTo(8.552f, 1.423f)
                lineTo(8.627f, 2.878f)
                lineTo(9.625f, 2.827f)
                lineTo(9.551f, 1.372f)
                lineTo(8.552f, 1.423f)
                close()
                moveTo(9.7f, 0.984f)
                lineTo(9.121f, 0.902f)
                lineTo(8.981f, 1.892f)
                lineTo(9.56f, 1.974f)
                lineTo(9.7f, 0.984f)
                close()
                moveTo(9.13f, 0.845f)
                verticalLineTo(1.479f)
                horizontalLineTo(10.13f)
                verticalLineTo(0.845f)
                horizontalLineTo(9.13f)
                close()
                moveTo(9.133f, 1.422f)
                lineTo(9.701f, 1.34f)
                lineTo(9.559f, 0.35f)
                lineTo(8.991f, 0.432f)
                lineTo(9.133f, 1.422f)
                close()
                moveTo(8.627f, -0.035f)
                lineTo(8.563f, 0.892f)
                lineTo(9.561f, 0.961f)
                lineTo(9.625f, 0.035f)
                lineTo(8.627f, -0.035f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LiechtensteinPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Liechtenstein,
            contentDescription = "Liechtenstein Flag"
        )
    }
}
