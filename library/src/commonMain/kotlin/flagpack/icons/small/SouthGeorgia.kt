package flagpack.icons.small

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * South Georgia Flag (16x12dp)
 *
 * - ISO Alpha-2: GS
 * - ISO Alpha-3: SGS
 * - ISO Numeric: 239
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SouthGeorgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Georgia:GS:SGS:239:Small",
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
                fill = SolidColor(Color(0xFF2B409A)),
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
                stroke = SolidColor(Color(0xFFCDAD56)),
                strokeLineWidth = 0.25f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.752f, 3.412f)
                curveTo(11.752f, 3.412f, 11.531f, 3.121f, 11.531f, 3.055f)
            }
            path(
                stroke = SolidColor(Color(0xFFCDAD56)),
                strokeLineWidth = 0.25f,
                strokeLineCap = StrokeCap.Round
            ) {
                moveTo(11.931f, 3.412f)
                curveTo(11.931f, 3.412f, 12.152f, 3.121f, 12.152f, 3.055f)
            }
            path(fill = SolidColor(Color(0xFF6A4C2D))) {
                moveTo(12.159f, 9.276f)
                curveTo(12.128f, 9.276f, 12.017f, 9.216f, 12.017f, 9.216f)
                curveTo(12.017f, 9.216f, 11.936f, 9.343f, 11.894f, 9.351f)
                curveTo(11.851f, 9.358f, 11.632f, 9.272f, 11.632f, 9.272f)
                curveTo(11.632f, 9.272f, 11.479f, 9.392f, 11.444f, 9.385f)
                curveTo(11.409f, 9.377f, 11.056f, 9.302f, 11.056f, 9.302f)
                lineTo(10.863f, 9.182f)
                curveTo(10.863f, 9.182f, 10.756f, 9.355f, 10.752f, 9.351f)
                curveTo(10.748f, 9.347f, 10.429f, 9.287f, 10.429f, 9.287f)
                curveTo(10.429f, 9.287f, 10.525f, 9.156f, 10.525f, 9.152f)
                curveTo(10.525f, 9.148f, 10.479f, 9.133f, 10.479f, 9.133f)
                lineTo(10.41f, 9.189f)
                lineTo(10.125f, 9.216f)
                lineTo(10.194f, 9.02f)
                lineTo(10.306f, 8.855f)
                lineTo(11.671f, 7.559f)
                lineTo(12.344f, 8.772f)
                lineTo(12.244f, 9.137f)
                curveTo(12.244f, 9.137f, 12.19f, 9.276f, 12.159f, 9.276f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFBB00)),
                strokeLineWidth = 0.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.855f, 9.03f)
                curveTo(10.903f, 9.088f, 11.529f, 9.728f, 11.63f, 10.031f)
                curveTo(11.732f, 10.334f, 10.807f, 9.947f, 10.807f, 9.947f)
                curveTo(10.807f, 9.947f, 11.972f, 9.19f, 12.554f, 9.19f)
                curveTo(13.135f, 9.19f, 14.279f, 9.947f, 14.279f, 9.947f)
                curveTo(14.279f, 9.947f, 13.512f, 10.487f, 13.52f, 10.147f)
                curveTo(13.528f, 9.806f, 13.88f, 9.135f, 14.3f, 9.03f)
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(14.89f, 9.058f)
                verticalLineTo(8.678f)
                lineTo(13.709f, 8.733f)
                lineTo(13.069f, 8.558f)
                lineTo(12.8f, 8.738f)
                lineTo(12.945f, 8.928f)
                lineTo(13.3f, 9.058f)
                horizontalLineTo(14.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF656263))) {
                moveTo(11.969f, 4.933f)
                curveTo(11.976f, 4.949f, 12.119f, 4.92f, 12.149f, 5.006f)
                curveTo(12.303f, 4.779f, 12.484f, 4.996f, 12.484f, 4.996f)
                lineTo(12.636f, 4.816f)
                lineTo(12.808f, 4.978f)
                lineTo(12.965f, 4.966f)
                lineTo(13.13f, 5.352f)
                lineTo(11.831f, 5.328f)
                curveTo(11.831f, 5.328f, 11.963f, 4.917f, 11.969f, 4.933f)
                close()
            }
            path(fill = SolidColor(Color(0xFF656263))) {
                moveTo(13.316f, 6.577f)
                curveTo(13.305f, 6.455f, 13.197f, 6.44f, 13.136f, 6.444f)
                curveTo(13.076f, 6.449f, 13.021f, 6.499f, 13.021f, 6.499f)
                lineTo(12.821f, 6.375f)
                curveTo(12.821f, 6.375f, 12.921f, 5.757f, 13.028f, 5.719f)
                curveTo(13.129f, 5.647f, 13.147f, 5.617f, 13.147f, 5.6f)
                curveTo(13.147f, 5.584f, 13.109f, 5.518f, 13.109f, 5.518f)
                lineTo(12.456f, 5.442f)
                lineTo(11.838f, 5.514f)
                curveTo(11.838f, 5.514f, 11.79f, 5.61f, 11.797f, 5.639f)
                curveTo(11.803f, 5.667f, 11.805f, 5.698f, 11.916f, 5.782f)
                curveTo(12.038f, 5.874f, 12.122f, 6.402f, 12.122f, 6.402f)
                curveTo(12.122f, 6.402f, 11.949f, 6.485f, 11.939f, 6.475f)
                curveTo(11.928f, 6.465f, 11.876f, 6.455f, 11.849f, 6.459f)
                curveTo(11.822f, 6.463f, 11.732f, 6.508f, 11.732f, 6.624f)
                curveTo(11.732f, 6.74f, 11.822f, 6.807f, 11.822f, 6.807f)
                curveTo(11.822f, 6.807f, 12.412f, 7.24f, 12.5f, 7.399f)
                curveTo(12.585f, 7.207f, 13.147f, 6.775f, 13.213f, 6.742f)
                curveTo(13.241f, 6.726f, 13.326f, 6.699f, 13.316f, 6.577f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.905f, 6.001f)
                curveTo(13.954f, 5.969f, 14.281f, 5.953f, 14.359f, 6.001f)
                curveTo(14.438f, 6.049f, 14.64f, 6.126f, 14.644f, 6.186f)
                curveTo(14.647f, 6.247f, 14.781f, 6.357f, 14.781f, 6.357f)
                curveTo(14.781f, 6.357f, 15.011f, 6.843f, 15.014f, 7.143f)
                curveTo(15.044f, 7.348f, 15.037f, 7.894f, 14.956f, 8.101f)
                curveTo(14.952f, 8.36f, 14.621f, 8.549f, 14.621f, 8.549f)
                curveTo(14.621f, 8.549f, 14.647f, 8.594f, 14.644f, 8.642f)
                curveTo(14.64f, 8.69f, 14.614f, 8.734f, 14.614f, 8.734f)
                lineTo(14.369f, 8.84f)
                lineTo(14.098f, 8.795f)
                lineTo(13.791f, 7.898f)
                lineTo(13.863f, 6.381f)
                lineTo(13.882f, 6.304f)
                lineTo(13.849f, 6.1f)
                curveTo(13.849f, 6.1f, 13.856f, 6.033f, 13.905f, 6.001f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.131f, 6.797f)
                curveTo(12.131f, 6.797f, 12.462f, 6.797f, 12.497f, 6.902f)
                curveTo(12.56f, 6.762f, 12.846f, 6.771f, 12.846f, 6.771f)
                curveTo(13.019f, 6.765f, 13.191f, 6.759f, 13.364f, 6.754f)
                curveTo(13.367f, 7.161f, 13.37f, 7.569f, 13.373f, 7.976f)
                curveTo(13.272f, 8.45f, 12.92f, 8.785f, 12.533f, 8.928f)
                curveTo(12.071f, 8.782f, 11.78f, 8.401f, 11.684f, 7.967f)
                curveTo(11.666f, 7.58f, 11.648f, 7.193f, 11.63f, 6.806f)
                curveTo(11.797f, 6.803f, 11.964f, 6.8f, 12.131f, 6.797f)
                close()
            }
            path(fill = SolidColor(Color(0xFF006B00))) {
                moveTo(11.809f, 6.801f)
                lineTo(12.538f, 8.7f)
                lineTo(13.196f, 6.76f)
                curveTo(12.992f, 6.773f, 12.554f, 6.729f, 12.499f, 6.911f)
                curveTo(12.415f, 6.748f, 11.954f, 6.813f, 11.809f, 6.801f)
                verticalLineTo(6.801f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.654f, 6.939f)
                curveTo(12.654f, 6.939f, 12.72f, 7.112f, 12.654f, 7.198f)
                curveTo(12.587f, 7.283f, 12.659f, 7.353f, 12.699f, 7.353f)
                curveTo(12.739f, 7.353f, 12.877f, 7.489f, 12.765f, 7.489f)
                curveTo(12.654f, 7.489f, 12.591f, 7.447f, 12.591f, 7.566f)
                curveTo(12.591f, 7.686f, 12.73f, 8.145f, 12.73f, 8.004f)
                curveTo(12.73f, 7.864f, 12.765f, 7.708f, 12.765f, 7.708f)
                curveTo(12.765f, 7.708f, 12.824f, 7.752f, 12.782f, 7.912f)
                curveTo(12.74f, 8.072f, 12.549f, 8.304f, 12.501f, 8.314f)
                curveTo(12.454f, 8.323f, 12.38f, 8.397f, 12.37f, 8.26f)
                curveTo(12.361f, 8.122f, 12.321f, 8.058f, 12.353f, 8.031f)
                curveTo(12.385f, 8.004f, 12.427f, 7.909f, 12.44f, 7.984f)
                curveTo(12.454f, 8.059f, 12.394f, 8.131f, 12.404f, 8.158f)
                curveTo(12.414f, 8.185f, 12.419f, 8.247f, 12.46f, 8.195f)
                curveTo(12.501f, 8.144f, 12.526f, 8.059f, 12.556f, 8.138f)
                curveTo(12.587f, 8.216f, 12.588f, 8.154f, 12.524f, 8.004f)
                curveTo(12.46f, 7.855f, 12.406f, 7.771f, 12.414f, 7.64f)
                curveTo(12.421f, 7.508f, 12.411f, 7.459f, 12.421f, 7.417f)
                curveTo(12.432f, 7.374f, 12.307f, 7.169f, 12.339f, 7.109f)
                curveTo(12.37f, 7.05f, 12.382f, 6.859f, 12.421f, 6.893f)
                curveTo(12.46f, 6.928f, 12.48f, 6.974f, 12.46f, 7.025f)
                curveTo(12.44f, 7.077f, 12.42f, 7.128f, 12.44f, 7.163f)
                curveTo(12.46f, 7.198f, 12.529f, 7.298f, 12.543f, 7.273f)
                curveTo(12.556f, 7.247f, 12.603f, 7.272f, 12.603f, 7.129f)
                curveTo(12.603f, 6.986f, 12.551f, 6.936f, 12.584f, 6.902f)
                curveTo(12.616f, 6.868f, 12.654f, 6.939f, 12.654f, 6.939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E5AA6))) {
                moveTo(13.2f, 6.76f)
                lineTo(13.299f, 6.758f)
                lineTo(13.123f, 6.975f)
                lineTo(13.334f, 7.215f)
                lineTo(12.92f, 7.725f)
                lineTo(13.31f, 8.185f)
                curveTo(13.267f, 8.288f, 13.218f, 8.382f, 13.151f, 8.467f)
                lineTo(12.927f, 8.224f)
                lineTo(13.334f, 7.728f)
                lineTo(12.999f, 7.357f)
                lineTo(13.2f, 6.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF1E5AA6))) {
                moveTo(11.691f, 6.806f)
                lineTo(11.887f, 7.014f)
                lineTo(11.679f, 7.268f)
                lineTo(12.112f, 7.728f)
                lineTo(11.754f, 8.197f)
                curveTo(11.797f, 8.3f, 11.858f, 8.414f, 11.925f, 8.498f)
                lineTo(12.138f, 8.235f)
                lineTo(11.7f, 7.76f)
                lineTo(12.021f, 7.362f)
                lineTo(11.796f, 6.804f)
                lineTo(11.691f, 6.806f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFD5DFFF),
                        1f to Color.White
                    ),
                    start = Offset(14.177f, 7.804f),
                    end = Offset(14.749f, 7.794f)
                )
            ) {
                moveTo(14.193f, 6.426f)
                curveTo(14.193f, 6.457f, 14.227f, 8.342f, 14.266f, 8.324f)
                curveTo(14.36f, 8.279f, 14.382f, 8.377f, 14.382f, 8.377f)
                curveTo(14.382f, 8.377f, 14.415f, 8.686f, 14.333f, 8.728f)
                curveTo(14.186f, 8.805f, 14.122f, 8.821f, 14.122f, 8.821f)
                lineTo(13.98f, 8.718f)
                curveTo(13.98f, 8.718f, 13.837f, 8.517f, 13.804f, 8.428f)
                curveTo(13.771f, 8.338f, 13.732f, 7.939f, 13.745f, 7.853f)
                curveTo(13.758f, 7.767f, 13.768f, 7.262f, 13.761f, 7.237f)
                curveTo(13.755f, 7.211f, 13.729f, 6.79f, 13.745f, 6.726f)
                curveTo(13.761f, 6.662f, 13.863f, 6.381f, 13.859f, 6.381f)
                curveTo(13.859f, 6.381f, 14.193f, 6.394f, 14.193f, 6.426f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(13.866f, 6.103f)
                curveTo(13.934f, 6.103f, 13.987f, 6.16f, 14.003f, 6.212f)
                curveTo(14.006f, 6.234f, 13.997f, 6.25f, 14f, 6.291f)
                curveTo(14.003f, 6.333f, 13.503f, 6.301f, 13.5f, 6.298f)
                curveTo(13.5f, 6.298f, 13.732f, 6.077f, 13.866f, 6.103f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.205f, 6.255f)
                curveTo(14.205f, 6.283f, 14.182f, 6.305f, 14.155f, 6.305f)
                curveTo(14.127f, 6.305f, 14.104f, 6.283f, 14.104f, 6.255f)
                curveTo(14.104f, 6.228f, 14.127f, 6.205f, 14.155f, 6.205f)
                curveTo(14.182f, 6.205f, 14.205f, 6.228f, 14.205f, 6.255f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.91f, 5.954f)
                curveTo(12.91f, 5.954f, 13.171f, 6.23f, 13.339f, 6.227f)
                curveTo(13.37f, 6.307f, 13.262f, 6.383f, 13.22f, 6.418f)
                curveTo(13.134f, 6.392f, 13.056f, 6.423f, 12.857f, 6.184f)
                curveTo(12.87f, 6.031f, 12.913f, 5.96f, 12.91f, 5.954f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(13.945f, 4.569f)
                curveTo(13.97f, 4.746f, 14.384f, 4.962f, 14.504f, 4.816f)
                curveTo(14.492f, 4.881f, 14.514f, 5.087f, 13.883f, 5.084f)
                curveTo(14.122f, 5.305f, 13.645f, 5.545f, 13.51f, 5.491f)
                curveTo(13.758f, 5.305f, 13.44f, 5.194f, 13.262f, 5.314f)
                curveTo(13.296f, 5.212f, 13.544f, 4.701f, 13.945f, 4.569f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.525f, 5.808f)
                curveTo(13.478f, 5.614f, 13.455f, 5.39f, 13.559f, 5.305f)
                curveTo(13.422f, 5.212f, 13.272f, 5.308f, 13.272f, 5.308f)
                curveTo(13.271f, 5.31f, 13.268f, 5.314f, 13.264f, 5.32f)
                curveTo(13.232f, 5.364f, 13.125f, 5.512f, 13.272f, 5.778f)
                curveTo(12.88f, 5.676f, 13.044f, 6.032f, 13.073f, 6.059f)
                curveTo(13.088f, 6.002f, 13.296f, 5.948f, 13.348f, 6.239f)
                curveTo(13.366f, 6.297f, 13.26f, 6.382f, 13.226f, 6.409f)
                curveTo(13.219f, 6.416f, 13.215f, 6.419f, 13.217f, 6.418f)
                curveTo(13.217f, 6.418f, 13.548f, 6.485f, 13.591f, 6.047f)
                curveTo(13.648f, 6.014f, 13.923f, 5.83f, 13.915f, 5.452f)
                curveTo(13.662f, 5.457f, 13.55f, 5.735f, 13.525f, 5.808f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.044f, 6.032f)
                curveTo(12.044f, 6.032f, 11.79f, 6.248f, 11.646f, 6.179f)
                curveTo(11.539f, 6.242f, 11.413f, 6.131f, 11.413f, 6.131f)
                curveTo(11.413f, 6.131f, 11.56f, 6.66f, 12.087f, 6.277f)
                curveTo(12.078f, 6.161f, 12.05f, 6.041f, 12.044f, 6.032f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(11.643f, 6.17f)
                curveTo(11.664f, 6.059f, 11.753f, 6.005f, 11.823f, 6.11f)
                curveTo(11.918f, 6.128f, 12.013f, 5.748f, 11.676f, 5.811f)
                curveTo(11.771f, 5.314f, 11.487f, 5.129f, 11.487f, 5.129f)
                curveTo(11.487f, 5.129f, 11.386f, 5.679f, 11.432f, 5.781f)
                curveTo(11.477f, 5.883f, 11.364f, 5.592f, 11f, 5.512f)
                curveTo(10.994f, 5.928f, 11.407f, 6.122f, 11.407f, 6.122f)
                curveTo(11.407f, 6.122f, 11.523f, 6.227f, 11.643f, 6.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(11.298f, 5.569f)
                curveTo(11.191f, 5.602f, 10.931f, 5.445f, 11.096f, 5.242f)
                curveTo(10.554f, 5.23f, 10.259f, 4.772f, 10.439f, 4.859f)
                curveTo(10.62f, 4.946f, 10.749f, 4.76f, 10.884f, 4.859f)
                curveTo(10.719f, 4.71f, 10.942f, 4.59f, 10.942f, 4.59f)
                curveTo(10.942f, 4.59f, 11.404f, 4.725f, 11.487f, 5.126f)
                curveTo(11.459f, 5.203f, 11.447f, 5.341f, 11.441f, 5.335f)
                curveTo(11.441f, 5.332f, 11.154f, 5.33f, 11.298f, 5.569f)
                close()
            }
            path(fill = SolidColor(Color(0xFF923F00))) {
                moveTo(12.348f, 3.434f)
                curveTo(12.28f, 3.66f, 12.033f, 3.574f, 12.033f, 3.574f)
                curveTo(12.033f, 3.574f, 12.041f, 3.687f, 12.016f, 3.741f)
                curveTo(12.036f, 3.758f, 12.182f, 3.884f, 12.336f, 3.917f)
                curveTo(12.556f, 3.964f, 13.008f, 3.835f, 13.159f, 4.025f)
                curveTo(13.311f, 4.215f, 13.303f, 4.368f, 13.303f, 4.368f)
                curveTo(13.303f, 4.368f, 13.106f, 4.393f, 13.161f, 4.471f)
                curveTo(13.196f, 4.522f, 13.294f, 4.56f, 13.303f, 4.612f)
                curveTo(13.331f, 4.779f, 13.21f, 5.08f, 13.254f, 5.193f)
                curveTo(13.185f, 5.2f, 13.18f, 5.279f, 13.18f, 5.279f)
                curveTo(13.176f, 5.368f, 12.979f, 5.315f, 12.979f, 5.315f)
                curveTo(12.979f, 5.315f, 13.102f, 4.967f, 13.11f, 4.886f)
                curveTo(13.118f, 4.805f, 13.024f, 4.661f, 12.95f, 4.661f)
                curveTo(12.877f, 4.661f, 12.823f, 4.918f, 12.823f, 4.918f)
                curveTo(12.823f, 4.918f, 12.787f, 5.112f, 12.799f, 5.13f)
                curveTo(12.811f, 5.148f, 12.75f, 5.067f, 12.75f, 5.067f)
                curveTo(12.75f, 5.067f, 12.73f, 5.145f, 12.699f, 5.193f)
                curveTo(12.663f, 5.247f, 12.614f, 5.27f, 12.614f, 5.27f)
                curveTo(12.614f, 5.27f, 12.578f, 5.152f, 12.59f, 5.107f)
                curveTo(12.602f, 5.062f, 12.791f, 4.886f, 12.774f, 4.76f)
                curveTo(12.767f, 4.704f, 12.761f, 4.607f, 12.699f, 4.575f)
                curveTo(12.62f, 4.534f, 12.476f, 4.564f, 12.389f, 4.544f)
                curveTo(12.341f, 4.635f, 12.319f, 5.139f, 12.352f, 5.171f)
                curveTo(12.385f, 5.202f, 12.27f, 5.27f, 12.27f, 5.27f)
                lineTo(12.135f, 5.274f)
                curveTo(12.133f, 5.206f, 12.215f, 5.019f, 12.215f, 4.862f)
                curveTo(12.215f, 4.704f, 12.225f, 4.535f, 12.225f, 4.535f)
                curveTo(12.225f, 4.535f, 12.134f, 4.56f, 12.086f, 4.661f)
                curveTo(12.045f, 4.745f, 12.045f, 4.904f, 12.049f, 4.927f)
                curveTo(12.057f, 4.976f, 12.098f, 5.116f, 12.086f, 5.157f)
                curveTo(12.073f, 5.198f, 11.861f, 5.252f, 11.861f, 5.252f)
                lineTo(11.852f, 5.121f)
                curveTo(11.852f, 5.121f, 11.942f, 5.058f, 11.942f, 4.9f)
                curveTo(11.942f, 4.742f, 11.951f, 4.517f, 11.946f, 4.503f)
                curveTo(11.944f, 4.495f, 11.873f, 4.15f, 11.779f, 3.917f)
                curveTo(11.716f, 3.762f, 11.62f, 3.69f, 11.615f, 3.678f)
                curveTo(11.602f, 3.646f, 11.602f, 3.61f, 11.602f, 3.61f)
                curveTo(11.602f, 3.61f, 11.467f, 3.718f, 11.307f, 3.488f)
                curveTo(11.454f, 3.351f, 11.611f, 3.452f, 11.611f, 3.452f)
                curveTo(11.611f, 3.452f, 11.651f, 3.326f, 11.84f, 3.335f)
                curveTo(12.028f, 3.344f, 12.065f, 3.461f, 12.057f, 3.448f)
                curveTo(12.057f, 3.448f, 12.196f, 3.313f, 12.348f, 3.434f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB4B6B9))) {
                moveTo(11.814f, 5.682f)
                lineTo(12.458f, 6.094f)
                lineTo(13.038f, 5.712f)
                curveTo(13.038f, 5.712f, 13.159f, 5.647f, 13.149f, 5.6f)
                curveTo(13.138f, 5.553f, 13.097f, 5.572f, 13.076f, 5.58f)
                curveTo(13.055f, 5.588f, 12.469f, 5.994f, 12.469f, 5.994f)
                lineTo(11.845f, 5.608f)
                curveTo(11.845f, 5.608f, 11.799f, 5.594f, 11.79f, 5.623f)
                curveTo(11.782f, 5.651f, 11.808f, 5.667f, 11.814f, 5.682f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(13.973f, 8.714f)
                curveTo(13.973f, 8.714f, 13.734f, 8.698f, 13.77f, 8.767f)
                curveTo(13.791f, 8.806f, 14.108f, 8.801f, 14.108f, 8.801f)
                lineTo(13.973f, 8.714f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFF7000))) {
                moveTo(14.087f, 8.807f)
                lineTo(13.837f, 8.814f)
                curveTo(13.837f, 8.814f, 13.775f, 8.87f, 13.771f, 8.883f)
                curveTo(13.767f, 8.896f, 13.812f, 8.9f, 13.812f, 8.9f)
                curveTo(13.812f, 8.9f, 14.07f, 8.966f, 14.265f, 8.923f)
                curveTo(14.363f, 8.89f, 14.381f, 8.849f, 14.312f, 8.825f)
                curveTo(14.243f, 8.8f, 14.089f, 8.808f, 14.087f, 8.807f)
                close()
            }
            path(fill = SolidColor(Color(0xFF8A9396))) {
                moveTo(11.195f, 6.495f)
                curveTo(11.195f, 6.495f, 11.163f, 6.595f, 11.195f, 6.645f)
                curveTo(11.228f, 6.695f, 11.432f, 7.099f, 11.432f, 7.099f)
                curveTo(11.432f, 7.099f, 11.572f, 6.931f, 11.623f, 6.927f)
                curveTo(11.674f, 6.922f, 11.651f, 7.363f, 11.651f, 7.363f)
                curveTo(11.651f, 7.363f, 11.567f, 7.44f, 11.516f, 7.436f)
                curveTo(11.465f, 7.431f, 11.642f, 7.608f, 11.637f, 7.758f)
                curveTo(11.632f, 7.908f, 11.405f, 8.654f, 11.321f, 8.667f)
                curveTo(11.237f, 8.681f, 11.165f, 8.527f, 11.165f, 8.394f)
                curveTo(11.165f, 8.261f, 11.251f, 8.049f, 11.247f, 7.99f)
                curveTo(11.242f, 7.931f, 10.83f, 8.624f, 10.806f, 8.732f)
                curveTo(10.801f, 8.752f, 10.828f, 8.826f, 10.828f, 8.826f)
                curveTo(10.828f, 8.826f, 10.667f, 8.84f, 10.702f, 9.045f)
                curveTo(10.228f, 8.881f, 9.469f, 8.785f, 9.474f, 8.498f)
                curveTo(9.475f, 8.389f, 9.656f, 7.684f, 9.759f, 7.399f)
                curveTo(9.924f, 6.94f, 10.505f, 6.668f, 10.508f, 6.618f)
                curveTo(10.512f, 6.536f, 10.545f, 6.5f, 10.55f, 6.454f)
                curveTo(10.554f, 6.409f, 10.6f, 6.186f, 10.646f, 6.145f)
                curveTo(10.693f, 6.104f, 10.935f, 6.004f, 10.995f, 6.009f)
                curveTo(11.056f, 6.013f, 11.107f, 6.054f, 11.107f, 6.054f)
                curveTo(11.107f, 6.054f, 11.335f, 6.054f, 11.349f, 6.14f)
                curveTo(11.363f, 6.227f, 11.302f, 6.259f, 11.302f, 6.259f)
                curveTo(11.302f, 6.259f, 11.335f, 6.381f, 11.195f, 6.495f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2B2B2B))) {
                moveTo(11.331f, 9.073f)
                curveTo(11.408f, 9.126f, 11.585f, 9.157f, 11.585f, 9.157f)
                curveTo(11.585f, 9.157f, 11.149f, 9.275f, 10.706f, 9.047f)
                curveTo(10.666f, 8.869f, 10.801f, 8.83f, 10.835f, 8.828f)
                curveTo(10.913f, 8.808f, 11.254f, 9.019f, 11.331f, 9.073f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.002f, 6.5f)
                lineTo(0.978f, 7.369f)
                lineTo(9.045f, 0.944f)
                lineTo(10.09f, -0.346f)
                lineTo(7.972f, -0.637f)
                lineTo(4.682f, 2.132f)
                lineTo(2.033f, 3.997f)
                lineTo(-1.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.731f, 7.108f)
                lineTo(0.278f, 7.613f)
                lineTo(9.714f, -0.466f)
                horizontalLineTo(8.298f)
                lineTo(-0.731f, 7.108f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10.002f, 6.5f)
                lineTo(8.022f, 7.369f)
                lineTo(-0.045f, 0.944f)
                lineTo(-1.09f, -0.346f)
                lineTo(1.028f, -0.637f)
                lineTo(4.318f, 2.132f)
                lineTo(6.967f, 3.997f)
                lineTo(10.002f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(9.935f, 6.937f)
                lineTo(8.926f, 7.441f)
                lineTo(4.907f, 3.982f)
                lineTo(3.716f, 3.595f)
                lineTo(-1.19f, -0.342f)
                horizontalLineTo(0.227f)
                lineTo(5.13f, 3.502f)
                lineTo(6.433f, 3.965f)
                lineTo(9.935f, 6.937f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.992f, 0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.242f, -0.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(2.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(4.75f)
                horizontalLineTo(5.742f)
                verticalLineTo(7.75f)
                horizontalLineTo(3.242f)
                verticalLineTo(4.75f)
                horizontalLineTo(-0.75f)
                verticalLineTo(2.25f)
                horizontalLineTo(3.242f)
                verticalLineTo(-0.75f)
                close()
                moveTo(3.992f, 3f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                horizontalLineTo(3.992f)
                verticalLineTo(7f)
                horizontalLineTo(4.992f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(4.992f)
                verticalLineTo(0f)
                horizontalLineTo(3.992f)
                verticalLineTo(3f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SouthGeorgiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SouthGeorgia,
            contentDescription = "South Georgia Flag"
        )
    }
}
