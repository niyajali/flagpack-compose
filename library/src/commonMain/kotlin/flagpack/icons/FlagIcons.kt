package flagpack.icons

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Root object for accessing flag icons from Flagpack.
 *
 * Flags are organized by size for different use cases:
 * - [FlagIcons.Small] - Small flags (16x12dp) - Best for inline text or compact lists
 * - [FlagIcons.Medium] - Medium flags (20x15dp) - Good balance for most UIs
 * - [FlagIcons.Large] - Large flags (32x24dp) - Best for prominent display
 *
 * ## Usage Examples
 *
 * ### Single Flag
 * ```kotlin
 * Image(
 *     imageVector = FlagIcons.Large.UnitedStates,
 *     contentDescription = "United States Flag"
 * )
 * ```
 *
 * ### Different Sizes
 * ```kotlin
 * // Small - for compact lists
 * FlagIcons.Small.India
 *
 * // Medium - default size
 * FlagIcons.Medium.India
 *
 * // Large - for prominent display
 * FlagIcons.Large.India
 * ```
 *
 * ### All Flags (for pickers)
 * ```kotlin
 * LazyColumn {
 *     items(FlagIcons.LargeFlagList) { flag ->
 *         Image(imageVector = flag, contentDescription = null)
 *     }
 * }
 * ```
 *
 * ## Country Codes
 *
 * Flags use ISO 3166-1 codes. Access by country name:
 * - `FlagIcons.Large.UnitedStates` (US)
 * - `FlagIcons.Large.UnitedKingdom` (GB-UKM)
 * - `FlagIcons.Large.France` (FR)
 *
 * Special regions are also supported:
 * - `FlagIcons.Large.England` (GB-ENG)
 * - `FlagIcons.Large.Scotland` (GB-SCT)
 * - `FlagIcons.Large.Wales` (GB-WLS)
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public object FlagIcons {

    /**
     * Small flag icons (16x12dp).
     *
     * Best suited for:
     * - Inline text indicators
     * - Compact dropdown lists
     * - Small badges or chips
     *
     * Example:
     * ```kotlin
     * Row {
     *     Image(
     *         imageVector = FlagIcons.Small.UnitedStates,
     *         contentDescription = "US",
     *         modifier = Modifier.size(16.dp, 12.dp)
     *     )
     *     Text("United States")
     * }
     * ```
     */
    public object Small

    /**
     * Medium flag icons (20x15dp).
     *
     * Best suited for:
     * - Standard list items
     * - Form selectors
     * - Navigation elements
     *
     * This is the recommended default size for most use cases.
     *
     * Example:
     * ```kotlin
     * ListItem(
     *     leadingContent = {
     *         Image(
     *             imageVector = FlagIcons.Medium.Germany,
     *             contentDescription = "Germany"
     *         )
     *     },
     *     headlineContent = { Text("Germany") }
     * )
     * ```
     */
    public object Medium

    /**
     * Large flag icons (32x24dp).
     *
     * Best suited for:
     * - Prominent display areas
     * - Flag pickers/selectors
     * - Hero sections
     * - Detail views
     *
     * Example:
     * ```kotlin
     * Card {
     *     Image(
     *         imageVector = FlagIcons.Large.Japan,
     *         contentDescription = "Japan Flag",
     *         modifier = Modifier.fillMaxWidth()
     *     )
     *     Text("Japan", style = MaterialTheme.typography.headlineMedium)
     * }
     * ```
     */
    public object Large
}

public val FlagIcons.allIcons: List<ImageVector>
    get() = LargeFlagList + MediumFlagList + SmallFlagList
