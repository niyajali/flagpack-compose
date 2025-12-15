package com.flagpack.sample

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.flagpack.sample.model.FlagInfo
import com.flagpack.sample.model.FlagSize
import com.flagpack.sample.model.Region
import com.flagpack.sample.ui.components.CompactFilterBar
import com.flagpack.sample.ui.components.CompactSearchBar
import com.flagpack.sample.ui.components.FilterBar
import com.flagpack.sample.ui.components.FlagDetailDialog
import com.flagpack.sample.ui.components.FlagGrid
import com.flagpack.sample.ui.components.SearchBar
import com.flagpack.sample.ui.components.ViewMode
import com.flagpack.sample.ui.icons.FilterDismiss
import com.flagpack.sample.ui.icons.FilterIcon
import com.flagpack.sample.ui.icons.GridIcon
import com.flagpack.sample.ui.icons.ListIcon
import com.flagpack.sample.ui.theme.FlagpackDarkColorScheme
import com.flagpack.sample.ui.theme.FlagpackLightColorScheme
import com.flagpack.sample.ui.theme.GradientColors
import com.flagpack.sample.ui.theme.Strings
import flagpack.icons.FlagIcons
import flagpack.icons.LargeFlagList
import flagpack.icons.MediumFlagList
import flagpack.icons.SmallFlagList
import flagpack_compose.sample.shared.generated.resources.Res
import flagpack_compose.sample.shared.generated.resources.flagpack_removebg
import org.jetbrains.compose.resources.painterResource

/**
 * Screen size breakpoints for adaptive layout
 */
private object ScreenBreakpoints {
    const val COMPACT = 600
    const val MEDIUM = 840
    const val EXPANDED = 1200
}

@Composable
fun App(darkTheme: Boolean = false) {
    val colorScheme = if (darkTheme) FlagpackDarkColorScheme else FlagpackLightColorScheme

    MaterialTheme(colorScheme = colorScheme) {
        // State management
        var searchQuery by remember { mutableStateOf("") }
        var selectedSize by remember { mutableStateOf(FlagSize.Large) }
        var selectedRegion by remember { mutableStateOf(Region.All) }
        var selectedFlag by remember { mutableStateOf<FlagInfo?>(null) }
        var showFilters by remember { mutableStateOf(true) }
        var viewMode by remember { mutableStateOf(ViewMode.Grid) }

        // Load flags based on selected size
        val allFlags by remember(selectedSize) {
            derivedStateOf { loadFlags(selectedSize) }
        }

        // Filtered flags
        val filteredFlags by remember(allFlags, searchQuery, selectedRegion) {
            derivedStateOf { filterFlags(allFlags, searchQuery, selectedRegion) }
        }

        // Flag count for display
        val flagCountText by remember(filteredFlags, allFlags) {
            derivedStateOf {
                if (searchQuery.isEmpty() && selectedRegion == Region.All) {
                    "${allFlags.size} flags"
                } else {
                    "${filteredFlags.size} of ${allFlags.size} flags"
                }
            }
        }

        Scaffold(
            containerColor = MaterialTheme.colorScheme.background
        ) { paddingValues ->
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                color = MaterialTheme.colorScheme.background
            ) {
                BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
                    val screenWidth = maxWidth.value.toInt()

                    when {
                        screenWidth < ScreenBreakpoints.COMPACT -> {
                            CompactLayout(
                                searchQuery = searchQuery,
                                onSearchQueryChange = { searchQuery = it },
                                selectedSize = selectedSize,
                                onSizeSelected = { selectedSize = it },
                                selectedRegion = selectedRegion,
                                onRegionSelected = { selectedRegion = it },
                                flags = filteredFlags,
                                onFlagClick = { selectedFlag = it },
                                showFilters = showFilters,
                                onToggleFilters = { showFilters = !showFilters },
                                viewMode = viewMode,
                                onViewModeChange = { viewMode = it },
                                flagCountText = flagCountText
                            )
                        }

                        screenWidth < ScreenBreakpoints.MEDIUM -> {
                            MediumLayout(
                                searchQuery = searchQuery,
                                onSearchQueryChange = { searchQuery = it },
                                selectedSize = selectedSize,
                                onSizeSelected = { selectedSize = it },
                                selectedRegion = selectedRegion,
                                onRegionSelected = { selectedRegion = it },
                                flags = filteredFlags,
                                onFlagClick = { selectedFlag = it },
                                showFilters = showFilters,
                                onToggleFilters = { showFilters = !showFilters },
                                viewMode = viewMode,
                                onViewModeChange = { viewMode = it },
                                flagCountText = flagCountText
                            )
                        }

                        else -> {
                            ExpandedLayout(
                                searchQuery = searchQuery,
                                onSearchQueryChange = { searchQuery = it },
                                selectedSize = selectedSize,
                                onSizeSelected = { selectedSize = it },
                                selectedRegion = selectedRegion,
                                onRegionSelected = { selectedRegion = it },
                                flags = filteredFlags,
                                onFlagClick = { selectedFlag = it },
                                showFilters = showFilters,
                                onToggleFilters = { showFilters = !showFilters },
                                viewMode = viewMode,
                                onViewModeChange = { viewMode = it },
                                flagCountText = flagCountText
                            )
                        }
                    }
                }
            }
        }

        // Flag detail dialog
        selectedFlag?.let { flag ->
            FlagDetailDialog(
                flagInfo = flag,
                onDismiss = { selectedFlag = null }
            )
        }
    }
}

