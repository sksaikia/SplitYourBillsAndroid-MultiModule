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
        consumerProguardFiles("consumer-rules.pro")
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
}

dependencies {

    implementation(project(Modules.COMMON))

    implementation(CoreDependencies.coreKtx)

    testImplementation(TestDependencies.junit)
    androidTestImplementation(TestDependencies.androidxJunit)
    androidTestImplementation(TestDependencies.espresso)

    implementation(ComposeDependencies.activityCompose)
    implementation(ComposeDependencies.uiCompose)
    implementation(ComposeDependencies.toolingCompose)
    implementation(ComposeDependencies.materialCompose)
    implementation(ComposeDependencies.navigationCompose)


    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")

}