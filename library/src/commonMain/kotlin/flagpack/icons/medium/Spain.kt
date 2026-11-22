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
 * Spain Flag (20x15dp)
 *
 * - ISO Alpha-2: ES
 * - ISO Alpha-3: ESP
 * - ISO Numeric: 724
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Spain: ImageVector by lazy {
    ImageVector.Builder(
        name = "Spain:ES:ESP:724:Medium",
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
                fill = SolidColor(Color(0xFFFFB400)),
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
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                verticalLineTo(3.75f)
                horizontalLineTo(20f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 11.25f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(11.25f)
                horizontalLineTo(0f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(3.13f, 6.42f)
                horizontalLineToRelative(0.7f)
                verticalLineToRelative(3.64f)
                horizontalLineToRelative(-0.7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4.11f, 5.79f)
                horizontalLineTo(2.85f)
                verticalLineTo(6.14f)
                horizontalLineTo(3.06f)
                verticalLineTo(6.42f)
                horizontalLineTo(3.9f)
                verticalLineTo(6.14f)
                horizontalLineTo(4.11f)
                verticalLineTo(5.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.9f, 10.27f)
                horizontalLineTo(4.11f)
                verticalLineTo(10.62f)
                horizontalLineTo(2.85f)
                verticalLineTo(10.27f)
                horizontalLineTo(3.06f)
                verticalLineTo(9.99f)
                horizontalLineTo(3.9f)
                verticalLineTo(10.27f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFAD1619)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.48f, 5.86f)
                curveTo(3.632f, 5.86f, 3.648f, 5.803f, 3.738f, 5.717f)
                curveTo(3.807f, 5.65f, 3.97f, 5.568f, 3.97f, 5.475f)
                curveTo(3.97f, 5.262f, 3.751f, 5.09f, 3.48f, 5.09f)
                curveTo(3.209f, 5.09f, 2.99f, 5.262f, 2.99f, 5.475f)
                curveTo(2.99f, 5.579f, 3.102f, 5.648f, 3.187f, 5.717f)
                curveTo(3.276f, 5.79f, 3.341f, 5.86f, 3.48f, 5.86f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.85f, 10.62f)
                horizontalLineTo(4.11f)
                verticalLineTo(11.18f)
                curveTo(4.11f, 11.18f, 3.953f, 11.11f, 3.795f, 11.11f)
                curveTo(3.638f, 11.11f, 3.48f, 11.18f, 3.48f, 11.18f)
                curveTo(3.48f, 11.18f, 3.323f, 11.11f, 3.165f, 11.11f)
                curveTo(3.008f, 11.11f, 2.85f, 11.18f, 2.85f, 11.18f)
                verticalLineTo(10.62f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(2.85f, 10.62f)
                horizontalLineTo(4.11f)
                verticalLineTo(11.18f)
                curveTo(4.11f, 11.18f, 3.953f, 11.11f, 3.795f, 11.11f)
                curveTo(3.638f, 11.11f, 3.48f, 11.18f, 3.48f, 11.18f)
                curveTo(3.48f, 11.18f, 3.323f, 11.11f, 3.165f, 11.11f)
                curveTo(3.008f, 11.11f, 2.85f, 11.18f, 2.85f, 11.18f)
                verticalLineTo(10.62f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(2.839f, 11.07f)
                lineTo(2.811f, 11.003f)
                curveTo(2.925f, 10.952f, 3.039f, 10.927f, 3.153f, 10.927f)
                curveTo(3.226f, 10.927f, 3.265f, 10.937f, 3.33f, 10.966f)
                curveTo(3.388f, 10.992f, 3.417f, 11f, 3.48f, 11f)
                curveTo(3.543f, 11f, 3.573f, 10.992f, 3.63f, 10.966f)
                curveTo(3.696f, 10.937f, 3.734f, 10.927f, 3.808f, 10.927f)
                curveTo(3.922f, 10.927f, 4.036f, 10.952f, 4.149f, 11.003f)
                lineTo(4.122f, 11.07f)
                curveTo(4.017f, 11.023f, 3.912f, 11f, 3.808f, 11f)
                curveTo(3.745f, 11f, 3.715f, 11.008f, 3.658f, 11.033f)
                curveTo(3.592f, 11.063f, 3.554f, 11.073f, 3.48f, 11.073f)
                curveTo(3.407f, 11.073f, 3.368f, 11.063f, 3.303f, 11.033f)
                curveTo(3.245f, 11.008f, 3.215f, 11f, 3.153f, 11f)
                curveTo(3.048f, 11f, 2.944f, 11.023f, 2.839f, 11.07f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(2.839f, 10.86f)
                lineTo(2.811f, 10.793f)
                curveTo(2.925f, 10.742f, 3.039f, 10.717f, 3.153f, 10.717f)
                curveTo(3.226f, 10.717f, 3.265f, 10.727f, 3.33f, 10.756f)
                curveTo(3.388f, 10.782f, 3.417f, 10.79f, 3.48f, 10.79f)
                curveTo(3.543f, 10.79f, 3.573f, 10.782f, 3.63f, 10.756f)
                curveTo(3.696f, 10.727f, 3.734f, 10.717f, 3.808f, 10.717f)
                curveTo(3.922f, 10.717f, 4.036f, 10.742f, 4.149f, 10.793f)
                lineTo(4.122f, 10.86f)
                curveTo(4.017f, 10.813f, 3.912f, 10.79f, 3.808f, 10.79f)
                curveTo(3.745f, 10.79f, 3.715f, 10.798f, 3.658f, 10.823f)
                curveTo(3.592f, 10.853f, 3.554f, 10.863f, 3.48f, 10.863f)
                curveTo(3.407f, 10.863f, 3.368f, 10.853f, 3.303f, 10.823f)
                curveTo(3.245f, 10.798f, 3.215f, 10.79f, 3.153f, 10.79f)
                curveTo(3.048f, 10.79f, 2.944f, 10.813f, 2.839f, 10.86f)
                close()
            }
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(9.99f, 6.42f)
            horizontalLineToRelative(0.7f)
            verticalLineToRelative(3.64f)
            horizontalLineToRelative(-0.7f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.97f, 5.79f)
            horizontalLineTo(9.71f)
            verticalLineTo(6.14f)
            horizontalLineTo(9.92f)
            verticalLineTo(6.42f)
            horizontalLineTo(10.76f)
            verticalLineTo(6.14f)
            horizontalLineTo(10.97f)
            verticalLineTo(5.79f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.76f, 10.27f)
            horizontalLineTo(10.97f)
            verticalLineTo(10.62f)
            horizontalLineTo(9.71f)
            verticalLineTo(10.27f)
            horizontalLineTo(9.92f)
            verticalLineTo(9.99f)
            horizontalLineTo(10.76f)
            verticalLineTo(10.27f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(10.34f, 5.86f)
            curveTo(10.492f, 5.86f, 10.508f, 5.803f, 10.598f, 5.717f)
            curveTo(10.667f, 5.65f, 10.83f, 5.568f, 10.83f, 5.475f)
            curveTo(10.83f, 5.262f, 10.611f, 5.09f, 10.34f, 5.09f)
            curveTo(10.069f, 5.09f, 9.85f, 5.262f, 9.85f, 5.475f)
            curveTo(9.85f, 5.579f, 9.962f, 5.648f, 10.047f, 5.717f)
            curveTo(10.136f, 5.79f, 10.201f, 5.86f, 10.34f, 5.86f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.71f, 10.62f)
            horizontalLineTo(10.97f)
            verticalLineTo(11.18f)
            curveTo(10.97f, 11.18f, 10.813f, 11.11f, 10.655f, 11.11f)
            curveTo(10.498f, 11.11f, 10.34f, 11.18f, 10.34f, 11.18f)
            curveTo(10.34f, 11.18f, 10.182f, 11.11f, 10.025f, 11.11f)
            curveTo(9.867f, 11.11f, 9.71f, 11.18f, 9.71f, 11.18f)
            verticalLineTo(10.62f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(9.71f, 10.62f)
                horizontalLineTo(10.97f)
                verticalLineTo(11.18f)
                curveTo(10.97f, 11.18f, 10.813f, 11.11f, 10.655f, 11.11f)
                curveTo(10.498f, 11.11f, 10.34f, 11.18f, 10.34f, 11.18f)
                curveTo(10.34f, 11.18f, 10.182f, 11.11f, 10.025f, 11.11f)
                curveTo(9.867f, 11.11f, 9.71f, 11.18f, 9.71f, 11.18f)
                verticalLineTo(10.62f)
                close()
            }
        ) {
            path(fill = SolidColor(Color.White)) {
                moveTo(9.699f, 11.07f)
                lineTo(9.671f, 11.003f)
                curveTo(9.785f, 10.952f, 9.898f, 10.927f, 10.013f, 10.927f)
                curveTo(10.086f, 10.927f, 10.125f, 10.937f, 10.19f, 10.966f)
                curveTo(10.248f, 10.992f, 10.277f, 11f, 10.34f, 11f)
                curveTo(10.403f, 11f, 10.433f, 10.992f, 10.49f, 10.966f)
                curveTo(10.556f, 10.937f, 10.594f, 10.927f, 10.668f, 10.927f)
                curveTo(10.782f, 10.927f, 10.896f, 10.952f, 11.009f, 11.003f)
                lineTo(10.982f, 11.07f)
                curveTo(10.877f, 11.023f, 10.772f, 11f, 10.668f, 11f)
                curveTo(10.605f, 11f, 10.575f, 11.008f, 10.518f, 11.033f)
                curveTo(10.452f, 11.063f, 10.414f, 11.073f, 10.34f, 11.073f)
                curveTo(10.267f, 11.073f, 10.228f, 11.063f, 10.163f, 11.033f)
                curveTo(10.105f, 11.008f, 10.075f, 11f, 10.013f, 11f)
                curveTo(9.908f, 11f, 9.804f, 11.023f, 9.699f, 11.07f)
                close()
            }
            path(fill = SolidColor(Color.White)) {
                moveTo(9.699f, 10.86f)
                lineTo(9.671f, 10.793f)
                curveTo(9.785f, 10.742f, 9.898f, 10.717f, 10.013f, 10.717f)
                curveTo(10.086f, 10.717f, 10.125f, 10.727f, 10.19f, 10.756f)
                curveTo(10.248f, 10.782f, 10.277f, 10.79f, 10.34f, 10.79f)
                curveTo(10.403f, 10.79f, 10.433f, 10.782f, 10.49f, 10.756f)
                curveTo(10.556f, 10.727f, 10.594f, 10.717f, 10.668f, 10.717f)
                curveTo(10.782f, 10.717f, 10.896f, 10.742f, 11.009f, 10.793f)
                lineTo(10.982f, 10.86f)
                curveTo(10.877f, 10.813f, 10.772f, 10.79f, 10.668f, 10.79f)
                curveTo(10.605f, 10.79f, 10.575f, 10.798f, 10.518f, 10.823f)
                curveTo(10.452f, 10.853f, 10.414f, 10.863f, 10.34f, 10.863f)
                curveTo(10.267f, 10.863f, 10.228f, 10.853f, 10.163f, 10.823f)
                curveTo(10.105f, 10.798f, 10.075f, 10.79f, 10.013f, 10.79f)
                curveTo(9.908f, 10.79f, 9.804f, 10.813f, 9.699f, 10.86f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(3.117f, 9.8f)
            curveTo(3.244f, 9.647f, 3.314f, 9.508f, 3.314f, 9.36f)
            curveTo(3.314f, 9.267f, 3.287f, 9.186f, 3.238f, 9.12f)
            lineTo(3.246f, 9.117f)
            curveTo(3.245f, 9.117f, 3.385f, 9.056f, 3.433f, 9.033f)
            curveTo(3.523f, 8.99f, 3.602f, 8.944f, 3.68f, 8.888f)
            curveTo(3.729f, 8.852f, 3.796f, 8.813f, 3.896f, 8.759f)
            lineTo(3.991f, 8.708f)
            lineTo(4.017f, 8.695f)
            curveTo(4.066f, 8.668f, 4.102f, 8.648f, 4.136f, 8.629f)
            curveTo(4.242f, 8.567f, 4.312f, 8.517f, 4.365f, 8.449f)
            curveTo(4.492f, 8.288f, 4.466f, 8.071f, 4.288f, 7.95f)
            curveTo(4.201f, 7.891f, 4.084f, 7.857f, 3.912f, 7.83f)
            lineTo(3.877f, 7.825f)
            lineTo(3.666f, 7.792f)
            curveTo(3.584f, 7.779f, 3.511f, 7.767f, 3.445f, 7.756f)
            curveTo(3.876f, 7.684f, 4.49f, 7.71f, 4.76f, 7.85f)
            lineTo(5.017f, 7.352f)
            curveTo(4.467f, 7.068f, 3.211f, 7.097f, 2.743f, 7.42f)
            curveTo(2.399f, 7.657f, 2.445f, 8.015f, 2.803f, 8.169f)
            curveTo(2.952f, 8.233f, 3.147f, 8.276f, 3.508f, 8.334f)
            curveTo(3.447f, 8.369f, 3.397f, 8.401f, 3.351f, 8.435f)
            curveTo(3.303f, 8.469f, 3.252f, 8.499f, 3.191f, 8.528f)
            curveTo(3.161f, 8.542f, 3.074f, 8.581f, 3.034f, 8.598f)
            lineTo(3.014f, 8.607f)
            curveTo(2.723f, 8.739f, 2.581f, 8.923f, 2.624f, 9.254f)
            lineTo(2.647f, 9.433f)
            lineTo(2.688f, 9.445f)
            lineTo(3.117f, 9.8f)
            close()
            moveTo(2.757f, 9.337f)
            lineTo(2.756f, 9.34f)
            lineTo(2.757f, 9.338f)
            lineTo(2.757f, 9.337f)
            close()
            moveTo(10.441f, 9.36f)
            curveTo(10.441f, 9.508f, 10.512f, 9.647f, 10.638f, 9.8f)
            lineTo(11.068f, 9.445f)
            lineTo(11.109f, 9.433f)
            lineTo(11.132f, 9.254f)
            curveTo(11.174f, 8.923f, 11.033f, 8.739f, 10.741f, 8.607f)
            lineTo(10.721f, 8.598f)
            lineTo(10.721f, 8.598f)
            curveTo(10.681f, 8.581f, 10.594f, 8.542f, 10.564f, 8.528f)
            curveTo(10.503f, 8.499f, 10.452f, 8.469f, 10.405f, 8.435f)
            curveTo(10.358f, 8.401f, 10.308f, 8.369f, 10.248f, 8.334f)
            curveTo(10.608f, 8.276f, 10.803f, 8.233f, 10.953f, 8.169f)
            curveTo(11.311f, 8.015f, 11.357f, 7.657f, 11.013f, 7.42f)
            curveTo(10.544f, 7.097f, 9.289f, 7.068f, 8.738f, 7.352f)
            lineTo(8.995f, 7.85f)
            curveTo(9.265f, 7.71f, 9.88f, 7.684f, 10.31f, 7.756f)
            curveTo(10.245f, 7.767f, 10.171f, 7.779f, 10.089f, 7.792f)
            lineTo(9.879f, 7.825f)
            lineTo(9.843f, 7.83f)
            curveTo(9.671f, 7.857f, 9.554f, 7.891f, 9.467f, 7.95f)
            curveTo(9.29f, 8.071f, 9.264f, 8.288f, 9.39f, 8.449f)
            curveTo(9.444f, 8.517f, 9.513f, 8.567f, 9.619f, 8.629f)
            curveTo(9.653f, 8.648f, 9.69f, 8.668f, 9.739f, 8.695f)
            lineTo(9.764f, 8.708f)
            lineTo(9.859f, 8.759f)
            curveTo(9.96f, 8.813f, 10.026f, 8.852f, 10.076f, 8.888f)
            curveTo(10.153f, 8.944f, 10.232f, 8.99f, 10.322f, 9.033f)
            curveTo(10.371f, 9.056f, 10.51f, 9.117f, 10.509f, 9.117f)
            lineTo(10.518f, 9.12f)
            curveTo(10.469f, 9.186f, 10.441f, 9.267f, 10.441f, 9.36f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(3.702f, 7.75f)
            lineTo(3.909f, 7.793f)
            verticalLineTo(8.101f)
            curveTo(3.689f, 8.276f, 3.13f, 8.572f, 3.13f, 8.572f)
            verticalLineTo(7.75f)
            horizontalLineTo(3.702f)
            close()
        }
        path(fill = SolidColor(Color(0xFFF1F9FF))) {
            moveTo(10.197f, 7.75f)
            lineTo(9.99f, 7.793f)
            verticalLineTo(8.101f)
            curveTo(10.21f, 8.276f, 10.769f, 8.572f, 10.769f, 8.572f)
            verticalLineTo(7.75f)
            horizontalLineTo(10.197f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFAD1619)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.235f, 4.504f)
            verticalLineTo(4.401f)
            curveTo(8.875f, 4.143f, 8.498f, 4.014f, 8.104f, 4.014f)
            curveTo(7.726f, 3.846f, 7.344f, 3.782f, 6.957f, 3.819f)
            curveTo(6.957f, 3.818f, 6.957f, 3.817f, 6.957f, 3.817f)
            curveTo(6.375f, 3.76f, 5.789f, 4.014f, 5.789f, 4.014f)
            curveTo(5.198f, 4.014f, 4.657f, 4.401f, 4.657f, 4.401f)
            verticalLineTo(4.504f)
            lineTo(5.364f, 5.213f)
            curveTo(5.364f, 5.213f, 5.562f, 5.895f, 6.954f, 5.735f)
            verticalLineTo(5.737f)
            curveTo(6.954f, 5.737f, 7.875f, 5.711f, 7.94f, 5.69f)
            curveTo(7.966f, 5.681f, 7.993f, 5.674f, 8.02f, 5.666f)
            curveTo(8.2f, 5.613f, 8.406f, 5.553f, 8.529f, 5.213f)
            lineTo(9.235f, 4.504f)
            close()
            moveTo(6.954f, 3.85f)
            curveTo(6.934f, 4.086f, 6.819f, 5.509f, 6.954f, 5.73f)
            verticalLineTo(3.85f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5.196f, 5.093f)
            lineTo(5.197f, 5.091f)
            lineTo(4.7f, 4.624f)
            lineTo(4.748f, 4.573f)
            lineTo(5.214f, 5.012f)
            lineTo(5.226f, 4.957f)
            curveTo(5.302f, 4.973f, 5.358f, 4.979f, 5.39f, 4.976f)
            verticalLineTo(4.881f)
            lineTo(5.494f, 4.937f)
            curveTo(5.544f, 4.964f, 5.617f, 4.972f, 5.713f, 4.956f)
            curveTo(5.783f, 4.945f, 5.831f, 4.863f, 5.846f, 4.689f)
            lineTo(5.878f, 4.337f)
            lineTo(5.983f, 4.674f)
            curveTo(6.031f, 4.826f, 6.103f, 4.894f, 6.207f, 4.894f)
            curveTo(6.308f, 4.894f, 6.348f, 4.857f, 6.353f, 4.763f)
            lineTo(6.365f, 4.499f)
            lineTo(6.485f, 4.735f)
            curveTo(6.528f, 4.82f, 6.588f, 4.859f, 6.672f, 4.859f)
            curveTo(6.793f, 4.859f, 6.874f, 4.758f, 6.874f, 4.6f)
            horizontalLineTo(6.876f)
            horizontalLineTo(7.014f)
            horizontalLineTo(7.016f)
            curveTo(7.016f, 4.758f, 7.097f, 4.859f, 7.218f, 4.859f)
            curveTo(7.302f, 4.859f, 7.362f, 4.82f, 7.405f, 4.735f)
            lineTo(7.524f, 4.499f)
            lineTo(7.537f, 4.763f)
            curveTo(7.542f, 4.857f, 7.582f, 4.894f, 7.683f, 4.894f)
            curveTo(7.787f, 4.894f, 7.859f, 4.826f, 7.907f, 4.674f)
            lineTo(8.012f, 4.337f)
            lineTo(8.043f, 4.689f)
            curveTo(8.059f, 4.863f, 8.106f, 4.945f, 8.177f, 4.956f)
            curveTo(8.273f, 4.972f, 8.345f, 4.964f, 8.396f, 4.937f)
            lineTo(8.5f, 4.881f)
            verticalLineTo(4.976f)
            curveTo(8.532f, 4.979f, 8.588f, 4.973f, 8.664f, 4.957f)
            lineTo(8.686f, 5.058f)
            lineTo(9.202f, 4.573f)
            lineTo(9.25f, 4.624f)
            lineTo(8.608f, 5.228f)
            curveTo(8.514f, 5.401f, 8.467f, 5.514f, 8.467f, 5.562f)
            curveTo(8.467f, 5.634f, 8.279f, 5.677f, 7.913f, 5.721f)
            curveTo(7.626f, 5.755f, 7.287f, 5.778f, 7.01f, 5.782f)
            verticalLineTo(5.782f)
            lineTo(6.975f, 5.782f)
            lineTo(6.94f, 5.782f)
            verticalLineTo(5.782f)
            curveTo(6.663f, 5.778f, 6.324f, 5.755f, 6.037f, 5.721f)
            curveTo(5.67f, 5.677f, 5.483f, 5.634f, 5.483f, 5.562f)
            curveTo(5.483f, 5.553f, 5.481f, 5.542f, 5.478f, 5.528f)
            curveTo(5.441f, 5.481f, 5.415f, 5.404f, 5.397f, 5.334f)
            curveTo(5.381f, 5.302f, 5.363f, 5.266f, 5.342f, 5.228f)
            lineTo(5.2f, 5.094f)
            lineTo(5.196f, 5.093f)
            close()
            moveTo(8.637f, 5.105f)
            curveTo(8.522f, 5.125f, 8.44f, 5.123f, 8.396f, 5.087f)
            curveTo(8.327f, 5.107f, 8.246f, 5.109f, 8.154f, 5.094f)
            curveTo(8.056f, 5.078f, 7.988f, 5.013f, 7.946f, 4.904f)
            curveTo(7.893f, 4.973f, 7.825f, 5.015f, 7.743f, 5.029f)
            curveTo(8.191f, 5.092f, 8.505f, 5.182f, 8.505f, 5.182f)
            curveTo(8.505f, 5.182f, 8.497f, 5.248f, 8.478f, 5.326f)
            curveTo(8.498f, 5.285f, 8.522f, 5.24f, 8.549f, 5.19f)
            lineTo(8.556f, 5.181f)
            lineTo(8.637f, 5.105f)
            close()
            moveTo(7.532f, 5.002f)
            curveTo(7.493f, 4.983f, 7.462f, 4.955f, 7.439f, 4.919f)
            curveTo(7.406f, 4.948f, 7.368f, 4.97f, 7.326f, 4.983f)
            curveTo(7.396f, 4.988f, 7.465f, 4.995f, 7.532f, 5.002f)
            close()
            moveTo(7.079f, 4.969f)
            curveTo(7.024f, 4.944f, 6.979f, 4.904f, 6.945f, 4.852f)
            curveTo(6.911f, 4.903f, 6.866f, 4.944f, 6.812f, 4.969f)
            curveTo(6.844f, 4.968f, 6.877f, 4.967f, 6.909f, 4.967f)
            verticalLineTo(4.967f)
            lineTo(6.937f, 4.967f)
            lineTo(6.965f, 4.967f)
            verticalLineTo(4.967f)
            curveTo(7.003f, 4.967f, 7.041f, 4.968f, 7.079f, 4.969f)
            close()
            moveTo(5.389f, 5.176f)
            lineTo(5.324f, 5.115f)
            curveTo(5.402f, 5.123f, 5.46f, 5.115f, 5.494f, 5.087f)
            curveTo(5.563f, 5.107f, 5.643f, 5.109f, 5.736f, 5.094f)
            curveTo(5.834f, 5.078f, 5.902f, 5.013f, 5.943f, 4.904f)
            curveTo(5.996f, 4.971f, 6.061f, 5.013f, 6.14f, 5.028f)
            curveTo(5.753f, 5.082f, 5.465f, 5.156f, 5.389f, 5.176f)
            close()
            moveTo(6.561f, 4.982f)
            curveTo(6.493f, 4.987f, 6.427f, 4.993f, 6.362f, 5f)
            curveTo(6.399f, 4.981f, 6.429f, 4.953f, 6.451f, 4.919f)
            curveTo(6.483f, 4.947f, 6.52f, 4.969f, 6.561f, 4.982f)
            close()
            moveTo(8.283f, 5.563f)
            curveTo(8.332f, 5.586f, 8.371f, 5.563f, 8.403f, 5.519f)
            curveTo(8.4f, 5.531f, 8.398f, 5.542f, 8.398f, 5.552f)
            curveTo(8.393f, 5.555f, 8.387f, 5.558f, 8.379f, 5.562f)
            curveTo(8.356f, 5.571f, 8.321f, 5.582f, 8.275f, 5.592f)
            curveTo(8.185f, 5.613f, 8.057f, 5.633f, 7.905f, 5.651f)
            curveTo(7.608f, 5.687f, 7.255f, 5.71f, 6.975f, 5.712f)
            curveTo(6.695f, 5.71f, 6.342f, 5.687f, 6.045f, 5.651f)
            curveTo(5.893f, 5.633f, 5.765f, 5.613f, 5.675f, 5.592f)
            curveTo(5.637f, 5.583f, 5.606f, 5.575f, 5.583f, 5.566f)
            curveTo(5.586f, 5.565f, 5.588f, 5.564f, 5.591f, 5.563f)
            curveTo(5.744f, 5.492f, 6.755f, 5.424f, 6.937f, 5.413f)
            curveTo(7.119f, 5.424f, 8.13f, 5.492f, 8.283f, 5.563f)
            close()
            moveTo(8.476f, 5.55f)
            lineTo(8.475f, 5.552f)
            lineTo(8.476f, 5.551f)
            lineTo(8.476f, 5.55f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF005BBF)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.945f, 3.342f)
            curveTo(7.061f, 3.342f, 7.155f, 3.248f, 7.155f, 3.132f)
            curveTo(7.155f, 3.016f, 7.061f, 2.922f, 6.945f, 2.922f)
            curveTo(6.829f, 2.922f, 6.735f, 3.016f, 6.735f, 3.132f)
            curveTo(6.735f, 3.248f, 6.829f, 3.342f, 6.945f, 3.342f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.809f, 4.373f)
            curveTo(6.813f, 4.396f, 6.82f, 4.418f, 6.829f, 4.437f)
            curveTo(6.802f, 4.426f, 6.77f, 4.42f, 6.735f, 4.42f)
            curveTo(6.638f, 4.42f, 6.56f, 4.467f, 6.56f, 4.525f)
            curveTo(6.56f, 4.583f, 6.638f, 4.63f, 6.735f, 4.63f)
            curveTo(6.832f, 4.63f, 6.91f, 4.583f, 6.91f, 4.525f)
            curveTo(6.91f, 4.583f, 6.988f, 4.63f, 7.085f, 4.63f)
            curveTo(7.182f, 4.63f, 7.26f, 4.583f, 7.26f, 4.525f)
            curveTo(7.26f, 4.467f, 7.182f, 4.42f, 7.085f, 4.42f)
            curveTo(7.061f, 4.42f, 7.037f, 4.423f, 7.016f, 4.429f)
            curveTo(7.022f, 4.4f, 7.021f, 4.367f, 7.015f, 4.333f)
            curveTo(6.996f, 4.238f, 6.935f, 4.17f, 6.878f, 4.181f)
            curveTo(6.821f, 4.192f, 6.79f, 4.278f, 6.809f, 4.373f)
            close()
            moveTo(6.91f, 4.525f)
            lineTo(6.91f, 4.522f)
            lineTo(6.91f, 4.522f)
            lineTo(6.91f, 4.525f)
            close()
            moveTo(5.779f, 4.507f)
            curveTo(5.77f, 4.488f, 5.763f, 4.466f, 5.759f, 4.443f)
            curveTo(5.74f, 4.348f, 5.771f, 4.262f, 5.828f, 4.251f)
            curveTo(5.885f, 4.24f, 5.946f, 4.308f, 5.965f, 4.403f)
            curveTo(5.971f, 4.437f, 5.972f, 4.47f, 5.966f, 4.499f)
            curveTo(5.988f, 4.493f, 6.011f, 4.49f, 6.035f, 4.49f)
            curveTo(6.132f, 4.49f, 6.21f, 4.537f, 6.21f, 4.595f)
            curveTo(6.21f, 4.653f, 6.132f, 4.7f, 6.035f, 4.7f)
            curveTo(5.938f, 4.7f, 5.86f, 4.653f, 5.86f, 4.595f)
            lineTo(5.86f, 4.592f)
            lineTo(5.86f, 4.592f)
            lineTo(5.86f, 4.595f)
            curveTo(5.86f, 4.653f, 5.782f, 4.7f, 5.685f, 4.7f)
            curveTo(5.588f, 4.7f, 5.51f, 4.653f, 5.51f, 4.595f)
            curveTo(5.51f, 4.537f, 5.588f, 4.49f, 5.685f, 4.49f)
            curveTo(5.72f, 4.49f, 5.752f, 4.496f, 5.779f, 4.507f)
            close()
            moveTo(7.971f, 4.571f)
            curveTo(7.963f, 4.628f, 7.879f, 4.664f, 7.783f, 4.65f)
            curveTo(7.688f, 4.637f, 7.617f, 4.579f, 7.625f, 4.522f)
            curveTo(7.633f, 4.464f, 7.717f, 4.429f, 7.813f, 4.442f)
            curveTo(7.847f, 4.447f, 7.878f, 4.458f, 7.903f, 4.472f)
            curveTo(7.897f, 4.451f, 7.893f, 4.429f, 7.892f, 4.406f)
            curveTo(7.887f, 4.309f, 7.93f, 4.229f, 7.988f, 4.225f)
            curveTo(8.046f, 4.222f, 8.097f, 4.298f, 8.102f, 4.395f)
            curveTo(8.103f, 4.429f, 8.099f, 4.462f, 8.09f, 4.49f)
            curveTo(8.112f, 4.487f, 8.135f, 4.488f, 8.159f, 4.491f)
            curveTo(8.255f, 4.504f, 8.326f, 4.562f, 8.318f, 4.619f)
            curveTo(8.31f, 4.677f, 8.226f, 4.712f, 8.13f, 4.699f)
            curveTo(8.034f, 4.686f, 7.963f, 4.628f, 7.971f, 4.571f)
            close()
            moveTo(7.971f, 4.571f)
            lineTo(7.972f, 4.567f)
            lineTo(7.972f, 4.568f)
            lineTo(7.971f, 4.571f)
            close()
            moveTo(8.638f, 4.848f)
            curveTo(8.723f, 4.894f, 8.814f, 4.889f, 8.842f, 4.838f)
            lineTo(8.843f, 4.835f)
            curveTo(8.851f, 4.844f, 8.861f, 4.85f, 8.873f, 4.854f)
            curveTo(8.928f, 4.871f, 8.996f, 4.81f, 9.024f, 4.717f)
            curveTo(9.053f, 4.625f, 9.03f, 4.536f, 8.975f, 4.519f)
            curveTo(8.92f, 4.502f, 8.852f, 4.563f, 8.823f, 4.656f)
            curveTo(8.817f, 4.678f, 8.813f, 4.7f, 8.811f, 4.721f)
            curveTo(8.792f, 4.7f, 8.767f, 4.679f, 8.736f, 4.663f)
            curveTo(8.651f, 4.617f, 8.56f, 4.622f, 8.532f, 4.673f)
            curveTo(8.505f, 4.725f, 8.552f, 4.803f, 8.638f, 4.848f)
            close()
            moveTo(5.203f, 4.87f)
            curveTo(5.118f, 4.915f, 5.026f, 4.91f, 4.999f, 4.859f)
            curveTo(4.999f, 4.858f, 4.998f, 4.857f, 4.998f, 4.856f)
            curveTo(4.989f, 4.865f, 4.979f, 4.872f, 4.968f, 4.875f)
            curveTo(4.913f, 4.892f, 4.845f, 4.831f, 4.816f, 4.739f)
            curveTo(4.788f, 4.646f, 4.81f, 4.557f, 4.866f, 4.54f)
            curveTo(4.921f, 4.523f, 4.989f, 4.585f, 5.017f, 4.677f)
            curveTo(5.024f, 4.7f, 5.028f, 4.722f, 5.029f, 4.743f)
            curveTo(5.048f, 4.721f, 5.074f, 4.701f, 5.104f, 4.684f)
            curveTo(5.19f, 4.639f, 5.281f, 4.644f, 5.308f, 4.695f)
            curveTo(5.335f, 4.746f, 5.288f, 4.824f, 5.203f, 4.87f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFC88A02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.867f, 2.548f)
            horizontalLineTo(7.013f)
            verticalLineTo(2.64f)
            horizontalLineTo(7.108f)
            verticalLineTo(2.786f)
            horizontalLineTo(7.013f)
            verticalLineTo(3.078f)
            horizontalLineTo(7.108f)
            verticalLineTo(3.223f)
            horizontalLineTo(6.77f)
            verticalLineTo(3.078f)
            horizontalLineTo(6.867f)
            verticalLineTo(2.786f)
            horizontalLineTo(6.77f)
            verticalLineTo(2.64f)
            horizontalLineTo(6.867f)
            verticalLineTo(2.548f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(6.84f, 3.34f)
            horizontalLineToRelative(0.28f)
            verticalLineToRelative(0.91f)
            horizontalLineToRelative(-0.28f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(5.713f, 3.492f)
            lineTo(5.712f, 3.562f)
            curveTo(5.091f, 3.552f, 4.735f, 3.642f, 4.645f, 3.823f)
            curveTo(4.551f, 4.009f, 4.568f, 4.236f, 4.699f, 4.506f)
            lineTo(4.636f, 4.536f)
            curveTo(4.497f, 4.249f, 4.478f, 4f, 4.582f, 3.791f)
            curveTo(4.689f, 3.577f, 5.066f, 3.481f, 5.713f, 3.492f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(5.833f, 4.113f)
            lineTo(5.797f, 4.173f)
            curveTo(5.662f, 4.093f, 5.594f, 3.955f, 5.594f, 3.765f)
            curveTo(5.594f, 3.492f, 5.735f, 3.332f, 6.046f, 3.223f)
            curveTo(6.244f, 3.153f, 6.515f, 3.181f, 6.859f, 3.306f)
            lineTo(6.836f, 3.372f)
            curveTo(6.505f, 3.252f, 6.249f, 3.225f, 6.069f, 3.289f)
            curveTo(5.784f, 3.389f, 5.664f, 3.525f, 5.664f, 3.765f)
            curveTo(5.664f, 3.932f, 5.72f, 4.046f, 5.833f, 4.113f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(4.788f, 4.398f)
            lineTo(4.656f, 4.445f)
            curveTo(4.518f, 4.055f, 4.558f, 3.79f, 4.792f, 3.675f)
            curveTo(4.998f, 3.574f, 5.299f, 3.533f, 5.695f, 3.55f)
            lineTo(5.69f, 3.689f)
            curveTo(5.314f, 3.674f, 5.035f, 3.712f, 4.853f, 3.801f)
            curveTo(4.699f, 3.876f, 4.671f, 4.067f, 4.788f, 4.398f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(6.331f, 3.399f)
            curveTo(6.011f, 3.399f, 5.879f, 3.477f, 5.804f, 3.707f)
            curveTo(5.756f, 3.854f, 5.803f, 3.979f, 5.953f, 4.096f)
            lineTo(5.867f, 4.207f)
            curveTo(5.673f, 4.055f, 5.604f, 3.87f, 5.671f, 3.664f)
            curveTo(5.767f, 3.371f, 5.955f, 3.259f, 6.331f, 3.259f)
            curveTo(6.577f, 3.259f, 6.769f, 3.324f, 6.903f, 3.456f)
            lineTo(6.924f, 3.476f)
            verticalLineTo(4.151f)
            horizontalLineTo(6.784f)
            verticalLineTo(3.536f)
            curveTo(6.68f, 3.445f, 6.53f, 3.399f, 6.331f, 3.399f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(8.156f, 3.562f)
            lineTo(8.157f, 3.632f)
            curveTo(8.778f, 3.622f, 9.134f, 3.712f, 9.224f, 3.893f)
            curveTo(9.317f, 4.079f, 9.3f, 4.306f, 9.169f, 4.576f)
            lineTo(9.232f, 4.606f)
            curveTo(9.372f, 4.319f, 9.391f, 4.07f, 9.287f, 3.861f)
            curveTo(9.179f, 3.647f, 8.803f, 3.551f, 8.156f, 3.562f)
            close()
        }
        path(fill = SolidColor(Color.White)) {
            moveTo(7.936f, 4.128f)
            lineTo(7.972f, 4.188f)
            curveTo(8.107f, 4.107f, 8.175f, 3.969f, 8.175f, 3.78f)
            curveTo(8.175f, 3.507f, 8.035f, 3.347f, 7.724f, 3.237f)
            curveTo(7.525f, 3.167f, 7.254f, 3.196f, 6.91f, 3.321f)
            lineTo(6.934f, 3.387f)
            curveTo(7.264f, 3.267f, 7.52f, 3.24f, 7.701f, 3.303f)
            curveTo(7.986f, 3.404f, 8.105f, 3.54f, 8.105f, 3.78f)
            curveTo(8.105f, 3.946f, 8.049f, 4.061f, 7.936f, 4.128f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(9.125f, 4.468f)
            lineTo(9.257f, 4.515f)
            curveTo(9.394f, 4.125f, 9.355f, 3.86f, 9.12f, 3.745f)
            curveTo(8.914f, 3.644f, 8.613f, 3.603f, 8.217f, 3.62f)
            lineTo(8.222f, 3.759f)
            curveTo(8.598f, 3.744f, 8.877f, 3.782f, 9.059f, 3.871f)
            curveTo(9.213f, 3.946f, 9.241f, 4.137f, 9.125f, 4.468f)
            close()
        }
        path(fill = SolidColor(Color(0xFFC88A02))) {
            moveTo(7.573f, 3.41f)
            curveTo(7.893f, 3.41f, 8.025f, 3.488f, 8.1f, 3.718f)
            curveTo(8.148f, 3.865f, 8.101f, 3.99f, 7.951f, 4.107f)
            lineTo(8.037f, 4.217f)
            curveTo(8.232f, 4.066f, 8.3f, 3.881f, 8.233f, 3.675f)
            curveTo(8.137f, 3.381f, 7.95f, 3.27f, 7.573f, 3.27f)
            curveTo(7.327f, 3.27f, 7.135f, 3.335f, 7.001f, 3.467f)
            lineTo(6.98f, 3.487f)
            verticalLineTo(4.162f)
            horizontalLineTo(7.12f)
            verticalLineTo(3.547f)
            curveTo(7.224f, 3.456f, 7.374f, 3.41f, 7.573f, 3.41f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFE1E5E8)),
            fillAlpha = 0.3f,
            strokeAlpha = 0.3f,
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.67f, 5.79f)
            horizontalLineTo(9.22f)
            verticalLineTo(9.878f)
            curveTo(9.22f, 9.878f, 8.882f, 11.25f, 6.945f, 11.25f)
            curveTo(5.008f, 11.25f, 4.67f, 9.842f, 4.67f, 9.842f)
            verticalLineTo(5.79f)
            close()
        }
        group(
            clipPathData = PathData {
                moveTo(4.67f, 5.79f)
                horizontalLineTo(9.22f)
                verticalLineTo(9.878f)
                curveTo(9.22f, 9.878f, 8.882f, 11.25f, 6.945f, 11.25f)
                curveTo(5.008f, 11.25f, 4.67f, 9.842f, 4.67f, 9.842f)
                verticalLineTo(5.79f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFFFFC034))) {
                moveTo(4.67f, 8.31f)
                horizontalLineToRelative(2.31f)
                verticalLineToRelative(2.73f)
                horizontalLineToRelative(-2.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(4.95f, 8.45f)
                horizontalLineToRelative(0.28f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-0.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(5.93f, 8.45f)
                horizontalLineToRelative(0.28f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-0.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(5.44f, 8.45f)
                horizontalLineToRelative(0.28f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-0.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(6.42f, 8.45f)
                horizontalLineToRelative(0.28f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-0.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(4.67f, 5.72f)
                horizontalLineToRelative(2.31f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(-2.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFAD1619))) {
                moveTo(6.91f, 8.24f)
                horizontalLineToRelative(2.31f)
                verticalLineToRelative(2.66f)
                horizontalLineToRelative(-2.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF1F9FF))) {
                moveTo(6.91f, 5.79f)
                horizontalLineToRelative(2.45f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-2.45f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC88A02)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.65f, 6f)
                horizontalLineTo(5.86f)
                verticalLineTo(6.581f)
                horizontalLineTo(6f)
                verticalLineTo(6.29f)
                horizontalLineTo(6.21f)
                verticalLineTo(6.581f)
                horizontalLineTo(6.42f)
                verticalLineTo(6.944f)
                horizontalLineTo(6.21f)
                verticalLineTo(7.597f)
                horizontalLineTo(6.42f)
                verticalLineTo(7.96f)
                horizontalLineTo(5.16f)
                verticalLineTo(7.597f)
                horizontalLineTo(5.37f)
                verticalLineTo(6.944f)
                horizontalLineTo(5.16f)
                verticalLineTo(6.581f)
                horizontalLineTo(5.3f)
                verticalLineTo(6.29f)
                horizontalLineTo(5.51f)
                verticalLineTo(6.581f)
                horizontalLineTo(5.65f)
                verticalLineTo(6f)
                close()
            }
            path(fill = SolidColor(Color(0xFFC88A02))) {
                moveTo(8.112f, 6.122f)
                lineTo(8.255f, 5.968f)
                lineTo(8.556f, 6.25f)
                lineTo(8.413f, 6.403f)
                lineTo(8.112f, 6.122f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.975f, 10.088f)
                verticalLineTo(8.555f)
                horizontalLineTo(7.225f)
                verticalLineTo(10.075f)
                lineTo(7.228f, 10.087f)
                curveTo(7.316f, 10.464f, 7.618f, 10.655f, 8.1f, 10.655f)
                curveTo(8.581f, 10.655f, 8.883f, 10.469f, 8.972f, 10.1f)
                lineTo(8.975f, 10.088f)
                close()
                moveTo(8.1f, 10.445f)
                curveTo(7.713f, 10.445f, 7.502f, 10.315f, 7.435f, 10.05f)
                verticalLineTo(8.765f)
                horizontalLineTo(8.765f)
                verticalLineTo(10.062f)
                curveTo(8.698f, 10.318f, 8.487f, 10.445f, 8.1f, 10.445f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFC034)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.172f, 8.683f)
                horizontalLineTo(8.026f)
                verticalLineTo(9.378f)
                lineTo(7.452f, 8.753f)
                lineTo(7.348f, 8.847f)
                lineTo(7.868f, 9.413f)
                horizontalLineTo(7.397f)
                verticalLineTo(9.623f)
                horizontalLineTo(7.759f)
                horizontalLineTo(7.88f)
                lineTo(7.348f, 10.201f)
                lineTo(7.452f, 10.295f)
                lineTo(8.026f, 9.67f)
                verticalLineTo(10.482f)
                horizontalLineTo(8.172f)
                verticalLineTo(9.743f)
                lineTo(8.68f, 10.295f)
                lineTo(8.783f, 10.201f)
                lineTo(8.252f, 9.623f)
                horizontalLineTo(8.845f)
                verticalLineTo(9.413f)
                horizontalLineTo(8.263f)
                lineTo(8.783f, 8.847f)
                lineTo(8.68f, 8.753f)
                lineTo(8.172f, 9.305f)
                verticalLineTo(8.683f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF1F9FF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8.427f, 10.902f)
                curveTo(8.427f, 10.902f, 6.944f, 11.018f, 6.944f, 10.062f)
                curveTo(6.944f, 10.062f, 6.93f, 10.902f, 5.382f, 10.902f)
                verticalLineTo(11.657f)
                horizontalLineTo(8.427f)
                verticalLineTo(10.902f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF005BBF)),
                stroke = SolidColor(Color(0xFFAD1619)),
                strokeLineWidth = 0.729167f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6.945f, 8.87f)
                curveTo(7.235f, 8.87f, 7.47f, 8.619f, 7.47f, 8.31f)
                curveTo(7.47f, 8.001f, 7.235f, 7.75f, 6.945f, 7.75f)
                curveTo(6.655f, 7.75f, 6.42f, 8.001f, 6.42f, 8.31f)
                curveTo(6.42f, 8.619f, 6.655f, 8.87f, 6.945f, 8.87f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun SpainPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Spain,
            contentDescription = "Spain Flag"
        )
    }
}
