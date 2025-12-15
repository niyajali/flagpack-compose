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
 * Jersey Flag (16x12dp)
 *
 * - ISO Alpha-2: JE
 * - ISO Alpha-3: JEY
 * - ISO Numeric: 832
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Jersey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Jersey:JE:JEY:832:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.35f
            ) {
                moveTo(-1.351f, 0.622f)
                lineTo(-2.375f, 0.003f)
                verticalLineTo(1.2f)
                verticalLineTo(11.2f)
                verticalLineTo(12.397f)
                lineTo(-1.351f, 11.778f)
                lineTo(6.918f, 6.778f)
                lineTo(7.873f, 6.2f)
                lineTo(6.918f, 5.622f)
                lineTo(-1.351f, 0.622f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1.35f
            ) {
                moveTo(17.46f, 0.616f)
                lineTo(18.474f, 0.027f)
                verticalLineTo(1.2f)
                verticalLineTo(11.2f)
                verticalLineTo(12.373f)
                lineTo(17.46f, 11.784f)
                lineTo(8.851f, 6.784f)
                lineTo(7.846f, 6.2f)
                lineTo(8.851f, 5.616f)
                lineTo(17.46f, 0.616f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.837f, 2.352f)
                curveTo(6.837f, 2.352f, 6.408f, 4.251f, 7.89f, 4.98f)
                curveTo(7.89f, 4.98f, 9.314f, 4.204f, 8.994f, 2.352f)
                curveTo(8.994f, 2.352f, 8.383f, 2.147f, 7.897f, 2.147f)
                curveTo(7.411f, 2.147f, 6.837f, 2.352f, 6.837f, 2.352f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(6.711f, 2.548f)
                lineTo(6.386f, 1.602f)
                curveTo(6.991f, 1.394f, 7.514f, 1.288f, 7.96f, 1.288f)
                curveTo(8.418f, 1.288f, 8.895f, 1.399f, 9.391f, 1.617f)
                lineTo(8.989f, 2.532f)
                curveTo(8.614f, 2.368f, 8.271f, 2.288f, 7.96f, 2.288f)
                curveTo(7.638f, 2.288f, 7.22f, 2.373f, 6.711f, 2.548f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(7.925f, 3.95f)
                curveTo(8.27f, 3.95f, 8.55f, 3.67f, 8.55f, 3.325f)
                curveTo(8.55f, 2.98f, 8.27f, 2.7f, 7.925f, 2.7f)
                curveTo(7.58f, 2.7f, 7.3f, 2.98f, 7.3f, 3.325f)
                curveTo(7.3f, 3.67f, 7.58f, 3.95f, 7.925f, 3.95f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun JerseyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Jersey,
            contentDescription = "Jersey Flag"
        )
    }
}
