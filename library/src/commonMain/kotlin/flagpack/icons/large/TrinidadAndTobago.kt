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
 * Trinidad and Tobago Flag (32x24dp)
 *
 * - ISO Alpha-2: TT
 * - ISO Alpha-3: TTO
 * - ISO Numeric: 780
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.TrinidadAndTobago: ImageVector by lazy {
    ImageVector.Builder(
        name = "Trinidad and Tobago:TT:TTO:780:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.5f
            ) {
                moveTo(29.559f, 29.496f)
                lineTo(29.017f, 29.94f)
                lineTo(28.537f, 29.428f)
                lineTo(-1.807f, -2.971f)
                lineTo(-2.355f, -3.556f)
                lineTo(-1.734f, -4.064f)
                lineTo(1.362f, -6.596f)
                lineTo(1.905f, -7.04f)
                lineTo(2.384f, -6.528f)
                lineTo(32.728f, 25.87f)
                lineTo(33.277f, 26.456f)
                lineTo(32.656f, 26.963f)
                lineTo(29.559f, 29.496f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TrinidadAndTobagoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.TrinidadAndTobago,
            contentDescription = "Trinidad and Tobago Flag"
        )
    }
}
