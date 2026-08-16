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
 * Cook Islands Flag (32x24dp)
 *
 * - ISO Alpha-2: CK
 * - ISO Alpha-3: COK
 * - ISO Numeric: 184
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.CookIslands: ImageVector by lazy {
    ImageVector.Builder(
        name = "Cook Islands:CK:COK:184:Large",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-18f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(-2.004f, 13f)
                lineTo(1.957f, 14.737f)
                lineTo(18.09f, 1.889f)
                lineTo(20.179f, -0.693f)
                lineTo(15.943f, -1.273f)
                lineTo(9.363f, 4.263f)
                lineTo(4.067f, 7.994f)
                lineTo(-2.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(-1.462f, 14.217f)
                lineTo(0.556f, 15.225f)
                lineTo(19.429f, -0.933f)
                horizontalLineTo(16.596f)
                lineTo(-1.462f, 14.217f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(20.004f, 13f)
                lineTo(16.043f, 14.737f)
                lineTo(-0.09f, 1.889f)
                lineTo(-2.179f, -0.693f)
                lineTo(2.056f, -1.273f)
                lineTo(8.637f, 4.263f)
                lineTo(13.933f, 7.994f)
                lineTo(20.004f, 13f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF50100))) {
                moveTo(19.869f, 13.873f)
                lineTo(17.851f, 14.882f)
                lineTo(9.815f, 7.964f)
                lineTo(7.432f, 7.191f)
                lineTo(-2.38f, -0.684f)
                horizontalLineTo(0.453f)
                lineTo(10.26f, 7.004f)
                lineTo(12.865f, 7.931f)
                lineTo(19.869f, 13.873f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.985f, 0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.485f, 0f)
                horizontalLineTo(11.484f)
                verticalLineTo(4.5f)
                horizontalLineTo(18f)
                verticalLineTo(9.5f)
                horizontalLineTo(11.484f)
                lineTo(11.5f, 14f)
                horizontalLineTo(6.5f)
                lineTo(6.485f, 9.5f)
                horizontalLineTo(0f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.485f)
                verticalLineTo(0f)
                close()
                moveTo(7.985f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(7.985f)
                verticalLineTo(14f)
                horizontalLineTo(9.985f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                horizontalLineTo(9.985f)
                verticalLineTo(0f)
                horizontalLineTo(7.985f)
                verticalLineTo(6f)
                close()
            }
        }
        path(
            fill = SolidColor(Color.White),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(23.667f, 13.855f)
            lineTo(24.393f, 13.346f)
            lineTo(25.095f, 13.855f)
            lineTo(24.877f, 12.95f)
            lineTo(25.441f, 12.375f)
            horizontalLineTo(24.723f)
            lineTo(24.392f, 11.637f)
            lineTo(24.11f, 12.375f)
            horizontalLineTo(23.267f)
            lineTo(23.912f, 12.95f)
            lineTo(23.667f, 13.855f)
            close()
            moveTo(26.48f, 15.113f)
            lineTo(27.206f, 14.604f)
            lineTo(27.908f, 15.113f)
            lineTo(27.69f, 14.208f)
            lineTo(28.254f, 13.634f)
            horizontalLineTo(27.536f)
            lineTo(27.205f, 12.895f)
            lineTo(26.922f, 13.634f)
            horizontalLineTo(26.08f)
            lineTo(26.725f, 14.208f)
            lineTo(26.48f, 15.113f)
            close()
            moveTo(28.045f, 16.985f)
            lineTo(27.319f, 17.494f)
            lineTo(27.564f, 16.589f)
            lineTo(26.919f, 16.015f)
            horizontalLineTo(27.761f)
            lineTo(28.044f, 15.276f)
            lineTo(28.375f, 16.015f)
            horizontalLineTo(29.093f)
            lineTo(28.529f, 16.589f)
            lineTo(28.747f, 17.494f)
            lineTo(28.045f, 16.985f)
            close()
            moveTo(26.322f, 19.769f)
            lineTo(27.048f, 19.26f)
            lineTo(27.75f, 19.769f)
            lineTo(27.532f, 18.864f)
            lineTo(28.096f, 18.29f)
            horizontalLineTo(27.378f)
            lineTo(27.047f, 17.551f)
            lineTo(26.764f, 18.29f)
            horizontalLineTo(25.923f)
            lineTo(26.567f, 18.864f)
            lineTo(26.322f, 19.769f)
            close()
            moveTo(24.5f, 20.506f)
            lineTo(23.774f, 21.015f)
            lineTo(24.019f, 20.11f)
            lineTo(23.374f, 19.536f)
            horizontalLineTo(24.216f)
            lineTo(24.499f, 18.797f)
            lineTo(24.83f, 19.536f)
            horizontalLineTo(25.548f)
            lineTo(24.984f, 20.11f)
            lineTo(25.202f, 21.015f)
            lineTo(24.5f, 20.506f)
            close()
            moveTo(21.4f, 19.809f)
            lineTo(22.126f, 19.3f)
            lineTo(22.828f, 19.809f)
            lineTo(22.61f, 18.903f)
            lineTo(23.174f, 18.329f)
            horizontalLineTo(22.456f)
            lineTo(22.125f, 17.59f)
            lineTo(21.843f, 18.329f)
            horizontalLineTo(21f)
            lineTo(21.645f, 18.903f)
            lineTo(21.4f, 19.809f)
            close()
            moveTo(20.86f, 17.002f)
            lineTo(20.134f, 17.511f)
            lineTo(20.379f, 16.605f)
            lineTo(19.734f, 16.031f)
            horizontalLineTo(20.576f)
            lineTo(20.859f, 15.292f)
            lineTo(21.19f, 16.031f)
            horizontalLineTo(21.908f)
            lineTo(21.344f, 16.605f)
            lineTo(21.562f, 17.511f)
            lineTo(20.86f, 17.002f)
            close()
            moveTo(21.047f, 15.16f)
            lineTo(21.773f, 14.651f)
            lineTo(22.475f, 15.16f)
            lineTo(22.257f, 14.254f)
            lineTo(22.821f, 13.68f)
            horizontalLineTo(22.103f)
            lineTo(21.772f, 12.941f)
            lineTo(21.489f, 13.68f)
            horizontalLineTo(20.647f)
            lineTo(21.292f, 14.254f)
            lineTo(21.047f, 15.16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CookIslandsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.CookIslands,
            contentDescription = "Cook Islands Flag"
        )
    }
}
