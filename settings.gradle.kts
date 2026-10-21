@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal {
            content { includeGroup("com.github.berkchy.quackjs") }
        }
        maven("https://jitpack.io") {
            content { includeGroup("com.github.berkchy.quackjs") }
        }
    }
}

rootProject.name = "innertubex"
include(":harness")
