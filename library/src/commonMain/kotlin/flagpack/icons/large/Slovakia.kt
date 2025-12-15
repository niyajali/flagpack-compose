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
 * Slovakia Flag (32x24dp)
 *
 * - ISO Alpha-2: SK
 * - ISO Alpha-3: SVK
 * - ISO Numeric: 703
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Slovakia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Slovakia:SK:SVK:703:Large",
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
                fill = SolidColor(Color(0xFF3D58DB)),
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                stroke = SolidColor(Color.White),
                strokeLineWidth = 1f
            ) {
                moveTo(15.604f, 6.03f)
                lineTo(16.101f, 5.977f)
                lineTo(16.053f, 5.53f)
                horizontalLineTo(15.604f)
                horizontalLineTo(6.345f)
                horizontalLineTo(5.877f)
                lineTo(5.846f, 5.997f)
                lineTo(6.345f, 6.03f)
                lineTo(5.846f, 5.997f)
                lineTo(5.846f, 5.997f)
                lineTo(5.846f, 5.998f)
                lineTo(5.846f, 6.001f)
                lineTo(5.845f, 6.013f)
                lineTo(5.842f, 6.059f)
                lineTo(5.831f, 6.235f)
                curveTo(5.821f, 6.388f, 5.807f, 6.607f, 5.792f, 6.875f)
                curveTo(5.761f, 7.411f, 5.721f, 8.142f, 5.688f, 8.923f)
                curveTo(5.624f, 10.463f, 5.581f, 12.265f, 5.693f, 13.107f)
                curveTo(5.911f, 14.749f, 6.911f, 18.436f, 10.78f, 20.107f)
                lineTo(10.982f, 20.194f)
                lineTo(11.182f, 20.105f)
                curveTo(14.856f, 18.462f, 16.085f, 15.153f, 16.369f, 13.109f)
                curveTo(16.512f, 12.078f, 16.439f, 10.273f, 16.339f, 8.773f)
                curveTo(16.288f, 8.013f, 16.228f, 7.315f, 16.182f, 6.807f)
                curveTo(16.159f, 6.553f, 16.138f, 6.346f, 16.124f, 6.202f)
                curveTo(16.117f, 6.13f, 16.111f, 6.074f, 16.107f, 6.036f)
                lineTo(16.103f, 5.993f)
                lineTo(16.101f, 5.981f)
                lineTo(16.101f, 5.979f)
                lineTo(16.101f, 5.978f)
                lineTo(16.101f, 5.978f)
                curveTo(16.101f, 5.977f, 16.101f, 5.977f, 15.604f, 6.03f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(15.604f, 6.03f)
                lineTo(16.101f, 5.977f)
                lineTo(16.053f, 5.53f)
                horizontalLineTo(15.604f)
                horizontalLineTo(6.345f)
                horizontalLineTo(5.877f)
                lineTo(5.846f, 5.997f)
                lineTo(6.345f, 6.03f)
                lineTo(5.846f, 5.997f)
                lineTo(5.846f, 5.997f)
                lineTo(5.846f, 5.998f)
                lineTo(5.846f, 6.001f)
                lineTo(5.845f, 6.013f)
                lineTo(5.842f, 6.059f)
                lineTo(5.831f, 6.235f)
                curveTo(5.821f, 6.388f, 5.807f, 6.607f, 5.792f, 6.875f)
                curveTo(5.761f, 7.411f, 5.721f, 8.142f, 5.688f, 8.923f)
                curveTo(5.624f, 10.463f, 5.581f, 12.265f, 5.693f, 13.107f)
                curveTo(5.911f, 14.749f, 6.911f, 18.436f, 10.78f, 20.107f)
                lineTo(10.982f, 20.194f)
                lineTo(11.182f, 20.105f)
                curveTo(14.856f, 18.462f, 16.085f, 15.153f, 16.369f, 13.109f)
                curveTo(16.512f, 12.078f, 16.439f, 10.273f, 16.339f, 8.773f)
                curveTo(16.288f, 8.013f, 16.228f, 7.315f, 16.182f, 6.807f)
                curveTo(16.159f, 6.553f, 16.138f, 6.346f, 16.124f, 6.202f)
                curveTo(16.117f, 6.13f, 16.111f, 6.074f, 16.107f, 6.036f)
                lineTo(16.103f, 5.993f)
                lineTo(16.101f, 5.981f)
                lineTo(16.101f, 5.979f)
                lineTo(16.101f, 5.978f)
                lineTo(16.101f, 5.978f)
                curveTo(16.101f, 5.977f, 16.101f, 5.977f, 15.604f, 6.03f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.257f, 6.59f)
                curveTo(10.257f, 6.59f, 10.464f, 6.904f, 10.556f, 7.385f)
                curveTo(10.649f, 7.867f, 10.664f, 8.709f, 10.664f, 8.709f)
                lineTo(8.706f, 8.468f)
                verticalLineTo(9.954f)
                lineTo(10.708f, 9.698f)
                lineTo(10.676f, 11.108f)
                curveTo(10.676f, 11.108f, 10.076f, 11.17f, 9.585f, 11.108f)
                curveTo(9.094f, 11.046f, 8.126f, 10.786f, 8.126f, 10.786f)
                verticalLineTo(12.486f)
                curveTo(8.126f, 12.486f, 9.109f, 12.172f, 9.585f, 12.099f)
                curveTo(10.061f, 12.027f, 10.676f, 12.099f, 10.676f, 12.099f)
                verticalLineTo(14.188f)
                horizontalLineTo(11.489f)
                verticalLineTo(12.099f)
                curveTo(11.489f, 12.099f, 12.377f, 12.022f, 12.908f, 12.106f)
                curveTo(13.438f, 12.189f, 13.941f, 12.486f, 13.941f, 12.486f)
                verticalLineTo(10.786f)
                curveTo(13.941f, 10.786f, 13.431f, 11.04f, 12.951f, 11.103f)
                curveTo(12.47f, 11.166f, 11.489f, 11.108f, 11.489f, 11.108f)
                lineTo(11.521f, 9.698f)
                curveTo(11.521f, 9.698f, 12.186f, 9.63f, 12.56f, 9.68f)
                curveTo(12.933f, 9.731f, 13.4f, 9.954f, 13.4f, 9.954f)
                verticalLineTo(8.468f)
                curveTo(13.4f, 8.468f, 12.945f, 8.716f, 12.587f, 8.761f)
                curveTo(12.228f, 8.806f, 11.477f, 8.709f, 11.477f, 8.709f)
                curveTo(11.477f, 8.709f, 11.491f, 7.84f, 11.568f, 7.416f)
                curveTo(11.645f, 6.992f, 11.863f, 6.59f, 11.863f, 6.59f)
                horizontalLineTo(10.257f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.897f, 16.245f)
                curveTo(6.897f, 16.245f, 7.337f, 15.302f, 8.052f, 15.123f)
                curveTo(8.767f, 14.943f, 9.517f, 15.684f, 9.517f, 15.684f)
                curveTo(9.517f, 15.684f, 9.975f, 14.188f, 11.091f, 14.188f)
                curveTo(12.207f, 14.188f, 12.599f, 15.684f, 12.599f, 15.684f)
                curveTo(12.599f, 15.684f, 13.075f, 15.123f, 13.76f, 15.123f)
                curveTo(14.444f, 15.123f, 15.079f, 16.245f, 15.079f, 16.245f)
                curveTo(15.079f, 16.245f, 13.034f, 19.959f, 10.988f, 19.959f)
                curveTo(8.943f, 19.959f, 6.897f, 16.245f, 6.897f, 16.245f)
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
            imageVector = FlagIcons.Large.Slovakia,
            contentDescription = "Slovakia Flag"
        )
    }
}
