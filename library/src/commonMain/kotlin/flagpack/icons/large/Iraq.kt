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
 * Iraq Flag (32x24dp)
 *
 * - ISO Alpha-2: IQ
 * - ISO Alpha-3: IRQ
 * - ISO Numeric: 368
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Iraq: ImageVector by lazy {
    ImageVector.Builder(
        name = "Iraq:IQ:IRQ:368:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFBF2714)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF009C4E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.337f, 12.811f)
                curveTo(6.246f, 14.117f, 5f, 15f, 5f, 15f)
                curveTo(5f, 15f, 6.089f, 15f, 6.507f, 14.126f)
                horizontalLineTo(15.424f)
                verticalLineTo(12.2f)
                curveTo(15.424f, 12.2f, 15.238f, 11.275f, 14.444f, 11.275f)
                curveTo(13.649f, 11.275f, 13.471f, 12.2f, 13.471f, 12.2f)
                horizontalLineTo(10.334f)
                lineTo(13.369f, 9.521f)
                lineTo(12.779f, 9f)
                lineTo(9.408f, 11.976f)
                verticalLineTo(12.606f)
                horizontalLineTo(14.193f)
                verticalLineTo(12.235f)
                curveTo(14.193f, 12.235f, 14.22f, 12.02f, 14.444f, 12.02f)
                curveTo(14.667f, 12.02f, 14.613f, 12.235f, 14.613f, 12.235f)
                verticalLineTo(13.028f)
                horizontalLineTo(8.583f)
                verticalLineTo(11.944f)
                lineTo(7.93f, 12.235f)
                verticalLineTo(13.028f)
                curveTo(7.93f, 13.028f, 7.13f, 12.811f, 6.625f, 12.811f)
                curveTo(6.119f, 12.811f, 6.089f, 12.235f, 6.089f, 12.235f)
                lineTo(5.337f, 12.811f)
                close()
                moveTo(17.447f, 12.885f)
                lineTo(17.936f, 14.103f)
                horizontalLineTo(15.99f)
                verticalLineTo(9.214f)
                lineTo(16.81f, 9.477f)
                verticalLineTo(12.885f)
                horizontalLineTo(17.447f)
                close()
                moveTo(26.511f, 12.885f)
                lineTo(27f, 14.103f)
                horizontalLineTo(25.054f)
                verticalLineTo(9.214f)
                lineTo(25.875f, 9.477f)
                verticalLineTo(12.885f)
                horizontalLineTo(26.511f)
                close()
                moveTo(24.101f, 9.265f)
                lineTo(23.594f, 9.608f)
                verticalLineTo(12.882f)
                horizontalLineTo(23.078f)
                verticalLineTo(10.256f)
                lineTo(22.227f, 10.747f)
                verticalLineTo(12.882f)
                horizontalLineTo(21.656f)
                verticalLineTo(11.399f)
                lineTo(21.009f, 11.816f)
                verticalLineTo(12.218f)
                curveTo(21.009f, 12.218f, 19.765f, 12.304f, 19.765f, 14.063f)
                horizontalLineTo(24.097f)
                lineTo(24.101f, 9.265f)
                close()
                moveTo(7.492f, 14.966f)
                curveTo(7.648f, 14.966f, 7.775f, 14.854f, 7.775f, 14.716f)
                curveTo(7.775f, 14.578f, 7.648f, 14.465f, 7.492f, 14.465f)
                curveTo(7.335f, 14.465f, 7.209f, 14.578f, 7.209f, 14.716f)
                curveTo(7.209f, 14.854f, 7.335f, 14.966f, 7.492f, 14.966f)
                close()
                moveTo(21.914f, 9.642f)
                curveTo(21.695f, 9.932f, 21.027f, 9.642f, 21.027f, 9.642f)
                lineTo(22.92f, 9.422f)
                curveTo(22.724f, 9.804f, 21.914f, 9.642f, 21.914f, 9.642f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IraqPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Iraq,
            contentDescription = "Iraq Flag"
        )
    }
}
