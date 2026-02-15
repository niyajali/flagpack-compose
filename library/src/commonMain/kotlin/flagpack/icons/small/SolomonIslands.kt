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
 * Solomon Islands Flag (16x12dp)
 *
 * - ISO Alpha-2: SB
 * - ISO Alpha-3: SLB
 * - ISO Numeric: 090
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SolomonIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Solomon Islands:SB:SLB:090:Small",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                lineTo(0f, 12f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(-0.391f, 12.373f)
                lineTo(-1.293f, 11.125f)
                lineTo(16.838f, -0.977f)
                lineTo(17.74f, 0.271f)
                lineTo(-0.391f, 12.373f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.827f, 3.273f)
                lineTo(2.508f, 2.8f)
                lineTo(3.222f, 3.225f)
                lineTo(2.972f, 2.463f)
                lineTo(3.472f, 1.918f)
                horizontalLineTo(2.795f)
                lineTo(2.508f, 1.117f)
                lineTo(2.222f, 1.918f)
                lineTo(1.544f, 1.946f)
                lineTo(2.044f, 2.463f)
                lineTo(1.827f, 3.273f)
                close()
                moveTo(4.656f, 3.273f)
                lineTo(5.337f, 2.8f)
                lineTo(6.051f, 3.225f)
                lineTo(5.801f, 2.463f)
                lineTo(6.301f, 1.918f)
                horizontalLineTo(5.624f)
                lineTo(5.337f, 1.117f)
                lineTo(5.051f, 1.918f)
                lineTo(4.373f, 1.946f)
                lineTo(4.874f, 2.463f)
                lineTo(4.656f, 3.273f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.324f, 4.727f)
                lineTo(4.006f, 4.254f)
                lineTo(4.72f, 4.679f)
                lineTo(4.47f, 3.917f)
                lineTo(4.969f, 3.372f)
                horizontalLineTo(4.292f)
                lineTo(4.006f, 2.571f)
                lineTo(3.719f, 3.372f)
                lineTo(3.041f, 3.4f)
                lineTo(3.542f, 3.917f)
                lineTo(3.324f, 4.727f)
                close()
                moveTo(2.508f, 5.8f)
                lineTo(1.827f, 6.273f)
                lineTo(2.044f, 5.463f)
                lineTo(1.544f, 4.946f)
                lineTo(2.222f, 4.918f)
                lineTo(2.508f, 4.117f)
                lineTo(2.795f, 4.918f)
                horizontalLineTo(3.472f)
                lineTo(2.972f, 5.463f)
                lineTo(3.222f, 6.225f)
                lineTo(2.508f, 5.8f)
                close()
                moveTo(5.337f, 5.8f)
                lineTo(4.656f, 6.273f)
                lineTo(4.874f, 5.463f)
                lineTo(4.373f, 4.946f)
                lineTo(5.051f, 4.918f)
                lineTo(5.337f, 4.117f)
                lineTo(5.624f, 4.918f)
                horizontalLineTo(6.301f)
                lineTo(5.801f, 5.463f)
                lineTo(6.051f, 6.225f)
                lineTo(5.337f, 5.8f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SolomonIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SolomonIslands,
            contentDescription = "Solomon Islands Flag"
        )
    }
}
