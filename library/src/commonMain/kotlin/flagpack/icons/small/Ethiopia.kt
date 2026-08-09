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
 * Ethiopia Flag (16x12dp)
 *
 * - ISO Alpha-2: ET
 * - ISO Alpha-3: ETH
 * - ISO Numeric: 231
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Ethiopia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ethiopia:ET:ETH:231:Small",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF2B77B8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                curveTo(9.657f, 9f, 11f, 7.657f, 11f, 6f)
                curveTo(11f, 4.343f, 9.657f, 3f, 8f, 3f)
                curveTo(6.343f, 3f, 5f, 4.343f, 5f, 6f)
                curveTo(5f, 7.657f, 6.343f, 9f, 8f, 9f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 0.75f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 7f)
                lineTo(6.619f, 7.463f)
                lineTo(7.049f, 6.309f)
                lineTo(6.112f, 5.191f)
                horizontalLineTo(7.412f)
                lineTo(8f, 4f)
                lineTo(8.588f, 5.191f)
                horizontalLineTo(9.916f)
                lineTo(8.951f, 6.309f)
                lineTo(9.294f, 7.463f)
                lineTo(8f, 7f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.848f, 6.017f)
                lineTo(6.806f, 8.197f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.684f, 5.74f)
                horizontalLineTo(5.684f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.061f, 6.419f)
                lineTo(10.015f, 7.321f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.483f, 5.937f)
                lineTo(9.898f, 4.388f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun EthiopiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Ethiopia,
            contentDescription = "Ethiopia Flag"
        )
    }
}
