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
 * Grenada Flag (20x15dp)
 *
 * - ISO Alpha-2: GD
 * - ISO Alpha-3: GRD
 * - ISO Numeric: 308
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Grenada: ImageVector by lazy {
    ImageVector.Builder(
        name = "Grenada:GD:GRD:308:Medium",
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(13.75f)
                curveTo(20f, 14.44f, 19.44f, 15f, 18.75f, 15f)
                horizontalLineTo(1.25f)
                curveTo(0.56f, 15f, 0f, 14.44f, 0f, 13.75f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 3.75f)
                horizontalLineTo(16.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(3.75f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(3.75f, 3.75f)
                horizontalLineTo(16.25f)
                verticalLineTo(11.25f)
                horizontalLineTo(3.75f)
                verticalLineTo(3.75f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.75f, 3.75f)
                lineTo(10f, 7.5f)
                lineTo(3.75f, 11.25f)
                verticalLineTo(3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF23875F)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.25f, 3.75f)
                lineTo(10f, 7.5f)
                lineTo(16.25f, 11.25f)
                verticalLineTo(3.75f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(16.25f, 3.75f)
                lineTo(10f, 7.5f)
                lineTo(16.25f, 11.25f)
                verticalLineTo(3.75f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10f, 10f)
            curveTo(11.381f, 10f, 12.5f, 8.881f, 12.5f, 7.5f)
            curveTo(12.5f, 6.119f, 11.381f, 5f, 10f, 5f)
            curveTo(8.619f, 5f, 7.5f, 6.119f, 7.5f, 7.5f)
            curveTo(7.5f, 8.881f, 8.619f, 10f, 10f, 10f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.956f, 8.321f)
            lineTo(8.662f, 9.219f)
            lineTo(9.075f, 7.681f)
            lineTo(8.125f, 6.699f)
            lineTo(9.412f, 6.646f)
            lineTo(9.956f, 5.125f)
            lineTo(10.5f, 6.646f)
            horizontalLineTo(11.785f)
            lineTo(10.837f, 7.681f)
            lineTo(11.311f, 9.128f)
            lineTo(9.956f, 8.321f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.485f, 2.776f)
            lineTo(6.193f, 2.338f)
            lineTo(6.934f, 2.732f)
            lineTo(6.674f, 2.025f)
            lineTo(7.192f, 1.519f)
            horizontalLineTo(6.49f)
            lineTo(6.193f, 0.776f)
            lineTo(5.895f, 1.519f)
            lineTo(5.192f, 1.545f)
            lineTo(5.711f, 2.025f)
            lineTo(5.485f, 2.776f)
            close()
            moveTo(9.235f, 2.776f)
            lineTo(9.943f, 2.338f)
            lineTo(10.684f, 2.732f)
            lineTo(10.424f, 2.025f)
            lineTo(10.942f, 1.519f)
            horizontalLineTo(10.24f)
            lineTo(9.943f, 0.776f)
            lineTo(9.645f, 1.519f)
            lineTo(8.942f, 1.545f)
            lineTo(9.461f, 2.025f)
            lineTo(9.235f, 2.776f)
            close()
            moveTo(13.693f, 2.338f)
            lineTo(12.986f, 2.776f)
            lineTo(13.212f, 2.025f)
            lineTo(12.692f, 1.545f)
            lineTo(13.395f, 1.519f)
            lineTo(13.693f, 0.776f)
            lineTo(13.99f, 1.519f)
            horizontalLineTo(14.692f)
            lineTo(14.174f, 2.025f)
            lineTo(14.434f, 2.732f)
            lineTo(13.693f, 2.338f)
            close()
            moveTo(5.485f, 13.854f)
            lineTo(6.192f, 13.416f)
            lineTo(6.933f, 13.81f)
            lineTo(6.674f, 13.103f)
            lineTo(7.192f, 12.597f)
            horizontalLineTo(6.49f)
            lineTo(6.192f, 11.854f)
            lineTo(5.895f, 12.597f)
            lineTo(5.192f, 12.623f)
            lineTo(5.711f, 13.103f)
            lineTo(5.485f, 13.854f)
            close()
            moveTo(9.942f, 13.416f)
            lineTo(9.235f, 13.854f)
            lineTo(9.461f, 13.103f)
            lineTo(8.942f, 12.623f)
            lineTo(9.645f, 12.597f)
            lineTo(9.942f, 11.854f)
            lineTo(10.24f, 12.597f)
            horizontalLineTo(10.942f)
            lineTo(10.424f, 13.103f)
            lineTo(10.683f, 13.81f)
            lineTo(9.942f, 13.416f)
            close()
            moveTo(12.985f, 13.854f)
            lineTo(13.692f, 13.416f)
            lineTo(14.433f, 13.81f)
            lineTo(14.174f, 13.103f)
            lineTo(14.692f, 12.597f)
            horizontalLineTo(13.99f)
            lineTo(13.692f, 11.854f)
            lineTo(13.395f, 12.597f)
            lineTo(12.692f, 12.623f)
            lineTo(13.211f, 13.103f)
            lineTo(12.985f, 13.854f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC51918)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.397f, 7.983f)
            curveTo(5.397f, 7.983f, 5.733f, 8.282f, 5.917f, 8.384f)
            curveTo(5.98f, 8.145f, 5.839f, 7.602f, 5.839f, 7.602f)
            curveTo(5.799f, 7.472f, 5.365f, 7.239f, 5.365f, 7.239f)
            curveTo(5.365f, 7.239f, 5.243f, 7.649f, 5.397f, 7.983f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.747f, 8.706f)
            curveTo(5.747f, 8.706f, 4.883f, 8.303f, 4.795f, 7.731f)
            curveTo(4.707f, 7.16f, 4.893f, 6.25f, 4.893f, 6.25f)
            curveTo(4.893f, 6.25f, 6.297f, 6.569f, 6.393f, 7.254f)
            curveTo(6.488f, 7.938f, 6.171f, 8.368f, 6.171f, 8.368f)
            curveTo(6.171f, 8.368f, 5.847f, 7.534f, 5.54f, 7.441f)
            curveTo(5.54f, 7.441f, 5.54f, 8.268f, 5.747f, 8.706f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun GrenadaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Grenada,
            contentDescription = "Grenada Flag"
        )
    }
}
