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
 * Morocco Flag (20x15dp)
 *
 * - ISO Alpha-2: MA
 * - ISO Alpha-3: MAR
 * - ISO Numeric: 504
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Morocco: ImageVector by lazy {
    ImageVector.Builder(
        name = "Morocco:MA:MAR:504:Medium",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(13.75f)
                curveTo(20f, 14.44f, 19.44f, 15f, 18.75f, 15f)
                horizontalLineTo(1.25f)
                curveTo(0.56f, 15f, 0f, 14.44f, 0f, 13.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.051f, 12.266f)
                lineTo(10.104f, 1.688f)
                horizontalLineTo(9.932f)
                lineTo(6.122f, 12.266f)
                lineTo(10.079f, 9.888f)
                lineTo(14.051f, 12.266f)
                close()
                moveTo(9.667f, 5.139f)
                lineTo(10.09f, 3.49f)
                lineTo(10.529f, 5.186f)
                lineTo(11.791f, 8.721f)
                lineTo(12.531f, 10.433f)
                lineTo(10.932f, 9.306f)
                lineTo(10.078f, 8.795f)
                lineTo(9.238f, 9.3f)
                lineTo(7.676f, 10.433f)
                lineTo(8.398f, 8.686f)
                lineTo(9.667f, 5.139f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF579D20)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.914f, 8.421f)
                lineTo(10.099f, 9.873f)
                lineTo(12.138f, 8.421f)
                lineTo(16.01f, 5.148f)
                horizontalLineTo(3.991f)
                lineTo(7.914f, 8.421f)
                close()
                moveTo(7.959f, 7.171f)
                lineTo(6.473f, 6.262f)
                horizontalLineTo(8.286f)
                horizontalLineTo(11.889f)
                horizontalLineTo(13.488f)
                lineTo(12.212f, 7.07f)
                lineTo(10.09f, 8.681f)
                lineTo(7.959f, 7.171f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MoroccoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Morocco,
            contentDescription = "Morocco Flag"
        )
    }
}
