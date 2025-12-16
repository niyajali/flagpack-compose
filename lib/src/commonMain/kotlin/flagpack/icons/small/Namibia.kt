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
 * Namibia Flag (16x12dp)
 *
 * - ISO Alpha-2: NA
 * - ISO Alpha-3: NAM
 * - ISO Numeric: 516
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Namibia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Namibia:NA:NAM:516:Small",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF3195F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                lineTo(16f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1f
            ) {
                moveTo(-0.506f, 13.547f)
                lineTo(-0.241f, 14.027f)
                lineTo(0.213f, 13.719f)
                lineTo(17.629f, 1.864f)
                lineTo(17.98f, 1.625f)
                lineTo(17.801f, 1.24f)
                lineTo(16.63f, -1.28f)
                lineTo(16.384f, -1.808f)
                lineTo(15.899f, -1.485f)
                lineTo(-1.779f, 10.293f)
                lineTo(-2.161f, 10.548f)
                lineTo(-1.939f, 10.951f)
                lineTo(-0.506f, 13.547f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.115f, 4.622f)
                lineTo(2.468f, 5.43f)
                lineTo(2.311f, 4.407f)
                lineTo(1.347f, 4.783f)
                lineTo(1.723f, 3.819f)
                lineTo(0.7f, 3.662f)
                lineTo(1.507f, 3.015f)
                lineTo(0.7f, 2.368f)
                lineTo(1.723f, 2.211f)
                lineTo(1.347f, 1.247f)
                lineTo(2.311f, 1.623f)
                lineTo(2.468f, 0.6f)
                lineTo(3.115f, 1.407f)
                lineTo(3.762f, 0.6f)
                lineTo(3.919f, 1.623f)
                lineTo(4.883f, 1.247f)
                lineTo(4.507f, 2.211f)
                lineTo(5.53f, 2.368f)
                lineTo(4.722f, 3.015f)
                lineTo(5.53f, 3.662f)
                lineTo(4.507f, 3.819f)
                lineTo(4.883f, 4.783f)
                lineTo(3.919f, 4.407f)
                lineTo(3.762f, 5.43f)
                lineTo(3.115f, 4.622f)
                close()
                moveTo(3.115f, 4.265f)
                curveTo(3.805f, 4.265f, 4.365f, 3.705f, 4.365f, 3.015f)
                curveTo(4.365f, 2.324f, 3.805f, 1.765f, 3.115f, 1.765f)
                curveTo(2.424f, 1.765f, 1.865f, 2.324f, 1.865f, 3.015f)
                curveTo(1.865f, 3.705f, 2.424f, 4.265f, 3.115f, 4.265f)
                close()
                moveTo(4.115f, 3.015f)
                curveTo(4.115f, 3.567f, 3.667f, 4.015f, 3.115f, 4.015f)
                curveTo(2.563f, 4.015f, 2.115f, 3.567f, 2.115f, 3.015f)
                curveTo(2.115f, 2.463f, 2.563f, 2.015f, 3.115f, 2.015f)
                curveTo(3.667f, 2.015f, 4.115f, 2.463f, 4.115f, 3.015f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NamibiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Namibia,
            contentDescription = "Namibia Flag"
        )
    }
}
