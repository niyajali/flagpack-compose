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
 * Vietnam Flag (20x15dp)
 *
 * - ISO Alpha-2: VN
 * - ISO Alpha-3: VNM
 * - ISO Numeric: 704
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Vietnam: ImageVector by lazy {
    ImageVector.Builder(
        name = "Vietnam:VN:VNM:704:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
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
            path(
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.039f, 9.987f)
                lineTo(6.819f, 12.034f)
                lineTo(7.899f, 8.451f)
                lineTo(5.603f, 6.11f)
                lineTo(8.769f, 6.041f)
                lineTo(10.169f, 2.504f)
                lineTo(11.446f, 6.088f)
                lineTo(14.604f, 6.143f)
                lineTo(12.231f, 8.527f)
                lineTo(13.339f, 11.936f)
                lineTo(10.039f, 9.987f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VietnamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Vietnam,
            contentDescription = "Vietnam Flag"
        )
    }
}
