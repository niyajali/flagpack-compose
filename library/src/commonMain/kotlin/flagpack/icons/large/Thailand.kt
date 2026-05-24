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
 * Thailand Flag (32x24dp)
 *
 * - ISO Alpha-2: TH
 * - ISO Alpha-3: THA
 * - ISO Numeric: 764
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Thailand: ImageVector by lazy {
    ImageVector.Builder(
        name = "Thailand:TH:THA:764:Large",
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
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 3f
            ) {
                moveTo(0f, 6.5f)
                horizontalLineTo(-1.5f)
                verticalLineTo(8f)
                verticalLineTo(16f)
                verticalLineTo(17.5f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33.5f)
                verticalLineTo(16f)
                verticalLineTo(8f)
                verticalLineTo(6.5f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ThailandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Thailand,
            contentDescription = "Thailand Flag"
        )
    }
}
