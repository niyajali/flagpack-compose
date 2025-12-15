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
 * Kyrgyzstan Flag (16x12dp)
 *
 * - ISO Alpha-2: KG
 * - ISO Alpha-3: KGZ
 * - ISO Numeric: 417
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Kyrgyzstan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kyrgyzstan:KG:KGZ:417:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.991f, 8.933f)
                curveTo(8.045f, 8.933f, 8.098f, 8.932f, 8.151f, 8.929f)
                lineTo(8.459f, 9.913f)
                lineTo(8.531f, 8.885f)
                curveTo(8.634f, 8.867f, 8.735f, 8.843f, 8.835f, 8.814f)
                lineTo(9.364f, 9.701f)
                lineTo(9.194f, 8.684f)
                curveTo(9.29f, 8.642f, 9.383f, 8.595f, 9.473f, 8.544f)
                lineTo(10.194f, 9.287f)
                lineTo(9.792f, 8.335f)
                curveTo(9.875f, 8.273f, 9.955f, 8.207f, 10.031f, 8.137f)
                lineTo(10.906f, 8.694f)
                lineTo(10.294f, 7.86f)
                curveTo(10.36f, 7.781f, 10.422f, 7.698f, 10.48f, 7.613f)
                lineTo(11.461f, 7.955f)
                lineTo(10.672f, 7.284f)
                curveTo(10.718f, 7.192f, 10.759f, 7.097f, 10.796f, 7f)
                lineTo(11.829f, 7.109f)
                lineTo(10.906f, 6.636f)
                curveTo(10.929f, 6.536f, 10.947f, 6.435f, 10.96f, 6.331f)
                lineTo(11.99f, 6.201f)
                lineTo(10.982f, 5.952f)
                curveTo(10.981f, 5.848f, 10.976f, 5.745f, 10.965f, 5.643f)
                lineTo(11.936f, 5.281f)
                lineTo(10.899f, 5.27f)
                curveTo(10.874f, 5.168f, 10.844f, 5.069f, 10.81f, 4.972f)
                lineTo(11.67f, 4.398f)
                lineTo(10.659f, 4.624f)
                curveTo(10.611f, 4.531f, 10.559f, 4.441f, 10.502f, 4.354f)
                lineTo(11.205f, 3.599f)
                lineTo(10.275f, 4.051f)
                curveTo(10.207f, 3.971f, 10.135f, 3.895f, 10.059f, 3.824f)
                lineTo(10.567f, 2.929f)
                lineTo(9.768f, 3.58f)
                curveTo(9.684f, 3.518f, 9.596f, 3.461f, 9.505f, 3.408f)
                lineTo(9.791f, 2.422f)
                lineTo(9.165f, 3.237f)
                curveTo(9.069f, 3.197f, 8.97f, 3.161f, 8.869f, 3.13f)
                lineTo(8.918f, 2.107f)
                lineTo(8.499f, 3.043f)
                curveTo(8.396f, 3.025f, 8.291f, 3.013f, 8.185f, 3.006f)
                lineTo(7.995f, 2f)
                lineTo(7.805f, 3.006f)
                curveTo(7.698f, 3.012f, 7.593f, 3.024f, 7.49f, 3.041f)
                lineTo(7.072f, 2.107f)
                lineTo(7.121f, 3.128f)
                curveTo(7.019f, 3.158f, 6.919f, 3.194f, 6.822f, 3.235f)
                lineTo(6.198f, 2.422f)
                lineTo(6.483f, 3.404f)
                curveTo(6.392f, 3.457f, 6.303f, 3.515f, 6.218f, 3.577f)
                lineTo(5.422f, 2.929f)
                lineTo(5.927f, 3.819f)
                curveTo(5.851f, 3.892f, 5.778f, 3.968f, 5.71f, 4.048f)
                lineTo(4.784f, 3.599f)
                lineTo(5.483f, 4.35f)
                curveTo(5.425f, 4.438f, 5.372f, 4.529f, 5.324f, 4.622f)
                lineTo(4.319f, 4.398f)
                lineTo(5.174f, 4.968f)
                curveTo(5.138f, 5.066f, 5.108f, 5.167f, 5.083f, 5.27f)
                lineTo(4.053f, 5.281f)
                lineTo(5.018f, 5.641f)
                curveTo(5.007f, 5.744f, 5f, 5.848f, 5f, 5.954f)
                lineTo(3.999f, 6.201f)
                lineTo(5.022f, 6.33f)
                curveTo(5.035f, 6.435f, 5.054f, 6.538f, 5.077f, 6.64f)
                lineTo(4.16f, 7.109f)
                lineTo(5.187f, 7.001f)
                curveTo(5.224f, 7.099f, 5.266f, 7.195f, 5.312f, 7.288f)
                lineTo(4.528f, 7.955f)
                lineTo(5.503f, 7.615f)
                curveTo(5.562f, 7.701f, 5.625f, 7.785f, 5.692f, 7.865f)
                lineTo(5.083f, 8.694f)
                lineTo(5.954f, 8.139f)
                curveTo(6.031f, 8.21f, 6.111f, 8.277f, 6.195f, 8.339f)
                lineTo(5.795f, 9.287f)
                lineTo(6.514f, 8.547f)
                curveTo(6.605f, 8.598f, 6.698f, 8.645f, 6.795f, 8.687f)
                lineTo(6.626f, 9.701f)
                lineTo(7.154f, 8.816f)
                curveTo(7.253f, 8.844f, 7.355f, 8.868f, 7.459f, 8.887f)
                lineTo(7.53f, 9.913f)
                lineTo(7.838f, 8.93f)
                curveTo(7.889f, 8.932f, 7.94f, 8.933f, 7.991f, 8.933f)
                close()
                moveTo(10.241f, 5.958f)
                curveTo(10.241f, 7.2f, 9.226f, 8.207f, 7.973f, 8.207f)
                curveTo(6.72f, 8.207f, 5.705f, 7.2f, 5.705f, 5.958f)
                curveTo(5.705f, 4.715f, 6.72f, 3.708f, 7.973f, 3.708f)
                curveTo(9.226f, 3.708f, 10.241f, 4.715f, 10.241f, 5.958f)
                close()
                moveTo(7.988f, 7.709f)
                curveTo(8.935f, 7.709f, 9.702f, 6.941f, 9.702f, 5.994f)
                curveTo(9.702f, 5.752f, 9.652f, 5.522f, 9.562f, 5.313f)
                curveTo(8.952f, 5.356f, 8.487f, 5.582f, 8.178f, 5.815f)
                lineTo(7.932f, 6f)
                lineTo(7.703f, 5.802f)
                curveTo(7.484f, 5.612f, 7.06f, 5.398f, 6.409f, 5.325f)
                curveTo(6.321f, 5.53f, 6.273f, 5.757f, 6.273f, 5.994f)
                curveTo(6.273f, 6.941f, 7.041f, 7.709f, 7.988f, 7.709f)
                close()
                moveTo(6.751f, 4.807f)
                curveTo(7.063f, 4.482f, 7.502f, 4.28f, 7.988f, 4.28f)
                curveTo(8.466f, 4.28f, 8.899f, 4.476f, 9.21f, 4.792f)
                curveTo(8.72f, 4.849f, 8.305f, 4.971f, 7.968f, 5.162f)
                curveTo(7.668f, 4.99f, 7.262f, 4.873f, 6.751f, 4.807f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun KyrgyzstanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Kyrgyzstan,
            contentDescription = "Kyrgyzstan Flag"
        )
    }
}
