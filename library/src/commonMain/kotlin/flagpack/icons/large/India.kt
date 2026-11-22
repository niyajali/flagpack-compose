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
 * India Flag (32x24dp)
 *
 * - ISO Alpha-2: IN
 * - ISO Alpha-3: IND
 * - ISO Numeric: 356
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.India: ImageVector by lazy {
    ImageVector.Builder(
        name = "India:IN:IND:356:Large",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFFF8C1A)),
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
                fill = SolidColor(Color(0xFF5EAA22)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 12f)
                curveTo(12f, 14.209f, 13.791f, 16f, 16f, 16f)
                curveTo(18.209f, 16f, 20f, 14.209f, 20f, 12f)
                curveTo(20f, 9.791f, 18.209f, 8f, 16f, 8f)
                curveTo(13.791f, 8f, 12f, 9.791f, 12f, 12f)
                close()
                moveTo(19f, 12f)
                curveTo(19f, 13.657f, 17.657f, 15f, 16f, 15f)
                curveTo(14.343f, 15f, 13f, 13.657f, 13f, 12f)
                curveTo(13f, 10.343f, 14.343f, 9f, 16f, 9f)
                curveTo(17.657f, 9f, 19f, 10.343f, 19f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.995f, 12.861f)
                lineTo(15.424f, 15.981f)
                lineTo(15.755f, 12.826f)
                lineTo(14.328f, 15.66f)
                lineTo(15.535f, 12.726f)
                lineTo(13.368f, 15.042f)
                lineTo(15.352f, 12.568f)
                lineTo(12.62f, 14.18f)
                lineTo(15.222f, 12.364f)
                lineTo(12.146f, 13.141f)
                lineTo(15.153f, 12.132f)
                lineTo(11.983f, 12.011f)
                lineTo(15.153f, 11.89f)
                lineTo(12.146f, 10.881f)
                lineTo(15.222f, 11.658f)
                lineTo(12.62f, 9.843f)
                lineTo(15.352f, 11.455f)
                lineTo(13.368f, 8.98f)
                lineTo(15.535f, 11.296f)
                lineTo(14.328f, 8.362f)
                lineTo(15.755f, 11.196f)
                lineTo(15.424f, 8.041f)
                lineTo(15.995f, 11.161f)
                lineTo(16.565f, 8.041f)
                lineTo(16.234f, 11.196f)
                lineTo(17.661f, 8.362f)
                lineTo(16.454f, 11.296f)
                lineTo(18.621f, 8.98f)
                lineTo(16.637f, 11.455f)
                lineTo(19.369f, 9.843f)
                lineTo(16.767f, 11.658f)
                lineTo(19.843f, 10.881f)
                lineTo(16.836f, 11.89f)
                lineTo(20.006f, 12.011f)
                lineTo(16.836f, 12.132f)
                lineTo(19.843f, 13.141f)
                lineTo(16.767f, 12.364f)
                lineTo(19.369f, 14.18f)
                lineTo(16.637f, 12.568f)
                lineTo(18.621f, 15.042f)
                lineTo(16.454f, 12.726f)
                lineTo(17.661f, 15.66f)
                lineTo(16.234f, 12.826f)
                lineTo(16.565f, 15.981f)
                lineTo(15.995f, 12.861f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IndiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.India,
            contentDescription = "India Flag"
        )
    }
}
