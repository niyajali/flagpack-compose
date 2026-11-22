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
 * Rwanda Flag (16x12dp)
 *
 * - ISO Alpha-2: RW
 * - ISO Alpha-3: RWA
 * - ISO Numeric: 646
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Rwanda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Rwanda:RW:RWA:646:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF3CA5D9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5A962A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.041f, 5.933f)
                curveTo(12.024f, 5.933f, 12.008f, 5.933f, 11.991f, 5.933f)
                curveTo(11.977f, 5.933f, 11.962f, 5.933f, 11.948f, 5.933f)
                lineTo(11.646f, 6.92f)
                lineTo(11.582f, 5.892f)
                curveTo(11.552f, 5.886f, 11.521f, 5.879f, 11.491f, 5.871f)
                lineTo(10.968f, 6.761f)
                lineTo(11.145f, 5.747f)
                curveTo(11.116f, 5.734f, 11.088f, 5.72f, 11.061f, 5.706f)
                lineTo(10.345f, 6.451f)
                lineTo(10.753f, 5.507f)
                curveTo(10.728f, 5.487f, 10.704f, 5.467f, 10.68f, 5.447f)
                lineTo(9.811f, 6.008f)
                lineTo(10.427f, 5.184f)
                curveTo(10.407f, 5.159f, 10.388f, 5.133f, 10.369f, 5.108f)
                lineTo(9.394f, 5.455f)
                lineTo(10.185f, 4.795f)
                curveTo(10.171f, 4.766f, 10.158f, 4.736f, 10.146f, 4.706f)
                lineTo(9.118f, 4.822f)
                lineTo(10.04f, 4.36f)
                curveTo(10.033f, 4.329f, 10.028f, 4.297f, 10.023f, 4.265f)
                lineTo(8.997f, 4.143f)
                lineTo(10.001f, 3.904f)
                curveTo(10.002f, 3.871f, 10.004f, 3.839f, 10.007f, 3.807f)
                lineTo(9.038f, 3.454f)
                lineTo(10.069f, 3.451f)
                curveTo(10.078f, 3.419f, 10.087f, 3.388f, 10.097f, 3.357f)
                lineTo(9.238f, 2.794f)
                lineTo(10.242f, 3.026f)
                curveTo(10.258f, 2.997f, 10.275f, 2.969f, 10.292f, 2.941f)
                lineTo(9.586f, 2.196f)
                lineTo(10.51f, 2.652f)
                curveTo(10.532f, 2.628f, 10.555f, 2.604f, 10.578f, 2.581f)
                lineTo(10.065f, 1.695f)
                lineTo(10.858f, 2.349f)
                curveTo(10.885f, 2.331f, 10.912f, 2.313f, 10.94f, 2.296f)
                lineTo(10.647f, 1.316f)
                lineTo(11.267f, 2.134f)
                curveTo(11.297f, 2.122f, 11.328f, 2.111f, 11.359f, 2.101f)
                lineTo(11.302f, 1.08f)
                lineTo(11.715f, 2.019f)
                curveTo(11.747f, 2.014f, 11.779f, 2.011f, 11.811f, 2.008f)
                lineTo(11.995f, 1f)
                lineTo(12.178f, 2.009f)
                curveTo(12.21f, 2.011f, 12.242f, 2.015f, 12.274f, 2.02f)
                lineTo(12.687f, 1.08f)
                lineTo(12.63f, 2.104f)
                curveTo(12.661f, 2.114f, 12.691f, 2.125f, 12.721f, 2.136f)
                lineTo(13.342f, 1.316f)
                lineTo(13.048f, 2.3f)
                curveTo(13.075f, 2.316f, 13.102f, 2.334f, 13.128f, 2.352f)
                lineTo(13.925f, 1.695f)
                lineTo(13.409f, 2.586f)
                curveTo(13.431f, 2.608f, 13.453f, 2.631f, 13.474f, 2.654f)
                lineTo(14.403f, 2.196f)
                lineTo(13.693f, 2.946f)
                curveTo(13.71f, 2.972f, 13.725f, 3f, 13.741f, 3.027f)
                lineTo(14.752f, 2.794f)
                lineTo(13.886f, 3.361f)
                curveTo(13.896f, 3.391f, 13.905f, 3.421f, 13.913f, 3.451f)
                lineTo(14.951f, 3.454f)
                lineTo(13.976f, 3.809f)
                curveTo(13.978f, 3.84f, 13.98f, 3.871f, 13.981f, 3.902f)
                lineTo(14.992f, 4.143f)
                lineTo(13.959f, 4.265f)
                curveTo(13.955f, 4.296f, 13.949f, 4.327f, 13.943f, 4.357f)
                lineTo(14.871f, 4.822f)
                lineTo(13.837f, 4.706f)
                curveTo(13.825f, 4.734f, 13.813f, 4.762f, 13.8f, 4.79f)
                lineTo(14.595f, 5.455f)
                lineTo(13.614f, 5.106f)
                curveTo(13.597f, 5.13f, 13.578f, 5.155f, 13.559f, 5.179f)
                lineTo(14.179f, 6.008f)
                lineTo(13.305f, 5.444f)
                curveTo(13.282f, 5.464f, 13.259f, 5.484f, 13.234f, 5.503f)
                lineTo(13.644f, 6.451f)
                lineTo(12.926f, 5.703f)
                curveTo(12.899f, 5.718f, 12.872f, 5.731f, 12.844f, 5.744f)
                lineTo(13.021f, 6.761f)
                lineTo(12.497f, 5.869f)
                curveTo(12.467f, 5.877f, 12.438f, 5.884f, 12.407f, 5.89f)
                lineTo(12.343f, 6.92f)
                lineTo(12.041f, 5.933f)
                close()
                moveTo(11.973f, 5.207f)
                curveTo(12.673f, 5.207f, 13.241f, 4.648f, 13.241f, 3.958f)
                curveTo(13.241f, 3.268f, 12.673f, 2.708f, 11.973f, 2.708f)
                curveTo(11.273f, 2.708f, 10.705f, 3.268f, 10.705f, 3.958f)
                curveTo(10.705f, 4.648f, 11.273f, 5.207f, 11.973f, 5.207f)
                close()
                moveTo(12.702f, 3.994f)
                curveTo(12.702f, 4.389f, 12.382f, 4.709f, 11.988f, 4.709f)
                curveTo(11.593f, 4.709f, 11.273f, 4.389f, 11.273f, 3.994f)
                curveTo(11.273f, 3.6f, 11.593f, 3.28f, 11.988f, 3.28f)
                curveTo(12.382f, 3.28f, 12.702f, 3.6f, 12.702f, 3.994f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun RwandaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Rwanda,
            contentDescription = "Rwanda Flag"
        )
    }
}
