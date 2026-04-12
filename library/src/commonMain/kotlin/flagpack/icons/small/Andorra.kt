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
 * Andorra Flag (16x12dp)
 *
 * - ISO Alpha-2: AD
 * - ISO Alpha-3: AND
 * - ISO Numeric: 020
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Andorra: ImageVector by lazy {
    ImageVector.Builder(
        name = "Andorra:AD:AND:020:Small",
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
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.9f, 3.607f)
                curveTo(4.9f, 3.052f, 5.352f, 2.603f, 5.907f, 2.607f)
                lineTo(10.302f, 2.638f)
                curveTo(10.851f, 2.642f, 11.295f, 3.089f, 11.295f, 3.638f)
                verticalLineTo(7.645f)
                curveTo(11.295f, 7.645f, 10.851f, 9.645f, 8.149f, 9.645f)
                curveTo(5.447f, 9.645f, 4.9f, 7.6f, 4.9f, 7.6f)
                verticalLineTo(3.607f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.15f, 4.2f)
                curveTo(5.564f, 4.2f, 5.9f, 3.864f, 5.9f, 3.45f)
                curveTo(5.9f, 3.036f, 5.564f, 2.7f, 5.15f, 2.7f)
                curveTo(4.736f, 2.7f, 4.4f, 3.036f, 4.4f, 3.45f)
                curveTo(4.4f, 3.864f, 4.736f, 4.2f, 5.15f, 4.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.15f, 6.4f)
                curveTo(5.564f, 6.4f, 5.9f, 6.064f, 5.9f, 5.65f)
                curveTo(5.9f, 5.236f, 5.564f, 4.9f, 5.15f, 4.9f)
                curveTo(4.736f, 4.9f, 4.4f, 5.236f, 4.4f, 5.65f)
                curveTo(4.4f, 6.064f, 4.736f, 6.4f, 5.15f, 6.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.15f, 8.2f)
                curveTo(5.564f, 8.2f, 5.9f, 7.864f, 5.9f, 7.45f)
                curveTo(5.9f, 7.036f, 5.564f, 6.7f, 5.15f, 6.7f)
                curveTo(4.736f, 6.7f, 4.4f, 7.036f, 4.4f, 7.45f)
                curveTo(4.4f, 7.864f, 4.736f, 8.2f, 5.15f, 8.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.85f, 4.2f)
                curveTo(11.264f, 4.2f, 11.6f, 3.864f, 11.6f, 3.45f)
                curveTo(11.6f, 3.036f, 11.264f, 2.7f, 10.85f, 2.7f)
                curveTo(10.436f, 2.7f, 10.1f, 3.036f, 10.1f, 3.45f)
                curveTo(10.1f, 3.864f, 10.436f, 4.2f, 10.85f, 4.2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.85f, 6.4f)
                curveTo(11.264f, 6.4f, 11.6f, 6.064f, 11.6f, 5.65f)
                curveTo(11.6f, 5.236f, 11.264f, 4.9f, 10.85f, 4.9f)
                curveTo(10.436f, 4.9f, 10.1f, 5.236f, 10.1f, 5.65f)
                curveTo(10.1f, 6.064f, 10.436f, 6.4f, 10.85f, 6.4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.85f, 8.2f)
                curveTo(11.264f, 8.2f, 11.6f, 7.864f, 11.6f, 7.45f)
                curveTo(11.6f, 7.036f, 11.264f, 6.7f, 10.85f, 6.7f)
                curveTo(10.436f, 6.7f, 10.1f, 7.036f, 10.1f, 7.45f)
                curveTo(10.1f, 7.864f, 10.436f, 8.2f, 10.85f, 8.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF805440))) {
                moveTo(5.912f, 8.335f)
                lineTo(5.964f, 8.208f)
                curveTo(6.568f, 8.467f, 7.255f, 8.597f, 8.026f, 8.597f)
                curveTo(8.797f, 8.597f, 9.466f, 8.467f, 10.033f, 8.209f)
                lineTo(10.088f, 8.335f)
                curveTo(9.502f, 8.601f, 8.815f, 8.734f, 8.026f, 8.734f)
                curveTo(7.238f, 8.734f, 6.533f, 8.601f, 5.912f, 8.335f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AndorraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Andorra,
            contentDescription = "Andorra Flag"
        )
    }
}
