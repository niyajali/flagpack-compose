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
 * Democratic Republic of Congo Flag (20x15dp)
 *
 * - ISO Alpha-2: CD
 * - ISO Alpha-3: COD
 * - ISO Numeric: 180
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.DemocraticRepublicOfCongo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Democratic Republic of Congo:CD:COD:180:Medium",
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
                fill = SolidColor(Color(0xFF3195F9)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 1.5625f
            ) {
                moveTo(-1.139f, 15.899f)
                lineTo(-0.705f, 16.549f)
                lineTo(-0.055f, 16.116f)
                lineTo(22.608f, 0.988f)
                lineTo(23.258f, 0.555f)
                lineTo(22.824f, -0.095f)
                lineTo(21.436f, -2.174f)
                lineTo(21.003f, -2.824f)
                lineTo(20.353f, -2.391f)
                lineTo(-2.31f, 12.737f)
                lineTo(-2.96f, 13.17f)
                lineTo(-2.526f, 13.82f)
                lineTo(-1.139f, 15.899f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.082f, 5.379f)
                lineTo(0.903f, 6.89f)
                lineTo(1.599f, 4.302f)
                lineTo(0f, 2.649f)
                lineTo(2.165f, 2.559f)
                lineTo(3.082f, 0f)
                lineTo(3.998f, 2.559f)
                horizontalLineTo(6.16f)
                lineTo(4.564f, 4.302f)
                lineTo(5.363f, 6.737f)
                lineTo(3.082f, 5.379f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DemocraticRepublicOfCongoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.DemocraticRepublicOfCongo,
            contentDescription = "Democratic Republic of Congo Flag"
        )
    }
}
