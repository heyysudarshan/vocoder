plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin {
    androidTarget()

    jvm("desktop")

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }
}

group = libs.versions.composeApp.group.get()
version = libs.versions.composeApp.version.get()

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/ComposeApp"))