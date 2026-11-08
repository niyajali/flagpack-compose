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
 * Argentina Flag (20x15dp)
 *
 * - ISO Alpha-2: AR
 * - ISO Alpha-3: ARG
 * - ISO Numeric: 032
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Argentina: ImageVector by lazy {
    ImageVector.Builder(
        name = "Argentina:AR:ARG:032:Medium",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFF58A5FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF58A5FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(10f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.345f, 9.054f)
                curveTo(10.345f, 9.054f, 9.707f, 10.379f, 9.145f, 10.65f)
                curveTo(9.388f, 10.043f, 9.477f, 8.804f, 9.477f, 8.804f)
                curveTo(9.477f, 8.804f, 8.019f, 9.381f, 7.508f, 9.276f)
                curveTo(8.123f, 8.846f, 8.977f, 8.05f, 8.977f, 8.05f)
                curveTo(8.977f, 8.05f, 7.09f, 7.433f, 7.137f, 7.171f)
                curveTo(7.988f, 7.324f, 9.159f, 7.157f, 9.159f, 7.157f)
                curveTo(9.159f, 7.157f, 7.836f, 5.57f, 7.97f, 5.452f)
                curveTo(8.172f, 5.648f, 9.758f, 6.477f, 9.758f, 6.477f)
                curveTo(9.758f, 6.477f, 9.873f, 5.065f, 10.214f, 4.589f)
                curveTo(10.255f, 4.925f, 10.734f, 6.446f, 10.734f, 6.446f)
                curveTo(10.734f, 6.446f, 11.697f, 5.483f, 12.232f, 5.483f)
                curveTo(11.997f, 5.774f, 11.441f, 7.052f, 11.441f, 7.052f)
                curveTo(11.441f, 7.052f, 12.826f, 7.031f, 13.353f, 7.29f)
                curveTo(12.715f, 7.381f, 11.597f, 7.942f, 11.597f, 7.942f)
                curveTo(11.597f, 7.942f, 13.053f, 9.046f, 12.92f, 9.276f)
                curveTo(12.139f, 8.894f, 11.235f, 8.766f, 11.235f, 8.766f)
                curveTo(11.235f, 8.766f, 11.485f, 10.303f, 11.283f, 10.65f)
                curveTo(11.086f, 10.139f, 10.345f, 9.054f, 10.345f, 9.054f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.262f, 8.339f)
                curveTo(10.607f, 8.339f, 10.887f, 8.059f, 10.887f, 7.714f)
                curveTo(10.887f, 7.368f, 10.607f, 7.089f, 10.262f, 7.089f)
                curveTo(9.916f, 7.089f, 9.637f, 7.368f, 9.637f, 7.714f)
                curveTo(9.637f, 8.059f, 9.916f, 8.339f, 10.262f, 8.339f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun ArgentinaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Argentina,
            contentDescription = "Argentina Flag"
        )
    }
}
