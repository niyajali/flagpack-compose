# Flagpack Compose

Country flag icons as Compose ImageVectors for Kotlin Multiplatform.

[![Build](https://github.com/niyajali/flagpack-compose/actions/workflows/build.yml/badge.svg)](https://github.com/niyajali/flagpack-compose/actions/workflows/build.yml)
[![Kotlin Multiplatform](https://img.shields.io/badge/Kotlin-2.2.21-blue.svg)](https://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose-1.9.3-blue.svg)](https://www.jetbrains.com/lp/compose-multiplatform/)

## Installation

```kotlin
dependencies {
    implementation("io.github.niyajali:flagpack-compose:${latestVersion}")
}
```

## Usage

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

Three sizes available:

- `FlagIcons.Small` - 16x12dp
- `FlagIcons.Medium` - 20x15dp
- `FlagIcons.Large` - 32x24dp

## Platforms

Android, iOS, Desktop (JVM), Web (JS/Wasm)

## Credits

- Flag assets from [Flagpack](https://flagpack.xyz) by [Yummygum](https://yummygum.com)
- SVG to Compose conversion using [Valkyrie](https://github.com/ComposeGears/Valkyrie)

## License

MIT License - See [LICENSE](LICENSE) for details.
