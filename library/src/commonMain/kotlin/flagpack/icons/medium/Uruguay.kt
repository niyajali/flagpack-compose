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
 * Uruguay Flag (20x15dp)
 *
 * - ISO Alpha-2: UY
 * - ISO Alpha-3: URY
 * - ISO Numeric: 858
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Medium.Uruguay: ImageVector by lazy {
    ImageVector.Builder(
        name = "Uruguay:UY:URY:858:Medium",
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
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 2.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 7.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 10f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF2E42A5))) {
                moveTo(0f, 12.5f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(1.25f)
                horizontalLineToRelative(-20f)
                close()
            }
            path(fill = SolidColor(Color(0xFFF7FCFF))) {
                moveTo(0f, 0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8.75f)
                horizontalLineToRelative(-10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.767f, 6.898f)
                curveTo(5.767f, 6.898f, 5.129f, 8.222f, 4.567f, 8.494f)
                curveTo(4.809f, 7.887f, 4.899f, 6.647f, 4.899f, 6.647f)
                curveTo(4.899f, 6.647f, 3.441f, 7.225f, 2.93f, 7.12f)
                curveTo(3.545f, 6.69f, 4.399f, 5.894f, 4.399f, 5.894f)
                curveTo(4.399f, 5.894f, 2.512f, 5.277f, 2.558f, 5.015f)
                curveTo(3.41f, 5.167f, 4.581f, 5.001f, 4.581f, 5.001f)
                curveTo(4.581f, 5.001f, 3.258f, 3.414f, 3.392f, 3.296f)
                curveTo(3.594f, 3.492f, 5.18f, 4.32f, 5.18f, 4.32f)
                curveTo(5.18f, 4.32f, 5.295f, 2.908f, 5.636f, 2.432f)
                curveTo(5.677f, 2.768f, 6.156f, 4.29f, 6.156f, 4.29f)
                curveTo(6.156f, 4.29f, 7.119f, 3.326f, 7.654f, 3.326f)
                curveTo(7.419f, 3.617f, 6.863f, 4.896f, 6.863f, 4.896f)
                curveTo(6.863f, 4.896f, 8.248f, 4.874f, 8.775f, 5.134f)
                curveTo(8.137f, 5.224f, 7.019f, 5.786f, 7.019f, 5.786f)
                curveTo(7.019f, 5.786f, 8.475f, 6.89f, 8.342f, 7.12f)
                curveTo(7.561f, 6.737f, 6.657f, 6.609f, 6.657f, 6.609f)
                curveTo(6.657f, 6.609f, 6.907f, 8.146f, 6.705f, 8.494f)
                curveTo(6.508f, 7.982f, 5.767f, 6.898f, 5.767f, 6.898f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFD018)),
                stroke = SolidColor(Color(0xFFF19900)),
                strokeAlpha = 0.98f,
                strokeLineWidth = 0.5f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5.683f, 6.182f)
                curveTo(6.029f, 6.182f, 6.308f, 5.903f, 6.308f, 5.557f)
                curveTo(6.308f, 5.212f, 6.029f, 4.932f, 5.683f, 4.932f)
                curveTo(5.338f, 4.932f, 5.058f, 5.212f, 5.058f, 5.557f)
                curveTo(5.058f, 5.903f, 5.338f, 6.182f, 5.683f, 6.182f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun UruguayPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Medium.Uruguay,
            contentDescription = "Uruguay Flag"
        )
    }
}
