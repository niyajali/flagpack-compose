import org.gradle.api.Plugin
import org.gradle.api.Project
import tasks.CheckNewFlagsTask
import tasks.GenerateFlagsTask
import tasks.SyncAndGenerateTask
import tasks.SyncFlagsTask
import tasks.UpdateFlagListsTask

/**
 * Gradle plugin for syncing and generating flag icons from flagpack-core.
 *
 * This plugin provides tasks for:
 * - Checking for new flags in upstream repository
 * - Syncing SVG flags from flagpack-core
 * - Converting SVG flags to Compose ImageVector
 * - Updating flag list files
 *
 * Usage in build.gradle.kts:
 * ```kotlin
 * plugins {
 *     id("flagpack.icons")
 * }
 *
 * flagpackIcons {
 *     gitRepository = "https://github.com/Yummygum/flagpack-core.git"
 *     gitRef = "main"
 *     targetPath = "library/src/commonMain/kotlin/flagpack/icons"
 * }
 * ```
 */
class FlagpackSyncPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        // Create the extension for configuration
        val extension = project.extensions.create(
            "flagpackIcons",
            FlagpackExtension::class.java
        )

        // Register tasks
        project.tasks.register("checkNewFlags", CheckNewFlagsTask::class.java) {
            group = TASK_GROUP
            description = "Check for new flags in upstream flagpack-core without syncing"
        }

        project.tasks.register("syncFlags", SyncFlagsTask::class.java) {
            group = TASK_GROUP
            description = "Sync SVG flags from upstream flagpack-core repository"
        }

        project.tasks.register("generateFlags", GenerateFlagsTask::class.java) {
            group = TASK_GROUP
            description = "Generate ImageVector Kotlin files from SVG flags"
        }

        project.tasks.register("updateFlagLists", UpdateFlagListsTask::class.java) {
            group = TASK_GROUP
            description = "Update FlagList.kt files with all available flags"
        }

        project.tasks.register("syncAndGenerate", SyncAndGenerateTask::class.java) {
            group = TASK_GROUP
            description = "Sync flags from upstream and generate ImageVector files"
        }
    }

    companion object {
        const val TASK_GROUP = "flagpack"
    }
}
