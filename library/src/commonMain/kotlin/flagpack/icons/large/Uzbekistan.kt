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
 * Uzbekistan Flag (32x24dp)
 *
 * - ISO Alpha-2: UZ
 * - ISO Alpha-3: UZB
 * - ISO Numeric: 860
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Uzbekistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uzbekistan:UZ:UZB:860:Large",
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
                fill = SolidColor(Color(0xFF14DC5A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 16f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0099B5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 1f
            ) {
                moveTo(-2f, 9.5f)
                horizontalLineTo(-2.5f)
                verticalLineTo(10f)
                verticalLineTo(16f)
                verticalLineTo(16.5f)
                horizontalLineTo(-2f)
                horizontalLineTo(34f)
                horizontalLineTo(34.5f)
                verticalLineTo(16f)
                verticalLineTo(10f)
                verticalLineTo(9.5f)
                horizontalLineTo(34f)
                horizontalLineTo(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.541f, 3.006f)
                lineTo(13.868f, 3.38f)
                lineTo(14.06f, 2.62f)
                lineTo(13.416f, 2.062f)
                horizontalLineTo(14.258f)
                lineTo(14.54f, 1.343f)
                lineTo(14.871f, 2.062f)
                horizontalLineTo(15.589f)
                lineTo(15.025f, 2.62f)
                lineTo(15.296f, 3.38f)
                lineTo(14.541f, 3.006f)
                close()
                moveTo(10.933f, 5.297f)
                lineTo(11.606f, 4.923f)
                lineTo(12.361f, 5.297f)
                lineTo(12.09f, 4.537f)
                lineTo(12.654f, 3.979f)
                horizontalLineTo(11.936f)
                lineTo(11.605f, 3.259f)
                lineTo(11.323f, 3.979f)
                horizontalLineTo(10.481f)
                lineTo(11.125f, 4.537f)
                lineTo(10.933f, 5.297f)
                close()
                moveTo(8.428f, 6.961f)
                lineTo(7.755f, 7.335f)
                lineTo(7.947f, 6.575f)
                lineTo(7.302f, 6.016f)
                horizontalLineTo(8.144f)
                lineTo(8.427f, 5.297f)
                lineTo(8.758f, 6.016f)
                horizontalLineTo(9.476f)
                lineTo(8.912f, 6.575f)
                lineTo(9.183f, 7.335f)
                lineTo(8.428f, 6.961f)
                close()
                moveTo(11.606f, 6.961f)
                lineTo(10.933f, 7.335f)
                lineTo(11.125f, 6.575f)
                lineTo(10.481f, 6.016f)
                horizontalLineTo(11.323f)
                lineTo(11.605f, 5.297f)
                lineTo(11.936f, 6.016f)
                horizontalLineTo(12.654f)
                lineTo(12.09f, 6.575f)
                lineTo(12.361f, 7.335f)
                lineTo(11.606f, 6.961f)
                close()
                moveTo(14.586f, 6.961f)
                lineTo(13.913f, 7.335f)
                lineTo(14.105f, 6.575f)
                lineTo(13.461f, 6.016f)
                horizontalLineTo(14.303f)
                lineTo(14.585f, 5.297f)
                lineTo(14.916f, 6.016f)
                horizontalLineTo(15.634f)
                lineTo(15.07f, 6.575f)
                lineTo(15.341f, 7.335f)
                lineTo(14.586f, 6.961f)
                close()
                moveTo(13.913f, 5.297f)
                lineTo(14.586f, 4.923f)
                lineTo(15.341f, 5.297f)
                lineTo(15.07f, 4.537f)
                lineTo(15.634f, 3.979f)
                horizontalLineTo(14.916f)
                lineTo(14.585f, 3.259f)
                lineTo(14.303f, 3.979f)
                horizontalLineTo(13.461f)
                lineTo(14.105f, 4.537f)
                lineTo(13.913f, 5.297f)
                close()
                moveTo(16.912f, 7.335f)
                lineTo(17.586f, 6.961f)
                lineTo(18.341f, 7.335f)
                lineTo(18.069f, 6.575f)
                lineTo(18.633f, 6.016f)
                horizontalLineTo(17.916f)
                lineTo(17.584f, 5.297f)
                lineTo(17.302f, 6.016f)
                horizontalLineTo(16.46f)
                lineTo(17.105f, 6.575f)
                lineTo(16.912f, 7.335f)
                close()
                moveTo(17.586f, 4.923f)
                lineTo(16.912f, 5.297f)
                lineTo(17.105f, 4.537f)
                lineTo(16.46f, 3.979f)
                horizontalLineTo(17.302f)
                lineTo(17.584f, 3.259f)
                lineTo(17.916f, 3.979f)
                horizontalLineTo(18.633f)
                lineTo(18.069f, 4.537f)
                lineTo(18.341f, 5.297f)
                lineTo(17.586f, 4.923f)
                close()
                moveTo(16.868f, 3.38f)
                lineTo(17.541f, 3.006f)
                lineTo(18.296f, 3.38f)
                lineTo(18.025f, 2.62f)
                lineTo(18.589f, 2.062f)
                horizontalLineTo(17.871f)
                lineTo(17.54f, 1.343f)
                lineTo(17.257f, 2.062f)
                horizontalLineTo(16.415f)
                lineTo(17.06f, 2.62f)
                lineTo(16.868f, 3.38f)
                close()
                moveTo(20.616f, 6.961f)
                lineTo(19.943f, 7.335f)
                lineTo(20.135f, 6.575f)
                lineTo(19.49f, 6.016f)
                horizontalLineTo(20.332f)
                lineTo(20.615f, 5.297f)
                lineTo(20.946f, 6.016f)
                horizontalLineTo(21.664f)
                lineTo(21.1f, 6.575f)
                lineTo(21.371f, 7.335f)
                lineTo(20.616f, 6.961f)
                close()
                moveTo(19.943f, 5.297f)
                lineTo(20.616f, 4.923f)
                lineTo(21.371f, 5.297f)
                lineTo(21.1f, 4.537f)
                lineTo(21.664f, 3.979f)
                horizontalLineTo(20.946f)
                lineTo(20.615f, 3.259f)
                lineTo(20.332f, 3.979f)
                horizontalLineTo(19.49f)
                lineTo(20.135f, 4.537f)
                lineTo(19.943f, 5.297f)
                close()
                moveTo(20.571f, 3.006f)
                lineTo(19.898f, 3.38f)
                lineTo(20.09f, 2.62f)
                lineTo(19.445f, 2.062f)
                horizontalLineTo(20.287f)
                lineTo(20.57f, 1.343f)
                lineTo(20.901f, 2.062f)
                horizontalLineTo(21.619f)
                lineTo(21.055f, 2.62f)
                lineTo(21.326f, 3.38f)
                lineTo(20.571f, 3.006f)
                close()
                moveTo(5.885f, 8.241f)
                curveTo(5.885f, 8.241f, 3.469f, 7.585f, 3.515f, 5.162f)
                curveTo(3.56f, 2.738f, 6f, 2.109f, 6f, 2.109f)
                curveTo(5.003f, 1.732f, 2.055f, 2.238f, 2.001f, 5.137f)
                curveTo(1.946f, 8.036f, 4.956f, 8.608f, 5.885f, 8.241f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UzbekistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Uzbekistan,
            contentDescription = "Uzbekistan Flag"
        )
    }
}
