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
 * Western Sahara Flag (20x15dp)
 *
 * - ISO Alpha-2: EH
 * - ISO Alpha-3: ESH
 * - ISO Numeric: 732
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.WesternSahara: ImageVector by lazy {
    ImageVector.Builder(
        name = "Western Sahara:EH:ESH:732:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                lineTo(10f, 7.5f)
                lineTo(0f, 15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.555f, 9.673f)
                curveTo(13.555f, 9.673f, 12.133f, 8.814f, 12.133f, 7.394f)
                curveTo(12.133f, 5.974f, 13.555f, 5.227f, 13.555f, 5.227f)
                curveTo(12.919f, 4.823f, 10.712f, 5.4f, 10.712f, 7.44f)
                curveTo(10.712f, 9.481f, 12.898f, 9.858f, 13.555f, 9.673f)
                close()
                moveTo(14.705f, 7.07f)
                lineTo(13.878f, 6.295f)
                lineTo(14.164f, 7.285f)
                lineTo(13.363f, 7.664f)
                lineTo(14.346f, 7.984f)
                lineTo(14.774f, 9.056f)
                lineTo(14.96f, 8.064f)
                lineTo(15.932f, 8.278f)
                lineTo(15.197f, 7.561f)
                lineTo(15.445f, 6.795f)
                lineTo(14.705f, 7.07f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun WesternSaharaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.WesternSahara,
            contentDescription = "Western Sahara Flag"
        )
    }
}
