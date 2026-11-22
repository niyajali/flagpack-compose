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
 * Tonga Flag (32x24dp)
 *
 * - ISO Alpha-2: TO
 * - ISO Alpha-3: TON
 * - ISO Numeric: 776
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Tonga: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tonga:TO:TON:776:Large",
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
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 2f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(2f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TongaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Tonga,
            contentDescription = "Tonga Flag"
        )
    }
}
