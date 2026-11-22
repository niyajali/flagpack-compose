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
 * Trinidad and Tobago Flag (20x15dp)
 *
 * - ISO Alpha-2: TT
 * - ISO Alpha-3: TTO
 * - ISO Numeric: 780
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.TrinidadAndTobago: ImageVector by lazy {
    ImageVector.Builder(
        name = "Trinidad and Tobago:TT:TTO:780:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 0.915f
            ) {
                moveTo(18.468f, 18.426f)
                lineTo(18.136f, 18.697f)
                lineTo(17.844f, 18.385f)
                lineTo(-1.121f, -1.864f)
                lineTo(-1.456f, -2.222f)
                lineTo(-1.077f, -2.531f)
                lineTo(0.858f, -4.114f)
                lineTo(1.19f, -4.385f)
                lineTo(1.482f, -4.073f)
                lineTo(20.447f, 16.177f)
                lineTo(20.781f, 16.534f)
                lineTo(20.403f, 16.844f)
                lineTo(18.468f, 18.426f)
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
            imageVector = FlagIcons.Medium.TrinidadAndTobago,
            contentDescription = "Trinidad and Tobago Flag"
        )
    }
}
