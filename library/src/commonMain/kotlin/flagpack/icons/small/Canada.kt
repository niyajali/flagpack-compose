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
 * Canada Flag (16x12dp)
 *
 * - ISO Alpha-2: CA
 * - ISO Alpha-3: CAN
 * - ISO Numeric: 124
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Canada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Canada:CA:CAN:124:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12f)
                horizontalLineTo(4f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.164f, 4.201f)
                lineTo(7.987f, 3f)
                lineTo(8f, 10f)
                horizontalLineTo(7.657f)
                lineTo(7.868f, 8.268f)
                curveTo(7.868f, 8.268f, 5.562f, 8.691f, 5.752f, 8.478f)
                curveTo(5.943f, 8.264f, 6.053f, 7.872f, 6.053f, 7.872f)
                lineTo(4f, 6.474f)
                curveTo(4f, 6.474f, 4.324f, 6.47f, 4.587f, 6.31f)
                curveTo(4.851f, 6.15f, 4.324f, 5.201f, 4.324f, 5.201f)
                lineTo(5.36f, 5.355f)
                lineTo(5.752f, 4.92f)
                lineTo(6.534f, 5.756f)
                horizontalLineTo(6.886f)
                lineTo(6.534f, 3.842f)
                lineTo(7.164f, 4.201f)
                close()
                moveTo(8f, 10f)
                verticalLineTo(3f)
                lineTo(8.836f, 4.201f)
                lineTo(9.466f, 3.842f)
                lineTo(9.114f, 5.756f)
                horizontalLineTo(9.466f)
                lineTo(10.248f, 4.92f)
                lineTo(10.64f, 5.355f)
                lineTo(11.676f, 5.201f)
                curveTo(11.676f, 5.201f, 11.149f, 6.15f, 11.413f, 6.31f)
                curveTo(11.676f, 6.47f, 12f, 6.474f, 12f, 6.474f)
                lineTo(9.947f, 7.872f)
                curveTo(9.947f, 7.872f, 10.057f, 8.264f, 10.248f, 8.478f)
                curveTo(10.438f, 8.691f, 8.132f, 8.268f, 8.132f, 8.268f)
                lineTo(8.343f, 10f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun CanadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Canada,
            contentDescription = "Canada Flag"
        )
    }
}
