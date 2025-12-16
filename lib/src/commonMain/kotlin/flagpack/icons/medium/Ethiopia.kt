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
 * Ethiopia Flag (20x15dp)
 *
 * - ISO Alpha-2: ET
 * - ISO Alpha-3: ETH
 * - ISO Numeric: 231
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Ethiopia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ethiopia:ET:ETH:231:Medium",
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF2B77B8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 11.25f)
                curveTo(12.071f, 11.25f, 13.75f, 9.571f, 13.75f, 7.5f)
                curveTo(13.75f, 5.429f, 12.071f, 3.75f, 10f, 3.75f)
                curveTo(7.929f, 3.75f, 6.25f, 5.429f, 6.25f, 7.5f)
                curveTo(6.25f, 9.571f, 7.929f, 11.25f, 10f, 11.25f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 0.9375f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 8.75f)
                lineTo(8.274f, 9.329f)
                lineTo(8.811f, 7.886f)
                lineTo(7.64f, 6.489f)
                horizontalLineTo(9.265f)
                lineTo(10f, 5f)
                lineTo(10.735f, 6.489f)
                horizontalLineTo(12.396f)
                lineTo(11.189f, 7.886f)
                lineTo(11.617f, 9.329f)
                lineTo(10f, 8.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.81f, 7.522f)
                lineTo(8.507f, 10.247f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.605f, 7.175f)
                horizontalLineTo(7.105f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.076f, 8.024f)
                lineTo(12.519f, 9.151f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.604f, 7.421f)
                lineTo(12.373f, 5.485f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun EthiopiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Ethiopia,
            contentDescription = "Ethiopia Flag"
        )
    }
}
