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
 * Brunei Flag (16x12dp)
 *
 * - ISO Alpha-2: BN
 * - ISO Alpha-3: BRN
 * - ISO Numeric: 096
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Brunei: ImageVector by lazy {
    ImageVector.Builder(
        name = "Brunei:BN:BRN:096:Small",
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
                fill = SolidColor(Color(0xFFFFD221)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF313131))) {
                moveTo(-1.534f, 5.308f)
                lineTo(-0.53f, 3.018f)
                lineTo(16.884f, 10.654f)
                lineTo(15.88f, 12.944f)
                lineTo(-1.534f, 5.308f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFAF9F9))) {
                moveTo(-1.509f, 2.785f)
                lineTo(-0.505f, 0.495f)
                lineTo(17.774f, 8.507f)
                lineTo(16.771f, 10.797f)
                lineTo(-1.509f, 2.785f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCF1225)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 1.444f)
                curveTo(7.724f, 1.444f, 7.5f, 1.668f, 7.5f, 1.944f)
                verticalLineTo(3.758f)
                curveTo(7.33f, 3.675f, 7.109f, 3.6f, 6.866f, 3.6f)
                curveTo(6.317f, 3.6f, 5.7f, 4.368f, 5.7f, 4.368f)
                curveTo(5.7f, 4.368f, 6.72f, 4.396f, 7.5f, 5.17f)
                verticalLineTo(7.944f)
                curveTo(6.637f, 7.715f, 6.266f, 6.837f, 6.364f, 5.041f)
                lineTo(4.866f, 4.959f)
                curveTo(4.709f, 7.843f, 5.775f, 9.505f, 8.021f, 9.505f)
                curveTo(10.256f, 9.505f, 11.358f, 7.858f, 11.283f, 4.981f)
                lineTo(9.784f, 5.019f)
                curveTo(9.831f, 6.853f, 9.413f, 7.743f, 8.5f, 7.955f)
                verticalLineTo(5.076f)
                curveTo(9.265f, 4.393f, 10.2f, 4.368f, 10.2f, 4.368f)
                curveTo(10.2f, 4.368f, 9.583f, 3.6f, 9.034f, 3.6f)
                curveTo(8.836f, 3.6f, 8.653f, 3.65f, 8.5f, 3.713f)
                verticalLineTo(1.944f)
                curveTo(8.5f, 1.668f, 8.276f, 1.444f, 8f, 1.444f)
                close()
                moveTo(2.91f, 5.492f)
                curveTo(2.638f, 5.442f, 2.458f, 5.182f, 2.508f, 4.91f)
                curveTo(2.558f, 4.638f, 2.818f, 4.458f, 3.09f, 4.508f)
                curveTo(4.089f, 4.691f, 4.632f, 5.386f, 4.632f, 6.449f)
                verticalLineTo(8.474f)
                curveTo(4.632f, 8.75f, 4.408f, 8.974f, 4.132f, 8.974f)
                curveTo(3.856f, 8.974f, 3.632f, 8.75f, 3.632f, 8.474f)
                verticalLineTo(6.449f)
                curveTo(3.632f, 5.856f, 3.42f, 5.585f, 2.91f, 5.492f)
                close()
                moveTo(13.524f, 4.91f)
                curveTo(13.573f, 5.182f, 13.394f, 5.442f, 13.122f, 5.492f)
                curveTo(12.612f, 5.585f, 12.4f, 5.856f, 12.4f, 6.449f)
                verticalLineTo(8.474f)
                curveTo(12.4f, 8.75f, 12.176f, 8.974f, 11.9f, 8.974f)
                curveTo(11.624f, 8.974f, 11.4f, 8.75f, 11.4f, 8.474f)
                verticalLineTo(6.449f)
                curveTo(11.4f, 5.386f, 11.943f, 4.691f, 12.942f, 4.508f)
                curveTo(13.214f, 4.458f, 13.474f, 4.638f, 13.524f, 4.91f)
                close()
                moveTo(4.871f, 9.22f)
                lineTo(5.697f, 8.657f)
                curveTo(6.16f, 9.336f, 6.908f, 9.677f, 8f, 9.677f)
                curveTo(9.099f, 9.677f, 9.793f, 9.412f, 10.133f, 8.919f)
                lineTo(10.956f, 9.487f)
                curveTo(10.399f, 10.293f, 9.397f, 10.677f, 8f, 10.677f)
                curveTo(6.596f, 10.677f, 5.533f, 10.193f, 4.871f, 9.22f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BruneiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Brunei,
            contentDescription = "Brunei Flag"
        )
    }
}
