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
 * Bolivia Flag (20x15dp)
 *
 * - ISO Alpha-2: BO
 * - ISO Alpha-3: BOL
 * - ISO Numeric: 068
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bolivia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bolivia:BO:BOL:068:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFFDB501C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFDB501C)),
                strokeLineWidth = 0.9375f
            ) {
                moveTo(7.28f, 7.038f)
                curveTo(7.28f, 7.038f, 7.047f, 9.418f, 9.163f, 9.418f)
                curveTo(11.279f, 9.418f, 10.74f, 9.418f, 10.74f, 9.418f)
                curveTo(10.74f, 9.418f, 12.966f, 9.273f, 12.708f, 7.038f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                stroke = SolidColor(Color(0xFF68B9E8)),
                strokeLineWidth = 0.9375f
            ) {
                moveTo(11.406f, 7.375f)
                curveTo(11.406f, 8.152f, 10.777f, 8.781f, 10f, 8.781f)
                curveTo(9.223f, 8.781f, 8.594f, 8.152f, 8.594f, 7.375f)
                curveTo(8.594f, 6.598f, 9.223f, 5.969f, 10f, 5.969f)
                curveTo(10.777f, 5.969f, 11.406f, 6.598f, 11.406f, 7.375f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB501C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7.5f)
                curveTo(10.345f, 7.5f, 10.625f, 7.22f, 10.625f, 6.875f)
                curveTo(10.625f, 6.53f, 10.345f, 6.25f, 10f, 6.25f)
                curveTo(9.655f, 6.25f, 9.375f, 6.53f, 9.375f, 6.875f)
                curveTo(9.375f, 7.22f, 9.655f, 7.5f, 10f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.063f, 8.5f)
                curveTo(10.649f, 8.5f, 11.125f, 8.276f, 11.125f, 8f)
                curveTo(11.125f, 7.724f, 10.649f, 7.5f, 10.063f, 7.5f)
                curveTo(9.476f, 7.5f, 9f, 7.724f, 9f, 8f)
                curveTo(9f, 8.276f, 9.476f, 8.5f, 10.063f, 8.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF674F28)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.063f, 6.25f)
                curveTo(10.891f, 6.25f, 11.563f, 6.026f, 11.563f, 5.75f)
                curveTo(11.563f, 5.474f, 10.891f, 5.25f, 10.063f, 5.25f)
                curveTo(9.234f, 5.25f, 8.563f, 5.474f, 8.563f, 5.75f)
                curveTo(8.563f, 6.026f, 9.234f, 6.25f, 10.063f, 6.25f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BoliviaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bolivia,
            contentDescription = "Bolivia Flag"
        )
    }
}
