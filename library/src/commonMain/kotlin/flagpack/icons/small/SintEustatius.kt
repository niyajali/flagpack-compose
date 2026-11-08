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
 * Sint Eustatius Flag (16x12dp)
 *
 * - ISO Alpha-2: BQ-SE
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.SintEustatius: ImageVector by lazy {
    ImageVector.Builder(
        name = "Sint Eustatius:BQ-SE:::Small",
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
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 1f
            ) {
                moveTo(0.5f, 0.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(7.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(0f, 6.5f)
                lineToRelative(0f, -1f)
                lineToRelative(16f, -0f)
                lineToRelative(0f, 1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF059334))) {
                moveTo(4.823f, 7.8f)
                curveTo(5.002f, 7.8f, 13.75f, 7.8f, 13.75f, 7.8f)
                lineTo(12.806f, 6.843f)
                curveTo(12.806f, 6.843f, 10.918f, 4.95f, 10.797f, 4.864f)
                curveTo(10.676f, 4.777f, 10.475f, 4.739f, 10.247f, 5.015f)
                curveTo(10.018f, 5.291f, 9.887f, 4.864f, 9.697f, 4.864f)
                curveTo(9.507f, 4.864f, 9.427f, 4.864f, 9.151f, 5.217f)
                curveTo(8.875f, 5.571f, 7.882f, 6.843f, 7.882f, 6.843f)
                horizontalLineTo(6.422f)
                curveTo(6.422f, 6.843f, 6.175f, 6.634f, 6.035f, 6.708f)
                curveTo(5.895f, 6.783f, 5.104f, 5.884f, 4.823f, 5.817f)
                curveTo(4.541f, 5.75f, 4.356f, 6.06f, 4.356f, 6.308f)
                curveTo(4.356f, 6.555f, 4.223f, 6.081f, 3.954f, 6.22f)
                curveTo(3.684f, 6.359f, 3.771f, 6.708f, 3.771f, 6.708f)
                curveTo(3.771f, 6.708f, 4.643f, 7.8f, 4.823f, 7.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.003f, 5.534f)
                lineTo(6.386f, 6f)
                lineTo(6.612f, 5.23f)
                lineTo(6f, 4.759f)
                horizontalLineTo(6.763f)
                lineTo(7.003f, 4f)
                lineTo(7.258f, 4.759f)
                horizontalLineTo(8f)
                lineTo(7.393f, 5.23f)
                lineTo(7.624f, 6f)
                lineTo(7.003f, 5.534f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SintEustatiusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.SintEustatius,
            contentDescription = "Sint Eustatius Flag"
        )
    }
}
