import com.vanniktech.maven.publish.SonatypeHost
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.android.library)
    alias(libs.plugins.maven)
    id("flagpack.icons")
}

kotlin {
    explicitApi()

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
        publishLibraryVariants("release")
    }

    jvm {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_17)
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "FlagpackCompose"
            isStatic = true
        }
    }

    js(IR) {
        browser()
        nodejs()
    }

    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs {
        browser()
        nodejs()
    }

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.ui)
            implementation(compose.components.uiToolingPreview)
        }

        commonTest.dependencies {
            implementation(kotlin("test"))
        }

        androidMain.dependencies {
            implementation(compose.preview)
        }

        jvmMain.dependencies {
            implementation(compose.preview)
        }
    }

    targets.configureEach {
        compilations.configureEach {
            compileTaskProvider.get().compilerOptions {
                freeCompilerArgs.add("-Xexpect-actual-classes")
            }
        }
    }
}

dependencies {
    debugImplementation(compose.uiTooling)
}

android {
    namespace = "flagpack.compose"
    compileSdk = 36

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")

    defaultConfig {
        minSdk = 21
        consumerProguardFiles("consumer-rules.pro")
    }

    buildFeatures {
        compose = true
        buildConfig = false
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

    lint {
        abortOnError = false
        warningsAsErrors = false
    }
}

// Maven publishing configuration
val artifactId = "flagpack-compose"
val mavenGroup: String by project
val defaultVersion: String by project
val currentVersion = System.getenv("PACKAGE_VERSION") ?: defaultVersion
val desc: String by project
val license: String by project
val creationYear: String by project
val githubRepo: String by project

group = mavenGroup
version = currentVersion

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    coordinates(mavenGroup, artifactId, currentVersion)

    pom {
        name = project.name
        description = desc
        inceptionYear = creationYear
        url = "https://github.com/$githubRepo"
        licenses {
            license {
                name = license
                url = "https://github.com/$githubRepo/blob/main/LICENSE"
            }
        }
        developers {
            developer {
                id = "niyajali"
                name = "Sk Niyaj Ali"
                url = "https://github.com/niyajali/"
            }
        }
        scm {
            url = "https://github.com/$githubRepo.git"
            connection = "scm:git:git://github.com/$githubRepo.git"
            developerConnection = "scm:git:git://github.com/$githubRepo.git"
        }
        issueManagement {
            url = "https://github.com/$githubRepo/issues"
        }
    }
}

// Configure flagpack sync plugin
flagpackIcons {
    gitRepository.set("https://github.com/Yummygum/flagpack-core.git")
    gitRef.set("main")
    svgSourcePath.set("svg")
    targetPath.set("library/src/commonMain/kotlin/flagpack/icons")
    packageName.set("flagpack.icons")
    supportedSizes.set(listOf("s", "m", "l"))
    generatePreviews.set(true)
}
