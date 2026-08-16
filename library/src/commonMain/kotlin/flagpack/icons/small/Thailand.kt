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
 * Thailand Flag (16x12dp)
 *
 * - ISO Alpha-2: TH
 * - ISO Alpha-3: THA
 * - ISO Numeric: 764
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Thailand: ImageVector by lazy {
    ImageVector.Builder(
        name = "Thailand:TH:THA:764:Small",
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
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1.5f
            ) {
                moveTo(0f, 3.25f)
                horizontalLineTo(-0.75f)
                verticalLineTo(4f)
                verticalLineTo(8f)
                verticalLineTo(8.75f)
                horizontalLineTo(0f)
                horizontalLineTo(16f)
                horizontalLineTo(16.75f)
                verticalLineTo(8f)
                verticalLineTo(4f)
                verticalLineTo(3.25f)
                horizontalLineTo(16f)
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
            imageVector = FlagIcons.Small.Thailand,
            contentDescription = "Thailand Flag"
        )
    }
}
