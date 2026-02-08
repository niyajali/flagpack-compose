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
 * Bolivia Flag (32x24dp)
 *
 * - ISO Alpha-2: BO
 * - ISO Alpha-3: BOL
 * - ISO Numeric: 068
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Bolivia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bolivia:BO:BOL:068:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFFDB501C)),
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
            path(fill = SolidColor(Color(0xFF864C26))) {
                moveTo(12.446f, 9.959f)
                lineTo(12.482f, 9.924f)
                lineTo(19.702f, 16.869f)
                lineTo(19.666f, 16.904f)
                lineTo(12.446f, 9.959f)
                close()
            }
            path(fill = SolidColor(Color(0xFF864C26))) {
                moveTo(20.221f, 16.417f)
                lineTo(20.19f, 16.457f)
                lineTo(11.791f, 10.287f)
                lineTo(11.822f, 10.248f)
                lineTo(20.221f, 16.417f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA05A2C))) {
                moveTo(20.398f, 15.802f)
                lineTo(20.373f, 15.845f)
                lineTo(11.03f, 10.759f)
                lineTo(11.055f, 10.716f)
                lineTo(20.398f, 15.802f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE7E7E7)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.602f, 9.112f)
                lineTo(12.309f, 9.58f)
                lineTo(12.27f, 9.607f)
                curveTo(12.286f, 9.617f, 12.303f, 9.627f, 12.32f, 9.637f)
                curveTo(12.34f, 9.649f, 12.354f, 9.664f, 12.362f, 9.681f)
                curveTo(12.376f, 9.639f, 12.376f, 9.588f, 12.361f, 9.527f)
                lineTo(12.323f, 9.378f)
                lineTo(12.407f, 9.508f)
                curveTo(12.54f, 9.716f, 12.56f, 9.864f, 12.457f, 9.948f)
                curveTo(12.355f, 10.031f, 12.196f, 10.009f, 11.981f, 9.891f)
                lineTo(11.893f, 9.843f)
                lineTo(11.993f, 9.844f)
                curveTo(12.075f, 9.845f, 12.145f, 9.836f, 12.204f, 9.815f)
                lineTo(12.163f, 9.804f)
                curveTo(12.129f, 9.795f, 12.103f, 9.771f, 12.086f, 9.733f)
                lineTo(12.016f, 9.78f)
                lineTo(11.602f, 9.112f)
                close()
                moveTo(10.753f, 9.641f)
                lineTo(11.531f, 9.979f)
                lineTo(11.496f, 10.014f)
                curveTo(11.514f, 10.02f, 11.533f, 10.027f, 11.553f, 10.035f)
                curveTo(11.575f, 10.044f, 11.591f, 10.056f, 11.602f, 10.071f)
                curveTo(11.609f, 10.028f, 11.599f, 9.977f, 11.574f, 9.92f)
                lineTo(11.511f, 9.779f)
                lineTo(11.616f, 9.893f)
                curveTo(11.784f, 10.075f, 11.829f, 10.217f, 11.742f, 10.318f)
                curveTo(11.656f, 10.417f, 11.495f, 10.423f, 11.263f, 10.344f)
                lineTo(11.168f, 10.312f)
                lineTo(11.267f, 10.296f)
                curveTo(11.348f, 10.283f, 11.416f, 10.261f, 11.47f, 10.231f)
                lineTo(11.428f, 10.227f)
                curveTo(11.392f, 10.224f, 11.362f, 10.204f, 11.338f, 10.168f)
                lineTo(11.278f, 10.227f)
                lineTo(10.753f, 9.641f)
                close()
                moveTo(10.805f, 10.453f)
                lineTo(10f, 10.184f)
                lineTo(10.573f, 10.722f)
                lineTo(10.628f, 10.658f)
                curveTo(10.655f, 10.692f, 10.687f, 10.71f, 10.724f, 10.71f)
                horizontalLineTo(10.766f)
                curveTo(10.715f, 10.745f, 10.649f, 10.773f, 10.569f, 10.793f)
                lineTo(10.472f, 10.817f)
                lineTo(10.569f, 10.841f)
                curveTo(10.808f, 10.899f, 10.967f, 10.879f, 11.044f, 10.773f)
                curveTo(11.122f, 10.665f, 11.065f, 10.527f, 10.882f, 10.361f)
                lineTo(10.767f, 10.257f)
                lineTo(10.842f, 10.391f)
                curveTo(10.872f, 10.446f, 10.886f, 10.495f, 10.883f, 10.54f)
                curveTo(10.871f, 10.525f, 10.854f, 10.514f, 10.831f, 10.508f)
                curveTo(10.811f, 10.502f, 10.791f, 10.496f, 10.772f, 10.491f)
                lineTo(10.805f, 10.453f)
                close()
                moveTo(10.717f, 10.478f)
                lineTo(10.717f, 10.477f)
                lineTo(10.202f, 10.304f)
                lineTo(10.569f, 10.649f)
                lineTo(10.599f, 10.614f)
                curveTo(10.594f, 10.603f, 10.589f, 10.592f, 10.584f, 10.58f)
                lineTo(10.587f, 10.579f)
                lineTo(10.563f, 10.552f)
                lineTo(10.661f, 10.467f)
                lineTo(10.674f, 10.469f)
                curveTo(10.688f, 10.472f, 10.702f, 10.474f, 10.717f, 10.478f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF925229)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.471f, 16.213f)
                lineTo(14.306f, 14.724f)
                lineTo(15.477f, 15.04f)
                lineTo(14.634f, 16.399f)
                horizontalLineTo(14.306f)
                verticalLineTo(16.547f)
                lineTo(13.471f, 16.213f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.113f, 10.489f)
                lineTo(12.561f, 11.063f)
                lineTo(12.36f, 14.857f)
                lineTo(14.351f, 15.147f)
                curveTo(14.351f, 15.147f, 13.483f, 14.385f, 13.355f, 13.915f)
                curveTo(13.227f, 13.445f, 13.187f, 11.691f, 13.429f, 11.424f)
                lineTo(13.618f, 11.534f)
                lineTo(13.77f, 11.083f)
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.189f, 10.747f)
                curveTo(11.189f, 10.747f, 10.975f, 13.71f, 10.975f, 14.23f)
                curveTo(10.975f, 14.751f, 11.417f, 15.99f, 12.424f, 15.99f)
                curveTo(13.431f, 15.99f, 14.813f, 15.435f, 14.813f, 15.209f)
                curveTo(14.813f, 14.983f, 14.4f, 14.821f, 14.4f, 14.821f)
                curveTo(14.4f, 14.821f, 12.548f, 14.948f, 12.548f, 14.23f)
                curveTo(12.548f, 13.513f, 12.674f, 11.389f, 12.784f, 11.139f)
                curveTo(12.894f, 10.888f, 13.275f, 10.511f, 13.275f, 10.511f)
                lineTo(12.548f, 9.971f)
                lineTo(12.424f, 10.511f)
                lineTo(11.958f, 10.352f)
                lineTo(11.816f, 11.139f)
                lineTo(11.189f, 10.747f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF027934)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.776f, 11.076f)
                lineTo(13.643f, 11.495f)
                lineTo(13.372f, 11.381f)
                curveTo(13.372f, 11.381f, 12.968f, 13.277f, 13.372f, 14.071f)
                curveTo(13.776f, 14.866f, 14.795f, 14.924f, 14.795f, 14.924f)
                lineTo(14.365f, 11.495f)
                lineTo(13.776f, 11.076f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8A30C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.717f, 13.638f)
                lineTo(12.747f, 14.406f)
                curveTo(12.747f, 14.406f, 12.48f, 14.787f, 12.747f, 15.076f)
                curveTo(13.013f, 15.365f, 13.751f, 15.659f, 13.925f, 15.311f)
                curveTo(14.099f, 14.962f, 14.616f, 14.554f, 14.616f, 14.554f)
                lineTo(13.717f, 13.638f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE1E5E8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.479f, 10.743f)
                curveTo(14.715f, 10.537f, 14.833f, 10.287f, 14.743f, 10.183f)
                curveTo(14.653f, 10.079f, 14.388f, 10.162f, 14.152f, 10.367f)
                curveTo(13.916f, 10.572f, 13.798f, 10.823f, 13.888f, 10.926f)
                curveTo(13.978f, 11.03f, 14.243f, 10.948f, 14.479f, 10.743f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.883f, 9.303f)
                curveTo(13.883f, 9.303f, 13.788f, 9.284f, 13.745f, 9.277f)
                curveTo(13.438f, 9.231f, 13.285f, 9.293f, 13.285f, 9.465f)
                curveTo(13.285f, 9.759f, 13.481f, 10.076f, 13.481f, 10.298f)
                curveTo(13.481f, 10.519f, 13.49f, 10.865f, 13.584f, 10.692f)
                curveTo(13.678f, 10.519f, 14.157f, 10.001f, 14.157f, 10.001f)
                lineTo(13.883f, 9.551f)
                curveTo(13.883f, 9.551f, 14.562f, 9.627f, 14.264f, 9.465f)
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.97f, 15.378f)
                lineTo(15.461f, 15.373f)
                curveTo(15.083f, 15.747f, 15.048f, 16.25f, 15.346f, 16.857f)
                curveTo(15.346f, 16.857f, 15.443f, 16.998f, 15.477f, 16.985f)
                curveTo(15.525f, 16.966f, 15.592f, 16.762f, 15.592f, 16.762f)
                curveTo(15.569f, 16.169f, 15.947f, 15.776f, 15.97f, 15.378f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.325f, 15.394f)
                lineTo(15.508f, 15.309f)
                curveTo(15.689f, 15.683f, 15.598f, 16.071f, 15.25f, 16.457f)
                lineTo(15.099f, 16.325f)
                curveTo(15.25f, 15.883f, 15.25f, 15.7f, 15.325f, 15.394f)
                close()
            }
            path(fill = SolidColor(Color(0xFF027934))) {
                moveTo(15.091f, 15.382f)
                lineTo(15.282f, 15.326f)
                curveTo(15.374f, 15.64f, 15.328f, 15.963f, 15.148f, 16.292f)
                lineTo(14.974f, 16.196f)
                curveTo(15.13f, 15.912f, 15.168f, 15.642f, 15.091f, 15.382f)
                close()
            }
            path(fill = SolidColor(Color(0xFF864C26))) {
                moveTo(19.554f, 9.959f)
                lineTo(19.518f, 9.924f)
                lineTo(12.298f, 16.869f)
                lineTo(12.334f, 16.904f)
                lineTo(19.554f, 9.959f)
                close()
            }
            path(fill = SolidColor(Color(0xFF864C26))) {
                moveTo(11.779f, 16.417f)
                lineTo(11.81f, 16.457f)
                lineTo(20.209f, 10.287f)
                lineTo(20.178f, 10.248f)
                lineTo(11.779f, 16.417f)
                close()
            }
            path(fill = SolidColor(Color(0xFFA05A2C))) {
                moveTo(11.602f, 15.802f)
                lineTo(11.627f, 15.845f)
                lineTo(20.97f, 10.759f)
                lineTo(20.945f, 10.716f)
                lineTo(11.602f, 15.802f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE7E7E7)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.398f, 9.112f)
                lineTo(19.691f, 9.58f)
                lineTo(19.73f, 9.607f)
                curveTo(19.714f, 9.617f, 19.697f, 9.627f, 19.68f, 9.637f)
                curveTo(19.66f, 9.649f, 19.646f, 9.664f, 19.638f, 9.681f)
                curveTo(19.624f, 9.639f, 19.624f, 9.588f, 19.639f, 9.527f)
                lineTo(19.677f, 9.378f)
                lineTo(19.593f, 9.508f)
                curveTo(19.459f, 9.716f, 19.44f, 9.864f, 19.543f, 9.948f)
                curveTo(19.645f, 10.031f, 19.804f, 10.009f, 20.019f, 9.891f)
                lineTo(20.107f, 9.843f)
                lineTo(20.007f, 9.844f)
                curveTo(19.925f, 9.845f, 19.855f, 9.836f, 19.796f, 9.815f)
                lineTo(19.837f, 9.804f)
                curveTo(19.871f, 9.795f, 19.897f, 9.771f, 19.914f, 9.733f)
                lineTo(19.984f, 9.78f)
                lineTo(20.398f, 9.112f)
                close()
                moveTo(21.247f, 9.641f)
                lineTo(20.469f, 9.979f)
                lineTo(20.504f, 10.014f)
                curveTo(20.486f, 10.02f, 20.467f, 10.027f, 20.447f, 10.035f)
                curveTo(20.426f, 10.044f, 20.409f, 10.056f, 20.398f, 10.071f)
                curveTo(20.391f, 10.028f, 20.401f, 9.977f, 20.426f, 9.92f)
                lineTo(20.489f, 9.779f)
                lineTo(20.383f, 9.893f)
                curveTo(20.216f, 10.075f, 20.171f, 10.217f, 20.258f, 10.318f)
                curveTo(20.344f, 10.417f, 20.504f, 10.423f, 20.737f, 10.344f)
                lineTo(20.832f, 10.312f)
                lineTo(20.733f, 10.296f)
                curveTo(20.652f, 10.283f, 20.584f, 10.261f, 20.53f, 10.231f)
                lineTo(20.572f, 10.227f)
                curveTo(20.608f, 10.224f, 20.638f, 10.204f, 20.662f, 10.168f)
                lineTo(20.722f, 10.227f)
                lineTo(21.247f, 9.641f)
                close()
                moveTo(21.195f, 10.453f)
                lineTo(22f, 10.184f)
                lineTo(21.427f, 10.722f)
                lineTo(21.372f, 10.658f)
                curveTo(21.345f, 10.692f, 21.313f, 10.71f, 21.277f, 10.71f)
                horizontalLineTo(21.234f)
                curveTo(21.285f, 10.745f, 21.351f, 10.773f, 21.431f, 10.793f)
                lineTo(21.528f, 10.817f)
                lineTo(21.431f, 10.841f)
                curveTo(21.192f, 10.899f, 21.033f, 10.879f, 20.956f, 10.773f)
                curveTo(20.878f, 10.665f, 20.935f, 10.527f, 21.118f, 10.361f)
                lineTo(21.233f, 10.257f)
                lineTo(21.158f, 10.391f)
                curveTo(21.128f, 10.446f, 21.114f, 10.495f, 21.117f, 10.54f)
                curveTo(21.129f, 10.525f, 21.146f, 10.514f, 21.169f, 10.508f)
                curveTo(21.189f, 10.502f, 21.209f, 10.496f, 21.228f, 10.491f)
                lineTo(21.195f, 10.453f)
                close()
                moveTo(21.283f, 10.478f)
                lineTo(21.283f, 10.477f)
                lineTo(21.798f, 10.304f)
                lineTo(21.431f, 10.649f)
                lineTo(21.4f, 10.614f)
                curveTo(21.406f, 10.603f, 21.411f, 10.592f, 21.416f, 10.58f)
                lineTo(21.413f, 10.579f)
                lineTo(21.437f, 10.552f)
                lineTo(21.339f, 10.467f)
                lineTo(21.326f, 10.469f)
                curveTo(21.313f, 10.472f, 21.298f, 10.474f, 21.283f, 10.478f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF925229)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.529f, 16.213f)
                lineTo(17.694f, 14.724f)
                lineTo(16.523f, 15.04f)
                lineTo(17.366f, 16.399f)
                horizontalLineTo(17.694f)
                verticalLineTo(16.547f)
                lineTo(18.529f, 16.213f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.886f, 10.489f)
                lineTo(19.439f, 11.063f)
                lineTo(19.64f, 14.857f)
                lineTo(17.649f, 15.147f)
                curveTo(17.649f, 15.147f, 18.517f, 14.385f, 18.645f, 13.915f)
                curveTo(18.772f, 13.445f, 18.813f, 11.691f, 18.571f, 11.424f)
                lineTo(18.382f, 11.534f)
                lineTo(18.23f, 11.083f)
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.811f, 10.747f)
                curveTo(20.811f, 10.747f, 21.025f, 13.71f, 21.025f, 14.23f)
                curveTo(21.025f, 14.751f, 20.583f, 15.99f, 19.576f, 15.99f)
                curveTo(18.569f, 15.99f, 17.187f, 15.435f, 17.187f, 15.209f)
                curveTo(17.187f, 14.983f, 17.6f, 14.821f, 17.6f, 14.821f)
                curveTo(17.6f, 14.821f, 19.452f, 14.948f, 19.452f, 14.23f)
                curveTo(19.452f, 13.513f, 19.326f, 11.389f, 19.216f, 11.139f)
                curveTo(19.106f, 10.888f, 18.725f, 10.511f, 18.725f, 10.511f)
                lineTo(19.452f, 9.971f)
                lineTo(19.576f, 10.511f)
                lineTo(20.042f, 10.352f)
                lineTo(20.184f, 11.139f)
                lineTo(20.811f, 10.747f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF027934)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.223f, 11.076f)
                lineTo(18.357f, 11.495f)
                lineTo(18.628f, 11.381f)
                curveTo(18.628f, 11.381f, 19.032f, 13.277f, 18.628f, 14.072f)
                curveTo(18.223f, 14.866f, 17.205f, 14.924f, 17.205f, 14.924f)
                lineTo(17.635f, 11.495f)
                lineTo(18.223f, 11.076f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8A30C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.283f, 13.638f)
                lineTo(19.253f, 14.406f)
                curveTo(19.253f, 14.406f, 19.52f, 14.787f, 19.253f, 15.076f)
                curveTo(18.987f, 15.365f, 18.249f, 15.659f, 18.075f, 15.311f)
                curveTo(17.901f, 14.962f, 17.384f, 14.554f, 17.384f, 14.554f)
                lineTo(18.283f, 13.638f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE1E5E8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.521f, 10.743f)
                curveTo(17.285f, 10.537f, 17.167f, 10.287f, 17.257f, 10.183f)
                curveTo(17.347f, 10.079f, 17.612f, 10.162f, 17.848f, 10.367f)
                curveTo(18.084f, 10.572f, 18.202f, 10.823f, 18.112f, 10.926f)
                curveTo(18.022f, 11.03f, 17.757f, 10.948f, 17.521f, 10.743f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.03f, 15.378f)
                lineTo(16.539f, 15.373f)
                curveTo(16.917f, 15.747f, 16.952f, 16.25f, 16.654f, 16.857f)
                curveTo(16.654f, 16.857f, 16.557f, 16.998f, 16.523f, 16.985f)
                curveTo(16.475f, 16.966f, 16.408f, 16.762f, 16.408f, 16.762f)
                curveTo(16.431f, 16.169f, 16.053f, 15.776f, 16.03f, 15.378f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFE000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.675f, 15.394f)
                lineTo(16.492f, 15.309f)
                curveTo(16.311f, 15.683f, 16.402f, 16.071f, 16.75f, 16.457f)
                lineTo(16.901f, 16.325f)
                curveTo(16.75f, 15.883f, 16.75f, 15.7f, 16.675f, 15.394f)
                close()
            }
            path(fill = SolidColor(Color(0xFF027934))) {
                moveTo(16.909f, 15.382f)
                lineTo(16.718f, 15.326f)
                curveTo(16.626f, 15.64f, 16.672f, 15.963f, 16.852f, 16.292f)
                lineTo(17.027f, 16.196f)
                curveTo(16.871f, 15.912f, 16.832f, 15.642f, 16.909f, 15.382f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00A6DE)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.554f, 12.821f)
                curveTo(13.554f, 14.26f, 14.616f, 15.458f, 15.974f, 15.458f)
                curveTo(17.332f, 15.458f, 18.395f, 14.26f, 18.395f, 12.821f)
                curveTo(18.395f, 11.382f, 17.332f, 10.184f, 15.974f, 10.184f)
                curveTo(14.616f, 10.184f, 13.554f, 11.382f, 13.554f, 12.821f)
                close()
                moveTo(17.828f, 12.821f)
                curveTo(17.828f, 13.975f, 16.998f, 14.91f, 15.974f, 14.91f)
                curveTo(14.95f, 14.91f, 14.12f, 13.975f, 14.12f, 12.821f)
                curveTo(14.12f, 11.667f, 14.95f, 10.731f, 15.974f, 10.731f)
                curveTo(16.998f, 10.731f, 17.828f, 11.667f, 17.828f, 12.821f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD52C1E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.974f, 12.448f)
                lineTo(15.733f, 12.944f)
                lineTo(15.74f, 12.396f)
                lineTo(15.3f, 12.742f)
                lineTo(15.551f, 12.251f)
                lineTo(15f, 12.379f)
                lineTo(15.447f, 12.042f)
                lineTo(14.893f, 11.925f)
                lineTo(15.447f, 11.809f)
                lineTo(15f, 11.472f)
                lineTo(15.551f, 11.6f)
                lineTo(15.3f, 11.109f)
                lineTo(15.74f, 11.455f)
                lineTo(15.733f, 10.907f)
                lineTo(15.974f, 11.403f)
                lineTo(16.215f, 10.907f)
                lineTo(16.209f, 11.455f)
                lineTo(16.649f, 11.109f)
                lineTo(16.397f, 11.6f)
                lineTo(16.949f, 11.472f)
                lineTo(16.501f, 11.809f)
                lineTo(17.056f, 11.925f)
                lineTo(16.501f, 12.042f)
                lineTo(16.949f, 12.379f)
                lineTo(16.397f, 12.251f)
                lineTo(16.649f, 12.742f)
                lineTo(16.209f, 12.396f)
                lineTo(16.215f, 12.944f)
                lineTo(15.974f, 12.448f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF027934)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.041f, 12.941f)
                curveTo(14.041f, 12.941f, 15.491f, 11.92f, 15.847f, 11.92f)
                curveTo(16.203f, 11.92f, 17.723f, 12.947f, 18.034f, 13.086f)
                curveTo(18.345f, 13.226f, 18.034f, 15.964f, 18.034f, 15.964f)
                horizontalLineTo(13.921f)
                lineTo(14.041f, 12.941f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC036)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.03f, 11.726f)
                lineTo(14.12f, 11.775f)
                curveTo(14.608f, 10.951f, 15.23f, 10.542f, 15.988f, 10.542f)
                curveTo(16.837f, 10.589f, 17.473f, 11.052f, 17.897f, 11.938f)
                lineTo(17.991f, 11.897f)
                curveTo(17.551f, 10.979f, 16.883f, 10.492f, 15.991f, 10.442f)
                curveTo(15.19f, 10.442f, 14.536f, 10.872f, 14.03f, 11.726f)
                close()
                moveTo(13.67f, 13.316f)
                lineTo(13.837f, 13.204f)
                lineTo(14.003f, 13.316f)
                lineTo(13.945f, 13.128f)
                lineTo(14.106f, 13.01f)
                lineTo(13.903f, 13.006f)
                lineTo(13.837f, 12.821f)
                lineTo(13.77f, 13.006f)
                lineTo(13.568f, 13.01f)
                lineTo(13.729f, 13.128f)
                lineTo(13.67f, 13.316f)
                close()
                moveTo(14.043f, 13.95f)
                lineTo(13.876f, 14.062f)
                lineTo(13.935f, 13.875f)
                lineTo(13.774f, 13.756f)
                lineTo(13.976f, 13.752f)
                lineTo(14.043f, 13.567f)
                lineTo(14.109f, 13.752f)
                lineTo(14.312f, 13.756f)
                lineTo(14.151f, 13.875f)
                lineTo(14.209f, 14.062f)
                lineTo(14.043f, 13.95f)
                close()
                moveTo(14.288f, 14.659f)
                lineTo(14.455f, 14.547f)
                lineTo(14.621f, 14.659f)
                lineTo(14.563f, 14.472f)
                lineTo(14.724f, 14.353f)
                lineTo(14.521f, 14.349f)
                lineTo(14.455f, 14.164f)
                lineTo(14.388f, 14.349f)
                lineTo(14.186f, 14.353f)
                lineTo(14.347f, 14.472f)
                lineTo(14.288f, 14.659f)
                close()
                moveTo(15.073f, 15.045f)
                lineTo(14.906f, 15.157f)
                lineTo(14.965f, 14.969f)
                lineTo(14.804f, 14.851f)
                lineTo(15.006f, 14.847f)
                lineTo(15.073f, 14.662f)
                lineTo(15.14f, 14.847f)
                lineTo(15.342f, 14.851f)
                lineTo(15.181f, 14.969f)
                lineTo(15.24f, 15.157f)
                lineTo(15.073f, 15.045f)
                close()
                moveTo(15.782f, 15.406f)
                lineTo(15.948f, 15.294f)
                lineTo(16.115f, 15.406f)
                lineTo(16.056f, 15.218f)
                lineTo(16.218f, 15.099f)
                lineTo(16.015f, 15.096f)
                lineTo(15.948f, 14.91f)
                lineTo(15.882f, 15.096f)
                lineTo(15.679f, 15.099f)
                lineTo(15.841f, 15.218f)
                lineTo(15.782f, 15.406f)
                close()
                moveTo(18.112f, 13.204f)
                lineTo(18.278f, 13.316f)
                lineTo(18.219f, 13.128f)
                lineTo(18.381f, 13.01f)
                lineTo(18.178f, 13.006f)
                lineTo(18.112f, 12.821f)
                lineTo(18.045f, 13.006f)
                lineTo(17.842f, 13.01f)
                lineTo(18.004f, 13.128f)
                lineTo(17.945f, 13.316f)
                lineTo(18.112f, 13.204f)
                close()
                moveTo(18.072f, 14.062f)
                lineTo(17.906f, 13.95f)
                lineTo(17.739f, 14.062f)
                lineTo(17.798f, 13.875f)
                lineTo(17.636f, 13.756f)
                lineTo(17.839f, 13.752f)
                lineTo(17.906f, 13.567f)
                lineTo(17.972f, 13.752f)
                lineTo(18.175f, 13.756f)
                lineTo(18.013f, 13.875f)
                lineTo(18.072f, 14.062f)
                close()
                moveTo(17.494f, 14.547f)
                lineTo(17.66f, 14.659f)
                lineTo(17.601f, 14.472f)
                lineTo(17.763f, 14.353f)
                lineTo(17.56f, 14.349f)
                lineTo(17.494f, 14.164f)
                lineTo(17.427f, 14.349f)
                lineTo(17.224f, 14.353f)
                lineTo(17.386f, 14.472f)
                lineTo(17.327f, 14.659f)
                lineTo(17.494f, 14.547f)
                close()
                moveTo(17.042f, 15.157f)
                lineTo(16.875f, 15.045f)
                lineTo(16.709f, 15.157f)
                lineTo(16.768f, 14.969f)
                lineTo(16.606f, 14.851f)
                lineTo(16.809f, 14.847f)
                lineTo(16.875f, 14.662f)
                lineTo(16.942f, 14.847f)
                lineTo(17.145f, 14.851f)
                lineTo(16.983f, 14.969f)
                lineTo(17.042f, 15.157f)
                close()
            }
            path(fill = SolidColor(Color(0xFF036A2D))) {
                moveTo(14.683f, 7.007f)
                lineTo(14.882f, 7.152f)
                curveTo(14.373f, 7.609f, 14.277f, 8.118f, 14.375f, 8.556f)
                curveTo(14.476f, 9.013f, 14.928f, 9.499f, 15.749f, 9.999f)
                lineTo(15.447f, 10.462f)
                curveTo(14.509f, 9.891f, 13.969f, 9.363f, 13.829f, 8.734f)
                curveTo(13.685f, 8.087f, 14.039f, 7.585f, 14.683f, 7.007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF036A2D))) {
                moveTo(17.387f, 7.007f)
                lineTo(17.188f, 7.152f)
                curveTo(17.697f, 7.609f, 17.793f, 8.118f, 17.695f, 8.556f)
                curveTo(17.594f, 9.013f, 17.142f, 9.499f, 16.321f, 9.999f)
                lineTo(16.623f, 10.462f)
                curveTo(17.561f, 9.891f, 18.101f, 9.363f, 18.241f, 8.734f)
                curveTo(18.385f, 8.087f, 18.031f, 7.585f, 17.387f, 7.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF452C24)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.775f, 8.862f)
                curveTo(12.775f, 8.862f, 13.644f, 8.26f, 14.057f, 8.26f)
                curveTo(14.47f, 8.26f, 15.02f, 8.123f, 15.106f, 8.439f)
                curveTo(15.193f, 8.755f, 15.356f, 8.664f, 15.675f, 8.664f)
                curveTo(15.995f, 8.664f, 16.623f, 8.664f, 16.623f, 8.664f)
                curveTo(16.623f, 8.664f, 16.435f, 8.26f, 16.783f, 8.26f)
                curveTo(17.131f, 8.26f, 18.582f, 8.466f, 19.02f, 8.664f)
                curveTo(19.458f, 8.862f, 19.48f, 8.979f, 19.48f, 8.979f)
                curveTo(19.48f, 8.979f, 19.075f, 8.745f, 18.626f, 8.862f)
                curveTo(18.178f, 8.979f, 17.364f, 9.494f, 16.993f, 9.494f)
                curveTo(16.623f, 9.494f, 16.326f, 9.892f, 16.326f, 9.892f)
                curveTo(16.326f, 9.892f, 16.351f, 9.688f, 16.013f, 9.79f)
                curveTo(15.675f, 9.892f, 15.683f, 10.372f, 15.395f, 10.284f)
                curveTo(15.106f, 10.196f, 15.478f, 9.494f, 15.395f, 9.494f)
                curveTo(15.312f, 9.494f, 14.723f, 9.263f, 14.723f, 9.263f)
                curveTo(14.723f, 9.263f, 14.151f, 8.745f, 13.303f, 8.862f)
                curveTo(12.454f, 8.979f, 12.775f, 8.862f, 12.775f, 8.862f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE7E7E7)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.871f, 9.289f)
                curveTo(16.042f, 9.289f, 16.18f, 9.166f, 16.18f, 9.015f)
                curveTo(16.18f, 8.864f, 16.042f, 8.741f, 15.871f, 8.741f)
                curveTo(15.701f, 8.741f, 15.562f, 8.864f, 15.562f, 9.015f)
                curveTo(15.562f, 9.166f, 15.701f, 9.289f, 15.871f, 9.289f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8A30C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.204f, 9.007f)
                curveTo(15.204f, 9.007f, 15.304f, 8.818f, 15.502f, 8.818f)
                curveTo(15.7f, 8.818f, 16.071f, 8.818f, 16.071f, 8.913f)
                curveTo(16.071f, 9.007f, 16.101f, 9.131f, 15.801f, 9.131f)
                curveTo(15.502f, 9.131f, 15.694f, 9.007f, 15.502f, 9.007f)
                curveTo(15.31f, 9.007f, 15.204f, 9.007f, 15.204f, 9.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE1E5E8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.736f, 10.283f)
                curveTo(18.851f, 10.163f, 18.916f, 9.87f, 18.916f, 9.87f)
                curveTo(18.916f, 9.87f, 18.402f, 9.953f, 18.282f, 9.87f)
                curveTo(18.162f, 9.788f, 18.1f, 9.547f, 18.1f, 9.547f)
                curveTo(18.1f, 9.547f, 17.637f, 9.759f, 17.813f, 9.759f)
                curveTo(17.99f, 9.759f, 18.1f, 9.915f, 18.1f, 9.915f)
                lineTo(18.46f, 10.048f)
                curveTo(18.46f, 10.048f, 18.221f, 10.283f, 18.34f, 10.283f)
                curveTo(18.46f, 10.283f, 18.621f, 10.404f, 18.736f, 10.283f)
                close()
            }
            path(fill = SolidColor(Color(0xFF925229))) {
                moveTo(17.831f, 10.384f)
                lineTo(17.766f, 10.307f)
                lineTo(18.218f, 9.953f)
                lineTo(18.282f, 10.03f)
                lineTo(17.831f, 10.384f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BoliviaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Bolivia,
            contentDescription = "Bolivia Flag"
        )
    }
}
