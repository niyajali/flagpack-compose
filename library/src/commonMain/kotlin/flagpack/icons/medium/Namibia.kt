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
 * Namibia Flag (20x15dp)
 *
 * - ISO Alpha-2: NA
 * - ISO Alpha-3: NAM
 * - ISO Numeric: 516
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Namibia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Namibia:NA:NAM:516:Medium",
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
                fill = SolidColor(Color(0xFF009933)),
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
                fill = SolidColor(Color(0xFF3195F9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                lineTo(20f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(-0.633f, 16.934f)
                lineTo(-0.301f, 17.534f)
                lineTo(0.266f, 17.148f)
                lineTo(22.036f, 2.33f)
                lineTo(22.475f, 2.031f)
                lineTo(22.251f, 1.55f)
                lineTo(20.787f, -1.6f)
                lineTo(20.48f, -2.26f)
                lineTo(19.874f, -1.856f)
                lineTo(-2.223f, 12.866f)
                lineTo(-2.702f, 13.185f)
                lineTo(-2.424f, 13.689f)
                lineTo(-0.633f, 16.934f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.894f, 5.778f)
                lineTo(3.085f, 6.787f)
                lineTo(2.889f, 5.509f)
                lineTo(1.684f, 5.978f)
                lineTo(2.153f, 4.773f)
                lineTo(0.875f, 4.577f)
                lineTo(1.884f, 3.769f)
                lineTo(0.875f, 2.96f)
                lineTo(2.153f, 2.764f)
                lineTo(1.684f, 1.559f)
                lineTo(2.889f, 2.028f)
                lineTo(3.085f, 0.75f)
                lineTo(3.894f, 1.759f)
                lineTo(4.702f, 0.75f)
                lineTo(4.898f, 2.028f)
                lineTo(6.103f, 1.559f)
                lineTo(5.634f, 2.764f)
                lineTo(6.912f, 2.96f)
                lineTo(5.903f, 3.769f)
                lineTo(6.912f, 4.577f)
                lineTo(5.634f, 4.773f)
                lineTo(6.103f, 5.978f)
                lineTo(4.898f, 5.509f)
                lineTo(4.702f, 6.787f)
                lineTo(3.894f, 5.778f)
                close()
                moveTo(3.894f, 5.331f)
                curveTo(4.756f, 5.331f, 5.456f, 4.631f, 5.456f, 3.769f)
                curveTo(5.456f, 2.906f, 4.756f, 2.206f, 3.894f, 2.206f)
                curveTo(3.031f, 2.206f, 2.331f, 2.906f, 2.331f, 3.769f)
                curveTo(2.331f, 4.631f, 3.031f, 5.331f, 3.894f, 5.331f)
                close()
                moveTo(5.144f, 3.769f)
                curveTo(5.144f, 4.459f, 4.584f, 5.019f, 3.894f, 5.019f)
                curveTo(3.203f, 5.019f, 2.644f, 4.459f, 2.644f, 3.769f)
                curveTo(2.644f, 3.078f, 3.203f, 2.519f, 3.894f, 2.519f)
                curveTo(4.584f, 2.519f, 5.144f, 3.078f, 5.144f, 3.769f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NamibiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Namibia,
            contentDescription = "Namibia Flag"
        )
    }
}
