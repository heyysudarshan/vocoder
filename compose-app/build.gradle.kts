plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.composeApp.group.get()
version = libs.versions.composeApp.version.get()

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

android {
    namespace = libs.versions.composeApp.namespace.get()
    compileSdk = libs.versions.composeApp.compileSdk.get().toInt()

    defaultConfig {
        minSdk = libs.versions.composeApp.minSdk.get().toInt()
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/ComposeApp"))