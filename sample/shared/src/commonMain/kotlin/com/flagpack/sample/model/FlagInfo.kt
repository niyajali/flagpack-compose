package com.flagpack.sample.model

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.flagpack.sample.ui.theme.Strings

/**
 * Represents a flag with all its metadata parsed from the ImageVector name.
 * Name format: "CountryName:Alpha2:Alpha3:Numeric:Size"
 */
data class FlagInfo(
    val countryName: String,
    val alpha2: String,
    val alpha3: String,
    val numeric: String,
    val size: FlagSize,
    val imageVector: ImageVector,
    val region: Region,
    val colors: List<Color> = emptyList()
) {
    /**
     * Property name used in code (PascalCase)
     */
    val propertyName: String = countryName.replace(" ", "")

    /**
     * Content description for accessibility
     */
    val contentDescription: String = "$countryName flag"

    /**
     * Display text for alpha codes
     */
    val alphaCodesDisplay: String = buildString {
        append(alpha2)
        if (alpha3.isNotEmpty()) {
            append(" / $alpha3")
        }
    }

    /**
     * Full codes display including numeric
     */
    val fullCodesDisplay: String = buildString {
        append(alpha2)
        if (alpha3.isNotEmpty()) {
            append(" / $alpha3")
        }
        if (numeric.isNotEmpty()) {
            append(" / $numeric")
        }
    }

    /**
     * Size display string
     */
    val sizeDisplay: String = "${size.label} (${size.widthDp}x${size.heightDp})"

    /**
     * Generates the Compose code snippet for this flag
     */
    fun generateCodeSnippet(): String {
        return buildString {
            appendLine(Strings.CODE_COMMENT_IMPORT)
            appendLine("import flagpack.icons.FlagIcons")
            appendLine("import flagpack.icons.${size.name.lowercase()}.${propertyName}")
            appendLine()
            appendLine(Strings.CODE_COMMENT_USAGE)
            appendLine("Image(")
            appendLine("    imageVector = FlagIcons.${size.name}.${propertyName},")
            appendLine("    contentDescription = \"$countryName Flag\"")
            appendLine(")")
        }
    }

    companion object {
        /**
         * Parse flag info from ImageVector name
         * Expected format: "CountryName:Alpha2:Alpha3:Numeric:Size"
         */
        fun fromImageVector(imageVector: ImageVector): FlagInfo? {
            val parts = imageVector.name.split(":")
            if (parts.size < 5) return null

            val countryName = parts[0]
            val alpha2 = parts[1]
            val alpha3 = parts[2]
            val numeric = parts[3]
            val sizeName = parts[4]

            val size = FlagSize.entries.find { it.name.equals(sizeName, ignoreCase = true) }
                ?: return null

            val region = Region.fromAlpha2(alpha2)
            val colors = FlagColors.getColorsForCountry(alpha2)

            return FlagInfo(
                countryName = countryName,
                alpha2 = alpha2,
                alpha3 = alpha3,
                numeric = numeric,
                size = size,
                imageVector = imageVector,
                region = region,
                colors = colors
            )
        }
    }
}

/**
 * Flag size variants
 */
enum class FlagSize(val label: String, val widthDp: Int, val heightDp: Int) {
    Small("Small", 16, 12),
    Medium("Medium", 20, 15),
    Large("Large", 32, 24);

    val displayWidth: Int get() = widthDp * 2
    val displayHeight: Int get() = heightDp * 2
}

/**
 * Geographic regions for filtering
 */
enum class Region(val label: String, val countries: Set<String>) {
    All("All", emptySet()),

    Africa("Africa", setOf(
        "DZ", "AO", "BJ", "BW", "BF", "BI", "CV", "CM", "CF", "TD", "KM", "CG", "CD", "CI", "DJ",
        "EG", "GQ", "ER", "SZ", "ET", "GA", "GM", "GH", "GN", "GW", "KE", "LS", "LR", "LY", "MG",
        "MW", "ML", "MR", "MU", "YT", "MA", "MZ", "NA", "NE", "NG", "RE", "RW", "SH", "ST", "SN",
        "SC", "SL", "SO", "ZA", "SS", "SD", "TZ", "TG", "TN", "UG", "EH", "ZM", "ZW"
    )),

