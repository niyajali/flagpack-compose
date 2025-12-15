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
 * North Korea Flag (20x15dp)
 *
 * - ISO Alpha-2: KP
 * - ISO Alpha-3: PRK
 * - ISO Numeric: 408
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.NorthKorea: ImageVector by lazy {
    ImageVector.Builder(
        name = "North Korea:KP:PRK:408:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, 3.125f)
                horizontalLineTo(-0.625f)
                verticalLineTo(3.75f)
                verticalLineTo(11.25f)
                verticalLineTo(11.875f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(11.25f)
                verticalLineTo(3.75f)
                verticalLineTo(3.125f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.25f, 10.625f)
                curveTo(7.976f, 10.625f, 9.375f, 9.226f, 9.375f, 7.5f)
                curveTo(9.375f, 5.774f, 7.976f, 4.375f, 6.25f, 4.375f)
                curveTo(4.524f, 4.375f, 3.125f, 5.774f, 3.125f, 7.5f)
                curveTo(3.125f, 9.226f, 4.524f, 10.625f, 6.25f, 10.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.247f, 8.669f)
                lineTo(4.549f, 9.85f)
                lineTo(5.148f, 7.87f)
                lineTo(3.5f, 6.621f)
                lineTo(5.568f, 6.579f)
                lineTo(6.247f, 4.625f)
                lineTo(6.926f, 6.579f)
                lineTo(8.994f, 6.621f)
                lineTo(7.346f, 7.87f)
                lineTo(7.945f, 9.85f)
                lineTo(6.247f, 8.669f)
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
            imageVector = FlagIcons.Medium.NorthKorea,
            contentDescription = "North Korea Flag"
        )
    }
}
