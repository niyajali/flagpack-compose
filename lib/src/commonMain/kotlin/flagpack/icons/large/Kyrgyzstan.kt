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
 * Kyrgyzstan Flag (32x24dp)
 *
 * - ISO Alpha-2: KG
 * - ISO Alpha-3: KGZ
 * - ISO Numeric: 417
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Kyrgyzstan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kyrgyzstan:KG:KGZ:417:Large",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.982f, 17.867f)
                curveTo(16.089f, 17.867f, 16.196f, 17.864f, 16.302f, 17.858f)
                lineTo(16.919f, 19.826f)
                lineTo(17.062f, 17.771f)
                curveTo(17.268f, 17.733f, 17.471f, 17.685f, 17.669f, 17.628f)
                lineTo(18.727f, 19.401f)
                lineTo(18.388f, 17.367f)
                curveTo(18.579f, 17.284f, 18.765f, 17.191f, 18.945f, 17.089f)
                lineTo(20.388f, 18.574f)
                lineTo(19.585f, 16.671f)
                curveTo(19.75f, 16.546f, 19.91f, 16.414f, 20.061f, 16.273f)
                lineTo(21.812f, 17.389f)
                lineTo(20.587f, 15.72f)
                curveTo(20.72f, 15.562f, 20.844f, 15.397f, 20.96f, 15.225f)
                lineTo(22.922f, 15.91f)
                lineTo(21.344f, 14.568f)
                curveTo(21.436f, 14.384f, 21.518f, 14.194f, 21.591f, 14f)
                lineTo(23.658f, 14.217f)
                lineTo(21.811f, 13.273f)
                curveTo(21.858f, 13.073f, 21.894f, 12.87f, 21.919f, 12.663f)
                lineTo(23.981f, 12.402f)
                lineTo(21.964f, 11.905f)
                curveTo(21.963f, 11.696f, 21.951f, 11.49f, 21.929f, 11.286f)
                lineTo(23.873f, 10.561f)
                lineTo(21.798f, 10.539f)
                curveTo(21.749f, 10.336f, 21.689f, 10.138f, 21.619f, 9.944f)
                lineTo(23.34f, 8.795f)
                lineTo(21.318f, 9.248f)
                curveTo(21.222f, 9.062f, 21.118f, 8.882f, 21.004f, 8.709f)
                lineTo(22.41f, 7.199f)
                lineTo(20.549f, 8.101f)
                curveTo(20.414f, 7.942f, 20.27f, 7.791f, 20.119f, 7.647f)
                lineTo(21.135f, 5.858f)
                lineTo(19.536f, 7.16f)
                curveTo(19.367f, 7.036f, 19.192f, 6.921f, 19.01f, 6.815f)
                lineTo(19.582f, 4.845f)
                lineTo(18.331f, 6.475f)
                curveTo(18.138f, 6.393f, 17.94f, 6.321f, 17.737f, 6.26f)
                lineTo(17.835f, 4.214f)
                lineTo(16.998f, 6.085f)
                curveTo(16.792f, 6.05f, 16.582f, 6.026f, 16.369f, 6.012f)
                lineTo(15.989f, 4f)
                lineTo(15.609f, 6.011f)
                curveTo(15.396f, 6.024f, 15.186f, 6.048f, 14.98f, 6.083f)
                lineTo(14.143f, 4.214f)
                lineTo(14.241f, 6.255f)
                curveTo(14.037f, 6.317f, 13.838f, 6.388f, 13.644f, 6.47f)
                lineTo(12.397f, 4.845f)
                lineTo(12.966f, 6.808f)
                curveTo(12.783f, 6.914f, 12.606f, 7.03f, 12.436f, 7.154f)
                lineTo(10.844f, 5.858f)
                lineTo(11.855f, 7.638f)
                curveTo(11.702f, 7.783f, 11.556f, 7.936f, 11.419f, 8.096f)
                lineTo(9.568f, 7.199f)
                lineTo(10.966f, 8.7f)
                curveTo(10.85f, 8.875f, 10.744f, 9.057f, 10.648f, 9.245f)
                lineTo(8.639f, 8.795f)
                lineTo(10.347f, 9.936f)
                curveTo(10.277f, 10.132f, 10.216f, 10.334f, 10.166f, 10.539f)
                lineTo(8.106f, 10.561f)
                lineTo(10.036f, 11.281f)
                curveTo(10.013f, 11.487f, 10.001f, 11.697f, 10f, 11.908f)
                lineTo(7.998f, 12.402f)
                lineTo(10.045f, 12.661f)
                curveTo(10.07f, 12.871f, 10.107f, 13.077f, 10.155f, 13.279f)
                lineTo(8.32f, 14.217f)
                lineTo(10.373f, 14.001f)
                curveTo(10.447f, 14.198f, 10.531f, 14.39f, 10.625f, 14.576f)
                lineTo(9.057f, 15.91f)
                lineTo(11.007f, 15.229f)
                curveTo(11.124f, 15.403f, 11.25f, 15.57f, 11.384f, 15.73f)
                lineTo(10.167f, 17.389f)
                lineTo(11.908f, 16.279f)
                curveTo(12.062f, 16.42f, 12.223f, 16.554f, 12.39f, 16.679f)
                lineTo(11.59f, 18.574f)
                lineTo(13.028f, 17.094f)
                curveTo(13.21f, 17.197f, 13.397f, 17.29f, 13.589f, 17.373f)
                lineTo(13.251f, 19.401f)
                lineTo(14.307f, 17.631f)
                curveTo(14.506f, 17.689f, 14.71f, 17.736f, 14.917f, 17.773f)
                lineTo(15.06f, 19.826f)
                lineTo(15.677f, 17.859f)
                curveTo(15.778f, 17.864f, 15.88f, 17.867f, 15.982f, 17.867f)
                close()
                moveTo(20.482f, 11.916f)
                curveTo(20.482f, 14.401f, 18.451f, 16.415f, 15.946f, 16.415f)
                curveTo(13.441f, 16.415f, 11.41f, 14.401f, 11.41f, 11.916f)
                curveTo(11.41f, 9.431f, 13.441f, 7.417f, 15.946f, 7.417f)
                curveTo(18.451f, 7.417f, 20.482f, 9.431f, 20.482f, 11.916f)
                close()
                moveTo(19.11f, 13.381f)
                curveTo(19.299f, 12.956f, 19.405f, 12.485f, 19.405f, 11.989f)
                curveTo(19.405f, 11.505f, 19.304f, 11.044f, 19.123f, 10.626f)
                curveTo(18.34f, 10.682f, 17.677f, 10.888f, 17.139f, 11.151f)
                curveTo(18.333f, 11.674f, 18.874f, 12.534f, 19.11f, 13.381f)
                close()
                moveTo(18.725f, 14.039f)
                curveTo(18.627f, 14.17f, 18.52f, 14.293f, 18.405f, 14.409f)
                curveTo(18.341f, 13.229f, 17.836f, 12.328f, 16.93f, 11.357f)
                curveTo(18.052f, 11.894f, 18.684f, 13.178f, 18.725f, 14.039f)
                close()
                moveTo(17.866f, 14.85f)
                curveTo(17.803f, 14.892f, 17.738f, 14.932f, 17.672f, 14.97f)
                curveTo(17.403f, 13.643f, 16.893f, 12.597f, 16.183f, 11.76f)
                lineTo(16.355f, 11.63f)
                curveTo(16.378f, 11.613f, 16.402f, 11.596f, 16.425f, 11.579f)
                curveTo(17.333f, 12.623f, 17.906f, 13.519f, 17.866f, 14.85f)
                close()
                moveTo(15.975f, 15.418f)
                curveTo(16.378f, 15.418f, 16.764f, 15.349f, 17.123f, 15.221f)
                curveTo(16.862f, 13.959f, 16.408f, 12.784f, 15.751f, 11.935f)
                curveTo(14.965f, 12.87f, 14.566f, 13.927f, 14.551f, 15.109f)
                curveTo(14.985f, 15.308f, 15.467f, 15.418f, 15.975f, 15.418f)
                close()
                moveTo(15.315f, 11.529f)
                curveTo(15.343f, 11.55f, 15.369f, 11.572f, 15.394f, 11.593f)
                curveTo(14.557f, 12.544f, 14.099f, 13.617f, 14.022f, 14.807f)
                curveTo(13.919f, 14.736f, 13.82f, 14.659f, 13.726f, 14.577f)
                curveTo(14.041f, 13.319f, 14.564f, 12.281f, 15.315f, 11.529f)
                close()
                moveTo(12.818f, 10.649f)
                curveTo(13.604f, 10.738f, 14.224f, 10.929f, 14.689f, 11.15f)
                curveTo(13.504f, 11.654f, 13.037f, 12.465f, 12.803f, 13.292f)
                curveTo(12.637f, 12.891f, 12.546f, 12.45f, 12.546f, 11.989f)
                curveTo(12.546f, 11.514f, 12.643f, 11.061f, 12.818f, 10.649f)
                close()
                moveTo(13.248f, 14.068f)
                curveTo(13.222f, 14.033f, 13.196f, 13.998f, 13.171f, 13.963f)
                curveTo(13.23f, 13.094f, 13.784f, 11.861f, 14.901f, 11.352f)
                curveTo(14.152f, 12.08f, 13.59f, 12.908f, 13.248f, 14.068f)
                close()
                moveTo(13.502f, 9.614f)
                curveTo(14.126f, 8.964f, 15.003f, 8.56f, 15.975f, 8.56f)
                curveTo(16.932f, 8.56f, 17.798f, 8.951f, 18.42f, 9.584f)
                curveTo(17.441f, 9.697f, 16.611f, 9.942f, 15.937f, 10.324f)
                curveTo(15.336f, 9.979f, 14.524f, 9.746f, 13.502f, 9.614f)
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
            imageVector = FlagIcons.Large.Kyrgyzstan,
            contentDescription = "Kyrgyzstan Flag"
        )
    }
}
