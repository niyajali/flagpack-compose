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
 * Kenya Flag (20x15dp)
 *
 * - ISO Alpha-2: KE
 * - ISO Alpha-3: KEN
 * - ISO Numeric: 404
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Kenya: ImageVector by lazy {
    ImageVector.Builder(
        name = "Kenya:KE:KEN:404:Medium",
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
                fill = SolidColor(Color(0xFF0067C3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
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
                fill = SolidColor(Color(0xFF4E8B1D)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFF7FCFF)),
                strokeLineWidth = 1.25f
            ) {
                moveTo(0f, 4.375f)
                horizontalLineTo(-0.625f)
                verticalLineTo(5f)
                verticalLineTo(10f)
                verticalLineTo(10.625f)
                horizontalLineTo(0f)
                horizontalLineTo(20f)
                horizontalLineTo(20.625f)
                verticalLineTo(10f)
                verticalLineTo(5f)
                verticalLineTo(4.375f)
                horizontalLineTo(20f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAC2317))) {
                moveTo(7.5f, 7.5f)
                arcToRelative(2.5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5f, 0f)
                arcToRelative(2.5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(12.265f, 2.519f)
                curveTo(12.407f, 2.262f, 12.791f, 1.982f, 13.416f, 1.678f)
                curveTo(13.437f, 1.668f, 13.463f, 1.667f, 13.485f, 1.676f)
                curveTo(13.523f, 1.692f, 13.538f, 1.732f, 13.52f, 1.765f)
                lineTo(7.046f, 13.407f)
                lineTo(6.709f, 13.263f)
                lineTo(12.415f, 3f)
                curveTo(12.157f, 2.963f, 12.107f, 2.803f, 12.265f, 2.519f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(7.728f, 2.519f)
                curveTo(7.886f, 2.803f, 7.836f, 2.963f, 7.578f, 3f)
                lineTo(13.284f, 13.263f)
                lineTo(12.947f, 13.407f)
                lineTo(6.473f, 1.765f)
                curveTo(6.455f, 1.732f, 6.47f, 1.692f, 6.508f, 1.676f)
                curveTo(6.53f, 1.667f, 6.556f, 1.668f, 6.577f, 1.678f)
                curveTo(7.202f, 1.982f, 7.586f, 2.262f, 7.728f, 2.519f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.115f, 10.166f)
                curveTo(12.359f, 9.394f, 12.5f, 8.48f, 12.5f, 7.5f)
                curveTo(12.5f, 6.52f, 12.359f, 5.606f, 12.115f, 4.834f)
                curveTo(11.567f, 5.606f, 11.25f, 6.52f, 11.25f, 7.5f)
                curveTo(11.25f, 8.48f, 11.567f, 9.394f, 12.115f, 10.166f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.885f, 4.834f)
                curveTo(7.641f, 5.606f, 7.5f, 6.52f, 7.5f, 7.5f)
                curveTo(7.5f, 8.48f, 7.641f, 9.394f, 7.885f, 10.166f)
                curveTo(8.433f, 9.394f, 8.75f, 8.48f, 8.75f, 7.5f)
                curveTo(8.75f, 6.52f, 8.433f, 5.606f, 7.885f, 4.834f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.15f, 7.125f)
                curveTo(10.492f, 6.912f, 10.75f, 5.982f, 10.75f, 4.868f)
                curveTo(10.75f, 3.754f, 10.492f, 2.825f, 10.15f, 2.612f)
                verticalLineTo(7.125f)
                close()
                moveTo(9.775f, 7.066f)
                curveTo(9.471f, 6.772f, 9.25f, 5.899f, 9.25f, 4.868f)
                curveTo(9.25f, 3.837f, 9.471f, 2.965f, 9.775f, 2.671f)
                verticalLineTo(7.066f)
                close()
                moveTo(9.775f, 8f)
                verticalLineTo(12.395f)
                curveTo(9.471f, 12.101f, 9.25f, 11.228f, 9.25f, 10.197f)
                curveTo(9.25f, 9.166f, 9.471f, 8.294f, 9.775f, 8f)
                close()
                moveTo(10.15f, 12.454f)
                curveTo(10.492f, 12.241f, 10.75f, 11.311f, 10.75f, 10.197f)
                curveTo(10.75f, 9.083f, 10.492f, 8.154f, 10.15f, 7.941f)
                verticalLineTo(12.454f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(10f, 7.171f)
                curveTo(10.414f, 7.171f, 10.75f, 7.466f, 10.75f, 7.829f)
                curveTo(10.75f, 8.192f, 10.414f, 8.487f, 10f, 8.487f)
                curveTo(9.586f, 8.487f, 9.25f, 8.192f, 9.25f, 7.829f)
                curveTo(9.25f, 7.466f, 9.586f, 7.171f, 10f, 7.171f)
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
            imageVector = FlagIcons.Medium.Kenya,
            contentDescription = "Kenya Flag"
        )
    }
}
