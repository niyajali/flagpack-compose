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
 * Mauritania Flag (20x15dp)
 *
 * - ISO Alpha-2: MR
 * - ISO Alpha-3: MRT
 * - ISO Numeric: 478
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Mauritania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mauritania:MR:MRT:478:Medium",
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
                fill = SolidColor(Color(0xFF1C7B4D)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.25f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.151f, 8.987f)
                curveTo(13.392f, 9.005f, 14.305f, 6.291f, 14.305f, 6.291f)
                curveTo(14.121f, 8.612f, 12.837f, 10.187f, 10.151f, 10.187f)
                curveTo(7.465f, 10.187f, 6.479f, 8.147f, 5.998f, 6.113f)
                curveTo(5.998f, 6.113f, 6.91f, 8.969f, 10.151f, 8.987f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.023f, 6.134f)
                lineTo(11.234f, 7.361f)
                lineTo(10.132f, 6.781f)
                lineTo(9.029f, 7.361f)
                lineTo(9.24f, 6.134f)
                lineTo(8.348f, 5.175f)
                lineTo(9.581f, 5.175f)
                lineTo(10.132f, 3.969f)
                lineTo(10.683f, 5.175f)
                lineTo(11.915f, 5.175f)
                lineTo(11.023f, 6.134f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MauritaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Mauritania,
            contentDescription = "Mauritania Flag"
        )
    }
}
