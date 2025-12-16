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
 * Malta Flag (16x12dp)
 *
 * - ISO Alpha-2: MT
 * - ISO Alpha-3: MLT
 * - ISO Numeric: 470
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Malta: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malta:MT:MLT:470:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(0f, 0f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-16f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFA0A0A0)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 3f)
            horizontalLineTo(3f)
            verticalLineTo(4.496f)
            curveTo(2.78f, 4.549f, 2.616f, 4.747f, 2.616f, 4.983f)
            lineTo(2.616f, 5f)
            horizontalLineTo(1f)
            verticalLineTo(7f)
            horizontalLineTo(2.665f)
            curveTo(2.73f, 7.134f, 2.852f, 7.234f, 3f, 7.269f)
            verticalLineTo(9f)
            horizontalLineTo(5f)
            verticalLineTo(7.276f)
            curveTo(5.162f, 7.248f, 5.297f, 7.143f, 5.366f, 7f)
            horizontalLineTo(7f)
            verticalLineTo(5f)
            horizontalLineTo(5.416f)
            lineTo(5.416f, 4.983f)
            curveTo(5.416f, 4.735f, 5.236f, 4.53f, 5f, 4.49f)
            verticalLineTo(3f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(5f, 3f)
                horizontalLineTo(3f)
                verticalLineTo(4.496f)
                curveTo(2.78f, 4.549f, 2.616f, 4.747f, 2.616f, 4.983f)
                lineTo(2.616f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                horizontalLineTo(2.665f)
                curveTo(2.73f, 7.134f, 2.852f, 7.234f, 3f, 7.269f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(7.276f)
                curveTo(5.162f, 7.248f, 5.297f, 7.143f, 5.366f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5.416f)
                lineTo(5.416f, 4.983f)
                curveTo(5.416f, 4.735f, 5.236f, 4.53f, 5f, 4.49f)
                verticalLineTo(3f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(3f, 3f)
                verticalLineTo(2.5f)
                horizontalLineTo(2.5f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                close()
                moveTo(5f, 3f)
                horizontalLineTo(5.5f)
                verticalLineTo(2.5f)
                horizontalLineTo(5f)
                verticalLineTo(3f)
                close()
                moveTo(3f, 4.496f)
                lineTo(3.115f, 4.983f)
                lineTo(3.5f, 4.892f)
                verticalLineTo(4.496f)
                horizontalLineTo(3f)
                close()
                moveTo(2.616f, 4.983f)
                horizontalLineTo(2.116f)
                lineTo(2.116f, 4.991f)
                lineTo(2.616f, 4.983f)
                close()
                moveTo(2.616f, 5f)
                verticalLineTo(5.5f)
                horizontalLineTo(3.125f)
                lineTo(3.116f, 4.992f)
                lineTo(2.616f, 5f)
                close()
                moveTo(1f, 5f)
                verticalLineTo(4.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(5f)
                horizontalLineTo(1f)
                close()
                moveTo(1f, 7f)
                horizontalLineTo(0.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(1f)
                verticalLineTo(7f)
                close()
                moveTo(2.665f, 7f)
                lineTo(3.116f, 6.782f)
                lineTo(2.979f, 6.5f)
                horizontalLineTo(2.665f)
                verticalLineTo(7f)
                close()
                moveTo(3f, 7.269f)
                horizontalLineTo(3.5f)
                verticalLineTo(6.874f)
                lineTo(3.115f, 6.783f)
                lineTo(3f, 7.269f)
                close()
                moveTo(3f, 9f)
                horizontalLineTo(2.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
                moveTo(5f, 9f)
                verticalLineTo(9.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                close()
                moveTo(5f, 7.276f)
                lineTo(4.916f, 6.783f)
                lineTo(4.5f, 6.853f)
                verticalLineTo(7.276f)
                horizontalLineTo(5f)
                close()
                moveTo(5.366f, 7f)
                verticalLineTo(6.5f)
                horizontalLineTo(5.053f)
                lineTo(4.916f, 6.782f)
                lineTo(5.366f, 7f)
                close()
                moveTo(7f, 7f)
                verticalLineTo(7.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                close()
                moveTo(7f, 5f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                close()
                moveTo(5.416f, 5f)
                lineTo(4.916f, 4.992f)
                lineTo(4.907f, 5.5f)
                horizontalLineTo(5.416f)
                verticalLineTo(5f)
                close()
                moveTo(5.416f, 4.983f)
                lineTo(5.916f, 4.991f)
                verticalLineTo(4.983f)
                horizontalLineTo(5.416f)
                close()
                moveTo(5f, 4.49f)
                horizontalLineTo(4.5f)
                verticalLineTo(4.912f)
                lineTo(4.916f, 4.983f)
                lineTo(5f, 4.49f)
                close()
                moveTo(3f, 3.5f)
                horizontalLineTo(5f)
                verticalLineTo(2.5f)
                horizontalLineTo(3f)
                verticalLineTo(3.5f)
                close()
                moveTo(3.5f, 4.496f)
                verticalLineTo(3f)
                horizontalLineTo(2.5f)
                verticalLineTo(4.496f)
                horizontalLineTo(3.5f)
                close()
                moveTo(3.116f, 4.983f)
                lineTo(3.115f, 4.983f)
                lineTo(2.885f, 4.01f)
                curveTo(2.444f, 4.114f, 2.116f, 4.51f, 2.116f, 4.983f)
                horizontalLineTo(3.116f)
                close()
                moveTo(3.116f, 4.992f)
                lineTo(3.116f, 4.974f)
                lineTo(2.116f, 4.991f)
                lineTo(2.116f, 5.008f)
                lineTo(3.116f, 4.992f)
                close()
                moveTo(1f, 5.5f)
                horizontalLineTo(2.616f)
                verticalLineTo(4.5f)
                horizontalLineTo(1f)
                verticalLineTo(5.5f)
                close()
                moveTo(1.5f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(0.5f)
                verticalLineTo(7f)
                horizontalLineTo(1.5f)
                close()
                moveTo(2.665f, 6.5f)
                horizontalLineTo(1f)
                verticalLineTo(7.5f)
                horizontalLineTo(2.665f)
                verticalLineTo(6.5f)
                close()
                moveTo(3.115f, 6.783f)
                lineTo(3.116f, 6.782f)
                lineTo(2.215f, 7.218f)
                curveTo(2.344f, 7.484f, 2.588f, 7.685f, 2.885f, 7.756f)
                lineTo(3.115f, 6.783f)
                close()
                moveTo(3.5f, 9f)
                verticalLineTo(7.269f)
                horizontalLineTo(2.5f)
                verticalLineTo(9f)
                horizontalLineTo(3.5f)
                close()
                moveTo(5f, 8.5f)
                horizontalLineTo(3f)
                verticalLineTo(9.5f)
                horizontalLineTo(5f)
                verticalLineTo(8.5f)
                close()
                moveTo(4.5f, 7.276f)
                verticalLineTo(9f)
                horizontalLineTo(5.5f)
                verticalLineTo(7.276f)
                horizontalLineTo(4.5f)
                close()
                moveTo(5.084f, 7.769f)
                curveTo(5.409f, 7.714f, 5.679f, 7.503f, 5.817f, 7.218f)
                lineTo(4.916f, 6.782f)
                lineTo(4.916f, 6.783f)
                lineTo(5.084f, 7.769f)
                close()
                moveTo(7f, 6.5f)
                horizontalLineTo(5.366f)
                verticalLineTo(7.5f)
                horizontalLineTo(7f)
                verticalLineTo(6.5f)
                close()
                moveTo(6.5f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(7.5f)
                verticalLineTo(5f)
                horizontalLineTo(6.5f)
                close()
                moveTo(5.416f, 5.5f)
                horizontalLineTo(7f)
                verticalLineTo(4.5f)
                horizontalLineTo(5.416f)
                verticalLineTo(5.5f)
                close()
                moveTo(4.916f, 4.974f)
                lineTo(4.916f, 4.992f)
                lineTo(5.915f, 5.008f)
                lineTo(5.916f, 4.991f)
                lineTo(4.916f, 4.974f)
                close()
                moveTo(4.916f, 4.983f)
                lineTo(4.916f, 4.983f)
                horizontalLineTo(5.916f)
                curveTo(5.916f, 4.487f, 5.556f, 4.077f, 5.084f, 3.997f)
                lineTo(4.916f, 4.983f)
                close()
                moveTo(4.5f, 3f)
                verticalLineTo(4.49f)
                horizontalLineTo(5.5f)
                verticalLineTo(3f)
                horizontalLineTo(4.5f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFE31D1C)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8f, 0f)
            horizontalLineTo(16f)
            verticalLineTo(12f)
            horizontalLineTo(8f)
            verticalLineTo(0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(8f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun MaltaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Malta,
            contentDescription = "Malta Flag"
        )
    }
}
