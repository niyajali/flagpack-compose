package com.flagpack.sample.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.flagpack.sample.model.FlagInfo
import com.flagpack.sample.model.FlagSize
import com.flagpack.sample.ui.icons.SearchIcon
import com.flagpack.sample.ui.theme.Strings

/**
 * View mode for displaying flags
 */
enum class ViewMode {
    Grid,
    List
}

@Composable
fun FlagGrid(
    flags: List<FlagInfo>,
    displaySize: FlagSize,
    onFlagClick: (FlagInfo) -> Unit,
    modifier: Modifier = Modifier,
    isCompact: Boolean = false,
    viewMode: ViewMode = if (isCompact) ViewMode.List else ViewMode.Grid,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    gridMinSize: Dp = 140.dp,
    gridSpacing: Dp = 12.dp,
    listSpacing: Dp = 8.dp
) {
    if (flags.isEmpty()) {
        EmptyState(modifier = modifier)
    } else {
        when {
            isCompact || viewMode == ViewMode.List -> {
                FlagListView(
                    flags = flags,
                    displaySize = displaySize,
                    onFlagClick = onFlagClick,
                    modifier = modifier,
                    contentPadding = contentPadding,
                    spacing = listSpacing
                )
            }
            else -> {
                FlagGridView(
                    flags = flags,
                    displaySize = displaySize,
                    onFlagClick = onFlagClick,
                    modifier = modifier,
                    contentPadding = contentPadding,
                    minSize = gridMinSize,
                    spacing = gridSpacing
                )
            }
        }
    }
}

@Composable
private fun FlagGridView(
    flags: List<FlagInfo>,
    displaySize: FlagSize,
    onFlagClick: (FlagInfo) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    minSize: Dp = 140.dp,
    spacing: Dp = 12.dp
) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = minSize),
        modifier = modifier,
        contentPadding = contentPadding,
        horizontalArrangement = Arrangement.spacedBy(spacing),
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        items(
            items = flags,
            key = { "${it.alpha2}_${it.size.name}" }
        ) { flag ->
            FlagCard(
                flagInfo = flag,
                displaySize = displaySize,
                onClick = { onFlagClick(flag) }
            )
        }
    }
}

@Composable
private fun FlagListView(
    flags: List<FlagInfo>,
    displaySize: FlagSize,
    onFlagClick: (FlagInfo) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(16.dp),
    spacing: Dp = 8.dp
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        items(
            items = flags,
            key = { "${it.alpha2}_${it.size.name}" }
        ) { flag ->
            FlagCardCompact(
                flagInfo = flag,
                displaySize = displaySize,
                onClick = { onFlagClick(flag) }
            )
        }
    }
}

@Composable
private fun EmptyState(
    modifier: Modifier = Modifier,
    icon: ImageVector = SearchIcon,
    iconSize: Dp = 48.dp,
    iconColor: Color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.5f),
    title: String = Strings.EMPTY_STATE_TITLE,
    titleStyle: TextStyle = MaterialTheme.typography.titleMedium,
    titleColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    subtitle: String = Strings.EMPTY_STATE_SUBTITLE,
    subtitleStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    subtitleColor: Color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.7f)
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.size(iconSize),
                tint = iconColor
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = title,
                style = titleStyle,
                color = titleColor
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = subtitle,
                style = subtitleStyle,
                color = subtitleColor,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 32.dp)
            )
        }
    }
}
