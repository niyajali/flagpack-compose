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
 * Chile Flag (16x12dp)
 *
 * - ISO Alpha-2: CL
 * - ISO Alpha-3: CHL
 * - ISO Numeric: 152
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Chile: ImageVector by lazy {
    ImageVector.Builder(
        name = "Chile:CL:CHL:152:Small",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, -1f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.507f, 4.892f)
                lineTo(1.605f, 6.027f)
                lineTo(2.544f, 4.095f)
                lineTo(0.882f, 2.84f)
                lineTo(2.801f, 2.819f)
                lineTo(3.524f, 1.106f)
                lineTo(3.991f, 2.819f)
                lineTo(5.807f, 2.828f)
                lineTo(4.425f, 4.055f)
                lineTo(5.143f, 6.027f)
                lineTo(3.507f, 4.892f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ChilePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Chile,
            contentDescription = "Chile Flag"
        )
    }
}
