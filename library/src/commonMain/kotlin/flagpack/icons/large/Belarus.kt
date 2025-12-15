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
 * Belarus Flag (32x24dp)
 *
 * - ISO Alpha-2: BY
 * - ISO Alpha-3: BLR
 * - ISO Numeric: 112
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Belarus: ImageVector by lazy {
    ImageVector.Builder(
        name = "Belarus:BY:BLR:112:Large",
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
                fill = SolidColor(Color(0xFF73BE4A)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAF0100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(16f)
                horizontalLineTo(32f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(-6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.444f, 2.236f)
                lineTo(1.897f, 0.057f)
                lineTo(3.312f, 2.236f)
                lineTo(1.897f, 4.315f)
                lineTo(0.444f, 2.236f)
                close()
                moveTo(1.891f, 3.425f)
                lineTo(2.706f, 2.229f)
                lineTo(1.891f, 0.975f)
                lineTo(1.056f, 2.229f)
                lineTo(1.891f, 3.425f)
                close()
                moveTo(2f, 2.065f)
                horizontalLineTo(1.75f)
                verticalLineTo(2.581f)
                horizontalLineTo(2f)
                verticalLineTo(2.065f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.137f, 4.186f)
                lineTo(0.444f, 5.177f)
                lineTo(1.137f, 6.122f)
                lineTo(1.812f, 5.177f)
                lineTo(1.137f, 4.186f)
                close()
                moveTo(1.461f, 5.193f)
                lineTo(1.149f, 5.617f)
                lineTo(0.833f, 5.168f)
                lineTo(1.148f, 4.703f)
                lineTo(1.461f, 5.193f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.637f, 4.186f)
                lineTo(1.944f, 5.177f)
                lineTo(2.637f, 6.122f)
                lineTo(3.312f, 5.177f)
                lineTo(2.637f, 4.186f)
                close()
                moveTo(2.961f, 5.193f)
                lineTo(2.649f, 5.617f)
                lineTo(2.333f, 5.168f)
                lineTo(2.648f, 4.703f)
                lineTo(2.961f, 5.193f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.637f, 4.186f)
                lineTo(2.944f, 5.177f)
                lineTo(3.637f, 6.122f)
                lineTo(4.312f, 5.177f)
                lineTo(3.637f, 4.186f)
                close()
                moveTo(3.961f, 5.193f)
                lineTo(3.649f, 5.617f)
                lineTo(3.333f, 5.168f)
                lineTo(3.648f, 4.703f)
                lineTo(3.961f, 5.193f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.137f, 4.186f)
                lineTo(4.444f, 5.177f)
                lineTo(5.137f, 6.122f)
                lineTo(5.812f, 5.177f)
                lineTo(5.137f, 4.186f)
                close()
                moveTo(5.461f, 5.193f)
                lineTo(5.149f, 5.617f)
                lineTo(4.833f, 5.168f)
                lineTo(5.148f, 4.703f)
                lineTo(5.461f, 5.193f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.944f, 2.236f)
                lineTo(4.397f, 0.057f)
                lineTo(5.812f, 2.236f)
                lineTo(4.397f, 4.315f)
                lineTo(2.944f, 2.236f)
                close()
                moveTo(4.391f, 3.425f)
                lineTo(5.206f, 2.229f)
                lineTo(4.391f, 0.975f)
                lineTo(3.556f, 2.229f)
                lineTo(4.391f, 3.425f)
                close()
                moveTo(4.5f, 2.065f)
                horizontalLineTo(4.25f)
                verticalLineTo(2.581f)
                horizontalLineTo(4.5f)
                verticalLineTo(2.065f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB20000))) {
                moveTo(1.656f, 12.406f)
                lineTo(0.037f, 9.687f)
                lineTo(0.463f, 9.417f)
                lineTo(1.637f, 11.388f)
                lineTo(3.069f, 8.756f)
                lineTo(4.537f, 11.394f)
                lineTo(5.574f, 9.673f)
                lineTo(5.998f, 9.945f)
                lineTo(4.52f, 12.4f)
                lineTo(3.074f, 9.801f)
                lineTo(1.656f, 12.406f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 0.516f)
                horizontalLineTo(1.019f)
                verticalLineTo(1.032f)
                horizontalLineTo(0.75f)
                verticalLineTo(0.516f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 0f)
                horizontalLineTo(3.269f)
                verticalLineTo(0.516f)
                horizontalLineTo(3f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.25f, 0.516f)
                horizontalLineTo(5.519f)
                verticalLineTo(1.032f)
                horizontalLineTo(5.25f)
                verticalLineTo(0.516f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 3.613f)
                horizontalLineTo(1f)
                verticalLineTo(4.129f)
                horizontalLineTo(0.75f)
                verticalLineTo(3.613f)
                close()
                moveTo(3f, 3.613f)
                horizontalLineTo(3.25f)
                verticalLineTo(4.129f)
                horizontalLineTo(3f)
                verticalLineTo(3.613f)
                close()
                moveTo(5.5f, 3.613f)
                horizontalLineTo(5.25f)
                verticalLineTo(4.129f)
                horizontalLineTo(5.5f)
                verticalLineTo(3.613f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 6.194f)
                horizontalLineTo(1f)
                verticalLineTo(6.71f)
                horizontalLineTo(0.75f)
                verticalLineTo(6.194f)
                close()
                moveTo(3f, 6.194f)
                horizontalLineTo(3.25f)
                verticalLineTo(6.71f)
                horizontalLineTo(3f)
                verticalLineTo(6.194f)
                close()
                moveTo(5.5f, 6.194f)
                horizontalLineTo(5.25f)
                verticalLineTo(6.71f)
                horizontalLineTo(5.5f)
                verticalLineTo(6.194f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.208f, 8.955f)
                lineTo(1.544f, 9.923f)
                lineTo(0.496f, 8.036f)
                lineTo(1.876f, 5.88f)
                lineTo(3.063f, 7.759f)
                lineTo(4.249f, 5.88f)
                lineTo(5.629f, 8.036f)
                lineTo(4.581f, 9.923f)
                lineTo(3.917f, 8.955f)
                lineTo(4.442f, 7.864f)
                lineTo(4.249f, 7.422f)
                lineTo(3.129f, 9.239f)
                verticalLineTo(9.454f)
                lineTo(3.063f, 9.346f)
                lineTo(2.996f, 9.454f)
                verticalLineTo(9.239f)
                lineTo(1.876f, 7.422f)
                lineTo(1.684f, 7.864f)
                lineTo(2.208f, 8.955f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 10.581f)
                horizontalLineTo(3.25f)
                verticalLineTo(11.097f)
                horizontalLineTo(3f)
                verticalLineTo(10.581f)
                close()
                moveTo(3f, 13.161f)
                horizontalLineTo(3.25f)
                verticalLineTo(13.677f)
                horizontalLineTo(3f)
                verticalLineTo(13.161f)
                close()
                moveTo(3f, 11.355f)
                horizontalLineTo(2.75f)
                verticalLineTo(11.871f)
                horizontalLineTo(3f)
                verticalLineTo(12.129f)
                horizontalLineTo(2.75f)
                verticalLineTo(12.645f)
                horizontalLineTo(3f)
                verticalLineTo(12.387f)
                horizontalLineTo(3.25f)
                verticalLineTo(12.645f)
                horizontalLineTo(3.5f)
                verticalLineTo(12.129f)
                horizontalLineTo(3.25f)
                verticalLineTo(11.871f)
                horizontalLineTo(3.5f)
                verticalLineTo(11.355f)
                horizontalLineTo(3.25f)
                verticalLineTo(11.871f)
                horizontalLineTo(3f)
                verticalLineTo(11.355f)
                close()
                moveTo(2.25f, 11.871f)
                horizontalLineTo(2.5f)
                verticalLineTo(12.387f)
                horizontalLineTo(2.25f)
                verticalLineTo(11.871f)
                close()
                moveTo(4f, 11.871f)
                horizontalLineTo(3.75f)
                verticalLineTo(12.387f)
                horizontalLineTo(4f)
                verticalLineTo(11.871f)
                close()
                moveTo(0.5f, 11.871f)
                horizontalLineTo(0.75f)
                verticalLineTo(12.387f)
                horizontalLineTo(0.5f)
                verticalLineTo(11.871f)
                close()
                moveTo(5.75f, 11.871f)
                horizontalLineTo(5.5f)
                verticalLineTo(12.387f)
                horizontalLineTo(5.75f)
                verticalLineTo(11.871f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.444f, 21.764f)
                lineTo(1.897f, 23.943f)
                lineTo(3.312f, 21.764f)
                lineTo(1.897f, 19.685f)
                lineTo(0.444f, 21.764f)
                close()
                moveTo(1.891f, 20.575f)
                lineTo(2.706f, 21.771f)
                lineTo(1.891f, 23.025f)
                lineTo(1.056f, 21.771f)
                lineTo(1.891f, 20.575f)
                close()
                moveTo(2f, 21.935f)
                horizontalLineTo(1.75f)
                verticalLineTo(21.419f)
                horizontalLineTo(2f)
                verticalLineTo(21.935f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(1.137f, 19.814f)
                lineTo(0.444f, 18.823f)
                lineTo(1.137f, 17.878f)
                lineTo(1.812f, 18.823f)
                lineTo(1.137f, 19.814f)
                close()
                moveTo(1.461f, 18.807f)
                lineTo(1.149f, 18.383f)
                lineTo(0.833f, 18.832f)
                lineTo(1.148f, 19.297f)
                lineTo(1.461f, 18.807f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.637f, 19.814f)
                lineTo(1.944f, 18.823f)
                lineTo(2.637f, 17.878f)
                lineTo(3.312f, 18.823f)
                lineTo(2.637f, 19.814f)
                close()
                moveTo(2.961f, 18.807f)
                lineTo(2.649f, 18.383f)
                lineTo(2.333f, 18.832f)
                lineTo(2.648f, 19.297f)
                lineTo(2.961f, 18.807f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.637f, 19.814f)
                lineTo(2.944f, 18.823f)
                lineTo(3.637f, 17.878f)
                lineTo(4.312f, 18.823f)
                lineTo(3.637f, 19.814f)
                close()
                moveTo(3.961f, 18.807f)
                lineTo(3.649f, 18.383f)
                lineTo(3.333f, 18.832f)
                lineTo(3.648f, 19.297f)
                lineTo(3.961f, 18.807f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.137f, 19.814f)
                lineTo(4.444f, 18.823f)
                lineTo(5.137f, 17.878f)
                lineTo(5.812f, 18.823f)
                lineTo(5.137f, 19.814f)
                close()
                moveTo(5.461f, 18.807f)
                lineTo(5.149f, 18.383f)
                lineTo(4.833f, 18.832f)
                lineTo(5.148f, 19.297f)
                lineTo(5.461f, 18.807f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.944f, 21.764f)
                lineTo(4.397f, 23.943f)
                lineTo(5.812f, 21.764f)
                lineTo(4.397f, 19.685f)
                lineTo(2.944f, 21.764f)
                close()
                moveTo(4.391f, 20.575f)
                lineTo(5.206f, 21.771f)
                lineTo(4.391f, 23.025f)
                lineTo(3.556f, 21.771f)
                lineTo(4.391f, 20.575f)
                close()
                moveTo(4.5f, 21.935f)
                horizontalLineTo(4.25f)
                verticalLineTo(21.419f)
                horizontalLineTo(4.5f)
                verticalLineTo(21.935f)
                close()
            }
            path(fill = SolidColor(Color(0xFFB20000))) {
                moveTo(1.656f, 11.594f)
                lineTo(0.037f, 14.313f)
                lineTo(0.463f, 14.583f)
                lineTo(1.637f, 12.612f)
                lineTo(3.069f, 15.244f)
                lineTo(4.537f, 12.606f)
                lineTo(5.574f, 14.327f)
                lineTo(5.998f, 14.055f)
                lineTo(4.52f, 11.6f)
                lineTo(3.074f, 14.199f)
                lineTo(1.656f, 11.594f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 23.484f)
                horizontalLineTo(1.019f)
                verticalLineTo(22.968f)
                horizontalLineTo(0.75f)
                verticalLineTo(23.484f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 24f)
                horizontalLineTo(3.269f)
                verticalLineTo(23.484f)
                horizontalLineTo(3f)
                verticalLineTo(24f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.25f, 23.484f)
                horizontalLineTo(5.519f)
                verticalLineTo(22.968f)
                horizontalLineTo(5.25f)
                verticalLineTo(23.484f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 20.387f)
                horizontalLineTo(1f)
                verticalLineTo(19.871f)
                horizontalLineTo(0.75f)
                verticalLineTo(20.387f)
                close()
                moveTo(3f, 20.387f)
                horizontalLineTo(3.25f)
                verticalLineTo(19.871f)
                horizontalLineTo(3f)
                verticalLineTo(20.387f)
                close()
                moveTo(5.5f, 20.387f)
                horizontalLineTo(5.25f)
                verticalLineTo(19.871f)
                horizontalLineTo(5.5f)
                verticalLineTo(20.387f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0.75f, 17.806f)
                horizontalLineTo(1f)
                verticalLineTo(17.29f)
                horizontalLineTo(0.75f)
                verticalLineTo(17.806f)
                close()
                moveTo(3f, 17.806f)
                horizontalLineTo(3.25f)
                verticalLineTo(17.29f)
                horizontalLineTo(3f)
                verticalLineTo(17.806f)
                close()
                moveTo(5.5f, 17.806f)
                horizontalLineTo(5.25f)
                verticalLineTo(17.29f)
                horizontalLineTo(5.5f)
                verticalLineTo(17.806f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFB20000)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.208f, 15.193f)
                lineTo(1.544f, 14.225f)
                lineTo(0.496f, 16.111f)
                lineTo(1.876f, 18.267f)
                lineTo(3.063f, 16.388f)
                lineTo(4.249f, 18.267f)
                lineTo(5.629f, 16.111f)
                lineTo(4.581f, 14.225f)
                lineTo(3.917f, 15.193f)
                lineTo(4.442f, 16.283f)
                lineTo(4.249f, 16.726f)
                lineTo(3.129f, 14.909f)
                verticalLineTo(14.694f)
                lineTo(3.063f, 14.801f)
                lineTo(2.996f, 14.694f)
                verticalLineTo(14.909f)
                lineTo(1.876f, 16.726f)
                lineTo(1.684f, 16.283f)
                lineTo(2.208f, 15.193f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun BelarusPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Belarus,
            contentDescription = "Belarus Flag"
        )
    }
}
