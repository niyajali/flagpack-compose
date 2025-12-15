package models

/**
 * Represents flag size variants available in flagpack-core.
 *
 * @property code The directory code used in flagpack-core (s, m, l)
 * @property displayName Human-readable name for the size
 * @property width Default width in dp
 * @property height Default height in dp
 * @property objectName Name of the Kotlin object (Small, Medium, Large)
 */
@OptIn(ExperimentalStdlibApi::class)
enum class FlagSize(
    val code: String,
    val displayName: String,
    val width: Int,
    val height: Int,
    val objectName: String
) {
    SMALL("s", "Small", 16, 12, "Small"),
    MEDIUM("m", "Medium", 20, 15, "Medium"),
    LARGE("l", "Large", 32, 24, "Large");

    /**
     * Returns the package suffix for this size (e.g., "small", "medium", "large")
     */
    val packageSuffix: String
        get() = objectName.lowercase()

    /**
     * Returns the aspect ratio (width/height)
     */
    val aspectRatio: Float
        get() = width.toFloat() / height.toFloat()

    companion object {
        /**
         * Find a FlagSize by its code.
         */
        fun fromCode(code: String): FlagSize? = entries.find { it.code == code }

        /**
         * Find a FlagSize by its object name.
         */
        fun fromObjectName(name: String): FlagSize? = entries.find {
            it.objectName.equals(name, ignoreCase = true)
        }
    }
}
