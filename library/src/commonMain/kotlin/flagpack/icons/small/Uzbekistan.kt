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
 * Uzbekistan Flag (16x12dp)
 *
 * - ISO Alpha-2: UZ
 * - ISO Alpha-3: UZB
 * - ISO Numeric: 860
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Uzbekistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uzbekistan:UZ:UZB:860:Small",
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
                fill = SolidColor(Color(0xFF14DC5A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0099B5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 0.75f
            ) {
                moveTo(-1f, 4.625f)
                horizontalLineTo(-1.375f)
                verticalLineTo(5f)
                verticalLineTo(8f)
                verticalLineTo(8.375f)
                horizontalLineTo(-1f)
                horizontalLineTo(17f)
                horizontalLineTo(17.375f)
                verticalLineTo(8f)
                verticalLineTo(5f)
                verticalLineTo(4.625f)
                horizontalLineTo(17f)
                horizontalLineTo(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.364f, 1.2f)
                lineTo(7.872f, 1.479f)
                lineTo(8.013f, 0.913f)
                lineTo(7.542f, 0.496f)
                horizontalLineTo(8.157f)
                lineTo(8.363f, -0.04f)
                lineTo(8.605f, 0.496f)
                horizontalLineTo(9.129f)
                lineTo(8.717f, 0.913f)
                lineTo(8.915f, 1.479f)
                lineTo(8.364f, 1.2f)
                close()
                moveTo(5.845f, 2.738f)
                lineTo(6.336f, 2.459f)
                lineTo(6.887f, 2.738f)
                lineTo(6.689f, 2.171f)
                lineTo(7.101f, 1.755f)
                horizontalLineTo(6.577f)
                lineTo(6.335f, 1.219f)
                lineTo(6.129f, 1.755f)
                horizontalLineTo(5.514f)
                lineTo(5.985f, 2.171f)
                lineTo(5.845f, 2.738f)
                close()
                moveTo(4.488f, 3.777f)
                lineTo(3.997f, 4.055f)
                lineTo(4.137f, 3.489f)
                lineTo(3.667f, 3.072f)
                horizontalLineTo(4.281f)
                lineTo(4.488f, 2.536f)
                lineTo(4.729f, 3.072f)
                horizontalLineTo(5.253f)
                lineTo(4.842f, 3.489f)
                lineTo(5.04f, 4.055f)
                lineTo(4.488f, 3.777f)
                close()
                moveTo(6.364f, 3.779f)
                lineTo(5.873f, 4.057f)
                lineTo(6.013f, 3.491f)
                lineTo(5.543f, 3.075f)
                horizontalLineTo(6.157f)
                lineTo(6.364f, 2.539f)
                lineTo(6.605f, 3.075f)
                horizontalLineTo(7.129f)
                lineTo(6.718f, 3.491f)
                lineTo(6.916f, 4.057f)
                lineTo(6.364f, 3.779f)
                close()
                moveTo(8.364f, 3.779f)
                lineTo(7.873f, 4.057f)
                lineTo(8.013f, 3.491f)
                lineTo(7.543f, 3.075f)
                horizontalLineTo(8.157f)
                lineTo(8.364f, 2.539f)
                lineTo(8.605f, 3.075f)
                horizontalLineTo(9.13f)
                lineTo(8.718f, 3.491f)
                lineTo(8.916f, 4.057f)
                lineTo(8.364f, 3.779f)
                close()
                moveTo(7.845f, 2.738f)
                lineTo(8.336f, 2.459f)
                lineTo(8.887f, 2.738f)
                lineTo(8.689f, 2.171f)
                lineTo(9.101f, 1.755f)
                horizontalLineTo(8.577f)
                lineTo(8.335f, 1.219f)
                lineTo(8.129f, 1.755f)
                horizontalLineTo(7.514f)
                lineTo(7.985f, 2.171f)
                lineTo(7.845f, 2.738f)
                close()
                moveTo(9.873f, 4.057f)
                lineTo(10.364f, 3.779f)
                lineTo(10.916f, 4.057f)
                lineTo(10.718f, 3.491f)
                lineTo(11.13f, 3.075f)
                horizontalLineTo(10.605f)
                lineTo(10.364f, 2.539f)
                lineTo(10.158f, 3.075f)
                horizontalLineTo(9.543f)
                lineTo(10.013f, 3.491f)
                lineTo(9.873f, 4.057f)
                close()
                moveTo(10.336f, 2.459f)
                lineTo(9.845f, 2.738f)
                lineTo(9.985f, 2.171f)
                lineTo(9.514f, 1.755f)
                horizontalLineTo(10.129f)
                lineTo(10.335f, 1.219f)
                lineTo(10.577f, 1.755f)
                horizontalLineTo(11.101f)
                lineTo(10.689f, 2.171f)
                lineTo(10.887f, 2.738f)
                lineTo(10.336f, 2.459f)
                close()
                moveTo(9.872f, 1.479f)
                lineTo(10.364f, 1.2f)
                lineTo(10.915f, 1.479f)
                lineTo(10.717f, 0.913f)
                lineTo(11.129f, 0.496f)
                horizontalLineTo(10.605f)
                lineTo(10.363f, -0.04f)
                lineTo(10.157f, 0.496f)
                horizontalLineTo(9.542f)
                lineTo(10.013f, 0.913f)
                lineTo(9.872f, 1.479f)
                close()
                moveTo(12.364f, 3.779f)
                lineTo(11.873f, 4.057f)
                lineTo(12.013f, 3.491f)
                lineTo(11.543f, 3.075f)
                horizontalLineTo(12.158f)
                lineTo(12.364f, 2.539f)
                lineTo(12.605f, 3.075f)
                horizontalLineTo(13.13f)
                lineTo(12.718f, 3.491f)
                lineTo(12.916f, 4.057f)
                lineTo(12.364f, 3.779f)
                close()
                moveTo(11.845f, 2.738f)
                lineTo(12.336f, 2.459f)
                lineTo(12.887f, 2.738f)
                lineTo(12.689f, 2.171f)
                lineTo(13.101f, 1.755f)
                horizontalLineTo(12.577f)
                lineTo(12.335f, 1.219f)
                lineTo(12.129f, 1.755f)
                horizontalLineTo(11.514f)
                lineTo(11.985f, 2.171f)
                lineTo(11.845f, 2.738f)
                close()
                moveTo(12.364f, 1.2f)
                lineTo(11.872f, 1.479f)
                lineTo(12.013f, 0.913f)
                lineTo(11.542f, 0.496f)
                horizontalLineTo(12.157f)
                lineTo(12.363f, -0.04f)
                lineTo(12.605f, 0.496f)
                horizontalLineTo(13.129f)
                lineTo(12.717f, 0.913f)
                lineTo(12.915f, 1.479f)
                lineTo(12.364f, 1.2f)
                close()
                moveTo(2.942f, 4.12f)
                curveTo(2.942f, 4.12f, 1.735f, 3.793f, 1.757f, 2.581f)
                curveTo(1.78f, 1.369f, 3f, 1.055f, 3f, 1.055f)
                curveTo(2.502f, 0.866f, 1.028f, 1.119f, 1f, 2.569f)
                curveTo(0.973f, 4.018f, 2.478f, 4.304f, 2.942f, 4.12f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UzbekistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Uzbekistan,
            contentDescription = "Uzbekistan Flag"
        )
    }
}
