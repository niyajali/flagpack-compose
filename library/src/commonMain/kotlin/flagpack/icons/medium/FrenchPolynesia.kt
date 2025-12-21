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
 * French Polynesia Flag (20x15dp)
 *
 * - ISO Alpha-2: PF
 * - ISO Alpha-3: PYF
 * - ISO Numeric: 258
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.FrenchPolynesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Polynesia:PF:PYF:258:Medium",
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
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.25f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 11.25f)
                curveTo(12.071f, 11.25f, 13.75f, 9.571f, 13.75f, 7.5f)
                curveTo(13.75f, 5.429f, 12.071f, 3.75f, 10f, 3.75f)
                curveTo(7.929f, 3.75f, 6.25f, 5.429f, 6.25f, 7.5f)
                curveTo(6.25f, 9.571f, 7.929f, 11.25f, 10f, 11.25f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.593f, 8.603f)
                curveTo(6.559f, 8.496f, 6.674f, 8.403f, 6.772f, 8.459f)
                lineTo(7.005f, 8.595f)
                curveTo(7.04f, 8.615f, 7.083f, 8.617f, 7.119f, 8.6f)
                lineTo(7.696f, 8.33f)
                curveTo(7.736f, 8.311f, 7.784f, 8.315f, 7.82f, 8.342f)
                lineTo(8.443f, 8.791f)
                lineTo(9.303f, 8.327f)
                curveTo(9.337f, 8.31f, 9.376f, 8.308f, 9.411f, 8.323f)
                lineTo(10.059f, 8.605f)
                curveTo(10.092f, 8.619f, 10.129f, 8.618f, 10.161f, 8.603f)
                lineTo(10.743f, 8.323f)
                curveTo(10.774f, 8.308f, 10.81f, 8.306f, 10.842f, 8.319f)
                lineTo(11.562f, 8.607f)
                curveTo(11.594f, 8.62f, 11.631f, 8.618f, 11.662f, 8.603f)
                lineTo(12.219f, 8.327f)
                curveTo(12.255f, 8.31f, 12.296f, 8.31f, 12.331f, 8.328f)
                lineTo(12.842f, 8.596f)
                curveTo(12.879f, 8.615f, 12.924f, 8.615f, 12.96f, 8.594f)
                lineTo(13.226f, 8.443f)
                curveTo(13.321f, 8.39f, 13.433f, 8.477f, 13.405f, 8.582f)
                lineTo(13.35f, 8.791f)
                horizontalLineTo(6.653f)
                lineTo(6.593f, 8.603f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.591f, 9.344f)
                curveTo(6.557f, 9.236f, 6.675f, 9.144f, 6.771f, 9.203f)
                lineTo(6.984f, 9.33f)
                curveTo(7.02f, 9.352f, 7.064f, 9.354f, 7.101f, 9.336f)
                lineTo(7.649f, 9.07f)
                curveTo(7.691f, 9.05f, 7.74f, 9.054f, 7.777f, 9.082f)
                lineTo(8.374f, 9.529f)
                lineTo(9.201f, 9.067f)
                curveTo(9.235f, 9.048f, 9.276f, 9.046f, 9.312f, 9.062f)
                lineTo(9.93f, 9.341f)
                curveTo(9.964f, 9.356f, 10.003f, 9.355f, 10.036f, 9.339f)
                lineTo(10.59f, 9.062f)
                curveTo(10.622f, 9.046f, 10.66f, 9.045f, 10.692f, 9.058f)
                lineTo(11.38f, 9.343f)
                curveTo(11.413f, 9.357f, 11.451f, 9.355f, 11.483f, 9.339f)
                lineTo(12.014f, 9.066f)
                curveTo(12.05f, 9.048f, 12.093f, 9.048f, 12.129f, 9.068f)
                lineTo(12.615f, 9.332f)
                curveTo(12.653f, 9.352f, 12.699f, 9.351f, 12.736f, 9.33f)
                lineTo(12.98f, 9.186f)
                curveTo(13.074f, 9.131f, 13.188f, 9.217f, 13.161f, 9.323f)
                lineTo(13.108f, 9.529f)
                horizontalLineTo(6.647f)
                lineTo(6.591f, 9.344f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.714f, 9.836f)
                curveTo(6.68f, 9.728f, 6.798f, 9.636f, 6.894f, 9.694f)
                lineTo(7.107f, 9.822f)
                curveTo(7.142f, 9.844f, 7.187f, 9.846f, 7.224f, 9.827f)
                lineTo(7.772f, 9.561f)
                curveTo(7.814f, 9.541f, 7.863f, 9.546f, 7.9f, 9.574f)
                lineTo(8.497f, 10.021f)
                lineTo(9.324f, 9.559f)
                curveTo(9.358f, 9.54f, 9.399f, 9.538f, 9.435f, 9.554f)
                lineTo(10.053f, 9.833f)
                curveTo(10.087f, 9.848f, 10.126f, 9.847f, 10.159f, 9.831f)
                lineTo(10.713f, 9.554f)
                curveTo(10.745f, 9.538f, 10.783f, 9.537f, 10.815f, 9.55f)
                lineTo(11.503f, 9.835f)
                curveTo(11.536f, 9.849f, 11.574f, 9.847f, 11.606f, 9.831f)
                lineTo(12.137f, 9.558f)
                curveTo(12.173f, 9.54f, 12.216f, 9.54f, 12.252f, 9.56f)
                lineTo(12.738f, 9.823f)
                curveTo(12.776f, 9.844f, 12.822f, 9.843f, 12.859f, 9.821f)
                lineTo(13.103f, 9.678f)
                curveTo(13.197f, 9.623f, 13.311f, 9.709f, 13.284f, 9.815f)
                lineTo(13.231f, 10.021f)
                horizontalLineTo(6.77f)
                lineTo(6.714f, 9.836f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.451f, 10.328f)
                curveTo(7.418f, 10.22f, 7.535f, 10.128f, 7.632f, 10.186f)
                lineTo(7.845f, 10.314f)
                curveTo(7.88f, 10.335f, 7.924f, 10.337f, 7.962f, 10.319f)
                lineTo(8.51f, 10.053f)
                curveTo(8.551f, 10.033f, 8.6f, 10.038f, 8.637f, 10.065f)
                lineTo(9.235f, 10.512f)
                lineTo(10.062f, 10.051f)
                curveTo(10.096f, 10.032f, 10.137f, 10.03f, 10.172f, 10.046f)
                lineTo(10.791f, 10.324f)
                curveTo(10.825f, 10.34f, 10.863f, 10.339f, 10.896f, 10.322f)
                lineTo(11.451f, 10.045f)
                curveTo(11.483f, 10.03f, 11.52f, 10.028f, 11.553f, 10.042f)
                lineTo(12.241f, 10.327f)
                curveTo(12.274f, 10.34f, 12.312f, 10.339f, 12.344f, 10.322f)
                lineTo(12.875f, 10.05f)
                curveTo(12.911f, 10.032f, 12.954f, 10.032f, 12.99f, 10.052f)
                lineTo(13.476f, 10.315f)
                curveTo(13.514f, 10.336f, 13.559f, 10.335f, 13.597f, 10.313f)
                lineTo(13.84f, 10.17f)
                curveTo(13.935f, 10.115f, 14.049f, 10.201f, 14.022f, 10.307f)
                lineTo(13.969f, 10.512f)
                horizontalLineTo(7.508f)
                lineTo(7.451f, 10.328f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.468f, 10.943f)
                curveTo(6.434f, 10.835f, 6.552f, 10.743f, 6.648f, 10.801f)
                lineTo(6.861f, 10.929f)
                curveTo(6.897f, 10.95f, 6.941f, 10.952f, 6.978f, 10.934f)
                lineTo(7.526f, 10.668f)
                curveTo(7.568f, 10.648f, 7.617f, 10.653f, 7.654f, 10.68f)
                lineTo(8.251f, 11.127f)
                lineTo(9.078f, 10.665f)
                curveTo(9.112f, 10.646f, 9.153f, 10.645f, 9.189f, 10.661f)
                lineTo(9.807f, 10.939f)
                curveTo(9.841f, 10.954f, 9.88f, 10.954f, 9.913f, 10.937f)
                lineTo(10.467f, 10.66f)
                curveTo(10.499f, 10.644f, 10.537f, 10.643f, 10.569f, 10.657f)
                lineTo(11.257f, 10.941f)
                curveTo(11.29f, 10.955f, 11.328f, 10.954f, 11.36f, 10.937f)
                lineTo(11.891f, 10.665f)
                curveTo(11.927f, 10.646f, 11.97f, 10.647f, 12.006f, 10.666f)
                lineTo(12.492f, 10.93f)
                curveTo(12.53f, 10.951f, 12.576f, 10.95f, 12.613f, 10.928f)
                lineTo(12.857f, 10.785f)
                curveTo(12.951f, 10.729f, 13.065f, 10.816f, 13.038f, 10.921f)
                lineTo(12.985f, 11.127f)
                horizontalLineTo(6.524f)
                lineTo(6.468f, 10.943f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(7.917f, 5.904f)
                horizontalLineTo(8.542f)
                lineTo(8.528f, 8.374f)
                curveTo(8.632f, 8.706f, 8.782f, 8.836f, 9.014f, 8.836f)
                verticalLineTo(9.461f)
                curveTo(8.486f, 9.461f, 8.113f, 9.137f, 7.917f, 8.468f)
                verticalLineTo(5.904f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(12.142f, 5.904f)
                horizontalLineTo(11.517f)
                lineTo(11.531f, 8.374f)
                curveTo(11.427f, 8.706f, 11.277f, 8.836f, 11.045f, 8.836f)
                verticalLineTo(9.461f)
                curveTo(11.573f, 9.461f, 11.946f, 9.137f, 12.142f, 8.468f)
                verticalLineTo(5.904f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.453f, 4.318f)
                curveTo(10.453f, 4.318f, 9.416f, 4.047f, 9.416f, 4.734f)
                curveTo(9.416f, 5.422f, 9.416f, 6.898f, 9.416f, 6.898f)
                lineTo(10.625f, 7.257f)
                verticalLineTo(5.488f)
                curveTo(10.625f, 5.488f, 10.021f, 5.119f, 10.021f, 4.83f)
                curveTo(10.021f, 4.542f, 10.453f, 4.318f, 10.453f, 4.318f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.709f, 8.057f)
                lineTo(9.103f, 7.553f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.068f, 8.04f)
                lineTo(8.69f, 7.533f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.274f, 8.057f)
                lineTo(9.668f, 7.553f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.634f, 8.04f)
                lineTo(9.256f, 7.533f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.815f, 8.057f)
                lineTo(10.209f, 7.553f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.175f, 8.04f)
                lineTo(9.797f, 7.533f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.381f, 8.057f)
                lineTo(10.775f, 7.553f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.74f, 8.04f)
                lineTo(10.362f, 7.533f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.946f, 8.057f)
                lineTo(11.34f, 7.553f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 0.625f
            ) {
                moveTo(11.306f, 8.04f)
                lineTo(10.928f, 7.533f)
            }
            path(
                fill = SolidColor(Color(0xFFFA8F21)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.409f, 4.434f)
                lineTo(9.157f, 5.896f)
                lineTo(9.249f, 4.434f)
                lineTo(9.157f, 4.146f)
                lineTo(8.409f, 4.434f)
                close()
                moveTo(8.034f, 5.681f)
                lineTo(7.495f, 5.11f)
                lineTo(8.034f, 4.468f)
                lineTo(9.167f, 6.279f)
                verticalLineTo(6.739f)
                lineTo(8.622f, 6.279f)
                verticalLineTo(5.681f)
                horizontalLineTo(8.034f)
                close()
                moveTo(6.848f, 6.122f)
                lineTo(7.831f, 6.592f)
                lineTo(7.908f, 5.865f)
                lineTo(7.089f, 5.166f)
                lineTo(6.848f, 6.122f)
                close()
                moveTo(7.88f, 7.329f)
                lineTo(6.587f, 7.196f)
                verticalLineTo(6.284f)
                lineTo(7.88f, 6.782f)
                verticalLineTo(7.329f)
                close()
                moveTo(6.552f, 8.224f)
                lineTo(6.399f, 7.449f)
                lineTo(7.856f, 7.522f)
                verticalLineTo(8.224f)
                horizontalLineTo(6.552f)
                close()
                moveTo(8.604f, 6.95f)
                verticalLineTo(6.512f)
                lineTo(9.15f, 6.95f)
                lineTo(9.09f, 7.181f)
                lineTo(8.604f, 6.95f)
                close()
                moveTo(13.675f, 7.449f)
                lineTo(13.522f, 8.224f)
                horizontalLineTo(12.218f)
                verticalLineTo(7.522f)
                lineTo(13.675f, 7.449f)
                close()
                moveTo(12.194f, 7.329f)
                lineTo(13.487f, 7.196f)
                verticalLineTo(6.284f)
                lineTo(12.194f, 6.782f)
                verticalLineTo(7.329f)
                close()
                moveTo(13.226f, 6.122f)
                lineTo(12.243f, 6.592f)
                lineTo(12.167f, 5.865f)
                lineTo(12.985f, 5.166f)
                lineTo(13.226f, 6.122f)
                close()
                moveTo(12.04f, 5.681f)
                lineTo(12.579f, 5.11f)
                lineTo(12.04f, 4.468f)
                lineTo(10.907f, 6.279f)
                verticalLineTo(6.739f)
                lineTo(11.452f, 6.279f)
                verticalLineTo(5.681f)
                horizontalLineTo(12.04f)
                close()
                moveTo(11.665f, 4.434f)
                lineTo(10.917f, 5.896f)
                lineTo(10.825f, 4.434f)
                lineTo(10.917f, 4.146f)
                lineTo(11.665f, 4.434f)
                close()
                moveTo(11.47f, 6.95f)
                verticalLineTo(6.512f)
                lineTo(10.925f, 6.95f)
                lineTo(10.984f, 7.181f)
                lineTo(11.47f, 6.95f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchPolynesiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.FrenchPolynesia,
            contentDescription = "French Polynesia Flag"
        )
    }
}
