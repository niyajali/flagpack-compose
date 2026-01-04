package flagpack.icons.small

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
 * Antarctica Flag (16x12dp)
 *
 * - ISO Alpha-2: AQ
 * - ISO Alpha-3: ATA
 * - ISO Numeric: 010
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Antarctica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antarctica:AQ:ATA:010:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5196ED)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.359f, 3.947f)
                curveTo(4.359f, 3.947f, 5.391f, 4.513f, 5.534f, 4.67f)
                curveTo(5.678f, 4.826f, 5.908f, 5.402f, 6.266f, 5.076f)
                curveTo(6.625f, 4.751f, 6.984f, 5.004f, 6.984f, 4.486f)
                curveTo(6.984f, 3.968f, 7.519f, 2.766f, 8.296f, 3.067f)
                curveTo(9.073f, 3.368f, 9.712f, 3.18f, 9.892f, 3.3f)
                curveTo(10.071f, 3.421f, 10.501f, 4.019f, 10.836f, 4.019f)
                curveTo(11.171f, 4.019f, 11.338f, 4.368f, 11.362f, 4.874f)
                curveTo(11.386f, 5.38f, 11.255f, 5.429f, 11.565f, 5.489f)
                curveTo(11.876f, 5.549f, 11.996f, 5.778f, 11.84f, 6.079f)
                curveTo(11.685f, 6.381f, 11.697f, 6.248f, 11.721f, 6.561f)
                curveTo(11.745f, 6.875f, 11.41f, 8.722f, 10.382f, 8.903f)
                curveTo(9.353f, 9.084f, 8.379f, 8.987f, 8.642f, 8.638f)
                curveTo(8.905f, 8.288f, 9.269f, 7.886f, 8.731f, 7.802f)
                curveTo(8.193f, 7.718f, 7.854f, 7.646f, 7.316f, 7.79f)
                curveTo(6.778f, 7.935f, 6.216f, 8.164f, 5.881f, 7.73f)
                curveTo(5.546f, 7.296f, 5.618f, 6.983f, 5.343f, 6.778f)
                curveTo(5.068f, 6.573f, 4.733f, 6.61f, 5.008f, 6.212f)
                curveTo(5.283f, 5.814f, 5.51f, 5.963f, 5.283f, 5.65f)
                curveTo(5.056f, 5.336f, 4.199f, 5.2f, 4.199f, 4.887f)
                curveTo(4.199f, 4.573f, 3.653f, 3.887f, 4.359f, 3.947f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5F8FB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.359f, 3.947f)
                curveTo(4.359f, 3.947f, 5.391f, 4.513f, 5.534f, 4.67f)
                curveTo(5.678f, 4.826f, 5.908f, 5.402f, 6.266f, 5.076f)
                curveTo(6.625f, 4.751f, 6.984f, 5.004f, 6.984f, 4.486f)
                curveTo(6.984f, 3.968f, 7.519f, 2.766f, 8.296f, 3.067f)
                curveTo(9.073f, 3.368f, 9.712f, 3.18f, 9.892f, 3.3f)
                curveTo(10.071f, 3.421f, 10.501f, 4.019f, 10.836f, 4.019f)
                curveTo(11.171f, 4.019f, 11.338f, 4.368f, 11.362f, 4.874f)
                curveTo(11.386f, 5.38f, 11.255f, 5.429f, 11.565f, 5.489f)
                curveTo(11.876f, 5.549f, 11.996f, 5.778f, 11.84f, 6.079f)
                curveTo(11.685f, 6.381f, 11.697f, 6.248f, 11.721f, 6.561f)
                curveTo(11.745f, 6.875f, 11.41f, 8.722f, 10.382f, 8.903f)
                curveTo(9.353f, 9.084f, 8.379f, 8.987f, 8.642f, 8.638f)
                curveTo(8.905f, 8.288f, 9.269f, 7.886f, 8.731f, 7.802f)
                curveTo(8.193f, 7.718f, 7.854f, 7.646f, 7.316f, 7.79f)
                curveTo(6.778f, 7.935f, 6.216f, 8.164f, 5.881f, 7.73f)
                curveTo(5.546f, 7.296f, 5.618f, 6.983f, 5.343f, 6.778f)
                curveTo(5.068f, 6.573f, 4.733f, 6.61f, 5.008f, 6.212f)
                curveTo(5.283f, 5.814f, 5.51f, 5.963f, 5.283f, 5.65f)
                curveTo(5.056f, 5.336f, 4.199f, 5.2f, 4.199f, 4.887f)
                curveTo(4.199f, 4.573f, 3.653f, 3.887f, 4.359f, 3.947f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AntarcticaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Antarctica,
            contentDescription = "Antarctica Flag"
        )
    }
}
