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
 * Ecuador Flag (32x24dp)
 *
 * - ISO Alpha-2: EC
 * - ISO Alpha-3: ECU
 * - ISO Numeric: 218
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Ecuador: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ecuador:EC:ECU:218:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7B2900)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.717f, 5.714f)
                curveTo(9.717f, 5.714f, 13.873f, 3.837f, 14.251f, 4.05f)
                curveTo(14.629f, 4.263f, 14.72f, 4.871f, 15.046f, 4.871f)
                curveTo(15.372f, 4.871f, 16.029f, 4.679f, 16.303f, 4.679f)
                curveTo(16.577f, 4.679f, 16.848f, 4.871f, 16.848f, 4.871f)
                horizontalLineTo(18.019f)
                verticalLineTo(4.22f)
                lineTo(23.327f, 5.714f)
                curveTo(23.327f, 5.714f, 20.231f, 6.119f, 19.997f, 6.119f)
                curveTo(19.764f, 6.119f, 19.997f, 6.452f, 19.997f, 6.452f)
                curveTo(19.997f, 6.452f, 19.556f, 6.119f, 18.884f, 6.119f)
                curveTo(18.211f, 6.119f, 16.848f, 6.813f, 16.848f, 6.813f)
                lineTo(17.344f, 7.879f)
                lineTo(16.848f, 8.193f)
                lineTo(16.303f, 7.879f)
                curveTo(16.303f, 7.879f, 16.338f, 7.003f, 16.104f, 7.003f)
                curveTo(15.869f, 7.003f, 15.698f, 7.566f, 15.698f, 7.879f)
                curveTo(15.698f, 8.193f, 15.046f, 8.193f, 15.046f, 8.193f)
                lineTo(15.337f, 7.606f)
                curveTo(15.337f, 7.606f, 15.626f, 6.633f, 15.046f, 6.633f)
                curveTo(14.466f, 6.633f, 11.821f, 6.119f, 11.821f, 6.119f)
                lineTo(11.145f, 6.452f)
                lineTo(11.387f, 5.714f)
                horizontalLineTo(9.717f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.501f, 15.774f)
                curveTo(10.853f, 14.316f, 11.501f, 11.087f, 11.501f, 11.087f)
                lineTo(12.762f, 11.748f)
                curveTo(12.612f, 12.501f, 12.589f, 13.926f, 13.061f, 15.091f)
                curveTo(13.533f, 16.256f, 15.316f, 17.173f, 15.316f, 17.173f)
                curveTo(15.316f, 17.173f, 16.215f, 17.374f, 14.849f, 17.518f)
                curveTo(13.482f, 17.663f, 12.15f, 17.232f, 11.501f, 15.774f)
                close()
                moveTo(14.733f, 21.517f)
                curveTo(14.327f, 21.517f, 15.546f, 18.808f, 15.546f, 18.808f)
                lineTo(15.922f, 18.055f)
                curveTo(15.922f, 18.055f, 15.968f, 21.244f, 15.71f, 21.517f)
                curveTo(15.545f, 21.692f, 15.357f, 21.642f, 15.136f, 21.584f)
                curveTo(15.013f, 21.552f, 14.879f, 21.517f, 14.733f, 21.517f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.327f, 15.298f)
                curveTo(9.783f, 13.121f, 10.631f, 10.165f, 10.631f, 10.165f)
                lineTo(11.485f, 10.775f)
                curveTo(11.359f, 11.9f, 11.359f, 14.811f, 12.081f, 16.072f)
                curveTo(12.803f, 17.334f, 15.968f, 17.863f, 15.968f, 17.863f)
                curveTo(15.968f, 17.863f, 15.344f, 18.325f, 14.198f, 18.541f)
                curveTo(13.053f, 18.757f, 10.87f, 17.475f, 10.327f, 15.298f)
                close()
                moveTo(13.956f, 21.217f)
                lineTo(14.458f, 19.425f)
                lineTo(15.165f, 18.559f)
                horizontalLineTo(15.674f)
                curveTo(15.674f, 18.559f, 14.958f, 21.64f, 14.458f, 21.64f)
                curveTo(14.133f, 21.64f, 14.23f, 21.461f, 14.338f, 21.263f)
                curveTo(14.396f, 21.156f, 14.458f, 21.044f, 14.458f, 20.95f)
                curveTo(14.458f, 20.684f, 13.956f, 21.217f, 13.956f, 21.217f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.498f, 15.671f)
                curveTo(9.228f, 13.797f, 9.768f, 9.32f, 9.768f, 9.32f)
                lineTo(10.621f, 9.93f)
                curveTo(10.235f, 11.014f, 10.355f, 14.126f, 10.621f, 15.671f)
                curveTo(10.887f, 17.216f, 13.406f, 18.147f, 13.406f, 18.147f)
                curveTo(13.406f, 18.147f, 12.782f, 18.609f, 11.637f, 18.825f)
                curveTo(10.492f, 19.041f, 9.768f, 17.545f, 9.498f, 15.671f)
                close()
                moveTo(13.686f, 19.416f)
                curveTo(13.201f, 19.416f, 13.898f, 18.719f, 13.898f, 18.719f)
                horizontalLineTo(15.061f)
                curveTo(15.061f, 18.719f, 14.663f, 19.703f, 14.172f, 19.703f)
                curveTo(13.926f, 19.703f, 13.927f, 19.631f, 13.927f, 19.559f)
                curveTo(13.928f, 19.487f, 13.929f, 19.416f, 13.686f, 19.416f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.365f, 15.774f)
                curveTo(21.014f, 14.316f, 20.365f, 11.087f, 20.365f, 11.087f)
                lineTo(19.105f, 11.748f)
                curveTo(19.254f, 12.501f, 19.278f, 13.926f, 18.806f, 15.091f)
                curveTo(18.334f, 16.256f, 16.551f, 17.173f, 16.551f, 17.173f)
                curveTo(16.551f, 17.173f, 15.651f, 17.374f, 17.018f, 17.518f)
                curveTo(18.385f, 17.663f, 19.717f, 17.232f, 20.365f, 15.774f)
                close()
                moveTo(17.133f, 21.517f)
                curveTo(17.539f, 21.517f, 16.321f, 18.808f, 16.321f, 18.808f)
                lineTo(15.945f, 18.055f)
                curveTo(15.945f, 18.055f, 15.899f, 21.244f, 16.157f, 21.517f)
                curveTo(16.322f, 21.692f, 16.51f, 21.642f, 16.73f, 21.584f)
                curveTo(16.854f, 21.552f, 16.988f, 21.517f, 17.133f, 21.517f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.54f, 15.298f)
                curveTo(22.083f, 13.121f, 21.235f, 10.165f, 21.235f, 10.165f)
                lineTo(20.382f, 10.775f)
                curveTo(20.507f, 11.9f, 20.507f, 14.811f, 19.786f, 16.072f)
                curveTo(19.064f, 17.334f, 15.899f, 17.863f, 15.899f, 17.863f)
                curveTo(15.899f, 17.863f, 16.523f, 18.325f, 17.668f, 18.541f)
                curveTo(18.813f, 18.757f, 20.996f, 17.475f, 21.54f, 15.298f)
                close()
                moveTo(17.911f, 21.217f)
                lineTo(17.409f, 19.425f)
                lineTo(16.701f, 18.559f)
                horizontalLineTo(16.192f)
                curveTo(16.192f, 18.559f, 16.909f, 21.64f, 17.409f, 21.64f)
                curveTo(17.734f, 21.64f, 17.636f, 21.461f, 17.528f, 21.263f)
                curveTo(17.47f, 21.156f, 17.409f, 21.044f, 17.409f, 20.95f)
                curveTo(17.409f, 20.684f, 17.911f, 21.217f, 17.911f, 21.217f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.369f, 15.671f)
                curveTo(22.639f, 13.797f, 22.099f, 9.32f, 22.099f, 9.32f)
                lineTo(21.246f, 9.93f)
                curveTo(21.632f, 11.014f, 21.512f, 14.126f, 21.246f, 15.671f)
                curveTo(20.98f, 17.216f, 18.46f, 18.147f, 18.46f, 18.147f)
                curveTo(18.46f, 18.147f, 19.085f, 18.609f, 20.23f, 18.825f)
                curveTo(21.375f, 19.041f, 22.099f, 17.545f, 22.369f, 15.671f)
                close()
                moveTo(18.18f, 19.416f)
                curveTo(18.666f, 19.416f, 17.968f, 18.719f, 17.968f, 18.719f)
                horizontalLineTo(16.805f)
                curveTo(16.805f, 18.719f, 17.203f, 19.703f, 17.694f, 19.703f)
                curveTo(17.941f, 19.703f, 17.94f, 19.631f, 17.939f, 19.559f)
                curveTo(17.939f, 19.487f, 17.938f, 19.416f, 18.18f, 19.416f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6FAE21))) {
                moveTo(10.203f, 10.446f)
                lineTo(10.294f, 9.894f)
                lineTo(11.895f, 9.997f)
                lineTo(10.681f, 8.739f)
                lineTo(11.09f, 8.35f)
                lineTo(12.732f, 10.052f)
                lineTo(11.328f, 7.411f)
                lineTo(11.814f, 7.123f)
                lineTo(13.092f, 9.003f)
                lineTo(12.482f, 7.049f)
                lineTo(13.007f, 6.84f)
                lineTo(14.972f, 10.76f)
                lineTo(14.218f, 10.711f)
                lineTo(14.292f, 10.948f)
                lineTo(14.934f, 11.118f)
                lineTo(14.788f, 11.662f)
                lineTo(14.49f, 11.583f)
                lineTo(14.768f, 12.474f)
                lineTo(14.285f, 11.764f)
                lineTo(15.126f, 13.344f)
                lineTo(13.06f, 11.204f)
                lineTo(10.203f, 10.446f)
                close()
            }
            path(fill = SolidColor(Color(0xFF6FAE21))) {
                moveTo(21.926f, 10.446f)
                lineTo(21.835f, 9.894f)
                lineTo(20.234f, 9.997f)
                lineTo(21.448f, 8.739f)
                lineTo(21.039f, 8.35f)
                lineTo(19.396f, 10.052f)
                lineTo(20.801f, 7.411f)
                lineTo(20.315f, 7.123f)
                lineTo(19.037f, 9.003f)
                lineTo(19.647f, 7.049f)
                lineTo(19.122f, 6.84f)
                lineTo(17.157f, 10.76f)
                lineTo(17.911f, 10.711f)
                lineTo(17.837f, 10.948f)
                lineTo(17.195f, 11.118f)
                lineTo(17.341f, 11.662f)
                lineTo(17.639f, 11.583f)
                lineTo(17.361f, 12.474f)
                lineTo(17.844f, 11.764f)
                lineTo(17.003f, 13.344f)
                lineTo(19.069f, 11.204f)
                lineTo(21.926f, 10.446f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171401))) {
                moveTo(11.067f, 21.311f)
                lineTo(10.654f, 20.925f)
                lineTo(22.845f, 8.091f)
                lineTo(23.257f, 8.476f)
                lineTo(11.067f, 21.311f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.535f, 8.189f)
                lineTo(23.16f, 8.779f)
                lineTo(23.513f, 7.804f)
                lineTo(22.535f, 8.189f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.376f, 21.309f)
                lineTo(10.658f, 20.837f)
                lineTo(10.426f, 21.804f)
                lineTo(11.376f, 21.309f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171401))) {
                moveTo(10.16f, 19.399f)
                lineTo(9.748f, 19.013f)
                lineTo(21.938f, 6.178f)
                lineTo(22.35f, 6.564f)
                lineTo(10.16f, 19.399f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.628f, 6.277f)
                lineTo(22.253f, 6.866f)
                lineTo(22.606f, 5.892f)
                lineTo(21.628f, 6.277f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.47f, 19.396f)
                lineTo(9.752f, 18.924f)
                lineTo(9.519f, 19.892f)
                lineTo(10.47f, 19.396f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171401))) {
                moveTo(21.253f, 21.311f)
                lineTo(21.666f, 20.925f)
                lineTo(9.475f, 8.091f)
                lineTo(9.063f, 8.476f)
                lineTo(21.253f, 21.311f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.785f, 8.189f)
                lineTo(9.16f, 8.779f)
                lineTo(8.807f, 7.804f)
                lineTo(9.785f, 8.189f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.944f, 21.309f)
                lineTo(21.661f, 20.837f)
                lineTo(21.894f, 21.804f)
                lineTo(20.944f, 21.309f)
                close()
            }
            path(fill = SolidColor(Color(0xFF171401))) {
                moveTo(22.387f, 19.849f)
                lineTo(22.799f, 19.463f)
                lineTo(10.609f, 6.628f)
                lineTo(10.196f, 7.014f)
                lineTo(22.387f, 19.849f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.918f, 6.727f)
                lineTo(10.293f, 7.316f)
                lineTo(9.941f, 6.342f)
                lineTo(10.918f, 6.727f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCECECC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.077f, 19.846f)
                lineTo(22.795f, 19.374f)
                lineTo(23.027f, 20.342f)
                lineTo(22.077f, 19.846f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB74E01))) {
                moveTo(13.667f, 16.375f)
                horizontalLineToRelative(4.533f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(-4.533f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7DB8FF)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.948f, 17.287f)
                curveTo(16.847f, 17.287f, 17.623f, 16.709f, 18.163f, 15.852f)
                curveTo(18.704f, 14.992f, 19.031f, 13.819f, 19.031f, 12.537f)
                curveTo(19.031f, 11.254f, 18.704f, 10.082f, 18.163f, 9.222f)
                curveTo(17.623f, 8.365f, 16.847f, 7.787f, 15.948f, 7.787f)
                curveTo(15.049f, 7.787f, 14.272f, 8.365f, 13.733f, 9.222f)
                curveTo(13.191f, 10.082f, 12.864f, 11.254f, 12.864f, 12.537f)
                curveTo(12.864f, 13.819f, 13.191f, 14.992f, 13.733f, 15.852f)
                curveTo(14.272f, 16.709f, 15.049f, 17.287f, 15.948f, 17.287f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(15.948f, 17.287f)
                curveTo(16.847f, 17.287f, 17.623f, 16.709f, 18.163f, 15.852f)
                curveTo(18.704f, 14.992f, 19.031f, 13.819f, 19.031f, 12.537f)
                curveTo(19.031f, 11.254f, 18.704f, 10.082f, 18.163f, 9.222f)
                curveTo(17.623f, 8.365f, 16.847f, 7.787f, 15.948f, 7.787f)
                curveTo(15.049f, 7.787f, 14.272f, 8.365f, 13.733f, 9.222f)
                curveTo(13.191f, 10.082f, 12.864f, 11.254f, 12.864f, 12.537f)
                curveTo(12.864f, 13.819f, 13.191f, 14.992f, 13.733f, 15.852f)
                curveTo(14.272f, 16.709f, 15.049f, 17.287f, 15.948f, 17.287f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF6FAE21)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.879f, 12.61f)
                horizontalLineTo(14.492f)
                curveTo(14.492f, 12.61f, 15.6f, 12.855f, 15.046f, 13.049f)
                curveTo(14.492f, 13.242f, 14.492f, 13.306f, 14.492f, 13.581f)
                curveTo(14.492f, 13.857f, 14.492f, 14.865f, 14.492f, 15.08f)
                curveTo(14.492f, 15.296f, 14.886f, 15.757f, 14.055f, 15.757f)
                curveTo(13.224f, 15.757f, 12.508f, 12.341f, 12.508f, 12.341f)
                lineTo(12.879f, 12.61f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6FAE21)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.179f, 12.795f)
                curveTo(19.179f, 12.795f, 17.681f, 13.091f, 16.655f, 12.993f)
                curveTo(15.629f, 12.894f, 15.179f, 12.795f, 15.179f, 12.795f)
                curveTo(15.179f, 12.795f, 15.894f, 13.167f, 16.148f, 13.479f)
                curveTo(16.403f, 13.791f, 16.923f, 14.33f, 17.453f, 14.33f)
                curveTo(17.984f, 14.33f, 18.797f, 14.833f, 18.797f, 14.833f)
                lineTo(19.179f, 12.795f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.319f, 10.136f)
                curveTo(13.319f, 10.136f, 14.553f, 10.374f, 14.851f, 10.731f)
                curveTo(15.148f, 11.089f, 14.458f, 11.446f, 16.257f, 11.089f)
                curveTo(18.056f, 10.731f, 19.484f, 10.108f, 19.484f, 11.089f)
                curveTo(19.484f, 12.069f, 19.327f, 12.972f, 18.553f, 12.972f)
                curveTo(17.778f, 12.972f, 17.47f, 12.972f, 15.109f, 12.972f)
                curveTo(12.748f, 12.972f, 11.461f, 13.695f, 11.626f, 12.533f)
                curveTo(11.791f, 11.371f, 13.319f, 10.136f, 13.319f, 10.136f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EcuadorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Ecuador,
            contentDescription = "Ecuador Flag"
        )
    }
}
