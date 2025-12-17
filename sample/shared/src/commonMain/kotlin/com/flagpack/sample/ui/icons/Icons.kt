package com.flagpack.sample.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import fluent.ui.system.icons.regular.Checkmark
import fluent.ui.system.icons.regular.Code
import fluent.ui.system.icons.regular.Copy
import fluent.ui.system.icons.regular.Dismiss
import fluent.ui.system.icons.regular.Filter
import fluent.ui.system.icons.regular.FilterDismiss
import fluent.ui.system.icons.regular.Globe
import fluent.ui.system.icons.regular.Info
import fluent.ui.system.icons.regular.Location
import fluent.ui.system.icons.regular.Map
import fluent.ui.system.icons.regular.Search
import fluent.ui.system.icons.regular.ArrowDownload

val SearchIcon: ImageVector = FluentIcons.Regular.Search

val DownloadIcon: ImageVector = FluentIcons.Regular.ArrowDownload

val ClearIcon: ImageVector = FluentIcons.Regular.Dismiss

val CopyIcon: ImageVector = FluentIcons.Regular.Copy

val CheckIcon: ImageVector = FluentIcons.Regular.Checkmark

val CloseIcon: ImageVector = FluentIcons.Regular.Dismiss

val CodeIcon: ImageVector = FluentIcons.Regular.Code

val InfoIcon: ImageVector = FluentIcons.Regular.Info

val FilterIcon: ImageVector = FluentIcons.Regular.Filter

val FilterDismiss: ImageVector = FluentIcons.Regular.FilterDismiss

/**
 * Globe icon for "All" region filter
 */
val GlobeIcon: ImageVector = FluentIcons.Regular.Globe

/**
 * Map pin / Location icon for region filters
 */
val MapPinIcon: ImageVector = FluentIcons.Regular.Location

/**
 * Location icon alias
 */
val LocationIcon: ImageVector get() = MapPinIcon

/**
 * Grid view icon
 */
val GridIcon: ImageVector
    get() = ImageVector.Builder(
        name = "Grid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            // Top-left
            moveTo(3f, 3f)
            lineTo(10f, 3f)
            lineTo(10f, 10f)
            lineTo(3f, 10f)
            close()
        }
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            // Top-right
            moveTo(14f, 3f)
            lineTo(21f, 3f)
            lineTo(21f, 10f)
            lineTo(14f, 10f)
            close()
        }
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            // Bottom-left
            moveTo(3f, 14f)
            lineTo(10f, 14f)
            lineTo(10f, 21f)
            lineTo(3f, 21f)
            close()
        }
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            // Bottom-right
            moveTo(14f, 14f)
            lineTo(21f, 14f)
            lineTo(21f, 21f)
            lineTo(14f, 21f)
            close()
        }
    }.build()

/**
 * List view icon
 */
val ListIcon: ImageVector
    get() = ImageVector.Builder(
        name = "List",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 6f)
            lineTo(21f, 6f)
        }
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 12f)
            lineTo(21f, 12f)
        }
        path(
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveTo(8f, 18f)
            lineTo(21f, 18f)
        }
        path(
            fill = SolidColor(Color.Black),
            stroke = null
        ) {
            moveTo(3f, 6f)
            arcTo(1f, 1f, 0f, true, false, 3f, 6.01f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            stroke = null
        ) {
            moveTo(3f, 12f)
            arcTo(1f, 1f, 0f, true, false, 3f, 12.01f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            stroke = null
        ) {
            moveTo(3f, 18f)
            arcTo(1f, 1f, 0f, true, false, 3f, 18.01f)
            close()
        }
    }.build()

/**
 * Sparkles icon for app branding
 */
val SparklesIcon: ImageVector
    get() = ImageVector.Builder(
        name = "Sparkles",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        // Main large star
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.937f, 2.5f)
            curveToRelative(0.227f, -0.667f, 1.163f, -0.667f, 1.39f, 0f)
            lineToRelative(1.386f, 4.074f)
            curveToRelative(0.166f, 0.489f, 0.555f, 0.873f, 1.044f, 1.033f)
            lineToRelative(3.998f, 1.306f)
            curveToRelative(0.67f, 0.219f, 0.67f, 1.155f, 0f, 1.374f)
            lineToRelative(-3.998f, 1.306f)
            curveToRelative(-0.489f, 0.16f, -0.878f, 0.544f, -1.044f, 1.033f)
            lineToRelative(-1.386f, 4.074f)
            curveToRelative(-0.227f, 0.667f, -1.163f, 0.667f, -1.39f, 0f)
            lineToRelative(-1.386f, -4.074f)
            curveToRelative(-0.166f, -0.489f, -0.555f, -0.873f, -1.044f, -1.033f)
            lineToRelative(-3.998f, -1.306f)
            curveToRelative(-0.67f, -0.219f, -0.67f, -1.155f, 0f, -1.374f)
            lineToRelative(3.998f, -1.306f)
            curveToRelative(0.489f, -0.16f, 0.878f, -0.544f, 1.044f, -1.033f)
            lineToRelative(1.386f, -4.074f)
            close()
        }
        // Small star
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 1f,
            stroke = null,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18.5f, 13.5f)
            curveToRelative(0.167f, -0.5f, 0.833f, -0.5f, 1f, 0f)
            lineToRelative(0.75f, 2.25f)
            lineToRelative(2.25f, 0.75f)
            curveToRelative(0.5f, 0.167f, 0.5f, 0.833f, 0f, 1f)
            lineToRelative(-2.25f, 0.75f)
            lineToRelative(-0.75f, 2.25f)
            curveToRelative(-0.167f, 0.5f, -0.833f, 0.5f, -1f, 0f)
            lineToRelative(-0.75f, -2.25f)
            lineToRelative(-2.25f, -0.75f)
            curveToRelative(-0.5f, -0.167f, -0.5f, -0.833f, 0f, -1f)
            lineToRelative(2.25f, -0.75f)
            lineToRelative(0.75f, -2.25f)
            close()
        }
    }.build()

/**
 * Sparkle icon (single sparkle) - alias
 */
val SparkleIcon: ImageVector get() = SparklesIcon
