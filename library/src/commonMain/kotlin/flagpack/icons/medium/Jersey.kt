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
 * Jersey Flag (20x15dp)
 *
 * - ISO Alpha-2: JE
 * - ISO Alpha-3: JEY
 * - ISO Numeric: 832
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Jersey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jersey:JE:JEY:832:Medium",
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
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.6875f
            ) {
                moveTo(-1.688f, 0.778f)
                lineTo(-2.969f, 0.004f)
                verticalLineTo(1.5f)
                verticalLineTo(14f)
                verticalLineTo(15.496f)
                lineTo(-1.688f, 14.722f)
                lineTo(8.648f, 8.472f)
                lineTo(9.842f, 7.75f)
                lineTo(8.648f, 7.028f)
                lineTo(-1.688f, 0.778f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.6875f
            ) {
                moveTo(21.826f, 0.77f)
                lineTo(23.093f, 0.034f)
                verticalLineTo(1.5f)
                verticalLineTo(14f)
                verticalLineTo(15.466f)
                lineTo(21.826f, 14.73f)
                lineTo(11.064f, 8.48f)
                lineTo(9.807f, 7.75f)
                lineTo(11.064f, 7.02f)
                lineTo(21.826f, 0.77f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.547f, 2.939f)
                curveTo(8.547f, 2.939f, 8.01f, 5.313f, 9.863f, 6.225f)
                curveTo(9.863f, 6.225f, 11.642f, 5.255f, 11.242f, 2.939f)
                curveTo(11.242f, 2.939f, 10.478f, 2.684f, 9.871f, 2.684f)
                curveTo(9.263f, 2.684f, 8.547f, 2.939f, 8.547f, 2.939f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.739f, 3.437f)
                curveTo(8.739f, 3.437f, 8.937f, 3.349f, 9.035f, 3.437f)
                curveTo(9.133f, 3.524f, 9.214f, 3.429f, 9.214f, 3.376f)
                curveTo(9.214f, 3.323f, 9.37f, 3.142f, 9.37f, 3.289f)
                curveTo(9.37f, 3.437f, 9.321f, 3.52f, 9.458f, 3.52f)
                curveTo(9.595f, 3.52f, 10.212f, 3.316f, 10.359f, 3.376f)
                curveTo(10.507f, 3.437f, 10.62f, 3.422f, 10.583f, 3.335f)
                curveTo(10.545f, 3.249f, 10.448f, 3.195f, 10.262f, 3.242f)
                curveTo(10.076f, 3.289f, 10.12f, 3.335f, 9.96f, 3.335f)
                curveTo(9.799f, 3.335f, 9.62f, 3.289f, 9.62f, 3.289f)
                curveTo(9.62f, 3.289f, 9.67f, 3.212f, 9.854f, 3.267f)
                curveTo(10.037f, 3.322f, 10.29f, 3.199f, 10.359f, 3.199f)
                curveTo(10.428f, 3.199f, 10.618f, 3.195f, 10.636f, 3.242f)
                curveTo(10.655f, 3.289f, 10.77f, 3.332f, 10.682f, 3.376f)
                curveTo(10.595f, 3.42f, 10.451f, 3.448f, 10.55f, 3.504f)
                curveTo(10.649f, 3.56f, 10.877f, 3.55f, 10.888f, 3.608f)
                curveTo(10.899f, 3.667f, 11.007f, 3.754f, 10.963f, 3.754f)
                curveTo(10.92f, 3.754f, 10.842f, 3.837f, 10.769f, 3.812f)
                curveTo(10.696f, 3.787f, 10.688f, 3.764f, 10.757f, 3.744f)
                curveTo(10.827f, 3.724f, 10.826f, 3.638f, 10.769f, 3.638f)
                curveTo(10.711f, 3.638f, 10.739f, 3.668f, 10.608f, 3.638f)
                curveTo(10.477f, 3.608f, 10.304f, 3.575f, 10.314f, 3.638f)
                curveTo(10.324f, 3.701f, 10.41f, 3.799f, 10.252f, 3.812f)
                curveTo(10.095f, 3.825f, 10.021f, 3.877f, 9.99f, 3.835f)
                curveTo(9.96f, 3.793f, 9.85f, 3.737f, 9.936f, 3.719f)
                curveTo(10.022f, 3.701f, 10.105f, 3.78f, 10.136f, 3.767f)
                curveTo(10.167f, 3.754f, 10.237f, 3.747f, 10.178f, 3.693f)
                curveTo(10.119f, 3.638f, 10.022f, 3.606f, 10.112f, 3.565f)
                curveTo(10.202f, 3.525f, 10.131f, 3.524f, 9.96f, 3.608f)
                curveTo(9.788f, 3.693f, 9.693f, 3.764f, 9.542f, 3.754f)
                curveTo(9.391f, 3.744f, 9.335f, 3.758f, 9.286f, 3.744f)
                curveTo(9.238f, 3.73f, 9.002f, 3.895f, 8.934f, 3.853f)
                curveTo(8.866f, 3.812f, 8.647f, 3.796f, 8.687f, 3.744f)
                curveTo(8.726f, 3.693f, 8.779f, 3.666f, 8.838f, 3.693f)
                curveTo(8.897f, 3.719f, 8.956f, 3.746f, 8.996f, 3.719f)
                curveTo(9.035f, 3.693f, 9.15f, 3.602f, 9.121f, 3.584f)
                curveTo(9.092f, 3.565f, 9.12f, 3.504f, 8.957f, 3.504f)
                curveTo(8.793f, 3.504f, 8.735f, 3.572f, 8.697f, 3.529f)
                curveTo(8.658f, 3.486f, 8.739f, 3.437f, 8.739f, 3.437f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.903f, 4.217f)
                curveTo(8.903f, 4.217f, 9.077f, 4.14f, 9.163f, 4.217f)
                curveTo(9.249f, 4.294f, 9.32f, 4.21f, 9.32f, 4.164f)
                curveTo(9.32f, 4.117f, 9.457f, 3.957f, 9.457f, 4.087f)
                curveTo(9.457f, 4.217f, 9.414f, 4.29f, 9.535f, 4.29f)
                curveTo(9.655f, 4.29f, 10.197f, 4.111f, 10.327f, 4.164f)
                curveTo(10.457f, 4.217f, 10.557f, 4.203f, 10.524f, 4.128f)
                curveTo(10.49f, 4.052f, 10.406f, 4.004f, 10.242f, 4.046f)
                curveTo(10.078f, 4.087f, 10.117f, 4.128f, 9.976f, 4.128f)
                curveTo(9.834f, 4.128f, 9.677f, 4.087f, 9.677f, 4.087f)
                curveTo(9.677f, 4.087f, 9.721f, 4.019f, 9.883f, 4.067f)
                curveTo(10.044f, 4.116f, 10.267f, 4.007f, 10.327f, 4.007f)
                curveTo(10.388f, 4.007f, 10.554f, 4.004f, 10.571f, 4.046f)
                curveTo(10.587f, 4.087f, 10.688f, 4.125f, 10.611f, 4.164f)
                curveTo(10.534f, 4.202f, 10.408f, 4.227f, 10.495f, 4.276f)
                curveTo(10.582f, 4.326f, 10.782f, 4.316f, 10.792f, 4.368f)
                curveTo(10.801f, 4.419f, 10.896f, 4.496f, 10.858f, 4.496f)
                curveTo(10.82f, 4.496f, 10.751f, 4.568f, 10.687f, 4.546f)
                curveTo(10.623f, 4.524f, 10.616f, 4.505f, 10.677f, 4.487f)
                curveTo(10.738f, 4.469f, 10.738f, 4.394f, 10.687f, 4.394f)
                curveTo(10.637f, 4.394f, 10.661f, 4.42f, 10.546f, 4.394f)
                curveTo(10.431f, 4.368f, 10.278f, 4.338f, 10.287f, 4.394f)
                curveTo(10.296f, 4.45f, 10.372f, 4.535f, 10.233f, 4.546f)
                curveTo(10.094f, 4.558f, 10.03f, 4.603f, 10.003f, 4.567f)
                curveTo(9.976f, 4.53f, 9.879f, 4.481f, 9.955f, 4.465f)
                curveTo(10.031f, 4.449f, 10.103f, 4.519f, 10.131f, 4.507f)
                curveTo(10.158f, 4.496f, 10.22f, 4.49f, 10.168f, 4.442f)
                curveTo(10.116f, 4.394f, 10.031f, 4.366f, 10.11f, 4.33f)
                curveTo(10.189f, 4.294f, 10.127f, 4.293f, 9.976f, 4.368f)
                curveTo(9.825f, 4.442f, 9.741f, 4.505f, 9.608f, 4.496f)
                curveTo(9.476f, 4.487f, 9.426f, 4.499f, 9.384f, 4.487f)
                curveTo(9.341f, 4.475f, 9.134f, 4.62f, 9.074f, 4.583f)
                curveTo(9.015f, 4.546f, 8.822f, 4.532f, 8.856f, 4.487f)
                curveTo(8.891f, 4.442f, 8.938f, 4.418f, 8.99f, 4.442f)
                curveTo(9.042f, 4.465f, 9.093f, 4.488f, 9.128f, 4.465f)
                curveTo(9.163f, 4.442f, 9.264f, 4.362f, 9.239f, 4.346f)
                curveTo(9.213f, 4.33f, 9.238f, 4.276f, 9.094f, 4.276f)
                curveTo(8.95f, 4.276f, 8.899f, 4.336f, 8.865f, 4.298f)
                curveTo(8.831f, 4.26f, 8.903f, 4.217f, 8.903f, 4.217f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.134f, 5.008f)
                curveTo(9.134f, 5.008f, 9.266f, 4.95f, 9.331f, 5.008f)
                curveTo(9.397f, 5.067f, 9.45f, 5.004f, 9.45f, 4.968f)
                curveTo(9.45f, 4.933f, 9.554f, 4.812f, 9.554f, 4.91f)
                curveTo(9.554f, 5.008f, 9.522f, 5.064f, 9.613f, 5.064f)
                curveTo(9.705f, 5.064f, 10.116f, 4.928f, 10.214f, 4.968f)
                curveTo(10.313f, 5.008f, 10.388f, 4.998f, 10.363f, 4.941f)
                curveTo(10.338f, 4.883f, 10.274f, 4.847f, 10.15f, 4.879f)
                curveTo(10.026f, 4.91f, 10.055f, 4.941f, 9.948f, 4.941f)
                curveTo(9.841f, 4.941f, 9.721f, 4.91f, 9.721f, 4.91f)
                curveTo(9.721f, 4.91f, 9.755f, 4.859f, 9.877f, 4.895f)
                curveTo(9.999f, 4.932f, 10.168f, 4.85f, 10.214f, 4.85f)
                curveTo(10.26f, 4.85f, 10.386f, 4.847f, 10.399f, 4.879f)
                curveTo(10.411f, 4.91f, 10.488f, 4.939f, 10.429f, 4.968f)
                curveTo(10.371f, 4.998f, 10.276f, 5.016f, 10.341f, 5.053f)
                curveTo(10.407f, 5.091f, 10.559f, 5.084f, 10.566f, 5.123f)
                curveTo(10.574f, 5.162f, 10.646f, 5.22f, 10.617f, 5.22f)
                curveTo(10.588f, 5.22f, 10.536f, 5.275f, 10.487f, 5.258f)
                curveTo(10.439f, 5.242f, 10.433f, 5.227f, 10.479f, 5.213f)
                curveTo(10.526f, 5.2f, 10.526f, 5.143f, 10.487f, 5.143f)
                curveTo(10.449f, 5.143f, 10.467f, 5.163f, 10.38f, 5.143f)
                curveTo(10.293f, 5.123f, 10.177f, 5.101f, 10.184f, 5.143f)
                curveTo(10.191f, 5.185f, 10.248f, 5.25f, 10.143f, 5.258f)
                curveTo(10.038f, 5.267f, 9.989f, 5.302f, 9.968f, 5.274f)
                curveTo(9.948f, 5.246f, 9.875f, 5.209f, 9.932f, 5.197f)
                curveTo(9.99f, 5.185f, 10.044f, 5.237f, 10.065f, 5.229f)
                curveTo(10.086f, 5.22f, 10.133f, 5.215f, 10.093f, 5.179f)
                curveTo(10.054f, 5.143f, 9.989f, 5.121f, 10.049f, 5.094f)
                curveTo(10.109f, 5.067f, 10.062f, 5.067f, 9.948f, 5.123f)
                curveTo(9.833f, 5.179f, 9.77f, 5.227f, 9.669f, 5.22f)
                curveTo(9.569f, 5.213f, 9.531f, 5.223f, 9.499f, 5.213f)
                curveTo(9.467f, 5.204f, 9.309f, 5.314f, 9.264f, 5.286f)
                curveTo(9.219f, 5.258f, 9.073f, 5.248f, 9.099f, 5.213f)
                curveTo(9.125f, 5.179f, 9.161f, 5.161f, 9.2f, 5.179f)
                curveTo(9.239f, 5.197f, 9.278f, 5.214f, 9.305f, 5.197f)
                curveTo(9.331f, 5.179f, 9.408f, 5.119f, 9.389f, 5.106f)
                curveTo(9.37f, 5.094f, 9.388f, 5.053f, 9.279f, 5.053f)
                curveTo(9.17f, 5.053f, 9.132f, 5.099f, 9.106f, 5.07f)
                curveTo(9.08f, 5.042f, 9.134f, 5.008f, 9.134f, 5.008f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JerseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Jersey,
            contentDescription = "Jersey Flag"
        )
    }
}
