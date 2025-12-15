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
 * Mexico Flag (20x15dp)
 *
 * - ISO Alpha-2: MX
 * - ISO Alpha-3: MEX
 * - ISO Numeric: 484
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Mexico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mexico:MX:MEX:484:Medium",
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
                fill = SolidColor(Color(0xFFD9071E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF006923)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.99f, 4.946f)
                curveTo(8.99f, 4.946f, 8.561f, 5.279f, 8.641f, 5.634f)
                curveTo(8.721f, 5.989f, 9.567f, 5.634f, 9.465f, 5.29f)
                curveTo(9.363f, 4.946f, 8.99f, 4.946f, 8.99f, 4.946f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA8AC71)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.335f, 5.793f)
                curveTo(8.013f, 5.793f, 7.88f, 5.525f, 7.946f, 5.24f)
                curveTo(7.981f, 5.088f, 8.074f, 4.896f, 8.224f, 4.645f)
                lineTo(8.76f, 4.967f)
                curveTo(8.703f, 5.062f, 8.657f, 5.145f, 8.623f, 5.214f)
                curveTo(8.735f, 5.247f, 8.846f, 5.296f, 8.936f, 5.355f)
                curveTo(9.228f, 5.548f, 9.335f, 5.89f, 9.023f, 6.144f)
                curveTo(8.962f, 6.193f, 8.864f, 6.36f, 8.81f, 6.521f)
                curveTo(8.959f, 6.529f, 9.066f, 6.552f, 9.164f, 6.61f)
                curveTo(9.44f, 6.773f, 9.414f, 7.071f, 9.204f, 7.302f)
                curveTo(9.055f, 7.465f, 8.856f, 7.597f, 8.668f, 7.665f)
                curveTo(8.356f, 7.778f, 8.022f, 7.734f, 8.022f, 7.335f)
                lineTo(8.022f, 7.332f)
                curveTo(8.021f, 7.316f, 8.02f, 7.288f, 8.16f, 7.285f)
                moveTo(8.166f, 7.285f)
                lineTo(8.16f, 7.285f)
                curveTo(7.922f, 7.281f, 7.871f, 7.156f, 7.841f, 6.931f)
                curveTo(7.834f, 6.875f, 7.831f, 6.821f, 7.827f, 6.704f)
                lineTo(7.824f, 6.628f)
                lineTo(7.821f, 6.554f)
                lineTo(7.82f, 6.538f)
                curveTo(7.815f, 6.466f, 7.812f, 6.416f, 7.973f, 6.416f)
                horizontalLineTo(7.611f)
                verticalLineTo(5.791f)
                horizontalLineTo(7.973f)
                curveTo(8.179f, 5.791f, 8.293f, 5.86f, 8.358f, 6.004f)
                curveTo(8.394f, 5.939f, 8.433f, 5.877f, 8.475f, 5.822f)
                curveTo(8.423f, 5.804f, 8.37f, 5.793f, 8.335f, 5.793f)
                moveTo(8.166f, 7.285f)
                curveTo(8.173f, 7.285f, 8.18f, 7.284f, 8.187f, 7.284f)
                lineTo(8.177f, 7.284f)
                lineTo(8.166f, 7.285f)
                close()
                moveTo(8.733f, 6.89f)
                lineTo(8.742f, 6.88f)
                curveTo(8.741f, 6.881f, 8.74f, 6.883f, 8.739f, 6.884f)
                lineTo(8.733f, 6.89f)
                close()
                moveTo(8.459f, 7.076f)
                curveTo(8.459f, 7.076f, 8.459f, 7.076f, 8.46f, 7.076f)
                lineTo(8.459f, 7.076f)
                close()
                moveTo(8.46f, 6.84f)
                lineTo(8.461f, 6.849f)
                curveTo(8.46f, 6.844f, 8.46f, 6.838f, 8.459f, 6.831f)
                lineTo(8.46f, 6.84f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8F4620)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.042f, 7.752f)
                curveTo(12.042f, 7.752f, 12.62f, 6.038f, 11.701f, 5.152f)
                curveTo(10.782f, 4.265f, 9.72f, 4.324f, 9.72f, 4.324f)
                curveTo(9.72f, 4.324f, 9.414f, 4.551f, 9.72f, 4.725f)
                curveTo(10.026f, 4.898f, 9.897f, 5.064f, 9.897f, 5.064f)
                curveTo(9.897f, 5.064f, 9.385f, 4.544f, 9.045f, 4.848f)
                curveTo(8.705f, 5.152f, 9.363f, 5.105f, 9.293f, 5.334f)
                curveTo(9.224f, 5.563f, 8.929f, 6.579f, 9.359f, 7.091f)
                curveTo(9.79f, 7.604f, 8.952f, 7.493f, 9.123f, 7.493f)
                curveTo(9.293f, 7.493f, 9.897f, 7.612f, 9.897f, 7.493f)
                curveTo(9.897f, 7.373f, 10.108f, 7.957f, 10.287f, 7.957f)
                curveTo(10.467f, 7.957f, 10.606f, 7.752f, 10.606f, 7.752f)
                curveTo(10.606f, 7.752f, 10.858f, 7.957f, 11.012f, 7.957f)
                curveTo(11.165f, 7.957f, 11.701f, 7.823f, 11.701f, 7.823f)
                lineTo(10.689f, 6.97f)
                curveTo(10.689f, 6.97f, 10.75f, 6.594f, 10.606f, 6.512f)
                curveTo(10.462f, 6.431f, 11.757f, 7.234f, 11.858f, 7.493f)
                curveTo(11.96f, 7.752f, 12.042f, 7.752f, 12.042f, 7.752f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9FAB2F))) {
                moveTo(6.917f, 7.329f)
                curveTo(6.917f, 7.329f, 7.01f, 7.03f, 7.111f, 7.009f)
                curveTo(7.198f, 6.991f, 7.381f, 7.153f, 7.381f, 7.153f)
                curveTo(7.706f, 8.959f, 8.492f, 9.664f, 9.797f, 9.664f)
                curveTo(11.117f, 9.664f, 11.917f, 9.128f, 12.384f, 7.462f)
                curveTo(12.384f, 7.462f, 12.632f, 7.209f, 12.719f, 7.237f)
                curveTo(12.814f, 7.268f, 12.934f, 7.603f, 12.934f, 7.603f)
                curveTo(12.399f, 9.514f, 11.387f, 10.365f, 9.797f, 10.365f)
                curveTo(8.192f, 10.365f, 7.29f, 9.403f, 6.917f, 7.329f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2FC2DC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.334f, 8.535f)
                curveTo(8.334f, 8.535f, 10.212f, 8.934f, 10.953f, 8.934f)
                curveTo(11.694f, 8.934f, 10.302f, 9.538f, 9.76f, 9.538f)
                curveTo(9.217f, 9.538f, 8.334f, 8.535f, 8.334f, 8.535f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9AA51))) {
                moveTo(9.271f, 8.813f)
                lineTo(10.312f, 8.813f)
                arcTo(0.104f, 0.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.417f, 8.917f)
                lineTo(10.417f, 9.378f)
                arcTo(0.104f, 0.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.312f, 9.482f)
                lineTo(9.271f, 9.482f)
                arcTo(0.104f, 0.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.167f, 9.378f)
                lineTo(9.167f, 8.917f)
                arcTo(0.104f, 0.104f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.271f, 8.813f)
                close()
            }
            path(fill = SolidColor(Color(0xFF259485))) {
                moveTo(7.61f, 7.585f)
                lineTo(8.121f, 7.226f)
                curveTo(8.787f, 8.175f, 9.783f, 8.487f, 11.176f, 8.161f)
                lineTo(11.318f, 8.77f)
                curveTo(9.69f, 9.151f, 8.432f, 8.756f, 7.61f, 7.585f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.37f, 7.719f)
                curveTo(10.37f, 7.719f, 9.611f, 8.118f, 9.864f, 8.118f)
                curveTo(10.117f, 8.118f, 11.106f, 8.318f, 10.914f, 8.118f)
                curveTo(10.721f, 7.919f, 10.37f, 7.719f, 10.37f, 7.719f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.473f, 7.243f)
                curveTo(9.473f, 7.243f, 9.329f, 6.826f, 9.029f, 6.826f)
                curveTo(8.729f, 6.826f, 8.813f, 7.168f, 8.669f, 7.168f)
                curveTo(8.525f, 7.168f, 8.804f, 7.408f, 8.928f, 7.408f)
                curveTo(9.052f, 7.408f, 9.473f, 7.243f, 9.473f, 7.243f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MexicoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Mexico,
            contentDescription = "Mexico Flag"
        )
    }
}
