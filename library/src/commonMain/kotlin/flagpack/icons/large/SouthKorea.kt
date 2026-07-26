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
 * South Korea Flag (32x24dp)
 *
 * - ISO Alpha-2: KR
 * - ISO Alpha-3: KOR
 * - ISO Numeric: 410
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.SouthKorea: ImageVector by lazy {
    ImageVector.Builder(
        name = "South Korea:KR:KOR:410:Large",
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
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 18.219f)
                curveTo(19.203f, 18.219f, 21.799f, 15.462f, 21.799f, 12.061f)
                curveTo(21.799f, 8.66f, 19.203f, 5.902f, 16f, 5.902f)
                curveTo(12.797f, 5.902f, 10.201f, 8.66f, 10.201f, 12.061f)
                curveTo(10.201f, 15.462f, 12.797f, 18.219f, 16f, 18.219f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(16f, 18.219f)
                curveTo(19.203f, 18.219f, 21.799f, 15.462f, 21.799f, 12.061f)
                curveTo(21.799f, 8.66f, 19.203f, 5.902f, 16f, 5.902f)
                curveTo(12.797f, 5.902f, 10.201f, 8.66f, 10.201f, 12.061f)
                curveTo(10.201f, 15.462f, 12.797f, 18.219f, 16f, 18.219f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22.002f, 12.533f)
                curveTo(22.002f, 12.533f, 21.676f, 9.629f, 19.266f, 9.471f)
                curveTo(16.855f, 9.314f, 16.205f, 11.601f, 16.066f, 12.207f)
                curveTo(15.927f, 12.813f, 15.575f, 14.429f, 13.037f, 14.429f)
                curveTo(10.498f, 14.429f, 10.269f, 10.319f, 10.269f, 10.319f)
                verticalLineTo(5.472f)
                horizontalLineTo(22.002f)
                verticalLineTo(12.533f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.299f, 2.052f)
            lineTo(8.214f, 2.88f)
            lineTo(3.974f, 7.832f)
            lineTo(3.059f, 7.004f)
            lineTo(7.299f, 2.052f)
            close()
            moveTo(8.808f, 3.391f)
            lineTo(9.723f, 4.219f)
            lineTo(5.635f, 9.099f)
            lineTo(4.72f, 8.271f)
            lineTo(8.808f, 3.391f)
            close()
            moveTo(11.225f, 5.575f)
            lineTo(10.31f, 4.747f)
            lineTo(6.211f, 9.664f)
            lineTo(7.126f, 10.492f)
            lineTo(11.225f, 5.575f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(25.364f, 1.705f)
            lineTo(24.448f, 2.53f)
            lineTo(26.036f, 4.392f)
            lineTo(26.951f, 3.568f)
            lineTo(25.364f, 1.705f)
            close()
            moveTo(28.185f, 5.132f)
            lineTo(27.27f, 5.956f)
            lineTo(28.858f, 7.819f)
            lineTo(29.773f, 6.995f)
            lineTo(28.185f, 5.132f)
            close()
            moveTo(21.428f, 5.213f)
            lineTo(22.343f, 4.388f)
            lineTo(23.931f, 6.251f)
            lineTo(23.015f, 7.076f)
            lineTo(21.428f, 5.213f)
            close()
            moveTo(25.165f, 7.815f)
            lineTo(24.25f, 8.639f)
            lineTo(25.837f, 10.502f)
            lineTo(26.752f, 9.678f)
            lineTo(25.165f, 7.815f)
            close()
            moveTo(22.996f, 3.831f)
            lineTo(23.911f, 3.007f)
            lineTo(28.329f, 8.388f)
            lineTo(27.414f, 9.212f)
            lineTo(22.996f, 3.831f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(26.055f, 14.243f)
            lineTo(25.132f, 13.415f)
            lineTo(23.531f, 15.286f)
            lineTo(24.454f, 16.113f)
            lineTo(26.055f, 14.243f)
            close()
            moveTo(23.364f, 17.534f)
            lineTo(22.441f, 16.706f)
            lineTo(20.84f, 18.577f)
            lineTo(21.763f, 19.404f)
            lineTo(23.364f, 17.534f)
            close()
            moveTo(28.046f, 16.033f)
            lineTo(28.969f, 16.861f)
            lineTo(27.369f, 18.731f)
            lineTo(26.446f, 17.903f)
            lineTo(28.046f, 16.033f)
            close()
            moveTo(26.41f, 20.228f)
            lineTo(25.487f, 19.4f)
            lineTo(23.886f, 21.27f)
            lineTo(24.809f, 22.098f)
            lineTo(26.41f, 20.228f)
            close()
            moveTo(23.966f, 17.978f)
            lineTo(24.889f, 18.806f)
            lineTo(23.218f, 20.803f)
            lineTo(22.296f, 19.975f)
            lineTo(23.966f, 17.978f)
            close()
            moveTo(27.631f, 15.478f)
            lineTo(26.708f, 14.651f)
            lineTo(25.037f, 16.647f)
            lineTo(25.96f, 17.475f)
            lineTo(27.631f, 15.478f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF272727)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.407f, 14.89f)
            lineTo(7.322f, 14.064f)
            lineTo(11.406f, 18.745f)
            lineTo(10.491f, 19.57f)
            lineTo(6.407f, 14.89f)
            close()
            moveTo(7.359f, 18.983f)
            lineTo(8.275f, 18.158f)
            lineTo(10f, 20.054f)
            lineTo(9.085f, 20.879f)
            lineTo(7.359f, 18.983f)
            close()
            moveTo(4.309f, 16.691f)
            lineTo(3.394f, 17.516f)
            lineTo(7.5f, 22.26f)
            lineTo(8.415f, 21.434f)
            lineTo(4.309f, 16.691f)
            close()
            moveTo(4.961f, 16.152f)
            lineTo(5.876f, 15.327f)
            lineTo(7.371f, 17.081f)
            lineTo(6.456f, 17.906f)
            lineTo(4.961f, 16.152f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SouthKoreaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.SouthKorea,
            contentDescription = "South Korea Flag"
        )
    }
}
