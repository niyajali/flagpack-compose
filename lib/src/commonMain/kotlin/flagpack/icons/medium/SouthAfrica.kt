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
 * South Africa Flag (20x15dp)
 *
 * - ISO Alpha-2: ZA
 * - ISO Alpha-3: ZAF
 * - ISO Numeric: 710
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SouthAfrica: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Africa:ZA:ZAF:710:Medium",
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
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.643f, 6.25f)
                lineTo(0f, -1.25f)
                verticalLineTo(16.25f)
                lineTo(9.643f, 8.75f)
                horizontalLineTo(20f)
                verticalLineTo(6.25f)
                horizontalLineTo(9.643f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-2f, -4.25f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-24f)
                close()
                moveTo(9.643f, 6.25f)
                lineTo(0f, -1.25f)
                verticalLineTo(16.25f)
                lineTo(9.643f, 8.75f)
                horizontalLineTo(20f)
                verticalLineTo(6.25f)
                horizontalLineTo(9.643f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, -1.25f)
                lineTo(0.767f, -2.237f)
                lineTo(-1.25f, -3.806f)
                verticalLineTo(-1.25f)
                horizontalLineTo(0f)
                close()
                moveTo(9.643f, 6.25f)
                lineTo(8.875f, 7.237f)
                lineTo(9.214f, 7.5f)
                horizontalLineTo(9.643f)
                verticalLineTo(6.25f)
                close()
                moveTo(0f, 16.25f)
                horizontalLineTo(-1.25f)
                verticalLineTo(18.806f)
                lineTo(0.767f, 17.237f)
                lineTo(0f, 16.25f)
                close()
                moveTo(9.643f, 8.75f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.214f)
                lineTo(8.875f, 7.763f)
                lineTo(9.643f, 8.75f)
                close()
                moveTo(20f, 8.75f)
                verticalLineTo(10f)
                horizontalLineTo(21.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(20f)
                close()
                moveTo(20f, 6.25f)
                horizontalLineTo(21.25f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(6.25f)
                close()
                moveTo(-0.767f, -0.263f)
                lineTo(8.875f, 7.237f)
                lineTo(10.41f, 5.263f)
                lineTo(0.767f, -2.237f)
                lineTo(-0.767f, -0.263f)
                close()
                moveTo(1.25f, 16.25f)
                verticalLineTo(-1.25f)
                horizontalLineTo(-1.25f)
                verticalLineTo(16.25f)
                horizontalLineTo(1.25f)
                close()
                moveTo(8.875f, 7.763f)
                lineTo(-0.767f, 15.263f)
                lineTo(0.767f, 17.237f)
                lineTo(10.41f, 9.737f)
                lineTo(8.875f, 7.763f)
                close()
                moveTo(20f, 7.5f)
                horizontalLineTo(9.643f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                close()
                moveTo(18.75f, 6.25f)
                verticalLineTo(8.75f)
                horizontalLineTo(21.25f)
                verticalLineTo(6.25f)
                horizontalLineTo(18.75f)
                close()
                moveTo(9.643f, 7.5f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(9.643f)
                verticalLineTo(7.5f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            stroke = SolidColor(Color(0xFFFECA00)),
            strokeLineWidth = 1.25f
        ) {
            moveTo(0.375f, 3.25f)
            lineTo(-0.625f, 2.5f)
            verticalLineTo(3.75f)
            verticalLineTo(11.25f)
            verticalLineTo(12.5f)
            lineTo(0.375f, 11.75f)
            lineTo(5.375f, 8f)
            lineTo(6.042f, 7.5f)
            lineTo(5.375f, 7f)
            lineTo(0.375f, 3.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthAfricaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SouthAfrica,
            contentDescription = "South Africa Flag"
        )
    }
}
