plugins {
    id("com.android.library")
    kotlin("android") version "2.1.0"
}

android {
    namespace = "com.fluttercavalry.saf_util"
    compileSdk = 35

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_21.toString()
    }

    sourceSets["main"].java.srcDirs("src/main/kotlin")
    sourceSets["test"].java.srcDirs("src/test/kotlin")

    defaultConfig {
        minSdk = 23
    }
}

dependencies {
    implementation("androidx.documentfile:documentfile:1.1.0-alpha01")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.mockito:mockito-core:5.15.2")
}

repositories {
    google()
    mavenCentral()
}
