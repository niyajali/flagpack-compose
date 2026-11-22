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
 * Moldova Flag (32x24dp)
 *
 * - ISO Alpha-2: MD
 * - ISO Alpha-3: MDA
 * - ISO Numeric: 498
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Large.Moldova: ImageVector by lazy {
    ImageVector.Builder(
        name = "Moldova:MD:MDA:498:Large",
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
                fill = SolidColor(Color(0xFFD9071E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(22f, 0f)
                horizontalLineTo(32f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF3D58DB)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(12f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFBCD17)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineTo(22f)
                verticalLineTo(24f)
                horizontalLineTo(10f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFD1900)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(21.719f, 19.614f)
                lineTo(20.665f, 20.19f)
                lineTo(17.175f, 13.801f)
                lineTo(18.228f, 13.225f)
                lineTo(21.719f, 19.614f)
                close()
                moveTo(10.514f, 19.768f)
                lineTo(11.567f, 20.343f)
                lineTo(15.057f, 13.954f)
                lineTo(14.004f, 13.379f)
                lineTo(10.514f, 19.768f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFA77B3B)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.378f, 9.389f)
                verticalLineTo(14.94f)
                curveTo(11.378f, 16.174f, 10.316f, 17.781f, 9.781f, 18.379f)
                curveTo(9.245f, 18.976f, 8.182f, 20.346f, 8.182f, 20.346f)
                verticalLineTo(5.408f)
                curveTo(8.182f, 3.733f, 9.781f, 3.157f, 9.781f, 3.157f)
                curveTo(9.781f, 3.157f, 11.108f, 3.42f, 11.378f, 5.408f)
                verticalLineTo(7.346f)
                curveTo(11.789f, 7.67f, 13.161f, 8.663f, 14.048f, 8.244f)
                curveTo(15.101f, 7.746f, 15.464f, 6.319f, 15.464f, 6.319f)
                curveTo(15.464f, 6.319f, 15.366f, 4.879f, 14.934f, 4.879f)
                curveTo(14.502f, 4.879f, 14.467f, 2.851f, 16.122f, 2.851f)
                curveTo(17.776f, 2.851f, 17.969f, 3.633f, 17.969f, 4.256f)
                curveTo(17.969f, 4.583f, 17.707f, 5.107f, 17.458f, 5.606f)
                curveTo(17.232f, 6.059f, 17.016f, 6.491f, 17.016f, 6.735f)
                curveTo(17.016f, 7.248f, 17.403f, 8.244f, 17.969f, 8.244f)
                curveTo(18.366f, 8.244f, 20.276f, 7.502f, 21.382f, 7.058f)
                verticalLineTo(5.408f)
                curveTo(21.651f, 3.42f, 22.979f, 3.157f, 22.979f, 3.157f)
                curveTo(22.979f, 3.157f, 24.578f, 3.733f, 24.578f, 5.408f)
                verticalLineTo(20.346f)
                curveTo(24.578f, 20.346f, 23.514f, 18.976f, 22.979f, 18.379f)
                curveTo(22.443f, 17.781f, 21.382f, 16.174f, 21.382f, 14.94f)
                verticalLineTo(9.389f)
                horizontalLineTo(11.378f)
                close()
                moveTo(13.15f, 19.832f)
                curveTo(14.232f, 19.128f, 15.814f, 15.97f, 15.814f, 15.97f)
                lineTo(16.339f, 16.092f)
                curveTo(16.339f, 16.092f, 17.141f, 18.184f, 19.5f, 19.832f)
                curveTo(16.986f, 20.503f, 16.339f, 21.85f, 16.339f, 21.85f)
                curveTo(16.339f, 20.772f, 13.15f, 19.832f, 13.15f, 19.832f)
                close()
                moveTo(12.976f, 17.833f)
                curveTo(13.705f, 17.833f, 14.296f, 17.274f, 14.296f, 16.583f)
                curveTo(14.296f, 15.893f, 13.705f, 15.333f, 12.976f, 15.333f)
                curveTo(12.247f, 15.333f, 11.656f, 15.893f, 11.656f, 16.583f)
                curveTo(11.656f, 17.274f, 12.247f, 17.833f, 12.976f, 17.833f)
                close()
                moveTo(20.72f, 16.583f)
                curveTo(20.72f, 17.274f, 20.129f, 17.833f, 19.4f, 17.833f)
                curveTo(18.671f, 17.833f, 18.08f, 17.274f, 18.08f, 16.583f)
                curveTo(18.08f, 15.893f, 18.671f, 15.333f, 19.4f, 15.333f)
                curveTo(20.129f, 15.333f, 20.72f, 15.893f, 20.72f, 16.583f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFDFF00))) {
                moveTo(25.14f, 10.408f)
                lineTo(26.058f, 10.804f)
                lineTo(22.318f, 19.456f)
                lineTo(21.4f, 19.06f)
                lineTo(25.14f, 10.408f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFE1E5E8)),
                fillAlpha = 0.3f,
                strokeAlpha = 0.3f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(11.04f, 7.833f)
                horizontalLineTo(21.6f)
                verticalLineTo(15.472f)
                curveTo(21.6f, 15.472f, 18.913f, 16.282f, 16.32f, 17.61f)
                curveTo(14.406f, 16.19f, 11.04f, 15.472f, 11.04f, 15.472f)
                verticalLineTo(7.833f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(11.04f, 7.833f)
                horizontalLineTo(21.6f)
                verticalLineTo(15.472f)
                curveTo(21.6f, 15.472f, 18.913f, 16.282f, 16.32f, 17.61f)
                curveTo(14.406f, 16.19f, 11.04f, 15.472f, 11.04f, 15.472f)
                verticalLineTo(7.833f)
                close()
            }
        ) {
            path(fill = SolidColor(Color(0xFF3D58DB))) {
                moveTo(11.04f, 12.833f)
                horizontalLineToRelative(10.56f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFFFD1900))) {
                moveTo(11.04f, 7.833f)
                horizontalLineToRelative(10.56f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-10.56f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15.787f, 10.082f)
                lineTo(14.986f, 10.148f)
                lineTo(15.448f, 9.526f)
                lineTo(14.956f, 8.881f)
                lineTo(15.76f, 8.984f)
                lineTo(16.069f, 8.273f)
                lineTo(16.412f, 9f)
                lineTo(17.212f, 8.933f)
                lineTo(16.75f, 9.556f)
                lineTo(17.242f, 10.201f)
                lineTo(16.438f, 10.097f)
                lineTo(16.129f, 10.808f)
                lineTo(15.787f, 10.082f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(14.35f, 8.672f)
                curveTo(14.35f, 8.672f, 12.2f, 9.98f, 12.917f, 10.919f)
                curveTo(13.634f, 11.858f, 14.536f, 11.978f, 14.536f, 11.978f)
                curveTo(14.536f, 11.978f, 12.336f, 15.277f, 16.207f, 17.162f)
                curveTo(20.351f, 15.342f, 18.172f, 11.978f, 18.172f, 11.978f)
                curveTo(18.172f, 11.978f, 19.447f, 11.696f, 19.703f, 10.68f)
                curveTo(19.958f, 9.665f, 18.035f, 8.501f, 18.035f, 8.501f)
                curveTo(18.035f, 8.501f, 19.235f, 10.24f, 18.961f, 10.68f)
                curveTo(18.687f, 11.121f, 17.22f, 11.57f, 16.207f, 11.57f)
                curveTo(15.194f, 11.57f, 13.63f, 11.285f, 13.377f, 10.515f)
                curveTo(13.125f, 9.745f, 14.35f, 8.672f, 14.35f, 8.672f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.36f, 12f)
                lineTo(13.68f, 12.833f)
                lineTo(12.36f, 13.667f)
                lineTo(11.04f, 12.833f)
                lineTo(12.36f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.28f, 12f)
                lineTo(21.6f, 12.833f)
                lineTo(20.28f, 13.667f)
                lineTo(18.96f, 12.833f)
                lineTo(20.28f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12.32f, 15.3f)
                curveTo(12.541f, 15.3f, 12.72f, 15.121f, 12.72f, 14.9f)
                curveTo(12.72f, 14.679f, 12.541f, 14.5f, 12.32f, 14.5f)
                curveTo(12.099f, 14.5f, 11.92f, 14.679f, 11.92f, 14.9f)
                curveTo(11.92f, 15.121f, 12.099f, 15.3f, 12.32f, 15.3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFDFF00)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(20.83f, 14.543f)
                curveTo(20.487f, 14.265f, 19.96f, 14.345f, 19.654f, 14.723f)
                curveTo(19.349f, 15.101f, 19.379f, 15.632f, 19.722f, 15.911f)
                curveTo(19.909f, 16.062f, 19.812f, 15.461f, 20.094f, 15.079f)
                curveTo(20.331f, 14.758f, 20.987f, 14.67f, 20.83f, 14.543f)
                close()
            }
        }
        path(
            fill = SolidColor(Color(0xFF048F02)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(4.737f, 11.529f)
            curveTo(4.737f, 11.529f, 5.791f, 12.775f, 6.783f, 12.368f)
            curveTo(7.776f, 11.96f, 7.535f, 10.5f, 7.535f, 10.5f)
            lineTo(6.783f, 11.182f)
            horizontalLineTo(6.143f)
            verticalLineTo(11.529f)
            lineTo(5.643f, 11.182f)
            verticalLineTo(11.529f)
            horizontalLineTo(4.737f)
            close()
            moveTo(5.45f, 13.444f)
            curveTo(5.45f, 13.444f, 6.734f, 14.565f, 7.6f, 14.248f)
            curveTo(8.466f, 13.931f, 8.248f, 12.415f, 8.248f, 12.415f)
            lineTo(7.496f, 13.097f)
            horizontalLineTo(6.856f)
            verticalLineTo(13.444f)
            lineTo(6.356f, 13.097f)
            verticalLineTo(13.444f)
            horizontalLineTo(5.45f)
            close()
            moveTo(8.909f, 15.987f)
            curveTo(8.044f, 16.304f, 6.759f, 15.183f, 6.759f, 15.183f)
            horizontalLineTo(7.666f)
            verticalLineTo(14.836f)
            lineTo(8.166f, 15.183f)
            verticalLineTo(14.836f)
            horizontalLineTo(8.806f)
            lineTo(9.558f, 14.153f)
            curveTo(9.558f, 14.153f, 9.775f, 15.67f, 8.909f, 15.987f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFFDFF00)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(13.979f, 2.248f)
            horizontalLineTo(12.979f)
            verticalLineTo(2.844f)
            horizontalLineTo(12.509f)
            verticalLineTo(3.844f)
            horizontalLineTo(12.979f)
            verticalLineTo(5.589f)
            horizontalLineTo(13.979f)
            verticalLineTo(3.844f)
            horizontalLineTo(14.552f)
            verticalLineTo(2.844f)
            horizontalLineTo(13.979f)
            verticalLineTo(2.248f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFFDB4400)),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.158f, 3.385f)
            lineTo(12.842f, 3.981f)
            lineTo(15.158f, 4.713f)
            verticalLineTo(3.385f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoldovaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Large.Moldova,
            contentDescription = "Moldova Flag"
        )
    }
}
