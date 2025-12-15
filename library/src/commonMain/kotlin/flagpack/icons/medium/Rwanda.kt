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
 * Rwanda Flag (20x15dp)
 *
 * - ISO Alpha-2: RW
 * - ISO Alpha-3: RWA
 * - ISO Numeric: 646
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Rwanda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Rwanda:RW:RWA:646:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF3CA5D9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5A962A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.25f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.051f, 7.416f)
                curveTo(15.03f, 7.417f, 15.01f, 7.417f, 14.989f, 7.417f)
                curveTo(14.971f, 7.417f, 14.953f, 7.417f, 14.935f, 7.416f)
                lineTo(14.558f, 8.65f)
                lineTo(14.478f, 7.365f)
                curveTo(14.439f, 7.357f, 14.401f, 7.348f, 14.364f, 7.339f)
                lineTo(13.71f, 8.451f)
                lineTo(13.931f, 7.184f)
                curveTo(13.896f, 7.168f, 13.86f, 7.15f, 13.826f, 7.132f)
                lineTo(12.931f, 8.064f)
                lineTo(13.441f, 6.884f)
                curveTo(13.41f, 6.859f, 13.38f, 6.834f, 13.35f, 6.808f)
                lineTo(12.263f, 7.51f)
                lineTo(13.034f, 6.48f)
                curveTo(13.009f, 6.449f, 12.985f, 6.417f, 12.961f, 6.385f)
                lineTo(11.743f, 6.819f)
                lineTo(12.731f, 5.993f)
                curveTo(12.714f, 5.957f, 12.697f, 5.92f, 12.682f, 5.883f)
                lineTo(11.398f, 6.027f)
                lineTo(12.55f, 5.45f)
                curveTo(12.542f, 5.411f, 12.535f, 5.371f, 12.528f, 5.331f)
                lineTo(11.247f, 5.178f)
                lineTo(12.501f, 4.88f)
                curveTo(12.502f, 4.839f, 12.505f, 4.799f, 12.508f, 4.758f)
                lineTo(11.297f, 4.318f)
                lineTo(12.587f, 4.314f)
                curveTo(12.597f, 4.274f, 12.609f, 4.235f, 12.622f, 4.196f)
                lineTo(11.547f, 3.492f)
                lineTo(12.803f, 3.782f)
                curveTo(12.823f, 3.746f, 12.843f, 3.711f, 12.865f, 3.676f)
                lineTo(11.983f, 2.746f)
                lineTo(13.138f, 3.315f)
                curveTo(13.165f, 3.285f, 13.194f, 3.255f, 13.223f, 3.226f)
                lineTo(12.581f, 2.119f)
                lineTo(13.573f, 2.936f)
                curveTo(13.606f, 2.913f, 13.641f, 2.891f, 13.675f, 2.87f)
                lineTo(13.309f, 1.645f)
                lineTo(14.084f, 2.668f)
                curveTo(14.122f, 2.653f, 14.16f, 2.639f, 14.199f, 2.626f)
                lineTo(14.128f, 1.35f)
                lineTo(14.644f, 2.523f)
                curveTo(14.684f, 2.518f, 14.724f, 2.513f, 14.764f, 2.51f)
                lineTo(14.993f, 1.25f)
                lineTo(15.222f, 2.511f)
                curveTo(15.262f, 2.514f, 15.302f, 2.519f, 15.342f, 2.525f)
                lineTo(15.859f, 1.35f)
                lineTo(15.788f, 2.629f)
                curveTo(15.826f, 2.642f, 15.863f, 2.656f, 15.901f, 2.67f)
                lineTo(16.678f, 1.645f)
                lineTo(16.31f, 2.875f)
                curveTo(16.344f, 2.896f, 16.377f, 2.917f, 16.41f, 2.94f)
                lineTo(17.406f, 2.119f)
                lineTo(16.761f, 3.232f)
                curveTo(16.789f, 3.26f, 16.816f, 3.289f, 16.842f, 3.318f)
                lineTo(18.004f, 2.746f)
                lineTo(17.116f, 3.682f)
                curveTo(17.137f, 3.716f, 17.157f, 3.75f, 17.176f, 3.784f)
                lineTo(18.44f, 3.492f)
                lineTo(17.357f, 4.201f)
                curveTo(17.369f, 4.238f, 17.381f, 4.276f, 17.391f, 4.314f)
                lineTo(18.689f, 4.318f)
                lineTo(17.47f, 4.761f)
                curveTo(17.473f, 4.8f, 17.475f, 4.839f, 17.476f, 4.878f)
                lineTo(18.74f, 5.178f)
                lineTo(17.449f, 5.332f)
                curveTo(17.443f, 5.37f, 17.436f, 5.408f, 17.428f, 5.446f)
                lineTo(18.589f, 6.027f)
                lineTo(17.296f, 5.882f)
                curveTo(17.281f, 5.918f, 17.266f, 5.953f, 17.249f, 5.988f)
                lineTo(18.244f, 6.819f)
                lineTo(17.018f, 6.382f)
                curveTo(16.996f, 6.413f, 16.972f, 6.444f, 16.948f, 6.474f)
                lineTo(17.723f, 7.51f)
                lineTo(16.632f, 6.805f)
                curveTo(16.603f, 6.83f, 16.573f, 6.855f, 16.543f, 6.878f)
                lineTo(17.056f, 8.064f)
                lineTo(16.158f, 7.129f)
                curveTo(16.124f, 7.147f, 16.09f, 7.164f, 16.055f, 7.18f)
                lineTo(16.277f, 8.451f)
                lineTo(15.622f, 7.337f)
                curveTo(15.584f, 7.346f, 15.547f, 7.355f, 15.509f, 7.363f)
                lineTo(15.429f, 8.65f)
                lineTo(15.051f, 7.416f)
                close()
                moveTo(14.966f, 6.509f)
                curveTo(15.842f, 6.509f, 16.551f, 5.81f, 16.551f, 4.947f)
                curveTo(16.551f, 4.085f, 15.842f, 3.385f, 14.966f, 3.385f)
                curveTo(14.091f, 3.385f, 13.381f, 4.085f, 13.381f, 4.947f)
                curveTo(13.381f, 5.81f, 14.091f, 6.509f, 14.966f, 6.509f)
                close()
                moveTo(15.878f, 4.993f)
                curveTo(15.878f, 5.486f, 15.478f, 5.886f, 14.985f, 5.886f)
                curveTo(14.491f, 5.886f, 14.091f, 5.486f, 14.091f, 4.993f)
                curveTo(14.091f, 4.5f, 14.491f, 4.1f, 14.985f, 4.1f)
                curveTo(15.478f, 4.1f, 15.878f, 4.5f, 15.878f, 4.993f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun RwandaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Rwanda,
            contentDescription = "Rwanda Flag"
        )
    }
}
