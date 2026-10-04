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
 * Malaysia Flag (20x15dp)
 *
 * - ISO Alpha-2: MY
 * - ISO Alpha-3: MYS
 * - ISO Numeric: 458
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Malaysia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malaysia:MY:MYS:458:Medium",
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
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.017f, 3.125f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.813f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.017f, 6.375f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.813f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.07f, 9.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.563f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0.07f, 12.625f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.688f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(1.563f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(10f)
                verticalLineTo(8.5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.246f, 3.876f)
                curveTo(2.246f, 4.737f, 2.651f, 5.55f, 3.475f, 5.55f)
                curveTo(4.712f, 5.55f, 4.953f, 5.286f, 5.53f, 4.923f)
                curveTo(5.666f, 5.229f, 5.206f, 6.54f, 3.458f, 6.54f)
                curveTo(2.061f, 6.512f, 0.931f, 5.389f, 0.931f, 3.876f)
                curveTo(0.931f, 2.14f, 2.209f, 1.202f, 3.423f, 1.213f)
                curveTo(4.496f, 1.213f, 5.633f, 1.821f, 5.599f, 2.598f)
                curveTo(5.093f, 2.104f, 4.544f, 2.104f, 3.631f, 2.104f)
                curveTo(2.718f, 2.104f, 2.246f, 3.016f, 2.246f, 3.876f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.875f, 4.563f)
                lineTo(6.296f, 5.408f)
                lineTo(6.324f, 4.383f)
                lineTo(5.358f, 4.727f)
                lineTo(5.983f, 3.915f)
                lineTo(5f, 3.625f)
                lineTo(5.983f, 3.335f)
                lineTo(5.358f, 2.523f)
                lineTo(6.324f, 2.867f)
                lineTo(6.296f, 1.842f)
                lineTo(6.875f, 2.688f)
                lineTo(7.454f, 1.842f)
                lineTo(7.426f, 2.867f)
                lineTo(8.392f, 2.523f)
                lineTo(7.767f, 3.335f)
                lineTo(8.75f, 3.625f)
                lineTo(7.767f, 3.915f)
                lineTo(8.392f, 4.727f)
                lineTo(7.426f, 4.383f)
                lineTo(7.454f, 5.408f)
                lineTo(6.875f, 4.563f)
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
            imageVector = FlagIcons.Medium.Malaysia,
            contentDescription = "Malaysia Flag"
        )
    }
}
