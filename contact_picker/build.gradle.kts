plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    
}

android {
    compileSdk = ConfigData.compileSdkVersion

    defaultConfig {
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeVersion
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(project(Modules.COMMON))
    implementation(project(Modules.DESIGN))

    implementation(CoreDependencies.coreKtx)
    implementation(CoreDependencies.lifecycleRuntimeKtx)

    implementation(ComposeDependencies.activityCompose)
    implementation(ComposeDependencies.uiCompose)
    implementation(ComposeDependencies.toolingCompose)
    implementation(ComposeDependencies.materialCompose)
    implementation(ComposeDependencies.navigationCompose)
    implementation("androidx.appcompat:appcompat:1.5.0")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


}