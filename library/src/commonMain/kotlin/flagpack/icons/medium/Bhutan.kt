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
 * Bhutan Flag (20x15dp)
 *
 * - ISO Alpha-2: BT
 * - ISO Alpha-3: BTN
 * - ISO Numeric: 064
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Bhutan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bhutan:BT:BTN:064:Medium",
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
                fill = SolidColor(Color(0xFFFF6230)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(20f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.739f, 10.205f)
                curveTo(2.739f, 10.205f, 1.799f, 11.061f, 2.544f, 11.106f)
                curveTo(3.289f, 11.152f, 3.15f, 11.606f, 3.759f, 11.109f)
                curveTo(4.368f, 10.613f, 3.777f, 11.188f, 4.59f, 11.075f)
                curveTo(5.402f, 10.962f, 5.809f, 9.971f, 6.238f, 10.039f)
                curveTo(6.666f, 10.106f, 6.418f, 9.948f, 6.779f, 10.377f)
                curveTo(7.14f, 10.806f, 7.775f, 9.896f, 7.436f, 10.528f)
                curveTo(7.098f, 11.16f, 6.962f, 11.792f, 7.459f, 11.769f)
                curveTo(7.956f, 11.747f, 8.159f, 11.453f, 8.384f, 11.137f)
                curveTo(8.61f, 10.821f, 10.371f, 11.905f, 9.558f, 10.821f)
                curveTo(8.746f, 9.738f, 8.43f, 10.94f, 8.363f, 10.375f)
                curveTo(8.295f, 9.811f, 8.134f, 9.518f, 8.518f, 9.789f)
                curveTo(8.901f, 10.059f, 9.804f, 9.992f, 9.104f, 9.315f)
                curveTo(8.404f, 8.637f, 8.502f, 8.457f, 8.298f, 8.637f)
                curveTo(8.095f, 8.818f, 7.599f, 7.96f, 8.298f, 7.847f)
                curveTo(8.998f, 7.735f, 9.804f, 8.118f, 10.075f, 8.321f)
                curveTo(10.346f, 8.525f, 11.181f, 8.276f, 11.361f, 8.682f)
                curveTo(11.542f, 9.089f, 12.151f, 9.157f, 12.309f, 9.405f)
                curveTo(12.468f, 9.653f, 12.355f, 10.872f, 13.641f, 10.804f)
                curveTo(14.928f, 10.737f, 15.334f, 10.082f, 14.793f, 9.563f)
                curveTo(14.251f, 9.044f, 14.296f, 8.096f, 13.732f, 8.547f)
                curveTo(13.167f, 8.999f, 12.355f, 8.931f, 12.355f, 8.389f)
                curveTo(12.355f, 7.847f, 12.603f, 7.757f, 12.558f, 7.328f)
                curveTo(12.513f, 6.899f, 12.468f, 7.08f, 13.303f, 7.102f)
                curveTo(14.138f, 7.125f, 13.844f, 7.102f, 14.454f, 6.809f)
                curveTo(15.063f, 6.516f, 15.47f, 7.802f, 15.718f, 6.854f)
                curveTo(15.966f, 5.906f, 15.628f, 4.936f, 14.951f, 5.319f)
                curveTo(14.273f, 5.703f, 14.296f, 6.651f, 13.438f, 5.906f)
                curveTo(12.58f, 5.161f, 12.174f, 5.545f, 12.445f, 5.139f)
                curveTo(12.716f, 4.732f, 12.377f, 4.439f, 12.987f, 4.71f)
                curveTo(13.596f, 4.981f, 13.416f, 5.071f, 13.935f, 5.139f)
                curveTo(14.454f, 5.206f, 17.208f, 5.545f, 16.598f, 4.981f)
                curveTo(15.989f, 4.416f, 15.404f, 4.508f, 15.314f, 4.147f)
                curveTo(15.223f, 3.786f, 15.595f, 3.876f, 16.136f, 3.673f)
                curveTo(16.678f, 3.47f, 16.452f, 2.432f, 15.933f, 2.635f)
                curveTo(15.414f, 2.838f, 15.458f, 3.741f, 14.398f, 3.177f)
                curveTo(13.18f, 3.706f, 13.369f, 3.44f, 12.749f, 2.543f)
                curveTo(12.207f, 2.114f, 11.914f, 2.092f, 10.988f, 2.588f)
                curveTo(10.258f, 2.889f, 9.647f, 3.446f, 10.031f, 4.191f)
                curveTo(10.414f, 4.936f, 11.328f, 6.338f, 10.832f, 6.429f)
                curveTo(10.335f, 6.519f, 8.552f, 5.187f, 7.514f, 5.887f)
                curveTo(6.475f, 6.587f, 5.909f, 7.268f, 5.57f, 8.08f)
                curveTo(5.231f, 8.893f, 4.136f, 9.366f, 3.865f, 9.366f)
                curveTo(3.594f, 9.366f, 3.213f, 9.844f, 2.739f, 10.205f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BhutanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Bhutan,
            contentDescription = "Bhutan Flag"
        )
    }
}
