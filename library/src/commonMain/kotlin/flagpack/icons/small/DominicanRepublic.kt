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
 * Dominican Republic Flag (16x12dp)
 *
 * - ISO Alpha-2: DO
 * - ISO Alpha-3: DOM
 * - ISO Numeric: 214
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.DominicanRepublic: ImageVector by lazy {
    ImageVector.Builder(
        name = "Dominican Republic:DO:DOM:214:Small",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4257BF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4257BF))) {
                moveTo(9f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF309404))) {
                moveTo(6.818f, 5.555f)
                lineTo(7.316f, 5.603f)
                curveTo(7.231f, 6.493f, 7.342f, 6.868f, 7.522f, 6.868f)
                verticalLineTo(7.368f)
                curveTo(6.899f, 7.368f, 6.707f, 6.717f, 6.818f, 5.555f)
                close()
            }
            path(fill = SolidColor(Color(0xFF309404))) {
                moveTo(9.213f, 5.555f)
                lineTo(8.716f, 5.603f)
                curveTo(8.801f, 6.493f, 8.69f, 6.868f, 8.51f, 6.868f)
                verticalLineTo(7.368f)
                curveTo(9.132f, 7.368f, 9.325f, 6.717f, 9.213f, 5.555f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(7.364f, 5.346f)
                horizontalLineToRelative(0.473f)
                verticalLineToRelative(0.738f)
                horizontalLineToRelative(-0.473f)
                close()
            }
            path(fill = SolidColor(Color(0xFF003994))) {
                moveTo(8.091f, 6.223f)
                horizontalLineTo(8.564f)
                verticalLineTo(6.598f)
                curveTo(8.564f, 6.799f, 8.401f, 6.962f, 8.2f, 6.962f)
                horizontalLineTo(8.091f)
                verticalLineTo(6.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDE2110))) {
                moveTo(8.054f, 5.3f)
                horizontalLineToRelative(0.473f)
                verticalLineToRelative(0.738f)
                horizontalLineToRelative(-0.473f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDE2110))) {
                moveTo(7.364f, 6.223f)
                horizontalLineTo(7.836f)
                verticalLineTo(6.962f)
                horizontalLineTo(7.727f)
                curveTo(7.526f, 6.962f, 7.364f, 6.799f, 7.364f, 6.598f)
                verticalLineTo(6.223f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00319C))) {
                moveTo(7.167f, 5.305f)
                lineTo(6.833f, 4.933f)
                curveTo(7.186f, 4.615f, 7.554f, 4.45f, 7.933f, 4.45f)
                curveTo(8.312f, 4.45f, 8.68f, 4.615f, 9.033f, 4.933f)
                lineTo(8.699f, 5.305f)
                curveTo(8.432f, 5.064f, 8.178f, 4.95f, 7.933f, 4.95f)
                curveTo(7.689f, 4.95f, 7.435f, 5.064f, 7.167f, 5.305f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDE2110))) {
                moveTo(7.204f, 7.797f)
                lineTo(6.869f, 7.425f)
                curveTo(7.222f, 7.108f, 7.59f, 6.942f, 7.969f, 6.942f)
                curveTo(8.349f, 6.942f, 8.717f, 7.108f, 9.07f, 7.425f)
                lineTo(8.735f, 7.797f)
                curveTo(8.468f, 7.556f, 8.214f, 7.442f, 7.969f, 7.442f)
                curveTo(7.725f, 7.442f, 7.471f, 7.556f, 7.204f, 7.797f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun DominicanRepublicPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.DominicanRepublic,
            contentDescription = "Dominican Republic Flag"
        )
    }
}
