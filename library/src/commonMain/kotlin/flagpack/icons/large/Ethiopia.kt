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
 * Ethiopia Flag (32x24dp)
 *
 * - ISO Alpha-2: ET
 * - ISO Alpha-3: ETH
 * - ISO Numeric: 231
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Ethiopia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ethiopia:ET:ETH:231:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
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
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2B77B8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 18f)
                curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                curveTo(12.686f, 6f, 10f, 8.686f, 10f, 12f)
                curveTo(10f, 15.314f, 12.686f, 18f, 16f, 18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 14f)
                lineTo(13.238f, 14.927f)
                lineTo(14.098f, 12.618f)
                lineTo(12.224f, 10.382f)
                horizontalLineTo(14.824f)
                lineTo(16f, 8f)
                lineTo(17.176f, 10.382f)
                horizontalLineTo(19.833f)
                lineTo(17.902f, 12.618f)
                lineTo(18.587f, 14.927f)
                lineTo(16f, 14f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 1f
            ) {
                moveTo(15.696f, 12.035f)
                lineTo(13.611f, 16.395f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 1f
            ) {
                moveTo(15.368f, 11.479f)
                horizontalLineTo(11.368f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 1f
            ) {
                moveTo(16.122f, 12.838f)
                lineTo(20.031f, 14.642f)
            }
            path(
                stroke = SolidColor(Color(0xFF2B77B8)),
                strokeLineWidth = 1f
            ) {
                moveTo(16.967f, 11.874f)
                lineTo(19.796f, 8.776f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun EthiopiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Ethiopia,
            contentDescription = "Ethiopia Flag"
        )
    }
}
