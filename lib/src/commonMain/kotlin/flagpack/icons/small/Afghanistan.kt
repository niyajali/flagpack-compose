package flagpack.icons.small

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
 * Afghanistan Flag (16x12dp)
 *
 * - ISO Alpha-2: AF
 * - ISO Alpha-3: AFG
 * - ISO Numeric: 004
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Afghanistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Afghanistan:AF:AFG:004:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF67BD38)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD51700)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.05f)
                curveTo(5f, 7.734f, 6.366f, 9.1f, 8.05f, 9.1f)
                curveTo(9.734f, 9.1f, 11.1f, 7.734f, 11.1f, 6.05f)
                curveTo(11.1f, 5.357f, 10.869f, 4.718f, 10.48f, 4.206f)
                lineTo(10.037f, 5.544f)
                curveTo(10.078f, 5.706f, 10.1f, 5.875f, 10.1f, 6.05f)
                curveTo(10.1f, 6.712f, 9.787f, 7.3f, 9.3f, 7.675f)
                verticalLineTo(5.3f)
                horizontalLineTo(9f)
                curveTo(9f, 4.748f, 8.552f, 4.3f, 8f, 4.3f)
                curveTo(7.448f, 4.3f, 7f, 4.748f, 7f, 5.3f)
                horizontalLineTo(6.7f)
                verticalLineTo(7.593f)
                curveTo(6.271f, 7.217f, 6f, 6.665f, 6f, 6.05f)
                curveTo(6f, 5.915f, 6.013f, 5.783f, 6.038f, 5.656f)
                horizontalLineTo(6f)
                lineTo(5.629f, 4.194f)
                curveTo(5.235f, 4.708f, 5f, 5.352f, 5f, 6.05f)
                close()
                moveTo(7.7f, 6.254f)
                verticalLineTo(8.07f)
                curveTo(7.814f, 8.09f, 7.931f, 8.1f, 8.05f, 8.1f)
                curveTo(8.135f, 8.1f, 8.218f, 8.095f, 8.3f, 8.085f)
                verticalLineTo(6.254f)
                curveTo(8.205f, 6.284f, 8.105f, 6.3f, 8f, 6.3f)
                curveTo(7.895f, 6.3f, 7.795f, 6.284f, 7.7f, 6.254f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AfghanistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Afghanistan,
            contentDescription = "Afghanistan Flag"
        )
    }
}
