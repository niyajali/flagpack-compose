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
 * Uganda Flag (32x24dp)
 *
 * - ISO Alpha-2: UG
 * - ISO Alpha-3: UGA
 * - ISO Numeric: 800
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Uganda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uganda:UG:UGA:800:Large",
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
                fill = SolidColor(Color(0xFFFECA00)),
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
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 8f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 12f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 20f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-32f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16f, 18f)
                curveTo(19.314f, 18f, 22f, 15.314f, 22f, 12f)
                curveTo(22f, 8.686f, 19.314f, 6f, 16f, 6f)
                curveTo(12.686f, 6f, 10f, 8.686f, 10f, 12f)
                curveTo(10f, 15.314f, 12.686f, 18f, 16f, 18f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.68f, 8.329f)
                lineTo(12.622f, 8.676f)
                lineTo(13.68f, 8.766f)
                curveTo(13.68f, 8.766f, 13.851f, 9.185f, 13.68f, 9.511f)
                curveTo(13.636f, 9.594f, 13.524f, 9.7f, 13.381f, 9.836f)
                curveTo(12.961f, 10.234f, 12.273f, 10.887f, 12.273f, 11.946f)
                curveTo(12.273f, 13.366f, 15.014f, 14.01f, 15.014f, 14.01f)
                verticalLineTo(14.685f)
                curveTo(15.014f, 14.685f, 15.332f, 14.882f, 13.517f, 14.882f)
                curveTo(11.943f, 14.882f, 12.042f, 15.48f, 12.096f, 15.807f)
                curveTo(12.104f, 15.857f, 12.111f, 15.901f, 12.111f, 15.935f)
                curveTo(12.111f, 16.193f, 12.868f, 15.677f, 13.222f, 15.163f)
                curveTo(13.408f, 14.892f, 14.189f, 14.906f, 14.99f, 14.981f)
                curveTo(15.053f, 14.986f, 15.637f, 16.224f, 15.13f, 16.863f)
                curveTo(14.917f, 17.131f, 14.181f, 17.166f, 13.722f, 17.188f)
                curveTo(13.487f, 17.199f, 13.325f, 17.207f, 13.34f, 17.241f)
                curveTo(13.351f, 17.266f, 13.49f, 17.258f, 13.691f, 17.246f)
                curveTo(13.943f, 17.23f, 14.292f, 17.21f, 14.614f, 17.241f)
                curveTo(14.663f, 17.245f, 14.473f, 17.41f, 14.282f, 17.576f)
                curveTo(14.084f, 17.747f, 13.885f, 17.921f, 13.941f, 17.923f)
                curveTo(14.004f, 17.926f, 14.374f, 17.722f, 14.71f, 17.536f)
                curveTo(14.987f, 17.382f, 15.242f, 17.241f, 15.281f, 17.241f)
                curveTo(15.534f, 17.241f, 15.763f, 17.272f, 15.964f, 17.299f)
                curveTo(16.299f, 17.345f, 16.556f, 17.38f, 16.718f, 17.241f)
                curveTo(16.767f, 17.198f, 16.479f, 17.128f, 16.184f, 17.058f)
                curveTo(15.881f, 16.985f, 15.572f, 16.911f, 15.621f, 16.863f)
                curveTo(15.899f, 16.586f, 15.783f, 16.006f, 15.691f, 15.55f)
                curveTo(15.65f, 15.345f, 15.614f, 15.165f, 15.621f, 15.048f)
                curveTo(15.644f, 14.633f, 16.083f, 14.851f, 16.428f, 15.022f)
                curveTo(16.579f, 15.097f, 16.712f, 15.163f, 16.784f, 15.163f)
                curveTo(17.437f, 15.163f, 16.626f, 14.337f, 16.181f, 13.883f)
                curveTo(16.142f, 13.844f, 16.106f, 13.807f, 16.074f, 13.774f)
                curveTo(15.848f, 13.54f, 16.006f, 13.571f, 16.365f, 13.642f)
                curveTo(16.639f, 13.696f, 17.029f, 13.774f, 17.454f, 13.774f)
                curveTo(18.435f, 13.774f, 19.151f, 13.455f, 18.902f, 12.592f)
                curveTo(18.738f, 12.023f, 17.84f, 11.829f, 16.901f, 11.627f)
                curveTo(16.417f, 11.522f, 15.922f, 11.415f, 15.512f, 11.254f)
                curveTo(14.502f, 10.856f, 14.554f, 10.276f, 14.597f, 9.785f)
                curveTo(14.606f, 9.69f, 14.614f, 9.598f, 14.614f, 9.511f)
                curveTo(14.614f, 8.979f, 15.512f, 8.329f, 15.512f, 8.329f)
                curveTo(15.512f, 8.329f, 15.102f, 7.642f, 14.423f, 7.642f)
                curveTo(13.743f, 7.642f, 13.68f, 8.329f, 13.68f, 8.329f)
                close()
                moveTo(15.528f, 14.576f)
                verticalLineTo(14.075f)
                curveTo(15.528f, 14.075f, 15.947f, 14.061f, 16.094f, 14.414f)
                curveTo(16.242f, 14.767f, 15.528f, 14.576f, 15.528f, 14.576f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.077f, 6.711f)
                lineTo(14.09f, 7.913f)
                lineTo(14.615f, 7.79f)
                lineTo(14.364f, 6.576f)
                lineTo(13.077f, 6.711f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.393f, 6.421f)
                lineTo(14.458f, 8.228f)
                lineTo(15.324f, 8.015f)
                lineTo(15.692f, 6.831f)
                lineTo(14.393f, 6.421f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.577f, 9.439f)
                curveTo(13.768f, 9.439f, 13.923f, 9.288f, 13.923f, 9.101f)
                curveTo(13.923f, 8.915f, 13.768f, 8.764f, 13.577f, 8.764f)
                curveTo(13.386f, 8.764f, 13.231f, 8.915f, 13.231f, 9.101f)
                curveTo(13.231f, 9.288f, 13.386f, 9.439f, 13.577f, 9.439f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.776f, 6.759f)
                lineTo(14.769f, 7.966f)
                lineTo(14.981f, 8.462f)
                lineTo(16.133f, 8.003f)
                lineTo(15.776f, 6.759f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18.119f, 15.893f)
                curveTo(18.119f, 15.893f, 19.891f, 15.101f, 19.891f, 13.994f)
                curveTo(19.891f, 12.887f, 17.013f, 11.681f, 17.013f, 11.681f)
                curveTo(17.013f, 11.681f, 15.32f, 12.068f, 16.083f, 12.587f)
                curveTo(16.846f, 13.105f, 17.869f, 13.304f, 17.869f, 13.994f)
                curveTo(17.869f, 14.684f, 18.149f, 15.342f, 17.581f, 15.342f)
                curveTo(17.013f, 15.342f, 18.119f, 15.893f, 18.119f, 15.893f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFDFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.562f, 11.478f)
                curveTo(15.562f, 11.478f, 14.935f, 11.588f, 14.965f, 11.69f)
                curveTo(15.047f, 11.972f, 15.904f, 12.338f, 16.278f, 12.592f)
                curveTo(17.041f, 13.111f, 17.764f, 13.052f, 18.302f, 12.715f)
                curveTo(18.84f, 12.377f, 15.562f, 11.478f, 15.562f, 11.478f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UgandaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Uganda,
            contentDescription = "Uganda Flag"
        )
    }
}
