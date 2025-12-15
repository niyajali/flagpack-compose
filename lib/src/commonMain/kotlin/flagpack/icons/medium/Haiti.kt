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
 * Haiti Flag (20x15dp)
 *
 * - ISO Alpha-2: HT
 * - ISO Alpha-3: HTI
 * - ISO Numeric: 332
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Haiti: ImageVector by lazy {
    ImageVector.Builder(
        name = "Haiti:HT:HTI:332:Medium",
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
                fill = SolidColor(Color(0xFF2E42A5)),
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
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 7.5f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(7.5f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(6.25f, 5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(6.25f, 5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF279E19)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.25f, 9.111f)
                curveTo(6.25f, 9.111f, 8.05f, 8.638f, 10f, 8.667f)
                curveTo(11.95f, 8.696f, 13.75f, 9.222f, 13.75f, 9.222f)
                verticalLineTo(10f)
                horizontalLineTo(6.25f)
                verticalLineTo(9.111f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.046f, 5.563f)
                curveTo(10.046f, 5.563f, 9.464f, 5.301f, 9.058f, 5.301f)
                curveTo(8.652f, 5.301f, 8.426f, 5.701f, 8.426f, 5.701f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.175f, 5.826f)
                curveTo(10.175f, 5.826f, 9.64f, 5.634f, 9.266f, 5.634f)
                curveTo(8.892f, 5.634f, 8.685f, 5.927f, 8.685f, 5.927f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.175f, 6.048f)
                curveTo(10.175f, 6.048f, 9.779f, 5.857f, 9.503f, 5.857f)
                curveTo(9.226f, 5.857f, 9.073f, 6.149f, 9.073f, 6.149f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.012f, 6.27f)
                curveTo(10.012f, 6.27f, 9.768f, 6.079f, 9.597f, 6.079f)
                curveTo(9.426f, 6.079f, 9.331f, 6.371f, 9.331f, 6.371f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.992f, 6.422f)
                curveTo(9.992f, 6.422f, 9.894f, 6.301f, 9.825f, 6.301f)
                curveTo(9.757f, 6.301f, 9.719f, 6.486f, 9.719f, 6.486f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.954f, 5.563f)
                curveTo(9.954f, 5.563f, 10.536f, 5.301f, 10.942f, 5.301f)
                curveTo(11.348f, 5.301f, 11.574f, 5.701f, 11.574f, 5.701f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.825f, 5.826f)
                curveTo(9.825f, 5.826f, 10.36f, 5.634f, 10.734f, 5.634f)
                curveTo(11.108f, 5.634f, 11.315f, 5.927f, 11.315f, 5.927f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.825f, 6.048f)
                curveTo(9.825f, 6.048f, 10.221f, 5.857f, 10.497f, 5.857f)
                curveTo(10.774f, 5.857f, 10.927f, 6.149f, 10.927f, 6.149f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(9.988f, 6.27f)
                curveTo(9.988f, 6.27f, 10.232f, 6.079f, 10.403f, 6.079f)
                curveTo(10.574f, 6.079f, 10.669f, 6.371f, 10.669f, 6.371f)
            }
            path(
                stroke = SolidColor(Color(0xFF026A16)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(10.009f, 6.422f)
                curveTo(10.009f, 6.422f, 10.106f, 6.301f, 10.175f, 6.301f)
                curveTo(10.243f, 6.301f, 10.281f, 6.486f, 10.281f, 6.486f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.93f, 6.499f)
                curveTo(9.93f, 6.499f, 9.858f, 7.335f, 9.858f, 7.675f)
                curveTo(9.858f, 8.015f, 9.93f, 8.749f, 9.93f, 8.749f)
                horizontalLineTo(10.113f)
                curveTo(10.113f, 8.749f, 10.113f, 7.959f, 10.113f, 7.675f)
                curveTo(10.113f, 7.391f, 10.006f, 6.499f, 10.006f, 6.499f)
                horizontalLineTo(9.93f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.208f, 7.449f)
                curveTo(9.208f, 7.449f, 8.755f, 7.691f, 8.755f, 8.408f)
                lineTo(9.208f, 9.274f)
                horizontalLineTo(10.024f)
                verticalLineTo(7.848f)
                lineTo(9.208f, 7.449f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.537f, 6.766f)
                curveTo(8.537f, 6.766f, 7.48f, 7.079f, 7.48f, 8.234f)
                lineTo(8.849f, 8.351f)
                curveTo(8.849f, 8.351f, 8.774f, 7.68f, 9.196f, 7.37f)
                lineTo(8.537f, 6.766f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(8.101f, 6.326f)
                lineTo(9.913f, 7.987f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.471f, 6.702f)
                lineTo(9.999f, 8.344f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.036f, 7.337f)
                lineTo(9.885f, 8.641f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.487f, 8.225f)
                lineTo(9.378f, 8.437f)
                lineTo(9.272f, 8.7f)
                horizontalLineTo(8.972f)
                lineTo(9.176f, 8.85f)
                lineTo(9.637f, 8.957f)
                verticalLineTo(8.7f)
                horizontalLineTo(10.04f)
                verticalLineTo(9.246f)
                horizontalLineTo(9.176f)
                lineTo(8.845f, 8.85f)
                curveTo(8.845f, 8.85f, 8.567f, 9.124f, 8.295f, 9.124f)
                curveTo(8.024f, 9.124f, 7.756f, 9.035f, 7.756f, 8.736f)
                curveTo(7.756f, 8.437f, 7.756f, 8.528f, 7.756f, 8.528f)
                lineTo(7.487f, 8.437f)
                verticalLineTo(8.225f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.534f, 7.449f)
                curveTo(10.534f, 7.449f, 10.986f, 7.691f, 10.986f, 8.408f)
                lineTo(10.534f, 9.274f)
                horizontalLineTo(9.717f)
                verticalLineTo(7.848f)
                lineTo(10.534f, 7.449f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0A328C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.205f, 6.766f)
                curveTo(11.205f, 6.766f, 12.261f, 7.079f, 12.261f, 8.234f)
                lineTo(10.892f, 8.351f)
                curveTo(10.892f, 8.351f, 10.967f, 7.68f, 10.546f, 7.37f)
                lineTo(11.205f, 6.766f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(11.641f, 6.326f)
                lineTo(9.828f, 7.987f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.27f, 6.702f)
                lineTo(9.742f, 8.344f)
            }
            path(
                stroke = SolidColor(Color(0xFFFFD018)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(12.706f, 7.337f)
                lineTo(9.856f, 8.641f)
            }
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.254f, 8.225f)
                lineTo(10.363f, 8.437f)
                lineTo(10.469f, 8.7f)
                horizontalLineTo(10.769f)
                lineTo(10.565f, 8.85f)
                lineTo(10.105f, 8.957f)
                verticalLineTo(8.7f)
                horizontalLineTo(9.701f)
                verticalLineTo(9.246f)
                horizontalLineTo(10.565f)
                lineTo(10.896f, 8.85f)
                curveTo(10.896f, 8.85f, 11.175f, 9.124f, 11.446f, 9.124f)
                curveTo(11.718f, 9.124f, 11.985f, 9.035f, 11.985f, 8.736f)
                curveTo(11.985f, 8.437f, 11.985f, 8.528f, 11.985f, 8.528f)
                lineTo(12.254f, 8.437f)
                verticalLineTo(8.225f)
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
            imageVector = FlagIcons.Medium.Haiti,
            contentDescription = "Haiti Flag"
        )
    }
}
