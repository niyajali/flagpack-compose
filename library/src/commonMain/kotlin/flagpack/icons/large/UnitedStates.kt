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
 * United States Flag (32x24dp)
 *
 * - ISO Alpha-2: US
 * - ISO Alpha-3: USA
 * - ISO Numeric: 840
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.UnitedStates: ImageVector by lazy {
    ImageVector.Builder(
        name = "United States:US:USA:840:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 14.667f)
                verticalLineTo(16.667f)
                horizontalLineTo(32f)
                verticalLineTo(14.667f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 18.333f)
                verticalLineTo(20.333f)
                horizontalLineTo(32f)
                verticalLineTo(18.333f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.333f)
                verticalLineTo(9.333f)
                horizontalLineTo(32f)
                verticalLineTo(7.333f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 22f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(22f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(32f)
                verticalLineTo(11f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.667f)
                verticalLineTo(5.667f)
                horizontalLineTo(32f)
                verticalLineTo(3.667f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.722f, 2.939f)
                lineTo(0.996f, 3.448f)
                lineTo(1.241f, 2.542f)
                lineTo(0.596f, 1.968f)
                horizontalLineTo(1.439f)
                lineTo(1.721f, 1.229f)
                lineTo(2.052f, 1.968f)
                horizontalLineTo(2.77f)
                lineTo(2.206f, 2.542f)
                lineTo(2.424f, 3.448f)
                lineTo(1.722f, 2.939f)
                close()
                moveTo(5.722f, 2.939f)
                lineTo(4.996f, 3.448f)
                lineTo(5.241f, 2.542f)
                lineTo(4.596f, 1.968f)
                horizontalLineTo(5.439f)
                lineTo(5.721f, 1.229f)
                lineTo(6.052f, 1.968f)
                horizontalLineTo(6.77f)
                lineTo(6.206f, 2.542f)
                lineTo(6.424f, 3.448f)
                lineTo(5.722f, 2.939f)
                close()
                moveTo(8.996f, 3.448f)
                lineTo(9.722f, 2.939f)
                lineTo(10.424f, 3.448f)
                lineTo(10.206f, 2.542f)
                lineTo(10.77f, 1.968f)
                horizontalLineTo(10.052f)
                lineTo(9.721f, 1.229f)
                lineTo(9.439f, 1.968f)
                horizontalLineTo(8.597f)
                lineTo(9.241f, 2.542f)
                lineTo(8.996f, 3.448f)
                close()
                moveTo(13.722f, 2.939f)
                lineTo(12.996f, 3.448f)
                lineTo(13.241f, 2.542f)
                lineTo(12.597f, 1.968f)
                horizontalLineTo(13.439f)
                lineTo(13.721f, 1.229f)
                lineTo(14.052f, 1.968f)
                horizontalLineTo(14.77f)
                lineTo(14.206f, 2.542f)
                lineTo(14.424f, 3.448f)
                lineTo(13.722f, 2.939f)
                close()
                moveTo(0.996f, 7.448f)
                lineTo(1.722f, 6.939f)
                lineTo(2.424f, 7.448f)
                lineTo(2.206f, 6.542f)
                lineTo(2.77f, 5.968f)
                horizontalLineTo(2.052f)
                lineTo(1.721f, 5.229f)
                lineTo(1.439f, 5.968f)
                horizontalLineTo(0.596f)
                lineTo(1.241f, 6.542f)
                lineTo(0.996f, 7.448f)
                close()
                moveTo(5.722f, 6.939f)
                lineTo(4.996f, 7.448f)
                lineTo(5.241f, 6.542f)
                lineTo(4.596f, 5.968f)
                horizontalLineTo(5.439f)
                lineTo(5.721f, 5.229f)
                lineTo(6.052f, 5.968f)
                horizontalLineTo(6.77f)
                lineTo(6.206f, 6.542f)
                lineTo(6.424f, 7.448f)
                lineTo(5.722f, 6.939f)
                close()
                moveTo(8.996f, 7.448f)
                lineTo(9.722f, 6.939f)
                lineTo(10.424f, 7.448f)
                lineTo(10.206f, 6.542f)
                lineTo(10.77f, 5.968f)
                horizontalLineTo(10.052f)
                lineTo(9.721f, 5.229f)
                lineTo(9.439f, 5.968f)
                horizontalLineTo(8.597f)
                lineTo(9.241f, 6.542f)
                lineTo(8.996f, 7.448f)
                close()
                moveTo(13.722f, 6.939f)
                lineTo(12.996f, 7.448f)
                lineTo(13.241f, 6.542f)
                lineTo(12.597f, 5.968f)
                horizontalLineTo(13.439f)
                lineTo(13.721f, 5.229f)
                lineTo(14.052f, 5.968f)
                horizontalLineTo(14.77f)
                lineTo(14.206f, 6.542f)
                lineTo(14.424f, 7.448f)
                lineTo(13.722f, 6.939f)
                close()
                moveTo(0.996f, 11.448f)
                lineTo(1.722f, 10.939f)
                lineTo(2.424f, 11.448f)
                lineTo(2.206f, 10.542f)
                lineTo(2.77f, 9.968f)
                horizontalLineTo(2.052f)
                lineTo(1.721f, 9.229f)
                lineTo(1.439f, 9.968f)
                horizontalLineTo(0.596f)
                lineTo(1.241f, 10.542f)
                lineTo(0.996f, 11.448f)
                close()
                moveTo(5.722f, 10.939f)
                lineTo(4.996f, 11.448f)
                lineTo(5.241f, 10.542f)
                lineTo(4.596f, 9.968f)
                horizontalLineTo(5.439f)
                lineTo(5.721f, 9.229f)
                lineTo(6.052f, 9.968f)
                horizontalLineTo(6.77f)
                lineTo(6.206f, 10.542f)
                lineTo(6.424f, 11.448f)
                lineTo(5.722f, 10.939f)
                close()
                moveTo(8.996f, 11.448f)
                lineTo(9.722f, 10.939f)
                lineTo(10.424f, 11.448f)
                lineTo(10.206f, 10.542f)
                lineTo(10.77f, 9.968f)
                horizontalLineTo(10.052f)
                lineTo(9.721f, 9.229f)
                lineTo(9.439f, 9.968f)
                horizontalLineTo(8.597f)
                lineTo(9.241f, 10.542f)
                lineTo(8.996f, 11.448f)
                close()
                moveTo(13.722f, 10.939f)
                lineTo(12.996f, 11.448f)
                lineTo(13.241f, 10.542f)
                lineTo(12.597f, 9.968f)
                horizontalLineTo(13.439f)
                lineTo(13.721f, 9.229f)
                lineTo(14.052f, 9.968f)
                horizontalLineTo(14.77f)
                lineTo(14.206f, 10.542f)
                lineTo(14.424f, 11.448f)
                lineTo(13.722f, 10.939f)
                close()
                moveTo(16.996f, 3.448f)
                lineTo(17.722f, 2.939f)
                lineTo(18.424f, 3.448f)
                lineTo(18.206f, 2.542f)
                lineTo(18.77f, 1.968f)
                horizontalLineTo(18.052f)
                lineTo(17.721f, 1.229f)
                lineTo(17.439f, 1.968f)
                horizontalLineTo(16.597f)
                lineTo(17.241f, 2.542f)
                lineTo(16.996f, 3.448f)
                close()
                moveTo(17.722f, 6.939f)
                lineTo(16.996f, 7.448f)
                lineTo(17.241f, 6.542f)
                lineTo(16.597f, 5.968f)
                horizontalLineTo(17.439f)
                lineTo(17.721f, 5.229f)
                lineTo(18.052f, 5.968f)
                horizontalLineTo(18.77f)
                lineTo(18.206f, 6.542f)
                lineTo(18.424f, 7.448f)
                lineTo(17.722f, 6.939f)
                close()
                moveTo(16.996f, 11.448f)
                lineTo(17.722f, 10.939f)
                lineTo(18.424f, 11.448f)
                lineTo(18.206f, 10.542f)
                lineTo(18.77f, 9.968f)
                horizontalLineTo(18.052f)
                lineTo(17.721f, 9.229f)
                lineTo(17.439f, 9.968f)
                horizontalLineTo(16.597f)
                lineTo(17.241f, 10.542f)
                lineTo(16.996f, 11.448f)
                close()
                moveTo(3.722f, 4.939f)
                lineTo(2.996f, 5.448f)
                lineTo(3.241f, 4.542f)
                lineTo(2.596f, 3.968f)
                horizontalLineTo(3.439f)
                lineTo(3.721f, 3.229f)
                lineTo(4.052f, 3.968f)
                horizontalLineTo(4.77f)
                lineTo(4.206f, 4.542f)
                lineTo(4.424f, 5.448f)
                lineTo(3.722f, 4.939f)
                close()
                moveTo(6.996f, 5.448f)
                lineTo(7.722f, 4.939f)
                lineTo(8.424f, 5.448f)
                lineTo(8.206f, 4.542f)
                lineTo(8.77f, 3.968f)
                horizontalLineTo(8.052f)
                lineTo(7.721f, 3.229f)
                lineTo(7.439f, 3.968f)
                horizontalLineTo(6.596f)
                lineTo(7.241f, 4.542f)
                lineTo(6.996f, 5.448f)
                close()
                moveTo(11.722f, 4.939f)
                lineTo(10.996f, 5.448f)
                lineTo(11.241f, 4.542f)
                lineTo(10.597f, 3.968f)
                horizontalLineTo(11.439f)
                lineTo(11.721f, 3.229f)
                lineTo(12.052f, 3.968f)
                horizontalLineTo(12.77f)
                lineTo(12.206f, 4.542f)
                lineTo(12.424f, 5.448f)
                lineTo(11.722f, 4.939f)
                close()
                moveTo(2.996f, 9.448f)
                lineTo(3.722f, 8.939f)
                lineTo(4.424f, 9.448f)
                lineTo(4.206f, 8.542f)
                lineTo(4.77f, 7.968f)
                horizontalLineTo(4.052f)
                lineTo(3.721f, 7.229f)
                lineTo(3.439f, 7.968f)
                horizontalLineTo(2.596f)
                lineTo(3.241f, 8.542f)
                lineTo(2.996f, 9.448f)
                close()
                moveTo(7.722f, 8.939f)
                lineTo(6.996f, 9.448f)
                lineTo(7.241f, 8.542f)
                lineTo(6.596f, 7.968f)
                horizontalLineTo(7.439f)
                lineTo(7.721f, 7.229f)
                lineTo(8.052f, 7.968f)
                horizontalLineTo(8.77f)
                lineTo(8.206f, 8.542f)
                lineTo(8.424f, 9.448f)
                lineTo(7.722f, 8.939f)
                close()
                moveTo(10.996f, 9.448f)
                lineTo(11.722f, 8.939f)
                lineTo(12.424f, 9.448f)
                lineTo(12.206f, 8.542f)
                lineTo(12.77f, 7.968f)
                horizontalLineTo(12.052f)
                lineTo(11.721f, 7.229f)
                lineTo(11.439f, 7.968f)
                horizontalLineTo(10.597f)
                lineTo(11.241f, 8.542f)
                lineTo(10.996f, 9.448f)
                close()
                moveTo(15.722f, 4.939f)
                lineTo(14.996f, 5.448f)
                lineTo(15.241f, 4.542f)
                lineTo(14.597f, 3.968f)
                horizontalLineTo(15.439f)
                lineTo(15.721f, 3.229f)
                lineTo(16.052f, 3.968f)
                horizontalLineTo(16.77f)
                lineTo(16.206f, 4.542f)
                lineTo(16.424f, 5.448f)
                lineTo(15.722f, 4.939f)
                close()
                moveTo(14.996f, 9.448f)
                lineTo(15.722f, 8.939f)
                lineTo(16.424f, 9.448f)
                lineTo(16.206f, 8.542f)
                lineTo(16.77f, 7.968f)
                horizontalLineTo(16.052f)
                lineTo(15.721f, 7.229f)
                lineTo(15.439f, 7.968f)
                horizontalLineTo(14.597f)
                lineTo(15.241f, 8.542f)
                lineTo(14.996f, 9.448f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UnitedStatesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.UnitedStates,
            contentDescription = "United States Flag"
        )
    }
}
