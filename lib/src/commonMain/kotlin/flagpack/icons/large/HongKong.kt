package flagpack.icons.large

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
 * Hong Kong Flag (32x24dp)
 *
 * - ISO Alpha-2: HK
 * - ISO Alpha-3: HKG
 * - ISO Numeric: 344
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.HongKong: ImageVector by lazy {
    ImageVector.Builder(
        name = "Hong Kong:HK:HKG:344:Large",
        defaultWidth = 32.dp,
        defaultHeight = 24.dp,
        viewportWidth = 32f,
        viewportHeight = 24f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.87f, 11.575f)
                curveTo(15.87f, 11.575f, 10.08f, 6.411f, 16.989f, 3.403f)
                curveTo(16.989f, 3.403f, 18.998f, 5.62f, 17.491f, 8.108f)
                curveTo(16.996f, 8.924f, 16.579f, 9.507f, 16.266f, 9.945f)
                curveTo(15.623f, 10.842f, 15.416f, 11.132f, 15.87f, 11.575f)
                close()
                moveTo(7.325f, 7.868f)
                curveTo(6.927f, 15.392f, 14.134f, 12.522f, 14.134f, 12.522f)
                curveTo(13.536f, 12.729f, 13.369f, 12.415f, 12.854f, 11.439f)
                lineTo(12.854f, 11.439f)
                curveTo(12.602f, 10.963f, 12.267f, 10.33f, 11.758f, 9.522f)
                curveTo(10.206f, 7.061f, 7.325f, 7.868f, 7.325f, 7.868f)
                close()
                moveTo(18.238f, 11.827f)
                curveTo(18.238f, 11.827f, 25.67f, 14.052f, 20.686f, 19.704f)
                curveTo(20.686f, 19.704f, 17.927f, 18.546f, 18.238f, 15.654f)
                curveTo(18.34f, 14.706f, 18.471f, 14.001f, 18.57f, 13.472f)
                curveTo(18.771f, 12.387f, 18.836f, 12.036f, 18.238f, 11.827f)
                close()
                moveTo(16.285f, 13.562f)
                curveTo(16.285f, 13.562f, 17.617f, 21.204f, 10.334f, 19.273f)
                curveTo(10.334f, 19.273f, 10.135f, 16.287f, 12.862f, 15.273f)
                curveTo(13.756f, 14.94f, 14.445f, 14.742f, 14.962f, 14.593f)
                lineTo(14.962f, 14.593f)
                lineTo(14.963f, 14.593f)
                lineTo(14.963f, 14.593f)
                curveTo(16.023f, 14.288f, 16.365f, 14.19f, 16.285f, 13.562f)
                close()
                moveTo(25.479f, 10.275f)
                curveTo(20.923f, 4.273f, 17.274f, 11.118f, 17.274f, 11.118f)
                curveTo(17.597f, 10.574f, 17.927f, 10.707f, 18.95f, 11.118f)
                curveTo(19.45f, 11.319f, 20.115f, 11.587f, 21.025f, 11.875f)
                curveTo(23.799f, 12.751f, 25.479f, 10.275f, 25.479f, 10.275f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA1A1A))) {
                moveTo(9.95f, 10.342f)
                lineTo(10.372f, 10.074f)
                curveTo(11.299f, 11.532f, 12.501f, 12.249f, 14.001f, 12.249f)
                verticalLineTo(12.749f)
                curveTo(12.323f, 12.749f, 10.965f, 11.939f, 9.95f, 10.342f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.75f, 10.75f)
                curveTo(22.164f, 10.75f, 22.5f, 10.414f, 22.5f, 10f)
                curveTo(22.5f, 9.586f, 22.164f, 9.25f, 21.75f, 9.25f)
                curveTo(21.336f, 9.25f, 21f, 9.586f, 21f, 10f)
                curveTo(21f, 10.414f, 21.336f, 10.75f, 21.75f, 10.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.959f, 15.728f)
                curveTo(20.373f, 15.728f, 20.709f, 15.392f, 20.709f, 14.978f)
                curveTo(20.709f, 14.564f, 20.373f, 14.228f, 19.959f, 14.228f)
                curveTo(19.544f, 14.228f, 19.209f, 14.564f, 19.209f, 14.978f)
                curveTo(19.209f, 15.392f, 19.544f, 15.728f, 19.959f, 15.728f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.959f, 17.728f)
                curveTo(14.373f, 17.728f, 14.709f, 17.392f, 14.709f, 16.978f)
                curveTo(14.709f, 16.564f, 14.373f, 16.228f, 13.959f, 16.228f)
                curveTo(13.544f, 16.228f, 13.209f, 16.564f, 13.209f, 16.978f)
                curveTo(13.209f, 17.392f, 13.544f, 17.728f, 13.959f, 17.728f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.959f, 10.728f)
                curveTo(10.373f, 10.728f, 10.709f, 10.392f, 10.709f, 9.978f)
                curveTo(10.709f, 9.564f, 10.373f, 9.228f, 9.959f, 9.228f)
                curveTo(9.544f, 9.228f, 9.209f, 9.564f, 9.209f, 9.978f)
                curveTo(9.209f, 10.392f, 9.544f, 10.728f, 9.959f, 10.728f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEA1A1A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.959f, 7.728f)
                curveTo(16.373f, 7.728f, 16.709f, 7.392f, 16.709f, 6.978f)
                curveTo(16.709f, 6.564f, 16.373f, 6.228f, 15.959f, 6.228f)
                curveTo(15.544f, 6.228f, 15.209f, 6.564f, 15.209f, 6.978f)
                curveTo(15.209f, 7.392f, 15.544f, 7.728f, 15.959f, 7.728f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA1A1A))) {
                moveTo(15.635f, 7.053f)
                lineTo(16.074f, 7.291f)
                curveTo(15.241f, 8.827f, 15.183f, 10.244f, 15.888f, 11.57f)
                lineTo(15.446f, 11.804f)
                curveTo(14.659f, 10.324f, 14.725f, 8.73f, 15.635f, 7.053f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA1A1A))) {
                moveTo(22.015f, 9.686f)
                lineTo(21.94f, 10.18f)
                curveTo(19.984f, 9.884f, 18.52f, 10.296f, 17.518f, 11.41f)
                lineTo(17.146f, 11.075f)
                curveTo(18.271f, 9.826f, 19.904f, 9.366f, 22.015f, 9.686f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA1A1A))) {
                moveTo(20.351f, 15.365f)
                lineTo(19.861f, 15.464f)
                curveTo(19.471f, 13.524f, 18.582f, 12.29f, 17.193f, 11.729f)
                lineTo(17.381f, 11.265f)
                curveTo(18.939f, 11.894f, 19.93f, 13.272f, 20.351f, 15.365f)
                close()
            }
            path(fill = SolidColor(Color(0xFFEA1A1A))) {
                moveTo(13.906f, 17.15f)
                lineTo(13.646f, 16.723f)
                curveTo(15.335f, 15.693f, 16.191f, 14.436f, 16.243f, 12.939f)
                lineTo(16.743f, 12.956f)
                curveTo(16.684f, 14.636f, 15.729f, 16.038f, 13.906f, 17.15f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HongKongPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.HongKong,
            contentDescription = "Hong Kong Flag"
        )
    }
}
