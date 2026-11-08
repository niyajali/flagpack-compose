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
 * Pakistan Flag (32x24dp)
 *
 * - ISO Alpha-2: PK
 * - ISO Alpha-3: PAK
 * - ISO Numeric: 586
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Pakistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Pakistan:PK:PAK:586:Large",
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
                fill = SolidColor(Color(0xFF2F8D00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.429f, 15.306f)
                curveTo(22.429f, 15.306f, 17.964f, 16.471f, 14.419f, 14.096f)
                curveTo(10.874f, 11.721f, 12.656f, 6.248f, 12.656f, 6.248f)
                curveTo(10.807f, 6.517f, 7.904f, 13.263f, 12.584f, 16.646f)
                curveTo(17.264f, 20.03f, 21.748f, 16.777f, 22.429f, 15.306f)
                close()
                moveTo(17.474f, 8.866f)
                lineTo(15.102f, 10.026f)
                lineTo(17.604f, 10.472f)
                lineTo(17.942f, 12.917f)
                lineTo(19.359f, 10.834f)
                lineTo(22.147f, 11.023f)
                lineTo(19.963f, 9.394f)
                lineTo(21.126f, 7.217f)
                lineTo(18.952f, 8.213f)
                lineTo(17.336f, 6.694f)
                lineTo(17.474f, 8.866f)
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
            imageVector = FlagIcons.Large.Pakistan,
            contentDescription = "Pakistan Flag"
        )
    }
}
