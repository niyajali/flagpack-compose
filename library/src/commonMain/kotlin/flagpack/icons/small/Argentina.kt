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
 * Argentina Flag (16x12dp)
 *
 * - ISO Alpha-2: AR
 * - ISO Alpha-3: ARG
 * - ISO Numeric: 032
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Argentina: ImageVector by lazy {
    ImageVector.Builder(
        name = "Argentina:AR:ARG:032:Small",
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.25f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.276f, 7.244f)
                curveTo(8.276f, 7.244f, 7.765f, 8.303f, 7.316f, 8.52f)
                curveTo(7.51f, 8.034f, 7.581f, 7.043f, 7.581f, 7.043f)
                curveTo(7.581f, 7.043f, 6.416f, 7.505f, 6.006f, 7.421f)
                curveTo(6.498f, 7.077f, 7.181f, 6.44f, 7.181f, 6.44f)
                curveTo(7.181f, 6.44f, 5.672f, 5.947f, 5.709f, 5.737f)
                curveTo(6.391f, 5.859f, 7.327f, 5.726f, 7.327f, 5.726f)
                curveTo(7.327f, 5.726f, 6.269f, 4.456f, 6.376f, 4.362f)
                curveTo(6.537f, 4.519f, 7.806f, 5.181f, 7.806f, 5.181f)
                curveTo(7.806f, 5.181f, 7.898f, 4.052f, 8.171f, 3.671f)
                curveTo(8.204f, 3.94f, 8.587f, 5.157f, 8.587f, 5.157f)
                curveTo(8.587f, 5.157f, 9.358f, 4.386f, 9.785f, 4.386f)
                curveTo(9.598f, 4.619f, 9.153f, 5.642f, 9.153f, 5.642f)
                curveTo(9.153f, 5.642f, 10.261f, 5.624f, 10.683f, 5.832f)
                curveTo(10.172f, 5.905f, 9.278f, 6.353f, 9.278f, 6.353f)
                curveTo(9.278f, 6.353f, 10.443f, 7.237f, 10.336f, 7.421f)
                curveTo(9.711f, 7.115f, 8.988f, 7.013f, 8.988f, 7.013f)
                curveTo(8.988f, 7.013f, 9.188f, 8.242f, 9.026f, 8.52f)
                curveTo(8.869f, 8.111f, 8.276f, 7.244f, 8.276f, 7.244f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.25f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.209f, 6.671f)
                curveTo(8.485f, 6.671f, 8.709f, 6.447f, 8.709f, 6.171f)
                curveTo(8.709f, 5.895f, 8.485f, 5.671f, 8.209f, 5.671f)
                curveTo(7.933f, 5.671f, 7.709f, 5.895f, 7.709f, 6.171f)
                curveTo(7.709f, 6.447f, 7.933f, 6.671f, 8.209f, 6.671f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ArgentinaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Argentina,
            contentDescription = "Argentina Flag"
        )
    }
}
