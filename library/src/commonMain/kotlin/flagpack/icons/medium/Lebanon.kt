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
 * Lebanon Flag (20x15dp)
 *
 * - ISO Alpha-2: LB
 * - ISO Alpha-3: LBN
 * - ISO Numeric: 422
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Lebanon: ImageVector by lazy {
    ImageVector.Builder(
        name = "Lebanon:LB:LBN:422:Medium",
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
                fill = SolidColor(Color(0xFFF50101)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20f, 0f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                close()
                moveTo(20f, 11.25f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 3.75f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                verticalLineTo(3.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF52AB0B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.447f, 7.821f)
                curveTo(13.493f, 8.363f, 11.493f, 7.596f, 11.493f, 7.813f)
                curveTo(11.493f, 8.03f, 13.636f, 8.411f, 13.632f, 8.897f)
                curveTo(13.629f, 9.383f, 11.091f, 8.758f, 11.66f, 8.977f)
                curveTo(12.229f, 9.195f, 13.451f, 9.718f, 13.312f, 10.044f)
                curveTo(13.016f, 10.74f, 11.046f, 9.561f, 10.882f, 9.794f)
                curveTo(10.618f, 10.169f, 12.336f, 11.043f, 12.321f, 11.127f)
                curveTo(12.293f, 11.287f, 11.148f, 10.875f, 10.882f, 11.207f)
                curveTo(10.667f, 11.147f, 10.568f, 10.857f, 10.501f, 10.819f)
                lineTo(10.078f, 5.367f)
                curveTo(10.078f, 5.367f, 10.458f, 10.5f, 9.973f, 10.648f)
                curveTo(9.488f, 10.795f, 8.141f, 11.244f, 8.101f, 11.02f)
                curveTo(8.087f, 10.936f, 9.723f, 10.169f, 9.459f, 9.794f)
                curveTo(9.264f, 9.518f, 7.289f, 10.497f, 7.163f, 9.93f)
                curveTo(6.602f, 9.525f, 8.981f, 9.175f, 8.981f, 8.761f)
                curveTo(8.981f, 8.347f, 6.805f, 9.251f, 7.065f, 8.675f)
                curveTo(7.325f, 8.099f, 9.068f, 7.893f, 9.1f, 7.813f)
                curveTo(9.16f, 7.667f, 7.163f, 8.04f, 7.163f, 7.813f)
                curveTo(7.163f, 7.383f, 8.358f, 7.299f, 9.1f, 6.912f)
                curveTo(9.144f, 6.47f, 7.3f, 7.346f, 7.163f, 6.992f)
                curveTo(7.026f, 6.639f, 9.52f, 5.722f, 9.459f, 5.651f)
                curveTo(9.363f, 5.538f, 7.353f, 6.047f, 7.684f, 5.779f)
                curveTo(8.327f, 5.261f, 9.583f, 4.556f, 9.872f, 4.367f)
                curveTo(9.872f, 4.367f, 9.907f, 4.296f, 9.944f, 4.321f)
                curveTo(9.981f, 4.296f, 10.022f, 4.27f, 10.022f, 4.27f)
                curveTo(10.022f, 4.27f, 10.022f, 4.714f, 10.016f, 4.367f)
                curveTo(10.01f, 4.021f, 12.96f, 5.537f, 12.993f, 5.921f)
                curveTo(13.032f, 6.37f, 11.17f, 5.583f, 11.214f, 6.024f)
                curveTo(11.593f, 6.258f, 12.669f, 6.712f, 13.114f, 6.912f)
                curveTo(13.315f, 7.002f, 11.628f, 6.72f, 11.663f, 6.859f)
                curveTo(11.754f, 7.212f, 13.398f, 7.255f, 13.447f, 7.821f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun LebanonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Lebanon,
            contentDescription = "Lebanon Flag"
        )
    }
}
