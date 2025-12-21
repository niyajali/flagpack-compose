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
 * Haiti Flag (32x24dp)
 *
 * - ISO Alpha-2: HT
 * - ISO Alpha-3: HTI
 * - ISO Numeric: 332
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Haiti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Haiti:HT:HTI:332:Large",
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
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 12f)
                verticalLineTo(24f)
                horizontalLineTo(32f)
                verticalLineTo(12f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(10f, 8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-12f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(10f, 8f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-12f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF279E19)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 14.578f)
                curveTo(10f, 14.578f, 12.88f, 13.821f, 16f, 13.867f)
                curveTo(19.12f, 13.913f, 22f, 14.756f, 22f, 14.756f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(14.578f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.074f, 8.901f)
                curveTo(16.074f, 8.901f, 15.142f, 8.482f, 14.493f, 8.482f)
                curveTo(13.843f, 8.482f, 13.482f, 9.122f, 13.482f, 9.122f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.281f, 9.322f)
                curveTo(16.281f, 9.322f, 15.424f, 9.015f, 14.826f, 9.015f)
                curveTo(14.228f, 9.015f, 13.895f, 9.483f, 13.895f, 9.483f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.28f, 9.677f)
                curveTo(16.28f, 9.677f, 15.647f, 9.371f, 15.204f, 9.371f)
                curveTo(14.762f, 9.371f, 14.516f, 9.838f, 14.516f, 9.838f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.02f, 10.033f)
                curveTo(16.02f, 10.033f, 15.628f, 9.726f, 15.355f, 9.726f)
                curveTo(15.082f, 9.726f, 14.93f, 10.194f, 14.93f, 10.194f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.986f, 10.275f)
                curveTo(15.986f, 10.275f, 15.83f, 10.082f, 15.72f, 10.082f)
                curveTo(15.611f, 10.082f, 15.55f, 10.377f, 15.55f, 10.377f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.926f, 8.901f)
                curveTo(15.926f, 8.901f, 16.857f, 8.482f, 17.507f, 8.482f)
                curveTo(18.157f, 8.482f, 18.518f, 9.122f, 18.518f, 9.122f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.719f, 9.322f)
                curveTo(15.719f, 9.322f, 16.576f, 9.015f, 17.174f, 9.015f)
                curveTo(17.772f, 9.015f, 18.104f, 9.483f, 18.104f, 9.483f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.719f, 9.677f)
                curveTo(15.719f, 9.677f, 16.353f, 9.371f, 16.796f, 9.371f)
                curveTo(17.238f, 9.371f, 17.484f, 9.838f, 17.484f, 9.838f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(15.98f, 10.033f)
                curveTo(15.98f, 10.033f, 16.372f, 9.726f, 16.645f, 9.726f)
                curveTo(16.918f, 9.726f, 17.07f, 10.194f, 17.07f, 10.194f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(16.014f, 10.275f)
                curveTo(16.014f, 10.275f, 16.17f, 10.082f, 16.279f, 10.082f)
                curveTo(16.389f, 10.082f, 16.449f, 10.377f, 16.449f, 10.377f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.888f, 10.398f)
                curveTo(15.888f, 10.398f, 15.773f, 11.736f, 15.773f, 12.28f)
                curveTo(15.773f, 12.824f, 15.888f, 13.999f, 15.888f, 13.999f)
                horizontalLineTo(16.181f)
                curveTo(16.181f, 13.999f, 16.181f, 12.734f, 16.181f, 12.28f)
                curveTo(16.181f, 11.825f, 16.009f, 10.398f, 16.009f, 10.398f)
                horizontalLineTo(15.888f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.732f, 11.918f)
                curveTo(14.732f, 11.918f, 14.008f, 12.306f, 14.008f, 13.454f)
                lineTo(14.732f, 14.839f)
                horizontalLineTo(16.039f)
                verticalLineTo(12.557f)
                lineTo(14.732f, 11.918f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.659f, 10.826f)
                curveTo(13.659f, 10.826f, 11.968f, 11.327f, 11.968f, 13.175f)
                lineTo(14.159f, 13.362f)
                curveTo(14.159f, 13.362f, 14.039f, 12.288f, 14.713f, 11.791f)
                lineTo(13.659f, 10.826f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.961f, 10.121f)
                lineTo(15.861f, 12.779f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.954f, 10.723f)
                lineTo(15.999f, 13.35f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.257f, 11.74f)
                lineTo(15.817f, 13.825f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.98f, 13.16f)
                lineTo(15.005f, 13.498f)
                lineTo(14.835f, 13.921f)
                horizontalLineTo(14.356f)
                lineTo(14.682f, 14.159f)
                lineTo(15.419f, 14.332f)
                verticalLineTo(13.921f)
                horizontalLineTo(16.064f)
                verticalLineTo(14.794f)
                horizontalLineTo(14.682f)
                lineTo(14.152f, 14.159f)
                curveTo(14.152f, 14.159f, 13.707f, 14.598f, 13.273f, 14.598f)
                curveTo(12.838f, 14.598f, 12.41f, 14.456f, 12.41f, 13.977f)
                curveTo(12.41f, 13.498f, 12.41f, 13.644f, 12.41f, 13.644f)
                lineTo(11.98f, 13.498f)
                verticalLineTo(13.16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(16.854f, 11.918f)
                curveTo(16.854f, 11.918f, 17.578f, 12.306f, 17.578f, 13.454f)
                lineTo(16.854f, 14.839f)
                horizontalLineTo(15.547f)
                verticalLineTo(12.557f)
                lineTo(16.854f, 11.918f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.927f, 10.826f)
                curveTo(17.927f, 10.826f, 19.618f, 11.327f, 19.618f, 13.175f)
                lineTo(17.428f, 13.362f)
                curveTo(17.428f, 13.362f, 17.547f, 12.288f, 16.873f, 11.791f)
                lineTo(17.927f, 10.826f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(18.625f, 10.121f)
                lineTo(15.725f, 12.779f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(19.633f, 10.723f)
                lineTo(15.587f, 13.35f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(20.329f, 11.74f)
                lineTo(15.769f, 13.825f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.606f, 13.16f)
                lineTo(16.581f, 13.498f)
                lineTo(16.751f, 13.921f)
                horizontalLineTo(17.231f)
                lineTo(16.904f, 14.159f)
                lineTo(16.167f, 14.332f)
                verticalLineTo(13.921f)
                horizontalLineTo(15.522f)
                verticalLineTo(14.794f)
                horizontalLineTo(16.904f)
                lineTo(17.434f, 14.159f)
                curveTo(17.434f, 14.159f, 17.879f, 14.598f, 18.314f, 14.598f)
                curveTo(18.748f, 14.598f, 19.177f, 14.456f, 19.177f, 13.977f)
                curveTo(19.177f, 13.498f, 19.177f, 13.644f, 19.177f, 13.644f)
                lineTo(19.606f, 13.498f)
                verticalLineTo(13.16f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun HaitiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Haiti,
            contentDescription = "Haiti Flag"
        )
    }
}
