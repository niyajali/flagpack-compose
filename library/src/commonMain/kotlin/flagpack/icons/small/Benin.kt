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
 * Benin Flag (16x12dp)
 *
 * - ISO Alpha-2: BJ
 * - ISO Alpha-3: BEN
 * - ISO Numeric: 204
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Benin: ImageVector by lazy {
    ImageVector.Builder(
        name = "Benin:BJ:BEN:204:Small",
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
                fill = SolidColor(Color(0xFFDD2C2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-7f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BeninPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Benin,
            contentDescription = "Benin Flag"
        )
    }
}
