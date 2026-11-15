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
 * Paraguay Flag (32x24dp)
 *
 * - ISO Alpha-2: PY
 * - ISO Alpha-3: PRY
 * - ISO Numeric: 600
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Paraguay: ImageVector by lazy {
    ImageVector.Builder(
        name = "Paraguay:PY:PRY:600:Large",
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
                stroke = SolidColor(Color(0xFF272727)),
                strokeLineWidth = 0.35f
            ) {
                moveTo(19.825f, 12f)
                curveTo(19.825f, 14.113f, 18.112f, 15.825f, 16f, 15.825f)
                curveTo(13.887f, 15.825f, 12.175f, 14.113f, 12.175f, 12f)
                curveTo(12.175f, 9.888f, 13.887f, 8.175f, 16f, 8.175f)
                curveTo(18.112f, 8.175f, 19.825f, 9.888f, 19.825f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 12f)
                curveTo(13f, 13.657f, 14.343f, 15f, 16f, 15f)
                curveTo(17.657f, 15f, 19f, 13.657f, 19f, 12f)
                curveTo(19f, 11.114f, 18.616f, 10.318f, 18.006f, 9.769f)
                curveTo(17.474f, 9.291f, 16.771f, 9f, 16f, 9f)
                curveTo(15.351f, 9f, 14.751f, 9.206f, 14.26f, 9.556f)
                curveTo(13.497f, 10.1f, 13f, 10.992f, 13f, 12f)
                close()
                moveTo(18.65f, 12f)
                curveTo(18.65f, 13.464f, 17.464f, 14.65f, 16f, 14.65f)
                curveTo(14.536f, 14.65f, 13.35f, 13.464f, 13.35f, 12f)
                curveTo(13.35f, 11.106f, 13.793f, 10.315f, 14.471f, 9.835f)
                curveTo(14.903f, 9.53f, 15.431f, 9.35f, 16f, 9.35f)
                curveTo(16.707f, 9.35f, 17.35f, 9.627f, 17.825f, 10.079f)
                curveTo(18.333f, 10.561f, 18.65f, 11.244f, 18.65f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF05234)),
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(16f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF73BE4A))) {
                moveTo(14.617f, 10.002f)
                lineTo(14.901f, 10.413f)
                curveTo(14.241f, 10.87f, 13.943f, 11.406f, 14.187f, 12.317f)
                curveTo(14.428f, 13.218f, 14.995f, 13.665f, 15.938f, 13.698f)
                lineTo(15.92f, 14.198f)
                curveTo(14.758f, 14.157f, 13.973f, 13.681f, 13.675f, 12.567f)
                curveTo(13.378f, 11.461f, 13.775f, 10.585f, 14.617f, 10.002f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 12.315f)
                lineTo(15.118f, 12.913f)
                lineTo(15.415f, 11.89f)
                lineTo(14.573f, 11.236f)
                lineTo(15.639f, 11.203f)
                lineTo(16f, 10.2f)
                lineTo(16.361f, 11.203f)
                lineTo(17.427f, 11.236f)
                lineTo(16.585f, 11.89f)
                lineTo(16.882f, 12.913f)
                lineTo(16f, 12.315f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF73BE4A)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(17.168f, 10.176f)
                curveTo(17.168f, 10.176f, 18.294f, 10.956f, 17.889f, 12.467f)
                curveTo(17.484f, 13.979f, 15.905f, 14.034f, 15.905f, 14.034f)
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(14.564f, 9.044f)
                lineTo(15.031f, 9.762f)
                lineTo(14.564f, 9.044f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ParaguayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Paraguay,
            contentDescription = "Paraguay Flag"
        )
    }
}
