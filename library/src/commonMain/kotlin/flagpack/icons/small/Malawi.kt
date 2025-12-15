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
 * Malawi Flag (16x12dp)
 *
 * - ISO Alpha-2: MW
 * - ISO Alpha-3: MWI
 * - ISO Numeric: 454
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Malawi: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malawi:MW:MWI:454:Small",
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
                fill = SolidColor(Color(0xFFE11C1B)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.001f, 6.973f)
                verticalLineTo(6.972f)
                lineTo(1.996f, 6.973f)
                lineTo(2.001f, 6.973f)
                close()
                moveTo(2.315f, 5.063f)
                horizontalLineTo(2.366f)
                lineTo(2.288f, 5.051f)
                lineTo(2.315f, 5.063f)
                close()
                moveTo(3.779f, 5.063f)
                curveTo(3.805f, 5.013f, 3.832f, 4.963f, 3.861f, 4.914f)
                lineTo(2.716f, 4.156f)
                lineTo(4.066f, 4.596f)
                curveTo(4.142f, 4.49f, 4.223f, 4.388f, 4.309f, 4.289f)
                lineTo(3.317f, 3.344f)
                lineTo(4.581f, 4.004f)
                curveTo(4.674f, 3.915f, 4.771f, 3.83f, 4.872f, 3.749f)
                lineTo(4.07f, 2.641f)
                lineTo(5.203f, 3.508f)
                curveTo(5.309f, 3.437f, 5.418f, 3.371f, 5.53f, 3.309f)
                lineTo(4.952f, 2.068f)
                lineTo(5.909f, 3.119f)
                curveTo(6.023f, 3.068f, 6.14f, 3.021f, 6.259f, 2.978f)
                lineTo(5.934f, 1.646f)
                lineTo(6.675f, 2.848f)
                curveTo(6.794f, 2.816f, 6.916f, 2.788f, 7.039f, 2.765f)
                lineTo(6.985f, 1.387f)
                lineTo(7.478f, 2.699f)
                curveTo(7.6f, 2.686f, 7.723f, 2.677f, 7.847f, 2.672f)
                lineTo(8.07f, 1.3f)
                lineTo(8.294f, 2.672f)
                curveTo(8.418f, 2.677f, 8.541f, 2.687f, 8.663f, 2.7f)
                lineTo(9.156f, 1.387f)
                lineTo(9.102f, 2.767f)
                curveTo(9.224f, 2.79f, 9.345f, 2.818f, 9.464f, 2.85f)
                lineTo(10.207f, 1.646f)
                lineTo(9.881f, 2.982f)
                curveTo(9.999f, 3.024f, 10.116f, 3.072f, 10.229f, 3.122f)
                lineTo(11.189f, 2.068f)
                lineTo(10.609f, 3.313f)
                curveTo(10.72f, 3.375f, 10.828f, 3.441f, 10.933f, 3.511f)
                lineTo(12.071f, 2.641f)
                lineTo(11.265f, 3.754f)
                curveTo(11.365f, 3.835f, 11.462f, 3.919f, 11.554f, 4.007f)
                lineTo(12.824f, 3.344f)
                lineTo(11.827f, 4.294f)
                curveTo(11.912f, 4.392f, 11.992f, 4.493f, 12.067f, 4.598f)
                lineTo(13.425f, 4.156f)
                lineTo(12.273f, 4.919f)
                curveTo(12.3f, 4.966f, 12.327f, 5.015f, 12.352f, 5.063f)
                horizontalLineTo(11.37f)
                curveTo(10.693f, 4.125f, 9.455f, 3.497f, 8.041f, 3.497f)
                curveTo(6.626f, 3.497f, 5.389f, 4.125f, 4.712f, 5.063f)
                horizontalLineTo(3.779f)
                close()
                moveTo(5.28f, 5.063f)
                curveTo(5.921f, 4.402f, 6.928f, 3.976f, 8.061f, 3.976f)
                curveTo(9.193f, 3.976f, 10.201f, 4.402f, 10.842f, 5.063f)
                horizontalLineTo(5.28f)
                close()
                moveTo(13.774f, 5.063f)
                horizontalLineTo(13.826f)
                lineTo(13.853f, 5.051f)
                lineTo(13.774f, 5.063f)
                close()
                moveTo(14.141f, 6.972f)
                lineTo(14.145f, 6.973f)
                lineTo(14.141f, 6.973f)
                verticalLineTo(6.972f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MalawiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Malawi,
            contentDescription = "Malawi Flag"
        )
    }
}
