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
 * Vanuatu Flag (32x24dp)
 *
 * - ISO Alpha-2: VU
 * - ISO Alpha-3: VUT
 * - ISO Numeric: 548
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Vanuatu: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vanuatu:VU:VUT:548:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -2f)
                lineTo(16.67f, 12f)
                lineTo(0f, 26f)
                verticalLineTo(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -3.355f)
                lineTo(17.408f, 10f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(17.169f)
                lineTo(0f, 26.812f)
                verticalLineTo(22.34f)
                lineTo(14f, 12f)
                lineTo(0f, 1.534f)
                verticalLineTo(-3.355f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-2f, -8.355f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-36f)
                close()
                moveTo(0f, -3.355f)
                lineTo(17.408f, 10f)
                horizontalLineTo(32f)
                verticalLineTo(14f)
                horizontalLineTo(17.169f)
                lineTo(0f, 26.812f)
                verticalLineTo(22.34f)
                lineTo(14f, 12f)
                lineTo(0f, 1.534f)
                verticalLineTo(-3.355f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(17.408f, 10f)
                lineTo(16.191f, 11.587f)
                lineTo(16.729f, 12f)
                horizontalLineTo(17.408f)
                verticalLineTo(10f)
                close()
                moveTo(0f, -3.355f)
                lineTo(1.217f, -4.942f)
                lineTo(-2f, -7.41f)
                verticalLineTo(-3.355f)
                horizontalLineTo(0f)
                close()
                moveTo(32f, 10f)
                horizontalLineTo(34f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(10f)
                close()
                moveTo(32f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(34f)
                verticalLineTo(14f)
                horizontalLineTo(32f)
                close()
                moveTo(17.169f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(16.505f)
                lineTo(15.973f, 12.397f)
                lineTo(17.169f, 14f)
                close()
                moveTo(0f, 26.812f)
                horizontalLineTo(-2f)
                verticalLineTo(30.799f)
                lineTo(1.196f, 28.414f)
                lineTo(0f, 26.812f)
                close()
                moveTo(0f, 22.34f)
                lineTo(-1.188f, 20.731f)
                lineTo(-2f, 21.331f)
                verticalLineTo(22.34f)
                horizontalLineTo(0f)
                close()
                moveTo(14f, 12f)
                lineTo(15.188f, 13.609f)
                lineTo(17.353f, 12.01f)
                lineTo(15.198f, 10.398f)
                lineTo(14f, 12f)
                close()
                moveTo(0f, 1.534f)
                horizontalLineTo(-2f)
                verticalLineTo(2.536f)
                lineTo(-1.197f, 3.136f)
                lineTo(0f, 1.534f)
                close()
                moveTo(18.626f, 8.413f)
                lineTo(1.217f, -4.942f)
                lineTo(-1.217f, -1.768f)
                lineTo(16.191f, 11.587f)
                lineTo(18.626f, 8.413f)
                close()
                moveTo(32f, 8f)
                horizontalLineTo(17.408f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(8f)
                close()
                moveTo(34f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(30f)
                verticalLineTo(14f)
                horizontalLineTo(34f)
                close()
                moveTo(17.169f, 16f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(17.169f)
                verticalLineTo(16f)
                close()
                moveTo(1.196f, 28.414f)
                lineTo(18.365f, 15.603f)
                lineTo(15.973f, 12.397f)
                lineTo(-1.196f, 25.209f)
                lineTo(1.196f, 28.414f)
                close()
                moveTo(-2f, 22.34f)
                verticalLineTo(26.812f)
                horizontalLineTo(2f)
                verticalLineTo(22.34f)
                horizontalLineTo(-2f)
                close()
                moveTo(12.812f, 10.391f)
                lineTo(-1.188f, 20.731f)
                lineTo(1.188f, 23.949f)
                lineTo(15.188f, 13.609f)
                lineTo(12.812f, 10.391f)
                close()
                moveTo(-1.197f, 3.136f)
                lineTo(12.802f, 13.602f)
                lineTo(15.198f, 10.398f)
                lineTo(1.197f, -0.067f)
                lineTo(-1.197f, 3.136f)
                close()
                moveTo(-2f, -3.355f)
                verticalLineTo(1.534f)
                horizontalLineTo(2f)
                verticalLineTo(-3.355f)
                horizontalLineTo(-2f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFFFD018))) {
            moveTo(4.874f, 16.768f)
            lineTo(4.876f, 15.188f)
            curveTo(6.284f, 14.877f, 7.217f, 14.473f, 7.671f, 13.987f)
            curveTo(8.789f, 12.609f, 8.046f, 9.38f, 5.749f, 9.401f)
            curveTo(4.61f, 9.401f, 3.433f, 9.943f, 3.433f, 11.22f)
            curveTo(3.433f, 12.805f, 3.76f, 13.483f, 4.876f, 13.483f)
            curveTo(5.985f, 13.483f, 6.391f, 13.542f, 7.122f, 12.547f)
            lineTo(7.915f, 12.792f)
            curveTo(7.132f, 13.859f, 6.077f, 14.701f, 4.874f, 14.701f)
            curveTo(2.892f, 14.701f, 1.814f, 13.207f, 1.814f, 11.479f)
            curveTo(1.814f, 9.346f, 3.545f, 7.852f, 5.633f, 7.852f)
            curveTo(7.191f, 7.852f, 9.655f, 9.761f, 9.655f, 11.479f)
            curveTo(9.655f, 13.198f, 9.655f, 13.987f, 8.304f, 15.188f)
            curveTo(7.76f, 15.671f, 6.412f, 16.535f, 4.874f, 16.768f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.991f, 9.88f)
            curveTo(4.915f, 9.86f, 4.837f, 9.905f, 4.817f, 9.981f)
            lineTo(4.762f, 10.188f)
            curveTo(4.76f, 10.185f, 4.757f, 10.181f, 4.754f, 10.178f)
            curveTo(4.706f, 10.115f, 4.616f, 10.104f, 4.554f, 10.152f)
            curveTo(4.491f, 10.2f, 4.48f, 10.29f, 4.528f, 10.352f)
            curveTo(4.561f, 10.395f, 4.594f, 10.438f, 4.626f, 10.479f)
            lineTo(4.461f, 10.631f)
            curveTo(4.403f, 10.685f, 4.4f, 10.775f, 4.453f, 10.833f)
            curveTo(4.507f, 10.891f, 4.597f, 10.895f, 4.655f, 10.841f)
            lineTo(4.801f, 10.707f)
            curveTo(4.887f, 10.821f, 4.971f, 10.93f, 5.05f, 11.035f)
            lineTo(4.776f, 11.182f)
            curveTo(4.707f, 11.219f, 4.681f, 11.306f, 4.718f, 11.375f)
            curveTo(4.755f, 11.445f, 4.842f, 11.471f, 4.911f, 11.434f)
            lineTo(5.224f, 11.266f)
            curveTo(5.299f, 11.366f, 5.37f, 11.461f, 5.438f, 11.552f)
            lineTo(5.062f, 11.753f)
            curveTo(4.992f, 11.791f, 4.966f, 11.877f, 5.004f, 11.947f)
            curveTo(5.041f, 12.016f, 5.128f, 12.042f, 5.197f, 12.005f)
            lineTo(5.609f, 11.784f)
            curveTo(5.718f, 11.934f, 5.814f, 12.067f, 5.896f, 12.184f)
            lineTo(5.633f, 12.325f)
            curveTo(5.564f, 12.362f, 5.538f, 12.449f, 5.575f, 12.518f)
            curveTo(5.612f, 12.588f, 5.699f, 12.614f, 5.769f, 12.576f)
            lineTo(6.059f, 12.42f)
            curveTo(6.18f, 12.601f, 6.243f, 12.709f, 6.243f, 12.737f)
            curveTo(6.243f, 12.816f, 6.307f, 12.88f, 6.385f, 12.88f)
            curveTo(6.464f, 12.88f, 6.528f, 12.816f, 6.528f, 12.737f)
            curveTo(6.528f, 12.665f, 6.453f, 12.513f, 6.296f, 12.269f)
            curveTo(6.298f, 12.265f, 6.3f, 12.261f, 6.302f, 12.257f)
            lineTo(6.514f, 11.791f)
            curveTo(6.546f, 11.719f, 6.514f, 11.635f, 6.443f, 11.602f)
            curveTo(6.371f, 11.569f, 6.286f, 11.601f, 6.253f, 11.673f)
            lineTo(6.109f, 11.991f)
            curveTo(6.019f, 11.861f, 5.914f, 11.714f, 5.793f, 11.549f)
            lineTo(5.942f, 11.22f)
            curveTo(5.975f, 11.148f, 5.943f, 11.063f, 5.871f, 11.031f)
            curveTo(5.799f, 10.998f, 5.715f, 11.03f, 5.682f, 11.102f)
            lineTo(5.598f, 11.286f)
            curveTo(5.552f, 11.224f, 5.504f, 11.16f, 5.454f, 11.094f)
            lineTo(5.656f, 10.649f)
            curveTo(5.689f, 10.577f, 5.657f, 10.492f, 5.585f, 10.459f)
            curveTo(5.514f, 10.427f, 5.429f, 10.458f, 5.396f, 10.53f)
            lineTo(5.258f, 10.835f)
            curveTo(5.171f, 10.72f, 5.079f, 10.6f, 4.982f, 10.474f)
            lineTo(5.093f, 10.054f)
            curveTo(5.113f, 9.978f, 5.068f, 9.9f, 4.991f, 9.88f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFFD018)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.952f, 9.88f)
            curveTo(6.028f, 9.86f, 6.107f, 9.905f, 6.127f, 9.981f)
            lineTo(6.181f, 10.188f)
            curveTo(6.184f, 10.185f, 6.187f, 10.181f, 6.19f, 10.178f)
            curveTo(6.238f, 10.115f, 6.328f, 10.104f, 6.39f, 10.152f)
            curveTo(6.452f, 10.2f, 6.464f, 10.29f, 6.416f, 10.352f)
            curveTo(6.383f, 10.395f, 6.35f, 10.438f, 6.318f, 10.479f)
            lineTo(6.482f, 10.631f)
            curveTo(6.54f, 10.685f, 6.544f, 10.775f, 6.49f, 10.833f)
            curveTo(6.437f, 10.891f, 6.347f, 10.895f, 6.289f, 10.841f)
            lineTo(6.143f, 10.707f)
            curveTo(6.056f, 10.821f, 5.973f, 10.93f, 5.893f, 11.035f)
            lineTo(6.167f, 11.182f)
            curveTo(6.237f, 11.219f, 6.263f, 11.306f, 6.226f, 11.375f)
            curveTo(6.188f, 11.445f, 6.102f, 11.471f, 6.032f, 11.434f)
            lineTo(5.719f, 11.266f)
            curveTo(5.644f, 11.366f, 5.573f, 11.461f, 5.506f, 11.552f)
            lineTo(5.882f, 11.753f)
            curveTo(5.951f, 11.791f, 5.977f, 11.877f, 5.94f, 11.947f)
            curveTo(5.903f, 12.016f, 5.816f, 12.042f, 5.746f, 12.005f)
            lineTo(5.335f, 11.784f)
            curveTo(5.225f, 11.934f, 5.13f, 12.067f, 5.048f, 12.184f)
            lineTo(5.31f, 12.325f)
            curveTo(5.38f, 12.362f, 5.406f, 12.449f, 5.368f, 12.518f)
            curveTo(5.331f, 12.588f, 5.245f, 12.614f, 5.175f, 12.576f)
            lineTo(4.884f, 12.42f)
            curveTo(4.764f, 12.601f, 4.701f, 12.709f, 4.701f, 12.737f)
            curveTo(4.701f, 12.816f, 4.637f, 12.88f, 4.558f, 12.88f)
            curveTo(4.479f, 12.88f, 4.415f, 12.816f, 4.415f, 12.737f)
            curveTo(4.415f, 12.665f, 4.49f, 12.513f, 4.648f, 12.269f)
            curveTo(4.645f, 12.265f, 4.643f, 12.261f, 4.641f, 12.257f)
            lineTo(4.43f, 11.791f)
            curveTo(4.397f, 11.719f, 4.429f, 11.635f, 4.501f, 11.602f)
            curveTo(4.573f, 11.569f, 4.658f, 11.601f, 4.69f, 11.673f)
            lineTo(4.835f, 11.991f)
            curveTo(4.925f, 11.861f, 5.03f, 11.714f, 5.151f, 11.549f)
            lineTo(5.001f, 11.22f)
            curveTo(4.969f, 11.148f, 5.001f, 11.063f, 5.072f, 11.031f)
            curveTo(5.144f, 10.998f, 5.229f, 11.03f, 5.262f, 11.102f)
            lineTo(5.345f, 11.286f)
            curveTo(5.392f, 11.224f, 5.44f, 11.16f, 5.49f, 11.094f)
            lineTo(5.287f, 10.649f)
            curveTo(5.255f, 10.577f, 5.286f, 10.492f, 5.358f, 10.459f)
            curveTo(5.43f, 10.427f, 5.515f, 10.458f, 5.547f, 10.53f)
            lineTo(5.686f, 10.835f)
            curveTo(5.773f, 10.72f, 5.865f, 10.6f, 5.961f, 10.474f)
            lineTo(5.851f, 10.054f)
            curveTo(5.83f, 9.978f, 5.876f, 9.9f, 5.952f, 9.88f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun VanuatuPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Vanuatu,
            contentDescription = "Vanuatu Flag"
        )
    }
}
