package flagpack.icons.small

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
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
            path(
                fill = SolidColor(Color(0xFFE31D1C)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.16f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.326f, 2.879f)
                lineToRelative(5.064f, 0f)
                lineToRelative(0f, 1.28f)
                lineToRelative(-5.064f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                stroke = SolidColor(Color(0xFFE31D1C)),
                strokeLineWidth = 0.16f,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.326f, 4.16f)
                lineTo(10.39f, 4.16f)
                curveTo(10.399f, 4.544f, 10.402f, 5.215f, 10.401f, 5.861f)
                curveTo(10.401f, 6.278f, 10.4f, 6.679f, 10.399f, 6.976f)
                lineTo(10.398f, 7.333f)
                lineTo(10.397f, 7.432f)
                lineTo(10.397f, 7.446f)
                lineTo(10.397f, 7.447f)
                curveTo(10.395f, 7.461f, 10.391f, 7.482f, 10.385f, 7.509f)
                curveTo(10.374f, 7.564f, 10.354f, 7.645f, 10.323f, 7.743f)
                curveTo(10.262f, 7.94f, 10.155f, 8.2f, 9.978f, 8.459f)
                curveTo(9.63f, 8.966f, 9f, 9.488f, 7.825f, 9.488f)
                curveTo(6.651f, 9.488f, 6.052f, 8.967f, 5.732f, 8.465f)
                curveTo(5.568f, 8.207f, 5.475f, 7.947f, 5.422f, 7.751f)
                curveTo(5.396f, 7.653f, 5.381f, 7.572f, 5.372f, 7.517f)
                curveTo(5.367f, 7.49f, 5.365f, 7.469f, 5.363f, 7.456f)
                lineTo(5.362f, 7.447f)
                lineTo(5.362f, 7.425f)
                lineTo(5.361f, 7.327f)
                lineTo(5.356f, 6.973f)
                curveTo(5.353f, 6.677f, 5.348f, 6.278f, 5.343f, 5.862f)
                curveTo(5.336f, 5.227f, 5.329f, 4.557f, 5.326f, 4.16f)
                close()
                moveTo(5.361f, 7.439f)
                curveTo(5.361f, 7.439f, 5.361f, 7.439f, 5.361f, 7.439f)
                lineTo(5.361f, 7.439f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.326f, 4.16f)
                lineTo(10.39f, 4.16f)
                curveTo(10.399f, 4.544f, 10.402f, 5.215f, 10.401f, 5.861f)
                curveTo(10.401f, 6.278f, 10.4f, 6.679f, 10.399f, 6.976f)
                lineTo(10.398f, 7.333f)
                lineTo(10.397f, 7.432f)
                lineTo(10.397f, 7.446f)
                lineTo(10.397f, 7.447f)
                curveTo(10.395f, 7.461f, 10.391f, 7.482f, 10.385f, 7.509f)
                curveTo(10.374f, 7.564f, 10.354f, 7.645f, 10.323f, 7.743f)
                curveTo(10.262f, 7.94f, 10.155f, 8.2f, 9.978f, 8.459f)
                curveTo(9.63f, 8.966f, 9f, 9.488f, 7.825f, 9.488f)
                curveTo(6.651f, 9.488f, 6.052f, 8.967f, 5.732f, 8.465f)
                curveTo(5.568f, 8.207f, 5.475f, 7.947f, 5.422f, 7.751f)
                curveTo(5.396f, 7.653f, 5.381f, 7.572f, 5.372f, 7.517f)
                curveTo(5.367f, 7.49f, 5.365f, 7.469f, 5.363f, 7.456f)
                lineTo(5.362f, 7.447f)
                lineTo(5.362f, 7.425f)
                lineTo(5.361f, 7.327f)
                lineTo(5.356f, 6.973f)
                curveTo(5.353f, 6.677f, 5.348f, 6.278f, 5.343f, 5.862f)
                curveTo(5.336f, 5.227f, 5.329f, 4.557f, 5.326f, 4.16f)
                close()
                moveTo(5.361f, 7.439f)
                curveTo(5.361f, 7.439f, 5.361f, 7.439f, 5.361f, 7.439f)
                lineTo(5.361f, 7.439f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF50100)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.249f, 4.2f)
                lineTo(6.304f, 4.2f)
                lineTo(6.304f, 5.271f)
                lineTo(5.249f, 5.271f)
                lineTo(5.249f, 4.2f)
                close()
                moveTo(7.359f, 5.271f)
                lineTo(6.304f, 5.271f)
                lineTo(6.304f, 6.342f)
                lineTo(5.249f, 6.342f)
                lineTo(5.249f, 7.413f)
                lineTo(6.304f, 7.413f)
                lineTo(6.304f, 8.484f)
                lineTo(5.249f, 8.484f)
                lineTo(5.249f, 9.555f)
                lineTo(6.304f, 9.555f)
                lineTo(6.304f, 8.484f)
                lineTo(7.359f, 8.484f)
                lineTo(7.359f, 9.555f)
                lineTo(8.413f, 9.555f)
                lineTo(8.413f, 8.484f)
                lineTo(9.468f, 8.484f)
                lineTo(9.468f, 9.555f)
                lineTo(10.523f, 9.555f)
                lineTo(10.523f, 8.484f)
                lineTo(9.468f, 8.484f)
                lineTo(9.468f, 7.413f)
                lineTo(10.523f, 7.413f)
                lineTo(10.523f, 6.342f)
                lineTo(9.468f, 6.342f)
                lineTo(9.468f, 5.271f)
                lineTo(10.523f, 5.271f)
                lineTo(10.523f, 4.2f)
                lineTo(9.468f, 4.2f)
                lineTo(9.468f, 5.271f)
                lineTo(8.413f, 5.271f)
                lineTo(8.413f, 4.2f)
                lineTo(7.359f, 4.2f)
                lineTo(7.359f, 5.271f)
                close()
                moveTo(7.359f, 6.342f)
                lineTo(7.359f, 5.271f)
                lineTo(8.413f, 5.271f)
                lineTo(8.413f, 6.342f)
                lineTo(7.359f, 6.342f)
                close()
                moveTo(7.359f, 7.413f)
                lineTo(7.359f, 6.342f)
                lineTo(6.304f, 6.342f)
                lineTo(6.304f, 7.413f)
                lineTo(7.359f, 7.413f)
                close()
                moveTo(8.413f, 7.413f)
                lineTo(8.413f, 8.484f)
                lineTo(7.359f, 8.484f)
                lineTo(7.359f, 7.413f)
                lineTo(8.413f, 7.413f)
                close()
                moveTo(8.413f, 7.413f)
                lineTo(8.413f, 6.342f)
                lineTo(9.468f, 6.342f)
                lineTo(9.468f, 7.413f)
                lineTo(8.413f, 7.413f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.08f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.243f, 4.162f)
            curveTo(5.243f, 4.162f, 5.547f, 3.975f, 5.807f, 3.879f)
            curveTo(6.067f, 3.783f, 6.273f, 3.73f, 6.273f, 3.73f)
            lineTo(5.886f, 2.094f)
            lineTo(5.112f, 1.762f)
            lineTo(4.673f, 2.592f)
            lineTo(5.243f, 4.162f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(5.116f, 3.266f)
            lineTo(5.205f, 3.217f)
            curveTo(5.297f, 3.442f, 5.418f, 3.512f, 5.584f, 3.441f)
            curveTo(5.753f, 3.368f, 5.823f, 3.231f, 5.798f, 3.013f)
            lineTo(5.896f, 2.998f)
            curveTo(5.926f, 3.268f, 5.831f, 3.457f, 5.618f, 3.549f)
            curveTo(5.401f, 3.641f, 5.228f, 3.542f, 5.116f, 3.266f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.327f, 2.757f)
            lineTo(5.241f, 2.816f)
            curveTo(5.223f, 2.829f, 5.199f, 2.811f, 5.203f, 2.786f)
            lineTo(5.223f, 2.674f)
            lineTo(5.136f, 2.619f)
            curveTo(5.116f, 2.607f, 5.119f, 2.574f, 5.14f, 2.566f)
            lineTo(5.234f, 2.529f)
            lineTo(5.232f, 2.415f)
            curveTo(5.231f, 2.39f, 5.257f, 2.376f, 5.274f, 2.392f)
            lineTo(5.349f, 2.468f)
            lineTo(5.434f, 2.409f)
            curveTo(5.452f, 2.395f, 5.476f, 2.414f, 5.472f, 2.439f)
            lineTo(5.452f, 2.551f)
            lineTo(5.539f, 2.606f)
            curveTo(5.559f, 2.618f, 5.556f, 2.651f, 5.535f, 2.659f)
            lineTo(5.441f, 2.696f)
            lineTo(5.443f, 2.81f)
            curveTo(5.444f, 2.835f, 5.418f, 2.849f, 5.401f, 2.832f)
            lineTo(5.327f, 2.757f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.086f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.27f, 3.56f)
            curveTo(7.27f, 3.56f, 7.549f, 3.532f, 7.841f, 3.538f)
            curveTo(8.133f, 3.545f, 8.381f, 3.547f, 8.381f, 3.547f)
            lineTo(8.523f, 1.812f)
            lineTo(7.897f, 1.16f)
            lineTo(7.201f, 1.828f)
            lineTo(7.27f, 3.56f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.875f, 3.277f)
            curveTo(8.116f, 3.277f, 8.139f, 2.977f, 8.139f, 2.772f)
            curveTo(8.078f, 2.659f, 8.09f, 2.578f, 7.892f, 2.578f)
            curveTo(7.695f, 2.578f, 7.672f, 2.647f, 7.615f, 2.772f)
            curveTo(7.615f, 2.977f, 7.634f, 3.277f, 7.875f, 3.277f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(8.146f, 2.429f)
            curveTo(8.388f, 2.429f, 8.411f, 2.128f, 8.411f, 1.924f)
            curveTo(8.349f, 1.81f, 8.362f, 1.729f, 8.164f, 1.729f)
            curveTo(7.966f, 1.729f, 7.944f, 1.798f, 7.886f, 1.924f)
            curveTo(7.886f, 2.128f, 7.905f, 2.429f, 8.146f, 2.429f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFECA00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(7.619f, 2.429f)
            curveTo(7.86f, 2.429f, 7.883f, 2.128f, 7.883f, 1.924f)
            curveTo(7.822f, 1.81f, 7.834f, 1.729f, 7.637f, 1.729f)
            curveTo(7.439f, 1.729f, 7.416f, 1.798f, 7.359f, 1.924f)
            curveTo(7.359f, 2.128f, 7.378f, 2.429f, 7.619f, 2.429f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.068f
        ) {
            moveTo(6.217f, 3.604f)
            lineTo(6.262f, 3.783f)
            lineTo(6.414f, 3.726f)
            lineTo(6.414f, 3.726f)
            lineTo(6.414f, 3.726f)
            lineTo(6.414f, 3.726f)
            lineTo(6.415f, 3.726f)
            lineTo(6.416f, 3.726f)
            lineTo(6.424f, 3.723f)
            lineTo(6.454f, 3.712f)
            curveTo(6.479f, 3.703f, 6.514f, 3.691f, 6.553f, 3.679f)
            curveTo(6.634f, 3.653f, 6.727f, 3.626f, 6.792f, 3.615f)
            curveTo(6.862f, 3.604f, 6.95f, 3.595f, 7.023f, 3.59f)
            curveTo(7.059f, 3.587f, 7.091f, 3.585f, 7.113f, 3.584f)
            lineTo(7.139f, 3.582f)
            lineTo(7.146f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.148f, 3.582f)
            lineTo(7.311f, 3.574f)
            lineTo(7.297f, 3.384f)
            lineTo(7.199f, 2.049f)
            lineTo(7.193f, 1.964f)
            lineTo(7.134f, 1.915f)
            lineTo(6.602f, 1.474f)
            lineTo(6.493f, 1.383f)
            lineTo(6.4f, 1.496f)
            lineTo(5.917f, 2.082f)
            lineTo(5.854f, 2.158f)
            lineTo(5.879f, 2.26f)
            lineTo(6.217f, 3.604f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(6.217f, 3.604f)
                lineTo(6.262f, 3.783f)
                lineTo(6.414f, 3.726f)
                lineTo(6.414f, 3.726f)
                lineTo(6.414f, 3.726f)
                lineTo(6.414f, 3.726f)
                lineTo(6.415f, 3.726f)
                lineTo(6.416f, 3.726f)
                lineTo(6.424f, 3.723f)
                lineTo(6.454f, 3.712f)
                curveTo(6.479f, 3.703f, 6.514f, 3.691f, 6.553f, 3.679f)
                curveTo(6.634f, 3.653f, 6.727f, 3.626f, 6.792f, 3.615f)
                curveTo(6.862f, 3.604f, 6.95f, 3.595f, 7.023f, 3.59f)
                curveTo(7.059f, 3.587f, 7.091f, 3.585f, 7.113f, 3.584f)
                lineTo(7.139f, 3.582f)
                lineTo(7.146f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.148f, 3.582f)
                lineTo(7.311f, 3.574f)
                lineTo(7.297f, 3.384f)
                lineTo(7.199f, 2.049f)
                lineTo(7.193f, 1.964f)
                lineTo(7.134f, 1.915f)
                lineTo(6.602f, 1.474f)
                lineTo(6.493f, 1.383f)
                lineTo(6.4f, 1.496f)
                lineTo(5.917f, 2.082f)
                lineTo(5.854f, 2.158f)
                lineTo(5.879f, 2.26f)
                lineTo(6.217f, 3.604f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(6.298f, 3.255f)
                lineTo(6.201f, 2.985f)
                curveTo(6.41f, 2.878f, 6.765f, 2.812f, 7.138f, 2.786f)
                lineTo(7.152f, 3.079f)
                curveTo(6.805f, 3.103f, 6.478f, 3.163f, 6.298f, 3.255f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC51918))) {
                moveTo(6.133f, 2.603f)
                lineTo(6.036f, 2.334f)
                curveTo(6.246f, 2.226f, 6.697f, 2.139f, 7.07f, 2.114f)
                lineTo(7.084f, 2.406f)
                curveTo(6.737f, 2.43f, 6.313f, 2.511f, 6.133f, 2.603f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF2E42A5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.068f
        ) {
            moveTo(9.493f, 3.598f)
            lineTo(9.45f, 3.781f)
            lineTo(9.29f, 3.724f)
            lineTo(9.29f, 3.724f)
            lineTo(9.29f, 3.724f)
            lineTo(9.29f, 3.724f)
            lineTo(9.29f, 3.724f)
            lineTo(9.288f, 3.723f)
            lineTo(9.28f, 3.72f)
            lineTo(9.25f, 3.71f)
            curveTo(9.224f, 3.701f, 9.188f, 3.689f, 9.148f, 3.676f)
            curveTo(9.064f, 3.65f, 8.969f, 3.624f, 8.903f, 3.613f)
            curveTo(8.831f, 3.602f, 8.74f, 3.593f, 8.665f, 3.588f)
            curveTo(8.628f, 3.585f, 8.596f, 3.583f, 8.573f, 3.581f)
            lineTo(8.546f, 3.58f)
            lineTo(8.539f, 3.58f)
            lineTo(8.538f, 3.579f)
            lineTo(8.537f, 3.579f)
            lineTo(8.537f, 3.579f)
            lineTo(8.537f, 3.579f)
            lineTo(8.537f, 3.579f)
            lineTo(8.537f, 3.579f)
            lineTo(8.37f, 3.572f)
            lineTo(8.384f, 3.382f)
            lineTo(8.485f, 2.05f)
            lineTo(8.492f, 1.966f)
            lineTo(8.552f, 1.917f)
            lineTo(9.097f, 1.476f)
            lineTo(9.213f, 1.383f)
            lineTo(9.308f, 1.502f)
            lineTo(9.775f, 2.084f)
            lineTo(9.834f, 2.158f)
            lineTo(9.811f, 2.255f)
            lineTo(9.493f, 3.598f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(9.493f, 3.598f)
                lineTo(9.45f, 3.781f)
                lineTo(9.29f, 3.724f)
                lineTo(9.29f, 3.724f)
                lineTo(9.29f, 3.724f)
                lineTo(9.29f, 3.724f)
                lineTo(9.29f, 3.724f)
                lineTo(9.288f, 3.723f)
                lineTo(9.28f, 3.72f)
                lineTo(9.25f, 3.71f)
                curveTo(9.224f, 3.701f, 9.188f, 3.689f, 9.148f, 3.676f)
                curveTo(9.064f, 3.65f, 8.969f, 3.624f, 8.903f, 3.613f)
                curveTo(8.831f, 3.602f, 8.74f, 3.593f, 8.665f, 3.588f)
                curveTo(8.628f, 3.585f, 8.596f, 3.583f, 8.573f, 3.581f)
                lineTo(8.546f, 3.58f)
                lineTo(8.539f, 3.58f)
                lineTo(8.538f, 3.579f)
                lineTo(8.537f, 3.579f)
                lineTo(8.537f, 3.579f)
                lineTo(8.537f, 3.579f)
                lineTo(8.537f, 3.579f)
                lineTo(8.537f, 3.579f)
                lineTo(8.37f, 3.572f)
                lineTo(8.384f, 3.382f)
                lineTo(8.485f, 2.05f)
                lineTo(8.492f, 1.966f)
                lineTo(8.552f, 1.917f)
                lineTo(9.097f, 1.476f)
                lineTo(9.213f, 1.383f)
                lineTo(9.308f, 1.502f)
                lineTo(9.775f, 2.084f)
                lineTo(9.834f, 2.158f)
                lineTo(9.811f, 2.255f)
                lineTo(9.493f, 3.598f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9.18f, 3.175f)
                curveTo(9.18f, 3.175f, 9.297f, 3.101f, 9.314f, 2.975f)
                curveTo(9.331f, 2.849f, 9.513f, 2.695f, 9.422f, 2.713f)
                curveTo(9.331f, 2.731f, 9.383f, 2.746f, 9.251f, 2.713f)
                curveTo(9.12f, 2.68f, 8.949f, 2.659f, 8.949f, 2.566f)
                curveTo(8.949f, 2.474f, 9.034f, 2.401f, 8.965f, 2.401f)
                curveTo(8.895f, 2.401f, 8.748f, 2.314f, 8.777f, 2.38f)
                curveTo(8.807f, 2.447f, 8.709f, 2.372f, 8.758f, 2.51f)
                curveTo(8.807f, 2.649f, 8.748f, 2.788f, 8.777f, 2.825f)
                curveTo(8.807f, 2.861f, 8.758f, 3.042f, 8.758f, 3.042f)
                curveTo(8.758f, 3.042f, 8.776f, 3.108f, 8.808f, 3.008f)
                curveTo(8.839f, 2.908f, 8.908f, 2.838f, 8.873f, 2.923f)
                curveTo(8.839f, 3.008f, 8.795f, 3.211f, 8.834f, 3.175f)
                curveTo(8.873f, 3.14f, 8.912f, 3.041f, 8.912f, 3.008f)
                curveTo(8.912f, 2.975f, 9.011f, 2.845f, 9.011f, 2.943f)
                curveTo(9.011f, 3.042f, 8.918f, 3.119f, 8.965f, 3.119f)
                curveTo(9.011f, 3.119f, 9.037f, 3.14f, 9.066f, 3.042f)
                curveTo(9.096f, 2.943f, 9.167f, 2.878f, 9.196f, 2.943f)
                curveTo(9.225f, 3.008f, 9.219f, 3.005f, 9.18f, 3.09f)
                curveTo(9.141f, 3.175f, 9.18f, 3.175f, 9.18f, 3.175f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.903f, 2.446f)
                lineTo(8.86f, 2.363f)
                curveTo(8.938f, 2.308f, 9.01f, 2.293f, 9.074f, 2.324f)
                curveTo(9.102f, 2.338f, 9.124f, 2.354f, 9.181f, 2.399f)
                lineTo(9.188f, 2.405f)
                curveTo(9.247f, 2.452f, 9.278f, 2.471f, 9.297f, 2.471f)
                lineTo(9.297f, 2.569f)
                curveTo(9.253f, 2.569f, 9.215f, 2.545f, 9.14f, 2.485f)
                lineTo(9.133f, 2.479f)
                curveTo(9.082f, 2.439f, 9.062f, 2.424f, 9.041f, 2.414f)
                curveTo(9.006f, 2.397f, 8.961f, 2.406f, 8.903f, 2.446f)
                close()
                moveTo(8.765f, 3.083f)
                curveTo(8.79f, 3.083f, 8.81f, 3.06f, 8.81f, 3.032f)
                curveTo(8.81f, 3.004f, 8.79f, 2.982f, 8.765f, 2.982f)
                curveTo(8.74f, 2.982f, 8.72f, 3.004f, 8.72f, 3.032f)
                curveTo(8.72f, 3.06f, 8.74f, 3.083f, 8.765f, 3.083f)
                close()
                moveTo(8.894f, 3.13f)
                curveTo(8.894f, 3.158f, 8.874f, 3.18f, 8.849f, 3.18f)
                curveTo(8.824f, 3.18f, 8.804f, 3.158f, 8.804f, 3.13f)
                curveTo(8.804f, 3.102f, 8.824f, 3.079f, 8.849f, 3.079f)
                curveTo(8.874f, 3.079f, 8.894f, 3.102f, 8.894f, 3.13f)
                close()
                moveTo(9.001f, 3.177f)
                curveTo(9.026f, 3.177f, 9.046f, 3.154f, 9.046f, 3.126f)
                curveTo(9.046f, 3.098f, 9.026f, 3.075f, 9.001f, 3.075f)
                curveTo(8.976f, 3.075f, 8.956f, 3.098f, 8.956f, 3.126f)
                curveTo(8.956f, 3.154f, 8.976f, 3.177f, 9.001f, 3.177f)
                close()
                moveTo(9.187f, 3.207f)
                curveTo(9.187f, 3.235f, 9.167f, 3.258f, 9.142f, 3.258f)
                curveTo(9.117f, 3.258f, 9.097f, 3.235f, 9.097f, 3.207f)
                curveTo(9.097f, 3.179f, 9.117f, 3.156f, 9.142f, 3.156f)
                curveTo(9.167f, 3.156f, 9.187f, 3.179f, 9.187f, 3.207f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF56C6F5)),
            stroke = SolidColor(Color.White),
            strokeLineWidth = 0.064f
        ) {
            moveTo(10.626f, 4.064f)
            lineTo(10.563f, 4.24f)
            lineTo(10.424f, 4.15f)
            lineTo(10.424f, 4.15f)
            lineTo(10.424f, 4.15f)
            lineTo(10.424f, 4.15f)
            lineTo(10.424f, 4.15f)
            lineTo(10.423f, 4.149f)
            lineTo(10.422f, 4.148f)
            lineTo(10.414f, 4.144f)
            curveTo(10.408f, 4.14f, 10.398f, 4.134f, 10.386f, 4.126f)
            curveTo(10.362f, 4.111f, 10.327f, 4.09f, 10.286f, 4.067f)
            curveTo(10.204f, 4.02f, 10.1f, 3.965f, 10.008f, 3.929f)
            curveTo(9.909f, 3.891f, 9.822f, 3.861f, 9.758f, 3.841f)
            curveTo(9.727f, 3.831f, 9.701f, 3.824f, 9.684f, 3.819f)
            lineTo(9.664f, 3.813f)
            lineTo(9.659f, 3.812f)
            lineTo(9.658f, 3.811f)
            lineTo(9.658f, 3.811f)
            lineTo(9.658f, 3.811f)
            lineTo(9.658f, 3.811f)
            lineTo(9.658f, 3.811f)
            lineTo(9.658f, 3.811f)
            lineTo(9.507f, 3.771f)
            lineTo(9.55f, 3.591f)
            lineTo(9.858f, 2.28f)
            lineTo(9.878f, 2.195f)
            lineTo(9.947f, 2.163f)
            lineTo(10.55f, 1.89f)
            lineTo(10.663f, 1.839f)
            lineTo(10.726f, 1.964f)
            lineTo(11.068f, 2.646f)
            lineTo(11.107f, 2.724f)
            lineTo(11.077f, 2.808f)
            lineTo(10.626f, 4.064f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(10.626f, 4.064f)
                lineTo(10.563f, 4.24f)
                lineTo(10.424f, 4.15f)
                lineTo(10.424f, 4.15f)
                lineTo(10.424f, 4.15f)
                lineTo(10.424f, 4.15f)
                lineTo(10.424f, 4.15f)
                lineTo(10.423f, 4.149f)
                lineTo(10.422f, 4.148f)
                lineTo(10.414f, 4.144f)
                curveTo(10.408f, 4.14f, 10.398f, 4.134f, 10.386f, 4.126f)
                curveTo(10.362f, 4.111f, 10.327f, 4.09f, 10.286f, 4.067f)
                curveTo(10.204f, 4.02f, 10.1f, 3.965f, 10.008f, 3.929f)
                curveTo(9.909f, 3.891f, 9.822f, 3.861f, 9.758f, 3.841f)
                curveTo(9.727f, 3.831f, 9.701f, 3.824f, 9.684f, 3.819f)
                lineTo(9.664f, 3.813f)
                lineTo(9.659f, 3.812f)
                lineTo(9.658f, 3.811f)
                lineTo(9.658f, 3.811f)
                lineTo(9.658f, 3.811f)
                lineTo(9.658f, 3.811f)
                lineTo(9.658f, 3.811f)
                lineTo(9.658f, 3.811f)
                lineTo(9.507f, 3.771f)
                lineTo(9.55f, 3.591f)
                lineTo(9.858f, 2.28f)
                lineTo(9.878f, 2.195f)
                lineTo(9.947f, 2.163f)
                lineTo(10.55f, 1.89f)
                lineTo(10.663f, 1.839f)
                lineTo(10.726f, 1.964f)
                lineTo(11.068f, 2.646f)
                lineTo(11.107f, 2.724f)
                lineTo(11.077f, 2.808f)
                lineTo(10.626f, 4.064f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFFECA00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10.494f, 2.674f)
                lineTo(10.442f, 2.744f)
                curveTo(10.431f, 2.759f, 10.41f, 2.751f, 10.408f, 2.73f)
                lineTo(10.4f, 2.637f)
                lineTo(10.324f, 2.618f)
                curveTo(10.307f, 2.614f, 10.303f, 2.587f, 10.317f, 2.575f)
                lineTo(10.38f, 2.52f)
                lineTo(10.355f, 2.431f)
                curveTo(10.35f, 2.411f, 10.367f, 2.393f, 10.382f, 2.402f)
                lineTo(10.453f, 2.44f)
                lineTo(10.505f, 2.37f)
                curveTo(10.516f, 2.355f, 10.537f, 2.363f, 10.539f, 2.384f)
                lineTo(10.547f, 2.477f)
                lineTo(10.623f, 2.496f)
                curveTo(10.639f, 2.501f, 10.644f, 2.527f, 10.63f, 2.539f)
                lineTo(10.567f, 2.594f)
                lineTo(10.592f, 2.683f)
                curveTo(10.597f, 2.703f, 10.58f, 2.721f, 10.565f, 2.712f)
                lineTo(10.494f, 2.674f)
                close()
            }
            path(fill = SolidColor(Color(0xFFE31D1C))) {
                moveTo(9.718f, 3.29f)
                lineTo(9.795f, 2.925f)
                curveTo(10.138f, 3.034f, 10.495f, 3.174f, 10.756f, 3.31f)
                lineTo(10.637f, 3.658f)
                curveTo(10.39f, 3.53f, 10.047f, 3.395f, 9.718f, 3.29f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(9.823f, 2.953f)
                lineTo(9.841f, 2.861f)
                curveTo(10.169f, 2.96f, 10.518f, 3.117f, 10.772f, 3.263f)
                lineTo(10.739f, 3.349f)
                curveTo(10.49f, 3.205f, 10.146f, 3.05f, 9.823f, 2.953f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(9.725f, 3.329f)
                lineTo(9.744f, 3.237f)
                curveTo(10.072f, 3.336f, 10.375f, 3.47f, 10.629f, 3.616f)
                lineTo(10.596f, 3.702f)
                curveTo(10.348f, 3.558f, 10.049f, 3.426f, 9.725f, 3.329f)
                close()
            }
            path(fill = SolidColor(Color(0xFF272727))) {
                moveTo(9.873f, 3.152f)
                lineTo(9.944f, 3.114f)
                curveTo(9.973f, 3.198f, 10.01f, 3.216f, 10.071f, 3.18f)
                curveTo(10.215f, 3.095f, 10.573f, 3.214f, 10.573f, 3.374f)
                curveTo(10.573f, 3.436f, 10.544f, 3.474f, 10.498f, 3.472f)
                curveTo(10.472f, 3.471f, 10.445f, 3.458f, 10.404f, 3.434f)
                curveTo(10.399f, 3.431f, 10.396f, 3.429f, 10.388f, 3.424f)
                curveTo(10.344f, 3.397f, 10.34f, 3.395f, 10.329f, 3.39f)
                lineTo(10.354f, 3.3f)
                curveTo(10.37f, 3.307f, 10.373f, 3.308f, 10.422f, 3.339f)
                curveTo(10.43f, 3.344f, 10.433f, 3.345f, 10.438f, 3.348f)
                curveTo(10.469f, 3.367f, 10.489f, 3.376f, 10.501f, 3.376f)
                curveTo(10.502f, 3.376f, 10.497f, 3.383f, 10.497f, 3.374f)
                curveTo(10.497f, 3.303f, 10.205f, 3.207f, 10.104f, 3.267f)
                curveTo(10.003f, 3.326f, 9.92f, 3.284f, 9.873f, 3.152f)
                close()
            }
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
