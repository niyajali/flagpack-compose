package utils

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import models.FlagEntry
import java.io.File

/**
 * Utility for mapping ISO country codes to country names and property names.
 *
 * This class parses the countryCodeList from flagpack-core and provides
 * mappings for generating Kotlin property names from ISO codes.
 */
object CountryCodeMapper {

    private val json = Json { ignoreUnknownKeys = true }

    /**
     * Default country code mappings based on flagpack-core's countryCodeList.
     * This is used as a fallback when the JSON file is not available.
     */
    private val defaultMappings: List<FlagEntry> = listOf(
        FlagEntry("Andorra", "AD", "AND", "020"),
        FlagEntry("United Arab Emirates", "AE", "ARE", "784"),
        FlagEntry("Afghanistan", "AF", "AFG", "004"),
        FlagEntry("Antigua and Barbuda", "AG", "ATG", "028"),
        FlagEntry("Anguilla", "AI", "AIA", "660"),
        FlagEntry("Albania", "AL", "ALB", "008"),
        FlagEntry("Armenia", "AM", "ARM", "051"),
        FlagEntry("Angola", "AO", "AGO", "024"),
        FlagEntry("Antarctica", "AQ", "ATA", "010"),
        FlagEntry("Argentina", "AR", "ARG", "032"),
        FlagEntry("American Samoa", "AS", "ASM", "016"),
        FlagEntry("Austria", "AT", "AUT", "040"),
        FlagEntry("Australia", "AU", "AUS", "016"),
        FlagEntry("Aruba", "AW", "ABW", "533"),
        FlagEntry("Aland Islands", "AX", "ALA", "248"),
        FlagEntry("Azerbaijan", "AZ", "AZE", "031"),
        FlagEntry("Bosnia and Herzegovina", "BA", "BIH", "070"),
        FlagEntry("Barbados", "BB", "BRB", "052"),
        FlagEntry("Bangladesh", "BD", "BGD", "050"),
        FlagEntry("Belgium", "BE", "BEL", "056"),
        FlagEntry("Burkina Faso", "BF", "BFA", "854"),
        FlagEntry("Bulgaria", "BG", "BGR", "100"),
        FlagEntry("Bahrain", "BH", "BHR", "048"),
        FlagEntry("Burundi", "BI", "BDI", "108"),
        FlagEntry("Benin", "BJ", "BEN", "204"),
        FlagEntry("Saint Barthelemy", "BL", "BLM", "652"),
        FlagEntry("Bermuda", "BM", "BMU", "060"),
        FlagEntry("Brunei", "BN", "BRN", "096"),
        FlagEntry("Bolivia", "BO", "BOL", "068"),
        FlagEntry("Bonaire", "BQ-BO"),
        FlagEntry("Saba", "BQ-SA"),
        FlagEntry("Sint Eustatius", "BQ-SE"),
        FlagEntry("Brazil", "BR", "BRA", "076"),
        FlagEntry("Bahamas", "BS", "BHS", "044"),
        FlagEntry("Bhutan", "BT", "BTN", "064"),
        FlagEntry("Bouvet Island", "BV", "BVT", "074"),
        FlagEntry("Botswana", "BW", "BWA", "072"),
        FlagEntry("Belarus", "BY", "BLR", "112"),
        FlagEntry("Belize", "BZ", "BLZ", "084"),
        FlagEntry("Canada", "CA", "CAN", "124"),
        FlagEntry("Cocos Islands", "CC", "CCK", "166"),
        FlagEntry("Democratic Republic of Congo", "CD", "COD", "180"),
        FlagEntry("Central African Republic", "CF", "CAF", "140"),
        FlagEntry("Congo", "CG", "COG", "178"),
        FlagEntry("Switzerland", "CH", "CHE", "756"),
        FlagEntry("Cote dIvoire", "CI", "CIV", "384"),
        FlagEntry("Cook Islands", "CK", "COK", "184"),
        FlagEntry("Chile", "CL", "CHL", "152"),
        FlagEntry("Cameroon", "CM", "CMR", "120"),
        FlagEntry("China", "CN", "CHN", "156"),
        FlagEntry("Colombia", "CO", "COL", "170"),
        FlagEntry("Costa Rica", "CR", "CRI", "188"),
        FlagEntry("Cuba", "CU", "CUB", "192"),
        FlagEntry("Cape Verde", "CV", "CPV", "132"),
        FlagEntry("Curacao", "CW", "CUW", "531"),
        FlagEntry("Christmas Island", "CX", "CXR", "162"),
        FlagEntry("Cyprus", "CY", "CYP", "196"),
        FlagEntry("Czech Republic", "CZ", "CZE", "203"),
        FlagEntry("Germany", "DE", "DEU", "276"),
        FlagEntry("Djibouti", "DJ", "DJI", "262"),
        FlagEntry("Denmark", "DK", "DNK", "208"),
        FlagEntry("Dominica", "DM", "DMA", "212"),
        FlagEntry("Dominican Republic", "DO", "DOM", "214"),
        FlagEntry("Algeria", "DZ", "DZA", "012"),
        FlagEntry("Ecuador", "EC", "ECU", "218"),
        FlagEntry("Estonia", "EE", "EST", "233"),
        FlagEntry("Egypt", "EG", "EGY", "818"),
        FlagEntry("Western Sahara", "EH", "ESH", "732"),
        FlagEntry("Eritrea", "ER", "ERI", "232"),
        FlagEntry("Spain", "ES", "ESP", "724"),
        FlagEntry("Ethiopia", "ET", "ETH", "231"),
        FlagEntry("Finland", "FI", "FIN", "246"),
        FlagEntry("Fiji", "FJ", "FJI", "242"),
        FlagEntry("Falkland Islands", "FK", "FLK", "238"),
        FlagEntry("Micronesia", "FM", "FSM", "583"),
        FlagEntry("Faroe Islands", "FO", "FRO", "234"),
        FlagEntry("France", "FR", "FRA", "250"),
        FlagEntry("Gabon", "GA", "GAB", "266"),
        FlagEntry("England", "GB-ENG"),
        FlagEntry("Scotland", "GB-SCT"),
        FlagEntry("United Kingdom", "GB-UKM", "GBR", "836"),
        FlagEntry("Wales", "GB-WLS"),
        FlagEntry("Northern Ireland", "GB-NIR"),
        FlagEntry("Grenada", "GD", "GRD", "308"),
        FlagEntry("Georgia", "GE", "GEO", "268"),
        FlagEntry("French Guiana", "GF", "GUF", "254"),
        FlagEntry("Guernsey", "GG", "GGY", "831"),
        FlagEntry("Ghana", "GH", "GHA", "288"),
        FlagEntry("Gibraltar", "GI", "GIB", "292"),
        FlagEntry("Greenland", "GL", "GRL", "304"),
        FlagEntry("Gambia", "GM", "GMB", "270"),
        FlagEntry("Guinea", "GN", "GIN", "324"),
        FlagEntry("Guadeloupe", "GP", "GLP", "312"),
        FlagEntry("Equatorial Guinea", "GQ", "GNQ", "226"),
        FlagEntry("Greece", "GR", "GRC", "300"),
        FlagEntry("South Georgia", "GS", "SGS", "239"),
        FlagEntry("Guatemala", "GT", "GTM", "320"),
        FlagEntry("Guam", "GU", "GUM", "316"),
        FlagEntry("Guinea Bissau", "GW", "GNB", "624"),
        FlagEntry("Guyana", "GY", "GUY", "328"),
        FlagEntry("Hong Kong", "HK", "HKG", "344"),
        FlagEntry("Heard Island and McDonald Islands", "HM", "HMD", "334"),
        FlagEntry("Honduras", "HN", "HND", "340"),
        FlagEntry("Croatia", "HR", "HRV", "191"),
        FlagEntry("Haiti", "HT", "HTI", "332"),
        FlagEntry("Hungary", "HU", "HUN", "348"),
        FlagEntry("Indonesia", "ID", "IDN", "360"),
        FlagEntry("Ireland", "IE", "IRL", "372"),
        FlagEntry("Israel", "IL", "ISR", "376"),
        FlagEntry("Isle of Man", "IM", "IMN", "833"),
        FlagEntry("India", "IN", "IND", "356"),
        FlagEntry("British Indian Ocean Territory", "IO", "IOT", "086"),
        FlagEntry("Iraq", "IQ", "IRQ", "368"),
        FlagEntry("Iran", "IR", "IRN", "364"),
        FlagEntry("Iceland", "IS", "ISL", "352"),
        FlagEntry("Italy", "IT", "ITA", "380"),
        FlagEntry("Jersey", "JE", "JEY", "832"),
        FlagEntry("Jamaica", "JM", "JAM", "388"),
        FlagEntry("Jordan", "JO", "JOR", "400"),
        FlagEntry("Japan", "JP", "JPN", "392"),
        FlagEntry("Kenya", "KE", "KEN", "404"),
        FlagEntry("Kyrgyzstan", "KG", "KGZ", "417"),
        FlagEntry("Cambodia", "KH", "KHM", "116"),
        FlagEntry("Kiribati", "KI", "KIR", "296"),
        FlagEntry("Comoros", "KM", "COM", "174"),
        FlagEntry("Saint Kitts and Nevis", "KN", "KNA", "659"),
        FlagEntry("North Korea", "KP", "PRK", "408"),
        FlagEntry("South Korea", "KR", "KOR", "410"),
        FlagEntry("Kuwait", "KW", "KWT", "414"),
        FlagEntry("Cayman Islands", "KY", "CYM", "136"),
        FlagEntry("Kazakhstan", "KZ", "KAZ", "398"),
        FlagEntry("Laos", "LA", "LAO", "418"),
        FlagEntry("Lebanon", "LB", "LBN", "422"),
        FlagEntry("Saint Lucia", "LC", "LCA", "662"),
        FlagEntry("Liechtenstein", "LI", "LIE", "438"),
        FlagEntry("Sri Lanka", "LK", "LKA", "144"),
        FlagEntry("Liberia", "LR", "LBR", "430"),
        FlagEntry("Lesotho", "LS", "LSO", "426"),
        FlagEntry("Lithuania", "LT", "LTU", "440"),
        FlagEntry("Luxembourg", "LU", "LUX", "442"),
        FlagEntry("Latvia", "LV", "LVA", "428"),
        FlagEntry("Libya", "LY", "LBY", "434"),
        FlagEntry("Morocco", "MA", "MAR", "504"),
        FlagEntry("Monaco", "MC", "MCO", "492"),
        FlagEntry("Moldova", "MD", "MDA", "498"),
        FlagEntry("Montenegro", "ME", "MNE", "499"),
        FlagEntry("Saint Martin", "MF", "MAF", "663"),
        FlagEntry("Madagascar", "MG", "MDG", "450"),
        FlagEntry("Marshall Islands", "MH", "MHL", "584"),
        FlagEntry("North Macedonia", "MK", "MKD", "807"),
        FlagEntry("Mali", "ML", "MLI", "466"),
        FlagEntry("Myanmar", "MM", "MMR", "104"),
        FlagEntry("Mongolia", "MN", "MNG", "496"),
        FlagEntry("Macao", "MO", "MAC", "446"),
        FlagEntry("Northern Mariana Islands", "MP", "MNP", "580"),
        FlagEntry("Martinique", "MQ", "MTQ", "474"),
        FlagEntry("Mauritania", "MR", "MRT", "478"),
        FlagEntry("Montserrat", "MS", "MSR", "500"),
        FlagEntry("Malta", "MT", "MLT", "470"),
        FlagEntry("Mauritius", "MU", "MUS", "480"),
        FlagEntry("Maldives", "MV", "MDV", "462"),
        FlagEntry("Malawi", "MW", "MWI", "454"),
        FlagEntry("Mexico", "MX", "MEX", "484"),
        FlagEntry("Malaysia", "MY", "MYS", "458"),
        FlagEntry("Mozambique", "MZ", "MOZ", "508"),
        FlagEntry("Namibia", "NA", "NAM", "516"),
        FlagEntry("New Caledonia", "NC", "NCL", "540"),
        FlagEntry("Niger", "NE", "NER", "562"),
        FlagEntry("Norfolk Island", "NF", "NFK", "574"),
        FlagEntry("Nigeria", "NG", "NGA", "566"),
        FlagEntry("Nicaragua", "NI", "NIC", "558"),
        FlagEntry("Netherlands", "NL", "NLD", "528"),
        FlagEntry("Norway", "NO", "NOR", "578"),
        FlagEntry("Nepal", "NP", "NPL", "524"),
        FlagEntry("Nauru", "NR", "NRU", "520"),
        FlagEntry("Niue", "NU", "NIU", "570"),
        FlagEntry("New Zealand", "NZ", "NZL", "554"),
        FlagEntry("Oman", "OM", "OMN", "512"),
        FlagEntry("Panama", "PA", "PAN", "591"),
        FlagEntry("Peru", "PE", "PER", "604"),
        FlagEntry("French Polynesia", "PF", "PYF", "258"),
        FlagEntry("Papua New Guinea", "PG", "PNG", "598"),
        FlagEntry("Philippines", "PH", "PHL", "608"),
        FlagEntry("Pakistan", "PK", "PAK", "586"),
        FlagEntry("Poland", "PL", "POL", "616"),
        FlagEntry("Saint Pierre and Miquelon", "PM", "SPM", "666"),
        FlagEntry("Pitcairn Islands", "PN", "PCN", "612"),
        FlagEntry("Puerto Rico", "PR", "PRI", "630"),
        FlagEntry("Palestine", "PS", "PSE", "275"),
        FlagEntry("Portugal", "PT", "PRT", "620"),
        FlagEntry("Palau", "PW", "PLW", "585"),
        FlagEntry("Paraguay", "PY", "PRY", "600"),
        FlagEntry("Qatar", "QA", "QAT", "634"),
        FlagEntry("Reunion", "RE", "REU", "638"),
        FlagEntry("Romania", "RO", "ROU", "642"),
        FlagEntry("Serbia", "RS", "SRB", "688"),
        FlagEntry("Russia", "RU", "RUS", "643"),
        FlagEntry("Rwanda", "RW", "RWA", "646"),
        FlagEntry("Saudi Arabia", "SA", "SAU", "682"),
        FlagEntry("Solomon Islands", "SB", "SLB", "090"),
        FlagEntry("Seychelles", "SC", "SYC", "690"),
        FlagEntry("Sudan", "SD", "SDN", "729"),
        FlagEntry("Sweden", "SE", "SWE", "752"),
        FlagEntry("Singapore", "SG", "SGP", "702"),
        FlagEntry("Saint Helena", "SH", "SHN", "654"),
        FlagEntry("Slovenia", "SI", "SVN", "705"),
        FlagEntry("Svalbard and Jan Mayen", "SJ", "SJM", "744"),
        FlagEntry("Slovakia", "SK", "SVK", "703"),
        FlagEntry("Sierra Leone", "SL", "SLE", "694"),
        FlagEntry("San Marino", "SM", "SMR", "674"),
        FlagEntry("Senegal", "SN", "SEN", "686"),
        FlagEntry("Somalia", "SO", "SOM", "706"),
        FlagEntry("Suriname", "SR", "SUR", "740"),
        FlagEntry("South Sudan", "SS", "SSD", "728"),
        FlagEntry("Sao Tome and Principe", "ST", "STP", "678"),
        FlagEntry("El Salvador", "SV", "SLV", "222"),
        FlagEntry("Sint Maarten", "SX", "SXM", "534"),
        FlagEntry("Syria", "SY", "SYR", "760"),
        FlagEntry("Eswatini", "SZ", "SWZ", "748"),
        FlagEntry("Turks and Caicos Islands", "TC", "TCA", "796"),
        FlagEntry("Chad", "TD", "TCD", "148"),
        FlagEntry("French Southern Territories", "TF", "ATF", "260"),
        FlagEntry("Togo", "TG", "TGO", "768"),
        FlagEntry("Thailand", "TH", "THA", "764"),
        FlagEntry("Tajikistan", "TJ", "TJK", "762"),
        FlagEntry("Tokelau", "TK", "TKL", "772"),
        FlagEntry("Timor Leste", "TL", "TLS", "626"),
        FlagEntry("Turkmenistan", "TM", "TKM", "795"),
        FlagEntry("Tunisia", "TN", "TUN", "788"),
        FlagEntry("Tonga", "TO", "TON", "776"),
        FlagEntry("Turkey", "TR", "TUR", "792"),
        FlagEntry("Trinidad and Tobago", "TT", "TTO", "780"),
        FlagEntry("Tuvalu", "TV", "TUV", "798"),
        FlagEntry("Taiwan", "TW", "TWN", "158"),
        FlagEntry("Tanzania", "TZ", "TZA", "834"),
        FlagEntry("Ukraine", "UA", "UKR", "804"),
        FlagEntry("Uganda", "UG", "UGA", "800"),
        FlagEntry("US Minor Outlying Islands", "UM", "UMI", "581"),
        FlagEntry("United States", "US", "USA", "840"),
        FlagEntry("Uruguay", "UY", "URY", "858"),
        FlagEntry("Uzbekistan", "UZ", "UZB", "860"),
        FlagEntry("Vatican City", "VA", "VAT", "336"),
        FlagEntry("Saint Vincent and the Grenadines", "VC", "VCT", "670"),
        FlagEntry("Venezuela", "VE", "VEN", "862"),
        FlagEntry("British Virgin Islands", "VG", "VGB", "092"),
        FlagEntry("US Virgin Islands", "VI", "VIR", "850"),
        FlagEntry("Vietnam", "VN", "VNM", "704"),
        FlagEntry("Vanuatu", "VU", "VUT", "548"),
        FlagEntry("Wallis and Futuna", "WF", "WLF", "876"),
        FlagEntry("Samoa", "WS", "WSM", "882"),
        FlagEntry("Yemen", "YE", "YEM", "887"),
        FlagEntry("Mayotte", "YT", "MYT", "175"),
        FlagEntry("South Africa", "ZA", "ZAF", "710"),
        FlagEntry("Zambia", "ZM", "ZMB", "894"),
        FlagEntry("Zimbabwe", "ZW", "ZWE", "716")
    )

