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
 * Kyrgyzstan Flag (20x15dp)
 *
 * - ISO Alpha-2: KG
 * - ISO Alpha-3: KGZ
 * - ISO Numeric: 417
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Kyrgyzstan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kyrgyzstan:KG:KGZ:417:Medium",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.989f, 11.167f)
                curveTo(10.056f, 11.167f, 10.122f, 11.165f, 10.188f, 11.162f)
                lineTo(10.574f, 12.391f)
                lineTo(10.663f, 11.106f)
                curveTo(10.792f, 11.083f, 10.919f, 11.053f, 11.043f, 11.017f)
                lineTo(11.704f, 12.126f)
                lineTo(11.493f, 10.855f)
                curveTo(11.612f, 10.802f, 11.728f, 10.744f, 11.841f, 10.681f)
                lineTo(12.743f, 11.609f)
                lineTo(12.24f, 10.419f)
                curveTo(12.344f, 10.341f, 12.443f, 10.259f, 12.538f, 10.171f)
                lineTo(13.632f, 10.868f)
                lineTo(12.867f, 9.825f)
                curveTo(12.95f, 9.726f, 13.028f, 9.623f, 13.1f, 9.516f)
                lineTo(14.326f, 9.944f)
                lineTo(13.34f, 9.105f)
                curveTo(13.397f, 8.99f, 13.449f, 8.871f, 13.495f, 8.75f)
                lineTo(14.786f, 8.886f)
                lineTo(13.632f, 8.295f)
                curveTo(13.661f, 8.171f, 13.684f, 8.043f, 13.7f, 7.914f)
                lineTo(14.988f, 7.751f)
                lineTo(13.727f, 7.441f)
                curveTo(13.727f, 7.31f, 13.719f, 7.181f, 13.705f, 7.054f)
                lineTo(14.92f, 6.601f)
                lineTo(13.624f, 6.587f)
                curveTo(13.593f, 6.46f, 13.556f, 6.336f, 13.512f, 6.215f)
                lineTo(14.587f, 5.497f)
                lineTo(13.323f, 5.78f)
                curveTo(13.264f, 5.664f, 13.199f, 5.551f, 13.128f, 5.443f)
                lineTo(14.006f, 4.499f)
                lineTo(12.843f, 5.063f)
                curveTo(12.759f, 4.964f, 12.669f, 4.869f, 12.574f, 4.78f)
                lineTo(13.209f, 3.661f)
                lineTo(12.21f, 4.475f)
                curveTo(12.104f, 4.398f, 11.995f, 4.326f, 11.881f, 4.26f)
                lineTo(12.239f, 3.028f)
                lineTo(11.457f, 4.047f)
                curveTo(11.336f, 3.996f, 11.212f, 3.951f, 11.086f, 3.912f)
                lineTo(11.147f, 2.634f)
                lineTo(10.623f, 3.803f)
                curveTo(10.495f, 3.781f, 10.364f, 3.766f, 10.231f, 3.758f)
                lineTo(9.993f, 2.5f)
                lineTo(9.756f, 3.757f)
                curveTo(9.623f, 3.765f, 9.491f, 3.78f, 9.362f, 3.802f)
                lineTo(8.839f, 2.634f)
                lineTo(8.901f, 3.91f)
                curveTo(8.773f, 3.948f, 8.649f, 3.993f, 8.528f, 4.044f)
                lineTo(7.748f, 3.028f)
                lineTo(8.104f, 4.255f)
                curveTo(7.989f, 4.321f, 7.879f, 4.394f, 7.772f, 4.471f)
                lineTo(6.777f, 3.661f)
                lineTo(7.409f, 4.774f)
                curveTo(7.314f, 4.865f, 7.223f, 4.96f, 7.137f, 5.06f)
                lineTo(5.98f, 4.499f)
                lineTo(6.854f, 5.437f)
                curveTo(6.782f, 5.547f, 6.715f, 5.661f, 6.655f, 5.778f)
                lineTo(5.399f, 5.497f)
                lineTo(6.467f, 6.21f)
                curveTo(6.423f, 6.333f, 6.385f, 6.459f, 6.354f, 6.587f)
                lineTo(5.066f, 6.601f)
                lineTo(6.272f, 7.051f)
                curveTo(6.258f, 7.18f, 6.251f, 7.31f, 6.25f, 7.443f)
                lineTo(4.999f, 7.751f)
                lineTo(6.278f, 7.913f)
                curveTo(6.294f, 8.044f, 6.317f, 8.173f, 6.347f, 8.299f)
                lineTo(5.2f, 8.886f)
                lineTo(6.483f, 8.751f)
                curveTo(6.529f, 8.874f, 6.582f, 8.994f, 6.64f, 9.11f)
                lineTo(5.66f, 9.944f)
                lineTo(6.879f, 9.518f)
                curveTo(6.952f, 9.627f, 7.031f, 9.731f, 7.115f, 9.831f)
                lineTo(6.354f, 10.868f)
                lineTo(7.443f, 10.174f)
                curveTo(7.539f, 10.263f, 7.639f, 10.346f, 7.744f, 10.424f)
                lineTo(7.244f, 11.609f)
                lineTo(8.143f, 10.684f)
                curveTo(8.256f, 10.748f, 8.373f, 10.806f, 8.493f, 10.858f)
                lineTo(8.282f, 12.126f)
                lineTo(8.942f, 11.019f)
                curveTo(9.066f, 11.055f, 9.194f, 11.085f, 9.323f, 11.108f)
                lineTo(9.412f, 12.391f)
                lineTo(9.798f, 11.162f)
                curveTo(9.861f, 11.165f, 9.925f, 11.167f, 9.989f, 11.167f)
                close()
                moveTo(12.801f, 7.447f)
                curveTo(12.801f, 9f, 11.532f, 10.259f, 9.966f, 10.259f)
                curveTo(8.401f, 10.259f, 7.131f, 9f, 7.131f, 7.447f)
                curveTo(7.131f, 5.894f, 8.401f, 4.635f, 9.966f, 4.635f)
                curveTo(11.532f, 4.635f, 12.801f, 5.894f, 12.801f, 7.447f)
                close()
                moveTo(11.944f, 8.363f)
                curveTo(12.062f, 8.097f, 12.128f, 7.803f, 12.128f, 7.493f)
                curveTo(12.128f, 7.19f, 12.065f, 6.902f, 11.952f, 6.641f)
                curveTo(11.463f, 6.676f, 11.048f, 6.805f, 10.712f, 6.97f)
                curveTo(11.458f, 7.296f, 11.796f, 7.834f, 11.944f, 8.363f)
                close()
                moveTo(11.703f, 8.774f)
                curveTo(11.642f, 8.856f, 11.575f, 8.933f, 11.503f, 9.006f)
                curveTo(11.463f, 8.268f, 11.148f, 7.705f, 10.581f, 7.098f)
                curveTo(11.282f, 7.434f, 11.678f, 8.236f, 11.703f, 8.774f)
                close()
                moveTo(11.167f, 9.281f)
                curveTo(11.127f, 9.308f, 11.086f, 9.332f, 11.045f, 9.356f)
                curveTo(10.877f, 8.527f, 10.558f, 7.873f, 10.115f, 7.35f)
                lineTo(10.222f, 7.269f)
                curveTo(10.236f, 7.258f, 10.251f, 7.247f, 10.266f, 7.237f)
                curveTo(10.833f, 7.889f, 11.191f, 8.449f, 11.167f, 9.281f)
                close()
                moveTo(9.985f, 9.636f)
                curveTo(10.236f, 9.636f, 10.477f, 9.593f, 10.702f, 9.513f)
                curveTo(10.539f, 8.724f, 10.255f, 7.99f, 9.844f, 7.46f)
                curveTo(9.353f, 8.044f, 9.104f, 8.704f, 9.095f, 9.443f)
                curveTo(9.366f, 9.567f, 9.667f, 9.636f, 9.985f, 9.636f)
                close()
                moveTo(9.572f, 7.206f)
                curveTo(9.589f, 7.219f, 9.605f, 7.232f, 9.621f, 7.246f)
                curveTo(9.098f, 7.84f, 8.812f, 8.511f, 8.763f, 9.255f)
                curveTo(8.699f, 9.21f, 8.638f, 9.162f, 8.579f, 9.111f)
                curveTo(8.776f, 8.324f, 9.102f, 7.675f, 9.572f, 7.206f)
                close()
                moveTo(8.011f, 6.656f)
                curveTo(8.502f, 6.711f, 8.89f, 6.83f, 9.181f, 6.969f)
                curveTo(8.44f, 7.283f, 8.148f, 7.791f, 8.002f, 8.308f)
                curveTo(7.898f, 8.057f, 7.841f, 7.781f, 7.841f, 7.493f)
                curveTo(7.841f, 7.196f, 7.902f, 6.913f, 8.011f, 6.656f)
                close()
                moveTo(8.28f, 8.792f)
                curveTo(8.264f, 8.771f, 8.247f, 8.749f, 8.232f, 8.727f)
                curveTo(8.269f, 8.184f, 8.615f, 7.413f, 9.313f, 7.095f)
                curveTo(8.845f, 7.55f, 8.494f, 8.068f, 8.28f, 8.792f)
                close()
                moveTo(8.439f, 6.009f)
                curveTo(8.829f, 5.602f, 9.377f, 5.35f, 9.985f, 5.35f)
                curveTo(10.583f, 5.35f, 11.123f, 5.595f, 11.512f, 5.99f)
                curveTo(10.901f, 6.061f, 10.382f, 6.214f, 9.96f, 6.453f)
                curveTo(9.585f, 6.237f, 9.077f, 6.092f, 8.439f, 6.009f)
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
            imageVector = FlagIcons.Medium.Kyrgyzstan,
            contentDescription = "Kyrgyzstan Flag"
        )
    }
}
