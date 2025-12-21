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
 * Pakistan Flag (16x12dp)
 *
 * - ISO Alpha-2: PK
 * - ISO Alpha-3: PAK
 * - ISO Numeric: 586
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Pakistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Pakistan:PK:PAK:586:Small",
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
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.215f, 7.653f)
                curveTo(11.215f, 7.653f, 8.982f, 8.235f, 7.209f, 7.048f)
                curveTo(5.437f, 5.86f, 6.328f, 3.124f, 6.328f, 3.124f)
                curveTo(5.404f, 3.258f, 3.952f, 6.631f, 6.292f, 8.323f)
                curveTo(8.632f, 10.015f, 10.874f, 8.389f, 11.215f, 7.653f)
                close()
                moveTo(8.737f, 4.433f)
                lineTo(7.551f, 5.013f)
                lineTo(8.802f, 5.236f)
                lineTo(8.971f, 6.459f)
                lineTo(9.679f, 5.417f)
                lineTo(11.074f, 5.511f)
                lineTo(9.982f, 4.697f)
                lineTo(10.563f, 3.609f)
                lineTo(9.476f, 4.107f)
                lineTo(8.668f, 3.347f)
                lineTo(8.737f, 4.433f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PakistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Pakistan,
            contentDescription = "Pakistan Flag"
        )
    }
}
