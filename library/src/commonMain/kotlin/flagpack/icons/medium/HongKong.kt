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
 * Hong Kong Flag (20x15dp)
 *
 * - ISO Alpha-2: HK
 * - ISO Alpha-3: HKG
 * - ISO Numeric: 344
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.HongKong: ImageVector by lazy {
    ImageVector.Builder(
        name = "Hong Kong:HK:HKG:344:Medium",
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
                fill = SolidColor(Color(0xFFEA1A1A)),
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.918f, 7.234f)
                curveTo(9.918f, 7.234f, 6.3f, 4.007f, 10.618f, 2.127f)
                curveTo(10.618f, 2.127f, 11.874f, 3.512f, 10.932f, 5.068f)
                curveTo(10.623f, 5.578f, 10.362f, 5.942f, 10.166f, 6.216f)
                curveTo(9.765f, 6.777f, 9.635f, 6.957f, 9.918f, 7.234f)
                close()
                moveTo(4.578f, 4.917f)
                curveTo(4.329f, 9.62f, 8.834f, 7.826f, 8.834f, 7.826f)
                curveTo(8.46f, 7.956f, 8.356f, 7.759f, 8.034f, 7.15f)
                curveTo(7.876f, 6.852f, 7.667f, 6.456f, 7.349f, 5.951f)
                curveTo(6.379f, 4.413f, 4.578f, 4.917f, 4.578f, 4.917f)
                close()
                moveTo(11.399f, 7.392f)
                curveTo(11.399f, 7.392f, 16.044f, 8.782f, 12.929f, 12.315f)
                curveTo(12.929f, 12.315f, 11.204f, 11.592f, 11.399f, 9.784f)
                curveTo(11.463f, 9.191f, 11.545f, 8.751f, 11.606f, 8.42f)
                lineTo(11.606f, 8.42f)
                lineTo(11.606f, 8.42f)
                curveTo(11.732f, 7.742f, 11.773f, 7.523f, 11.399f, 7.392f)
                close()
                moveTo(10.178f, 8.476f)
                curveTo(10.178f, 8.476f, 11.011f, 13.252f, 6.459f, 12.045f)
                curveTo(6.459f, 12.045f, 6.335f, 10.18f, 8.039f, 9.546f)
                curveTo(8.598f, 9.337f, 9.028f, 9.214f, 9.352f, 9.121f)
                curveTo(10.014f, 8.93f, 10.228f, 8.869f, 10.178f, 8.476f)
                close()
                moveTo(15.924f, 6.422f)
                curveTo(13.077f, 2.671f, 10.796f, 6.949f, 10.796f, 6.949f)
                curveTo(10.998f, 6.609f, 11.205f, 6.692f, 11.844f, 6.949f)
                curveTo(12.156f, 7.075f, 12.572f, 7.242f, 13.141f, 7.422f)
                curveTo(14.875f, 7.97f, 15.924f, 6.422f, 15.924f, 6.422f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(6.351f, 6.38f)
                curveTo(6.351f, 6.38f, 7.261f, 7.812f, 8.751f, 7.812f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.913f, 4.406f)
                curveTo(9.913f, 4.406f, 9.096f, 5.913f, 9.796f, 7.228f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(13.819f, 6.101f)
                curveTo(13.819f, 6.101f, 11.912f, 5.812f, 10.915f, 6.919f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(12.705f, 9.591f)
                curveTo(12.705f, 9.591f, 12.325f, 7.7f, 10.943f, 7.142f)
            }
            path(
                stroke = SolidColor(Color(0xFFEA1A1A)),
                strokeLineWidth = 0.625f
            ) {
                moveTo(8.708f, 10.617f)
                curveTo(8.708f, 10.617f, 10.354f, 9.613f, 10.406f, 8.123f)
            }
        }
    }.build()
}

@Preview
@Composable
private fun HongKongPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.HongKong,
            contentDescription = "Hong Kong Flag"
        )
    }
}
