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
 * Saint Vincent and the Grenadines Flag (16x12dp)
 *
 * - ISO Alpha-2: VC
 * - ISO Alpha-3: VCT
 * - ISO Numeric: 670
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SaintVincentAndTheGrenadines: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Vincent and the Grenadines:VC:VCT:670:Small",
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
            path(
                fill = SolidColor(Color(0xFFFFDC17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5FBF2B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.863f, 2.5f)
                lineTo(8.343f, 4.731f)
                lineTo(9.863f, 6.884f)
                lineTo(11.383f, 4.731f)
                lineTo(9.863f, 2.5f)
                close()
                moveTo(6.139f, 2.539f)
                lineTo(4.5f, 4.731f)
                lineTo(6.02f, 6.845f)
                lineTo(7.54f, 4.731f)
                lineTo(6.139f, 2.539f)
                close()
                moveTo(6.422f, 7.194f)
                lineTo(8.06f, 5.002f)
                lineTo(9.462f, 7.194f)
                lineTo(8.06f, 9.451f)
                lineTo(6.422f, 7.194f)
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
            imageVector = FlagIcons.Small.SaintVincentAndTheGrenadines,
            contentDescription = "Saint Vincent and the Grenadines Flag"
        )
    }
}
