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
 * Gibraltar Flag (16x12dp)
 *
 * - ISO Alpha-2: GI
 * - ISO Alpha-3: GIB
 * - ISO Numeric: 292
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Gibraltar: ImageVector by lazy {
    ImageVector.Builder(
        name = "Gibraltar:GI:GIB:292:Small",
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
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
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
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB000B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.229f, 0.633f)
                horizontalLineTo(7.282f)
                verticalLineTo(1.481f)
                horizontalLineTo(7.749f)
                lineTo(7.716f, 3.812f)
                horizontalLineTo(6.334f)
                verticalLineTo(2.752f)
                horizontalLineTo(6.808f)
                verticalLineTo(1.905f)
                horizontalLineTo(5.861f)
                verticalLineTo(2.329f)
                horizontalLineTo(5.387f)
                verticalLineTo(1.905f)
                horizontalLineTo(4.439f)
                verticalLineTo(2.752f)
                horizontalLineTo(4.913f)
                verticalLineTo(3.812f)
                horizontalLineTo(3.914f)
                verticalLineTo(4.66f)
                lineTo(4.388f, 4.66f)
                verticalLineTo(7.202f)
                horizontalLineTo(3.914f)
                verticalLineTo(8.05f)
                horizontalLineTo(12.914f)
                verticalLineTo(7.202f)
                horizontalLineTo(11.967f)
                verticalLineTo(4.66f)
                horizontalLineTo(12.914f)
                verticalLineTo(3.812f)
                horizontalLineTo(11.986f)
                lineTo(12.009f, 2.752f)
                horizontalLineTo(12.492f)
                verticalLineTo(1.905f)
                horizontalLineTo(11.545f)
                verticalLineTo(2.329f)
                horizontalLineTo(11.071f)
                verticalLineTo(1.905f)
                horizontalLineTo(10.124f)
                verticalLineTo(2.752f)
                horizontalLineTo(10.588f)
                lineTo(10.565f, 3.812f)
                horizontalLineTo(9.137f)
                lineTo(9.17f, 1.481f)
                horizontalLineTo(9.65f)
                verticalLineTo(0.633f)
                horizontalLineTo(8.703f)
                verticalLineTo(1.057f)
                horizontalLineTo(8.229f)
                verticalLineTo(0.633f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.808f, 6.845f)
                curveTo(5.808f, 6.54f, 6.055f, 6.293f, 6.361f, 6.293f)
                curveTo(6.666f, 6.293f, 6.913f, 6.54f, 6.913f, 6.845f)
                verticalLineTo(7.759f)
                horizontalLineTo(5.808f)
                verticalLineTo(6.845f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.861f, 6.845f)
                curveTo(9.861f, 6.54f, 10.108f, 6.293f, 10.413f, 6.293f)
                curveTo(10.718f, 6.293f, 10.966f, 6.54f, 10.966f, 6.845f)
                verticalLineTo(7.759f)
                horizontalLineTo(9.861f)
                verticalLineTo(6.845f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.65f, 6.663f)
                curveTo(7.65f, 6.256f, 7.98f, 5.926f, 8.387f, 5.926f)
                curveTo(8.794f, 5.926f, 9.124f, 6.256f, 9.124f, 6.663f)
                verticalLineTo(8.126f)
                horizontalLineTo(7.65f)
                verticalLineTo(6.663f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.661f, 7.599f)
                lineTo(8.571f, 7.765f)
                lineTo(8.402f, 7.513f)
                lineTo(7.023f, 8.438f)
                lineTo(8.561f, 9.17f)
                lineTo(9.917f, 8.283f)
                lineTo(8.661f, 7.599f)
                close()
                moveTo(8.031f, 8.364f)
                lineTo(8.475f, 8.067f)
                lineTo(8.944f, 8.322f)
                lineTo(8.522f, 8.598f)
                lineTo(8.031f, 8.364f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.579f, 10.267f)
                horizontalLineTo(8.316f)
                verticalLineTo(11f)
                horizontalLineTo(7.579f)
                verticalLineTo(10.267f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE8AA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 9f)
                horizontalLineTo(8.874f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
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
            imageVector = FlagIcons.Small.Gibraltar,
            contentDescription = "Gibraltar Flag"
        )
    }
}
