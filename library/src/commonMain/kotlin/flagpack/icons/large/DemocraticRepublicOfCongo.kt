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
 * Democratic Republic of Congo Flag (32x24dp)
 *
 * - ISO Alpha-2: CD
 * - ISO Alpha-3: COD
 * - ISO Numeric: 180
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.DemocraticRepublicOfCongo: ImageVector by lazy {
    ImageVector.Builder(
        name = "Democratic Republic of Congo:CD:COD:180:Large",
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
                fill = SolidColor(Color(0xFF3195F9)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 2.5f
            ) {
                moveTo(-1.822f, 25.439f)
                lineTo(-1.128f, 26.479f)
                lineTo(-0.088f, 25.785f)
                lineTo(36.173f, 1.581f)
                lineTo(37.213f, 0.888f)
                lineTo(36.519f, -0.152f)
                lineTo(34.298f, -3.479f)
                lineTo(33.604f, -4.519f)
                lineTo(32.564f, -3.825f)
                lineTo(-3.697f, 20.379f)
                lineTo(-4.736f, 21.073f)
                lineTo(-4.042f, 22.112f)
                lineTo(-1.822f, 25.439f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.931f, 8.606f)
                lineTo(1.445f, 11.024f)
                lineTo(2.559f, 6.883f)
                lineTo(0f, 4.238f)
                lineTo(3.465f, 4.095f)
                lineTo(4.931f, 0f)
                lineTo(6.397f, 4.095f)
                horizontalLineTo(9.855f)
                lineTo(7.302f, 6.883f)
                lineTo(8.581f, 10.78f)
                lineTo(4.931f, 8.606f)
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
            imageVector = FlagIcons.Large.DemocraticRepublicOfCongo,
            contentDescription = "Democratic Republic of Congo Flag"
        )
    }
}
