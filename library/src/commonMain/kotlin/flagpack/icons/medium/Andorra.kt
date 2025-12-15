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
 * Andorra Flag (20x15dp)
 *
 * - ISO Alpha-2: AD
 * - ISO Alpha-3: AND
 * - ISO Numeric: 020
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Andorra: ImageVector by lazy {
    ImageVector.Builder(
        name = "Andorra:AD:AND:020:Medium",
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
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.187f, 12.14f)
                curveTo(10.325f, 12.101f, 10.444f, 11.861f, 10.444f, 11.861f)
                curveTo(10.444f, 11.861f, 10.534f, 11.931f, 10.677f, 12.003f)
                curveTo(10.82f, 12.075f, 10.969f, 11.861f, 10.969f, 11.861f)
                curveTo(10.969f, 11.861f, 11.172f, 11.861f, 11.261f, 11.621f)
                curveTo(11.35f, 11.381f, 11.083f, 11.279f, 11.083f, 11.279f)
                curveTo(11.083f, 11.279f, 11.395f, 10.951f, 11.922f, 10.951f)
                horizontalLineTo(11.922f)
                curveTo(12.448f, 10.951f, 12.858f, 10.951f, 13.202f, 10.805f)
                curveTo(13.546f, 10.659f, 13.88f, 10.408f, 14.005f, 9.888f)
                curveTo(14.129f, 9.367f, 13.734f, 9.039f, 13.734f, 9.039f)
                curveTo(13.734f, 9.039f, 13.822f, 9.067f, 14.005f, 8.917f)
                curveTo(14.187f, 8.767f, 13.892f, 8.286f, 13.734f, 8.286f)
                curveTo(13.575f, 8.286f, 13.557f, 8.375f, 13.557f, 8.375f)
                curveTo(13.557f, 8.375f, 13.459f, 8.29f, 13.325f, 8.001f)
                curveTo(13.19f, 7.712f, 13.459f, 7.458f, 13.459f, 7.458f)
                curveTo(13.459f, 7.458f, 13.606f, 7.542f, 13.734f, 7.403f)
                curveTo(13.862f, 7.264f, 13.667f, 7.051f, 13.667f, 7.051f)
                curveTo(13.667f, 7.051f, 14.285f, 6.841f, 14.196f, 6.051f)
                curveTo(14.106f, 5.261f, 13.292f, 5.306f, 13.292f, 5.306f)
                curveTo(13.292f, 5.306f, 13.317f, 5.175f, 13.202f, 5.1f)
                curveTo(13.087f, 5.025f, 13.002f, 5.175f, 13.002f, 5.175f)
                curveTo(12.912f, 4.966f, 13.176f, 4.681f, 13.387f, 4.453f)
                curveTo(13.453f, 4.382f, 13.513f, 4.317f, 13.557f, 4.261f)
                curveTo(13.739f, 4.026f, 13.625f, 3.734f, 12.957f, 3.416f)
                curveTo(12.289f, 3.098f, 11.925f, 3.526f, 11.871f, 3.677f)
                curveTo(11.818f, 3.829f, 12.025f, 3.922f, 12.025f, 3.922f)
                curveTo(11.856f, 4.071f, 11.529f, 4.127f, 11.306f, 4.025f)
                curveTo(11.083f, 3.922f, 11.182f, 3.611f, 11.228f, 3.526f)
                curveTo(11.233f, 3.516f, 11.24f, 3.505f, 11.248f, 3.492f)
                curveTo(11.311f, 3.386f, 11.442f, 3.165f, 11.306f, 2.95f)
                curveTo(11.153f, 2.708f, 10.889f, 2.708f, 10.677f, 2.845f)
                curveTo(10.496f, 2.963f, 10.239f, 3.025f, 10.168f, 3.041f)
                curveTo(10.098f, 3.025f, 9.841f, 2.963f, 9.66f, 2.845f)
                curveTo(9.449f, 2.708f, 9.184f, 2.708f, 9.031f, 2.95f)
                curveTo(8.895f, 3.165f, 9.027f, 3.386f, 9.089f, 3.492f)
                curveTo(9.097f, 3.505f, 9.104f, 3.516f, 9.109f, 3.526f)
                curveTo(9.155f, 3.611f, 9.254f, 3.922f, 9.031f, 4.025f)
                curveTo(8.808f, 4.127f, 8.481f, 4.071f, 8.312f, 3.922f)
                curveTo(8.312f, 3.922f, 8.52f, 3.829f, 8.466f, 3.677f)
                curveTo(8.413f, 3.526f, 8.048f, 3.098f, 7.38f, 3.416f)
                curveTo(6.712f, 3.734f, 6.598f, 4.026f, 6.78f, 4.261f)
                curveTo(6.824f, 4.317f, 6.884f, 4.382f, 6.95f, 4.453f)
                curveTo(7.161f, 4.681f, 7.425f, 4.966f, 7.335f, 5.175f)
                curveTo(7.335f, 5.175f, 7.25f, 5.025f, 7.135f, 5.1f)
                curveTo(7.02f, 5.175f, 7.045f, 5.306f, 7.045f, 5.306f)
                curveTo(7.045f, 5.306f, 6.231f, 5.261f, 6.141f, 6.051f)
                curveTo(6.052f, 6.841f, 6.67f, 7.051f, 6.67f, 7.051f)
                curveTo(6.67f, 7.051f, 6.475f, 7.264f, 6.603f, 7.403f)
                curveTo(6.731f, 7.542f, 6.878f, 7.458f, 6.878f, 7.458f)
                curveTo(6.878f, 7.458f, 7.147f, 7.712f, 7.013f, 8.001f)
                curveTo(6.878f, 8.29f, 6.78f, 8.375f, 6.78f, 8.375f)
                curveTo(6.78f, 8.375f, 6.762f, 8.286f, 6.603f, 8.286f)
                curveTo(6.444f, 8.286f, 6.15f, 8.767f, 6.333f, 8.917f)
                curveTo(6.515f, 9.067f, 6.603f, 9.039f, 6.603f, 9.039f)
                curveTo(6.603f, 9.039f, 6.208f, 9.367f, 6.333f, 9.888f)
                curveTo(6.457f, 10.408f, 6.791f, 10.659f, 7.135f, 10.805f)
                curveTo(7.479f, 10.951f, 7.889f, 10.951f, 8.415f, 10.951f)
                horizontalLineTo(8.415f)
                curveTo(8.942f, 10.951f, 9.254f, 11.279f, 9.254f, 11.279f)
                curveTo(9.254f, 11.279f, 8.987f, 11.381f, 9.076f, 11.621f)
                curveTo(9.165f, 11.861f, 9.368f, 11.861f, 9.368f, 11.861f)
                curveTo(9.368f, 11.861f, 9.517f, 12.075f, 9.66f, 12.003f)
                curveTo(9.803f, 11.931f, 9.893f, 11.861f, 9.893f, 11.861f)
                curveTo(9.893f, 11.861f, 10.012f, 12.101f, 10.15f, 12.14f)
                verticalLineTo(12.145f)
                curveTo(10.156f, 12.145f, 10.162f, 12.145f, 10.168f, 12.144f)
                curveTo(10.175f, 12.145f, 10.181f, 12.145f, 10.187f, 12.145f)
                verticalLineTo(12.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF805440))) {
                moveTo(7.569f, 9.999f)
                lineTo(7.635f, 9.84f)
                curveTo(8.389f, 10.163f, 9.248f, 10.325f, 10.212f, 10.325f)
                curveTo(11.175f, 10.325f, 12.011f, 10.164f, 12.72f, 9.841f)
                lineTo(12.789f, 9.998f)
                curveTo(12.057f, 10.331f, 11.198f, 10.498f, 10.212f, 10.498f)
                curveTo(9.227f, 10.498f, 8.345f, 10.332f, 7.569f, 9.999f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AndorraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Andorra,
            contentDescription = "Andorra Flag"
        )
    }
}