@Composable
private fun AppHeader(
    flagCountText: String,
    showFilters: Boolean,
    onToggleFilters: () -> Unit,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    modifier: Modifier = Modifier,
    showViewModeToggle: Boolean = true
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            // Gradient branded icon
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Brush.horizontalGradient(GradientColors.PrimaryLight)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(Res.drawable.flagpack_removebg),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(
                    text = Strings.APP_NAME,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text = flagCountText,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (showViewModeToggle) {
                IconButton(
                    onClick = {
                        onViewModeChange(
                            if (viewMode == ViewMode.Grid) ViewMode.List else ViewMode.Grid
                        )
                    },
                    modifier = Modifier.size(40.dp),
                    colors = IconButtonDefaults.iconButtonColors(
                        containerColor = MaterialTheme.colorScheme.surfaceVariant
                    )
                ) {
                    Icon(
                        imageVector = if (viewMode == ViewMode.Grid) ListIcon else GridIcon,
                        contentDescription = if (viewMode == ViewMode.Grid) {
                            Strings.VIEW_MODE_LIST
                        } else {
                            Strings.VIEW_MODE_GRID
                        },
                        modifier = Modifier.size(20.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            IconButton(
                onClick = onToggleFilters,
                modifier = Modifier.size(40.dp),
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = if (showFilters) {
                        Color.Transparent
                    } else {
                        MaterialTheme.colorScheme.surfaceVariant
                    }
                )
            ) {
                if (showFilters) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(12.dp))
                            .background(Brush.horizontalGradient(GradientColors.Primary)),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            imageVector = FilterDismiss,
                            contentDescription = Strings.TOGGLE_FILTERS_CONTENT_DESC,
                            modifier = Modifier.size(20.dp),
                            tint = Color.White
                        )
                    }
                } else {
                    Icon(
                        imageVector = FilterIcon,
                        contentDescription = Strings.TOGGLE_FILTERS_CONTENT_DESC,
                        modifier = Modifier.size(20.dp),
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
        }
    }
}

@Composable
private fun CompactLayout(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    flags: List<FlagInfo>,
    onFlagClick: (FlagInfo) -> Unit,
    showFilters: Boolean,
    onToggleFilters: () -> Unit,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    flagCountText: String
) {
    Column(modifier = Modifier.fillMaxSize()) {
        AppHeader(
            flagCountText = flagCountText,
            showFilters = showFilters,
            onToggleFilters = onToggleFilters,
            viewMode = viewMode,
            onViewModeChange = onViewModeChange
        )

        SearchBar(
            query = searchQuery,
            onQueryChange = onSearchQueryChange
        )

        AnimatedVisibility(
            visible = showFilters,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {
            CompactFilterBar(
                selectedSize = selectedSize,
                onSizeSelected = onSizeSelected,
                selectedRegion = selectedRegion,
                onRegionSelected = onRegionSelected
            )
        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
        )

        FlagGrid(
            flags = flags,
            displaySize = selectedSize,
            onFlagClick = onFlagClick,
            modifier = Modifier.fillMaxSize(),
            isCompact = true,
            viewMode = viewMode
        )
    }
}

@Composable
private fun MediumLayout(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    flags: List<FlagInfo>,
    onFlagClick: (FlagInfo) -> Unit,
    showFilters: Boolean,
    onToggleFilters: () -> Unit,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    flagCountText: String
) {
    Column(modifier = Modifier.fillMaxSize()) {
        AppHeader(
            flagCountText = flagCountText,
            showFilters = showFilters,
            onToggleFilters = onToggleFilters,
            viewMode = viewMode,
            onViewModeChange = onViewModeChange
        )

        SearchBar(
            query = searchQuery,
            onQueryChange = onSearchQueryChange
        )

        AnimatedVisibility(
            visible = showFilters,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {
            CompactFilterBar(
                selectedSize = selectedSize,
                onSizeSelected = onSizeSelected,
                selectedRegion = selectedRegion,
                onRegionSelected = onRegionSelected
            )
        }

        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
            color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
        )

        FlagGrid(
            flags = flags,
            displaySize = selectedSize,
            onFlagClick = onFlagClick,
            modifier = Modifier.fillMaxSize(),
            isCompact = false,
            viewMode = viewMode
        )
    }
}

@Composable
private fun ExpandedLayout(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    flags: List<FlagInfo>,
    onFlagClick: (FlagInfo) -> Unit,
    showFilters: Boolean,
    onToggleFilters: () -> Unit,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    flagCountText: String
) {
    Row(modifier = Modifier.fillMaxSize()) {
        // Side panel
        AnimatedVisibility(
            visible = showFilters,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {
            SidePanel(
                searchQuery = searchQuery,
                onSearchQueryChange = onSearchQueryChange,
                selectedSize = selectedSize,
                onSizeSelected = onSizeSelected,
                selectedRegion = selectedRegion,
                onRegionSelected = onRegionSelected,
                flagCountText = flagCountText,
                viewMode = viewMode,
                onViewModeChange = onViewModeChange
            )
        }

        if (showFilters) {
            VerticalDivider(
                modifier = Modifier.fillMaxHeight(),
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
            )
        }

        // Main content
        Column(modifier = Modifier.weight(1f)) {
            if (!showFilters) {
                AppHeader(
                    flagCountText = flagCountText,
                    showFilters = showFilters,
                    onToggleFilters = onToggleFilters,
                    viewMode = viewMode,
                    onViewModeChange = onViewModeChange,
                    showViewModeToggle = true
                )

                SearchBar(
                    query = searchQuery,
                    onQueryChange = onSearchQueryChange
                )

                CompactFilterBar(
                    selectedSize = selectedSize,
                    onSizeSelected = onSizeSelected,
                    selectedRegion = selectedRegion,
                    onRegionSelected = onRegionSelected
                )

                HorizontalDivider(
                    modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                    color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
                )
            } else {
                // Minimal header when side panel is visible
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    IconButton(
                        onClick = onToggleFilters,
                        modifier = Modifier.size(40.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = MaterialTheme.colorScheme.surfaceVariant
                        )
                    ) {
                        Icon(
                            imageVector = FilterDismiss,
                            contentDescription = Strings.TOGGLE_FILTERS_CONTENT_DESC,
                            modifier = Modifier.size(20.dp),
                            tint = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            FlagGrid(
                flags = flags,
                displaySize = selectedSize,
                onFlagClick = onFlagClick,
                modifier = Modifier.fillMaxSize(),
                isCompact = false,
                viewMode = viewMode
            )
        }
    }
}

@Composable
private fun SidePanel(
    searchQuery: String,
    onSearchQueryChange: (String) -> Unit,
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    flagCountText: String,
    viewMode: ViewMode,
    onViewModeChange: (ViewMode) -> Unit,
    modifier: Modifier = Modifier,
    width: Dp = 280.dp
) {
    Surface(
        modifier = modifier
            .width(width)
            .fillMaxHeight(),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Branding header
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(bottom = 24.dp)
            ) {
                Box(
                    modifier = Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Brush.horizontalGradient(GradientColors.PrimaryLight)),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(Res.drawable.flagpack_removebg),
                        contentDescription = null,
                        modifier = Modifier.size(28.dp),
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = Strings.APP_NAME,
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = Strings.APP_SUBTITLE,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            // Search
            CompactSearchBar(
                query = searchQuery,
                onQueryChange = onSearchQueryChange,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            // Filters
            FilterBar(
                selectedSize = selectedSize,
                onSizeSelected = onSizeSelected,
                selectedRegion = selectedRegion,
                onRegionSelected = onRegionSelected,
                modifier = Modifier.weight(1f)
            )

            // Footer with count and view toggle
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 12.dp),
                color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = flagCountText,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    ViewModeButton(
                        isSelected = viewMode == ViewMode.Grid,
                        onClick = { onViewModeChange(ViewMode.Grid) },
                        icon = {
                            Icon(
                                imageVector = GridIcon,
                                contentDescription = Strings.VIEW_MODE_GRID,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    )
                    ViewModeButton(
                        isSelected = viewMode == ViewMode.List,
                        onClick = { onViewModeChange(ViewMode.List) },
                        icon = {
                            Icon(
                                imageVector = ListIcon,
                                contentDescription = Strings.VIEW_MODE_LIST,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun ViewModeButton(
    isSelected: Boolean,
    onClick: () -> Unit,
    icon: @Composable () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.size(32.dp),
        colors = IconButtonDefaults.iconButtonColors(
            containerColor = if (isSelected) {
                MaterialTheme.colorScheme.primaryContainer
            } else {
                Color.Transparent
            },
            contentColor = if (isSelected) {
                MaterialTheme.colorScheme.onPrimaryContainer
            } else {
                MaterialTheme.colorScheme.onSurfaceVariant
            }
        )
    ) {
        icon()
    }
}

/**
 * Load flags for the selected size
 */
private fun loadFlags(size: FlagSize): List<FlagInfo> {
    val flagList = when (size) {
        FlagSize.Small -> FlagIcons.SmallFlagList
        FlagSize.Medium -> FlagIcons.MediumFlagList
        FlagSize.Large -> FlagIcons.LargeFlagList
    }

    return flagList.mapNotNull { imageVector ->
        FlagInfo.fromImageVector(imageVector)
    }.sortedBy { it.countryName }
}

/**
 * Filter flags by search query and region
 */
private fun filterFlags(
    flags: List<FlagInfo>,
    query: String,
    region: Region
): List<FlagInfo> {
    return flags.filter { flag ->
        val regionMatch = region == Region.All || flag.region == region

        val searchMatch = if (query.isBlank()) {
            true
        } else {
            val searchLower = query.lowercase().trim()
            flag.countryName.lowercase().contains(searchLower) ||
                flag.alpha2.lowercase().contains(searchLower) ||
                flag.alpha3.lowercase().contains(searchLower) ||
                flag.numeric.contains(searchLower)
        }

        regionMatch && searchMatch
    }
}
