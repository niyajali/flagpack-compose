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
 * Slovenia Flag (20x15dp)
 *
 * - ISO Alpha-2: SI
 * - ISO Alpha-3: SVN
 * - ISO Numeric: 705
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Slovenia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovenia:SI:SVN:705:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.588f, 3.148f)
                curveTo(8.588f, 3.148f, 7.272f, 2.526f, 5.636f, 2.526f)
                curveTo(4f, 2.526f, 2.684f, 3.148f, 2.684f, 3.148f)
                curveTo(2.684f, 3.148f, 2.831f, 5.644f, 3.062f, 6.967f)
                curveTo(3.161f, 7.532f, 3.636f, 8.355f, 4.066f, 8.745f)
                curveTo(4.556f, 9.19f, 5.636f, 9.716f, 5.636f, 9.716f)
                curveTo(5.949f, 9.501f, 6.533f, 9.404f, 7.28f, 8.745f)
                curveTo(8.028f, 8.087f, 8.213f, 6.967f, 8.213f, 6.967f)
                lineTo(8.588f, 3.148f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(8.414f, 3.066f)
                lineTo(8.962f, 3.34f)
                lineTo(8.585f, 7.104f)
                curveTo(8.454f, 7.9f, 8.124f, 8.529f, 7.597f, 8.993f)
                curveTo(7.311f, 9.245f, 7.032f, 9.433f, 6.733f, 9.59f)
                curveTo(6.564f, 9.678f, 5.858f, 10.042f, 5.864f, 10.039f)
                curveTo(5.793f, 10.073f, 5.739f, 10.103f, 5.696f, 10.133f)
                lineTo(5.627f, 10.18f)
                lineTo(5.554f, 10.144f)
                curveTo(4.822f, 9.788f, 4.139f, 9.308f, 3.8f, 9f)
                curveTo(3.337f, 8.58f, 2.849f, 7.721f, 2.744f, 7.126f)
                curveTo(2.589f, 6.236f, 2.449f, 5.01f, 2.351f, 3.34f)
                lineTo(2.843f, 3.082f)
                curveTo(2.941f, 4.74f, 3.058f, 6.062f, 3.211f, 6.936f)
                curveTo(3.301f, 7.453f, 3.751f, 8.245f, 4.162f, 8.618f)
                curveTo(4.466f, 8.893f, 4.955f, 9.198f, 5.627f, 9.53f)
                curveTo(5.667f, 9.507f, 5.712f, 9.484f, 5.763f, 9.459f)
                curveTo(5.764f, 9.458f, 6.222f, 9.255f, 6.381f, 9.172f)
                curveTo(6.659f, 9.026f, 6.919f, 8.852f, 7.186f, 8.616f)
                curveTo(7.653f, 8.204f, 7.945f, 7.649f, 8.063f, 6.943f)
                lineTo(8.414f, 3.066f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.464f, 6.89f)
                curveTo(3.464f, 6.89f, 3.583f, 7.255f, 3.803f, 7.665f)
                curveTo(4.127f, 7.75f, 4.325f, 7.746f, 4.388f, 7.675f)
                curveTo(4.569f, 7.473f, 5.213f, 7.386f, 5.334f, 7.559f)
                curveTo(5.408f, 7.666f, 5.669f, 7.74f, 5.954f, 7.642f)
                lineTo(5.922f, 7.648f)
                curveTo(5.971f, 7.63f, 6.087f, 7.584f, 6.159f, 7.556f)
                lineTo(6.217f, 7.533f)
                curveTo(6.324f, 7.492f, 6.403f, 7.471f, 6.484f, 7.465f)
                curveTo(6.584f, 7.457f, 6.681f, 7.476f, 6.783f, 7.525f)
                curveTo(7.008f, 7.632f, 7.286f, 7.682f, 7.475f, 7.649f)
                curveTo(7.706f, 7.247f, 7.871f, 6.89f, 7.871f, 6.89f)
                lineTo(6.773f, 5.837f)
                lineTo(6.337f, 6.31f)
                lineTo(5.613f, 5.278f)
                lineTo(5.006f, 6.31f)
                lineTo(4.541f, 5.837f)
                lineTo(3.464f, 6.89f)
                close()
                moveTo(4.098f, 8.134f)
                curveTo(4.047f, 8.066f, 4f, 7.995f, 3.955f, 7.924f)
                curveTo(4.235f, 7.975f, 4.426f, 7.948f, 4.532f, 7.83f)
                curveTo(4.582f, 7.774f, 4.731f, 7.719f, 4.9f, 7.696f)
                curveTo(4.979f, 7.686f, 5.054f, 7.683f, 5.112f, 7.689f)
                curveTo(5.139f, 7.691f, 5.16f, 7.695f, 5.175f, 7.7f)
                curveTo(5.18f, 7.702f, 5.179f, 7.702f, 5.175f, 7.695f)
                lineTo(5.174f, 7.694f)
                curveTo(5.303f, 7.879f, 5.654f, 7.978f, 5.985f, 7.857f)
                lineTo(5.954f, 7.863f)
                curveTo(6.043f, 7.835f, 6.205f, 7.772f, 6.263f, 7.749f)
                lineTo(6.283f, 7.741f)
                curveTo(6.375f, 7.706f, 6.438f, 7.689f, 6.497f, 7.685f)
                curveTo(6.565f, 7.68f, 6.63f, 7.692f, 6.703f, 7.727f)
                curveTo(6.902f, 7.822f, 7.134f, 7.878f, 7.338f, 7.88f)
                curveTo(7.294f, 7.95f, 7.249f, 8.02f, 7.203f, 8.088f)
                curveTo(7.045f, 8.125f, 6.799f, 8.077f, 6.601f, 7.968f)
                curveTo(6.509f, 7.918f, 6.42f, 7.898f, 6.328f, 7.906f)
                curveTo(6.255f, 7.912f, 6.185f, 7.934f, 6.089f, 7.975f)
                curveTo(6.084f, 7.978f, 6.064f, 7.987f, 6.038f, 7.999f)
                curveTo(5.975f, 8.027f, 5.875f, 8.073f, 5.832f, 8.091f)
                lineTo(5.868f, 8.083f)
                curveTo(5.62f, 8.179f, 5.403f, 8.109f, 5.341f, 8.006f)
                curveTo(5.231f, 7.824f, 4.652f, 7.913f, 4.489f, 8.122f)
                curveTo(4.445f, 8.178f, 4.314f, 8.188f, 4.098f, 8.134f)
                close()
                moveTo(4.314f, 8.39f)
                curveTo(4.326f, 8.402f, 4.338f, 8.415f, 4.351f, 8.427f)
                curveTo(4.915f, 8.977f, 5.613f, 9.247f, 5.613f, 9.247f)
                curveTo(5.613f, 9.247f, 6.444f, 8.995f, 6.916f, 8.466f)
                curveTo(6.956f, 8.421f, 6.996f, 8.372f, 7.037f, 8.32f)
                curveTo(6.865f, 8.311f, 6.675f, 8.255f, 6.511f, 8.166f)
                curveTo(6.451f, 8.133f, 6.399f, 8.121f, 6.344f, 8.126f)
                curveTo(6.295f, 8.13f, 6.242f, 8.147f, 6.163f, 8.181f)
                curveTo(6.161f, 8.182f, 6.156f, 8.184f, 6.149f, 8.187f)
                curveTo(6.101f, 8.209f, 5.955f, 8.274f, 5.868f, 8.304f)
                lineTo(5.904f, 8.297f)
                curveTo(5.612f, 8.419f, 5.302f, 8.322f, 5.181f, 8.14f)
                curveTo(5.17f, 8.136f, 5.153f, 8.132f, 5.132f, 8.13f)
                curveTo(5.084f, 8.124f, 5.019f, 8.127f, 4.952f, 8.137f)
                curveTo(4.809f, 8.159f, 4.684f, 8.212f, 4.642f, 8.265f)
                curveTo(4.573f, 8.355f, 4.463f, 8.394f, 4.314f, 8.39f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.467f, 3.679f)
                horizontalLineTo(4.027f)
                lineTo(4.368f, 3.36f)
                lineTo(4.027f, 3.022f)
                horizontalLineTo(4.467f)
                lineTo(4.652f, 2.695f)
                lineTo(4.839f, 3.022f)
                horizontalLineTo(5.277f)
                lineTo(4.954f, 3.339f)
                lineTo(5.241f, 3.679f)
                horizontalLineTo(4.839f)
                lineTo(4.652f, 4.025f)
                lineTo(4.467f, 3.679f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.538f, 3.679f)
                horizontalLineTo(6.098f)
                lineTo(6.439f, 3.36f)
                lineTo(6.098f, 3.022f)
                horizontalLineTo(6.538f)
                lineTo(6.723f, 2.695f)
                lineTo(6.91f, 3.022f)
                horizontalLineTo(7.348f)
                lineTo(7.025f, 3.339f)
                lineTo(7.312f, 3.679f)
                horizontalLineTo(6.91f)
                lineTo(6.723f, 4.025f)
                lineTo(6.538f, 3.679f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.375f, 4.73f)
                horizontalLineTo(4.935f)
                lineTo(5.276f, 4.41f)
                lineTo(4.935f, 4.073f)
                horizontalLineTo(5.375f)
                lineTo(5.56f, 3.745f)
                lineTo(5.747f, 4.073f)
                horizontalLineTo(6.185f)
                lineTo(5.862f, 4.39f)
                lineTo(6.149f, 4.73f)
                horizontalLineTo(5.747f)
                lineTo(5.56f, 5.075f)
                lineTo(5.375f, 4.73f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SloveniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Slovenia,
            contentDescription = "Slovenia Flag"
        )
    }
}
