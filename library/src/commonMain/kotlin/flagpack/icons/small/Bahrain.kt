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
 * Bahrain Flag (16x12dp)
 *
 * - ISO Alpha-2: BH
 * - ISO Alpha-3: BHR
 * - ISO Numeric: 048
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Bahrain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bahrain:BH:BHR:048:Small",
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
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(1f, 0f)
                lineTo(15f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 1f)
                lineTo(16f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                lineTo(1f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11f)
                lineTo(0f, 1f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(3.4f)
                lineTo(6f, 1f)
                lineTo(3.4f, 2f)
                lineTo(6f, 3f)
                lineTo(3.4f, 4f)
                lineTo(6f, 5f)
                lineTo(3.4f, 6f)
                lineTo(6f, 7f)
                lineTo(3.4f, 8f)
                lineTo(6f, 9f)
                lineTo(3.4f, 10f)
                lineTo(6f, 11f)
                lineTo(3.4f, 12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BahrainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Bahrain,
            contentDescription = "Bahrain Flag"
        )
    }
}
