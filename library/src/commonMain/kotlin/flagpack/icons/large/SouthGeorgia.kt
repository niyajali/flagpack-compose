package flagpack.icons.large

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
 * South Georgia Flag (32x24dp)
 *
 * - ISO Alpha-2: GS
 * - ISO Alpha-3: SGS
 * - ISO Numeric: 239
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SouthGeorgia: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Georgia:GS:SGS:239:Large",
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
                fill = SolidColor(Color(0xFF2B409A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0.1f)
                horizontalLineTo(32f)
                verticalLineTo(24.1f)
                horizontalLineTo(0f)
                verticalLineTo(0.1f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-2.004f, 13f)
                lineTo(1.957f, 14.737f)
                lineTo(18.09f, 1.889f)
                lineTo(20.179f, -0.693f)
                lineTo(15.943f, -1.273f)
                lineTo(9.363f, 4.263f)
                lineTo(4.067f, 7.994f)
                lineTo(-2.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.462f, 14.217f)
                lineTo(0.556f, 15.225f)
                lineTo(19.429f, -0.933f)
                horizontalLineTo(16.596f)
                lineTo(-1.462f, 14.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(20.004f, 13f)
                lineTo(16.043f, 14.737f)
                lineTo(-0.09f, 1.889f)
                lineTo(-2.179f, -0.693f)
                lineTo(2.056f, -1.273f)
                lineTo(8.637f, 4.263f)
                lineTo(13.933f, 7.994f)
                lineTo(20.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(19.869f, 13.873f)
                lineTo(17.851f, 14.882f)
                lineTo(9.815f, 7.964f)
                lineTo(7.432f, 7.191f)
                lineTo(-2.38f, -0.684f)
                horizontalLineTo(0.453f)
                lineTo(10.26f, 7.004f)
                lineTo(12.865f, 7.931f)
                lineTo(19.869f, 13.873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.985f, 0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.485f, 0f)
                horizontalLineTo(11.484f)
                verticalLineTo(4.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.484f)
                lineTo(11.5f, 14f)
                horizontalLineTo(6.5f)
                lineTo(6.485f, 9.5f)
                horizontalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.485f)
                verticalLineTo(0f)
                close()
                moveTo(7.985f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFF6A4C2D))) {
            moveTo(24.318f, 18.551f)
            curveTo(24.257f, 18.551f, 24.034f, 18.431f, 24.034f, 18.431f)
            curveTo(24.034f, 18.431f, 23.872f, 18.687f, 23.788f, 18.702f)
            curveTo(23.703f, 18.717f, 23.265f, 18.544f, 23.265f, 18.544f)
            curveTo(23.265f, 18.544f, 22.957f, 18.784f, 22.888f, 18.769f)
            curveTo(22.819f, 18.755f, 22.111f, 18.604f, 22.111f, 18.604f)
            lineTo(21.727f, 18.364f)
            curveTo(21.727f, 18.364f, 21.511f, 18.709f, 21.504f, 18.702f)
            curveTo(21.496f, 18.694f, 20.858f, 18.574f, 20.858f, 18.574f)
            curveTo(20.858f, 18.574f, 21.05f, 18.311f, 21.05f, 18.304f)
            curveTo(21.05f, 18.296f, 20.958f, 18.266f, 20.958f, 18.266f)
            lineTo(20.819f, 18.379f)
            lineTo(20.25f, 18.431f)
            lineTo(20.389f, 18.041f)
            lineTo(20.612f, 17.71f)
            lineTo(23.341f, 15.118f)
            lineTo(24.687f, 17.545f)
            lineTo(24.487f, 18.274f)
            curveTo(24.487f, 18.274f, 24.379f, 18.551f, 24.318f, 18.551f)
            close()
        }
        path(
            stroke = SolidColor(Color(0xFFFFBB00)),
            strokeLineWidth = 0.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(21.711f, 18.061f)
            curveTo(21.806f, 18.176f, 23.058f, 19.456f, 23.261f, 20.062f)
            curveTo(23.464f, 20.667f, 21.614f, 19.894f, 21.614f, 19.894f)
            curveTo(21.614f, 19.894f, 23.944f, 18.381f, 25.107f, 18.381f)
            curveTo(26.271f, 18.381f, 28.558f, 19.894f, 28.558f, 19.894f)
            curveTo(28.558f, 19.894f, 27.023f, 20.975f, 27.039f, 20.293f)
            curveTo(27.055f, 19.612f, 27.76f, 18.269f, 28.601f, 18.061f)
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(29.542f, 18.16f)
            lineTo(29.159f, 18.017f)
            lineTo(28.82f, 17.569f)
            lineTo(27.417f, 17.466f)
            lineTo(26.139f, 17.117f)
            lineTo(25.599f, 17.476f)
            lineTo(25.89f, 17.856f)
            lineTo(26.599f, 18.117f)
            lineTo(29.542f, 18.16f)
            close()
        }
        path(fill = SolidColor(Color(0xFF656263))) {
            moveTo(23.939f, 9.866f)
            curveTo(23.952f, 9.899f, 24.238f, 9.841f, 24.299f, 10.012f)
            curveTo(24.607f, 9.557f, 24.968f, 9.991f, 24.968f, 9.991f)
            lineTo(25.272f, 9.631f)
            lineTo(25.615f, 9.956f)
            lineTo(25.93f, 9.932f)
            lineTo(26.26f, 10.704f)
            lineTo(23.662f, 10.656f)
            curveTo(23.662f, 10.656f, 23.926f, 9.833f, 23.939f, 9.866f)
            close()
        }
        path(fill = SolidColor(Color(0xFF656263))) {
            moveTo(26.632f, 13.154f)
            curveTo(26.611f, 12.909f, 26.394f, 12.881f, 26.273f, 12.889f)
            curveTo(26.152f, 12.897f, 26.043f, 12.999f, 26.043f, 12.999f)
            lineTo(25.642f, 12.75f)
            curveTo(25.642f, 12.75f, 25.843f, 11.514f, 26.056f, 11.437f)
            curveTo(26.258f, 11.295f, 26.293f, 11.233f, 26.293f, 11.201f)
            curveTo(26.293f, 11.168f, 26.218f, 11.036f, 26.218f, 11.036f)
            lineTo(24.912f, 10.885f)
            lineTo(23.677f, 11.027f)
            curveTo(23.677f, 11.027f, 23.581f, 11.221f, 23.594f, 11.278f)
            curveTo(23.606f, 11.335f, 23.61f, 11.396f, 23.831f, 11.564f)
            curveTo(24.076f, 11.748f, 24.244f, 12.803f, 24.244f, 12.803f)
            curveTo(24.244f, 12.803f, 23.898f, 12.97f, 23.877f, 12.95f)
            curveTo(23.856f, 12.93f, 23.752f, 12.909f, 23.698f, 12.917f)
            curveTo(23.644f, 12.926f, 23.464f, 13.015f, 23.464f, 13.248f)
            curveTo(23.464f, 13.48f, 23.644f, 13.615f, 23.644f, 13.615f)
            curveTo(23.644f, 13.615f, 24.824f, 14.48f, 25f, 14.798f)
            curveTo(25.171f, 14.415f, 26.293f, 13.55f, 26.427f, 13.484f)
            curveTo(26.481f, 13.452f, 26.652f, 13.399f, 26.632f, 13.154f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.81f, 12.002f)
            curveTo(27.908f, 11.938f, 28.562f, 11.906f, 28.719f, 12.002f)
            curveTo(28.875f, 12.097f, 28.934f, 12.57f, 28.934f, 12.57f)
            curveTo(28.934f, 12.57f, 29.032f, 12.736f, 29.039f, 12.857f)
            curveTo(29.045f, 12.979f, 29.059f, 13.062f, 29.059f, 13.062f)
            curveTo(29.059f, 13.062f, 29.581f, 13.726f, 29.588f, 14.326f)
            curveTo(29.647f, 14.735f, 29.633f, 15.827f, 29.47f, 16.242f)
            curveTo(29.464f, 16.76f, 29.242f, 17.098f, 29.242f, 17.098f)
            curveTo(29.242f, 17.098f, 29.294f, 17.187f, 29.287f, 17.283f)
            curveTo(29.281f, 17.379f, 29.228f, 17.469f, 29.228f, 17.469f)
            lineTo(28.738f, 17.679f)
            lineTo(28.196f, 17.59f)
            lineTo(27.581f, 15.795f)
            lineTo(27.725f, 12.762f)
            lineTo(27.764f, 12.608f)
            lineTo(27.699f, 12.2f)
            curveTo(27.699f, 12.2f, 27.712f, 12.065f, 27.81f, 12.002f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(24.262f, 13.594f)
            curveTo(24.262f, 13.594f, 24.923f, 13.594f, 24.995f, 13.804f)
            curveTo(25.12f, 13.524f, 25.692f, 13.542f, 25.692f, 13.542f)
            curveTo(26.037f, 13.53f, 26.383f, 13.519f, 26.728f, 13.507f)
            curveTo(26.734f, 14.322f, 26.74f, 15.137f, 26.746f, 15.952f)
            curveTo(26.544f, 16.901f, 25.841f, 17.57f, 25.066f, 17.856f)
            curveTo(24.143f, 17.565f, 23.559f, 16.802f, 23.369f, 15.934f)
            curveTo(23.333f, 15.16f, 23.297f, 14.386f, 23.261f, 13.612f)
            curveTo(23.595f, 13.606f, 23.928f, 13.6f, 24.262f, 13.594f)
            close()
        }
        path(fill = SolidColor(Color(0xFF006B00))) {
            moveTo(23.618f, 13.603f)
            lineTo(25.076f, 17.399f)
            lineTo(26.392f, 13.52f)
            curveTo(25.984f, 13.546f, 25.107f, 13.457f, 24.999f, 13.821f)
            curveTo(24.83f, 13.495f, 23.908f, 13.627f, 23.618f, 13.603f)
            verticalLineTo(13.603f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD100)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(25.308f, 14.198f)
            curveTo(25.308f, 14.198f, 25.44f, 14.544f, 25.308f, 14.715f)
            curveTo(25.175f, 14.886f, 25.319f, 15.027f, 25.399f, 15.027f)
            curveTo(25.478f, 15.027f, 25.753f, 15.299f, 25.53f, 15.299f)
            curveTo(25.308f, 15.299f, 25.182f, 15.214f, 25.182f, 15.453f)
            curveTo(25.182f, 15.692f, 25.489f, 16.768f, 25.399f, 17.026f)
            curveTo(25.308f, 17.284f, 25.33f, 17.482f, 25.461f, 17.416f)
            curveTo(25.591f, 17.351f, 25.673f, 17.182f, 25.601f, 16.857f)
            curveTo(25.53f, 16.533f, 25.461f, 16.609f, 25.461f, 16.329f)
            curveTo(25.461f, 16.048f, 25.53f, 15.736f, 25.53f, 15.736f)
            curveTo(25.53f, 15.736f, 25.647f, 15.823f, 25.564f, 16.144f)
            curveTo(25.481f, 16.464f, 25.667f, 16.906f, 25.667f, 17.026f)
            curveTo(25.667f, 17.146f, 25.673f, 17.477f, 25.601f, 17.51f)
            curveTo(25.53f, 17.543f, 25.465f, 17.742f, 25.399f, 17.59f)
            curveTo(25.332f, 17.438f, 25.29f, 17.187f, 25.205f, 17.36f)
            curveTo(25.12f, 17.532f, 25.137f, 17.93f, 25.048f, 17.949f)
            curveTo(24.96f, 17.968f, 24.827f, 18.156f, 24.827f, 18.08f)
            curveTo(24.827f, 18.005f, 24.703f, 17.868f, 24.741f, 17.741f)
            curveTo(24.779f, 17.614f, 24.812f, 17.599f, 24.843f, 17.721f)
            curveTo(24.874f, 17.843f, 25.003f, 17.842f, 25.003f, 17.741f)
            curveTo(25.003f, 17.641f, 24.958f, 17.69f, 25.003f, 17.461f)
            curveTo(25.048f, 17.232f, 25.098f, 16.929f, 25.003f, 16.947f)
            curveTo(24.907f, 16.965f, 24.76f, 17.114f, 24.741f, 16.839f)
            curveTo(24.721f, 16.564f, 24.643f, 16.436f, 24.706f, 16.382f)
            curveTo(24.769f, 16.329f, 24.854f, 16.137f, 24.881f, 16.288f)
            curveTo(24.908f, 16.438f, 24.789f, 16.582f, 24.808f, 16.636f)
            curveTo(24.827f, 16.69f, 24.838f, 16.813f, 24.921f, 16.71f)
            curveTo(25.003f, 16.607f, 25.051f, 16.438f, 25.113f, 16.595f)
            curveTo(25.174f, 16.752f, 25.176f, 16.628f, 25.048f, 16.329f)
            curveTo(24.921f, 16.029f, 24.812f, 15.863f, 24.827f, 15.599f)
            curveTo(24.843f, 15.337f, 24.822f, 15.238f, 24.843f, 15.153f)
            curveTo(24.864f, 15.069f, 24.614f, 14.657f, 24.677f, 14.539f)
            curveTo(24.741f, 14.42f, 24.765f, 14.038f, 24.843f, 14.106f)
            curveTo(24.921f, 14.175f, 24.961f, 14.268f, 24.921f, 14.371f)
            curveTo(24.881f, 14.474f, 24.84f, 14.576f, 24.881f, 14.646f)
            curveTo(24.921f, 14.715f, 25.058f, 14.916f, 25.085f, 14.865f)
            curveTo(25.113f, 14.815f, 25.205f, 14.864f, 25.205f, 14.578f)
            curveTo(25.205f, 14.292f, 25.102f, 14.192f, 25.167f, 14.124f)
            curveTo(25.232f, 14.056f, 25.308f, 14.198f, 25.308f, 14.198f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1E5AA6))) {
            moveTo(26.401f, 13.521f)
            lineTo(26.597f, 13.516f)
            lineTo(26.246f, 13.95f)
            lineTo(26.667f, 14.431f)
            lineTo(25.839f, 15.451f)
            lineTo(26.621f, 16.37f)
            curveTo(26.535f, 16.576f, 26.435f, 16.764f, 26.302f, 16.933f)
            lineTo(25.853f, 16.448f)
            lineTo(26.667f, 15.456f)
            lineTo(25.998f, 14.715f)
            lineTo(26.401f, 13.521f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1E5AA6))) {
            moveTo(23.381f, 13.612f)
            lineTo(23.775f, 14.028f)
            lineTo(23.358f, 14.536f)
            lineTo(24.224f, 15.456f)
            lineTo(23.508f, 16.393f)
            curveTo(23.594f, 16.599f, 23.717f, 16.828f, 23.85f, 16.997f)
            lineTo(24.276f, 16.471f)
            lineTo(23.4f, 15.519f)
            lineTo(24.042f, 14.724f)
            lineTo(23.592f, 13.607f)
            lineTo(23.381f, 13.612f)
            close()
        }
        path(fill = SolidColor(Color(0xFF1E5AA6))) {
            moveTo(24.566f, 16.077f)
            lineTo(24.257f, 16.48f)
            lineTo(25.362f, 17.729f)
            curveTo(25.557f, 17.633f, 25.71f, 17.523f, 25.877f, 17.391f)
            lineTo(25.301f, 16.741f)
            lineTo(25.535f, 16.068f)
            lineTo(25.872f, 16.448f)
            lineTo(24.819f, 17.761f)
            curveTo(24.642f, 17.688f, 24.447f, 17.573f, 24.271f, 17.431f)
            lineTo(24.828f, 16.741f)
            lineTo(24.566f, 16.077f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFD5DFFF),
                    1f to Color.White
                ),
                start = Offset(28.275f, 15.607f),
                end = Offset(29.018f, 15.599f)
            )
        ) {
            moveTo(28.385f, 12.851f)
            curveTo(28.385f, 12.915f, 28.455f, 16.683f, 28.531f, 16.647f)
            curveTo(28.721f, 16.558f, 28.764f, 16.753f, 28.764f, 16.753f)
            curveTo(28.764f, 16.753f, 28.83f, 17.373f, 28.666f, 17.456f)
            curveTo(28.372f, 17.609f, 28.244f, 17.643f, 28.244f, 17.643f)
            lineTo(27.961f, 17.437f)
            curveTo(27.961f, 17.437f, 27.673f, 17.034f, 27.608f, 16.855f)
            curveTo(27.542f, 16.677f, 27.464f, 15.878f, 27.49f, 15.706f)
            curveTo(27.516f, 15.534f, 27.536f, 14.524f, 27.523f, 14.473f)
            curveTo(27.51f, 14.422f, 27.458f, 13.579f, 27.49f, 13.451f)
            curveTo(27.523f, 13.324f, 27.725f, 12.762f, 27.719f, 12.762f)
            curveTo(27.719f, 12.762f, 28.385f, 12.787f, 28.385f, 12.851f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFF7000))) {
            moveTo(27.732f, 12.206f)
            curveTo(27.869f, 12.206f, 27.973f, 12.321f, 28.006f, 12.423f)
            curveTo(28.013f, 12.468f, 27.993f, 12.5f, 28f, 12.583f)
            curveTo(28.006f, 12.666f, 27.006f, 12.602f, 27f, 12.595f)
            curveTo(27f, 12.595f, 27.464f, 12.155f, 27.732f, 12.206f)
            close()
        }
        path(
            fill = SolidColor(Color.White),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 0.5f,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(28.83f, 17.667f)
            curveTo(28.83f, 17.667f, 29.144f, 17.596f, 29.229f, 17.488f)
            curveTo(29.281f, 17.449f, 29.555f, 17.89f, 28.83f, 17.667f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(28.309f, 12.46f)
            curveTo(28.309f, 12.488f, 28.287f, 12.51f, 28.259f, 12.51f)
            curveTo(28.231f, 12.51f, 28.209f, 12.488f, 28.209f, 12.46f)
            curveTo(28.209f, 12.433f, 28.231f, 12.41f, 28.259f, 12.41f)
            curveTo(28.287f, 12.41f, 28.309f, 12.433f, 28.309f, 12.46f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(25.821f, 11.909f)
            curveTo(25.821f, 11.909f, 26.341f, 12.459f, 26.678f, 12.453f)
            curveTo(26.739f, 12.615f, 26.525f, 12.765f, 26.44f, 12.837f)
            curveTo(26.268f, 12.783f, 26.113f, 12.847f, 25.715f, 12.368f)
            curveTo(25.74f, 12.063f, 25.827f, 11.921f, 25.821f, 11.909f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(27.891f, 9.138f)
            curveTo(27.94f, 9.491f, 27.888f, 9.573f, 27.865f, 9.721f)
            curveTo(27.842f, 9.87f, 28.769f, 9.924f, 29.008f, 9.631f)
            curveTo(28.983f, 9.763f, 28.705f, 10.299f, 27.443f, 10.293f)
            curveTo(27.921f, 10.736f, 27.291f, 11.089f, 27.021f, 10.981f)
            curveTo(27.517f, 10.61f, 26.88f, 10.389f, 26.525f, 10.628f)
            curveTo(26.592f, 10.425f, 27.088f, 9.402f, 27.891f, 9.138f)
            close()
        }
        path(
            fill = SolidColor(Color.Blue),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(27.05f, 11.617f)
            curveTo(26.956f, 11.228f, 26.91f, 10.781f, 27.119f, 10.61f)
            curveTo(26.843f, 10.425f, 26.543f, 10.616f, 26.543f, 10.616f)
            curveTo(26.541f, 10.621f, 26.536f, 10.629f, 26.528f, 10.64f)
            curveTo(26.464f, 10.728f, 26.249f, 11.024f, 26.543f, 11.556f)
            curveTo(25.76f, 11.353f, 26.087f, 12.064f, 26.145f, 12.118f)
            curveTo(26.176f, 12.004f, 26.592f, 11.897f, 26.697f, 12.477f)
            curveTo(26.732f, 12.595f, 26.521f, 12.764f, 26.453f, 12.819f)
            curveTo(26.438f, 12.831f, 26.43f, 12.837f, 26.433f, 12.836f)
            curveTo(26.433f, 12.836f, 27.096f, 12.971f, 27.182f, 12.095f)
            curveTo(27.296f, 12.027f, 27.846f, 11.66f, 27.829f, 10.904f)
            curveTo(27.324f, 10.914f, 27.1f, 11.471f, 27.05f, 11.617f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(24.088f, 12.064f)
            curveTo(24.088f, 12.064f, 23.58f, 12.495f, 23.292f, 12.358f)
            curveTo(23.077f, 12.483f, 22.826f, 12.262f, 22.826f, 12.262f)
            curveTo(22.826f, 12.262f, 23.12f, 13.321f, 24.174f, 12.555f)
            curveTo(24.155f, 12.322f, 24.1f, 12.082f, 24.088f, 12.064f)
            close()
        }
        path(fill = SolidColor(Color.Blue)) {
            moveTo(23.285f, 12.34f)
            curveTo(23.328f, 12.118f, 23.506f, 12.01f, 23.647f, 12.22f)
            curveTo(23.837f, 12.256f, 24.027f, 11.496f, 23.353f, 11.621f)
            curveTo(23.542f, 10.628f, 22.973f, 10.257f, 22.973f, 10.257f)
            curveTo(22.973f, 10.257f, 22.771f, 11.358f, 22.863f, 11.562f)
            curveTo(22.955f, 11.765f, 22.728f, 11.185f, 22f, 11.023f)
            curveTo(21.987f, 11.855f, 22.814f, 12.244f, 22.814f, 12.244f)
            curveTo(22.814f, 12.244f, 23.047f, 12.453f, 23.285f, 12.34f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(22.597f, 11.139f)
            curveTo(22.382f, 11.205f, 21.861f, 10.89f, 22.192f, 10.483f)
            curveTo(21.108f, 10.459f, 20.518f, 9.544f, 20.879f, 9.718f)
            curveTo(21.24f, 9.893f, 21.498f, 9.521f, 21.768f, 9.718f)
            curveTo(21.437f, 9.419f, 21.883f, 9.18f, 21.883f, 9.18f)
            curveTo(21.883f, 9.18f, 22.808f, 9.449f, 22.973f, 10.251f)
            curveTo(22.918f, 10.407f, 22.894f, 10.682f, 22.881f, 10.67f)
            curveTo(22.881f, 10.664f, 22.309f, 10.66f, 22.597f, 11.139f)
            close()
        }
        path(fill = SolidColor(Color(0xFFCDAD56))) {
            moveTo(24.327f, 7.431f)
            curveTo(24.332f, 7.404f, 25.025f, 7.166f, 25.071f, 6.773f)
            curveTo(25.118f, 6.379f, 25.062f, 6.644f, 25.062f, 6.644f)
            curveTo(25.062f, 6.644f, 25.254f, 6.466f, 25.184f, 6.37f)
            curveTo(25.113f, 6.274f, 25.137f, 6.494f, 25.025f, 6.489f)
            curveTo(24.912f, 6.484f, 24.973f, 6.251f, 24.973f, 6.251f)
            curveTo(24.973f, 6.251f, 24.964f, 6.224f, 24.931f, 6.21f)
            curveTo(24.884f, 6.214f, 24.777f, 6.114f, 24.777f, 6.114f)
            curveTo(24.777f, 6.114f, 24.706f, 6.022f, 24.645f, 6.311f)
            curveTo(24.678f, 6.617f, 24.879f, 6.558f, 24.879f, 6.759f)
            curveTo(24.879f, 6.96f, 24.702f, 7.116f, 24.65f, 7.12f)
            curveTo(24.599f, 7.125f, 24.617f, 6.951f, 24.617f, 6.951f)
            curveTo(24.617f, 6.951f, 24.589f, 6.869f, 24.571f, 6.869f)
            curveTo(24.552f, 6.869f, 24.674f, 6.85f, 24.655f, 6.622f)
            curveTo(24.613f, 6.347f, 24.58f, 6.686f, 24.505f, 6.672f)
            curveTo(24.43f, 6.658f, 24.486f, 6.42f, 24.514f, 6.393f)
            curveTo(24.542f, 6.365f, 24.482f, 6.251f, 24.318f, 6.544f)
            curveTo(24.304f, 6.686f, 24.285f, 6.507f, 24.252f, 6.516f)
            curveTo(24.196f, 6.631f, 24.205f, 6.713f, 24.285f, 6.818f)
            curveTo(24.402f, 6.923f, 24.477f, 7.029f, 24.472f, 7.084f)
            curveTo(24.468f, 7.138f, 24.406f, 7.262f, 24.323f, 7.262f)
            curveTo(24.238f, 7.262f, 24.327f, 7.111f, 24.323f, 7.061f)
            curveTo(24.318f, 7.01f, 24.177f, 6.827f, 24.177f, 6.827f)
            curveTo(24.177f, 6.827f, 24.079f, 6.672f, 24.088f, 6.667f)
            curveTo(24.098f, 6.663f, 23.864f, 6.891f, 24.004f, 7.01f)
            curveTo(23.896f, 6.997f, 23.887f, 7.038f, 23.887f, 7.038f)
            curveTo(23.887f, 7.093f, 24.032f, 7.116f, 24.051f, 7.212f)
            curveTo(24.07f, 7.308f, 23.901f, 7.363f, 23.901f, 7.363f)
            curveTo(23.901f, 7.363f, 23.972f, 7.459f, 24.168f, 7.271f)
            curveTo(24.173f, 7.39f, 24.093f, 7.472f, 24.093f, 7.472f)
            curveTo(24.159f, 7.501f, 24.21f, 7.498f, 24.219f, 7.573f)
            curveTo(24.219f, 7.573f, 24.323f, 7.459f, 24.327f, 7.431f)
            close()
        }
        path(fill = SolidColor(Color(0xFFCDAD56))) {
            moveTo(23.577f, 7.573f)
            curveTo(23.577f, 7.573f, 23.49f, 7.446f, 23.486f, 7.421f)
            curveTo(23.482f, 7.396f, 23.055f, 7.453f, 22.854f, 6.945f)
            curveTo(22.722f, 6.703f, 22.854f, 6.845f, 22.854f, 6.845f)
            lineTo(22.861f, 6.728f)
            curveTo(22.861f, 6.728f, 22.722f, 6.561f, 22.781f, 6.474f)
            curveTo(22.841f, 6.386f, 22.816f, 6.586f, 22.893f, 6.587f)
            curveTo(22.989f, 6.582f, 22.937f, 6.37f, 22.937f, 6.37f)
            curveTo(22.937f, 6.37f, 22.945f, 6.345f, 22.973f, 6.333f)
            curveTo(23.012f, 6.337f, 23.029f, 6.462f, 23.065f, 6.47f)
            curveTo(23.1f, 6.479f, 23.174f, 6.323f, 23.197f, 6.291f)
            curveTo(23.23f, 6.286f, 23.229f, 6.162f, 23.281f, 6.424f)
            curveTo(23.253f, 6.703f, 23.017f, 6.649f, 23.017f, 6.832f)
            curveTo(23.017f, 7.015f, 23.167f, 7.157f, 23.211f, 7.161f)
            curveTo(23.255f, 7.165f, 23.239f, 7.007f, 23.239f, 7.007f)
            curveTo(23.239f, 7.007f, 23.263f, 6.932f, 23.279f, 6.932f)
            curveTo(23.295f, 6.932f, 23.14f, 6.961f, 23.156f, 6.753f)
            curveTo(23.192f, 6.558f, 23.271f, 6.766f, 23.334f, 6.753f)
            curveTo(23.398f, 6.741f, 23.327f, 6.547f, 23.345f, 6.517f)
            curveTo(23.35f, 6.488f, 23.443f, 6.361f, 23.479f, 6.641f)
            curveTo(23.491f, 6.77f, 23.563f, 6.53f, 23.591f, 6.538f)
            curveTo(23.639f, 6.642f, 23.57f, 6.781f, 23.503f, 6.877f)
            curveTo(23.403f, 6.973f, 23.358f, 7.078f, 23.362f, 7.128f)
            curveTo(23.366f, 7.178f, 23.39f, 7.24f, 23.462f, 7.24f)
            curveTo(23.533f, 7.24f, 23.486f, 7.153f, 23.49f, 7.107f)
            curveTo(23.493f, 7.061f, 23.613f, 6.913f, 23.613f, 6.913f)
            curveTo(23.636f, 6.876f, 23.617f, 6.808f, 23.641f, 6.776f)
            curveTo(23.68f, 6.777f, 23.696f, 6.724f, 23.736f, 6.87f)
            curveTo(23.776f, 7.015f, 23.823f, 6.774f, 23.823f, 6.774f)
            curveTo(23.823f, 6.774f, 23.879f, 6.953f, 23.76f, 7.061f)
            curveTo(23.851f, 7.049f, 23.859f, 7.086f, 23.859f, 7.086f)
            curveTo(23.859f, 7.136f, 23.816f, 7.157f, 23.8f, 7.244f)
            curveTo(23.784f, 7.332f, 23.847f, 7.382f, 23.847f, 7.382f)
            curveTo(23.847f, 7.382f, 23.788f, 7.469f, 23.621f, 7.298f)
            curveTo(23.617f, 7.407f, 23.684f, 7.481f, 23.684f, 7.481f)
            curveTo(23.628f, 7.508f, 23.585f, 7.505f, 23.577f, 7.573f)
            close()
        }
        path(fill = SolidColor(Color(0xFF923F00))) {
            moveTo(24.676f, 7.475f)
            curveTo(24.573f, 7.773f, 24.204f, 7.66f, 24.204f, 7.66f)
            curveTo(24.204f, 7.66f, 24.216f, 7.81f, 24.18f, 7.881f)
            curveTo(24.21f, 7.904f, 24.428f, 8.072f, 24.657f, 8.115f)
            curveTo(24.987f, 8.177f, 25.661f, 8.007f, 25.888f, 8.258f)
            curveTo(26.114f, 8.51f, 26.103f, 8.713f, 26.103f, 8.713f)
            curveTo(26.103f, 8.713f, 25.808f, 8.747f, 25.89f, 8.851f)
            curveTo(25.943f, 8.918f, 26.09f, 8.968f, 26.103f, 9.038f)
            curveTo(26.144f, 9.26f, 25.964f, 9.659f, 26.029f, 9.808f)
            curveTo(25.927f, 9.818f, 25.919f, 9.922f, 25.919f, 9.922f)
            curveTo(25.913f, 10.04f, 25.619f, 9.97f, 25.619f, 9.97f)
            curveTo(25.619f, 9.97f, 25.802f, 9.509f, 25.815f, 9.402f)
            curveTo(25.827f, 9.294f, 25.686f, 9.102f, 25.576f, 9.102f)
            curveTo(25.465f, 9.102f, 25.386f, 9.443f, 25.386f, 9.443f)
            curveTo(25.386f, 9.443f, 25.331f, 9.701f, 25.349f, 9.724f)
            curveTo(25.368f, 9.748f, 25.276f, 9.641f, 25.276f, 9.641f)
            curveTo(25.276f, 9.641f, 25.247f, 9.745f, 25.199f, 9.808f)
            curveTo(25.146f, 9.879f, 25.073f, 9.91f, 25.073f, 9.91f)
            curveTo(25.073f, 9.91f, 25.018f, 9.754f, 25.037f, 9.695f)
            curveTo(25.055f, 9.635f, 25.337f, 9.402f, 25.313f, 9.234f)
            curveTo(25.302f, 9.16f, 25.292f, 9.031f, 25.199f, 8.988f)
            curveTo(25.082f, 8.934f, 24.867f, 8.973f, 24.737f, 8.947f)
            curveTo(24.666f, 9.068f, 24.633f, 9.736f, 24.682f, 9.779f)
            curveTo(24.731f, 9.82f, 24.559f, 9.91f, 24.559f, 9.91f)
            lineTo(24.357f, 9.916f)
            curveTo(24.354f, 9.825f, 24.476f, 9.578f, 24.476f, 9.369f)
            curveTo(24.476f, 9.159f, 24.492f, 8.935f, 24.492f, 8.935f)
            curveTo(24.492f, 8.935f, 24.356f, 8.969f, 24.284f, 9.102f)
            curveTo(24.223f, 9.214f, 24.223f, 9.425f, 24.229f, 9.455f)
            curveTo(24.241f, 9.521f, 24.302f, 9.707f, 24.284f, 9.761f)
            curveTo(24.265f, 9.814f, 23.947f, 9.886f, 23.947f, 9.886f)
            lineTo(23.934f, 9.712f)
            curveTo(23.934f, 9.712f, 24.069f, 9.629f, 24.069f, 9.419f)
            curveTo(24.069f, 9.21f, 24.081f, 8.911f, 24.075f, 8.893f)
            curveTo(24.072f, 8.882f, 23.965f, 8.424f, 23.825f, 8.115f)
            curveTo(23.731f, 7.909f, 23.587f, 7.814f, 23.58f, 7.798f)
            curveTo(23.561f, 7.756f, 23.561f, 7.708f, 23.561f, 7.708f)
            curveTo(23.561f, 7.708f, 23.359f, 7.852f, 23.12f, 7.546f)
            curveTo(23.339f, 7.364f, 23.573f, 7.498f, 23.573f, 7.498f)
            curveTo(23.573f, 7.498f, 23.635f, 7.331f, 23.916f, 7.343f)
            curveTo(24.198f, 7.355f, 24.253f, 7.51f, 24.241f, 7.492f)
            curveTo(24.241f, 7.492f, 24.449f, 7.313f, 24.676f, 7.475f)
            close()
        }
        path(fill = SolidColor(Color.Blue)) {
            moveTo(25.781f, 10.588f)
            curveTo(25.786f, 10.588f, 26.301f, 10.603f, 26.307f, 10.872f)
            curveTo(26.312f, 11.141f, 26.149f, 11.071f, 26.143f, 11.071f)
            curveTo(26.138f, 11.071f, 25.766f, 11.026f, 25.766f, 11.026f)
            lineTo(25.781f, 10.588f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(25.281f, 10.513f)
            curveTo(25.281f, 10.513f, 25.924f, 10.508f, 25.888f, 10.782f)
            curveTo(25.853f, 11.056f, 25.689f, 11.002f, 25.689f, 11.002f)
            lineTo(25.378f, 10.976f)
            lineTo(25.281f, 10.513f)
            close()
        }
        path(fill = SolidColor(Color.Blue)) {
            moveTo(24.92f, 10.483f)
            lineTo(25.292f, 10.513f)
            curveTo(25.292f, 10.513f, 25.516f, 10.543f, 25.506f, 10.752f)
            curveTo(25.496f, 10.962f, 25.276f, 10.967f, 25.276f, 10.967f)
            lineTo(24.914f, 10.947f)
            lineTo(24.92f, 10.483f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(24.047f, 10.588f)
            curveTo(24.042f, 10.588f, 23.527f, 10.603f, 23.522f, 10.872f)
            curveTo(23.517f, 11.141f, 23.68f, 11.071f, 23.685f, 11.071f)
            curveTo(23.691f, 11.071f, 24.063f, 11.026f, 24.063f, 11.026f)
            lineTo(24.047f, 10.588f)
            close()
        }
        path(fill = SolidColor(Color.Blue)) {
            moveTo(24.547f, 10.513f)
            curveTo(24.547f, 10.513f, 23.905f, 10.508f, 23.94f, 10.782f)
            curveTo(23.976f, 11.056f, 24.139f, 11.002f, 24.139f, 11.002f)
            lineTo(24.45f, 10.976f)
            lineTo(24.547f, 10.513f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF7FCFF))) {
            moveTo(24.909f, 10.483f)
            lineTo(24.537f, 10.513f)
            curveTo(24.537f, 10.513f, 24.313f, 10.543f, 24.323f, 10.752f)
            curveTo(24.333f, 10.962f, 24.552f, 10.967f, 24.552f, 10.967f)
            lineTo(24.914f, 10.947f)
            lineTo(24.909f, 10.483f)
            close()
        }
        path(fill = SolidColor(Color(0xFF5E0043))) {
            moveTo(26.287f, 13.165f)
            curveTo(26.385f, 13.197f, 26.31f, 13.495f, 26.263f, 13.523f)
            lineTo(25.906f, 13.509f)
            curveTo(25.906f, 13.509f, 26.174f, 13.123f, 26.287f, 13.165f)
            close()
        }
        path(fill = SolidColor(Color(0xFF5E0043))) {
            moveTo(24.071f, 13.578f)
            curveTo(23.987f, 13.463f, 23.865f, 13.146f, 23.752f, 13.233f)
            curveTo(23.653f, 13.266f, 23.729f, 13.564f, 23.775f, 13.592f)
            lineTo(24.071f, 13.578f)
            close()
        }
        path(fill = SolidColor(Color(0xFFB4B6B9))) {
            moveTo(23.628f, 11.364f)
            lineTo(24.916f, 12.187f)
            lineTo(26.076f, 11.425f)
            curveTo(26.076f, 11.425f, 26.318f, 11.294f, 26.298f, 11.201f)
            curveTo(26.277f, 11.107f, 26.193f, 11.144f, 26.151f, 11.16f)
            curveTo(26.11f, 11.176f, 24.937f, 11.988f, 24.937f, 11.988f)
            lineTo(23.689f, 11.217f)
            curveTo(23.689f, 11.217f, 23.598f, 11.188f, 23.581f, 11.245f)
            curveTo(23.564f, 11.303f, 23.615f, 11.335f, 23.628f, 11.364f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFF7000))) {
            moveTo(27.947f, 17.427f)
            curveTo(27.947f, 17.427f, 27.384f, 17.597f, 27.541f, 17.602f)
            curveTo(27.657f, 17.606f, 28.216f, 17.602f, 28.216f, 17.602f)
            lineTo(27.947f, 17.427f)
            close()
        }
        path(fill = SolidColor(Color(0xFFFF7000))) {
            moveTo(28.175f, 17.614f)
            lineTo(27.675f, 17.628f)
            curveTo(27.675f, 17.628f, 27.549f, 17.739f, 27.541f, 17.766f)
            curveTo(27.533f, 17.793f, 27.624f, 17.801f, 27.624f, 17.801f)
            curveTo(27.624f, 17.801f, 28.14f, 17.932f, 28.53f, 17.847f)
            curveTo(28.727f, 17.779f, 28.761f, 17.699f, 28.623f, 17.65f)
            curveTo(28.486f, 17.601f, 28.179f, 17.615f, 28.175f, 17.614f)
            close()
        }
        path(fill = SolidColor(Color(0xFF8A9396))) {
            moveTo(22.391f, 12.99f)
            curveTo(22.391f, 12.99f, 22.326f, 13.19f, 22.391f, 13.29f)
            curveTo(22.456f, 13.39f, 22.865f, 14.199f, 22.865f, 14.199f)
            curveTo(22.865f, 14.199f, 23.144f, 13.862f, 23.247f, 13.853f)
            curveTo(23.349f, 13.844f, 23.302f, 14.726f, 23.302f, 14.726f)
            curveTo(23.302f, 14.726f, 23.135f, 14.88f, 23.033f, 14.871f)
            curveTo(22.93f, 14.862f, 23.284f, 15.217f, 23.274f, 15.517f)
            curveTo(23.265f, 15.817f, 22.809f, 17.308f, 22.642f, 17.335f)
            curveTo(22.474f, 17.362f, 22.33f, 17.054f, 22.33f, 16.788f)
            curveTo(22.33f, 16.521f, 22.502f, 16.099f, 22.493f, 15.98f)
            curveTo(22.484f, 15.862f, 21.661f, 17.247f, 21.611f, 17.464f)
            curveTo(21.602f, 17.505f, 21.656f, 17.653f, 21.656f, 17.653f)
            curveTo(21.656f, 17.653f, 21.333f, 17.679f, 21.405f, 18.089f)
            curveTo(20.456f, 17.762f, 19.991f, 17.198f, 20f, 16.626f)
            curveTo(20.004f, 16.406f, 19.795f, 15.89f, 20f, 15.32f)
            curveTo(20.331f, 14.402f, 21.139f, 13.354f, 21.144f, 13.254f)
            curveTo(21.154f, 13.09f, 21.219f, 13.017f, 21.228f, 12.926f)
            curveTo(21.237f, 12.835f, 21.2f, 12.372f, 21.293f, 12.29f)
            curveTo(21.386f, 12.208f, 21.87f, 12.008f, 21.991f, 12.017f)
            curveTo(22.112f, 12.026f, 22.214f, 12.108f, 22.214f, 12.108f)
            curveTo(22.214f, 12.108f, 22.67f, 12.108f, 22.698f, 12.281f)
            curveTo(22.726f, 12.454f, 22.605f, 12.517f, 22.605f, 12.517f)
            curveTo(22.605f, 12.517f, 22.67f, 12.763f, 22.391f, 12.99f)
            close()
        }
        path(fill = SolidColor(Color(0xFF2B2B2B))) {
            moveTo(22.662f, 18.146f)
            curveTo(22.816f, 18.252f, 23.171f, 18.315f, 23.171f, 18.315f)
            curveTo(23.171f, 18.315f, 22.299f, 18.55f, 21.413f, 18.094f)
            curveTo(21.332f, 17.739f, 21.603f, 17.659f, 21.67f, 17.657f)
            curveTo(21.826f, 17.616f, 22.508f, 18.039f, 22.662f, 18.146f)
            close()
        }
        path(fill = SolidColor(Color(0xFF00713D))) {
            moveTo(23.729f, 18.108f)
            curveTo(24.683f, 18.612f, 24.785f, 18.273f, 25.443f, 17.793f)
            curveTo(25.488f, 17.76f, 25.705f, 18.563f, 26.626f, 18.108f)
            curveTo(27.93f, 17.464f, 25.509f, 16.39f, 25.167f, 16.413f)
            curveTo(24.825f, 16.437f, 22.775f, 17.604f, 23.729f, 18.108f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthGeorgiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SouthGeorgia,
            contentDescription = "South Georgia Flag"
        )
    }
}
