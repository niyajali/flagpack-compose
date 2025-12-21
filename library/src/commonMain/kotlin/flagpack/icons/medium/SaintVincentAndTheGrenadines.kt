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
 * Saint Vincent and the Grenadines Flag (20x15dp)
 *
 * - ISO Alpha-2: VC
 * - ISO Alpha-3: VCT
 * - ISO Numeric: 670
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SaintVincentAndTheGrenadines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Vincent and the Grenadines:VC:VCT:670:Medium",
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.329f, 3.125f)
                lineTo(10.429f, 5.914f)
                lineTo(12.329f, 8.605f)
                lineTo(14.229f, 5.914f)
                lineTo(12.329f, 3.125f)
                close()
                moveTo(7.673f, 3.174f)
                lineTo(5.625f, 5.914f)
                lineTo(7.525f, 8.556f)
                lineTo(9.425f, 5.914f)
                lineTo(7.673f, 3.174f)
                close()
                moveTo(8.027f, 8.993f)
                lineTo(10.075f, 6.253f)
                lineTo(11.827f, 8.993f)
                lineTo(10.075f, 11.813f)
                lineTo(8.027f, 8.993f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaintVincentAndTheGrenadinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SaintVincentAndTheGrenadines,
            contentDescription = "Saint Vincent and the Grenadines Flag"
        )
    }
}
