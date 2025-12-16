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
 * Lebanon Flag (32x24dp)
 *
 * - ISO Alpha-2: LB
 * - ISO Alpha-3: LBN
 * - ISO Numeric: 422
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Lebanon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Lebanon:LB:LBN:422:Large",
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
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(32f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                close()
                moveTo(32f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 6f)
                horizontalLineTo(32f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF52AB0B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.515f, 12.513f)
                curveTo(21.589f, 13.381f, 18.389f, 12.153f, 18.389f, 12.501f)
                curveTo(18.389f, 12.848f, 21.817f, 13.458f, 21.812f, 14.235f)
                curveTo(21.806f, 15.012f, 17.746f, 14.013f, 18.656f, 14.363f)
                curveTo(19.567f, 14.712f, 21.522f, 15.549f, 21.3f, 16.071f)
                curveTo(20.825f, 17.184f, 17.674f, 15.298f, 17.411f, 15.67f)
                curveTo(16.988f, 16.27f, 19.737f, 17.669f, 19.714f, 17.802f)
                curveTo(19.669f, 18.059f, 17.837f, 17.4f, 17.411f, 17.932f)
                curveTo(17.067f, 17.835f, 16.908f, 17.371f, 16.801f, 17.31f)
                lineTo(16.125f, 8.587f)
                curveTo(16.125f, 8.587f, 16.732f, 16.8f, 15.956f, 17.036f)
                curveTo(15.18f, 17.272f, 13.025f, 17.991f, 12.962f, 17.632f)
                curveTo(12.939f, 17.498f, 15.557f, 16.27f, 15.134f, 15.67f)
                curveTo(14.823f, 15.228f, 11.663f, 16.795f, 11.461f, 15.888f)
                curveTo(10.563f, 15.241f, 14.37f, 14.68f, 14.37f, 14.018f)
                curveTo(14.37f, 13.356f, 10.887f, 14.802f, 11.304f, 13.88f)
                curveTo(11.72f, 12.958f, 14.509f, 12.628f, 14.561f, 12.501f)
                curveTo(14.656f, 12.267f, 11.461f, 12.864f, 11.461f, 12.501f)
                curveTo(11.461f, 11.813f, 13.373f, 11.678f, 14.561f, 11.059f)
                curveTo(14.631f, 10.352f, 11.68f, 11.754f, 11.461f, 11.188f)
                curveTo(11.242f, 10.622f, 15.232f, 9.155f, 15.134f, 9.041f)
                curveTo(14.98f, 8.86f, 11.764f, 9.675f, 12.295f, 9.247f)
                curveTo(13.324f, 8.417f, 15.333f, 7.289f, 15.795f, 6.988f)
                curveTo(15.795f, 6.988f, 15.851f, 6.874f, 15.91f, 6.913f)
                curveTo(15.97f, 6.874f, 16.036f, 6.832f, 16.036f, 6.832f)
                curveTo(16.036f, 6.832f, 16.036f, 7.542f, 16.026f, 6.988f)
                curveTo(16.016f, 6.434f, 20.735f, 8.859f, 20.789f, 9.474f)
                curveTo(20.851f, 10.192f, 17.873f, 8.932f, 17.943f, 9.638f)
                curveTo(18.548f, 10.014f, 20.27f, 10.74f, 20.982f, 11.059f)
                curveTo(21.305f, 11.203f, 18.604f, 10.752f, 18.661f, 10.974f)
                curveTo(18.807f, 11.538f, 21.437f, 11.609f, 21.515f, 12.513f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LebanonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Lebanon,
            contentDescription = "Lebanon Flag"
        )
    }
}
