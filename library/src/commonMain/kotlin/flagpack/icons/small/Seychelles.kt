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
 * Seychelles Flag (16x12dp)
 *
 * - ISO Alpha-2: SC
 * - ISO Alpha-3: SYC
 * - ISO Numeric: 690
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Seychelles: ImageVector by lazy {
    ImageVector.Builder(
        name = "Seychelles:SC:SYC:690:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.998f)
                lineTo(8.076f, -1f)
                horizontalLineTo(16.151f)
                lineTo(0f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 11.998f)
                lineTo(17.232f, 5.499f)
                verticalLineTo(-2.552f)
                lineTo(0f, 11.998f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 11.998f)
                lineTo(17.232f, 9.499f)
                verticalLineTo(5.448f)
                lineTo(0f, 11.998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.998f)
                horizontalLineTo(17.232f)
                verticalLineTo(8.448f)
                lineTo(0f, 11.998f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SeychellesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Seychelles,
            contentDescription = "Seychelles Flag"
        )
    }
}
