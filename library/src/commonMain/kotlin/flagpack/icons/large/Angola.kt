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
 * Angola Flag (32x24dp)
 *
 * - ISO Alpha-2: AO
 * - ISO Alpha-3: AGO
 * - ISO Numeric: 024
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Angola: ImageVector by lazy {
    ImageVector.Builder(
        name = "Angola:AO:AGO:024:Large",
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
                fill = SolidColor(Color(0xFF1D1D1D)),
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
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFFEA42))) {
                moveTo(9.933f, 5.897f)
                lineTo(10.36f, 4.492f)
                curveTo(13.56f, 5.469f, 15.489f, 7.181f, 16.032f, 9.624f)
                curveTo(16.392f, 11.244f, 16.228f, 12.693f, 15.646f, 13.982f)
                curveTo(15.231f, 14.901f, 14.704f, 15.587f, 13.947f, 16.36f)
                curveTo(12.683f, 17.648f, 10.605f, 18.469f, 8.729f, 18.121f)
                curveTo(7.422f, 17.878f, 6.217f, 17.419f, 5.12f, 16.746f)
                lineTo(5.885f, 15.493f)
                curveTo(6.828f, 16.072f, 7.863f, 16.467f, 8.996f, 16.677f)
                curveTo(10.351f, 16.929f, 11.957f, 16.293f, 12.902f, 15.33f)
                curveTo(13.549f, 14.67f, 13.981f, 14.108f, 14.311f, 13.377f)
                curveTo(14.765f, 12.372f, 14.892f, 11.248f, 14.602f, 9.943f)
                curveTo(14.188f, 8.079f, 12.67f, 6.732f, 9.933f, 5.897f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCFF01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.846f, 9.464f)
                lineTo(8.897f, 10.122f)
                lineTo(9.232f, 9.02f)
                lineTo(8.31f, 8.325f)
                lineTo(9.466f, 8.301f)
                lineTo(9.846f, 7.214f)
                lineTo(10.226f, 8.301f)
                lineTo(11.382f, 8.325f)
                lineTo(10.461f, 9.02f)
                lineTo(10.796f, 10.122f)
                lineTo(9.846f, 9.464f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEA42)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.846f, 9.464f)
                lineTo(8.897f, 10.122f)
                lineTo(9.232f, 9.02f)
                lineTo(8.31f, 8.325f)
                lineTo(9.466f, 8.301f)
                lineTo(9.846f, 7.214f)
                lineTo(10.226f, 8.301f)
                lineTo(11.382f, 8.325f)
                lineTo(10.461f, 9.02f)
                lineTo(10.796f, 10.122f)
                lineTo(9.846f, 9.464f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCFF01)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.614f, 9.86f)
                curveTo(7.614f, 9.86f, 5.93f, 12.328f, 7.256f, 13.231f)
                curveTo(8.582f, 14.133f, 15.593f, 17.938f, 15.593f, 17.938f)
                curveTo(15.593f, 17.938f, 17.042f, 17.929f, 17.248f, 18.237f)
                curveTo(17.454f, 18.545f, 17.883f, 18.908f, 18.064f, 18.908f)
                curveTo(18.244f, 18.908f, 18.711f, 18.581f, 18.711f, 18.581f)
                curveTo(18.711f, 18.581f, 19.075f, 18.284f, 18.711f, 17.938f)
                curveTo(18.347f, 17.591f, 16.424f, 16.406f, 16.424f, 16.406f)
                curveTo(16.424f, 16.406f, 8.916f, 11.614f, 8.277f, 11.14f)
                curveTo(7.639f, 10.665f, 7.614f, 9.86f, 7.614f, 9.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEA42)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.614f, 9.86f)
                curveTo(7.614f, 9.86f, 5.93f, 12.328f, 7.256f, 13.231f)
                curveTo(8.582f, 14.133f, 15.593f, 17.938f, 15.593f, 17.938f)
                curveTo(15.593f, 17.938f, 17.042f, 17.929f, 17.248f, 18.237f)
                curveTo(17.454f, 18.545f, 17.883f, 18.908f, 18.064f, 18.908f)
                curveTo(18.244f, 18.908f, 18.711f, 18.581f, 18.711f, 18.581f)
                curveTo(18.711f, 18.581f, 19.075f, 18.284f, 18.711f, 17.938f)
                curveTo(18.347f, 17.591f, 16.424f, 16.406f, 16.424f, 16.406f)
                curveTo(16.424f, 16.406f, 8.916f, 11.614f, 8.277f, 11.14f)
                curveTo(7.639f, 10.665f, 7.614f, 9.86f, 7.614f, 9.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFEA42)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.712f, 4.074f)
                lineTo(11.322f, 4.957f)
                lineTo(12.6f, 5.51f)
                lineTo(12.963f, 4.627f)
                lineTo(11.712f, 4.074f)
                close()
                moveTo(14.325f, 5.484f)
                lineTo(13.621f, 6.144f)
                lineTo(14.581f, 7.153f)
                lineTo(15.26f, 6.482f)
                lineTo(14.325f, 5.484f)
                close()
                moveTo(15.286f, 8.137f)
                lineTo(16.186f, 7.788f)
                lineTo(16.679f, 9.064f)
                lineTo(15.799f, 9.432f)
                lineTo(15.286f, 8.137f)
                close()
                moveTo(17.039f, 10.636f)
                lineTo(16.074f, 10.606f)
                lineTo(16.04f, 11.998f)
                lineTo(16.995f, 12.003f)
                lineTo(17.039f, 10.636f)
                close()
                moveTo(15.847f, 13.194f)
                lineTo(16.73f, 13.584f)
                lineTo(16.177f, 14.835f)
                lineTo(15.294f, 14.472f)
                lineTo(15.847f, 13.194f)
                close()
                moveTo(15.324f, 16.202f)
                lineTo(14.663f, 15.498f)
                lineTo(13.654f, 16.459f)
                lineTo(14.326f, 17.137f)
                lineTo(15.324f, 16.202f)
                close()
                moveTo(12.677f, 17.167f)
                lineTo(13.025f, 18.067f)
                lineTo(11.75f, 18.56f)
                lineTo(11.381f, 17.68f)
                lineTo(12.677f, 17.167f)
                close()
                moveTo(10.183f, 18.921f)
                lineTo(10.214f, 17.957f)
                lineTo(8.821f, 17.923f)
                lineTo(8.816f, 18.877f)
                lineTo(10.183f, 18.921f)
                close()
                moveTo(7.632f, 17.728f)
                lineTo(7.242f, 18.611f)
                lineTo(5.991f, 18.058f)
                lineTo(6.353f, 17.175f)
                lineTo(7.632f, 17.728f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AngolaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Angola,
            contentDescription = "Angola Flag"
        )
    }
}
