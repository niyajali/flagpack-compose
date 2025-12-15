plugins {
    `kotlin-dsl`
    alias(libs.plugins.kotlin.serialization)
}

dependencies {
    // Git operations
    implementation(libs.generator.jgit)

    // Code generation
    implementation(libs.generator.kotlinpoet)

    // JSON parsing
    implementation(libs.kotlinx.serialization.json)

    // Testing
    testImplementation(kotlin("test"))
}

// Note: SVG to ImageVector conversion is now handled by Valkyrie CLI
// Install via: brew install ComposeGears/repo/valkyrie

gradlePlugin {
    plugins {
        create("flagpackIcons") {
            id = "flagpack.icons"
            implementationClass = "FlagpackSyncPlugin"
            displayName = "Flagpack Icons Plugin"
            description = "Plugin for syncing and generating flag icons from flagpack-core"
        }
    }
}
