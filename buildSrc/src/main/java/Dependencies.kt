//Plugins
object BuildPlugins {
    val android by lazy {}
    val kotlin by lazy {"org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinV}"}
}

//Dependencies

object Deps {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRunTimeKtx}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val materialCompose = "androidx.compose.material:material:${Versions.composeVersion}"
    const val toolingCompose = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val uiCompose = "androidx.compose.ui:ui:${Versions.composeVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val junit = "junit:junit:${Versions.junitV}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidXJunitV}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}