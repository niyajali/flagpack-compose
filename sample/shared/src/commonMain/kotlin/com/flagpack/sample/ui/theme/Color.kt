package com.flagpack.sample.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/**
 * Primary accent colors - Violet to Indigo gradient palette
 */
object AccentColors {
    val Violet600 = Color(0xFF7C3AED)
    val Violet500 = Color(0xFF8B5CF6)
    val Violet400 = Color(0xFFA78BFA)
    val Violet300 = Color(0xFFC4B5FD)
    val Violet100 = Color(0xFFEDE9FE)

    val Indigo600 = Color(0xFF4F46E5)
    val Indigo500 = Color(0xFF6366F1)

    val Emerald500 = Color(0xFF10B981)
    val Emerald400 = Color(0xFF34D399)
}

/**
 * Dark theme colors - Slate palette
 */
object DarkColors {
    val Background = Color(0xFF020617)      // slate-950
    val Surface = Color(0xFF0F172A)          // slate-900
    val SurfaceVariant = Color(0xFF1E293B)   // slate-800
    val SurfaceContainer = Color(0xFF334155) // slate-700

    val OnBackground = Color(0xFFF8FAFC)     // slate-50
    val OnSurface = Color(0xFFF1F5F9)        // slate-100
    val OnSurfaceVariant = Color(0xFF94A3B8) // slate-400

    val Outline = Color(0xFF475569)          // slate-600
    val OutlineVariant = Color(0xFF334155)   // slate-700
}

/**
 * Light theme colors - Gray palette
 */
object LightColors {
    val Background = Color(0xFFF8FAFC)       // slate-50
    val Surface = Color(0xFFFFFFFF)          // white
    val SurfaceVariant = Color(0xFFE2E8F0)   // slate-200
    val SurfaceContainer = Color(0xFFF1F5F9) // slate-100

    val OnBackground = Color(0xFF0F172A)     // slate-900
    val OnSurface = Color(0xFF1E293B)        // slate-800
    val OnSurfaceVariant = Color(0xFF64748B) // slate-500

    val Outline = Color(0xFFCBD5E1)          // slate-300
    val OutlineVariant = Color(0xFFE2E8F0)   // slate-200
}

/**
 * Light color scheme for Material3
 */
val FlagpackLightColorScheme = lightColorScheme(
    primary = AccentColors.Violet600,
    onPrimary = Color.White,
    primaryContainer = AccentColors.Violet100,
    onPrimaryContainer = AccentColors.Violet600,

    secondary = AccentColors.Indigo600,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFE0E7FF),
    onSecondaryContainer = AccentColors.Indigo600,

    tertiary = AccentColors.Emerald500,
    onTertiary = Color.White,
    tertiaryContainer = Color(0xFFD1FAE5),
    onTertiaryContainer = Color(0xFF065F46),

    background = LightColors.Background,
    onBackground = LightColors.OnBackground,

    surface = LightColors.Surface,
    onSurface = LightColors.OnSurface,
    surfaceVariant = LightColors.SurfaceVariant,
    onSurfaceVariant = LightColors.OnSurfaceVariant,
    surfaceContainer = LightColors.SurfaceContainer,

    outline = LightColors.Outline,
    outlineVariant = LightColors.OutlineVariant
)

/**
 * Dark color scheme for Material3
 */
val FlagpackDarkColorScheme = darkColorScheme(
    primary = AccentColors.Violet500,
    onPrimary = Color.White,
    primaryContainer = AccentColors.Violet600,
    onPrimaryContainer = AccentColors.Violet100,

    secondary = AccentColors.Indigo500,
    onSecondary = Color.White,
    secondaryContainer = AccentColors.Indigo600,
    onSecondaryContainer = Color(0xFFE0E7FF),

    tertiary = AccentColors.Emerald400,
    onTertiary = Color(0xFF065F46),
    tertiaryContainer = Color(0xFF065F46),
    onTertiaryContainer = AccentColors.Emerald400,

    background = DarkColors.Background,
    onBackground = DarkColors.OnBackground,

    surface = DarkColors.Surface,
    onSurface = DarkColors.OnSurface,
    surfaceVariant = DarkColors.SurfaceVariant,
    onSurfaceVariant = DarkColors.OnSurfaceVariant,
    surfaceContainer = DarkColors.SurfaceContainer,

    outline = DarkColors.Outline,
    outlineVariant = DarkColors.OutlineVariant
)

/**
 * Gradient colors for accent elements
 */
object GradientColors {
    val Primary = listOf(AccentColors.Violet600, AccentColors.Indigo600)
    val PrimaryLight = listOf(AccentColors.Violet100, AccentColors.Violet300)
}
