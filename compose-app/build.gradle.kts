plugins {

}

group = libs.versions.composeApp.group.get()
version = libs.versions.composeApp.version.get()

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/ComposeApp"))