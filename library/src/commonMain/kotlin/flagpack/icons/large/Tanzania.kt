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
 * Tanzania Flag (32x24dp)
 *
 * - ISO Alpha-2: TZ
 * - ISO Alpha-3: TZA
 * - ISO Numeric: 834
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Tanzania: ImageVector by lazy {
    ImageVector.Builder(
        name = "Tanzania:TZ:TZA:834:Large",
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
                fill = SolidColor(Color(0xFF3195F9)),
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
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(24f)
                lineTo(32f, 0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 2.5f
            ) {
                moveTo(-1.822f, 25.439f)
                lineTo(-1.128f, 26.479f)
                lineTo(-0.088f, 25.785f)
                lineTo(36.173f, 1.581f)
                lineTo(37.213f, 0.888f)
                lineTo(36.519f, -0.152f)
                lineTo(34.298f, -3.479f)
                lineTo(33.604f, -4.519f)
                lineTo(32.564f, -3.825f)
                lineTo(-3.697f, 20.379f)
                lineTo(-4.736f, 21.073f)
                lineTo(-4.042f, 22.112f)
                lineTo(-1.822f, 25.439f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun TanzaniaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Tanzania,
            contentDescription = "Tanzania Flag"
        )
    }
}
