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
 * Saint Vincent and the Grenadines Flag (32x24dp)
 *
 * - ISO Alpha-2: VC
 * - ISO Alpha-3: VCT
 * - ISO Numeric: 670
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SaintVincentAndTheGrenadines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Vincent and the Grenadines:VC:VCT:670:Large",
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
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.726f, 5.6f)
                lineTo(16.686f, 10.063f)
                lineTo(19.726f, 14.368f)
                lineTo(22.767f, 10.063f)
                lineTo(19.726f, 5.6f)
                close()
                moveTo(12.277f, 5.679f)
                lineTo(9f, 10.063f)
                lineTo(12.04f, 14.289f)
                lineTo(15.08f, 10.063f)
                lineTo(12.277f, 5.679f)
                close()
                moveTo(12.843f, 14.989f)
                lineTo(16.12f, 10.605f)
                lineTo(18.923f, 14.989f)
                lineTo(16.12f, 19.501f)
                lineTo(12.843f, 14.989f)
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
            imageVector = FlagIcons.Large.SaintVincentAndTheGrenadines,
            contentDescription = "Saint Vincent and the Grenadines Flag"
        )
    }
}
