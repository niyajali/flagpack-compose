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
 * Azerbaijan Flag (20x15dp)
 *
 * - ISO Alpha-2: AZ
 * - ISO Alpha-3: AZE
 * - ISO Numeric: 031
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Azerbaijan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Azerbaijan:AZ:AZE:031:Medium",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
            path(
                fill = SolidColor(Color(0xFF3CA5D9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.726f, 9.317f)
                curveTo(9.884f, 9.123f, 9.225f, 8.461f, 9.234f, 7.49f)
                curveTo(9.242f, 6.58f, 9.829f, 5.811f, 10.755f, 5.602f)
                curveTo(11.681f, 5.393f, 12.495f, 5.834f, 12.495f, 5.834f)
                curveTo(12.24f, 5.267f, 11.352f, 4.869f, 10.623f, 4.871f)
                curveTo(9.266f, 4.874f, 7.819f, 5.91f, 7.805f, 7.491f)
                curveTo(7.79f, 9.13f, 9.351f, 10.062f, 10.724f, 10.059f)
                curveTo(11.825f, 10.056f, 12.348f, 9.347f, 12.456f, 9.046f)
                curveTo(12.456f, 9.046f, 11.568f, 9.511f, 10.726f, 9.317f)
                close()
                moveTo(11.261f, 8.388f)
                lineTo(11.996f, 7.877f)
                lineTo(12.731f, 8.388f)
                lineTo(12.471f, 7.531f)
                lineTo(13.185f, 6.99f)
                lineTo(12.29f, 6.972f)
                lineTo(11.996f, 6.127f)
                lineTo(11.702f, 6.972f)
                lineTo(10.807f, 6.99f)
                lineTo(11.52f, 7.531f)
                lineTo(11.261f, 8.388f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AzerbaijanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Azerbaijan,
            contentDescription = "Azerbaijan Flag"
        )
    }
}
