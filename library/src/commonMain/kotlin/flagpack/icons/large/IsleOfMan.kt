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
 * Isle of Man Flag (32x24dp)
 *
 * - ISO Alpha-2: IM
 * - ISO Alpha-3: IMN
 * - ISO Numeric: 833
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.IsleOfMan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Isle of Man:IM:IMN:833:Large",
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
                fill = SolidColor(Color(0xFFE31D1C)),
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
                moveTo(6.094f, 4.141f)
                curveTo(6.086f, 4.048f, 6.197f, 4.004f, 6.259f, 4.072f)
                curveTo(6.708f, 4.564f, 7.895f, 5.788f, 8.582f, 5.788f)
                curveTo(9.441f, 5.788f, 12.814f, 2.945f, 13.812f, 3.408f)
                curveTo(14.809f, 3.871f, 16.828f, 8.713f, 16.828f, 8.713f)
                lineTo(15.512f, 10.363f)
                lineTo(13.812f, 9.436f)
                lineTo(13.49f, 5.788f)
                curveTo(13.49f, 5.788f, 10.217f, 7.471f, 8.582f, 6.86f)
                lineTo(7.663f, 7.633f)
                curveTo(7.663f, 7.633f, 6.777f, 5.88f, 6.429f, 5.343f)
                curveTo(6.198f, 4.989f, 6.12f, 4.459f, 6.094f, 4.141f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.262f, 8.124f)
                lineTo(7.702f, 8.464f)
                lineTo(7.809f, 7.745f)
                lineTo(7.356f, 7.236f)
                lineTo(7.982f, 7.132f)
                lineTo(8.262f, 6.478f)
                lineTo(8.542f, 7.132f)
                lineTo(9.168f, 7.236f)
                lineTo(8.715f, 7.745f)
                lineTo(8.822f, 8.464f)
                lineTo(8.262f, 8.124f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.013f, 3.792f)
                curveTo(13.013f, 3.592f, 13.175f, 3.429f, 13.375f, 3.429f)
                curveTo(13.576f, 3.429f, 13.738f, 3.592f, 13.738f, 3.792f)
                verticalLineTo(5.506f)
                curveTo(13.738f, 5.706f, 13.576f, 5.868f, 13.375f, 5.868f)
                curveTo(13.175f, 5.868f, 13.013f, 5.706f, 13.013f, 5.506f)
                lineTo(13.013f, 3.792f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(25.22f, 5.103f)
                curveTo(25.303f, 5.146f, 25.282f, 5.264f, 25.191f, 5.28f)
                curveTo(24.536f, 5.401f, 22.869f, 5.759f, 22.505f, 6.341f)
                curveTo(22.05f, 7.069f, 22.673f, 11.437f, 21.752f, 12.037f)
                curveTo(20.831f, 12.637f, 15.655f, 11.784f, 15.655f, 11.784f)
                lineTo(14.952f, 9.793f)
                lineTo(16.64f, 8.843f)
                lineTo(19.904f, 10.503f)
                curveTo(19.904f, 10.503f, 20.211f, 6.836f, 21.596f, 5.773f)
                lineTo(21.428f, 4.584f)
                curveTo(21.428f, 4.584f, 23.383f, 4.762f, 24.023f, 4.75f)
                curveTo(24.446f, 4.743f, 24.937f, 4.957f, 25.22f, 5.103f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.693f, 4.831f)
                lineTo(20.702f, 4.177f)
                lineTo(21.255f, 4.648f)
                lineTo(21.926f, 4.534f)
                lineTo(21.683f, 5.12f)
                lineTo(22.089f, 5.704f)
                lineTo(21.387f, 5.595f)
                lineTo(20.966f, 6.07f)
                lineTo(20.775f, 5.416f)
                lineTo(20.109f, 5.126f)
                lineTo(20.693f, 4.831f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.914f, 11.205f)
                curveTo(22.094f, 11.316f, 22.153f, 11.55f, 22.047f, 11.733f)
                curveTo(21.934f, 11.93f, 21.678f, 11.99f, 21.49f, 11.864f)
                lineTo(19.941f, 10.829f)
                curveTo(19.802f, 10.737f, 19.746f, 10.561f, 19.804f, 10.404f)
                curveTo(19.883f, 10.191f, 20.138f, 10.103f, 20.332f, 10.223f)
                lineTo(21.914f, 11.205f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.863f, 20.984f)
                curveTo(14.784f, 21.034f, 14.693f, 20.957f, 14.724f, 20.87f)
                curveTo(14.947f, 20.242f, 15.471f, 18.62f, 15.148f, 18.014f)
                curveTo(14.745f, 17.255f, 10.651f, 15.611f, 10.592f, 14.513f)
                curveTo(10.533f, 13.415f, 13.86f, 9.36f, 13.86f, 9.36f)
                lineTo(15.935f, 9.746f)
                lineTo(15.914f, 11.683f)
                lineTo(12.844f, 13.68f)
                curveTo(12.844f, 13.68f, 15.867f, 15.779f, 16.095f, 17.51f)
                lineTo(17.209f, 17.959f)
                curveTo(17.209f, 17.959f, 16.077f, 19.564f, 15.767f, 20.123f)
                curveTo(15.562f, 20.493f, 15.131f, 20.811f, 14.863f, 20.984f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.362f, 17.199f)
                lineTo(17.924f, 17.534f)
                lineTo(17.24f, 17.777f)
                lineTo(17.003f, 18.416f)
                lineTo(16.617f, 17.912f)
                lineTo(15.908f, 17.972f)
                lineTo(16.354f, 17.418f)
                lineTo(16.152f, 16.816f)
                lineTo(16.814f, 16.977f)
                lineTo(17.398f, 16.545f)
                lineTo(17.362f, 17.199f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.103f, 14.957f)
                curveTo(10.88f, 15.042f, 10.632f, 14.918f, 10.567f, 14.688f)
                curveTo(10.51f, 14.487f, 10.616f, 14.275f, 10.811f, 14.199f)
                lineTo(12.479f, 13.548f)
                curveTo(12.664f, 13.475f, 12.875f, 13.545f, 12.98f, 13.715f)
                curveTo(13.117f, 13.935f, 13.019f, 14.226f, 12.776f, 14.319f)
                lineTo(11.103f, 14.957f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(13.663f, 9.765f)
                curveTo(13.538f, 9.721f, 13.472f, 9.583f, 13.514f, 9.455f)
                curveTo(13.557f, 9.328f, 13.756f, 9.115f, 13.88f, 9.158f)
                lineTo(15.616f, 9.765f)
                curveTo(15.706f, 9.796f, 15.769f, 9.879f, 15.777f, 9.975f)
                lineTo(15.932f, 11.879f)
                curveTo(15.943f, 12.014f, 15.747f, 12.122f, 15.616f, 12.133f)
                curveTo(15.485f, 12.145f, 15.37f, 12.045f, 15.359f, 11.911f)
                lineTo(15.215f, 10.273f)
                lineTo(13.663f, 9.765f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(16.681f, 8.768f)
                curveTo(16.784f, 8.685f, 16.97f, 8.781f, 17.05f, 8.887f)
                curveTo(17.131f, 8.993f, 17.112f, 9.147f, 17.009f, 9.229f)
                lineTo(15.806f, 10.462f)
                curveTo(15.703f, 10.545f, 15.469f, 10.383f, 15.389f, 10.277f)
                curveTo(15.308f, 10.17f, 15.285f, 9.881f, 15.389f, 9.798f)
                lineTo(16.681f, 8.768f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun IsleOfManPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.IsleOfMan,
            contentDescription = "Isle of Man Flag"
        )
    }
}
