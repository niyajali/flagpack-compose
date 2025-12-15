package com.flagpack.sample.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.flagpack.sample.model.FlagSize
import com.flagpack.sample.model.Region
import com.flagpack.sample.ui.icons.GlobeIcon
import com.flagpack.sample.ui.icons.MapPinIcon
import com.flagpack.sample.ui.theme.GradientColors
import com.flagpack.sample.ui.theme.Strings

@Composable
fun FilterBar(
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    modifier: Modifier = Modifier,
    labelStyle: TextStyle = MaterialTheme.typography.labelSmall,
    labelColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    spacing: Dp = 16.dp
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(spacing)
    ) {
        // Size filter section
        FilterSection(
            title = Strings.FILTER_SIZE_LABEL,
            labelStyle = labelStyle,
            labelColor = labelColor
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                FlagSize.entries.forEach { size ->
                    GradientFilterChip(
                        selected = selectedSize == size,
                        onClick = { onSizeSelected(size) },
                        label = size.label
                    )
                }
            }
        }

        // Region filter section
        FilterSection(
            title = Strings.FILTER_REGION_LABEL,
            labelStyle = labelStyle,
            labelColor = labelColor
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Region.entries.forEach { region ->
                    RegionFilterItem(
                        region = region,
                        selected = selectedRegion == region,
                        onClick = { onRegionSelected(region) }
                    )
                }
            }
        }
    }
}

@Composable
fun CompactFilterBar(
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    selectedRegion: Region,
    onRegionSelected: (Region) -> Unit,
    modifier: Modifier = Modifier,
    horizontalPadding: Dp = 16.dp,
    verticalPadding: Dp = 8.dp,
    chipSpacing: Dp = 8.dp
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = horizontalPadding, vertical = verticalPadding),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Size chips row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(chipSpacing)
        ) {
            FlagSize.entries.forEach { size ->
                GradientFilterChip(
                    selected = selectedSize == size,
                    onClick = { onSizeSelected(size) },
                    label = size.label
                )
            }
        }

        // Region chips row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(chipSpacing)
        ) {
            Region.entries.forEach { region ->
                RegionChip(
                    region = region,
                    selected = selectedRegion == region,
                    onClick = { onRegionSelected(region) }
                )
            }
        }
    }
}

@Composable
private fun FilterSection(
    title: String,
    labelStyle: TextStyle = MaterialTheme.typography.labelSmall,
    labelColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    content: @Composable () -> Unit
) {
    Column {
        Text(
            text = title,
            style = labelStyle,
            fontWeight = FontWeight.SemiBold,
            color = labelColor,
            modifier = Modifier.padding(bottom = 8.dp),
            letterSpacing = labelStyle.letterSpacing
        )
        content()
    }
}

@Composable
fun GradientFilterChip(
    selected: Boolean,
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(12.dp),
    selectedGradient: List<Color> = GradientColors.Primary,
    unselectedColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    selectedTextColor: Color = Color.White,
    unselectedTextColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    textStyle: TextStyle = MaterialTheme.typography.labelMedium
) {
    val textColor by animateColorAsState(
        targetValue = if (selected) selectedTextColor else unselectedTextColor,
        animationSpec = tween(durationMillis = 200),
        label = "chipTextColor"
    )

    Box(
        modifier = modifier
            .clip(shape)
            .then(
                if (selected) {
                    Modifier.background(Brush.horizontalGradient(selectedGradient))
                } else {
                    Modifier.background(unselectedColor)
                }
            )
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label,
            style = textStyle,
            fontWeight = if (selected) FontWeight.SemiBold else FontWeight.Medium,
            color = textColor
        )
    }
}

@Composable
fun RegionChip(
    region: Region,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(20.dp),
    selectedColor: Color = MaterialTheme.colorScheme.primaryContainer,
    selectedTextColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    unselectedColor: Color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
    unselectedTextColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    textStyle: TextStyle = MaterialTheme.typography.labelMedium,
    iconSize: Dp = 14.dp
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (selected) selectedColor else unselectedColor,
        animationSpec = tween(durationMillis = 200),
        label = "regionChipBg"
    )

    val contentColor by animateColorAsState(
        targetValue = if (selected) selectedTextColor else unselectedTextColor,
        animationSpec = tween(durationMillis = 200),
        label = "regionChipContent"
    )

    Row(
        modifier = modifier
            .clip(shape)
            .background(backgroundColor)
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = if (region == Region.All) GlobeIcon else MapPinIcon,
            contentDescription = null,
            modifier = Modifier.size(iconSize),
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = region.label,
            style = textStyle,
            fontWeight = if (selected) FontWeight.Medium else FontWeight.Normal,
            color = contentColor
        )
    }
}

@Composable
fun RegionFilterItem(
    region: Region,
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(12.dp),
    selectedColor: Color = MaterialTheme.colorScheme.primaryContainer,
    selectedTextColor: Color = MaterialTheme.colorScheme.onPrimaryContainer,
    unselectedTextColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    iconSize: Dp = 16.dp,
    verticalPadding: Dp = 10.dp,
    horizontalPadding: Dp = 12.dp
) {
    val backgroundColor by animateColorAsState(
        targetValue = if (selected) selectedColor else Color.Transparent,
        animationSpec = tween(durationMillis = 200),
        label = "regionItemBg"
    )

    val contentColor by animateColorAsState(
        targetValue = if (selected) selectedTextColor else unselectedTextColor,
        animationSpec = tween(durationMillis = 200),
        label = "regionItemContent"
    )

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape)
            .background(backgroundColor)
            .clickable(onClick = onClick)
            .padding(horizontal = horizontalPadding, vertical = verticalPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = if (region == Region.All) GlobeIcon else MapPinIcon,
            contentDescription = null,
            modifier = Modifier.size(iconSize),
            tint = contentColor
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = region.label,
            style = textStyle,
            fontWeight = if (selected) FontWeight.Medium else FontWeight.Normal,
            color = contentColor
        )
    }
}
