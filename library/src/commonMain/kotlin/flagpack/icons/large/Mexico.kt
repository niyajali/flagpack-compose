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
 * Mexico Flag (32x24dp)
 *
 * - ISO Alpha-2: MX
 * - ISO Alpha-3: MEX
 * - ISO Numeric: 484
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Mexico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mexico:MX:MEX:484:Large",
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
                fill = SolidColor(Color(0xFFD9071E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF006923)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA8AC71)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.056f, 8.342f)
                curveTo(12.949f, 8.797f, 13.018f, 8.904f, 13.532f, 8.904f)
                curveTo(13.559f, 8.904f, 13.601f, 8.98f, 13.647f, 9.062f)
                curveTo(13.698f, 9.152f, 13.753f, 9.25f, 13.797f, 9.265f)
                curveTo(13.778f, 9.29f, 13.583f, 9.643f, 13.582f, 10.265f)
                curveTo(13.582f, 10.393f, 13.641f, 10.604f, 13.698f, 10.807f)
                curveTo(13.76f, 11.028f, 13.82f, 11.238f, 13.797f, 11.321f)
                curveTo(13.759f, 11.457f, 13.589f, 11.309f, 13.457f, 11.195f)
                curveTo(13.382f, 11.129f, 13.319f, 11.075f, 13.301f, 11.09f)
                curveTo(13.207f, 11.169f, 13.158f, 10.543f, 13.129f, 10.165f)
                curveTo(13.116f, 9.996f, 13.107f, 9.877f, 13.099f, 9.891f)
                curveTo(13.066f, 9.819f, 13.053f, 9.73f, 13.04f, 9.642f)
                curveTo(13.011f, 9.451f, 12.983f, 9.265f, 12.757f, 9.265f)
                horizontalLineTo(12.177f)
                verticalLineTo(9.692f)
                curveTo(12.177f, 9.692f, 12.513f, 9.692f, 12.513f, 10.487f)
                curveTo(12.518f, 10.606f, 12.675f, 11.65f, 13.056f, 11.656f)
                curveTo(12.833f, 11.661f, 12.834f, 11.705f, 12.835f, 11.731f)
                lineTo(12.835f, 11.736f)
                curveTo(12.835f, 12.375f, 13.37f, 12.444f, 13.869f, 12.264f)
                curveTo(14.169f, 12.155f, 14.487f, 11.944f, 14.726f, 11.683f)
                curveTo(15.063f, 11.314f, 15.104f, 10.838f, 14.662f, 10.576f)
                curveTo(14.505f, 10.483f, 14.334f, 10.447f, 14.095f, 10.434f)
                curveTo(14.142f, 10.294f, 14.098f, 10.168f, 14.063f, 10.071f)
                curveTo(14.034f, 9.989f, 14.011f, 9.927f, 14.056f, 9.891f)
                curveTo(14.556f, 9.485f, 14.601f, 9.111f, 14.236f, 8.775f)
                curveTo(14.189f, 8.732f, 14.144f, 8.673f, 14.096f, 8.612f)
                lineTo(14.096f, 8.612f)
                curveTo(14.008f, 8.497f, 13.914f, 8.376f, 13.797f, 8.342f)
                curveTo(13.851f, 8.232f, 13.924f, 8.1f, 14.016f, 7.947f)
                lineTo(13.159f, 7.432f)
                curveTo(13.003f, 7.691f, 13.029f, 7.893f, 13.052f, 8.07f)
                curveTo(13.064f, 8.167f, 13.076f, 8.256f, 13.056f, 8.342f)
                close()
                moveTo(13.988f, 11.008f)
                lineTo(13.972f, 11.025f)
                lineTo(13.983f, 11.015f)
                curveTo(13.984f, 11.012f, 13.986f, 11.01f, 13.988f, 11.008f)
                close()
                moveTo(13.534f, 11.321f)
                curveTo(13.534f, 11.321f, 13.535f, 11.321f, 13.536f, 11.321f)
                lineTo(13.536f, 11.321f)
                lineTo(13.545f, 11.319f)
                curveTo(13.542f, 11.32f, 13.538f, 11.321f, 13.536f, 11.321f)
                lineTo(13.534f, 11.321f)
                close()
                moveTo(13.099f, 11.655f)
                curveTo(13.087f, 11.655f, 13.076f, 11.655f, 13.065f, 11.656f)
                lineTo(13.084f, 11.655f)
                lineTo(13.099f, 11.655f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.384f, 7.913f)
                curveTo(14.384f, 7.913f, 13.697f, 8.446f, 13.826f, 9.014f)
                curveTo(13.954f, 9.582f, 15.308f, 9.014f, 15.144f, 8.464f)
                curveTo(14.98f, 7.913f, 14.384f, 7.913f, 14.384f, 7.913f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8F4620)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.266f, 12.403f)
                curveTo(19.266f, 12.403f, 20.191f, 9.662f, 18.721f, 8.243f)
                curveTo(17.251f, 6.823f, 15.552f, 6.918f, 15.552f, 6.918f)
                curveTo(15.552f, 6.918f, 15.062f, 7.282f, 15.552f, 7.559f)
                curveTo(16.041f, 7.836f, 15.836f, 8.102f, 15.836f, 8.102f)
                curveTo(15.836f, 8.102f, 15.016f, 7.27f, 14.472f, 7.756f)
                curveTo(13.929f, 8.243f, 14.98f, 8.169f, 14.869f, 8.535f)
                curveTo(14.758f, 8.901f, 14.286f, 10.526f, 14.975f, 11.346f)
                curveTo(15.664f, 12.167f, 14.323f, 11.988f, 14.596f, 11.988f)
                curveTo(14.869f, 11.988f, 15.836f, 12.179f, 15.836f, 11.988f)
                curveTo(15.836f, 11.797f, 16.172f, 12.731f, 16.46f, 12.731f)
                curveTo(16.747f, 12.731f, 16.969f, 12.403f, 16.969f, 12.403f)
                curveTo(16.969f, 12.403f, 17.373f, 12.731f, 17.618f, 12.731f)
                curveTo(17.864f, 12.731f, 18.721f, 12.516f, 18.721f, 12.516f)
                lineTo(17.102f, 11.152f)
                curveTo(17.102f, 11.152f, 17.199f, 10.55f, 16.969f, 10.42f)
                curveTo(16.74f, 10.289f, 18.811f, 11.574f, 18.973f, 11.988f)
                curveTo(19.136f, 12.403f, 19.266f, 12.403f, 19.266f, 12.403f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9FAB2F))) {
                moveTo(11.066f, 11.727f)
                curveTo(11.066f, 11.727f, 11.217f, 11.248f, 11.377f, 11.215f)
                curveTo(11.517f, 11.186f, 11.809f, 11.444f, 11.809f, 11.444f)
                curveTo(12.33f, 14.334f, 13.588f, 15.463f, 15.675f, 15.463f)
                curveTo(17.787f, 15.463f, 19.067f, 14.605f, 19.813f, 11.94f)
                curveTo(19.813f, 11.94f, 20.211f, 11.534f, 20.351f, 11.579f)
                curveTo(20.503f, 11.628f, 20.694f, 12.165f, 20.694f, 12.165f)
                curveTo(19.837f, 15.222f, 18.219f, 16.584f, 15.675f, 16.584f)
                curveTo(13.107f, 16.584f, 11.664f, 15.045f, 11.066f, 11.727f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2FC2DC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.334f, 13.656f)
                curveTo(13.334f, 13.656f, 16.338f, 14.294f, 17.524f, 14.294f)
                curveTo(18.71f, 14.294f, 16.484f, 15.262f, 15.615f, 15.262f)
                curveTo(15.235f, 15.262f, 14.777f, 15.031f, 14.241f, 14.571f)
                curveTo(14.145f, 14.488f, 14.238f, 14.303f, 13.946f, 14.301f)
                curveTo(13.537f, 14.297f, 13.03f, 14.201f, 13.079f, 14.143f)
                curveTo(13.125f, 14.088f, 13.719f, 14.071f, 13.662f, 14.01f)
                curveTo(13.567f, 13.91f, 13.334f, 13.656f, 13.334f, 13.656f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9AA51))) {
                moveTo(14.833f, 14.1f)
                lineTo(16.5f, 14.1f)
                arcTo(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.667f, 14.267f)
                lineTo(16.667f, 15.005f)
                arcTo(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 15.171f)
                lineTo(14.833f, 15.171f)
                arcTo(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.667f, 15.005f)
                lineTo(14.667f, 14.267f)
                arcTo(0.167f, 0.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.833f, 14.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF259485))) {
                moveTo(12.175f, 12.136f)
                curveTo(12.175f, 12.136f, 12.175f, 11.761f, 12.429f, 11.562f)
                curveTo(12.72f, 11.333f, 12.994f, 11.562f, 12.994f, 11.562f)
                curveTo(14.059f, 13.08f, 15.653f, 13.58f, 17.881f, 13.058f)
                curveTo(17.881f, 13.058f, 18.548f, 13.276f, 18.581f, 13.419f)
                curveTo(18.623f, 13.601f, 18.109f, 14.032f, 18.109f, 14.032f)
                curveTo(15.504f, 14.642f, 13.49f, 14.01f, 12.175f, 12.136f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.591f, 12.35f)
                curveTo(16.591f, 12.35f, 15.378f, 12.989f, 15.782f, 12.989f)
                curveTo(16.187f, 12.989f, 17.77f, 13.309f, 17.462f, 12.989f)
                curveTo(17.154f, 12.67f, 16.591f, 12.35f, 16.591f, 12.35f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.156f, 11.588f)
                curveTo(15.156f, 11.588f, 14.926f, 10.922f, 14.446f, 10.922f)
                curveTo(13.966f, 10.922f, 14.101f, 11.469f, 13.871f, 11.469f)
                curveTo(13.64f, 11.469f, 14.086f, 11.853f, 14.284f, 11.853f)
                curveTo(14.483f, 11.853f, 15.156f, 11.588f, 15.156f, 11.588f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun MexicoPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Mexico,
            contentDescription = "Mexico Flag"
        )
    }
}
