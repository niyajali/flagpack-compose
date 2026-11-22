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
 * Gibraltar Flag (20x15dp)
 *
 * - ISO Alpha-2: GI
 * - ISO Alpha-3: GIB
 * - ISO Numeric: 292
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Gibraltar: ImageVector by lazy {
    ImageVector.Builder(
        name = "Gibraltar:GI:GIB:292:Medium",
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
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
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
                fill = SolidColor(Color(0xFFDB000B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.838f, 2.042f)
                horizontalLineTo(8.917f)
                verticalLineTo(2.958f)
                horizontalLineTo(9.371f)
                lineTo(9.339f, 5.479f)
                horizontalLineTo(7.996f)
                verticalLineTo(4.333f)
                horizontalLineTo(8.456f)
                verticalLineTo(3.417f)
                horizontalLineTo(7.535f)
                verticalLineTo(3.875f)
                horizontalLineTo(7.075f)
                verticalLineTo(3.417f)
                horizontalLineTo(6.154f)
                verticalLineTo(4.333f)
                horizontalLineTo(6.614f)
                verticalLineTo(5.479f)
                horizontalLineTo(5.643f)
                verticalLineTo(6.396f)
                lineTo(6.103f, 6.396f)
                verticalLineTo(9.146f)
                horizontalLineTo(5.643f)
                verticalLineTo(10.063f)
                horizontalLineTo(14.393f)
                verticalLineTo(9.146f)
                horizontalLineTo(13.472f)
                verticalLineTo(6.396f)
                lineTo(14.393f, 6.396f)
                verticalLineTo(5.479f)
                horizontalLineTo(13.49f)
                lineTo(13.513f, 4.333f)
                horizontalLineTo(13.983f)
                verticalLineTo(3.417f)
                horizontalLineTo(13.061f)
                verticalLineTo(3.875f)
                horizontalLineTo(12.601f)
                verticalLineTo(3.417f)
                horizontalLineTo(11.68f)
                verticalLineTo(4.333f)
                horizontalLineTo(12.131f)
                lineTo(12.108f, 5.479f)
                horizontalLineTo(10.72f)
                lineTo(10.753f, 2.958f)
                horizontalLineTo(11.219f)
                verticalLineTo(2.042f)
                horizontalLineTo(10.298f)
                verticalLineTo(2.5f)
                horizontalLineTo(9.838f)
                verticalLineTo(2.042f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(7.132f, 5.48f)
                curveTo(7.132f, 5.353f, 7.235f, 5.25f, 7.362f, 5.25f)
                curveTo(7.489f, 5.25f, 7.592f, 5.353f, 7.592f, 5.48f)
                verticalLineTo(6.625f)
                horizontalLineTo(7.132f)
                verticalLineTo(5.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.76f, 8.556f)
                curveTo(6.76f, 8.175f, 7.069f, 7.866f, 7.451f, 7.866f)
                curveTo(7.832f, 7.866f, 8.142f, 8.175f, 8.142f, 8.556f)
                verticalLineTo(9.699f)
                horizontalLineTo(6.76f)
                verticalLineTo(8.556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.826f, 8.556f)
                curveTo(11.826f, 8.175f, 12.135f, 7.866f, 12.517f, 7.866f)
                curveTo(12.898f, 7.866f, 13.207f, 8.175f, 13.207f, 8.556f)
                verticalLineTo(9.699f)
                horizontalLineTo(11.826f)
                verticalLineTo(8.556f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.063f, 8.328f)
                curveTo(9.063f, 7.82f, 9.475f, 7.407f, 9.984f, 7.407f)
                curveTo(10.492f, 7.407f, 10.905f, 7.82f, 10.905f, 8.328f)
                verticalLineTo(10.157f)
                horizontalLineTo(9.063f)
                verticalLineTo(8.328f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(9.895f, 5.48f)
                curveTo(9.895f, 5.353f, 9.998f, 5.25f, 10.125f, 5.25f)
                curveTo(10.252f, 5.25f, 10.355f, 5.353f, 10.355f, 5.48f)
                verticalLineTo(6.625f)
                horizontalLineTo(9.895f)
                verticalLineTo(5.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(12.658f, 5.48f)
                curveTo(12.658f, 5.353f, 12.761f, 5.25f, 12.888f, 5.25f)
                curveTo(13.015f, 5.25f, 13.118f, 5.353f, 13.118f, 5.48f)
                verticalLineTo(6.625f)
                horizontalLineTo(12.658f)
                verticalLineTo(5.48f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.326f, 9.498f)
                lineTo(10.214f, 9.706f)
                lineTo(10.003f, 9.392f)
                lineTo(8.279f, 10.547f)
                lineTo(10.201f, 11.462f)
                lineTo(11.897f, 10.354f)
                lineTo(10.326f, 9.498f)
                close()
                moveTo(9.539f, 10.455f)
                lineTo(10.094f, 10.083f)
                lineTo(10.68f, 10.403f)
                lineTo(10.153f, 10.747f)
                lineTo(9.539f, 10.455f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.974f, 12.833f)
                horizontalLineTo(9.895f)
                verticalLineTo(13.75f)
                horizontalLineTo(8.974f)
                verticalLineTo(12.833f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.5f, 11.25f)
                horizontalLineTo(10.593f)
                verticalLineTo(13.75f)
                horizontalLineTo(9.5f)
                verticalLineTo(11.25f)
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
            imageVector = FlagIcons.Medium.Gibraltar,
            contentDescription = "Gibraltar Flag"
        )
    }
}
