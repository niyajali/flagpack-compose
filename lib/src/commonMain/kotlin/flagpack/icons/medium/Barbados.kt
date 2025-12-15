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
 * Barbados Flag (20x15dp)
 *
 * - ISO Alpha-2: BB
 * - ISO Alpha-3: BRB
 * - ISO Numeric: 052
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Barbados: ImageVector by lazy {
    ImageVector.Builder(
        name = "Barbados:BB:BRB:052:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.521f, 9.546f)
                curveTo(11.917f, 8.728f, 12.373f, 7.235f, 12.373f, 7.235f)
                lineTo(12.719f, 6.207f)
                lineTo(11.347f, 6.704f)
                lineTo(11.672f, 6.892f)
                curveTo(11.672f, 6.892f, 11.106f, 8.023f, 10.821f, 8.576f)
                curveTo(10.536f, 9.128f, 10.508f, 8.763f, 10.508f, 8.763f)
                lineTo(10.557f, 4.908f)
                lineTo(10.872f, 4.822f)
                lineTo(10.087f, 3.315f)
                lineTo(9.086f, 4.843f)
                lineTo(9.527f, 4.855f)
                curveTo(9.527f, 4.855f, 9.49f, 8.923f, 9.429f, 8.763f)
                curveTo(9.395f, 8.672f, 9.304f, 8.953f, 9.259f, 8.844f)
                curveTo(8.981f, 8.163f, 8.601f, 6.842f, 8.601f, 6.842f)
                lineTo(8.823f, 6.634f)
                lineTo(7.331f, 6.327f)
                lineTo(7.776f, 7.245f)
                curveTo(7.776f, 7.245f, 8.169f, 8.88f, 8.601f, 9.679f)
                curveTo(8.698f, 9.931f, 9.167f, 10.039f, 9.167f, 10.039f)
                curveTo(9.167f, 10.039f, 9.396f, 9.806f, 9.453f, 10.039f)
                curveTo(9.51f, 10.272f, 9.453f, 11.211f, 9.453f, 11.211f)
                horizontalLineTo(10.508f)
                curveTo(10.508f, 11.211f, 10.434f, 10.325f, 10.508f, 10.039f)
                curveTo(10.582f, 9.753f, 10.812f, 10.039f, 10.812f, 10.039f)
                curveTo(10.812f, 10.039f, 11.424f, 9.798f, 11.521f, 9.546f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BarbadosPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Barbados,
            contentDescription = "Barbados Flag"
        )
    }
}
