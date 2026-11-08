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
 * Malta Flag (32x24dp)
 *
 * - ISO Alpha-2: MT
 * - ISO Alpha-3: MLT
 * - ISO Numeric: 470
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Malta: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malta:MT:MLT:470:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(0f, 0f)
            horizontalLineToRelative(32f)
            verticalLineToRelative(24f)
            horizontalLineToRelative(-32f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFA0A0A0)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 4f)
            horizontalLineTo(6f)
            verticalLineTo(6.993f)
            curveTo(5.559f, 7.097f, 5.232f, 7.493f, 5.232f, 7.966f)
            curveTo(5.232f, 7.977f, 5.232f, 7.989f, 5.232f, 8f)
            horizontalLineTo(2f)
            verticalLineTo(12f)
            horizontalLineTo(5.331f)
            curveTo(5.46f, 12.267f, 5.705f, 12.469f, 6f, 12.539f)
            verticalLineTo(16f)
            horizontalLineTo(10f)
            verticalLineTo(12.551f)
            curveTo(10.324f, 12.497f, 10.594f, 12.286f, 10.733f, 12f)
            horizontalLineTo(14f)
            verticalLineTo(8f)
            horizontalLineTo(10.831f)
            curveTo(10.832f, 7.989f, 10.832f, 7.977f, 10.832f, 7.966f)
            curveTo(10.832f, 7.471f, 10.472f, 7.06f, 10f, 6.98f)
            verticalLineTo(4f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6.993f)
                curveTo(5.559f, 7.097f, 5.232f, 7.493f, 5.232f, 7.966f)
                curveTo(5.232f, 7.977f, 5.232f, 7.989f, 5.232f, 8f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                horizontalLineTo(5.331f)
                curveTo(5.46f, 12.267f, 5.705f, 12.469f, 6f, 12.539f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(12.551f)
                curveTo(10.324f, 12.497f, 10.594f, 12.286f, 10.733f, 12f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(10.831f)
                curveTo(10.832f, 7.989f, 10.832f, 7.977f, 10.832f, 7.966f)
                curveTo(10.832f, 7.471f, 10.472f, 7.06f, 10f, 6.98f)
                verticalLineTo(4f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(6f, 4f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                close()
                moveTo(10f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                close()
                moveTo(6f, 6.993f)
                lineTo(6.231f, 7.966f)
                lineTo(7f, 7.783f)
                verticalLineTo(6.993f)
                horizontalLineTo(6f)
                close()
                moveTo(5.232f, 8f)
                verticalLineTo(9f)
                horizontalLineTo(6.267f)
                lineTo(6.232f, 7.966f)
                lineTo(5.232f, 8f)
                close()
                moveTo(2f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 12f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(12f)
                close()
                moveTo(5.331f, 12f)
                lineTo(6.231f, 11.565f)
                lineTo(5.958f, 11f)
                horizontalLineTo(5.331f)
                verticalLineTo(12f)
                close()
                moveTo(6f, 12.539f)
                horizontalLineTo(7f)
                verticalLineTo(11.748f)
                lineTo(6.231f, 11.566f)
                lineTo(6f, 12.539f)
                close()
                moveTo(6f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                close()
                moveTo(10f, 16f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                close()
                moveTo(10f, 12.551f)
                lineTo(9.833f, 11.566f)
                lineTo(9f, 11.707f)
                verticalLineTo(12.551f)
                horizontalLineTo(10f)
                close()
                moveTo(10.733f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(10.105f)
                lineTo(9.832f, 11.565f)
                lineTo(10.733f, 12f)
                close()
                moveTo(14f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(14f)
                close()
                moveTo(14f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                close()
                moveTo(10.831f, 8f)
                lineTo(9.832f, 7.966f)
                lineTo(9.797f, 9f)
                horizontalLineTo(10.831f)
                verticalLineTo(8f)
                close()
                moveTo(10f, 6.98f)
                horizontalLineTo(9f)
                verticalLineTo(7.824f)
                lineTo(9.833f, 7.966f)
                lineTo(10f, 6.98f)
                close()
                moveTo(6f, 5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 6.993f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineTo(6.993f)
                horizontalLineTo(7f)
                close()
                moveTo(6.232f, 7.966f)
                lineTo(6.231f, 7.966f)
                lineTo(5.769f, 6.02f)
                curveTo(4.888f, 6.229f, 4.232f, 7.019f, 4.232f, 7.966f)
                horizontalLineTo(6.232f)
                close()
                moveTo(6.232f, 7.966f)
                lineTo(6.232f, 7.966f)
                horizontalLineTo(4.232f)
                curveTo(4.232f, 7.988f, 4.232f, 8.011f, 4.233f, 8.034f)
                lineTo(6.232f, 7.966f)
                close()
                moveTo(2f, 9f)
                horizontalLineTo(5.232f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                close()
                moveTo(3f, 12f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                horizontalLineTo(3f)
                close()
                moveTo(5.331f, 11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(5.331f)
                verticalLineTo(11f)
                close()
                moveTo(6.231f, 11.566f)
                lineTo(6.231f, 11.565f)
                lineTo(4.43f, 12.435f)
                curveTo(4.688f, 12.969f, 5.176f, 13.371f, 5.769f, 13.512f)
                lineTo(6.231f, 11.566f)
                close()
                moveTo(7f, 16f)
                verticalLineTo(12.539f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                close()
                moveTo(10f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                close()
                moveTo(9f, 12.551f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(12.551f)
                horizontalLineTo(9f)
                close()
                moveTo(10.167f, 13.537f)
                curveTo(10.817f, 13.427f, 11.357f, 13.006f, 11.633f, 12.435f)
                lineTo(9.832f, 11.565f)
                lineTo(9.833f, 11.566f)
                lineTo(10.167f, 13.537f)
                close()
                moveTo(14f, 11f)
                horizontalLineTo(10.733f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                close()
                moveTo(13f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                close()
                moveTo(10.831f, 9f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10.831f)
                verticalLineTo(9f)
                close()
                moveTo(9.832f, 7.966f)
                curveTo(9.832f, 7.966f, 9.832f, 7.966f, 9.832f, 7.966f)
                lineTo(11.83f, 8.034f)
                curveTo(11.831f, 8.011f, 11.832f, 7.988f, 11.832f, 7.966f)
                horizontalLineTo(9.832f)
                close()
                moveTo(9.833f, 7.966f)
                curveTo(9.83f, 7.965f, 9.831f, 7.964f, 9.832f, 7.966f)
                curveTo(9.832f, 7.966f, 9.832f, 7.966f, 9.832f, 7.966f)
                curveTo(9.831f, 7.964f, 9.832f, 7.964f, 9.832f, 7.966f)
                horizontalLineTo(11.832f)
                curveTo(11.832f, 6.975f, 11.112f, 6.154f, 10.167f, 5.994f)
                lineTo(9.833f, 7.966f)
                close()
                moveTo(9f, 4f)
                verticalLineTo(6.98f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFE31D1C)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16f, 0f)
            horizontalLineTo(32f)
            verticalLineTo(24f)
            horizontalLineTo(16f)
            verticalLineTo(0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(16f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(16f)
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
            imageVector = FlagIcons.Large.Malta,
            contentDescription = "Malta Flag"
        )
    }
}
