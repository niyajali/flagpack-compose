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
 * El Salvador Flag (20x15dp)
 *
 * - ISO Alpha-2: SV
 * - ISO Alpha-3: SLV
 * - ISO Numeric: 222
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.ElSalvador: ImageVector by lazy {
    ImageVector.Builder(
        name = "El Salvador:SV:SLV:222:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.141f, 7.411f)
                curveTo(12.141f, 8.668f, 11.122f, 9.687f, 9.865f, 9.687f)
                curveTo(8.608f, 9.687f, 7.589f, 8.668f, 7.589f, 7.411f)
                curveTo(7.589f, 6.154f, 8.608f, 5.135f, 9.865f, 5.135f)
                curveTo(11.122f, 5.135f, 12.141f, 6.154f, 12.141f, 7.411f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1E601B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.632f, 6.039f)
                curveTo(8.632f, 6.039f, 8.036f, 7.019f, 8.036f, 7.691f)
                curveTo(8.036f, 8.364f, 8.749f, 9.209f, 9.87f, 9.209f)
                curveTo(10.964f, 9.209f, 11.75f, 8.556f, 11.774f, 7.691f)
                curveTo(11.797f, 6.827f, 11.185f, 6.211f, 11.185f, 6.211f)
                curveTo(11.185f, 6.211f, 11.532f, 7.456f, 11.358f, 7.961f)
                curveTo(11.185f, 8.465f, 10.625f, 9.075f, 9.87f, 8.998f)
                curveTo(9.116f, 8.92f, 8.4f, 7.991f, 8.4f, 7.691f)
                curveTo(8.4f, 7.391f, 8.632f, 6.039f, 8.632f, 6.039f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF188396)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.85f, 7.705f)
                horizontalLineTo(10.855f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.037f, 7.379f)
                horizontalLineTo(10.762f)
            }
            path(
                stroke = SolidColor(Color(0xFFE8AA00)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(10.656f, 7.757f)
                horizontalLineTo(9.121f)
                lineTo(9.895f, 6.472f)
                lineTo(10.656f, 7.757f)
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
            imageVector = FlagIcons.Medium.ElSalvador,
            contentDescription = "El Salvador Flag"
        )
    }
}
