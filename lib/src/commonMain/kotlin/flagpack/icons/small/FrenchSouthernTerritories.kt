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
 * French Southern Territories Flag (16x12dp)
 *
 * - ISO Alpha-2: TF
 * - ISO Alpha-3: ATF
 * - ISO Numeric: 260
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.FrenchSouthernTerritories: ImageVector by lazy {
    ImageVector.Builder(
        name = "French Southern Territories:TF:ATF:260:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.394f, 3.1f)
                horizontalLineTo(11.399f)
                horizontalLineTo(11.414f)
                horizontalLineTo(13.419f)
                lineTo(13.026f, 3.852f)
                horizontalLineTo(11.806f)
                verticalLineTo(4.256f)
                horizontalLineTo(12.742f)
                lineTo(12.36f, 4.956f)
                horizontalLineTo(11.806f)
                verticalLineTo(6.355f)
                lineTo(12.719f, 4.915f)
                lineTo(13.902f, 6.962f)
                horizontalLineTo(13.419f)
                lineTo(13.25f, 6.738f)
                horizontalLineTo(12.18f)
                lineTo(11.427f, 8.129f)
                lineTo(11.427f, 8.205f)
                lineTo(11.406f, 8.167f)
                lineTo(11.386f, 8.205f)
                lineTo(11.386f, 8.129f)
                lineTo(10.633f, 6.738f)
                horizontalLineTo(9.563f)
                lineTo(9.394f, 6.962f)
                horizontalLineTo(8.911f)
                lineTo(10.094f, 4.915f)
                lineTo(11.007f, 6.355f)
                verticalLineTo(3.852f)
                horizontalLineTo(9.787f)
                lineTo(9.394f, 3.1f)
                close()
                moveTo(12.743f, 5.755f)
                lineTo(12.48f, 6.159f)
                horizontalLineTo(12.977f)
                lineTo(12.743f, 5.755f)
                close()
                moveTo(10.07f, 5.755f)
                lineTo(10.333f, 6.159f)
                horizontalLineTo(9.836f)
                lineTo(10.07f, 5.755f)
                close()
                moveTo(8.157f, 5.307f)
                lineTo(8.572f, 5f)
                lineTo(8.988f, 5.307f)
                lineTo(8.841f, 4.793f)
                lineTo(9.245f, 4.469f)
                lineTo(8.739f, 4.458f)
                lineTo(8.572f, 3.952f)
                lineTo(8.406f, 4.458f)
                lineTo(7.9f, 4.469f)
                lineTo(8.303f, 4.793f)
                lineTo(8.157f, 5.307f)
                close()
                moveTo(14.228f, 5f)
                lineTo(13.812f, 5.307f)
                lineTo(13.959f, 4.793f)
                lineTo(13.555f, 4.469f)
                lineTo(14.061f, 4.458f)
                lineTo(14.228f, 3.952f)
                lineTo(14.394f, 4.458f)
                lineTo(14.9f, 4.469f)
                lineTo(14.497f, 4.793f)
                lineTo(14.643f, 5.307f)
                lineTo(14.228f, 5f)
                close()
                moveTo(12.54f, 8.902f)
                lineTo(12.955f, 8.595f)
                lineTo(13.371f, 8.902f)
                lineTo(13.224f, 8.388f)
                lineTo(13.628f, 8.064f)
                lineTo(13.122f, 8.053f)
                lineTo(12.955f, 7.547f)
                lineTo(12.789f, 8.053f)
                lineTo(12.283f, 8.064f)
                lineTo(12.686f, 8.388f)
                lineTo(12.54f, 8.902f)
                close()
                moveTo(9.845f, 8.595f)
                lineTo(9.429f, 8.902f)
                lineTo(9.576f, 8.388f)
                lineTo(9.172f, 8.064f)
                lineTo(9.679f, 8.053f)
                lineTo(9.845f, 7.547f)
                lineTo(10.011f, 8.053f)
                lineTo(10.517f, 8.064f)
                lineTo(10.114f, 8.388f)
                lineTo(10.26f, 8.902f)
                lineTo(9.845f, 8.595f)
                close()
                moveTo(10.984f, 10.1f)
                lineTo(11.4f, 9.794f)
                lineTo(11.816f, 10.1f)
                lineTo(11.669f, 9.587f)
                lineTo(12.072f, 9.263f)
                lineTo(11.566f, 9.252f)
                lineTo(11.4f, 8.745f)
                lineTo(11.234f, 9.252f)
                lineTo(10.728f, 9.263f)
                lineTo(11.131f, 9.587f)
                lineTo(10.984f, 10.1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun FrenchSouthernTerritoriesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.FrenchSouthernTerritories,
            contentDescription = "French Southern Territories Flag"
        )
    }
}
