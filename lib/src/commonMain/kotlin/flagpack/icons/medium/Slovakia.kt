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
 * Slovakia Flag (20x15dp)
 *
 * - ISO Alpha-2: SK
 * - ISO Alpha-3: SVK
 * - ISO Numeric: 703
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Slovakia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovakia:SK:SVK:703:Medium",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                stroke = SolidColor(Color.White),
                strokeLineWidth = 0.625f
            ) {
                moveTo(9.752f, 3.769f)
                lineTo(10.063f, 3.736f)
                lineTo(10.033f, 3.456f)
                horizontalLineTo(9.752f)
                horizontalLineTo(3.966f)
                horizontalLineTo(3.673f)
                lineTo(3.654f, 3.748f)
                lineTo(3.966f, 3.769f)
                lineTo(3.654f, 3.748f)
                lineTo(3.654f, 3.748f)
                lineTo(3.654f, 3.749f)
                lineTo(3.654f, 3.751f)
                lineTo(3.653f, 3.758f)
                lineTo(3.651f, 3.787f)
                lineTo(3.644f, 3.897f)
                curveTo(3.638f, 3.992f, 3.63f, 4.129f, 3.62f, 4.297f)
                curveTo(3.6f, 4.632f, 3.576f, 5.089f, 3.555f, 5.577f)
                curveTo(3.515f, 6.539f, 3.488f, 7.666f, 3.558f, 8.192f)
                curveTo(3.695f, 9.218f, 4.32f, 11.523f, 6.737f, 12.567f)
                lineTo(6.863f, 12.622f)
                lineTo(6.989f, 12.565f)
                curveTo(9.285f, 11.539f, 10.053f, 9.471f, 10.231f, 8.193f)
                curveTo(10.32f, 7.549f, 10.274f, 6.421f, 10.212f, 5.483f)
                curveTo(10.18f, 5.008f, 10.143f, 4.572f, 10.114f, 4.254f)
                curveTo(10.099f, 4.095f, 10.087f, 3.966f, 10.078f, 3.876f)
                lineTo(10.067f, 3.773f)
                lineTo(10.064f, 3.746f)
                lineTo(10.064f, 3.738f)
                lineTo(10.063f, 3.737f)
                lineTo(10.063f, 3.736f)
                lineTo(10.063f, 3.736f)
                lineTo(9.752f, 3.769f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(9.752f, 3.769f)
                lineTo(10.063f, 3.736f)
                lineTo(10.033f, 3.456f)
                horizontalLineTo(9.752f)
                horizontalLineTo(3.966f)
                horizontalLineTo(3.673f)
                lineTo(3.654f, 3.748f)
                lineTo(3.966f, 3.769f)
                lineTo(3.654f, 3.748f)
                lineTo(3.654f, 3.748f)
                lineTo(3.654f, 3.749f)
                lineTo(3.654f, 3.751f)
                lineTo(3.653f, 3.758f)
                lineTo(3.651f, 3.787f)
                lineTo(3.644f, 3.897f)
                curveTo(3.638f, 3.992f, 3.63f, 4.129f, 3.62f, 4.297f)
                curveTo(3.6f, 4.632f, 3.576f, 5.089f, 3.555f, 5.577f)
                curveTo(3.515f, 6.539f, 3.488f, 7.666f, 3.558f, 8.192f)
                curveTo(3.695f, 9.218f, 4.32f, 11.523f, 6.737f, 12.567f)
                lineTo(6.863f, 12.622f)
                lineTo(6.989f, 12.565f)
                curveTo(9.285f, 11.539f, 10.053f, 9.471f, 10.231f, 8.193f)
                curveTo(10.32f, 7.549f, 10.274f, 6.421f, 10.212f, 5.483f)
                curveTo(10.18f, 5.008f, 10.143f, 4.572f, 10.114f, 4.254f)
                curveTo(10.099f, 4.095f, 10.087f, 3.966f, 10.078f, 3.876f)
                lineTo(10.067f, 3.773f)
                lineTo(10.064f, 3.746f)
                lineTo(10.064f, 3.738f)
                lineTo(10.063f, 3.737f)
                lineTo(10.063f, 3.736f)
                lineTo(10.063f, 3.736f)
                lineTo(9.752f, 3.769f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.411f, 4.119f)
                curveTo(6.411f, 4.119f, 6.54f, 4.315f, 6.598f, 4.616f)
                curveTo(6.655f, 4.917f, 6.665f, 5.443f, 6.665f, 5.443f)
                lineTo(5.441f, 5.293f)
                verticalLineTo(6.221f)
                lineTo(6.693f, 6.062f)
                lineTo(6.672f, 6.943f)
                curveTo(6.672f, 6.943f, 6.298f, 6.981f, 5.991f, 6.943f)
                curveTo(5.684f, 6.904f, 5.079f, 6.741f, 5.079f, 6.741f)
                verticalLineTo(7.804f)
                curveTo(5.079f, 7.804f, 5.693f, 7.607f, 5.991f, 7.562f)
                curveTo(6.288f, 7.517f, 6.672f, 7.562f, 6.672f, 7.562f)
                verticalLineTo(8.867f)
                horizontalLineTo(7.18f)
                verticalLineTo(7.562f)
                curveTo(7.18f, 7.562f, 7.736f, 7.514f, 8.067f, 7.566f)
                curveTo(8.399f, 7.618f, 8.713f, 7.804f, 8.713f, 7.804f)
                verticalLineTo(6.741f)
                curveTo(8.713f, 6.741f, 8.394f, 6.9f, 8.094f, 6.939f)
                curveTo(7.794f, 6.979f, 7.18f, 6.943f, 7.18f, 6.943f)
                lineTo(7.201f, 6.062f)
                curveTo(7.201f, 6.062f, 7.617f, 6.019f, 7.85f, 6.05f)
                curveTo(8.083f, 6.082f, 8.375f, 6.221f, 8.375f, 6.221f)
                verticalLineTo(5.293f)
                curveTo(8.375f, 5.293f, 8.09f, 5.448f, 7.867f, 5.476f)
                curveTo(7.643f, 5.504f, 7.173f, 5.443f, 7.173f, 5.443f)
                curveTo(7.173f, 5.443f, 7.182f, 4.9f, 7.23f, 4.635f)
                curveTo(7.278f, 4.37f, 7.414f, 4.119f, 7.414f, 4.119f)
                horizontalLineTo(6.411f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.311f, 10.153f)
                curveTo(4.311f, 10.153f, 4.586f, 9.564f, 5.032f, 9.452f)
                curveTo(5.479f, 9.34f, 5.948f, 9.803f, 5.948f, 9.803f)
                curveTo(5.948f, 9.803f, 6.234f, 8.867f, 6.932f, 8.867f)
                curveTo(7.629f, 8.867f, 7.874f, 9.803f, 7.874f, 9.803f)
                curveTo(7.874f, 9.803f, 8.172f, 9.452f, 8.6f, 9.452f)
                curveTo(9.028f, 9.452f, 9.424f, 10.153f, 9.424f, 10.153f)
                curveTo(9.424f, 10.153f, 8.146f, 12.474f, 6.868f, 12.474f)
                curveTo(5.589f, 12.474f, 4.311f, 10.153f, 4.311f, 10.153f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SlovakiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Slovakia,
            contentDescription = "Slovakia Flag"
        )
    }
}
