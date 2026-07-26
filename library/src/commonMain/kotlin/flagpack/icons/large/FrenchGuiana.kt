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
 * French Guiana Flag (32x24dp)
 *
 * - ISO Alpha-2: GF
 * - ISO Alpha-3: GUF
 * - ISO Numeric: 254
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.FrenchGuiana: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Guiana:GF:GUF:254:Large",
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
            path(fill = SolidColor(Color(0xFF5EAA22))) {
                moveTo(2f, 0f)
                lineTo(30f, 0f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 2f)
                lineTo(32f, 22f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30f, 24f)
                lineTo(2f, 24f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22f)
                lineTo(0f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(32f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE21835)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.931f, 14.406f)
                lineTo(12.445f, 16.824f)
                lineTo(13.559f, 12.683f)
                lineTo(11f, 10.038f)
                lineTo(14.465f, 9.895f)
                lineTo(15.931f, 5.8f)
                lineTo(17.396f, 9.895f)
                horizontalLineTo(20.855f)
                lineTo(18.302f, 12.683f)
                lineTo(19.581f, 16.58f)
                lineTo(15.931f, 14.406f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchGuianaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.FrenchGuiana,
            contentDescription = "French Guiana Flag"
        )
    }
}
