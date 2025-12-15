package com.flagpack.sample.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.flagpack.sample.model.FlagInfo
import com.flagpack.sample.ui.icons.CheckIcon
import com.flagpack.sample.ui.icons.CloseIcon
import com.flagpack.sample.ui.icons.CodeIcon
import com.flagpack.sample.ui.icons.CopyIcon
import com.flagpack.sample.ui.theme.GradientColors
import com.flagpack.sample.ui.theme.Strings
import com.flagpack.sample.util.ClipboardManager
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun FlagDetailDialog(
    flagInfo: FlagInfo,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(28.dp),
    containerColor: Color = MaterialTheme.colorScheme.surface,
    headerGradient: List<Color> = GradientColors.Primary,
    elevation: Dp = 16.dp
) {
    var showCopied by remember { mutableStateOf(false) }
    val scope = rememberCoroutineScope()
    val codeSnippet = remember(flagInfo) { flagInfo.generateCodeSnippet() }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(
            usePlatformDefaultWidth = false,
            dismissOnBackPress = true,
            dismissOnClickOutside = true
        )
    ) {
        Card(
            modifier = modifier
                .fillMaxWidth(0.95f)
                .padding(16.dp),
            shape = shape,
            elevation = CardDefaults.cardElevation(defaultElevation = elevation),
            colors = CardDefaults.cardColors(containerColor = containerColor)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
            ) {
                // Gradient Header
                DialogHeader(
                    flagInfo = flagInfo,
                    onDismiss = onDismiss,
                    gradient = headerGradient
                )

                // Content
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp)
                ) {
                    // Info cards
                    InfoCardsRow(flagInfo = flagInfo)

                    Spacer(modifier = Modifier.height(24.dp))

                    // Code snippet section
                    CodeSection(
                        codeSnippet = codeSnippet,
                        showCopied = showCopied,
                        onCopyClick = {
                            val success = ClipboardManager.copyToClipboard(codeSnippet)
                            if (success) {
                                showCopied = true
                                scope.launch {
                                    delay(2000)
                                    showCopied = false
                                }
                            }
                        }
                    )

                    // Flag colors section
                    if (flagInfo.colors.isNotEmpty()) {
                        Spacer(modifier = Modifier.height(24.dp))
                        FlagColorsSection(colors = flagInfo.colors)
                    }
                }
            }
        }
    }
}

@Composable
private fun DialogHeader(
    flagInfo: FlagInfo,
    onDismiss: () -> Unit,
    gradient: List<Color>,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Brush.horizontalGradient(gradient))
            .padding(24.dp)
    ) {
        // Close button
        IconButton(
            onClick = onDismiss,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(36.dp),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color.White.copy(alpha = 0.2f),
                contentColor = Color.White
            )
        ) {
            Icon(
                imageVector = CloseIcon,
                contentDescription = Strings.CLOSE_CONTENT_DESC,
                modifier = Modifier.size(20.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Large flag preview
            Box(
                modifier = Modifier
                    .shadow(
                        elevation = 12.dp,
                        shape = RoundedCornerShape(12.dp),
                        clip = false
                    )
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color.White.copy(alpha = 0.1f))
                    .size(width = 96.dp, height = 72.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = flagInfo.imageVector,
                    contentDescription = flagInfo.contentDescription,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = flagInfo.countryName,
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = flagInfo.region.label,
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.White.copy(alpha = 0.8f)
                )
            }
        }
    }
}

@Composable
private fun InfoCardsRow(
    flagInfo: FlagInfo,
    modifier: Modifier = Modifier,
    cardShape: Shape = RoundedCornerShape(16.dp),
    cardColor: Color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f)
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        InfoCard(
            label = Strings.LABEL_ISO_ALPHA2,
            value = flagInfo.alpha2,
            modifier = Modifier.weight(1f),
            shape = cardShape,
            containerColor = cardColor
        )
        InfoCard(
            label = Strings.LABEL_ISO_ALPHA3,
            value = flagInfo.alpha3.ifEmpty { "-" },
            modifier = Modifier.weight(1f),
            shape = cardShape,
            containerColor = cardColor
        )
        InfoCard(
            label = Strings.LABEL_REGION,
            value = flagInfo.region.label,
            modifier = Modifier.weight(1f),
            shape = cardShape,
            containerColor = cardColor
        )
    }
}

@Composable
private fun InfoCard(
    label: String,
    value: String,
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(16.dp),
    containerColor: Color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
    labelStyle: TextStyle = MaterialTheme.typography.labelSmall,
    labelColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    valueStyle: TextStyle = MaterialTheme.typography.titleMedium,
    valueColor: Color = MaterialTheme.colorScheme.onSurface
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = containerColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                style = labelStyle,
                color = labelColor
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = value,
                style = valueStyle,
                fontWeight = FontWeight.SemiBold,
                color = valueColor
            )
        }
    }
}

@Composable
private fun CodeSection(
    codeSnippet: String,
    showCopied: Boolean,
    onCopyClick: () -> Unit,
    modifier: Modifier = Modifier,
    codeBlockShape: Shape = RoundedCornerShape(16.dp),
    codeBlockColor: Color = MaterialTheme.colorScheme.surfaceVariant
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = CodeIcon,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = Strings.COMPOSE_CODE_TITLE,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            CopyButton(
                showCopied = showCopied,
                onClick = onCopyClick
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        // Code block
        Surface(
            modifier = Modifier.fillMaxWidth(),
            shape = codeBlockShape,
            color = codeBlockColor
        ) {
            Box(
                modifier = Modifier
                    .horizontalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                Text(
                    text = codeSnippet,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 13.sp,
                    lineHeight = 20.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
        }
    }
}

@Composable
private fun CopyButton(
    showCopied: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    copiedColor: Color = MaterialTheme.colorScheme.tertiary,
    defaultGradient: List<Color> = GradientColors.Primary
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (showCopied) copiedColor else Color.Transparent
        ),
        contentPadding = ButtonDefaults.ContentPadding
    ) {
        Box(
            modifier = Modifier
                .then(
                    if (!showCopied) {
                        Modifier.background(
                            brush = Brush.horizontalGradient(defaultGradient),
                            shape = ButtonDefaults.shape
                        )
                    } else {
                        Modifier
                    }
                )
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            if (showCopied) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = CheckIcon,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = Strings.COPIED,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            if(!showCopied) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = CopyIcon,
                        contentDescription = null,
                        modifier = Modifier.size(16.dp),
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = Strings.COPY_CODE,
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }
    }
}

@Composable
private fun FlagColorsSection(
    colors: List<Color>,
    modifier: Modifier = Modifier,
    labelStyle: TextStyle = MaterialTheme.typography.labelSmall,
    labelColor: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    colorBarHeight: Dp = 32.dp,
    colorBarShape: Shape = RoundedCornerShape(12.dp)
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(
            text = Strings.FLAG_COLORS_LABEL,
            style = labelStyle,
            color = labelColor,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(colorBarHeight)
                .clip(colorBarShape),
            horizontalArrangement = Arrangement.spacedBy(0.dp)
        ) {
            colors.forEachIndexed { index, color ->
                val shape = when {
                    colors.size == 1 -> colorBarShape
                    index == 0 -> RoundedCornerShape(
                        topStart = 12.dp,
                        bottomStart = 12.dp
                    )

                    index == colors.lastIndex -> RoundedCornerShape(
                        topEnd = 12.dp,
                        bottomEnd = 12.dp
                    )

                    else -> RoundedCornerShape(0.dp)
                }
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .clip(shape)
                        .background(color)
                )
            }
        }
    }
}
