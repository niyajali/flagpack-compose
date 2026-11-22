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
 * Ghana Flag (20x15dp)
 *
 * - ISO Alpha-2: GH
 * - ISO Alpha-3: GHA
 * - ISO Numeric: 288
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Ghana: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ghana:GH:GHA:288:Medium",
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
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                fillAlpha = 0.9f,
                strokeAlpha = 0.9f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.047f, 9.057f)
                lineTo(7.869f, 10.568f)
                lineTo(8.565f, 7.979f)
                lineTo(6.965f, 6.326f)
                lineTo(9.131f, 6.237f)
                lineTo(10.047f, 3.678f)
                lineTo(10.963f, 6.237f)
                horizontalLineTo(13.125f)
                lineTo(11.53f, 7.979f)
                lineTo(12.329f, 10.415f)
                lineTo(10.047f, 9.057f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GhanaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Ghana,
            contentDescription = "Ghana Flag"
        )
    }
}
