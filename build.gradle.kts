plugins {
    alias(libs.plugins.android.application) apply false
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/RootProject"))