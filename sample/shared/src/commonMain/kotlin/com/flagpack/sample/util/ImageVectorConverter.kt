package com.flagpack.sample.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorNode
import androidx.compose.ui.graphics.vector.VectorPath

/**
 * Utility object for converting ImageVector to SVG and Android Vector Drawable XML formats.
 * Ensures the generated output maintains visual fidelity with the original ImageVector.
 */
object ImageVectorConverter {

    /**
     * Converts an ImageVector to SVG format.
     *
     * @param imageVector The ImageVector to convert
     * @param countryName Optional country name for the SVG title
     * @return SVG string representation
     */
    fun toSvg(imageVector: ImageVector, countryName: String? = null): String {
        val width = imageVector.defaultWidth.value
        val height = imageVector.defaultHeight.value
        val viewportWidth = imageVector.viewportWidth
        val viewportHeight = imageVector.viewportHeight

        return buildString {
            appendLine("""<?xml version="1.0" encoding="UTF-8"?>""")
            append("<svg ")
            append("""xmlns="http://www.w3.org/2000/svg" """)
            append("""width="$width" """)
            append("""height="$height" """)
            append("""viewBox="0 0 $viewportWidth $viewportHeight"""")
            appendLine(">")

            countryName?.let {
                appendLine("  <title>$it Flag</title>")
            }

            // Process root group
            imageVector.root.let { root ->
                processVectorGroupToSvg(root, this, indent = "  ")
            }

            appendLine("</svg>")
        }
    }

    /**
     * Converts an ImageVector to Android Vector Drawable XML format.
     *
     * @param imageVector The ImageVector to convert
     * @param countryName Optional country name for comments
     * @return Android Vector Drawable XML string representation
     */
    fun toXml(imageVector: ImageVector, countryName: String? = null): String {
        val width = imageVector.defaultWidth.value
        val height = imageVector.defaultHeight.value
        val viewportWidth = imageVector.viewportWidth
        val viewportHeight = imageVector.viewportHeight

        return buildString {
            appendLine("""<?xml version="1.0" encoding="UTF-8"?>""")
            countryName?.let {
                appendLine("<!-- $it Flag -->")
            }
            appendLine("<vector")
            appendLine("""    xmlns:android="http://schemas.android.com/apk/res/android"""")
            appendLine("""    android:width="${width}dp"""")
            appendLine("""    android:height="${height}dp"""")
            appendLine("""    android:viewportWidth="$viewportWidth"""")
            appendLine("""    android:viewportHeight="$viewportHeight">""")

            // Process root group
            imageVector.root.let { root ->
                processVectorGroupToXml(root, this, indent = "    ")
            }

            appendLine("</vector>")
        }
    }

    private fun processVectorGroupToSvg(group: VectorGroup, builder: StringBuilder, indent: String) {
        val hasClipPath = group.clipPathData.isNotEmpty()
        val clipPathId = if (hasClipPath) "clip_${group.name.hashCode().toUInt()}" else null

        // Define clip path if present
        if (hasClipPath && clipPathId != null) {
            builder.appendLine("$indent<defs>")
            builder.append("$indent  <clipPath id=\"$clipPathId\">")
            builder.append("<path d=\"${pathDataToSvgPath(group.clipPathData)}\"/>")
            builder.appendLine("</clipPath>")
            builder.appendLine("$indent</defs>")
        }

        // Open group if it has transformations or clip path
        val hasTransform = group.translationX != 0f || group.translationY != 0f ||
                group.scaleX != 1f || group.scaleY != 1f ||
                group.rotation != 0f

        if (hasTransform || hasClipPath) {
            builder.append("$indent<g")
            if (clipPathId != null) {
                builder.append(""" clip-path="url(#$clipPathId)"""")
            }
            if (hasTransform) {
                val transforms = mutableListOf<String>()
                if (group.translationX != 0f || group.translationY != 0f) {
                    transforms.add("translate(${group.translationX}, ${group.translationY})")
                }
                if (group.scaleX != 1f || group.scaleY != 1f) {
                    transforms.add("scale(${group.scaleX}, ${group.scaleY})")
                }
                if (group.rotation != 0f) {
                    transforms.add("rotate(${group.rotation}, ${group.pivotX}, ${group.pivotY})")
                }
                builder.append(""" transform="${transforms.joinToString(" ")}"""")
            }
            builder.appendLine(">")
        }

        // Process children
        for (node in group) {
            when (node) {
                is VectorPath -> processVectorPathToSvg(node, builder, indent + "  ")
                is VectorGroup -> processVectorGroupToSvg(node, builder, indent + "  ")
            }
        }

        if (hasTransform || hasClipPath) {
            builder.appendLine("$indent</g>")
        }
    }

    private fun processVectorPathToSvg(path: VectorPath, builder: StringBuilder, indent: String) {
        builder.append("$indent<path")

        // Path data
        val pathData = pathDataToSvgPath(path.pathData)
        builder.append(""" d="$pathData"""")

        // Fill
        when (val fill = path.fill) {
            is SolidColor -> {
                val color = fill.value
                if (color != Color.Transparent) {
                    builder.append(""" fill="${colorToSvgColor(color)}"""")
                    if (color.alpha < 1f) {
                        builder.append(""" fill-opacity="${color.alpha}"""")
                    }
                } else {
                    builder.append(""" fill="none"""")
                }
            }
            null -> builder.append(""" fill="none"""")
            else -> builder.append(""" fill="none"""")
        }

        // Fill alpha
        if (path.fillAlpha < 1f && path.fill != null) {
            builder.append(""" fill-opacity="${path.fillAlpha}"""")
        }

        // Stroke
        when (val stroke = path.stroke) {
            is SolidColor -> {
                val color = stroke.value
                if (color != Color.Transparent) {
                    builder.append(""" stroke="${colorToSvgColor(color)}"""")
                    if (color.alpha < 1f) {
                        builder.append(""" stroke-opacity="${color.alpha}"""")
                    }
                }
            }
            else -> {} // No stroke
        }

        // Stroke width
        if (path.strokeLineWidth > 0f) {
            builder.append(""" stroke-width="${path.strokeLineWidth}"""")
        }

        // Stroke alpha
        if (path.strokeAlpha < 1f && path.stroke != null) {
            builder.append(""" stroke-opacity="${path.strokeAlpha}"""")
        }

        // Fill rule
        if (path.pathFillType == PathFillType.EvenOdd) {
            builder.append(""" fill-rule="evenodd"""")
        }

        // Stroke line cap
        when (path.strokeLineCap) {
            androidx.compose.ui.graphics.StrokeCap.Round -> builder.append(""" stroke-linecap="round"""")
            androidx.compose.ui.graphics.StrokeCap.Square -> builder.append(""" stroke-linecap="square"""")
            else -> {} // butt is default
        }

        // Stroke line join
        when (path.strokeLineJoin) {
            androidx.compose.ui.graphics.StrokeJoin.Round -> builder.append(""" stroke-linejoin="round"""")
            androidx.compose.ui.graphics.StrokeJoin.Bevel -> builder.append(""" stroke-linejoin="bevel"""")
            else -> {} // miter is default
        }

        // Stroke miter limit
        if (path.strokeLineMiter != 4f) {
            builder.append(""" stroke-miterlimit="${path.strokeLineMiter}"""")
        }

        builder.appendLine("/>")
    }

    private fun processVectorGroupToXml(group: VectorGroup, builder: StringBuilder, indent: String) {
        val hasClipPath = group.clipPathData.isNotEmpty()
        val hasTransform = group.translationX != 0f || group.translationY != 0f ||
                group.scaleX != 1f || group.scaleY != 1f ||
                group.rotation != 0f

        val needsGroup = hasClipPath || hasTransform

        if (needsGroup) {
            builder.appendLine("$indent<group")
            if (group.name.isNotEmpty()) {
                builder.appendLine("""$indent    android:name="${group.name}"""")
            }
            if (group.rotation != 0f) {
                builder.appendLine("""$indent    android:rotation="${group.rotation}"""")
            }
            if (group.pivotX != 0f) {
                builder.appendLine("""$indent    android:pivotX="${group.pivotX}"""")
            }
            if (group.pivotY != 0f) {
                builder.appendLine("""$indent    android:pivotY="${group.pivotY}"""")
            }
            if (group.scaleX != 1f) {
                builder.appendLine("""$indent    android:scaleX="${group.scaleX}"""")
            }
            if (group.scaleY != 1f) {
                builder.appendLine("""$indent    android:scaleY="${group.scaleY}"""")
            }
            if (group.translationX != 0f) {
                builder.appendLine("""$indent    android:translateX="${group.translationX}"""")
            }
            if (group.translationY != 0f) {
                builder.appendLine("""$indent    android:translateY="${group.translationY}"""")
            }
            builder.appendLine("$indent>")

            // Add clip-path as a child element if present
            if (hasClipPath) {
                builder.appendLine("$indent    <clip-path")
                builder.appendLine("""$indent        android:pathData="${pathDataToXmlPath(group.clipPathData)}"/>""")
            }
        }

        // Process children
        val childIndent = if (needsGroup) "$indent    " else indent
        for (node in group) {
            when (node) {
                is VectorPath -> processVectorPathToXml(node, builder, childIndent)
                is VectorGroup -> processVectorGroupToXml(node, builder, childIndent)
            }
        }

        if (needsGroup) {
            builder.appendLine("$indent</group>")
        }
    }

    private fun processVectorPathToXml(path: VectorPath, builder: StringBuilder, indent: String) {
        builder.appendLine("$indent<path")

        // Path data
        val pathData = pathDataToXmlPath(path.pathData)
        builder.appendLine("""$indent    android:pathData="$pathData"""")

        // Fill color
        when (val fill = path.fill) {
            is SolidColor -> {
                val color = fill.value
                if (color != Color.Transparent) {
                    builder.appendLine("""$indent    android:fillColor="${colorToXmlColor(color)}"""")
                }
            }
            else -> {}
        }

        // Fill alpha
        if (path.fillAlpha < 1f) {
            builder.appendLine("""$indent    android:fillAlpha="${path.fillAlpha}"""")
        }

        // Stroke color
        when (val stroke = path.stroke) {
            is SolidColor -> {
                val color = stroke.value
                if (color != Color.Transparent) {
                    builder.appendLine("""$indent    android:strokeColor="${colorToXmlColor(color)}"""")
                }
            }
            else -> {}
        }

        // Stroke width
        if (path.strokeLineWidth > 0f) {
            builder.appendLine("""$indent    android:strokeWidth="${path.strokeLineWidth}"""")
        }

        // Stroke alpha
        if (path.strokeAlpha < 1f) {
            builder.appendLine("""$indent    android:strokeAlpha="${path.strokeAlpha}"""")
        }

        // Fill type
        if (path.pathFillType == PathFillType.EvenOdd) {
            builder.appendLine("""$indent    android:fillType="evenOdd"""")
        }

        // Stroke line cap
        when (path.strokeLineCap) {
            androidx.compose.ui.graphics.StrokeCap.Round ->
                builder.appendLine("""$indent    android:strokeLineCap="round"""")
            androidx.compose.ui.graphics.StrokeCap.Square ->
                builder.appendLine("""$indent    android:strokeLineCap="square"""")
            else -> {}
        }

        // Stroke line join
        when (path.strokeLineJoin) {
            androidx.compose.ui.graphics.StrokeJoin.Round ->
                builder.appendLine("""$indent    android:strokeLineJoin="round"""")
            androidx.compose.ui.graphics.StrokeJoin.Bevel ->
                builder.appendLine("""$indent    android:strokeLineJoin="bevel"""")
            else -> {}
        }

        // Stroke miter limit
        if (path.strokeLineMiter != 4f) {
            builder.appendLine("""$indent    android:strokeMiterLimit="${path.strokeLineMiter}"""")
        }

        builder.appendLine("$indent/>")
    }

    private fun pathDataToSvgPath(pathData: List<PathNode>): String {
        return buildString {
            for (node in pathData) {
                when (node) {
                    is PathNode.MoveTo -> append("M${node.x} ${node.y}")
                    is PathNode.RelativeMoveTo -> append("m${node.dx} ${node.dy}")
                    is PathNode.LineTo -> append("L${node.x} ${node.y}")
                    is PathNode.RelativeLineTo -> append("l${node.dx} ${node.dy}")
                    is PathNode.HorizontalTo -> append("H${node.x}")
                    is PathNode.RelativeHorizontalTo -> append("h${node.dx}")
                    is PathNode.VerticalTo -> append("V${node.y}")
                    is PathNode.RelativeVerticalTo -> append("v${node.dy}")
                    is PathNode.CurveTo -> append("C${node.x1} ${node.y1} ${node.x2} ${node.y2} ${node.x3} ${node.y3}")
                    is PathNode.RelativeCurveTo -> append("c${node.dx1} ${node.dy1} ${node.dx2} ${node.dy2} ${node.dx3} ${node.dy3}")
                    is PathNode.ReflectiveCurveTo -> append("S${node.x1} ${node.y1} ${node.x2} ${node.y2}")
                    is PathNode.RelativeReflectiveCurveTo -> append("s${node.dx1} ${node.dy1} ${node.dx2} ${node.dy2}")
                    is PathNode.QuadTo -> append("Q${node.x1} ${node.y1} ${node.x2} ${node.y2}")
                    is PathNode.RelativeQuadTo -> append("q${node.dx1} ${node.dy1} ${node.dx2} ${node.dy2}")
                    is PathNode.ReflectiveQuadTo -> append("T${node.x} ${node.y}")
                    is PathNode.RelativeReflectiveQuadTo -> append("t${node.dx} ${node.dy}")
                    is PathNode.ArcTo -> {
                        val largeArc = if (node.isMoreThanHalf) 1 else 0
                        val sweep = if (node.isPositiveArc) 1 else 0
                        append("A${node.horizontalEllipseRadius} ${node.verticalEllipseRadius} ${node.theta} $largeArc $sweep ${node.arcStartX} ${node.arcStartY}")
                    }
                    is PathNode.RelativeArcTo -> {
                        val largeArc = if (node.isMoreThanHalf) 1 else 0
                        val sweep = if (node.isPositiveArc) 1 else 0
                        append("a${node.horizontalEllipseRadius} ${node.verticalEllipseRadius} ${node.theta} $largeArc $sweep ${node.arcStartDx} ${node.arcStartDy}")
                    }
                    PathNode.Close -> append("Z")
                }
                append(" ")
            }
        }.trim()
    }

    private fun pathDataToXmlPath(pathData: List<PathNode>): String {
        // Android Vector Drawable uses the same path syntax as SVG
        return pathDataToSvgPath(pathData)
    }

    private fun colorToSvgColor(color: Color): String {
        val red = (color.red * 255).toInt()
        val green = (color.green * 255).toInt()
        val blue = (color.blue * 255).toInt()
        return "#${red.toHexString()}${green.toHexString()}${blue.toHexString()}"
    }

    private fun colorToXmlColor(color: Color): String {
        val alpha = (color.alpha * 255).toInt()
        val red = (color.red * 255).toInt()
        val green = (color.green * 255).toInt()
        val blue = (color.blue * 255).toInt()
        return if (alpha == 255) {
            "#${red.toHexString()}${green.toHexString()}${blue.toHexString()}"
        } else {
            "#${alpha.toHexString()}${red.toHexString()}${green.toHexString()}${blue.toHexString()}"
        }
    }

    private fun Int.toHexString(): String {
        val hex = this.toString(16).uppercase()
        return if (hex.length == 1) "0$hex" else hex
    }
}
