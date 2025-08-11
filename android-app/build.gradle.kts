import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.compose.compiler)
}

group = libs.versions.androidApp.group.get()
version = libs.versions.androidApp.version.get()

android {
    namespace = libs.versions.androidApp.namespace.get()
    compileSdk = libs.versions.androidApp.compileSdk.get().toInt()

    defaultConfig {
        applicationId = libs.versions.androidApp.applicationId.get()
        targetSdk = libs.versions.androidApp.targetSdk.get().toInt()
        minSdk = libs.versions.androidApp.minSdk.get().toInt()
        versionCode = libs.versions.androidApp.versionCode.get().toInt()
        versionName = libs.versions.androidApp.versionName.get()
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlin.compilerOptions {
        jvmTarget = JvmTarget.JVM_11
    }
    buildFeatures {
        compose = true
    }
}

// Custom build directory
layout.buildDirectory.set(file(path = "$rootDir/.build/AndroidApp"))