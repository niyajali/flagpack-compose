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
 * Lesotho Flag (16x12dp)
 *
 * - ISO Alpha-2: LS
 * - ISO Alpha-3: LSO
 * - ISO Numeric: 426
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Lesotho: ImageVector by lazy {
    ImageVector.Builder(
        name = "Lesotho:LS:LSO:426:Small",
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
                fill = SolidColor(Color(0xFF55BA07)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 4f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.625f, 4.12f)
                curveTo(7.364f, 4.19f, 7.226f, 4.371f, 7.226f, 4.69f)
                curveTo(7.226f, 5.056f, 7.405f, 5.398f, 7.625f, 5.575f)
                verticalLineTo(4.12f)
                close()
                moveTo(8.25f, 5.565f)
                curveTo(8.464f, 5.386f, 8.636f, 5.05f, 8.636f, 4.691f)
                curveTo(8.636f, 4.381f, 8.5f, 4.201f, 8.25f, 4.127f)
                verticalLineTo(5.565f)
                close()
                moveTo(8.229f, 3.866f)
                curveTo(8.638f, 3.957f, 8.934f, 4.236f, 8.934f, 4.688f)
                curveTo(8.934f, 5.018f, 8.778f, 5.418f, 8.535f, 5.693f)
                lineTo(9.752f, 6.886f)
                lineTo(10.052f, 6.788f)
                lineTo(10.5f, 7.467f)
                curveTo(10.5f, 7.467f, 9.367f, 8f, 7.967f, 8f)
                curveTo(6.566f, 8f, 5.5f, 7.467f, 5.5f, 7.467f)
                lineTo(5.882f, 6.886f)
                lineTo(6.19f, 6.987f)
                lineTo(7.319f, 5.714f)
                curveTo(7.065f, 5.439f, 6.9f, 5.026f, 6.9f, 4.688f)
                curveTo(6.9f, 4.22f, 7.218f, 3.938f, 7.65f, 3.857f)
                curveTo(7.697f, 3.745f, 7.808f, 3.667f, 7.938f, 3.667f)
                curveTo(8.07f, 3.667f, 8.184f, 3.749f, 8.229f, 3.866f)
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
            imageVector = FlagIcons.Small.Lesotho,
            contentDescription = "Lesotho Flag"
        )
    }
}
