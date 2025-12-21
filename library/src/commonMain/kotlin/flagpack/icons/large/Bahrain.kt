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
 * Bahrain Flag (32x24dp)
 *
 * - ISO Alpha-2: BH
 * - ISO Alpha-3: BHR
 * - ISO Numeric: 048
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Bahrain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bahrain:BH:BHR:048:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6.8f)
                lineTo(12f, 2f)
                lineTo(6.8f, 4f)
                lineTo(12f, 6f)
                lineTo(6.8f, 8f)
                lineTo(12f, 10f)
                lineTo(6.8f, 12f)
                lineTo(12f, 14f)
                lineTo(6.8f, 16f)
                lineTo(12f, 18f)
                lineTo(6.8f, 20f)
                lineTo(12f, 22f)
                lineTo(6.8f, 24f)
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
            imageVector = FlagIcons.Large.Bahrain,
            contentDescription = "Bahrain Flag"
        )
    }
}
