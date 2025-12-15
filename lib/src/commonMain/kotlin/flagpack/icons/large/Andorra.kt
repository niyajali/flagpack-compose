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
 * Andorra Flag (32x24dp)
 *
 * - ISO Alpha-2: AD
 * - ISO Alpha-3: AND
 * - ISO Numeric: 020
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Andorra: ImageVector by lazy {
    ImageVector.Builder(
        name = "Andorra:AD:AND:020:Large",
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
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(8f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(8f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(24f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFBF9937)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.299f, 19.424f)
                curveTo(16.52f, 19.361f, 16.71f, 18.977f, 16.71f, 18.977f)
                curveTo(16.71f, 18.977f, 16.854f, 19.09f, 17.083f, 19.205f)
                curveTo(17.312f, 19.319f, 17.55f, 18.977f, 17.55f, 18.977f)
                curveTo(17.55f, 18.977f, 17.875f, 18.977f, 18.018f, 18.594f)
                curveTo(18.16f, 18.21f, 17.733f, 18.046f, 17.733f, 18.046f)
                curveTo(17.733f, 18.046f, 18.232f, 17.522f, 19.075f, 17.522f)
                curveTo(19.918f, 17.522f, 20.573f, 17.522f, 21.123f, 17.288f)
                curveTo(21.673f, 17.055f, 22.207f, 16.654f, 22.407f, 15.82f)
                curveTo(22.607f, 14.987f, 21.974f, 14.462f, 21.974f, 14.462f)
                curveTo(21.974f, 14.462f, 22.115f, 14.506f, 22.407f, 14.267f)
                curveTo(22.7f, 14.028f, 22.228f, 13.257f, 21.974f, 13.257f)
                curveTo(21.721f, 13.257f, 21.691f, 13.4f, 21.691f, 13.4f)
                curveTo(21.691f, 13.4f, 21.534f, 13.264f, 21.319f, 12.801f)
                curveTo(21.104f, 12.339f, 21.534f, 11.933f, 21.534f, 11.933f)
                curveTo(21.534f, 11.933f, 21.769f, 12.068f, 21.974f, 11.845f)
                curveTo(22.18f, 11.623f, 21.868f, 11.282f, 21.868f, 11.282f)
                curveTo(21.868f, 11.282f, 22.856f, 10.946f, 22.713f, 9.682f)
                curveTo(22.57f, 8.418f, 21.267f, 8.49f, 21.267f, 8.49f)
                curveTo(21.267f, 8.49f, 21.307f, 8.279f, 21.123f, 8.16f)
                curveTo(20.94f, 8.04f, 20.804f, 8.279f, 20.804f, 8.279f)
                curveTo(20.66f, 7.946f, 21.082f, 7.49f, 21.42f, 7.125f)
                curveTo(21.525f, 7.012f, 21.621f, 6.908f, 21.691f, 6.818f)
                curveTo(21.983f, 6.441f, 21.799f, 5.975f, 20.731f, 5.466f)
                curveTo(19.663f, 4.957f, 19.079f, 5.641f, 18.994f, 5.883f)
                curveTo(18.908f, 6.126f, 19.24f, 6.276f, 19.24f, 6.276f)
                curveTo(18.969f, 6.513f, 18.446f, 6.604f, 18.09f, 6.44f)
                curveTo(17.733f, 6.276f, 17.891f, 5.777f, 17.965f, 5.641f)
                curveTo(17.973f, 5.626f, 17.984f, 5.608f, 17.996f, 5.587f)
                curveTo(18.097f, 5.418f, 18.308f, 5.064f, 18.09f, 4.72f)
                curveTo(17.845f, 4.333f, 17.422f, 4.333f, 17.083f, 4.553f)
                curveTo(16.794f, 4.741f, 16.382f, 4.84f, 16.27f, 4.865f)
                curveTo(16.157f, 4.84f, 15.745f, 4.741f, 15.456f, 4.553f)
                curveTo(15.118f, 4.333f, 14.694f, 4.333f, 14.45f, 4.72f)
                curveTo(14.232f, 5.064f, 14.442f, 5.418f, 14.543f, 5.587f)
                curveTo(14.556f, 5.608f, 14.566f, 5.626f, 14.574f, 5.641f)
                curveTo(14.648f, 5.777f, 14.806f, 6.276f, 14.45f, 6.44f)
                curveTo(14.093f, 6.604f, 13.57f, 6.513f, 13.3f, 6.276f)
                curveTo(13.3f, 6.276f, 13.631f, 6.126f, 13.546f, 5.883f)
                curveTo(13.46f, 5.641f, 12.877f, 4.957f, 11.808f, 5.466f)
                curveTo(10.74f, 5.975f, 10.556f, 6.441f, 10.849f, 6.818f)
                curveTo(10.918f, 6.908f, 11.014f, 7.012f, 11.119f, 7.125f)
                curveTo(11.457f, 7.49f, 11.88f, 7.946f, 11.736f, 8.279f)
                curveTo(11.736f, 8.279f, 11.6f, 8.04f, 11.416f, 8.16f)
                curveTo(11.233f, 8.279f, 11.272f, 8.49f, 11.272f, 8.49f)
                curveTo(11.272f, 8.49f, 9.969f, 8.418f, 9.826f, 9.682f)
                curveTo(9.683f, 10.946f, 10.672f, 11.282f, 10.672f, 11.282f)
                curveTo(10.672f, 11.282f, 10.36f, 11.623f, 10.565f, 11.845f)
                curveTo(10.77f, 12.068f, 11.005f, 11.933f, 11.005f, 11.933f)
                curveTo(11.005f, 11.933f, 11.435f, 12.339f, 11.22f, 12.801f)
                curveTo(11.005f, 13.264f, 10.849f, 13.4f, 10.849f, 13.4f)
                curveTo(10.849f, 13.4f, 10.818f, 13.257f, 10.565f, 13.257f)
                curveTo(10.311f, 13.257f, 9.839f, 14.028f, 10.132f, 14.267f)
                curveTo(10.425f, 14.506f, 10.565f, 14.462f, 10.565f, 14.462f)
                curveTo(10.565f, 14.462f, 9.932f, 14.987f, 10.132f, 15.82f)
                curveTo(10.332f, 16.654f, 10.866f, 17.055f, 11.416f, 17.288f)
                curveTo(11.966f, 17.522f, 12.622f, 17.522f, 13.464f, 17.522f)
                curveTo(14.307f, 17.522f, 14.806f, 18.046f, 14.806f, 18.046f)
                curveTo(14.806f, 18.046f, 14.379f, 18.21f, 14.522f, 18.594f)
                curveTo(14.664f, 18.977f, 14.989f, 18.977f, 14.989f, 18.977f)
                curveTo(14.989f, 18.977f, 15.227f, 19.319f, 15.456f, 19.205f)
                curveTo(15.685f, 19.09f, 15.829f, 18.977f, 15.829f, 18.977f)
                curveTo(15.829f, 18.977f, 16.019f, 19.361f, 16.24f, 19.424f)
                verticalLineTo(19.432f)
                curveTo(16.25f, 19.432f, 16.26f, 19.431f, 16.27f, 19.43f)
                curveTo(16.279f, 19.431f, 16.289f, 19.432f, 16.299f, 19.432f)
                verticalLineTo(19.424f)
                close()
            }
            path(fill = SolidColor(Color(0xFF805440))) {
                moveTo(12.11f, 15.998f)
                lineTo(12.215f, 15.744f)
                curveTo(13.423f, 16.261f, 14.797f, 16.521f, 16.339f, 16.521f)
                curveTo(17.88f, 16.521f, 19.218f, 16.262f, 20.352f, 15.745f)
                lineTo(20.463f, 15.997f)
                curveTo(19.291f, 16.53f, 17.917f, 16.796f, 16.339f, 16.796f)
                curveTo(14.763f, 16.796f, 13.353f, 16.53f, 12.11f, 15.998f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun AndorraPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Andorra,
            contentDescription = "Andorra Flag"
        )
    }
}
