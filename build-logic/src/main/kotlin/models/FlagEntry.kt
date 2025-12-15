package models

import kotlinx.serialization.Serializable

/**
 * Represents a single flag entry with its country information.
 *
 * @property countryName The full name of the country
 * @property alpha2 ISO 3166-1 alpha-2 code (e.g., "US", "GB-UKM")
 * @property alpha3 ISO 3166-1 alpha-3 code (e.g., "USA", "GBR") - optional for special regions
 * @property numeric ISO 3166-1 numeric code (e.g., "840", "826") - optional for special regions
 */
@Serializable
data class FlagEntry(
    val countryName: String,
    val alpha2: String,
    val alpha3: String? = null,
    val numeric: String? = null
) {
    /**
     * Returns a property-safe name for use in generated Kotlin code.
     * Converts country names to PascalCase without spaces or special characters.
     */
    val propertyName: String
        get() = countryName
            .replace(Regex("[^a-zA-Z0-9\\s]"), "")
            .split(Regex("\\s+"))
            .joinToString("") { word ->
                word.lowercase().replaceFirstChar { it.uppercase() }
            }

    /**
     * Returns a backing field name for the lazy initialization pattern.
     */
    val backingFieldName: String
        get() = "_${propertyName.replaceFirstChar { it.lowercase() }}"
}
