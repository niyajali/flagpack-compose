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
 * Turkey Flag (20x15dp)
 *
 * - ISO Alpha-2: TR
 * - ISO Alpha-3: TUR
 * - ISO Numeric: 792
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Turkey: ImageVector by lazy {
    ImageVector.Builder(
        name = "Turkey:TR:TUR:792:Medium",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                moveTo(10.016f, 10.071f)
                curveTo(8.678f, 9.741f, 7.629f, 8.621f, 7.642f, 6.979f)
                curveTo(7.653f, 5.442f, 8.584f, 4.143f, 10.055f, 3.791f)
                curveTo(11.526f, 3.439f, 12.821f, 4.186f, 12.821f, 4.186f)
                curveTo(12.415f, 3.226f, 11.002f, 2.552f, 9.844f, 2.553f)
                curveTo(7.688f, 2.557f, 5.39f, 4.305f, 5.37f, 6.979f)
                curveTo(5.35f, 9.751f, 7.831f, 11.329f, 10.014f, 11.326f)
                curveTo(11.763f, 11.323f, 12.593f, 10.126f, 12.765f, 9.617f)
                curveTo(12.765f, 9.617f, 11.354f, 10.401f, 10.016f, 10.071f)
                close()
                moveTo(13.065f, 6.454f)
                lineTo(11.731f, 6.944f)
                lineTo(13.236f, 7.475f)
                lineTo(13.21f, 9.061f)
                lineTo(14.201f, 7.871f)
                lineTo(15.839f, 7.99f)
                lineTo(14.541f, 6.874f)
                lineTo(15.393f, 5.684f)
                lineTo(14.006f, 6.151f)
                lineTo(13.014f, 5.049f)
                lineTo(13.065f, 6.454f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TurkeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Turkey,
            contentDescription = "Turkey Flag"
        )
    }
}
