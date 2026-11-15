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
 * Trinidad and Tobago Flag (16x12dp)
 *
 * - ISO Alpha-2: TT
 * - ISO Alpha-3: TTO
 * - ISO Numeric: 780
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.TrinidadAndTobago: ImageVector by lazy {
    ImageVector.Builder(
        name = "Trinidad and Tobago:TT:TTO:780:Small",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.732f
            ) {
                moveTo(14.774f, 14.741f)
                lineTo(14.509f, 14.958f)
                lineTo(14.275f, 14.708f)
                lineTo(-0.897f, -1.492f)
                lineTo(-1.164f, -1.777f)
                lineTo(-0.861f, -2.025f)
                lineTo(0.687f, -3.291f)
                lineTo(0.952f, -3.508f)
                lineTo(1.186f, -3.258f)
                lineTo(16.358f, 12.941f)
                lineTo(16.625f, 13.227f)
                lineTo(16.322f, 13.475f)
                lineTo(14.774f, 14.741f)
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
            imageVector = FlagIcons.Small.TrinidadAndTobago,
            contentDescription = "Trinidad and Tobago Flag"
        )
    }
}
