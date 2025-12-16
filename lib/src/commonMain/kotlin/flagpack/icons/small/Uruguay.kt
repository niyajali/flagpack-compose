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
 * Uruguay Flag (16x12dp)
 *
 * - ISO Alpha-2: UY
 * - ISO Alpha-3: URY
 * - ISO Numeric: 858
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Uruguay: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uruguay:UY:URY:858:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 10f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.25f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.614f, 5.519f)
                curveTo(4.614f, 5.519f, 4.103f, 6.578f, 3.654f, 6.795f)
                curveTo(3.848f, 6.309f, 3.919f, 5.318f, 3.919f, 5.318f)
                curveTo(3.919f, 5.318f, 2.753f, 5.78f, 2.344f, 5.696f)
                curveTo(2.836f, 5.352f, 3.519f, 4.715f, 3.519f, 4.715f)
                curveTo(3.519f, 4.715f, 2.01f, 4.222f, 2.047f, 4.012f)
                curveTo(2.728f, 4.134f, 3.665f, 4.001f, 3.665f, 4.001f)
                curveTo(3.665f, 4.001f, 2.606f, 2.731f, 2.714f, 2.637f)
                curveTo(2.875f, 2.794f, 4.144f, 3.456f, 4.144f, 3.456f)
                curveTo(4.144f, 3.456f, 4.236f, 2.327f, 4.509f, 1.946f)
                curveTo(4.542f, 2.215f, 4.925f, 3.432f, 4.925f, 3.432f)
                curveTo(4.925f, 3.432f, 5.695f, 2.661f, 6.123f, 2.661f)
                curveTo(5.935f, 2.894f, 5.49f, 3.917f, 5.49f, 3.917f)
                curveTo(5.49f, 3.917f, 6.599f, 3.899f, 7.02f, 4.107f)
                curveTo(6.51f, 4.18f, 5.615f, 4.628f, 5.615f, 4.628f)
                curveTo(5.615f, 4.628f, 6.78f, 5.512f, 6.674f, 5.696f)
                curveTo(6.049f, 5.39f, 5.326f, 5.288f, 5.326f, 5.288f)
                curveTo(5.326f, 5.288f, 5.525f, 6.517f, 5.364f, 6.795f)
                curveTo(5.206f, 6.386f, 4.614f, 5.519f, 4.614f, 5.519f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.25f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.547f, 4.946f)
                curveTo(4.823f, 4.946f, 5.047f, 4.722f, 5.047f, 4.446f)
                curveTo(5.047f, 4.17f, 4.823f, 3.946f, 4.547f, 3.946f)
                curveTo(4.271f, 3.946f, 4.047f, 4.17f, 4.047f, 4.446f)
                curveTo(4.047f, 4.722f, 4.271f, 4.946f, 4.547f, 4.946f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UruguayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Uruguay,
            contentDescription = "Uruguay Flag"
        )
    }
}
