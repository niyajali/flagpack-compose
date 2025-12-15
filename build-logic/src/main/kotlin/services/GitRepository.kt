package services

import org.eclipse.jgit.api.Git
import org.eclipse.jgit.api.errors.GitAPIException
import org.eclipse.jgit.lib.Constants
import org.eclipse.jgit.lib.ProgressMonitor
import java.io.File

/**
 * Service for interacting with Git repositories.
 * Uses JGit for shallow cloning and fetching.
 */
class GitRepository(
    private val repositoryUrl: String,
    private val ref: String = "main"
) {
    private var localDir: File? = null
    private var git: Git? = null

    /**
     * Clone the repository to a temporary directory with shallow depth.
     *
     * @param progressMonitor Optional progress monitor for clone operation
     * @return The directory containing the cloned repository
     */
    fun cloneShallow(progressMonitor: ProgressMonitor? = null): File {
        val tempDir = createTempDir("flagpack-repo-")

        try {
            val formattedRef = formatRef(ref)

            git = Git.cloneRepository()
                .setURI(repositoryUrl)
                .setDirectory(tempDir)
                .setBranchesToClone(listOf(formattedRef))
                .setBranch(formattedRef)
                .setDepth(1) // Shallow clone
                .apply {
                    progressMonitor?.let { setProgressMonitor(it) }
                }
                .call()

            localDir = tempDir
            return tempDir
        } catch (e: GitAPIException) {
            // Clean up on failure
            tempDir.deleteRecursively()
            throw GitRepositoryException("Failed to clone repository: ${e.message}", e)
        }
    }

    /**
     * Get the path to a specific directory within the cloned repository.
     *
     * @param path The relative path within the repository
     * @return The File object for the directory
     */
    fun getDirectory(path: String): File {
        val dir = localDir ?: throw GitRepositoryException("Repository not cloned yet")
        return File(dir, path)
    }

    /**
     * Get the path to a specific file within the cloned repository.
     *
     * @param path The relative path within the repository
     * @return The File object for the file
     */
    fun getFile(path: String): File {
        val dir = localDir ?: throw GitRepositoryException("Repository not cloned yet")
        return File(dir, path)
    }

    /**
     * Check if a file exists in the cloned repository.
     */
    fun fileExists(path: String): Boolean {
        return getFile(path).exists()
    }

    /**
     * Read the content of a file from the cloned repository.
     */
    fun readFile(path: String): String {
        return getFile(path).readText()
    }

    /**
     * List files in a directory within the cloned repository.
     */
    fun listFiles(path: String): List<File> {
        val dir = getDirectory(path)
        return dir.listFiles()?.toList() ?: emptyList()
    }

    /**
     * Get the current HEAD commit hash.
     */
    fun getHeadCommitHash(): String? {
        return try {
            git?.repository?.resolve(Constants.HEAD)?.name
        } catch (e: Exception) {
            null
        }
    }

    /**
     * Clean up resources and delete the cloned repository.
     */
    fun cleanup() {
        try {
            git?.close()
        } catch (e: Exception) {
            // Ignore close errors
        }

        localDir?.let { dir ->
            try {
                dir.deleteRecursively()
            } catch (e: Exception) {
                println("Warning: Failed to delete temp directory: ${dir.absolutePath}")
            }
        }

        git = null
        localDir = null
    }

    /**
     * Format a git ref to the full ref path.
     * Converts "main" to "refs/heads/main", "v2.1.0" to "refs/tags/v2.1.0", etc.
     */
    private fun formatRef(ref: String): String {
        return when {
            ref.startsWith("refs/") -> ref
            ref.matches(Regex("^v?\\d+\\..*")) -> "refs/tags/$ref"
            else -> "refs/heads/$ref"
        }
    }

    companion object {
        /**
         * Create a GitRepository from extension configuration.
         */
        fun fromExtension(
            gitRepository: String,
            gitRef: String
        ): GitRepository {
            return GitRepository(gitRepository, gitRef)
        }
    }
}

/**
 * Exception thrown for Git repository operations.
 */
class GitRepositoryException(message: String, cause: Throwable? = null) : Exception(message, cause)

/**
 * Simple progress monitor that prints to console.
 */
class ConsoleProgressMonitor : ProgressMonitor {
    override fun start(totalTasks: Int) {
        println("Starting $totalTasks tasks...")
    }

    override fun beginTask(title: String?, totalWork: Int) {
        println("  $title...")
    }

    override fun update(completed: Int) {
        // Silent update
    }

    override fun endTask() {
        // Task completed
    }

    override fun isCancelled(): Boolean = false

    override fun showDuration(enabled: Boolean) {
        // Not implemented
    }
}

/**
 * A repository that uses a local directory instead of cloning from Git.
 * Useful for development and testing.
 */
class LocalDirectoryRepository(
    private val localPath: String
) {
    private val localDir = File(localPath)

    init {
        require(localDir.exists() && localDir.isDirectory) {
            "Local directory does not exist: $localPath"
        }
    }

    fun getDirectory(path: String): File = File(localDir, path)

    fun getFile(path: String): File = File(localDir, path)

    fun fileExists(path: String): Boolean = getFile(path).exists()

    fun readFile(path: String): String = getFile(path).readText()

    fun listFiles(path: String): List<File> = getDirectory(path).listFiles()?.toList() ?: emptyList()

    fun cleanup() {
        // No cleanup needed for local directory
    }
}
