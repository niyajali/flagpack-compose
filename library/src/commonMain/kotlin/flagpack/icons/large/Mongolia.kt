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
 * Mongolia Flag (32x24dp)
 *
 * - ISO Alpha-2: MN
 * - ISO Alpha-3: MNG
 * - ISO Numeric: 496
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Mongolia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mongolia:MN:MNG:496:Large",
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
                fill = SolidColor(Color(0xFF4C67E8)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF8D000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.014f, 6.884f)
                curveTo(5.001f, 6.884f, 5.134f, 5.897f, 5.134f, 5.897f)
                lineTo(5.614f, 4.859f)
                verticalLineTo(5.277f)
                verticalLineTo(5.897f)
                curveTo(5.614f, 6.03f, 5.796f, 5.763f, 5.796f, 5.442f)
                curveTo(5.796f, 5.121f, 6.014f, 4.64f, 6.014f, 4.64f)
                curveTo(6.014f, 4.64f, 6.023f, 4.479f, 6.029f, 4.32f)
                curveTo(6.063f, 4.402f, 6.133f, 4.472f, 6.239f, 4.58f)
                curveTo(6.258f, 4.599f, 6.278f, 4.618f, 6.298f, 4.64f)
                curveTo(6.423f, 4.768f, 6.407f, 5.108f, 6.392f, 5.402f)
                curveTo(6.379f, 5.668f, 6.367f, 5.897f, 6.465f, 5.897f)
                curveTo(6.671f, 5.897f, 6.655f, 4.978f, 6.655f, 4.978f)
                lineTo(7.001f, 5.897f)
                curveTo(7.001f, 5.897f, 7.027f, 6.884f, 6.014f, 6.884f)
                close()
                moveTo(6.014f, 4.065f)
                curveTo(6.04f, 3.914f, 6.036f, 4.115f, 6.029f, 4.32f)
                curveTo(6f, 4.252f, 5.995f, 4.176f, 6.014f, 4.065f)
                close()
                moveTo(7.538f, 8.684f)
                curveTo(7.538f, 9.486f, 6.867f, 10.137f, 6.038f, 10.137f)
                curveTo(5.21f, 10.137f, 4.538f, 9.486f, 4.538f, 8.684f)
                curveTo(4.538f, 7.881f, 5.21f, 7.23f, 6.038f, 7.23f)
                curveTo(6.867f, 7.23f, 7.538f, 7.881f, 7.538f, 8.684f)
                close()
                moveTo(3.769f, 11.404f)
                horizontalLineTo(2f)
                verticalLineTo(19.976f)
                horizontalLineTo(3.769f)
                verticalLineTo(11.404f)
                close()
                moveTo(10f, 11.404f)
                horizontalLineTo(8.231f)
                verticalLineTo(19.976f)
                horizontalLineTo(10f)
                verticalLineTo(11.404f)
                close()
                moveTo(4.231f, 11.479f)
                lineTo(5.955f, 12.547f)
                lineTo(7.899f, 11.479f)
                horizontalLineTo(4.231f)
                close()
                moveTo(5.955f, 20f)
                lineTo(4.231f, 18.932f)
                horizontalLineTo(7.899f)
                lineTo(5.955f, 20f)
                close()
                moveTo(4.231f, 12.895f)
                horizontalLineTo(7.846f)
                verticalLineTo(13.566f)
                horizontalLineTo(4.231f)
                verticalLineTo(12.895f)
                close()
                moveTo(7.846f, 17.889f)
                horizontalLineTo(4.231f)
                verticalLineTo(18.559f)
                horizontalLineTo(7.846f)
                verticalLineTo(17.889f)
                close()
                moveTo(6.077f, 17.516f)
                curveTo(7.097f, 17.516f, 7.923f, 16.715f, 7.923f, 15.727f)
                curveTo(7.923f, 14.739f, 7.097f, 13.938f, 6.077f, 13.938f)
                curveTo(5.057f, 13.938f, 4.231f, 14.739f, 4.231f, 15.727f)
                curveTo(4.231f, 16.715f, 5.057f, 17.516f, 6.077f, 17.516f)
                close()
                moveTo(4.003f, 9.216f)
                curveTo(4.003f, 9.216f, 4.065f, 11.083f, 5.906f, 11.083f)
                curveTo(7.746f, 11.083f, 8.043f, 9.216f, 8.043f, 9.216f)
                curveTo(8.043f, 9.216f, 7.331f, 10.36f, 6.023f, 10.36f)
                curveTo(4.716f, 10.36f, 4.003f, 9.216f, 4.003f, 9.216f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(6.359f, 13.972f)
                lineTo(6.441f, 13.605f)
                curveTo(6.853f, 14.056f, 7.04f, 14.309f, 6.952f, 14.723f)
                curveTo(6.854f, 15.184f, 6.335f, 15.698f, 5.733f, 16.122f)
                curveTo(5.369f, 16.378f, 5.146f, 17.071f, 5.326f, 17.291f)
                lineTo(5.154f, 17.605f)
                curveTo(4.751f, 17.114f, 5.073f, 16.188f, 5.629f, 15.797f)
                curveTo(6.14f, 15.437f, 6.497f, 15.06f, 6.559f, 14.764f)
                curveTo(6.6f, 14.571f, 6.675f, 14.319f, 6.359f, 13.972f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.5f, 17f)
                curveTo(6.776f, 17f, 7f, 16.776f, 7f, 16.5f)
                curveTo(7f, 16.224f, 6.776f, 16f, 6.5f, 16f)
                curveTo(6.224f, 16f, 6f, 16.224f, 6f, 16.5f)
                curveTo(6f, 16.776f, 6.224f, 17f, 6.5f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.376f, 15.651f)
                curveTo(5.652f, 15.651f, 5.876f, 15.427f, 5.876f, 15.151f)
                curveTo(5.876f, 14.875f, 5.652f, 14.651f, 5.376f, 14.651f)
                curveTo(5.1f, 14.651f, 4.876f, 14.875f, 4.876f, 15.151f)
                curveTo(4.876f, 15.427f, 5.1f, 15.651f, 5.376f, 15.651f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MongoliaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Mongolia,
            contentDescription = "Mongolia Flag"
        )
    }
}