    Americas("Americas", setOf(
        "AI", "AG", "AR", "AW", "BS", "BB", "BZ", "BM", "BO", "BQ", "BR", "CA", "KY", "CL", "CO",
        "CR", "CU", "CW", "DM", "DO", "EC", "SV", "FK", "GF", "GL", "GD", "GP", "GT", "GY", "HT",
        "HN", "JM", "MQ", "MX", "MS", "NI", "PA", "PY", "PE", "PR", "BL", "KN", "LC", "MF", "PM",
        "VC", "SX", "SR", "TT", "TC", "US", "UY", "VE", "VG", "VI"
    )),

    Asia("Asia", setOf(
        "AF", "AM", "AZ", "BH", "BD", "BT", "BN", "KH", "CN", "CY", "GE", "HK", "IN", "ID", "IR",
        "IQ", "IL", "JP", "JO", "KZ", "KW", "KG", "LA", "LB", "MO", "MY", "MV", "MN", "MM", "NP",
        "KP", "OM", "PK", "PS", "PH", "QA", "SA", "SG", "KR", "LK", "SY", "TW", "TJ", "TH", "TL",
        "TR", "TM", "AE", "UZ", "VN", "YE"
    )),

    Europe("Europe", setOf(
        "AL", "AD", "AT", "BY", "BE", "BA", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE",
        "GI", "GR", "GG", "HU", "IS", "IE", "IM", "IT", "JE", "XK", "LV", "LI", "LT", "LU", "MT",
        "MD", "MC", "ME", "NL", "MK", "NO", "PL", "PT", "RO", "RU", "SM", "RS", "SK", "SI", "ES",
        "SJ", "SE", "CH", "UA", "GB", "VA"
    )),

    Oceania("Oceania", setOf(
        "AS", "AU", "CX", "CC", "CK", "FJ", "PF", "GU", "HM", "KI", "MH", "FM", "NR", "NC", "NZ",
        "NU", "NF", "MP", "PW", "PG", "PN", "WS", "SB", "TK", "TO", "TV", "UM", "VU", "WF"
    )),

    UKConstituent("UK Constituent", setOf(
        "GB-ENG", "GB-NIR", "GB-SCT", "GB-WLS", "GB-UKM"
    ));

    companion object {
        fun fromAlpha2(alpha2: String): Region {
            return entries.find { it != All && alpha2 in it.countries } ?: All
        }
    }
}

/**
 * Flag colors for common countries
 */
