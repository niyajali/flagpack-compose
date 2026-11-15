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
 * Gibraltar Flag (32x24dp)
 *
 * - ISO Alpha-2: GI
 * - ISO Alpha-3: GIB
 * - ISO Numeric: 292
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Gibraltar: ImageVector by lazy {
    ImageVector.Builder(
        name = "Gibraltar:GI:GIB:292:Large",
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
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB000B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.389f, 5f)
                horizontalLineTo(13.611f)
                verticalLineTo(9.615f)
                horizontalLineTo(12.667f)
                verticalLineTo(6.846f)
                horizontalLineTo(8.889f)
                verticalLineTo(9.615f)
                horizontalLineTo(7f)
                verticalLineTo(10.538f)
                horizontalLineTo(7.944f)
                verticalLineTo(15.154f)
                horizontalLineTo(7f)
                verticalLineTo(16.077f)
                horizontalLineTo(24f)
                verticalLineTo(15.154f)
                horizontalLineTo(23.056f)
                verticalLineTo(10.538f)
                horizontalLineTo(24f)
                verticalLineTo(9.615f)
                horizontalLineTo(22.111f)
                verticalLineTo(6.846f)
                horizontalLineTo(18.333f)
                verticalLineTo(9.615f)
                horizontalLineTo(17.389f)
                verticalLineTo(5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(9.833f, 8.589f)
                curveTo(9.833f, 8.136f, 10.201f, 7.769f, 10.653f, 7.769f)
                curveTo(11.106f, 7.769f, 11.474f, 8.136f, 11.474f, 8.589f)
                verticalLineTo(9.8f)
                horizontalLineTo(9.833f)
                verticalLineTo(8.589f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(19.278f, 8.589f)
                curveTo(19.278f, 8.136f, 19.645f, 7.769f, 20.098f, 7.769f)
                curveTo(20.551f, 7.769f, 20.918f, 8.136f, 20.918f, 8.589f)
                verticalLineTo(9.8f)
                horizontalLineTo(19.278f)
                verticalLineTo(8.589f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.567f, 13.471f)
                curveTo(9.567f, 12.871f, 10.054f, 12.385f, 10.653f, 12.385f)
                curveTo(11.253f, 12.385f, 11.74f, 12.871f, 11.74f, 13.471f)
                verticalLineTo(15.339f)
                horizontalLineTo(9.567f)
                verticalLineTo(13.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(19.012f, 13.471f)
                curveTo(19.012f, 12.871f, 19.498f, 12.385f, 20.098f, 12.385f)
                curveTo(20.698f, 12.385f, 21.184f, 12.871f, 21.184f, 13.471f)
                verticalLineTo(15.339f)
                horizontalLineTo(19.012f)
                verticalLineTo(13.471f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.894f, 13.64f)
                curveTo(13.894f, 12.871f, 14.518f, 12.248f, 15.286f, 12.248f)
                curveTo(16.055f, 12.248f, 16.678f, 12.871f, 16.678f, 13.64f)
                verticalLineTo(16.309f)
                horizontalLineTo(13.894f)
                verticalLineTo(13.64f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(14.556f, 7.666f)
                curveTo(14.556f, 7.213f, 14.923f, 6.846f, 15.376f, 6.846f)
                curveTo(15.829f, 6.846f, 16.196f, 7.213f, 16.196f, 7.666f)
                verticalLineTo(9.8f)
                horizontalLineTo(14.556f)
                verticalLineTo(7.666f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDE1A23))) {
                moveTo(7f, 8.692f)
                horizontalLineToRelative(0.944f)
                verticalLineToRelative(0.923f)
                horizontalLineToRelative(-0.944f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDE1A23)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.5f, 6f)
                horizontalLineTo(9.5f)
                verticalLineTo(7f)
                horizontalLineTo(8.5f)
                verticalLineTo(6f)
                close()
                moveTo(12.318f, 6f)
                horizontalLineTo(13.318f)
                verticalLineTo(7f)
                horizontalLineTo(12.318f)
                verticalLineTo(6f)
                close()
                moveTo(11.75f, 6f)
                horizontalLineTo(10.25f)
                verticalLineTo(7f)
                horizontalLineTo(11.75f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDE1A23)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.091f, 6f)
                horizontalLineTo(19.091f)
                verticalLineTo(7f)
                horizontalLineTo(18.091f)
                verticalLineTo(6f)
                close()
                moveTo(21.818f, 6f)
                horizontalLineTo(22.818f)
                verticalLineTo(7f)
                horizontalLineTo(21.818f)
                verticalLineTo(6f)
                close()
                moveTo(21.204f, 6f)
                horizontalLineTo(19.704f)
                verticalLineTo(7f)
                horizontalLineTo(21.204f)
                verticalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDE1A23)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.8f, 4.023f)
                horizontalLineTo(12.8f)
                verticalLineTo(5.023f)
                horizontalLineTo(13.8f)
                verticalLineTo(4.023f)
                close()
                moveTo(15.3f, 4.023f)
                horizontalLineTo(14.3f)
                verticalLineTo(5.023f)
                horizontalLineTo(15.3f)
                verticalLineTo(4.023f)
                close()
                moveTo(15.8f, 4.023f)
                horizontalLineTo(16.8f)
                verticalLineTo(5.023f)
                horizontalLineTo(15.8f)
                verticalLineTo(4.023f)
                close()
                moveTo(18.3f, 4.023f)
                horizontalLineTo(17.3f)
                verticalLineTo(5.023f)
                horizontalLineTo(18.3f)
                verticalLineTo(4.023f)
                close()
            }
            path(fill = SolidColor(Color(0xFFDE1A23))) {
                moveTo(22.999f, 8.775f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.839f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.439f, 18.453f)
                lineTo(18.152f, 16.679f)
                lineTo(15.258f, 15.326f)
                lineTo(12.364f, 16.99f)
                lineTo(15.439f, 18.453f)
                close()
                moveTo(14.38f, 16.842f)
                lineTo(15.268f, 16.247f)
                lineTo(16.205f, 16.758f)
                lineTo(15.362f, 17.309f)
                lineTo(14.38f, 16.842f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.476f, 21.007f)
                horizontalLineTo(14.949f)
                verticalLineTo(22.114f)
                verticalLineTo(21.74f)
                horizontalLineTo(14.033f)
                verticalLineTo(22.114f)
                horizontalLineTo(13.476f)
                verticalLineTo(21.007f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.816f, 18.114f)
                horizontalLineTo(16.066f)
                verticalLineTo(22.114f)
                horizontalLineTo(14.816f)
                verticalLineTo(18.114f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GibraltarPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Gibraltar,
            contentDescription = "Gibraltar Flag"
        )
    }
}
