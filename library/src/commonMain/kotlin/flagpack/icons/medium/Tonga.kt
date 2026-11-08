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
 * Tonga Flag (20x15dp)
 *
 * - ISO Alpha-2: TO
 * - ISO Alpha-3: TON
 * - ISO Numeric: 776
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Tonga: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tonga:TO:TON:776:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11.25f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.5f, 1.25f)
                horizontalLineTo(5f)
                verticalLineTo(3.75f)
                horizontalLineTo(2.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(5f)
                verticalLineTo(8.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(10f)
                verticalLineTo(3.75f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.25f)
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
            imageVector = FlagIcons.Medium.Tonga,
            contentDescription = "Tonga Flag"
        )
    }
}
