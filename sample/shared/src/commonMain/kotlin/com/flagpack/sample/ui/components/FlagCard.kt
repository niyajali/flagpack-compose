package com.flagpack.sample.ui.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.flagpack.sample.model.FlagInfo
import com.flagpack.sample.model.FlagSize
import com.flagpack.sample.ui.icons.InfoIcon

@Composable
fun FlagCard(
    flagInfo: FlagInfo,
    displaySize: FlagSize,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(20.dp),
    containerColor: Color = MaterialTheme.colorScheme.surfaceContainer,
    borderColor: Color = MaterialTheme.colorScheme.outlineVariant,
    hoverBorderColor: Color = MaterialTheme.colorScheme.primary.copy(alpha = 0.5f),
    contentPadding: Dp = 16.dp,
    elevation: Dp = 0.dp,
    hoverElevation: Dp = 8.dp,
    titleStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    subtitleStyle: TextStyle = MaterialTheme.typography.labelSmall,
    titleColor: Color = MaterialTheme.colorScheme.onSurface,
    subtitleColor: Color = MaterialTheme.colorScheme.onSurfaceVariant
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    val animatedScale by animateFloatAsState(
        targetValue = if (isHovered) 1.03f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "cardScale"
    )

    val animatedElevation by animateDpAsState(
        targetValue = if (isHovered) hoverElevation else elevation,
        animationSpec = tween(durationMillis = 200),
        label = "cardElevation"
    )

    val currentBorderColor by androidx.compose.animation.animateColorAsState(
        targetValue = if (isHovered) hoverBorderColor else borderColor,
        animationSpec = tween(durationMillis = 200),
        label = "borderColor"
    )

    Card(
        modifier = modifier
            .fillMaxWidth()
            .scale(animatedScale)
            .clip(shape)
            .hoverable(interactionSource = interactionSource)
            .clickable(onClick = onClick),
        elevation = CardDefaults.cardElevation(defaultElevation = animatedElevation),
        shape = shape,
        colors = CardDefaults.cardColors(containerColor = containerColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = currentBorderColor, shape = shape)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(contentPadding),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Flag image with shadow effect
                FlagImage(
                    flagInfo = flagInfo,
                    displaySize = displaySize,
                    isHovered = isHovered
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Country name
                Text(
                    text = flagInfo.countryName,
                    style = titleStyle,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = titleColor
                )

                Spacer(modifier = Modifier.height(2.dp))

                // Alpha codes
                Text(
                    text = flagInfo.alphaCodesDisplay,
                    style = subtitleStyle,
                    color = subtitleColor,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun FlagCardCompact(
    flagInfo: FlagInfo,
    displaySize: FlagSize,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp),
    containerColor: Color = MaterialTheme.colorScheme.surfaceContainer,
    borderColor: Color = MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f),
    contentPadding: Dp = 12.dp,
    titleStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    subtitleStyle: TextStyle = MaterialTheme.typography.labelSmall,
    titleColor: Color = MaterialTheme.colorScheme.onSurface,
    subtitleColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    iconColor: Color = MaterialTheme.colorScheme.onSurfaceVariant
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isHovered by interactionSource.collectIsHoveredAsState()

    val animatedScale by animateFloatAsState(
        targetValue = if (isHovered) 1.01f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "compactCardScale"
    )

    Surface(
        modifier = modifier
            .scale(animatedScale)
            .hoverable(interactionSource = interactionSource)
            .clickable(onClick = onClick),
        shape = shape,
        color = containerColor
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 1.dp, color = borderColor, shape = shape)
                .padding(contentPadding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            // Flag image
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(6.dp))
                    .size(
                        width = displaySize.displayWidth.dp,
                        height = displaySize.displayHeight.dp
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = flagInfo.imageVector,
                    contentDescription = flagInfo.contentDescription,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            // Country info
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = flagInfo.countryName,
                    style = titleStyle,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    color = titleColor
                )
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "${flagInfo.fullCodesDisplay} • ${flagInfo.region.label}",
                    style = subtitleStyle,
                    color = subtitleColor
                )
            }

            Icon(
                imageVector = InfoIcon,
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                tint = iconColor
            )
        }
    }
}

@Composable
private fun FlagImage(
    flagInfo: FlagInfo,
    displaySize: FlagSize,
    isHovered: Boolean,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(6.dp),
    backgroundColor: Color = MaterialTheme.colorScheme.surfaceVariant,
    shadowElevation: Dp = 4.dp,
    hoverShadowElevation: Dp = 8.dp
) {
    val animatedFlagScale by animateFloatAsState(
        targetValue = if (isHovered) 1.1f else 1f,
        animationSpec = tween(durationMillis = 200),
        label = "flagScale"
    )

    val animatedShadow by animateDpAsState(
        targetValue = if (isHovered) hoverShadowElevation else shadowElevation,
        animationSpec = tween(durationMillis = 200),
        label = "flagShadow"
    )

    Box(
        modifier = modifier
            .shadow(
                elevation = animatedShadow,
                shape = shape,
                clip = false
            )
            .clip(shape)
            .background(backgroundColor)
            .size(
                width = displaySize.displayWidth.dp,
                height = displaySize.displayHeight.dp
            ),
        contentAlignment = Alignment.Center
    ) {
        Image(
            imageVector = flagInfo.imageVector,
            contentDescription = flagInfo.contentDescription,
            modifier = Modifier
                .fillMaxSize()
                .scale(animatedFlagScale)
        )
    }
}
