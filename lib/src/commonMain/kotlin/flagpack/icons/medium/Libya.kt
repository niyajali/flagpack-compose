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
 * Libya Flag (20x15dp)
 *
 * - ISO Alpha-2: LY
 * - ISO Alpha-3: LBY
 * - ISO Numeric: 434
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Libya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Libya:LY:LBY:434:Medium",
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
                fill = SolidColor(Color(0xFF55BA07)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF1D1D1D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.75f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE11C1B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.873f, 9.416f)
                curveTo(8.753f, 9.185f, 8.463f, 8.599f, 8.475f, 7.695f)
                curveTo(8.475f, 6.738f, 8.979f, 5.77f, 9.862f, 5.664f)
                curveTo(10.746f, 5.558f, 11.469f, 5.888f, 11.849f, 6.348f)
                curveTo(11.531f, 5.099f, 10.48f, 4.963f, 9.673f, 4.963f)
                curveTo(8.458f, 4.952f, 7.213f, 5.875f, 7.213f, 7.612f)
                curveTo(7.213f, 9.125f, 8.311f, 10.262f, 9.708f, 10.29f)
                curveTo(11.456f, 10.29f, 11.729f, 9.084f, 11.78f, 8.673f)
                curveTo(11.679f, 8.745f, 11.585f, 8.832f, 11.488f, 8.92f)
                curveTo(11.137f, 9.244f, 10.752f, 9.598f, 9.873f, 9.416f)
                close()
                moveTo(12.664f, 7.057f)
                lineTo(11.837f, 7.317f)
                lineTo(12.764f, 7.68f)
                lineTo(12.635f, 8.651f)
                lineTo(13.263f, 7.983f)
                lineTo(14.174f, 8.17f)
                lineTo(13.558f, 7.451f)
                lineTo(14.103f, 6.715f)
                lineTo(13.342f, 6.876f)
                lineTo(12.804f, 6.268f)
                lineTo(12.664f, 7.057f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LibyaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Libya,
            contentDescription = "Libya Flag"
        )
    }
}
