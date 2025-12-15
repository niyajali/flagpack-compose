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
 * El Salvador Flag (32x24dp)
 *
 * - ISO Alpha-2: SV
 * - ISO Alpha-3: SLV
 * - ISO Numeric: 222
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.ElSalvador: ImageVector by lazy {
    ImageVector.Builder(
        name = "El Salvador:SV:SLV:222:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 1f
            ) {
                moveTo(19.425f, 11.858f)
                curveTo(19.425f, 13.87f, 17.795f, 15.5f, 15.784f, 15.5f)
                curveTo(13.772f, 15.5f, 12.142f, 13.87f, 12.142f, 11.858f)
                curveTo(12.142f, 9.847f, 13.772f, 8.216f, 15.784f, 8.216f)
                curveTo(17.795f, 8.216f, 19.425f, 9.847f, 19.425f, 11.858f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E601B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.811f, 9.662f)
                curveTo(13.811f, 9.662f, 12.858f, 11.23f, 12.858f, 12.306f)
                curveTo(12.858f, 13.382f, 13.998f, 14.735f, 15.792f, 14.735f)
                curveTo(17.542f, 14.735f, 18.8f, 13.69f, 18.838f, 12.306f)
                curveTo(18.876f, 10.922f, 17.896f, 9.937f, 17.896f, 9.937f)
                curveTo(17.896f, 9.937f, 18.451f, 11.929f, 18.174f, 12.737f)
                curveTo(17.896f, 13.544f, 16.999f, 14.521f, 15.792f, 14.396f)
                curveTo(14.585f, 14.272f, 13.439f, 12.786f, 13.439f, 12.306f)
                curveTo(13.439f, 11.826f, 13.811f, 9.662f, 13.811f, 9.662f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF188396)),
                strokeLineWidth = 1f
            ) {
                moveTo(14.16f, 12.328f)
                horizontalLineTo(17.368f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 1f
            ) {
                moveTo(14.459f, 11.806f)
                horizontalLineTo(17.219f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 1f
            ) {
                moveTo(17.05f, 12.411f)
                horizontalLineTo(14.593f)
                lineTo(15.833f, 10.355f)
                lineTo(17.05f, 12.411f)
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
            imageVector = FlagIcons.Large.ElSalvador,
            contentDescription = "El Salvador Flag"
        )
    }
}
