plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/RootProject"))