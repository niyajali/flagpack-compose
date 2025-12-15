# Flagpack Compose

A Kotlin Multiplatform library providing 250+ country flag icons as Compose `ImageVector` assets.
Built on top of [flagpack-core](https://github.com/Yummygum/flagpack-core).

[![Build](https://github.com/your-username/flagpack-compose/actions/workflows/build.yml/badge.svg)](https://github.com/your-username/flagpack-compose/actions/workflows/build.yml)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.0-blue.svg)](https://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose-1.7.1-blue.svg)](https://www.jetbrains.com/lp/compose-multiplatform/)

## Features

- **250+ Flags** - All ISO 3166-1 countries plus UK regions (England, Scotland, Wales, Northern
  Ireland)
- **3 Sizes** - Small (16x12), Medium (20x15), Large (32x24)
- **Compose ImageVector** - Native Compose vector graphics, no bitmap assets
- **Multiplatform** - Android, iOS, Desktop (JVM), Web (JS/Wasm)
- **Tree-shakeable** - Only import the flags you use
- **Type-safe** - Access flags by country name properties

## Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("io.github.niyajali:flagpack-compose:${latestVersion}")
}
```

## Usage

### Basic Usage

```kotlin
import flagpack.icons.FlagIcons
import flagpack.icons.large.UnitedStates

@Composable
fun FlagExample() {
    Image(
        imageVector = FlagIcons.Large.UnitedStates,
        contentDescription = "United States Flag"
    )
}
```

### Different Sizes

```kotlin
// Small (16x12dp) - Compact lists, inline indicators
FlagIcons.Small.France

// Medium (20x15dp) - Standard lists, form fields
FlagIcons.Medium.France

// Large (32x24dp) - Prominent display, pickers
FlagIcons.Large.France
```

### Country Picker

```kotlin
@Composable
fun CountryPicker() {
    LazyColumn {
        items(FlagIcons.LargeFlagList) { flag ->
            Row(
                modifier = Modifier.clickable { /* select country */ }
            ) {
                Image(
                    imageVector = flag,
                    contentDescription = null,
                    modifier = Modifier.size(32.dp, 24.dp)
                )
                // Country name text...
            }
        }
    }
}
```

### Available Flags

Flags are accessed using country names as properties:

```kotlin
FlagIcons.Large.UnitedStates      // US
FlagIcons.Large.UnitedKingdom     // GB-UKM
FlagIcons.Large.Germany           // DE
FlagIcons.Large.Japan             // JP
FlagIcons.Large.Brazil            // BR
FlagIcons.Large.India             // IN
FlagIcons.Large.China             // CN
FlagIcons.Large.Australia         // AU
// ... 250+ more countries
```

UK Constituent Countries:

```kotlin
FlagIcons.Large.England           // GB-ENG
FlagIcons.Large.Scotland          // GB-SCT
FlagIcons.Large.Wales             // GB-WLS
FlagIcons.Large.NorthernIreland   // GB-NIR
```

Special Regions:

```kotlin
FlagIcons.Large.Bonaire           // BQ-BO
FlagIcons.Large.Saba              // BQ-SA
FlagIcons.Large.SintEustatius     // BQ-SE
```

## Platform Support

| Platform      | Status |
|---------------|--------|
| Android       | ✅      |
| iOS           | ✅      |
| Desktop (JVM) | ✅      |
| Web (JS)      | ✅      |
| Web (Wasm)    | ✅      |

## Syncing with Upstream

This library automatically syncs with [flagpack-core](https://github.com/Yummygum/flagpack-core)
weekly. You can also trigger a manual sync:

```bash
# Check for new flags
./gradlew checkNewFlags

# Sync and generate new flags
./gradlew syncAndGenerate
```

## Development

### Building

```bash
./gradlew build
```

### Running Tests

```bash
./gradlew check
```

### Generating Flags from Local Source

```bash
./gradlew generateFlags -PflagpackLocalPath=/path/to/flagpack-core
```

## Credits

- Flag assets from [Flagpack](https://flagpack.xyz) by [Yummygum](https://yummygum.com)
- SVG to Compose conversion using [Valkyrie](https://github.com/ComposeGears/Valkyrie)

## License

This library is licensed under the MIT License. Flag assets are from Flagpack which is also MIT
licensed.

```
MIT License

Copyright (c) 2025

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
