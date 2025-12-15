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
 * Venezuela Flag (20x15dp)
 *
 * - ISO Alpha-2: VE
 * - ISO Alpha-3: VEN
 * - ISO Numeric: 862
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Venezuela: ImageVector by lazy {
    ImageVector.Builder(
        name = "Venezuela:VE:VEN:862:Medium",
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
            path(
                fill = SolidColor(Color(0xFFFECA00)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.96f, 7.412f)
                lineTo(8.575f, 7.064f)
                lineTo(9.264f, 7.412f)
                lineTo(9.016f, 6.704f)
                lineTo(9.531f, 6.184f)
                horizontalLineTo(8.876f)
                lineTo(8.574f, 5.513f)
                lineTo(8.316f, 6.184f)
                horizontalLineTo(7.548f)
                lineTo(8.125f, 6.695f)
                horizontalLineTo(7.477f)
                lineTo(7.175f, 6.025f)
                lineTo(6.917f, 6.695f)
                horizontalLineTo(6.149f)
                lineTo(6.737f, 7.215f)
                lineTo(6.625f, 7.669f)
                horizontalLineTo(6.135f)
                lineTo(5.832f, 6.999f)
                lineTo(5.575f, 7.669f)
                horizontalLineTo(4.806f)
                lineTo(5.394f, 8.189f)
                lineTo(5.286f, 8.629f)
                horizontalLineTo(5.071f)
                lineTo(4.769f, 7.959f)
                lineTo(4.511f, 8.629f)
                horizontalLineTo(3.743f)
                lineTo(4.331f, 9.149f)
                lineTo(4.155f, 9.857f)
                lineTo(4.77f, 9.509f)
                lineTo(5.459f, 9.857f)
                lineTo(5.211f, 9.149f)
                lineTo(5.726f, 8.629f)
                horizontalLineTo(5.693f)
                lineTo(5.833f, 8.549f)
                lineTo(6.522f, 8.898f)
                lineTo(6.275f, 8.189f)
                lineTo(6.57f, 7.891f)
                lineTo(6.562f, 7.923f)
                lineTo(7.176f, 7.575f)
                lineTo(7.865f, 7.923f)
                lineTo(7.618f, 7.215f)
                lineTo(8.129f, 6.698f)
                lineTo(8.136f, 6.704f)
                lineTo(7.96f, 7.412f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.014f, 7.385f)
                lineTo(11.4f, 7.036f)
                lineTo(10.711f, 7.385f)
                lineTo(10.958f, 6.677f)
                lineTo(10.444f, 6.156f)
                horizontalLineTo(11.099f)
                lineTo(11.401f, 5.486f)
                lineTo(11.659f, 6.156f)
                horizontalLineTo(12.427f)
                lineTo(11.849f, 6.667f)
                horizontalLineTo(12.5f)
                lineTo(12.803f, 5.997f)
                lineTo(13.06f, 6.667f)
                horizontalLineTo(13.829f)
                lineTo(13.241f, 7.188f)
                lineTo(13.353f, 7.642f)
                horizontalLineTo(13.843f)
                lineTo(14.146f, 6.971f)
                lineTo(14.403f, 7.642f)
                horizontalLineTo(15.172f)
                lineTo(14.583f, 8.162f)
                lineTo(14.692f, 8.601f)
                horizontalLineTo(14.907f)
                lineTo(15.209f, 7.931f)
                lineTo(15.467f, 8.601f)
                horizontalLineTo(16.235f)
                lineTo(15.647f, 9.122f)
                lineTo(15.822f, 9.83f)
                lineTo(15.208f, 9.481f)
                lineTo(14.519f, 9.83f)
                lineTo(14.767f, 9.122f)
                lineTo(14.252f, 8.601f)
                horizontalLineTo(14.285f)
                lineTo(14.145f, 8.522f)
                lineTo(13.455f, 8.87f)
                lineTo(13.703f, 8.162f)
                lineTo(13.408f, 7.864f)
                lineTo(13.416f, 7.896f)
                lineTo(12.802f, 7.547f)
                lineTo(12.113f, 7.896f)
                lineTo(12.36f, 7.188f)
                lineTo(11.847f, 6.669f)
                lineTo(11.839f, 6.677f)
                lineTo(12.014f, 7.385f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.896f, 6.584f)
                lineTo(9.281f, 6.933f)
                lineTo(9.457f, 6.224f)
                lineTo(8.868f, 5.704f)
                horizontalLineTo(9.637f)
                lineTo(9.895f, 5.034f)
                lineTo(10.197f, 5.704f)
                horizontalLineTo(10.852f)
                lineTo(10.337f, 6.224f)
                lineTo(10.585f, 6.933f)
                lineTo(9.896f, 6.584f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun VenezuelaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Venezuela,
            contentDescription = "Venezuela Flag"
        )
    }
}
