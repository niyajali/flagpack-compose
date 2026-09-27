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
 * Czech Republic Flag (32x24dp)
 *
 * - ISO Alpha-2: CZ
 * - ISO Alpha-3: CZE
 * - ISO Numeric: 203
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.CzechRepublic: ImageVector by lazy {
    ImageVector.Builder(
        name = "Czech Republic:CZ:CZE:203:Large",
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
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, -2f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(-2f)
                horizontalLineTo(0f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF3D58DB)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 0f)
            verticalLineTo(24f)
            lineTo(18f, 12f)
            lineTo(0f, 0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(18f, 12f)
                lineTo(0f, 0f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun CzechRepublicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.CzechRepublic,
            contentDescription = "Czech Republic Flag"
        )
    }
}
