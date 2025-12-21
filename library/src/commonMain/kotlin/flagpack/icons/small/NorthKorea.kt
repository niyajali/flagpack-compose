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
 * North Korea Flag (16x12dp)
 *
 * - ISO Alpha-2: KP
 * - ISO Alpha-3: PRK
 * - ISO Numeric: 408
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.NorthKorea: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Korea:KP:PRK:408:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(0f, 2.5f)
                horizontalLineTo(-0.5f)
                verticalLineTo(3f)
                verticalLineTo(9f)
                verticalLineTo(9.5f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.5f)
                verticalLineTo(9f)
                verticalLineTo(3f)
                verticalLineTo(2.5f)
                horizontalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 8.5f)
                curveTo(6.381f, 8.5f, 7.5f, 7.381f, 7.5f, 6f)
                curveTo(7.5f, 4.619f, 6.381f, 3.5f, 5f, 3.5f)
                curveTo(3.619f, 3.5f, 2.5f, 4.619f, 2.5f, 6f)
                curveTo(2.5f, 7.381f, 3.619f, 8.5f, 5f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.998f, 6.935f)
                lineTo(3.639f, 7.88f)
                lineTo(4.119f, 6.296f)
                lineTo(2.8f, 5.297f)
                lineTo(4.454f, 5.263f)
                lineTo(4.998f, 3.7f)
                lineTo(5.541f, 5.263f)
                lineTo(7.195f, 5.297f)
                lineTo(5.877f, 6.296f)
                lineTo(6.356f, 7.88f)
                lineTo(4.998f, 6.935f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NorthKoreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.NorthKorea,
            contentDescription = "North Korea Flag"
        )
    }
}
