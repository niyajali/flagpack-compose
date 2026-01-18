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
 * Saint Helena Flag (20x15dp)
 *
 * - ISO Alpha-2: SH
 * - ISO Alpha-3: SHN
 * - ISO Numeric: 654
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SaintHelena: ImageVector by lazy {
    ImageVector.Builder(
        name = "Saint Helena:SH:SHN:654:Medium",
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
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
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
        }
        group(
            clipPathData = PathData {
                moveTo(-1f, -1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-13f)
                close()
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
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(5f, 0f)
                verticalLineTo(-0.938f)
                horizontalLineTo(4.063f)
                verticalLineTo(0f)
                horizontalLineTo(5f)
                close()
                moveTo(6f, 0f)
                horizontalLineTo(6.938f)
                verticalLineTo(-0.938f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 4f)
                verticalLineTo(4.938f)
                horizontalLineTo(5.938f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
                moveTo(0f, 4f)
                verticalLineTo(3.063f)
                horizontalLineTo(-0.938f)
                verticalLineTo(4f)
                horizontalLineTo(0f)
                close()
                moveTo(0f, 5f)
                horizontalLineTo(-0.938f)
                verticalLineTo(5.938f)
                horizontalLineTo(0f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 5f)
                horizontalLineTo(5.938f)
                verticalLineTo(4.063f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveTo(5f, 9f)
                horizontalLineTo(4.063f)
                verticalLineTo(9.938f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                close()
                moveTo(6f, 9f)
                verticalLineTo(9.938f)
                horizontalLineTo(6.938f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                close()
                moveTo(6f, 5f)
                verticalLineTo(4.063f)
                horizontalLineTo(5.063f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                close()
                moveTo(11f, 5f)
                verticalLineTo(5.938f)
                horizontalLineTo(11.938f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                close()
                moveTo(11f, 4f)
                horizontalLineTo(11.938f)
                verticalLineTo(3.063f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                close()
                moveTo(6f, 4f)
                horizontalLineTo(5.063f)
                verticalLineTo(4.938f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                close()
                moveTo(5f, 0.938f)
                horizontalLineTo(6f)
                verticalLineTo(-0.938f)
                horizontalLineTo(5f)
                verticalLineTo(0.938f)
                close()
                moveTo(5.938f, 4f)
                verticalLineTo(0f)
                horizontalLineTo(4.063f)
                verticalLineTo(4f)
                horizontalLineTo(5.938f)
                close()
                moveTo(0f, 4.938f)
                horizontalLineTo(5f)
                verticalLineTo(3.063f)
                horizontalLineTo(0f)
                verticalLineTo(4.938f)
                close()
                moveTo(0.938f, 5f)
                verticalLineTo(4f)
                horizontalLineTo(-0.938f)
                verticalLineTo(5f)
                horizontalLineTo(0.938f)
                close()
                moveTo(5f, 4.063f)
                horizontalLineTo(0f)
                verticalLineTo(5.938f)
                horizontalLineTo(5f)
                verticalLineTo(4.063f)
                close()
                moveTo(5.938f, 9f)
                verticalLineTo(5f)
                horizontalLineTo(4.063f)
                verticalLineTo(9f)
                horizontalLineTo(5.938f)
                close()
                moveTo(6f, 8.063f)
                horizontalLineTo(5f)
                verticalLineTo(9.938f)
                horizontalLineTo(6f)
                verticalLineTo(8.063f)
                close()
                moveTo(5.063f, 5f)
                verticalLineTo(9f)
                horizontalLineTo(6.938f)
                verticalLineTo(5f)
                horizontalLineTo(5.063f)
                close()
                moveTo(11f, 4.063f)
                horizontalLineTo(6f)
                verticalLineTo(5.938f)
                horizontalLineTo(11f)
                verticalLineTo(4.063f)
                close()
                moveTo(10.063f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(11.938f)
                verticalLineTo(4f)
                horizontalLineTo(10.063f)
                close()
                moveTo(6f, 4.938f)
                horizontalLineTo(11f)
                verticalLineTo(3.063f)
                horizontalLineTo(6f)
                verticalLineTo(4.938f)
                close()
                moveTo(5.063f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(6.938f)
                verticalLineTo(0f)
                horizontalLineTo(5.063f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SaintHelenaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SaintHelena,
            contentDescription = "Saint Helena Flag"
        )
    }
}
