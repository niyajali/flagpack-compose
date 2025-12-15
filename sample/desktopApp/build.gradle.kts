import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
}

kotlin {
    jvm {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    sourceSets {
        jvmMain.dependencies {
            implementation(projects.sample.shared)
            implementation(compose.desktop.currentOs)
            implementation(compose.ui)
            implementation(compose.material3)
        }
    }
}

compose.desktop {
    application {
        mainClass = "com.flagpack.sample.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "FlagpackSample"
            packageVersion = "1.0.0"

            macOS {
                bundleID = "com.flagpack.sample"
            }

            windows {
                menuGroup = "Flagpack"
                upgradeUuid = "a1b2c3d4-e5f6-7890-abcd-ef1234567890"
            }

            linux {
                packageName = "flagpack-sample"
            }
        }
    }
}
