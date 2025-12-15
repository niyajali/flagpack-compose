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
 * Bhutan Flag (16x12dp)
 *
 * - ISO Alpha-2: BT
 * - ISO Alpha-3: BTN
 * - ISO Numeric: 064
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Bhutan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bhutan:BT:BTN:064:Small",
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
                fill = SolidColor(Color(0xFFFF6230)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(16f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.191f, 8.164f)
                curveTo(2.191f, 8.164f, 1.44f, 8.849f, 2.035f, 8.885f)
                curveTo(2.631f, 8.921f, 2.52f, 9.285f, 3.007f, 8.887f)
                curveTo(3.495f, 8.49f, 3.022f, 8.95f, 3.672f, 8.86f)
                curveTo(4.322f, 8.77f, 4.647f, 7.977f, 4.99f, 8.031f)
                curveTo(5.333f, 8.085f, 5.134f, 7.959f, 5.423f, 8.302f)
                curveTo(5.712f, 8.645f, 6.22f, 7.916f, 5.949f, 8.422f)
                curveTo(5.678f, 8.928f, 5.57f, 9.433f, 5.967f, 9.415f)
                curveTo(6.364f, 9.397f, 6.527f, 9.162f, 6.708f, 8.91f)
                curveTo(6.888f, 8.657f, 8.297f, 9.524f, 7.647f, 8.657f)
                curveTo(6.997f, 7.79f, 6.744f, 8.752f, 6.69f, 8.3f)
                curveTo(6.636f, 7.849f, 6.507f, 7.614f, 6.814f, 7.831f)
                curveTo(7.121f, 8.048f, 7.843f, 7.993f, 7.283f, 7.452f)
                curveTo(6.724f, 6.91f, 6.801f, 6.766f, 6.639f, 6.91f)
                curveTo(6.476f, 7.054f, 6.079f, 6.368f, 6.639f, 6.278f)
                curveTo(7.198f, 6.188f, 7.843f, 6.495f, 8.06f, 6.657f)
                curveTo(8.277f, 6.82f, 8.945f, 6.621f, 9.089f, 6.946f)
                curveTo(9.234f, 7.271f, 9.721f, 7.325f, 9.848f, 7.524f)
                curveTo(9.974f, 7.723f, 9.884f, 8.698f, 10.913f, 8.644f)
                curveTo(11.942f, 8.589f, 12.267f, 8.066f, 11.834f, 7.65f)
                curveTo(11.401f, 7.235f, 11.437f, 6.477f, 10.985f, 6.838f)
                curveTo(10.534f, 7.199f, 9.884f, 7.145f, 9.884f, 6.711f)
                curveTo(9.884f, 6.278f, 10.082f, 6.206f, 10.046f, 5.863f)
                curveTo(10.01f, 5.519f, 9.974f, 5.664f, 10.642f, 5.682f)
                curveTo(11.31f, 5.7f, 11.075f, 5.682f, 11.563f, 5.447f)
                curveTo(12.051f, 5.213f, 12.376f, 6.242f, 12.574f, 5.483f)
                curveTo(12.773f, 4.725f, 12.502f, 3.948f, 11.96f, 4.255f)
                curveTo(11.419f, 4.562f, 11.437f, 5.321f, 10.75f, 4.725f)
                curveTo(10.064f, 4.129f, 9.739f, 4.436f, 9.956f, 4.111f)
                curveTo(10.173f, 3.786f, 9.902f, 3.551f, 10.389f, 3.768f)
                curveTo(10.877f, 3.985f, 10.733f, 4.057f, 11.148f, 4.111f)
                curveTo(11.563f, 4.165f, 13.766f, 4.436f, 13.279f, 3.985f)
                curveTo(12.791f, 3.533f, 12.323f, 3.607f, 12.251f, 3.318f)
                curveTo(12.179f, 3.029f, 12.476f, 3.101f, 12.909f, 2.939f)
                curveTo(13.343f, 2.776f, 13.162f, 1.945f, 12.747f, 2.108f)
                curveTo(12.331f, 2.27f, 12.367f, 2.993f, 11.518f, 2.541f)
                curveTo(10.544f, 2.965f, 10.695f, 2.752f, 10.199f, 2.034f)
                curveTo(9.766f, 1.691f, 9.531f, 1.673f, 8.791f, 2.07f)
                curveTo(8.206f, 2.311f, 7.717f, 2.757f, 8.024f, 3.353f)
                curveTo(8.332f, 3.948f, 9.063f, 5.071f, 8.665f, 5.143f)
                curveTo(8.268f, 5.215f, 6.842f, 4.15f, 6.011f, 4.71f)
                curveTo(5.18f, 5.269f, 4.727f, 5.814f, 4.456f, 6.464f)
                curveTo(4.185f, 7.114f, 3.309f, 7.493f, 3.092f, 7.493f)
                curveTo(2.875f, 7.493f, 2.57f, 7.876f, 2.191f, 8.164f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BhutanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Bhutan,
            contentDescription = "Bhutan Flag"
        )
    }
}
