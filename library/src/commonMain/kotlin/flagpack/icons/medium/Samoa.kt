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
 * Samoa Flag (20x15dp)
 *
 * - ISO Alpha-2: WS
 * - ISO Alpha-3: WSM
 * - ISO Numeric: 882
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Samoa: ImageVector by lazy {
    ImageVector.Builder(
        name = "Samoa:WS:WSM:882:Medium",
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
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8.75f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.229f, 4.857f)
                lineTo(1.566f, 5.257f)
                lineTo(1.717f, 4.477f)
                lineTo(1.165f, 3.893f)
                lineTo(1.912f, 3.861f)
                lineTo(2.229f, 3.132f)
                lineTo(2.545f, 3.861f)
                horizontalLineTo(3.29f)
                lineTo(2.74f, 4.477f)
                lineTo(2.906f, 5.257f)
                lineTo(2.229f, 4.857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.229f, 4.857f)
                lineTo(6.566f, 5.257f)
                lineTo(6.717f, 4.477f)
                lineTo(6.165f, 3.893f)
                lineTo(6.912f, 3.861f)
                lineTo(7.229f, 3.132f)
                lineTo(7.545f, 3.861f)
                horizontalLineTo(8.29f)
                lineTo(7.74f, 4.477f)
                lineTo(7.906f, 5.257f)
                lineTo(7.229f, 4.857f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.666f, 2.586f)
                lineTo(4.042f, 2.963f)
                lineTo(4.185f, 2.228f)
                lineTo(3.665f, 1.678f)
                lineTo(4.369f, 1.649f)
                lineTo(4.666f, 0.963f)
                lineTo(4.963f, 1.649f)
                horizontalLineTo(5.665f)
                lineTo(5.147f, 2.228f)
                lineTo(5.303f, 2.963f)
                lineTo(4.666f, 2.586f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.341f, 5.266f)
                lineTo(4.952f, 5.501f)
                lineTo(5.041f, 5.042f)
                lineTo(4.716f, 4.698f)
                lineTo(5.155f, 4.68f)
                lineTo(5.341f, 4.251f)
                lineTo(5.527f, 4.68f)
                horizontalLineTo(5.966f)
                lineTo(5.642f, 5.042f)
                lineTo(5.74f, 5.501f)
                lineTo(5.341f, 5.266f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEFFFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.63f, 8.018f)
                lineTo(3.695f, 8.582f)
                lineTo(3.908f, 7.48f)
                lineTo(3.13f, 6.656f)
                lineTo(4.184f, 6.611f)
                lineTo(4.63f, 5.582f)
                lineTo(5.077f, 6.611f)
                horizontalLineTo(6.13f)
                lineTo(5.352f, 7.48f)
                lineTo(5.586f, 8.582f)
                lineTo(4.63f, 8.018f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SamoaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Samoa,
            contentDescription = "Samoa Flag"
        )
    }
}
