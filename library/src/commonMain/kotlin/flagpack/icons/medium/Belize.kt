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
 * Belize Flag (20x15dp)
 *
 * - ISO Alpha-2: BZ
 * - ISO Alpha-3: BLZ
 * - ISO Numeric: 084
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Belize: ImageVector by lazy {
    ImageVector.Builder(
        name = "Belize:BZ:BLZ:084:Medium",
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
                fill = SolidColor(Color(0xFF0168B4)),
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
                fill = SolidColor(Color(0xFFE93C43)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -1f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(-1f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE93C43)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 13f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10f, 11.25f)
                curveTo(7.929f, 11.25f, 6.25f, 9.571f, 6.25f, 7.5f)
                curveTo(6.25f, 5.429f, 7.929f, 3.75f, 10f, 3.75f)
                curveTo(12.071f, 3.75f, 13.75f, 5.429f, 13.75f, 7.5f)
                curveTo(13.75f, 9.571f, 12.071f, 11.25f, 10f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.625f, 7.5f)
                curveTo(5.625f, 9.916f, 7.584f, 11.875f, 10f, 11.875f)
                curveTo(12.416f, 11.875f, 14.375f, 9.916f, 14.375f, 7.5f)
                curveTo(14.375f, 5.084f, 12.416f, 3.125f, 10f, 3.125f)
                curveTo(7.584f, 3.125f, 5.625f, 5.084f, 5.625f, 7.5f)
                close()
                moveTo(13.75f, 7.5f)
                curveTo(13.75f, 9.571f, 12.071f, 11.25f, 10f, 11.25f)
                curveTo(7.929f, 11.25f, 6.25f, 9.571f, 6.25f, 7.5f)
                curveTo(6.25f, 5.429f, 7.929f, 3.75f, 10f, 3.75f)
                curveTo(12.071f, 3.75f, 13.75f, 5.429f, 13.75f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.25f, 7.5f)
                curveTo(6.25f, 9.571f, 7.929f, 11.25f, 10f, 11.25f)
                curveTo(12.071f, 11.25f, 13.75f, 9.571f, 13.75f, 7.5f)
                curveTo(13.75f, 5.429f, 12.071f, 3.75f, 10f, 3.75f)
                curveTo(7.929f, 3.75f, 6.25f, 5.429f, 6.25f, 7.5f)
                close()
                moveTo(12.875f, 7.5f)
                curveTo(12.875f, 9.088f, 11.588f, 10.375f, 10f, 10.375f)
                curveTo(8.412f, 10.375f, 7.125f, 9.088f, 7.125f, 7.5f)
                curveTo(7.125f, 5.912f, 8.412f, 4.625f, 10f, 4.625f)
                curveTo(11.588f, 4.625f, 12.875f, 5.912f, 12.875f, 7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.125f, 8.75f)
                lineTo(9.962f, 8.515f)
                lineTo(11.875f, 8.75f)
                verticalLineTo(9.375f)
                lineTo(9.962f, 9.14f)
                lineTo(8.125f, 9.375f)
                verticalLineTo(8.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF769DF1)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.75f, 6.25f)
                horizontalLineTo(11.25f)
                curveTo(11.25f, 6.25f, 11.427f, 10f, 10f, 10f)
                curveTo(8.573f, 10f, 8.75f, 6.25f, 8.75f, 6.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(10f, 6.25f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF6F7F8)),
                fillAlpha = 0.6f,
                strokeAlpha = 0.6f
            ) {
                moveTo(8.75f, 6.25f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5B8C39)),
                fillAlpha = 0.66f,
                strokeAlpha = 0.66f
            ) {
                moveTo(9.375f, 5f)
                lineTo(10.625f, 5f)
                arcTo(0.625f, 0.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.25f, 5.625f)
                lineTo(11.25f, 5.625f)
                arcTo(0.625f, 0.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.625f, 6.25f)
                lineTo(9.375f, 6.25f)
                arcTo(0.625f, 0.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.75f, 5.625f)
                lineTo(8.75f, 5.625f)
                arcTo(0.625f, 0.625f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.375f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE9AD35)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.625f, 8f)
                curveTo(8.97f, 8f, 9.25f, 7.44f, 9.25f, 6.75f)
                curveTo(9.25f, 6.06f, 8.97f, 5.5f, 8.625f, 5.5f)
                curveTo(8.28f, 5.5f, 8f, 6.06f, 8f, 6.75f)
                curveTo(8f, 7.44f, 8.28f, 8f, 8.625f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5C2216)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.375f, 8f)
                curveTo(11.72f, 8f, 12f, 7.44f, 12f, 6.75f)
                curveTo(12f, 6.06f, 11.72f, 5.5f, 11.375f, 5.5f)
                curveTo(11.03f, 5.5f, 10.75f, 6.06f, 10.75f, 6.75f)
                curveTo(10.75f, 7.44f, 11.03f, 8f, 11.375f, 8f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BelizePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Belize,
            contentDescription = "Belize Flag"
        )
    }
}
