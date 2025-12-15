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
 * South Korea Flag (20x15dp)
 *
 * - ISO Alpha-2: KR
 * - ISO Alpha-3: KOR
 * - ISO Numeric: 410
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.SouthKorea: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Korea:KR:KOR:410:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 11.387f)
                curveTo(12.002f, 11.387f, 13.624f, 9.664f, 13.624f, 7.538f)
                curveTo(13.624f, 5.412f, 12.002f, 3.689f, 10f, 3.689f)
                curveTo(7.998f, 3.689f, 6.376f, 5.412f, 6.376f, 7.538f)
                curveTo(6.376f, 9.664f, 7.998f, 11.387f, 10f, 11.387f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 11.387f)
                curveTo(12.002f, 11.387f, 13.624f, 9.664f, 13.624f, 7.538f)
                curveTo(13.624f, 5.412f, 12.002f, 3.689f, 10f, 3.689f)
                curveTo(7.998f, 3.689f, 6.376f, 5.412f, 6.376f, 7.538f)
                curveTo(6.376f, 9.664f, 7.998f, 11.387f, 10f, 11.387f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.751f, 7.833f)
                curveTo(13.751f, 7.833f, 13.548f, 6.018f, 12.041f, 5.919f)
                curveTo(10.534f, 5.821f, 10.128f, 7.25f, 10.041f, 7.629f)
                curveTo(9.954f, 8.008f, 9.734f, 9.018f, 8.148f, 9.018f)
                curveTo(6.562f, 9.018f, 6.418f, 6.449f, 6.418f, 6.449f)
                verticalLineTo(3.42f)
                horizontalLineTo(13.751f)
                verticalLineTo(7.833f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.562f, 1.283f)
            lineTo(5.134f, 1.8f)
            lineTo(2.484f, 4.895f)
            lineTo(1.912f, 4.378f)
            lineTo(4.562f, 1.283f)
            close()
            moveTo(5.505f, 2.12f)
            lineTo(6.077f, 2.637f)
            lineTo(3.522f, 5.687f)
            lineTo(2.95f, 5.17f)
            lineTo(5.505f, 2.12f)
            close()
            moveTo(7.016f, 3.484f)
            lineTo(6.444f, 2.967f)
            lineTo(3.882f, 6.04f)
            lineTo(4.454f, 6.557f)
            lineTo(7.016f, 3.484f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.852f, 1.066f)
            lineTo(15.28f, 1.581f)
            lineTo(16.272f, 2.745f)
            lineTo(16.844f, 2.23f)
            lineTo(15.852f, 1.066f)
            close()
            moveTo(17.616f, 3.207f)
            lineTo(17.044f, 3.723f)
            lineTo(18.036f, 4.887f)
            lineTo(18.608f, 4.372f)
            lineTo(17.616f, 3.207f)
            close()
            moveTo(13.392f, 3.258f)
            lineTo(13.965f, 2.743f)
            lineTo(14.957f, 3.907f)
            lineTo(14.385f, 4.422f)
            lineTo(13.392f, 3.258f)
            close()
            moveTo(15.728f, 4.884f)
            lineTo(15.156f, 5.4f)
            lineTo(16.148f, 6.564f)
            lineTo(16.72f, 6.049f)
            lineTo(15.728f, 4.884f)
            close()
            moveTo(14.372f, 2.395f)
            lineTo(14.944f, 1.879f)
            lineTo(17.706f, 5.242f)
            lineTo(17.134f, 5.758f)
            lineTo(14.372f, 2.395f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(16.284f, 8.902f)
            lineTo(15.708f, 8.385f)
            lineTo(14.707f, 9.553f)
            lineTo(15.284f, 10.071f)
            lineTo(16.284f, 8.902f)
            close()
            moveTo(14.602f, 10.959f)
            lineTo(14.026f, 10.442f)
            lineTo(13.025f, 11.61f)
            lineTo(13.602f, 12.128f)
            lineTo(14.602f, 10.959f)
            close()
            moveTo(17.529f, 10.021f)
            lineTo(18.106f, 10.538f)
            lineTo(17.105f, 11.707f)
            lineTo(16.528f, 11.189f)
            lineTo(17.529f, 10.021f)
            close()
            moveTo(16.506f, 12.642f)
            lineTo(15.929f, 12.125f)
            lineTo(14.929f, 13.294f)
            lineTo(15.505f, 13.811f)
            lineTo(16.506f, 12.642f)
            close()
            moveTo(14.979f, 11.236f)
            lineTo(15.556f, 11.754f)
            lineTo(14.512f, 13.002f)
            lineTo(13.935f, 12.484f)
            lineTo(14.979f, 11.236f)
            close()
            moveTo(17.269f, 9.674f)
            lineTo(16.692f, 9.157f)
            lineTo(15.648f, 10.405f)
            lineTo(16.225f, 10.922f)
            lineTo(17.269f, 9.674f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.004f, 9.306f)
            lineTo(4.576f, 8.79f)
            lineTo(7.129f, 11.716f)
            lineTo(6.557f, 12.231f)
            lineTo(4.004f, 9.306f)
            close()
            moveTo(4.6f, 11.865f)
            lineTo(5.172f, 11.349f)
            lineTo(6.25f, 12.534f)
            lineTo(5.678f, 13.049f)
            lineTo(4.6f, 11.865f)
            close()
            moveTo(2.693f, 10.432f)
            lineTo(2.121f, 10.948f)
            lineTo(4.688f, 13.912f)
            lineTo(5.26f, 13.396f)
            lineTo(2.693f, 10.432f)
            close()
            moveTo(3.1f, 10.095f)
            lineTo(3.672f, 9.579f)
            lineTo(4.607f, 10.675f)
            lineTo(4.035f, 11.191f)
            lineTo(3.1f, 10.095f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthKoreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.SouthKorea,
            contentDescription = "South Korea Flag"
        )
    }
}
