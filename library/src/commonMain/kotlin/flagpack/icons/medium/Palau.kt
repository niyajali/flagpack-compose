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
 * Palau Flag (20x15dp)
 *
 * - ISO Alpha-2: PW
 * - ISO Alpha-3: PLW
 * - ISO Numeric: 585
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Palau: ImageVector by lazy {
    ImageVector.Builder(
        name = "Palau:PW:PLW:585:Medium",
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
                fill = SolidColor(Color(0xFF61C6F0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.188f, 11.25f)
                curveTo(9.431f, 11.25f, 11.25f, 9.431f, 11.25f, 7.188f)
                curveTo(11.25f, 4.944f, 9.431f, 3.125f, 7.188f, 3.125f)
                curveTo(4.944f, 3.125f, 3.125f, 4.944f, 3.125f, 7.188f)
                curveTo(3.125f, 9.431f, 4.944f, 11.25f, 7.188f, 11.25f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun PalauPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Palau,
            contentDescription = "Palau Flag"
        )
    }
}
