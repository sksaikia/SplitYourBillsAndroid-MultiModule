plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
    id("kotlin-android")
    id("org.jlleitschuh.gradle.ktlint") version "11.0.0"
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeVersion
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
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

    testImplementation(TestDependencies.junit)
    androidTestImplementation(TestDependencies.androidxJunit)
    androidTestImplementation(TestDependencies.espresso)

    implementation(RetrofitDependencies.retrofit)
    implementation(RetrofitDependencies.gsonConverter)
    implementation(RetrofitDependencies.okhttp)
    implementation(RetrofitDependencies.loggingInterceptor)

    implementation(HiltDependencies.androidHilt)
    implementation(HiltDependencies.hiltViewModelLifecycle)
    kapt(HiltDependencies.hiltCompiler)
    kapt(HiltDependencies.androidCompiler)

    implementation(HiltDependencies.hiltNavigation)
    implementation(ComposeDependencies.coil)
}