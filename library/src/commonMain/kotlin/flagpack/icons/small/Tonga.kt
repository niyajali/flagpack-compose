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
 * Tonga Flag (16x12dp)
 *
 * - ISO Alpha-2: TO
 * - ISO Alpha-3: TON
 * - ISO Numeric: 776
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Tonga: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tonga:TO:TON:776:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineTo(1f)
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
            imageVector = FlagIcons.Small.Tonga,
            contentDescription = "Tonga Flag"
        )
    }
}
