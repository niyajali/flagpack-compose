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
 * Bonaire Flag (16x12dp)
 *
 * - ISO Alpha-2: BQ-BO
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Bonaire: ImageVector by lazy {
    ImageVector.Builder(
        name = "Bonaire:BQ-BO:::Small",
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
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(16f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEDA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 5.467f)
                verticalLineTo(0f)
                horizontalLineTo(8f)
                lineTo(0f, 5.467f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF00268D)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                horizontalLineTo(16.004f)
                verticalLineTo(0f)
                lineTo(0f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.677f, 2.5f)
                lineTo(4.94f, 3.066f)
                curveTo(6.013f, 3.194f, 6.849f, 4.094f, 6.876f, 5.195f)
                lineTo(7.353f, 5.433f)
                lineTo(6.832f, 5.694f)
                curveTo(6.645f, 6.605f, 5.895f, 7.311f, 4.961f, 7.432f)
                lineTo(4.677f, 8f)
                lineTo(4.393f, 7.432f)
                curveTo(3.459f, 7.311f, 2.708f, 6.605f, 2.522f, 5.694f)
                lineTo(2f, 5.433f)
                lineTo(2.477f, 5.195f)
                curveTo(2.504f, 4.1f, 3.331f, 3.204f, 4.395f, 3.068f)
                lineTo(4.677f, 2.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(4.677f, 2.5f)
                lineTo(4.94f, 3.066f)
                curveTo(6.013f, 3.194f, 6.849f, 4.094f, 6.876f, 5.195f)
                lineTo(7.353f, 5.433f)
                lineTo(6.832f, 5.694f)
                curveTo(6.645f, 6.605f, 5.895f, 7.311f, 4.961f, 7.432f)
                lineTo(4.677f, 8f)
                lineTo(4.393f, 7.432f)
                curveTo(3.459f, 7.311f, 2.708f, 6.605f, 2.522f, 5.694f)
                lineTo(2f, 5.433f)
                lineTo(2.477f, 5.195f)
                curveTo(2.504f, 4.1f, 3.331f, 3.204f, 4.395f, 3.068f)
                lineTo(4.677f, 2.5f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.94f, 3.066f)
                lineTo(4.487f, 3.277f)
                lineTo(4.604f, 3.529f)
                lineTo(4.881f, 3.562f)
                lineTo(4.94f, 3.066f)
                close()
                moveTo(4.677f, 2.5f)
                lineTo(5.13f, 2.289f)
                lineTo(4.691f, 1.346f)
                lineTo(4.229f, 2.278f)
                lineTo(4.677f, 2.5f)
                close()
                moveTo(6.876f, 5.195f)
                lineTo(6.376f, 5.207f)
                lineTo(6.384f, 5.507f)
                lineTo(6.652f, 5.642f)
                lineTo(6.876f, 5.195f)
                close()
                moveTo(7.353f, 5.433f)
                lineTo(7.577f, 5.881f)
                lineTo(8.471f, 5.433f)
                lineTo(7.577f, 4.986f)
                lineTo(7.353f, 5.433f)
                close()
                moveTo(6.832f, 5.694f)
                lineTo(6.608f, 5.247f)
                lineTo(6.391f, 5.356f)
                lineTo(6.342f, 5.594f)
                lineTo(6.832f, 5.694f)
                close()
                moveTo(4.961f, 7.432f)
                lineTo(4.897f, 6.936f)
                lineTo(4.633f, 6.97f)
                lineTo(4.514f, 7.208f)
                lineTo(4.961f, 7.432f)
                close()
                moveTo(4.677f, 8f)
                lineTo(4.229f, 8.224f)
                lineTo(4.677f, 9.118f)
                lineTo(5.124f, 8.224f)
                lineTo(4.677f, 8f)
                close()
                moveTo(4.393f, 7.432f)
                lineTo(4.84f, 7.208f)
                lineTo(4.721f, 6.97f)
                lineTo(4.457f, 6.936f)
                lineTo(4.393f, 7.432f)
                close()
                moveTo(2.522f, 5.694f)
                lineTo(3.011f, 5.594f)
                lineTo(2.963f, 5.356f)
                lineTo(2.745f, 5.247f)
                lineTo(2.522f, 5.694f)
                close()
                moveTo(2f, 5.433f)
                lineTo(1.776f, 4.986f)
                lineTo(0.882f, 5.433f)
                lineTo(1.776f, 5.881f)
                lineTo(2f, 5.433f)
                close()
                moveTo(2.477f, 5.195f)
                lineTo(2.701f, 5.642f)
                lineTo(2.97f, 5.507f)
                lineTo(2.977f, 5.207f)
                lineTo(2.477f, 5.195f)
                close()
                moveTo(4.395f, 3.068f)
                lineTo(4.459f, 3.564f)
                lineTo(4.724f, 3.53f)
                lineTo(4.843f, 3.29f)
                lineTo(4.395f, 3.068f)
                close()
                moveTo(5.393f, 2.855f)
                lineTo(5.13f, 2.289f)
                lineTo(4.223f, 2.711f)
                lineTo(4.487f, 3.277f)
                lineTo(5.393f, 2.855f)
                close()
                moveTo(7.376f, 5.182f)
                curveTo(7.342f, 3.831f, 6.317f, 2.726f, 4.999f, 2.569f)
                lineTo(4.881f, 3.562f)
                curveTo(5.709f, 3.661f, 6.355f, 4.357f, 6.376f, 5.207f)
                lineTo(7.376f, 5.182f)
                close()
                moveTo(7.577f, 4.986f)
                lineTo(7.1f, 4.747f)
                lineTo(6.652f, 5.642f)
                lineTo(7.13f, 5.881f)
                lineTo(7.577f, 4.986f)
                close()
                moveTo(7.055f, 6.141f)
                lineTo(7.577f, 5.881f)
                lineTo(7.13f, 4.986f)
                lineTo(6.608f, 5.247f)
                lineTo(7.055f, 6.141f)
                close()
                moveTo(5.025f, 7.928f)
                curveTo(6.172f, 7.78f, 7.092f, 6.914f, 7.322f, 5.794f)
                lineTo(6.342f, 5.594f)
                curveTo(6.198f, 6.297f, 5.617f, 6.843f, 4.897f, 6.936f)
                lineTo(5.025f, 7.928f)
                close()
                moveTo(4.514f, 7.208f)
                lineTo(4.229f, 7.776f)
                lineTo(5.124f, 8.224f)
                lineTo(5.408f, 7.655f)
                lineTo(4.514f, 7.208f)
                close()
                moveTo(5.124f, 7.776f)
                lineTo(4.84f, 7.208f)
                lineTo(3.945f, 7.655f)
                lineTo(4.229f, 8.224f)
                lineTo(5.124f, 7.776f)
                close()
                moveTo(2.032f, 5.794f)
                curveTo(2.261f, 6.914f, 3.181f, 7.78f, 4.329f, 7.928f)
                lineTo(4.457f, 6.936f)
                curveTo(3.736f, 6.843f, 3.156f, 6.297f, 3.011f, 5.594f)
                lineTo(2.032f, 5.794f)
                close()
                moveTo(1.776f, 5.881f)
                lineTo(2.298f, 6.141f)
                lineTo(2.745f, 5.247f)
                lineTo(2.224f, 4.986f)
                lineTo(1.776f, 5.881f)
                close()
                moveTo(2.254f, 4.747f)
                lineTo(1.776f, 4.986f)
                lineTo(2.224f, 5.881f)
                lineTo(2.701f, 5.642f)
                lineTo(2.254f, 4.747f)
                close()
                moveTo(4.332f, 2.572f)
                curveTo(3.025f, 2.739f, 2.011f, 3.838f, 1.977f, 5.182f)
                lineTo(2.977f, 5.207f)
                curveTo(2.998f, 4.362f, 3.637f, 3.669f, 4.459f, 3.564f)
                lineTo(4.332f, 2.572f)
                close()
                moveTo(4.229f, 2.278f)
                lineTo(3.947f, 2.846f)
                lineTo(4.843f, 3.29f)
                lineTo(5.125f, 2.722f)
                lineTo(4.229f, 2.278f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFF00A17)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.688f, 4.15f)
            lineTo(4.363f, 4.695f)
            horizontalLineTo(3.723f)
            lineTo(4.042f, 5.267f)
            lineTo(3.723f, 5.815f)
            horizontalLineTo(4.363f)
            lineTo(4.688f, 6.375f)
            lineTo(5.017f, 5.815f)
            horizontalLineTo(5.652f)
            lineTo(5.34f, 5.267f)
            lineTo(5.652f, 4.695f)
            horizontalLineTo(5.017f)
            lineTo(4.688f, 4.15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BonairePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Bonaire,
            contentDescription = "Bonaire Flag"
        )
    }
}
