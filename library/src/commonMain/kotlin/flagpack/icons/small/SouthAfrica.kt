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
 * South Africa Flag (16x12dp)
 *
 * - ISO Alpha-2: ZA
 * - ISO Alpha-3: ZAF
 * - ISO Numeric: 710
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SouthAfrica: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Africa:ZA:ZAF:710:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.714f, 5f)
                lineTo(0f, -1f)
                verticalLineTo(13f)
                lineTo(7.714f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(7.714f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-1f, -4f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-18f)
                close()
                moveTo(7.714f, 5f)
                lineTo(0f, -1f)
                verticalLineTo(13f)
                lineTo(7.714f, 7f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(7.714f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, -1f)
                lineTo(0.614f, -1.789f)
                lineTo(-1f, -3.045f)
                verticalLineTo(-1f)
                horizontalLineTo(0f)
                close()
                moveTo(7.714f, 5f)
                lineTo(7.1f, 5.789f)
                lineTo(7.371f, 6f)
                horizontalLineTo(7.714f)
                verticalLineTo(5f)
                close()
                moveTo(0f, 13f)
                horizontalLineTo(-1f)
                verticalLineTo(15.045f)
                lineTo(0.614f, 13.789f)
                lineTo(0f, 13f)
                close()
                moveTo(7.714f, 7f)
                verticalLineTo(6f)
                horizontalLineTo(7.371f)
                lineTo(7.1f, 6.211f)
                lineTo(7.714f, 7f)
                close()
                moveTo(16f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                close()
                moveTo(16f, 5f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                close()
                moveTo(-0.614f, -0.211f)
                lineTo(7.1f, 5.789f)
                lineTo(8.328f, 4.211f)
                lineTo(0.614f, -1.789f)
                lineTo(-0.614f, -0.211f)
                close()
                moveTo(1f, 13f)
                verticalLineTo(-1f)
                horizontalLineTo(-1f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                close()
                moveTo(7.1f, 6.211f)
                lineTo(-0.614f, 12.211f)
                lineTo(0.614f, 13.789f)
                lineTo(8.328f, 7.789f)
                lineTo(7.1f, 6.211f)
                close()
                moveTo(16f, 6f)
                horizontalLineTo(7.714f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                close()
                moveTo(15f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                close()
                moveTo(7.714f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(7.714f)
                verticalLineTo(6f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            stroke = SolidColor(Color(0xFFFECA00)),
            strokeLineWidth = 1f
        ) {
            moveTo(0.3f, 2.6f)
            lineTo(-0.5f, 2f)
            verticalLineTo(3f)
            verticalLineTo(9f)
            verticalLineTo(10f)
            lineTo(0.3f, 9.4f)
            lineTo(4.3f, 6.4f)
            lineTo(4.833f, 6f)
            lineTo(4.3f, 5.6f)
            lineTo(0.3f, 2.6f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthAfricaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SouthAfrica,
            contentDescription = "South Africa Flag"
        )
    }
}
