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
 * Guatemala Flag (20x15dp)
 *
 * - ISO Alpha-2: GT
 * - ISO Alpha-3: GTM
 * - ISO Numeric: 320
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Guatemala: ImageVector by lazy {
    ImageVector.Builder(
        name = "Guatemala:GT:GTM:320:Medium",
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color(0xFF58A5FF)),
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 0f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC6C6C6))) {
                moveTo(7.978f, 10.648f)
                lineTo(7.524f, 10.219f)
                lineTo(12.328f, 5.139f)
                lineTo(12.783f, 5.568f)
                lineTo(7.978f, 10.648f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.115f, 5.066f)
                curveTo(8.115f, 5.066f, 6.577f, 5.994f, 6.577f, 8.321f)
                curveTo(6.577f, 10.648f, 10.322f, 10.963f, 10.322f, 10.963f)
                curveTo(10.322f, 10.963f, 8.081f, 9.596f, 7.788f, 8.618f)
                curveTo(7.495f, 7.639f, 8.115f, 5.066f, 8.115f, 5.066f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF5AB92D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.909f, 5.066f)
                curveTo(11.909f, 5.066f, 13.447f, 5.994f, 13.447f, 8.321f)
                curveTo(13.447f, 10.648f, 9.702f, 10.963f, 9.702f, 10.963f)
                curveTo(9.702f, 10.963f, 12.057f, 9.612f, 12.387f, 8.321f)
                curveTo(12.717f, 7.03f, 11.909f, 5.066f, 11.909f, 5.066f)
                close()
            }
            path(fill = SolidColor(Color(0xFF5AB92D))) {
                moveTo(9.255f, 4.75f)
                lineTo(9.877f, 4.806f)
                curveTo(9.857f, 5.032f, 9.98f, 5.261f, 10.285f, 5.508f)
                curveTo(11.265f, 6.301f, 11.792f, 7.29f, 11.379f, 8.414f)
                curveTo(11.079f, 9.229f, 10.672f, 9.918f, 10.157f, 10.477f)
                lineTo(9.698f, 10.054f)
                curveTo(10.155f, 9.557f, 10.52f, 8.94f, 10.792f, 8.198f)
                curveTo(11.089f, 7.391f, 10.688f, 6.637f, 9.892f, 5.994f)
                curveTo(9.438f, 5.627f, 9.213f, 5.208f, 9.255f, 4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEFE298)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.859f, 6.131f)
                lineTo(9.514f, 7.984f)
                horizontalLineTo(9.032f)
                curveTo(9.032f, 7.984f, 8.859f, 8.569f, 9.187f, 8.569f)
                curveTo(9.514f, 8.569f, 11.204f, 8.569f, 11.204f, 8.569f)
                curveTo(11.204f, 8.569f, 11.424f, 8.423f, 11.314f, 7.984f)
                curveTo(11.204f, 7.546f, 10.649f, 6.336f, 10.649f, 6.336f)
                curveTo(10.649f, 6.336f, 10.886f, 6.135f, 10.886f, 5.986f)
                curveTo(10.886f, 5.837f, 10.649f, 5.821f, 10.649f, 5.821f)
                horizontalLineTo(9.152f)
                curveTo(8.961f, 5.854f, 8.859f, 6.131f, 8.859f, 6.131f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun GuatemalaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Guatemala,
            contentDescription = "Guatemala Flag"
        )
    }
}