    private var mappings: Map<String, FlagEntry> = defaultMappings.associateBy { it.alpha2 }

    /**
     * Load mappings from a JSON file (countryCodeList.json from flagpack-core).
     */
    fun loadFromJson(jsonFile: File) {
        if (jsonFile.exists()) {
            try {
                val entries: List<FlagEntry> = json.decodeFromString(jsonFile.readText())
                mappings = entries.associateBy { it.alpha2 }
            } catch (e: Exception) {
                println("Warning: Failed to load country codes from JSON, using defaults: ${e.message}")
            }
        }
    }

    /**
     * Get the FlagEntry for an alpha2 code.
     */
    fun getEntry(alpha2Code: String): FlagEntry? = mappings[alpha2Code]

    /**
     * Get the property name for an alpha2 code.
     */
    fun getPropertyName(alpha2Code: String): String {
        return mappings[alpha2Code]?.propertyName ?: alpha2Code.toPascalCase()
    }

    /**
     * Get the country name for an alpha2 code.
     */
    fun getCountryName(alpha2Code: String): String {
        return mappings[alpha2Code]?.countryName ?: alpha2Code
    }

    /**
     * Get all flag entries.
     */
    fun getAllEntries(): List<FlagEntry> = mappings.values.toList()

    /**
     * Convert a string to PascalCase.
     */
    private fun String.toPascalCase(): String {
        return this.replace("-", " ")
            .split(Regex("\\s+"))
            .joinToString("") { word ->
                word.lowercase().replaceFirstChar { it.uppercase() }
            }
    }
}
