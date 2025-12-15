package models

/**
 * Result of a flag sync operation.
 *
 * @property success Whether the sync completed successfully
 * @property totalBefore Total number of flags before sync
 * @property totalAfter Total number of flags after sync
 * @property newFlags List of newly added flag entries
 * @property updatedFlags List of updated flag entries
 * @property errors List of errors encountered during sync
 * @property sizeBreakdown Breakdown of synced flags by size
 */
data class SyncResult(
    val success: Boolean,
    val totalBefore: Int,
    val totalAfter: Int,
    val newFlags: List<SyncedFlagInfo> = emptyList(),
    val updatedFlags: List<SyncedFlagInfo> = emptyList(),
    val errors: List<String> = emptyList(),
    val sizeBreakdown: Map<FlagSize, Int> = emptyMap()
) {
    /**
     * Total number of new flags synced.
     */
    val newFlagCount: Int
        get() = newFlags.size

    /**
     * Total number of updated flags.
     */
    val updatedFlagCount: Int
        get() = updatedFlags.size

    /**
     * Whether any flags were synced (new or updated).
     */
    val hasChanges: Boolean
        get() = newFlags.isNotEmpty() || updatedFlags.isNotEmpty()

    /**
     * Generates a summary string for logging or GitHub Actions output.
     */
    fun toSummary(): String = buildString {
        appendLine("Sync Result: ${if (success) "SUCCESS" else "FAILED"}")
        appendLine("Total flags before: $totalBefore")
        appendLine("Total flags after: $totalAfter")
        appendLine("New flags: $newFlagCount")
        appendLine("Updated flags: $updatedFlagCount")

        if (sizeBreakdown.isNotEmpty()) {
            appendLine("\nBreakdown by size:")
            sizeBreakdown.forEach { (size, count) ->
                appendLine("  - ${size.displayName}: $count")
            }
        }

        if (errors.isNotEmpty()) {
            appendLine("\nErrors:")
            errors.forEach { error ->
                appendLine("  - $error")
            }
        }

        if (newFlags.isNotEmpty()) {
            appendLine("\nNew flags:")
            newFlags.take(20).forEach { flag ->
                appendLine("  - ${flag.countryName} (${flag.alpha2})")
            }
            if (newFlags.size > 20) {
                appendLine("  ... and ${newFlags.size - 20} more")
            }
        }
    }

    /**
     * Generates GitHub Actions output format.
     */
    fun toGitHubActionsOutput(): String = buildString {
        appendLine("sync_success=$success")
        appendLine("new_flags_count=$newFlagCount")
        appendLine("updated_flags_count=$updatedFlagCount")
        appendLine("total_flags_before=$totalBefore")
        appendLine("total_flags_after=$totalAfter")
        appendLine("has_changes=$hasChanges")

        val sizeBreakdownStr = sizeBreakdown.entries
            .joinToString(", ") { "${it.key.displayName}: ${it.value}" }
        appendLine("size_breakdown=$sizeBreakdownStr")

        appendLine("sync_details<<EOF")
        if (newFlags.isNotEmpty()) {
            appendLine("**New flags (${newFlags.size}):**")
            sizeBreakdown.forEach { (size, count) ->
                val flagsForSize = newFlags.filter { it.size == size }
                if (flagsForSize.isNotEmpty()) {
                    val names = flagsForSize.take(10).joinToString(", ") { it.countryName }
                    val suffix = if (flagsForSize.size > 10) ", ..." else ""
                    appendLine("- **${size.displayName}**: $count ($names$suffix)")
                }
            }
        }
        appendLine("EOF")
    }
}

/**
 * Information about a single synced flag.
 */
data class SyncedFlagInfo(
    val countryName: String,
    val alpha2: String,
    val alpha3: String?,
    val size: FlagSize,
    val filePath: String
)
