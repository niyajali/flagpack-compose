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
 * Kenya Flag (32x24dp)
 *
 * - ISO Alpha-2: KE
 * - ISO Alpha-3: KEN
 * - ISO Numeric: 404
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Kenya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kenya:KE:KEN:404:Large",
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
                fill = SolidColor(Color(0xFF0067C3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
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
                fill = SolidColor(Color(0xFF4E8B1D)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 2f
            ) {
                moveTo(0f, 7f)
                horizontalLineTo(-1f)
                verticalLineTo(8f)
                verticalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(0f)
                horizontalLineTo(32f)
                horizontalLineTo(33f)
                verticalLineTo(16f)
                verticalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(32f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAC2317))) {
                moveTo(12f, 12f)
                arcToRelative(4f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 8f, 0f)
                arcToRelative(4f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8f, 0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(19.623f, 4.03f)
                curveTo(19.852f, 3.62f, 20.466f, 3.171f, 21.465f, 2.685f)
                curveTo(21.5f, 2.668f, 21.541f, 2.667f, 21.576f, 2.682f)
                curveTo(21.636f, 2.708f, 21.661f, 2.771f, 21.632f, 2.823f)
                lineTo(11.274f, 21.452f)
                lineTo(10.735f, 21.221f)
                lineTo(19.865f, 4.8f)
                curveTo(19.451f, 4.741f, 19.371f, 4.485f, 19.623f, 4.03f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.366f, 4.03f)
                curveTo(12.618f, 4.485f, 12.538f, 4.741f, 12.124f, 4.8f)
                lineTo(21.254f, 21.221f)
                lineTo(20.715f, 21.452f)
                lineTo(10.357f, 2.823f)
                curveTo(10.328f, 2.771f, 10.353f, 2.708f, 10.413f, 2.682f)
                curveTo(10.448f, 2.667f, 10.489f, 2.668f, 10.524f, 2.685f)
                curveTo(11.523f, 3.171f, 12.137f, 3.62f, 12.366f, 4.03f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.385f, 16.265f)
                curveTo(19.774f, 15.031f, 20f, 13.568f, 20f, 12f)
                curveTo(20f, 10.432f, 19.774f, 8.969f, 19.385f, 7.735f)
                curveTo(18.508f, 8.969f, 18f, 10.432f, 18f, 12f)
                curveTo(18f, 13.568f, 18.508f, 15.031f, 19.385f, 16.265f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.615f, 7.735f)
                curveTo(12.226f, 8.969f, 12f, 10.432f, 12f, 12f)
                curveTo(12f, 13.568f, 12.226f, 15.031f, 12.615f, 16.265f)
                curveTo(13.492f, 15.031f, 14f, 13.568f, 14f, 12f)
                curveTo(14f, 10.432f, 13.492f, 8.969f, 12.615f, 7.735f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.24f, 11.4f)
                curveTo(16.788f, 11.059f, 17.2f, 9.572f, 17.2f, 7.789f)
                curveTo(17.2f, 6.007f, 16.788f, 4.52f, 16.24f, 4.179f)
                verticalLineTo(11.4f)
                close()
                moveTo(15.64f, 11.305f)
                curveTo(15.153f, 10.835f, 14.8f, 9.439f, 14.8f, 7.789f)
                curveTo(14.8f, 6.14f, 15.153f, 4.743f, 15.64f, 4.274f)
                verticalLineTo(11.305f)
                close()
                moveTo(15.64f, 12.8f)
                verticalLineTo(19.831f)
                curveTo(15.153f, 19.362f, 14.8f, 17.965f, 14.8f, 16.316f)
                curveTo(14.8f, 14.666f, 15.153f, 13.27f, 15.64f, 12.8f)
                close()
                moveTo(15.998f, 20f)
                curveTo(15.999f, 20f, 16f, 20f, 16f, 20f)
                curveTo(16.001f, 20f, 16.001f, 20f, 16.002f, 20f)
                horizontalLineTo(15.998f)
                close()
                moveTo(16.24f, 19.926f)
                verticalLineTo(12.705f)
                curveTo(16.788f, 13.047f, 17.2f, 14.533f, 17.2f, 16.316f)
                curveTo(17.2f, 18.098f, 16.788f, 19.585f, 16.24f, 19.926f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(16f, 11.474f)
                curveTo(16.663f, 11.474f, 17.2f, 11.945f, 17.2f, 12.526f)
                curveTo(17.2f, 13.108f, 16.663f, 13.579f, 16f, 13.579f)
                curveTo(15.337f, 13.579f, 14.8f, 13.108f, 14.8f, 12.526f)
                curveTo(14.8f, 11.945f, 15.337f, 11.474f, 16f, 11.474f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun KenyaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Kenya,
            contentDescription = "Kenya Flag"
        )
    }
}
