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
 * El Salvador Flag (16x12dp)
 *
 * - ISO Alpha-2: SV
 * - ISO Alpha-3: SLV
 * - ISO Numeric: 222
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.ElSalvador: ImageVector by lazy {
    ImageVector.Builder(
        name = "El Salvador:SV:SLV:222:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.713f, 5.929f)
                curveTo(9.713f, 6.935f, 8.897f, 7.75f, 7.892f, 7.75f)
                curveTo(6.886f, 7.75f, 6.071f, 6.935f, 6.071f, 5.929f)
                curveTo(6.071f, 4.923f, 6.886f, 4.108f, 7.892f, 4.108f)
                curveTo(8.897f, 4.108f, 9.713f, 4.923f, 9.713f, 5.929f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E601B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.905f, 4.831f)
                curveTo(6.905f, 4.831f, 6.429f, 5.615f, 6.429f, 6.153f)
                curveTo(6.429f, 6.691f, 6.999f, 7.368f, 7.896f, 7.368f)
                curveTo(8.771f, 7.368f, 9.4f, 6.845f, 9.419f, 6.153f)
                curveTo(9.438f, 5.461f, 8.948f, 4.969f, 8.948f, 4.969f)
                curveTo(8.948f, 4.969f, 9.225f, 5.965f, 9.087f, 6.368f)
                curveTo(8.948f, 6.772f, 8.5f, 7.26f, 7.896f, 7.198f)
                curveTo(7.293f, 7.136f, 6.72f, 6.393f, 6.72f, 6.153f)
                curveTo(6.72f, 5.913f, 6.905f, 4.831f, 6.905f, 4.831f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF188396)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.08f, 6.164f)
                horizontalLineTo(8.684f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.229f, 5.903f)
                horizontalLineTo(8.609f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.525f, 6.206f)
                horizontalLineTo(7.297f)
                lineTo(7.916f, 5.177f)
                lineTo(8.525f, 6.206f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ElSalvadorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.ElSalvador,
            contentDescription = "El Salvador Flag"
        )
    }
}
