package flagpack.icons.small

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
 * Mexico Flag (16x12dp)
 *
 * - ISO Alpha-2: MX
 * - ISO Alpha-3: MEX
 * - ISO Numeric: 484
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Mexico: ImageVector by lazy {
    ImageVector.Builder(
        name = "Mexico:MX:MEX:484:Small",
        defaultWidth = 16.dp,
        defaultHeight = 12.dp,
        viewportWidth = 16f,
        viewportHeight = 12f
    ).apply {
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFD9071E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF006923)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 0f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.192f, 3.957f)
                curveTo(7.192f, 3.957f, 6.849f, 4.223f, 6.913f, 4.507f)
                curveTo(6.977f, 4.791f, 7.654f, 4.507f, 7.572f, 4.232f)
                curveTo(7.49f, 3.957f, 7.192f, 3.957f, 7.192f, 3.957f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA8AC71)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.668f, 4.634f)
                curveTo(6.411f, 4.634f, 6.304f, 4.42f, 6.357f, 4.192f)
                curveTo(6.385f, 4.071f, 6.459f, 3.916f, 6.579f, 3.716f)
                lineTo(7.008f, 3.973f)
                curveTo(6.962f, 4.05f, 6.926f, 4.116f, 6.898f, 4.171f)
                curveTo(6.988f, 4.197f, 7.077f, 4.237f, 7.149f, 4.284f)
                curveTo(7.383f, 4.438f, 7.468f, 4.712f, 7.218f, 4.915f)
                curveTo(7.17f, 4.954f, 7.091f, 5.088f, 7.048f, 5.217f)
                curveTo(7.167f, 5.224f, 7.252f, 5.242f, 7.331f, 5.288f)
                curveTo(7.552f, 5.419f, 7.531f, 5.657f, 7.363f, 5.841f)
                curveTo(7.244f, 5.972f, 7.085f, 6.078f, 6.935f, 6.132f)
                curveTo(6.685f, 6.222f, 6.418f, 6.188f, 6.418f, 5.868f)
                lineTo(6.418f, 5.866f)
                curveTo(6.417f, 5.853f, 6.416f, 5.83f, 6.528f, 5.828f)
                lineTo(6.55f, 5.828f)
                lineTo(6.542f, 5.828f)
                lineTo(6.528f, 5.828f)
                curveTo(6.338f, 5.825f, 6.297f, 5.724f, 6.273f, 5.545f)
                curveTo(6.267f, 5.5f, 6.265f, 5.456f, 6.261f, 5.363f)
                lineTo(6.259f, 5.302f)
                lineTo(6.257f, 5.243f)
                lineTo(6.256f, 5.23f)
                curveTo(6.252f, 5.172f, 6.249f, 5.133f, 6.379f, 5.133f)
                horizontalLineTo(6.089f)
                verticalLineTo(4.633f)
                horizontalLineTo(6.379f)
                curveTo(6.543f, 4.633f, 6.634f, 4.688f, 6.686f, 4.803f)
                curveTo(6.715f, 4.751f, 6.747f, 4.702f, 6.78f, 4.658f)
                curveTo(6.738f, 4.643f, 6.696f, 4.634f, 6.668f, 4.634f)
                close()
                moveTo(6.986f, 5.512f)
                lineTo(6.994f, 5.504f)
                curveTo(6.993f, 5.505f, 6.992f, 5.506f, 6.992f, 5.508f)
                lineTo(6.986f, 5.512f)
                close()
                moveTo(6.768f, 5.661f)
                curveTo(6.767f, 5.661f, 6.767f, 5.661f, 6.767f, 5.661f)
                lineTo(6.768f, 5.661f)
                lineTo(6.768f, 5.661f)
                close()
                moveTo(6.768f, 5.472f)
                lineTo(6.769f, 5.48f)
                lineTo(6.767f, 5.465f)
                lineTo(6.768f, 5.472f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF8F4620)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.633f, 6.201f)
                curveTo(9.633f, 6.201f, 10.096f, 4.831f, 9.361f, 4.121f)
                curveTo(8.625f, 3.412f, 7.776f, 3.459f, 7.776f, 3.459f)
                curveTo(7.776f, 3.459f, 7.531f, 3.641f, 7.776f, 3.78f)
                curveTo(8.021f, 3.918f, 7.918f, 4.051f, 7.918f, 4.051f)
                curveTo(7.918f, 4.051f, 7.508f, 3.635f, 7.236f, 3.878f)
                curveTo(6.964f, 4.121f, 7.49f, 4.084f, 7.435f, 4.267f)
                curveTo(7.379f, 4.45f, 7.143f, 5.263f, 7.488f, 5.673f)
                curveTo(7.832f, 6.083f, 7.162f, 5.994f, 7.298f, 5.994f)
                curveTo(7.435f, 5.994f, 7.918f, 6.09f, 7.918f, 5.994f)
                curveTo(7.918f, 5.899f, 8.086f, 6.365f, 8.23f, 6.365f)
                curveTo(8.374f, 6.365f, 8.485f, 6.201f, 8.485f, 6.201f)
                curveTo(8.485f, 6.201f, 8.686f, 6.365f, 8.809f, 6.365f)
                curveTo(8.932f, 6.365f, 9.361f, 6.258f, 9.361f, 6.258f)
                lineTo(8.551f, 5.576f)
                curveTo(8.551f, 5.576f, 8.6f, 5.275f, 8.485f, 5.21f)
                curveTo(8.37f, 5.145f, 9.406f, 5.787f, 9.487f, 5.994f)
                curveTo(9.568f, 6.201f, 9.633f, 6.201f, 9.633f, 6.201f)
                close()
            }
            path(fill = SolidColor(Color(0xFF9FAB2F))) {
                moveTo(5.533f, 5.863f)
                curveTo(5.533f, 5.863f, 5.608f, 5.624f, 5.689f, 5.607f)
                curveTo(5.758f, 5.593f, 5.905f, 5.722f, 5.905f, 5.722f)
                curveTo(6.165f, 7.167f, 6.794f, 7.731f, 7.838f, 7.731f)
                curveTo(8.893f, 7.731f, 9.533f, 7.303f, 9.907f, 5.97f)
                curveTo(9.907f, 5.97f, 10.105f, 5.767f, 10.175f, 5.79f)
                curveTo(10.252f, 5.814f, 10.347f, 6.082f, 10.347f, 6.082f)
                curveTo(10.252f, 7.641f, 9.127f, 8.564f, 7.855f, 8.564f)
                curveTo(6.571f, 8.564f, 5.522f, 7.529f, 5.533f, 5.863f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF2FC2DC)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.667f, 6.828f)
                curveTo(6.667f, 6.828f, 8.169f, 7.147f, 8.762f, 7.147f)
                curveTo(9.355f, 7.147f, 8.242f, 7.631f, 7.808f, 7.631f)
                curveTo(7.373f, 7.631f, 6.667f, 6.828f, 6.667f, 6.828f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF9AA51))) {
                moveTo(7.417f, 7.05f)
                lineTo(8.25f, 7.05f)
                arcTo(0.083f, 0.083f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.333f, 7.133f)
                lineTo(8.333f, 7.502f)
                arcTo(0.083f, 0.083f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.25f, 7.586f)
                lineTo(7.417f, 7.586f)
                arcTo(0.083f, 0.083f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.333f, 7.502f)
                lineTo(7.333f, 7.133f)
                arcTo(0.083f, 0.083f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.417f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF259485))) {
                moveTo(6.088f, 6.068f)
                lineTo(6.497f, 5.781f)
                curveTo(7.03f, 6.54f, 7.826f, 6.79f, 8.941f, 6.529f)
                lineTo(9.055f, 7.016f)
                curveTo(7.752f, 7.321f, 6.745f, 7.005f, 6.088f, 6.068f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.296f, 6.175f)
                curveTo(8.296f, 6.175f, 7.689f, 6.495f, 7.891f, 6.495f)
                curveTo(8.093f, 6.495f, 8.885f, 6.654f, 8.731f, 6.495f)
                curveTo(8.577f, 6.335f, 8.296f, 6.175f, 8.296f, 6.175f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFCCA3D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.578f, 5.794f)
                curveTo(7.578f, 5.794f, 7.463f, 5.461f, 7.223f, 5.461f)
                curveTo(6.983f, 5.461f, 7.051f, 5.734f, 6.935f, 5.734f)
                curveTo(6.82f, 5.734f, 7.043f, 5.927f, 7.142f, 5.927f)
                curveTo(7.242f, 5.927f, 7.578f, 5.794f, 7.578f, 5.794f)
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
            imageVector = FlagIcons.Small.Mexico,
            contentDescription = "Mexico Flag"
        )
    }
}
