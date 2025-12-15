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
 * New Zealand Flag (20x15dp)
 *
 * - ISO Alpha-2: NZ
 * - ISO Alpha-3: NZL
 * - ISO Numeric: 554
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.NewZealand: ImageVector by lazy {
    ImageVector.Builder(
        name = "New Zealand:NZ:NZL:554:Medium",
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
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.533f, 12.813f)
            lineTo(14.431f, 13.392f)
            lineTo(14.642f, 12.165f)
            lineTo(13.75f, 11.296f)
            lineTo(14.982f, 11.116f)
            lineTo(15.533f, 10f)
            lineTo(16.084f, 11.116f)
            lineTo(17.316f, 11.296f)
            lineTo(16.425f, 12.165f)
            lineTo(16.635f, 13.392f)
            lineTo(15.533f, 12.813f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.25f, 8.669f)
            lineTo(12.4f, 9.115f)
            lineTo(12.563f, 8.169f)
            lineTo(11.875f, 7.499f)
            lineTo(12.825f, 7.361f)
            lineTo(13.25f, 6.5f)
            lineTo(13.675f, 7.361f)
            lineTo(14.625f, 7.499f)
            lineTo(13.938f, 8.169f)
            lineTo(14.1f, 9.115f)
            lineTo(13.25f, 8.669f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(17.624f, 8.666f)
            lineTo(16.775f, 9.113f)
            lineTo(16.937f, 8.167f)
            lineTo(16.25f, 7.498f)
            lineTo(17.199f, 7.36f)
            lineTo(17.624f, 6.5f)
            lineTo(18.048f, 7.36f)
            lineTo(18.997f, 7.498f)
            lineTo(18.31f, 8.167f)
            lineTo(18.472f, 9.113f)
            lineTo(17.624f, 8.666f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFF50100)),
            stroke = SolidColor(Color(0xFFF7FCFF)),
            strokeLineWidth = 0.5f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.75f, 5.169f)
            lineTo(14.9f, 5.615f)
            lineTo(15.063f, 4.669f)
            lineTo(14.375f, 3.999f)
            lineTo(15.325f, 3.861f)
            lineTo(15.75f, 3f)
            lineTo(16.175f, 3.861f)
            lineTo(17.125f, 3.999f)
            lineTo(16.438f, 4.669f)
            lineTo(16.6f, 5.615f)
            lineTo(15.75f, 5.169f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NewZealandPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.NewZealand,
            contentDescription = "New Zealand Flag"
        )
    }
}
