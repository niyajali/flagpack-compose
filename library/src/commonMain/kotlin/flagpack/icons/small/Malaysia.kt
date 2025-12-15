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
 * Malaysia Flag (16x12dp)
 *
 * - ISO Alpha-2: MY
 * - ISO Alpha-3: MYS
 * - ISO Numeric: 458
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Malaysia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malaysia:MY:MYS:458:Small",
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
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.014f, 2.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.45f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.014f, 5.1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.45f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.056f, 7.6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.056f, 10.1f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(1.25f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.797f, 3.101f)
                curveTo(1.797f, 3.789f, 2.121f, 4.44f, 2.78f, 4.44f)
                curveTo(3.77f, 4.44f, 3.962f, 4.229f, 4.424f, 3.938f)
                curveTo(4.533f, 4.183f, 4.165f, 5.232f, 2.767f, 5.232f)
                curveTo(1.649f, 5.21f, 0.745f, 4.311f, 0.745f, 3.101f)
                curveTo(0.745f, 1.712f, 1.767f, 0.962f, 2.739f, 0.97f)
                curveTo(3.597f, 0.97f, 4.507f, 1.457f, 4.479f, 2.078f)
                curveTo(4.075f, 1.683f, 3.636f, 1.683f, 2.905f, 1.683f)
                curveTo(2.174f, 1.683f, 1.797f, 2.413f, 1.797f, 3.101f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.5f, 3.65f)
                lineTo(5.036f, 4.327f)
                lineTo(5.059f, 3.507f)
                lineTo(4.286f, 3.782f)
                lineTo(4.787f, 3.132f)
                lineTo(4f, 2.9f)
                lineTo(4.787f, 2.668f)
                lineTo(4.286f, 2.018f)
                lineTo(5.059f, 2.293f)
                lineTo(5.036f, 1.473f)
                lineTo(5.5f, 2.15f)
                lineTo(5.964f, 1.473f)
                lineTo(5.941f, 2.293f)
                lineTo(6.714f, 2.018f)
                lineTo(6.213f, 2.668f)
                lineTo(7f, 2.9f)
                lineTo(6.213f, 3.132f)
                lineTo(6.714f, 3.782f)
                lineTo(5.941f, 3.507f)
                lineTo(5.964f, 4.327f)
                lineTo(5.5f, 3.65f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MalaysiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Malaysia,
            contentDescription = "Malaysia Flag"
        )
    }
}
