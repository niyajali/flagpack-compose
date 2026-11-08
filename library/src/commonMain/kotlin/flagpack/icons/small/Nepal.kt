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
 * Nepal Flag (16x12dp)
 *
 * - ISO Alpha-2: NP
 * - ISO Alpha-3: NPL
 * - ISO Numeric: 524
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public val FlagIcons.Small.Nepal: ImageVector by lazy {
    ImageVector.Builder(
        name = "Nepal:NP:NPL:524:Small",
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
            path(fill = SolidColor(Color.White)) {
                moveTo(0f, 0f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC51918)),
                stroke = SolidColor(Color(0xFF4857A1)),
                strokeLineWidth = 1f
            ) {
                moveTo(5.616f, 6.32f)
                lineTo(9.932f, 11.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.842f)
                lineTo(9.039f, 5.5f)
                horizontalLineTo(6f)
                horizontalLineTo(4.932f)
                lineTo(5.616f, 6.32f)
                close()
            }
        }
        group(
            clipPathData = PathData {
                moveTo(5.616f, 6.32f)
                lineTo(9.932f, 11.5f)
                horizontalLineTo(0.5f)
                verticalLineTo(0.842f)
                lineTo(9.039f, 5.5f)
                horizontalLineTo(6f)
                horizontalLineTo(4.932f)
                lineTo(5.616f, 6.32f)
                close()
            }
        ) {
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.915f, 10.005f)
                lineTo(2.302f, 10.8f)
                lineTo(2.274f, 9.797f)
                lineTo(1.311f, 10.08f)
                lineTo(1.878f, 9.252f)
                lineTo(0.932f, 8.915f)
                lineTo(1.878f, 8.578f)
                lineTo(1.311f, 7.75f)
                lineTo(2.274f, 8.033f)
                lineTo(2.302f, 7.029f)
                lineTo(2.915f, 7.825f)
                lineTo(3.527f, 7.029f)
                lineTo(3.556f, 8.033f)
                lineTo(4.519f, 7.75f)
                lineTo(3.952f, 8.578f)
                lineTo(4.897f, 8.915f)
                lineTo(3.952f, 9.252f)
                lineTo(4.519f, 10.08f)
                lineTo(3.556f, 9.797f)
                lineTo(3.527f, 10.8f)
                lineTo(2.915f, 10.005f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF7FCFF)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.9f, 4.069f)
                lineTo(2.58f, 4.485f)
                lineTo(2.565f, 3.961f)
                lineTo(2.062f, 4.109f)
                lineTo(2.358f, 3.676f)
                lineTo(1.865f, 3.5f)
                lineTo(2.358f, 3.324f)
                lineTo(2.062f, 2.891f)
                lineTo(2.565f, 3.039f)
                lineTo(2.58f, 2.515f)
                lineTo(2.9f, 2.931f)
                lineTo(3.22f, 2.515f)
                lineTo(3.235f, 3.039f)
                lineTo(3.738f, 2.891f)
                lineTo(3.442f, 3.324f)
                lineTo(3.935f, 3.5f)
                lineTo(3.442f, 3.676f)
                lineTo(3.738f, 4.109f)
                lineTo(3.235f, 3.961f)
                lineTo(3.22f, 4.485f)
                lineTo(2.9f, 4.069f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF9FAFA)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2.833f, 3.947f)
                curveTo(3.946f, 3.951f, 4.54f, 3.32f, 4.54f, 3.32f)
                curveTo(4.657f, 4.041f, 3.751f, 4.52f, 2.844f, 4.52f)
                curveTo(1.937f, 4.52f, 1.388f, 3.866f, 1.05f, 3.32f)
                curveTo(1.05f, 3.32f, 1.72f, 3.943f, 2.833f, 3.947f)
                close()
            }
        }
    }.build()
}

@Preview
@Composable
private fun NepalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(
            imageVector = FlagIcons.Small.Nepal,
            contentDescription = "Nepal Flag"
        )
    }
}
