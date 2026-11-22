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
 * Uzbekistan Flag (20x15dp)
 *
 * - ISO Alpha-2: UZ
 * - ISO Alpha-3: UZB
 * - ISO Numeric: 860
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Uzbekistan: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uzbekistan:UZ:UZB:860:Medium",
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
                fill = SolidColor(Color(0xFF14DC5A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(0f)
                verticalLineTo(10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF0099B5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(20f)
                verticalLineTo(6.25f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFC51918)),
                strokeLineWidth = 0.9375f
            ) {
                moveTo(-1.25f, 5.781f)
                horizontalLineTo(-1.719f)
                verticalLineTo(6.25f)
                verticalLineTo(10f)
                verticalLineTo(10.469f)
                horizontalLineTo(-1.25f)
                horizontalLineTo(21.25f)
                horizontalLineTo(21.719f)
                verticalLineTo(10f)
                verticalLineTo(6.25f)
                verticalLineTo(5.781f)
                horizontalLineTo(21.25f)
                horizontalLineTo(-1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.455f, 1.501f)
                lineTo(9.84f, 1.849f)
                lineTo(10.016f, 1.141f)
                lineTo(9.427f, 0.62f)
                horizontalLineTo(10.196f)
                lineTo(10.454f, -0.05f)
                lineTo(10.756f, 0.62f)
                horizontalLineTo(11.411f)
                lineTo(10.896f, 1.141f)
                lineTo(11.144f, 1.849f)
                lineTo(10.455f, 1.501f)
                close()
                moveTo(7.306f, 3.422f)
                lineTo(7.92f, 3.074f)
                lineTo(8.609f, 3.422f)
                lineTo(8.362f, 2.714f)
                lineTo(8.877f, 2.194f)
                horizontalLineTo(8.221f)
                lineTo(7.919f, 1.523f)
                lineTo(7.661f, 2.194f)
                horizontalLineTo(6.893f)
                lineTo(7.481f, 2.714f)
                lineTo(7.306f, 3.422f)
                close()
                moveTo(5.61f, 4.721f)
                lineTo(4.996f, 5.069f)
                lineTo(5.172f, 4.361f)
                lineTo(4.583f, 3.841f)
                horizontalLineTo(5.352f)
                lineTo(5.609f, 3.171f)
                lineTo(5.912f, 3.841f)
                horizontalLineTo(6.567f)
                lineTo(6.052f, 4.361f)
                lineTo(6.299f, 5.069f)
                lineTo(5.61f, 4.721f)
                close()
                moveTo(7.956f, 4.723f)
                lineTo(7.341f, 5.072f)
                lineTo(7.517f, 4.364f)
                lineTo(6.928f, 3.843f)
                horizontalLineTo(7.697f)
                lineTo(7.955f, 3.173f)
                lineTo(8.257f, 3.843f)
                horizontalLineTo(8.912f)
                lineTo(8.397f, 4.364f)
                lineTo(8.645f, 5.072f)
                lineTo(7.956f, 4.723f)
                close()
                moveTo(10.455f, 4.723f)
                lineTo(9.841f, 5.072f)
                lineTo(10.017f, 4.364f)
                lineTo(9.428f, 3.843f)
                horizontalLineTo(10.197f)
                lineTo(10.455f, 3.173f)
                lineTo(10.757f, 3.843f)
                horizontalLineTo(11.412f)
                lineTo(10.897f, 4.364f)
                lineTo(11.145f, 5.072f)
                lineTo(10.455f, 4.723f)
                close()
                moveTo(9.806f, 3.422f)
                lineTo(10.42f, 3.074f)
                lineTo(11.109f, 3.422f)
                lineTo(10.862f, 2.714f)
                lineTo(11.377f, 2.194f)
                horizontalLineTo(10.721f)
                lineTo(10.419f, 1.523f)
                lineTo(10.161f, 2.194f)
                horizontalLineTo(9.393f)
                lineTo(9.981f, 2.714f)
                lineTo(9.806f, 3.422f)
                close()
                moveTo(12.341f, 5.072f)
                lineTo(12.955f, 4.723f)
                lineTo(13.645f, 5.072f)
                lineTo(13.397f, 4.364f)
                lineTo(13.912f, 3.843f)
                horizontalLineTo(13.257f)
                lineTo(12.955f, 3.173f)
                lineTo(12.697f, 3.843f)
                horizontalLineTo(11.928f)
                lineTo(12.517f, 4.364f)
                lineTo(12.341f, 5.072f)
                close()
                moveTo(12.92f, 3.074f)
                lineTo(12.306f, 3.422f)
                lineTo(12.481f, 2.714f)
                lineTo(11.893f, 2.194f)
                horizontalLineTo(12.661f)
                lineTo(12.919f, 1.523f)
                lineTo(13.221f, 2.194f)
                horizontalLineTo(13.877f)
                lineTo(13.362f, 2.714f)
                lineTo(13.609f, 3.422f)
                lineTo(12.92f, 3.074f)
                close()
                moveTo(12.34f, 1.849f)
                lineTo(12.955f, 1.501f)
                lineTo(13.644f, 1.849f)
                lineTo(13.396f, 1.141f)
                lineTo(13.911f, 0.62f)
                horizontalLineTo(13.256f)
                lineTo(12.954f, -0.05f)
                lineTo(12.696f, 0.62f)
                horizontalLineTo(11.927f)
                lineTo(12.516f, 1.141f)
                lineTo(12.34f, 1.849f)
                close()
                moveTo(15.455f, 4.723f)
                lineTo(14.841f, 5.072f)
                lineTo(15.017f, 4.364f)
                lineTo(14.428f, 3.843f)
                horizontalLineTo(15.197f)
                lineTo(15.455f, 3.173f)
                lineTo(15.757f, 3.843f)
                horizontalLineTo(16.412f)
                lineTo(15.897f, 4.364f)
                lineTo(16.145f, 5.072f)
                lineTo(15.455f, 4.723f)
                close()
                moveTo(14.806f, 3.422f)
                lineTo(15.42f, 3.074f)
                lineTo(16.109f, 3.422f)
                lineTo(15.862f, 2.714f)
                lineTo(16.376f, 2.194f)
                horizontalLineTo(15.721f)
                lineTo(15.419f, 1.523f)
                lineTo(15.161f, 2.194f)
                horizontalLineTo(14.393f)
                lineTo(14.981f, 2.714f)
                lineTo(14.806f, 3.422f)
                close()
                moveTo(15.455f, 1.501f)
                lineTo(14.84f, 1.849f)
                lineTo(15.016f, 1.141f)
                lineTo(14.427f, 0.62f)
                horizontalLineTo(15.196f)
                lineTo(15.454f, -0.05f)
                lineTo(15.756f, 0.62f)
                horizontalLineTo(16.411f)
                lineTo(15.896f, 1.141f)
                lineTo(16.144f, 1.849f)
                lineTo(15.455f, 1.501f)
                close()
                moveTo(3.678f, 5.15f)
                curveTo(3.678f, 5.15f, 2.168f, 4.741f, 2.197f, 3.226f)
                curveTo(2.225f, 1.712f, 3.75f, 1.318f, 3.75f, 1.318f)
                curveTo(3.127f, 1.082f, 1.284f, 1.399f, 1.25f, 3.211f)
                curveTo(1.216f, 5.023f, 3.097f, 5.38f, 3.678f, 5.15f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UzbekistanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Uzbekistan,
            contentDescription = "Uzbekistan Flag"
        )
    }
}
