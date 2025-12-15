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
 * Azerbaijan Flag (16x12dp)
 *
 * - ISO Alpha-2: AZ
 * - ISO Alpha-3: AZE
 * - ISO Numeric: 031
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Azerbaijan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Azerbaijan:AZ:AZE:031:Small",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
                fill = SolidColor(Color(0xFF3CA5D9)),
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.581f, 7.453f)
                curveTo(7.907f, 7.298f, 7.38f, 6.769f, 7.387f, 5.992f)
                curveTo(7.394f, 5.264f, 7.863f, 4.649f, 8.604f, 4.482f)
                curveTo(9.345f, 4.315f, 9.996f, 4.667f, 9.996f, 4.667f)
                curveTo(9.792f, 4.213f, 9.081f, 3.895f, 8.498f, 3.896f)
                curveTo(7.413f, 3.899f, 6.255f, 4.728f, 6.244f, 5.993f)
                curveTo(6.232f, 7.304f, 7.481f, 8.05f, 8.579f, 8.047f)
                curveTo(9.46f, 8.045f, 9.878f, 7.478f, 9.965f, 7.237f)
                curveTo(9.965f, 7.237f, 9.254f, 7.609f, 8.581f, 7.453f)
                close()
                moveTo(9.009f, 6.71f)
                lineTo(9.597f, 6.301f)
                lineTo(10.184f, 6.71f)
                lineTo(9.977f, 6.025f)
                lineTo(10.548f, 5.592f)
                lineTo(9.832f, 5.578f)
                lineTo(9.597f, 4.901f)
                lineTo(9.362f, 5.578f)
                lineTo(8.646f, 5.592f)
                lineTo(9.216f, 6.025f)
                lineTo(9.009f, 6.71f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AzerbaijanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Azerbaijan,
            contentDescription = "Azerbaijan Flag"
        )
    }
}
