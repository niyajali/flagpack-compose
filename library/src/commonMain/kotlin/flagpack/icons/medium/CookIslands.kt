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
 * Cook Islands Flag (20x15dp)
 *
 * - ISO Alpha-2: CK
 * - ISO Alpha-3: COK
 * - ISO Numeric: 184
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.CookIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cook Islands:CK:COK:184:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-1.253f, 8.125f)
                lineTo(1.223f, 9.211f)
                lineTo(11.306f, 1.18f)
                lineTo(12.612f, -0.433f)
                lineTo(9.965f, -0.796f)
                lineTo(5.852f, 2.665f)
                lineTo(2.542f, 4.996f)
                lineTo(-1.253f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-0.914f, 8.886f)
                lineTo(0.347f, 9.516f)
                lineTo(12.143f, -0.583f)
                horizontalLineTo(10.372f)
                lineTo(-0.914f, 8.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(12.503f, 8.125f)
                lineTo(10.306f, 9.521f)
                lineTo(-0.056f, 1.18f)
                lineTo(-1.362f, -0.433f)
                lineTo(1.285f, -0.796f)
                lineTo(5.398f, 2.665f)
                lineTo(8.708f, 4.996f)
                lineTo(12.503f, 8.125f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(12.418f, 8.671f)
                lineTo(11.157f, 9.301f)
                lineTo(6.134f, 4.977f)
                lineTo(4.645f, 4.494f)
                lineTo(-1.488f, -0.427f)
                horizontalLineTo(0.283f)
                lineTo(6.413f, 4.377f)
                lineTo(8.041f, 4.957f)
                lineTo(12.418f, 8.671f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.063f, 0f)
                horizontalLineTo(6.938f)
                verticalLineTo(3.063f)
                lineTo(11f, 3f)
                verticalLineTo(5.875f)
                lineTo(6.938f, 5.938f)
                verticalLineTo(9f)
                horizontalLineTo(4.063f)
                verticalLineTo(5.938f)
                lineTo(0f, 5.875f)
                verticalLineTo(3f)
                lineTo(4.063f, 3.063f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 4f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(14.907f, 9.284f)
            lineTo(15.569f, 8.823f)
            lineTo(16.21f, 9.284f)
            lineTo(16.011f, 8.463f)
            lineTo(16.526f, 7.943f)
            horizontalLineTo(15.87f)
            lineTo(15.568f, 7.273f)
            lineTo(15.311f, 7.943f)
            horizontalLineTo(14.542f)
            lineTo(15.13f, 8.463f)
            lineTo(14.907f, 9.284f)
            close()
            moveTo(16.665f, 10.071f)
            lineTo(17.327f, 9.609f)
            lineTo(17.718f, 9.891f)
            lineTo(17.593f, 10.217f)
            horizontalLineTo(16.824f)
            lineTo(17.413f, 10.738f)
            lineTo(17.304f, 11.138f)
            lineTo(17.228f, 10.969f)
            lineTo(16.97f, 11.639f)
            horizontalLineTo(16.201f)
            lineTo(16.79f, 12.16f)
            lineTo(16.566f, 12.981f)
            lineTo(17.229f, 12.519f)
            lineTo(17.869f, 12.981f)
            lineTo(17.67f, 12.16f)
            lineTo(18.185f, 11.639f)
            horizontalLineTo(17.53f)
            lineTo(17.421f, 11.398f)
            lineTo(17.852f, 11.097f)
            lineTo(18.493f, 11.559f)
            lineTo(18.293f, 10.738f)
            lineTo(18.808f, 10.217f)
            horizontalLineTo(18.153f)
            lineTo(17.851f, 9.547f)
            lineTo(17.845f, 9.563f)
            lineTo(17.769f, 9.25f)
            lineTo(18.284f, 8.729f)
            horizontalLineTo(17.628f)
            lineTo(17.326f, 8.059f)
            lineTo(17.069f, 8.729f)
            horizontalLineTo(16.3f)
            lineTo(16.888f, 9.25f)
            lineTo(16.665f, 10.071f)
            close()
            moveTo(15.636f, 13.298f)
            lineTo(14.974f, 13.76f)
            lineTo(15.197f, 12.939f)
            lineTo(14.662f, 12.465f)
            lineTo(14.793f, 13.005f)
            lineTo(14.152f, 12.544f)
            lineTo(13.49f, 13.005f)
            lineTo(13.714f, 12.184f)
            lineTo(13.125f, 11.664f)
            horizontalLineTo(13.894f)
            lineTo(13.946f, 11.529f)
            lineTo(13.361f, 11.108f)
            lineTo(12.698f, 11.569f)
            lineTo(12.922f, 10.748f)
            lineTo(12.334f, 10.228f)
            horizontalLineTo(13.102f)
            lineTo(13.36f, 9.558f)
            lineTo(13.396f, 9.636f)
            lineTo(13.493f, 9.279f)
            lineTo(12.905f, 8.758f)
            horizontalLineTo(13.673f)
            lineTo(13.931f, 8.088f)
            lineTo(14.233f, 8.758f)
            horizontalLineTo(14.888f)
            lineTo(14.373f, 9.279f)
            lineTo(14.573f, 10.1f)
            lineTo(13.932f, 9.639f)
            lineTo(13.524f, 9.922f)
            lineTo(13.662f, 10.228f)
            horizontalLineTo(14.317f)
            lineTo(13.803f, 10.748f)
            lineTo(13.974f, 11.455f)
            lineTo(14.151f, 10.994f)
            lineTo(14.454f, 11.664f)
            horizontalLineTo(15.109f)
            lineTo(14.594f, 12.184f)
            lineTo(14.651f, 12.418f)
            horizontalLineTo(15.377f)
            lineTo(15.635f, 11.748f)
            lineTo(15.937f, 12.418f)
            horizontalLineTo(16.592f)
            lineTo(16.078f, 12.939f)
            lineTo(16.277f, 13.76f)
            lineTo(15.636f, 13.298f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CookIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.CookIslands,
            contentDescription = "Cook Islands Flag"
        )
    }
}
