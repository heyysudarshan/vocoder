plugins {

}

group = libs.versions.androidApp.group.get()
version = libs.versions.androidApp.version.get()

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/AndroidApp"))