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
 * Sint Eustatius Flag (32x24dp)
 *
 * - ISO Alpha-2: BQ-SE
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SintEustatius: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Eustatius:BQ-SE:::Large",
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
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 2f
            ) {
                moveTo(1f, 1f)
                horizontalLineTo(31f)
                verticalLineTo(23f)
                horizontalLineTo(1f)
                verticalLineTo(1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(15f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 13f)
                lineToRelative(0f, -2f)
                lineToRelative(32f, -0f)
                lineToRelative(0f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF059334))) {
                moveTo(11.609f, 16f)
                curveTo(11.878f, 16f, 25f, 16f, 25f, 16f)
                lineTo(23.584f, 14.724f)
                curveTo(23.584f, 14.724f, 20.753f, 12.2f, 20.571f, 12.085f)
                curveTo(20.388f, 11.969f, 20.087f, 11.919f, 19.745f, 12.287f)
                curveTo(19.402f, 12.654f, 19.206f, 12.085f, 18.921f, 12.085f)
                curveTo(18.635f, 12.085f, 18.515f, 12.085f, 18.101f, 12.557f)
                curveTo(17.687f, 13.028f, 16.197f, 14.724f, 16.197f, 14.724f)
                horizontalLineTo(14.007f)
                curveTo(14.007f, 14.724f, 13.638f, 14.445f, 13.428f, 14.545f)
                curveTo(13.217f, 14.644f, 12.031f, 13.445f, 11.609f, 13.356f)
                curveTo(11.186f, 13.266f, 10.908f, 13.681f, 10.908f, 14.01f)
                curveTo(10.908f, 14.34f, 10.71f, 13.708f, 10.306f, 13.894f)
                curveTo(9.901f, 14.079f, 10.032f, 14.545f, 10.032f, 14.545f)
                curveTo(10.032f, 14.545f, 11.34f, 16f, 11.609f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.505f, 11.301f)
                lineTo(14.578f, 12f)
                lineTo(14.918f, 10.846f)
                lineTo(14f, 10.139f)
                horizontalLineTo(15.144f)
                lineTo(15.505f, 9f)
                lineTo(15.887f, 10.139f)
                horizontalLineTo(17f)
                lineTo(16.09f, 10.846f)
                lineTo(16.436f, 12f)
                lineTo(15.505f, 11.301f)
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
            imageVector = FlagIcons.Large.SintEustatius,
            contentDescription = "Sint Eustatius Flag"
        )
    }
}
