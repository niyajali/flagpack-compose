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
 * Albania Flag (16x12dp)
 *
 * - ISO Alpha-2: AL
 * - ISO Alpha-3: ALB
 * - ISO Numeric: 008
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Albania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Albania:AL:ALB:008:Small",
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
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1A1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.941f, 7.491f)
                curveTo(7.894f, 7.483f, 7.848f, 7.472f, 7.803f, 7.458f)
                curveTo(7.117f, 7.991f, 6.457f, 8.353f, 5.819f, 8.54f)
                curveTo(5.554f, 8.618f, 5.276f, 8.466f, 5.199f, 8.201f)
                curveTo(5.121f, 7.936f, 5.273f, 7.659f, 5.538f, 7.581f)
                curveTo(5.932f, 7.465f, 6.352f, 7.257f, 6.796f, 6.955f)
                curveTo(6.504f, 7.002f, 6.202f, 7.054f, 6.02f, 7.092f)
                curveTo(5.872f, 7.124f, 5.693f, 7.216f, 5.523f, 7.304f)
                lineTo(5.523f, 7.304f)
                curveTo(5.19f, 7.476f, 4.886f, 7.633f, 4.886f, 7.301f)
                curveTo(4.886f, 6.799f, 5.178f, 6.649f, 5.72f, 6.422f)
                curveTo(6.118f, 6.255f, 6.37f, 6.26f, 6.612f, 6.265f)
                horizontalLineTo(6.612f)
                curveTo(6.7f, 6.267f, 6.785f, 6.269f, 6.877f, 6.262f)
                curveTo(6.928f, 6.259f, 6.982f, 6.253f, 7.039f, 6.245f)
                lineTo(7.022f, 6.152f)
                curveTo(6.972f, 6.145f, 6.923f, 6.14f, 6.877f, 6.137f)
                curveTo(6.785f, 6.131f, 6.7f, 6.132f, 6.612f, 6.134f)
                horizontalLineTo(6.612f)
                curveTo(6.37f, 6.139f, 6.118f, 6.144f, 5.72f, 5.977f)
                curveTo(5.178f, 5.75f, 4.886f, 5.6f, 4.886f, 5.098f)
                curveTo(4.886f, 4.766f, 5.19f, 4.923f, 5.523f, 5.095f)
                curveTo(5.693f, 5.183f, 5.872f, 5.275f, 6.02f, 5.307f)
                curveTo(6.223f, 5.35f, 6.578f, 5.41f, 6.9f, 5.461f)
                lineTo(6.893f, 5.417f)
                curveTo(6.826f, 5.378f, 6.764f, 5.335f, 6.71f, 5.284f)
                curveTo(6.485f, 5.074f, 6.301f, 5.039f, 6.073f, 4.996f)
                curveTo(5.921f, 4.967f, 5.75f, 4.934f, 5.533f, 4.844f)
                curveTo(4.991f, 4.617f, 4.664f, 4.173f, 4.664f, 3.671f)
                curveTo(4.664f, 3.345f, 4.945f, 3.557f, 5.28f, 3.808f)
                curveTo(5.461f, 3.944f, 5.657f, 4.092f, 5.833f, 4.173f)
                curveTo(6.007f, 4.253f, 6.184f, 4.318f, 6.347f, 4.376f)
                lineTo(6.347f, 4.376f)
                curveTo(6.513f, 4.437f, 6.663f, 4.491f, 6.778f, 4.551f)
                curveTo(6.78f, 4.529f, 6.783f, 4.507f, 6.786f, 4.485f)
                curveTo(6.726f, 4.442f, 6.674f, 4.391f, 6.635f, 4.33f)
                curveTo(6.37f, 3.916f, 6.013f, 3.767f, 5.474f, 3.541f)
                lineTo(5.468f, 3.539f)
                curveTo(4.926f, 3.312f, 4.6f, 2.868f, 4.6f, 2.366f)
                curveTo(4.6f, 2.04f, 4.881f, 2.252f, 5.215f, 2.503f)
                curveTo(5.396f, 2.639f, 5.593f, 2.787f, 5.769f, 2.868f)
                curveTo(6.271f, 3.099f, 6.657f, 3.298f, 6.902f, 3.766f)
                curveTo(6.95f, 3.857f, 6.999f, 3.92f, 7.046f, 3.964f)
                curveTo(7.108f, 3.899f, 7.178f, 3.842f, 7.255f, 3.795f)
                curveTo(7.151f, 3.048f, 6.977f, 2.672f, 6.811f, 2.641f)
                curveTo(6.54f, 2.591f, 6.361f, 2.33f, 6.411f, 2.058f)
                curveTo(6.462f, 1.787f, 6.723f, 1.608f, 6.994f, 1.658f)
                curveTo(7.662f, 1.783f, 8.042f, 2.403f, 8.22f, 3.489f)
                curveTo(8.399f, 2.403f, 8.778f, 1.783f, 9.446f, 1.658f)
                curveTo(9.718f, 1.608f, 9.979f, 1.787f, 10.029f, 2.058f)
                curveTo(10.08f, 2.33f, 9.901f, 2.591f, 9.629f, 2.641f)
                curveTo(9.464f, 2.672f, 9.29f, 3.046f, 9.186f, 3.79f)
                curveTo(9.274f, 3.827f, 9.355f, 3.877f, 9.427f, 3.937f)
                curveTo(9.466f, 3.895f, 9.506f, 3.84f, 9.545f, 3.766f)
                curveTo(9.79f, 3.298f, 10.176f, 3.099f, 10.678f, 2.868f)
                curveTo(10.854f, 2.787f, 11.051f, 2.64f, 11.231f, 2.503f)
                lineTo(11.231f, 2.503f)
                curveTo(11.566f, 2.252f, 11.847f, 2.04f, 11.847f, 2.366f)
                curveTo(11.847f, 2.868f, 11.521f, 3.312f, 10.979f, 3.539f)
                lineTo(10.972f, 3.541f)
                curveTo(10.434f, 3.767f, 10.077f, 3.916f, 9.811f, 4.33f)
                curveTo(9.793f, 4.36f, 9.771f, 4.387f, 9.746f, 4.412f)
                curveTo(9.756f, 4.442f, 9.763f, 4.472f, 9.77f, 4.503f)
                curveTo(9.866f, 4.461f, 9.979f, 4.42f, 10.1f, 4.376f)
                lineTo(10.1f, 4.376f)
                curveTo(10.263f, 4.318f, 10.44f, 4.253f, 10.614f, 4.173f)
                curveTo(10.79f, 4.092f, 10.986f, 3.944f, 11.167f, 3.808f)
                curveTo(11.502f, 3.557f, 11.783f, 3.345f, 11.783f, 3.671f)
                curveTo(11.783f, 4.173f, 11.456f, 4.617f, 10.914f, 4.844f)
                curveTo(10.697f, 4.934f, 10.526f, 4.967f, 10.373f, 4.996f)
                curveTo(10.145f, 5.039f, 9.962f, 5.074f, 9.737f, 5.284f)
                curveTo(9.721f, 5.299f, 9.705f, 5.313f, 9.689f, 5.326f)
                lineTo(9.666f, 5.442f)
                curveTo(9.953f, 5.395f, 10.248f, 5.345f, 10.427f, 5.307f)
                curveTo(10.575f, 5.275f, 10.753f, 5.183f, 10.924f, 5.095f)
                curveTo(11.257f, 4.923f, 11.561f, 4.766f, 11.561f, 5.098f)
                curveTo(11.561f, 5.6f, 11.269f, 5.75f, 10.727f, 5.977f)
                curveTo(10.328f, 6.144f, 10.077f, 6.139f, 9.834f, 6.134f)
                horizontalLineTo(9.834f)
                curveTo(9.747f, 6.132f, 9.661f, 6.131f, 9.57f, 6.137f)
                curveTo(9.557f, 6.138f, 9.543f, 6.139f, 9.528f, 6.14f)
                lineTo(9.506f, 6.257f)
                curveTo(9.528f, 6.259f, 9.549f, 6.261f, 9.57f, 6.262f)
                curveTo(9.661f, 6.269f, 9.747f, 6.267f, 9.834f, 6.265f)
                horizontalLineTo(9.834f)
                curveTo(10.077f, 6.26f, 10.328f, 6.255f, 10.727f, 6.422f)
                curveTo(11.269f, 6.649f, 11.561f, 6.799f, 11.561f, 7.301f)
                curveTo(11.561f, 7.633f, 11.257f, 7.476f, 10.924f, 7.304f)
                lineTo(10.924f, 7.304f)
                lineTo(10.924f, 7.304f)
                curveTo(10.753f, 7.216f, 10.575f, 7.124f, 10.427f, 7.092f)
                curveTo(10.254f, 7.055f, 9.971f, 7.007f, 9.692f, 6.962f)
                curveTo(10.132f, 7.26f, 10.549f, 7.466f, 10.941f, 7.581f)
                curveTo(11.206f, 7.659f, 11.357f, 7.936f, 11.28f, 8.201f)
                curveTo(11.202f, 8.466f, 10.924f, 8.618f, 10.659f, 8.54f)
                curveTo(10.026f, 8.354f, 9.371f, 7.997f, 8.692f, 7.471f)
                curveTo(8.664f, 7.478f, 8.635f, 7.484f, 8.607f, 7.489f)
                curveTo(8.729f, 8.034f, 9.684f, 8.483f, 9.684f, 8.483f)
                curveTo(9.684f, 8.483f, 8.464f, 10.831f, 8.27f, 10.831f)
                curveTo(8.077f, 10.831f, 6.778f, 8.483f, 6.778f, 8.483f)
                curveTo(7.458f, 8.23f, 7.812f, 7.719f, 7.941f, 7.491f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AlbaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Albania,
            contentDescription = "Albania Flag"
        )
    }
}
