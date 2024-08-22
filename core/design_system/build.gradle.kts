plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

apply {
    from("$rootDir/plugins/android-commons.gradle")
}

android {
    namespace = "com.example.pokedex.designsystem"

}

dependencies {

    api(Internal.androidxCoreKtx)
    api(Internal.androidxLifecycleRuntimeKtx)
    api(Internal.androidxActivityCompose)
    api(platform(Internal.androidxComposeBom))
    api(Internal.androidxUi)
    api(Internal.androidxUiGraphics)
    api(Internal.androidxUiToolingPreview)
    api(Internal.androidxMaterial3)

    debugImplementation(Internal.androidxUiTooling)
    debugImplementation(Internal.androidxUiTestManifest)

    testImplementation(Test.junit)
    androidTestImplementation(Test.androidxJunit)
    androidTestImplementation(Test.androidxEspressoCore)
    androidTestImplementation(platform(Internal.androidxComposeBom))
    androidTestImplementation(Test.androidxUiTestJunit4)
}