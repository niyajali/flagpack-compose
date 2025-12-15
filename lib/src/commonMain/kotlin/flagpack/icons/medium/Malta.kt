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
 * Malta Flag (20x15dp)
 *
 * - ISO Alpha-2: MT
 * - ISO Alpha-3: MLT
 * - ISO Numeric: 470
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Malta: ImageVector by lazy {
    ImageVector.Builder(
        name = "Malta:MT:MLT:470:Medium",
        defaultWidth = 20.dp,
        defaultHeight = 15.dp,
        viewportWidth = 20f,
        viewportHeight = 15f
    ).apply {
        path(fill = SolidColor(Color.White)) {
            moveTo(0f, 0f)
            horizontalLineToRelative(20f)
            verticalLineToRelative(15f)
            horizontalLineToRelative(-20f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFA0A0A0)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.25f, 3.8f)
            horizontalLineTo(3.75f)
            verticalLineTo(5.67f)
            curveTo(3.475f, 5.736f, 3.27f, 5.983f, 3.27f, 6.278f)
            curveTo(3.27f, 6.286f, 3.27f, 6.293f, 3.27f, 6.3f)
            horizontalLineTo(1.25f)
            verticalLineTo(8.8f)
            horizontalLineTo(3.332f)
            curveTo(3.412f, 8.967f, 3.565f, 9.093f, 3.75f, 9.137f)
            verticalLineTo(11.3f)
            horizontalLineTo(6.25f)
            verticalLineTo(9.145f)
            curveTo(6.452f, 9.11f, 6.621f, 8.979f, 6.708f, 8.8f)
            horizontalLineTo(8.75f)
            verticalLineTo(6.3f)
            horizontalLineTo(6.769f)
            curveTo(6.77f, 6.293f, 6.77f, 6.286f, 6.77f, 6.278f)
            curveTo(6.77f, 5.969f, 6.545f, 5.712f, 6.25f, 5.662f)
            verticalLineTo(3.8f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(6.25f, 3.8f)
                horizontalLineTo(3.75f)
                verticalLineTo(5.67f)
                curveTo(3.475f, 5.736f, 3.27f, 5.983f, 3.27f, 6.278f)
                curveTo(3.27f, 6.286f, 3.27f, 6.293f, 3.27f, 6.3f)
                horizontalLineTo(1.25f)
                verticalLineTo(8.8f)
                horizontalLineTo(3.332f)
                curveTo(3.412f, 8.967f, 3.565f, 9.093f, 3.75f, 9.137f)
                verticalLineTo(11.3f)
                horizontalLineTo(6.25f)
                verticalLineTo(9.145f)
                curveTo(6.452f, 9.11f, 6.621f, 8.979f, 6.708f, 8.8f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.3f)
                horizontalLineTo(6.769f)
                curveTo(6.77f, 6.293f, 6.77f, 6.286f, 6.77f, 6.278f)
                curveTo(6.77f, 5.969f, 6.545f, 5.712f, 6.25f, 5.662f)
                verticalLineTo(3.8f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(3.75f, 3.8f)
                verticalLineTo(3.175f)
                horizontalLineTo(3.125f)
                verticalLineTo(3.8f)
                horizontalLineTo(3.75f)
                close()
                moveTo(6.25f, 3.8f)
                horizontalLineTo(6.875f)
                verticalLineTo(3.175f)
                horizontalLineTo(6.25f)
                verticalLineTo(3.8f)
                close()
                moveTo(3.75f, 5.67f)
                lineTo(3.894f, 6.278f)
                lineTo(4.375f, 6.164f)
                verticalLineTo(5.67f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3.27f, 6.3f)
                verticalLineTo(6.925f)
                horizontalLineTo(3.917f)
                lineTo(3.895f, 6.279f)
                lineTo(3.27f, 6.3f)
                close()
                moveTo(1.25f, 6.3f)
                verticalLineTo(5.675f)
                horizontalLineTo(0.625f)
                verticalLineTo(6.3f)
                horizontalLineTo(1.25f)
                close()
                moveTo(1.25f, 8.8f)
                horizontalLineTo(0.625f)
                verticalLineTo(9.425f)
                horizontalLineTo(1.25f)
                verticalLineTo(8.8f)
                close()
                moveTo(3.332f, 8.8f)
                lineTo(3.894f, 8.528f)
                lineTo(3.724f, 8.175f)
                horizontalLineTo(3.332f)
                verticalLineTo(8.8f)
                close()
                moveTo(3.75f, 9.137f)
                horizontalLineTo(4.375f)
                verticalLineTo(8.643f)
                lineTo(3.894f, 8.528f)
                lineTo(3.75f, 9.137f)
                close()
                moveTo(3.75f, 11.3f)
                horizontalLineTo(3.125f)
                verticalLineTo(11.925f)
                horizontalLineTo(3.75f)
                verticalLineTo(11.3f)
                close()
                moveTo(6.25f, 11.3f)
                verticalLineTo(11.925f)
                horizontalLineTo(6.875f)
                verticalLineTo(11.3f)
                horizontalLineTo(6.25f)
                close()
                moveTo(6.25f, 9.145f)
                lineTo(6.146f, 8.528f)
                lineTo(5.625f, 8.617f)
                verticalLineTo(9.145f)
                horizontalLineTo(6.25f)
                close()
                moveTo(6.708f, 8.8f)
                verticalLineTo(8.175f)
                horizontalLineTo(6.316f)
                lineTo(6.145f, 8.528f)
                lineTo(6.708f, 8.8f)
                close()
                moveTo(8.75f, 8.8f)
                verticalLineTo(9.425f)
                horizontalLineTo(9.375f)
                verticalLineTo(8.8f)
                horizontalLineTo(8.75f)
                close()
                moveTo(8.75f, 6.3f)
                horizontalLineTo(9.375f)
                verticalLineTo(5.675f)
                horizontalLineTo(8.75f)
                verticalLineTo(6.3f)
                close()
                moveTo(6.769f, 6.3f)
                lineTo(6.145f, 6.279f)
                lineTo(6.123f, 6.925f)
                horizontalLineTo(6.769f)
                verticalLineTo(6.3f)
                close()
                moveTo(6.25f, 5.662f)
                horizontalLineTo(5.625f)
                verticalLineTo(6.19f)
                lineTo(6.146f, 6.279f)
                lineTo(6.25f, 5.662f)
                close()
                moveTo(3.75f, 4.425f)
                horizontalLineTo(6.25f)
                verticalLineTo(3.175f)
                horizontalLineTo(3.75f)
                verticalLineTo(4.425f)
                close()
                moveTo(4.375f, 5.67f)
                verticalLineTo(3.8f)
                horizontalLineTo(3.125f)
                verticalLineTo(5.67f)
                horizontalLineTo(4.375f)
                close()
                moveTo(3.895f, 6.278f)
                lineTo(3.894f, 6.278f)
                lineTo(3.606f, 5.062f)
                curveTo(3.055f, 5.193f, 2.645f, 5.687f, 2.645f, 6.278f)
                horizontalLineTo(3.895f)
                close()
                moveTo(3.895f, 6.279f)
                lineTo(3.895f, 6.278f)
                horizontalLineTo(2.645f)
                curveTo(2.645f, 6.293f, 2.645f, 6.307f, 2.646f, 6.321f)
                lineTo(3.895f, 6.279f)
                close()
                moveTo(1.25f, 6.925f)
                horizontalLineTo(3.27f)
                verticalLineTo(5.675f)
                horizontalLineTo(1.25f)
                verticalLineTo(6.925f)
                close()
                moveTo(1.875f, 8.8f)
                verticalLineTo(6.3f)
                horizontalLineTo(0.625f)
                verticalLineTo(8.8f)
                horizontalLineTo(1.875f)
                close()
                moveTo(3.332f, 8.175f)
                horizontalLineTo(1.25f)
                verticalLineTo(9.425f)
                horizontalLineTo(3.332f)
                verticalLineTo(8.175f)
                close()
                moveTo(3.894f, 8.528f)
                lineTo(3.894f, 8.528f)
                lineTo(2.769f, 9.072f)
                curveTo(2.93f, 9.405f, 3.235f, 9.657f, 3.606f, 9.745f)
                lineTo(3.894f, 8.528f)
                close()
                moveTo(4.375f, 11.3f)
                verticalLineTo(9.137f)
                horizontalLineTo(3.125f)
                verticalLineTo(11.3f)
                horizontalLineTo(4.375f)
                close()
                moveTo(6.25f, 10.675f)
                horizontalLineTo(3.75f)
                verticalLineTo(11.925f)
                horizontalLineTo(6.25f)
                verticalLineTo(10.675f)
                close()
                moveTo(5.625f, 9.145f)
                verticalLineTo(11.3f)
                horizontalLineTo(6.875f)
                verticalLineTo(9.145f)
                horizontalLineTo(5.625f)
                close()
                moveTo(6.354f, 9.761f)
                curveTo(6.761f, 9.692f, 7.098f, 9.429f, 7.271f, 9.072f)
                lineTo(6.145f, 8.528f)
                lineTo(6.146f, 8.528f)
                lineTo(6.354f, 9.761f)
                close()
                moveTo(8.75f, 8.175f)
                horizontalLineTo(6.708f)
                verticalLineTo(9.425f)
                horizontalLineTo(8.75f)
                verticalLineTo(8.175f)
                close()
                moveTo(8.125f, 6.3f)
                verticalLineTo(8.8f)
                horizontalLineTo(9.375f)
                verticalLineTo(6.3f)
                horizontalLineTo(8.125f)
                close()
                moveTo(6.769f, 6.925f)
                horizontalLineTo(8.75f)
                verticalLineTo(5.675f)
                horizontalLineTo(6.769f)
                verticalLineTo(6.925f)
                close()
                moveTo(6.145f, 6.278f)
                lineTo(6.145f, 6.279f)
                lineTo(7.394f, 6.321f)
                curveTo(7.395f, 6.307f, 7.395f, 6.293f, 7.395f, 6.278f)
                horizontalLineTo(6.145f)
                close()
                moveTo(6.146f, 6.279f)
                lineTo(6.145f, 6.278f)
                horizontalLineTo(7.395f)
                curveTo(7.395f, 5.659f, 6.945f, 5.146f, 6.354f, 5.046f)
                lineTo(6.146f, 6.279f)
                close()
                moveTo(5.625f, 3.8f)
                verticalLineTo(5.662f)
                horizontalLineTo(6.875f)
                verticalLineTo(3.8f)
                horizontalLineTo(5.625f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFE31D1C)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 0f)
            horizontalLineTo(20f)
            verticalLineTo(15f)
            horizontalLineTo(10f)
            verticalLineTo(0f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun MaltaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Malta,
            contentDescription = "Malta Flag"
        )
    }
}
