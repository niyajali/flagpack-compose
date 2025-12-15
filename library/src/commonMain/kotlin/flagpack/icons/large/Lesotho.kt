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
 * Lesotho Flag (32x24dp)
 *
 * - ISO Alpha-2: LS
 * - ISO Alpha-3: LSO
 * - ISO Numeric: 426
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Lesotho: ImageVector by lazy {
    ImageVector.Builder(
        name = "Lesotho:LS:LSO:426:Large",
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
                fill = SolidColor(Color(0xFF55BA07)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.25f, 8.24f)
                curveTo(14.727f, 8.381f, 14.451f, 8.742f, 14.451f, 9.381f)
                curveTo(14.451f, 10.111f, 14.81f, 10.797f, 15.25f, 11.151f)
                verticalLineTo(8.24f)
                close()
                moveTo(16.5f, 11.131f)
                curveTo(16.928f, 10.773f, 17.272f, 10.1f, 17.272f, 9.383f)
                curveTo(17.272f, 8.762f, 17f, 8.403f, 16.5f, 8.253f)
                verticalLineTo(11.131f)
                close()
                moveTo(16.458f, 7.732f)
                curveTo(17.276f, 7.914f, 17.869f, 8.471f, 17.869f, 9.377f)
                curveTo(17.869f, 10.036f, 17.555f, 10.836f, 17.069f, 11.386f)
                lineTo(19.503f, 13.773f)
                lineTo(20.104f, 13.575f)
                lineTo(21f, 14.935f)
                curveTo(21f, 14.935f, 18.734f, 16f, 15.933f, 16f)
                curveTo(13.133f, 16f, 11f, 14.935f, 11f, 14.935f)
                lineTo(11.763f, 13.773f)
                lineTo(12.38f, 13.975f)
                lineTo(14.637f, 11.427f)
                curveTo(14.13f, 10.877f, 13.801f, 10.052f, 13.801f, 9.377f)
                curveTo(13.801f, 8.439f, 14.436f, 7.875f, 15.299f, 7.714f)
                curveTo(15.394f, 7.49f, 15.616f, 7.333f, 15.875f, 7.333f)
                curveTo(16.14f, 7.333f, 16.367f, 7.499f, 16.458f, 7.732f)
                close()
                moveTo(12.002f, 14.296f)
                lineTo(11.748f, 14.649f)
                horizontalLineTo(12.242f)
                lineTo(12.002f, 14.296f)
                close()
                moveTo(12.291f, 14.788f)
                lineTo(11.855f, 14.876f)
                lineTo(12.291f, 15.028f)
                verticalLineTo(14.788f)
                close()
                moveTo(12.513f, 14.28f)
                lineTo(12.736f, 14.801f)
                lineTo(13.289f, 14.65f)
                lineTo(13.18f, 14.44f)
                lineTo(12.513f, 14.28f)
                close()
                moveTo(13.717f, 15.318f)
                lineTo(12.904f, 15.158f)
                lineTo(12.811f, 15.001f)
                lineTo(13.424f, 14.868f)
                lineTo(13.717f, 15.318f)
                close()
                moveTo(13.764f, 14.573f)
                lineTo(14.017f, 15.028f)
                lineTo(14.572f, 14.859f)
                lineTo(14.418f, 14.655f)
                lineTo(13.764f, 14.573f)
                close()
                moveTo(14.22f, 15.409f)
                lineTo(14.12f, 15.221f)
                lineTo(14.735f, 15.057f)
                lineTo(15.089f, 15.489f)
                lineTo(14.22f, 15.409f)
                close()
                moveTo(15.368f, 15.097f)
                lineTo(16.16f, 14.887f)
                lineTo(16.063f, 14.707f)
                horizontalLineTo(15.034f)
                lineTo(15.368f, 15.097f)
                close()
                moveTo(15.652f, 15.497f)
                lineTo(15.526f, 15.302f)
                lineTo(16.287f, 15.053f)
                lineTo(16.691f, 15.497f)
                horizontalLineTo(15.652f)
                close()
                moveTo(16.615f, 14.721f)
                lineTo(16.858f, 15.019f)
                lineTo(17.517f, 14.791f)
                lineTo(17.434f, 14.635f)
                lineTo(16.615f, 14.721f)
                close()
                moveTo(18.045f, 15.341f)
                lineTo(17.159f, 15.439f)
                lineTo(17.028f, 15.219f)
                lineTo(17.698f, 14.999f)
                lineTo(18.045f, 15.341f)
                close()
                moveTo(17.989f, 14.577f)
                lineTo(18.237f, 14.882f)
                lineTo(18.831f, 14.577f)
                lineTo(18.666f, 14.485f)
                lineTo(17.989f, 14.577f)
                close()
                moveTo(18.503f, 15.259f)
                lineTo(18.395f, 15.094f)
                lineTo(18.961f, 14.754f)
                lineTo(19.249f, 15.094f)
                lineTo(18.503f, 15.259f)
                close()
                moveTo(19.065f, 14.31f)
                lineTo(19.424f, 14.653f)
                lineTo(19.774f, 14.31f)
                lineTo(19.663f, 14.17f)
                lineTo(19.065f, 14.31f)
                close()
                moveTo(19.635f, 14.77f)
                lineTo(19.927f, 14.481f)
                lineTo(20.138f, 14.77f)
                lineTo(19.635f, 14.932f)
                verticalLineTo(14.77f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LesothoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Lesotho,
            contentDescription = "Lesotho Flag"
        )
    }
}
