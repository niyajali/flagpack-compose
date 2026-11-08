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
 * Oman Flag (20x15dp)
 *
 * - ISO Alpha-2: OM
 * - ISO Alpha-3: OMN
 * - ISO Numeric: 512
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Oman: ImageVector by lazy {
    ImageVector.Builder(
        name = "Oman:OM:OMN:512:Medium",
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
                fill = SolidColor(Color(0xFFF50101)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50101))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.731f, 1.271f)
                curveTo(6.737f, 1.214f, 6.664f, 1.192f, 6.635f, 1.241f)
                curveTo(6.409f, 1.626f, 5.84f, 2.543f, 4.904f, 3.741f)
                verticalLineTo(3.168f)
                curveTo(4.815f, 3.071f, 4.53f, 2.81f, 4.53f, 2.81f)
                verticalLineTo(2.237f)
                lineTo(5.045f, 1.771f)
                lineTo(4.338f, 1.25f)
                lineTo(3.593f, 1.771f)
                lineTo(4.156f, 2.237f)
                verticalLineTo(2.81f)
                curveTo(4.156f, 3.084f, 3.815f, 3.168f, 3.815f, 3.168f)
                lineTo(3.752f, 3.673f)
                curveTo(2.882f, 2.542f, 2.339f, 1.661f, 2.109f, 1.267f)
                curveTo(2.079f, 1.216f, 2.005f, 1.24f, 2.014f, 1.298f)
                curveTo(2.083f, 1.759f, 2.29f, 2.781f, 2.864f, 3.873f)
                horizontalLineTo(2.71f)
                verticalLineTo(3.852f)
                curveTo(2.71f, 3.822f, 2.686f, 3.798f, 2.656f, 3.798f)
                horizontalLineTo(1.338f)
                curveTo(1.308f, 3.798f, 1.283f, 3.822f, 1.283f, 3.852f)
                verticalLineTo(4.681f)
                curveTo(1.283f, 4.711f, 1.308f, 4.736f, 1.338f, 4.736f)
                horizontalLineTo(2.656f)
                curveTo(2.686f, 4.736f, 2.71f, 4.711f, 2.71f, 4.681f)
                verticalLineTo(4.246f)
                horizontalLineTo(2.876f)
                curveTo(2.932f, 4.376f, 3.061f, 4.467f, 3.213f, 4.47f)
                curveTo(3.318f, 4.633f, 3.433f, 4.796f, 3.557f, 4.956f)
                curveTo(3.271f, 4.928f, 1.383f, 4.767f, 1.383f, 5.454f)
                curveTo(1.383f, 5.864f, 1.842f, 6.081f, 2.418f, 6.193f)
                curveTo(1.838f, 6.719f, 1.291f, 7.213f, 1.039f, 7.44f)
                curveTo(0.998f, 7.477f, 1.03f, 7.541f, 1.083f, 7.527f)
                curveTo(1.533f, 7.416f, 2.712f, 7.072f, 3.835f, 6.306f)
                lineTo(3.87f, 6.306f)
                curveTo(4.186f, 6.306f, 4.406f, 6.169f, 4.558f, 5.984f)
                curveTo(5.7f, 6.916f, 6.991f, 7.346f, 7.552f, 7.5f)
                curveTo(7.61f, 7.516f, 7.642f, 7.441f, 7.592f, 7.406f)
                curveTo(7.137f, 7.09f, 6.11f, 6.33f, 5.06f, 5.225f)
                lineTo(5.088f, 5.192f)
                curveTo(5.302f, 4.94f, 5.488f, 4.68f, 5.651f, 4.419f)
                curveTo(5.719f, 4.379f, 5.773f, 4.319f, 5.805f, 4.246f)
                horizontalLineTo(5.971f)
                verticalLineTo(4.681f)
                curveTo(5.971f, 4.711f, 5.995f, 4.736f, 6.025f, 4.736f)
                horizontalLineTo(7.343f)
                curveTo(7.373f, 4.736f, 7.397f, 4.711f, 7.397f, 4.681f)
                verticalLineTo(3.852f)
                curveTo(7.397f, 3.822f, 7.373f, 3.798f, 7.343f, 3.798f)
                horizontalLineTo(6.025f)
                curveTo(6.011f, 3.798f, 5.998f, 3.803f, 5.989f, 3.812f)
                curveTo(6.528f, 2.721f, 6.686f, 1.709f, 6.731f, 1.271f)
                close()
                moveTo(5.971f, 3.873f)
                verticalLineTo(3.852f)
                lineTo(5.971f, 3.848f)
                lineTo(5.958f, 3.873f)
                horizontalLineTo(5.971f)
                close()
                moveTo(3.525f, 4.101f)
                curveTo(3.525f, 4.268f, 3.388f, 4.403f, 3.219f, 4.403f)
                curveTo(3.051f, 4.403f, 2.914f, 4.268f, 2.914f, 4.101f)
                curveTo(2.914f, 3.934f, 3.051f, 3.798f, 3.219f, 3.798f)
                curveTo(3.388f, 3.798f, 3.525f, 3.934f, 3.525f, 4.101f)
                close()
                moveTo(5.156f, 4.101f)
                curveTo(5.156f, 4.268f, 5.292f, 4.403f, 5.461f, 4.403f)
                curveTo(5.63f, 4.403f, 5.767f, 4.268f, 5.767f, 4.101f)
                curveTo(5.767f, 3.934f, 5.63f, 3.798f, 5.461f, 3.798f)
                curveTo(5.292f, 3.798f, 5.156f, 3.934f, 5.156f, 4.101f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun OmanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Oman,
            contentDescription = "Oman Flag"
        )
    }
}
