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
 * Liechtenstein Flag (20x15dp)
 *
 * - ISO Alpha-2: LI
 * - ISO Alpha-3: LIE
 * - ISO Numeric: 438
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Liechtenstein: ImageVector by lazy {
    ImageVector.Builder(
        name = "Liechtenstein:LI:LIE:438:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7.5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.999f, 6.908f)
                curveTo(2.999f, 6.908f, 3.753f, 7.378f, 5.501f, 7.378f)
                curveTo(7.248f, 7.378f, 8.176f, 6.908f, 8.176f, 6.908f)
                curveTo(8.176f, 6.908f, 6.806f, 6.112f, 5.58f, 6.112f)
                curveTo(4.355f, 6.112f, 2.999f, 6.908f, 2.999f, 6.908f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(3.044f, 4.214f)
                lineTo(2.828f, 4.34f)
                lineTo(2.9f, 4.464f)
                horizontalLineTo(3.044f)
                horizontalLineTo(8.247f)
                horizontalLineTo(8.431f)
                lineTo(8.486f, 4.289f)
                lineTo(8.247f, 4.214f)
                curveTo(8.486f, 4.289f, 8.486f, 4.289f, 8.486f, 4.289f)
                lineTo(8.486f, 4.289f)
                lineTo(8.486f, 4.288f)
                lineTo(8.486f, 4.287f)
                lineTo(8.488f, 4.283f)
                lineTo(8.492f, 4.27f)
                curveTo(8.495f, 4.259f, 8.499f, 4.243f, 8.505f, 4.223f)
                curveTo(8.516f, 4.183f, 8.53f, 4.127f, 8.544f, 4.057f)
                curveTo(8.574f, 3.919f, 8.605f, 3.727f, 8.614f, 3.514f)
                curveTo(8.631f, 3.101f, 8.565f, 2.535f, 8.139f, 2.164f)
                curveTo(7.7f, 1.783f, 7.149f, 1.849f, 6.707f, 1.959f)
                curveTo(6.555f, 1.997f, 6.398f, 2.045f, 6.254f, 2.09f)
                curveTo(6.188f, 2.11f, 6.124f, 2.13f, 6.065f, 2.147f)
                curveTo(5.864f, 2.206f, 5.708f, 2.241f, 5.588f, 2.241f)
                curveTo(5.469f, 2.241f, 5.333f, 2.209f, 5.161f, 2.155f)
                curveTo(5.111f, 2.139f, 5.057f, 2.121f, 5f, 2.102f)
                curveTo(4.874f, 2.06f, 4.733f, 2.013f, 4.594f, 1.977f)
                curveTo(4.169f, 1.865f, 3.666f, 1.82f, 3.111f, 2.135f)
                curveTo(2.815f, 2.302f, 2.643f, 2.538f, 2.562f, 2.797f)
                curveTo(2.483f, 3.049f, 2.494f, 3.309f, 2.534f, 3.531f)
                curveTo(2.575f, 3.755f, 2.648f, 3.955f, 2.71f, 4.098f)
                curveTo(2.741f, 4.17f, 2.769f, 4.229f, 2.791f, 4.271f)
                curveTo(2.801f, 4.291f, 2.81f, 4.308f, 2.817f, 4.319f)
                lineTo(2.824f, 4.333f)
                lineTo(2.827f, 4.337f)
                lineTo(2.828f, 4.339f)
                lineTo(2.828f, 4.339f)
                lineTo(2.828f, 4.339f)
                curveTo(2.828f, 4.34f, 2.828f, 4.34f, 3.044f, 4.214f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(2.502f, 4.454f)
                lineTo(2.385f, 4.233f)
                lineTo(2.192f, 4.335f)
                lineTo(2.267f, 4.54f)
                lineTo(2.987f, 6.52f)
                lineTo(3.068f, 6.741f)
                lineTo(3.293f, 6.674f)
                lineTo(3.293f, 6.674f)
                lineTo(3.293f, 6.674f)
                lineTo(3.294f, 6.674f)
                lineTo(3.294f, 6.674f)
                lineTo(3.296f, 6.674f)
                lineTo(3.305f, 6.671f)
                lineTo(3.343f, 6.66f)
                curveTo(3.376f, 6.651f, 3.426f, 6.638f, 3.489f, 6.622f)
                curveTo(3.616f, 6.589f, 3.799f, 6.546f, 4.018f, 6.503f)
                curveTo(4.459f, 6.416f, 5.041f, 6.33f, 5.621f, 6.33f)
                curveTo(6.201f, 6.33f, 6.773f, 6.415f, 7.201f, 6.502f)
                curveTo(7.415f, 6.546f, 7.592f, 6.589f, 7.715f, 6.621f)
                curveTo(7.776f, 6.637f, 7.824f, 6.651f, 7.856f, 6.66f)
                lineTo(7.892f, 6.67f)
                lineTo(7.901f, 6.673f)
                lineTo(7.903f, 6.674f)
                lineTo(7.903f, 6.674f)
                lineTo(7.903f, 6.674f)
                lineTo(7.903f, 6.674f)
                lineTo(7.903f, 6.674f)
                lineTo(8.128f, 6.743f)
                lineTo(8.211f, 6.522f)
                lineTo(8.951f, 4.542f)
                lineTo(9.029f, 4.336f)
                lineTo(8.834f, 4.233f)
                lineTo(8.717f, 4.454f)
                curveTo(8.834f, 4.233f, 8.834f, 4.233f, 8.834f, 4.233f)
                lineTo(8.833f, 4.233f)
                lineTo(8.833f, 4.233f)
                lineTo(8.832f, 4.232f)
                lineTo(8.828f, 4.23f)
                lineTo(8.816f, 4.224f)
                curveTo(8.806f, 4.219f, 8.792f, 4.213f, 8.774f, 4.204f)
                curveTo(8.738f, 4.188f, 8.685f, 4.165f, 8.617f, 4.138f)
                curveTo(8.48f, 4.084f, 8.277f, 4.014f, 8.009f, 3.944f)
                curveTo(7.473f, 3.804f, 6.675f, 3.667f, 5.609f, 3.667f)
                curveTo(4.544f, 3.667f, 3.746f, 3.804f, 3.209f, 3.944f)
                curveTo(2.942f, 4.014f, 2.739f, 4.084f, 2.602f, 4.138f)
                curveTo(2.534f, 4.165f, 2.481f, 4.188f, 2.445f, 4.204f)
                curveTo(2.427f, 4.213f, 2.413f, 4.219f, 2.403f, 4.224f)
                lineTo(2.391f, 4.23f)
                lineTo(2.387f, 4.232f)
                lineTo(2.386f, 4.233f)
                lineTo(2.386f, 4.233f)
                lineTo(2.385f, 4.233f)
                curveTo(2.385f, 4.233f, 2.385f, 4.233f, 2.502f, 4.454f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.5f
            ) {
                moveTo(5.546f, 2.759f)
                curveTo(5.967f, 2.759f, 6.216f, 2.355f, 6.216f, 1.981f)
                curveTo(6.216f, 1.608f, 5.967f, 1.203f, 5.546f, 1.203f)
                curveTo(5.126f, 1.203f, 4.876f, 1.608f, 4.876f, 1.981f)
                curveTo(4.876f, 2.355f, 5.126f, 2.759f, 5.546f, 2.759f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD83D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.704f, 0f)
                horizontalLineTo(5.389f)
                lineTo(5.429f, 0.577f)
                lineTo(5.074f, 0.528f)
                verticalLineTo(0.925f)
                lineTo(5.435f, 0.875f)
                lineTo(5.389f, 1.783f)
                horizontalLineTo(5.704f)
                lineTo(5.657f, 0.873f)
                lineTo(6.019f, 0.925f)
                verticalLineTo(0.528f)
                lineTo(5.664f, 0.579f)
                lineTo(5.704f, 0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(4.074f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(5.704f, 0f)
                horizontalLineTo(5.389f)
                lineTo(5.429f, 0.577f)
                lineTo(5.074f, 0.528f)
                verticalLineTo(0.925f)
                lineTo(5.435f, 0.875f)
                lineTo(5.389f, 1.783f)
                horizontalLineTo(5.704f)
                lineTo(5.657f, 0.873f)
                lineTo(6.019f, 0.925f)
                verticalLineTo(0.528f)
                lineTo(5.664f, 0.579f)
                lineTo(5.704f, 0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.389f, 0f)
                verticalLineTo(-0.5f)
                horizontalLineTo(4.852f)
                lineTo(4.89f, 0.035f)
                lineTo(5.389f, 0f)
                close()
                moveTo(5.704f, 0f)
                lineTo(6.203f, 0.035f)
                lineTo(6.24f, -0.5f)
                horizontalLineTo(5.704f)
                verticalLineTo(0f)
                close()
                moveTo(5.429f, 0.577f)
                lineTo(5.362f, 1.072f)
                lineTo(5.971f, 1.155f)
                lineTo(5.928f, 0.542f)
                lineTo(5.429f, 0.577f)
                close()
                moveTo(5.074f, 0.528f)
                lineTo(5.141f, 0.033f)
                lineTo(4.574f, -0.044f)
                verticalLineTo(0.528f)
                horizontalLineTo(5.074f)
                close()
                moveTo(5.074f, 0.925f)
                horizontalLineTo(4.574f)
                verticalLineTo(1.498f)
                lineTo(5.142f, 1.42f)
                lineTo(5.074f, 0.925f)
                close()
                moveTo(5.435f, 0.875f)
                lineTo(5.934f, 0.9f)
                lineTo(5.965f, 0.297f)
                lineTo(5.366f, 0.379f)
                lineTo(5.435f, 0.875f)
                close()
                moveTo(5.389f, 1.783f)
                lineTo(4.889f, 1.758f)
                lineTo(4.863f, 2.283f)
                horizontalLineTo(5.389f)
                verticalLineTo(1.783f)
                close()
                moveTo(5.704f, 1.783f)
                verticalLineTo(2.283f)
                horizontalLineTo(6.23f)
                lineTo(6.203f, 1.757f)
                lineTo(5.704f, 1.783f)
                close()
                moveTo(5.657f, 0.873f)
                lineTo(5.727f, 0.378f)
                lineTo(5.127f, 0.293f)
                lineTo(5.158f, 0.899f)
                lineTo(5.657f, 0.873f)
                close()
                moveTo(6.019f, 0.925f)
                lineTo(5.949f, 1.42f)
                lineTo(6.519f, 1.5f)
                verticalLineTo(0.925f)
                horizontalLineTo(6.019f)
                close()
                moveTo(6.019f, 0.528f)
                horizontalLineTo(6.519f)
                verticalLineTo(-0.049f)
                lineTo(5.948f, 0.033f)
                lineTo(6.019f, 0.528f)
                close()
                moveTo(5.664f, 0.579f)
                lineTo(5.165f, 0.545f)
                lineTo(5.122f, 1.162f)
                lineTo(5.735f, 1.074f)
                lineTo(5.664f, 0.579f)
                close()
                moveTo(5.389f, 0.5f)
                horizontalLineTo(5.704f)
                verticalLineTo(-0.5f)
                horizontalLineTo(5.389f)
                verticalLineTo(0.5f)
                close()
                moveTo(5.928f, 0.542f)
                lineTo(5.887f, -0.035f)
                lineTo(4.89f, 0.035f)
                lineTo(4.93f, 0.612f)
                lineTo(5.928f, 0.542f)
                close()
                moveTo(5.006f, 1.024f)
                lineTo(5.362f, 1.072f)
                lineTo(5.497f, 0.081f)
                lineTo(5.141f, 0.033f)
                lineTo(5.006f, 1.024f)
                close()
                moveTo(5.574f, 0.925f)
                verticalLineTo(0.528f)
                horizontalLineTo(4.574f)
                verticalLineTo(0.925f)
                horizontalLineTo(5.574f)
                close()
                moveTo(5.366f, 0.379f)
                lineTo(5.005f, 0.429f)
                lineTo(5.142f, 1.42f)
                lineTo(5.503f, 1.37f)
                lineTo(5.366f, 0.379f)
                close()
                moveTo(5.888f, 1.808f)
                lineTo(5.934f, 0.9f)
                lineTo(4.935f, 0.849f)
                lineTo(4.889f, 1.758f)
                lineTo(5.888f, 1.808f)
                close()
                moveTo(5.704f, 1.283f)
                horizontalLineTo(5.389f)
                verticalLineTo(2.283f)
                horizontalLineTo(5.704f)
                verticalLineTo(1.283f)
                close()
                moveTo(5.158f, 0.899f)
                lineTo(5.204f, 1.809f)
                lineTo(6.203f, 1.757f)
                lineTo(6.156f, 0.848f)
                lineTo(5.158f, 0.899f)
                close()
                moveTo(6.089f, 0.429f)
                lineTo(5.727f, 0.378f)
                lineTo(5.587f, 1.368f)
                lineTo(5.949f, 1.42f)
                lineTo(6.089f, 0.429f)
                close()
                moveTo(5.519f, 0.528f)
                verticalLineTo(0.925f)
                horizontalLineTo(6.519f)
                verticalLineTo(0.528f)
                horizontalLineTo(5.519f)
                close()
                moveTo(5.735f, 1.074f)
                lineTo(6.09f, 1.023f)
                lineTo(5.948f, 0.033f)
                lineTo(5.593f, 0.084f)
                lineTo(5.735f, 1.074f)
                close()
                moveTo(5.205f, -0.035f)
                lineTo(5.165f, 0.545f)
                lineTo(6.162f, 0.614f)
                lineTo(6.203f, 0.035f)
                lineTo(5.205f, -0.035f)
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
            imageVector = FlagIcons.Medium.Liechtenstein,
            contentDescription = "Liechtenstein Flag"
        )
    }
}
