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
 * Lebanon Flag (16x12dp)
 *
 * - ISO Alpha-2: LB
 * - ISO Alpha-3: LBN
 * - ISO Numeric: 422
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Lebanon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Lebanon:LB:LBN:422:Small",
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
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                close()
                moveTo(16f, 9f)
                horizontalLineTo(0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF52AB0B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.757f, 6.257f)
                curveTo(10.795f, 6.69f, 9.194f, 6.077f, 9.194f, 6.25f)
                curveTo(9.194f, 6.424f, 10.909f, 6.729f, 10.906f, 7.118f)
                curveTo(10.903f, 7.506f, 8.873f, 7.007f, 9.328f, 7.181f)
                curveTo(9.783f, 7.356f, 10.761f, 7.775f, 10.65f, 8.035f)
                curveTo(10.413f, 8.592f, 8.837f, 7.649f, 8.706f, 7.835f)
                curveTo(8.494f, 8.135f, 9.868f, 8.834f, 9.857f, 8.901f)
                curveTo(9.834f, 9.029f, 8.918f, 8.7f, 8.706f, 8.966f)
                curveTo(8.534f, 8.917f, 8.454f, 8.686f, 8.401f, 8.655f)
                lineTo(8.062f, 4.293f)
                curveTo(8.062f, 4.293f, 8.366f, 8.4f, 7.978f, 8.518f)
                curveTo(7.59f, 8.636f, 6.512f, 8.995f, 6.481f, 8.816f)
                curveTo(6.469f, 8.749f, 7.779f, 8.135f, 7.567f, 7.835f)
                curveTo(7.411f, 7.614f, 5.831f, 8.398f, 5.731f, 7.944f)
                curveTo(5.281f, 7.62f, 7.185f, 7.34f, 7.185f, 7.009f)
                curveTo(7.185f, 6.678f, 5.444f, 7.401f, 5.652f, 6.94f)
                curveTo(5.86f, 6.479f, 7.254f, 6.314f, 7.28f, 6.25f)
                curveTo(7.328f, 6.134f, 5.731f, 6.432f, 5.731f, 6.25f)
                curveTo(5.731f, 5.906f, 6.687f, 5.839f, 7.28f, 5.529f)
                curveTo(7.315f, 5.176f, 5.84f, 5.877f, 5.731f, 5.594f)
                curveTo(5.621f, 5.311f, 7.616f, 4.578f, 7.567f, 4.52f)
                curveTo(7.49f, 4.43f, 5.882f, 4.837f, 6.147f, 4.624f)
                curveTo(6.662f, 4.209f, 7.666f, 3.644f, 7.898f, 3.494f)
                curveTo(7.898f, 3.494f, 7.925f, 3.437f, 7.955f, 3.456f)
                curveTo(7.985f, 3.437f, 8.018f, 3.416f, 8.018f, 3.416f)
                curveTo(8.018f, 3.416f, 8.018f, 3.771f, 8.013f, 3.494f)
                curveTo(8.008f, 3.217f, 10.368f, 4.429f, 10.394f, 4.737f)
                curveTo(10.426f, 5.096f, 8.936f, 4.466f, 8.971f, 4.819f)
                curveTo(9.274f, 5.007f, 10.135f, 5.37f, 10.491f, 5.529f)
                curveTo(10.652f, 5.602f, 9.302f, 5.376f, 9.331f, 5.487f)
                curveTo(9.403f, 5.769f, 10.719f, 5.804f, 10.757f, 6.257f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LebanonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Lebanon,
            contentDescription = "Lebanon Flag"
        )
    }
}
