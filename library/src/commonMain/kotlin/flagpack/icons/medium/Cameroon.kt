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
 * Cameroon Flag (20x15dp)
 *
 * - ISO Alpha-2: CM
 * - ISO Alpha-3: CMR
 * - ISO Numeric: 120
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Cameroon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cameroon:CM:CMR:120:Medium",
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
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.047f, 9.056f)
                lineTo(7.869f, 10.568f)
                lineTo(8.565f, 7.979f)
                lineTo(6.965f, 6.326f)
                lineTo(9.131f, 6.237f)
                lineTo(10.047f, 3.678f)
                lineTo(10.963f, 6.237f)
                horizontalLineTo(13.125f)
                lineTo(11.53f, 7.979f)
                lineTo(12.329f, 10.415f)
                lineTo(10.047f, 9.056f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0B9E7A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CameroonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Cameroon,
            contentDescription = "Cameroon Flag"
        )
    }
}
