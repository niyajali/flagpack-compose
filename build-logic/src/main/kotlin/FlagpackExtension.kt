import org.gradle.api.provider.ListProperty
import org.gradle.api.provider.MapProperty
import org.gradle.api.provider.Property

/**
 * Configuration extension for the Flagpack Icons plugin.
 *
 * Example usage:
 * ```kotlin
 * flagpackIcons {
 *     gitRepository.set("https://github.com/Yummygum/flagpack-core.git")
 *     gitRef.set("main")
 *     svgSourcePath.set("svg")
 *     targetPath.set("library/src/commonMain/kotlin/flagpack/icons")
 *     packageName.set("flagpack.icons")
 *     supportedSizes.set(listOf("s", "m", "l"))
 * }
 * ```
 */
abstract class FlagpackExtension {

    /**
     * Git repository URL for flagpack-core.
     * Default: https://github.com/Yummygum/flagpack-core.git
     */
    abstract val gitRepository: Property<String>

    /**
     * Git reference (branch, tag, or commit) to sync from.
     * Default: main
     */
    abstract val gitRef: Property<String>

    /**
     * Path within the repository where SVG flags are located.
     * Default: svg
     */
    abstract val svgSourcePath: Property<String>

    /**
     * Local path for the generated Kotlin files.
     * Default: library/src/commonMain/kotlin/flagpack/icons
     */
    abstract val targetPath: Property<String>

    /**
     * Package name for the generated Kotlin files.
     * Default: flagpack.icons
     */
    abstract val packageName: Property<String>

    /**
     * List of supported flag sizes.
     * Default: ["s", "m", "l"]
     */
    abstract val supportedSizes: ListProperty<String>

    /**
     * Mapping of size codes to human-readable names.
     * Default: { "s" to "Small", "m" to "Medium", "l" to "Large" }
     */
    abstract val sizeNames: MapProperty<String, String>

    /**
     * Mapping of size codes to dimensions (width x height in dp).
     * Default: { "s" to Pair(16, 12), "m" to Pair(20, 15), "l" to Pair(32, 24) }
     */
    abstract val sizeDimensions: MapProperty<String, Pair<Int, Int>>

    /**
     * File path for sync log output.
     * Default: flagpack-sync.log
     */
    abstract val syncLogFile: Property<String>

    /**
     * Whether to use a local directory instead of cloning from Git.
     * Useful for development and testing.
     * Default: false
     */
    abstract val useLocalDirectory: Property<Boolean>

    /**
     * Path to local flagpack-core directory (when useLocalDirectory is true).
     */
    abstract val localDirectoryPath: Property<String>

    /**
     * Whether to generate preview composables for each flag.
     * Default: true
     */
    abstract val generatePreviews: Property<Boolean>

    init {
        gitRepository.convention("https://github.com/Yummygum/flagpack-core.git")
        gitRef.convention("main")
        svgSourcePath.convention("svg")
        targetPath.convention("library/src/commonMain/kotlin/flagpack/icons")
        packageName.convention("flagpack.icons")
        supportedSizes.convention(listOf("s", "m", "l"))
        sizeNames.convention(
            mapOf(
                "s" to "Small",
                "m" to "Medium",
                "l" to "Large"
            )
        )
        sizeDimensions.convention(
            mapOf(
                "s" to Pair(16, 12),
                "m" to Pair(20, 15),
                "l" to Pair(32, 24)
            )
        )
        syncLogFile.convention("flagpack-sync.log")
        useLocalDirectory.convention(false)
        localDirectoryPath.convention("")
        generatePreviews.convention(true)
    }
}
