plugins {
    id("org.danilopianini.gradle-pre-commit-git-hooks") version "2.0.18"
    id("com.gradle.develocity") version "3.19"
}

rootProject.name = "user-service"

include(
    "domain",
    "application",
    "storage",
    "presentation",
    "grpc",
    "rabbitmq",
    "entrypoint",
)

develocity {
    buildScan {
        termsOfUseUrl = "https://gradle.com/terms-of-service"
        termsOfUseAgree = "yes"
        uploadInBackground = !System.getenv("CI").toBoolean()
        publishing.onlyIf { it.buildResult.failures.isNotEmpty() }
    }
}

gitHooks {
    commitMsg { conventionalCommits() }
    preCommit {
        tasks("check")
    }
    createHooks(overwriteExisting = true)
}
