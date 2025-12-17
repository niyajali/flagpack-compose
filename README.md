# Flagpack Compose

A Kotlin Multiplatform library providing 250+ country flag icons as Compose `ImageVector` assets.
Built on top of [flagpack-core](https://github.com/Yummygum/flagpack-core).

[![Build](https://github.com/niyajali/flagpack-compose/actions/workflows/build.yml/badge.svg)](https://github.com/niyajali/flagpack-compose/actions/workflows/build.yml)
[![Kotlin Multiplatform](https://img.shields.io/badge/Kotlin-2.2.21-blue.svg)](https://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose-1.9.3-blue.svg)](https://www.jetbrains.com/lp/compose-multiplatform/)

[![GitHub release](https://img.shields.io/github/v/release/niyajali/flagpack-compose?style=flat-square)](https://github.com/niyajali/flagpack-compose/releases/latest)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.niyajali/flagpack-compose.svg)](https://search.maven.org/artifact/io.github.niyajali/flagpack-compose)

## Installation

```kotlin
implementation("io.github.niyajali:flagpack-compose:${latestVersion}")
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
- Built with [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform.html) and [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)

