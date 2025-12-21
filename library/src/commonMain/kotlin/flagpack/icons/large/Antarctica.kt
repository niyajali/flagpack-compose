package flagpack.icons.large

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
 * Antarctica Flag (32x24dp)
 *
 * - ISO Alpha-2: AQ
 * - ISO Alpha-3: ATA
 * - ISO Numeric: 010
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Antarctica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antarctica:AQ:ATA:010:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5196ED)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF5F8FB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.717f, 7.894f)
                curveTo(8.717f, 7.894f, 10.781f, 9.026f, 11.069f, 9.339f)
                curveTo(11.356f, 9.653f, 11.816f, 10.803f, 12.533f, 10.153f)
                curveTo(13.25f, 9.502f, 13.967f, 10.008f, 13.967f, 8.972f)
                curveTo(13.967f, 7.936f, 15.038f, 5.532f, 16.593f, 6.134f)
                curveTo(18.147f, 6.737f, 19.425f, 6.36f, 19.783f, 6.601f)
                curveTo(20.142f, 6.842f, 21.003f, 8.038f, 21.672f, 8.038f)
                curveTo(22.342f, 8.038f, 22.676f, 8.737f, 22.724f, 9.749f)
                curveTo(22.772f, 10.761f, 22.509f, 10.858f, 23.131f, 10.978f)
                curveTo(23.753f, 11.099f, 23.992f, 11.557f, 23.681f, 12.159f)
                curveTo(23.37f, 12.761f, 23.394f, 12.496f, 23.442f, 13.123f)
                curveTo(23.49f, 13.749f, 22.82f, 17.444f, 20.763f, 17.806f)
                curveTo(18.707f, 18.167f, 16.758f, 17.975f, 17.284f, 17.275f)
                curveTo(17.81f, 16.577f, 18.538f, 15.773f, 17.462f, 15.604f)
                curveTo(16.386f, 15.435f, 15.708f, 15.292f, 14.632f, 15.581f)
                curveTo(13.556f, 15.87f, 12.432f, 16.327f, 11.762f, 15.46f)
                curveTo(11.092f, 14.593f, 11.236f, 13.966f, 10.686f, 13.556f)
                curveTo(10.136f, 13.147f, 9.466f, 13.219f, 10.017f, 12.424f)
                curveTo(10.566f, 11.629f, 11.021f, 11.926f, 10.566f, 11.299f)
                curveTo(10.112f, 10.673f, 8.397f, 10.4f, 8.397f, 9.774f)
                curveTo(8.397f, 9.147f, 7.307f, 7.773f, 8.717f, 7.894f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AntarcticaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Antarctica,
            contentDescription = "Antarctica Flag"
        )
    }
}
