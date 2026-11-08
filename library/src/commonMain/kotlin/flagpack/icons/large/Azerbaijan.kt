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
 * Azerbaijan Flag (32x24dp)
 *
 * - ISO Alpha-2: AZ
 * - ISO Alpha-3: AZE
 * - ISO Numeric: 031
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Azerbaijan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Azerbaijan:AZ:AZE:031:Large",
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
                fill = SolidColor(Color(0xFFAF0100)),
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
                fill = SolidColor(Color(0xFF3CA5D9)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.14f, 15.024f)
                curveTo(15.793f, 14.713f, 14.61f, 13.554f, 14.624f, 12f)
                curveTo(14.637f, 10.545f, 15.493f, 9.368f, 16.975f, 9.033f)
                curveTo(18.456f, 8.699f, 19.992f, 9.334f, 19.992f, 9.334f)
                curveTo(19.584f, 8.427f, 18.163f, 7.79f, 16.997f, 7.793f)
                curveTo(14.826f, 7.799f, 12.511f, 9.455f, 12.488f, 11.986f)
                curveTo(12.465f, 14.609f, 14.961f, 16.1f, 17.158f, 16.094f)
                curveTo(18.919f, 16.09f, 19.756f, 14.956f, 19.93f, 14.474f)
                curveTo(19.93f, 14.474f, 18.487f, 15.335f, 17.14f, 15.024f)
                close()
                moveTo(18.018f, 13.421f)
                lineTo(19.193f, 12.603f)
                lineTo(20.369f, 13.421f)
                lineTo(19.954f, 12.05f)
                lineTo(21.096f, 11.185f)
                lineTo(19.664f, 11.155f)
                lineTo(19.193f, 9.803f)
                lineTo(18.723f, 11.155f)
                lineTo(17.291f, 11.185f)
                lineTo(18.433f, 12.05f)
                lineTo(18.018f, 13.421f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AzerbaijanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Azerbaijan,
            contentDescription = "Azerbaijan Flag"
        )
    }
}
