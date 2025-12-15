package com.flagpack.sample

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import flagpack.icons.FlagIcons
import flagpack.icons.LargeFlagList
import flagpack.icons.MediumFlagList
import flagpack.icons.SmallFlagList
import flagpack.icons.allIcons
import flagpack.icons.large.*
import flagpack.icons.medium.*
import flagpack.icons.small.*

enum class FlagSize(val label: String) {
    Small("Small"),
    Medium("Medium"),
    Large("Large")
}

data class FlagItem(
    val name: String,
    val small: ImageVector,
    val medium: ImageVector,
    val large: ImageVector
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    MaterialTheme {
        var selectedSize by remember { mutableStateOf(FlagSize.Large) }

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Flagpack Compose") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                )
            }
        ) { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
            ) {
                SizeSelector(
                    selectedSize = selectedSize,
                    onSizeSelected = { selectedSize = it }
                )

                FlagGrid(
                    selectedSize = selectedSize,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}

@Composable
private fun SizeSelector(
    selectedSize: FlagSize,
    onSizeSelected: (FlagSize) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        FlagSize.entries.forEach { size ->
            FilterChip(
                selected = selectedSize == size,
                onClick = { onSizeSelected(size) },
                label = { Text(size.label) }
            )
        }
    }
}

@Composable
private fun FlagGrid(
    selectedSize: FlagSize,
    modifier: Modifier = Modifier
) {
    val flags = remember { getFlags() }

    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 120.dp),
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(flags) { flag ->
            FlagCard(
                flag = flag,
                selectedSize = selectedSize
            )
        }
    }
}

@Composable
private fun FlagCard(
    flag: FlagItem,
    selectedSize: FlagSize,
    modifier: Modifier = Modifier
) {
    val imageVector = when (selectedSize) {
        FlagSize.Small -> flag.small
        FlagSize.Medium -> flag.medium
        FlagSize.Large -> flag.large
    }

    val flagSize = when (selectedSize) {
        FlagSize.Small -> 32.dp to 24.dp
        FlagSize.Medium -> 40.dp to 30.dp
        FlagSize.Large -> 64.dp to 48.dp
    }

    Card(
        modifier = modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.5.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(width = flagSize.first, height = flagSize.second)
                    .clip(RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = imageVector,
                    contentDescription = "${flag.name} flag",
                    modifier = Modifier.fillMaxSize(),
                    colorFilter = null
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = flag.name,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}

private fun getFlags(): List<FlagItem> {
    val flags = FlagIcons.LargeFlagList

    return flags.map {
        FlagItem(
            name = it.name.toSpacedWords(),
            small = FlagIcons.SmallFlagList.first { smallFlag -> smallFlag.name == it.name },
            medium = FlagIcons.MediumFlagList.first { mediumFlag -> mediumFlag.name == it.name },
            large = it
        )
    }
}

private fun String.toSpacedWords(): String {
    return this.foldIndexed(StringBuilder()) { index, acc, char ->
        if (index > 0 && char.isUpperCase()) {
            acc.append(' ')
        }
        acc.append(char)
    }.toString()
}
