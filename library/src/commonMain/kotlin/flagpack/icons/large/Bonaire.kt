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
 * Bonaire Flag (32x24dp)
 *
 * - ISO Alpha-2: BQ-BO
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Bonaire: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bonaire:BQ-BO:::Large",
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10.933f)
                verticalLineTo(0f)
                horizontalLineTo(16f)
                lineTo(0f, 10.933f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 24f)
                horizontalLineTo(32.009f)
                verticalLineTo(0f)
                lineTo(0f, 24f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.353f, 5f)
                lineTo(9.88f, 6.131f)
                curveTo(12.026f, 6.387f, 13.698f, 8.188f, 13.752f, 10.389f)
                lineTo(14.707f, 10.867f)
                lineTo(13.664f, 11.388f)
                curveTo(13.29f, 13.211f, 11.789f, 14.623f, 9.922f, 14.864f)
                lineTo(9.353f, 16f)
                lineTo(8.785f, 14.864f)
                curveTo(6.917f, 14.623f, 5.417f, 13.211f, 5.043f, 11.388f)
                lineTo(4f, 10.867f)
                lineTo(4.955f, 10.389f)
                curveTo(5.009f, 8.2f, 6.662f, 6.407f, 8.791f, 6.136f)
                lineTo(9.353f, 5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(9.353f, 5f)
                lineTo(9.88f, 6.131f)
                curveTo(12.026f, 6.387f, 13.698f, 8.188f, 13.752f, 10.389f)
                lineTo(14.707f, 10.867f)
                lineTo(13.664f, 11.388f)
                curveTo(13.29f, 13.211f, 11.789f, 14.623f, 9.922f, 14.864f)
                lineTo(9.353f, 16f)
                lineTo(8.785f, 14.864f)
                curveTo(6.917f, 14.623f, 5.417f, 13.211f, 5.043f, 11.388f)
                lineTo(4f, 10.867f)
                lineTo(4.955f, 10.389f)
                curveTo(5.009f, 8.2f, 6.662f, 6.407f, 8.791f, 6.136f)
                lineTo(9.353f, 5f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.88f, 6.131f)
                lineTo(9.162f, 6.466f)
                lineTo(9.348f, 6.865f)
                lineTo(9.786f, 6.918f)
                lineTo(9.88f, 6.131f)
                close()
                moveTo(9.353f, 5f)
                lineTo(10.071f, 4.666f)
                lineTo(9.375f, 3.171f)
                lineTo(8.644f, 4.648f)
                lineTo(9.353f, 5f)
                close()
                moveTo(13.752f, 10.389f)
                lineTo(12.96f, 10.409f)
                lineTo(12.972f, 10.885f)
                lineTo(13.398f, 11.098f)
                lineTo(13.752f, 10.389f)
                close()
                moveTo(14.707f, 10.867f)
                lineTo(15.061f, 11.575f)
                lineTo(16.478f, 10.867f)
                lineTo(15.061f, 10.158f)
                lineTo(14.707f, 10.867f)
                close()
                moveTo(13.664f, 11.388f)
                lineTo(13.309f, 10.68f)
                lineTo(12.965f, 10.852f)
                lineTo(12.888f, 11.229f)
                lineTo(13.664f, 11.388f)
                close()
                moveTo(9.922f, 14.864f)
                lineTo(9.82f, 14.078f)
                lineTo(9.402f, 14.132f)
                lineTo(9.213f, 14.509f)
                lineTo(9.922f, 14.864f)
                close()
                moveTo(9.353f, 16f)
                lineTo(8.645f, 16.354f)
                lineTo(9.353f, 17.771f)
                lineTo(10.062f, 16.354f)
                lineTo(9.353f, 16f)
                close()
                moveTo(8.785f, 14.864f)
                lineTo(9.494f, 14.509f)
                lineTo(9.305f, 14.132f)
                lineTo(8.886f, 14.078f)
                lineTo(8.785f, 14.864f)
                close()
                moveTo(5.043f, 11.388f)
                lineTo(5.819f, 11.229f)
                lineTo(5.742f, 10.852f)
                lineTo(5.397f, 10.68f)
                lineTo(5.043f, 11.388f)
                close()
                moveTo(4f, 10.867f)
                lineTo(3.646f, 10.158f)
                lineTo(2.229f, 10.867f)
                lineTo(3.646f, 11.575f)
                lineTo(4f, 10.867f)
                close()
                moveTo(4.955f, 10.389f)
                lineTo(5.309f, 11.098f)
                lineTo(5.735f, 10.885f)
                lineTo(5.746f, 10.409f)
                lineTo(4.955f, 10.389f)
                close()
                moveTo(8.791f, 6.136f)
                lineTo(8.891f, 6.921f)
                lineTo(9.312f, 6.868f)
                lineTo(9.5f, 6.487f)
                lineTo(8.791f, 6.136f)
                close()
                moveTo(10.598f, 5.797f)
                lineTo(10.071f, 4.666f)
                lineTo(8.635f, 5.334f)
                lineTo(9.162f, 6.466f)
                lineTo(10.598f, 5.797f)
                close()
                moveTo(14.544f, 10.37f)
                curveTo(14.48f, 7.771f, 12.507f, 5.647f, 9.974f, 5.345f)
                lineTo(9.786f, 6.918f)
                curveTo(11.545f, 7.128f, 12.916f, 8.604f, 12.96f, 10.409f)
                lineTo(14.544f, 10.37f)
                close()
                moveTo(15.061f, 10.158f)
                lineTo(14.106f, 9.681f)
                lineTo(13.398f, 11.098f)
                lineTo(14.352f, 11.575f)
                lineTo(15.061f, 10.158f)
                close()
                moveTo(14.018f, 12.097f)
                lineTo(15.061f, 11.575f)
                lineTo(14.352f, 10.158f)
                lineTo(13.309f, 10.68f)
                lineTo(14.018f, 12.097f)
                close()
                moveTo(10.023f, 15.649f)
                curveTo(12.229f, 15.365f, 13.998f, 13.699f, 14.439f, 11.547f)
                lineTo(12.888f, 11.229f)
                curveTo(12.582f, 12.723f, 11.35f, 13.881f, 9.82f, 14.078f)
                lineTo(10.023f, 15.649f)
                close()
                moveTo(9.213f, 14.509f)
                lineTo(8.645f, 15.646f)
                lineTo(10.062f, 16.354f)
                lineTo(10.63f, 15.218f)
                lineTo(9.213f, 14.509f)
                close()
                moveTo(10.062f, 15.646f)
                lineTo(9.494f, 14.509f)
                lineTo(8.077f, 15.218f)
                lineTo(8.645f, 16.354f)
                lineTo(10.062f, 15.646f)
                close()
                moveTo(4.267f, 11.547f)
                curveTo(4.708f, 13.699f, 6.478f, 15.365f, 8.684f, 15.649f)
                lineTo(8.886f, 14.078f)
                curveTo(7.357f, 13.881f, 6.125f, 12.723f, 5.819f, 11.229f)
                lineTo(4.267f, 11.547f)
                close()
                moveTo(3.646f, 11.575f)
                lineTo(4.689f, 12.097f)
                lineTo(5.397f, 10.68f)
                lineTo(4.354f, 10.158f)
                lineTo(3.646f, 11.575f)
                close()
                moveTo(4.601f, 9.681f)
                lineTo(3.646f, 10.158f)
                lineTo(4.354f, 11.575f)
                lineTo(5.309f, 11.098f)
                lineTo(4.601f, 9.681f)
                close()
                moveTo(8.69f, 5.35f)
                curveTo(6.178f, 5.671f, 4.227f, 7.785f, 4.163f, 10.37f)
                lineTo(5.746f, 10.409f)
                curveTo(5.791f, 8.615f, 7.146f, 7.144f, 8.891f, 6.921f)
                lineTo(8.69f, 5.35f)
                close()
                moveTo(8.644f, 4.648f)
                lineTo(8.081f, 5.784f)
                lineTo(9.5f, 6.487f)
                lineTo(10.063f, 5.352f)
                lineTo(8.644f, 4.648f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF00A17)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.376f, 8.3f)
            lineTo(8.727f, 9.389f)
            horizontalLineTo(7.447f)
            lineTo(8.085f, 10.533f)
            lineTo(7.447f, 11.631f)
            horizontalLineTo(8.727f)
            lineTo(9.376f, 12.75f)
            lineTo(10.035f, 11.631f)
            horizontalLineTo(11.303f)
            lineTo(10.681f, 10.533f)
            lineTo(11.303f, 9.389f)
            horizontalLineTo(10.035f)
            lineTo(9.376f, 8.3f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BonairePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Bonaire,
            contentDescription = "Bonaire Flag"
        )
    }
}
