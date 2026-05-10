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
 * Croatia Flag (16x12dp)
 *
 * - ISO Alpha-2: HR
 * - ISO Alpha-3: HRV
 * - ISO Numeric: 191
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Croatia: ImageVector by lazy {
    ImageVector.Builder(
        name = "Croatia:HR:HRV:191:Small",
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
                fill = SolidColor(Color(0xFFF7FCFF)),
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
                fill = SolidColor(Color(0xFFE31D1C)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 8f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(5.038f, 3.199f)
                horizontalLineToRelative(5.7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.5625f
            ) {
                moveTo(5.326f, 4.48f)
                horizontalLineTo(10.39f)
                curveTo(10.399f, 4.864f, 10.402f, 5.535f, 10.401f, 6.181f)
                curveTo(10.401f, 6.598f, 10.4f, 6.999f, 10.399f, 7.296f)
                lineTo(10.398f, 7.653f)
                lineTo(10.397f, 7.752f)
                lineTo(10.397f, 7.766f)
                lineTo(10.397f, 7.767f)
                curveTo(10.395f, 7.781f, 10.391f, 7.802f, 10.385f, 7.829f)
                curveTo(10.374f, 7.884f, 10.354f, 7.965f, 10.323f, 8.063f)
                curveTo(10.262f, 8.26f, 10.155f, 8.52f, 9.978f, 8.779f)
                curveTo(9.63f, 9.286f, 9f, 9.808f, 7.825f, 9.808f)
                curveTo(6.651f, 9.808f, 6.052f, 9.287f, 5.732f, 8.785f)
                curveTo(5.568f, 8.527f, 5.475f, 8.267f, 5.422f, 8.071f)
                curveTo(5.396f, 7.973f, 5.381f, 7.892f, 5.372f, 7.837f)
                curveTo(5.367f, 7.81f, 5.365f, 7.789f, 5.363f, 7.776f)
                lineTo(5.362f, 7.767f)
                lineTo(5.362f, 7.745f)
                lineTo(5.361f, 7.647f)
                lineTo(5.356f, 7.293f)
                curveTo(5.353f, 6.997f, 5.348f, 6.598f, 5.343f, 6.182f)
                curveTo(5.336f, 5.547f, 5.329f, 4.877f, 5.326f, 4.48f)
                close()
                moveTo(5.361f, 7.759f)
                curveTo(5.361f, 7.759f, 5.361f, 7.759f, 5.361f, 7.759f)
                lineTo(5.361f, 7.759f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.326f, 4.48f)
                horizontalLineTo(10.39f)
                curveTo(10.399f, 4.864f, 10.402f, 5.535f, 10.401f, 6.181f)
                curveTo(10.401f, 6.598f, 10.4f, 6.999f, 10.399f, 7.296f)
                lineTo(10.398f, 7.653f)
                lineTo(10.397f, 7.752f)
                lineTo(10.397f, 7.766f)
                lineTo(10.397f, 7.767f)
                curveTo(10.395f, 7.781f, 10.391f, 7.802f, 10.385f, 7.829f)
                curveTo(10.374f, 7.884f, 10.354f, 7.965f, 10.323f, 8.063f)
                curveTo(10.262f, 8.26f, 10.155f, 8.52f, 9.978f, 8.779f)
                curveTo(9.63f, 9.286f, 9f, 9.808f, 7.825f, 9.808f)
                curveTo(6.651f, 9.808f, 6.052f, 9.287f, 5.732f, 8.785f)
                curveTo(5.568f, 8.527f, 5.475f, 8.267f, 5.422f, 8.071f)
                curveTo(5.396f, 7.973f, 5.381f, 7.892f, 5.372f, 7.837f)
                curveTo(5.367f, 7.81f, 5.365f, 7.789f, 5.363f, 7.776f)
                lineTo(5.362f, 7.767f)
                lineTo(5.362f, 7.745f)
                lineTo(5.361f, 7.647f)
                lineTo(5.356f, 7.293f)
                curveTo(5.353f, 6.997f, 5.348f, 6.598f, 5.343f, 6.182f)
                curveTo(5.336f, 5.547f, 5.329f, 4.877f, 5.326f, 4.48f)
                close()
                moveTo(5.361f, 7.759f)
                curveTo(5.361f, 7.759f, 5.361f, 7.759f, 5.361f, 7.759f)
                lineTo(5.361f, 7.759f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.249f, 4.52f)
                horizontalLineTo(6.304f)
                verticalLineTo(5.591f)
                horizontalLineTo(5.249f)
                verticalLineTo(4.52f)
                close()
                moveTo(7.359f, 5.591f)
                horizontalLineTo(6.304f)
                verticalLineTo(6.662f)
                horizontalLineTo(5.249f)
                verticalLineTo(7.733f)
                horizontalLineTo(6.304f)
                verticalLineTo(8.804f)
                horizontalLineTo(5.249f)
                verticalLineTo(9.875f)
                horizontalLineTo(6.304f)
                verticalLineTo(8.804f)
                horizontalLineTo(7.359f)
                verticalLineTo(9.875f)
                horizontalLineTo(8.413f)
                verticalLineTo(8.804f)
                horizontalLineTo(9.468f)
                verticalLineTo(9.875f)
                horizontalLineTo(10.523f)
                verticalLineTo(8.804f)
                horizontalLineTo(9.468f)
                verticalLineTo(7.733f)
                horizontalLineTo(10.523f)
                verticalLineTo(6.662f)
                horizontalLineTo(9.468f)
                verticalLineTo(5.591f)
                horizontalLineTo(10.523f)
                verticalLineTo(4.52f)
                horizontalLineTo(9.468f)
                verticalLineTo(5.591f)
                horizontalLineTo(8.413f)
                verticalLineTo(4.52f)
                horizontalLineTo(7.359f)
                verticalLineTo(5.591f)
                close()
                moveTo(7.359f, 6.662f)
                verticalLineTo(5.591f)
                horizontalLineTo(8.413f)
                verticalLineTo(6.662f)
                horizontalLineTo(7.359f)
                close()
                moveTo(7.359f, 7.733f)
                verticalLineTo(6.662f)
                horizontalLineTo(6.304f)
                verticalLineTo(7.733f)
                horizontalLineTo(7.359f)
                close()
                moveTo(8.413f, 7.733f)
                verticalLineTo(8.804f)
                horizontalLineTo(7.359f)
                verticalLineTo(7.733f)
                horizontalLineTo(8.413f)
                close()
                moveTo(8.413f, 7.733f)
                verticalLineTo(6.662f)
                horizontalLineTo(9.468f)
                verticalLineTo(7.733f)
                horizontalLineTo(8.413f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.15f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.227f, 4.081f)
            curveTo(5.227f, 4.081f, 5.553f, 3.907f, 5.831f, 3.817f)
            curveTo(6.109f, 3.727f, 6.329f, 3.678f, 6.329f, 3.678f)
            lineTo(5.915f, 2.152f)
            lineTo(5.086f, 1.843f)
            lineTo(4.616f, 2.617f)
            lineTo(5.227f, 4.081f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.15f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.27f, 3.538f)
            curveTo(7.27f, 3.538f, 7.549f, 3.513f, 7.841f, 3.519f)
            curveTo(8.133f, 3.524f, 8.381f, 3.526f, 8.381f, 3.526f)
            lineTo(8.523f, 2.022f)
            lineTo(7.897f, 1.456f)
            lineTo(7.201f, 2.035f)
            lineTo(7.27f, 3.538f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.15f
        ) {
            moveTo(6.234f, 3.666f)
            lineTo(6.256f, 3.739f)
            lineTo(6.329f, 3.716f)
            lineTo(6.329f, 3.716f)
            lineTo(6.329f, 3.716f)
            lineTo(6.329f, 3.716f)
            lineTo(6.33f, 3.716f)
            lineTo(6.332f, 3.715f)
            lineTo(6.343f, 3.712f)
            lineTo(6.381f, 3.7f)
            curveTo(6.414f, 3.69f, 6.46f, 3.677f, 6.512f, 3.663f)
            curveTo(6.616f, 3.634f, 6.742f, 3.603f, 6.834f, 3.59f)
            curveTo(6.928f, 3.577f, 7.045f, 3.567f, 7.139f, 3.561f)
            curveTo(7.186f, 3.558f, 7.227f, 3.556f, 7.256f, 3.554f)
            lineTo(7.291f, 3.553f)
            lineTo(7.3f, 3.552f)
            lineTo(7.302f, 3.552f)
            lineTo(7.303f, 3.552f)
            lineTo(7.303f, 3.552f)
            lineTo(7.303f, 3.552f)
            lineTo(7.303f, 3.552f)
            lineTo(7.381f, 3.549f)
            lineTo(7.374f, 3.471f)
            lineTo(7.248f, 2.008f)
            lineTo(7.245f, 1.974f)
            lineTo(7.217f, 1.954f)
            lineTo(6.536f, 1.47f)
            lineTo(6.483f, 1.432f)
            lineTo(6.438f, 1.479f)
            lineTo(5.819f, 2.121f)
            lineTo(5.789f, 2.152f)
            lineTo(5.801f, 2.194f)
            lineTo(6.234f, 3.666f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(6.234f, 3.666f)
                lineTo(6.256f, 3.739f)
                lineTo(6.329f, 3.716f)
                lineTo(6.329f, 3.716f)
                lineTo(6.329f, 3.716f)
                lineTo(6.329f, 3.716f)
                lineTo(6.33f, 3.716f)
                lineTo(6.332f, 3.715f)
                lineTo(6.343f, 3.712f)
                lineTo(6.381f, 3.7f)
                curveTo(6.414f, 3.69f, 6.46f, 3.677f, 6.512f, 3.663f)
                curveTo(6.616f, 3.634f, 6.742f, 3.603f, 6.834f, 3.59f)
                curveTo(6.928f, 3.577f, 7.045f, 3.567f, 7.139f, 3.561f)
                curveTo(7.186f, 3.558f, 7.227f, 3.556f, 7.256f, 3.554f)
                lineTo(7.291f, 3.553f)
                lineTo(7.3f, 3.552f)
                lineTo(7.302f, 3.552f)
                lineTo(7.303f, 3.552f)
                lineTo(7.303f, 3.552f)
                lineTo(7.303f, 3.552f)
                lineTo(7.303f, 3.552f)
                lineTo(7.381f, 3.549f)
                lineTo(7.374f, 3.471f)
                lineTo(7.248f, 2.008f)
                lineTo(7.245f, 1.974f)
                lineTo(7.217f, 1.954f)
                lineTo(6.536f, 1.47f)
                lineTo(6.483f, 1.432f)
                lineTo(6.438f, 1.479f)
                lineTo(5.819f, 2.121f)
                lineTo(5.789f, 2.152f)
                lineTo(5.801f, 2.194f)
                lineTo(6.234f, 3.666f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.15f
        ) {
            moveTo(9.47f, 3.664f)
            lineTo(9.45f, 3.74f)
            lineTo(9.375f, 3.716f)
            lineTo(9.375f, 3.716f)
            lineTo(9.375f, 3.716f)
            lineTo(9.375f, 3.716f)
            lineTo(9.374f, 3.716f)
            lineTo(9.372f, 3.715f)
            lineTo(9.361f, 3.712f)
            lineTo(9.323f, 3.7f)
            curveTo(9.29f, 3.69f, 9.244f, 3.677f, 9.192f, 3.663f)
            curveTo(9.087f, 3.634f, 8.962f, 3.603f, 8.87f, 3.59f)
            curveTo(8.776f, 3.577f, 8.659f, 3.567f, 8.564f, 3.561f)
            curveTo(8.518f, 3.558f, 8.477f, 3.556f, 8.447f, 3.554f)
            lineTo(8.413f, 3.553f)
            lineTo(8.404f, 3.552f)
            lineTo(8.402f, 3.552f)
            lineTo(8.401f, 3.552f)
            lineTo(8.401f, 3.552f)
            lineTo(8.401f, 3.552f)
            lineTo(8.401f, 3.552f)
            lineTo(8.323f, 3.549f)
            lineTo(8.329f, 3.471f)
            lineTo(8.456f, 2.008f)
            lineTo(8.459f, 1.974f)
            lineTo(8.487f, 1.954f)
            lineTo(9.168f, 1.47f)
            lineTo(9.222f, 1.431f)
            lineTo(9.267f, 1.48f)
            lineTo(9.851f, 2.12f)
            lineTo(9.879f, 2.15f)
            lineTo(9.868f, 2.19f)
            lineTo(9.47f, 3.664f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(9.47f, 3.664f)
                lineTo(9.45f, 3.74f)
                lineTo(9.375f, 3.716f)
                lineTo(9.375f, 3.716f)
                lineTo(9.375f, 3.716f)
                lineTo(9.375f, 3.716f)
                lineTo(9.374f, 3.716f)
                lineTo(9.372f, 3.715f)
                lineTo(9.361f, 3.712f)
                lineTo(9.323f, 3.7f)
                curveTo(9.29f, 3.69f, 9.244f, 3.677f, 9.192f, 3.663f)
                curveTo(9.087f, 3.634f, 8.962f, 3.603f, 8.87f, 3.59f)
                curveTo(8.776f, 3.577f, 8.659f, 3.567f, 8.564f, 3.561f)
                curveTo(8.518f, 3.558f, 8.477f, 3.556f, 8.447f, 3.554f)
                lineTo(8.413f, 3.553f)
                lineTo(8.404f, 3.552f)
                lineTo(8.402f, 3.552f)
                lineTo(8.401f, 3.552f)
                lineTo(8.401f, 3.552f)
                lineTo(8.401f, 3.552f)
                lineTo(8.401f, 3.552f)
                lineTo(8.323f, 3.549f)
                lineTo(8.329f, 3.471f)
                lineTo(8.456f, 2.008f)
                lineTo(8.459f, 1.974f)
                lineTo(8.487f, 1.954f)
                lineTo(9.168f, 1.47f)
                lineTo(9.222f, 1.431f)
                lineTo(9.267f, 1.48f)
                lineTo(9.851f, 2.12f)
                lineTo(9.879f, 2.15f)
                lineTo(9.868f, 2.19f)
                lineTo(9.47f, 3.664f)
                close()
            }
        ) {
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.15f
        ) {
            moveTo(10.63f, 4.073f)
            lineTo(10.598f, 4.148f)
            lineTo(10.526f, 4.109f)
            lineTo(10.526f, 4.109f)
            lineTo(10.526f, 4.109f)
            lineTo(10.526f, 4.109f)
            lineTo(10.526f, 4.109f)
            lineTo(10.526f, 4.109f)
            lineTo(10.523f, 4.108f)
            lineTo(10.512f, 4.102f)
            curveTo(10.503f, 4.097f, 10.49f, 4.09f, 10.472f, 4.081f)
            curveTo(10.438f, 4.064f, 10.389f, 4.04f, 10.332f, 4.013f)
            curveTo(10.217f, 3.958f, 10.069f, 3.894f, 9.934f, 3.851f)
            curveTo(9.797f, 3.806f, 9.674f, 3.772f, 9.585f, 3.749f)
            curveTo(9.54f, 3.737f, 9.505f, 3.728f, 9.48f, 3.722f)
            lineTo(9.452f, 3.716f)
            lineTo(9.445f, 3.714f)
            lineTo(9.443f, 3.714f)
            lineTo(9.443f, 3.714f)
            lineTo(9.443f, 3.713f)
            lineTo(9.443f, 3.713f)
            lineTo(9.443f, 3.713f)
            lineTo(9.443f, 3.713f)
            lineTo(9.365f, 3.696f)
            lineTo(9.387f, 3.62f)
            lineTo(9.81f, 2.132f)
            lineTo(9.82f, 2.095f)
            lineTo(9.856f, 2.082f)
            lineTo(10.685f, 1.772f)
            lineTo(10.743f, 1.751f)
            lineTo(10.775f, 1.804f)
            lineTo(11.245f, 2.578f)
            lineTo(11.265f, 2.611f)
            lineTo(11.25f, 2.646f)
            lineTo(10.63f, 4.073f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(10.63f, 4.073f)
                lineTo(10.598f, 4.148f)
                lineTo(10.526f, 4.109f)
                lineTo(10.526f, 4.109f)
                lineTo(10.526f, 4.109f)
                lineTo(10.526f, 4.109f)
                lineTo(10.526f, 4.109f)
                lineTo(10.526f, 4.109f)
                lineTo(10.523f, 4.108f)
                lineTo(10.512f, 4.102f)
                curveTo(10.503f, 4.097f, 10.49f, 4.09f, 10.472f, 4.081f)
                curveTo(10.438f, 4.064f, 10.389f, 4.04f, 10.332f, 4.013f)
                curveTo(10.217f, 3.958f, 10.069f, 3.894f, 9.934f, 3.851f)
                curveTo(9.797f, 3.806f, 9.674f, 3.772f, 9.585f, 3.749f)
                curveTo(9.54f, 3.737f, 9.505f, 3.728f, 9.48f, 3.722f)
                lineTo(9.452f, 3.716f)
                lineTo(9.445f, 3.714f)
                lineTo(9.443f, 3.714f)
                lineTo(9.443f, 3.714f)
                lineTo(9.443f, 3.713f)
                lineTo(9.443f, 3.713f)
                lineTo(9.443f, 3.713f)
                lineTo(9.443f, 3.713f)
                lineTo(9.365f, 3.696f)
                lineTo(9.387f, 3.62f)
                lineTo(9.81f, 2.132f)
                lineTo(9.82f, 2.095f)
                lineTo(9.856f, 2.082f)
                lineTo(10.685f, 1.772f)
                lineTo(10.743f, 1.751f)
                lineTo(10.775f, 1.804f)
                lineTo(11.245f, 2.578f)
                lineTo(11.265f, 2.611f)
                lineTo(11.25f, 2.646f)
                lineTo(10.63f, 4.073f)
                close()
            }
        ) {
        }
    }.build()
}

@Preview
@Composable
private fun CroatiaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Croatia,
            contentDescription = "Croatia Flag"
        )
    }
}
