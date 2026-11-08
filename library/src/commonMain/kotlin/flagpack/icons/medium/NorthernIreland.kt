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
 * Northern Ireland Flag (20x15dp)
 *
 * - ISO Alpha-2: GB-NIR
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.NorthernIreland: ImageVector by lazy {
    ImageVector.Builder(
        name = "Northern Ireland:GB-NIR:::Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
            path(fill = SolidColor(Color.White)) {
                moveTo(-2.227f, 13.928f)
                lineTo(2.174f, 15.79f)
                lineTo(20.1f, 2.024f)
                lineTo(22.421f, -0.742f)
                lineTo(17.715f, -1.364f)
                lineTo(10.403f, 4.568f)
                lineTo(4.519f, 8.565f)
                lineTo(-2.227f, 13.928f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.624f, 15.232f)
                lineTo(0.618f, 16.313f)
                lineTo(21.588f, -0.999f)
                horizontalLineTo(18.44f)
                lineTo(-1.624f, 15.232f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(22.227f, 13.928f)
                lineTo(17.826f, 15.79f)
                lineTo(-0.1f, 2.024f)
                lineTo(-2.421f, -0.742f)
                lineTo(2.285f, -1.364f)
                lineTo(9.596f, 4.568f)
                lineTo(15.481f, 8.565f)
                lineTo(22.227f, 13.928f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(22.077f, 14.864f)
                lineTo(19.835f, 15.944f)
                lineTo(10.905f, 8.532f)
                lineTo(8.258f, 7.704f)
                lineTo(-2.645f, -0.733f)
                horizontalLineTo(0.504f)
                lineTo(11.4f, 7.504f)
                lineTo(14.295f, 8.497f)
                lineTo(22.077f, 14.864f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.361f, -1.25f)
                horizontalLineTo(7.639f)
                verticalLineTo(5f)
                horizontalLineTo(-1.233f)
                verticalLineTo(10f)
                horizontalLineTo(7.639f)
                verticalLineTo(16.25f)
                horizontalLineTo(12.361f)
                verticalLineTo(10f)
                horizontalLineTo(21.267f)
                verticalLineTo(5f)
                horizontalLineTo(12.361f)
                verticalLineTo(-1.25f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(12.361f, -1.25f)
                horizontalLineTo(7.639f)
                verticalLineTo(5f)
                horizontalLineTo(-1.233f)
                verticalLineTo(10f)
                horizontalLineTo(7.639f)
                verticalLineTo(16.25f)
                horizontalLineTo(12.361f)
                verticalLineTo(10f)
                horizontalLineTo(21.267f)
                verticalLineTo(5f)
                horizontalLineTo(12.361f)
                verticalLineTo(-1.25f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(7.639f, -1.25f)
                verticalLineTo(-2.5f)
                horizontalLineTo(6.389f)
                verticalLineTo(-1.25f)
                horizontalLineTo(7.639f)
                close()
                moveTo(12.361f, -1.25f)
                horizontalLineTo(13.611f)
                verticalLineTo(-2.5f)
                horizontalLineTo(12.361f)
                verticalLineTo(-1.25f)
                close()
                moveTo(7.639f, 5f)
                verticalLineTo(6.25f)
                horizontalLineTo(8.889f)
                verticalLineTo(5f)
                horizontalLineTo(7.639f)
                close()
                moveTo(-1.233f, 5f)
                verticalLineTo(3.75f)
                horizontalLineTo(-2.483f)
                verticalLineTo(5f)
                horizontalLineTo(-1.233f)
                close()
                moveTo(-1.233f, 10f)
                horizontalLineTo(-2.483f)
                verticalLineTo(11.25f)
                horizontalLineTo(-1.233f)
                verticalLineTo(10f)
                close()
                moveTo(7.639f, 10f)
                horizontalLineTo(8.889f)
                verticalLineTo(8.75f)
                horizontalLineTo(7.639f)
                verticalLineTo(10f)
                close()
                moveTo(7.639f, 16.25f)
                horizontalLineTo(6.389f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.639f)
                verticalLineTo(16.25f)
                close()
                moveTo(12.361f, 16.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.611f)
                verticalLineTo(16.25f)
                horizontalLineTo(12.361f)
                close()
                moveTo(12.361f, 10f)
                verticalLineTo(8.75f)
                horizontalLineTo(11.111f)
                verticalLineTo(10f)
                horizontalLineTo(12.361f)
                close()
                moveTo(21.267f, 10f)
                verticalLineTo(11.25f)
                horizontalLineTo(22.517f)
                verticalLineTo(10f)
                horizontalLineTo(21.267f)
                close()
                moveTo(21.267f, 5f)
                horizontalLineTo(22.517f)
                verticalLineTo(3.75f)
                horizontalLineTo(21.267f)
                verticalLineTo(5f)
                close()
                moveTo(12.361f, 5f)
                horizontalLineTo(11.111f)
                verticalLineTo(6.25f)
                horizontalLineTo(12.361f)
                verticalLineTo(5f)
                close()
                moveTo(7.639f, 0f)
                horizontalLineTo(12.361f)
                verticalLineTo(-2.5f)
                horizontalLineTo(7.639f)
                verticalLineTo(0f)
                close()
                moveTo(8.889f, 5f)
                verticalLineTo(-1.25f)
                horizontalLineTo(6.389f)
                verticalLineTo(5f)
                horizontalLineTo(8.889f)
                close()
                moveTo(-1.233f, 6.25f)
                horizontalLineTo(7.639f)
                verticalLineTo(3.75f)
                horizontalLineTo(-1.233f)
                verticalLineTo(6.25f)
                close()
                moveTo(0.017f, 10f)
                verticalLineTo(5f)
                horizontalLineTo(-2.483f)
                verticalLineTo(10f)
                horizontalLineTo(0.017f)
                close()
                moveTo(7.639f, 8.75f)
                horizontalLineTo(-1.233f)
                verticalLineTo(11.25f)
                horizontalLineTo(7.639f)
                verticalLineTo(8.75f)
                close()
                moveTo(8.889f, 16.25f)
                verticalLineTo(10f)
                horizontalLineTo(6.389f)
                verticalLineTo(16.25f)
                horizontalLineTo(8.889f)
                close()
                moveTo(12.361f, 15f)
                horizontalLineTo(7.639f)
                verticalLineTo(17.5f)
                horizontalLineTo(12.361f)
                verticalLineTo(15f)
                close()
                moveTo(11.111f, 10f)
                verticalLineTo(16.25f)
                horizontalLineTo(13.611f)
                verticalLineTo(10f)
                horizontalLineTo(11.111f)
                close()
                moveTo(21.267f, 8.75f)
                horizontalLineTo(12.361f)
                verticalLineTo(11.25f)
                horizontalLineTo(21.267f)
                verticalLineTo(8.75f)
                close()
                moveTo(20.017f, 5f)
                verticalLineTo(10f)
                horizontalLineTo(22.517f)
                verticalLineTo(5f)
                horizontalLineTo(20.017f)
                close()
                moveTo(12.361f, 6.25f)
                horizontalLineTo(21.267f)
                verticalLineTo(3.75f)
                horizontalLineTo(12.361f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.111f, -1.25f)
                verticalLineTo(5f)
                horizontalLineTo(13.611f)
                verticalLineTo(-1.25f)
                horizontalLineTo(11.111f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthernIrelandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.NorthernIreland,
            contentDescription = "Northern Ireland Flag"
        )
    }
}
