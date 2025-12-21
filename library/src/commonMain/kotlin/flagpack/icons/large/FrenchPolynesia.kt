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
 * French Polynesia Flag (32x24dp)
 *
 * - ISO Alpha-2: PF
 * - ISO Alpha-3: PYF
 * - ISO Numeric: 258
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.FrenchPolynesia: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Polynesia:PF:PYF:258:Large",
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
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(16f, 18f)
                curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                curveTo(12.686f, 6f, 10f, 8.686f, 10f, 12f)
                curveTo(10f, 15.314f, 12.686f, 18f, 16f, 18f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.549f, 13.765f)
                curveTo(10.494f, 13.593f, 10.679f, 13.444f, 10.835f, 13.535f)
                lineTo(11.209f, 13.752f)
                curveTo(11.264f, 13.784f, 11.332f, 13.787f, 11.391f, 13.76f)
                lineTo(12.313f, 13.328f)
                curveTo(12.378f, 13.297f, 12.454f, 13.305f, 12.512f, 13.346f)
                lineTo(13.508f, 14.066f)
                lineTo(14.886f, 13.324f)
                curveTo(14.939f, 13.295f, 15.002f, 13.293f, 15.057f, 13.317f)
                lineTo(16.095f, 13.767f)
                curveTo(16.147f, 13.79f, 16.207f, 13.789f, 16.258f, 13.764f)
                lineTo(17.189f, 13.316f)
                curveTo(17.239f, 13.292f, 17.296f, 13.29f, 17.347f, 13.311f)
                lineTo(18.499f, 13.771f)
                curveTo(18.551f, 13.791f, 18.609f, 13.789f, 18.659f, 13.764f)
                lineTo(19.551f, 13.323f)
                curveTo(19.607f, 13.295f, 19.674f, 13.296f, 19.729f, 13.325f)
                lineTo(20.548f, 13.754f)
                curveTo(20.607f, 13.785f, 20.678f, 13.783f, 20.736f, 13.75f)
                lineTo(21.161f, 13.509f)
                curveTo(21.313f, 13.424f, 21.493f, 13.563f, 21.448f, 13.731f)
                lineTo(21.36f, 14.066f)
                horizontalLineTo(10.645f)
                lineTo(10.549f, 13.765f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.545f, 14.951f)
                curveTo(10.492f, 14.778f, 10.68f, 14.631f, 10.834f, 14.724f)
                lineTo(11.174f, 14.929f)
                curveTo(11.231f, 14.963f, 11.302f, 14.966f, 11.362f, 14.937f)
                lineTo(12.239f, 14.511f)
                curveTo(12.305f, 14.479f, 12.384f, 14.487f, 12.443f, 14.531f)
                lineTo(13.399f, 15.246f)
                lineTo(14.722f, 14.507f)
                curveTo(14.777f, 14.477f, 14.842f, 14.474f, 14.899f, 14.5f)
                lineTo(15.889f, 14.945f)
                curveTo(15.943f, 14.969f, 16.004f, 14.968f, 16.057f, 14.942f)
                lineTo(16.945f, 14.499f)
                curveTo(16.996f, 14.474f, 17.055f, 14.472f, 17.108f, 14.493f)
                lineTo(18.208f, 14.949f)
                curveTo(18.261f, 14.971f, 18.322f, 14.968f, 18.373f, 14.942f)
                lineTo(19.223f, 14.506f)
                curveTo(19.281f, 14.477f, 19.349f, 14.477f, 19.406f, 14.509f)
                lineTo(20.184f, 14.931f)
                curveTo(20.245f, 14.964f, 20.318f, 14.962f, 20.378f, 14.927f)
                lineTo(20.768f, 14.698f)
                curveTo(20.919f, 14.61f, 21.101f, 14.747f, 21.058f, 14.917f)
                lineTo(20.973f, 15.246f)
                horizontalLineTo(10.636f)
                lineTo(10.545f, 14.951f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.742f, 15.738f)
                curveTo(10.689f, 15.565f, 10.876f, 15.418f, 11.031f, 15.511f)
                lineTo(11.371f, 15.715f)
                curveTo(11.428f, 15.75f, 11.498f, 15.753f, 11.558f, 15.724f)
                lineTo(12.436f, 15.298f)
                curveTo(12.502f, 15.266f, 12.58f, 15.274f, 12.639f, 15.318f)
                lineTo(13.595f, 16.033f)
                lineTo(14.919f, 15.294f)
                curveTo(14.973f, 15.264f, 15.039f, 15.261f, 15.095f, 15.286f)
                lineTo(16.085f, 15.732f)
                curveTo(16.139f, 15.756f, 16.201f, 15.755f, 16.254f, 15.729f)
                lineTo(17.142f, 15.286f)
                curveTo(17.192f, 15.26f, 17.252f, 15.258f, 17.305f, 15.28f)
                lineTo(18.405f, 15.736f)
                curveTo(18.458f, 15.758f, 18.518f, 15.755f, 18.57f, 15.729f)
                lineTo(19.42f, 15.293f)
                curveTo(19.477f, 15.264f, 19.546f, 15.264f, 19.603f, 15.295f)
                lineTo(20.381f, 15.717f)
                curveTo(20.441f, 15.75f, 20.515f, 15.749f, 20.574f, 15.714f)
                lineTo(20.964f, 15.485f)
                curveTo(21.115f, 15.397f, 21.298f, 15.534f, 21.254f, 15.704f)
                lineTo(21.17f, 16.033f)
                horizontalLineTo(10.833f)
                lineTo(10.742f, 15.738f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.922f, 16.524f)
                curveTo(11.869f, 16.352f, 12.057f, 16.205f, 12.211f, 16.298f)
                lineTo(12.551f, 16.502f)
                curveTo(12.608f, 16.537f, 12.679f, 16.54f, 12.739f, 16.511f)
                lineTo(13.616f, 16.085f)
                curveTo(13.682f, 16.053f, 13.761f, 16.06f, 13.82f, 16.104f)
                lineTo(14.776f, 16.82f)
                lineTo(16.099f, 16.081f)
                curveTo(16.153f, 16.051f, 16.219f, 16.048f, 16.276f, 16.073f)
                lineTo(17.266f, 16.519f)
                curveTo(17.319f, 16.543f, 17.381f, 16.542f, 17.434f, 16.516f)
                lineTo(18.322f, 16.073f)
                curveTo(18.373f, 16.047f, 18.432f, 16.045f, 18.485f, 16.067f)
                lineTo(19.585f, 16.523f)
                curveTo(19.638f, 16.545f, 19.699f, 16.542f, 19.75f, 16.516f)
                lineTo(20.6f, 16.08f)
                curveTo(20.658f, 16.051f, 20.726f, 16.051f, 20.783f, 16.082f)
                lineTo(21.561f, 16.504f)
                curveTo(21.622f, 16.537f, 21.695f, 16.536f, 21.754f, 16.501f)
                lineTo(22.145f, 16.272f)
                curveTo(22.295f, 16.184f, 22.478f, 16.321f, 22.435f, 16.491f)
                lineTo(22.35f, 16.82f)
                horizontalLineTo(12.013f)
                lineTo(11.922f, 16.524f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5277B9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.348f, 17.508f)
                curveTo(10.295f, 17.336f, 10.483f, 17.188f, 10.638f, 17.281f)
                lineTo(10.978f, 17.486f)
                curveTo(11.035f, 17.52f, 11.105f, 17.524f, 11.165f, 17.494f)
                lineTo(12.042f, 17.069f)
                curveTo(12.108f, 17.037f, 12.187f, 17.044f, 12.246f, 17.088f)
                lineTo(13.202f, 17.803f)
                lineTo(14.525f, 17.065f)
                curveTo(14.58f, 17.034f, 14.645f, 17.031f, 14.702f, 17.057f)
                lineTo(15.692f, 17.503f)
                curveTo(15.746f, 17.527f, 15.808f, 17.526f, 15.86f, 17.499f)
                lineTo(16.748f, 17.056f)
                curveTo(16.799f, 17.031f, 16.858f, 17.029f, 16.911f, 17.051f)
                lineTo(18.011f, 17.506f)
                curveTo(18.065f, 17.528f, 18.125f, 17.526f, 18.176f, 17.5f)
                lineTo(19.026f, 17.064f)
                curveTo(19.084f, 17.034f, 19.153f, 17.035f, 19.21f, 17.066f)
                lineTo(19.987f, 17.488f)
                curveTo(20.048f, 17.521f, 20.121f, 17.52f, 20.181f, 17.485f)
                lineTo(20.571f, 17.256f)
                curveTo(20.722f, 17.167f, 20.904f, 17.305f, 20.861f, 17.474f)
                lineTo(20.777f, 17.803f)
                horizontalLineTo(10.439f)
                lineTo(10.348f, 17.508f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(14.422f, 14.138f)
                verticalLineTo(15.138f)
                curveTo(13.578f, 15.138f, 12.981f, 14.62f, 12.69f, 13.699f)
                lineTo(12.667f, 13.548f)
                verticalLineTo(9.446f)
                horizontalLineTo(13.667f)
                verticalLineTo(13.468f)
                curveTo(13.834f, 13.948f, 14.068f, 14.138f, 14.422f, 14.138f)
                close()
            }
            path(fill = SolidColor(Color.Red)) {
                moveTo(17.192f, 14.138f)
                verticalLineTo(15.138f)
                curveTo(18.036f, 15.138f, 18.633f, 14.62f, 18.924f, 13.699f)
                lineTo(18.947f, 13.548f)
                verticalLineTo(9.446f)
                horizontalLineTo(17.947f)
                verticalLineTo(13.468f)
                curveTo(17.781f, 13.948f, 17.546f, 14.138f, 17.192f, 14.138f)
                close()
            }
            path(
                fill = SolidColor(Color.Red),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.725f, 6.909f)
                curveTo(16.725f, 6.909f, 15.066f, 6.475f, 15.066f, 7.575f)
                curveTo(15.066f, 8.675f, 15.066f, 11.037f, 15.066f, 11.037f)
                lineTo(17f, 11.611f)
                verticalLineTo(8.781f)
                curveTo(17f, 8.781f, 16.033f, 8.191f, 16.033f, 7.729f)
                curveTo(16.033f, 7.266f, 16.725f, 6.909f, 16.725f, 6.909f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(13.934f, 12.891f)
                lineTo(14.564f, 12.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(14.509f, 12.864f)
                lineTo(13.905f, 12.053f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(14.839f, 12.891f)
                lineTo(15.469f, 12.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(15.414f, 12.864f)
                lineTo(14.809f, 12.053f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(15.704f, 12.891f)
                lineTo(16.335f, 12.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(16.279f, 12.864f)
                lineTo(15.675f, 12.053f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(16.609f, 12.891f)
                lineTo(17.24f, 12.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(17.184f, 12.864f)
                lineTo(16.58f, 12.053f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(17.514f, 12.891f)
                lineTo(18.145f, 12.085f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1f
            ) {
                moveTo(18.089f, 12.864f)
                lineTo(17.485f, 12.053f)
            }
            path(
                fill = SolidColor(Color(0xFFFA8F21)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.454f, 7.095f)
                lineTo(14.651f, 9.433f)
                lineTo(14.799f, 7.095f)
                lineTo(14.651f, 6.634f)
                lineTo(13.454f, 7.095f)
                close()
                moveTo(12.855f, 9.09f)
                lineTo(11.993f, 8.176f)
                lineTo(12.855f, 7.148f)
                lineTo(14.667f, 10.046f)
                verticalLineTo(10.782f)
                lineTo(13.796f, 10.046f)
                verticalLineTo(9.09f)
                horizontalLineTo(12.855f)
                close()
                moveTo(10.957f, 9.795f)
                lineTo(12.529f, 10.548f)
                lineTo(12.652f, 9.384f)
                lineTo(11.343f, 8.265f)
                lineTo(10.957f, 9.795f)
                close()
                moveTo(12.609f, 11.726f)
                lineTo(10.54f, 11.514f)
                verticalLineTo(10.055f)
                lineTo(12.609f, 10.851f)
                verticalLineTo(11.726f)
                close()
                moveTo(10.484f, 13.159f)
                lineTo(10.238f, 11.918f)
                lineTo(12.57f, 12.034f)
                verticalLineTo(13.159f)
                horizontalLineTo(10.484f)
                close()
                moveTo(13.767f, 11.12f)
                verticalLineTo(10.42f)
                lineTo(14.639f, 11.12f)
                lineTo(14.545f, 11.49f)
                lineTo(13.767f, 11.12f)
                close()
                moveTo(21.881f, 11.918f)
                lineTo(21.635f, 13.159f)
                horizontalLineTo(19.549f)
                verticalLineTo(12.034f)
                lineTo(21.881f, 11.918f)
                close()
                moveTo(19.51f, 11.726f)
                lineTo(21.579f, 11.514f)
                verticalLineTo(10.055f)
                lineTo(19.51f, 10.851f)
                verticalLineTo(11.726f)
                close()
                moveTo(21.162f, 9.795f)
                lineTo(19.59f, 10.548f)
                lineTo(19.467f, 9.384f)
                lineTo(20.776f, 8.265f)
                lineTo(21.162f, 9.795f)
                close()
                moveTo(19.264f, 9.09f)
                lineTo(20.126f, 8.176f)
                lineTo(19.264f, 7.148f)
                lineTo(17.451f, 10.046f)
                verticalLineTo(10.782f)
                lineTo(18.323f, 10.046f)
                verticalLineTo(9.09f)
                horizontalLineTo(19.264f)
                close()
                moveTo(18.664f, 7.095f)
                lineTo(17.468f, 9.433f)
                lineTo(17.32f, 7.095f)
                lineTo(17.468f, 6.634f)
                lineTo(18.664f, 7.095f)
                close()
                moveTo(18.352f, 11.12f)
                verticalLineTo(10.42f)
                lineTo(17.479f, 11.12f)
                lineTo(17.574f, 11.49f)
                lineTo(18.352f, 11.12f)
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
            imageVector = FlagIcons.Large.FrenchPolynesia,
            contentDescription = "French Polynesia Flag"
        )
    }
}
