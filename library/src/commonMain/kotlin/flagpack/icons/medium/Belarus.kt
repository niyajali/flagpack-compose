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
 * Belarus Flag (20x15dp)
 *
 * - ISO Alpha-2: BY
 * - ISO Alpha-3: BLR
 * - ISO Numeric: 112
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Belarus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Belarus:BY:BLR:112:Medium",
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
                fill = SolidColor(Color(0xFF73BE4A)),
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
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD0181A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.625f, 0f)
                curveTo(0.97f, 0f, 1.25f, 0.28f, 1.25f, 0.625f)
                curveTo(1.25f, 0.97f, 0.97f, 1.25f, 0.625f, 1.25f)
                curveTo(0.28f, 1.25f, 0f, 0.97f, 0f, 0.625f)
                curveTo(0f, 0.28f, 0.28f, 0f, 0.625f, 0f)
                close()
                moveTo(3.125f, 0f)
                curveTo(3.47f, 0f, 3.75f, 0.28f, 3.75f, 0.625f)
                curveTo(3.75f, 0.97f, 3.47f, 1.25f, 3.125f, 1.25f)
                curveTo(2.78f, 1.25f, 2.5f, 0.97f, 2.5f, 0.625f)
                curveTo(2.5f, 0.28f, 2.78f, 0f, 3.125f, 0f)
                close()
                moveTo(1.25f, 3.125f)
                curveTo(1.25f, 2.78f, 0.97f, 2.5f, 0.625f, 2.5f)
                curveTo(0.28f, 2.5f, 0f, 2.78f, 0f, 3.125f)
                curveTo(0f, 3.47f, 0.28f, 3.75f, 0.625f, 3.75f)
                curveTo(0.97f, 3.75f, 1.25f, 3.47f, 1.25f, 3.125f)
                close()
                moveTo(3.125f, 2.5f)
                curveTo(3.47f, 2.5f, 3.75f, 2.78f, 3.75f, 3.125f)
                curveTo(3.75f, 3.47f, 3.47f, 3.75f, 3.125f, 3.75f)
                curveTo(2.78f, 3.75f, 2.5f, 3.47f, 2.5f, 3.125f)
                curveTo(2.5f, 2.78f, 2.78f, 2.5f, 3.125f, 2.5f)
                close()
                moveTo(3.125f, 11.25f)
                curveTo(3.47f, 11.25f, 3.75f, 11.53f, 3.75f, 11.875f)
                curveTo(3.75f, 12.22f, 3.47f, 12.5f, 3.125f, 12.5f)
                curveTo(2.78f, 12.5f, 2.5f, 12.22f, 2.5f, 11.875f)
                curveTo(2.5f, 11.53f, 2.78f, 11.25f, 3.125f, 11.25f)
                close()
                moveTo(1.25f, 11.875f)
                curveTo(1.25f, 11.53f, 0.97f, 11.25f, 0.625f, 11.25f)
                curveTo(0.28f, 11.25f, 0f, 11.53f, 0f, 11.875f)
                curveTo(0f, 12.22f, 0.28f, 12.5f, 0.625f, 12.5f)
                curveTo(0.97f, 12.5f, 1.25f, 12.22f, 1.25f, 11.875f)
                close()
                moveTo(0.625f, 13.75f)
                curveTo(0.97f, 13.75f, 1.25f, 14.03f, 1.25f, 14.375f)
                curveTo(1.25f, 14.72f, 0.97f, 15f, 0.625f, 15f)
                curveTo(0.28f, 15f, 0f, 14.72f, 0f, 14.375f)
                curveTo(0f, 14.03f, 0.28f, 13.75f, 0.625f, 13.75f)
                close()
                moveTo(3.75f, 14.375f)
                curveTo(3.75f, 14.03f, 3.47f, 13.75f, 3.125f, 13.75f)
                curveTo(2.78f, 13.75f, 2.5f, 14.03f, 2.5f, 14.375f)
                curveTo(2.5f, 14.72f, 2.78f, 15f, 3.125f, 15f)
                curveTo(3.47f, 15f, 3.75f, 14.72f, 3.75f, 14.375f)
                close()
                moveTo(1.875f, 12.5f)
                curveTo(2.22f, 12.5f, 2.5f, 12.78f, 2.5f, 13.125f)
                curveTo(2.5f, 13.47f, 2.22f, 13.75f, 1.875f, 13.75f)
                curveTo(1.53f, 13.75f, 1.25f, 13.47f, 1.25f, 13.125f)
                curveTo(1.25f, 12.78f, 1.53f, 12.5f, 1.875f, 12.5f)
                close()
                moveTo(2.5f, 1.875f)
                curveTo(2.5f, 1.53f, 2.22f, 1.25f, 1.875f, 1.25f)
                curveTo(1.53f, 1.25f, 1.25f, 1.53f, 1.25f, 1.875f)
                curveTo(1.25f, 2.22f, 1.53f, 2.5f, 1.875f, 2.5f)
                curveTo(2.22f, 2.5f, 2.5f, 2.22f, 2.5f, 1.875f)
                close()
                moveTo(2.569f, 7.524f)
                lineTo(3.75f, 8.75f)
                verticalLineTo(10f)
                lineTo(3.777f, 10.058f)
                lineTo(1.932f, 8.211f)
                lineTo(0.274f, 10f)
                horizontalLineTo(0f)
                verticalLineTo(8.75f)
                lineTo(1.239f, 7.518f)
                lineTo(0f, 6.278f)
                verticalLineTo(5f)
                horizontalLineTo(0.136f)
                lineTo(1.915f, 6.846f)
                lineTo(3.702f, 5.068f)
                lineTo(3.75f, 5f)
                verticalLineTo(6.25f)
                lineTo(2.569f, 7.524f)
                close()
                moveTo(1.875f, 3.75f)
                curveTo(2.22f, 3.75f, 2.5f, 4.03f, 2.5f, 4.375f)
                curveTo(2.5f, 4.72f, 2.22f, 5f, 1.875f, 5f)
                curveTo(1.53f, 5f, 1.25f, 4.72f, 1.25f, 4.375f)
                curveTo(1.25f, 4.03f, 1.53f, 3.75f, 1.875f, 3.75f)
                close()
                moveTo(2.5f, 10.625f)
                curveTo(2.5f, 10.28f, 2.22f, 10f, 1.875f, 10f)
                curveTo(1.53f, 10f, 1.25f, 10.28f, 1.25f, 10.625f)
                curveTo(1.25f, 10.97f, 1.53f, 11.25f, 1.875f, 11.25f)
                curveTo(2.22f, 11.25f, 2.5f, 10.97f, 2.5f, 10.625f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8F181A)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(1.25f)
                verticalLineTo(1.25f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveTo(1.25f, 2.5f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                horizontalLineTo(1.25f)
                verticalLineTo(2.5f)
                close()
                moveTo(0f, 5f)
                horizontalLineTo(1.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                close()
                moveTo(1.25f, 8.75f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                horizontalLineTo(1.25f)
                verticalLineTo(8.75f)
                close()
                moveTo(0f, 11.25f)
                horizontalLineTo(1.25f)
                verticalLineTo(12.5f)
                horizontalLineTo(0f)
                verticalLineTo(11.25f)
                close()
                moveTo(1.25f, 13.75f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                horizontalLineTo(1.25f)
                verticalLineTo(13.75f)
                close()
                moveTo(3.75f, 13.75f)
                horizontalLineTo(2.5f)
                verticalLineTo(15f)
                horizontalLineTo(3.75f)
                verticalLineTo(13.75f)
                close()
                moveTo(3.75f, 0f)
                horizontalLineTo(2.5f)
                verticalLineTo(1.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BelarusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Belarus,
            contentDescription = "Belarus Flag"
        )
    }
}
