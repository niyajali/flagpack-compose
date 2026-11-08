package flagpack.icons

/**
 * Root object for accessing flag icons.
 *
 * Flags are organized by size:
 * - [FlagIcons.Small] - Small flags (16x12dp)
 * - [FlagIcons.Medium] - Medium flags (20x15dp)
 * - [FlagIcons.Large] - Large flags (32x24dp)
 *
 * Example usage:
 * ```kotlin
 * Image(
 *     imageVector = FlagIcons.Large.UnitedStates,
 *     contentDescription = "US Flag"
 * )
 * ```
 *
 * @see [Flagpack](https://flagpack.xyz)
 */
public object FlagIcons {
    /**
     * Small flag icons (16x12dp).
     */
    public object Small

    /**
     * Medium flag icons (20x15dp).
     */
    public object Medium

    /**
     * Large flag icons (32x24dp).
     */
    public object Large
}