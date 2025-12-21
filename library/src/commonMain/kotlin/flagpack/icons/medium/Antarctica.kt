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
 * Antarctica Flag (20x15dp)
 *
 * - ISO Alpha-2: AQ
 * - ISO Alpha-3: ATA
 * - ISO Numeric: 010
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Antarctica: ImageVector by lazy {
    ImageVector.Builder(
        name = "Antarctica:AQ:ATA:010:Medium",
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
                fill = SolidColor(Color(0xFF5196ED)),
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
                moveTo(5.448f, 4.934f)
                curveTo(5.448f, 4.934f, 6.738f, 5.641f, 6.918f, 5.837f)
                curveTo(7.097f, 6.033f, 7.385f, 6.752f, 7.833f, 6.345f)
                curveTo(8.281f, 5.939f, 8.73f, 6.255f, 8.73f, 5.607f)
                curveTo(8.73f, 4.96f, 9.399f, 3.458f, 10.37f, 3.834f)
                curveTo(11.342f, 4.21f, 12.14f, 3.975f, 12.365f, 4.125f)
                curveTo(12.589f, 4.276f, 13.127f, 5.024f, 13.545f, 5.024f)
                curveTo(13.964f, 5.024f, 14.173f, 5.46f, 14.203f, 6.093f)
                curveTo(14.233f, 6.726f, 14.068f, 6.786f, 14.457f, 6.861f)
                curveTo(14.845f, 6.937f, 14.995f, 7.223f, 14.801f, 7.599f)
                curveTo(14.606f, 7.976f, 14.621f, 7.81f, 14.651f, 8.202f)
                curveTo(14.681f, 8.593f, 14.263f, 10.903f, 12.977f, 11.129f)
                curveTo(11.692f, 11.354f, 10.474f, 11.234f, 10.802f, 10.797f)
                curveTo(11.131f, 10.361f, 11.586f, 9.858f, 10.914f, 9.752f)
                curveTo(10.241f, 9.647f, 9.817f, 9.557f, 9.145f, 9.738f)
                curveTo(8.472f, 9.919f, 7.77f, 10.205f, 7.351f, 9.663f)
                curveTo(6.933f, 9.12f, 7.023f, 8.729f, 6.679f, 8.473f)
                curveTo(6.335f, 8.217f, 5.916f, 8.262f, 6.26f, 7.765f)
                curveTo(6.604f, 7.268f, 6.888f, 7.453f, 6.604f, 7.062f)
                curveTo(6.32f, 6.67f, 5.248f, 6.5f, 5.248f, 6.108f)
                curveTo(5.248f, 5.717f, 4.567f, 4.858f, 5.448f, 4.934f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5F8FB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.448f, 4.934f)
                curveTo(5.448f, 4.934f, 6.738f, 5.641f, 6.918f, 5.837f)
                curveTo(7.097f, 6.033f, 7.385f, 6.752f, 7.833f, 6.345f)
                curveTo(8.281f, 5.939f, 8.73f, 6.255f, 8.73f, 5.607f)
                curveTo(8.73f, 4.96f, 9.399f, 3.458f, 10.37f, 3.834f)
                curveTo(11.342f, 4.21f, 12.14f, 3.975f, 12.365f, 4.125f)
                curveTo(12.589f, 4.276f, 13.127f, 5.024f, 13.545f, 5.024f)
                curveTo(13.964f, 5.024f, 14.173f, 5.46f, 14.203f, 6.093f)
                curveTo(14.233f, 6.726f, 14.068f, 6.786f, 14.457f, 6.861f)
                curveTo(14.845f, 6.937f, 14.995f, 7.223f, 14.801f, 7.599f)
                curveTo(14.606f, 7.976f, 14.621f, 7.81f, 14.651f, 8.202f)
                curveTo(14.681f, 8.593f, 14.263f, 10.903f, 12.977f, 11.129f)
                curveTo(11.692f, 11.354f, 10.474f, 11.234f, 10.802f, 10.797f)
                curveTo(11.131f, 10.361f, 11.586f, 9.858f, 10.914f, 9.752f)
                curveTo(10.241f, 9.647f, 9.817f, 9.557f, 9.145f, 9.738f)
                curveTo(8.472f, 9.919f, 7.77f, 10.205f, 7.351f, 9.663f)
                curveTo(6.933f, 9.12f, 7.023f, 8.729f, 6.679f, 8.473f)
                curveTo(6.335f, 8.217f, 5.916f, 8.262f, 6.26f, 7.765f)
                curveTo(6.604f, 7.268f, 6.888f, 7.453f, 6.604f, 7.062f)
                curveTo(6.32f, 6.67f, 5.248f, 6.5f, 5.248f, 6.108f)
                curveTo(5.248f, 5.717f, 4.567f, 4.858f, 5.448f, 4.934f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AntarcticaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Antarctica,
            contentDescription = "Antarctica Flag"
        )
    }
}
