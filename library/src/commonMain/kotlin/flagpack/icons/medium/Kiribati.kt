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
 * Kiribati Flag (20x15dp)
 *
 * - ISO Alpha-2: KI
 * - ISO Alpha-3: KIR
 * - ISO Numeric: 296
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Kiribati: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kiribati:KI:KIR:296:Medium",
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
                fill = SolidColor(Color(0xFFFFC84A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.577f, 10.736f)
                lineTo(9.863f, 10.115f)
                lineTo(10.149f, 10.736f)
                lineTo(10.319f, 10.074f)
                lineTo(10.712f, 10.634f)
                lineTo(10.76f, 9.954f)
                lineTo(11.248f, 10.435f)
                lineTo(11.173f, 9.757f)
                lineTo(11.739f, 10.144f)
                lineTo(11.543f, 9.49f)
                lineTo(12.17f, 9.77f)
                lineTo(11.86f, 9.161f)
                lineTo(12.527f, 9.326f)
                lineTo(12.112f, 8.783f)
                lineTo(12.798f, 8.827f)
                lineTo(12.292f, 8.365f)
                lineTo(12.975f, 8.287f)
                lineTo(12.394f, 7.922f)
                lineTo(13.052f, 7.724f)
                lineTo(12.414f, 7.469f)
                lineTo(13.026f, 7.157f)
                lineTo(12.353f, 7.019f)
                lineTo(12.899f, 6.604f)
                lineTo(12.211f, 6.587f)
                lineTo(12.674f, 6.082f)
                lineTo(11.994f, 6.187f)
                lineTo(12.359f, 5.608f)
                lineTo(11.709f, 5.832f)
                lineTo(11.963f, 5.198f)
                lineTo(11.364f, 5.533f)
                lineTo(11.5f, 4.864f)
                lineTo(10.971f, 5.3f)
                lineTo(10.985f, 4.618f)
                lineTo(10.543f, 5.141f)
                lineTo(10.433f, 4.467f)
                lineTo(10.092f, 5.06f)
                lineTo(9.863f, 4.416f)
                lineTo(9.634f, 5.06f)
                lineTo(9.293f, 4.467f)
                lineTo(9.184f, 5.141f)
                lineTo(8.742f, 4.618f)
                lineTo(8.755f, 5.3f)
                lineTo(8.226f, 4.864f)
                lineTo(8.362f, 5.533f)
                lineTo(7.763f, 5.198f)
                lineTo(8.017f, 5.832f)
                lineTo(7.368f, 5.608f)
                lineTo(7.732f, 6.187f)
                lineTo(7.052f, 6.082f)
                lineTo(7.515f, 6.587f)
                lineTo(6.827f, 6.604f)
                lineTo(7.374f, 7.019f)
                lineTo(6.7f, 7.157f)
                lineTo(7.312f, 7.469f)
                lineTo(6.674f, 7.724f)
                lineTo(7.333f, 7.922f)
                lineTo(6.751f, 8.287f)
                lineTo(7.435f, 8.365f)
                lineTo(6.928f, 8.827f)
                lineTo(7.614f, 8.783f)
                lineTo(7.199f, 9.326f)
                lineTo(7.867f, 9.161f)
                lineTo(7.556f, 9.77f)
                lineTo(8.183f, 9.49f)
                lineTo(7.987f, 10.144f)
                lineTo(8.553f, 9.757f)
                lineTo(8.478f, 10.435f)
                lineTo(8.966f, 9.954f)
                lineTo(9.014f, 10.634f)
                lineTo(9.407f, 10.074f)
                lineTo(9.577f, 10.736f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.495f, 8.7f)
                lineTo(1.139f, 8.037f)
                curveTo(1.377f, 7.94f, 1.644f, 7.941f, 1.882f, 8.04f)
                lineTo(4.151f, 8.984f)
                curveTo(4.408f, 9.091f, 4.698f, 9.084f, 4.948f, 8.963f)
                lineTo(6.779f, 8.085f)
                curveTo(7.041f, 7.959f, 7.346f, 7.957f, 7.611f, 8.079f)
                lineTo(9.528f, 8.964f)
                curveTo(9.786f, 9.084f, 10.084f, 9.084f, 10.342f, 8.966f)
                lineTo(12.304f, 8.072f)
                curveTo(12.563f, 7.954f, 12.86f, 7.954f, 13.118f, 8.074f)
                lineTo(15.055f, 8.968f)
                curveTo(15.309f, 9.085f, 15.602f, 9.088f, 15.858f, 8.975f)
                lineTo(17.974f, 8.043f)
                curveTo(18.204f, 7.942f, 18.463f, 7.933f, 18.698f, 8.018f)
                lineTo(20.596f, 8.7f)
                verticalLineTo(14.959f)
                horizontalLineTo(-0.551f)
                lineTo(-0.495f, 8.7f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-0.495f, 8.7f)
                lineTo(1.139f, 8.037f)
                curveTo(1.377f, 7.94f, 1.644f, 7.941f, 1.882f, 8.04f)
                lineTo(4.151f, 8.984f)
                curveTo(4.408f, 9.091f, 4.698f, 9.084f, 4.948f, 8.963f)
                lineTo(6.779f, 8.085f)
                curveTo(7.041f, 7.959f, 7.346f, 7.957f, 7.611f, 8.079f)
                lineTo(9.528f, 8.964f)
                curveTo(9.786f, 9.084f, 10.084f, 9.084f, 10.342f, 8.966f)
                lineTo(12.304f, 8.072f)
                curveTo(12.563f, 7.954f, 12.86f, 7.954f, 13.118f, 8.074f)
                lineTo(15.055f, 8.968f)
                curveTo(15.309f, 9.085f, 15.602f, 9.088f, 15.858f, 8.975f)
                lineTo(17.974f, 8.043f)
                curveTo(18.204f, 7.942f, 18.463f, 7.933f, 18.698f, 8.018f)
                lineTo(20.596f, 8.7f)
                verticalLineTo(14.959f)
                horizontalLineTo(-0.551f)
                lineTo(-0.495f, 8.7f)
                close()
            }
        ) {
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(-0.495f, 10.154f)
                lineTo(1.139f, 9.49f)
                curveTo(1.377f, 9.394f, 1.644f, 9.395f, 1.882f, 9.494f)
                lineTo(4.151f, 10.438f)
                curveTo(4.408f, 10.545f, 4.698f, 10.537f, 4.948f, 10.417f)
                lineTo(6.779f, 9.538f)
                curveTo(7.041f, 9.412f, 7.346f, 9.41f, 7.611f, 9.532f)
                lineTo(9.528f, 10.418f)
                curveTo(9.786f, 10.537f, 10.084f, 10.538f, 10.342f, 10.42f)
                lineTo(12.304f, 9.525f)
                curveTo(12.563f, 9.407f, 12.86f, 9.408f, 13.118f, 9.527f)
                lineTo(15.055f, 10.421f)
                curveTo(15.309f, 10.539f, 15.602f, 10.541f, 15.858f, 10.429f)
                lineTo(17.974f, 9.497f)
                curveTo(18.204f, 9.396f, 18.463f, 9.387f, 18.698f, 9.471f)
                lineTo(20.596f, 10.154f)
            }
            path(
                stroke = SolidColor(Color(0xFF015989)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(-0.495f, 12.234f)
                lineTo(1.139f, 11.571f)
                curveTo(1.377f, 11.474f, 1.644f, 11.475f, 1.882f, 11.574f)
                lineTo(4.151f, 12.519f)
                curveTo(4.408f, 12.625f, 4.698f, 12.618f, 4.948f, 12.497f)
                lineTo(6.779f, 11.619f)
                curveTo(7.041f, 11.493f, 7.346f, 11.491f, 7.611f, 11.613f)
                lineTo(9.528f, 12.498f)
                curveTo(9.786f, 12.618f, 10.084f, 12.619f, 10.342f, 12.5f)
                lineTo(12.304f, 11.606f)
                curveTo(12.563f, 11.488f, 12.86f, 11.489f, 13.118f, 11.608f)
                lineTo(15.055f, 12.502f)
                curveTo(15.309f, 12.619f, 15.602f, 12.622f, 15.858f, 12.509f)
                lineTo(17.974f, 11.577f)
                curveTo(18.204f, 11.476f, 18.463f, 11.467f, 18.698f, 11.552f)
                lineTo(20.596f, 12.234f)
            }
            path(
                fill = SolidColor(Color(0xFF015989)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0.495f, 13.892f)
                lineTo(0.187f, 13.615f)
                curveTo(1.035f, 13.271f, 1.985f, 13.275f, 2.83f, 13.627f)
                lineTo(4.151f, 14.176f)
                curveTo(4.408f, 14.283f, 4.698f, 14.276f, 4.948f, 14.155f)
                lineTo(5.717f, 13.786f)
                curveTo(6.652f, 13.338f, 7.738f, 13.33f, 8.679f, 13.764f)
                lineTo(9.528f, 14.156f)
                curveTo(9.786f, 14.276f, 10.084f, 14.276f, 10.342f, 14.158f)
                lineTo(11.26f, 13.74f)
                curveTo(12.182f, 13.32f, 13.241f, 13.322f, 14.16f, 13.747f)
                lineTo(15.055f, 14.16f)
                curveTo(15.309f, 14.277f, 15.602f, 14.28f, 15.858f, 14.167f)
                lineTo(17.061f, 13.637f)
                curveTo(17.876f, 13.278f, 18.799f, 13.246f, 19.638f, 13.548f)
                lineTo(20.596f, 13.892f)
                verticalLineTo(15.964f)
                horizontalLineTo(-0.38f)
                lineTo(-0.495f, 13.892f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFFFC84A)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.113f, 2.137f)
            curveTo(6.113f, 2.137f, 6.982f, 2.137f, 7.275f, 2.137f)
            curveTo(7.568f, 2.137f, 8.229f, 1.689f, 8.611f, 1.838f)
            curveTo(8.993f, 1.987f, 9.637f, 2.469f, 9.637f, 2.469f)
            curveTo(9.637f, 2.469f, 10.699f, 1.631f, 11.332f, 1.631f)
            curveTo(11.966f, 1.631f, 13.109f, 1.537f, 13.109f, 1.537f)
            curveTo(13.109f, 1.537f, 12.841f, 2.233f, 12.087f, 2.351f)
            curveTo(11.332f, 2.469f, 10.43f, 3.046f, 10.43f, 3.046f)
            curveTo(10.43f, 3.046f, 11.469f, 3.046f, 11.656f, 3.046f)
            curveTo(11.843f, 3.046f, 12.087f, 3.328f, 12.087f, 3.328f)
            curveTo(12.087f, 3.328f, 11.583f, 3.67f, 11.332f, 3.67f)
            curveTo(11.081f, 3.67f, 10.804f, 3.67f, 10.804f, 3.67f)
            curveTo(10.804f, 3.67f, 10.27f, 4.128f, 9.611f, 4.031f)
            curveTo(8.951f, 3.933f, 8.422f, 3.328f, 8.422f, 3.328f)
            curveTo(8.422f, 3.328f, 7.845f, 3.246f, 7.845f, 3.146f)
            curveTo(7.845f, 3.146f, 7.489f, 2.964f, 7.382f, 3.146f)
            curveTo(7.275f, 3.328f, 7.845f, 2.902f, 7.845f, 2.902f)
            curveTo(7.845f, 2.902f, 8.073f, 2.688f, 8.248f, 2.688f)
            curveTo(8.422f, 2.688f, 9.004f, 3.046f, 9.004f, 3.046f)
            lineTo(9.143f, 2.902f)
            lineTo(8.422f, 2.351f)
            curveTo(6.951f, 2.505f, 6.113f, 2.137f, 6.113f, 2.137f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun KiribatiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Kiribati,
            contentDescription = "Kiribati Flag"
        )
    }
}
