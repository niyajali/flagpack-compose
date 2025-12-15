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
 * Egypt Flag (20x15dp)
 *
 * - ISO Alpha-2: EG
 * - ISO Alpha-3: EGY
 * - ISO Numeric: 818
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Egypt: ImageVector by lazy {
    ImageVector.Builder(
        name = "Egypt:EG:EGY:818:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFBF2714)),
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
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(7.663f, 6.388f)
                lineTo(8.287f, 6.416f)
                lineTo(8.13f, 9.835f)
                lineTo(7.506f, 9.806f)
                lineTo(7.663f, 6.388f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.315f, 6.6f)
                lineTo(8.939f, 6.635f)
                lineTo(8.782f, 9.407f)
                lineTo(8.158f, 9.372f)
                lineTo(8.315f, 6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.968f, 6.807f)
                lineTo(9.591f, 6.859f)
                lineTo(9.434f, 8.769f)
                lineTo(8.811f, 8.717f)
                lineTo(8.968f, 6.807f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(12.337f, 6.388f)
                lineTo(11.713f, 6.416f)
                lineTo(11.87f, 9.835f)
                lineTo(12.494f, 9.806f)
                lineTo(12.337f, 6.388f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(11.685f, 6.6f)
                lineTo(11.061f, 6.635f)
                lineTo(11.218f, 9.407f)
                lineTo(11.842f, 9.372f)
                lineTo(11.685f, 6.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(11.032f, 6.807f)
                lineTo(10.409f, 6.859f)
                lineTo(10.566f, 8.769f)
                lineTo(11.189f, 8.717f)
                lineTo(11.032f, 6.807f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(9.983f, 9.579f)
                lineTo(9.374f, 9.44f)
                lineTo(9.632f, 8.314f)
                lineTo(10.241f, 8.454f)
                lineTo(9.983f, 9.579f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(10.45f, 9.579f)
                lineTo(11.059f, 9.44f)
                lineTo(10.801f, 8.314f)
                lineTo(10.192f, 8.454f)
                lineTo(10.45f, 9.579f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(10.295f, 9.569f)
                horizontalLineTo(9.67f)
                verticalLineTo(8.464f)
                horizontalLineTo(10.295f)
                verticalLineTo(9.569f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(9.147f, 6.821f)
                lineTo(9.772f, 6.836f)
                lineTo(9.735f, 8.324f)
                lineTo(9.11f, 8.309f)
                lineTo(9.147f, 6.821f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(10.234f, 6.821f)
                lineTo(10.858f, 6.836f)
                lineTo(10.822f, 8.324f)
                lineTo(10.197f, 8.309f)
                lineTo(10.234f, 6.821f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(8.336f, 9.952f)
                lineTo(8.499f, 9.348f)
                curveTo(9.162f, 9.527f, 9.671f, 9.615f, 10.018f, 9.615f)
                curveTo(10.365f, 9.615f, 10.875f, 9.527f, 11.538f, 9.348f)
                lineTo(11.7f, 9.952f)
                curveTo(10.988f, 10.143f, 10.431f, 10.24f, 10.018f, 10.24f)
                curveTo(9.606f, 10.24f, 9.048f, 10.143f, 8.336f, 9.952f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC09302))) {
                moveTo(7.676f, 6.389f)
                curveTo(7.635f, 5.976f, 7.876f, 5.697f, 8.286f, 5.732f)
                curveTo(8.421f, 5.744f, 8.572f, 5.784f, 8.773f, 5.852f)
                curveTo(8.832f, 5.873f, 8.832f, 5.873f, 8.889f, 5.893f)
                curveTo(9.166f, 5.991f, 9.241f, 6.017f, 9.257f, 6.02f)
                curveTo(9.196f, 6.006f, 9.376f, 5.679f, 9.418f, 5.624f)
                curveTo(9.423f, 5.659f, 9.402f, 5.654f, 9.352f, 5.644f)
                lineTo(8.788f, 5.531f)
                lineTo(9.19f, 5.12f)
                curveTo(9.33f, 4.976f, 9.517f, 4.904f, 9.73f, 4.904f)
                curveTo(9.752f, 4.904f, 9.773f, 4.903f, 9.84f, 4.899f)
                curveTo(9.89f, 4.896f, 9.89f, 4.896f, 9.947f, 4.894f)
                curveTo(10.337f, 4.881f, 10.616f, 4.992f, 10.616f, 5.393f)
                curveTo(10.616f, 5.536f, 10.634f, 5.767f, 10.664f, 5.942f)
                curveTo(10.675f, 6.001f, 10.694f, 6.056f, 10.637f, 6.08f)
                curveTo(10.639f, 6.059f, 10.776f, 6.005f, 10.988f, 5.916f)
                lineTo(11.013f, 5.906f)
                curveTo(11.631f, 5.648f, 11.703f, 5.624f, 11.902f, 5.745f)
                curveTo(12.034f, 5.826f, 12.16f, 5.971f, 12.302f, 6.187f)
                lineTo(11.779f, 6.529f)
                curveTo(11.688f, 6.39f, 11.615f, 6.305f, 11.58f, 6.281f)
                curveTo(11.659f, 6.336f, 11.394f, 6.424f, 11.254f, 6.482f)
                lineTo(11.229f, 6.493f)
                curveTo(10.749f, 6.694f, 10.685f, 6.718f, 10.548f, 6.718f)
                curveTo(10.174f, 6.718f, 10.04f, 6.335f, 10.003f, 5.786f)
                curveTo(9.888f, 6.166f, 9.543f, 6.645f, 9.26f, 6.645f)
                curveTo(9.136f, 6.645f, 9.195f, 6.665f, 8.68f, 6.482f)
                curveTo(8.626f, 6.463f, 8.626f, 6.463f, 8.573f, 6.444f)
                curveTo(8.416f, 6.391f, 8.304f, 6.362f, 8.233f, 6.355f)
                curveTo(8.236f, 6.352f, 8.246f, 6.341f, 8.258f, 6.331f)
                lineTo(7.676f, 6.389f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EgyptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Egypt,
            contentDescription = "Egypt Flag"
        )
    }
}
