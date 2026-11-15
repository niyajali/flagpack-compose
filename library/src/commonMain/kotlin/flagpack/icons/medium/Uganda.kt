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
 * Uganda Flag (20x15dp)
 *
 * - ISO Alpha-2: UG
 * - ISO Alpha-3: UGA
 * - ISO Numeric: 800
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Uganda: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uganda:UG:UGA:800:Medium",
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
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(0f, 7.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD74800))) {
                moveTo(0f, 12.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 11.25f)
                curveTo(12.071f, 11.25f, 13.75f, 9.571f, 13.75f, 7.5f)
                curveTo(13.75f, 5.429f, 12.071f, 3.75f, 10f, 3.75f)
                curveTo(7.929f, 3.75f, 6.25f, 5.429f, 6.25f, 7.5f)
                curveTo(6.25f, 9.571f, 7.929f, 11.25f, 10f, 11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF272727)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.55f, 5.205f)
                lineTo(7.889f, 5.422f)
                lineTo(8.55f, 5.479f)
                curveTo(8.55f, 5.479f, 8.657f, 5.74f, 8.55f, 5.945f)
                curveTo(8.523f, 5.996f, 8.453f, 6.063f, 8.363f, 6.148f)
                curveTo(8.101f, 6.397f, 7.671f, 6.804f, 7.671f, 7.466f)
                curveTo(7.671f, 8.354f, 9.384f, 8.756f, 9.384f, 8.756f)
                verticalLineTo(9.178f)
                curveTo(9.384f, 9.178f, 9.582f, 9.302f, 8.448f, 9.302f)
                curveTo(7.465f, 9.302f, 7.526f, 9.675f, 7.56f, 9.879f)
                curveTo(7.565f, 9.911f, 7.569f, 9.938f, 7.569f, 9.959f)
                curveTo(7.569f, 10.121f, 8.042f, 9.798f, 8.264f, 9.477f)
                curveTo(8.38f, 9.307f, 8.868f, 9.316f, 9.369f, 9.363f)
                curveTo(9.408f, 9.366f, 9.773f, 10.14f, 9.456f, 10.539f)
                curveTo(9.323f, 10.707f, 8.863f, 10.729f, 8.576f, 10.743f)
                curveTo(8.43f, 10.75f, 8.328f, 10.755f, 8.337f, 10.775f)
                curveTo(8.344f, 10.791f, 8.431f, 10.786f, 8.557f, 10.778f)
                curveTo(8.714f, 10.769f, 8.932f, 10.756f, 9.134f, 10.775f)
                curveTo(9.164f, 10.778f, 9.046f, 10.881f, 8.926f, 10.985f)
                curveTo(8.803f, 11.092f, 8.678f, 11.2f, 8.713f, 11.202f)
                curveTo(8.753f, 11.204f, 8.984f, 11.076f, 9.193f, 10.96f)
                curveTo(9.367f, 10.864f, 9.526f, 10.775f, 9.55f, 10.775f)
                curveTo(9.709f, 10.775f, 9.852f, 10.795f, 9.977f, 10.812f)
                curveTo(10.187f, 10.841f, 10.347f, 10.863f, 10.448f, 10.775f)
                curveTo(10.48f, 10.749f, 10.299f, 10.705f, 10.115f, 10.661f)
                curveTo(9.926f, 10.616f, 9.732f, 10.569f, 9.763f, 10.539f)
                curveTo(9.937f, 10.366f, 9.864f, 10.004f, 9.807f, 9.719f)
                curveTo(9.781f, 9.591f, 9.759f, 9.478f, 9.763f, 9.405f)
                curveTo(9.778f, 9.146f, 10.052f, 9.282f, 10.267f, 9.389f)
                curveTo(10.362f, 9.435f, 10.445f, 9.477f, 10.49f, 9.477f)
                curveTo(10.898f, 9.477f, 10.392f, 8.96f, 10.113f, 8.677f)
                curveTo(10.089f, 8.652f, 10.066f, 8.629f, 10.046f, 8.609f)
                curveTo(9.905f, 8.462f, 10.004f, 8.482f, 10.228f, 8.526f)
                curveTo(10.399f, 8.56f, 10.643f, 8.609f, 10.909f, 8.609f)
                curveTo(11.522f, 8.609f, 11.969f, 8.409f, 11.814f, 7.87f)
                curveTo(11.711f, 7.514f, 11.15f, 7.393f, 10.563f, 7.267f)
                curveTo(10.261f, 7.201f, 9.951f, 7.135f, 9.695f, 7.034f)
                curveTo(9.064f, 6.785f, 9.096f, 6.422f, 9.123f, 6.116f)
                curveTo(9.129f, 6.056f, 9.134f, 5.999f, 9.134f, 5.945f)
                curveTo(9.134f, 5.612f, 9.695f, 5.205f, 9.695f, 5.205f)
                curveTo(9.695f, 5.205f, 9.439f, 4.776f, 9.014f, 4.776f)
                curveTo(8.589f, 4.776f, 8.55f, 5.205f, 8.55f, 5.205f)
                close()
                moveTo(9.705f, 9.11f)
                verticalLineTo(8.797f)
                curveTo(9.705f, 8.797f, 9.967f, 8.788f, 10.059f, 9.009f)
                curveTo(10.151f, 9.229f, 9.705f, 9.11f, 9.705f, 9.11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.173f, 4.195f)
                lineTo(8.807f, 4.946f)
                lineTo(9.135f, 4.869f)
                lineTo(8.977f, 4.11f)
                lineTo(8.173f, 4.195f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.995f, 4.013f)
                lineTo(9.036f, 5.142f)
                lineTo(9.577f, 5.009f)
                lineTo(9.808f, 4.27f)
                lineTo(8.995f, 4.013f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.486f, 5.899f)
                curveTo(8.605f, 5.899f, 8.702f, 5.805f, 8.702f, 5.688f)
                curveTo(8.702f, 5.572f, 8.605f, 5.477f, 8.486f, 5.477f)
                curveTo(8.366f, 5.477f, 8.269f, 5.572f, 8.269f, 5.688f)
                curveTo(8.269f, 5.805f, 8.366f, 5.899f, 8.486f, 5.899f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.86f, 4.225f)
                lineTo(9.23f, 4.979f)
                lineTo(9.363f, 5.289f)
                lineTo(10.083f, 5.002f)
                lineTo(9.86f, 4.225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD74800)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.324f, 9.933f)
                curveTo(11.324f, 9.933f, 12.432f, 9.438f, 12.432f, 8.746f)
                curveTo(12.432f, 8.054f, 10.633f, 7.3f, 10.633f, 7.3f)
                curveTo(10.633f, 7.3f, 9.575f, 7.543f, 10.052f, 7.867f)
                curveTo(10.529f, 8.191f, 11.168f, 8.315f, 11.168f, 8.746f)
                curveTo(11.168f, 9.177f, 11.343f, 9.588f, 10.988f, 9.588f)
                curveTo(10.633f, 9.588f, 11.324f, 9.933f, 11.324f, 9.933f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFFDFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.726f, 7.174f)
                curveTo(9.726f, 7.174f, 9.334f, 7.243f, 9.353f, 7.306f)
                curveTo(9.404f, 7.482f, 9.94f, 7.711f, 10.173f, 7.87f)
                curveTo(10.65f, 8.194f, 11.102f, 8.158f, 11.439f, 7.947f)
                curveTo(11.775f, 7.736f, 9.726f, 7.174f, 9.726f, 7.174f)
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
            imageVector = FlagIcons.Medium.Uganda,
            contentDescription = "Uganda Flag"
        )
    }
}
