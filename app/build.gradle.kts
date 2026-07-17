plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.nidar.mbc"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.nidar.mbc"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
}