object FlagColors {
    private val countryColors: Map<String, List<Color>> = mapOf(
        "US" to listOf(Color(0xFFB22234), Color(0xFFFFFFFF), Color(0xFF3C3B6E)),
        "GB" to listOf(Color(0xFF012169), Color(0xFFFFFFFF), Color(0xFFC8102E)),
        "DE" to listOf(Color(0xFF000000), Color(0xFFDD0000), Color(0xFFFFCE00)),
        "FR" to listOf(Color(0xFF002395), Color(0xFFFFFFFF), Color(0xFFED2939)),
        "JP" to listOf(Color(0xFFFFFFFF), Color(0xFFBC002D)),
        "IN" to listOf(Color(0xFFFF9933), Color(0xFFFFFFFF), Color(0xFF138808)),
        "BR" to listOf(Color(0xFF009739), Color(0xFFFEDD00), Color(0xFF002776)),
        "AU" to listOf(Color(0xFF00008B), Color(0xFFFFFFFF), Color(0xFFFF0000)),
        "ZA" to listOf(Color(0xFF007A4D), Color(0xFFFFB612), Color(0xFFDE3831)),
        "CA" to listOf(Color(0xFFFF0000), Color(0xFFFFFFFF)),
        "IT" to listOf(Color(0xFF009246), Color(0xFFFFFFFF), Color(0xFFCE2B37)),
        "ES" to listOf(Color(0xFFAA151B), Color(0xFFF1BF00)),
        "CN" to listOf(Color(0xFFDE2910), Color(0xFFFFDE00)),
        "RU" to listOf(Color(0xFFFFFFFF), Color(0xFF0039A6), Color(0xFFD52B1E)),
        "MX" to listOf(Color(0xFF006847), Color(0xFFFFFFFF), Color(0xFFCE1126)),
        "KR" to listOf(Color(0xFFFFFFFF), Color(0xFFCD2E3A), Color(0xFF0047A0)),
        "NL" to listOf(Color(0xFFAE1C28), Color(0xFFFFFFFF), Color(0xFF21468B)),
        "SE" to listOf(Color(0xFF006AA7), Color(0xFFFECC00)),
        "NO" to listOf(Color(0xFFBA0C2F), Color(0xFFFFFFFF), Color(0xFF00205B)),
        "DK" to listOf(Color(0xFFC8102E), Color(0xFFFFFFFF)),
        "FI" to listOf(Color(0xFFFFFFFF), Color(0xFF003580)),
        "PL" to listOf(Color(0xFFFFFFFF), Color(0xFFDC143C)),
        "PT" to listOf(Color(0xFF006600), Color(0xFFFF0000), Color(0xFFFFC400)),
        "GR" to listOf(Color(0xFF0D5EAF), Color(0xFFFFFFFF)),
        "TR" to listOf(Color(0xFFE30A17), Color(0xFFFFFFFF)),
        "EG" to listOf(Color(0xFFCE1126), Color(0xFFFFFFFF), Color(0xFF000000)),
        "NG" to listOf(Color(0xFF008751), Color(0xFFFFFFFF)),
        "KE" to listOf(Color(0xFF000000), Color(0xFFBB0000), Color(0xFF006600)),
        "AR" to listOf(Color(0xFF74ACDF), Color(0xFFFFFFFF), Color(0xFFF6B40E)),
        "CL" to listOf(Color(0xFFFFFFFF), Color(0xFF0039A6), Color(0xFFD52B1E)),
        "CO" to listOf(Color(0xFFFCD116), Color(0xFF003893), Color(0xFFCE1126)),
        "PE" to listOf(Color(0xFFD91023), Color(0xFFFFFFFF)),
        "VE" to listOf(Color(0xFFFCF75E), Color(0xFF0033A0), Color(0xFFCF142B)),
        "TH" to listOf(Color(0xFFED1C24), Color(0xFFFFFFFF), Color(0xFF241D4F)),
        "VN" to listOf(Color(0xFFDA251D), Color(0xFFFFFF00)),
        "PH" to listOf(Color(0xFF0038A8), Color(0xFFCE1126), Color(0xFFFCD116)),
        "ID" to listOf(Color(0xFFFF0000), Color(0xFFFFFFFF)),
        "MY" to listOf(Color(0xFFCC0001), Color(0xFFFFFFFF), Color(0xFF010066)),
        "SG" to listOf(Color(0xFFED2939), Color(0xFFFFFFFF)),
        "NZ" to listOf(Color(0xFF00247D), Color(0xFFCC142B), Color(0xFFFFFFFF)),
        "IE" to listOf(Color(0xFF169B62), Color(0xFFFFFFFF), Color(0xFFFF883E)),
        "CH" to listOf(Color(0xFFFF0000), Color(0xFFFFFFFF)),
        "AT" to listOf(Color(0xFFED2939), Color(0xFFFFFFFF)),
        "BE" to listOf(Color(0xFF000000), Color(0xFFFDDA24), Color(0xFFEF3340)),
        "CZ" to listOf(Color(0xFFFFFFFF), Color(0xFFD7141A), Color(0xFF11457E)),
        "HU" to listOf(Color(0xFFCD2A3E), Color(0xFFFFFFFF), Color(0xFF436F4D)),
        "RO" to listOf(Color(0xFF002B7F), Color(0xFFFCD116), Color(0xFFCE1126)),
        "UA" to listOf(Color(0xFF005BBB), Color(0xFFFFD500)),
        "SA" to listOf(Color(0xFF006C35), Color(0xFFFFFFFF)),
        "AE" to listOf(Color(0xFFFF0000), Color(0xFF00732F), Color(0xFFFFFFFF), Color(0xFF000000)),
        "IL" to listOf(Color(0xFFFFFFFF), Color(0xFF0038B8)),
        "PK" to listOf(Color(0xFF01411C), Color(0xFFFFFFFF)),
    )

    /**
     * Get colors for a country by alpha2 code
     */
    fun getColorsForCountry(alpha2: String): List<Color> {
        return countryColors[alpha2] ?: generateDefaultColors()
    }

    /**
     * Generate default colors when country-specific colors are not available
     */
    private fun generateDefaultColors(): List<Color> {
        return listOf(
            Color(0xFF6366F1),
            Color(0xFFF1F5F9),
            Color(0xFF8B5CF6)
        )
    }
}
