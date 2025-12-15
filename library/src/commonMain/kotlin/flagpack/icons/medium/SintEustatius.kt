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
 * Sint Eustatius Flag (20x15dp)
 *
 * - ISO Alpha-2: BQ-SE
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SintEustatius: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Eustatius:BQ-SE:::Medium",
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
                fill = SolidColor(Color(0xFF00268D)),
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
                fill = SolidColor(Color(0xFF00268D)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0.625f, 0.625f)
                horizontalLineTo(19.375f)
                verticalLineTo(14.375f)
                horizontalLineTo(0.625f)
                verticalLineTo(0.625f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(9.375f, 0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 8.125f)
                lineToRelative(0f, -1.25f)
                lineToRelative(20f, -0f)
                lineToRelative(0f, 1.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF059334))) {
                moveTo(7.256f, 10f)
                curveTo(7.424f, 10f, 15.625f, 10f, 15.625f, 10f)
                lineTo(14.74f, 9.043f)
                curveTo(14.74f, 9.043f, 12.97f, 7.15f, 12.857f, 7.064f)
                curveTo(12.743f, 6.977f, 12.555f, 6.939f, 12.34f, 7.215f)
                curveTo(12.126f, 7.491f, 12.004f, 7.064f, 11.825f, 7.064f)
                curveTo(11.647f, 7.064f, 11.572f, 7.064f, 11.313f, 7.417f)
                curveTo(11.055f, 7.771f, 10.123f, 9.043f, 10.123f, 9.043f)
                horizontalLineTo(8.755f)
                curveTo(8.755f, 9.043f, 8.524f, 8.834f, 8.392f, 8.909f)
                curveTo(8.261f, 8.983f, 7.52f, 8.084f, 7.256f, 8.017f)
                curveTo(6.992f, 7.95f, 6.818f, 8.26f, 6.818f, 8.508f)
                curveTo(6.818f, 8.755f, 6.694f, 8.281f, 6.441f, 8.42f)
                curveTo(6.188f, 8.56f, 6.27f, 8.909f, 6.27f, 8.909f)
                curveTo(6.27f, 8.909f, 7.087f, 10f, 7.256f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.753f, 7.034f)
                lineTo(9.136f, 7.5f)
                lineTo(9.362f, 6.73f)
                lineTo(8.75f, 6.259f)
                horizontalLineTo(9.513f)
                lineTo(9.753f, 5.5f)
                lineTo(10.008f, 6.259f)
                horizontalLineTo(10.75f)
                lineTo(10.143f, 6.73f)
                lineTo(10.374f, 7.5f)
                lineTo(9.753f, 7.034f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SintEustatiusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SintEustatius,
            contentDescription = "Sint Eustatius Flag"
        )
    }
}
