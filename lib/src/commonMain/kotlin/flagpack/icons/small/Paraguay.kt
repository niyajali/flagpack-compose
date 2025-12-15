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
 * Paraguay Flag (16x12dp)
 *
 * - ISO Alpha-2: PY
 * - ISO Alpha-3: PRY
 * - ISO Numeric: 600
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Paraguay: ImageVector by lazy {
    ImageVector.Builder(
        name = "Paraguay:PY:PRY:600:Small",
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
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 6f)
                curveTo(6f, 7.105f, 6.895f, 8f, 8f, 8f)
                curveTo(9.105f, 8f, 10f, 7.105f, 10f, 6f)
                curveTo(10f, 4.895f, 9.105f, 4f, 8f, 4f)
                curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
                close()
                moveTo(9.5f, 6f)
                curveTo(9.5f, 6.828f, 8.828f, 7.5f, 8f, 7.5f)
                curveTo(7.172f, 7.5f, 6.5f, 6.828f, 6.5f, 6f)
                curveTo(6.5f, 5.172f, 7.172f, 4.5f, 8f, 4.5f)
                curveTo(8.828f, 4.5f, 9.5f, 5.172f, 9.5f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF05234)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(7.289f, 4.928f)
                lineTo(7.574f, 5.339f)
                curveTo(7.289f, 5.536f, 7.203f, 5.808f, 7.312f, 6.214f)
                curveTo(7.419f, 6.612f, 7.655f, 6.798f, 8.071f, 6.813f)
                lineTo(8.054f, 7.312f)
                curveTo(7.418f, 7.29f, 6.993f, 6.954f, 6.829f, 6.344f)
                curveTo(6.668f, 5.742f, 6.823f, 5.251f, 7.289f, 4.928f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(8.712f, 4.928f)
                lineTo(8.428f, 5.339f)
                curveTo(8.712f, 5.536f, 8.798f, 5.808f, 8.689f, 6.214f)
                curveTo(8.583f, 6.612f, 8.347f, 6.798f, 7.93f, 6.813f)
                lineTo(7.947f, 7.312f)
                curveTo(8.583f, 7.29f, 9.008f, 6.954f, 9.172f, 6.344f)
                curveTo(9.333f, 5.742f, 9.179f, 5.251f, 8.712f, 4.928f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.001f, 6.374f)
                curveTo(8.277f, 6.374f, 8.501f, 6.15f, 8.501f, 5.874f)
                curveTo(8.501f, 5.597f, 8.277f, 5.374f, 8.001f, 5.374f)
                curveTo(7.725f, 5.374f, 7.501f, 5.597f, 7.501f, 5.874f)
                curveTo(7.501f, 6.15f, 7.725f, 6.374f, 8.001f, 6.374f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ParaguayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Paraguay,
            contentDescription = "Paraguay Flag"
        )
    }
}
