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
 * Maldives Flag (20x15dp)
 *
 * - ISO Alpha-2: MV
 * - ISO Alpha-3: MDV
 * - ISO Numeric: 462
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Maldives: ImageVector by lazy {
    ImageVector.Builder(
        name = "Maldives:MV:MDV:462:Medium",
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
                horizontalLineTo(20f)
                verticalLineTo(13.75f)
                curveTo(20f, 14.44f, 19.44f, 15f, 18.75f, 15f)
                horizontalLineTo(1.25f)
                curveTo(0.56f, 15f, 0f, 14.44f, 0f, 13.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFB6EB9A)),
                strokeAlpha = 0.238111f,
                strokeLineWidth = 1.25f
            ) {
                moveTo(3.625f, 3.625f)
                horizontalLineTo(16.375f)
                verticalLineTo(11.375f)
                horizontalLineTo(3.625f)
                verticalLineTo(3.625f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3.625f, 3.625f)
                horizontalLineTo(16.375f)
                verticalLineTo(11.375f)
                horizontalLineTo(3.625f)
                verticalLineTo(3.625f)
                close()
                moveTo(3f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.021f, 7.789f)
                curveTo(10.01f, 9.705f, 11.518f, 10.727f, 11.518f, 10.727f)
                curveTo(9.797f, 10.929f, 8.652f, 9.368f, 8.652f, 7.808f)
                curveTo(8.652f, 6.247f, 10.213f, 4.958f, 11.518f, 4.376f)
                curveTo(11.518f, 4.376f, 10.031f, 5.873f, 10.021f, 7.789f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MaldivesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Maldives,
            contentDescription = "Maldives Flag"
        )
    }
}
