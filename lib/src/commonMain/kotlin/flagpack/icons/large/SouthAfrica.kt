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
 * South Africa Flag (32x24dp)
 *
 * - ISO Alpha-2: ZA
 * - ISO Alpha-3: ZAF
 * - ISO Numeric: 710
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SouthAfrica: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Africa:ZA:ZAF:710:Large",
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
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
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
            path(
                fill = SolidColor(Color(0xFF5EAA22)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.429f, 10f)
                lineTo(0f, -2f)
                verticalLineTo(26f)
                lineTo(15.429f, 14f)
                horizontalLineTo(32f)
                verticalLineTo(10f)
                horizontalLineTo(15.429f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(-2f, -7f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(38f)
                horizontalLineToRelative(-36f)
                close()
                moveTo(15.429f, 10f)
                lineTo(0f, -2f)
                verticalLineTo(26f)
                lineTo(15.429f, 14f)
                horizontalLineTo(32f)
                verticalLineTo(10f)
                horizontalLineTo(15.429f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, -2f)
                lineTo(1.228f, -3.579f)
                lineTo(-2f, -6.089f)
                verticalLineTo(-2f)
                horizontalLineTo(0f)
                close()
                moveTo(15.429f, 10f)
                lineTo(14.201f, 11.579f)
                lineTo(14.742f, 12f)
                horizontalLineTo(15.429f)
                verticalLineTo(10f)
                close()
                moveTo(0f, 26f)
                horizontalLineTo(-2f)
                verticalLineTo(30.089f)
                lineTo(1.228f, 27.579f)
                lineTo(0f, 26f)
                close()
                moveTo(15.429f, 14f)
                verticalLineTo(12f)
                horizontalLineTo(14.742f)
                lineTo(14.201f, 12.421f)
                lineTo(15.429f, 14f)
                close()
                moveTo(32f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(34f)
                verticalLineTo(14f)
                horizontalLineTo(32f)
                close()
                moveTo(32f, 10f)
                horizontalLineTo(34f)
                verticalLineTo(8f)
                horizontalLineTo(32f)
                verticalLineTo(10f)
                close()
                moveTo(-1.228f, -0.421f)
                lineTo(14.201f, 11.579f)
                lineTo(16.656f, 8.421f)
                lineTo(1.228f, -3.579f)
                lineTo(-1.228f, -0.421f)
                close()
                moveTo(2f, 26f)
                verticalLineTo(-2f)
                horizontalLineTo(-2f)
                verticalLineTo(26f)
                horizontalLineTo(2f)
                close()
                moveTo(14.201f, 12.421f)
                lineTo(-1.228f, 24.421f)
                lineTo(1.228f, 27.579f)
                lineTo(16.656f, 15.579f)
                lineTo(14.201f, 12.421f)
                close()
                moveTo(32f, 12f)
                horizontalLineTo(15.429f)
                verticalLineTo(16f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                close()
                moveTo(30f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(34f)
                verticalLineTo(10f)
                horizontalLineTo(30f)
                close()
                moveTo(15.429f, 12f)
                horizontalLineTo(32f)
                verticalLineTo(8f)
                horizontalLineTo(15.429f)
                verticalLineTo(12f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            stroke = SolidColor(Color(0xFFFECA00)),
            strokeLineWidth = 2f
        ) {
            moveTo(0.6f, 5.2f)
            lineTo(-1f, 4f)
            verticalLineTo(6f)
            verticalLineTo(18f)
            verticalLineTo(20f)
            lineTo(0.6f, 18.8f)
            lineTo(8.6f, 12.8f)
            lineTo(9.667f, 12f)
            lineTo(8.6f, 11.2f)
            lineTo(0.6f, 5.2f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthAfricaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SouthAfrica,
            contentDescription = "South Africa Flag"
        )
    }
}
