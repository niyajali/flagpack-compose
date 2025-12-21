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
 * Ecuador Flag (16x12dp)
 *
 * - ISO Alpha-2: EC
 * - ISO Alpha-3: ECU
 * - ISO Numeric: 218
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Ecuador: ImageVector by lazy {
    ImageVector.Builder(
        name = "Ecuador:EC:ECU:218:Small",
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
                fill = SolidColor(Color(0xFF2E42A5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(0f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7B2900)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.606f, 2.896f)
                curveTo(4.546f, 2.76f, 6.862f, 2.073f, 7.035f, 2.073f)
                curveTo(7.209f, 2.073f, 7.428f, 2.484f, 7.428f, 2.484f)
                lineTo(8.836f, 2.598f)
                curveTo(8.836f, 2.598f, 8.67f, 2.073f, 8.836f, 2.073f)
                curveTo(9.003f, 2.073f, 11.552f, 2.959f, 11.552f, 2.959f)
                curveTo(11.552f, 2.959f, 8.365f, 3.343f, 8.365f, 3.429f)
                curveTo(8.365f, 3.516f, 8.574f, 3.991f, 8.574f, 3.991f)
                lineTo(7.984f, 4.184f)
                curveTo(7.984f, 4.184f, 8.019f, 3.611f, 7.923f, 3.611f)
                curveTo(7.827f, 3.611f, 7.542f, 4.296f, 7.542f, 4.296f)
                lineTo(7.262f, 3.429f)
                curveTo(7.262f, 3.429f, 4.667f, 3.032f, 4.606f, 2.896f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFECA00))) {
                moveTo(4.616f, 5.009f)
                lineTo(5.247f, 5.16f)
                curveTo(4.587f, 7.918f, 5.197f, 9.241f, 7.074f, 9.364f)
                lineTo(7.032f, 10.01f)
                curveTo(4.679f, 9.856f, 3.875f, 8.111f, 4.616f, 5.009f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(5f, 4.637f)
                lineTo(5.641f, 4.737f)
                curveTo(5.189f, 7.624f, 5.551f, 8.929f, 6.564f, 8.893f)
                lineTo(6.587f, 9.541f)
                curveTo(4.967f, 9.598f, 4.492f, 7.883f, 5f, 4.637f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE10001))) {
                moveTo(5.648f, 4.372f)
                lineTo(6.289f, 4.473f)
                curveTo(5.837f, 7.359f, 6.199f, 8.664f, 7.213f, 8.628f)
                lineTo(7.235f, 9.276f)
                curveTo(5.616f, 9.333f, 5.14f, 7.619f, 5.648f, 4.372f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(6.851f, 9.637f)
                lineTo(7.496f, 9.574f)
                curveTo(7.549f, 10.12f, 7.509f, 10.591f, 7.371f, 10.987f)
                lineTo(6.759f, 10.773f)
                curveTo(6.863f, 10.474f, 6.896f, 10.095f, 6.851f, 9.637f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFECA00)),
                strokeLineWidth = 0.648148f
            ) {
                moveTo(10.75f, 5.084f)
                curveTo(10.75f, 5.084f, 11.783f, 9.731f, 8.6f, 9.65f)
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(10.681f, 4.637f)
                lineTo(10.041f, 4.737f)
                curveTo(10.493f, 7.624f, 10.131f, 8.929f, 9.117f, 8.893f)
                lineTo(9.094f, 9.541f)
                curveTo(10.714f, 9.598f, 11.189f, 7.883f, 10.681f, 4.637f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE10001))) {
                moveTo(10.033f, 4.372f)
                lineTo(9.393f, 4.473f)
                curveTo(9.844f, 7.359f, 9.483f, 8.664f, 8.469f, 8.628f)
                lineTo(8.446f, 9.276f)
                curveTo(10.066f, 9.333f, 10.541f, 7.619f, 10.033f, 4.372f)
                close()
            }
            path(fill = SolidColor(Color(0xFF07138E))) {
                moveTo(8.704f, 9.64f)
                lineTo(8.06f, 9.57f)
                curveTo(8.006f, 10.069f, 8.047f, 10.501f, 8.189f, 10.865f)
                lineTo(8.793f, 10.629f)
                curveTo(8.692f, 10.371f, 8.661f, 10.042f, 8.704f, 9.64f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF908F89)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.933f, 8.75f)
                horizontalLineTo(8.878f)
                verticalLineTo(9.676f)
                horizontalLineTo(6.933f)
                verticalLineTo(8.75f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFFFEE901)),
                strokeLineWidth = 0.5f
            ) {
                moveTo(7.906f, 9f)
                curveTo(8.454f, 9f, 8.927f, 8.691f, 9.254f, 8.237f)
                curveTo(9.581f, 7.783f, 9.776f, 7.168f, 9.776f, 6.5f)
                curveTo(9.776f, 5.832f, 9.581f, 5.217f, 9.254f, 4.763f)
                curveTo(8.927f, 4.309f, 8.454f, 4f, 7.906f, 4f)
                curveTo(7.357f, 4f, 6.884f, 4.309f, 6.557f, 4.763f)
                curveTo(6.23f, 5.217f, 6.035f, 5.832f, 6.035f, 6.5f)
                curveTo(6.035f, 7.168f, 6.23f, 7.783f, 6.557f, 8.237f)
                curveTo(6.884f, 8.691f, 7.357f, 9f, 7.906f, 9f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(7.906f, 9f)
                curveTo(8.454f, 9f, 8.927f, 8.691f, 9.254f, 8.237f)
                curveTo(9.581f, 7.783f, 9.776f, 7.168f, 9.776f, 6.5f)
                curveTo(9.776f, 5.832f, 9.581f, 5.217f, 9.254f, 4.763f)
                curveTo(8.927f, 4.309f, 8.454f, 4f, 7.906f, 4f)
                curveTo(7.357f, 4f, 6.884f, 4.309f, 6.557f, 4.763f)
                curveTo(6.23f, 5.217f, 6.035f, 5.832f, 6.035f, 6.5f)
                curveTo(6.035f, 7.168f, 6.23f, 7.783f, 6.557f, 8.237f)
                curveTo(6.884f, 8.691f, 7.357f, 9f, 7.906f, 9f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFF8DDD61)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.079f, 7.703f)
                curveTo(9.079f, 7.703f, 8.291f, 7.274f, 8.065f, 7.121f)
                curveTo(7.839f, 6.968f, 7.97f, 6.627f, 7.58f, 6.718f)
                curveTo(7.191f, 6.81f, 6.878f, 6.968f, 6.878f, 7.403f)
                curveTo(6.878f, 7.838f, 6.572f, 8.096f, 6.468f, 7.799f)
                curveTo(6.364f, 7.502f, 5.874f, 6.112f, 6.468f, 6.112f)
                curveTo(7.062f, 6.112f, 8.451f, 6.424f, 8.86f, 6.424f)
                curveTo(9.269f, 6.424f, 9.507f, 6.636f, 9.507f, 7.02f)
                curveTo(9.507f, 7.536f, 9.079f, 7.703f, 9.079f, 7.703f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFEE901)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7.905f, 5.441f)
                curveTo(8.084f, 5.441f, 8.23f, 5.293f, 8.23f, 5.11f)
                curveTo(8.23f, 4.928f, 8.084f, 4.779f, 7.905f, 4.779f)
                curveTo(7.727f, 4.779f, 7.581f, 4.928f, 7.581f, 5.11f)
                curveTo(7.581f, 5.293f, 7.727f, 5.441f, 7.905f, 5.441f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.835f, 5.47f)
                curveTo(6.835f, 5.47f, 7.212f, 5.379f, 7.733f, 5.73f)
                curveTo(8.253f, 6.081f, 9.516f, 6.281f, 9.516f, 6.006f)
                curveTo(9.516f, 5.73f, 9.516f, 6.542f, 9.516f, 6.542f)
                curveTo(9.516f, 6.542f, 6.714f, 6.368f, 6.564f, 6.542f)
                curveTo(6.414f, 6.717f, 6.399f, 5.568f, 6.564f, 5.47f)
                curveTo(6.729f, 5.373f, 6.835f, 5.47f, 6.835f, 5.47f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun EcuadorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Ecuador,
            contentDescription = "Ecuador Flag"
        )
    }
}
