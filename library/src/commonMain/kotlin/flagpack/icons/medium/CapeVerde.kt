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
 * Cape Verde Flag (20x15dp)
 *
 * - ISO Alpha-2: CV
 * - ISO Alpha-3: CPV
 * - ISO Numeric: 132
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.CapeVerde: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cape Verde:CV:CPV:132:Medium",
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
                fill = SolidColor(Color(0xFF4141DB)),
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
                fill = SolidColor(Color(0xFFF90000)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, 8.125f)
                horizontalLineTo(-0.625f)
                verticalLineTo(8.75f)
                verticalLineTo(10f)
                verticalLineTo(10.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(10f)
                verticalLineTo(8.75f)
                verticalLineTo(8.125f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFDE00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.119f, 6.321f)
                lineTo(5.65f, 5.951f)
                lineTo(6.246f, 6.38f)
                lineTo(6.237f, 6.412f)
                lineTo(6.264f, 6.393f)
                lineTo(6.291f, 6.412f)
                lineTo(6.283f, 6.38f)
                lineTo(6.9f, 5.951f)
                lineTo(7.496f, 6.38f)
                lineTo(7.487f, 6.412f)
                lineTo(7.514f, 6.393f)
                lineTo(7.541f, 6.412f)
                lineTo(7.533f, 6.38f)
                lineTo(8.15f, 5.951f)
                lineTo(8.664f, 6.321f)
                horizontalLineTo(8.373f)
                lineTo(8.961f, 6.841f)
                lineTo(8.737f, 7.662f)
                lineTo(9.4f, 7.201f)
                lineTo(9.914f, 7.571f)
                horizontalLineTo(9.623f)
                lineTo(10.211f, 8.091f)
                lineTo(10.012f, 8.821f)
                horizontalLineTo(9.623f)
                lineTo(10.211f, 9.341f)
                lineTo(10.012f, 10.071f)
                horizontalLineTo(9.623f)
                lineTo(10.211f, 10.591f)
                lineTo(10.012f, 11.321f)
                horizontalLineTo(9.701f)
                lineTo(9.399f, 10.651f)
                lineTo(9.141f, 11.321f)
                horizontalLineTo(8.373f)
                lineTo(8.961f, 11.841f)
                lineTo(8.762f, 12.571f)
                horizontalLineTo(8.451f)
                lineTo(8.149f, 11.901f)
                lineTo(7.891f, 12.571f)
                horizontalLineTo(7.856f)
                horizontalLineTo(7.201f)
                lineTo(6.899f, 11.901f)
                lineTo(6.641f, 12.571f)
                horizontalLineTo(6.606f)
                horizontalLineTo(5.951f)
                lineTo(5.649f, 11.901f)
                lineTo(5.391f, 12.571f)
                horizontalLineTo(5.018f)
                lineTo(4.841f, 11.841f)
                lineTo(5.356f, 11.321f)
                horizontalLineTo(4.701f)
                lineTo(4.399f, 10.651f)
                lineTo(4.141f, 11.321f)
                horizontalLineTo(3.768f)
                lineTo(3.591f, 10.591f)
                lineTo(4.106f, 10.071f)
                horizontalLineTo(3.768f)
                lineTo(3.591f, 9.341f)
                lineTo(4.106f, 8.821f)
                horizontalLineTo(3.768f)
                lineTo(3.591f, 8.091f)
                lineTo(4.106f, 7.571f)
                horizontalLineTo(3.869f)
                lineTo(4.4f, 7.201f)
                lineTo(5.041f, 7.662f)
                lineTo(4.841f, 6.841f)
                lineTo(5.356f, 6.321f)
                horizontalLineTo(5.119f)
                close()
                moveTo(5.012f, 6.321f)
                lineTo(5.211f, 5.591f)
                lineTo(4.623f, 5.071f)
                horizontalLineTo(5.391f)
                lineTo(5.649f, 4.401f)
                lineTo(5.951f, 5.071f)
                horizontalLineTo(6.606f)
                horizontalLineTo(6.641f)
                lineTo(6.899f, 4.401f)
                lineTo(7.201f, 5.071f)
                horizontalLineTo(7.856f)
                horizontalLineTo(7.891f)
                lineTo(8.149f, 4.401f)
                lineTo(8.451f, 5.071f)
                horizontalLineTo(9.106f)
                lineTo(8.591f, 5.591f)
                lineTo(8.768f, 6.321f)
                horizontalLineTo(9.141f)
                lineTo(9.399f, 5.651f)
                lineTo(9.701f, 6.321f)
                horizontalLineTo(10.356f)
                lineTo(9.841f, 6.841f)
                lineTo(10.018f, 7.571f)
                horizontalLineTo(10.391f)
                lineTo(10.649f, 6.901f)
                lineTo(10.951f, 7.571f)
                horizontalLineTo(11.606f)
                lineTo(11.091f, 8.091f)
                lineTo(11.268f, 8.821f)
                horizontalLineTo(11.606f)
                lineTo(11.091f, 9.341f)
                lineTo(11.268f, 10.071f)
                horizontalLineTo(11.606f)
                lineTo(11.091f, 10.591f)
                lineTo(11.291f, 11.412f)
                lineTo(10.65f, 10.951f)
                lineTo(10.119f, 11.321f)
                horizontalLineTo(10.356f)
                lineTo(9.841f, 11.841f)
                lineTo(10.041f, 12.662f)
                lineTo(9.4f, 12.201f)
                lineTo(8.869f, 12.571f)
                horizontalLineTo(9.106f)
                lineTo(8.591f, 13.091f)
                lineTo(8.791f, 13.912f)
                lineTo(8.15f, 13.451f)
                lineTo(7.533f, 13.88f)
                lineTo(7.541f, 13.912f)
                lineTo(7.514f, 13.893f)
                lineTo(7.487f, 13.912f)
                lineTo(7.496f, 13.88f)
                lineTo(6.9f, 13.451f)
                lineTo(6.283f, 13.88f)
                lineTo(6.291f, 13.912f)
                lineTo(6.264f, 13.893f)
                lineTo(6.237f, 13.912f)
                lineTo(6.246f, 13.88f)
                lineTo(5.65f, 13.451f)
                lineTo(4.987f, 13.912f)
                lineTo(5.211f, 13.091f)
                lineTo(4.623f, 12.571f)
                horizontalLineTo(4.914f)
                lineTo(4.4f, 12.201f)
                lineTo(3.737f, 12.662f)
                lineTo(3.961f, 11.841f)
                lineTo(3.373f, 11.321f)
                horizontalLineTo(3.664f)
                lineTo(3.15f, 10.951f)
                lineTo(2.487f, 11.412f)
                lineTo(2.711f, 10.591f)
                lineTo(2.123f, 10.071f)
                horizontalLineTo(2.512f)
                lineTo(2.711f, 9.341f)
                lineTo(2.123f, 8.821f)
                horizontalLineTo(2.512f)
                lineTo(2.711f, 8.091f)
                lineTo(2.123f, 7.571f)
                horizontalLineTo(2.891f)
                lineTo(3.149f, 6.901f)
                lineTo(3.451f, 7.571f)
                horizontalLineTo(3.762f)
                lineTo(3.961f, 6.841f)
                lineTo(3.373f, 6.321f)
                horizontalLineTo(4.141f)
                lineTo(4.399f, 5.651f)
                lineTo(4.701f, 6.321f)
                horizontalLineTo(5.012f)
                close()
                moveTo(3.349f, 8.594f)
                lineTo(3.664f, 8.821f)
                horizontalLineTo(3.451f)
                lineTo(3.349f, 8.594f)
                close()
                moveTo(2.619f, 8.821f)
                lineTo(2.991f, 8.561f)
                lineTo(2.891f, 8.821f)
                horizontalLineTo(2.619f)
                close()
                moveTo(2.619f, 10.071f)
                horizontalLineTo(2.891f)
                lineTo(2.991f, 9.811f)
                lineTo(2.619f, 10.071f)
                close()
                moveTo(3.349f, 9.844f)
                lineTo(3.451f, 10.071f)
                horizontalLineTo(3.664f)
                lineTo(3.349f, 9.844f)
                close()
                moveTo(6.091f, 13.091f)
                lineTo(6.264f, 12.917f)
                lineTo(6.461f, 13.091f)
                lineTo(6.266f, 13.809f)
                lineTo(6.091f, 13.091f)
                close()
                moveTo(7.516f, 13.809f)
                lineTo(7.711f, 13.091f)
                lineTo(7.514f, 12.917f)
                lineTo(7.341f, 13.091f)
                lineTo(7.516f, 13.809f)
                close()
                moveTo(10.391f, 10.071f)
                horizontalLineTo(10.119f)
                lineTo(10.491f, 9.811f)
                lineTo(10.391f, 10.071f)
                close()
                moveTo(10.951f, 10.071f)
                lineTo(10.849f, 9.844f)
                lineTo(11.164f, 10.071f)
                horizontalLineTo(10.951f)
                close()
                moveTo(11.164f, 8.821f)
                lineTo(10.849f, 8.594f)
                lineTo(10.951f, 8.821f)
                horizontalLineTo(11.164f)
                close()
                moveTo(10.491f, 8.561f)
                lineTo(10.119f, 8.821f)
                horizontalLineTo(10.391f)
                lineTo(10.491f, 8.561f)
                close()
                moveTo(7.711f, 5.591f)
                lineTo(7.516f, 6.309f)
                lineTo(7.341f, 5.591f)
                lineTo(7.514f, 5.417f)
                lineTo(7.711f, 5.591f)
                close()
                moveTo(6.264f, 5.417f)
                lineTo(6.091f, 5.591f)
                lineTo(6.266f, 6.309f)
                lineTo(6.461f, 5.591f)
                lineTo(6.264f, 5.417f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CapeVerdePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.CapeVerde,
            contentDescription = "Cape Verde Flag"
        )
    }
}
